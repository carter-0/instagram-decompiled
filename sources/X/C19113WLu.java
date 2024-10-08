package X;

/* renamed from: X.WLu  reason: case insensitive filesystem */
public final class C19113WLu implements C20893X2z {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C19113WLu(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean CVj(Object obj) {
        if (this.A00 == 0) {
            return ((Class) this.A02).isAssignableFrom(obj.getClass());
        }
        V33 v33 = (V33) obj;
        if (!((Class) this.A02).isAssignableFrom(v33.getClass()) || ((UVP) v33).A00 != ((C19104WLl) this.A01).A01) {
            return false;
        }
        return true;
    }
}
