package X;

import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;

/* renamed from: X.Vv6  reason: case insensitive filesystem */
public final class C18613Vv6 {
    public long A00 = -1;
    public Runnable A01;
    public boolean A02;
    public final SparseArray A03 = new SparseArray(0);
    public final C18645Vvo A04 = new Object();
    public final C18645Vvo A05 = new Object();
    public final C18645Vvo A06 = new Object();

    public static void A00(View view, C18613Vv6 vv6) {
        view.setClickable(false);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                A00(viewGroup.getChildAt(i), vv6);
            }
        }
    }

    public final boolean A02(View view) {
        if (view != null) {
            return (this.A02 && view.getParent() != null) || this.A03.get(view.getId()) != null;
        }
        return false;
    }

    public final void A01() {
        C18645Vvo vvo = this.A04;
        vvo.A03 = null;
        vvo.A01 = 0;
        vvo.A00 = 0;
        vvo.A02 = null;
        C18645Vvo vvo2 = this.A06;
        vvo2.A03 = null;
        vvo2.A01 = 0;
        vvo2.A00 = 0;
        vvo2.A02 = null;
        C18645Vvo vvo3 = this.A05;
        vvo3.A03 = null;
        vvo3.A01 = 0;
        vvo3.A00 = 0;
        vvo3.A02 = null;
        this.A01 = null;
        this.A02 = false;
        this.A00 = -1;
    }
}
