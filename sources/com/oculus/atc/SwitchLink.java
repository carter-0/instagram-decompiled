package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class SwitchLink extends R5b implements C13662TeT {
    public static final SwitchLink DEFAULT_INSTANCE;
    public static volatile C74232PrL PARSER = null;
    public static final int TARGET_FIELD_NUMBER = 1;
    public TAP target_ = TAP.A01;

    static {
        SwitchLink switchLink = new SwitchLink();
        DEFAULT_INSTANCE = switchLink;
        R5b.A0B(switchLink, SwitchLink.class);
    }
}
