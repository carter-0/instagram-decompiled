package X;

public final class GTT extends AnonymousClass0T0 {
    public int A00;
    public int A01;
    public boolean A02;
    public final int A03;

    public GTT(int i, int i2, int i3, boolean z) {
        this.A03 = i3;
        this.A00 = i;
        this.A02 = z;
        this.A01 = i2;
    }

    public final boolean equals(Object obj) {
        if (1 - this.A03 != 0) {
            return super.equals(obj);
        }
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GTT)) {
            return false;
        }
        GTT gtt = (GTT) obj;
        if (gtt.A03 == 1 && this.A00 == gtt.A00 && this.A02 == gtt.A02 && this.A01 == gtt.A01) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        if (1 - this.A03 != 0) {
            return super.hashCode();
        }
        return AnonymousClass7TF.A09(this.A02, this.A00 * 31) + this.A01;
    }

    public final String toString() {
        String str;
        int i = this.A03;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        if (1 - i != 0) {
            A1A.append("GapRulesResult(isGapRulesSucceed=");
            A1A.append(this.A02);
            A1A.append(", gapRuleCheckAttempts=");
            A1A.append(this.A00);
            str = ", newTargetPosition=";
        } else {
            A1A.append("SplitMetadata(splitAtTimeMs=");
            A1A.append(this.A00);
            A1A.append(", isSplitPointAtStart=");
            A1A.append(this.A02);
            str = ", trimmedDurationInMsAfterSplit=";
        }
        A1A.append(str);
        return C51975G9x.A0j(A1A, this.A01);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public GTT() {
        this(-1, -1, 1, false);
        this.A03 = 1;
    }
}
