package X;

/* renamed from: X.DtO  reason: case insensitive filesystem */
public final class C47237DtO extends AnonymousClass0T0 implements C232262tL {
    public final C266444Yx A00;
    public final String A01;
    public final boolean A02;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47237DtO) {
                C47237DtO dtO = (C47237DtO) obj;
                if (!0qQ.A0K(this.A01, dtO.A01) || !0qQ.A0K(this.A00, dtO.A00) || this.A02 != dtO.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A01;
    }

    public final int hashCode() {
        return DbS.A06(this.A02, AnonymousClass7TF.A07(this.A00, AnonymousClass7TE.A0O(this.A01)));
    }

    public C47237DtO(C266444Yx r1, String str, boolean z) {
        AnonymousClass7TG.A1O(str, r1);
        this.A01 = str;
        this.A00 = r1;
        this.A02 = z;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
