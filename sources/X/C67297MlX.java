package X;

import android.content.Context;
import com.facebook.quicklog.QuickPerformanceLogger;
import com.facebook.quicklog.QuickPerformanceLoggerProvider;
import com.facebook.react.modules.dialog.DialogModule;

/* renamed from: X.MlX  reason: case insensitive filesystem */
public final class C67297MlX {
    public Context A00;
    public AnonymousClass45J A01 = ((AnonymousClass3RX) AnonymousClass3RD.A00).A02().A00(this.A00, 002.A0R("rti.mqtt.", "token_store"));
    public final QuickPerformanceLogger A02;
    public final C241903Rv A03;
    public final 0lg A04;

    public C67297MlX(Context context, 0lg r6) {
        0qQ.A0B(r6, 2);
        this.A00 = context;
        this.A03 = new C241903Rv(context, (Boolean) null);
        this.A04 = r6;
        this.A02 = QuickPerformanceLoggerProvider.getQPLInstance();
    }

    public static final void A00(String str, String str2, Throwable th) {
        0f9 AEf = 0wj.A01.AEf("FbnsPushNotificationProcessor", 875300320);
        AEf.ABQ("category", str);
        AEf.ABQ(DialogModule.KEY_MESSAGE, str2);
        AEf.ERJ(th);
        AEf.report();
    }
}
