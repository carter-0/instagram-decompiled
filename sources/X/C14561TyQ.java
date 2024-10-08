package X;

import android.content.Context;

/* renamed from: X.TyQ  reason: case insensitive filesystem */
public final class C14561TyQ implements C253183qL {
    public final /* synthetic */ C21043XAw A00;

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        if (obj3 != null) {
            ((C299025uS) this.A00.BCk()).setRenderTree(((C307996Sh) obj3).A01);
        }
        return null;
    }

    public C14561TyQ(C21043XAw xAw) {
        this.A00 = xAw;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        C276544tV r4 = (C276544tV) obj;
        C276544tV r5 = (C276544tV) obj2;
        if (C276674ti.A00() != null) {
            if (obj3 != null) {
                return true;
            }
            return false;
        } else if (r4.A07(40) != r5.A07(40)) {
            return true;
        } else {
            return false;
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
    }
}
