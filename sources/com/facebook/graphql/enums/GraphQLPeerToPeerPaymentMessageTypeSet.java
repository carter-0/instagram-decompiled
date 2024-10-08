package com.facebook.graphql.enums;

import X.0sc;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLPeerToPeerPaymentMessageTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"CANCELED_CHARGEBACK", "CANCELED_CUSTOMER_SERVICE", "CANCELED_DECLINED", "CANCELED_EXPIRED", "CANCELED_RECIPIENT_RISK", "CANCELED_SAME_CARD", "CANCELED_SENDER_RISK", "CANCELED_SYSTEM_FAIL", "REQUEST_CANCELED_BY_REQUESTER", "REQUEST_DECLINED_BY_REQUESTEE", "REQUEST_EXPIRED", "SENT_IN_GROUP"});

    public static final Set getSet() {
        return A00;
    }
}
