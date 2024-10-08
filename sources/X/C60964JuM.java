package X;

import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.JuM  reason: case insensitive filesystem */
public final class C60964JuM extends AnonymousClass0T0 {
    public float A00;
    public boolean A01;
    public final ImageUrl A02;
    public final L0W A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60964JuM) {
                C60964JuM juM = (C60964JuM) obj;
                if (!0qQ.A0K(this.A04, juM.A04) || !0qQ.A0K(this.A05, juM.A05) || !0qQ.A0K(this.A07, juM.A07) || !0qQ.A0K(this.A06, juM.A06) || !0qQ.A0K(this.A02, juM.A02) || Float.compare(this.A00, juM.A00) != 0 || !0qQ.A0K(this.A03, juM.A03) || !0qQ.A0K(this.A08, juM.A08) || this.A01 != juM.A01) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A002 = AnonymousClass7TF.A00(((((((((AnonymousClass7TG.A0E(this.A04) * 31) + AnonymousClass7TG.A0E(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0E(this.A06)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31, this.A00);
        return DbS.A06(this.A01, (AnonymousClass7TF.A07(this.A03, A002) + C41845B3m.A00(this.A08)) * 31);
    }

    public C60964JuM(ImageUrl imageUrl, L0W l0w, String str, String str2, String str3, String str4, String str5, float f, boolean z) {
        this.A04 = str;
        this.A05 = str2;
        this.A07 = str3;
        this.A06 = str4;
        this.A02 = imageUrl;
        this.A00 = f;
        this.A03 = l0w;
        this.A08 = str5;
        this.A01 = z;
    }
}
