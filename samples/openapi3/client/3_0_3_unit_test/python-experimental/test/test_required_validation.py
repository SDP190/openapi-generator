# coding: utf-8

"""
    openapi 3.0.3 sample spec

    sample spec for testing openapi functionality, built from json schema tests for draft6  # noqa: E501

    The version of the OpenAPI document: 0.0.1
    Generated by: https://openapi-generator.tech
"""

import unittest

import unit_test_api
from unit_test_api.model.required_validation import RequiredValidation
from unit_test_api import configuration


class TestRequiredValidation(unittest.TestCase):
    """RequiredValidation unit test stubs"""
    _configuration = configuration.Configuration()

    def test_ignores_arrays_passes(self):
        # ignores arrays
        RequiredValidation._from_openapi_data(
            [
            ],
            _configuration=self._configuration
        )

    def test_present_required_property_is_valid_passes(self):
        # present required property is valid
        RequiredValidation._from_openapi_data(
            {
                "foo":
                    1,
            },
            _configuration=self._configuration
        )

    def test_ignores_other_non_objects_passes(self):
        # ignores other non-objects
        RequiredValidation._from_openapi_data(
            12,
            _configuration=self._configuration
        )

    def test_ignores_strings_passes(self):
        # ignores strings
        RequiredValidation._from_openapi_data(
            "",
            _configuration=self._configuration
        )

    def test_non_present_required_property_is_invalid_fails(self):
        # non-present required property is invalid
        with self.assertRaises((unit_test_api.ApiValueError, unit_test_api.ApiTypeError)):
            RequiredValidation._from_openapi_data(
                {
                    "bar":
                        1,
                },
                _configuration=self._configuration
            )


if __name__ == '__main__':
    unittest.main()