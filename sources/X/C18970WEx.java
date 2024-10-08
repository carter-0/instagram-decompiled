package X;

import android.view.View;

/* renamed from: X.WEx  reason: case insensitive filesystem */
public final class C18970WEx implements C70652Tj {
    public static final C18970WEx A00 = new C18970WEx();

    public final int Bdk(View view, int i) {
        if (view instanceof C60074Jf7) {
            view = ((C60074Jf7) view).A00;
        }
        int measuredHeight = view.getMeasuredHeight();
        if (measuredHeight > i) {
            return i;
        }
        return measuredHeight;
    }
}
