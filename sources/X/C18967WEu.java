package X;

import android.view.View;

/* renamed from: X.WEu  reason: case insensitive filesystem */
public final /* synthetic */ class C18967WEu implements C70652Tj {
    public final int Bdk(View view, int i) {
        int measuredHeight;
        if (view == null) {
            measuredHeight = 0;
        } else {
            measuredHeight = view.getMeasuredHeight();
        }
        return Math.min(measuredHeight, i);
    }
}
