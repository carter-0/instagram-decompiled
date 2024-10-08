package X;

import android.graphics.Bitmap;
import android.media.MediaMetadataRetriever;
import java.util.AbstractMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.83i  reason: invalid class name and case insensitive filesystem */
public final class C3501183i {
    public final C352698Em A00;
    public final CountDownLatch A01 = new CountDownLatch(1);
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03;
    public final AnonymousClass0eM A04;

    public C3501183i(AnonymousClass8CN r4, boolean z) {
        C352698Em r0;
        0eO r1 = 0eO.A02;
        this.A02 = AnonymousClass0eN.A00(r1, AnonymousClass8Ei.A00);
        this.A03 = AnonymousClass0eN.A00(r1, C352668Ej.A00);
        this.A04 = AnonymousClass0eN.A00(r1, C352678Ek.A00);
        if (z) {
            r0 = new AnonymousClass9ZF(r4);
        } else {
            r0 = new C352688El(r4);
        }
        C352698Em r02 = r0;
        this.A00 = r02;
        r02.CgM();
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.XUJ, java.lang.Object] */
    public final C391749ta A03(A9Y a9y, List list, 0sP r9) {
        C391749ta r1;
        A01(a9y, this);
        r9.invoke(C390959s7.EXTRACTING_BITMAP);
        Object obj = list.get(0);
        0qQ.A0C(obj, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputString");
        String str = ((AnonymousClass9ZA) obj).A00;
        Object obj2 = list.get(1);
        0qQ.A0C(obj2, "null cannot be cast to non-null type com.aiplatform.inputs.AiInputLong");
        long j = ((AnonymousClass9Z9) obj2).A00;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            mediaMetadataRetriever.setDataSource(str);
            Bitmap A002 = A00(mediaMetadataRetriever, j / 2);
            if (A002 != null) {
                r9.invoke(C390959s7.PROCESSING_BITMAP);
                r1 = A02(A002, r9);
                mediaMetadataRetriever.release();
                return r1;
            }
            mediaMetadataRetriever.release();
            return new XHE(new Object());
        } catch (Exception e) {
            StringBuilder sb = new StringBuilder();
            sb.append("Video processing failed ");
            sb.append(e);
            sb.toString();
            r1 = new XHE(new Object());
        } catch (Throwable th) {
            mediaMetadataRetriever.release();
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0011, code lost:
        if (r0 == null) goto L_0x0013;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final android.graphics.Bitmap A00(android.media.MediaMetadataRetriever r7, long r8) {
        /*
            int r2 = android.os.Build.VERSION.SDK_INT
            r1 = 0
            r0 = 30
            r3 = r7
            r4 = r8
            if (r2 < r0) goto L_0x0014
            r6 = 2
            r7 = 512(0x200, float:7.175E-43)
            r8 = r7
            android.graphics.Bitmap r0 = r3.getScaledFrameAtTime(r4, r6, r7, r8)
            if (r0 != 0) goto L_0x004a
        L_0x0013:
            return r1
        L_0x0014:
            r0 = 2
            android.graphics.Bitmap r3 = r7.getFrameAtTime(r8, r0)
            if (r3 == 0) goto L_0x0013
            int r0 = r3.getWidth()
            float r0 = (float) r0
            r2 = 1140850688(0x44000000, float:512.0)
            float r1 = r2 / r0
            int r0 = r3.getHeight()
            float r0 = (float) r0
            float r2 = r2 / r0
            android.graphics.Matrix r8 = new android.graphics.Matrix
            r8.<init>()
            r8.postScale(r1, r2)
            int r6 = r3.getWidth()
            int r7 = r3.getHeight()
            r4 = 0
            X.0fO.A03(r3)
            r5 = r4
            r9 = r4
            android.graphics.Bitmap r0 = android.graphics.Bitmap.createBitmap(r3, r4, r5, r6, r7, r8, r9)
            X.0qQ.A07(r0)
            r3.recycle()
        L_0x004a:
            android.graphics.Bitmap r2 = X.C392369uh.A00(r0)
            X.ADa r1 = X.C39879ADa.A02
            android.graphics.Bitmap$Config r0 = android.graphics.Bitmap.Config.RGB_565
            android.graphics.Bitmap r1 = r1.A00(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3501183i.A00(android.media.MediaMetadataRetriever, long):android.graphics.Bitmap");
    }

    public static final void A01(A9Y a9y, C3501183i r3) {
        for (Object next : a9y.A00) {
            if (0qQ.A0K(next, "STRINGS")) {
                ((AbstractMap) r3.A02.getValue()).clear();
            } else if (0qQ.A0K(next, "CONCEPT_SCORES")) {
                ((Map) r3.A03.getValue()).clear();
            } else {
                ((0sP) r3.A04.getValue()).invoke(next);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.XUJ, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x007e, code lost:
        r1 = new java.util.ArrayList();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final X.C391749ta A02(android.graphics.Bitmap r10, X.0sP r11) {
        /*
            r9 = this;
            java.lang.String r1 = "STRINGS"
            java.lang.String r0 = "CONCEPT_SCORES"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            X.A9Y r0 = new X.A9Y
            r0.<init>(r1)
            A01(r0, r9)
            X.8Em r3 = r9.A00     // Catch:{ Exception -> 0x010b }
            X.XH4 r0 = new X.XH4     // Catch:{ Exception -> 0x010b }
            r0.<init>(r10)     // Catch:{ Exception -> 0x010b }
            java.util.List r2 = java.util.Collections.singletonList(r0)     // Catch:{ Exception -> 0x010b }
            X.0qQ.A07(r2)     // Catch:{ Exception -> 0x010b }
            java.lang.String r1 = "XRAY"
            java.lang.String r0 = "CONCEPTS"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch:{ Exception -> 0x010b }
            java.util.List r1 = X.0sr.A1P(r0)     // Catch:{ Exception -> 0x010b }
            X.A9Y r0 = new X.A9Y     // Catch:{ Exception -> 0x010b }
            r0.<init>(r1)     // Catch:{ Exception -> 0x010b }
            X.9ta r1 = r3.E3V(r0, r2, r11)     // Catch:{ Exception -> 0x010b }
            boolean r0 = r1 instanceof X.AnonymousClass9ZE     // Catch:{ Exception -> 0x010b }
            if (r0 == 0) goto L_0x0110
            X.9ZE r1 = (X.AnonymousClass9ZE) r1     // Catch:{ Exception -> 0x010b }
            java.util.List r0 = r1.A00     // Catch:{ Exception -> 0x010b }
            java.util.Iterator r5 = r0.iterator()     // Catch:{ Exception -> 0x010b }
        L_0x0043:
            boolean r0 = r5.hasNext()     // Catch:{ Exception -> 0x010b }
            if (r0 == 0) goto L_0x0090
            java.lang.Object r1 = r5.next()     // Catch:{ Exception -> 0x010b }
            X.XSu r1 = (X.C21289XSu) r1     // Catch:{ Exception -> 0x010b }
            java.lang.String r0 = "null cannot be cast to non-null type com.aiplatform.processors.scenerecognizer.model.SceneRecognizerOutputModel"
            X.0qQ.A0C(r1, r0)     // Catch:{ Exception -> 0x010b }
            X.9ZD r1 = (X.AnonymousClass9ZD) r1     // Catch:{ Exception -> 0x010b }
            java.lang.String r4 = r1.A01     // Catch:{ Exception -> 0x010b }
            if (r4 == 0) goto L_0x0043
            java.lang.Float r3 = r1.A00     // Catch:{ Exception -> 0x010b }
            if (r3 == 0) goto L_0x0043
            X.0eM r0 = r9.A03     // Catch:{ Exception -> 0x010b }
            java.lang.Object r2 = r0.getValue()     // Catch:{ Exception -> 0x010b }
            java.util.Map r2 = (java.util.Map) r2     // Catch:{ Exception -> 0x010b }
            X.7xs r1 = r1.A03     // Catch:{ Exception -> 0x010b }
            java.lang.Object r0 = r2.get(r1)     // Catch:{ Exception -> 0x010b }
            if (r0 != 0) goto L_0x0076
            java.util.concurrent.ConcurrentHashMap r0 = new java.util.concurrent.ConcurrentHashMap     // Catch:{ Exception -> 0x010b }
            r0.<init>()     // Catch:{ Exception -> 0x010b }
            r2.put(r1, r0)     // Catch:{ Exception -> 0x010b }
        L_0x0076:
            java.util.concurrent.ConcurrentMap r0 = (java.util.concurrent.ConcurrentMap) r0     // Catch:{ Exception -> 0x010b }
            java.lang.Object r1 = r0.get(r4)     // Catch:{ Exception -> 0x010b }
            if (r1 != 0) goto L_0x008a
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ Exception -> 0x010b }
            r1.<init>()     // Catch:{ Exception -> 0x010b }
            java.lang.Object r0 = r0.putIfAbsent(r4, r1)     // Catch:{ Exception -> 0x010b }
            if (r0 == 0) goto L_0x008a
            r1 = r0
        L_0x008a:
            java.util.List r1 = (java.util.List) r1     // Catch:{ Exception -> 0x010b }
            r1.add(r3)     // Catch:{ Exception -> 0x010b }
            goto L_0x0043
        L_0x0090:
            X.0eM r0 = r9.A03     // Catch:{ Exception -> 0x010b }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x010b }
            java.util.Map r1 = (java.util.Map) r1     // Catch:{ Exception -> 0x010b }
            int r0 = r1.size()     // Catch:{ Exception -> 0x010b }
            java.util.ArrayList r7 = new java.util.ArrayList     // Catch:{ Exception -> 0x010b }
            r7.<init>(r0)     // Catch:{ Exception -> 0x010b }
            java.util.Set r0 = r1.entrySet()     // Catch:{ Exception -> 0x010b }
            java.util.Iterator r8 = r0.iterator()     // Catch:{ Exception -> 0x010b }
        L_0x00a9:
            boolean r0 = r8.hasNext()     // Catch:{ Exception -> 0x010b }
            if (r0 == 0) goto L_0x0101
            java.lang.Object r0 = r8.next()     // Catch:{ Exception -> 0x010b }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x010b }
            java.lang.Object r6 = r0.getKey()     // Catch:{ Exception -> 0x010b }
            X.7xs r6 = (X.C348097xs) r6     // Catch:{ Exception -> 0x010b }
            java.lang.Object r1 = r0.getValue()     // Catch:{ Exception -> 0x010b }
            java.util.concurrent.ConcurrentHashMap r1 = (java.util.concurrent.ConcurrentHashMap) r1     // Catch:{ Exception -> 0x010b }
            int r0 = r1.size()     // Catch:{ Exception -> 0x010b }
            java.util.ArrayList r5 = new java.util.ArrayList     // Catch:{ Exception -> 0x010b }
            r5.<init>(r0)     // Catch:{ Exception -> 0x010b }
            java.util.Set r0 = r1.entrySet()     // Catch:{ Exception -> 0x010b }
            java.util.Iterator r4 = r0.iterator()     // Catch:{ Exception -> 0x010b }
        L_0x00d2:
            boolean r0 = r4.hasNext()     // Catch:{ Exception -> 0x010b }
            if (r0 == 0) goto L_0x00fd
            java.lang.Object r0 = r4.next()     // Catch:{ Exception -> 0x010b }
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch:{ Exception -> 0x010b }
            java.lang.Object r3 = r0.getKey()     // Catch:{ Exception -> 0x010b }
            java.lang.String r3 = (java.lang.String) r3     // Catch:{ Exception -> 0x010b }
            java.lang.Object r0 = r0.getValue()     // Catch:{ Exception -> 0x010b }
            java.util.List r0 = (java.util.List) r0     // Catch:{ Exception -> 0x010b }
            double r1 = X.00k.A00(r0)     // Catch:{ Exception -> 0x010b }
            float r0 = (float) r1     // Catch:{ Exception -> 0x010b }
            java.lang.Float r2 = java.lang.Float.valueOf(r0)     // Catch:{ Exception -> 0x010b }
            r1 = 0
            X.9ZD r0 = new X.9ZD     // Catch:{ Exception -> 0x010b }
            r0.<init>(r6, r2, r3, r1)     // Catch:{ Exception -> 0x010b }
            r5.add(r0)     // Catch:{ Exception -> 0x010b }
            goto L_0x00d2
        L_0x00fd:
            r7.add(r5)     // Catch:{ Exception -> 0x010b }
            goto L_0x00a9
        L_0x0101:
            java.util.ArrayList r0 = X.0Yv.A1F(r7)     // Catch:{ Exception -> 0x010b }
            X.9ZE r1 = new X.9ZE     // Catch:{ Exception -> 0x010b }
            r1.<init>(r0)     // Catch:{ Exception -> 0x010b }
            return r1
        L_0x010b:
            X.9s7 r0 = X.C390959s7.PREDICTION_FAILED
            r11.invoke(r0)
        L_0x0110:
            X.XUJ r0 = new X.XUJ
            r0.<init>()
            X.XHE r1 = new X.XHE
            r1.<init>(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C3501183i.A02(android.graphics.Bitmap, X.0sP):X.9ta");
    }
}
