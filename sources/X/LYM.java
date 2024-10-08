package X;

import android.view.View;

public final /* synthetic */ class LYM implements View.OnFocusChangeListener {
    public final /* synthetic */ C60049JeH A00;
    public final /* synthetic */ AnonymousClass3Q2 A01;
    public final /* synthetic */ String A02;

    public /* synthetic */ LYM(C60049JeH jeH, AnonymousClass3Q2 r2, String str) {
        this.A00 = jeH;
        this.A01 = r2;
        this.A02 = str;
    }

    public final void onFocusChange(View view, boolean z) {
        String str;
        C60049JeH jeH = this.A00;
        AnonymousClass3Q2 r0 = this.A01;
        String str2 = this.A02;
        if (z && (str = r0.A33) != null) {
            C59888JbD.A01(jeH.A00, new KPX(str, str2, jeH.A01, r0.A01()));
        }
    }
}
