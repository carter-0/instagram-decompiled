package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Juu  reason: case insensitive filesystem */
public final class C60998Juu extends AnonymousClass0T0 {
    public C390879rz A00;
    public C62523KhF A01;
    public C62511Kh1 A02;
    public Boolean A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;
    public 0eP A08;
    public final List A09;

    public C60998Juu(C390879rz r2, C62523KhF khF, C62511Kh1 kh1, Boolean bool, String str, String str2, String str3, List list, List list2, 0eP r11) {
        DbW.A1N(str2, 2, khF);
        this.A06 = str;
        this.A05 = str2;
        this.A07 = list;
        this.A09 = list2;
        this.A01 = khF;
        this.A08 = r11;
        this.A00 = r2;
        this.A03 = bool;
        this.A04 = str3;
        this.A02 = kh1;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C60998Juu) {
                C60998Juu juu = (C60998Juu) obj;
                if (!0qQ.A0K(this.A06, juu.A06) || !0qQ.A0K(this.A05, juu.A05) || !0qQ.A0K(this.A07, juu.A07) || !0qQ.A0K(this.A09, juu.A09) || this.A01 != juu.A01 || !0qQ.A0K(this.A08, juu.A08) || this.A00 != juu.A00 || !0qQ.A0K(this.A03, juu.A03) || !0qQ.A0K(this.A04, juu.A04) || this.A02 != juu.A02) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String A00() {
        List list = this.A07;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AnonymousClass7TF.A1M(A0r, JTO.A0W(it).A05);
        }
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append(this.A00);
        A1A.append('_');
        A1A.append(Arrays.hashCode(new Object[]{A0r}));
        return A1A.toString();
    }

    public final int hashCode() {
        return ((((AnonymousClass7TF.A07(this.A00, AnonymousClass7TF.A07(this.A08, AnonymousClass7TF.A07(this.A01, AnonymousClass7TF.A07(this.A09, AnonymousClass7TF.A07(this.A07, AnonymousClass7TF.A08(this.A05, AnonymousClass7TE.A0O(this.A06))))))) + AnonymousClass7TG.A0C(this.A03)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }
}
