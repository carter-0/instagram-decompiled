package X;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import com.facebook.video.heroplayer.service.ServiceEventCallbackImpl;
import com.facebook.video.heroplayer.setting.HeroPlayerSetting;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: X.4Ok  reason: invalid class name and case insensitive filesystem */
public final class C264054Ok implements Runnable {
    public final /* synthetic */ AnonymousClass4OI A00;
    public final /* synthetic */ AnonymousClass4OS A01;

    public C264054Ok(AnonymousClass4OI r1, AnonymousClass4OS r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    /* JADX WARNING: type inference failed for: r0v4, types: [java.lang.Object, X.4Or] */
    /* JADX WARNING: type inference failed for: r1v1, types: [X.3wx, java.lang.Object] */
    public final void run() {
        AnonymousClass4OS r4 = this.A01;
        AnonymousClass4OI r3 = this.A00;
        AnonymousClass4OS.A0E(r4, "Create new ExoPlayer", new Object[0]);
        HeroPlayerSetting heroPlayerSetting = r4.A0w;
        1xV r19 = heroPlayerSetting.A14;
        C264104Op r9 = new C264104Op();
        C264114Oq r8 = new C264114Oq(r9);
        r4.A0N = new Object();
        String str = r3.A0K.A0G;
        AtomicReference atomicReference = r4.A0b;
        28T r7 = r4.A0t;
        ServiceEventCallbackImpl serviceEventCallbackImpl = new ServiceEventCallbackImpl(r7.A02, str, atomicReference);
        HashMap hashMap = new HashMap();
        String str2 = r3.A07;
        if (str2 != null && !str2.isEmpty()) {
            hashMap.put(Py0.A01(21, 10, 30), 002.A0g(str2, "_", Long.toString(SystemClock.elapsedRealtime())));
        }
        if (str != null) {
            hashMap.put("asset_id", str);
        }
        ? obj = new Object();
        r4.A0M = obj;
        C264184Ox r12 = new C264184Ox(r4.A0G, serviceEventCallbackImpl, obj, r3, r7, heroPlayerSetting);
        r4.A0Q = r12;
        Context context = r4.A0F;
        Handler handler = r4.A0H;
        29t r29 = r4.A0L;
        AtomicBoolean atomicBoolean = r4.A10;
        AtomicBoolean atomicBoolean2 = r4.A0x;
        AtomicBoolean atomicBoolean3 = r4.A0y;
        C264004Oe r122 = r4.A0u;
        C264124Or r5 = r4.A0N;
        AtomicBoolean atomicBoolean4 = atomicBoolean;
        AtomicBoolean atomicBoolean5 = atomicBoolean2;
        AtomicBoolean atomicBoolean6 = atomicBoolean3;
        AtomicReference atomicReference2 = atomicReference;
        1xV r23 = r19;
        Map map = r4.A0a;
        C264004Oe r192 = r122;
        Context context2 = context;
        Handler handler2 = handler;
        29t r13 = r29;
        C257163wx r14 = r4.A0M;
        r4.A19 = new AnonymousClass4P4(context2, handler2, r13, r14, r5, r8, r3, r7, r192, r4, r12, serviceEventCallbackImpl, r23, map, atomicBoolean4, atomicBoolean5, atomicBoolean6, atomicReference2);
        r4.A0O = new AnonymousClass4SE(r4);
        AnonymousClass4P4 r10 = r4.A19;
        AnonymousClass4SE r6 = r4.A0O;
        List list = r10.A0R;
        if (list.isEmpty()) {
            AnonymousClass4SF r1 = new AnonymousClass4SF(r10);
            r10.A06 = r1;
            r10.A0A.A8z(r1);
        }
        list.add(r6);
        AnonymousClass4P4 r62 = r4.A19;
        r4.A18 = new AnonymousClass4SG(r4.A0M, r9, r8, r4.A0s, r3, r7, r4.A0v, r4.A0Q, r62, heroPlayerSetting);
        r4.A18.A0F = r4.A19.A07.Af6();
        C264184Ox r15 = r4.A0Q;
        if (r15 != null) {
            r15.A04 = r4.A19.A07.Af6();
        }
        r4.A17 = new AnonymousClass4SO(r3, r4.A19, heroPlayerSetting);
    }
}
