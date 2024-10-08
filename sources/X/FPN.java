package X;

import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;

public final class FPN implements View.OnKeyListener {
    public final /* synthetic */ ViewGroup A00;
    public final /* synthetic */ C273694n2 A01;
    public final /* synthetic */ AnonymousClass6NS A02;

    public final boolean onKey(View view, int i, KeyEvent keyEvent) {
        if (i != 4 || keyEvent.getAction() != 1) {
            return false;
        }
        C273694n2 r3 = this.A01;
        if (r3.getVisibility() != 0) {
            return false;
        }
        ViewGroup viewGroup = this.A00;
        AnonymousClass6NS r1 = this.A02;
        r3.setVisibility(8);
        viewGroup.removeView(r3);
        r1.A03();
        return true;
    }

    public FPN(ViewGroup viewGroup, C273694n2 r2, AnonymousClass6NS r3) {
        this.A01 = r2;
        this.A00 = viewGroup;
        this.A02 = r3;
    }
}
