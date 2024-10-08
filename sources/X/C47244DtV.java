package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DtV  reason: case insensitive filesystem */
public final class C47244DtV extends AnonymousClass0T0 implements C232262tL {
    public boolean A00 = true;
    public final ImageUrl A01;
    public final C49477EwI A02;
    public final String A03;
    public final String A04;

    public C47244DtV(ImageUrl imageUrl, C49477EwI ewI, String str, String str2) {
        this.A03 = str;
        this.A04 = str2;
        this.A01 = imageUrl;
        this.A02 = ewI;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47244DtV) {
                C47244DtV dtV = (C47244DtV) obj;
                if (!0qQ.A0K(this.A03, dtV.A03) || !0qQ.A0K(this.A04, dtV.A04) || !0qQ.A0K(this.A01, dtV.A01) || !0qQ.A0K(this.A02, dtV.A02) || this.A00 != dtV.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A03) * 31;
        return DbS.A06(this.A00, AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A08(this.A04, A0E) + AnonymousClass7TE.A0L(this.A01)) * 31));
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TF.A0h(this);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
