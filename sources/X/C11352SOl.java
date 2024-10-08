package X;

import android.util.Pair;
import android.util.SparseArray;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* renamed from: X.SOl  reason: case insensitive filesystem */
public final class C11352SOl {
    public static final long A0I = ((long) (Pxg.A00() / 30.0d));
    public long A00 = 0;
    public RQT A01;
    public Q14 A02;
    public Q14 A03;
    public boolean A04;
    public final C13725Tfv A05;
    public final SJL A06;
    public final C7329Q4f A07;
    public final C10862RzN A08;
    public final C13726Tfw A09;
    public final S30 A0A;
    public final Map A0B = AnonymousClass7TE.A1E();
    public final Map A0C = Pxf.A0w();
    public final ExecutorService A0D;
    public final MediaComposition A0E;
    public final C10574RuT A0F;
    public final boolean A0G;
    public volatile boolean A0H;

    /* JADX INFO: finally extract failed */
    /* JADX WARNING: type inference failed for: r8v0, types: [X.RQT, java.lang.Object] */
    public final void A01() {
        long j;
        C349257zq.A03("MultipleTrackCooridnator.demuxAndDecodeMediaPosition");
        try {
            C7329Q4f q4f = this.A07;
            C266784aL.A06(AnonymousClass7TF.A1V(q4f), "MultiOutputCoordinator cannot be null");
            MediaComposition mediaComposition = this.A0E;
            C266714aE r1 = C266714aE.VIDEO;
            C13725Tfv tfv = this.A05;
            long A002 = Q1Z.A00(tfv, r1, mediaComposition);
            C10862RzN rzN = this.A08;
            Map map = this.A0B;
            SPy.A03(tfv, r1, rzN, map);
            SparseArray sparseArray = (SparseArray) Pxe.A0r(r1, map);
            ? obj = new Object();
            obj.A00 = AnonymousClass7TE.A1E();
            obj.A01 = AnonymousClass7TE.A1C();
            for (int i = 0; i < sparseArray.size(); i++) {
                int keyAt = sparseArray.keyAt(i);
                if (sparseArray.valueAt(i) != null) {
                    j = ((C266724aF) sparseArray.valueAt(i)).A03(TimeUnit.MICROSECONDS);
                } else {
                    j = -1;
                }
                obj.A01.add(Pxe.A0K(Integer.valueOf(keyAt), Long.valueOf(j)));
            }
            Collections.sort(obj.A01, new C13114TLx((Object) obj, 3));
            for (int i2 = 0; i2 < obj.A01.size(); i2++) {
                C66581MXm.A1S(((Pair) obj.A01.get(i2)).first, obj.A00, i2);
            }
            this.A01 = obj;
            q4f.getClass();
            C12362SsB ssB = new C12362SsB(q4f);
            Ss9 ss9 = new Ss9(q4f);
            C7334Q4k q4k = rzN.A0B;
            this.A03 = SPy.A00(ss9, ssB, q4k, map);
            MediaComposition mediaComposition2 = rzN.A08;
            mediaComposition2.getClass();
            this.A02 = SPy.A01(mediaComposition2, new C12358Ss4(q4f), new C12360Ss6(q4f), q4k);
            A02(A002);
            int i3 = 0;
            while (true) {
                q4f.A00.getClass();
                if (i3 >= 1) {
                    break;
                }
                Object A10 = C51968G9o.A10(q4f.A01, i3);
                A10.getClass();
                ((C13856Tib) A10).flush();
                i3 = 1;
            }
            int i4 = 0;
            while (true) {
                q4f.A00.getClass();
                if (i4 < 1) {
                    C13856Tib tib = (C13856Tib) C51968G9o.A10(q4f.A01, i4);
                    if (tib != null) {
                        tib.Evd();
                    }
                    i4 = 1;
                } else {
                    this.A00 = 0;
                    A00(Collections.EMPTY_LIST);
                    C349257zq.A01();
                    return;
                }
            }
        } catch (Throwable th) {
            A00(Collections.EMPTY_LIST);
            throw th;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0157, code lost:
        if (X.C7334Q4k.A00(r13, r28, r20, r1) != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x0159, code lost:
        if (r16 != false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x015e, code lost:
        if (r1 == false) goto L_0x01a0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(long r32) {
        /*
            r31 = this;
            java.lang.String r0 = "MultipleTrackCooridnator.demuxAndDecodeMediaPosition"
            X.C349257zq.A03(r0)
            X.4aE r9 = X.C266714aE.VIDEO
            r10 = r31
            long r1 = r10.A00
            java.util.Map r0 = r10.A0B
            r30 = r0
            X.RzN r0 = r10.A08
            r29 = r0
            X.Q4k r0 = r0.A0B
            r28 = r0
            r3 = r0
            r0 = r30
            java.util.ArrayList r27 = X.SPy.A02(r9, r3, r0, r1)
        L_0x001e:
            long r1 = r10.A00
            int r0 = (r1 > r32 ? 1 : (r1 == r32 ? 0 : -1))
            if (r0 >= 0) goto L_0x01f3
            boolean r0 = r10.A0H
            if (r0 != 0) goto L_0x01f3
            java.lang.String r0 = "MultipleTrackCooridnator.demux"
            X.C349257zq.A03(r0)
            long r1 = r10.A00
            X.Q14 r0 = r10.A03
            if (r0 == 0) goto L_0x0036
            r0.A01(r1)
        L_0x0036:
            X.Q14 r0 = r10.A02
            if (r0 == 0) goto L_0x003d
            r0.A01(r1)
        L_0x003d:
            java.util.Iterator r26 = r27.iterator()
        L_0x0041:
            boolean r0 = r26.hasNext()
            r24 = 0
            if (r0 == 0) goto L_0x01b1
            java.lang.Object r1 = r26.next()
            java.lang.Number r1 = (java.lang.Number) r1
            java.lang.String r0 = "MultipleTrackCooridnator.createOrGetDemuxDecodeWrapper"
            X.C349257zq.A03(r0)
            int r7 = r1.intValue()
            com.facebook.videolite.transcoder.base.composition.MediaComposition r6 = r10.A0E
            java.util.Map r5 = r10.A0C
            java.lang.Object r11 = r5.get(r1)
            X.Tia r11 = (X.C13855Tia) r11
            if (r11 != 0) goto L_0x0099
            X.S30 r8 = r10.A0A
            java.util.concurrent.ExecutorService r4 = r10.A0D
            X.Tfw r3 = r10.A09
            X.SJL r2 = r10.A06
            r17 = 0
            X.4aM r12 = r6.A04(r9, r7)
            java.lang.Object[] r11 = new java.lang.Object[]{r6}
            java.lang.String r0 = "mc: %s"
            X.0JA.A05(r12, r0, r11)
            java.util.List r0 = r12.A04
            java.lang.Object r0 = X.Pxg.A0j(r0)
            X.4aI r0 = (X.C266754aI) r0
            r11 = r8
            r12 = r2
            r13 = r0
            r14 = r29
            r15 = r3
            r16 = r4
            X.Tia r11 = r11.A01(r12, r13, r14, r15, r16, r17)
            r11.AIw(r7)
            r11.start()
            r5.put(r1, r11)
        L_0x0099:
            X.C349257zq.A01()
            boolean r0 = r11.CRE()
            if (r0 != 0) goto L_0x0041
            int r0 = r1.intValue()
            X.4aM r14 = r6.A04(r9, r0)
            if (r14 == 0) goto L_0x01e5
            long r7 = r14.A00
            int r0 = (r7 > r24 ? 1 : (r7 == r24 ? 0 : -1))
            if (r0 >= 0) goto L_0x00b4
            r7 = 0
        L_0x00b4:
            r0 = r29
            X.SOn r12 = r0.A06
            if (r12 == 0) goto L_0x01a0
            boolean r0 = r10.A0G
            r23 = r0
            int r0 = r27.size()
            long r5 = r10.A00
            long r3 = r11.Avc()
            long r3 = r3 + r7
            X.RuT r2 = r10.A0F
            int r22 = r1.intValue()
            X.RQT r15 = r10.A01
            r15.getClass()
            r1 = 1
            if (r0 > r1) goto L_0x015b
            X.Rp6 r0 = r12.A0F
            if (r0 != 0) goto L_0x015b
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 <= 0) goto L_0x0185
            java.util.concurrent.TimeUnit r20 = java.util.concurrent.TimeUnit.MICROSECONDS
            r0 = r20
            X.4aF r13 = X.Pxe.A0V(r0, r5, r3)
        L_0x00e7:
            int r12 = r2.A00
            java.util.List r1 = r2.A02
            int r0 = r1.size()
            if (r12 >= r0) goto L_0x011f
            int r0 = r2.A00
            java.lang.Object r0 = r1.get(r0)
            X.4aF r0 = (X.C266724aF) r0
            X.Q4k r12 = r2.A01
            boolean r12 = r12.A0H()
            boolean r0 = r13.A05(r0, r12)
            r16 = 1
            if (r0 != 0) goto L_0x0121
            int r0 = r2.A00
            java.lang.Object r1 = r1.get(r0)
            X.4aF r1 = (X.C266724aF) r1
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            if (r12 == 0) goto L_0x0170
            long r18 = r1.A02(r0)
            long r16 = r13.A02(r0)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 < 0) goto L_0x017d
        L_0x011f:
            r16 = 0
        L_0x0121:
            java.util.HashMap r1 = r15.A00
            java.lang.Integer r0 = java.lang.Integer.valueOf(r22)
            boolean r2 = r1.containsKey(r0)
            if (r2 == 0) goto L_0x0159
            java.lang.Object r0 = r1.get(r0)
            int r0 = X.AnonymousClass7TE.A0M(r0)
            java.util.List r1 = r15.A01
            int r2 = X.C51966G9m.A06(r1)
            if (r0 == r2) goto L_0x0159
            int r0 = r0 + 1
            java.lang.Object r0 = r1.get(r0)
            android.util.Pair r0 = (android.util.Pair) r0
            java.lang.Object r0 = r0.second
            long r1 = X.AnonymousClass7TE.A0R(r0)
            int r0 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r0 <= 0) goto L_0x0159
            r12 = r28
            r0 = r20
            boolean r0 = X.C7334Q4k.A00(r13, r12, r0, r1)
            if (r0 != 0) goto L_0x015b
        L_0x0159:
            if (r16 == 0) goto L_0x0185
        L_0x015b:
            r1 = 1
        L_0x015c:
            r10.A04 = r1
            if (r1 == 0) goto L_0x01a0
        L_0x0160:
            java.lang.String r0 = "MultipleTrackCooridnator.decodeFrameAndAdvanceCustomClock"
            X.C349257zq.A03(r0)
            long r0 = r10.A00
            long r0 = r0 - r7
            r11.ANu(r0)
        L_0x016b:
            X.C349257zq.A01()
            goto L_0x0041
        L_0x0170:
            long r18 = r1.A03(r0)
            long r16 = r13.A02(r0)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 <= 0) goto L_0x017d
            goto L_0x011f
        L_0x017d:
            int r0 = r2.A00
            int r0 = r0 + 1
            r2.A00 = r0
            goto L_0x00e7
        L_0x0185:
            java.util.List r0 = r14.A06
            java.util.ArrayList r0 = X.AnonymousClass7TE.A1D(r0)
            boolean r0 = r0.isEmpty()
            if (r0 == 0) goto L_0x015b
            if (r23 == 0) goto L_0x0198
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 >= 0) goto L_0x0198
            goto L_0x015b
        L_0x0198:
            r1 = 0
            boolean r0 = r10.A04
            if (r0 == 0) goto L_0x015c
            r10.A04 = r1
            goto L_0x0160
        L_0x01a0:
            java.lang.String r0 = "MultipleTrackCooridnator.decodeFrameAndAdvanceNormalClock"
            X.C349257zq.A03(r0)
            long r1 = r11.ANt()
            int r0 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x016b
            long r7 = r7 + r1
            r10.A00 = r7
            goto L_0x016b
        L_0x01b1:
            java.lang.String r0 = "MultipleTrackCooridnator.render"
            X.C349257zq.A03(r0)
            long r1 = r10.A00
            int r0 = (r1 > r24 ? 1 : (r1 == r24 ? 0 : -1))
            if (r0 < 0) goto L_0x01c1
            X.Q4f r0 = r10.A07
            r0.A02(r1)
        L_0x01c1:
            long r1 = r10.A00
            long r3 = A0I
            long r1 = r1 + r3
            r10.A00 = r1
            r3 = r28
            r0 = r30
            java.util.ArrayList r27 = X.SPy.A02(r9, r3, r0, r1)
            r0 = r27
            r10.A00(r0)
            X.Q4f r0 = r10.A07
            boolean r0 = r0.A03()
            if (r0 != 0) goto L_0x01eb
            X.C349257zq.A01()
            X.C349257zq.A01()
            goto L_0x001e
        L_0x01e5:
            X.Qe5 r0 = new X.Qe5
            r0.<init>()
            throw r0
        L_0x01eb:
            java.lang.String r1 = "Muxer stopped even before EOS is enqueued"
            X.4ZS r0 = new X.4ZS
            r0.<init>(r1)
            throw r0
        L_0x01f3:
            X.C349257zq.A01()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11352SOl.A02(long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0074, code lost:
        if (X.182.A06(r2, r3, 36327559239121409L) != false) goto L_0x007b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0079, code lost:
        if ((r5 instanceof X.C7967QeF) != false) goto L_0x007b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C11352SOl(X.C7255Q1d r7, X.C13725Tfv r8, X.SJL r9, X.C7329Q4f r10, X.C10862RzN r11, X.C13726Tfw r12, X.S30 r13) {
        /*
            r6 = this;
            r6.<init>()
            java.util.Map r0 = X.Pxf.A0w()
            r6.A0C = r0
            r0 = 0
            r6.A00 = r0
            java.util.HashMap r0 = X.AnonymousClass7TE.A1E()
            r6.A0B = r0
            r6.A07 = r10
            r6.A08 = r11
            r6.A0A = r13
            r6.A05 = r8
            r6.A06 = r9
            r6.A09 = r12
            com.facebook.videolite.transcoder.base.composition.MediaComposition r4 = r11.A08
            r4.getClass()
            r6.A0E = r4
            X.Q4k r5 = r11.A0B
            boolean r0 = r5 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0077
            r1 = r5
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0059;
                case 1: goto L_0x0034;
                case 2: goto L_0x007b;
                default: goto L_0x0034;
            }
        L_0x0034:
            r0 = 0
        L_0x0035:
            r6.A0G = r0
            X.4aE r2 = X.C266714aE.VIDEO
            java.util.HashMap r0 = r4.A07(r2)
            if (r0 != 0) goto L_0x0050
            r1 = 0
        L_0x0040:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            java.util.concurrent.ThreadPoolExecutor r0 = r7.A02(r0, r1)
            r6.A0D = r0
            X.RuT r0 = new X.RuT
            r0.<init>(r2, r4, r5)
            r6.A0F = r0
            return
        L_0x0050:
            java.util.HashMap r0 = r4.A07(r2)
            int r1 = r0.size()
            goto L_0x0040
        L_0x0059:
            java.lang.Object r3 = r1.A01
            X.0lg r3 = (X.0lg) r3
            X.0Tu r2 = X.0Tu.A05
            r0 = 36326305108604604(0x810e95000036bc, double:3.036239852746877E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            if (r0 != 0) goto L_0x007b
            r0 = 36327559239121409(0x810fb900013a01, double:3.037032969935683E-306)
            boolean r1 = X.182.A06(r2, r3, r0)
            r0 = 0
            if (r1 == 0) goto L_0x0035
            goto L_0x007b
        L_0x0077:
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0034
        L_0x007b:
            r0 = 1
            goto L_0x0035
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11352SOl.<init>(X.Q1d, X.Tfv, X.SJL, X.Q4f, X.RzN, X.Tfw, X.S30):void");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v5, types: [java.lang.Object, X.RQJ] */
    private void A00(List list) {
        HashMap A1E = AnonymousClass7TE.A1E();
        Map map = this.A0C;
        A1E.putAll(map);
        for (Object remove : list) {
            A1E.remove(remove);
        }
        ? obj = new Object();
        Iterator A0s = AnonymousClass7TF.A0s(A1E);
        while (A0s.hasNext()) {
            C7948Qdp qdp = new C7948Qdp((C7254Q1b) obj, (C13855Tia) C51971G9r.A0p(A0s));
            new Object().A00 = qdp;
            qdp.A00();
        }
        obj.A01();
        map.keySet().removeAll(A1E.keySet());
    }
}
