package X;

import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark;
import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.ASw  reason: case insensitive filesystem */
public final /* synthetic */ class C40131ASw implements AnonymousClass2Kv {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InstagramARClassBenchmark A01;
    public final /* synthetic */ Object A02;

    public /* synthetic */ C40131ASw(InstagramARClassBenchmark instagramARClassBenchmark, Object obj, long j) {
        this.A01 = instagramARClassBenchmark;
        this.A00 = j;
        this.A02 = obj;
    }

    public final void invoke(AnonymousClass3JD r11) {
        Object Bny;
        InstagramARClassBenchmark instagramARClassBenchmark = this.A01;
        long j = this.A00;
        Object obj = this.A02;
        if (r11 != null && (Bny = r11.Bny()) != null) {
            C250663lr r9 = (C250663lr) Bny;
            Class<C382889eg> cls = C382889eg.class;
            if (r9.getOptionalTreeField(0, "xfb_arclass_benchmark_count(benchmark_version:$benchmark_version)", cls, -252052557) == null || ((long) r9.getOptionalTreeField(0, "xfb_arclass_benchmark_count(benchmark_version:$benchmark_version)", cls, -252052557).getCoercedIntField(0, IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) < j) {
                try {
                    obj.getClass().getMethod("startBenchmarks", new Class[0]).invoke(obj, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    instagramARClassBenchmark.A02.Ew2("InstagramARClassBenchmark", "AR Class benchmark invoke failed.", e);
                }
            }
        }
    }
}
