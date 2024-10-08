package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.EventBuilder;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: X.QbY  reason: case insensitive filesystem */
public final class C7850QbY extends 2SM {
    public static final AtomicInteger A01 = Pxf.A10();
    public final LightweightQuickPerformanceLogger A00;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C7850QbY(com.facebook.quicklog.LightweightQuickPerformanceLogger r3, X.RF5 r4) {
        /*
            r2 = this;
            r0 = 1
            X.0qQ.A0B(r3, r0)
            java.lang.String[] r1 = r4.A00
            int r0 = r1.length
            java.lang.Object[] r0 = java.util.Arrays.copyOf(r1, r0)
            java.lang.String[] r0 = (java.lang.String[]) r0
            r2.<init>(r0)
            r2.A00 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C7850QbY.<init>(com.facebook.quicklog.LightweightQuickPerformanceLogger, X.RF5):void");
    }

    public final C11018S5p A01(String str) {
        C8912RFf A002 = C9868Rih.A00(str);
        if (A002 == null) {
            return null;
        }
        int andIncrement = A01.getAndIncrement();
        LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
        int i = A002.A00;
        lightweightQuickPerformanceLogger.markerStart(i, andIncrement, -1, TimeUnit.MILLISECONDS);
        if (lightweightQuickPerformanceLogger.isMarkerOn(i, andIncrement, false)) {
            return new C11018S5p(A002, andIncrement);
        }
        return null;
    }

    public final void A00(PzN pzN) {
        C8912RFf A002;
        if ((pzN instanceof PzP) && (A002 = C9868Rih.A00(pzN.A02)) != null) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            int i = A002.A00;
            Object obj = "unknown";
            Map map = pzN.A03;
            Object obj2 = map.get(PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            if (obj2 != null) {
                obj = obj2;
            }
            EventBuilder markEventBuilder = lightweightQuickPerformanceLogger.markEventBuilder(i, (String) obj);
            String[] strArr = A002.A01;
            int length = strArr.length;
            int i2 = 0;
            if (length == 0) {
                Iterator A0u = AnonymousClass7TF.A0u(map);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    markEventBuilder.annotate(DbT.A13(A1J), String.valueOf(A1J.getValue()));
                }
            } else {
                do {
                    String str = strArr[i2];
                    markEventBuilder.annotate(str, Pxf.A0j(str, map));
                    i2++;
                } while (i2 < length);
            }
            markEventBuilder.annotate("thread", pzN.A01);
            markEventBuilder.report();
        }
    }

    public final /* bridge */ /* synthetic */ void A02(C7846QbU qbU, Object obj) {
        C11018S5p s5p = (C11018S5p) obj;
        if (s5p != null) {
            LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = this.A00;
            C8912RFf rFf = s5p.A01;
            int i = rFf.A00;
            int i2 = s5p.A00;
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "thread", qbU.A01);
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, TraceFieldType.Duration, TimeUnit.NANOSECONDS.toMillis(qbU.A00));
            String[] strArr = rFf.A01;
            int length = strArr.length;
            int i3 = 0;
            if (length == 0) {
                Iterator A0u = AnonymousClass7TF.A0u(qbU.A03);
                while (A0u.hasNext()) {
                    Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, DbT.A13(A1J), String.valueOf(A1J.getValue()));
                }
            } else {
                do {
                    String str = strArr[i3];
                    lightweightQuickPerformanceLogger.markerAnnotate(i, i2, str, Pxf.A0j(str, qbU.A03));
                    i3++;
                } while (i3 < length);
            }
            lightweightQuickPerformanceLogger.markerAnnotate(i, i2, "asl_session_id", 0LA.A01());
            lightweightQuickPerformanceLogger.markerEnd(i, i2, 2);
        }
    }
}
