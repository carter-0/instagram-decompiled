package X;

import android.os.Handler;
import android.widget.AbsListView;
import android.widget.PopupWindow;

/* renamed from: X.WCc  reason: case insensitive filesystem */
public final class C18908WCc implements AbsListView.OnScrollListener {
    public final /* synthetic */ WDV A00;

    public C18908WCc(WDV wdv) {
        this.A00 = wdv;
    }

    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
        AnonymousClass0fD.A0A(814672774, AnonymousClass0fD.A03(986079129));
    }

    public final void onScrollStateChanged(AbsListView absListView, int i) {
        int A03 = AnonymousClass0fD.A03(-1726867918);
        if (i == 1) {
            WDV wdv = this.A00;
            PopupWindow popupWindow = wdv.A09;
            if (!(popupWindow.getInputMethodMode() == 2 || popupWindow.getContentView() == null)) {
                Handler handler = wdv.A0I;
                C19895WhQ whQ = wdv.A0K;
                handler.removeCallbacks(whQ);
                whQ.run();
            }
        }
        AnonymousClass0fD.A0A(-2093652853, A03);
    }
}
