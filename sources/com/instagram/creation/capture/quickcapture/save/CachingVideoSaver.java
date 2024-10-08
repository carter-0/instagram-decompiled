package com.instagram.creation.capture.quickcapture.save;

import X.0nV;
import X.0qQ;
import X.11Z;
import X.19B;
import X.19E;
import X.1Eo;
import X.AnonymousClass05K;
import X.AnonymousClass12T;
import X.AnonymousClass19S;
import X.AnonymousClass4D7;
import X.C262204Co;
import X.C262224Cq;
import X.C40831Ak1;
import X.C62320sa;
import X.C66021M8g;
import X.MV5;
import java.io.File;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

public final class CachingVideoSaver {
    public final 0nV A00;
    public final Map A01 = new LinkedHashMap();
    public final Map A02 = new LinkedHashMap();
    public final Map A03 = new LinkedHashMap();
    public final Map A04 = new LinkedHashMap();
    public final C262224Cq A05;

    public final void A01(MV5 mv5, String str, C62320sa r13, boolean z, boolean z2) {
        Runnable ak1;
        int i;
        String str2 = str;
        0qQ.A0B(str, 0);
        if (z) {
            this.A02.put(str, mv5);
        } else {
            if (this.A03.containsKey(str)) {
                ak1 = new C66021M8g(this, mv5, str);
            } else {
                this.A02.put(str, mv5);
                if (this.A04.containsKey(str)) {
                    ak1 = new C40831Ak1(mv5);
                }
            }
            11Z.A02(ak1);
            return;
        }
        Map map = this.A01;
        Number number = (Number) map.get(str);
        if (number != null) {
            i = number.intValue() + 1;
        } else {
            i = 0;
        }
        map.put(str, Integer.valueOf(i));
        Map map2 = this.A04;
        C262204Co r1 = (C262204Co) map2.get(str);
        if (r1 != null) {
            r1.AG7((CancellationException) null);
        }
        String str3 = (String) this.A03.remove(str);
        if (str3 != null && z2) {
            new File(str3).delete();
        }
        C262224Cq r2 = this.A05;
        CachingVideoSaver$renderInternal$2 cachingVideoSaver$renderInternal$2 = new CachingVideoSaver$renderInternal$2(this, str2, (AnonymousClass4D7) null, r13, i);
        map2.put(str, 1Eo.A03(AnonymousClass05K.A00, 19B.A00, cachingVideoSaver$renderInternal$2, r2));
    }

    public CachingVideoSaver() {
        0nV CO6 = AnonymousClass12T.A00.CO6(460, 3);
        AnonymousClass19S A022 = 19E.A02(CO6);
        0qQ.A0B(CO6, 1);
        0qQ.A0B(A022, 2);
        this.A00 = CO6;
        this.A05 = A022;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.9Jd, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x007f  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.instagram.creation.capture.quickcapture.save.CachingVideoSaver r7, X.MV5 r8, X.AnonymousClass4D7 r9, X.C62320sa r10) {
        /*
            r3 = 14
            boolean r0 = X.C376739Jd.A00(r3, r9)
            if (r0 == 0) goto L_0x002e
            r6 = r9
            X.9Jd r6 = (X.C376739Jd) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002e
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r6.A04
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x003c
            if (r0 != r4) goto L_0x0034
            java.lang.Object r3 = r6.A03
            X.LBC r3 = (X.LBC) r3
            java.lang.Object r1 = r6.A02
            X.2sT r1 = (X.AnonymousClass2sT) r1
            java.lang.Object r8 = r6.A01
            X.MV5 r8 = (X.MV5) r8
            goto L_0x0068
        L_0x002e:
            X.9Jd r6 = new X.9Jd
            r6.<init>(r7, r9, r3)
            goto L_0x0016
        L_0x0034:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x003c:
            X.0eS.A00(r2)
            X.AeU r1 = new X.AeU
            r1.<init>(r7)
            X.Ak2 r0 = new X.Ak2
            r0.<init>(r8)
            X.11Z.A02(r0)
            java.lang.Object r3 = r10.invoke()     // Catch:{ all -> 0x0073 }
            X.LBC r3 = (X.LBC) r3     // Catch:{ all -> 0x0073 }
            X.3Q2 r0 = r3.A06     // Catch:{ all -> 0x0073 }
            r0.A0Y(r1)     // Catch:{ all -> 0x0073 }
            X.0nV r0 = r7.A00     // Catch:{ all -> 0x0073 }
            r6.A01 = r8     // Catch:{ all -> 0x0073 }
            r6.A02 = r1     // Catch:{ all -> 0x0073 }
            r6.A03 = r3     // Catch:{ all -> 0x0073 }
            r6.A00 = r4     // Catch:{ all -> 0x0073 }
            java.lang.Object r2 = X.C394579yL.A00(r0, r3, r6)     // Catch:{ all -> 0x0073 }
            if (r2 != r5) goto L_0x006b
            return r5
        L_0x0068:
            X.0eS.A00(r2)     // Catch:{ all -> 0x0073 }
        L_0x006b:
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x0073 }
            X.3Q2 r0 = r3.A06     // Catch:{ all -> 0x0073 }
            r0.A0Z(r1)     // Catch:{ all -> 0x0073 }
            goto L_0x0079
        L_0x0073:
            r0 = move-exception
            X.0eQ r2 = new X.0eQ
            r2.<init>(r0)
        L_0x0079:
            boolean r0 = r2 instanceof X.0eQ
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x008a
            r1 = r2
            java.lang.String r1 = (java.lang.String) r1
            X.M6k r0 = new X.M6k
            r0.<init>(r8, r1)
            X.11Z.A02(r0)
        L_0x008a:
            java.lang.Throwable r1 = X.0eR.A00(r2)
            if (r1 == 0) goto L_0x0098
            X.M6l r0 = new X.M6l
            r0.<init>(r8, r1)
            X.11Z.A02(r0)
        L_0x0098:
            X.0gF r5 = X.C60340gF.A00
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.capture.quickcapture.save.CachingVideoSaver.A00(com.instagram.creation.capture.quickcapture.save.CachingVideoSaver, X.MV5, X.4D7, X.0sa):java.lang.Object");
    }
}
