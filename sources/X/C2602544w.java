package X;

import android.content.Context;
import com.facebook.msys.mci.AuthDataStorage;
import com.facebook.msys.mci.Execution;
import com.facebook.msys.mci.JsonSerialization;
import com.facebook.msys.mci.Proxies;
import com.instagram.distribgw.client.DGWClientHolder;
import com.instagram.realtimeclient.MqttClientSelector$1;
import java.util.concurrent.Executor;

/* renamed from: X.44w  reason: invalid class name and case insensitive filesystem */
public final class C2602544w implements Runnable {
    public final /* synthetic */ C2602044r A00;
    public final /* synthetic */ 26B A01;

    public C2602544w(C2602044r r1, 26B r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void run() {
        26B r2 = this.A01;
        C2602044r r3 = this.A00;
        r2.A00 = r3;
        try {
            r3.A00.run();
            MqttClientSelector$1 mqttClientSelector$1 = r2.A0B;
            Context context = r3.A04;
            Integer msysThreadPriority = mqttClientSelector$1.getMsysThreadPriority(context);
            Execution.initialize(msysThreadPriority, (Executor) null);
            if (msysThreadPriority != null) {
                Execution.setThreadPriorities(msysThreadPriority);
            }
            JsonSerialization.initialize();
            AuthDataStorage.initialize(context);
            Proxies.configure(mqttClientSelector$1.getProxyProvider(context));
        } catch (IllegalStateException unused) {
        }
        C2596242k r0 = (C2596242k) r2.A03;
        String str = r0.mMqttConnectionConfig;
        0qQ.A07(str);
        String str2 = r0.mPreferredTier;
        0qQ.A07(str2);
        String str3 = r0.mPreferredSandbox;
        0qQ.A07(str3);
        Context context2 = r3.A04;
        DGWClientHolder dGWClientHolder = r2.A0A;
        AnonymousClass450 r32 = new AnonymousClass450(context2, new AnonymousClass4Uw(r3, r2), r2.A08, r2.A09, dGWClientHolder, str, str2, str3, r2.A0C);
        r2.A02 = r32;
        synchronized (r32) {
            AnonymousClass459 r02 = r32.A04;
            r32.A03(r02);
            r02.A00();
            r32.A03(new AnonymousClass45K(r32.A02));
            r32.A01();
        }
    }
}
