package X;

import android.media.MediaCodec;
import android.media.MediaCrypto;
import android.media.MediaCryptoException;
import android.media.MediaFormat;
import android.os.Bundle;
import com.facebook.common.dextricks.Constants;
import com.google.android.exoplayer2.audio.DefaultAudioSink;
import com.google.android.exoplayer2.util.Util;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayDeque;
import java.util.ArrayList;

/* renamed from: X.4TZ  reason: invalid class name */
public abstract class AnonymousClass4TZ extends AnonymousClass4PK {
    public float A00;
    public int A01;
    public int A02;
    public int A03;
    public int A04;
    public int A05;
    public long A06;
    public long A07;
    public long A08;
    public MediaFormat A09;
    public C2612348u A0A;
    public C256683wB A0B;
    public C256683wB A0C;
    public C256683wB A0D;
    public C266094Xn A0E;
    public C290325f8 A0F;
    public C21414XaO A0G;
    public C251403n3 A0H;
    public 2Km A0I;
    public C290305f6 A0J;
    public C284805Nz A0K;
    public ByteBuffer A0L;
    public ArrayDeque A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public boolean A0Q;
    public boolean A0R;
    public boolean A0S;
    public boolean A0T;
    public boolean A0U;
    public boolean A0V;
    public boolean A0W;
    public boolean A0X = false;
    public boolean A0Y;
    public boolean A0Z;
    public boolean A0a;
    public boolean A0b;
    public boolean A0c = false;
    public boolean A0d;
    public float A0e;
    public float A0f;
    public long A0g;
    public long A0h;
    public MediaCrypto A0i;
    public C290325f8 A0j;
    public Object A0k;
    public String A0l;
    public boolean A0m;
    public boolean A0n;
    public boolean A0o;
    public boolean A0p;
    public boolean A0q;
    public boolean A0r;
    public final MediaCodec.BufferInfo A0s;
    public final AnonymousClass2SB A0t;
    public final AnonymousClass4PQ A0u;
    public final AnonymousClass4PQ A0v;
    public final C284795Ny A0w;
    public final C256823wP A0x;
    public final ArrayDeque A0y;
    public final ArrayList A0z;
    public final boolean A10;
    public final float A11;
    public final AnonymousClass4PQ A12;
    public final C284785Nx A13;
    public final AnonymousClass4PH A14;
    public final boolean A15;

    private void A00() {
        this.A0N = false;
        this.A0w.clear();
        this.A0v.clear();
        this.A0P = false;
        this.A0O = false;
    }

    private boolean A09(C256683wB r6) {
        if (this.A0H == null || this.A01 == 3 || this.A01 == 0) {
            return true;
        }
        float f = this.A0f;
        C256683wB[] r0 = this.A08;
        r0.getClass();
        float A0O2 = A0O(r6, r0, f);
        float f2 = this.A0e;
        if (f2 == A0O2) {
            return true;
        }
        if (A0O2 == -1.0f) {
            A01();
            return false;
        } else if (f2 == -1.0f && A0O2 <= this.A11) {
            return true;
        } else {
            Bundle bundle = new Bundle();
            bundle.putFloat("operating-rate", A0O2);
            this.A0H.setParameters(bundle);
            this.A0e = A0O2;
            return true;
        }
    }

    public void A0I() {
        throw AnonymousClass00P.createAndThrow();
    }

    public void A0J() {
        try {
            A00();
            A0Z();
        } finally {
            C290325f8 r0 = this.A0F;
            if (r0 != null) {
                r0.ECN((C265184Sw) null);
            }
            this.A0F = null;
        }
    }

    public void A0K() {
        this.A0C = null;
        A07(C284805Nz.A03);
        this.A0y.clear();
        if (this.A0r) {
            A0J();
        } else {
            A0p();
        }
    }

    public void A0L(long j, boolean z) {
        int i;
        this.A0U = false;
        this.A0Z = false;
        this.A0a = false;
        if (this.A0O) {
            this.A0w.clear();
            this.A0v.clear();
            this.A0P = false;
        } else if (A0p()) {
            A0Y();
        }
        AnonymousClass4PX r1 = this.A0K.A02;
        synchronized (r1) {
            i = r1.A01;
        }
        if (i > 0) {
            this.A0d = true;
        }
        this.A0K.A02.A00();
        this.A0y.clear();
    }

    public float A0O(C256683wB r6, C256683wB[] r7, float f) {
        int i = -1;
        for (C256683wB r0 : r7) {
            int i2 = r0.A0G;
            if (i2 != -1) {
                i = Math.max(i, i2);
            }
        }
        if (i == -1) {
            return -1.0f;
        }
        return f * ((float) i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0017, code lost:
        if (r3 == 2) goto L_0x0019;
     */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x00a7  */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00bc  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00c6  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int A0P(X.C256683wB r12, X.C256823wP r13) {
        /*
            r11 = this;
            r7 = r11
            X.4Xp r7 = (X.C266114Xp) r7
            java.lang.String r2 = r12.A0W
            boolean r0 = X.2Kn.A04(r2)
            r4 = 0
            if (r0 != 0) goto L_0x000f
            r0 = 128(0x80, float:1.794E-43)
            return r0
        L_0x000f:
            int r3 = r12.A07
            r1 = 0
            if (r3 == 0) goto L_0x0019
            r1 = 1
            r0 = 2
            r10 = 0
            if (r3 != r0) goto L_0x001a
        L_0x0019:
            r10 = 1
        L_0x001a:
            r9 = 8
            r8 = 4
            if (r10 == 0) goto L_0x0039
            X.4Q2 r0 = r7.A0A
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0
            int r0 = r0.B7U(r12)
            if (r0 == 0) goto L_0x0039
            if (r1 == 0) goto L_0x0033
            java.lang.String r0 = "audio/raw"
            X.2Km r0 = X.2BR.A01(r0)
            if (r0 == 0) goto L_0x0039
        L_0x0033:
            r4 = 128(0x80, float:1.794E-43)
            r0 = 44
        L_0x0037:
            r0 = r0 | r4
            return r0
        L_0x0039:
            java.lang.String r6 = "audio/raw"
            boolean r0 = r6.equals(r2)
            if (r0 == 0) goto L_0x004b
            X.4Q2 r0 = r7.A0A
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0
            int r0 = r0.B7U(r12)
            if (r0 == 0) goto L_0x00d5
        L_0x004b:
            X.4Q2 r5 = r7.A0A
            int r3 = r12.A06
            int r2 = r12.A0G
            r1 = 2
            X.3w8 r0 = new X.3w8
            r0.<init>()
            r0.A0U = r6
            r0.A04 = r3
            r0.A0E = r2
            r0.A0A = r1
            X.3wB r1 = new X.3wB
            r1.<init>(r0)
            r0 = r5
            com.google.android.exoplayer2.audio.DefaultAudioSink r0 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r0
            int r0 = r0.B7U(r1)
            if (r0 == 0) goto L_0x00d5
            com.google.common.collect.ImmutableList r3 = X.C266114Xp.A00(r12, r5, r13, r4)
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L_0x00d5
            if (r10 != 0) goto L_0x007c
            r0 = 130(0x82, float:1.82E-43)
            return r0
        L_0x007c:
            java.lang.Object r6 = r3.get(r4)
            X.2Km r6 = (X.2Km) r6
            boolean r5 = r6.A09(r12)
            if (r5 != 0) goto L_0x00d0
            boolean r0 = r7.A0Y
            if (r0 != 0) goto L_0x00d0
            r2 = 1
        L_0x008d:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00d0
            java.lang.Object r1 = r3.get(r2)
            X.2Km r1 = (X.2Km) r1
            boolean r0 = r1.A09(r12)
            if (r0 == 0) goto L_0x00cd
            r6 = r1
            r3 = 0
        L_0x00a1:
            boolean r0 = r6.A0A(r12)
            if (r0 == 0) goto L_0x00a9
            r9 = 16
        L_0x00a9:
            boolean r0 = r6.A05
            r2 = 0
            if (r0 == 0) goto L_0x00b0
            r2 = 64
        L_0x00b0:
            X.2BQ r0 = X.2BQ.A11
            boolean r0 = X.2BY.A02(r0)
            if (r0 == 0) goto L_0x00b9
            r2 = 0
        L_0x00b9:
            r1 = 0
            if (r3 == 0) goto L_0x00be
            r1 = 128(0x80, float:1.794E-43)
        L_0x00be:
            X.2BQ r0 = X.2BQ.A13
            boolean r0 = X.2BY.A02(r0)
            if (r0 != 0) goto L_0x00c7
            r4 = r1
        L_0x00c7:
            r8 = r8 | r9
            r0 = r8 | 32
            r0 = r0 | r2
            goto L_0x0037
        L_0x00cd:
            int r2 = r2 + 1
            goto L_0x008d
        L_0x00d0:
            r3 = 1
            if (r5 != 0) goto L_0x00a1
            r8 = 3
            goto L_0x00a9
        L_0x00d5:
            r0 = 129(0x81, float:1.81E-43)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.A0P(X.3wB, X.3wP):int");
    }

    public C290365fC A0Q(C256683wB r10, C256683wB r11, 2Km r12) {
        int i;
        String str;
        int i2;
        C266114Xp r3 = (C266114Xp) this;
        C256683wB r4 = r10;
        C256683wB r5 = r11;
        if (!2BY.A02(2BQ.A0L) || r3.A0t.A0B) {
            C290365fC A052 = r12.A05(r10, r11);
            i = A052.A00;
            if (r11.A0B > r3.A00) {
                i |= 64;
            }
            if (2BY.A02(2BQ.A0J) && !(r10.A08 == 0 && r10.A09 == 0 && r11.A08 == 0 && r11.A09 == 0)) {
                i |= Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET;
            }
            str = r12.A03;
            if (i != 0) {
                i2 = 0;
            } else {
                i2 = A052.A01;
            }
        } else {
            str = r12.A03;
            i2 = 0;
            i = 4;
        }
        return new C290365fC(r4, r5, str, i2, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00dd, code lost:
        if ("audio/raw".equals(r15.A0W) != false) goto L_0x00df;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C290385fE A0S(android.media.MediaCrypto r14, X.C256683wB r15, X.2Km r16, float r17) {
        /*
            r13 = this;
            r3 = r13
            X.4Xp r3 = (X.C266114Xp) r3
            X.3wB[] r6 = r3.A08
            r6.getClass()
            r11 = r15
            int r4 = r15.A0B
            X.2BQ r0 = X.2BQ.A09
            boolean r0 = X.2BY.A02(r0)
            r12 = r16
            if (r0 != 0) goto L_0x002f
            int r5 = r6.length
            r0 = 1
            if (r5 == r0) goto L_0x002f
            r2 = 0
        L_0x001a:
            if (r2 >= r5) goto L_0x002f
            r1 = r6[r2]
            X.5fC r0 = r12.A05(r15, r1)
            int r0 = r0.A01
            if (r0 == 0) goto L_0x002c
            int r0 = r1.A0B
            int r4 = java.lang.Math.max(r4, r0)
        L_0x002c:
            int r2 = r2 + 1
            goto L_0x001a
        L_0x002f:
            r3.A00 = r4
            int r6 = com.google.android.exoplayer2.util.Util.A00
            java.lang.String r1 = r12.A01
            android.media.MediaFormat r9 = new android.media.MediaFormat
            r9.<init>()
            java.lang.String r0 = "mime"
            r9.setString(r0, r1)
            int r8 = r15.A06
            java.lang.String r0 = "channel-count"
            r9.setInteger(r0, r8)
            int r7 = r15.A0G
            java.lang.String r0 = "sample-rate"
            r9.setInteger(r0, r7)
            java.util.List r0 = r15.A0X
            X.AnonymousClass4YU.A02(r9, r0)
            java.lang.String r1 = "max-input-size"
            r0 = -1
            if (r4 == r0) goto L_0x005a
            r9.setInteger(r1, r4)
        L_0x005a:
            r1 = 0
            java.lang.String r0 = "priority"
            r9.setInteger(r0, r1)
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            r1 = r17
            int r0 = (r17 > r0 ? 1 : (r17 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x006d
            java.lang.String r0 = "operating-rate"
            r9.setFloat(r0, r1)
        L_0x006d:
            java.lang.String r1 = r15.A0R
            if (r1 == 0) goto L_0x008c
            java.lang.String r0 = "mp4a.40.42"
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x008c
            X.2SB r2 = r3.A0t
            boolean r0 = r2.A07
            if (r0 == 0) goto L_0x008c
            r1 = 3
            java.lang.String r0 = "aac-drc-effect-type"
            r9.setInteger(r0, r1)
            int r1 = r2.A03
            java.lang.String r0 = "aac-target-ref-level"
            r9.setInteger(r0, r1)
        L_0x008c:
            r0 = 28
            if (r6 > r0) goto L_0x00a0
            java.lang.String r1 = r15.A0W
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00a0
            r1 = 1
            java.lang.String r0 = "ac4-is-sync"
            r9.setInteger(r0, r1)
        L_0x00a0:
            X.4Q2 r5 = r3.A0A
            r4 = 4
            X.3w8 r1 = new X.3w8
            r1.<init>()
            java.lang.String r2 = "audio/raw"
            r1.A0U = r2
            r1.A04 = r8
            r1.A0E = r7
            r1.A0A = r4
            X.3wB r0 = new X.3wB
            r0.<init>(r1)
            int r1 = r5.B7U(r0)
            r0 = 2
            if (r1 != r0) goto L_0x00c3
            java.lang.String r0 = "pcm-encoding"
            r9.setInteger(r0, r4)
        L_0x00c3:
            r0 = 32
            if (r6 < r0) goto L_0x00ce
            r1 = 99
            java.lang.String r0 = "max-output-channel-count"
            r9.setInteger(r0, r1)
        L_0x00ce:
            java.lang.String r0 = r12.A02
            boolean r0 = r2.equals(r0)
            if (r0 == 0) goto L_0x00df
            java.lang.String r0 = r15.A0W
            boolean r1 = r2.equals(r0)
            r0 = r15
            if (r1 == 0) goto L_0x00e0
        L_0x00df:
            r0 = 0
        L_0x00e0:
            r3.A01 = r0
            r10 = 0
            X.5fE r7 = new X.5fE
            r8 = r14
            r7.<init>(r8, r9, r10, r11, r12)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.A0S(android.media.MediaCrypto, X.3wB, X.2Km, float):X.5fE");
    }

    public ArrayList A0U(C256683wB r2, C256823wP r3, boolean z) {
        return 2BR.A04(r2, C266114Xp.A00(r2, ((C266114Xp) this).A0A, r3, z));
    }

    public void A0V() {
        ((DefaultAudioSink) ((C266114Xp) this).A0A).A0S = true;
    }

    public void A0X() {
        this.A04 = -1;
        this.A0u.A02 = null;
        this.A05 = -1;
        this.A0L = null;
        this.A0g = -9223372036854775807L;
        this.A0T = false;
        this.A0V = false;
        this.A0W = false;
        this.A0z.clear();
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A0h = -9223372036854775807L;
        C21414XaO xaO = this.A0G;
        if (xaO != null) {
            xaO.A00 = 0;
            xaO.A01 = 0;
            xaO.A02 = false;
        }
        this.A02 = 0;
        this.A01 = 0;
        this.A03 = this.A0n ? 1 : 0;
    }

    public final void A0Z() {
        try {
            C251403n3 r6 = this.A0H;
            if (r6 != null) {
                if (this.A0q) {
                    2SC.A05.A02(this.A14.A00, this.A0t, r6, AnonymousClass05K.A01, this.A0l, A0n());
                } else {
                    r6.release();
                }
                this.A0E.A03++;
                A0m(this.A0I.A03);
            }
            this.A0H = null;
            this.A0l = null;
            try {
                MediaCrypto mediaCrypto = this.A0i;
                if (mediaCrypto != null) {
                    mediaCrypto.release();
                }
            } finally {
                this.A0i = null;
                A06((C290325f8) null);
                A0a();
            }
        } catch (Throwable th) {
            this.A0H = null;
            this.A0l = null;
            MediaCrypto mediaCrypto2 = this.A0i;
            if (mediaCrypto2 != null) {
                mediaCrypto2.release();
            }
            throw th;
        } finally {
            this.A0i = null;
            A06((C290325f8) null);
            A0a();
        }
    }

    public void A0d(MediaFormat mediaFormat, C256683wB r8) {
        int i;
        C266114Xp r4 = (C266114Xp) this;
        C256683wB r0 = r4.A01;
        if (r0 == null) {
            if (r4.A0H != null) {
                if ("audio/raw".equals(r8.A0W)) {
                    i = r8.A0C;
                } else if (mediaFormat.containsKey("pcm-encoding")) {
                    i = mediaFormat.getInteger("pcm-encoding");
                } else if (mediaFormat.containsKey("v-bits-per-sample")) {
                    i = Util.A02(mediaFormat.getInteger("v-bits-per-sample"));
                } else {
                    i = 2;
                }
                C256653w8 r1 = new C256653w8();
                r1.A0U = "audio/raw";
                r1.A0A = i;
                r1.A04 = mediaFormat.getInteger("channel-count");
                r1.A0E = mediaFormat.getInteger("sample-rate");
                if (!2BY.A02(2BQ.A0A)) {
                    r1.A06 = r8.A08;
                    r1.A07 = r8.A09;
                }
                r0 = new C256683wB(r1);
            }
            r4.A0A.AJ2(r8, (int[]) null, 0);
        }
        r8 = r0;
        try {
            r4.A0A.AJ2(r8, (int[]) null, 0);
        } catch (AnonymousClass4UH e) {
            throw r4.A0F(e.A00, e, 5001, false);
        }
    }

    public void A0e(C256683wB r1) {
    }

    public void A0f(C256683wB r1) {
    }

    public void A0h(AnonymousClass4PQ r1) {
    }

    public abstract void A0i(AnonymousClass4PQ r1);

    public void A0j(C290385fE r4, String str, long j, long j2) {
        AnonymousClass4QF r2 = ((C266114Xp) this).A09;
        r2.A00.post(new C296455q5(r2, str, j2));
    }

    public void A0k(Exception exc) {
        2AG.A05("MediaCodecAudioRenderer2", "Audio codec error", exc);
        AnonymousClass4QF r2 = ((C266114Xp) this).A09;
        r2.A00.post(new C20172WmW(r2, exc));
    }

    public void A0l(String str) {
        AnonymousClass4QF r2 = ((C266114Xp) this).A09;
        r2.A00.post(new C296445q4(r2, str));
    }

    public void A0m(String str) {
        AnonymousClass4QF r2 = ((C266114Xp) this).A09;
        r2.A00.post(new C19964Wib(r2));
    }

    public boolean A0o() {
        return false;
    }

    public final boolean A0q(C256683wB r4) {
        return r4 != null && this.A0c && "video/av01".equalsIgnoreCase(r4.A0W);
    }

    public boolean A0r(C256683wB r12, C251403n3 r13, ByteBuffer byteBuffer, int i, int i2, int i3, long j, long j2, long j3, boolean z, boolean z2) {
        C266114Xp r4 = (C266114Xp) this;
        byteBuffer.getClass();
        if (r4.A01 == null || (i2 & 2) == 0) {
            int i4 = i3;
            if (z) {
                if (r13 != null) {
                    r13.releaseOutputBuffer(i, false);
                }
                r4.A0E.A0B += i3;
                ((DefaultAudioSink) r4.A0A).A0S = true;
                return true;
            }
            long j4 = j3;
            if (r4.A0B && byteBuffer.limit() > byteBuffer.position()) {
                int position = byteBuffer.position();
                int limit = byteBuffer.limit();
                ByteBuffer allocate = ByteBuffer.allocate(limit - position);
                allocate.put(byteBuffer);
                allocate.flip();
                byteBuffer.position(position);
                byteBuffer.limit(limit);
                AnonymousClass4QF r10 = r4.A09;
                r10.A00.post(new C20284WoZ(r10, allocate.array(), j3 / 1000));
            }
            try {
                if (!r4.A0A.CIL(byteBuffer, i4, j4)) {
                    return false;
                }
                if (r13 != null) {
                    r13.releaseOutputBuffer(i, false);
                }
                r4.A0E.A09 += i3;
                return true;
            } catch (AnonymousClass4UI e) {
                throw r4.A0F(r4.A02, e, 5001, e.A01);
            } catch (AnonymousClass4UF e2) {
                throw r4.A0F(r12, e2, 5002, e2.A01);
            }
        } else {
            r13.getClass();
            r13.releaseOutputBuffer(i, false);
            return true;
        }
    }

    public boolean A0s(2Km r2) {
        return true;
    }

    private void A01() {
        if (this.A0T) {
            this.A02 = 1;
            this.A01 = 3;
            return;
        }
        A0Z();
        A0Y();
    }

    private void A02() {
        try {
            this.A0H.flush();
        } finally {
            A0X();
        }
    }

    private void A03() {
        int i = this.A01;
        if (i == 1) {
            A02();
        } else if (i == 2) {
            A02();
            A04();
        } else if (i != 3) {
            this.A0Z = true;
            A0W();
        } else {
            A0Z();
            A0Y();
        }
    }

    private void A04() {
        X10 At4 = this.A0F.At4();
        if (At4 instanceof WM4) {
            try {
                this.A0i.setMediaDrmSession(((WM4) At4).A02);
            } catch (MediaCryptoException e) {
                throw A0F(this.A0C, e, 6006, false);
            }
        }
        A06(this.A0F);
        this.A02 = 0;
        this.A01 = 0;
    }

    /* JADX WARNING: type inference failed for: r1v5, types: [java.lang.Object, X.XaO] */
    /* JADX WARNING: type inference failed for: r7v10, types: [X.5fF, java.lang.Object, X.3n3] */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0145, code lost:
        if ("c2.android.aac.decoder".equals(r5) == false) goto L_0x0147;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A05(android.media.MediaCrypto r27, X.2Km r28) {
        /*
            r26 = this;
            r3 = r28
            java.lang.String r1 = r3.A03
            r0 = r26
            r0.A0l = r1
            int r4 = com.google.android.exoplayer2.util.Util.A00
            r19 = -1082130432(0xffffffffbf800000, float:-1.0)
            float r6 = r0.A0f
            X.3wB r5 = r0.A0C
            X.3wB[] r2 = r0.A08
            r2.getClass()
            float r5 = r0.A0O(r5, r2, r6)
            float r2 = r0.A11
            int r2 = (r5 > r2 ? 1 : (r5 == r2 ? 0 : -1))
            if (r2 <= 0) goto L_0x0021
            r19 = r5
        L_0x0021:
            boolean r6 = r0.A15
            if (r6 == 0) goto L_0x0055
            java.lang.String r5 = r0.A0l
            X.3wB r2 = r0.A0C
            r0.A0g(r2, r5)
        L_0x002c:
            long r16 = android.os.SystemClock.elapsedRealtime()
            if (r6 != 0) goto L_0x0037
            java.lang.String r2 = r0.A0l
            r0.A0l(r2)
        L_0x0037:
            X.3wB r5 = r0.A0C
            r6 = r27
            r2 = r19
            X.5fE r2 = r0.A0S(r6, r5, r3, r2)
            r5 = 31
            if (r4 < r5) goto L_0x004d
            X.4Rs r5 = r0.A04
            r5.getClass()
            X.C14012ToE.A00(r5, r2)
        L_0x004d:
            boolean r5 = r0.A0q
            java.lang.String r7 = "createCodec:"
            if (r5 == 0) goto L_0x00a9
            r5 = 0
            goto L_0x005b
        L_0x0055:
            X.3wB r2 = r0.A0C
            r0.A0f(r2)
            goto L_0x002c
        L_0x005b:
            java.lang.String r6 = r0.A0l     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r6 = X.002.A0R(r7, r6)     // Catch:{ Exception -> 0x00a2 }
            X.27d.A01(r6)     // Catch:{ Exception -> 0x00a2 }
            X.2SC r7 = X.2SC.A05     // Catch:{ Exception -> 0x00a2 }
            boolean r12 = r0.A0n()     // Catch:{ Exception -> 0x00a2 }
            X.2SB r9 = r0.A0t     // Catch:{ Exception -> 0x00a2 }
            X.4PH r6 = r0.A14     // Catch:{ Exception -> 0x00a2 }
            X.27F r8 = r6.A00     // Catch:{ Exception -> 0x00a2 }
            java.lang.Integer r10 = X.AnonymousClass05K.A01     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r11 = r0.A0l     // Catch:{ Exception -> 0x00a2 }
            X.3n3 r5 = r7.A01(r8, r9, r10, r11, r12)     // Catch:{ Exception -> 0x00a2 }
            X.27d.A00()     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r6 = "configureCodec"
            X.27d.A01(r6)     // Catch:{ Exception -> 0x00a2 }
            android.media.MediaFormat r9 = r2.A01     // Catch:{ Exception -> 0x00a2 }
            android.view.Surface r8 = r2.A02     // Catch:{ Exception -> 0x00a2 }
            android.media.MediaCrypto r7 = r2.A00     // Catch:{ Exception -> 0x00a2 }
            r14 = 0
            java.lang.Object r6 = r0.A0k     // Catch:{ Exception -> 0x00a2 }
            r10 = r5
            r11 = r9
            r12 = r8
            r13 = r7
            r15 = r6
            r10.configure(r11, r12, r13, r14, r15)     // Catch:{ Exception -> 0x00a2 }
            X.27d.A00()     // Catch:{ Exception -> 0x00a2 }
            java.lang.String r6 = "startCodec"
            X.27d.A01(r6)     // Catch:{ Exception -> 0x00a2 }
            r5.start()     // Catch:{ Exception -> 0x00a2 }
            X.27d.A00()     // Catch:{ Exception -> 0x00a2 }
            r0.A0H = r5
            goto L_0x0105
        L_0x00a2:
            r0 = move-exception
            if (r5 == 0) goto L_0x00a8
            r5.release()
        L_0x00a8:
            throw r0
        L_0x00a9:
            java.lang.String r5 = r0.A0l     // Catch:{ all -> 0x03e4 }
            java.lang.String r5 = X.002.A0R(r7, r5)     // Catch:{ all -> 0x03e4 }
            X.27d.A01(r5)     // Catch:{ all -> 0x03e4 }
            X.5Nx r6 = r0.A13     // Catch:{ all -> 0x03e4 }
            X.5Nw r6 = (X.C284775Nw) r6     // Catch:{ all -> 0x03e4 }
            X.2Km r5 = r2.A04     // Catch:{ all -> 0x03e4 }
            java.lang.String r12 = r5.A03     // Catch:{ all -> 0x03e4 }
            r5 = 0
            X.2SC r8 = X.2SC.A05     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            boolean r13 = r6.A03     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            X.2SB r10 = r6.A01     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            X.4PH r7 = r6.A00     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            X.27F r9 = r7.A00     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            java.lang.Integer r11 = X.AnonymousClass05K.A01     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            X.3n3 r5 = r8.A01(r9, r10, r11, r12, r13)     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            java.lang.String r7 = "configureCodec"
            X.27d.A01(r7)     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            android.media.MediaFormat r10 = r2.A01     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            android.view.Surface r9 = r2.A02     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            android.media.MediaCrypto r8 = r2.A00     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            r24 = 0
            java.lang.Object r7 = r6.A02     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            r20 = r5
            r21 = r10
            r22 = r9
            r23 = r8
            r25 = r7
            r20.configure(r21, r22, r23, r24, r25)     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            X.27d.A00()     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            java.lang.String r7 = "startCodec"
            X.27d.A01(r7)     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            r5.start()     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            X.27d.A00()     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            X.5fF r7 = new X.5fF     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            r7.<init>()     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            r7.A00 = r5     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            r7.A02 = r12     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            r7.A01 = r6     // Catch:{ 276 -> 0x03d8, Exception -> 0x03d1 }
            r0.A0H = r7     // Catch:{ all -> 0x03e4 }
            X.27d.A00()
        L_0x0105:
            long r20 = android.os.SystemClock.elapsedRealtime()
            X.3wB r5 = r0.A0C
            boolean r5 = r3.A09(r5)
            r15 = 2
            r13 = 1
            if (r5 != 0) goto L_0x012e
            X.3wB r12 = r0.A0C
            X.3wB r5 = X.C256683wB.A0Z
            if (r12 != 0) goto L_0x01d5
            java.lang.String r6 = "null"
        L_0x011b:
            java.lang.String r5 = r0.A0l
            java.lang.Object[] r7 = new java.lang.Object[]{r6, r5}
            java.lang.String r6 = "Format exceeds selected codec's capabilities [%s, %s]"
            java.util.Locale r5 = java.util.Locale.US
            java.lang.String r6 = java.lang.String.format(r5, r6, r7)
            java.lang.String r5 = "MediaCodecRenderer2"
            X.2AG.A04(r5, r6)
        L_0x012e:
            r0.A0I = r3
            r5 = r19
            r0.A0e = r5
            X.3wB r5 = r0.A0C
            r0.A0B = r5
            java.lang.String r5 = r0.A0l
            r8 = 29
            if (r4 != r8) goto L_0x0147
            java.lang.String r6 = "c2.android.aac.decoder"
            boolean r7 = r6.equals(r5)
            r6 = 1
            if (r7 != 0) goto L_0x0148
        L_0x0147:
            r6 = 0
        L_0x0148:
            r0.A0m = r6
            if (r4 > r8) goto L_0x017c
            java.lang.String r4 = "OMX.broadcom.video_decoder.tunnel"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0194
            java.lang.String r4 = "OMX.broadcom.video_decoder.tunnel.secure"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0194
            java.lang.String r4 = "OMX.bcm.vdec.avc.tunnel"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0194
            java.lang.String r4 = "OMX.bcm.vdec.avc.tunnel.secure"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0194
            java.lang.String r4 = "OMX.bcm.vdec.hevc.tunnel"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0194
            java.lang.String r4 = "OMX.bcm.vdec.hevc.tunnel.secure"
            boolean r4 = r4.equals(r1)
            if (r4 != 0) goto L_0x0194
        L_0x017c:
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.A03
            java.lang.String r4 = "Amazon"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x01d3
            java.lang.String r6 = com.google.android.exoplayer2.util.Util.A04
            java.lang.String r4 = "AFTS"
            boolean r4 = r4.equals(r6)
            if (r4 == 0) goto L_0x01d3
            boolean r3 = r3.A06
            if (r3 == 0) goto L_0x01d3
        L_0x0194:
            r3 = 1
        L_0x0195:
            r0.A0R = r3
            X.3n3 r3 = r0.A0H
            boolean r3 = r3.needsReconfiguration()
            if (r3 == 0) goto L_0x01a3
            r0.A0n = r13
            r0.A03 = r13
        L_0x01a3:
            java.lang.String r3 = "c2.android.mp3.decoder"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x01b2
            X.XaO r1 = new X.XaO
            r1.<init>()
            r0.A0G = r1
        L_0x01b2:
            int r1 = r0.A01
            if (r1 != r15) goto L_0x01bf
            long r3 = android.os.SystemClock.elapsedRealtime()
            r6 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 + r6
            r0.A0g = r3
        L_0x01bf:
            X.4Xn r3 = r0.A0E
            int r1 = r3.A02
            int r1 = r1 + 1
            r3.A02 = r1
            long r22 = r20 - r16
            r17 = r0
            r18 = r2
            r19 = r5
            r17.A0j(r18, r19, r20, r22)
            return
        L_0x01d3:
            r3 = 0
            goto L_0x0195
        L_0x01d5:
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            java.lang.String r5 = "id="
            r11.append(r5)
            java.lang.String r5 = r12.A0T
            r11.append(r5)
            java.lang.String r5 = ", mimeType="
            r11.append(r5)
            java.lang.String r5 = r12.A0W
            r11.append(r5)
            int r6 = r12.A05
            r10 = -1
            if (r6 == r10) goto L_0x01fb
            java.lang.String r5 = ", bitrate="
            r11.append(r5)
            r11.append(r6)
        L_0x01fb:
            java.lang.String r6 = r12.A0R
            if (r6 == 0) goto L_0x0207
            java.lang.String r5 = ", codecs="
            r11.append(r5)
            r11.append(r6)
        L_0x0207:
            com.google.android.exoplayer2.drm.DrmInitData r9 = r12.A0O
            r18 = 44
            if (r9 == 0) goto L_0x0285
            java.util.LinkedHashSet r14 = new java.util.LinkedHashSet
            r14.<init>()
            r8 = 0
        L_0x0213:
            int r5 = r9.A01
            if (r8 >= r5) goto L_0x0270
            com.google.android.exoplayer2.drm.DrmInitData$SchemeData[] r5 = r9.A03
            r5 = r5[r8]
            java.util.UUID r7 = r5.A03
            java.util.UUID r5 = X.AnonymousClass4T7.A01
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x022d
            java.lang.String r5 = "cenc"
        L_0x0227:
            r14.add(r5)
            int r8 = r8 + 1
            goto L_0x0213
        L_0x022d:
            java.util.UUID r5 = X.AnonymousClass4T7.A00
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0238
            java.lang.String r5 = "clearkey"
            goto L_0x0227
        L_0x0238:
            java.util.UUID r5 = X.AnonymousClass4T7.A02
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0243
            java.lang.String r5 = "playready"
            goto L_0x0227
        L_0x0243:
            java.util.UUID r5 = X.AnonymousClass4T7.A04
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x024e
            java.lang.String r5 = "widevine"
            goto L_0x0227
        L_0x024e:
            java.util.UUID r5 = X.AnonymousClass4T7.A03
            boolean r5 = r7.equals(r5)
            if (r5 == 0) goto L_0x0259
            java.lang.String r5 = "universal"
            goto L_0x0227
        L_0x0259:
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r5 = "unknown ("
            r6.append(r5)
            r6.append(r7)
            java.lang.String r5 = ")"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            goto L_0x0227
        L_0x0270:
            java.lang.String r5 = ", drm=["
            r11.append(r5)
            X.3El r5 = X.C239023El.A00(r18)
            java.util.Iterator r6 = r14.iterator()
            r5.A03(r11, r6)
            r5 = 93
            r11.append(r5)
        L_0x0285:
            int r7 = r12.A0L
            if (r7 == r10) goto L_0x029d
            int r6 = r12.A0A
            if (r6 == r10) goto L_0x029d
            java.lang.String r5 = ", res="
            r11.append(r5)
            r11.append(r7)
            java.lang.String r5 = "x"
            r11.append(r5)
            r11.append(r6)
        L_0x029d:
            float r6 = r12.A01
            r5 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r5 = (r6 > r5 ? 1 : (r6 == r5 ? 0 : -1))
            if (r5 == 0) goto L_0x02ad
            java.lang.String r5 = ", fps="
            r11.append(r5)
            r11.append(r6)
        L_0x02ad:
            int r6 = r12.A06
            if (r6 == r10) goto L_0x02b9
            java.lang.String r5 = ", channels="
            r11.append(r5)
            r11.append(r6)
        L_0x02b9:
            int r6 = r12.A0G
            if (r6 == r10) goto L_0x02c5
            java.lang.String r5 = ", sample_rate="
            r11.append(r5)
            r11.append(r6)
        L_0x02c5:
            java.lang.String r6 = r12.A0V
            if (r6 == 0) goto L_0x02d1
            java.lang.String r5 = ", language="
            r11.append(r5)
            r11.append(r6)
        L_0x02d1:
            java.lang.String r6 = r12.A0U
            if (r6 == 0) goto L_0x02e1
            r5 = 2030(0x7ee, float:2.845E-42)
            java.lang.String r5 = X.AnonymousClass000.A00(r5)
            r11.append(r5)
            r11.append(r6)
        L_0x02e1:
            int r8 = r12.A0H
            java.lang.String r7 = "]"
            if (r8 == 0) goto L_0x031a
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            r5 = r8 & 4
            if (r5 == 0) goto L_0x02f5
            java.lang.String r5 = "auto"
            r6.add(r5)
        L_0x02f5:
            r5 = r8 & 1
            if (r5 == 0) goto L_0x02fe
            java.lang.String r5 = "default"
            r6.add(r5)
        L_0x02fe:
            r5 = r8 & 2
            if (r5 == 0) goto L_0x0307
            java.lang.String r5 = "forced"
            r6.add(r5)
        L_0x0307:
            java.lang.String r5 = ", selectionFlags=["
            r11.append(r5)
            X.3El r5 = X.C239023El.A00(r18)
            java.util.Iterator r6 = r6.iterator()
            r5.A03(r11, r6)
            r11.append(r7)
        L_0x031a:
            int r6 = r12.A0E
            if (r6 == 0) goto L_0x03bd
            java.util.ArrayList r8 = new java.util.ArrayList
            r8.<init>()
            r5 = r6 & 1
            if (r5 == 0) goto L_0x032c
            java.lang.String r5 = "main"
            r8.add(r5)
        L_0x032c:
            r5 = r6 & 2
            if (r5 == 0) goto L_0x0335
            java.lang.String r5 = "alt"
            r8.add(r5)
        L_0x0335:
            r5 = r6 & 4
            if (r5 == 0) goto L_0x033e
            java.lang.String r5 = "supplementary"
            r8.add(r5)
        L_0x033e:
            r5 = r6 & 8
            if (r5 == 0) goto L_0x0347
            java.lang.String r5 = "commentary"
            r8.add(r5)
        L_0x0347:
            r5 = r6 & 16
            if (r5 == 0) goto L_0x0350
            java.lang.String r5 = "dub"
            r8.add(r5)
        L_0x0350:
            r5 = r6 & 32
            if (r5 == 0) goto L_0x0359
            java.lang.String r5 = "emergency"
            r8.add(r5)
        L_0x0359:
            r5 = r6 & 64
            if (r5 == 0) goto L_0x0362
            java.lang.String r5 = "caption"
            r8.add(r5)
        L_0x0362:
            r5 = r6 & 128(0x80, float:1.794E-43)
            if (r5 == 0) goto L_0x036b
            java.lang.String r5 = "subtitle"
            r8.add(r5)
        L_0x036b:
            r5 = r6 & 256(0x100, float:3.59E-43)
            if (r5 == 0) goto L_0x0374
            java.lang.String r5 = "sign"
            r8.add(r5)
        L_0x0374:
            r5 = r6 & 512(0x200, float:7.175E-43)
            if (r5 == 0) goto L_0x037d
            java.lang.String r5 = "describes-video"
            r8.add(r5)
        L_0x037d:
            r5 = r6 & 1024(0x400, float:1.435E-42)
            if (r5 == 0) goto L_0x0386
            java.lang.String r5 = "describes-music"
            r8.add(r5)
        L_0x0386:
            r5 = r6 & 2048(0x800, float:2.87E-42)
            if (r5 == 0) goto L_0x038f
            java.lang.String r5 = "enhanced-intelligibility"
            r8.add(r5)
        L_0x038f:
            r5 = r6 & 4096(0x1000, float:5.74E-42)
            if (r5 == 0) goto L_0x0398
            java.lang.String r5 = "transcribes-dialog"
            r8.add(r5)
        L_0x0398:
            r5 = r6 & 8192(0x2000, float:1.14794E-41)
            if (r5 == 0) goto L_0x03a1
            java.lang.String r5 = "easy-read"
            r8.add(r5)
        L_0x03a1:
            r5 = r6 & 16384(0x4000, float:2.2959E-41)
            if (r5 == 0) goto L_0x03aa
            java.lang.String r5 = "trick-play"
            r8.add(r5)
        L_0x03aa:
            java.lang.String r5 = ", roleFlags=["
            r11.append(r5)
            X.3El r6 = X.C239023El.A00(r18)
            java.util.Iterator r5 = r8.iterator()
            r6.A03(r11, r5)
            r11.append(r7)
        L_0x03bd:
            X.3wA r5 = r12.A0N
            java.lang.String r6 = r5.A07
            if (r6 == 0) goto L_0x03cb
            java.lang.String r5 = ", fbQualityLabel="
            r11.append(r5)
            r11.append(r6)
        L_0x03cb:
            java.lang.String r6 = r11.toString()
            goto L_0x011b
        L_0x03d1:
            r1 = move-exception
            if (r5 == 0) goto L_0x03e3
            r5.release()     // Catch:{ all -> 0x03e4 }
            goto L_0x03e3
        L_0x03d8:
            r0 = move-exception
            if (r5 == 0) goto L_0x03de
            r5.release()     // Catch:{ all -> 0x03e4 }
        L_0x03de:
            java.io.IOException r1 = new java.io.IOException     // Catch:{ all -> 0x03e4 }
            r1.<init>(r0)     // Catch:{ all -> 0x03e4 }
        L_0x03e3:
            throw r1     // Catch:{ all -> 0x03e4 }
        L_0x03e4:
            r0 = move-exception
            X.27d.A00()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.A05(android.media.MediaCrypto, X.2Km):void");
    }

    private void A06(C290325f8 r3) {
        C290325f8 r1 = this.A0j;
        if (r1 != r3) {
            if (r3 != null) {
                r3.A7C((C265184Sw) null);
            }
            if (r1 != null) {
                r1.ECN((C265184Sw) null);
            }
        }
        this.A0j = r3;
    }

    private void A07(C284805Nz r6) {
        this.A0K = r6;
        if (r6.A01 != -9223372036854775807L) {
            this.A0p = true;
        }
    }

    private boolean A08(int i) {
        AnonymousClass4PO r4 = this.A0C;
        r4.A01 = null;
        r4.A00 = null;
        AnonymousClass4PQ r3 = this.A12;
        r3.clear();
        int A0E2 = A0E(r4, r3, i | 4);
        if (A0E2 == -5) {
            A0R(r4);
            return true;
        } else if (A0E2 != -4 || (r3.A00 & 4) != 4) {
            return false;
        } else {
            this.A0U = true;
            A03();
            return false;
        }
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4Xn, java.lang.Object] */
    public void A0M(boolean z, boolean z2) {
        this.A0E = new Object();
        this.A08 = 0;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002c, code lost:
        if (r1 >= r5) goto L_0x002e;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A0N(X.C256683wB[] r9, long r10, long r12) {
        /*
            r8 = this;
            X.5Nz r0 = r8.A0K
            long r1 = r0.A01
            r3 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L_0x0016
            X.5Nz r0 = new X.5Nz
            r0.<init>(r3, r12)
            r8.A07(r0)
        L_0x0015:
            return
        L_0x0016:
            java.util.ArrayDeque r7 = r8.A0y
            boolean r0 = r7.isEmpty()
            if (r0 == 0) goto L_0x0042
            long r5 = r8.A06
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x002e
            long r1 = r8.A0h
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0042
            int r0 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x0042
        L_0x002e:
            X.5Nz r0 = new X.5Nz
            r0.<init>(r3, r12)
            r8.A07(r0)
            X.5Nz r0 = r8.A0K
            long r1 = r0.A01
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x0015
            r8.A0V()
            return
        L_0x0042:
            long r1 = r8.A06
            X.5Nz r0 = new X.5Nz
            r0.<init>(r1, r12)
            r7.add(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.A0N(X.3wB[], long, long):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0091, code lost:
        if (r1 != false) goto L_0x0093;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00bd, code lost:
        if (A09(r10) == false) goto L_0x00bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x00ed, code lost:
        if (r7 != false) goto L_0x00ef;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public X.C290365fC A0R(X.AnonymousClass4PO r15) {
        /*
            r14 = this;
            X.3wB r0 = r15.A00
            r0.getClass()
            r14.A0e(r0)
            r3 = 1
            r14.A0d = r3
            X.3wB r10 = r15.A00
            r10.getClass()
            java.lang.String r5 = r10.A0W
            if (r5 == 0) goto L_0x0106
            X.5f8 r6 = r15.A01
            X.5f8 r1 = r14.A0F
            if (r1 == r6) goto L_0x0025
            r0 = 0
            if (r6 == 0) goto L_0x0020
            r6.A7C(r0)
        L_0x0020:
            if (r1 == 0) goto L_0x0025
            r1.ECN(r0)
        L_0x0025:
            r14.A0F = r6
            r14.A0C = r10
            boolean r0 = r14.A0O
            r8 = 0
            if (r0 == 0) goto L_0x0031
            r14.A0N = r3
            return r8
        L_0x0031:
            X.3n3 r4 = r14.A0H
            if (r4 != 0) goto L_0x003b
            r14.A0M = r8
            r14.A0Y()
            return r8
        L_0x003b:
            X.2Km r2 = r14.A0I
            X.3wB r9 = r14.A0B
            X.5f8 r7 = r14.A0j
            if (r7 == r6) goto L_0x00a1
            if (r6 == 0) goto L_0x0093
            if (r7 == 0) goto L_0x0093
            X.X10 r8 = r6.At4()
            if (r8 == 0) goto L_0x0093
            X.X10 r0 = r7.At4()
            if (r0 == 0) goto L_0x0093
            java.lang.Class r1 = r8.getClass()
            java.lang.Class r0 = r0.getClass()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0093
            boolean r0 = r8 instanceof X.WM4
            if (r0 == 0) goto L_0x00a1
            java.util.UUID r1 = r6.Bpi()
            java.util.UUID r0 = r7.Bpi()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0093
            java.util.UUID r1 = X.AnonymousClass4T7.A02
            java.util.UUID r0 = r7.Bpi()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0093
            java.util.UUID r0 = r6.Bpi()
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0093
            boolean r1 = r6.EHk(r5)
            boolean r0 = r2.A06
            if (r0 != 0) goto L_0x00a1
            if (r1 == 0) goto L_0x00a1
        L_0x0093:
            r14.A01()
            java.lang.String r11 = r2.A03
            r12 = 0
            r13 = 128(0x80, float:1.794E-43)
        L_0x009b:
            X.5fC r8 = new X.5fC
            r8.<init>(r9, r10, r11, r12, r13)
            return r8
        L_0x00a1:
            X.5f8 r1 = r14.A0F
            X.5f8 r0 = r14.A0j
            r7 = 0
            if (r1 == r0) goto L_0x00a9
            r7 = 1
        L_0x00a9:
            X.5fC r5 = r14.A0Q(r9, r10, r2)
            int r0 = r5.A01
            r1 = 3
            r6 = 2
            if (r0 == 0) goto L_0x0102
            if (r0 == r3) goto L_0x00cd
            if (r0 == r6) goto L_0x00e1
            if (r0 != r1) goto L_0x00fc
            boolean r0 = r14.A09(r10)
            if (r0 != 0) goto L_0x00eb
        L_0x00bf:
            r13 = 16
        L_0x00c1:
            X.3n3 r0 = r14.A0H
            if (r0 != r4) goto L_0x00c9
            int r0 = r14.A01
            if (r0 != r1) goto L_0x0105
        L_0x00c9:
            java.lang.String r11 = r2.A03
            r12 = 0
            goto L_0x009b
        L_0x00cd:
            boolean r0 = r14.A09(r10)
            if (r0 == 0) goto L_0x00bf
            r14.A0B = r10
            if (r7 != 0) goto L_0x00ef
            boolean r0 = r14.A0T
            if (r0 == 0) goto L_0x00df
            r14.A02 = r3
            r14.A01 = r3
        L_0x00df:
            r13 = 0
            goto L_0x00c1
        L_0x00e1:
            boolean r0 = r14.A09(r10)
            if (r0 == 0) goto L_0x00bf
            r14.A0n = r3
            r14.A03 = r3
        L_0x00eb:
            r14.A0B = r10
            if (r7 == 0) goto L_0x00df
        L_0x00ef:
            boolean r0 = r14.A0T
            if (r0 == 0) goto L_0x00f8
            r14.A02 = r3
            r14.A01 = r6
            goto L_0x00df
        L_0x00f8:
            r14.A04()
            goto L_0x00df
        L_0x00fc:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>()
            throw r0
        L_0x0102:
            r14.A01()
        L_0x0105:
            return r5
        L_0x0106:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            r2.<init>()
            r1 = 4005(0xfa5, float:5.612E-42)
            r0 = 0
            X.48u r0 = r14.A0F(r10, r2, r1, r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.A0R(X.4PO):X.5fC");
    }

    public C8318Qny A0T(2Km r2, Throwable th) {
        return new C8318Qny(r2, th);
    }

    public final void A0W() {
        if (this instanceof C266114Xp) {
            C266114Xp r4 = (C266114Xp) this;
            try {
                DefaultAudioSink defaultAudioSink = (DefaultAudioSink) r4.A0A;
                if (!defaultAudioSink.A0O && defaultAudioSink.A0B != null && DefaultAudioSink.A09(defaultAudioSink)) {
                    DefaultAudioSink.A07(defaultAudioSink);
                    defaultAudioSink.A0O = true;
                }
            } catch (AnonymousClass4UF e) {
                throw r4.A0F(e.A00, e, 5002, e.A01);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: X.5f6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v2, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v4, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v9, resolved type: java.util.List} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v6, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v57, resolved type: X.5OP} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v65, resolved type: X.5f6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v66, resolved type: X.5f6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0Y() {
        /*
            r22 = this;
            r0 = r22
            X.3n3 r1 = r0.A0H
            if (r1 != 0) goto L_0x0049
            boolean r1 = r0.A0O
            if (r1 != 0) goto L_0x0049
            X.3wB r3 = r0.A0C
            if (r3 == 0) goto L_0x0049
            X.5f8 r1 = r0.A0F
            if (r1 != 0) goto L_0x0051
            r2 = r0
            boolean r1 = r0 instanceof X.C266114Xp
            if (r1 == 0) goto L_0x0051
            X.4Xp r2 = (X.C266114Xp) r2
            X.4Q2 r1 = r2.A0A
            com.google.android.exoplayer2.audio.DefaultAudioSink r1 = (com.google.android.exoplayer2.audio.DefaultAudioSink) r1
            int r1 = r1.B7U(r3)
            if (r1 == 0) goto L_0x0051
            X.3wB r1 = r0.A0C
            r0.A00()
            java.lang.String r2 = r1.A0W
            java.lang.String r1 = "audio/mp4a-latm"
            boolean r1 = r1.equals(r2)
            r3 = 1
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = "audio/mpeg"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004a
            java.lang.String r1 = "audio/opus"
            boolean r1 = r1.equals(r2)
            if (r1 != 0) goto L_0x004a
            X.5Ny r1 = r0.A0w
            r1.A00 = r3
        L_0x0047:
            r0.A0O = r3
        L_0x0049:
            return
        L_0x004a:
            X.5Ny r2 = r0.A0w
            r1 = 32
            r2.A00 = r1
            goto L_0x0047
        L_0x0051:
            X.5f8 r1 = r0.A0F
            r0.A06(r1)
            X.3wB r1 = r0.A0C
            java.lang.String r6 = r1.A0W
            X.5f8 r1 = r0.A0j
            if (r1 == 0) goto L_0x00a2
            X.X10 r5 = r1.At4()
            android.media.MediaCrypto r1 = r0.A0i
            r4 = 1
            if (r1 != 0) goto L_0x0071
            if (r5 != 0) goto L_0x0085
            X.5f8 r1 = r0.A0j
            X.5OP r1 = r1.B27()
            if (r1 == 0) goto L_0x0049
        L_0x0071:
            boolean r1 = X.WM4.A03
            if (r1 == 0) goto L_0x00a2
            boolean r1 = r5 instanceof X.WM4
            if (r1 == 0) goto L_0x00a2
            X.5f8 r1 = r0.A0j
            int r2 = r1.Bz1()
            if (r2 == r4) goto L_0x0247
            r1 = 4
            if (r2 == r1) goto L_0x00a2
            return
        L_0x0085:
            boolean r1 = r5 instanceof X.WM4
            if (r1 == 0) goto L_0x0071
            r1 = r5
            X.WM4 r1 = (X.WM4) r1
            java.util.UUID r3 = r1.A01     // Catch:{ MediaCryptoException -> 0x021c }
            byte[] r2 = r1.A02     // Catch:{ MediaCryptoException -> 0x021c }
            android.media.MediaCrypto r1 = new android.media.MediaCrypto     // Catch:{ MediaCryptoException -> 0x021c }
            r1.<init>(r3, r2)     // Catch:{ MediaCryptoException -> 0x021c }
            r0.A0i = r1     // Catch:{ MediaCryptoException -> 0x021c }
            boolean r2 = r1.requiresSecureDecoderComponent(r6)
            r1 = 0
            if (r2 == 0) goto L_0x009f
            r1 = 1
        L_0x009f:
            r0.A0o = r1
            goto L_0x0071
        L_0x00a2:
            android.media.MediaCrypto r1 = r0.A0i     // Catch:{ 5f6 -> 0x0241 }
            boolean r13 = r0.A0o     // Catch:{ 5f6 -> 0x0241 }
            java.util.ArrayDeque r2 = r0.A0M     // Catch:{ 5f6 -> 0x0241 }
            r8 = 0
            if (r2 != 0) goto L_0x0139
            X.3wP r4 = r0.A0x     // Catch:{ 275 -> 0x0235 }
            X.3wB r2 = r0.A0C     // Catch:{ 275 -> 0x0235 }
            java.util.ArrayList r6 = r0.A0U(r2, r4, r13)     // Catch:{ 275 -> 0x0235 }
            boolean r2 = r6.isEmpty()     // Catch:{ 275 -> 0x0235 }
            r5 = 0
            if (r2 == 0) goto L_0x00ef
            if (r13 == 0) goto L_0x00ef
            X.3wB r2 = r0.A0C     // Catch:{ 275 -> 0x0235 }
            java.util.ArrayList r6 = r0.A0U(r2, r4, r5)     // Catch:{ 275 -> 0x0235 }
            boolean r2 = r6.isEmpty()     // Catch:{ 275 -> 0x0235 }
            if (r2 != 0) goto L_0x00ef
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 275 -> 0x0235 }
            r3.<init>()     // Catch:{ 275 -> 0x0235 }
            java.lang.String r2 = "Drm session requires secure decoder for "
            r3.append(r2)     // Catch:{ 275 -> 0x0235 }
            X.3wB r2 = r0.A0C     // Catch:{ 275 -> 0x0235 }
            java.lang.String r2 = r2.A0W     // Catch:{ 275 -> 0x0235 }
            r3.append(r2)     // Catch:{ 275 -> 0x0235 }
            java.lang.String r2 = ", but no secure decoder available. Trying to proceed with "
            r3.append(r2)     // Catch:{ 275 -> 0x0235 }
            r3.append(r6)     // Catch:{ 275 -> 0x0235 }
            java.lang.String r2 = "."
            r3.append(r2)     // Catch:{ 275 -> 0x0235 }
            java.lang.String r3 = r3.toString()     // Catch:{ 275 -> 0x0235 }
            java.lang.String r2 = "MediaCodecRenderer2"
            X.2AG.A04(r2, r3)     // Catch:{ 275 -> 0x0235 }
        L_0x00ef:
            boolean r2 = r6.isEmpty()     // Catch:{ 275 -> 0x0235 }
            if (r2 == 0) goto L_0x0118
            boolean r2 = r0.A0b     // Catch:{ 275 -> 0x0235 }
            if (r2 == 0) goto L_0x0118
            X.3wB r2 = r0.A0C     // Catch:{ 275 -> 0x0235 }
            java.lang.String r2 = X.2BR.A03(r2)     // Catch:{ 275 -> 0x0235 }
            if (r2 == 0) goto L_0x0118
            java.util.List r4 = r4.Ave(r2, r5, r5)     // Catch:{ 275 -> 0x0235 }
            X.3wB r2 = r0.A0C     // Catch:{ 275 -> 0x0235 }
            java.lang.String r3 = r2.A0W     // Catch:{ 275 -> 0x0235 }
            java.lang.String r2 = "video/dolby-vision"
            boolean r2 = r2.equals(r3)     // Catch:{ 275 -> 0x0235 }
            if (r2 == 0) goto L_0x0118
            boolean r2 = r4.isEmpty()     // Catch:{ 275 -> 0x0235 }
            if (r2 != 0) goto L_0x0118
            r6 = r4
        L_0x0118:
            java.util.ArrayDeque r3 = new java.util.ArrayDeque     // Catch:{ 275 -> 0x0235 }
            r3.<init>()     // Catch:{ 275 -> 0x0235 }
            r0.A0M = r3     // Catch:{ 275 -> 0x0235 }
            boolean r2 = r0.A10     // Catch:{ 275 -> 0x0235 }
            if (r2 == 0) goto L_0x0129
            r3.addAll(r6)     // Catch:{ 275 -> 0x0235 }
        L_0x0126:
            r0.A0J = r8     // Catch:{ 275 -> 0x0235 }
            goto L_0x0139
        L_0x0129:
            boolean r2 = r6.isEmpty()     // Catch:{ 275 -> 0x0235 }
            if (r2 != 0) goto L_0x0126
            java.util.ArrayDeque r3 = r0.A0M     // Catch:{ 275 -> 0x0235 }
            java.lang.Object r2 = r6.get(r5)     // Catch:{ 275 -> 0x0235 }
            r3.add(r2)     // Catch:{ 275 -> 0x0235 }
            goto L_0x0126
        L_0x0139:
            boolean r2 = r0.A0X     // Catch:{ 5f6 -> 0x0241 }
            if (r2 != 0) goto L_0x015b
            X.3wB r4 = r0.A0C     // Catch:{ 5f6 -> 0x0241 }
            boolean r2 = r0.A0q(r4)     // Catch:{ 5f6 -> 0x0241 }
            if (r2 == 0) goto L_0x015b
            java.util.ArrayDeque r3 = r0.A0M     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r2 = r4.A0W     // Catch:{ 5f6 -> 0x0241 }
            r18 = 0
            r19 = 1
            java.lang.String r15 = "meta.dav1d.av1.decoder"
            r14 = r8
            r16 = r2
            r17 = r2
            X.2Km r2 = X.2Km.A00(r14, r15, r16, r17, r18, r19)     // Catch:{ 5f6 -> 0x0241 }
            r3.addFirst(r2)     // Catch:{ 5f6 -> 0x0241 }
        L_0x015b:
            java.util.ArrayDeque r2 = r0.A0M     // Catch:{ 5f6 -> 0x0241 }
            boolean r2 = r2.isEmpty()     // Catch:{ 5f6 -> 0x0241 }
            if (r2 != 0) goto L_0x022a
            java.util.ArrayDeque r2 = r0.A0M     // Catch:{ 5f6 -> 0x0241 }
            java.lang.Object r4 = r2.peekFirst()     // Catch:{ 5f6 -> 0x0241 }
        L_0x0169:
            X.3n3 r2 = r0.A0H     // Catch:{ 5f6 -> 0x0241 }
            if (r2 != 0) goto L_0x0227
            java.util.ArrayDeque r2 = r0.A0M     // Catch:{ 5f6 -> 0x0241 }
            java.lang.Object r7 = r2.peekFirst()     // Catch:{ 5f6 -> 0x0241 }
            X.2Km r7 = (X.2Km) r7     // Catch:{ 5f6 -> 0x0241 }
            boolean r2 = r0.A0s(r7)     // Catch:{ 5f6 -> 0x0241 }
            if (r2 == 0) goto L_0x0049
            r0.A05(r1, r7)     // Catch:{ Exception -> 0x017f }
            goto L_0x0169
        L_0x017f:
            r2 = move-exception
            java.lang.String r5 = "MediaCodecRenderer2"
            if (r7 != r4) goto L_0x019c
            java.lang.String r2 = "Preferred decoder instantiation failed. Sleeping for 50ms then retrying."
            X.2AG.A04(r5, r2)     // Catch:{ Exception -> 0x019d }
            X.2Bb r2 = X.2Bb.A04     // Catch:{ Exception -> 0x019d }
            int r2 = X.2BY.A00(r2)     // Catch:{ Exception -> 0x019d }
            if (r2 < 0) goto L_0x0193
            long r2 = (long) r2     // Catch:{ Exception -> 0x019d }
            goto L_0x0195
        L_0x0193:
            r2 = 50
        L_0x0195:
            java.lang.Thread.sleep(r2)     // Catch:{ Exception -> 0x019d }
            r0.A05(r1, r7)     // Catch:{ Exception -> 0x019d }
            goto L_0x0169
        L_0x019c:
            throw r2     // Catch:{ Exception -> 0x019d }
        L_0x019d:
            r12 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 5f6 -> 0x0241 }
            r3.<init>()     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r2 = "Failed to initialize decoder: "
            r3.append(r2)     // Catch:{ 5f6 -> 0x0241 }
            r3.append(r7)     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r2 = r3.toString()     // Catch:{ 5f6 -> 0x0241 }
            X.2AG.A06(r5, r2, r12)     // Catch:{ 5f6 -> 0x0241 }
            java.util.ArrayDeque r2 = r0.A0M     // Catch:{ 5f6 -> 0x0241 }
            r2.removeFirst()     // Catch:{ 5f6 -> 0x0241 }
            X.3wB r5 = r0.A0C     // Catch:{ 5f6 -> 0x0241 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ 5f6 -> 0x0241 }
            r3.<init>()     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r2 = "Decoder init failed: "
            r3.append(r2)     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r2 = r7.A03     // Catch:{ 5f6 -> 0x0241 }
            r3.append(r2)     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r2 = ", "
            r3.append(r2)     // Catch:{ 5f6 -> 0x0241 }
            r3.append(r5)     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r9 = r3.toString()     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r10 = r5.A0W     // Catch:{ 5f6 -> 0x0241 }
            boolean r2 = r12 instanceof android.media.MediaCodec.CodecException     // Catch:{ 5f6 -> 0x0241 }
            if (r2 == 0) goto L_0x021a
            r2 = r12
            android.media.MediaCodec$CodecException r2 = (android.media.MediaCodec.CodecException) r2     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r11 = r2.getDiagnosticInfo()     // Catch:{ 5f6 -> 0x0241 }
        L_0x01e1:
            X.5f6 r6 = new X.5f6     // Catch:{ 5f6 -> 0x0241 }
            r6.<init>(r7, r8, r9, r10, r11, r12, r13)     // Catch:{ 5f6 -> 0x0241 }
            r0.A0k(r6)     // Catch:{ 5f6 -> 0x0241 }
            X.5f6 r2 = r0.A0J     // Catch:{ 5f6 -> 0x0241 }
            if (r2 != 0) goto L_0x01fa
            r0.A0J = r6     // Catch:{ 5f6 -> 0x0241 }
        L_0x01ef:
            java.util.ArrayDeque r2 = r0.A0M     // Catch:{ 5f6 -> 0x0241 }
            boolean r2 = r2.isEmpty()     // Catch:{ 5f6 -> 0x0241 }
            if (r2 == 0) goto L_0x0169
            X.5f6 r4 = r0.A0J     // Catch:{ 5f6 -> 0x0241 }
            goto L_0x0240
        L_0x01fa:
            java.lang.String r17 = r2.getMessage()     // Catch:{ 5f6 -> 0x0241 }
            java.lang.Throwable r20 = r2.getCause()     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r5 = r2.A03     // Catch:{ 5f6 -> 0x0241 }
            boolean r3 = r2.A04     // Catch:{ 5f6 -> 0x0241 }
            X.2Km r15 = r2.A00     // Catch:{ 5f6 -> 0x0241 }
            java.lang.String r2 = r2.A02     // Catch:{ 5f6 -> 0x0241 }
            X.5f6 r14 = new X.5f6     // Catch:{ 5f6 -> 0x0241 }
            r16 = r6
            r18 = r5
            r19 = r2
            r21 = r3
            r14.<init>(r15, r16, r17, r18, r19, r20, r21)     // Catch:{ 5f6 -> 0x0241 }
            r0.A0J = r14     // Catch:{ 5f6 -> 0x0241 }
            goto L_0x01ef
        L_0x021a:
            r11 = 0
            goto L_0x01e1
        L_0x021c:
            r4 = move-exception
            X.3wB r3 = r0.A0C
            r2 = 6006(0x1776, float:8.416E-42)
            r1 = 0
            X.48u r0 = r0.A0F(r3, r4, r2, r1)
            throw r0
        L_0x0227:
            r0.A0M = r8     // Catch:{ 5f6 -> 0x0241 }
            return
        L_0x022a:
            X.3wB r2 = r0.A0C     // Catch:{ 5f6 -> 0x0241 }
            r1 = -49999(0xffffffffffff3cb1, float:NaN)
            X.5f6 r4 = new X.5f6     // Catch:{ 5f6 -> 0x0241 }
            r4.<init>(r2, r8, r1, r13)     // Catch:{ 5f6 -> 0x0241 }
            goto L_0x0240
        L_0x0235:
            r3 = move-exception
            X.3wB r2 = r0.A0C     // Catch:{ 5f6 -> 0x0241 }
            r1 = -49998(0xffffffffffff3cb2, float:NaN)
            X.5f6 r4 = new X.5f6     // Catch:{ 5f6 -> 0x0241 }
            r4.<init>(r2, r3, r1, r13)     // Catch:{ 5f6 -> 0x0241 }
        L_0x0240:
            throw r4     // Catch:{ 5f6 -> 0x0241 }
        L_0x0241:
            r2 = move-exception
            X.3wB r4 = r0.A0C
            r3 = 4001(0xfa1, float:5.607E-42)
            goto L_0x0254
        L_0x0247:
            X.5f8 r1 = r0.A0j
            X.5OP r2 = r1.B27()
            r2.getClass()
            X.3wB r4 = r0.A0C
            int r3 = r2.A00
        L_0x0254:
            r1 = 0
            X.48u r0 = r0.A0F(r4, r2, r3, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.A0Y():void");
    }

    public void A0b(long j) {
        this.A0h = j;
        while (true) {
            ArrayDeque arrayDeque = this.A0y;
            if (!arrayDeque.isEmpty() && j >= ((C284805Nz) arrayDeque.peek()).A00) {
                A07((C284805Nz) arrayDeque.poll());
                A0V();
            } else {
                return;
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: X.3wB} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0c(long r11) {
        /*
            r10 = this;
            X.5Nz r0 = r10.A0K
            X.4PX r6 = r0.A02
            monitor-enter(r6)
            r4 = 0
        L_0x0006:
            int r5 = r6.A01     // Catch:{ all -> 0x0078 }
            if (r5 <= 0) goto L_0x002a
            long[] r0 = r6.A02     // Catch:{ all -> 0x0078 }
            int r9 = r6.A00     // Catch:{ all -> 0x0078 }
            r0 = r0[r9]     // Catch:{ all -> 0x0078 }
            long r7 = r11 - r0
            r1 = 0
            int r0 = (r7 > r1 ? 1 : (r7 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x002a
            r3 = 1
            java.lang.Object[] r2 = r6.A03     // Catch:{ all -> 0x0078 }
            r4 = r2[r9]     // Catch:{ all -> 0x0078 }
            r0 = 0
            r2[r9] = r0     // Catch:{ all -> 0x0078 }
            int r1 = r9 + 1
            int r0 = r2.length     // Catch:{ all -> 0x0078 }
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x0078 }
            int r5 = r5 - r3
            r6.A01 = r5     // Catch:{ all -> 0x0078 }
            goto L_0x0006
        L_0x002a:
            monitor-exit(r6)
            X.3wB r4 = (X.C256683wB) r4
            if (r4 != 0) goto L_0x0060
            boolean r0 = r10.A0p
            if (r0 == 0) goto L_0x0060
            android.media.MediaFormat r0 = r10.A09
            if (r0 == 0) goto L_0x0060
            X.5Nz r0 = r10.A0K
            X.4PX r6 = r0.A02
            monitor-enter(r6)
            int r5 = r6.A01     // Catch:{ all -> 0x0078 }
            if (r5 != 0) goto L_0x0041
            goto L_0x005c
        L_0x0041:
            r3 = 1
            r0 = 0
            if (r5 <= 0) goto L_0x0046
            r0 = 1
        L_0x0046:
            X.C256703wD.A04(r0)     // Catch:{ all -> 0x0078 }
            java.lang.Object[] r2 = r6.A03     // Catch:{ all -> 0x0078 }
            int r1 = r6.A00     // Catch:{ all -> 0x0078 }
            r4 = r2[r1]     // Catch:{ all -> 0x0078 }
            r0 = 0
            r2[r1] = r0     // Catch:{ all -> 0x0078 }
            int r1 = r1 + 1
            int r0 = r2.length     // Catch:{ all -> 0x0078 }
            int r1 = r1 % r0
            r6.A00 = r1     // Catch:{ all -> 0x0078 }
            int r5 = r5 - r3
            r6.A01 = r5     // Catch:{ all -> 0x0078 }
            goto L_0x005d
        L_0x005c:
            r4 = 0
        L_0x005d:
            monitor-exit(r6)
            X.3wB r4 = (X.C256683wB) r4
        L_0x0060:
            r1 = 0
            if (r4 == 0) goto L_0x006f
            r10.A0D = r4
        L_0x0065:
            android.media.MediaFormat r0 = r10.A09
            r10.A0d(r0, r4)
            r10.A0S = r1
            r10.A0p = r1
        L_0x006e:
            return
        L_0x006f:
            boolean r0 = r10.A0S
            if (r0 == 0) goto L_0x006e
            X.3wB r4 = r10.A0D
            if (r4 == 0) goto L_0x006e
            goto L_0x0065
        L_0x0078:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.A0c(long):void");
    }

    public boolean A0n() {
        return false;
    }

    public final boolean A0p() {
        if (this.A0H == null) {
            return false;
        }
        int i = this.A01;
        if (i == 3 || ((this.A0m && !this.A0Q) || A0o())) {
            A0Z();
            return true;
        }
        if (i == 2) {
            try {
                A04();
            } catch (C2612348u e) {
                2AG.A06("MediaCodecRenderer2", "Failed to update the DRM session, releasing the codec instead.", e);
                A0Z();
                return true;
            }
        }
        A02();
        return false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:? A[ORIG_RETURN, RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x000c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean CaO() {
        /*
            r5 = this;
            X.3wB r0 = r5.A0C
            if (r0 != 0) goto L_0x002b
            java.lang.Integer r0 = X.AnonymousClass05K.A01
        L_0x0006:
            r5.A06 = r0
        L_0x0008:
            X.3wB r0 = r5.A0C
            if (r0 == 0) goto L_0x0038
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L_0x0029
            int r0 = r5.A05
            if (r0 >= 0) goto L_0x0029
            long r3 = r5.A0g
            r1 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x0038
            long r1 = android.os.SystemClock.elapsedRealtime()
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 >= 0) goto L_0x0038
        L_0x0029:
            r0 = 1
            return r0
        L_0x002b:
            boolean r0 = r5.A0G()
            if (r0 != 0) goto L_0x0008
            int r0 = r5.A05
            if (r0 >= 0) goto L_0x0008
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            goto L_0x0006
        L_0x0038:
            r0 = 0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.CaO():boolean");
    }

    /*  JADX ERROR: IndexOutOfBoundsException in pass: RegionMakerVisitor
        java.lang.IndexOutOfBoundsException: Index: 0, Size: 0
        	at java.util.ArrayList.rangeCheck(ArrayList.java:659)
        	at java.util.ArrayList.get(ArrayList.java:435)
        	at jadx.core.dex.nodes.InsnNode.getArg(InsnNode.java:101)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:611)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverseMonitorExits(RegionMaker.java:619)
        	at jadx.core.dex.visitors.regions.RegionMaker.processMonitorEnter(RegionMaker.java:561)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:133)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:698)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMaker.processIf(RegionMaker.java:693)
        	at jadx.core.dex.visitors.regions.RegionMaker.traverse(RegionMaker.java:123)
        	at jadx.core.dex.visitors.regions.RegionMaker.makeRegion(RegionMaker.java:86)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:49)
        */
    public void EEq(long r37, long r39) {
        /*
            r36 = this;
            r0 = r36
            boolean r1 = r0.A0a
            r3 = 0
            if (r1 == 0) goto L_0x000c
            r0.A0a = r3
            r0.A03()
        L_0x000c:
            X.48u r5 = r0.A0A
            if (r5 != 0) goto L_0x04d1
            r20 = 4003(0xfa3, float:5.61E-42)
            r7 = 1
            boolean r1 = r0.A0Z     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 == 0) goto L_0x001b
            r0.A0W()     // Catch:{ IllegalStateException -> 0x0496 }
            return
        L_0x001b:
            X.3wB r1 = r0.A0C     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 != 0) goto L_0x0027
            r1 = 2
            boolean r1 = r0.A08(r1)     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 != 0) goto L_0x0027
            return
        L_0x0027:
            r0.A0Y()     // Catch:{ IllegalStateException -> 0x0496 }
            boolean r1 = r0.A0O     // Catch:{ IllegalStateException -> 0x0496 }
            r4 = r37
            r30 = r39
            if (r1 == 0) goto L_0x0063
            java.lang.String r1 = "bypassRender"
            X.27d.A01(r1)     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x0037:
            boolean r1 = r0.A0Z     // Catch:{ IllegalStateException -> 0x0496 }
            r1 = r1 ^ 1
            X.C256703wD.A04(r1)     // Catch:{ IllegalStateException -> 0x0496 }
            X.5Ny r6 = r0.A0w     // Catch:{ IllegalStateException -> 0x0496 }
            int r11 = r6.A01     // Catch:{ IllegalStateException -> 0x0496 }
            if (r11 <= 0) goto L_0x03ca
            r23 = 0
            java.nio.ByteBuffer r10 = r6.A02     // Catch:{ IllegalStateException -> 0x0496 }
            int r9 = r0.A05     // Catch:{ IllegalStateException -> 0x0496 }
            long r1 = r6.A01     // Catch:{ IllegalStateException -> 0x0496 }
            r12 = -2147483648(0xffffffff80000000, float:-0.0)
            int r13 = r6.A00     // Catch:{ IllegalStateException -> 0x0496 }
            r8 = r13 & r12
            r34 = 0
            if (r8 != r12) goto L_0x0058
            r34 = 1
        L_0x0058:
            r12 = 4
            r8 = r13 & 4
            r35 = 0
            if (r8 != r12) goto L_0x03aa
            r35 = 1
            goto L_0x03aa
        L_0x0063:
            X.3n3 r1 = r0.A0H     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 == 0) goto L_0x0483
            android.os.SystemClock.elapsedRealtime()     // Catch:{ IllegalStateException -> 0x0496 }
            java.lang.String r1 = "drainAndFeed"
            X.27d.A01(r1)     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x006f:
            int r1 = r0.A05     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 >= 0) goto L_0x00a0
            X.3n3 r1 = r0.A0H     // Catch:{ IllegalStateException -> 0x0474 }
            android.media.MediaCodec$BufferInfo r8 = r0.A0s     // Catch:{ IllegalStateException -> 0x0474 }
            int r2 = r1.dequeueOutputBufferIndex(r8)     // Catch:{ IllegalStateException -> 0x0474 }
            if (r2 >= 0) goto L_0x00e4
            r1 = -2
            if (r2 != r1) goto L_0x008d
            r0.A0Q = r7     // Catch:{ IllegalStateException -> 0x0474 }
            X.3n3 r1 = r0.A0H     // Catch:{ IllegalStateException -> 0x0474 }
            android.media.MediaFormat r1 = r1.getOutputFormat()     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A09 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A0S = r7     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x006f
        L_0x008d:
            boolean r1 = r0.A0R     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 == 0) goto L_0x00f1
            boolean r1 = r0.A0U     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != 0) goto L_0x00ee
            int r2 = r0.A02     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = 2
            if (r2 != r1) goto L_0x00f1
            goto L_0x00ee
        L_0x009b:
            r0.A0W = r6     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A0c(r1)     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x00a0:
            X.3n3 r14 = r0.A0H     // Catch:{ IllegalStateException -> 0x0474 }
            java.nio.ByteBuffer r13 = r0.A0L     // Catch:{ IllegalStateException -> 0x0474 }
            int r12 = r0.A05     // Catch:{ IllegalStateException -> 0x0474 }
            android.media.MediaCodec$BufferInfo r11 = r0.A0s     // Catch:{ IllegalStateException -> 0x0474 }
            int r10 = r11.flags     // Catch:{ IllegalStateException -> 0x0474 }
            long r1 = r11.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0474 }
            boolean r9 = r0.A0V     // Catch:{ IllegalStateException -> 0x0474 }
            boolean r8 = r0.A0W     // Catch:{ IllegalStateException -> 0x0474 }
            X.3wB r6 = r0.A0D     // Catch:{ IllegalStateException -> 0x0474 }
            r21 = r0
            r22 = r6
            r23 = r14
            r24 = r13
            r25 = r12
            r26 = r10
            r27 = r7
            r28 = r4
            r32 = r1
            r34 = r9
            r35 = r8
            boolean r1 = r21.A0r(r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r35)     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 == 0) goto L_0x00f1
            long r1 = r11.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A0b(r1)     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = r11.flags     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = r1 & 4
            r2 = 0
            if (r1 == 0) goto L_0x00db
            r2 = 1
        L_0x00db:
            r1 = -1
            r0.A05 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = 0
            r0.A0L = r1     // Catch:{ IllegalStateException -> 0x0474 }
            if (r2 != 0) goto L_0x00ee
            goto L_0x006f
        L_0x00e4:
            int r1 = r8.size     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != 0) goto L_0x0348
            int r1 = r8.flags     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = r1 & 4
            if (r1 == 0) goto L_0x0348
        L_0x00ee:
            r0.A03()     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x00f1:
            X.3n3 r4 = r0.A0H     // Catch:{ IllegalStateException -> 0x0474 }
            if (r4 == 0) goto L_0x03d0
            int r1 = r0.A02     // Catch:{ IllegalStateException -> 0x0474 }
            r2 = 2
            if (r1 == r2) goto L_0x03d0
            boolean r1 = r0.A0U     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != 0) goto L_0x03d0
            int r1 = r0.A04     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 >= 0) goto L_0x0117
            int r5 = r4.dequeueInputBufferIndex()     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A04 = r5     // Catch:{ IllegalStateException -> 0x0474 }
            if (r5 < 0) goto L_0x03d0
            X.4PQ r4 = r0.A0u     // Catch:{ IllegalStateException -> 0x0474 }
            X.3n3 r1 = r0.A0H     // Catch:{ IllegalStateException -> 0x0474 }
            java.nio.ByteBuffer r1 = r1.getInputBuffer(r5)     // Catch:{ IllegalStateException -> 0x0474 }
            r4.A02 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            r4.clear()     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0117:
            int r1 = r0.A02     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != r7) goto L_0x0137
            boolean r1 = r0.A0R     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != 0) goto L_0x0133
            X.3n3 r4 = r0.A0H     // Catch:{ IllegalStateException -> 0x0474 }
            int r5 = r0.A04     // Catch:{ IllegalStateException -> 0x0474 }
            r8 = 0
            r10 = 4
            r6 = r3
            r7 = r3
            r4.queueInputBuffer(r5, r6, r7, r8, r10)     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = -1
            r0.A04 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            X.4PQ r4 = r0.A0u     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = 0
            r4.A02 = r1     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0133:
            r0.A02 = r2     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x03d0
        L_0x0137:
            int r1 = r0.A03     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != r7) goto L_0x015c
            r5 = 0
        L_0x013c:
            X.3wB r1 = r0.A0B     // Catch:{ IllegalStateException -> 0x0474 }
            java.util.List r1 = r1.A0X     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = r1.size()     // Catch:{ IllegalStateException -> 0x0474 }
            if (r5 >= r1) goto L_0x015a
            X.3wB r1 = r0.A0B     // Catch:{ IllegalStateException -> 0x0474 }
            java.util.List r1 = r1.A0X     // Catch:{ IllegalStateException -> 0x0474 }
            java.lang.Object r4 = r1.get(r5)     // Catch:{ IllegalStateException -> 0x0474 }
            byte[] r4 = (byte[]) r4     // Catch:{ IllegalStateException -> 0x0474 }
            X.4PQ r1 = r0.A0u     // Catch:{ IllegalStateException -> 0x0474 }
            java.nio.ByteBuffer r1 = r1.A02     // Catch:{ IllegalStateException -> 0x0474 }
            r1.put(r4)     // Catch:{ IllegalStateException -> 0x0474 }
            int r5 = r5 + 1
            goto L_0x013c
        L_0x015a:
            r0.A03 = r2     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x015c:
            X.4PQ r6 = r0.A0u     // Catch:{ IllegalStateException -> 0x0474 }
            java.nio.ByteBuffer r1 = r6.A02     // Catch:{ IllegalStateException -> 0x0474 }
            int r10 = r1.position()     // Catch:{ IllegalStateException -> 0x0474 }
            X.4PO r8 = r0.A0C     // Catch:{ IllegalStateException -> 0x0474 }
            r19 = 0
            r1 = r19
            r8.A01 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            r8.A00 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            int r9 = r0.A0E(r8, r6, r3)     // Catch:{ RKy -> 0x033c }
            boolean r1 = r0.CKV()     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != 0) goto L_0x017f
            r4 = 536870912(0x20000000, float:1.0842022E-19)
            int r1 = r6.A00     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = r1 & r4
            if (r1 != r4) goto L_0x0183
        L_0x017f:
            long r4 = r0.A06     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A07 = r4     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0183:
            r1 = -3
            if (r9 == r1) goto L_0x03d0
            r1 = -5
            if (r9 != r1) goto L_0x0197
            int r1 = r0.A03     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != r2) goto L_0x0192
            r6.clear()     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A03 = r7     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0192:
            r0.A0R(r8)     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x00f1
        L_0x0197:
            r8 = 4
            int r4 = r6.A00     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = r4 & 4
            if (r1 != r8) goto L_0x01b2
            int r1 = r0.A03     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != r2) goto L_0x01a7
            r6.clear()     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A03 = r7     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x01a7:
            r0.A0U = r7     // Catch:{ IllegalStateException -> 0x0474 }
            boolean r1 = r0.A0T     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != 0) goto L_0x0392
            r0.A03()     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x03d0
        L_0x01b2:
            boolean r1 = r0.A0T     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != 0) goto L_0x01c5
            r1 = r4 & 1
            if (r1 == r7) goto L_0x01c5
            r6.clear()     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = r0.A03     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != r2) goto L_0x00f1
            r0.A03 = r7     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x00f1
        L_0x01c5:
            r1 = 1073741824(0x40000000, float:2.0)
            r4 = r4 & r1
            r18 = 0
            if (r4 != r1) goto L_0x01ce
            r18 = 1
        L_0x01ce:
            if (r18 == 0) goto L_0x01e5
            X.4PT r1 = r6.A06     // Catch:{ IllegalStateException -> 0x0474 }
            if (r10 == 0) goto L_0x01e5
            int[] r2 = r1.A02     // Catch:{ IllegalStateException -> 0x0474 }
            if (r2 != 0) goto L_0x01e0
            int[] r2 = new int[r7]     // Catch:{ IllegalStateException -> 0x0474 }
            r1.A02 = r2     // Catch:{ IllegalStateException -> 0x0474 }
            android.media.MediaCodec$CryptoInfo r1 = r1.A04     // Catch:{ IllegalStateException -> 0x0474 }
            r1.numBytesOfClearData = r2     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x01e0:
            r1 = r2[r3]     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = r1 + r10
            r2[r3] = r1     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x01e5:
            long r1 = r6.A01     // Catch:{ IllegalStateException -> 0x0474 }
            X.XaO r12 = r0.A0G     // Catch:{ IllegalStateException -> 0x0474 }
            if (r12 == 0) goto L_0x0249
            X.3wB r9 = r0.A0C     // Catch:{ IllegalStateException -> 0x0474 }
            long r4 = r12.A01     // Catch:{ IllegalStateException -> 0x0474 }
            r10 = 0
            int r13 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r13 != 0) goto L_0x01f7
            r12.A00 = r1     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x01f7:
            boolean r1 = r12.A02     // Catch:{ IllegalStateException -> 0x0474 }
            if (r1 != 0) goto L_0x0225
            java.nio.ByteBuffer r5 = r6.A02     // Catch:{ IllegalStateException -> 0x0474 }
            r5.getClass()     // Catch:{ IllegalStateException -> 0x0474 }
            r4 = 0
            r2 = 0
        L_0x0202:
            int r2 = r2 << 8
            byte r1 = r5.get(r4)     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = r1 & 255(0xff, float:3.57E-43)
            r2 = r2 | r1
            int r4 = r4 + 1
            if (r4 < r8) goto L_0x0202
            int r15 = X.SN2.A01(r2)     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = -1
            if (r15 != r1) goto L_0x0274
            r12.A02 = r7     // Catch:{ IllegalStateException -> 0x0474 }
            r12.A01 = r10     // Catch:{ IllegalStateException -> 0x0474 }
            long r1 = r6.A01     // Catch:{ IllegalStateException -> 0x0474 }
            r12.A00 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            java.lang.String r2 = "C2Mp3TimestampTracker"
            java.lang.String r1 = "MPEG audio header is invalid."
            X.2AG.A04(r2, r1)     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0225:
            long r1 = r6.A01     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0227:
            long r14 = r0.A06     // Catch:{ IllegalStateException -> 0x0474 }
            X.XaO r5 = r0.A0G     // Catch:{ IllegalStateException -> 0x0474 }
            X.3wB r4 = r0.A0C     // Catch:{ IllegalStateException -> 0x0474 }
            int r4 = r4.A0G     // Catch:{ IllegalStateException -> 0x0474 }
            long r12 = (long) r4     // Catch:{ IllegalStateException -> 0x0474 }
            long r8 = r5.A00     // Catch:{ IllegalStateException -> 0x0474 }
            long r4 = r5.A01     // Catch:{ IllegalStateException -> 0x0474 }
            r16 = 529(0x211, double:2.614E-321)
            long r4 = r4 - r16
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r16
            long r4 = r4 / r12
            long r4 = java.lang.Math.max(r10, r4)     // Catch:{ IllegalStateException -> 0x0474 }
            long r8 = r8 + r4
            long r4 = java.lang.Math.max(r14, r8)     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A06 = r4     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0249:
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            int r4 = r6.A00     // Catch:{ IllegalStateException -> 0x0474 }
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0259
            java.util.ArrayList r5 = r0.A0z     // Catch:{ IllegalStateException -> 0x0474 }
            java.lang.Long r4 = java.lang.Long.valueOf(r1)     // Catch:{ IllegalStateException -> 0x0474 }
            r5.add(r4)     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0259:
            boolean r4 = r0.A0d     // Catch:{ IllegalStateException -> 0x0474 }
            if (r4 == 0) goto L_0x02ed
            java.util.ArrayDeque r5 = r0.A0y     // Catch:{ IllegalStateException -> 0x0474 }
            boolean r4 = r5.isEmpty()     // Catch:{ IllegalStateException -> 0x0474 }
            if (r4 != 0) goto L_0x0271
            java.lang.Object r4 = r5.peekLast()     // Catch:{ IllegalStateException -> 0x0474 }
            X.5Nz r4 = (X.C284805Nz) r4     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x026b:
            X.4PX r11 = r4.A02     // Catch:{ IllegalStateException -> 0x0474 }
            X.3wB r12 = r0.A0C     // Catch:{ IllegalStateException -> 0x0474 }
            monitor-enter(r11)     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x028f
        L_0x0271:
            X.5Nz r4 = r0.A0K     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x026b
        L_0x0274:
            int r1 = r9.A0G     // Catch:{ IllegalStateException -> 0x0474 }
            long r13 = (long) r1     // Catch:{ IllegalStateException -> 0x0474 }
            long r1 = r12.A00     // Catch:{ IllegalStateException -> 0x0474 }
            long r8 = r12.A01     // Catch:{ IllegalStateException -> 0x0474 }
            r16 = 529(0x211, double:2.614E-321)
            long r4 = r8 - r16
            r16 = 1000000(0xf4240, double:4.940656E-318)
            long r4 = r4 * r16
            long r4 = r4 / r13
            long r4 = java.lang.Math.max(r10, r4)     // Catch:{ IllegalStateException -> 0x0474 }
            long r1 = r1 + r4
            long r4 = (long) r15     // Catch:{ IllegalStateException -> 0x0474 }
            long r8 = r8 + r4
            r12.A01 = r8     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x0227
        L_0x028f:
            int r5 = r11.A01     // Catch:{ all -> 0x046b }
            if (r5 <= 0) goto L_0x02a7
            int r4 = r11.A00     // Catch:{ all -> 0x046b }
            int r4 = r4 + r5
            int r5 = r4 + -1
            java.lang.Object[] r4 = r11.A03     // Catch:{ all -> 0x046b }
            int r4 = r4.length     // Catch:{ all -> 0x046b }
            int r5 = r5 % r4
            long[] r4 = r11.A02     // Catch:{ all -> 0x046b }
            r8 = r4[r5]     // Catch:{ all -> 0x046b }
            int r4 = (r1 > r8 ? 1 : (r1 == r8 ? 0 : -1))
            if (r4 > 0) goto L_0x02a7
            r11.A00()     // Catch:{ all -> 0x046b }
        L_0x02a7:
            java.lang.Object[] r10 = r11.A03     // Catch:{ all -> 0x046b }
            int r9 = r10.length     // Catch:{ all -> 0x046b }
            int r4 = r11.A01     // Catch:{ all -> 0x046b }
            if (r4 < r9) goto L_0x02d9
            int r4 = r9 * 2
            long[] r8 = new long[r4]     // Catch:{ all -> 0x046b }
            java.lang.Object[] r10 = new java.lang.Object[r4]     // Catch:{ all -> 0x046b }
            int r5 = r11.A00     // Catch:{ all -> 0x046b }
            int r9 = r9 - r5
            long[] r4 = r11.A02     // Catch:{ all -> 0x046b }
            java.lang.System.arraycopy(r4, r5, r8, r3, r9)     // Catch:{ all -> 0x046b }
            java.lang.Object[] r5 = r11.A03     // Catch:{ all -> 0x046b }
            int r4 = r11.A00     // Catch:{ all -> 0x046b }
            java.lang.System.arraycopy(r5, r4, r10, r3, r9)     // Catch:{ all -> 0x046b }
            int r5 = r11.A00     // Catch:{ all -> 0x046b }
            if (r5 <= 0) goto L_0x02d3
            long[] r4 = r11.A02     // Catch:{ all -> 0x046b }
            java.lang.System.arraycopy(r4, r3, r8, r9, r5)     // Catch:{ all -> 0x046b }
            java.lang.Object[] r5 = r11.A03     // Catch:{ all -> 0x046b }
            int r4 = r11.A00     // Catch:{ all -> 0x046b }
            java.lang.System.arraycopy(r5, r3, r10, r9, r4)     // Catch:{ all -> 0x046b }
        L_0x02d3:
            r11.A02 = r8     // Catch:{ all -> 0x046b }
            r11.A03 = r10     // Catch:{ all -> 0x046b }
            r11.A00 = r3     // Catch:{ all -> 0x046b }
        L_0x02d9:
            int r8 = r11.A00     // Catch:{ all -> 0x046b }
            int r5 = r11.A01     // Catch:{ all -> 0x046b }
            int r8 = r8 + r5
            int r4 = r10.length     // Catch:{ all -> 0x046b }
            int r8 = r8 % r4
            long[] r4 = r11.A02     // Catch:{ all -> 0x046b }
            r4[r8] = r1     // Catch:{ all -> 0x046b }
            r10[r8] = r12     // Catch:{ all -> 0x046b }
            int r4 = r5 + 1
            r11.A01 = r4     // Catch:{ all -> 0x046b }
            monitor-exit(r11)     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A0d = r3     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x02ed:
            long r4 = r0.A06     // Catch:{ IllegalStateException -> 0x0474 }
            long r4 = java.lang.Math.max(r4, r1)     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A06 = r4     // Catch:{ IllegalStateException -> 0x0474 }
            r6.A00()     // Catch:{ IllegalStateException -> 0x0474 }
            r5 = 268435456(0x10000000, float:2.5243549E-29)
            int r4 = r6.A00     // Catch:{ IllegalStateException -> 0x0474 }
            r4 = r4 & r5
            if (r4 != r5) goto L_0x0302
            r0.A0h(r6)     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0302:
            r0.A0i(r6)     // Catch:{ IllegalStateException -> 0x0474 }
            if (r18 == 0) goto L_0x0316
            X.3n3 r8 = r0.A0H     // Catch:{ CryptoException -> 0x045b }
            int r5 = r0.A04     // Catch:{ CryptoException -> 0x045b }
            X.4PT r4 = r6.A06     // Catch:{ CryptoException -> 0x045b }
            r9 = r5
            r10 = r3
            r11 = r4
            r12 = r1
            r14 = r3
            r8.queueSecureInputBuffer(r9, r10, r11, r12, r14)     // Catch:{ CryptoException -> 0x045b }
            goto L_0x0327
        L_0x0316:
            X.3n3 r8 = r0.A0H     // Catch:{ CryptoException -> 0x045b }
            int r5 = r0.A04     // Catch:{ CryptoException -> 0x045b }
            java.nio.ByteBuffer r4 = r6.A02     // Catch:{ CryptoException -> 0x045b }
            int r11 = r4.limit()     // Catch:{ CryptoException -> 0x045b }
            r9 = r5
            r10 = r3
            r12 = r1
            r14 = r3
            r8.queueInputBuffer(r9, r10, r11, r12, r14)     // Catch:{ CryptoException -> 0x045b }
        L_0x0327:
            r1 = -1
            r0.A04 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            r1 = r19
            r6.A02 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A0T = r7     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A03 = r3     // Catch:{ IllegalStateException -> 0x0474 }
            X.4Xn r2 = r0.A0E     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = r2.A08     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = r1 + 1
            r2.A08 = r1     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x00f1
        L_0x033c:
            r1 = move-exception
            r0.A0k(r1)     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A08(r3)     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A02()     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x00f1
        L_0x0348:
            r0.A05 = r2     // Catch:{ IllegalStateException -> 0x0474 }
            X.3n3 r1 = r0.A0H     // Catch:{ IllegalStateException -> 0x0474 }
            java.nio.ByteBuffer r2 = r1.getOutputBuffer(r2)     // Catch:{ IllegalStateException -> 0x0474 }
            r0.A0L = r2     // Catch:{ IllegalStateException -> 0x0474 }
            if (r2 == 0) goto L_0x0363
            int r1 = r8.offset     // Catch:{ IllegalStateException -> 0x0474 }
            r2.position(r1)     // Catch:{ IllegalStateException -> 0x0474 }
            java.nio.ByteBuffer r6 = r0.A0L     // Catch:{ IllegalStateException -> 0x0474 }
            int r2 = r8.offset     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = r8.size     // Catch:{ IllegalStateException -> 0x0474 }
            int r2 = r2 + r1
            r6.limit(r2)     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x0363:
            long r1 = r8.presentationTimeUs     // Catch:{ IllegalStateException -> 0x0474 }
            java.util.ArrayList r12 = r0.A0z     // Catch:{ IllegalStateException -> 0x0474 }
            int r11 = r12.size()     // Catch:{ IllegalStateException -> 0x0474 }
            r10 = 0
        L_0x036c:
            if (r10 >= r11) goto L_0x0385
            java.lang.Object r6 = r12.get(r10)     // Catch:{ IllegalStateException -> 0x0474 }
            java.lang.Long r6 = (java.lang.Long) r6     // Catch:{ IllegalStateException -> 0x0474 }
            long r8 = r6.longValue()     // Catch:{ IllegalStateException -> 0x0474 }
            int r6 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r6 != 0) goto L_0x0380
            r12.remove(r10)     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x0383
        L_0x0380:
            int r10 = r10 + 1
            goto L_0x036c
        L_0x0383:
            r6 = 1
            goto L_0x0386
        L_0x0385:
            r6 = 0
        L_0x0386:
            r0.A0V = r6     // Catch:{ IllegalStateException -> 0x0474 }
            long r8 = r0.A07     // Catch:{ IllegalStateException -> 0x0474 }
            int r10 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            r6 = 0
            if (r10 != 0) goto L_0x009b
            r6 = 1
            goto L_0x009b
        L_0x0392:
            boolean r1 = r0.A0R     // Catch:{ CryptoException -> 0x045b }
            if (r1 != 0) goto L_0x03d0
            X.3n3 r9 = r0.A0H     // Catch:{ CryptoException -> 0x045b }
            int r10 = r0.A04     // Catch:{ CryptoException -> 0x045b }
            r13 = 0
            r11 = r3
            r12 = r3
            r15 = r8
            r9.queueInputBuffer(r10, r11, r12, r13, r15)     // Catch:{ CryptoException -> 0x045b }
            r1 = -1
            r0.A04 = r1     // Catch:{ CryptoException -> 0x045b }
            r1 = r19
            r6.A02 = r1     // Catch:{ CryptoException -> 0x045b }
            goto L_0x03d0
        L_0x03aa:
            X.3wB r8 = r0.A0D     // Catch:{ IllegalStateException -> 0x0496 }
            r21 = r0
            r22 = r8
            r24 = r10
            r25 = r9
            r26 = r3
            r27 = r11
            r28 = r4
            r32 = r1
            boolean r1 = r21.A0r(r22, r23, r24, r25, r26, r27, r28, r30, r32, r34, r35)     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 == 0) goto L_0x03d0
            long r1 = r6.A02     // Catch:{ IllegalStateException -> 0x0496 }
            r0.A0b(r1)     // Catch:{ IllegalStateException -> 0x0496 }
            r6.clear()     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x03ca:
            boolean r1 = r0.A0U     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 == 0) goto L_0x03d5
            r0.A0Z = r7     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x03d0:
            X.27d.A00()     // Catch:{ IllegalStateException -> 0x0496 }
            goto L_0x0491
        L_0x03d5:
            boolean r1 = r0.A0P     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 == 0) goto L_0x03e4
            X.4PQ r1 = r0.A0v     // Catch:{ IllegalStateException -> 0x0496 }
            boolean r1 = r6.A02(r1)     // Catch:{ IllegalStateException -> 0x0496 }
            X.C256703wD.A04(r1)     // Catch:{ IllegalStateException -> 0x0496 }
            r0.A0P = r3     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x03e4:
            boolean r1 = r0.A0N     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 == 0) goto L_0x03f9
            int r1 = r6.A01     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 > 0) goto L_0x0037
            r0.A00()     // Catch:{ IllegalStateException -> 0x0496 }
            r0.A0N = r3     // Catch:{ IllegalStateException -> 0x0496 }
            r0.A0Y()     // Catch:{ IllegalStateException -> 0x0496 }
            boolean r1 = r0.A0O     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 != 0) goto L_0x03f9
            goto L_0x03d0
        L_0x03f9:
            boolean r1 = r0.A0U     // Catch:{ IllegalStateException -> 0x0496 }
            r1 = r1 ^ 1
            X.C256703wD.A04(r1)     // Catch:{ IllegalStateException -> 0x0496 }
            X.4PO r10 = r0.A0C     // Catch:{ IllegalStateException -> 0x0496 }
            r9 = 0
            r10.A01 = r9     // Catch:{ IllegalStateException -> 0x0496 }
            r10.A00 = r9     // Catch:{ IllegalStateException -> 0x0496 }
            X.4PQ r8 = r0.A0v     // Catch:{ IllegalStateException -> 0x0496 }
            r8.clear()     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x040c:
            r8.clear()     // Catch:{ IllegalStateException -> 0x0496 }
            int r2 = r0.A0E(r10, r8, r3)     // Catch:{ IllegalStateException -> 0x0496 }
            r1 = -5
            if (r2 == r1) goto L_0x041d
            r1 = -4
            if (r2 == r1) goto L_0x0421
            r1 = -3
            if (r2 == r1) goto L_0x042a
            goto L_0x046e
        L_0x041d:
            r0.A0R(r10)     // Catch:{ IllegalStateException -> 0x0496 }
            goto L_0x042a
        L_0x0421:
            r2 = 4
            int r1 = r8.A00     // Catch:{ IllegalStateException -> 0x0496 }
            r1 = r1 & 4
            if (r1 != r2) goto L_0x043f
            r0.A0U = r7     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x042a:
            int r1 = r6.A01     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 <= 0) goto L_0x0431
            r6.A00()     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x0431:
            int r1 = r6.A01     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 > 0) goto L_0x0037
            boolean r1 = r0.A0U     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 != 0) goto L_0x0037
            boolean r1 = r0.A0N     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 == 0) goto L_0x03d0
            goto L_0x0037
        L_0x043f:
            boolean r1 = r0.A0d     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 == 0) goto L_0x044f
            X.3wB r1 = r0.A0C     // Catch:{ IllegalStateException -> 0x0496 }
            r1.getClass()     // Catch:{ IllegalStateException -> 0x0496 }
            r0.A0D = r1     // Catch:{ IllegalStateException -> 0x0496 }
            r0.A0d(r9, r1)     // Catch:{ IllegalStateException -> 0x0496 }
            r0.A0d = r3     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x044f:
            r8.A00()     // Catch:{ IllegalStateException -> 0x0496 }
            boolean r1 = r6.A02(r8)     // Catch:{ IllegalStateException -> 0x0496 }
            if (r1 != 0) goto L_0x040c
            r0.A0P = r7     // Catch:{ IllegalStateException -> 0x0496 }
            goto L_0x042a
        L_0x045b:
            r4 = move-exception
            X.3wB r2 = r0.A0C     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = r4.getErrorCode()     // Catch:{ IllegalStateException -> 0x0474 }
            int r1 = com.google.android.exoplayer2.util.Util.A01(r1)     // Catch:{ IllegalStateException -> 0x0474 }
            X.48u r1 = r0.A0F(r2, r4, r1, r3)     // Catch:{ IllegalStateException -> 0x0474 }
            goto L_0x046d
        L_0x046b:
            r1 = move-exception
            monitor-exit(r11)     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x046d:
            throw r1     // Catch:{ IllegalStateException -> 0x0474 }
        L_0x046e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ IllegalStateException -> 0x0496 }
            r1.<init>()     // Catch:{ IllegalStateException -> 0x0496 }
            goto L_0x0482
        L_0x0474:
            r4 = move-exception
            X.3wB r2 = r0.A0C     // Catch:{ all -> 0x047e }
            r1 = r20
            X.48u r1 = r0.A0F(r2, r4, r1, r3)     // Catch:{ all -> 0x047e }
            throw r1     // Catch:{ all -> 0x047e }
        L_0x047e:
            r1 = move-exception
            X.27d.A00()     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x0482:
            throw r1     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x0483:
            X.4Xn r6 = r0.A0E     // Catch:{ IllegalStateException -> 0x0496 }
            int r2 = r6.A0A     // Catch:{ IllegalStateException -> 0x0496 }
            int r1 = r0.A0D(r4)     // Catch:{ IllegalStateException -> 0x0496 }
            int r2 = r2 + r1
            r6.A0A = r2     // Catch:{ IllegalStateException -> 0x0496 }
            r0.A08(r7)     // Catch:{ IllegalStateException -> 0x0496 }
        L_0x0491:
            X.4Xn r1 = r0.A0E     // Catch:{ IllegalStateException -> 0x0496 }
            monitor-enter(r1)     // Catch:{ IllegalStateException -> 0x0496 }
            monitor-exit(r1)     // Catch:{ IllegalStateException -> 0x0496 }
            return
        L_0x0496:
            r5 = move-exception
            boolean r4 = r5 instanceof android.media.MediaCodec.CodecException
            if (r4 != 0) goto L_0x04b0
            java.lang.StackTraceElement[] r2 = r5.getStackTrace()
            int r1 = r2.length
            if (r1 <= 0) goto L_0x04d4
            r1 = r2[r3]
            java.lang.String r2 = r1.getClassName()
            java.lang.String r1 = "android.media.MediaCodec"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x04d4
        L_0x04b0:
            r0.A0k(r5)
            if (r4 == 0) goto L_0x04c2
            r1 = r5
            android.media.MediaCodec$CodecException r1 = (android.media.MediaCodec.CodecException) r1
            boolean r1 = r1.isRecoverable()
            if (r1 == 0) goto L_0x04c2
            r3 = 1
            r0.A0Z()
        L_0x04c2:
            X.2Km r1 = r0.A0I
            X.Qny r4 = r0.A0T(r1, r5)
            X.3wB r2 = r0.A0C
            r1 = r20
            X.48u r5 = r0.A0F(r2, r4, r1, r3)
            throw r5
        L_0x04d1:
            r1 = 0
            r0.A0A = r1
        L_0x04d4:
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass4TZ.EEq(long, long):void");
    }

    public void Eg2(float f, float f2) {
        this.A00 = f;
        this.A0f = f2;
        A09(this.A0B);
    }

    public final int Ez5(C256683wB r4) {
        try {
            return A0P(r4, this.A0x);
        } catch (AnonymousClass275 e) {
            throw A0F(r4, e, 4002, false);
        }
    }

    public AnonymousClass4TZ(AnonymousClass4PH r6, AnonymousClass2SB r7, C284785Nx r8, C256823wP r9, Object obj, float f, int i, boolean z, boolean z2) {
        super(i);
        r7.getClass();
        this.A0t = r7;
        this.A14 = r6;
        this.A0k = obj;
        this.A13 = r8;
        this.A0x = r9;
        this.A10 = z;
        this.A11 = f;
        this.A0Y = z2;
        this.A12 = new AnonymousClass4PQ(0);
        this.A0u = new AnonymousClass4PQ(0);
        this.A0v = new AnonymousClass4PQ(2);
        C284795Ny r3 = new C284795Ny();
        this.A0w = r3;
        this.A0z = new ArrayList();
        this.A0s = new MediaCodec.BufferInfo();
        this.A00 = 1.0f;
        this.A0f = 1.0f;
        this.A0y = new ArrayDeque();
        A07(C284805Nz.A03);
        r3.A01(0);
        r3.A02.order(ByteOrder.nativeOrder());
        this.A0e = -1.0f;
        this.A03 = 0;
        this.A04 = -1;
        this.A05 = -1;
        this.A0g = -9223372036854775807L;
        this.A06 = -9223372036854775807L;
        this.A07 = -9223372036854775807L;
        this.A0h = -9223372036854775807L;
        this.A02 = 0;
        this.A01 = 0;
        this.A0r = 2BY.A02(2BQ.A0z);
        this.A0q = 2BY.A02(2BQ.A10);
        this.A15 = 2BY.A02(2BQ.A17);
    }

    public final void A0a() {
        A0X();
        this.A0A = null;
        this.A0G = null;
        this.A0M = null;
        this.A0I = null;
        this.A0B = null;
        this.A09 = null;
        this.A0S = false;
        this.A0Q = false;
        this.A0e = -1.0f;
        this.A0m = false;
        this.A0R = false;
        this.A0n = false;
        this.A03 = 0;
        this.A0o = false;
    }

    public void A0g(C256683wB r1, String str) {
        A0f(r1);
    }
}
