package X;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Intent;
import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import java.util.List;

/* renamed from: X.Fdx  reason: case insensitive filesystem */
public final /* synthetic */ class C50537Fdx implements C51880G5s {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Status A01;
    public final /* synthetic */ C49914FEn A02;
    public final /* synthetic */ C46634DiE A03;
    public final /* synthetic */ boolean A04;

    public /* synthetic */ C50537Fdx(Activity activity, Status status, C49914FEn fEn, C46634DiE diE, boolean z) {
        this.A02 = fEn;
        this.A03 = diE;
        this.A04 = z;
        this.A00 = activity;
        this.A01 = status;
    }

    public final void EIU(C13675Tek tek) {
        C49914FEn fEn = this.A02;
        C46634DiE diE = this.A03;
        boolean z = this.A04;
        Activity activity = this.A00;
        Status status = this.A01;
        C13675Tek tek2 = tek;
        try {
            0lg r12 = fEn.A03;
            C47909EMd eMd = new C47909EMd(fEn.A02, r12, tek2, diE, z);
            List list = fEn.A04;
            synchronized (list) {
                list.add(eMd);
            }
            PendingIntent pendingIntent = status.A01;
            pendingIntent.getClass();
            activity.startIntentSenderForResult(pendingIntent.getIntentSender(), eMd.A00, (Intent) null, 0, 0, 0);
            if (z) {
                0qQ.A0B(r12, 0);
                C319616qu.A01(r12, "login_smartlock_save_impression", "login_smart_lock", "smartlock", (String) null);
            }
        } catch (IntentSender.SendIntentException unused) {
            if (!z) {
                0lg r4 = fEn.A03;
                diE.getClass();
                String str = diE.A01;
                0qQ.A0B(r4, 0);
                C49956FGl.A04(r4, str, "save", "cannot_show_dialog");
                activity.runOnUiThread(new C51457FuR(activity, tek2, Boolean.FALSE));
            }
        }
    }
}
