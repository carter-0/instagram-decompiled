package X;

/* renamed from: X.WLv  reason: case insensitive filesystem */
public final class C19114WLv implements C20893X2z {
    public final /* synthetic */ C15209UVm A00;
    public final /* synthetic */ UVD A01;
    public final /* synthetic */ Class A02;

    public C19114WLv(C15209UVm uVm, UVD uvd, Class cls) {
        this.A00 = uVm;
        this.A02 = cls;
        this.A01 = uvd;
    }

    public final /* bridge */ /* synthetic */ boolean CVj(Object obj) {
        V33 v33 = (V33) obj;
        if (!this.A02.isAssignableFrom(v33.getClass()) || ((UVP) v33).A00 != this.A01) {
            return false;
        }
        return true;
    }
}
