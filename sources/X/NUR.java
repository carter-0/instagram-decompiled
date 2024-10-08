package X;

public final class NUR extends C66913Mex {
    public final void A0H(C69293Nit nit) {
        String str;
        int A02 = DbU.A02(nit, 0);
        if (A02 == 0) {
            str = "INTRODUCE_BANNER_TAP_CTA";
        } else if (A02 == 1) {
            str = "SELL_BANNER_TAP_CTA";
        } else if (A02 == 2) {
            str = "WARN_BANNER_TAP_CTA";
        } else if (A02 != 3) {
            str = "MEX_EB_LOW_DISK_SPACE_BANNER_TAP_CTA";
        } else {
            str = "MEX_EB_UPSELL_BANNER_TAP_CTA";
        }
        A0B(str);
        A08();
    }

    public final void A0I(C69293Nit nit) {
        String str;
        int A02 = DbU.A02(nit, 0);
        if (A02 == 0) {
            str = "INTRODUCE_BANNER_TAP_DISMISS";
        } else if (A02 == 1) {
            str = "SELL_BANNER_TAP_DISMISS";
        } else if (A02 == 2) {
            str = "WARN_BANNER_TAP_DISMISS";
        } else if (A02 != 3) {
            str = "MEX_EB_LOW_DISK_SPACE_BANNER_TAP_DISMISS";
        } else {
            str = "MEX_EB_UPSELL_BANNER_TAP_DISMISS";
        }
        A0B(str);
        A07();
    }
}
