package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.DtW  reason: case insensitive filesystem */
public final class C47245DtW extends AnonymousClass0T0 implements C232262tL {
    public int A00;
    public boolean A01;
    public final ImageUrl A02;
    public final C49562Exx A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final boolean A07;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47245DtW) {
                C47245DtW dtW = (C47245DtW) obj;
                if (!0qQ.A0K(this.A04, dtW.A04) || !0qQ.A0K(this.A06, dtW.A06) || !0qQ.A0K(this.A02, dtW.A02) || !0qQ.A0K(this.A05, dtW.A05) || !0qQ.A0K(this.A03, dtW.A03) || this.A01 != dtW.A01 || this.A07 != dtW.A07 || this.A00 != dtW.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A0E = AnonymousClass7TG.A0E(this.A04) * 31;
        return AnonymousClass7TF.A09(this.A07, AnonymousClass7TF.A09(this.A01, AnonymousClass7TF.A07(this.A03, (((AnonymousClass7TF.A08(this.A06, A0E) + AnonymousClass7TG.A0C(this.A02)) * 31) + C41845B3m.A00(this.A05)) * 31))) + this.A00;
    }

    public C47245DtW(ImageUrl imageUrl, C49562Exx exx, String str, String str2, String str3, int i, boolean z, boolean z2) {
        this.A04 = str;
        this.A06 = str2;
        this.A02 = imageUrl;
        this.A05 = str3;
        this.A03 = exx;
        this.A01 = z;
        this.A07 = z2;
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object getKey() {
        return AnonymousClass7TF.A0h(this);
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return Dba.A1Y(obj, this);
    }
}
