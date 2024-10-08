package X;

import android.content.Context;
import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark;
import com.facebook.cameracore.mediapipeline.services.analyticslogger.interfaces.AnalyticsLogger;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.instagram.common.session.UserSession;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.concurrent.Executor;

/* renamed from: X.8nB  reason: invalid class name and case insensitive filesystem */
public final class C365478nB implements AnonymousClass83x {
    public final /* synthetic */ double A00;
    public final /* synthetic */ long A01;
    public final /* synthetic */ InstagramARClassBenchmark A02;

    public C365478nB(InstagramARClassBenchmark instagramARClassBenchmark, double d, long j) {
        this.A02 = instagramARClassBenchmark;
        this.A00 = d;
        this.A01 = j;
    }

    public final void DEf(boolean z, Throwable th) {
        this.A02.A02.Ew2("InstagramARClassBenchmark", "AR Class benchmark lib download failed.", th);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        try {
            int i = 0;
            Constructor<?> constructor = Class.forName("com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.base.ARClassBenchmark").getConstructor(new Class[]{Executor.class, AnalyticsLogger.class, Context.class, Float.TYPE, B0U.class});
            InstagramARClassBenchmark instagramARClassBenchmark = this.A02;
            Object newInstance = constructor.newInstance(new Object[]{instagramARClassBenchmark.A04, instagramARClassBenchmark.A01, instagramARClassBenchmark.A00, Float.valueOf((float) this.A00), null});
            Integer num = (Integer) newInstance.getClass().getMethod("getBenchmarkVersion", new Class[0]).invoke(newInstance, new Object[0]);
            if (num != null) {
                i = num.intValue();
            }
            Integer valueOf = Integer.valueOf(i);
            long j = this.A01;
            UserSession userSession = instagramARClassBenchmark.A03;
            if (182.A06(0Tu.A05, userSession, 36314485362199146L)) {
                2IS r10 = new 2IS();
                2IS r9 = new 2IS();
                String num2 = Integer.toString(valueOf.intValue());
                r10.A04("benchmark_version", num2);
                boolean z = false;
                if (num2 != null) {
                    z = true;
                }
                17k.A0E(z);
                AnonymousClass2IY r2 = PandoGraphQLRequest.Companion;
                PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(AnonymousClass1vS.A00(), "ARClassBenchmarkCountQuery", r10.getParamsCopy(), r9.getParamsCopy(), C382899eh.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_arclass_benchmark_count", new ArrayList());
                1vm.A01(userSession).ATL(new ASW(), new C40131ASw(instagramARClassBenchmark, newInstance, j), pandoGraphQLRequest);
                return;
            }
            2IS r11 = new 2IS();
            String num3 = Integer.toString(valueOf.intValue());
            r11.A04("benchmark_version", num3);
            boolean z2 = false;
            if (num3 != null) {
                z2 = true;
            }
            17k.A0E(z2);
            C239113Fa r22 = new C239113Fa(r11, C381279bT.class, "ARClassBenchmarkCountQuery", false);
            C239123Fb A012 = C46479Dfi.A01(userSession);
            A012.A08(r22);
            1OC A07 = A012.A07(AnonymousClass05K.A00);
            A07.A00 = new C385359io(instagramARClassBenchmark, newInstance, j);
            1ES.A05(A07, 813, 3, false, false);
        } catch (Exception e) {
            this.A02.A02.Ew2("InstagramARClassBenchmark", "AR Class benchmark instance creation failed.", e);
        }
    }
}
