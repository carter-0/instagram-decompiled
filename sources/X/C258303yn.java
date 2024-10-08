package X;

import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;

/* renamed from: X.3yn  reason: invalid class name and case insensitive filesystem */
public final class C258303yn implements AnonymousClass2xU {
    public ViewGroup A00;
    public TextView A01;
    public TextView A02;
    public Runnable A03;
    public final Handler A04;
    public final C252063oV A05;

    public final void DQp(AnonymousClass3W1 r3, int i) {
        0qQ.A0B(r3, 0);
        if (i == 17 && !r3.A23) {
            Handler handler = this.A04;
            Runnable runnable = this.A03;
            if (runnable != null) {
                handler.removeCallbacks(runnable);
            } else {
                0qQ.A0F("runnable");
                throw AnonymousClass00P.createAndThrow();
            }
        }
    }

    public C258303yn(ViewStub viewStub) {
        C252063oV A012 = viewStub != null ? 2b1.A01(viewStub, false, false) : null;
        this.A05 = A012;
        this.A04 = new Handler(Looper.getMainLooper());
        if (A012 != null) {
            A012.EeU(new C2607746z(this));
        }
    }
}
