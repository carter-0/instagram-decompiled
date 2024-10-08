package X;

import android.content.Context;
import android.util.LruCache;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.facebook.react.modules.intent.IntentModule;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.3hx  reason: invalid class name and case insensitive filesystem */
public final class C248433hx extends 0vM {
    public final /* synthetic */ 2Lk A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C248433hx(2Lk r7) {
        super("initDeviceStorageMonitors", 394, 5, false, false);
        this.A00 = r7;
    }

    /* JADX WARNING: type inference failed for: r0v32, types: [java.lang.Object, X.Nsm] */
    public final void loggedRun() {
        AnonymousClass4CF r4;
        ArrayList arrayList;
        C292835jb r9;
        1Ld r8;
        2Lk r1 = this.A00;
        CallerContext callerContext = 2Lk.A08;
        Context context = r1.A01;
        UserSession userSession = r1.A04;
        0qQ.A0B(userSession, 1);
        0Tu r3 = 0Tu.A05;
        if (182.A06(r3, userSession, 36310774506848530L)) {
            AnonymousClass9D4 r5 = AnonymousClass9D3.A03;
            if (context != null) {
                synchronized (r5) {
                    if (AnonymousClass9D3.A02 == null) {
                        synchronized (AnonymousClass9D3.class) {
                            if (AnonymousClass9D3.A02 == null) {
                                Context applicationContext = context.getApplicationContext();
                                0qQ.A07(applicationContext);
                                AnonymousClass9D3 r12 = new AnonymousClass9D3(applicationContext, userSession);
                                AnonymousClass9D3.A02 = r12;
                                14i r0 = 14i.A08;
                                14i.A03(15Y.A03, r12);
                            }
                        }
                    }
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        if (0JN.A01().A09()) {
            02m r02 = 02m.A0p;
            synchronized (C292835jb.class) {
                C292835jb r13 = new C292835jb(r02);
                C292835jb.A0A = r13;
                14i.A08.A0A(r13);
                if (!14i.A08()) {
                    C292835jb.A0A.A00();
                }
                r9 = C292835jb.A0A;
            }
            0qQ.A07(r9);
            r9.A01 = 182.A01(r3, userSession, 36595616738052296L);
            02m r03 = 02m.A0p;
            synchronized (1Ld.class) {
                r8 = new 1Ld(r03);
                1Ld.A07 = r8;
            }
            C69641NpO.A00 = r8;
            try {
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = r9.A05;
                lightweightQuickPerformanceLogger.markerStart(43253762);
                Map map = r9.A07;
                synchronized (map) {
                    map.put(r8, 1);
                }
                lightweightQuickPerformanceLogger.markerEnd(43253762, 2);
                ? obj = new Object();
                1Ld r14 = C69641NpO.A00;
                if (r14 != null) {
                    r14.A00 = obj;
                    r14.EBY(1NK.A00());
                    1Ld r15 = C69641NpO.A00;
                    if (r15 != null) {
                        WGW.A00 = userSession;
                        r15.EBY(WGW.A01);
                        1Ld r16 = C69641NpO.A00;
                        if (r16 != null) {
                            r16.EBY(Sm3.A00);
                            1Ld r17 = C69641NpO.A00;
                            if (r17 != null) {
                                r17.EBY(28K.A00(userSession).A03);
                            }
                        }
                    }
                }
                0qQ.A0F("diskTrimmableManager");
                throw AnonymousClass00P.createAndThrow();
            } catch (Throwable th) {
                r9.A05.markerEnd(43253762, 2);
                throw th;
            }
        }
        if (182.A06(r3, userSession, 36311959917888335L)) {
            if (AnonymousClass4CE.A05 == null) {
                AnonymousClass4CE r18 = new AnonymousClass4CE(1B5.A00());
                AnonymousClass4CE.A05 = r18;
                14i.A08.A0A(r18);
            }
            synchronized (AnonymousClass4CF.class) {
                r4 = AnonymousClass4CF.A02;
                if (r4 == null) {
                    r4 = new AnonymousClass4CF();
                    AnonymousClass4CF.A02 = r4;
                }
            }
            0wc A01 = AnonymousClass0kN.A01(new AnonymousClass9D8(), userSession);
            synchronized (r4) {
                r4.A00 = A01;
                LruCache lruCache = r4.A01;
                arrayList = new ArrayList(lruCache.snapshot().values());
                lruCache.evictAll();
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AnonymousClass4CF.A00(A01, (C18590Vuh) it.next());
            }
        }
        AnonymousClass1F7 A002 = AnonymousClass1F7.A00();
        0qQ.A07(A002);
        0tS A003 = 0tS.A4E.A00();
        A002.A00.A04("dev_media_store_external_files", A003.A1x.CDM(A003, 0tS.A4G[179]), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
    }
}
