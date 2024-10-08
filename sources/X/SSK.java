package X;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.os.Bundle;
import com.facebook.common.gcmcompat.Task;
import java.util.List;

@Deprecated
public final class SSK {
    public static SSK A01;
    public static final Integer A02 = 4;
    public final Context A00;

    public static Intent A00(ComponentName componentName, SSK ssk, String str) {
        0Sy r2 = new 0Sy();
        r2.A03 = componentName;
        return Pxe.A0G("com.google.android.gms.gcm.ACTION_SCHEDULE").setPackage("com.google.android.gms").putExtra("scheduler_action", str).putExtra("app", r2.A02(ssk.A00, 0, 0)).putExtra("source", A02).putExtra("source_version", 12451000);
    }

    @Deprecated
    public static synchronized SSK A01(Context context) {
        SSK ssk;
        synchronized (SSK.class) {
            ssk = A01;
            if (ssk == null) {
                ssk = new SSK(context.getApplicationContext());
                A01 = ssk;
            }
        }
        return ssk;
    }

    public static void A02(SSK ssk, String str) {
        if (str != null) {
            Intent A0G = Pxe.A0G("com.google.android.gms.gcm.ACTION_TASK_READY");
            Context context = ssk.A00;
            Pxe.A1L(context, A0G);
            List<ResolveInfo> queryIntentServices = context.getPackageManager().queryIntentServices(A0G, 512);
            if (queryIntentServices == null || queryIntentServices.isEmpty()) {
                throw AnonymousClass7TE.A0w("There is no GcmTaskService component registered within this package. Have you extended GcmTaskService correctly?");
            }
            for (ResolveInfo resolveInfo : queryIntentServices) {
                if (resolveInfo.serviceInfo.name.equals(str)) {
                    return;
                }
            }
            throw AnonymousClass7TE.A0w("The GcmTaskService class you provided  does not seem to support receiving com.google.android.gms.gcm.ACTION_TASK_READY.");
        }
        throw AnonymousClass7TE.A11("GcmTaskService must not be null.");
    }

    @Deprecated
    public final void A03(Task task) {
        String str = task.A00;
        A02(this, str);
        Context context = this.A00;
        Intent A002 = A00(new ComponentName(context, str), this, "SCHEDULE_TASK");
        if (A002 != null) {
            Bundle A0a = AnonymousClass7TE.A0a();
            task.A00(A0a);
            A002.putExtras(A0a);
            context.sendBroadcast(A002);
        }
    }

    public SSK(Context context) {
        this.A00 = context;
    }
}
