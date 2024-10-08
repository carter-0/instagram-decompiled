package X;

import android.content.Context;
import android.graphics.Paint;
import android.view.View;

/* renamed from: X.6Sn  reason: invalid class name and case insensitive filesystem */
public final class C308056Sn implements C253183qL {
    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C308026Sk r5 = (C308026Sk) obj2;
        0qQ.A0B(view, 1);
        0qQ.A0B(r5, 2);
        view.setLayerType(r5.A01, (Paint) null);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        C308026Sk r4 = (C308026Sk) obj;
        C308026Sk r5 = (C308026Sk) obj2;
        0qQ.A0B(r4, 0);
        0qQ.A0B(r5, 1);
        if (r4.A01 != r5.A01) {
            return true;
        }
        return false;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        0qQ.A0B(view, 1);
        view.setLayerType(0, (Paint) null);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }
}
