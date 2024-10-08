package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.4hN  reason: invalid class name and case insensitive filesystem */
public final class C270834hN extends AnonymousClass0T0 implements C270844hO {
    public final C239653Hl A00;
    public final C42064BFr A01;
    public final AnonymousClass3HX A02;

    public final C270834hN FEv(1E9 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C270834hN) {
                C270834hN r5 = (C270834hN) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C239653Hl r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        C42064BFr bFr = this.A01;
        int hashCode2 = (hashCode + (bFr == null ? 0 : bFr.hashCode())) * 31;
        AnonymousClass3HX r02 = this.A02;
        if (r02 != null) {
            i = r02.hashCode();
        }
        return hashCode2 + i;
    }

    public final /* bridge */ /* synthetic */ C239663Hm Ahx() {
        return this.A00;
    }

    public final /* bridge */ /* synthetic */ C46299DUc BeE() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass3HY BkV() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUserStory", C44889Cmf.A00(this));
    }

    public C270834hN(C239653Hl r1, C42064BFr bFr, AnonymousClass3HX r3) {
        this.A00 = r1;
        this.A01 = bFr;
        this.A02 = r3;
    }

    public final C270844hO E9y(1E9 r1) {
        return this;
    }
}
