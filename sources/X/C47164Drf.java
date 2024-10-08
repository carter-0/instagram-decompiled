package X;

import android.net.Uri;

/* renamed from: X.Drf  reason: case insensitive filesystem */
public final class C47164Drf extends AnonymousClass0T0 {
    public final Uri A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47164Drf) {
                C47164Drf drf = (C47164Drf) obj;
                if (!0qQ.A0K(this.A03, drf.A03) || !0qQ.A0K(this.A0A, drf.A0A) || !0qQ.A0K(this.A05, drf.A05) || !0qQ.A0K(this.A04, drf.A04) || !0qQ.A0K(this.A07, drf.A07) || !0qQ.A0K(this.A06, drf.A06) || !0qQ.A0K(this.A09, drf.A09) || !0qQ.A0K(this.A08, drf.A08) || !0qQ.A0K(this.A01, drf.A01) || !0qQ.A0K(this.A02, drf.A02) || !0qQ.A0K(this.A00, drf.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return AnonymousClass7TE.A0N(this.A00, AnonymousClass7TF.A08(this.A02, AnonymousClass7TF.A08(this.A01, AnonymousClass7TF.A08(this.A08, AnonymousClass7TF.A08(this.A09, AnonymousClass7TF.A08(this.A06, AnonymousClass7TF.A08(this.A07, AnonymousClass7TF.A08(this.A04, AnonymousClass7TF.A08(this.A05, AnonymousClass7TF.A08(this.A0A, AnonymousClass7TE.A0O(this.A03)))))))))));
    }

    public C47164Drf(Uri uri, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10) {
        this.A03 = str;
        this.A0A = str2;
        this.A05 = str3;
        this.A04 = str4;
        this.A07 = str5;
        this.A06 = str6;
        this.A09 = str7;
        this.A08 = str8;
        this.A01 = str9;
        this.A02 = str10;
        this.A00 = uri;
    }
}
