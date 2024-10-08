package X;

import android.view.View;

/* renamed from: X.4ly  reason: invalid class name and case insensitive filesystem */
public final class C273094ly implements View.OnClickListener {
    public final /* synthetic */ View.OnClickListener A00;
    public final /* synthetic */ C273004lm A01;
    public final /* synthetic */ C253993rl A02;
    public final /* synthetic */ C243503Za A03;

    public C273094ly(View.OnClickListener onClickListener, C273004lm r2, C253993rl r3, C243503Za r4) {
        this.A00 = onClickListener;
        this.A02 = r3;
        this.A01 = r2;
        this.A03 = r4;
    }

    public final void onClick(View view) {
        int A05 = AnonymousClass0fD.A05(1461018226);
        this.A00.onClick(this.A02.A00());
        C273004lm r4 = this.A01;
        Integer num = AnonymousClass05K.A07;
        C243503Za r2 = this.A03;
        String id = r2.A0F.getId();
        String A2n = r2.A09.A01.A2n();
        if (A2n != null) {
            r4.A08(id, num, A2n);
            AnonymousClass0fD.A0C(-1559956652, A05);
            return;
        }
        IllegalStateException illegalStateException = new IllegalStateException("Required value was null.");
        AnonymousClass0fD.A0C(1617464799, A05);
        throw illegalStateException;
    }
}
