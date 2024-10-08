package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3xy  reason: invalid class name and case insensitive filesystem */
public final class C257793xy extends AnonymousClass0T0 implements C257803xz {
    public final C271254iW A00;
    public final C271254iW A01;
    public final C271254iW A02;

    public final C257793xy F8Z() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257793xy) {
                C257793xy r5 = (C257793xy) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C271254iW r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C271254iW r02 = this.A01;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        C271254iW r03 = this.A02;
        if (r03 != null) {
            i = r03.hashCode();
        }
        return hashCode2 + i;
    }

    public final /* bridge */ /* synthetic */ C271264iX AhE() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C271264iX C4m() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C271264iX C8L() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTReelMediaBackground", HU2.A00(this));
    }

    public C257793xy(C271254iW r1, C271254iW r2, C271254iW r3) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
    }
}
