package X;

import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

/* renamed from: X.4ys  reason: invalid class name and case insensitive filesystem */
public final class C279584ys extends AnonymousClass0T0 implements C270564gw {
    public final long A00;
    public final BEC A01;
    public final C279474yh A02;
    public final C279504yk A03;
    public final BEI A04;
    public final DSS A05;
    public final C279534yn A06;
    public final Boolean A07;
    public final Integer A08;
    public final List A09;
    public final List A0A;

    public C279584ys(BEC bec, C279474yh r3, C279504yk r4, BEI bei, DSS dss, C279534yn r7, Boolean bool, Integer num, List list, List list2, long j) {
        0qQ.A0B(list, 5);
        this.A02 = r3;
        this.A03 = r4;
        this.A08 = num;
        this.A04 = bei;
        this.A09 = list;
        this.A07 = bool;
        this.A01 = bec;
        this.A00 = j;
        this.A05 = dss;
        this.A06 = r7;
        this.A0A = list2;
    }

    public final C279584ys FDm() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C279584ys) {
                C279584ys r8 = (C279584ys) obj;
                if (!0qQ.A0K(this.A02, r8.A02) || !0qQ.A0K(this.A03, r8.A03) || !0qQ.A0K(this.A08, r8.A08) || !0qQ.A0K(this.A04, r8.A04) || !0qQ.A0K(this.A09, r8.A09) || !0qQ.A0K(this.A07, r8.A07) || !0qQ.A0K(this.A01, r8.A01) || this.A00 != r8.A00 || !0qQ.A0K(this.A05, r8.A05) || !0qQ.A0K(this.A06, r8.A06) || !0qQ.A0K(this.A0A, r8.A0A)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final /* bridge */ /* synthetic */ C279484yi Ad4() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C279514yl B0L() {
        return this.A03;
    }

    public final Integer BT9() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ DSI BoA() {
        return this.A04;
    }

    public final List BrX() {
        return this.A09;
    }

    public final Boolean BuB() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ DSG Bwy() {
        return this.A01;
    }

    public final DSS C7R() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ C279544yo C7S() {
        return this.A06;
    }

    public final List C9U() {
        return this.A0A;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTClipsTemplateInfo", C41905B6a.A00(this));
    }

    public final long getTemplateClipsMediaId() {
        return this.A00;
    }

    public final int hashCode() {
        int hashCode;
        int hashCode2;
        int hashCode3;
        int hashCode4;
        int hashCode5;
        int hashCode6;
        int hashCode7;
        int hashCode8;
        C279474yh r0 = this.A02;
        int i = 0;
        if (r0 == null) {
            hashCode = 0;
        } else {
            hashCode = r0.hashCode();
        }
        int i2 = hashCode * 31;
        C279504yk r02 = this.A03;
        if (r02 == null) {
            hashCode2 = 0;
        } else {
            hashCode2 = r02.hashCode();
        }
        int i3 = (i2 + hashCode2) * 31;
        Integer num = this.A08;
        if (num == null) {
            hashCode3 = 0;
        } else {
            hashCode3 = num.hashCode();
        }
        int i4 = (i3 + hashCode3) * 31;
        BEI bei = this.A04;
        if (bei == null) {
            hashCode4 = 0;
        } else {
            hashCode4 = bei.hashCode();
        }
        int hashCode9 = (((i4 + hashCode4) * 31) + this.A09.hashCode()) * 31;
        Boolean bool = this.A07;
        if (bool == null) {
            hashCode5 = 0;
        } else {
            hashCode5 = bool.hashCode();
        }
        int i5 = (hashCode9 + hashCode5) * 31;
        BEC bec = this.A01;
        if (bec == null) {
            hashCode6 = 0;
        } else {
            hashCode6 = bec.hashCode();
        }
        long j = this.A00;
        int i6 = (((i5 + hashCode6) * 31) + ((int) (j ^ (j >>> 32)))) * 31;
        DSS dss = this.A05;
        if (dss == null) {
            hashCode7 = 0;
        } else {
            hashCode7 = dss.hashCode();
        }
        int i7 = (i6 + hashCode7) * 31;
        C279534yn r03 = this.A06;
        if (r03 == null) {
            hashCode8 = 0;
        } else {
            hashCode8 = r03.hashCode();
        }
        int i8 = (i7 + hashCode8) * 31;
        List list = this.A0A;
        if (list != null) {
            i = list.hashCode();
        }
        return i8 + i;
    }
}
