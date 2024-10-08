package X;

import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.UrpIndexAction;

/* renamed from: X.3yI  reason: invalid class name and case insensitive filesystem */
public final class C257993yI extends AnonymousClass0T0 implements C258003yJ {
    public final C257843y3 A00;
    public final UrpIndexAction A01;
    public final BI5 A02;
    public final Integer A03;
    public final String A04;

    public final C257993yI FD0(1E9 r1) {
        return this;
    }

    public final C257993yI FD1(1E6 r1) {
        return this;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C257993yI) {
                C257993yI r5 = (C257993yI) obj;
                if (this.A01 != r5.A01 || !0qQ.A0K(this.A00, r5.A00) || !0qQ.A0K(this.A04, r5.A04) || !0qQ.A0K(this.A03, r5.A03) || !0qQ.A0K(this.A02, r5.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        UrpIndexAction urpIndexAction = this.A01;
        int i = 0;
        int hashCode = (urpIndexAction == null ? 0 : urpIndexAction.hashCode()) * 31;
        C257843y3 r0 = this.A00;
        int hashCode2 = (hashCode + (r0 == null ? 0 : r0.hashCode())) * 31;
        String str = this.A04;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num = this.A03;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        BI5 bi5 = this.A02;
        if (bi5 != null) {
            i = bi5.hashCode();
        }
        return hashCode4 + i;
    }

    public final UrpIndexAction AYF() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ C257853y4 AdP() {
        return this.A00;
    }

    public final String Anf() {
        return this.A04;
    }

    public final Integer BGr() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ DUE BPp() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUrpCardTransformation", C44557Cgr.A00(this));
    }

    public C257993yI(C257843y3 r1, UrpIndexAction urpIndexAction, BI5 bi5, Integer num, String str) {
        this.A01 = urpIndexAction;
        this.A00 = r1;
        this.A04 = str;
        this.A03 = num;
        this.A02 = bi5;
    }

    public final C258003yJ E9U(1E9 r1) {
        return this;
    }
}
