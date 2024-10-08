package X;

public final class OOG {
    public 0Tv A00;
    public final 18J A01;
    public final C60400gq A02;
    public final C60400gq A03;

    public final boolean A09(long j) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            return r0.boolOverrideForParam(j, false);
        }
        return false;
    }

    public final double A00(long j) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            return r0.doubleOverrideForParam(j, 0.0d);
        }
        return 0.0d;
    }

    public final long A01(long j) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            return r0.intOverrideForParam(j, 0);
        }
        return 0;
    }

    public final String A02(long j) {
        0Tv r0 = this.A00;
        return r0 != null ? r0.stringOverrideForParam(j, "") : "";
    }

    public final void A03() {
        0Tv r0 = this.A00;
        if (r0 != null) {
            r0.removeAllOverrides();
        }
    }

    public final void A04(long j) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            r0.removeOverrideForParam(j);
        }
    }

    public final void A05(long j, double d) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            r0.updateOverrideForParam(j, d);
        }
    }

    public final void A06(long j, long j2) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            r0.updateOverrideForParam(j, j2);
        }
    }

    public final void A07(long j, String str) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            r0.updateOverrideForParam(j, str);
        }
    }

    public final void A08(long j, boolean z) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            r0.updateOverrideForParam(j, z);
        }
    }

    public final boolean A0A(long j) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            return r0.hasBoolOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0B(long j) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            return r0.hasDoubleOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0C(long j) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            return r0.hasIntOverrideForParam(j);
        }
        return false;
    }

    public final boolean A0D(long j) {
        0Tv r0 = this.A00;
        if (r0 != null) {
            return r0.hasStringOverrideForParam(j);
        }
        return false;
    }

    public OOG(18J r2, C60400gq r3, C60400gq r4) {
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A00 = r2.getOrCreateOverridesTable();
    }
}
