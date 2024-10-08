package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.mainactivity.InstagramMainActivity;

/* renamed from: X.TDv  reason: case insensitive filesystem */
public final class C12932TDv implements Runnable {
    public final /* synthetic */ AnonymousClass55E A00;

    public C12932TDv(AnonymousClass55E r1) {
        this.A00 = r1;
    }

    public final void run() {
        Context context = this.A00.A01;
        Intent A0A = C66580MXl.A0A(context, InstagramMainActivity.class);
        A0A.setFlags(335577088);
        Pxf.A0O().A0G(context, A0A);
    }
}
