package com.oculus.atc;

import X.C13662TeT;
import X.C13982TnY;
import X.C74232PrL;
import X.R33;
import X.R5b;

public final class SoftApClientAddressUpdatedEvent extends R5b implements C13662TeT {
    public static final int ADDRESSES_FIELD_NUMBER = 1;
    public static final SoftApClientAddressUpdatedEvent DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER;
    public C13982TnY addresses_ = R33.A02;

    static {
        SoftApClientAddressUpdatedEvent softApClientAddressUpdatedEvent = new SoftApClientAddressUpdatedEvent();
        DEFAULT_INSTANCE = softApClientAddressUpdatedEvent;
        R5b.A0B(softApClientAddressUpdatedEvent, SoftApClientAddressUpdatedEvent.class);
    }
}
