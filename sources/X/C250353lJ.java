package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.3lJ  reason: invalid class name and case insensitive filesystem */
public final class C250353lJ extends AnonymousClass0T0 implements C250363lK {
    public final C269924fu A00;
    public final C269934fv A01;
    public final C269944fw A02;
    public final C269954fx A03;
    public final C269964fy A04;
    public final C269974fz A05;
    public final Long A06;
    public final List A07;
    public final List A08;

    public final C250353lJ F4F() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C250353lJ) {
                C250353lJ r5 = (C250353lJ) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A08, r5.A08) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C269924fu r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C269934fv r02 = this.A01;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        List list = this.A07;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        C269944fw r03 = this.A02;
        int hashCode4 = (hashCode3 + (r03 == null ? 0 : r03.hashCode())) * 31;
        List list2 = this.A08;
        int hashCode5 = (hashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        Long l = this.A06;
        int hashCode6 = (hashCode5 + (l == null ? 0 : l.hashCode())) * 31;
        C269954fx r04 = this.A03;
        int hashCode7 = (hashCode6 + (r04 == null ? 0 : r04.hashCode())) * 31;
        C269964fy r05 = this.A04;
        int hashCode8 = (hashCode7 + (r05 == null ? 0 : r05.hashCode())) * 31;
        C269974fz r06 = this.A05;
        if (r06 != null) {
            i = r06.hashCode();
        }
        return hashCode8 + i;
    }

    public final C269924fu Aj2() {
        return this.A00;
    }

    public final C269934fv Aj7() {
        return this.A01;
    }

    public final List B0f() {
        return this.A07;
    }

    public final C269944fw BDy() {
        return this.A02;
    }

    public final List BE2() {
        return this.A08;
    }

    public final Long BGd() {
        return this.A06;
    }

    public final C269954fx BSX() {
        return this.A03;
    }

    public final C269964fy BSb() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ C269984g0 Bhe() {
        return this.A05;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTIGIABPostClickDataDict", PzL.A00(this));
    }

    public C250353lJ(C269924fu r1, C269934fv r2, C269944fw r3, C269954fx r4, C269964fy r5, C269974fz r6, Long l, List list, List list2) {
        this.A00 = r1;
        this.A01 = r2;
        this.A07 = list;
        this.A02 = r3;
        this.A08 = list2;
        this.A06 = l;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
    }
}
