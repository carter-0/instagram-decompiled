package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.41Y  reason: invalid class name */
public final class AnonymousClass41Y extends AnonymousClass0T0 implements AnonymousClass41Z {
    public final AnonymousClass4hP A00;
    public final AnonymousClass4hP A01;
    public final AnonymousClass4hP A02;
    public final AnonymousClass4hP A03;
    public final AnonymousClass4hP A04;
    public final AnonymousClass4hP A05;
    public final AnonymousClass4hP A06;
    public final AnonymousClass4hP A07;
    public final AnonymousClass4hP A08;

    public final AnonymousClass41Y F6O() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AnonymousClass41Y) {
                AnonymousClass41Y r5 = (AnonymousClass41Y) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A05, r5.A05) || !0qQ.A0K(this.A06, r5.A06) || !0qQ.A0K(this.A07, r5.A07) || !0qQ.A0K(this.A08, r5.A08)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        AnonymousClass4hP r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        AnonymousClass4hP r02 = this.A01;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        AnonymousClass4hP r03 = this.A02;
        int hashCode3 = (hashCode2 + (r03 == null ? 0 : r03.hashCode())) * 31;
        AnonymousClass4hP r04 = this.A03;
        int hashCode4 = (hashCode3 + (r04 == null ? 0 : r04.hashCode())) * 31;
        AnonymousClass4hP r05 = this.A04;
        int hashCode5 = (hashCode4 + (r05 == null ? 0 : r05.hashCode())) * 31;
        AnonymousClass4hP r06 = this.A05;
        int hashCode6 = (hashCode5 + (r06 == null ? 0 : r06.hashCode())) * 31;
        AnonymousClass4hP r07 = this.A06;
        int hashCode7 = (hashCode6 + (r07 == null ? 0 : r07.hashCode())) * 31;
        AnonymousClass4hP r08 = this.A07;
        int hashCode8 = (hashCode7 + (r08 == null ? 0 : r08.hashCode())) * 31;
        AnonymousClass4hP r09 = this.A08;
        if (r09 != null) {
            i = r09.hashCode();
        }
        return hashCode8 + i;
    }

    public final /* bridge */ /* synthetic */ C270854hQ At8() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C270854hQ B1Z() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C270854hQ B7C() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ C270854hQ B9S() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ C270854hQ BCd() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ C270854hQ BDx() {
        return this.A05;
    }

    public final /* bridge */ /* synthetic */ C270854hQ BSw() {
        return this.A06;
    }

    public final /* bridge */ /* synthetic */ C270854hQ Bgh() {
        return this.A07;
    }

    public final /* bridge */ /* synthetic */ C270854hQ C89() {
        return this.A08;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTMoreInfo", GVN.A00(this));
    }

    public AnonymousClass41Y(AnonymousClass4hP r1, AnonymousClass4hP r2, AnonymousClass4hP r3, AnonymousClass4hP r4, AnonymousClass4hP r5, AnonymousClass4hP r6, AnonymousClass4hP r7, AnonymousClass4hP r8, AnonymousClass4hP r9) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = r5;
        this.A05 = r6;
        this.A06 = r7;
        this.A07 = r8;
        this.A08 = r9;
    }
}
