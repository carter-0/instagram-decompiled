package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6St  reason: invalid class name and case insensitive filesystem */
public final class C308116St implements C253183qL {
    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        ((View) obj).setVisibility(((C308026Sk) obj2).A02);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        if (((C308026Sk) obj2).A02 != ((C308026Sk) obj).A02) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setVisibility(0);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }
}
