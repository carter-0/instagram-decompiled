package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4w3  reason: invalid class name and case insensitive filesystem */
public final class C277984w3 extends AnonymousClass0T0 implements C277994w4 {
    public final C278004w5 A00;
    public final C278024w7 A01;
    public final C257593xe A02;
    public final C257593xe A03;
    public final C257593xe A04;
    public final Integer A05;
    public final Integer A06;
    public final Integer A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final List A0D;

    public final C277984w3 F5w() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C277984w3) {
                C277984w3 r5 = (C277984w3) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C278004w5 r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C257593xe r02 = this.A02;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        C257593xe r03 = this.A03;
        int hashCode3 = (hashCode2 + (r03 == null ? 0 : r03.hashCode())) * 31;
        List list = this.A0D;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.A08;
        int hashCode5 = (hashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        C278024w7 r04 = this.A01;
        int hashCode6 = (hashCode5 + (r04 == null ? 0 : r04.hashCode())) * 31;
        Integer num = this.A05;
        int hashCode7 = (hashCode6 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.A06;
        int hashCode8 = (hashCode7 + (num2 == null ? 0 : num2.hashCode())) * 31;
        C257593xe r05 = this.A04;
        int hashCode9 = (hashCode8 + (r05 == null ? 0 : r05.hashCode())) * 31;
        Integer num3 = this.A07;
        int hashCode10 = (hashCode9 + (num3 == null ? 0 : num3.hashCode())) * 31;
        String str2 = this.A09;
        int hashCode11 = (hashCode10 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A0A;
        int hashCode12 = (hashCode11 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0B;
        int hashCode13 = (hashCode12 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A0C;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode13 + i;
    }

    public final /* bridge */ /* synthetic */ C45462Cwt AKH() {
        return new C45462Cwt(this);
    }

    public final /* bridge */ /* synthetic */ C278014w6 Af8() {
        return this.A00;
    }

    public final C257593xe Af9() {
        return this.A02;
    }

    public final C257593xe AgG() {
        return this.A03;
    }

    public final List Aj1() {
        return this.A0D;
    }

    public final /* bridge */ /* synthetic */ C278034w8 BE7() {
        return this.A01;
    }

    public final Integer BTS() {
        return this.A05;
    }

    public final Integer BZk() {
        return this.A06;
    }

    public final C257593xe BZl() {
        return this.A04;
    }

    public final Integer BZn() {
        return this.A07;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMediaOverlayPayloadSchema", C45591Cz3.A01(this));
    }

    public final String getDescription() {
        return this.A08;
    }

    public final String getOverlayType() {
        return this.A09;
    }

    public final String getSessionId() {
        return this.A0A;
    }

    public final String getSubCategory() {
        return this.A0B;
    }

    public final String getTitle() {
        return this.A0C;
    }

    public C277984w3(C278004w5 r1, C278024w7 r2, C257593xe r3, C257593xe r4, C257593xe r5, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, List list) {
        this.A00 = r1;
        this.A02 = r3;
        this.A03 = r4;
        this.A0D = list;
        this.A08 = str;
        this.A01 = r2;
        this.A05 = num;
        this.A06 = num2;
        this.A04 = r5;
        this.A07 = num3;
        this.A09 = str2;
        this.A0A = str3;
        this.A0B = str4;
        this.A0C = str5;
    }
}
