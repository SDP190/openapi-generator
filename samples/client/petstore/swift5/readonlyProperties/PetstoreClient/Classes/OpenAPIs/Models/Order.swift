//
// Order.swift
//
// Generated by openapi-generator
// https://openapi-generator.tech
//

import Foundation

public struct Order: Codable, Hashable {

    public enum Status: String, Codable, CaseIterable {
        case placed = "placed"
        case approved = "approved"
        case delivered = "delivered"
    }
    public private(set) var id: Int64?
    public private(set) var petId: Int64?
    public private(set) var quantity: Int?
    public private(set) var shipDate: Date?
    /** Order Status */
    public private(set) var status: Status?
    public private(set) var complete: Bool? = false

    public init(id: Int64? = nil, petId: Int64? = nil, quantity: Int? = nil, shipDate: Date? = nil, status: Status? = nil, complete: Bool? = false) {
        self.id = id
        self.petId = petId
        self.quantity = quantity
        self.shipDate = shipDate
        self.status = status
        self.complete = complete
    }

}