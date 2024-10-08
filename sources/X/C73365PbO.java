package X;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.pendingmedia.service.impl.RetryUploadingBroadcastReceiver;

/* renamed from: X.PbO  reason: case insensitive filesystem */
public final /* synthetic */ class C73365PbO implements Runnable {
    public final /* synthetic */ C66673Mag A00;
    public final /* synthetic */ C270214gN A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;

    public /* synthetic */ C73365PbO(C66673Mag mag, C270214gN r2, String str, String str2) {
        this.A00 = mag;
        this.A02 = str;
        this.A03 = str2;
        this.A01 = r2;
    }

    public final void run() {
        C66673Mag mag = this.A00;
        String str = this.A02;
        String str2 = this.A03;
        C270214gN r5 = this.A01;
        1Ou r1 = mag.A05;
        IntentFilter intentFilter = 1Ou.A0W;
        Context context = r1.A03;
        Intent putExtra = C66580MXl.A0A(context, RetryUploadingBroadcastReceiver.class).setAction("com.instagram.pendingmedia.service.notification.ACTION_RETRY_UPLOADING").putExtra("PENDING_MEDIA_KEY", str);
        int hashCode = str.hashCode();
        ShareType shareType = ShareType.DIRECT_SHARE;
        OI4 oi4 = new OI4(putExtra, LPi.A00(str2), 1iA.A0a, shareType, hashCode, true, false);
        C67625Mqx.A00.A02(context, mag.A02, oi4, DbW.A1a(r5));
    }
}
