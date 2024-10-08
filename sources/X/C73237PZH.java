package X;

import android.content.Context;
import android.content.Intent;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

/* renamed from: X.PZH  reason: case insensitive filesystem */
public final class C73237PZH implements Runnable {
    public final /* synthetic */ AnonymousClass5HJ A00;
    public final /* synthetic */ C72215Oyg A01;

    public C73237PZH(AnonymousClass5HJ r1, C72215Oyg oyg) {
        this.A00 = r1;
        this.A01 = oyg;
    }

    public final void run() {
        AnonymousClass5HJ r1 = this.A00;
        String str = r1.A0g;
        if (str == null) {
            str = "";
        }
        String A002 = C66630MZz.A00(DbT.A09(str));
        if (A002 == null) {
            0wb.A03("StellaMessageNotificationHandler", "Null message id from notification");
            return;
        }
        String str2 = r1.A0j;
        OZC ozc = OZC.A01;
        C72215Oyg oyg = this.A01;
        Context context = oyg.A01;
        0wc r2 = oyg.A02;
        0qQ.A0B(context, 0);
        Intent intent = new Intent("revoke_notification");
        intent.putExtra(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, str2);
        intent.putExtra("message_id", A002);
        OZC.A00(context, intent, r2);
    }
}
