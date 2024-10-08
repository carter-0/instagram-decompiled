package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.facebook.quicklog.LightweightQuickPerformanceLogger;
import com.instagram.igsignals.core.IgSignalsModelPrediction;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

/* renamed from: X.LsL  reason: case insensitive filesystem */
public abstract class C65380LsL implements AnonymousClass566 {
    public AnonymousClass565 A00;
    public List A01;
    public final double A02;
    public final long A03;
    public final String A04;
    public final List A05;
    public final Map A06 = AnonymousClass7TE.A1H();
    public final Map A07 = AnonymousClass7TE.A1H();
    public final ReentrantLock A08 = new ReentrantLock();

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x007b  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0080  */
    /* JADX WARNING: Removed duplicated region for block: B:39:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EJc(X.LDU r8) {
        /*
            r7 = this;
            r5 = 0
            X.Kov r3 = r8.A03
            if (r3 != 0) goto L_0x002f
            X.565 r0 = r7.A00
            if (r0 == 0) goto L_0x0088
            X.Kov r3 = r0.A01
            if (r3 != 0) goto L_0x002f
            r0 = 1318(0x526, float:1.847E-42)
            java.lang.String r1 = X.C273654mx.A00(r0)
            X.3uA[] r0 = com.instagram.igsignals.core.IgSignalsModelPrediction.A07
            r3 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = new com.instagram.igsignals.core.IgSignalsModelPrediction
            r0.<init>(r1, r2, r3, r5)
            r8.A00(r0)
            java.lang.String r1 = "IgSignals"
            r0 = 1317(0x525, float:1.846E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.0wb.A03(r1, r0)
        L_0x002e:
            return
        L_0x002f:
            X.Vzm r0 = r3.A00()
            java.lang.String r2 = r0.A00()
            java.util.concurrent.locks.ReentrantLock r6 = r7.A08
            r6.lock()
            java.util.Map r1 = r7.A07     // Catch:{ all -> 0x0098 }
            java.lang.Object r5 = r1.get(r2)     // Catch:{ all -> 0x0098 }
            if (r5 != 0) goto L_0x0050
            X.565 r0 = r7.A00     // Catch:{ all -> 0x0098 }
            if (r0 == 0) goto L_0x0090
            X.KSb r5 = new X.KSb     // Catch:{ all -> 0x0098 }
            r5.<init>(r7, r0, r3)     // Catch:{ all -> 0x0098 }
            r1.put(r2, r5)     // Catch:{ all -> 0x0098 }
        L_0x0050:
            X.KSb r5 = (X.C61930KSb) r5     // Catch:{ all -> 0x0098 }
            r6.unlock()
            r0 = 7
            X.MPB r4 = new X.MPB
            r4.<init>((int) r0, (java.lang.Object) r8, (java.lang.Object) r7)
            r3 = 1
            java.util.concurrent.locks.ReentrantLock r6 = r5.A03
            r6.lock()
            com.instagram.igsignals.core.IgSignalsModelPrediction r0 = r5.A00     // Catch:{ all -> 0x0098 }
            r2 = 1
            r1 = 0
            if (r0 != 0) goto L_0x0075
            java.util.List r0 = r5.A02     // Catch:{ all -> 0x0098 }
            r0.add(r8)     // Catch:{ all -> 0x0098 }
            boolean r0 = r5.A01     // Catch:{ all -> 0x0098 }
            if (r0 != 0) goto L_0x0074
            r5.A01 = r3     // Catch:{ all -> 0x0098 }
            r0 = r1
            goto L_0x0076
        L_0x0074:
            r0 = r1
        L_0x0075:
            r2 = 0
        L_0x0076:
            r6.unlock()
            if (r0 == 0) goto L_0x007e
            r8.A00(r0)
        L_0x007e:
            if (r2 == 0) goto L_0x002e
            r5.A00 = r4
            X.566 r0 = r5.A02
            r0.EJc(r5)
            return
        L_0x0088:
            X.JTO.A1K()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0090:
            X.JTO.A1K()     // Catch:{ all -> 0x0098 }
            X.00P r0 = X.AnonymousClass00P.createAndThrow()     // Catch:{ all -> 0x0098 }
            throw r0     // Catch:{ all -> 0x0098 }
        L_0x0098:
            r0 = move-exception
            r6.unlock()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65380LsL.EJc(X.LDU):void");
    }

    public static final void A00(C65380LsL lsL, IgSignalsModelPrediction igSignalsModelPrediction, 0sP r21) {
        short s;
        IgSignalsModelPrediction igSignalsModelPrediction2 = igSignalsModelPrediction;
        if (igSignalsModelPrediction2.A01 >= 0 && igSignalsModelPrediction2.A00 >= 0) {
            C65380LsL lsL2 = lsL;
            if (lsL2.A00 != null) {
                C63948LEq lEq = new C63948LEq(C51965G9l.A0l());
                long j = igSignalsModelPrediction2.A01;
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger = lEq.A01;
                int i = lEq.A00;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                lightweightQuickPerformanceLogger.markerStartWithCancelPolicy(873412642, false, i, j, timeUnit);
                LightweightQuickPerformanceLogger lightweightQuickPerformanceLogger2 = lightweightQuickPerformanceLogger;
                int i2 = i;
                TimeUnit timeUnit2 = timeUnit;
                lightweightQuickPerformanceLogger2.markerPoint(873412642, i2, Pxd.A00(842), igSignalsModelPrediction2.A01, timeUnit2);
                lightweightQuickPerformanceLogger2.markerPoint(873412642, i2, Pxd.A00(259), igSignalsModelPrediction2.A00, timeUnit2);
                C18751Vzm vzm = igSignalsModelPrediction2.A02;
                if (vzm != null) {
                    lEq.A01("model_name", vzm.A01);
                    lightweightQuickPerformanceLogger2.markerAnnotate(873412642, i2, Pxd.A00(90), vzm.A00);
                    lEq.A01("predictor_type", vzm.A02);
                }
                lEq.A00("result_value", igSignalsModelPrediction2.A03);
                lEq.A00("schema_version", lsL2.A02);
                AnonymousClass565 r0 = lsL2.A00;
                if (r0 != null) {
                    AnonymousClass561 r02 = r0.A02;
                    String str = r02.A01;
                    String str2 = r02.A00;
                    lEq.A01(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, str);
                    lEq.A01("identifier", str2);
                    r21.invoke(lEq);
                    boolean z = igSignalsModelPrediction2.A06;
                    long j2 = igSignalsModelPrediction2.A00;
                    if (z) {
                        s = 2;
                    } else {
                        String str3 = igSignalsModelPrediction2.A04;
                        if (str3 != null) {
                            lightweightQuickPerformanceLogger.markerAnnotate(873412642, TraceFieldType.FailureReason, str3);
                        }
                        s = 3;
                    }
                    lightweightQuickPerformanceLogger.markerEnd(873412642, i, s, j2, timeUnit);
                    return;
                }
            }
            JTO.A1K();
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void A01(List list) {
        ReentrantLock reentrantLock = this.A08;
        reentrantLock.lock();
        try {
            if (this.A01 == null) {
                this.A01 = list;
                Iterator A0v = AnonymousClass7TF.A0v(this.A06);
                while (A0v.hasNext()) {
                    A00(this, (IgSignalsModelPrediction) A0v.next(), MPA.A00(list, 6));
                }
                AnonymousClass565 r3 = this.A00;
                if (r3 != null) {
                    AnonymousClass561 r0 = r3.A02;
                    C63718L4c l4c = new C63718L4c(r0.A01, r0.A00);
                    for (MSQ AIG : r3.A03) {
                        AIG.AIG(this, l4c, list);
                    }
                } else {
                    JTO.A1K();
                    throw AnonymousClass00P.createAndThrow();
                }
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public C65380LsL(String str, List list, double d, long j) {
        this.A04 = str;
        this.A02 = d;
        this.A05 = list;
        this.A03 = j;
    }
}
