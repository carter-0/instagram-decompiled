package com.google.android.exoplayer2.audio;

import X.1WJ;
import X.2AG;
import X.2BQ;
import X.2BY;
import X.AnonymousClass4P7;
import X.AnonymousClass4Q0;
import X.AnonymousClass4Q2;
import X.AnonymousClass4Q3;
import X.AnonymousClass4Q4;
import X.AnonymousClass4Q6;
import X.AnonymousClass4Q7;
import X.AnonymousClass4Q8;
import X.AnonymousClass4QB;
import X.AnonymousClass4QC;
import X.AnonymousClass4QD;
import X.AnonymousClass4QE;
import X.AnonymousClass4QH;
import X.AnonymousClass4UF;
import X.AnonymousClass4UH;
import X.AnonymousClass4UI;
import X.AnonymousClass4UJ;
import X.AnonymousClass60V;
import X.AnonymousClass60W;
import X.C256683wB;
import X.C256703wD;
import X.C264384Pr;
import X.C264394Ps;
import X.C264404Pt;
import X.C264414Pu;
import X.C264434Pw;
import X.C264444Px;
import X.C264454Py;
import X.C264464Pz;
import X.C264894Rs;
import X.C299825vu;
import X.C299845vw;
import X.C697227w;
import X.C70412O5p;
import X.S4Z;
import X.SN3;
import android.media.AudioAttributes;
import android.media.AudioFormat;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Pair;
import com.google.android.exoplayer2.util.Util;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import org.webrtc.AndroidVideoDecoder;

public final class DefaultAudioSink implements AnonymousClass4Q2 {
    public static int A0n;
    public static ExecutorService A0o;
    public static AtomicInteger A0p = new AtomicInteger(0);
    public static final Object A0q = new Object();
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public long A05;
    public long A06;
    public long A07;
    public long A08;
    public long A09;
    public long A0A;
    public AudioTrack A0B;
    public C264894Rs A0C;
    public AnonymousClass4QB A0D;
    public AnonymousClass4QH A0E;
    public AnonymousClass4QC A0F;
    public C70412O5p A0G;
    public C299825vu A0H;
    public AnonymousClass4QD A0I;
    public AnonymousClass4QD A0J;
    public ByteBuffer A0K;
    public ByteBuffer A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public C264394Ps[] A0V;
    public ByteBuffer[] A0W;
    public AnonymousClass4P7 A0X;
    public C299825vu A0Y;
    public S4Z A0Z;
    public final C264384Pr A0a;
    public final C264414Pu A0b;
    public final AnonymousClass4Q6 A0c = new AnonymousClass4Q6(new AnonymousClass4Q4(this));
    public final AnonymousClass4Q8 A0d;
    public final AnonymousClass4Q3 A0e;
    public final ArrayDeque A0f;
    public final boolean A0g;
    public final AnonymousClass4Q7 A0h;
    public final AnonymousClass4Q0 A0i;
    public final AnonymousClass4QE A0j;
    public final AnonymousClass4QE A0k;
    public final C264394Ps[] A0l;
    public final C264394Ps[] A0m;

    private void A08(ByteBuffer byteBuffer, long j) {
        int write;
        AnonymousClass4QH r1;
        ByteBuffer byteBuffer2 = byteBuffer;
        if (byteBuffer.hasRemaining()) {
            ByteBuffer byteBuffer3 = this.A0L;
            boolean z = true;
            if (byteBuffer3 != null) {
                boolean z2 = false;
                if (byteBuffer3 == byteBuffer) {
                    z2 = true;
                }
                C256703wD.A03(z2);
            } else {
                this.A0L = byteBuffer;
            }
            int remaining = byteBuffer.remaining();
            int i = Util.A00;
            if (this.A0U) {
                boolean z3 = false;
                if (j != -9223372036854775807L) {
                    z3 = true;
                }
                C256703wD.A04(z3);
                write = this.A0B.write(byteBuffer2, remaining, 1, j * 1000);
            } else {
                write = this.A0B.write(byteBuffer, remaining, 1);
            }
            this.A05 = SystemClock.elapsedRealtime();
            if (write < 0) {
                if (!(write == -6 || write == -32) || this.A09 <= 0) {
                    z = false;
                }
                AnonymousClass4UF r12 = new AnonymousClass4UF(this.A0H.A07, write, z);
                AnonymousClass4QH r0 = this.A0E;
                if (r0 != null) {
                    r0.Cwm(r12);
                }
                if (!r12.A01) {
                    this.A0k.A00(r12);
                    return;
                }
                throw r12;
            }
            this.A0k.A00 = null;
            AudioTrack audioTrack = this.A0B;
            if (i >= 29 && audioTrack.isOffloadedPlayback()) {
                if (this.A09 > 0) {
                    this.A0P = false;
                }
                if (this.A0Q && (r1 = this.A0E) != null && write < remaining && !this.A0P) {
                    r1.DUx();
                }
            }
            int i2 = this.A0H.A04;
            if (i2 == 0) {
                this.A0A += (long) write;
            }
            if (write == remaining) {
                if (i2 != 0) {
                    if (byteBuffer != this.A0K) {
                        z = false;
                    }
                    C256703wD.A04(z);
                    this.A09 += ((long) this.A03) * ((long) this.A04);
                }
                this.A0L = null;
            }
        }
    }

    public final void pause() {
        this.A0Q = false;
        if (this.A0B != null) {
            AnonymousClass4Q6 r5 = this.A0c;
            r5.A0H = 0;
            r5.A04 = 0;
            r5.A02 = 0;
            r5.A09 = 0;
            r5.A0B = 0;
            r5.A0E = 0;
            r5.A0Q = false;
            if (r5.A0J == -9223372036854775807L) {
                C299845vw r0 = r5.A0L;
                r0.getClass();
                r0.A00();
                this.A0B.pause();
            }
        }
    }

    public static long A00(DefaultAudioSink defaultAudioSink) {
        C299825vu r1 = defaultAudioSink.A0H;
        if (r1.A04 == 0) {
            return defaultAudioSink.A0A / ((long) r1.A05);
        }
        return defaultAudioSink.A09;
    }

    private AudioTrack A01(C299825vu r16) {
        AnonymousClass4UI r2;
        AudioTrack audioTrack;
        try {
            boolean z = this.A0U;
            AnonymousClass4QB r4 = this.A0D;
            int i = this.A01;
            C299825vu r0 = r16;
            try {
                if (Util.A00 >= 29) {
                    audioTrack = C299825vu.A01(r4, r0, i, z);
                } else {
                    AudioAttributes A002 = C299825vu.A00(r4, z);
                    int i2 = r0.A06;
                    int i3 = r0.A02;
                    audioTrack = new AudioTrack(A002, new AudioFormat.Builder().setSampleRate(i2).setChannelMask(i3).setEncoding(r0.A03).build(), r0.A00, 1, i);
                }
                AtomicInteger atomicInteger = A0p;
                atomicInteger.incrementAndGet();
                int state = audioTrack.getState();
                if (state == 1) {
                    return audioTrack;
                }
                try {
                    audioTrack.release();
                    atomicInteger.decrementAndGet();
                } catch (Exception e) {
                    2AG.A05("DefaultAudioSink", String.format("buildAudioTrack: state=%d, audioTrackAllocated.get()=%d", new Object[]{Integer.valueOf(state), Integer.valueOf(atomicInteger.get())}), e);
                }
                int i4 = r0.A06;
                int i5 = r0.A02;
                int i6 = r0.A00;
                C256683wB r7 = r0.A07;
                boolean z2 = true;
                if (r0.A04 != 1) {
                    z2 = false;
                }
                r2 = new AnonymousClass4UI(r7, (Exception) null, state, i4, i5, i6, atomicInteger.get(), z2);
                throw r2;
            } catch (IllegalArgumentException | UnsupportedOperationException e2) {
                int i7 = r0.A06;
                int i8 = r0.A02;
                int i9 = r0.A00;
                C256683wB r3 = r0.A07;
                boolean z3 = true;
                if (r0.A04 != 1) {
                    z3 = false;
                }
                r2 = new AnonymousClass4UI(r3, e2, 0, i7, i8, i9, A0p.get(), z3);
            }
        } catch (AnonymousClass4UI e3) {
            AnonymousClass4QH r02 = this.A0E;
            if (r02 != null) {
                r02.Cwm(e3);
            }
            throw e3;
        }
    }

    public static AnonymousClass4QD A02(DefaultAudioSink defaultAudioSink) {
        AnonymousClass4QD r0 = defaultAudioSink.A0I;
        if (r0 != null) {
            return r0;
        }
        ArrayDeque arrayDeque = defaultAudioSink.A0f;
        if (!arrayDeque.isEmpty()) {
            return (AnonymousClass4QD) arrayDeque.getLast();
        }
        return defaultAudioSink.A0J;
    }

    private void A03(long j) {
        AnonymousClass4P7 r4;
        boolean z;
        if (this.A0U || !"audio/raw".equals(this.A0H.A07.A0W)) {
            r4 = AnonymousClass4P7.A03;
        } else {
            C264414Pu r1 = this.A0b;
            r4 = A02(this).A02;
            C264454Py r2 = ((C264404Pt) r1).A01;
            float f = r4.A01;
            if (r2.A01 != f) {
                r2.A01 = f;
                r2.A07 = true;
            }
            float f2 = r4.A00;
            if (r2.A00 != f2) {
                r2.A00 = f2;
                r2.A07 = true;
            }
        }
        if (this.A0U || !"audio/raw".equals(this.A0H.A07.A0W)) {
            z = false;
        } else {
            C264414Pu r12 = this.A0b;
            z = A02(this).A03;
            ((C264404Pt) r12).A00.A05 = z;
        }
        this.A0f.add(new AnonymousClass4QD(r4, Math.max(0, j), (A00(this) * 1000000) / ((long) this.A0H.A06), z));
        C264394Ps[] r5 = this.A0H.A09;
        ArrayList arrayList = new ArrayList();
        for (C264394Ps r13 : r5) {
            if (r13.isActive()) {
                arrayList.add(r13);
            } else {
                r13.flush();
            }
        }
        int size = arrayList.size();
        this.A0V = (C264394Ps[]) arrayList.toArray(new C264394Ps[size]);
        this.A0W = new ByteBuffer[size];
        int i = 0;
        while (true) {
            C264394Ps[] r14 = this.A0V;
            if (i >= r14.length) {
                break;
            }
            C264394Ps r0 = r14[i];
            r0.flush();
            this.A0W[i] = r0.BZT();
            i++;
        }
        AnonymousClass4QH r02 = this.A0E;
        if (r02 != null) {
            r02.DlM(z);
        }
    }

    private void A04(long j) {
        ByteBuffer byteBuffer;
        int length = this.A0V.length;
        int i = length;
        do {
            if (i <= 0) {
                byteBuffer = this.A0K;
                if (byteBuffer == null) {
                    byteBuffer = C264394Ps.A00;
                }
            } else {
                byteBuffer = this.A0W[i - 1];
            }
            if (i == length) {
                A08(byteBuffer, j);
            } else {
                C264394Ps r1 = this.A0V[i];
                if (i > this.A02) {
                    r1.E5v(byteBuffer);
                }
                ByteBuffer BZT = r1.BZT();
                this.A0W[i] = BZT;
                if (BZT.hasRemaining()) {
                    i++;
                    continue;
                }
            }
            if (!byteBuffer.hasRemaining()) {
                i--;
                continue;
            } else {
                return;
            }
        } while (i >= 0);
    }

    private void A05(AudioTrack audioTrack) {
        S4Z s4z = this.A0Z;
        if (s4z == null) {
            s4z = new S4Z(this);
            this.A0Z = s4z;
        }
        s4z.A00(audioTrack);
    }

    public static void A07(DefaultAudioSink defaultAudioSink) {
        if (!defaultAudioSink.A0T) {
            defaultAudioSink.A0T = true;
            AnonymousClass4Q6 r6 = defaultAudioSink.A0c;
            long A002 = A00(defaultAudioSink);
            r6.A0I = AnonymousClass4Q6.A00(r6);
            r6.A0J = SystemClock.elapsedRealtime() * 1000;
            r6.A06 = A002;
            defaultAudioSink.A0B.stop();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0037, code lost:
        if (r9.A0L != null) goto L_0x0039;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0015  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static boolean A09(com.google.android.exoplayer2.audio.DefaultAudioSink r9) {
        /*
            int r8 = r9.A02
            r7 = -1
            r6 = 1
            r5 = 0
            if (r8 != r7) goto L_0x002c
            r9.A02 = r5
            r8 = 0
        L_0x000a:
            r4 = 1
        L_0x000b:
            X.4Ps[] r3 = r9.A0V
            int r0 = r3.length
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r8 >= r0) goto L_0x002e
            r0 = r3[r8]
            if (r4 == 0) goto L_0x001c
            r0.E5u()
        L_0x001c:
            r9.A04(r1)
            boolean r0 = r0.CSi()
            if (r0 == 0) goto L_0x0039
            int r0 = r9.A02
            int r8 = r0 + 1
            r9.A02 = r8
            goto L_0x000a
        L_0x002c:
            r4 = 0
            goto L_0x000b
        L_0x002e:
            java.nio.ByteBuffer r0 = r9.A0L
            if (r0 == 0) goto L_0x003a
            r9.A08(r0, r1)
            java.nio.ByteBuffer r0 = r9.A0L
            if (r0 == 0) goto L_0x003a
        L_0x0039:
            return r5
        L_0x003a:
            r9.A02 = r7
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.A09(com.google.android.exoplayer2.audio.DefaultAudioSink):boolean");
    }

    public final void AJ2(C256683wB r31, int[] iArr, int i) {
        int i2;
        int i3;
        C264394Ps[] r12;
        int i4;
        int i5;
        int i6;
        int i7;
        int max;
        int A002;
        long j;
        C256683wB r8 = r31;
        if ("audio/raw".equals(r8.A0W)) {
            int i8 = r8.A0C;
            C256703wD.A03(Util.A0G(i8));
            int i9 = r8.A06;
            i2 = Util.A03(i8, i9);
            r12 = this.A0m;
            AnonymousClass4Q8 r3 = this.A0d;
            int i10 = r8.A08;
            int i11 = r8.A09;
            r3.A03 = i10;
            r3.A02 = i11;
            C264444Px r5 = new C264444Px(r8.A0G, i9, i8);
            int length = r12.length;
            int i12 = 0;
            while (i12 < length) {
                C264394Ps r0 = r12[i12];
                try {
                    C264444Px AIv = r0.AIv(r5);
                    if (r0.isActive()) {
                        r5 = AIv;
                    }
                    i12++;
                } catch (AnonymousClass4UJ e) {
                    throw new AnonymousClass4UH(r8, (Throwable) e);
                }
            }
            i5 = r5.A02;
            i4 = r5.A03;
            int i13 = r5.A01;
            i6 = Util.A00(i13);
            i3 = Util.A03(i5, i13);
            i7 = 0;
        } else {
            r12 = new C264394Ps[0];
            i4 = r8.A0G;
            Pair A003 = this.A0a.A00(r8);
            if (A003 != null) {
                i5 = ((Number) A003.first).intValue();
                i6 = ((Number) A003.second).intValue();
                i2 = -1;
                i3 = -1;
                i7 = 2;
            } else {
                StringBuilder sb = new StringBuilder();
                sb.append("Unable to configure passthrough for: ");
                sb.append(r8);
                throw new AnonymousClass4UH(r8, sb.toString());
            }
        }
        if (i5 == 0) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("Invalid output encoding (mode=");
            sb2.append(i7);
            sb2.append(") for: ");
            sb2.append(r8);
            throw new AnonymousClass4UH(r8, sb2.toString());
        } else if (i6 != 0) {
            int minBufferSize = AudioTrack.getMinBufferSize(i4, i6, i5);
            boolean z = false;
            if (minBufferSize != -2) {
                z = true;
            }
            C256703wD.A04(z);
            int i14 = 1;
            if (i3 != -1) {
                i14 = i3;
            }
            int i15 = r8.A05;
            if (i7 != 0) {
                if (i7 != 1) {
                    int i16 = 250000;
                    if (i5 == 5) {
                        i16 = AndroidVideoDecoder.DEQUEUE_INPUT_TIMEOUT_US;
                    }
                    if (i15 != -1) {
                        A002 = SN3.A01(RoundingMode.CEILING, i15, 8);
                    } else {
                        A002 = C264464Pz.A00(i5);
                    }
                    j = (long) i16;
                } else {
                    A002 = C264464Pz.A00(i5);
                    j = 50000000;
                }
                max = 1WJ.A01((j * ((long) A002)) / 1000000);
            } else {
                long j2 = (long) i4;
                long j3 = (long) i14;
                max = Math.max(1WJ.A01(((250000 * j2) * j3) / 1000000), Math.min(minBufferSize * 4, 1WJ.A01(((750000 * j2) * j3) / 1000000)));
            }
            C256683wB r20 = r8;
            C264394Ps[] r21 = r12;
            C299825vu r19 = new C299825vu(r20, r21, i2, i7, i3, i4, i6, i5, (((Math.max(minBufferSize, (int) (((double) max) * 1.0d)) + i14) - 1) / i14) * i14, this.A0U);
            if (this.A0B != null) {
                this.A0Y = r19;
            } else {
                this.A0H = r19;
            }
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append("Invalid output channel config (mode=");
            sb3.append(i7);
            sb3.append(") for: ");
            sb3.append(r8);
            throw new AnonymousClass4UH(r8, sb3.toString());
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b3, code lost:
        if (r15 != false) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b8, code lost:
        if (r15 == false) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00cf, code lost:
        if (r15 == false) goto L_0x00b5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final long AuK(boolean r22) {
        /*
            r21 = this;
            r12 = r21
            android.media.AudioTrack r0 = r12.A0B
            if (r0 == 0) goto L_0x034a
            boolean r0 = r12.A0R
            if (r0 != 0) goto L_0x034a
            X.4Q6 r11 = r12.A0c
            android.media.AudioTrack r0 = r11.A0K
            r0.getClass()
            int r0 = r0.getPlayState()
            r9 = 3
            if (r0 != r9) goto L_0x01e1
            long r4 = java.lang.System.nanoTime()
            r0 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r0
            long r0 = r11.A09
            long r6 = r4 - r0
            r1 = 30000(0x7530, double:1.4822E-319)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0071
            long r0 = X.AnonymousClass4Q6.A00(r11)
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r2
            int r2 = r11.A03
            long r2 = (long) r2
            long r0 = r0 / r2
            r6 = 0
            int r2 = (r0 > r6 ? 1 : (r0 == r6 ? 0 : -1))
            if (r2 == 0) goto L_0x01e1
            long[] r8 = r11.A0T
            int r10 = r11.A02
            float r13 = r11.A00
            r2 = 1065353216(0x3f800000, float:1.0)
            int r2 = (r13 > r2 ? 1 : (r13 == r2 ? 0 : -1))
            if (r2 == 0) goto L_0x004e
            double r2 = (double) r0
            double r0 = (double) r13
            double r2 = r2 / r0
            long r0 = java.lang.Math.round(r2)
        L_0x004e:
            long r0 = r0 - r4
            r8[r10] = r0
            int r1 = r10 + 1
            r0 = 10
            int r1 = r1 % r0
            r11.A02 = r1
            int r13 = r11.A04
            if (r13 >= r0) goto L_0x0060
            int r13 = r13 + 1
            r11.A04 = r13
        L_0x0060:
            r11.A09 = r4
            r11.A0H = r6
            r10 = 0
        L_0x0065:
            if (r10 >= r13) goto L_0x0071
            r2 = r8[r10]
            long r0 = (long) r13
            long r2 = r2 / r0
            long r6 = r6 + r2
            r11.A0H = r6
            int r10 = r10 + 1
            goto L_0x0065
        L_0x0071:
            X.5vw r10 = r11.A0L
            r10.getClass()
            X.5vx r8 = r10.A05
            long r0 = r10.A03
            long r6 = r4 - r0
            long r0 = r10.A04
            int r2 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r2 < 0) goto L_0x00ba
            r10.A03 = r4
            android.media.AudioTrack r0 = r8.A04
            android.media.AudioTimestamp r6 = r8.A03
            boolean r15 = r0.getTimestamp(r6)
            if (r15 == 0) goto L_0x00a7
            long r2 = r6.framePosition
            long r0 = r8.A01
            int r7 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r7 <= 0) goto L_0x009d
            long r0 = r8.A02
            r13 = 1
            long r0 = r0 + r13
            r8.A02 = r0
        L_0x009d:
            r8.A01 = r2
            long r0 = r8.A02
            r7 = 32
            long r0 = r0 << r7
            long r2 = r2 + r0
            r8.A00 = r2
        L_0x00a7:
            int r0 = r10.A00
            r7 = 1
            if (r0 == 0) goto L_0x00d2
            r13 = 2
            if (r0 == r7) goto L_0x00f6
            if (r0 == r13) goto L_0x00cf
            if (r0 != r9) goto L_0x00b8
            if (r15 == 0) goto L_0x00ba
        L_0x00b5:
            r10.A00()
        L_0x00b8:
            if (r15 != 0) goto L_0x0108
        L_0x00ba:
            boolean r0 = r11.A0O
            if (r0 == 0) goto L_0x01e1
            java.lang.reflect.Method r3 = r11.A0M
            if (r3 == 0) goto L_0x01e1
            long r0 = r11.A08
            long r6 = r4 - r0
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x01e1
            goto L_0x01a4
        L_0x00cf:
            if (r15 != 0) goto L_0x0108
            goto L_0x00b5
        L_0x00d2:
            if (r15 == 0) goto L_0x00e8
            long r0 = r6.nanoTime
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 / r2
            long r2 = r10.A02
            int r9 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r9 < 0) goto L_0x00ba
            long r0 = r8.A00
            r10.A01 = r0
            r10.A00 = r7
            r0 = 5000(0x1388, double:2.4703E-320)
            goto L_0x0105
        L_0x00e8:
            long r0 = r10.A02
            long r13 = r4 - r0
            r1 = 500000(0x7a120, double:2.47033E-318)
            int r0 = (r13 > r1 ? 1 : (r13 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x00ba
            r10.A00 = r9
            goto L_0x0102
        L_0x00f6:
            if (r15 == 0) goto L_0x00b5
            long r2 = r8.A00
            long r0 = r10.A01
            int r7 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r7 <= 0) goto L_0x0108
            r10.A00 = r13
        L_0x0102:
            r0 = 10000000(0x989680, double:4.9406565E-317)
        L_0x0105:
            r10.A04 = r0
            goto L_0x00b8
        L_0x0108:
            long r6 = r6.nanoTime
            r0 = 1000(0x3e8, double:4.94E-321)
            long r6 = r6 / r0
            long r2 = r8.A00
            long r0 = X.AnonymousClass4Q6.A00(r11)
            r19 = 1000000(0xf4240, double:4.940656E-318)
            long r0 = r0 * r19
            int r8 = r11.A03
            long r8 = (long) r8
            long r0 = r0 / r8
            long r13 = r6 - r4
            long r17 = java.lang.Math.abs(r13)
            r15 = 5000000(0x4c4b40, double:2.470328E-317)
            int r13 = (r17 > r15 ? 1 : (r17 == r15 ? 0 : -1))
            if (r13 <= 0) goto L_0x0182
            X.4Q5 r13 = r11.A0S
            X.4Q4 r13 = (X.AnonymousClass4Q4) r13
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Spurious audio timestamp (system clock mismatch): "
        L_0x0134:
            r8.append(r9)
            r8.append(r2)
            java.lang.String r9 = ", "
            r8.append(r9)
            r8.append(r6)
            r8.append(r9)
            r8.append(r4)
            r8.append(r9)
            r8.append(r0)
            r8.append(r9)
            com.google.android.exoplayer2.audio.DefaultAudioSink r6 = r13.A00
            X.5vu r2 = r6.A0H
            int r0 = r2.A04
            if (r0 != 0) goto L_0x017f
            long r0 = r6.A08
            int r2 = r2.A01
            long r2 = (long) r2
            long r0 = r0 / r2
        L_0x015f:
            r8.append(r0)
            r8.append(r9)
            long r0 = A00(r6)
            r8.append(r0)
            java.lang.String r1 = r8.toString()
            java.lang.String r0 = "DefaultAudioSink"
            X.2AG.A04(r0, r1)
            r0 = 4
            r10.A00 = r0
            r0 = 500000(0x7a120, double:2.47033E-318)
            r10.A04 = r0
            goto L_0x00ba
        L_0x017f:
            long r0 = r6.A07
            goto L_0x015f
        L_0x0182:
            long r13 = r2 * r19
            long r13 = r13 / r8
            long r13 = r13 - r0
            long r13 = java.lang.Math.abs(r13)
            int r8 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r8 <= 0) goto L_0x019a
            X.4Q5 r13 = r11.A0S
            X.4Q4 r13 = (X.AnonymousClass4Q4) r13
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "Spurious audio timestamp (frame position mismatch): "
            goto L_0x0134
        L_0x019a:
            int r1 = r10.A00
            r0 = 4
            if (r1 != r0) goto L_0x00ba
            r10.A00()
            goto L_0x00ba
        L_0x01a4:
            android.media.AudioTrack r1 = r11.A0K     // Catch:{ Exception -> 0x01dc }
            r1.getClass()     // Catch:{ Exception -> 0x01dc }
            r0 = 0
            java.lang.Object[] r0 = new java.lang.Object[r0]     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r3.invoke(r1, r0)     // Catch:{ Exception -> 0x01dc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01dc }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01dc }
            long r0 = (long) r0     // Catch:{ Exception -> 0x01dc }
            r2 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r2
            long r2 = r11.A05     // Catch:{ Exception -> 0x01dc }
            long r0 = r0 - r2
            r11.A0C = r0     // Catch:{ Exception -> 0x01dc }
            r2 = 0
            long r0 = java.lang.Math.max(r0, r2)     // Catch:{ Exception -> 0x01dc }
            r11.A0C = r0     // Catch:{ Exception -> 0x01dc }
            r7 = 5000000(0x4c4b40, double:2.470328E-317)
            int r6 = (r0 > r7 ? 1 : (r0 == r7 ? 0 : -1))
            if (r6 <= 0) goto L_0x01df
            java.lang.String r6 = "Ignoring impossibly large audio latency: "
            java.lang.String r1 = X.002.A0Q(r6, r0)     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = "DefaultAudioSink"
            X.2AG.A04(r0, r1)     // Catch:{ Exception -> 0x01dc }
            r11.A0C = r2     // Catch:{ Exception -> 0x01dc }
            goto L_0x01df
        L_0x01dc:
            r0 = 0
            r11.A0M = r0
        L_0x01df:
            r11.A08 = r4
        L_0x01e1:
            long r4 = java.lang.System.nanoTime()
            r15 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 / r15
            X.5vw r2 = r11.A0L
            r2.getClass()
            int r1 = r2.A00
            r0 = 2
            if (r1 != r0) goto L_0x029f
            r8 = 1
            X.5vx r6 = r2.A05
            long r2 = r6.A00
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            int r0 = r11.A03
            long r0 = (long) r0
            long r2 = r2 / r0
            android.media.AudioTimestamp r0 = r6.A03
            long r6 = r0.nanoTime
            long r6 = r6 / r15
            long r0 = r4 - r6
            float r6 = r11.A00
            long r0 = com.google.android.exoplayer2.util.Util.A05(r6, r0)
            long r2 = r2 + r0
        L_0x020d:
            boolean r0 = r11.A0P
            if (r0 == r8) goto L_0x0219
            long r0 = r11.A0B
            r11.A0E = r0
            long r0 = r11.A0A
            r11.A0D = r0
        L_0x0219:
            long r6 = r11.A0E
            long r0 = r4 - r6
            r13 = 1000000(0xf4240, double:4.940656E-318)
            int r6 = (r0 > r13 ? 1 : (r0 == r13 ? 0 : -1))
            if (r6 >= 0) goto L_0x0235
            long r6 = r11.A0D
            float r9 = r11.A00
            long r9 = com.google.android.exoplayer2.util.Util.A05(r9, r0)
            long r6 = r6 + r9
            long r0 = r0 * r15
            long r0 = r0 / r13
            long r2 = r2 * r0
            long r9 = r15 - r0
            long r9 = r9 * r6
            long r2 = r2 + r9
            long r2 = r2 / r15
        L_0x0235:
            boolean r0 = r11.A0Q
            if (r0 != 0) goto L_0x026d
            long r0 = r11.A0A
            int r6 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r6 <= 0) goto L_0x026d
            r6 = 1
            r11.A0Q = r6
            long r6 = r2 - r0
            long r6 = com.google.android.exoplayer2.util.Util.A08(r6)
            float r9 = r11.A00
            r0 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0257
            double r0 = (double) r6
            double r6 = (double) r9
            double r0 = r0 / r6
            long r6 = java.lang.Math.round(r0)
        L_0x0257:
            long r0 = java.lang.System.currentTimeMillis()
            long r6 = com.google.android.exoplayer2.util.Util.A08(r6)
            long r0 = r0 - r6
            X.4Q5 r6 = r11.A0S
            X.4Q4 r6 = (X.AnonymousClass4Q4) r6
            com.google.android.exoplayer2.audio.DefaultAudioSink r6 = r6.A00
            X.4QH r6 = r6.A0E
            if (r6 == 0) goto L_0x026d
            r6.DYD(r0)
        L_0x026d:
            r11.A0B = r4
            r11.A0A = r2
            r11.A0P = r8
            X.5vu r0 = r12.A0H
            long r4 = A00(r12)
            long r4 = r4 * r13
            int r0 = r0.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r4 = java.lang.Math.min(r2, r4)
        L_0x0282:
            java.util.ArrayDeque r3 = r12.A0f
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x02c7
            java.lang.Object r0 = r3.getFirst()
            X.4QD r0 = (X.AnonymousClass4QD) r0
            long r1 = r0.A00
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x02c7
            java.lang.Object r0 = r3.remove()
            X.4QD r0 = (X.AnonymousClass4QD) r0
            r12.A0J = r0
            goto L_0x0282
        L_0x029f:
            r8 = 0
            int r0 = r11.A04
            if (r0 != 0) goto L_0x02bd
            long r2 = X.AnonymousClass4Q6.A00(r11)
            r0 = 1000000(0xf4240, double:4.940656E-318)
            long r2 = r2 * r0
            int r0 = r11.A03
            long r0 = (long) r0
            long r2 = r2 / r0
        L_0x02b0:
            if (r22 != 0) goto L_0x020d
            r6 = 0
            long r0 = r11.A0C
            long r2 = r2 - r0
            long r2 = java.lang.Math.max(r6, r2)
            goto L_0x020d
        L_0x02bd:
            long r0 = r11.A0H
            long r0 = r0 + r4
            float r2 = r11.A00
            long r2 = com.google.android.exoplayer2.util.Util.A05(r2, r0)
            goto L_0x02b0
        L_0x02c7:
            X.4QD r2 = r12.A0J
            long r0 = r2.A00
            long r6 = r4 - r0
            X.4P7 r1 = r2.A02
            X.4P7 r0 = X.AnonymousClass4P7.A03
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x02eb
            long r2 = r2.A01
            long r2 = r2 + r6
        L_0x02da:
            X.5vu r6 = r12.A0H
            X.4Pu r0 = r12.A0b
            X.4Pt r0 = (X.C264404Pt) r0
            X.4Pv r0 = r0.A00
            long r4 = r0.A04
            long r4 = r4 * r13
            int r0 = r6.A06
            long r0 = (long) r0
            long r4 = r4 / r0
            long r2 = r2 + r4
            return r2
        L_0x02eb:
            boolean r0 = r3.isEmpty()
            if (r0 == 0) goto L_0x0333
            X.4Pu r0 = r12.A0b
            X.4Pt r0 = (X.C264404Pt) r0
            X.4Py r3 = r0.A01
            long r4 = r3.A03
            r1 = 1024(0x400, double:5.06E-321)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x032c
            long r8 = r3.A02
            X.SSs r0 = r3.A06
            r0.getClass()
            int r1 = r0.A00
            int r0 = r0.A0G
            int r1 = r1 * r0
            int r0 = r1 * 2
            long r0 = (long) r0
            long r8 = r8 - r0
            X.4Px r0 = r3.A05
            int r1 = r0.A03
            X.4Px r0 = r3.A04
            int r2 = r0.A03
            if (r1 != r2) goto L_0x0325
            long r10 = r3.A03
        L_0x031b:
            long r4 = com.google.android.exoplayer2.util.Util.A09(r6, r8, r10)
        L_0x031f:
            X.4QD r0 = r12.A0J
            long r2 = r0.A01
            long r2 = r2 + r4
            goto L_0x02da
        L_0x0325:
            long r0 = (long) r1
            long r8 = r8 * r0
            long r10 = r3.A03
            long r0 = (long) r2
            long r10 = r10 * r0
            goto L_0x031b
        L_0x032c:
            float r0 = r3.A01
            double r2 = (double) r0
            double r0 = (double) r6
            double r2 = r2 * r0
            long r4 = (long) r2
            goto L_0x031f
        L_0x0333:
            java.lang.Object r3 = r3.getFirst()
            X.4QD r3 = (X.AnonymousClass4QD) r3
            long r1 = r3.A00
            long r1 = r1 - r4
            X.4QD r0 = r12.A0J
            X.4P7 r0 = r0.A02
            float r0 = r0.A01
            long r0 = com.google.android.exoplayer2.util.Util.A05(r0, r1)
            long r2 = r3.A01
            long r2 = r2 - r0
            goto L_0x02da
        L_0x034a:
            r2 = -9223372036854775808
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.AuK(boolean):long");
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x002c A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int B7U(X.C256683wB r5) {
        /*
            r4 = this;
            java.lang.String r1 = r5.A0W
            java.lang.String r0 = "audio/raw"
            boolean r0 = r0.equals(r1)
            r3 = 0
            r2 = 2
            if (r0 == 0) goto L_0x0024
            int r1 = r5.A0C
            boolean r0 = com.google.android.exoplayer2.util.Util.A0G(r1)
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "Invalid PCM encoding: "
            java.lang.String r1 = X.002.A0O(r0, r1)
            java.lang.String r0 = "DefaultAudioSink"
            X.2AG.A04(r0, r1)
        L_0x001f:
            return r3
        L_0x0020:
            if (r1 == r2) goto L_0x002c
            r2 = 1
            return r2
        L_0x0024:
            X.4Pr r0 = r4.A0a
            android.util.Pair r0 = r0.A00(r5)
            if (r0 == 0) goto L_0x001f
        L_0x002c:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.B7U(X.3wB):int");
    }

    /* JADX WARNING: type inference failed for: r2v136, types: [X.60U, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:174:0x0380, code lost:
        r2 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:195:0x03ce, code lost:
        if (r4 != 3) goto L_0x03d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        if (r8 == r1) goto L_0x000d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:223:0x0454  */
    /* JADX WARNING: Removed duplicated region for block: B:229:0x0474  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean CIL(java.nio.ByteBuffer r31, int r32, long r33) {
        /*
            r30 = this;
            r9 = r30
            java.nio.ByteBuffer r1 = r9.A0K
            r10 = 1
            r15 = 0
            r8 = r31
            if (r1 == 0) goto L_0x000d
            r0 = 0
            if (r8 != r1) goto L_0x000e
        L_0x000d:
            r0 = 1
        L_0x000e:
            X.C256703wD.A03(r0)
            X.5vu r2 = r9.A0Y
            r18 = 0
            r0 = r33
            if (r2 == 0) goto L_0x0075
            boolean r2 = A09(r9)
            if (r2 == 0) goto L_0x04ac
            X.5vu r4 = r9.A0Y
            X.5vu r5 = r9.A0H
            int r3 = r5.A04
            int r2 = r4.A04
            if (r3 != r2) goto L_0x007a
            int r3 = r5.A03
            int r2 = r4.A03
            if (r3 != r2) goto L_0x007a
            int r3 = r5.A06
            int r2 = r4.A06
            if (r3 != r2) goto L_0x007a
            int r3 = r5.A02
            int r2 = r4.A02
            if (r3 != r2) goto L_0x007a
            int r3 = r5.A05
            int r2 = r4.A05
            if (r3 != r2) goto L_0x007a
            r9.A0H = r4
            r2 = r18
            r9.A0Y = r2
            android.media.AudioTrack r4 = r9.A0B
            int r3 = com.google.android.exoplayer2.util.Util.A00
            r2 = 29
            if (r3 < r2) goto L_0x0072
            boolean r2 = r4.isOffloadedPlayback()
            if (r2 == 0) goto L_0x0072
            r3 = 3
            android.media.AudioTrack r2 = r9.A0B
            int r2 = r2.getPlayState()
            if (r2 != r3) goto L_0x0063
            android.media.AudioTrack r2 = r9.A0B
            r2.setOffloadEndOfStream()
        L_0x0063:
            android.media.AudioTrack r4 = r9.A0B
            X.5vu r2 = r9.A0H
            X.3wB r2 = r2.A07
            int r3 = r2.A08
            int r2 = r2.A09
            r4.setOffloadDelayPadding(r3, r2)
            r9.A0P = r10
        L_0x0072:
            r9.A03(r0)
        L_0x0075:
            android.media.AudioTrack r2 = r9.A0B
            if (r2 != 0) goto L_0x01c3
            goto L_0x0087
        L_0x007a:
            A07(r9)
            boolean r2 = r9.CKN()
            if (r2 != 0) goto L_0x04ac
            r9.flush()
            goto L_0x0072
        L_0x0087:
            X.4Q3 r3 = r9.A0e     // Catch:{ 4UI -> 0x01b7 }
            monitor-enter(r3)     // Catch:{ 4UI -> 0x01b7 }
            boolean r2 = r3.A00     // Catch:{ all -> 0x01b4 }
            monitor-exit(r3)     // Catch:{ 4UI -> 0x01b7 }
            if (r2 == 0) goto L_0x04ac
            boolean r2 = r9.A0M     // Catch:{ 4UI -> 0x01b7 }
            if (r2 == 0) goto L_0x0103
            X.5vu r2 = r9.A0H     // Catch:{ 4UI -> 0x009d }
            r2.getClass()     // Catch:{ 4UI -> 0x009d }
            android.media.AudioTrack r3 = r9.A01(r2)     // Catch:{ 4UI -> 0x009d }
            goto L_0x0109
        L_0x009d:
            r11 = move-exception
            X.2BQ r2 = X.2BQ.A1D     // Catch:{ 4UI -> 0x01b7 }
            boolean r2 = X.2BY.A02(r2)     // Catch:{ 4UI -> 0x01b7 }
            if (r2 == 0) goto L_0x00b8
            X.5vu r2 = r9.A0H     // Catch:{ 4UI -> 0x01b7 }
            int r4 = r2.A06     // Catch:{ 4UI -> 0x01b7 }
            int r3 = r2.A02     // Catch:{ 4UI -> 0x01b7 }
            int r2 = r2.A03     // Catch:{ 4UI -> 0x01b7 }
            int r12 = android.media.AudioTrack.getMinBufferSize(r4, r3, r2)     // Catch:{ 4UI -> 0x01b7 }
            r3 = -2
            r2 = 0
            if (r12 == r3) goto L_0x00bc
            r2 = 1
            goto L_0x00bc
        L_0x00b8:
            r12 = 1000000(0xf4240, float:1.401298E-39)
            goto L_0x00bf
        L_0x00bc:
            X.C256703wD.A04(r2)     // Catch:{ 4UI -> 0x01b7 }
        L_0x00bf:
            X.5vu r13 = r9.A0H     // Catch:{ 4UI -> 0x01b7 }
            int r2 = r13.A00     // Catch:{ 4UI -> 0x01b7 }
            if (r2 <= r12) goto L_0x01b6
            X.3wB r2 = r13.A07     // Catch:{ 4UI -> 0x01b7 }
            r17 = r2
            int r2 = r13.A01     // Catch:{ 4UI -> 0x01b7 }
            r16 = r2
            int r14 = r13.A04     // Catch:{ 4UI -> 0x01b7 }
            int r7 = r13.A05     // Catch:{ 4UI -> 0x01b7 }
            int r6 = r13.A06     // Catch:{ 4UI -> 0x01b7 }
            int r5 = r13.A02     // Catch:{ 4UI -> 0x01b7 }
            int r4 = r13.A03     // Catch:{ 4UI -> 0x01b7 }
            X.4Ps[] r3 = r13.A09     // Catch:{ 4UI -> 0x01b7 }
            boolean r13 = r13.A08     // Catch:{ 4UI -> 0x01b7 }
            X.5vu r2 = new X.5vu     // Catch:{ 4UI -> 0x01b7 }
            r23 = r14
            r24 = r7
            r25 = r6
            r26 = r5
            r27 = r4
            r28 = r12
            r29 = r13
            r20 = r17
            r21 = r3
            r22 = r16
            r19 = r2
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29)     // Catch:{ 4UI -> 0x01b7 }
            android.media.AudioTrack r3 = r9.A01(r2)     // Catch:{ 4UI -> 0x00fd }
            r9.A0H = r2     // Catch:{ 4UI -> 0x00fd }
            goto L_0x0109
        L_0x00fd:
            r0 = move-exception
            X.C9153RRe.A00(r11, r0)     // Catch:{ 4UI -> 0x01b7 }
            goto L_0x01b6
        L_0x0103:
            X.5vu r2 = r9.A0H     // Catch:{ 4UI -> 0x01b7 }
            android.media.AudioTrack r3 = r9.A01(r2)     // Catch:{ 4UI -> 0x01b7 }
        L_0x0109:
            r9.A0B = r3     // Catch:{ 4UI -> 0x01b7 }
            int r5 = com.google.android.exoplayer2.util.Util.A00     // Catch:{ 4UI -> 0x01b7 }
            r2 = 29
            if (r5 < r2) goto L_0x0136
            boolean r2 = r3.isOffloadedPlayback()     // Catch:{ 4UI -> 0x01b7 }
            if (r2 == 0) goto L_0x0129
            android.media.AudioTrack r2 = r9.A0B     // Catch:{ 4UI -> 0x01b7 }
            r9.A05(r2)     // Catch:{ 4UI -> 0x01b7 }
            android.media.AudioTrack r4 = r9.A0B     // Catch:{ 4UI -> 0x01b7 }
            X.5vu r2 = r9.A0H     // Catch:{ 4UI -> 0x01b7 }
            X.3wB r2 = r2.A07     // Catch:{ 4UI -> 0x01b7 }
            int r3 = r2.A08     // Catch:{ 4UI -> 0x01b7 }
            int r2 = r2.A09     // Catch:{ 4UI -> 0x01b7 }
            r4.setOffloadDelayPadding(r3, r2)     // Catch:{ 4UI -> 0x01b7 }
        L_0x0129:
            r2 = 31
            if (r5 < r2) goto L_0x0136
            X.4Rs r3 = r9.A0C     // Catch:{ 4UI -> 0x01b7 }
            if (r3 == 0) goto L_0x0136
            android.media.AudioTrack r2 = r9.A0B     // Catch:{ 4UI -> 0x01b7 }
            X.C299835vv.A00(r2, r3)     // Catch:{ 4UI -> 0x01b7 }
        L_0x0136:
            android.media.AudioTrack r2 = r9.A0B     // Catch:{ 4UI -> 0x01b7 }
            int r2 = r2.getAudioSessionId()     // Catch:{ 4UI -> 0x01b7 }
            r9.A01 = r2     // Catch:{ 4UI -> 0x01b7 }
            X.4Q6 r11 = r9.A0c     // Catch:{ 4UI -> 0x01b7 }
            android.media.AudioTrack r6 = r9.A0B     // Catch:{ 4UI -> 0x01b7 }
            X.5vu r2 = r9.A0H     // Catch:{ 4UI -> 0x01b7 }
            int r5 = r2.A03     // Catch:{ 4UI -> 0x01b7 }
            int r4 = r2.A05     // Catch:{ 4UI -> 0x01b7 }
            int r3 = r2.A00     // Catch:{ 4UI -> 0x01b7 }
            r11.A0K = r6     // Catch:{ 4UI -> 0x01b7 }
            r11.A01 = r3     // Catch:{ 4UI -> 0x01b7 }
            X.5vw r2 = new X.5vw     // Catch:{ 4UI -> 0x01b7 }
            r2.<init>(r6)     // Catch:{ 4UI -> 0x01b7 }
            r11.A0L = r2     // Catch:{ 4UI -> 0x01b7 }
            int r12 = r6.getSampleRate()     // Catch:{ 4UI -> 0x01b7 }
            r11.A03 = r12     // Catch:{ 4UI -> 0x01b7 }
            boolean r2 = com.google.android.exoplayer2.util.Util.A0G(r5)     // Catch:{ 4UI -> 0x01b7 }
            r11.A0O = r2     // Catch:{ 4UI -> 0x01b7 }
            r6 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r2 == 0) goto L_0x0169
            goto L_0x016f
        L_0x0169:
            r4 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            goto L_0x0177
        L_0x016f:
            int r3 = r3 / r4
            long r4 = (long) r3     // Catch:{ 4UI -> 0x01b7 }
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r2
            long r2 = (long) r12     // Catch:{ 4UI -> 0x01b7 }
            long r4 = r4 / r2
        L_0x0177:
            r11.A05 = r4     // Catch:{ 4UI -> 0x01b7 }
            r2 = 0
            r11.A0F = r2     // Catch:{ 4UI -> 0x01b7 }
            r11.A0G = r2     // Catch:{ 4UI -> 0x01b7 }
            r11.A0N = r15     // Catch:{ 4UI -> 0x01b7 }
            r11.A0J = r6     // Catch:{ 4UI -> 0x01b7 }
            r11.A07 = r6     // Catch:{ 4UI -> 0x01b7 }
            r11.A08 = r2     // Catch:{ 4UI -> 0x01b7 }
            r11.A0C = r2     // Catch:{ 4UI -> 0x01b7 }
            r2 = 1065353216(0x3f800000, float:1.0)
            r11.A00 = r2     // Catch:{ 4UI -> 0x01b7 }
            android.media.AudioTrack r3 = r9.A0B     // Catch:{ 4UI -> 0x01b7 }
            if (r3 == 0) goto L_0x0196
            float r2 = r9.A00     // Catch:{ 4UI -> 0x01b7 }
            r3.setVolume(r2)     // Catch:{ 4UI -> 0x01b7 }
        L_0x0196:
            X.O5p r2 = r9.A0G     // Catch:{ 4UI -> 0x01b7 }
            if (r2 == 0) goto L_0x01a1
            android.media.AudioTrack r3 = r9.A0B     // Catch:{ 4UI -> 0x01b7 }
            android.media.AudioDeviceInfo r2 = r2.A00     // Catch:{ 4UI -> 0x01b7 }
            r3.setPreferredDevice(r2)     // Catch:{ 4UI -> 0x01b7 }
        L_0x01a1:
            r9.A0R = r10     // Catch:{ 4UI -> 0x01b7 }
            boolean r2 = r9.A0g     // Catch:{ 4UI -> 0x01b7 }
            if (r2 == 0) goto L_0x01c3
            X.4QH r3 = r9.A0E     // Catch:{ 4UI -> 0x01b7 }
            if (r3 == 0) goto L_0x01c3
            X.60U r2 = new X.60U     // Catch:{ 4UI -> 0x01b7 }
            r2.<init>()     // Catch:{ 4UI -> 0x01b7 }
            r3.Cwr(r2)     // Catch:{ 4UI -> 0x01b7 }
            goto L_0x01c3
        L_0x01b4:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ 4UI -> 0x01b7 }
        L_0x01b6:
            throw r11     // Catch:{ 4UI -> 0x01b7 }
        L_0x01b7:
            r1 = move-exception
            boolean r0 = r1.A01
            if (r0 != 0) goto L_0x01c2
            X.4QE r0 = r9.A0j
            r0.A00(r1)
            return r15
        L_0x01c2:
            throw r1
        L_0x01c3:
            X.4QE r3 = r9.A0j
            r2 = r18
            r3.A00 = r2
            boolean r2 = r9.A0R
            r13 = 0
            if (r2 == 0) goto L_0x01f5
            long r2 = java.lang.Math.max(r13, r0)
            r9.A06 = r2
            r9.A0S = r15
            r9.A0R = r15
            r9.A03(r0)
            boolean r2 = r9.A0Q
            if (r2 == 0) goto L_0x01f5
            r9.A0Q = r10
            android.media.AudioTrack r2 = r9.A0B
            if (r2 == 0) goto L_0x01f5
            X.4Q6 r2 = r9.A0c
            X.5vw r2 = r2.A0L
            r2.getClass()
            r2.A00()
            android.media.AudioTrack r2 = r9.A0B
            r2.play()
        L_0x01f5:
            X.4Q6 r11 = r9.A0c
            long r16 = A00(r9)
            android.media.AudioTrack r2 = r11.A0K
            r2.getClass()
            int r7 = r2.getPlayState()
            boolean r6 = r11.A0N
            long r4 = X.AnonymousClass4Q6.A00(r11)
            int r3 = (r16 > r4 ? 1 : (r16 == r4 ? 0 : -1))
            r2 = 1
            if (r3 > 0) goto L_0x0210
            r2 = 0
        L_0x0210:
            r11.A0N = r2
            if (r6 == 0) goto L_0x0239
            if (r2 != 0) goto L_0x0239
            if (r7 == r10) goto L_0x0239
            X.4Q5 r4 = r11.A0S
            int r5 = r11.A01
            long r2 = r11.A05
            long r20 = com.google.android.exoplayer2.util.Util.A08(r2)
            X.4Q4 r4 = (X.AnonymousClass4Q4) r4
            com.google.android.exoplayer2.audio.DefaultAudioSink r2 = r4.A00
            X.4QH r4 = r2.A0E
            if (r4 == 0) goto L_0x0239
            long r22 = android.os.SystemClock.elapsedRealtime()
            long r2 = r2.A05
            long r22 = r22 - r2
            r24 = r5
            r19 = r4
            r19.DuV(r20, r22, r24)
        L_0x0239:
            java.nio.ByteBuffer r2 = r9.A0K
            if (r2 != 0) goto L_0x0462
            java.nio.ByteOrder r4 = r8.order()
            java.nio.ByteOrder r3 = java.nio.ByteOrder.LITTLE_ENDIAN
            r2 = 0
            if (r4 != r3) goto L_0x0247
            r2 = 1
        L_0x0247:
            X.C256703wD.A03(r2)
            boolean r2 = r8.hasRemaining()
            if (r2 == 0) goto L_0x04ab
            X.5vu r3 = r9.A0H
            int r2 = r3.A04
            if (r2 == 0) goto L_0x03d5
            int r2 = r9.A03
            if (r2 != 0) goto L_0x03d5
            int r3 = r3.A03
            r2 = 1024(0x400, float:1.435E-42)
            r5 = -1
            switch(r3) {
                case 5: goto L_0x0272;
                case 6: goto L_0x0272;
                case 7: goto L_0x02ae;
                case 8: goto L_0x02ae;
                case 9: goto L_0x0307;
                case 10: goto L_0x03c6;
                case 11: goto L_0x026e;
                case 12: goto L_0x026e;
                case 13: goto L_0x0262;
                case 14: goto L_0x0327;
                case 15: goto L_0x0382;
                case 16: goto L_0x03c6;
                case 17: goto L_0x0385;
                case 18: goto L_0x0272;
                case 19: goto L_0x0262;
                case 20: goto L_0x038a;
                default: goto L_0x0262;
            }
        L_0x0262:
            java.lang.String r0 = "Unexpected audio encoding: "
            java.lang.String r1 = X.002.A0O(r0, r3)
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        L_0x026e:
            r2 = 2048(0x800, float:2.87E-42)
            goto L_0x03c6
        L_0x0272:
            int r2 = r8.position()
            int r2 = r2 + 5
            byte r2 = r8.get(r2)
            r4 = r2 & 248(0xf8, float:3.48E-43)
            r3 = 3
            int r4 = r4 >> r3
            r2 = 10
            if (r4 <= r2) goto L_0x02aa
            int r2 = r8.position()
            int r2 = r2 + 4
            byte r2 = r8.get(r2)
            r2 = r2 & 192(0xc0, float:2.69E-43)
            int r2 = r2 >> 6
            if (r2 == r3) goto L_0x02a2
            int r2 = r8.position()
            int r2 = r2 + 4
            byte r2 = r8.get(r2)
            r2 = r2 & 48
            int r3 = r2 >> 4
        L_0x02a2:
            int[] r2 = X.C21350XYd.A01
            r2 = r2[r3]
            int r2 = r2 * 256
            goto L_0x03c6
        L_0x02aa:
            r2 = 1536(0x600, float:2.152E-42)
            goto L_0x03c6
        L_0x02ae:
            int r3 = r8.position()
            byte r4 = r8.get(r3)
            r2 = -2
            if (r4 == r2) goto L_0x02fa
            if (r4 == r5) goto L_0x02e7
            r2 = 31
            if (r4 == r2) goto L_0x02da
            int r2 = r3 + 4
            byte r2 = r8.get(r2)
            r2 = r2 & 1
            int r4 = r2 << 6
            int r2 = r3 + 5
        L_0x02cb:
            byte r2 = r8.get(r2)
            r2 = r2 & 252(0xfc, float:3.53E-43)
        L_0x02d1:
            int r2 = r2 >> 2
            r2 = r2 | r4
            int r2 = r2 + 1
            int r2 = r2 * 32
            goto L_0x03c6
        L_0x02da:
            int r2 = r3 + 5
            byte r2 = r8.get(r2)
            r2 = r2 & 7
            int r4 = r2 << 4
            int r2 = r3 + 6
            goto L_0x02f3
        L_0x02e7:
            int r2 = r3 + 4
            byte r2 = r8.get(r2)
            r2 = r2 & 7
            int r4 = r2 << 4
            int r2 = r3 + 7
        L_0x02f3:
            byte r2 = r8.get(r2)
            r2 = r2 & 60
            goto L_0x02d1
        L_0x02fa:
            int r2 = r3 + 5
            byte r2 = r8.get(r2)
            r2 = r2 & 1
            int r4 = r2 << 6
            int r2 = r3 + 4
            goto L_0x02cb
        L_0x0307:
            int r2 = r8.position()
            int r4 = r8.getInt(r2)
            java.nio.ByteOrder r3 = r8.order()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r3 == r2) goto L_0x031b
            int r4 = java.lang.Integer.reverseBytes(r4)
        L_0x031b:
            int r2 = X.SN2.A01(r4)
            if (r2 != r5) goto L_0x03c6
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>()
            throw r0
        L_0x0327:
            int r12 = r8.position()
            int r2 = r8.limit()
            int r4 = r2 + -10
            r6 = r12
        L_0x0332:
            if (r6 > r4) goto L_0x0380
            int r2 = r6 + 4
            int r7 = r8.getInt(r2)
            java.nio.ByteOrder r3 = r8.order()
            java.nio.ByteOrder r2 = java.nio.ByteOrder.BIG_ENDIAN
            if (r3 == r2) goto L_0x0346
            int r7 = java.lang.Integer.reverseBytes(r7)
        L_0x0346:
            r3 = r7 & -2
            r2 = -126718022(0xfffffffff8726fba, float:-1.966878E34)
            if (r3 != r2) goto L_0x037d
            int r6 = r6 - r12
            if (r6 == r5) goto L_0x0380
            int r2 = r8.position()
            int r2 = r2 + r6
            int r2 = r2 + 7
            byte r2 = r8.get(r2)
            r3 = r2 & 255(0xff, float:3.57E-43)
            r2 = 187(0xbb, float:2.62E-43)
            r5 = 0
            if (r3 != r2) goto L_0x0363
            r5 = 1
        L_0x0363:
            r4 = 40
            int r3 = r8.position()
            int r3 = r3 + r6
            r2 = 8
            if (r5 == 0) goto L_0x0370
            r2 = 9
        L_0x0370:
            int r3 = r3 + r2
            byte r2 = r8.get(r3)
            int r2 = r2 >> 4
            r2 = r2 & 7
            int r4 = r4 << r2
            int r2 = r4 * 16
            goto L_0x03c6
        L_0x037d:
            int r6 = r6 + 1
            goto L_0x0332
        L_0x0380:
            r2 = 0
            goto L_0x03c6
        L_0x0382:
            r2 = 512(0x200, float:7.175E-43)
            goto L_0x03c6
        L_0x0385:
            int r2 = X.C11135SBq.A00(r8)
            goto L_0x03c6
        L_0x038a:
            r4 = 0
            byte r3 = r8.get(r15)
            int r2 = r8.limit()
            if (r2 <= r10) goto L_0x0399
            byte r4 = r8.get(r10)
        L_0x0399:
            r7 = r3 & 255(0xff, float:3.57E-43)
            r2 = r7 & 3
            r5 = 2
            if (r2 == 0) goto L_0x03d3
            if (r2 == r10) goto L_0x03a6
            if (r2 == r5) goto L_0x03a6
            r5 = r4 & 63
        L_0x03a6:
            r6 = 3
            int r7 = r7 >> r6
            r4 = r7 & 3
            r2 = 16
            r3 = 2500(0x9c4, float:3.503E-42)
            if (r7 >= r2) goto L_0x03d0
            r2 = 12
            r3 = 10000(0x2710, float:1.4013E-41)
            if (r7 < r2) goto L_0x03cb
            r2 = r4 & 1
            int r2 = r3 << r2
        L_0x03ba:
            long r4 = (long) r5
            long r2 = (long) r2
            long r4 = r4 * r2
            r2 = 48000(0xbb80, double:2.3715E-319)
            long r4 = r4 * r2
            r2 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 / r2
            int r2 = (int) r4
        L_0x03c6:
            r9.A03 = r2
            if (r2 != 0) goto L_0x03d5
            return r10
        L_0x03cb:
            r2 = 60000(0xea60, float:8.4078E-41)
            if (r4 == r6) goto L_0x03ba
        L_0x03d0:
            int r2 = r3 << r4
            goto L_0x03ba
        L_0x03d3:
            r5 = 1
            goto L_0x03a6
        L_0x03d5:
            X.4QD r2 = r9.A0I
            if (r2 == 0) goto L_0x03e6
            boolean r2 = A09(r9)
            if (r2 == 0) goto L_0x04ac
            r9.A03(r0)
            r2 = r18
            r9.A0I = r2
        L_0x03e6:
            long r2 = r9.A06
            X.5vu r12 = r9.A0H
            int r4 = r12.A04
            if (r4 != 0) goto L_0x047f
            long r6 = r9.A08
            int r4 = r12.A01
            long r4 = (long) r4
            long r6 = r6 / r4
        L_0x03f4:
            X.4Q8 r4 = r9.A0d
            long r4 = r4.A04
            long r6 = r6 - r4
            r4 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 * r4
            X.3wB r4 = r12.A07
            int r4 = r4.A0G
            long r4 = (long) r4
            long r6 = r6 / r4
            long r2 = r2 + r6
            boolean r4 = r9.A0S
            if (r4 != 0) goto L_0x042f
            long r4 = r2 - r33
            long r16 = java.lang.Math.abs(r4)
            r5 = 200000(0x30d40, double:9.8813E-319)
            int r4 = (r16 > r5 ? 1 : (r16 == r5 ? 0 : -1))
            if (r4 <= 0) goto L_0x044c
            X.4QH r6 = r9.A0E
            if (r6 == 0) goto L_0x042d
            java.lang.String r19 = "Unexpected audio track timestamp discontinuity: expected "
            java.lang.String r20 = ", got "
            r23 = r0
            r21 = r2
            java.lang.String r5 = X.002.A0f(r19, r20, r21, r23)
            X.RJh r4 = new X.RJh
            r4.<init>(r5)
            r6.Cwm(r4)
        L_0x042d:
            r9.A0S = r10
        L_0x042f:
            boolean r4 = A09(r9)
            if (r4 == 0) goto L_0x04ac
            long r4 = r33 - r2
            long r2 = r9.A06
            long r2 = r2 + r4
            r9.A06 = r2
            r9.A0S = r15
            r9.A03(r0)
            X.4QH r3 = r9.A0E
            if (r3 == 0) goto L_0x044c
            int r2 = (r4 > r13 ? 1 : (r4 == r13 ? 0 : -1))
            if (r2 == 0) goto L_0x044c
            r3.DYI()
        L_0x044c:
            X.5vu r2 = r9.A0H
            int r2 = r2.A04
            r12 = r32
            if (r2 != 0) goto L_0x0474
            long r4 = r9.A08
            int r2 = r8.remaining()
            long r2 = (long) r2
            long r4 = r4 + r2
            r9.A08 = r4
        L_0x045e:
            r9.A0K = r8
            r9.A04 = r12
        L_0x0462:
            r9.A04(r0)
            java.nio.ByteBuffer r0 = r9.A0K
            boolean r0 = r0.hasRemaining()
            if (r0 != 0) goto L_0x0483
            r0 = r18
            r9.A0K = r0
            r9.A04 = r15
            return r10
        L_0x0474:
            long r6 = r9.A07
            int r2 = r9.A03
            long r4 = (long) r2
            long r2 = (long) r12
            long r4 = r4 * r2
            long r6 = r6 + r4
            r9.A07 = r6
            goto L_0x045e
        L_0x047f:
            long r6 = r9.A07
            goto L_0x03f4
        L_0x0483:
            long r5 = A00(r9)
            long r0 = r11.A07
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r2 == 0) goto L_0x04ac
            int r2 = (r5 > r13 ? 1 : (r5 == r13 ? 0 : -1))
            if (r2 <= 0) goto L_0x04ac
            long r3 = android.os.SystemClock.elapsedRealtime()
            long r3 = r3 - r0
            r1 = 200(0xc8, double:9.9E-322)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x04ac
            java.lang.String r1 = "DefaultAudioSink"
            java.lang.String r0 = "Resetting stalled audio track"
            X.2AG.A04(r1, r0)
            r9.flush()
        L_0x04ab:
            return r10
        L_0x04ac:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.audio.DefaultAudioSink.CIL(java.nio.ByteBuffer, int, long):boolean");
    }

    public final boolean CKN() {
        if (this.A0B != null) {
            if (A00(this) <= AnonymousClass4Q6.A00(this.A0c)) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final void Efz(AnonymousClass4P7 r5) {
        AnonymousClass4P7 r0 = AnonymousClass4P7.A03;
        A06(new AnonymousClass4P7(Math.max(0.1f, Math.min(r5.A01, 8.0f)), Math.max(0.1f, Math.min(r5.A00, 8.0f))), this, A02(this).A03);
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.60U, java.lang.Object] */
    public final void flush() {
        if (this.A0B != null) {
            this.A08 = 0;
            this.A07 = 0;
            this.A0A = 0;
            this.A09 = 0;
            this.A0P = false;
            this.A03 = 0;
            this.A0J = new AnonymousClass4QD(A02(this).A02, 0, 0, A02(this).A03);
            this.A06 = 0;
            this.A0I = null;
            this.A0f.clear();
            this.A0K = null;
            this.A04 = 0;
            this.A0L = null;
            this.A0T = false;
            this.A0O = false;
            this.A02 = -1;
            this.A0d.A04 = 0;
            int i = 0;
            while (true) {
                C264394Ps[] r1 = this.A0V;
                if (i >= r1.length) {
                    break;
                }
                C264394Ps r0 = r1[i];
                r0.flush();
                this.A0W[i] = r0.BZT();
                i++;
            }
            AnonymousClass4Q6 r5 = this.A0c;
            AudioTrack audioTrack = r5.A0K;
            audioTrack.getClass();
            if (audioTrack.getPlayState() == 3) {
                this.A0B.pause();
            }
            AudioTrack audioTrack2 = this.A0B;
            if (Util.A00 >= 29 && audioTrack2.isOffloadedPlayback()) {
                S4Z s4z = this.A0Z;
                s4z.getClass();
                s4z.A01(this.A0B);
            }
            ? obj = new Object();
            C299825vu r02 = this.A0Y;
            if (r02 != null) {
                this.A0H = r02;
                this.A0Y = null;
            }
            r5.A0H = 0;
            r5.A04 = 0;
            r5.A02 = 0;
            r5.A09 = 0;
            r5.A0B = 0;
            r5.A0E = 0;
            r5.A0Q = false;
            r5.A0K = null;
            r5.A0L = null;
            AudioTrack audioTrack3 = this.A0B;
            AnonymousClass4Q3 r10 = this.A0e;
            AnonymousClass4QH r8 = this.A0E;
            r10.A01();
            Handler handler = new Handler(Looper.myLooper());
            synchronized (A0q) {
                ExecutorService executorService = A0o;
                if (executorService == null) {
                    executorService = Executors.newSingleThreadExecutor(new AnonymousClass60V());
                    A0o = executorService;
                }
                A0n++;
                executorService.execute(new AnonymousClass60W(audioTrack3, handler, obj, r8, this, r10));
            }
            this.A0B = null;
        }
        this.A0k.A00 = null;
        this.A0j.A00 = null;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.4Pw, X.4Q7] */
    /* JADX WARNING: type inference failed for: r0v12, types: [java.lang.Object, X.4QC] */
    /* JADX WARNING: type inference failed for: r0v18, types: [java.lang.Object, X.4QE] */
    /* JADX WARNING: type inference failed for: r0v19, types: [java.lang.Object, X.4QE] */
    public DefaultAudioSink(C264384Pr r8, C264414Pu r9, AnonymousClass4Q0 r10) {
        this.A0a = r8;
        this.A0b = r9;
        this.A0i = r10;
        AnonymousClass4Q3 r0 = new AnonymousClass4Q3(C697227w.A00);
        this.A0e = r0;
        r0.A02();
        ? r3 = new C264434Pw();
        this.A0h = r3;
        AnonymousClass4Q8 r2 = new AnonymousClass4Q8();
        this.A0d = r2;
        ArrayList arrayList = new ArrayList();
        Collections.addAll(arrayList, new C264434Pw[]{new C264434Pw(), r3, r2});
        Collections.addAll(arrayList, ((C264404Pt) r9).A02);
        this.A0m = (C264394Ps[]) arrayList.toArray(new C264394Ps[0]);
        this.A0l = new C264394Ps[]{new C264434Pw()};
        this.A00 = 1.0f;
        this.A0D = AnonymousClass4QB.A02;
        this.A01 = 0;
        this.A0F = new Object();
        AnonymousClass4P7 r1 = AnonymousClass4P7.A03;
        this.A0J = new AnonymousClass4QD(r1, 0, 0, false);
        this.A0X = r1;
        this.A02 = -1;
        this.A0V = new C264394Ps[0];
        this.A0W = new ByteBuffer[0];
        this.A0f = new ArrayDeque();
        this.A0j = new Object();
        this.A0k = new Object();
        this.A0g = 2BY.A02(2BQ.A05);
    }

    public static void A06(AnonymousClass4P7 r7, DefaultAudioSink defaultAudioSink, boolean z) {
        AnonymousClass4QD A022 = A02(defaultAudioSink);
        AnonymousClass4P7 r2 = r7;
        boolean equals = r7.equals(A022.A02);
        boolean z2 = z;
        if (!equals || z != A022.A03) {
            AnonymousClass4QD r1 = new AnonymousClass4QD(r2, -9223372036854775807L, -9223372036854775807L, z2);
            if (defaultAudioSink.A0B != null) {
                defaultAudioSink.A0I = r1;
            } else {
                defaultAudioSink.A0J = r1;
            }
        }
    }

    public final void reset() {
        flush();
        for (C264394Ps reset : this.A0m) {
            reset.reset();
        }
        for (C264394Ps reset2 : this.A0l) {
            reset2.reset();
        }
        this.A0Q = false;
    }
}
