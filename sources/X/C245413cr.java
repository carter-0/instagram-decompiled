package X;

import com.facebook.pando.TreeUpdaterJNI;

/* renamed from: X.3cr  reason: invalid class name and case insensitive filesystem */
public final class C245413cr extends AnonymousClass0T0 implements C245423cs {
    public final C245373cm A00;
    public final AnonymousClass5AT A01;
    public final C245403cq A02;
    public final AnonymousClass5AU A03;

    public final C245413cr F0T() {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C245413cr) {
                C245413cr r5 = (C245413cr) obj;
                if (!0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A01, r5.A01) || !0qQ.A0K(this.A02, r5.A02) || !0qQ.A0K(this.A03, r5.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        C245373cm r0 = this.A00;
        int i = 0;
        int hashCode = (r0 == null ? 0 : r0.hashCode()) * 31;
        AnonymousClass5AT r02 = this.A01;
        int hashCode2 = (hashCode + (r02 == null ? 0 : r02.hashCode())) * 31;
        C245403cq r03 = this.A02;
        int hashCode3 = (hashCode2 + (r03 == null ? 0 : r03.hashCode())) * 31;
        AnonymousClass5AU r04 = this.A03;
        if (r04 != null) {
            i = r04.hashCode();
        }
        return hashCode3 + i;
    }

    public final /* bridge */ /* synthetic */ C45396Cvc AK6() {
        return new C45396Cvc(this);
    }

    public final C245373cm ApB() {
        return this.A00;
    }

    public final AnonymousClass5AT BZd() {
        return this.A01;
    }

    public final C245403cq BcP() {
        return this.A02;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass5AV CB3() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTAppreciationEntryPointContainer", B4Y.A00(this));
    }

    public C245413cr(C245373cm r1, AnonymousClass5AT r2, C245403cq r3, AnonymousClass5AU r4) {
        this.A00 = r1;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
    }
}
