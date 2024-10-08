package X;

/* renamed from: X.DtS  reason: case insensitive filesystem */
public final class C47241DtS extends AnonymousClass0T0 implements C232262tL {
    public final String A00;
    public final String A01;
    public final C62320sa A02;
    public final boolean A03;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47241DtS) {
                C47241DtS dtS = (C47241DtS) obj;
                if (!0qQ.A0K(this.A00, dtS.A00) || !0qQ.A0K(this.A01, dtS.A01) || this.A03 != dtS.A03 || !0qQ.A0K(this.A02, dtS.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return this.A00;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A02, AnonymousClass7TF.A09(this.A03, AnonymousClass7TF.A08(this.A01, AnonymousClass7TE.A0O(this.A00))));
    }

    public C47241DtS(String str, String str2, C62320sa r3, boolean z) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
        this.A03 = z;
        this.A02 = r3;
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
