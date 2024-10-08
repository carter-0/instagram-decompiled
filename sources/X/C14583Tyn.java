package X;

import android.view.View;
import com.instagram.android.R;

/* renamed from: X.Tyn  reason: case insensitive filesystem */
public final class C14583Tyn implements Runnable {
    public final /* synthetic */ View A00;
    public final /* synthetic */ C307786Rm A01;
    public final /* synthetic */ C276544tV A02;
    public final /* synthetic */ C276544tV A03;
    public final /* synthetic */ Runnable A04;

    public C14583Tyn(View view, C307786Rm r2, C276544tV r3, C276544tV r4, Runnable runnable) {
        this.A00 = view;
        this.A02 = r3;
        this.A03 = r4;
        this.A01 = r2;
        this.A04 = runnable;
    }

    public final void run() {
        this.A00.setTag(R.id.render_lifecycle_extension_runnable, (Object) null);
        C276544tV r3 = this.A02;
        C277014uI A09 = this.A03.A09();
        C308276Tl A0T = DbU.A0T(r3);
        C307786Rm r0 = this.A01;
        A0T.A02(r0);
        DbT.A1R(r0, r3, A0T, A09);
        Runnable runnable = this.A04;
        if (runnable != null) {
            runnable.run();
        }
    }
}
