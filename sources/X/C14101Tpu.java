package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;

/* renamed from: X.Tpu  reason: case insensitive filesystem */
public final class C14101Tpu implements C253183qL {
    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        Rect rect = ((C14100Tpt) obj2).A04;
        if (rect == null) {
            return null;
        }
        view.setPadding(rect.left, rect.top, rect.right, rect.bottom);
        return null;
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return !2Ob.A00(((C14100Tpt) obj).A04, ((C14100Tpt) obj2).A04);
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        ((View) obj).setPadding(0, 0, 0, 0);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* synthetic */ String getDescription() {
        return C13988Tno.A0d(this);
    }
}
