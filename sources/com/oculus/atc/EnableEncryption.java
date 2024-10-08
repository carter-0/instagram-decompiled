package com.oculus.atc;

import X.C13662TeT;
import X.C74232PrL;
import X.R5b;
import X.TAP;

public final class EnableEncryption extends R5b implements C13662TeT {
    public static final int BASE_FIELD_NUMBER = 4;
    public static final EnableEncryption DEFAULT_INSTANCE;
    public static final int IV_FIELD_NUMBER = 3;
    public static final int PARAMETERS_FIELD_NUMBER = 5;
    public static volatile C74232PrL PARSER = null;
    public static final int PUBLICKEY_FIELD_NUMBER = 1;
    public static final int SEED_FIELD_NUMBER = 2;
    public int base_;
    public TAP iv_;
    public int parameters_;
    public TAP publicKey_;
    public TAP seed_;

    static {
        EnableEncryption enableEncryption = new EnableEncryption();
        DEFAULT_INSTANCE = enableEncryption;
        R5b.A0B(enableEncryption, EnableEncryption.class);
    }

    public EnableEncryption() {
        TAP tap = TAP.A01;
        this.publicKey_ = tap;
        this.seed_ = tap;
        this.iv_ = tap;
    }
}
