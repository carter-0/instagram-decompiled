package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JcE  reason: case insensitive filesystem */
public final class C59948JcE {
    public RecyclerView A00;
    public int A01 = -1;
    public int A02 = -1;
    public final C60473Jm5 A03 = new C60473Jm5(this, 2);
    public final C66442MRw A04;

    public static final void A00(C59948JcE jcE) {
        C249703kE A0W;
        View view;
        C249703kE A0W2;
        View view2;
        C252553pI r1 = jcE.A00.A0D;
        0qQ.A0C(r1, "null cannot be cast to non-null type androidx.recyclerview.widget.LinearLayoutManager");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) r1;
        int A1a = linearLayoutManager.A1a();
        int A1b = linearLayoutManager.A1b();
        int A1c = linearLayoutManager.A1c();
        int A1d = linearLayoutManager.A1d();
        if (A1a == A1c || (A0W2 = jcE.A00.A0W(A1a)) == null || (view2 = A0W2.itemView) == null || !jcE.A01(view2)) {
            A1a = A1c;
        }
        if (A1b == A1d || (A0W = jcE.A00.A0W(A1b)) == null || (view = A0W.itemView) == null || !jcE.A01(view)) {
            A1b = A1d;
        }
        int i = new int[]{A1a, A1b}[0];
        if (i != -1 && A1b != -1) {
            if (i < 0) {
                i = 0;
            }
            if (A1b < 0) {
                A1b = 0;
            }
            if (i != jcE.A01 || A1b != jcE.A02) {
                C60381Jka jka = jcE.A00.A0A;
                0qQ.A0C(jka, "null cannot be cast to non-null type com.instagram.creation.capture.gallery.albumpicker.BaseAdapter<*, T of com.instagram.creation.capture.gallery.albumpicker.AlbumImpressionTracker>");
                C60381Jka jka2 = jka;
                int i2 = i;
                if (jcE.A01 == -1) {
                    while (i2 <= A1b) {
                        jcE.A04.DKL(jka2.A00(i2), i2);
                        i2++;
                    }
                } else {
                    while (i2 < jcE.A01) {
                        jcE.A04.DKL(jka2.A00(i2), i2);
                        i2++;
                    }
                    for (int i3 = A1b; i3 > jcE.A02; i3--) {
                        jcE.A04.DKL(jka2.A00(i3), i3);
                    }
                }
                jcE.A01 = i;
                jcE.A02 = A1b;
            }
        }
    }

    private final boolean A01(View view) {
        Rect rect = new Rect();
        if (!view.isShown() || view.getVisibility() != 0 || view.getParent() == null || !view.getGlobalVisibleRect(rect)) {
            return false;
        }
        float width = ((float) rect.width()) * ((float) rect.height());
        int width2 = view.getWidth() * view.getHeight();
        if (width2 <= 0 || width / ((float) width2) <= 0.6f) {
            return false;
        }
        return true;
    }

    public C59948JcE(RecyclerView recyclerView, C66442MRw mRw) {
        this.A00 = recyclerView;
        this.A04 = mRw;
        ViewTreeObserver viewTreeObserver = recyclerView.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            LZ0.A00(viewTreeObserver, this, 2);
        }
        this.A00.A15(this.A03);
    }
}
