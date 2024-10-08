package X;

import android.os.Handler;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SVv  reason: case insensitive filesystem */
public final class C11457SVv implements Handler.Callback {
    public final int A00;
    public final Object A01;

    public C11457SVv(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:143:0x0361, code lost:
        r0.sendToTarget();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x0403, code lost:
        X.SNJ.A00(r3, r0, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:235:?, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:237:?, code lost:
        return false;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r23) {
        /*
            r22 = this;
            r11 = r22
            int r0 = r11.A00
            r5 = r23
            switch(r0) {
                case 0: goto L_0x0452;
                case 1: goto L_0x002c;
                case 2: goto L_0x0089;
                default: goto L_0x0009;
            }
        L_0x0009:
            int r1 = r5.what
            r2 = 0
            r0 = 1
            if (r1 != r0) goto L_0x002a
            java.lang.Object r1 = r5.obj
            r1.getClass()
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            r3 = r1[r2]
            X.Rpq r3 = (X.C10292Rpq) r3
            r0 = 2
            r0 = r1[r0]
            long r1 = X.AnonymousClass7TE.A0R(r0)
            X.STU r0 = r3.A00
            X.TgP r0 = r0.A06
            if (r0 == 0) goto L_0x002a
            r0.DXb(r1)
        L_0x002a:
            r0 = 0
            return r0
        L_0x002c:
            r4 = 0
            X.0qQ.A0B(r5, r4)
            int r2 = r5.what
            r1 = 1
            if (r2 == r1) goto L_0x0060
            r0 = 2
            if (r2 != r0) goto L_0x002a
            java.lang.Object r3 = r11.A01
            X.OYs r3 = (X.C71017OYs) r3
            X.OUV r2 = r3.A07
            java.lang.Object[] r1 = new java.lang.Object[r4]
            java.lang.String r0 = "onScoTimedOut"
            r2.A00(r0, r1)
            X.Pus r2 = r3.A06
            java.lang.String r1 = "attempts="
            int r0 = r3.A00
            java.lang.String r1 = X.002.A0O(r1, r0)
            java.lang.String r0 = "sco timeout"
            r2.CmO(r0, r1)
            android.os.Handler r1 = r3.A03
            r0 = 0
            r1.removeCallbacksAndMessages(r0)
            X.C71017OYs.A01(r3, r4)
            goto L_0x002a
        L_0x0060:
            java.lang.Object r3 = r11.A01
            X.OYs r3 = (X.C71017OYs) r3
            X.OZz r0 = r3.A05
            r0.A04(r1)
            int r0 = r3.A00
            int r1 = r0 + 1
            r3.A00 = r1
            X.OUV r2 = r3.A07
            java.lang.String r0 = "startScoAudio attempt #"
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.Object[] r0 = new java.lang.Object[r4]
            r2.A00(r1, r0)
            android.os.Handler r3 = r3.A03
            r2 = 2
            r3.removeMessages(r2)
            r0 = 4000(0xfa0, double:1.9763E-320)
            r3.sendEmptyMessageDelayed(r2, r0)
            goto L_0x002a
        L_0x0089:
            java.lang.Object r0 = r11.A01     // Catch:{ all -> 0x0448 }
            X.STM r0 = (X.STM) r0     // Catch:{ all -> 0x0448 }
            int r1 = r5.what     // Catch:{ all -> 0x0448 }
            switch(r1) {
                case 1: goto L_0x01a0;
                case 2: goto L_0x01c0;
                case 3: goto L_0x0366;
                case 4: goto L_0x0093;
                case 5: goto L_0x010d;
                case 6: goto L_0x0432;
                case 7: goto L_0x0112;
                case 8: goto L_0x011b;
                case 9: goto L_0x012e;
                default: goto L_0x0092;
            }     // Catch:{ all -> 0x0448 }
        L_0x0092:
            goto L_0x002a
        L_0x0093:
            java.lang.Object r1 = r5.obj     // Catch:{ all -> 0x0448 }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ all -> 0x0448 }
            long r7 = r1.longValue()     // Catch:{ all -> 0x0448 }
            long r5 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0448 }
            r0.A02 = r7     // Catch:{ all -> 0x0100 }
            X.Q14 r1 = r0.A07     // Catch:{ all -> 0x0100 }
            r1.A01(r7)     // Catch:{ all -> 0x0100 }
            X.Q14 r1 = r0.A06     // Catch:{ all -> 0x0100 }
            r1.A01(r7)     // Catch:{ all -> 0x0100 }
            java.util.Map r1 = r0.A0K     // Catch:{ all -> 0x0100 }
            java.util.Set r1 = r1.keySet()     // Catch:{ all -> 0x0100 }
            java.util.Iterator r13 = X.Pxg.A15(r1)     // Catch:{ all -> 0x0100 }
        L_0x00b5:
            boolean r1 = r13.hasNext()     // Catch:{ all -> 0x0100 }
            if (r1 == 0) goto L_0x00e5
            java.lang.Object r1 = r13.next()     // Catch:{ all -> 0x0100 }
            int r3 = X.Pxe.A09(r1)     // Catch:{ all -> 0x0100 }
            X.Tia r12 = X.STM.A00(r0, r3)     // Catch:{ all -> 0x0100 }
            if (r12 == 0) goto L_0x00b5
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r0.A05     // Catch:{ all -> 0x0100 }
            X.4aE r1 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0100 }
            X.4aM r1 = r2.A04(r1, r3)     // Catch:{ all -> 0x0100 }
            long r9 = r1.A00     // Catch:{ all -> 0x0100 }
            r3 = 0
            int r1 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r1 >= 0) goto L_0x00db
            r9 = 0
        L_0x00db:
            long r1 = r7 - r9
            long r1 = java.lang.Math.max(r1, r3)     // Catch:{ all -> 0x0100 }
            r12.EKz(r1)     // Catch:{ all -> 0x0100 }
            goto L_0x00b5
        L_0x00e5:
            r1 = 0
            r0.A0A = r1     // Catch:{ all -> 0x0100 }
            X.RyG r2 = r0.A0F     // Catch:{ all -> 0x0100 }
            X.Thy r1 = r2.A02     // Catch:{ all -> 0x0100 }
            r1.flush()     // Catch:{ all -> 0x0100 }
            java.nio.ByteBuffer r1 = r2.A00     // Catch:{ all -> 0x0100 }
            r1.clear()     // Catch:{ all -> 0x0100 }
            X.SNJ r3 = r0.A0E     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x002a
            java.util.HashMap r2 = A00(r5, r7)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audio_pipeline_seek"
            goto L_0x0403
        L_0x0100:
            r4 = move-exception
            X.SNJ r3 = r0.A0E     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0431
            java.util.HashMap r2 = A00(r5, r7)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audio_pipeline_seek"
            goto L_0x042e
        L_0x010d:
            X.STM.A01(r0)     // Catch:{ all -> 0x0448 }
            goto L_0x002a
        L_0x0112:
            java.lang.Object r1 = r5.obj     // Catch:{ all -> 0x0448 }
            java.lang.Throwable r1 = (java.lang.Throwable) r1     // Catch:{ all -> 0x0448 }
            X.STM.A03(r0, r1)     // Catch:{ all -> 0x0448 }
            goto L_0x002a
        L_0x011b:
            java.lang.Object r2 = r5.obj     // Catch:{ all -> 0x0448 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = (com.facebook.videolite.transcoder.base.composition.MediaComposition) r2     // Catch:{ all -> 0x0448 }
            X.RzN r1 = r0.A08     // Catch:{ all -> 0x0448 }
            X.RzN r1 = X.SQv.A00(r2, r1)     // Catch:{ all -> 0x0448 }
            r0.A08 = r1     // Catch:{ all -> 0x0448 }
            r0.A05 = r2     // Catch:{ all -> 0x0448 }
            X.STM.A02(r0)     // Catch:{ all -> 0x0448 }
            goto L_0x002a
        L_0x012e:
            java.lang.Object r2 = r5.obj     // Catch:{ all -> 0x0448 }
            android.util.Pair r2 = (android.util.Pair) r2     // Catch:{ all -> 0x0448 }
            int r1 = r0.A00     // Catch:{ all -> 0x0448 }
            r8 = 2
            if (r1 == r8) goto L_0x002a
            r0.A00 = r8     // Catch:{ all -> 0x0448 }
            java.lang.Object r6 = r2.first     // Catch:{ all -> 0x0448 }
            java.util.HashSet r6 = (java.util.HashSet) r6     // Catch:{ all -> 0x0448 }
            r0.A09 = r6     // Catch:{ all -> 0x0448 }
            java.lang.Object r1 = r2.second     // Catch:{ all -> 0x0448 }
            int r1 = X.Pxe.A09(r1)     // Catch:{ all -> 0x0448 }
            long r4 = (long) r1     // Catch:{ all -> 0x0448 }
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r1 <= 0) goto L_0x0184
            int r1 = r6.size()     // Catch:{ all -> 0x0448 }
            java.lang.Integer[] r1 = new java.lang.Integer[r1]     // Catch:{ all -> 0x0448 }
            java.lang.Object[] r6 = r6.toArray(r1)     // Catch:{ all -> 0x0448 }
            java.lang.Integer[] r6 = (java.lang.Integer[]) r6     // Catch:{ all -> 0x0448 }
            r1 = 0
            r1 = r6[r1]     // Catch:{ all -> 0x0448 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r7 = r0.A05     // Catch:{ all -> 0x0448 }
            X.4aE r6 = X.C266714aE.AUDIO     // Catch:{ all -> 0x0448 }
            int r1 = r1.intValue()     // Catch:{ all -> 0x0448 }
            X.4aM r1 = r7.A04(r6, r1)     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x0184
            java.util.List r1 = r1.A04     // Catch:{ all -> 0x0448 }
            java.lang.Object r6 = X.Pxg.A0j(r1)     // Catch:{ all -> 0x0448 }
            X.4aI r6 = (X.C266754aI) r6     // Catch:{ all -> 0x0448 }
            X.Tfv r1 = r0.A0G     // Catch:{ IOException -> 0x0182 }
            long r6 = X.Q1Z.A02(r1, r6)     // Catch:{ IOException -> 0x0182 }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ IOException -> 0x0182 }
            long r4 = r1.toMicros(r4)     // Catch:{ IOException -> 0x0182 }
            long r4 = java.lang.Math.min(r6, r4)     // Catch:{ IOException -> 0x0182 }
            goto L_0x0184
        L_0x0182:
            r4 = 0
        L_0x0184:
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0448 }
            X.4aF r1 = X.Pxe.A0V(r1, r2, r4)     // Catch:{ all -> 0x0448 }
            r0.A04 = r1     // Catch:{ all -> 0x0448 }
            boolean r1 = X.STM.A04(r0)     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x002a
            android.os.Handler r1 = r0.A0D     // Catch:{ all -> 0x0448 }
            boolean r0 = r1.hasMessages(r8)     // Catch:{ all -> 0x0448 }
            if (r0 != 0) goto L_0x002a
            android.os.Message r0 = r1.obtainMessage(r8)     // Catch:{ all -> 0x0448 }
            goto L_0x0361
        L_0x01a0:
            X.SNJ r4 = r0.A0E     // Catch:{ all -> 0x0448 }
            r3 = 1
            if (r4 == 0) goto L_0x01af
            int r1 = r0.A00     // Catch:{ all -> 0x0448 }
            if (r1 == r3) goto L_0x01af
            java.lang.String r2 = "audio_pipeline_start"
            r1 = 0
            X.SNJ.A00(r4, r2, r1)     // Catch:{ all -> 0x0448 }
        L_0x01af:
            r0.A00 = r3     // Catch:{ all -> 0x0448 }
            android.os.Handler r2 = r0.A0D     // Catch:{ all -> 0x0448 }
            r1 = 2
            boolean r0 = r2.hasMessages(r1)     // Catch:{ all -> 0x0448 }
            if (r0 != 0) goto L_0x002a
            android.os.Message r0 = r2.obtainMessage(r1)     // Catch:{ all -> 0x0448 }
            goto L_0x0361
        L_0x01c0:
            int r2 = r0.A00     // Catch:{ all -> 0x0448 }
            r1 = 1
            r3 = 2
            if (r2 == r3) goto L_0x01c8
            if (r2 != r1) goto L_0x002a
        L_0x01c8:
            int r1 = r0.A01     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x002a
            boolean r1 = r0.A0A     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x0255
            java.util.Map r5 = r0.A0K     // Catch:{ all -> 0x0448 }
            java.util.Set r1 = r5.keySet()     // Catch:{ all -> 0x0448 }
            java.util.Iterator r10 = X.Pxg.A15(r1)     // Catch:{ all -> 0x0448 }
        L_0x01da:
            boolean r1 = r10.hasNext()     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x021c
            java.lang.Object r9 = r10.next()     // Catch:{ all -> 0x0448 }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ all -> 0x0448 }
            int r7 = r9.intValue()     // Catch:{ all -> 0x0448 }
            X.4aF[] r1 = r0.A0B     // Catch:{ all -> 0x0448 }
            r8 = r1[r7]     // Catch:{ all -> 0x0448 }
            long r1 = r0.A02     // Catch:{ all -> 0x0448 }
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x0448 }
            X.RzN r4 = r0.A08     // Catch:{ all -> 0x0448 }
            X.Q4k r4 = r4.A0B     // Catch:{ all -> 0x0448 }
            boolean r1 = X.C7334Q4k.A00(r8, r4, r6, r1)     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x01da
            int r1 = r0.A00     // Catch:{ all -> 0x0448 }
            if (r1 != r3) goto L_0x0209
            java.util.HashSet r1 = r0.A09     // Catch:{ all -> 0x0448 }
            boolean r1 = r1.contains(r9)     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x0209
            goto L_0x01da
        L_0x0209:
            X.RyG r1 = r0.A0F     // Catch:{ all -> 0x0448 }
            X.TiV r1 = r1.A01     // Catch:{ all -> 0x0448 }
            r1.enableTrack(r7)     // Catch:{ all -> 0x0448 }
            X.Tia r4 = X.STM.A00(r0, r7)     // Catch:{ all -> 0x0448 }
            if (r4 == 0) goto L_0x01da
            long r1 = r0.A02     // Catch:{ all -> 0x0448 }
            r4.ANu(r1)     // Catch:{ all -> 0x0448 }
            goto L_0x01da
        L_0x021c:
            r2 = 0
        L_0x021d:
            int r1 = r0.A01     // Catch:{ all -> 0x0448 }
            if (r2 >= r1) goto L_0x0235
            java.lang.Integer r1 = java.lang.Integer.valueOf(r2)     // Catch:{ all -> 0x0448 }
            boolean r1 = r5.containsKey(r1)     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x0232
            X.RyG r1 = r0.A0F     // Catch:{ all -> 0x0448 }
            X.TiV r1 = r1.A01     // Catch:{ all -> 0x0448 }
            r1.disableTrack(r2)     // Catch:{ all -> 0x0448 }
        L_0x0232:
            int r2 = r2 + 1
            goto L_0x021d
        L_0x0235:
            int r1 = r0.A00     // Catch:{ all -> 0x0448 }
            X.RyG r6 = r0.A0F     // Catch:{ all -> 0x0448 }
            long r4 = r0.A02     // Catch:{ all -> 0x0448 }
            if (r1 != r3) goto L_0x0258
            X.TiV r2 = r6.A01     // Catch:{ all -> 0x0448 }
            java.nio.ByteBuffer[] r1 = r6.A06     // Catch:{ all -> 0x0448 }
            r2.warmup(r1, r4)     // Catch:{ all -> 0x0448 }
        L_0x0244:
            long r4 = r0.A02     // Catch:{ all -> 0x0448 }
            long r1 = r0.A0C     // Catch:{ all -> 0x0448 }
            long r4 = r4 + r1
            r0.A02 = r4     // Catch:{ all -> 0x0448 }
            X.Q14 r1 = r0.A07     // Catch:{ all -> 0x0448 }
            r1.A01(r4)     // Catch:{ all -> 0x0448 }
            X.Q14 r1 = r0.A06     // Catch:{ all -> 0x0448 }
            r1.A01(r4)     // Catch:{ all -> 0x0448 }
        L_0x0255:
            X.RyG r2 = r0.A0F     // Catch:{ all -> 0x0448 }
            goto L_0x026a
        L_0x0258:
            X.TiV r2 = r6.A01     // Catch:{ all -> 0x0448 }
            java.nio.ByteBuffer[] r1 = r6.A06     // Catch:{ all -> 0x0448 }
            java.nio.ByteBuffer r1 = r2.process(r1, r4)     // Catch:{ all -> 0x0448 }
            r6.A00 = r1     // Catch:{ all -> 0x0448 }
            X.SOl r1 = r6.A04     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x0244
            r1.A02(r4)     // Catch:{ all -> 0x0448 }
            goto L_0x0244
        L_0x026a:
            X.SOP r1 = r2.A03     // Catch:{ Exception -> 0x0320 }
            if (r1 == 0) goto L_0x0328
            X.Ryt r1 = r1.A05     // Catch:{ Exception -> 0x0320 }
            if (r1 == 0) goto L_0x0328
            java.nio.ByteBuffer r7 = r2.A00     // Catch:{ Exception -> 0x0320 }
            java.lang.String r4 = "bytes_recorded"
            java.lang.String r5 = "MediaAccuracyAudioCapture"
            r6 = 0
            X.0qQ.A0B(r7, r6)     // Catch:{ Exception -> 0x0320 }
            int r6 = r1.A00     // Catch:{ Exception -> 0x0320 }
            r8 = 600(0x258, float:8.41E-43)
            if (r6 >= r8) goto L_0x0328
            boolean r6 = r1.A05     // Catch:{ Exception -> 0x0320 }
            if (r6 == 0) goto L_0x0328
            boolean r6 = r7.hasRemaining()     // Catch:{ all -> 0x02ec }
            if (r6 == 0) goto L_0x0328
            int r6 = r1.A00     // Catch:{ all -> 0x02ec }
            if (r6 != 0) goto L_0x02a2
            X.S5Y r12 = r1.A06     // Catch:{ all -> 0x02ec }
            java.lang.Integer r13 = X.AnonymousClass05K.A03     // Catch:{ all -> 0x02ec }
            java.lang.String r6 = r1.A08     // Catch:{ all -> 0x02ec }
            r15 = 0
            java.lang.Integer r14 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x02ec }
            r17 = r15
            r18 = r15
            r16 = r6
            r12.A02(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ec }
        L_0x02a2:
            int r6 = r1.A00     // Catch:{ all -> 0x02ec }
            r10 = 1
            int r6 = r6 + 1
            r1.A00 = r6     // Catch:{ all -> 0x02ec }
            int r12 = r7.remaining()     // Catch:{ all -> 0x02ec }
            java.nio.ByteBuffer r9 = r7.duplicate()     // Catch:{ all -> 0x02ec }
            byte[] r7 = r1.A0A     // Catch:{ all -> 0x02ec }
            int r6 = r1.A01     // Catch:{ all -> 0x02ec }
            r9.get(r7, r6, r12)     // Catch:{ all -> 0x02ec }
            r6 = 12
            java.lang.Thread.sleep(r6)     // Catch:{ all -> 0x02ec }
            int r9 = r1.A01     // Catch:{ all -> 0x02ec }
            int r9 = r9 + r12
            r1.A01 = r9     // Catch:{ all -> 0x02ec }
            int r7 = r1.A00     // Catch:{ all -> 0x02ec }
            if (r7 == r10) goto L_0x02e9
            r6 = 300(0x12c, float:4.2E-43)
            if (r7 == r6) goto L_0x02e9
            if (r7 != r8) goto L_0x02e9
            X.S5Y r12 = r1.A06     // Catch:{ all -> 0x02ec }
            java.lang.Integer r13 = X.AnonymousClass05K.A04     // Catch:{ all -> 0x02ec }
            java.lang.String r8 = r1.A08     // Catch:{ all -> 0x02ec }
            java.lang.String r6 = java.lang.String.valueOf(r9)     // Catch:{ all -> 0x02ec }
            java.util.Map r18 = X.AnonymousClass7TF.A0w(r4, r6)     // Catch:{ all -> 0x02ec }
            long r6 = r1.A02     // Catch:{ all -> 0x02ec }
            java.lang.Integer r14 = X.AnonymousClass05K.A00     // Catch:{ all -> 0x02ec }
            java.lang.Long r15 = java.lang.Long.valueOf(r6)     // Catch:{ all -> 0x02ec }
            r17 = 0
            r16 = r8
            r12.A02(r13, r14, r15, r16, r17, r18)     // Catch:{ all -> 0x02ec }
        L_0x02e9:
            X.0gF r6 = X.C60340gF.A00     // Catch:{ all -> 0x02ec }
            goto L_0x02f1
        L_0x02ec:
            r6 = move-exception
            X.0eQ r6 = X.JTO.A1B(r6)     // Catch:{ Exception -> 0x0320 }
        L_0x02f1:
            java.lang.Throwable r19 = X.0eR.A00(r6)     // Catch:{ Exception -> 0x0320 }
            if (r19 == 0) goto L_0x0328
            java.lang.String r6 = "Exception while saving audio bytes for media accuracy"
            X.0KC.A0C(r5, r6)     // Catch:{ Exception -> 0x0320 }
            X.S5Y r12 = r1.A06     // Catch:{ Exception -> 0x0320 }
            java.lang.Integer r13 = X.AnonymousClass05K.A05     // Catch:{ Exception -> 0x0320 }
            java.lang.String r6 = r1.A08     // Catch:{ Exception -> 0x0320 }
            int r5 = r1.A01     // Catch:{ Exception -> 0x0320 }
            java.lang.String r5 = java.lang.String.valueOf(r5)     // Catch:{ Exception -> 0x0320 }
            java.util.Map r21 = X.AnonymousClass7TF.A0w(r4, r5)     // Catch:{ Exception -> 0x0320 }
            long r4 = r1.A02     // Catch:{ Exception -> 0x0320 }
            java.lang.Integer r14 = X.AnonymousClass05K.A00     // Catch:{ Exception -> 0x0320 }
            java.lang.Long r15 = java.lang.Long.valueOf(r4)     // Catch:{ Exception -> 0x0320 }
            r17 = 0
            java.lang.String r18 = "Failed while recording audio bytes"
            r20 = r17
            r16 = r6
            r12.A01(r13, r14, r15, r16, r17, r18, r19, r20, r21)     // Catch:{ Exception -> 0x0320 }
            goto L_0x0328
        L_0x0320:
            r5 = move-exception
            java.lang.String r4 = "MediaAccuracyAudioCapture"
            java.lang.String r1 = "Exception while saving audio bytes for media accuracy. Skipping."
            X.0KC.A0F(r4, r1, r5)     // Catch:{ all -> 0x0448 }
        L_0x0328:
            X.Thy r4 = r2.A02     // Catch:{ all -> 0x0448 }
            java.nio.ByteBuffer r1 = r2.A00     // Catch:{ all -> 0x0448 }
            r4.E4W(r1)     // Catch:{ all -> 0x0448 }
            java.nio.ByteBuffer r1 = r2.A00     // Catch:{ all -> 0x0448 }
            boolean r1 = r1.hasRemaining()     // Catch:{ all -> 0x0448 }
            r1 = r1 ^ 1
            r1 = r1 ^ 1
            r0.A0A = r1     // Catch:{ all -> 0x0448 }
            boolean r1 = X.STM.A04(r0)     // Catch:{ all -> 0x0448 }
            if (r1 != 0) goto L_0x0355
            X.SOl r1 = r2.A04     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x0348
            r1.A01()     // Catch:{ all -> 0x0448 }
        L_0x0348:
            boolean r1 = r4.Eve()     // Catch:{ all -> 0x0448 }
            if (r1 == 0) goto L_0x0355
            android.os.Handler r0 = r0.A0D     // Catch:{ all -> 0x0448 }
            r0.removeMessages(r3)     // Catch:{ all -> 0x0448 }
            goto L_0x002a
        L_0x0355:
            android.os.Handler r1 = r0.A0D     // Catch:{ all -> 0x0448 }
            boolean r0 = r1.hasMessages(r3)     // Catch:{ all -> 0x0448 }
            if (r0 != 0) goto L_0x002a
            android.os.Message r0 = r1.obtainMessage(r3)     // Catch:{ all -> 0x0448 }
        L_0x0361:
            r0.sendToTarget()     // Catch:{ all -> 0x0448 }
            goto L_0x002a
        L_0x0366:
            long r13 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0448 }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A05     // Catch:{ all -> 0x040f }
            X.4aE r8 = X.C266714aE.AUDIO     // Catch:{ all -> 0x040f }
            X.Tfv r7 = r0.A0G     // Catch:{ all -> 0x040f }
            long r3 = X.Q1Z.A00(r7, r8, r1)     // Catch:{ all -> 0x040f }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r2 = r0.A05     // Catch:{ all -> 0x040f }
            X.4aE r1 = X.C266714aE.VIDEO     // Catch:{ all -> 0x040f }
            long r1 = X.Q1Z.A00(r7, r1, r2)     // Catch:{ all -> 0x040f }
            long r1 = java.lang.Math.max(r3, r1)     // Catch:{ all -> 0x040f }
            r0.A03 = r1     // Catch:{ all -> 0x040f }
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A05     // Catch:{ all -> 0x040f }
            java.util.HashMap r1 = r1.A07(r8)     // Catch:{ all -> 0x040f }
            if (r1 == 0) goto L_0x0408
            int r1 = r1.size()     // Catch:{ all -> 0x040f }
            r0.A01 = r1     // Catch:{ all -> 0x040f }
            X.4aF[] r1 = new X.C266724aF[r1]     // Catch:{ all -> 0x040f }
            r0.A0B = r1     // Catch:{ all -> 0x040f }
            r12 = 0
        L_0x0395:
            int r1 = r0.A01     // Catch:{ all -> 0x040f }
            if (r12 >= r1) goto L_0x03b4
            com.facebook.videolite.transcoder.base.composition.MediaComposition r1 = r0.A05     // Catch:{ all -> 0x040f }
            X.4aM r1 = r1.A04(r8, r12)     // Catch:{ all -> 0x040f }
            long r9 = X.Q1Z.A01(r7, r1)     // Catch:{ all -> 0x040f }
            X.4aF[] r6 = r0.A0B     // Catch:{ all -> 0x040f }
            long r4 = r1.A00     // Catch:{ all -> 0x040f }
            long r2 = r4 + r9
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.MICROSECONDS     // Catch:{ all -> 0x040f }
            X.4aF r1 = X.Pxe.A0V(r1, r4, r2)     // Catch:{ all -> 0x040f }
            r6[r12] = r1     // Catch:{ all -> 0x040f }
            int r12 = r12 + 1
            goto L_0x0395
        L_0x03b4:
            java.util.HashMap r5 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x040f }
            r4 = 0
        L_0x03b9:
            X.4aF[] r3 = r0.A0B     // Catch:{ all -> 0x040f }
            int r1 = r3.length     // Catch:{ all -> 0x040f }
            if (r4 >= r1) goto L_0x03ca
            java.lang.String r2 = java.lang.Integer.toString(r4)     // Catch:{ all -> 0x040f }
            r1 = r3[r4]     // Catch:{ all -> 0x040f }
            r5.put(r2, r1)     // Catch:{ all -> 0x040f }
            int r4 = r4 + 1
            goto L_0x03b9
        L_0x03ca:
            boolean r1 = r0 instanceof X.C7950Qdr     // Catch:{ all -> 0x040f }
            if (r1 == 0) goto L_0x03e2
            long r6 = X.STM.A0P     // Catch:{ all -> 0x040f }
        L_0x03d0:
            X.RzN r1 = r0.A08     // Catch:{ all -> 0x040f }
            X.Q4k r2 = r1.A0B     // Catch:{ all -> 0x040f }
            X.Qe9 r1 = new X.Qe9     // Catch:{ all -> 0x040f }
            r4 = r2
            r2 = r1
            r3 = r0
            r2.<init>(r3, r4, r5, r6)     // Catch:{ all -> 0x040f }
            r0.A07 = r1     // Catch:{ all -> 0x040f }
            X.STM.A02(r0)     // Catch:{ all -> 0x040f }
            goto L_0x03e5
        L_0x03e2:
            r6 = 0
            goto L_0x03d0
        L_0x03e5:
            X.SNJ r3 = r0.A0E     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x002a
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0448 }
            long r1 = r1 - r13
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0448 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0448 }
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "latency_ms"
            r2.put(r0, r1)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audio_pipeline_prepare"
        L_0x0403:
            X.SNJ.A00(r3, r0, r2)     // Catch:{ all -> 0x0448 }
            goto L_0x002a
        L_0x0408:
            java.lang.String r1 = "No audio tracks"
            java.lang.IllegalArgumentException r1 = X.AnonymousClass7TE.A0w(r1)     // Catch:{ all -> 0x040f }
            throw r1     // Catch:{ all -> 0x040f }
        L_0x040f:
            r4 = move-exception
            X.SNJ r3 = r0.A0E     // Catch:{ all -> 0x0448 }
            if (r3 == 0) goto L_0x0431
            long r1 = java.lang.System.nanoTime()     // Catch:{ all -> 0x0448 }
            long r1 = r1 - r13
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch:{ all -> 0x0448 }
            long r0 = r0.toMillis(r1)     // Catch:{ all -> 0x0448 }
            java.util.HashMap r2 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x0448 }
            java.lang.String r1 = java.lang.String.valueOf(r0)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "latency_ms"
            r2.put(r0, r1)     // Catch:{ all -> 0x0448 }
            java.lang.String r0 = "audio_pipeline_prepare"
        L_0x042e:
            X.SNJ.A00(r3, r0, r2)     // Catch:{ all -> 0x0448 }
        L_0x0431:
            throw r4     // Catch:{ all -> 0x0448 }
        L_0x0432:
            int r2 = r0.A00     // Catch:{ all -> 0x0448 }
            r1 = 1
            if (r2 != r1) goto L_0x002a
            r1 = 0
            r0.A00 = r1     // Catch:{ all -> 0x0448 }
            X.RyG r1 = r0.A0F     // Catch:{ all -> 0x0448 }
            X.Thy r0 = r1.A02     // Catch:{ all -> 0x0448 }
            r0.flush()     // Catch:{ all -> 0x0448 }
            java.nio.ByteBuffer r0 = r1.A00     // Catch:{ all -> 0x0448 }
            r0.clear()     // Catch:{ all -> 0x0448 }
            goto L_0x002a
        L_0x0448:
            r1 = move-exception
            java.lang.Object r0 = r11.A01
            X.STM r0 = (X.STM) r0
            X.STM.A03(r0, r1)
            goto L_0x002a
        L_0x0452:
            int r1 = r5.what
            r0 = 1
            if (r1 != r0) goto L_0x047a
            java.lang.Object r3 = r11.A01
            com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppCacheJobService r3 = (com.facebook.oxygen.preloads.sdk.firstparty.managedappcache.IsManagedAppCacheJobService) r3
            java.lang.Object r2 = r5.obj
            android.app.job.JobParameters r2 = (android.app.job.JobParameters) r2
        L_0x045f:
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x0478
            android.app.job.JobWorkItem r1 = r2.dequeueWork()     // Catch:{ SecurityException -> 0x0478 }
            if (r1 == 0) goto L_0x0478
            android.content.Intent r0 = r1.getIntent()
            X.C9270RVv.A00(r0, r3)
            boolean r0 = r3.A01
            if (r0 != 0) goto L_0x045f
            r2.completeWork(r1)
            goto L_0x045f
        L_0x0478:
            r0 = 1
            return r0
        L_0x047a:
            java.lang.String r0 = "Unknown msg: "
            java.lang.IllegalArgumentException r0 = X.DbW.A0a(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11457SVv.handleMessage(android.os.Message):boolean");
    }

    public static HashMap A00(long j, long j2) {
        long millis = TimeUnit.MICROSECONDS.toMillis(j2);
        long millis2 = TimeUnit.NANOSECONDS.toMillis(System.nanoTime() - j);
        HashMap hashMap = new HashMap();
        hashMap.put("target_position_ms", String.valueOf(millis));
        hashMap.put("latency_ms", String.valueOf(millis2));
        return hashMap;
    }
}
