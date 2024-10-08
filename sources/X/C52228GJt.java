package X;

/* renamed from: X.GJt  reason: case insensitive filesystem */
public final class C52228GJt extends HPG {
    public final Integer A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;
    public final boolean A04;

    public C52228GJt(Integer num, boolean z, boolean z2, boolean z3, boolean z4) {
        0qQ.A0B(num, 1);
        this.A00 = num;
        this.A02 = z;
        this.A03 = z2;
        this.A04 = z3;
        this.A01 = z4;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C52228GJt) {
                C52228GJt gJt = (C52228GJt) obj;
                if (!(this.A00 == gJt.A00 && this.A02 == gJt.A02 && this.A03 == gJt.A03 && this.A04 == gJt.A04 && this.A01 == gJt.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A00;
        return DbS.A06(this.A01, AnonymousClass7TF.A09(this.A04, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A09(this.A02, C51971G9r.A0D(num, C52234GJz.A00(num)) * 31))));
    }

    public final String toString() {
        String str;
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("LoadingState(prefetchConnectStatus=");
        Integer num = this.A00;
        if (num != null) {
            str = C52234GJz.A00(num);
        } else {
            str = "null";
        }
        A1A.append(str);
        A1A.append(", isFirstPage=");
        A1A.append(this.A02);
        A1A.append(", isRefreshing=");
        A1A.append(this.A03);
        A1A.append(", isStreaming=");
        A1A.append(this.A04);
        A1A.append(", isEagerFetch=");
        return G9t.A1C(A1A, this.A01);
    }

    public C52228GJt() {
        this(AnonymousClass05K.A0C, false, false, false, false);
    }
}
