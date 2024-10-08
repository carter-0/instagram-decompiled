package X;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import java.util.HashMap;

/* renamed from: X.64B  reason: invalid class name */
public final class AnonymousClass64B implements Handler.Callback {
    public final /* synthetic */ AnonymousClass63a A00;

    public /* synthetic */ AnonymousClass64B(AnonymousClass63a r1) {
        this.A00 = r1;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            HashMap hashMap = this.A00.A02;
            synchronized (hashMap) {
                AnonymousClass64V r4 = (AnonymousClass64V) message.obj;
                C301015yK r3 = (C301015yK) hashMap.get(r4);
                if (r3 != null && r3.A05.isEmpty()) {
                    if (r3.A03) {
                        AnonymousClass64V r1 = r3.A04;
                        AnonymousClass63a r2 = r3.A06;
                        r2.A04.removeMessages(1, r1);
                        r2.A01.A02(r2.A00, r3);
                        r3.A03 = false;
                        r3.A00 = 2;
                    }
                    hashMap.remove(r4);
                }
            }
            return true;
        } else if (i != 1) {
            return false;
        } else {
            HashMap hashMap2 = this.A00.A02;
            synchronized (hashMap2) {
                AnonymousClass64V r5 = (AnonymousClass64V) message.obj;
                C301015yK r32 = (C301015yK) hashMap2.get(r5);
                if (r32 != null && r32.A00 == 3) {
                    Log.e("GmsClientSupervisor", 002.A0R("Timeout waiting for ServiceConnection callback ", String.valueOf(r5)), new Exception());
                    ComponentName componentName = r32.A01;
                    if (componentName == null && (componentName = r5.A00) == null) {
                        String str = r5.A02;
                        AnonymousClass3Qk.A02(str);
                        componentName = new ComponentName(str, "unknown");
                    }
                    r32.onServiceDisconnected(componentName);
                }
            }
            return true;
        }
    }
}
