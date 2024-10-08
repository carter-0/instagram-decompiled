package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.PZN  reason: case insensitive filesystem */
public final /* synthetic */ class C73243PZN implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C71153OeR A01;

    public /* synthetic */ C73243PZN(View view, C71153OeR oeR) {
        this.A01 = oeR;
        this.A00 = view;
    }

    public final void run() {
        C71153OeR oeR = this.A01;
        View view = this.A00;
        FragmentActivity activity = oeR.A0b.getActivity();
        if (activity != null) {
            AnonymousClass5Gt A0e = AnonymousClass7TG.A0e(activity, 2131960000);
            A0e.A03(view);
            A0e.A01();
            A0e.A07(C283255Gu.A07);
            A0e.A0A = true;
            A0e.A04 = new NdO(oeR, 3);
            A0e.A00().A06();
        }
    }
}
