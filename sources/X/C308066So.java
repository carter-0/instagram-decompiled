package X;

import android.content.Context;
import android.view.View;

/* renamed from: X.6So  reason: invalid class name and case insensitive filesystem */
public final class C308066So implements C253183qL {
    public final /* synthetic */ String getDescription() {
        return V6I.A00(this);
    }

    public final /* bridge */ /* synthetic */ Object ADM(Context context, Object obj, Object obj2, Object obj3) {
        View view = (View) obj;
        C308026Sk r7 = (C308026Sk) obj2;
        0qQ.A0B(view, 1);
        0qQ.A0B(r7, 2);
        View.OnClickListener onClickListener = r7.A05;
        if (onClickListener != null) {
            AnonymousClass0fU.A00(onClickListener, view);
        }
        view.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        view.setFocusable(r7.A09);
        view.setFocusableInTouchMode(false);
        view.setEnabled(r7.A08);
        if (r7.A00 != -1) {
            view.setClickable(false);
        }
        return null;
    }

    public final /* bridge */ /* synthetic */ void FIN(Context context, Object obj, Object obj2, Object obj3, Object obj4) {
        View view = (View) obj;
        0qQ.A0B(view, 1);
        view.setOnClickListener((View.OnClickListener) null);
        view.setClickable(false);
        view.setOnFocusChangeListener((View.OnFocusChangeListener) null);
        view.setFocusable(false);
        view.setFocusableInTouchMode(false);
    }

    public final /* synthetic */ Class CAe() {
        return getClass();
    }

    public final /* bridge */ /* synthetic */ boolean Ete(Object obj, Object obj2, Object obj3, Object obj4) {
        return true;
    }
}
