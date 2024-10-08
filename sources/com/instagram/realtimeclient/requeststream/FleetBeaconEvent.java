package com.instagram.realtimeclient.requeststream;

import X.AnonymousClass1qK;

public class FleetBeaconEvent implements AnonymousClass1qK {
    public final GraphQLSubscriptionRequestStub mGraphQLSubscriptionRequestStub;

    public FleetBeaconEvent(GraphQLSubscriptionRequestStub graphQLSubscriptionRequestStub) {
        this.mGraphQLSubscriptionRequestStub = graphQLSubscriptionRequestStub;
    }

    public GraphQLSubscriptionRequestStub getGraphQLSubscriptionRequestStub() {
        return this.mGraphQLSubscriptionRequestStub;
    }
}
