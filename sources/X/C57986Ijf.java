package X;

import android.app.Activity;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.Ijf  reason: case insensitive filesystem */
public final class C57986Ijf implements Runnable {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 28D A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C2801950r A03;
    public final /* synthetic */ PendingRecipient A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ boolean A06;

    public C57986Ijf(Activity activity, 28D r2, UserSession userSession, C2801950r r4, PendingRecipient pendingRecipient, String str, boolean z) {
        this.A02 = userSession;
        this.A01 = r2;
        this.A05 = str;
        this.A03 = r4;
        this.A04 = pendingRecipient;
        this.A06 = z;
        this.A00 = activity;
    }

    public final void run() {
        UserSession userSession = this.A02;
        Class<TransparentModalActivity> cls = TransparentModalActivity.class;
        28D r0 = this.A01;
        if (r0 == null) {
            r0 = 28D.A0z;
        }
        C56044Hrt A0C = C250563lf.A0C(r0);
        A0C.A0M = this.A05;
        A0C.A06 = this.A03;
        A0C.A0B = this.A04;
        A0C.A0s = true;
        A0C.A0v = this.A06;
        Bundle A002 = A0C.A00();
        Activity activity = this.A00;
        AnonymousClass6W8 A022 = AnonymousClass6W8.A02(activity, A002, userSession, cls, "clips_camera");
        A022.A0J = AnonymousClass6W8.A0Q;
        A022.A0C(activity);
    }
}
