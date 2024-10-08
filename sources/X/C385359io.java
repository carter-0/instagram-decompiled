package X;

import com.facebook.cameracore.mediapipeline.arclass.benchmark.implementation.instagram.InstagramARClassBenchmark;
import com.facebook.react.modules.intent.IntentModule;
import java.lang.reflect.InvocationTargetException;

/* renamed from: X.9io  reason: invalid class name and case insensitive filesystem */
public final class C385359io extends 1P0 {
    public final /* synthetic */ long A00;
    public final /* synthetic */ InstagramARClassBenchmark A01;
    public final /* synthetic */ Object A02;

    public C385359io(InstagramARClassBenchmark instagramARClassBenchmark, Object obj, long j) {
        this.A01 = instagramARClassBenchmark;
        this.A00 = j;
        this.A02 = obj;
    }

    public final void onFail(C268654dm r3) {
        int A03 = AnonymousClass0fD.A03(-1577634211);
        C385359io.super.onFail(r3);
        AnonymousClass0fD.A0A(-366256476, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        Object obj2;
        int A03 = AnonymousClass0fD.A03(-1061519482);
        AnonymousClass3JC r8 = (AnonymousClass3JC) obj;
        int A032 = AnonymousClass0fD.A03(1056526515);
        if (r8 == null || (obj2 = r8.A01) == null) {
            i = 1813625094;
        } else {
            AnonymousClass3FZ r3 = (AnonymousClass3FZ) obj2;
            Class<C381269bS> cls = C381269bS.class;
            if (r3.A00(cls, "arclass_benchmark_count") == null || ((long) r3.A00(cls, "arclass_benchmark_count").A00.optInt(IntentModule.EXTRA_MAP_KEY_FOR_VALUE)) < this.A00) {
                try {
                    Object obj3 = this.A02;
                    obj3.getClass().getMethod("startBenchmarks", new Class[0]).invoke(obj3, new Object[0]);
                } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    this.A01.A02.Ew2("InstagramARClassBenchmark", "AR Class benchmark invoke failed.", e);
                }
            }
            i = 284250860;
        }
        AnonymousClass0fD.A0A(i, A032);
        AnonymousClass0fD.A0A(-899709615, A03);
    }
}
