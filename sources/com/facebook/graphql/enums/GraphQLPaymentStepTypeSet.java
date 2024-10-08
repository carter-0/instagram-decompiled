package com.facebook.graphql.enums;

import X.0sc;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLPaymentStepTypeSet {
    public static final HashSet A00 = 0sc.A05(new String[]{"ADD_PAYMENT_METHOD", "AUTH", "CREATE_PIN", "DECISION", "ENTER_AMOUNT", "FORM", "IDV", "IDV_PENDING", "NUX_INTRO", "PICKER", "PSD_AGREEMENT", "RECEIPT", "SETUP_COMPLETE"});

    public static final Set getSet() {
        return A00;
    }
}
