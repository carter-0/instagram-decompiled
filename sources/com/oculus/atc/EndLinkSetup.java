package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class EndLinkSetup extends R5b implements C13662TeT {
    public static final EndLinkSetup DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int STATE_FIELD_NUMBER = 1;
    public static final int UUID_FIELD_NUMBER = 2;
    public int state_;
    public TAP uuid_ = TAP.A01;

    static {
        EndLinkSetup endLinkSetup = new EndLinkSetup();
        DEFAULT_INSTANCE = endLinkSetup;
        R5b.A0B(endLinkSetup, EndLinkSetup.class);
    }
}
