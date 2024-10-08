package X;

import android.content.Context;
import android.util.Log;
import exoplayer2.av1.src.Dav1dDecoder;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.AlX  reason: case insensitive filesystem */
public final /* synthetic */ class C40925AlX implements Runnable {
    public final /* synthetic */ Dav1dDecoder A00;

    public /* synthetic */ C40925AlX(Dav1dDecoder dav1dDecoder) {
        this.A00 = dav1dDecoder;
    }

    /* JADX WARNING: type inference failed for: r0v32, types: [X.157, java.lang.Object, X.15L] */
    public final void run() {
        Context context = this.A00.mDav1dMediaCodecAdapterSetting.appContext;
        Context context2 = Dav1dDecoder.sAppContext;
        if (context2 == null) {
            Dav1dDecoder.sAppContext = context;
            context2 = context;
        }
        String A002 = C273654mx.A00(1228);
        if (Dav1dDecoder.sThreadAffinityBoostBuilder == null) {
            ? obj = new Object();
            Dav1dDecoder.sThreadAffinityBoostBuilder = obj;
            obj.A04(context2);
        }
        if (Dav1dDecoder.sAppContext != null && Dav1dDecoder.sThreadAffinityBoostBuilder != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            HashMap A01 = OWz.A01();
            if (A01 != null) {
                Iterator A0s = AnonymousClass7TF.A0s(A01);
                while (A0s.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0s);
                    if (((String) A1J.getValue()).contains("dav1d-worker")) {
                        try {
                            AnonymousClass7TF.A1M(A1C, Integer.parseInt((String) A1J.getKey()));
                        } catch (NumberFormatException e) {
                            Log.w(A002, String.format("Failed to parse thread id due to exception %s", new Object[]{e.getMessage()}));
                        }
                    }
                }
            }
            Iterator it = A1C.iterator();
            while (it.hasNext()) {
                Integer num = (Integer) it.next();
                AnonymousClass15J r6 = new AnonymousClass15J();
                r6.A00 = 90000;
                String obj2 = num.toString();
                Map map = r6.A04;
                if (map == null) {
                    map = AnonymousClass7TE.A1E();
                    r6.A04 = map;
                }
                map.put("threadId", obj2);
                try {
                    if (Dav1dDecoder.sThreadAffinityBoostBuilder.A01(r6, 0).EHM((Integer) null, 0) != 1) {
                        Log.w(A002, String.format("Attempt boost the thread affinity for tid %d did not result in success", new Object[]{num}));
                    }
                } catch (Exception e2) {
                    Log.w(A002, String.format("Could not boost the thread affinity for tid %d due to exception e", new Object[]{num, e2.getMessage()}));
                }
            }
        }
    }
}
