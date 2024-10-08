package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.GoZ  reason: case insensitive filesystem */
public final class C53441GoZ extends AnonymousClass0T0 implements JRZ {
    public final float A00;
    public final long A01;
    public final C67241sS A02;
    public final ImageUrl A03;
    public final ImageUrl A04;
    public final Integer A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final List A0E;

    public C53441GoZ(C67241sS r3, ImageUrl imageUrl, ImageUrl imageUrl2, Integer num, Integer num2, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, float f, long j) {
        AnonymousClass7TG.A0w(1, str, list, str2);
        C51973G9u.A0u(6, str3, imageUrl, str4);
        C51974G9v.A1R(imageUrl2, str5, str6, str7);
        this.A07 = str;
        this.A01 = j;
        this.A0E = list;
        this.A08 = str2;
        this.A05 = num;
        this.A09 = str3;
        this.A02 = r3;
        this.A00 = f;
        this.A03 = imageUrl;
        this.A0A = str4;
        this.A04 = imageUrl2;
        this.A0B = str5;
        this.A0C = str6;
        this.A0D = str7;
        this.A06 = num2;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53441GoZ) {
                C53441GoZ goZ = (C53441GoZ) obj;
                if (!0qQ.A0K(this.A07, goZ.A07) || this.A01 != goZ.A01 || !0qQ.A0K(this.A0E, goZ.A0E) || !0qQ.A0K(this.A08, goZ.A08) || !0qQ.A0K(this.A05, goZ.A05) || !0qQ.A0K(this.A09, goZ.A09) || !0qQ.A0K(this.A02, goZ.A02) || Float.compare(this.A00, goZ.A00) != 0 || !0qQ.A0K(this.A03, goZ.A03) || !0qQ.A0K(this.A0A, goZ.A0A) || !0qQ.A0K(this.A04, goZ.A04) || !0qQ.A0K(this.A0B, goZ.A0B) || !0qQ.A0K(this.A0C, goZ.A0C) || !0qQ.A0K(this.A0D, goZ.A0D) || !0qQ.A0K(this.A06, goZ.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int A072 = AnonymousClass7TF.A07(this.A0E, C51972G9s.A07(this.A01, AnonymousClass7TE.A0O(this.A07)));
        return AnonymousClass7TF.A08(this.A0D, AnonymousClass7TF.A08(this.A0C, AnonymousClass7TF.A08(this.A0B, AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TF.A07(this.A03, AnonymousClass7TF.A00((AnonymousClass7TF.A08(this.A09, (AnonymousClass7TF.A08(this.A08, A072) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31, this.A00))))))) + AnonymousClass7TE.A0L(this.A06);
    }
}
