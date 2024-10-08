package X;

import com.instagram.model.mediasize.GifUrlImpl;

/* renamed from: X.Gp3  reason: case insensitive filesystem */
public final class C53471Gp3 extends AnonymousClass0T0 implements JQB {
    public final GifUrlImpl A00;
    public final String A01;
    public final int A02;
    public final int A03;
    public final String A04;
    public final String A05;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53471Gp3) {
                C53471Gp3 gp3 = (C53471Gp3) obj;
                if (!0qQ.A0K(this.A05, gp3.A05) || this.A03 != gp3.A03 || this.A02 != gp3.A02 || !0qQ.A0K(this.A04, gp3.A04) || !0qQ.A0K(this.A00, gp3.A00) || !0qQ.A0K(this.A01, gp3.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int getHeight() {
        return this.A02;
    }

    public final String getId() {
        return this.A05;
    }

    public final int getWidth() {
        return this.A03;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TF.A07(this.A00, (((((AnonymousClass7TE.A0O(this.A05) + this.A03) * 31) + this.A02) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31));
    }

    public C53471Gp3(GifUrlImpl gifUrlImpl, String str, String str2, String str3, int i, int i2) {
        this.A05 = str;
        this.A03 = i;
        this.A02 = i2;
        this.A04 = str2;
        this.A00 = gifUrlImpl;
        this.A01 = str3;
    }
}
