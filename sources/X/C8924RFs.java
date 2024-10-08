package X;

/* renamed from: X.RFs  reason: case insensitive filesystem */
public enum C8924RFs {
    A0D("ECP_DEFAULT_PUX", 0, 2131961420, 0, 2131961303, false, false, false),
    A0B("ECP_DEFAULT_NUX", 1, 0, 0, 2131961303, false, false, false),
    A0E("ECP_DEFAULT_PUX_TO_NUX", 2, 0, 2131961191, 2131961303, false, false, false),
    A0F("ECP_DEFAULT_SELECTION", 3, 0, 2131961191, 0, false, false, false),
    A0A("ECP_DEFAULT_FORM", 4, 0, 2131961191, 0, false, false, false),
    A0G("ECP_DEFAULT_TERMS", 5, 0, 0, 0, false, false, false),
    A0C("ECP_DEFAULT_PROMO", 6, 0, 2131961191, 0, false, false, false),
    A0c("ECP_URL_LOADING", 7, 0, 2131961191, 0, false, false, false),
    A0J("ECP_FB_OFFSITE_METAPAY", 8, 0, 0, 2131961303, false, false, true),
    A0K("ECP_FB_OFFSITE_METAPAY_CANCEL_CHECKOUT_REWORD", 9, 0, 0, 2131961164, false, false, true),
    A0Y("ECP_IG_OFFSITE_METAPAY", 10, 0, 2131961191, 0, false, false, true),
    A0H("ECP_FB_OFFSITE_METACHECKOUT", 11, 2131961268, 0, 2131961303, false, false, true),
    A0I("ECP_FB_OFFSITE_METACHECKOUT_BRANDING", 12, 2131961267, 2131961191, 0, false, false, true),
    A0L("ECP_FB_OFFSITE_NUX_TO_PUX", 13, 2131961268, 2131961191, 2131961303, false, false, true),
    A0W("ECP_IG_OFFSITE_METACHECKOUT", 14, 2131961268, 2131961191, 0, false, false, true),
    A0X("ECP_IG_OFFSITE_METACHECKOUT_BRANDING", 15, 2131961267, 2131961191, 0, false, false, true),
    A0T("ECP_IG_DEFAULT", 16, 2131961420, 2131961191, 0, false, false, true),
    A0U("ECP_IG_DEFAULT_NUX", 17, 2131961346, 2131961191, 0, false, false, true),
    A0Z("ECP_IG_PUX_TO_NUX", 18, 0, 2131961191, 0, false, false, true),
    A0a("ECP_IG_SELECTION", 19, 0, 2131961191, 0, false, false, true),
    A0V("ECP_IG_FORM", 20, 0, 2131961191, 0, false, false, true),
    A0b("ECP_IG_URL_LOADING", 21, 2131961420, 2131961191, 0, false, false, true),
    A0P("ECP_IAP_NUX_CANCEL_REWORD", 22, 2131961268, 0, 2131961164, true, false, false),
    A0R("ECP_IAP_PUX_CANCEL_REWORD", 23, 2131961268, 0, 2131961164, true, false, false),
    A0O("ECP_IAP_NUX", 24, 2131961268, 0, 2131961303, true, false, false),
    A0Q("ECP_IAP_PUX", 25, 2131961268, 0, 2131961303, true, false, false),
    A0S("ECP_IAP_PUX_TO_NUX", 26, 2131961268, 2131961191, 0, false, true, false),
    A0N("ECP_IAP_INTERSTITIAL", 27, 0, 0, 2131961303, true, false, true),
    A0M("ECP_IAP_ALTERNATIVE_CHECKOUT", 28, 0, 2131961191, 0, false, false, true);
    
    public RH3 A00;
    public final int A01;
    public final int A02;
    public final int A03;
    public final RH3 A04;
    public final boolean A05;
    public final boolean A06;
    public final boolean A07;

    /* access modifiers changed from: public */
    static {
        C8924RFs[] rFsArr;
        A08 = 0oU.A00(rFsArr);
    }

    /* access modifiers changed from: public */
    C8924RFs(String str, int i, int i2, int i3, int i4, boolean z, boolean z2, boolean z3) {
        this.A03 = i2;
        this.A04 = r1;
        this.A00 = r2;
        this.A05 = z;
        this.A01 = i3;
        this.A06 = z2;
        this.A02 = i4;
        this.A07 = z3;
    }
}
