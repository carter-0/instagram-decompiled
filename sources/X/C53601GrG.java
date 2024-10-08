package X;

import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.GrG  reason: case insensitive filesystem */
public final class C53601GrG extends AnonymousClass0T0 implements JNI {
    public final int A00;
    public final C61054Jvs A01;
    public final ImageUrl A02;
    public final String A03;
    public final String A04;
    public final List A05;
    public final List A06;
    public final List A07;
    public final List A08;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C53601GrG) {
                C53601GrG grG = (C53601GrG) obj;
                if (!0qQ.A0K(this.A06, grG.A06) || !0qQ.A0K(this.A05, grG.A05) || !0qQ.A0K(this.A02, grG.A02) || !0qQ.A0K(this.A04, grG.A04) || !0qQ.A0K(this.A03, grG.A03) || !0qQ.A0K(this.A01, grG.A01) || !0qQ.A0K(this.A07, grG.A07) || !0qQ.A0K(this.A08, grG.A08) || this.A00 != grG.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A04;
        return ((AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A07(this.A01, (AnonymousClass7TF.A08(str, (((AnonymousClass7TE.A0K(this.A06) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31)) + AnonymousClass7TE.A0L(this.A08)) * 31) + this.A00;
    }

    public C53601GrG(C61054Jvs jvs, ImageUrl imageUrl, String str, String str2, List list, List list2, List list3, List list4, int i) {
        C51972G9s.A1B(list, str);
        this.A06 = list;
        this.A05 = list2;
        this.A02 = imageUrl;
        this.A04 = str;
        this.A03 = str2;
        this.A01 = jvs;
        this.A07 = list3;
        this.A08 = list4;
        this.A00 = i;
    }
}
