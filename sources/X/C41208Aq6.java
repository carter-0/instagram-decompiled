package X;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.user.model.User;

/* renamed from: X.Aq6  reason: case insensitive filesystem */
public final /* synthetic */ class C41208Aq6 implements Runnable {
    public final /* synthetic */ AnonymousClass8QN A00;
    public final /* synthetic */ AnonymousClass8QZ A01;
    public final /* synthetic */ 1Xj A02;
    public final /* synthetic */ boolean A03;

    public /* synthetic */ C41208Aq6(AnonymousClass8QN r1, AnonymousClass8QZ r2, 1Xj r3, boolean z) {
        this.A00 = r1;
        this.A03 = z;
        this.A02 = r3;
        this.A01 = r2;
    }

    public final void run() {
        AnonymousClass8QN r3 = this.A00;
        boolean z = this.A03;
        1Xj r4 = this.A02;
        AnonymousClass8QZ r2 = this.A01;
        if (!z) {
            Activity activity = r3.A0A;
            User A012 = AnonymousClass0t1.A01.A01(r3.A0G);
            String A2n = r4.A2n();
            0qQ.A0B(activity, 1);
            Resources resources = activity.getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.font_large);
            int A0F = AnonymousClass7TE.A0F(resources);
            C369848vQ r8 = new C369848vQ(activity, (Drawable) null, (0qm) null, A012, (String) null, A2n, A0F, A0F, dimensionPixelSize, dimensionPixelSize2, A0F, false);
            AnonymousClass8BA r7 = r3.A0N;
            float A0l = r4.A0l();
            AnonymousClass81W r1 = ((NineSixteenLayoutConfigImpl) r3.A0P).A0K;
            C39890ADo A002 = C394869yp.A00(A0l, (float) r1.getWidth(), (float) r1.getHeight(), 0.5f, false);
            A002.A04 = 0.5f;
            r7.A0g(r8, new C310416b1(A002));
            AnonymousClass91L.A05(r3.A0U, r3.A0f);
        }
        r3.A07(r2);
    }
}
