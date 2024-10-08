package X;

import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.util.Log;
import android.util.Pair;
import com.google.android.exoplayer2.Timeline;
import com.google.android.exoplayer2.util.Util;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/* renamed from: X.4Ru  reason: invalid class name and case insensitive filesystem */
public final class C264914Ru implements Handler.Callback, C264924Rv, C264944Rx, C264954Ry, C264964Rz, AnonymousClass4S0 {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public long A05 = -9223372036854775807L;
    public long A06;
    public C292595jD A07;
    public C265374Tp A08;
    public C264864Rp A09;
    public AnonymousClass4PL A0A;
    public AnonymousClass4P6 A0B;
    public C265164Su A0C;
    public Integer A0D = AnonymousClass05K.A00;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public boolean A0J;
    public boolean A0K;
    public boolean A0L;
    public boolean A0M;
    public boolean A0N;
    public AnonymousClass4PL[] A0O;
    public boolean A0P;
    public final int A0Q;
    public final long A0R;
    public final long A0S;
    public final Handler A0T;
    public final HandlerThread A0U;
    public final AnonymousClass4S3 A0V;
    public final AnonymousClass4S2 A0W;
    public final AnonymousClass4QZ A0X;
    public final AnonymousClass4S1 A0Y;
    public final C264744Rc A0Z;
    public final AnonymousClass4RE A0a;
    public final C264634Qq A0b;
    public final C264734Rb A0c;
    public final AnonymousClass4S6 A0d;
    public final AnonymousClass4S4 A0e;
    public final ArrayList A0f;
    public final boolean A0g;
    public final AnonymousClass4PL[] A0h;
    public final AnonymousClass4PN[] A0i;
    public final AnonymousClass28n A0j;
    public final C697227w A0k;

    /* JADX WARNING: type inference failed for: r0v13, types: [X.4S2, java.lang.Object] */
    public C264914Ru(Handler handler, AnonymousClass4QZ r15, C264894Rs r16, C264634Qq r17, C264734Rb r18, AnonymousClass28n r19, C697227w r20, AnonymousClass4PL[] r21, int i, int i2, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        AnonymousClass4PL[] r3 = r21;
        this.A0h = r3;
        C264634Qq r4 = r17;
        this.A0b = r4;
        C264734Rb r10 = r18;
        this.A0c = r10;
        this.A0X = r15;
        AnonymousClass28n r6 = r19;
        this.A0j = r6;
        this.A0J = z;
        this.A03 = i;
        this.A0N = false;
        this.A0T = handler;
        C697227w r5 = r20;
        this.A0k = r5;
        this.A0Y = new AnonymousClass4S1();
        this.A0P = z2;
        this.A0G = z3;
        this.A0E = z4;
        this.A0S = j;
        this.A00 = i2;
        this.A0I = z5;
        this.A0K = z6;
        this.A0F = z7;
        int A002 = 2BY.A00(2Bb.A02);
        this.A0Q = A002 <= 0 ? 10 : A002;
        this.A0H = j > 0;
        this.A0R = r15.Aee();
        this.A0g = r15.EJB();
        this.A0B = AnonymousClass4P6.A03;
        this.A09 = new C264864Rp(Timeline.A00, C264844Rn.A03, r10, -9223372036854775807L);
        this.A0W = new Object();
        int length = r3.length;
        AnonymousClass4PN[] r7 = new AnonymousClass4PN[length];
        this.A0i = r7;
        for (int i3 = 0; i3 < length; i3++) {
            AnonymousClass4PK r0 = r21[i3];
            r0.A00 = i3;
            r0.A04 = r16;
            r7[i3] = r0;
        }
        this.A0V = new AnonymousClass4S3(this, r5);
        this.A0e = new AnonymousClass4S4(r5);
        this.A0f = new ArrayList();
        this.A0O = new AnonymousClass4PL[0];
        this.A0a = new AnonymousClass4RE();
        this.A0Z = new C264744Rc();
        r4.A00 = this;
        r4.A01 = r6;
        HandlerThread handlerThread = new HandlerThread("ExoPlayerImplInternal:Handler", -16);
        AnonymousClass0fe.A00(handlerThread);
        this.A0U = handlerThread;
        handlerThread.start();
        Looper looper = handlerThread.getLooper();
        List list = AnonymousClass4S5.A01;
        this.A0d = new AnonymousClass4S5(new Handler(looper, this));
    }

    private Object A04(Timeline timeline, Timeline timeline2, Object obj) {
        Timeline timeline3 = timeline;
        int A062 = timeline.A06(obj);
        int A012 = timeline.A01();
        int i = -1;
        for (int i2 = 0; i2 < A012 && i == -1; i2++) {
            A062 = timeline3.A05(this.A0Z, this.A0a, A062, this.A03, this.A0N);
            if (A062 == -1) {
                return null;
            }
            i = timeline2.A06(timeline.A0C(A062));
        }
        if (i != -1) {
            return timeline2.A0C(i);
        }
        return null;
    }

    private void A08() {
        this.A0L = false;
        AnonymousClass4S3 r1 = this.A0V;
        r1.A03 = true;
        r1.A06.A00();
        this.A0e.A00();
        for (AnonymousClass4PL start : this.A0O) {
            start.start();
        }
    }

    private void A0B(byte b) {
        AnonymousClass4TC r1 = this.A0Y.A04;
        if (r1 != null && this.A0P) {
            r1.A08.FKi(b, false);
        }
    }

    public static void A0H(AnonymousClass4SA r4) {
        synchronized (r4) {
        }
        try {
            r4.A08.CIs(r4.A01, r4.A04);
        } finally {
            r4.A03(true);
        }
    }

    private void A0K(boolean z) {
        C264874Rq r4 = this.A0Y.A05.A02.A04;
        long A012 = A01(r4, this.A09.A0C, false, true);
        if (A012 != this.A09.A0C) {
            C264864Rp r5 = this.A09;
            this.A09 = r5.A01(r4, A012, r5.A01, A00());
            if (z) {
                this.A0W.A00(4);
            }
        }
    }

    private void A0M(boolean z, boolean z2) {
        A0N(true, z, z);
        this.A0W.A01 += this.A02 + (z2 ? 1 : 0);
        this.A02 = 0;
        this.A0X.onStopped();
        A0C(1);
    }

    public final synchronized void EM3(AnonymousClass4SA r3) {
        if (this.A0M) {
            Log.w("ExoPlayerImplInternal", C273654mx.A00(486));
            r3.A03(false);
        } else {
            this.A0d.CsU(r3, 14).A01();
        }
    }

    private long A00() {
        long j = this.A09.A0B;
        AnonymousClass4TC r0 = this.A0Y.A04;
        if (r0 == null) {
            return 0;
        }
        return j - (this.A06 - r0.A00);
    }

    private Pair A02(C265374Tp r18, boolean z) {
        Timeline timeline = this.A09.A03;
        C265374Tp r2 = r18;
        Timeline timeline2 = r2.A02;
        boolean z2 = false;
        if (timeline.A02() == 0) {
            z2 = true;
        }
        if (!z2) {
            boolean z3 = false;
            if (timeline2.A02() == 0) {
                z3 = true;
            }
            if (z3) {
                timeline2 = timeline;
            }
            try {
                AnonymousClass4RE r7 = this.A0a;
                C264744Rc r6 = this.A0Z;
                Pair A092 = timeline2.A09(r6, r7, r2.A00, r2.A01);
                if (timeline == timeline2 || timeline.A06(A092.first) != -1) {
                    return A092;
                }
                if (z && A04(timeline2, timeline, A092.first) != null) {
                    return timeline.A09(r6, r7, timeline.A0D(r6, -1, false).A00, -9223372036854775807L);
                }
            } catch (IndexOutOfBoundsException unused) {
                throw new V22(timeline);
            }
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r0v6, types: [X.4Rq, X.4Rr] */
    private C264874Rq A03() {
        Timeline timeline = this.A09.A03;
        if (timeline.A02() == 0) {
            return C264864Rp.A0E;
        }
        return new C264884Rr(timeline.A0C(timeline.A0E(this.A0a, timeline.A07(this.A0N), 0).A00), -1, -1, -1, -1);
    }

    private void A05() {
        AnonymousClass4S1 r7 = this.A0Y;
        AnonymousClass4TC r2 = r7.A04;
        if (!r2.A07 || r2.A08.BWC() != Long.MIN_VALUE) {
            long j = this.A06 - r2.A00;
            long AiS = r2.A08.AiS(j);
            if (this.A0I) {
                AnonymousClass4TC r5 = r7.A05;
                while (r5 != null && r5 != r2) {
                    AiS += r5.A08.AiS(this.A06 - r5.A00);
                    r5 = r5.A01;
                }
            }
            AnonymousClass4QZ r6 = this.A0X;
            float f = this.A0V.BdA().A01;
            boolean z = true;
            if (!this.A0J) {
                z = false;
            }
            boolean Ery = r6.Ery(f, j, AiS, z);
            A0L(Ery);
            if (Ery) {
                r2.A06(this.A06);
                return;
            }
            return;
        }
        A0L(false);
    }

    private void A06() {
        int i;
        AnonymousClass4S2 r5 = this.A0W;
        C264864Rp r4 = this.A09;
        if (r4 != r5.A02 || r5.A01 > 0 || r5.A03) {
            Handler handler = this.A0T;
            int i2 = r5.A01;
            if (r5.A03) {
                i = r5.A00;
            } else {
                i = -1;
            }
            handler.obtainMessage(0, i2, i, r4).sendToTarget();
            r5.A02 = this.A09;
            r5.A01 = 0;
            r5.A03 = false;
        }
    }

    private void A07() {
        AnonymousClass4S1 r0 = this.A0Y;
        AnonymousClass4TC r4 = r0.A04;
        AnonymousClass4TC r1 = r0.A06;
        if (r4 != null && !r4.A07) {
            if (r1 == null || r1.A01 == r4) {
                AnonymousClass4PL[] r3 = this.A0O;
                int length = r3.length;
                int i = 0;
                while (i < length) {
                    if (r3[i].CKV()) {
                        i++;
                    } else {
                        return;
                    }
                }
                r4.A08.Cnk();
            }
        }
    }

    private void A09() {
        AnonymousClass4S3 r1 = this.A0V;
        r1.A03 = false;
        r1.A06.A01();
        this.A0e.A01();
        for (AnonymousClass4PL r2 : this.A0O) {
            AnonymousClass4PK r22 = (AnonymousClass4PK) r2;
            if (r22.A01 == 2) {
                r22.A01 = 1;
                r22.A0I();
            }
        }
    }

    private void A0A() {
        C265364To r11;
        int i;
        AnonymousClass4S1 r5 = this.A0Y;
        AnonymousClass4TC r4 = r5.A05;
        if (r4 != null) {
            long E6K = r4.A08.E6K();
            if (E6K != -9223372036854775807L) {
                A0D(E6K);
                if (E6K != this.A09.A0C) {
                    C264864Rp r6 = this.A09;
                    this.A09 = r6.A01(r6.A05, E6K, r6.A01, A00());
                    this.A0W.A00(4);
                }
            } else {
                AnonymousClass4S3 r2 = this.A0V;
                boolean z = false;
                if (r4 != r5.A06) {
                    z = true;
                }
                long A002 = r2.A00(z);
                this.A06 = A002;
                long j = A002 - r4.A00;
                long j2 = this.A09.A0C;
                ArrayList arrayList = this.A0f;
                if (!arrayList.isEmpty()) {
                    C264864Rp r112 = this.A09;
                    C264874Rq r10 = r112.A05;
                    if (r10.A00 == -1) {
                        if (r112.A02 == j2) {
                            j2--;
                        }
                        int A062 = r112.A03.A06(r10.A04);
                        int i2 = this.A01;
                        while (i2 > 0) {
                            C265364To r1 = (C265364To) arrayList.get(i2 - 1);
                            if (r1 == null || (r1.A00 <= A062 && (r1.A00 != A062 || r1.A01 <= j2))) {
                                break;
                            }
                            i2--;
                            this.A01 = i2;
                        }
                        while (true) {
                            if (i2 >= arrayList.size() || (r11 = (C265364To) arrayList.get(i2)) == null) {
                                break;
                            } else if (r11.A02 != null && ((i = r11.A00) < A062 || (i == A062 && r11.A01 <= j2))) {
                                i2++;
                                this.A01 = i2;
                            }
                        }
                        while (r11.A02 != null && r11.A00 == A062) {
                            long j3 = r11.A01;
                            if (j3 <= j2 || j3 > j) {
                                break;
                            }
                            A0G(r11.A03);
                            int i3 = this.A01;
                            arrayList.remove(i3);
                            if (i3 < arrayList.size()) {
                                r11 = (C265364To) arrayList.get(i3);
                                if (r11 == null) {
                                    break;
                                }
                            } else {
                                break;
                            }
                        }
                    }
                }
                this.A09.A0C = j;
            }
            this.A09.A0B = r5.A04.A00();
            this.A09.A0D = A00();
            C264864Rp r3 = this.A09;
            r3.A0D = r4.A08.AiS(r3.A0C);
        }
    }

    private void A0C(int i) {
        long j;
        C264864Rp r10 = this.A09;
        int i2 = i;
        if (r10.A00 != i2) {
            Timeline timeline = r10.A03;
            C264874Rq r33 = r10.A05;
            long j2 = r10.A02;
            long j3 = r10.A01;
            boolean z = r10.A0A;
            C264844Rn r17 = r10.A06;
            C264734Rb r18 = r10.A07;
            C264874Rq r16 = r10.A04;
            long j4 = r10.A0B;
            long j5 = r10.A0D;
            long j6 = r10.A0C;
            Integer num = r10.A08;
            long j7 = j3;
            long j8 = j4;
            long j9 = j5;
            Integer num2 = num;
            int i3 = i2;
            long j10 = j2;
            Timeline timeline2 = timeline;
            C264874Rq r15 = r33;
            C264864Rp r13 = new C264864Rp(timeline2, r15, r16, r17, r18, num2, i3, j10, j7, j8, j9, j6, z, r10.A09);
            C264864Rp.A00(r10, r13);
            this.A09 = r13;
            if (i2 == 2) {
                j = System.currentTimeMillis();
            } else {
                j = -1;
            }
            this.A04 = j;
        }
    }

    private void A0D(long j) {
        AnonymousClass4TC r1 = this.A0Y.A05;
        boolean z = false;
        if (r1 != null) {
            z = true;
        }
        if (z) {
            j += r1.A00;
        }
        this.A06 = j;
        this.A0V.A06.A02(j);
        for (AnonymousClass4PL EIA : this.A0O) {
            EIA.EIA(this.A06);
        }
    }

    private void A0E(C292595jD r24, boolean z) {
        C264864Rp A012;
        boolean equals;
        AnonymousClass4S2 r2 = this.A0W;
        boolean z2 = true;
        r2.A01++;
        C292595jD r6 = r24;
        C264874Rq r14 = r6.A01;
        long j = r6.A00;
        boolean z3 = false;
        if (j == -9223372036854775807L) {
            z3 = true;
        }
        try {
            if (this.A0C == null || this.A02 > 0) {
                this.A07 = r6;
                this.A08 = null;
            } else {
                long j2 = j;
                AnonymousClass4S1 r62 = this.A0Y;
                AnonymousClass4TC r4 = r62.A05;
                boolean z4 = z;
                if (!(z || r4 == null || j == 0)) {
                    j2 = r4.A08.AZp(this.A0B, j);
                }
                UUID uuid = AnonymousClass4T7.A04;
                if (Util.A08(j2) != Util.A08(this.A09.A0C)) {
                    boolean z5 = false;
                    if (r62.A05 != r62.A06) {
                        z5 = true;
                    }
                    j = A01(r14, j2, z4, z5);
                    if (j == j) {
                        z2 = false;
                    }
                    z3 |= z2;
                }
            }
            if (equals) {
                C264864Rp r142 = this.A09;
                C264864Rp A013 = r142.A01(r142.A05, j, j, A00());
            }
        } finally {
            if (!C264864Rp.A0E.A04.equals(r14.A04)) {
                A012 = this.A09.A01(r14, j, j, A00());
            } else {
                C264864Rp r143 = this.A09;
                A012 = r143.A01(r143.A05, j, j, A00());
            }
            this.A09 = A012;
            if (z3) {
                r2.A00(2);
            }
        }
    }

    private void A0F(AnonymousClass4TC r10) {
        AnonymousClass4TC r6 = this.A0Y.A05;
        if (r6 != null && r10 != r6) {
            AnonymousClass4PL[] r8 = this.A0h;
            int length = r8.length;
            boolean[] zArr = new boolean[length];
            int i = 0;
            for (int i2 = 0; i2 < length; i2++) {
                AnonymousClass4PL r2 = r8[i2];
                boolean z = false;
                if (((AnonymousClass4PK) r2).A01 != 0) {
                    z = true;
                }
                zArr[i2] = z;
                if (r6.A04.A03[i2] != null) {
                    i++;
                }
                if (zArr[i2] && (r6.A04.A03[i2] == null || (((AnonymousClass4PK) r2).A07 && ((AnonymousClass4PK) r2).A05 == r10.A0B[i2]))) {
                    A0I(r2);
                }
            }
            this.A09 = this.A09.A02(r6.A03, r6.A04);
            A0O(zArr, i);
        }
    }

    private void A0G(AnonymousClass4SA r5) {
        Looper looper = r5.A03;
        AnonymousClass4S6 r1 = this.A0d;
        Handler handler = ((AnonymousClass4S5) r1).A00;
        if (looper == handler.getLooper()) {
            A0H(r5);
            int i = this.A09.A00;
            if (i == 3 || i == 2) {
                handler.sendEmptyMessage(2);
                return;
            }
            return;
        }
        r1.CsU(r5, 15).A01();
    }

    private void A0I(AnonymousClass4PL r4) {
        AnonymousClass4S3 r1 = this.A0V;
        if (r4 == r1.A00) {
            r1.A01 = null;
            r1.A00 = null;
            r1.A02 = true;
        }
        AnonymousClass4PK r2 = (AnonymousClass4PK) r4;
        if (r2.A01 == 2) {
            r2.A01 = 1;
            r2.A0I();
        }
        r4.APC();
    }

    private void A0J(boolean z) {
        C264874Rq r10;
        AnonymousClass4TC r11 = this.A0Y.A04;
        if (r11 == null) {
            r10 = this.A09.A05;
        } else {
            r10 = r11.A02.A04;
        }
        if (!this.A09.A04.equals(r10)) {
            C264864Rp r13 = this.A09;
            Timeline timeline = r13.A03;
            C264874Rq r19 = r13.A05;
            long j = r13.A02;
            long j2 = r13.A01;
            int i = r13.A00;
            boolean z2 = r13.A0A;
            C264844Rn r17 = r13.A06;
            C264734Rb r18 = r13.A07;
            long j3 = r13.A0B;
            long j4 = r13.A0D;
            long j5 = r13.A0C;
            Integer num = r13.A08;
            long j6 = j;
            long j7 = j2;
            long j8 = j3;
            C264874Rq r15 = r19;
            C264874Rq r16 = r10;
            Integer num2 = num;
            Timeline timeline2 = timeline;
            this.A09 = new C264864Rp(timeline2, r15, r16, r17, r18, num2, i, j6, j7, j8, j4, j5, z2, r13.A09);
        } else if (!z) {
            return;
        }
        if (r11 != null && r11.A07) {
            this.A0X.DtI(r11.A03, this.A0h, r11.A04.A04);
        }
    }

    private void A0L(boolean z) {
        C264864Rp r10 = this.A09;
        boolean z2 = z;
        if (r10.A0A != z2) {
            Timeline timeline = r10.A03;
            C264874Rq r32 = r10.A05;
            long j = r10.A02;
            long j2 = r10.A01;
            int i = r10.A00;
            C264844Rn r16 = r10.A06;
            C264734Rb r17 = r10.A07;
            C264874Rq r15 = r10.A04;
            long j3 = r10.A0B;
            long j4 = r10.A0D;
            long j5 = r10.A0C;
            Integer num = r10.A08;
            long j6 = j2;
            long j7 = j3;
            long j8 = j4;
            Integer num2 = num;
            long j9 = j;
            Timeline timeline2 = timeline;
            C264874Rq r14 = r32;
            C264864Rp r12 = new C264864Rp(timeline2, r14, r15, r16, r17, num2, i, j9, j6, j7, j8, j5, z2, r10.A09);
            C264864Rp.A00(r10, r12);
            this.A09 = r12;
        }
    }

    private void A0N(boolean z, boolean z2, boolean z3) {
        C264874Rq r7;
        long j;
        long j2;
        Timeline timeline;
        C264844Rn r9;
        C264734Rb r10;
        C265164Su r0;
        ((AnonymousClass4S5) this.A0d).A00.removeMessages(2);
        this.A0L = false;
        AnonymousClass4S3 r2 = this.A0V;
        r2.A03 = false;
        r2.A06.A01();
        this.A0e.A01();
        this.A06 = 0;
        for (AnonymousClass4PL A0I2 : this.A0O) {
            try {
                A0I(A0I2);
            } catch (C2612348u | RuntimeException e) {
                Log.e("ExoPlayerImplInternal", "Stop failed.", e);
            }
        }
        this.A0O = new AnonymousClass4PL[0];
        this.A0Y.A08(!z2);
        A0L(false);
        if (z2) {
            this.A08 = null;
        }
        if (z3) {
            ArrayList arrayList = this.A0f;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((C265364To) it.next()).A03.A03(false);
            }
            arrayList.clear();
            this.A01 = 0;
        }
        if (z2) {
            r7 = A03();
            j2 = -9223372036854775807L;
            j = -9223372036854775807L;
        } else {
            C264864Rp r5 = this.A09;
            r7 = r5.A05;
            j = r5.A0C;
            j2 = this.A09.A01;
        }
        if (z3) {
            timeline = Timeline.A00;
        } else {
            timeline = this.A09.A03;
        }
        C264864Rp r52 = this.A09;
        int i = r52.A00;
        if (z3) {
            r9 = C264844Rn.A03;
            r10 = this.A0c;
        } else {
            r9 = r52.A06;
            r10 = r52.A07;
        }
        this.A09 = new C264864Rp(timeline, r7, r7, r9, r10, AnonymousClass05K.A00, i, j, j2, j, 0, j, false, false);
        if (z && (r0 = this.A0C) != null) {
            r0.ECl(this);
            this.A0C = null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0063, code lost:
        if (r12.A09.A00 != 3) goto L_0x0065;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x006a, code lost:
        if (r16 == false) goto L_0x006c;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A0O(boolean[] r29, int r30) {
        /*
            r28 = this;
            r0 = r30
            X.4PL[] r0 = new X.AnonymousClass4PL[r0]
            r12 = r28
            r12.A0O = r0
            X.4S1 r11 = r12.A0Y
            X.4TC r0 = r11.A05
            r27 = r0
            r10 = 0
            r2 = 0
        L_0x0010:
            X.4PL[] r1 = r12.A0h
            int r0 = r1.length
            if (r10 >= r0) goto L_0x00b0
            r0 = r27
            X.4Rb r0 = r0.A04
            X.4RW[] r0 = r0.A03
            r0 = r0[r10]
            if (r0 == 0) goto L_0x00a4
            boolean r5 = r29[r10]
            int r17 = r2 + 1
            X.4TC r13 = r11.A05
            r9 = r1[r10]
            X.4PL[] r0 = r12.A0O
            r0[r2] = r9
            r8 = r9
            X.4PK r8 = (X.AnonymousClass4PK) r8
            int r0 = r8.A01
            if (r0 != 0) goto L_0x00a2
            X.4TC r0 = r11.A06
            r7 = 0
            if (r0 != r13) goto L_0x0038
            r7 = 1
        L_0x0038:
            X.4Rb r2 = r13.A04
            X.4RW[] r1 = r2.A03
            r15 = r1[r10]
            X.4RX[] r1 = r2.A04
            r4 = r1[r10]
            r3 = 0
            if (r4 == 0) goto L_0x0056
            int r2 = r4.length()
        L_0x0049:
            X.3wB[] r14 = new X.C256683wB[r2]
        L_0x004b:
            if (r3 >= r2) goto L_0x0058
            X.3wB r1 = r4.B7Q(r3)
            r14[r3] = r1
            int r3 = r3 + 1
            goto L_0x004b
        L_0x0056:
            r2 = 0
            goto L_0x0049
        L_0x0058:
            boolean r1 = r12.A0J
            if (r1 == 0) goto L_0x0065
            X.4Rp r1 = r12.A09
            int r2 = r1.A00
            r1 = 3
            r16 = 1
            if (r2 == r1) goto L_0x0067
        L_0x0065:
            r16 = 0
        L_0x0067:
            if (r5 != 0) goto L_0x006c
            r6 = 1
            if (r16 != 0) goto L_0x006d
        L_0x006c:
            r6 = 0
        L_0x006d:
            X.4TD[] r1 = r13.A0B
            r19 = r1[r10]
            long r4 = r12.A06
            boolean r1 = r12.A0F
            if (r1 != 0) goto L_0x00a8
            long r2 = r0.A00
        L_0x0079:
            long r0 = r13.A00
            r25 = r0
            r0 = 1
            r8.A03 = r15
            r8.A01 = r0
            r8.A0M(r6, r7)
            r20 = r14
            r21 = r2
            r23 = r25
            r18 = r8
            r18.EFN(r19, r20, r21, r23)
            r0 = 0
            r8.A07 = r0
            r8.A02 = r4
            r8.A0L(r4, r6)
            X.4S3 r0 = r12.A0V
            r0.A01(r9)
            if (r16 == 0) goto L_0x00a2
            r9.start()
        L_0x00a2:
            r2 = r17
        L_0x00a4:
            int r10 = r10 + 1
            goto L_0x0010
        L_0x00a8:
            X.4TB r1 = r0.A02
            long r2 = r1.A03
            long r0 = r0.A00
            long r2 = r2 + r0
            goto L_0x0079
        L_0x00b0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264914Ru.A0O(boolean[], int):void");
    }

    private boolean A0P() {
        AnonymousClass4TC r0 = this.A0Y.A05;
        AnonymousClass4TC r5 = r0.A01;
        long j = r0.A02.A00;
        if (j == -9223372036854775807L || this.A09.A0C < j) {
            return true;
        }
        if (r5 == null) {
            return false;
        }
        if (r5.A07 || r5.A02.A04.A00 != -1) {
            return true;
        }
        return false;
    }

    private boolean A0Q(C265364To r7) {
        Object obj = r7.A02;
        if (obj == null) {
            AnonymousClass4SA r0 = r7.A03;
            Timeline timeline = r0.A09;
            int i = r0.A00;
            long j = r0.A02;
            UUID uuid = AnonymousClass4T7.A04;
            Pair A022 = A02(new C265374Tp(timeline, i, Util.A07(j)), false);
            if (A022 == null) {
                return false;
            }
            int A062 = this.A09.A03.A06(A022.first);
            long longValue = ((Number) A022.second).longValue();
            Object obj2 = A022.first;
            r7.A00 = A062;
            r7.A01 = longValue;
            r7.A02 = obj2;
        } else {
            int A063 = this.A09.A03.A06(obj);
            if (A063 == -1) {
                return false;
            }
            r7.A00 = A063;
        }
        return true;
    }

    public final long A0R() {
        long j;
        AnonymousClass4TC r8 = this.A0Y.A04;
        if (r8 == null) {
            return 0;
        }
        AnonymousClass4TD[] r10 = r8.A0B;
        long j2 = Long.MAX_VALUE;
        for (AnonymousClass4TD r6 : r10) {
            if (r6 instanceof C265384Tq) {
                XDK xdk = (XDK) ((C265384Tq) r6);
                XDJ xdj = xdk.A01;
                Map map = XDJ.A0d;
                C265984Xc r7 = xdj.A0H[xdk.A00];
                synchronized (r7) {
                    if (r7.A02 == 0) {
                        j = Long.MIN_VALUE;
                    } else {
                        j = r7.A0N[r7.A04];
                    }
                }
                j2 = Math.min(j2, j);
            }
        }
        if (j2 == Long.MAX_VALUE || j2 == -9223372036854775807L) {
            return 0;
        }
        return r8.A08.AiS(j2);
    }

    public final /* bridge */ /* synthetic */ void D6K(AnonymousClass4TI r3) {
        this.A0d.CsU(r3, 10).A01();
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x001a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void DXa(X.AnonymousClass4P7 r7) {
        /*
            r6 = this;
            android.os.Handler r1 = r6.A0T
            r0 = 1
            android.os.Message r0 = r1.obtainMessage(r0, r7)
            r0.sendToTarget()
            float r5 = r7.A01
            X.4S1 r0 = r6.A0Y
            X.4TC r4 = r0.A05
            if (r4 != 0) goto L_0x0016
            X.4TC r4 = r0.A04
        L_0x0014:
            if (r4 == 0) goto L_0x002f
        L_0x0016:
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x002f
            X.4Rb r0 = r4.A04
            X.4RX[] r3 = r0.A04
            int r2 = r3.length
            r1 = 0
        L_0x0020:
            if (r1 >= r2) goto L_0x002c
            r0 = r3[r1]
            if (r0 == 0) goto L_0x0029
            r0.DXe(r5)
        L_0x0029:
            int r1 = r1 + 1
            goto L_0x0020
        L_0x002c:
            X.4TC r4 = r4.A01
            goto L_0x0014
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264914Ru.DXa(X.4P7):void");
    }

    public final void DZ1(AnonymousClass4TH r3) {
        this.A0d.CsU(r3, 9).A01();
    }

    public final void Dlq(Timeline timeline, C265164Su r5) {
        this.A0d.CsU(new AnonymousClass4T9(timeline, r5), 8).A01();
    }

    public final void DtA() {
        ((AnonymousClass4S5) this.A0d).A00.sendEmptyMessage(11);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x02be, code lost:
        if (r4.A01 == null) goto L_0x02c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x03ab, code lost:
        if (com.google.android.exoplayer2.util.Util.A08(r6) > 1000) goto L_0x03ad;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:202:0x03be, code lost:
        if (r8.CSi() == false) goto L_0x03c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:206:0x03ca, code lost:
        if (r8.CSi() == false) goto L_0x03cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:264:0x048c, code lost:
        if (A0P() != false) goto L_0x048e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:268:0x0498, code lost:
        if (((X.AnonymousClass4PK) r1).A0B == 1) goto L_0x049a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:284:0x050a, code lost:
        if (r6.A02.A05 == false) goto L_0x050c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:291:0x052e, code lost:
        if ((r8 - r1) >= ((long) r7)) goto L_0x0530;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:308:0x0570, code lost:
        if (r26 == false) goto L_0x0572;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:312:0x0580, code lost:
        if (((X.AnonymousClass4PK) r1).A0B != 1) goto L_0x0582;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:399:0x07c9, code lost:
        if (X.AnonymousClass4S1.A03(r2, r1) == false) goto L_0x07cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:400:0x07cb, code lost:
        A0K(true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:416:0x0824, code lost:
        if (r0.A0J != false) goto L_0x0826;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:421:0x0835, code lost:
        A05();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:528:0x0b1d, code lost:
        if (r8.A01 == -9223372036854775807L) goto L_0x0b1f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0158, code lost:
        if (r8.A00 < 100) goto L_0x015a;
     */
    /* JADX WARNING: Removed duplicated region for block: B:103:0x0229 A[Catch:{ all -> 0x0c31, all -> 0x0bab, 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0283 A[Catch:{ all -> 0x0c31, all -> 0x0bab, 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0437 A[Catch:{ all -> 0x0c31, all -> 0x0bab, 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:325:0x05f3 A[Catch:{ all -> 0x0c31, all -> 0x0bab, 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:349:0x0654 A[Catch:{ all -> 0x0c31, all -> 0x0bab, 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:355:0x066b A[Catch:{ all -> 0x0c31, all -> 0x0bab, 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:358:0x0682 A[Catch:{ all -> 0x0c31, all -> 0x0bab, 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }] */
    /* JADX WARNING: Removed duplicated region for block: B:98:0x021c A[Catch:{ all -> 0x0c31, all -> 0x0bab, 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:559:0x0b90=Splitter:B:559:0x0b90, B:530:0x0b20=Splitter:B:530:0x0b20, B:588:0x0c23=Splitter:B:588:0x0c23} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean handleMessage(android.os.Message r46) {
        /*
            r45 = this;
            java.lang.String r19 = "ExoPlayerImplInternal"
            r20 = 2
            r3 = 1
            r14 = 0
            r0 = r45
            r2 = r46
            int r1 = r2.what     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            switch(r1) {
                case 0: goto L_0x0c40;
                case 1: goto L_0x0bc6;
                case 2: goto L_0x00ec;
                case 3: goto L_0x0ad3;
                case 4: goto L_0x0c79;
                case 5: goto L_0x0acb;
                case 6: goto L_0x0ac0;
                case 7: goto L_0x00d1;
                case 8: goto L_0x083a;
                case 9: goto L_0x07e4;
                case 10: goto L_0x07d0;
                case 11: goto L_0x0010;
                case 12: goto L_0x07b9;
                case 13: goto L_0x07a2;
                case 14: goto L_0x0760;
                case 15: goto L_0x072e;
                case 16: goto L_0x071b;
                case 17: goto L_0x0712;
                case 18: goto L_0x06a8;
                default: goto L_0x000f;
            }     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x000f:
            return r14
        L_0x0010:
            X.4S1 r5 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r1 = r5.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0c89
            X.4S3 r1 = r0.A0V     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4P7 r1 = r1.BdA()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            float r4 = r1.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r2 = r5.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 == 0) goto L_0x0c89
            boolean r1 = r2.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0c89
            X.4Rb r22 = r2.A02(r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r9 = 4
            X.4TC r8 = r5.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r26 = r5.A09(r8)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4PL[] r7 = r0.A0h     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r6 = r7.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean[] r10 = new boolean[r6]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r24 = r1
            r21 = r8
            r23 = r10
            long r4 = r21.A01(r22, r23, r24, r26)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r2 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r2.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == r9) goto L_0x0070
            long r1 = r2.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r11 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r11 == 0) goto L_0x0070
            X.4Rp r12 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r11 = r12.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r12.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r27 = r0.A00()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = r12
            r22 = r11
            r23 = r4
            r25 = r1
            X.4Rp r1 = r21.A01(r22, r23, r25, r27)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A09 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S2 r1 = r0.A0W     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.A00(r9)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0D(r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0070:
            boolean[] r5 = new boolean[r6]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r12 = 0
            r4 = 0
        L_0x0074:
            if (r12 >= r6) goto L_0x00a6
            r11 = r7[r12]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r11
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r1.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = 0
            if (r2 == 0) goto L_0x0081
            r1 = 1
        L_0x0081:
            r5[r12] = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TD[] r1 = r8.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2 = r1[r12]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 == 0) goto L_0x008b
            int r4 = r4 + 1
        L_0x008b:
            boolean r1 = r5[r12]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x00a3
            r1 = r11
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TD r1 = r1.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 == r1) goto L_0x009a
            r0.A0I(r11)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x00a3
        L_0x009a:
            boolean r1 = r10[r12]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x00a3
            long r1 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r11.EIA(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x00a3:
            int r12 = r12 + 1
            goto L_0x0074
        L_0x00a6:
            X.4Rp r6 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rn r2 = r8.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rb r1 = r8.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r1 = r6.A02(r2, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A09 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0O(r5, r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0J(r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == r9) goto L_0x0c89
            r0.A05()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0A()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S6 r1 = r0.A0d     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S5 r1 = (X.AnonymousClass4S5) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Handler r2 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            r2.sendEmptyMessage(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x00d1:
            r0.A0N(r3, r3, r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4QZ r1 = r0.A0X     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.onReleased()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0C(r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.HandlerThread r1 = r0.A0U     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.quit()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            monitor-enter(r0)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0M = r3     // Catch:{ all -> 0x00e9 }
            r0.notifyAll()     // Catch:{ all -> 0x00e9 }
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            return r3
        L_0x00e9:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x00e9 }
            throw r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x00ec:
            long r17 = android.os.SystemClock.uptimeMillis()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Su r2 = r0.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 == 0) goto L_0x00fb
            int r1 = r0.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 <= 0) goto L_0x012a
            r2.Cnl()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x00fb:
            X.4S1 r11 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r10 = r11.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r10 == 0) goto L_0x068e
            X.4TC r15 = r11.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.String r1 = "doSomeWork"
            X.27d.A01(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0A()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = android.os.SystemClock.elapsedRealtime()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r28 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r28
            X.4TH r8 = r10.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r6 = r0.A0R     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1 - r6
            boolean r6 = r0.A0g     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r8.APR(r1, r6)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4PL[] r13 = r0.A0O     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r12 = r13.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r27 = 0
            if (r12 <= r3) goto L_0x036e
            goto L_0x036c
        L_0x012a:
            X.4S1 r8 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r4 = r8.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x0135
            r4.A07(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0135:
            X.4TC r5 = r8.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r5 == 0) goto L_0x015a
            X.4TB r1 = r5.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0211
            boolean r1 = r5.A09()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0211
            X.4TC r5 = r8.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r1 = r5.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 == 0) goto L_0x0211
            int r2 = r8.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = 100
            if (r2 >= r1) goto L_0x0211
        L_0x015a:
            long r1 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r4 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r5 != 0) goto L_0x01a8
            com.google.android.exoplayer2.Timeline r7 = r4.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r12 = r4.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r4.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r4.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r6 = r12.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rc r11 = r8.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r7.A0B(r11, r6)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r10 = r12.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r9 = -1
            if (r10 == r9) goto L_0x0197
            int r9 = r12.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rd r4 = r11.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Re[] r4 = r4.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = r4[r10]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int[] r4 = r4.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = r4[r9]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x020c
            long r4 = r12.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = r8
            r22 = r7
            r23 = r6
            r24 = r10
            r25 = r9
            r26 = r1
            r28 = r4
            X.4TB r11 = X.AnonymousClass4S1.A01(r21, r22, r23, r24, r25, r26, r28)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x01ae
        L_0x0197:
            long r1 = r12.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = r8
            r22 = r7
            r23 = r6
            r24 = r4
            r26 = r1
            X.4TB r11 = X.AnonymousClass4S1.A02(r21, r22, r23, r24, r26)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x01ae
        L_0x01a8:
            com.google.android.exoplayer2.Timeline r4 = r4.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r11 = X.AnonymousClass4S1.A00(r5, r8, r4, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x01ae:
            if (r11 == 0) goto L_0x020c
            X.4PN[] r10 = r0.A0i     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Qq r9 = r0.A0b     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4QZ r1 = r0.A0X     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4QW r26 = r1.Ab1()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Su r7 = r0.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rb r6 = r0.A0c     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r1 = r8.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x01e1
            long r4 = r11.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x01c4:
            X.4TC r1 = new X.4TC     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = r1
            r22 = r11
            r23 = r7
            r24 = r9
            r25 = r6
            r27 = r10
            r28 = r4
            r21.<init>((X.AnonymousClass4TB) r22, (X.C265164Su) r23, (X.C264634Qq) r24, (X.C264734Rb) r25, (X.AnonymousClass4QW) r26, (X.AnonymousClass4PN[]) r27, (long) r28)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r5 = r8.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r5 == 0) goto L_0x01f3
            X.4TC r4 = r8.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2 = 0
            if (r4 == 0) goto L_0x01ea
            goto L_0x01e9
        L_0x01e1:
            long r4 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r1 = r1.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r4 + r1
            goto L_0x01c4
        L_0x01e9:
            r2 = 1
        L_0x01ea:
            X.C256703wD.A04(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r2 = r5.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == r2) goto L_0x01f3
            r5.A01 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x01f3:
            r2 = 0
            r8.A07 = r2     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r8.A04 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r8.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r2 + 1
            r8.A00 = r2     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TH r4 = r1.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r11.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4.E3p(r0, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0L(r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0J(r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0211
        L_0x020c:
            X.4Su r1 = r0.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.Cnl()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0211:
            X.4TC r1 = r8.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r10 = 0
            if (r1 == 0) goto L_0x0283
            boolean r1 = r1.A09()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0283
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0225
            r0.A05()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0225:
            X.4TC r13 = r8.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r13 == 0) goto L_0x00fb
            X.4TC r9 = r8.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r11 = 0
        L_0x022c:
            boolean r1 = r0.A0J     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0287
            if (r13 == r9) goto L_0x0287
            long r6 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r1 = r13.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r2 = r0.A0F     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 != 0) goto L_0x023d
            long r4 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0244
        L_0x023d:
            X.4TB r2 = r1.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r2.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r4 + r1
        L_0x0244:
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 < 0) goto L_0x0287
            if (r11 == 0) goto L_0x024d
            r0.A06()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x024d:
            X.4TB r1 = r13.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r12 = 3
            if (r1 == 0) goto L_0x0255
            r12 = 0
        L_0x0255:
            X.4TC r11 = r8.A05()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0F(r13)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r7 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r1 = r11.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r6 = r1.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r1.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r27 = r0.A00()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = r7
            r22 = r6
            r23 = r4
            r25 = r1
            X.4Rp r1 = r21.A01(r22, r23, r25, r27)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A09 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S2 r1 = r0.A0W     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.A00(r12)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0A()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r13 = r11
            r11 = 1
            goto L_0x022c
        L_0x0283:
            r0.A0L(r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0225
        L_0x0287:
            X.4TB r1 = r9.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x034b
            X.4TC r1 = r9.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x00fb
            boolean r1 = r1.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x00fb
            r4 = 0
        L_0x0296:
            X.4PL[] r11 = r0.A0h     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r10 = r11.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 >= r10) goto L_0x02b5
            r5 = r11[r4]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TD[] r1 = r9.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2 = r1[r4]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r5
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TD r1 = r1.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != r2) goto L_0x00fb
            if (r2 == 0) goto L_0x02b2
            boolean r1 = r5.CKV()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x02b2
            goto L_0x00fb
        L_0x02b2:
            int r4 = r4 + 1
            goto L_0x0296
        L_0x02b5:
            X.4Rb r12 = r9.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r4 = r8.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x02c0
            X.4TC r2 = r4.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = 1
            if (r2 != 0) goto L_0x02c1
        L_0x02c0:
            r1 = 0
        L_0x02c1:
            X.C256703wD.A04(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r9 = r4.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r8.A06 = r9     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rb r13 = r9.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TH r1 = r9.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r6 = r1.E6K()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            r15 = 0
            if (r1 == 0) goto L_0x02db
            r15 = 1
        L_0x02db:
            r8 = 0
        L_0x02dc:
            if (r8 >= r10) goto L_0x00fb
            r7 = r11[r8]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4RW[] r2 = r12.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r2[r8]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0348
            if (r15 != 0) goto L_0x0344
            r1 = r7
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0348
            X.4RX[] r1 = r13.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = r1[r8]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4RW[] r1 = r13.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r6 = r1[r8]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r5 = 0
            if (r6 == 0) goto L_0x02fb
            r5 = 1
        L_0x02fb:
            r2 = r2[r8]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r1[r8]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r5 == 0) goto L_0x0344
            boolean r1 = r1.equals(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0344
            r2 = 0
            if (r4 == 0) goto L_0x030b
            goto L_0x030d
        L_0x030b:
            r1 = 0
            goto L_0x0311
        L_0x030d:
            int r1 = r4.length()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0311:
            X.3wB[] r6 = new X.C256683wB[r1]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0313:
            if (r2 >= r1) goto L_0x031e
            X.3wB r5 = r4.B7Q(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r6[r2] = r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r2 + 1
            goto L_0x0313
        L_0x031e:
            java.lang.String r1 = "replaceStream"
            r2 = r19
            android.util.Log.e(r2, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TD[] r1 = r9.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r22 = r1[r8]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r0.A0F     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x033c
            long r4 = r9.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r4
        L_0x0330:
            r21 = r7
            r23 = r6
            r24 = r4
            r26 = r1
            r21.EFN(r22, r23, r24, r26)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0348
        L_0x033c:
            X.4TB r1 = r9.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r1.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r9.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r4 + r1
            goto L_0x0330
        L_0x0344:
            X.4PK r7 = (X.AnonymousClass4PK) r7     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r7.A07 = r3     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0348:
            int r8 = r8 + 1
            goto L_0x02dc
        L_0x034b:
            X.4PL[] r2 = r0.A0h     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r2.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r10 >= r1) goto L_0x00fb
            r4 = r2[r10]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TD[] r1 = r9.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2 = r1[r10]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 == 0) goto L_0x0369
            r1 = r4
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TD r1 = r1.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != r2) goto L_0x0369
            boolean r1 = r4.CKV()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0369
            X.4PK r4 = (X.AnonymousClass4PK) r4     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4.A07 = r3     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0369:
            int r10 = r10 + 1
            goto L_0x034b
        L_0x036c:
            r27 = 1
        L_0x036e:
            r9 = 0
            r26 = 1
            r25 = 1
            r24 = 0
        L_0x0375:
            java.lang.String r23 = "Temporarily ignoring stream error: "
            if (r9 >= r12) goto L_0x0441
            r8 = r13[r9]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r8.EEq(r1, r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r1 = r15.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x03b2
            boolean r1 = r0.A0I     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x03ad
            boolean r1 = r8.CKV()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x03ad
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = -1
            int r6 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r6 == 0) goto L_0x03b2
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r6 = r1.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r6 = r6 - r1
            java.util.UUID r1 = X.AnonymousClass4T7.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r6 = com.google.android.exoplayer2.util.Util.A08(r6)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = (r6 > r28 ? 1 : (r6 == r28 ? 0 : -1))
            if (r1 <= 0) goto L_0x03b2
        L_0x03ad:
            r1 = r8
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.A07 = r3     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x03b2:
            boolean r1 = r8 instanceof X.AnonymousClass4QM     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x03c2
            if (r27 == 0) goto L_0x03c0
            boolean r1 = r8.CSi()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r27 = 1
            if (r1 != 0) goto L_0x03c2
        L_0x03c0:
            r27 = 0
        L_0x03c2:
            if (r25 == 0) goto L_0x03cc
            boolean r1 = r8.CSi()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r25 = 1
            if (r1 != 0) goto L_0x03ce
        L_0x03cc:
            r25 = 0
        L_0x03ce:
            boolean r1 = r8.CaO()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0434
            boolean r1 = r8.CSi()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0434
            X.4TC r1 = r11.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r1 = r1.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x03eb
            boolean r1 = r1.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x03eb
            boolean r1 = r8.CKV()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x03eb
            goto L_0x0434
        L_0x03eb:
            r7 = 0
            r8.Cnm()     // Catch:{ 47r -> 0x03f0 }
            goto L_0x0421
        L_0x03f0:
            r16 = move-exception
            java.lang.Class r2 = r16.getClass()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Class<X.47r> r1 = X.C2609547r.class
            boolean r1 = r2.equals(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0641
            boolean r1 = r0.A0H     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0641
            long r1 = r0.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r6 = (r1 > r21 ? 1 : (r1 == r21 ? 0 : -1))
            if (r6 != 0) goto L_0x0424
            java.lang.String r2 = r16.getMessage()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r23
            java.lang.String r1 = X.002.A0R(r1, r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2 = r19
            android.util.Log.w(r2, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A05 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0421:
            r0.A0A = r8     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0431
        L_0x0424:
            long r21 = java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r21 = r21 - r1
            long r1 = r0.A0S     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r6 = (r21 > r1 ? 1 : (r21 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x0641
            goto L_0x0421
        L_0x0431:
            r24 = 1
            goto L_0x0435
        L_0x0434:
            r7 = 1
        L_0x0435:
            if (r26 == 0) goto L_0x043b
            r26 = 1
            if (r7 != 0) goto L_0x043d
        L_0x043b:
            r26 = 0
        L_0x043d:
            int r9 = r9 + 1
            goto L_0x0375
        L_0x0441:
            if (r26 != 0) goto L_0x0446
            r0.A07()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0446:
            boolean r1 = r0.A0K     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0469
            if (r27 == 0) goto L_0x0469
            if (r25 != 0) goto L_0x0469
            X.4PL[] r7 = r0.A0O     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r6 = r7.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r5 = 0
        L_0x0452:
            if (r5 >= r6) goto L_0x0469
            r4 = r7[r5]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r4 instanceof X.AnonymousClass4QM     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0466
            r1 = 9223372036854775806(0x7ffffffffffffffe, double:NaN)
            r4.EEq(r1, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r25 = r4.CSi()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0466:
            int r5 = r5 + 1
            goto L_0x0452
        L_0x0469:
            X.4TB r1 = r10.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r12 = 3
            if (r25 == 0) goto L_0x047b
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 == 0) goto L_0x05de
            goto L_0x05d6
        L_0x047b:
            X.4Rp r4 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r4.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            if (r2 != r1) goto L_0x055e
            X.4PL[] r1 = r0.A0O     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x04f6
            boolean r1 = r0.A0P()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x055e
        L_0x048e:
            X.4PL r1 = r0.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x04f3
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r44 = 1
            if (r1 != r3) goto L_0x04f3
        L_0x049a:
            java.lang.Integer r1 = r0.A0D     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r31 = r1
            X.4Rp r11 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r11.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == r12) goto L_0x04e7
            com.google.android.exoplayer2.Timeline r1 = r11.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r26 = r1
            X.4Rq r1 = r11.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r27 = r1
            long r15 = r11.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r8 = r11.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r11.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r43 = r1
            X.4Rn r1 = r11.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r22 = r1
            X.4Rb r1 = r11.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = r1
            X.4Rq r1 = r11.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r13 = r1
            long r6 = r11.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r11.A0D     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r11.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r10 = new X.4Rp     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r25 = r10
            r28 = r13
            r29 = r22
            r30 = r21
            r32 = r12
            r33 = r15
            r35 = r8
            r37 = r6
            r39 = r4
            r41 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r39, r41, r43, r44)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.C264864Rp.A00(r11, r10)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A09 = r10     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = -1
            r0.A04 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x04e7:
            boolean r1 = r0.A0J     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x04ee
            r0.A08()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x04ee:
            r1 = 0
            r0.A0A = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x05eb
        L_0x04f3:
            r44 = 0
            goto L_0x049a
        L_0x04f6:
            if (r26 != 0) goto L_0x04f9
            goto L_0x0554
        L_0x04f9:
            boolean r1 = r4.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x048e
            X.4TC r6 = r11.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r6.A09()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x050c
            X.4TB r1 = r6.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r10 = 1
            if (r1 != 0) goto L_0x050d
        L_0x050c:
            r10 = 0
        L_0x050d:
            long r1 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r6.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1 - r4
            X.4TH r4 = r6.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r29 = r4.AiS(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r7 = r0.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r7 <= 0) goto L_0x0530
            long r1 = r0.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r5 = 0
            int r4 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x0530
            long r8 = r8 - r1
            long r1 = (long) r7     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r4 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r34 = 1
            if (r4 < 0) goto L_0x0532
        L_0x0530:
            r34 = 0
        L_0x0532:
            if (r10 != 0) goto L_0x048e
            X.4QZ r4 = r0.A0X     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S3 r1 = r0.A0V     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4P7 r1 = r1.BdA()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            float r2 = r1.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r0.A0L     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r31 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = r4
            r28 = r2
            r33 = r1
            boolean r1 = r27.EtV(r28, r29, r31, r33, r34)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x048e
            java.lang.Integer r1 = X.AnonymousClass05K.A0u     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x055c
        L_0x0554:
            X.4PL r1 = r0.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x055e
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Integer r1 = r1.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x055c:
            r0.A0D = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x055e:
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != r12) goto L_0x05eb
            X.4PL[] r1 = r0.A0O     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0570
            boolean r1 = r0.A0P()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0572
            goto L_0x05eb
        L_0x0570:
            if (r26 != 0) goto L_0x05eb
        L_0x0572:
            boolean r1 = r0.A0J     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0L = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4PL r1 = r0.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0582
            X.4PK r1 = (X.AnonymousClass4PK) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r44 = 1
            if (r1 == r3) goto L_0x0584
        L_0x0582:
            r44 = 0
        L_0x0584:
            X.4Rp r11 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r11.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            if (r2 == r1) goto L_0x05e8
            com.google.android.exoplayer2.Timeline r1 = r11.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r26 = r1
            X.4Rq r1 = r11.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r27 = r1
            long r15 = r11.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r8 = r11.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r11.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r43 = r1
            X.4Rn r1 = r11.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r29 = r1
            X.4Rb r1 = r11.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r22 = r1
            X.4Rq r1 = r11.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = r1
            long r6 = r11.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r11.A0D     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r11.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Integer r10 = r11.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r13 = r10
            X.4Rp r10 = new X.4Rp     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r25 = r10
            r28 = r21
            r30 = r22
            r31 = r13
            r32 = r20
            r33 = r15
            r35 = r8
            r37 = r6
            r39 = r4
            r41 = r1
            r25.<init>(r26, r27, r28, r29, r30, r31, r32, r33, r35, r37, r39, r41, r43, r44)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.C264864Rp.A00(r11, r10)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A09 = r10     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A04 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x05e8
        L_0x05d6:
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r6 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r6 > 0) goto L_0x047b
        L_0x05de:
            X.4TB r1 = r10.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x047b
            r1 = 4
            r0.A0C(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x05e8:
            r0.A09()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x05eb:
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            if (r2 != r1) goto L_0x0642
            X.4PL[] r6 = r0.A0O     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r5 = r6.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = 0
        L_0x05f7:
            if (r4 >= r5) goto L_0x0642
            r1 = r6[r4]     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.Cnm()     // Catch:{ 47r -> 0x05ff }
            goto L_0x063c
        L_0x05ff:
            r16 = move-exception
            java.lang.Class r2 = r16.getClass()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Class<X.47r> r1 = X.C2609547r.class
            boolean r1 = r2.equals(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0641
            boolean r1 = r0.A0H     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0641
            long r1 = r0.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r8 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r7 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r7 != 0) goto L_0x0631
            java.lang.String r2 = r16.getMessage()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r23
            java.lang.String r2 = X.002.A0R(r1, r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r19
            android.util.Log.w(r1, r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A05 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x063c
        L_0x0631:
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r8 = r8 - r1
            long r1 = r0.A0S     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r7 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r7 > 0) goto L_0x0641
        L_0x063c:
            int r4 = r4 + 1
            r24 = 1
            goto L_0x05f7
        L_0x0641:
            throw r16     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0642:
            boolean r1 = r0.A0J     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x064c
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == r12) goto L_0x066b
        L_0x064c:
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            if (r2 == r1) goto L_0x066b
            X.4PL[] r1 = r0.A0O     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1.length     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x065f
            r1 = 4
            if (r2 == r1) goto L_0x065f
            r1 = 1000(0x3e8, double:4.94E-321)
            goto L_0x066e
        L_0x065f:
            X.4S6 r1 = r0.A0d     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S5 r1 = (X.AnonymousClass4S5) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Handler r2 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            r2.removeMessages(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0680
        L_0x066b:
            int r1 = r0.A0Q     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = (long) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x066e:
            X.4S6 r4 = r0.A0d     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S5 r4 = (X.AnonymousClass4S5) r4     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Handler r5 = r4.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = r20
            r5.removeMessages(r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r17 = r17 + r1
            r1 = r17
            r5.sendEmptyMessageAtTime(r4, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0680:
            if (r24 != 0) goto L_0x0689
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r0.A05 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0689:
            X.27d.A00()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x068e:
            r0.A07()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r6 = 10
            X.4S6 r1 = r0.A0d     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S5 r1 = (X.AnonymousClass4S5) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Handler r5 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            r5.removeMessages(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r17 = r17 + r6
            r4 = r1
            r1 = r17
            r5.sendEmptyMessageAtTime(r4, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x06a8:
            java.lang.Object r8 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.5jD r8 = (X.C292595jD) r8     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r8.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r7 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r1 = r7.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0c89
            X.4TH r2 = r1.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4P6 r1 = X.AnonymousClass4P6.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r2.AZp(r1, r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r9 = r1 - r4
            long r9 = java.lang.Math.abs(r9)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r5 = 1200000(0x124f80, double:5.92879E-318)
            int r4 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x06cd
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x06cd:
            X.4TC r9 = r7.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r9 != 0) goto L_0x06d4
            r23 = 0
            goto L_0x06df
        L_0x06d4:
            long r4 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r6 = r9.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r4 - r6
            X.4TH r6 = r9.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r23 = r6.AiS(r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x06df:
            long r4 = r0.A0R()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r23 = r23 + r4
            X.4QZ r5 = r0.A0X     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S3 r4 = r0.A0V     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4P7 r4 = r4.BdA()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            float r4 = r4.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r25 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r21 = r5
            r22 = r4
            r27 = r14
            r28 = r14
            boolean r4 = r21.EtV(r22, r23, r25, r27, r28)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 != 0) goto L_0x0706
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0706:
            X.4Rq r5 = r8.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.5jD r4 = new X.5jD     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4.<init>(r5, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0E(r4, r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0712:
            java.lang.Object r1 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.5jD r1 = (X.C292595jD) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0E(r1, r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x071b:
            java.lang.Object r1 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.longValue()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r4 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r4 = r4.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TH r4 = r4.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4.E3Q(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x072e:
            java.lang.Object r6 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4SA r6 = (X.AnonymousClass4SA) r6     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Looper r5 = r6.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Thread r1 = r5.getThread()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.isAlive()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x074e
            java.lang.String r2 = "TAG"
            r1 = 515(0x203, float:7.22E-43)
            java.lang.String r1 = X.C273654mx.A00(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.util.Log.w(r2, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r6.A03(r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x074e:
            r4 = 0
            java.util.List r1 = X.AnonymousClass4S5.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Handler r2 = new android.os.Handler     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2.<init>(r5, r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.WmT r1 = new X.WmT     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.<init>(r0, r6)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2.post(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0760:
            java.lang.Object r5 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4SA r5 = (X.AnonymousClass4SA) r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r5.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r4 = (r1 > r6 ? 1 : (r1 == r6 ? 0 : -1))
            if (r4 != 0) goto L_0x0774
            r0.A0G(r5)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0774:
            X.4Su r1 = r0.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0796
            int r1 = r0.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 > 0) goto L_0x0796
            X.4To r2 = new X.4To     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2.<init>(r5)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r0.A0Q(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0791
            java.util.ArrayList r1 = r0.A0f     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.add(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.util.Collections.sort(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0791:
            r5.A03(r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0796:
            java.util.ArrayList r2 = r0.A0f     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4To r1 = new X.4To     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.<init>(r5)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2.add(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x07a2:
            int r1 = r2.arg1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = 0
            if (r1 == 0) goto L_0x07a8
            r4 = 1
        L_0x07a8:
            r0.A0N = r4     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r2 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            com.google.android.exoplayer2.Timeline r1 = r1.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2.A08 = r4     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = X.AnonymousClass4S1.A03(r2, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0abb
            goto L_0x07cb
        L_0x07b9:
            int r4 = r2.arg1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A03 = r4     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r2 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            com.google.android.exoplayer2.Timeline r1 = r1.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2.A01 = r4     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = X.AnonymousClass4S1.A03(r2, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0abb
        L_0x07cb:
            r0.A0K(r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0abb
        L_0x07d0:
            java.lang.Object r2 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TH r2 = (X.AnonymousClass4TH) r2     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r1 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r4 = r1.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x0c89
            X.4TH r1 = r4.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != r2) goto L_0x0c89
            long r1 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4.A07(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0835
        L_0x07e4:
            java.lang.Object r5 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TH r5 = (X.AnonymousClass4TH) r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r4 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r2 = r4.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 == 0) goto L_0x0c89
            X.4TH r1 = r2.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != r5) goto L_0x0c89
            X.4S3 r1 = r0.A0V     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4P7 r1 = r1.BdA()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            float r1 = r1.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2.A05(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rn r6 = r2.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rb r1 = r2.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4QZ r5 = r0.A0X     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4PL[] r2 = r0.A0h     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4RX[] r1 = r1.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r5.DtI(r6, r2, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r1 = r4.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x081d
            X.4TC r1 = r4.A05()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r1 = r1.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0D(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = 0
            r0.A0F(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x081d:
            boolean r1 = r0.A0G     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x0826
            boolean r2 = r0.A0J     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = 2
            if (r2 == 0) goto L_0x0827
        L_0x0826:
            r1 = 0
        L_0x0827:
            r0.A0B(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r2 = r0.A0J     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r1 = r4.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0835
            X.4TH r1 = r1.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.Efw(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0835:
            r0.A05()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x083a:
            java.lang.Object r4 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4T9 r4 = (X.AnonymousClass4T9) r4     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Su r2 = r4.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Su r1 = r0.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 != r1) goto L_0x0c89
            X.4Rp r13 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            com.google.android.exoplayer2.Timeline r11 = r13.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            com.google.android.exoplayer2.Timeline r6 = r4.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r1 = r13.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r41 = r1
            long r15 = r13.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r9 = r13.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r13.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r28 = r1
            boolean r1 = r13.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r39 = r1
            X.4Rn r1 = r13.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r23 = r1
            X.4Rb r1 = r13.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r22 = r1
            X.4Rq r1 = r13.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r21 = r1
            long r7 = r13.A0B     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r13.A0D     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r13.A0C     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Integer r12 = r13.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r18 = r12
            boolean r12 = r13.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r17 = r12
            X.4Rp r12 = new X.4Rp     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r24 = r21
            r25 = r23
            r26 = r22
            r27 = r18
            r29 = r15
            r31 = r9
            r33 = r7
            r35 = r4
            r37 = r1
            r40 = r17
            r21 = r12
            r22 = r6
            r23 = r41
            r21.<init>(r22, r23, r24, r25, r26, r27, r28, r29, r31, r33, r35, r37, r39, r40)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.C264864Rp.A00(r13, r12)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A09 = r12     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.util.ArrayList r4 = r0.A0f     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r4.size()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x089e:
            int r2 = r2 + -1
            if (r2 < 0) goto L_0x08bd
            java.lang.Object r1 = r4.get(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4To r1 = (X.C265364To) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r0.A0Q(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x089e
            java.lang.Object r1 = r4.get(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4To r1 = (X.C265364To) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4SA r1 = r1.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.A03(r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4.remove(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x089e
        L_0x08bd:
            java.util.Collections.sort(r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r4 = r0.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r12 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r4 <= 0) goto L_0x0953
            X.4S2 r2 = r0.A0W     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r2.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1 + r4
            r2.A01 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A02 = r14     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Tp r1 = r0.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r5 = 0
            if (r1 == 0) goto L_0x08e1
            android.util.Pair r1 = r0.A02(r1, r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A08 = r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 != 0) goto L_0x093b
            goto L_0x09ee
        L_0x08e1:
            X.5jD r4 = r0.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x091c
            long r1 = r4.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r7 = r4.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A07 = r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r4 = X.C264864Rp.A0E     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r5 = r4.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r4 = r7.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r4 = r5.equals(r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x0914
            int r4 = r6.A02()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x0914
            int r9 = r6.A07(r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4RE r5 = r0.A0a     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rc r4 = r0.A0Z     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r8 = r5
            r10 = r1
            r7 = r4
            android.util.Pair r4 = r6.A09(r7, r8, r9, r10)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r5 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r4 = r4.first     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r7 = r5.A07(r6, r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0914:
            X.4Rp r6 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r5 = r7.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = -1
            if (r5 == r4) goto L_0x0950
            goto L_0x094c
        L_0x091c:
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r4 = (r1 > r12 ? 1 : (r1 == r12 ? 0 : -1))
            if (r4 != 0) goto L_0x0c89
            int r1 = r6.A02()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x09ee
            boolean r1 = r0.A0N     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r11 = r6.A07(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4RE r2 = r0.A0a     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rc r1 = r0.A0Z     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r10 = r2
            r8 = r6
            r9 = r1
            android.util.Pair r1 = r8.A09(r9, r10, r11, r12)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x093b:
            java.lang.Object r5 = r1.first     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r1 = r1.second     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.longValue()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r4 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r7 = r4.A07(r6, r5)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0914
        L_0x094c:
            r8 = 0
            goto L_0x0a29
        L_0x0950:
            r8 = r1
            goto L_0x0a29
        L_0x0953:
            X.4Rp r2 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r1 = r2.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r8 = r1.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r2.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r4 = r11.A02()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 != 0) goto L_0x097a
            int r4 = r6.A02()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x0c89
            X.4S1 r4 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r7 = r4.A07(r6, r8)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r6 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r6.A0D     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r8 = r1
            r10 = r1
            r12 = r4
            X.4Rp r1 = r6.A01(r7, r8, r10, r12)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0a31
        L_0x097a:
            X.4S1 r7 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r4 = r7.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 != 0) goto L_0x0982
            X.4TC r4 = r7.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0982:
            if (r4 == 0) goto L_0x0986
            java.lang.Object r8 = r4.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0986:
            int r5 = r6.A06(r8)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r9 = -1
            if (r5 != r9) goto L_0x09f7
            java.lang.Object r1 = r0.A04(r11, r6, r8)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x09ee
            X.4Rc r5 = r0.A0Z     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rc r1 = r6.A0B(r5, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4RE r1 = r0.A0a     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r10 = r1
            r11 = r2
            r8 = r6
            r9 = r5
            android.util.Pair r1 = r8.A09(r9, r10, r11, r12)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r2 = r1.first     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r1 = r1.second     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r8 = r1.longValue()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r1 = r7.A07(r6, r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == 0) goto L_0x09ce
        L_0x09b5:
            X.4TC r2 = r4.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 == 0) goto L_0x09ce
            X.4TC r4 = r4.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r2 = r4.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r2 = r2.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r2 = r2.equals(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r2 == 0) goto L_0x09b5
            X.4TB r2 = r4.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r2 = r7.A06(r2, r6)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4.A02 = r2     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x09b5
        L_0x09ce:
            X.4TC r4 = r7.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r2 = r7.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r11 = 0
            if (r4 == r2) goto L_0x09d6
            r11 = 1
        L_0x09d6:
            r6 = r0
            r7 = r1
            r10 = r14
            long r23 = r6.A01(r7, r8, r10, r11)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r2 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r27 = r0.A00()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r25 = r8
            r21 = r2
            r22 = r1
            X.4Rp r1 = r21.A01(r22, r23, r25, r27)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0a31
        L_0x09ee:
            r1 = 4
            r0.A0C(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0N(r14, r3, r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x09f7:
            X.4Rp r4 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r8 = r4.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r4 = r8.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r4 == r9) goto L_0x0a35
            java.lang.Integer r4 = java.lang.Integer.valueOf(r5)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r4 = r7.A07(r6, r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r5 = r4.equals(r8)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r5 != 0) goto L_0x0a35
            X.4TC r6 = r7.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r5 = r7.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r10 = 0
            if (r6 == r5) goto L_0x0a15
            r10 = 1
        L_0x0a15:
            r5 = r0
            r6 = r4
            r7 = r1
            r9 = r14
            long r7 = r5.A01(r6, r7, r9, r10)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r5 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r11 = r0.A00()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r9 = r1
            X.4Rp r1 = r5.A01(r6, r7, r9, r11)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0a31
        L_0x0a29:
            long r4 = r6.A0D     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r10 = r1
            r12 = r4
            X.4Rp r1 = r6.A01(r7, r8, r10, r12)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0a31:
            r0.A09 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0a35:
            long r15 = r0.A06     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r1 = r8.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r11 = r6.A06(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TC r10 = r7.A05     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r10 != 0) goto L_0x0a43
            X.4TC r10 = r7.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0a43:
            r18 = r10
            r8 = 0
        L_0x0a46:
            if (r10 == 0) goto L_0x0abb
            if (r8 != 0) goto L_0x0a4b
            goto L_0x0a83
        L_0x0a4b:
            if (r11 == r9) goto L_0x0ab0
            java.lang.Object r2 = r10.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r1 = r6.A0C(r11)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r2.equals(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0ab0
            r1 = r15
            X.4TB r13 = X.AnonymousClass4S1.A00(r8, r7, r6, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r13 == 0) goto L_0x0ab0
            X.4TB r1 = r10.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r12 = r7.A06(r1, r6)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r10.A02 = r12     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r12.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r13.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r17 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r17 != 0) goto L_0x0ab0
            long r4 = r12.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r13.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r17 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r17 != 0) goto L_0x0ab0
            X.4Rq r2 = r12.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r1 = r13.A04     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r2.equals(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0ab0
            goto L_0x0a8b
        L_0x0a83:
            X.4TB r1 = r10.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4TB r1 = r7.A06(r1, r6)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r10.A02 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0a8b:
            X.4TB r1 = r10.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r1.A07     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0aa9
            X.4Rc r5 = r7.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4RE r4 = r7.A0A     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r2 = r7.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            boolean r1 = r7.A08     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r23 = r4
            r24 = r11
            r25 = r2
            r26 = r1
            r21 = r6
            r22 = r5
            int r11 = r21.A05(r22, r23, r24, r25, r26)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0aa9:
            X.4TC r10 = r10.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r8 = r18
            r18 = r10
            goto L_0x0a46
        L_0x0ab0:
            boolean r1 = r7.A09(r8)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r1 ^ 1
            if (r1 != 0) goto L_0x0abb
            r0.A0K(r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0abb:
            r0.A0J(r14)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0ac0:
            int r2 = r2.arg1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = 0
            if (r2 == 0) goto L_0x0ac6
            r1 = 1
        L_0x0ac6:
            r0.A0M(r1, r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0acb:
            java.lang.Object r1 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4P6 r1 = (X.AnonymousClass4P6) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0B = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0ad3:
            java.lang.Object r8 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Tp r8 = (X.C265374Tp) r8     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S2 r6 = r0.A0W     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r13 = 1
            int r1 = r6.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1 + 1
            r6.A01 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.util.Pair r5 = r0.A02(r8, r3)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r15 = 0
            r10 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r5 != 0) goto L_0x0afc
            X.4Rq r7 = r0.A03()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            r27 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0b1f
        L_0x0afc:
            java.lang.Object r4 = r5.first     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r1 = r5.second     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r27 = r1.longValue()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S1 r2 = r0.A0Y     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rp r1 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            com.google.android.exoplayer2.Timeline r1 = r1.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rq r7 = r2.A07(r1, r4)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Object r1 = r5.second     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Long r1 = (java.lang.Long) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r1 = r1.longValue()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r4 = r8.A01     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r9 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            r12 = 0
            if (r9 != 0) goto L_0x0b20
        L_0x0b1f:
            r12 = 1
        L_0x0b20:
            X.4Su r4 = r0.A0C     // Catch:{ all -> 0x0bab }
            if (r4 == 0) goto L_0x0b8b
            int r4 = r0.A02     // Catch:{ all -> 0x0bab }
            if (r4 > 0) goto L_0x0b8b
            int r4 = (r1 > r10 ? 1 : (r1 == r10 ? 0 : -1))
            if (r4 != 0) goto L_0x0b34
            r4 = 4
            r0.A0C(r4)     // Catch:{ all -> 0x0bab }
            r0.A0N(r14, r3, r14)     // Catch:{ all -> 0x0bab }
            goto L_0x0b90
        L_0x0b34:
            X.4Rp r4 = r0.A09     // Catch:{ all -> 0x0bab }
            X.4Rq r4 = r4.A05     // Catch:{ all -> 0x0bab }
            boolean r4 = r7.equals(r4)     // Catch:{ all -> 0x0bab }
            if (r4 == 0) goto L_0x0b6b
            X.4S1 r4 = r0.A0Y     // Catch:{ all -> 0x0bab }
            X.4TC r5 = r4.A05     // Catch:{ all -> 0x0bab }
            if (r5 == 0) goto L_0x0b49
            int r4 = (r1 > r15 ? 1 : (r1 == r15 ? 0 : -1))
            if (r4 == 0) goto L_0x0b49
            goto L_0x0b4c
        L_0x0b49:
            r23 = r1
            goto L_0x0b54
        L_0x0b4c:
            X.4TH r5 = r5.A08     // Catch:{ all -> 0x0bab }
            X.4P6 r4 = r0.A0B     // Catch:{ all -> 0x0bab }
            long r23 = r5.AZp(r4, r1)     // Catch:{ all -> 0x0bab }
        L_0x0b54:
            java.util.UUID r4 = X.AnonymousClass4T7.A04     // Catch:{ all -> 0x0bab }
            long r10 = com.google.android.exoplayer2.util.Util.A08(r23)     // Catch:{ all -> 0x0bab }
            X.4Rp r4 = r0.A09     // Catch:{ all -> 0x0bab }
            long r4 = r4.A0C     // Catch:{ all -> 0x0bab }
            long r8 = com.google.android.exoplayer2.util.Util.A08(r4)     // Catch:{ all -> 0x0bab }
            int r4 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0b6d
            X.4Rp r4 = r0.A09     // Catch:{ all -> 0x0bab }
            long r1 = r4.A0C     // Catch:{ all -> 0x0bab }
            goto L_0x0b90
        L_0x0b6b:
            r23 = r1
        L_0x0b6d:
            X.4S1 r4 = r0.A0Y     // Catch:{ all -> 0x0bab }
            X.4TC r5 = r4.A05     // Catch:{ all -> 0x0bab }
            X.4TC r4 = r4.A06     // Catch:{ all -> 0x0bab }
            r26 = 0
            if (r5 == r4) goto L_0x0b79
            r26 = 1
        L_0x0b79:
            r21 = r0
            r22 = r7
            r25 = r14
            long r8 = r21.A01(r22, r23, r25, r26)     // Catch:{ all -> 0x0bab }
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 != 0) goto L_0x0b88
            r13 = 0
        L_0x0b88:
            r12 = r12 | r13
            r1 = r8
            goto L_0x0b90
        L_0x0b8b:
            r0.A08 = r8     // Catch:{ all -> 0x0bab }
            r4 = 0
            r0.A07 = r4     // Catch:{ all -> 0x0bab }
        L_0x0b90:
            X.4Rp r4 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r29 = r0.A00()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r25 = r1
            r23 = r4
            r24 = r7
            X.4Rp r1 = r23.A01(r24, r25, r27, r29)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A09 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r12 == 0) goto L_0x0c89
            r1 = r20
            r6.A00(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0bab:
            r5 = move-exception
            X.4Rp r4 = r0.A09     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            long r29 = r0.A00()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r25 = r1
            r23 = r4
            r24 = r7
            X.4Rp r1 = r23.A01(r24, r25, r27, r29)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A09 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r12 == 0) goto L_0x0bc5
            r1 = r20
            r6.A00(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0bc5:
            throw r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0bc6:
            int r1 = r2.arg1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r7 = 0
            if (r1 == 0) goto L_0x0bcc
            r7 = 1
        L_0x0bcc:
            r6 = 3
            r0.A0L = r14     // Catch:{ all -> 0x0c31 }
            r0.A0J = r7     // Catch:{ all -> 0x0c31 }
            X.4S1 r2 = r0.A0Y     // Catch:{ all -> 0x0c31 }
            X.4TC r1 = r2.A04     // Catch:{ all -> 0x0c31 }
            if (r1 == 0) goto L_0x0bdc
            X.4TH r1 = r1.A08     // Catch:{ all -> 0x0c31 }
            r1.Efw(r7)     // Catch:{ all -> 0x0c31 }
        L_0x0bdc:
            if (r7 != 0) goto L_0x0bfc
            r0.A09()     // Catch:{ all -> 0x0c31 }
            r0.A0A()     // Catch:{ all -> 0x0c31 }
            r1 = r20
            r0.A0B(r1)     // Catch:{ all -> 0x0c31 }
            boolean r1 = r0.A0E     // Catch:{ all -> 0x0c31 }
            if (r1 == 0) goto L_0x0c23
            X.4TC r4 = r2.A04     // Catch:{ all -> 0x0c31 }
            if (r4 == 0) goto L_0x0c23
            X.4TH r8 = r4.A08     // Catch:{ all -> 0x0c31 }
            long r1 = r0.A06     // Catch:{ all -> 0x0c31 }
            long r4 = r4.A00     // Catch:{ all -> 0x0c31 }
            long r1 = r1 - r4
            r8.AGR(r1)     // Catch:{ all -> 0x0c31 }
            goto L_0x0c23
        L_0x0bfc:
            r0.A0B(r14)     // Catch:{ all -> 0x0c31 }
            X.4Rp r1 = r0.A09     // Catch:{ all -> 0x0c31 }
            int r2 = r1.A00     // Catch:{ all -> 0x0c31 }
            if (r2 != r6) goto L_0x0c14
            r0.A08()     // Catch:{ all -> 0x0c31 }
            X.4S6 r1 = r0.A0d     // Catch:{ all -> 0x0c31 }
            X.4S5 r1 = (X.AnonymousClass4S5) r1     // Catch:{ all -> 0x0c31 }
            android.os.Handler r2 = r1.A00     // Catch:{ all -> 0x0c31 }
            r1 = r20
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x0c31 }
            goto L_0x0c23
        L_0x0c14:
            r1 = r20
            if (r2 != r1) goto L_0x0c23
            X.4S6 r1 = r0.A0d     // Catch:{ all -> 0x0c31 }
            X.4S5 r1 = (X.AnonymousClass4S5) r1     // Catch:{ all -> 0x0c31 }
            android.os.Handler r2 = r1.A00     // Catch:{ all -> 0x0c31 }
            r1 = r20
            r2.sendEmptyMessage(r1)     // Catch:{ all -> 0x0c31 }
        L_0x0c23:
            android.os.Handler r2 = r0.A0T     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Message r1 = r2.obtainMessage(r6, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.sendToTarget()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0c31:
            r4 = move-exception
            android.os.Handler r2 = r0.A0T     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r7)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Message r1 = r2.obtainMessage(r6, r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.sendToTarget()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            throw r4     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0c40:
            java.lang.Object r5 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Su r5 = (X.C265164Su) r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r2.arg1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r4 = 0
            if (r1 == 0) goto L_0x0c4a
            r4 = 1
        L_0x0c4a:
            int r1 = r2.arg2     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2 = 0
            if (r1 == 0) goto L_0x0c50
            r2 = 1
        L_0x0c50:
            int r1 = r0.A02     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            int r1 = r1 + 1
            r0.A02 = r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0N(r3, r4, r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4QZ r1 = r0.A0X     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.DYy()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r0.A0C = r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            r0.A0C(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r2 = 0
            X.4St r5 = (X.C265154St) r5     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4Rs r1 = X.C264894Rs.A03     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r5.E4B(r1, r0, r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S6 r1 = r0.A0d     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S5 r1 = (X.AnonymousClass4S5) r1     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            android.os.Handler r2 = r1.A00     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1 = r20
            r2.sendEmptyMessage(r1)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            goto L_0x0c89
        L_0x0c79:
            java.lang.Object r2 = r2.obj     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4P7 r2 = (X.AnonymousClass4P7) r2     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S3 r1 = r0.A0V     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            r1.Efz(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            X.4S4 r1 = r0.A0e     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            if (r1 == 0) goto L_0x0c89
            r1.Efz(r2)     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
        L_0x0c89:
            r0.A06()     // Catch:{ 48u -> 0x0ca1, IOException -> 0x0caf, RuntimeException -> 0x0c8d }
            return r3
        L_0x0c8d:
            r4 = move-exception
            java.lang.String r2 = "Internal runtime error."
            r1 = r19
            android.util.Log.e(r1, r2, r4)
            r0.A0M(r14, r14)
            android.os.Handler r2 = r0.A0T
            r1 = 1000(0x3e8, float:1.401E-42)
            X.48u r4 = X.C2612348u.A01(r4, r1)
            goto L_0x0cc2
        L_0x0ca1:
            r4 = move-exception
            java.lang.String r2 = "Playback error."
            r1 = r19
            android.util.Log.e(r1, r2, r4)
            r0.A0M(r14, r14)
            android.os.Handler r2 = r0.A0T
            goto L_0x0cc2
        L_0x0caf:
            r4 = move-exception
            java.lang.String r2 = "Source error."
            r1 = r19
            android.util.Log.e(r1, r2, r4)
            r0.A0M(r14, r14)
            android.os.Handler r2 = r0.A0T
            r1 = 2000(0x7d0, float:2.803E-42)
            X.48u r4 = X.C2612348u.A00(r4, r1)
        L_0x0cc2:
            r1 = r20
            android.os.Message r1 = r2.obtainMessage(r1, r4)
            r1.sendToTarget()
            r0.A06()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C264914Ru.handleMessage(android.os.Message):boolean");
    }

    private long A01(C264874Rq r9, long j, boolean z, boolean z2) {
        A09();
        this.A0L = false;
        A0C(2);
        AnonymousClass4S1 r5 = this.A0Y;
        AnonymousClass4TC r3 = r5.A05;
        AnonymousClass4TC r4 = r3;
        while (true) {
            if (r4 != null) {
                if (r9.equals(r4.A02.A04) && r4.A07) {
                    C264864Rp r0 = this.A09;
                    r0.A03.A0B(this.A0Z, r0.A05.A04);
                    r5.A09(r4);
                    break;
                }
                r4 = r5.A05();
            } else {
                break;
            }
        }
        if (r3 != r4 || z2) {
            for (AnonymousClass4PL A0I2 : this.A0O) {
                A0I(A0I2);
            }
            this.A0O = new AnonymousClass4PL[0];
            r3 = null;
        }
        if (r4 != null) {
            A0F(r3);
            if (r4.A06) {
                AnonymousClass4TH r52 = r4.A08;
                j = r52.EL5(j, z);
                r52.APR(j - this.A0R, this.A0g);
            }
            A0D(j);
            A05();
        } else {
            r5.A08(true);
            A0D(j);
        }
        A0J(false);
        ((AnonymousClass4S5) this.A0d).A00.sendEmptyMessage(2);
        return j;
    }
}
