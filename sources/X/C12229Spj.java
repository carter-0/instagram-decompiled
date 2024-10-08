package X;

import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Spj  reason: case insensitive filesystem */
public final class C12229Spj implements C253183qL {
    public boolean A00;
    public final C62320sa A01;

    public C12229Spj(C62320sa r2) {
        0qQ.A0B(r2, 1);
        this.A01 = r2;
    }

    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        0qQ.A0B(view, 1);
        if (this.A00) {
            return null;
        }
        C11511SbY sbY = new C11511SbY(view, this, this.A01);
        view.getViewTreeObserver().addOnDrawListener(sbY);
        return sbY;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        ViewTreeObserver.OnDrawListener onDrawListener = (ViewTreeObserver.OnDrawListener) obj4;
        0qQ.A0B(view, 1);
        if (onDrawListener != null && view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnDrawListener(onDrawListener);
        }
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return false;
    }
}
