package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.Pbt  reason: case insensitive filesystem */
public final class C73396Pbt implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Av A03;
    public final /* synthetic */ String A04;

    public C73396Pbt(Activity activity, View view, UserSession userSession, 1Av r4, String str) {
        this.A01 = view;
        this.A04 = str;
        this.A03 = r4;
        this.A00 = activity;
        this.A02 = userSession;
    }

    public final void run() {
        View view = this.A01;
        if (view.isAttachedToWindow()) {
            C315476jx r3 = new C315476jx((CharSequence) this.A04);
            NdO ndO = new NdO(this, 8);
            AnonymousClass5Gt r1 = new AnonymousClass5Gt(this.A00, r3);
            r1.A03(view);
            r1.A01();
            r1.A07(C283255Gu.A06);
            r1.A04 = ndO;
            r1.A00().A07(this.A02);
        }
    }
}
