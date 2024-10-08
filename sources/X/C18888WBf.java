package X;

import android.app.Activity;
import android.view.View;

/* renamed from: X.WBf  reason: case insensitive filesystem */
public final class C18888WBf implements View.OnLongClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C14802U9x A01;

    public C18888WBf(C14802U9x u9x, int i) {
        this.A01 = u9x;
        this.A00 = i;
    }

    public final boolean onLongClick(View view) {
        C14802U9x u9x = this.A01;
        int i = this.A00;
        W1A w1a = new W1A(u9x.A00, u9x.A02.A04, u9x.A01, new C17357VSk(u9x, i), (C19359WWa) u9x.A03.get(i));
        Activity activity = w1a.A00;
        C46498Dg1 dg1 = new C46498Dg1(activity, w1a.A01);
        dg1.A03 = new IVE(w1a, 3);
        dg1.A02(new WB9((Object) w1a, 48), 2131972172);
        dg1.A02(new WB9((Object) w1a, 49), 2131963366);
        dg1.A04(new WB9((Object) w1a, 50), 2131976735);
        dg1.A04(new WB9((Object) w1a, 51), 2131951988);
        dg1.A04(new C56802ICz(w1a, 18), 2131951987);
        C51969G9p.A11(activity, dg1);
        W1A.A01(w1a, C66579MXk.A00(258));
        return true;
    }
}
