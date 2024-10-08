package X;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.4QM  reason: invalid class name */
public final class AnonymousClass4QM extends AnonymousClass4PK implements Handler.Callback {
    public int A00;
    public long A01;
    public long A02;
    public C296735qY A03;
    public C296755qa A04;
    public int A05;
    public long A06;
    public C256683wB A07;
    public C296745qZ A08;
    public C296755qa A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public final Handler A0D;
    public final AnonymousClass4PO A0E;
    public final AnonymousClass4QL A0F;
    public final AnonymousClass4QJ A0G;

    /* JADX WARNING: type inference failed for: r0v3, types: [X.4PO, java.lang.Object] */
    public AnonymousClass4QM(Looper looper, AnonymousClass4QL r4, AnonymousClass4QJ r5) {
        super(3);
        Handler handler;
        this.A0G = r5;
        if (looper == null) {
            handler = null;
        } else {
            handler = new Handler(looper, this);
        }
        this.A0D = handler;
        this.A0F = r4;
        this.A0E = new Object();
        this.A01 = -9223372036854775807L;
        this.A02 = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0052  */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x001d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A02() {
        /*
            r4 = this;
            r0 = 1
            r4.A0C = r0
            X.4QL r3 = r4.A0F
            X.3wB r1 = r4.A07
            r1.getClass()
            X.4QK r3 = (X.AnonymousClass4QK) r3
            java.lang.String r2 = r1.A0W
            int r0 = r2.hashCode()
            switch(r0) {
                case 930165504: goto L_0x0042;
                case 1566015601: goto L_0x003f;
                case 1668750253: goto L_0x0025;
                default: goto L_0x0015;
            }
        L_0x0015:
            java.lang.String r0 = "application/x-mp4-vtt"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x0052
            X.QoN r1 = new X.QoN
            r1.<init>()
        L_0x0022:
            r4.A03 = r1
            return
        L_0x0025:
            java.lang.String r0 = "application/x-subrip"
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            com.facebook.video.heroplayer.setting.HeroPlayerSetting r0 = r3.A00
            boolean r0 = r0.A3H
            if (r0 == 0) goto L_0x0039
            X.5qW r1 = new X.5qW
            r1.<init>()
            goto L_0x0022
        L_0x0039:
            X.QoO r1 = new X.QoO
            r1.<init>()
            goto L_0x0022
        L_0x003f:
            java.lang.String r0 = "application/cea-608"
            goto L_0x0044
        L_0x0042:
            java.lang.String r0 = "application/x-mp4-cea-608"
        L_0x0044:
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x0015
            int r0 = r1.A03
            X.WMJ r1 = new X.WMJ
            r1.<init>(r2, r0)
            goto L_0x0022
        L_0x0052:
            java.lang.String r1 = "Attempted to create decoder for unsupported format"
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QM.A02():void");
    }

    private void A03() {
        this.A08 = null;
        this.A05 = -1;
        C296755qa r0 = this.A04;
        if (r0 != null) {
            r0.release();
            this.A04 = null;
        }
        C296755qa r02 = this.A09;
        if (r02 != null) {
            r02.release();
            this.A09 = null;
        }
    }

    public final void A0K() {
        this.A07 = null;
        this.A01 = -9223372036854775807L;
        A01();
        this.A02 = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        A03();
        C296735qY r0 = this.A03;
        r0.getClass();
        r0.release();
        this.A03 = null;
        this.A00 = 0;
    }

    public final boolean CaO() {
        return true;
    }

    public final String getName() {
        return "TextRenderer";
    }

    private long A00() {
        if (this.A05 == -1) {
            return Long.MAX_VALUE;
        }
        this.A04.getClass();
        if (this.A05 < this.A04.B2N()) {
            return this.A04.B2M(this.A05);
        }
        return Long.MAX_VALUE;
    }

    private void A01() {
        C264804Ri r0 = C264804Ri.A01;
        0sn r8 = 0sn.A00;
        boolean z = true;
        boolean z2 = false;
        if (this.A06 != -9223372036854775807L) {
            z2 = true;
        }
        C256703wD.A04(z2);
        if (this.A02 == -9223372036854775807L) {
            z = false;
        }
        C256703wD.A04(z);
        C264804Ri r2 = new C264804Ri(r8);
        Handler handler = this.A0D;
        if (handler != null) {
            handler.obtainMessage(0, r2).sendToTarget();
        } else {
            A05(r2);
        }
    }

    /* JADX WARNING: type inference failed for: r0v7, types: [java.lang.Object, X.5wO] */
    /* JADX WARNING: type inference failed for: r0v14, types: [java.lang.Object, X.5wO] */
    private void A05(C264804Ri r7) {
        AnonymousClass4QJ r4 = this.A0G;
        List<C264814Rj> list = r7.A00;
        AnonymousClass4QI r42 = (AnonymousClass4QI) r4;
        if (!r42.A03) {
            r42.A00 = 0;
            ArrayList arrayList = new ArrayList();
            for (C264814Rj r0 : list) {
                CharSequence charSequence = r0.A0C;
                ? obj = new Object();
                obj.A00 = charSequence;
                arrayList.add(obj);
            }
            r42.A01.A0v.onCues(arrayList);
        }
        r42.A00 = 0;
        ArrayList arrayList2 = new ArrayList();
        for (C264814Rj r02 : list) {
            CharSequence charSequence2 = r02.A0C;
            ? obj2 = new Object();
            obj2.A00 = charSequence2;
            arrayList2.add(obj2);
        }
        r42.A01.A0v.onCues(arrayList2);
    }

    private void A06(AnonymousClass4UK r4) {
        StringBuilder sb = new StringBuilder();
        sb.append("Subtitle decoding failed. streamFormat=");
        sb.append(this.A07);
        2AG.A05("TextRenderer", sb.toString(), r4);
        C10460Rsb rsb = new C10460Rsb(this.A07, r4);
        Handler handler = this.A0D;
        if (handler != null) {
            handler.obtainMessage(1, rsb).sendToTarget();
        } else {
            A07(rsb);
        }
        A01();
        A04();
    }

    private void A07(C10460Rsb rsb) {
        String str;
        AnonymousClass4QI r6 = (AnonymousClass4QI) this.A0G;
        long j = r6.A00;
        r6.A00 = 1 + j;
        if (j < 0) {
            if (rsb != null) {
                str = rsb.A01.getMessage();
            } else {
                str = "null";
            }
            C264014Of r4 = r6.A01.A0v;
            StringBuilder sb = new StringBuilder();
            sb.append("Subtitle decoding failed. streamFormat=");
            sb.append(rsb.A00);
            sb.append(", exception.msg=");
            sb.append(str);
            r4.E07("CAPTIONING", "PLAYBACK_EXCEPTION", sb.toString());
        }
    }

    public final void A0L(long j, boolean z) {
        this.A06 = j;
        A01();
        this.A0A = false;
        this.A0B = false;
        this.A01 = -9223372036854775807L;
        if (this.A00 != 0) {
            A04();
            return;
        }
        A03();
        C296735qY r0 = this.A03;
        r0.getClass();
        r0.flush();
    }

    public final void A0N(C256683wB[] r2, long j, long j2) {
        this.A02 = j2;
        this.A07 = r2[0];
        if (this.A03 != null) {
            this.A00 = 1;
        } else {
            A02();
        }
    }

    public final boolean CSi() {
        return this.A0B;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00a3, code lost:
        if (r8 != false) goto L_0x00a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0108 A[LOOP:1: B:67:0x0108->B:100:0x0108, LOOP_START, SYNTHETIC, Splitter:B:67:0x0108] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EEq(long r11, long r13) {
        /*
            r10 = this;
            r10.A06 = r11
            boolean r0 = r10.A07
            r5 = 1
            if (r0 == 0) goto L_0x001b
            long r1 = r10.A01
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x001b
            int r0 = (r11 > r1 ? 1 : (r11 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x001b
            r10.A03()
            r10.A0B = r5
        L_0x001b:
            boolean r0 = r10.A0B
            if (r0 != 0) goto L_0x0177
            X.5qa r0 = r10.A09
            if (r0 != 0) goto L_0x003e
            X.5qY r0 = r10.A03
            r0.getClass()
            r0.EgB(r11)
            X.5qY r0 = r10.A03     // Catch:{ 4UK -> 0x0039 }
            r0.getClass()     // Catch:{ 4UK -> 0x0039 }
            java.lang.Object r0 = r0.AOk()     // Catch:{ 4UK -> 0x0039 }
            X.5qa r0 = (X.C296755qa) r0     // Catch:{ 4UK -> 0x0039 }
            r10.A09 = r0     // Catch:{ 4UK -> 0x0039 }
            goto L_0x003e
        L_0x0039:
            r0 = move-exception
            r10.A06(r0)
            return
        L_0x003e:
            int r0 = r10.A01
            r4 = 2
            if (r0 != r4) goto L_0x0177
            X.5qa r0 = r10.A04
            r3 = 0
            if (r0 == 0) goto L_0x005d
            long r1 = r10.A00()
            r8 = 0
        L_0x004d:
            int r0 = (r1 > r11 ? 1 : (r1 == r11 ? 0 : -1))
            if (r0 > 0) goto L_0x005e
            int r0 = r10.A05
            int r0 = r0 + 1
            r10.A05 = r0
            long r1 = r10.A00()
            r8 = 1
            goto L_0x004d
        L_0x005d:
            r8 = 0
        L_0x005e:
            X.5qa r7 = r10.A09
            r2 = 0
            if (r7 == 0) goto L_0x00a3
            r1 = 4
            int r0 = r7.A00
            r0 = r0 & 4
            if (r0 != r1) goto L_0x008b
            if (r8 != 0) goto L_0x00a5
            long r8 = r10.A00()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r0 != 0) goto L_0x0080
            int r0 = r10.A00
            if (r0 != r4) goto L_0x0085
            r10.A04()
        L_0x0080:
            int r0 = r10.A00
            if (r0 != r4) goto L_0x0108
            return
        L_0x0085:
            r10.A03()
            r10.A0B = r5
            goto L_0x0080
        L_0x008b:
            long r0 = r7.A00
            int r6 = (r0 > r11 ? 1 : (r0 == r11 ? 0 : -1))
            if (r6 > 0) goto L_0x00a3
            X.5qa r0 = r10.A04
            if (r0 == 0) goto L_0x0098
            r0.release()
        L_0x0098:
            int r0 = r7.BW7(r11)
            r10.A05 = r0
            r10.A04 = r7
            r10.A09 = r2
            goto L_0x00a5
        L_0x00a3:
            if (r8 == 0) goto L_0x0080
        L_0x00a5:
            X.5qa r0 = r10.A04
            r0.getClass()
            X.5qa r0 = r10.A04
            int r6 = r0.BW7(r11)
            if (r6 == 0) goto L_0x00fe
            X.5qa r0 = r10.A04
            int r0 = r0.B2N()
            if (r0 == 0) goto L_0x00fe
            r0 = -1
            X.5qa r1 = r10.A04
            if (r6 != r0) goto L_0x00fb
            int r0 = r1.B2N()
            int r0 = r0 + -1
        L_0x00c5:
            long r0 = r1.B2M(r0)
        L_0x00c9:
            r9 = 1
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            r0 = 0
            if (r6 == 0) goto L_0x00d5
            r0 = 1
        L_0x00d5:
            X.C256703wD.A04(r0)
            long r0 = r10.A02
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 != 0) goto L_0x00df
            r9 = 0
        L_0x00df:
            X.C256703wD.A04(r9)
            X.4Ri r0 = X.C264804Ri.A01
            X.5qa r0 = r10.A04
            java.util.List r0 = r0.Atg(r11)
            X.4Ri r1 = new X.4Ri
            r1.<init>(r0)
            android.os.Handler r0 = r10.A0D
            if (r0 == 0) goto L_0x0103
            android.os.Message r0 = r0.obtainMessage(r3, r1)
            r0.sendToTarget()
            goto L_0x0080
        L_0x00fb:
            int r0 = r6 + -1
            goto L_0x00c5
        L_0x00fe:
            X.5qa r0 = r10.A04
            long r0 = r0.A00
            goto L_0x00c9
        L_0x0103:
            r10.A05(r1)
            goto L_0x0080
        L_0x0108:
            boolean r0 = r10.A0A     // Catch:{ 4UK -> 0x0173 }
            if (r0 != 0) goto L_0x0177
            X.5qZ r6 = r10.A08     // Catch:{ 4UK -> 0x0173 }
            if (r6 != 0) goto L_0x011f
            X.5qY r0 = r10.A03     // Catch:{ 4UK -> 0x0173 }
            r0.getClass()     // Catch:{ 4UK -> 0x0173 }
            java.lang.Object r6 = r0.AOh()     // Catch:{ 4UK -> 0x0173 }
            X.5qZ r6 = (X.C296745qZ) r6     // Catch:{ 4UK -> 0x0173 }
            if (r6 == 0) goto L_0x0177
            r10.A08 = r6     // Catch:{ 4UK -> 0x0173 }
        L_0x011f:
            int r0 = r10.A00     // Catch:{ 4UK -> 0x0173 }
            if (r0 != r5) goto L_0x0133
            r0 = 4
            r6.A00 = r0     // Catch:{ 4UK -> 0x0173 }
            X.5qY r0 = r10.A03     // Catch:{ 4UK -> 0x0173 }
            r0.getClass()     // Catch:{ 4UK -> 0x0173 }
            r0.E5x(r6)     // Catch:{ 4UK -> 0x0173 }
            r10.A08 = r2     // Catch:{ 4UK -> 0x0173 }
            r10.A00 = r4     // Catch:{ 4UK -> 0x0173 }
            goto L_0x0172
        L_0x0133:
            X.4PO r7 = r10.A0E     // Catch:{ 4UK -> 0x0173 }
            int r1 = r10.A0E(r7, r6, r3)     // Catch:{ 4UK -> 0x0173 }
            r0 = -4
            if (r1 != r0) goto L_0x016e
            r1 = 4
            int r0 = r6.A00     // Catch:{ 4UK -> 0x0173 }
            r0 = r0 & 4
            if (r0 != r1) goto L_0x0152
            r10.A0A = r5     // Catch:{ 4UK -> 0x0173 }
            r10.A0C = r3     // Catch:{ 4UK -> 0x0173 }
        L_0x0147:
            X.5qY r0 = r10.A03     // Catch:{ 4UK -> 0x0173 }
            r0.getClass()     // Catch:{ 4UK -> 0x0173 }
            r0.E5x(r6)     // Catch:{ 4UK -> 0x0173 }
            r10.A08 = r2     // Catch:{ 4UK -> 0x0173 }
            goto L_0x0108
        L_0x0152:
            X.3wB r0 = r7.A00     // Catch:{ 4UK -> 0x0173 }
            if (r0 == 0) goto L_0x0177
            long r0 = r0.A0M     // Catch:{ 4UK -> 0x0173 }
            r6.A00 = r0     // Catch:{ 4UK -> 0x0173 }
            r6.A00()     // Catch:{ 4UK -> 0x0173 }
            boolean r1 = r10.A0C     // Catch:{ 4UK -> 0x0173 }
            int r0 = r6.A00     // Catch:{ 4UK -> 0x0173 }
            r0 = r0 & 1
            if (r0 != r5) goto L_0x0167
            r0 = 0
            goto L_0x0168
        L_0x0167:
            r0 = 1
        L_0x0168:
            r1 = r1 & r0
            r10.A0C = r1     // Catch:{ 4UK -> 0x0173 }
            if (r1 != 0) goto L_0x0108
            goto L_0x0147
        L_0x016e:
            r0 = -3
            if (r1 != r0) goto L_0x0108
            return
        L_0x0172:
            return
        L_0x0173:
            r0 = move-exception
            r10.A06(r0)
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4QM.EEq(long, long):void");
    }

    public final int Ez5(C256683wB r4) {
        int i;
        String str = r4.A0W;
        if ("application/x-mp4-vtt".equals(str) || "application/cea-608".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str)) {
            i = 4;
        } else {
            i = 0;
            if (2Kn.A05(str)) {
                i = 1;
            }
        }
        return i | 0 | 128;
    }

    public final boolean handleMessage(Message message) {
        int i = message.what;
        if (i == 0) {
            A05((C264804Ri) message.obj);
            return true;
        } else if (i == 1) {
            A07((C10460Rsb) message.obj);
            return true;
        } else {
            throw new IllegalStateException();
        }
    }

    private void A04() {
        A03();
        C296735qY r0 = this.A03;
        r0.getClass();
        r0.release();
        this.A03 = null;
        this.A00 = 0;
        A02();
    }
}
