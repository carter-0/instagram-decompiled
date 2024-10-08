package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.amazon.device.messaging.ADM;
import com.instagram.common.notifications.push.intf.PushChannelType;

/* renamed from: X.OtY  reason: case insensitive filesystem */
public final class C71947OtY implements AnonymousClass3R2 {
    public final Context A00;

    public C71947OtY(Context context) {
        0qQ.A0B(context, 1);
        this.A00 = context;
    }

    public final void DOx() {
    }

    public final /* synthetic */ PushChannelType B3t() {
        return PushChannelType.A0D;
    }

    public final PushChannelType BiL() {
        return PushChannelType.AMAZON;
    }

    public final void CMj(1XZ r4, String str, boolean z) {
        Context context = this.A00;
        ComponentName componentName = new ComponentName(context, "com.instagram.notifications.push.ADMMessageHandler$Receiver");
        PackageManager packageManager = context.getPackageManager();
        componentName.getClassName();
        packageManager.setComponentEnabledSetting(componentName, 1, 1);
    }

    public final void CsW(C3733895d r3, Integer num) {
        r3.A00.DMd(false);
    }

    public final void EBN(Integer num) {
        new ADM(this.A00).startRegister();
    }
}
