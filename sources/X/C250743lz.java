package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: X.3lz  reason: invalid class name and case insensitive filesystem */
public final class C250743lz extends AnonymousClass0T0 implements C250753m0 {
    public final C269814fj A00;
    public final C269814fj A01;
    public final C257533xY A02;
    public final C257533xY A03;
    public final C269844fm A04;
    public final Boolean A05;
    public final Integer A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final HashMap A0D;
    public final List A0E;

    public final C250743lz FFF(1E9 r1) {
        return this;
    }

    public final C250743lz FFG(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250743lz) {
                C250743lz r5 = (C250743lz) obj;
                if (!0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A09, r5.A09) || !0qQ.A0K(this.A0A, r5.A0A) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A0D, r5.A0D) || !0qQ.A0K(this.A0E, r5.A0E) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A0B, r5.A0B) || !0qQ.A0K(this.A0C, r5.A0C) || !0qQ.A0K(this.A06, r5.A06)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C257533xY r0 = this.A02;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        String str = this.A07;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A08;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        C269814fj r02 = this.A00;
        int hashCode4 = (hashCode3 + (r02 == null ? 0 : r02.hashCode())) * 31;
        String str3 = this.A09;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A0A;
        int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        C257533xY r03 = this.A03;
        int hashCode7 = (hashCode6 + (r03 == null ? 0 : r03.hashCode())) * 31;
        C269814fj r04 = this.A01;
        int hashCode8 = (hashCode7 + (r04 == null ? 0 : r04.hashCode())) * 31;
        C269844fm r05 = this.A04;
        int hashCode9 = (hashCode8 + (r05 == null ? 0 : r05.hashCode())) * 31;
        HashMap hashMap = this.A0D;
        int hashCode10 = (hashCode9 + (hashMap == null ? 0 : hashMap.hashCode())) * 31;
        List list = this.A0E;
        int hashCode11 = (hashCode10 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.A05;
        int hashCode12 = (hashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str5 = this.A0B;
        int hashCode13 = (hashCode12 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.A0C;
        int hashCode14 = (hashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num = this.A06;
        if (num != null) {
            i = num.hashCode();
        }
        return hashCode14 + i;
    }

    public final /* bridge */ /* synthetic */ C257543xZ AZ1() {
        return this.A02;
    }

    public final String Aei() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ C269824fk AlN() {
        return this.A00;
    }

    public final String Avm() {
        return this.A09;
    }

    public final /* bridge */ /* synthetic */ C257543xZ Axo() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C269824fk BCp() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C269854fn BKG() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ Map BRh() {
        return this.A0D;
    }

    public final List BRk() {
        return this.A0E;
    }

    public final Boolean BvW() {
        return this.A05;
    }

    public final Integer C5c() {
        return this.A06;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTStoryAdsHeadlineDict", C44909Cmz.A00(this));
    }

    public final String getBackgroundColor() {
        return this.A07;
    }

    public final String getDescription() {
        return this.A0A;
    }

    public final String getText() {
        return this.A0B;
    }

    public final String getTextColor() {
        return this.A0C;
    }

    public C250743lz(C269814fj r1, C269814fj r2, C257533xY r3, C257533xY r4, C269844fm r5, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, String str6, HashMap hashMap, List list) {
        this.A02 = r3;
        this.A07 = str;
        this.A08 = str2;
        this.A00 = r1;
        this.A09 = str3;
        this.A0A = str4;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = r5;
        this.A0D = hashMap;
        this.A0E = list;
        this.A05 = bool;
        this.A0B = str5;
        this.A0C = str6;
        this.A06 = num;
    }

    public final C250753m0 EA2(1E9 r1) {
        return this;
    }
}
