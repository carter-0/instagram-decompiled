package X;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Rect;
import java.io.IOException;

/* renamed from: X.9l3  reason: invalid class name and case insensitive filesystem */
public final class C386719l3 extends 0ng {
    public final /* synthetic */ K6Y A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C386719l3(K6Y k6y, String str) {
        super(497, 3, false, false);
        this.A00 = k6y;
        this.A01 = str;
    }

    public final void run() {
        ActivityManager activityManager;
        K6Y k6y = this.A00;
        Context context = k6y.getContext();
        if (context != null) {
            AnonymousClass0vF r0 = K6Y.A0O;
            if (k6y.A01 != null) {
                AnonymousClass0eM r4 = k6y.A0N;
                C59953JcJ.A00(AnonymousClass7TE.A0l(r4)).A01(context, k6y.A01, (byte[]) null);
                C365128mZ.A02(context, AnonymousClass7TE.A0l(r4));
                String str = this.A01;
                if (str != null) {
                    try {
                        C365098mW.A00.A00((Rect) null, AnonymousClass7TE.A0l(r4), (C364968mJ) null, str);
                    } catch (IOException unused) {
                    } catch (NullPointerException e) {
                        0f9 AEf = 0wj.A01.AEf(K6Y.class.toString(), 817893068);
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        Object systemService = k6y.requireContext().getSystemService("activity");
                        if ((systemService instanceof ActivityManager) && (activityManager = (ActivityManager) systemService) != null) {
                            activityManager.getMemoryInfo(memoryInfo);
                        }
                        AEf.ABP("availableMemory", memoryInfo.availMem);
                        AEf.ERJ(e);
                        AEf.report();
                        throw e;
                    }
                }
            }
        }
    }
}
