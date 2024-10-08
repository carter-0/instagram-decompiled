package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;

/* renamed from: X.76V  reason: invalid class name */
public final class AnonymousClass76V extends AnonymousClass0T0 implements AnonymousClass7FW {
    public final int A00;
    public final ImageUrl A01;
    public final DirectThreadKey A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final List A07;
    public final boolean A08;
    public final boolean A09;
    public final boolean A0A;
    public final int A0B;

    public AnonymousClass76V(ImageUrl imageUrl, DirectThreadKey directThreadKey, String str, String str2, String str3, String str4, List list, int i, int i2, boolean z, boolean z2, boolean z3) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A02 = directThreadKey;
        this.A06 = str2;
        this.A08 = z;
        this.A09 = z2;
        this.A04 = str3;
        this.A03 = str4;
        this.A01 = imageUrl;
        this.A0A = z3;
        this.A00 = i;
        this.A0B = i2;
        this.A07 = list;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass76V) {
                AnonymousClass76V r5 = (AnonymousClass76V) obj;
                if (!0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A06, r5.A06) || this.A08 != r5.A08 || this.A09 != r5.A09 || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || this.A0A != r5.A0A || this.A00 != r5.A00 || this.A0B != r5.A0B || !0qQ.A0K(this.A07, r5.A07)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = ((((this.A05.hashCode() * 31) + this.A02.hashCode()) * 31) + this.A06.hashCode()) * 31;
        int i = 1237;
        if (this.A08) {
            i = 1231;
        }
        int i2 = (hashCode + i) * 31;
        int i3 = 1237;
        if (this.A09) {
            i3 = 1231;
        }
        int hashCode2 = (((((((i2 + i3) * 31) + this.A04.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A01.hashCode()) * 31;
        int i4 = 1237;
        if (this.A0A) {
            i4 = 1231;
        }
        return ((((((hashCode2 + i4) * 31) + this.A00) * 31) + this.A0B) * 31) + this.A07.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        return equals(obj);
    }
}
