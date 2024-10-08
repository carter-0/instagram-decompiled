package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.LOw  reason: case insensitive filesystem */
public final class C64125LOw {
    public final Activity A00;
    public final View A01;
    public final ViewTreeObserver.OnScrollChangedListener A02 = new LZ5(this, 5);
    public final C252213ok A03 = new C64871LjX(this, 13);
    public final AnonymousClass3E6 A04 = AnonymousClass3E4.A01(this, false, false);
    public final ArrayList A05 = AnonymousClass7TE.A1C();

    public C64125LOw(Activity activity, View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A00 = activity;
    }

    public static final void A00(C64125LOw lOw) {
        View view = lOw.A01;
        if (view.isShown() && view.getGlobalVisibleRect(AnonymousClass7TE.A0W())) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            ArrayList arrayList = lOw.A05;
            synchronized (arrayList) {
                A1C.addAll(arrayList);
            }
            Iterator A1G = AnonymousClass7TE.A1G(A1C);
            while (A1G.hasNext()) {
                ((Runnable) AnonymousClass7TF.A0a(A1G)).run();
            }
        }
    }

    public final void A01() {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            arrayList.clear();
        }
        View view = this.A01;
        if (view.getViewTreeObserver().isAlive()) {
            view.getViewTreeObserver().removeOnScrollChangedListener(this.A02);
        }
        this.A04.EEH(this.A03);
    }

    public final void A02(Runnable runnable) {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            if (arrayList.isEmpty()) {
                this.A01.getViewTreeObserver().addOnScrollChangedListener(this.A02);
                AnonymousClass3E6 r1 = this.A04;
                r1.A9Y(this.A03);
                r1.DmJ(this.A00);
            }
            arrayList.add(runnable);
        }
    }

    public final void A03(Runnable runnable) {
        ArrayList arrayList = this.A05;
        synchronized (arrayList) {
            0u4.A00(arrayList).remove(runnable);
            if (arrayList.isEmpty()) {
                A01();
            }
        }
    }
}
