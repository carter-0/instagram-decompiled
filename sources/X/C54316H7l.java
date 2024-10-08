package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.H7l  reason: case insensitive filesystem */
public final class C54316H7l extends AnonymousClass3NK {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C56911IHg A01;
    public final /* synthetic */ C246323eP A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ C55727HmO A04;

    public C54316H7l(C56911IHg iHg, C246323eP r2, 1Xj r3, C55727HmO hmO, int i) {
        this.A02 = r2;
        this.A04 = hmO;
        this.A03 = r3;
        this.A01 = iHg;
        this.A00 = i;
    }

    public final boolean Dqe(View view) {
        FragmentActivity activity;
        AnonymousClass37D A0i;
        C246323eP r2 = this.A02;
        C55727HmO hmO = this.A04;
        if (!C246323eP.A01(this.A03, hmO.A01) || (activity = r2.A00.getActivity()) == null || (A0i = DbT.A0i(activity)) == null) {
            return true;
        }
        ((AnonymousClass37F) A0i).A0H = new Ia0(this.A01, hmO, this.A00);
        A0i.A0B();
        return true;
    }
}
