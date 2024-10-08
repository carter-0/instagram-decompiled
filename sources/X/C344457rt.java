package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: X.7rt  reason: invalid class name and case insensitive filesystem */
public final class C344457rt extends C344467ru implements C344477rv, C344487rw {
    public static final LinkedHashMap A0B = new LinkedHashMap();
    public int A00;
    public final Handler A01;
    public final C344497rx A02;
    public final C344407ro A03;
    public final C344037rD A04;
    public final C344527s0 A05;
    public final C344647sC A06;
    public final C344727sK A07;
    public volatile C345537tg A08;
    public volatile C344637sB A09;
    public volatile CountDownLatch A0A;

    /* JADX WARNING: Code restructure failed: missing block: B:11:0x00ca, code lost:
        if (A02(105) != false) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00df, code lost:
        if (A02(107) != false) goto L_0x00e1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C344457rt(X.C343837qt r8) {
        /*
            r7 = this;
            r6 = 1
            r7.<init>()
            r7.A00 = r8
            X.7r3 r1 = X.C344037rD.A00
            r8.getClass()
            boolean r0 = r8.CQO(r1)
            if (r0 == 0) goto L_0x01c0
            X.7qt r0 = r7.A00
            r0.getClass()
            X.7r1 r0 = r0.Apf(r1)
            X.7rD r0 = (X.C344037rD) r0
        L_0x001c:
            r7.A04 = r0
            X.7qb r1 = X.C343737qi.A0F
            X.7qt r0 = r7.A00
            r0.getClass()
            java.lang.Object r0 = r0.Apu(r1)
            X.7rx r0 = (X.C344497rx) r0
            r7.A02 = r0
            X.7qb r1 = X.C343737qi.A08
            r0 = 0
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)
            java.lang.Object r0 = r7.A09(r1, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r4 = r0.booleanValue()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            X.7rz r3 = X.C344507ry.A02
            X.7qb r1 = X.C343737qi.A02
            java.lang.Object r0 = X.C344527s0.A05
            java.lang.Object r0 = r7.A09(r1, r0)
            r2.put(r3, r0)
            X.7rz r3 = X.C344507ry.A07
            X.7qb r1 = X.C343737qi.A0G
            r0 = 3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r7.A09(r1, r0)
            r2.put(r3, r0)
            X.7rz r1 = X.C344507ry.A01
            X.7qb r0 = X.C343737qi.A01
            java.lang.Object r0 = r7.A09(r0, r5)
            r2.put(r1, r0)
            X.7rz r1 = X.C344507ry.A04
            X.7qb r0 = X.C343737qi.A0A
            java.lang.Object r0 = r7.A09(r0, r5)
            r2.put(r1, r0)
            X.7rz r3 = X.C344507ry.A0B
            X.7qb r1 = X.C343737qi.A03
            X.7qt r0 = r7.A00
            r0.getClass()
            java.lang.Object r0 = r0.Apu(r1)
            r2.put(r3, r0)
            X.7rz r1 = X.C344507ry.A05
            X.7qb r0 = X.C343737qi.A0D
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r6)
            java.lang.Object r0 = r7.A09(r0, r3)
            r2.put(r1, r0)
            X.7rz r1 = X.C344507ry.A09
            X.7qb r0 = X.C343737qi.A0H
            java.lang.Object r0 = r7.A09(r0, r3)
            r2.put(r1, r0)
            X.7rz r1 = X.C344507ry.A03
            X.7qb r0 = X.C343737qi.A04
            java.lang.Object r0 = r7.A09(r0, r5)
            r2.put(r1, r0)
            X.7rz r1 = X.C344507ry.A0D
            if (r4 != 0) goto L_0x00b8
            r0 = 104(0x68, float:1.46E-43)
            boolean r0 = r7.A02(r0)
            if (r0 != 0) goto L_0x00b8
            r6 = 0
        L_0x00b8:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r6)
            r2.put(r1, r0)
            X.7rz r3 = X.C344507ry.A0C
            if (r4 != 0) goto L_0x00cc
            r0 = 105(0x69, float:1.47E-43)
            boolean r1 = r7.A02(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00cd
        L_0x00cc:
            r0 = 1
        L_0x00cd:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r0)
            X.7rz r3 = X.C344507ry.A0E
            if (r4 != 0) goto L_0x00e1
            r0 = 107(0x6b, float:1.5E-43)
            boolean r1 = r7.A02(r0)
            r0 = 0
            if (r1 == 0) goto L_0x00e2
        L_0x00e1:
            r0 = 1
        L_0x00e2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r3, r0)
            X.7rz r1 = X.C344507ry.A08
            r0 = 108(0x6c, float:1.51E-43)
            boolean r0 = r7.A02(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r1, r0)
            X.7rz r1 = X.C344507ry.A06
            r0 = 174(0xae, float:2.44E-43)
            boolean r0 = r7.A02(r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            r2.put(r1, r0)
            X.7qb r0 = X.C343737qi.A09
            java.lang.Object r0 = r7.A09(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 != 0) goto L_0x011d
            r0 = 103(0x67, float:1.44E-43)
            boolean r0 = r7.A02(r0)
            if (r0 == 0) goto L_0x013c
        L_0x011d:
            X.7r3 r1 = X.C343927r2.A00
            X.7qt r0 = r7.A00
            r0.getClass()
            X.7r1 r1 = r0.Apf(r1)
            X.7r2 r1 = (X.C343927r2) r1
            java.lang.String r0 = "Lite-GPU-Monitor-Thread"
            android.os.Handler r0 = r1.BAM(r0)
            android.os.Looper r1 = r0.getLooper()
            X.0qQ.A07(r1)
            X.7rz r0 = X.C344507ry.A0A
            r2.put(r0, r1)
        L_0x013c:
            X.7qt r0 = r7.A00
            r0.getClass()
            android.content.Context r4 = r0.getContext()
            X.7ry r3 = new X.7ry
            r3.<init>(r2)
            X.7qb r1 = X.C343737qi.A0B
            X.7s1 r0 = new X.7s1
            r0.<init>()
            java.lang.Object r1 = r7.A09(r1, r0)
            X.7s1 r1 = (X.C344537s1) r1
            X.7s2 r0 = new X.7s2
            r0.<init>(r7)
            X.7s0 r2 = new X.7s0
            r2.<init>(r4, r0, r3, r1)
            r7.A05 = r2
            X.7qb r1 = X.C343737qi.A00
            X.7ro r0 = new X.7ro
            r0.<init>()
            java.lang.Object r4 = r7.A09(r1, r0)
            X.7ro r4 = (X.C344407ro) r4
            r7.A03 = r4
            android.os.Handler r0 = X.C344427rq.A00(r8)
            r7.A01 = r0
            android.os.Looper r0 = r0.getLooper()
            X.7s4 r3 = r2.A00(r0)
            X.7s8 r1 = r3.A06
            X.7s9 r0 = new X.7s9
            r0.<init>(r7)
            r1.A00 = r0
            X.7qb r0 = X.C343777qm.A00
            java.lang.Object r0 = r7.A09(r0, r5)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
            X.7sB r1 = r7.A09
            if (r1 != 0) goto L_0x01a0
            X.7sA r1 = new X.7sA
            r1.<init>(r7)
            r7.A09 = r1
        L_0x01a0:
            X.7sC r0 = new X.7sC
            r0.<init>(r4, r3, r1, r2)
            r7.A06 = r0
            X.7sK r0 = r7.AMp()
            r7.A07 = r0
            X.7qb r1 = X.C343737qi.A0E
            X.7qt r0 = r7.A00
            r0.getClass()
            java.lang.Object r0 = r0.Apu(r1)
            X.7sL r0 = (X.C344737sL) r0
            if (r0 == 0) goto L_0x01bf
            A01(r7, r0)
        L_0x01bf:
            return
        L_0x01c0:
            r0 = 0
            goto L_0x001c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C344457rt.<init>(X.7qt):void");
    }

    public final String B0U() {
        return "MediaGraphControllerImpl";
    }

    public final void EF6(Long l) {
        C344727sK.A00(this.A07, (Long) null);
    }

    public static final void A00(C344457rt r9, C382269dQ r10) {
        String str;
        C344037rD r2 = r9.A04;
        if (r2 != null) {
            C382269dQ r3 = r10;
            Throwable cause = r10.getCause();
            if ((cause instanceof Error) || (cause instanceof RuntimeException)) {
                str = "high";
            } else {
                str = "medium";
            }
            r2.CjI(r3, "media_pipeline_error", "MediaGraphControllerImpl", str, "MediaGraphControllerImpl", (Map) null, (long) r9.hashCode());
        }
    }

    public static final void A01(C344457rt r3, C344737sL r4) {
        if ((r4 instanceof C344767sO) && ((Boolean) r3.A09(C343737qi.A06, false)).booleanValue()) {
            r4 = new AnonymousClass9S8((C344767sO) r4);
        }
        C344647sC r32 = r3.A06;
        Handler handler = r32.A01;
        if (handler.getLooper() != Looper.myLooper()) {
            handler.sendMessage(Message.obtain(r32.A04.A00, 4, r4));
        } else {
            C344647sC.A00(r4, r32);
        }
    }

    private final boolean A02(int i) {
        C343937r3 r1 = C343967r6.A00;
        C343837qt r0 = this.A00;
        r0.getClass();
        if (!r0.CQO(r1)) {
            return false;
        }
        C343837qt r02 = this.A00;
        r02.getClass();
        C343917r1 Apf = r02.Apf(r1);
        0qQ.A07(Apf);
        return ((C343967r6) Apf).CTO(i);
    }

    public final C344727sK AMp() {
        C344407ro r4 = this.A03;
        C344647sC r3 = this.A06;
        return new C344727sK(new C344687sG(r4, this.A04, r3.A04), r3);
    }

    public final int AYr() {
        return this.A06.A04.A03.BYP();
    }

    public final C344407ro Abt() {
        return this.A03;
    }

    public final C344727sK Avw() {
        return this.A07;
    }

    public final C344507ry B9N() {
        C344527s0 r0 = this.A05;
        if (r0 != null) {
            return r0.A01;
        }
        return null;
    }

    public final C344567s4 B9O() {
        C344567s4 r0 = this.A06.A04;
        0qQ.A07(r0);
        return r0;
    }

    public final C344527s0 B9P() {
        return this.A05;
    }

    public final C344697sH BQ8() {
        C344697sH r0 = this.A07.A00;
        0qQ.A07(r0);
        return r0;
    }

    public final C344737sL BQ9() {
        return this.A06.A00;
    }

    public final boolean CKm() {
        C344737sL r0 = this.A06.A00;
        if (r0 != null) {
            return r0.CKm();
        }
        return false;
    }

    public final void EEt(Long l) {
        this.A07.A02(l, false);
    }

    public final void EEu(Long l, boolean z) {
        this.A07.A02(l, z);
    }

    public final void Ed1(C344737sL r4) {
        Handler handler = this.A01;
        if (!0qQ.A0K(handler.getLooper(), Looper.myLooper())) {
            handler.post(new C40939All(this, r4));
        } else {
            A01(this, r4);
        }
    }

    public final void FLA(int i, int i2, int i3, boolean z, int i4, int i5) {
        this.A07.A01(i, i2, i3, z, i4, i5);
    }

    public final Handler getHandler() {
        return this.A01;
    }

    public final void EiV(C345537tg r1) {
        this.A08 = r1;
    }
}
