package X;

/* renamed from: X.Toc  reason: case insensitive filesystem */
public final class C14036Toc extends AnonymousClass4AA {
    public final boolean A00;
    public final boolean A01;
    public final boolean A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ boolean isContentSame(Object obj) {
        C14036Toc toc = (C14036Toc) obj;
        if (this.A03 == toc.A03 && this.A00 == toc.A00 && this.A01 == toc.A01 && this.A02 == toc.A02) {
            return true;
        }
        return false;
    }

    public C14036Toc(boolean z, boolean z2, boolean z3, boolean z4) {
        this.A03 = z;
        this.A00 = z2;
        this.A01 = z3;
        this.A02 = z4;
    }

    public static C14036Toc A00(C229122ms r5) {
        return new C14036Toc(r5.isLoading(), r5.CJz(), r5.CKB(), r5.CT5());
    }
}
