package X;

import android.content.Context;
import android.net.Uri;
import android.util.SparseArray;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;

/* renamed from: X.Sro  reason: case insensitive filesystem */
public final class C12342Sro implements C13853TiW {
    public static final C13511Tbc A0K = new C11710Sf7(-9223372036854775807L, 0);
    public int A00;
    public C13909Tl9 A01;
    public C13809Thc A02;
    public C13910TlA A03;
    public C13511Tbc A04 = A0K;
    public SJ4 A05;
    public C7334Q4k A06;
    public boolean A07;
    public boolean A08;
    public final SparseArray A09 = Pxe.A0L();
    public final C13508TbZ A0A;
    public final C7455QDu A0B = new C7455QDu(0);
    public final C7455QDu A0C = new C7455QDu(0);
    public final S02 A0D = new Object();
    public final C13509Tba A0E = new C11677Sea();
    public final TZY A0F;
    public final C21363XYr A0G = new Object();
    public final ArrayDeque A0H = new ArrayDeque();
    public final ArrayList A0I = AnonymousClass7TE.A1C();
    public final Set A0J = AnonymousClass7TE.A1F();

    private boolean A03() {
        C13809Thc thc;
        try {
            SJ4 sj4 = this.A05;
            if (!(sj4 == null || (thc = this.A02) == null)) {
                thc.EKu(sj4.A00, sj4.A01);
                A01(this.A05.A00);
                this.A05 = null;
            }
            boolean z = false;
            while (true) {
                ArrayDeque arrayDeque = this.A0H;
                if (!arrayDeque.isEmpty()) {
                    if (this.A0J.contains(arrayDeque.peekFirst())) {
                        return true;
                    }
                    A00();
                } else if (z) {
                    return false;
                } else {
                    try {
                        this.A02.getClass();
                        this.A03.getClass();
                        C13809Thc thc2 = this.A02;
                        C13910TlA tlA = this.A03;
                        C21363XYr xYr = this.A0G;
                        int E67 = thc2.E67(tlA, xYr);
                        if (E67 != -1) {
                            if (E67 == 1) {
                                A01(xYr.A00);
                            }
                        }
                    } catch (Exception | OutOfMemoryError e) {
                        Q1V.A00("ExoPlayerMedia3Extractor", "advanceToSampleOrEndOfInput: Exception=%s", e);
                    }
                    z = true;
                }
            }
        } catch (IOException unused) {
            return false;
        }
    }

    public final int E6j(ByteBuffer byteBuffer, int i) {
        if (!A03()) {
            return -1;
        }
        byteBuffer.position(0);
        byteBuffer.limit(byteBuffer.capacity());
        C7455QDu qDu = this.A0C;
        qDu.A01 = byteBuffer;
        A02(qDu, false);
        byteBuffer.flip();
        byteBuffer.position(0);
        qDu.A01 = null;
        return byteBuffer.remaining();
    }

    public final void release() {
        SparseArray sparseArray;
        int i = 0;
        Q1V.A00("ExoPlayerMedia3Extractor", "release", new Object[0]);
        while (true) {
            sparseArray = this.A09;
            if (i >= sparseArray.size()) {
                break;
            }
            ((C11717SfE) sparseArray.valueAt(i)).A01(true);
            i++;
        }
        sparseArray.clear();
        if (this.A02 != null) {
            this.A02 = null;
        }
        this.A03 = null;
        this.A05 = null;
        C13909Tl9 tl9 = this.A01;
        if (tl9 != null) {
            try {
                tl9.close();
            } catch (IOException unused) {
            }
        }
        this.A01 = null;
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.XYr, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v7, types: [X.S02, java.lang.Object] */
    public C12342Sro(Context context, C7334Q4k q4k) {
        C11704Sf1 sf1 = new C11704Sf1();
        C11673SeW seW = new C11673SeW(context);
        this.A06 = q4k;
        this.A0F = sf1;
        this.A0A = seW;
    }

    private void A00() {
        long j;
        int i;
        S1v s1v = (S1v) this.A0I.get(AnonymousClass7TE.A0M(this.A0H.removeFirst()));
        if (!s1v.A02) {
            C7457QDw qDw = s1v.A00;
            synchronized (qDw) {
                C11366SPh.A01(Pxg.A1T(qDw.A03 + 1, qDw.A02));
                qDw.A03++;
            }
            SSD ssd = qDw.A0M;
            synchronized (qDw) {
                int i2 = qDw.A03;
                if (i2 == 0) {
                    j = -1;
                } else {
                    long j2 = qDw.A05;
                    long j3 = Long.MIN_VALUE;
                    int i3 = qDw.A04;
                    int i4 = i3 + (i2 - 1);
                    int i5 = qDw.A01;
                    if (i4 >= i5) {
                        i4 -= i5;
                    }
                    for (int i6 = 0; i6 < i2; i6++) {
                        j3 = Math.max(j3, qDw.A0I[i]);
                        if ((qDw.A0E[i] & 1) != 0) {
                            break;
                        }
                        i--;
                        if (i == -1) {
                            i = i5 - 1;
                        }
                    }
                    qDw.A05 = Math.max(j2, j3);
                    qDw.A02 -= i2;
                    int i7 = qDw.A00 + i2;
                    qDw.A00 = i7;
                    int i8 = i3 + i2;
                    qDw.A04 = i8;
                    if (i8 >= i5) {
                        qDw.A04 = i8 - i5;
                    }
                    int i9 = i2 - i2;
                    qDw.A03 = i9;
                    if (i9 < 0) {
                        qDw.A03 = 0;
                    }
                    C11178SEe sEe = qDw.A0N;
                    int i10 = 0;
                    while (true) {
                        SparseArray sparseArray = sEe.A01;
                        if (i10 >= sparseArray.size() - 1) {
                            break;
                        }
                        int i11 = i10 + 1;
                        if (i7 < sparseArray.keyAt(i11)) {
                            break;
                        }
                        sEe.A02.accept(sparseArray.valueAt(i10));
                        sparseArray.removeAt(i10);
                        int i12 = sEe.A00;
                        if (i12 > 0) {
                            sEe.A00 = i12 - 1;
                        }
                        i10 = i11;
                    }
                    if (qDw.A02 == 0) {
                        int i13 = qDw.A04;
                        if (i13 == 0) {
                            i13 = qDw.A01;
                        }
                        int i14 = i13 - 1;
                        j = qDw.A0G[i14] + ((long) qDw.A0F[i14]);
                    } else {
                        j = qDw.A0G[qDw.A04];
                    }
                }
            }
            if (j != -1) {
                while (true) {
                    C9133RQh rQh = ssd.A01;
                    if (j >= rQh.A00) {
                        C13509Tba tba = ssd.A05;
                        C10149RnQ rnQ = rQh.A03;
                        C11677Sea sea = (C11677Sea) tba;
                        synchronized (sea) {
                            C10149RnQ[] rnQArr = sea.A02;
                            int i15 = sea.A01;
                            sea.A01 = i15 + 1;
                            rnQArr[i15] = rnQ;
                            sea.A00--;
                            sea.notifyAll();
                        }
                        C9133RQh rQh2 = ssd.A01;
                        rQh2.A03 = null;
                        C9133RQh rQh3 = rQh2.A02;
                        rQh2.A02 = null;
                        ssd.A01 = rQh3;
                    } else if (ssd.A02.A01 < rQh.A01) {
                        ssd.A02 = rQh;
                        return;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    private void A01(long j) {
        C13909Tl9 tl9 = this.A01;
        if (tl9 != null) {
            Uri uri = tl9.getUri();
            C13909Tl9 tl92 = this.A01;
            if (tl92 != null) {
                try {
                    tl92.close();
                } catch (IOException unused) {
                }
            }
            C13909Tl9 tl93 = this.A01;
            uri.getClass();
            long j2 = j;
            long E0f = tl93.E0f(new SH8(uri, Collections.emptyMap(), j));
            if (E0f != -1) {
                E0f += j;
            }
            this.A03 = new C11699Sew(this.A01, j2, E0f);
        }
    }

    private void A02(C7455QDu qDu, boolean z) {
        Object obj;
        ArrayDeque arrayDeque = this.A0H;
        if (!arrayDeque.isEmpty()) {
            obj = arrayDeque.peekFirst();
        } else {
            obj = null;
        }
        ArrayList arrayList = this.A0I;
        obj.getClass();
        C7457QDw qDw = ((S1v) arrayList.get(AnonymousClass7TE.A0M(obj))).A00;
        boolean z2 = false;
        int i = 0;
        if (z) {
            i = 4;
        }
        int i2 = i | 1;
        S02 s02 = this.A0D;
        int A002 = qDw.A00(qDu, s02, i2);
        if (A002 == -5) {
            A002 = qDw.A00(qDu, s02, i2);
        }
        s02.A00 = null;
        if (A002 == -4) {
            z2 = true;
        }
        C11366SPh.A02(z2);
    }

    public final int C93() {
        return this.A0I.size();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00d3, code lost:
        if (r11 != 22) goto L_0x00d5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.media.MediaFormat C97(int r14) {
        /*
            r13 = this;
            java.util.ArrayList r0 = r13.A0I
            java.lang.Object r8 = r0.get(r14)
            X.S1v r8 = (X.S1v) r8
            X.S02 r7 = r13.A0D
            X.QDu r1 = r13.A0B
            r6 = 0
            r7.A00 = r6
            X.QDw r0 = r8.A00
            r12 = 2
            r0.A00(r1, r7, r12)
            X.SJM r9 = r7.A00
            r9.getClass()
            android.media.MediaFormat r5 = new android.media.MediaFormat
            r5.<init>()
            int r1 = r9.A05
            java.lang.String r0 = "bitrate"
            r10 = -1
            if (r1 == r10) goto L_0x0029
            r5.setInteger(r0, r1)
        L_0x0029:
            int r1 = r9.A0F
            java.lang.String r0 = "max-bitrate"
            if (r1 == r10) goto L_0x0033
            r5.setInteger(r0, r1)
        L_0x0033:
            int r1 = r9.A06
            java.lang.String r0 = "channel-count"
            if (r1 == r10) goto L_0x003c
            r5.setInteger(r0, r1)
        L_0x003c:
            X.SRQ r2 = r9.A0P
            if (r2 == 0) goto L_0x0068
            int r1 = r2.A04
            java.lang.String r0 = "color-transfer"
            if (r1 == r10) goto L_0x0049
            r5.setInteger(r0, r1)
        L_0x0049:
            int r1 = r2.A03
            java.lang.String r0 = "color-standard"
            if (r1 == r10) goto L_0x0052
            r5.setInteger(r0, r1)
        L_0x0052:
            int r1 = r2.A02
            java.lang.String r0 = "color-range"
            if (r1 == r10) goto L_0x005b
            r5.setInteger(r0, r1)
        L_0x005b:
            byte[] r0 = r2.A06
            java.lang.String r1 = "hdr-static-info"
            if (r0 == 0) goto L_0x0068
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r5.setByteBuffer(r1, r0)
        L_0x0068:
            java.lang.String r0 = r9.A0Y
            java.lang.String r4 = "mime"
            if (r0 == 0) goto L_0x0072
            r5.setString(r4, r0)
        L_0x0072:
            java.lang.String r1 = r9.A0T
            java.lang.String r0 = "codecs-string"
            if (r1 == 0) goto L_0x007b
            r5.setString(r0, r1)
        L_0x007b:
            float r2 = r9.A01
            java.lang.String r1 = "frame-rate"
            r0 = -1082130432(0xffffffffbf800000, float:-1.0)
            int r0 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r0 == 0) goto L_0x0088
            r5.setFloat(r1, r2)
        L_0x0088:
            int r1 = r9.A0N
            java.lang.String r0 = "width"
            if (r1 == r10) goto L_0x0092
            r5.setInteger(r0, r1)
        L_0x0092:
            int r1 = r9.A0B
            java.lang.String r0 = "height"
            if (r1 == r10) goto L_0x009b
            r5.setInteger(r0, r1)
        L_0x009b:
            java.util.List r3 = r9.A0Z
            r2 = 0
        L_0x009e:
            int r0 = r3.size()
            if (r2 >= r0) goto L_0x00ba
            java.lang.String r0 = "csd-"
            java.lang.String r1 = X.002.A0O(r0, r2)
            java.lang.Object r0 = r3.get(r2)
            byte[] r0 = (byte[]) r0
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.wrap(r0)
            r5.setByteBuffer(r1, r0)
            int r2 = r2 + 1
            goto L_0x009e
        L_0x00ba:
            int r11 = r9.A0E
            if (r11 == r10) goto L_0x00d5
            java.lang.String r0 = "exo-pcm-encoding-int"
            r5.setInteger(r0, r11)
            r3 = 22
            r2 = 21
            r1 = 4
            r0 = 3
            if (r11 == 0) goto L_0x0172
            if (r11 == r12) goto L_0x0170
            if (r11 == r0) goto L_0x016e
            if (r11 == r1) goto L_0x0174
            if (r11 == r2) goto L_0x016b
            if (r11 == r3) goto L_0x0175
        L_0x00d5:
            java.lang.String r1 = r9.A0X
            java.lang.String r0 = "language"
            if (r1 == 0) goto L_0x00de
            r5.setString(r0, r1)
        L_0x00de:
            int r1 = r9.A0C
            java.lang.String r0 = "max-input-size"
            if (r1 == r10) goto L_0x00e8
            r5.setInteger(r0, r1)
        L_0x00e8:
            int r1 = r9.A0I
            java.lang.String r0 = "sample-rate"
            if (r1 == r10) goto L_0x00f2
            r5.setInteger(r0, r1)
        L_0x00f2:
            int r1 = r9.A03
            java.lang.String r0 = "caption-service-number"
            if (r1 == r10) goto L_0x00fb
            r5.setInteger(r0, r1)
        L_0x00fb:
            int r1 = r9.A0H
            java.lang.String r0 = "rotation-degrees"
            r5.setInteger(r0, r1)
            int r2 = r9.A0J
            r0 = r2 & 4
            java.lang.String r1 = "is-autoselect"
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r5.setInteger(r1, r0)
            r0 = r2 & 1
            java.lang.String r1 = "is-default"
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r5.setInteger(r1, r0)
            r0 = r2 & 2
            java.lang.String r1 = "is-forced-subtitle"
            boolean r0 = X.AnonymousClass7TF.A1P(r0)
            r5.setInteger(r1, r0)
            int r1 = r9.A09
            java.lang.String r0 = "encoder-delay"
            r5.setInteger(r0, r1)
            int r1 = r9.A0A
            java.lang.String r0 = "encoder-padding"
            r5.setInteger(r0, r1)
            float r3 = r9.A02
            java.lang.String r0 = "exo-pixel-width-height-ratio-float"
            r5.setFloat(r0, r3)
            r2 = 1073741824(0x40000000, float:2.0)
            r1 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x015f
            r0 = 1317011456(0x4e800000, float:1.07374182E9)
            float r3 = r3 * r0
            int r2 = (int) r3
            r1 = 1073741824(0x40000000, float:2.0)
        L_0x0149:
            java.lang.String r0 = "sar-width"
            r5.setInteger(r0, r2)
            java.lang.String r0 = "sar-height"
            r5.setInteger(r0, r1)
            r7.A00 = r6
            java.lang.String r0 = r8.A01
            if (r0 == 0) goto L_0x015e
            r5.setString(r4, r0)
        L_0x015e:
            return r5
        L_0x015f:
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 <= 0) goto L_0x0168
            r0 = 1317011456(0x4e800000, float:1.07374182E9)
            float r0 = r0 / r3
            int r1 = (int) r0
            goto L_0x0149
        L_0x0168:
            r1 = 1
            r2 = 1
            goto L_0x0149
        L_0x016b:
            r3 = 21
            goto L_0x0175
        L_0x016e:
            r3 = 3
            goto L_0x0175
        L_0x0170:
            r3 = 2
            goto L_0x0175
        L_0x0172:
            r3 = 0
            goto L_0x0175
        L_0x0174:
            r3 = 4
        L_0x0175:
            java.lang.String r0 = "pcm-encoding"
            r5.setInteger(r0, r3)
            goto L_0x00d5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12342Sro.C97(int):android.media.MediaFormat");
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0053 A[LOOP:0: B:11:0x004b->B:13:0x0053, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x002b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EL0(long r8, int r10) {
        /*
            r7 = this;
            java.util.Set r4 = r7.A0J
            int r0 = r4.size()
            r3 = 1
            if (r0 != r3) goto L_0x0066
            X.Thc r2 = r7.A02
            boolean r0 = r2 instanceof X.C11697Seu
            if (r0 == 0) goto L_0x0066
            X.Seu r2 = (X.C11697Seu) r2
            java.util.ArrayList r1 = r7.A0I
            java.util.Iterator r0 = r4.iterator()
            int r0 = X.AnonymousClass7TG.A0F(r0)
            java.lang.Object r0 = r1.get(r0)
            X.S1v r0 = (X.S1v) r0
            X.QDw r0 = r0.A00
            int r0 = r0.A02
            X.S5O r0 = r2.A01(r0, r8)
        L_0x0029:
            if (r10 == 0) goto L_0x0063
            if (r10 == r3) goto L_0x0060
            X.SJ4 r3 = r0.A00
            X.SJ4 r6 = r0.A01
            long r4 = r6.A01
            long r0 = r8 - r4
            long r4 = java.lang.Math.abs(r0)
            long r0 = r3.A01
            long r8 = r8 - r0
            long r1 = java.lang.Math.abs(r8)
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0045
            r3 = r6
        L_0x0045:
            java.util.ArrayDeque r0 = r7.A0H
            r0.clear()
            r2 = 0
        L_0x004b:
            android.util.SparseArray r1 = r7.A09
            int r0 = r1.size()
            if (r2 >= r0) goto L_0x006d
            java.lang.Object r1 = r1.valueAt(r2)
            X.SfE r1 = (X.C11717SfE) r1
            r0 = 0
            r1.A01(r0)
            int r2 = r2 + 1
            goto L_0x004b
        L_0x0060:
            X.SJ4 r3 = r0.A01
            goto L_0x0045
        L_0x0063:
            X.SJ4 r3 = r0.A00
            goto L_0x0045
        L_0x0066:
            X.Tbc r0 = r7.A04
            X.S5O r0 = r0.Br9(r8)
            goto L_0x0029
        L_0x006d:
            r7.A05 = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12342Sro.EL0(long, int):void");
    }

    public final void ELD(int i) {
        this.A0J.add(Integer.valueOf(i));
    }

    public final boolean AAt() {
        if (!A03()) {
            return false;
        }
        A00();
        return A03();
    }

    public final int BpB() {
        if (!A03()) {
            return -1;
        }
        C7455QDu qDu = this.A0B;
        A02(qDu, true);
        int i = qDu.A00;
        char c = 0;
        if ((i & SN3.MAX_SIGNED_POWER_OF_TWO) == 1073741824) {
            c = 2;
        }
        return c | AnonymousClass7TF.A1S(i & 1, 1) ? 1 : 0;
    }

    public final long BpD() {
        if (!A03()) {
            return -1;
        }
        C7455QDu qDu = this.A0B;
        A02(qDu, true);
        return qDu.A00;
    }

    public final int BpE() {
        if (!A03()) {
            return -1;
        }
        Object peekFirst = this.A0H.peekFirst();
        peekFirst.getClass();
        return AnonymousClass7TE.A0M(peekFirst);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:167:0x02fb, code lost:
        if (r2 != -1) goto L_0x02fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0399, code lost:
        if (r3.A04 == A0K) goto L_0x039b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010d, code lost:
        r0 = r1.equals(r0);
        r7 = 8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x012b, code lost:
        r0 = r1.equals(r0);
        r7 = 20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013d, code lost:
        r0 = r1.equals(r0);
        r7 = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0146, code lost:
        r0 = r1.equals(r0);
        r7 = 6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0162, code lost:
        r0 = r1.equals(r0);
        r7 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x0167, code lost:
        if (r0 != false) goto L_0x016a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void ETt(java.lang.String r22) {
        /*
            r21 = this;
            boolean r0 = android.webkit.URLUtil.isNetworkUrl(r22)
            if (r0 == 0) goto L_0x0044
            android.net.Uri r7 = X.0cp.A03(r22)
        L_0x000a:
            r0 = 0
            r3 = r21
            boolean r2 = r3.A07
            r5 = 1
            r2 = r2 ^ 1
            X.C11366SPh.A02(r2)
            r3.A07 = r5
            java.util.Map r6 = java.util.Collections.emptyMap()
            java.lang.String r2 = "The uri must be set."
            if (r7 == 0) goto L_0x049f
            X.SH8 r4 = new X.SH8
            r4.<init>(r7, r6, r0)
            X.TbZ r2 = r3.A0A
            X.Tl9 r2 = r2.ALn()
            r3.A01 = r2
            long r19 = r2.E0f(r4)
            X.Tl9 r2 = r3.A01
            X.Sew r15 = new X.Sew
            r17 = r0
            r16 = r2
            r15.<init>(r16, r17, r19)
            r3.A03 = r15
            X.TZY r4 = r3.A0F
            X.Sf1 r4 = (X.C11704Sf1) r4
            monitor-enter(r4)
            goto L_0x0049
        L_0x0044:
            android.net.Uri r7 = X.JTQ.A09(r22)
            goto L_0x000a
        L_0x0049:
            android.net.Uri r2 = android.net.Uri.EMPTY     // Catch:{ all -> 0x049c }
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()     // Catch:{ all -> 0x049c }
            int[] r14 = X.C11704Sf1.A02     // Catch:{ all -> 0x049a }
            r10 = 21
            java.util.ArrayList r11 = X.DbS.A0v(r10)     // Catch:{ all -> 0x049a }
            java.lang.String r0 = "Content-Type"
            java.util.List r1 = X.C66580MXl.A13(r0, r1)     // Catch:{ all -> 0x049a }
            if (r1 == 0) goto L_0x0169
            boolean r0 = r1.isEmpty()     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x0169
            java.lang.Object r0 = X.AnonymousClass7TE.A13(r1)     // Catch:{ all -> 0x049a }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x0169
            java.lang.String r1 = X.SQX.A02(r0)     // Catch:{ all -> 0x049a }
            int r0 = r1.hashCode()     // Catch:{ all -> 0x049a }
            switch(r0) {
                case -2123537834: goto L_0x0160;
                case -1662384011: goto L_0x0156;
                case -1662384007: goto L_0x014c;
                case -1662095187: goto L_0x0143;
                case -1606874997: goto L_0x013b;
                case -1487656890: goto L_0x0132;
                case -1487464693: goto L_0x0129;
                case -1487464690: goto L_0x0126;
                case -1487394660: goto L_0x011d;
                case -1487018032: goto L_0x0114;
                case -1248337486: goto L_0x010b;
                case -1079884372: goto L_0x0101;
                case -1004728940: goto L_0x00f7;
                case -879272239: goto L_0x00ee;
                case -879258763: goto L_0x00e5;
                case -387023398: goto L_0x00e2;
                case -43467528: goto L_0x00df;
                case 13915911: goto L_0x00d5;
                case 187078296: goto L_0x00d1;
                case 187078297: goto L_0x00c8;
                case 187078669: goto L_0x00c5;
                case 187090232: goto L_0x00c2;
                case 187091926: goto L_0x00b8;
                case 187099443: goto L_0x00ae;
                case 1331848029: goto L_0x00aa;
                case 1503095341: goto L_0x00a6;
                case 1504578661: goto L_0x00a2;
                case 1504619009: goto L_0x0099;
                case 1504824762: goto L_0x008f;
                case 1504831518: goto L_0x0086;
                case 1505118770: goto L_0x0082;
                case 2039520277: goto L_0x007a;
                default: goto L_0x0078;
            }     // Catch:{ all -> 0x049a }
        L_0x0078:
            goto L_0x0169
        L_0x007a:
            r0 = 180(0xb4, float:2.52E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)     // Catch:{ all -> 0x049a }
            goto L_0x0146
        L_0x0082:
            java.lang.String r0 = "audio/webm"
            goto L_0x0146
        L_0x0086:
            java.lang.String r0 = "audio/mpeg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 7
            goto L_0x0167
        L_0x008f:
            java.lang.String r0 = "audio/midi"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 15
            goto L_0x0167
        L_0x0099:
            java.lang.String r0 = "audio/flac"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 4
            goto L_0x0167
        L_0x00a2:
            java.lang.String r0 = "audio/eac3"
            goto L_0x0162
        L_0x00a6:
            java.lang.String r0 = "audio/3gpp"
            goto L_0x013d
        L_0x00aa:
            java.lang.String r0 = "video/mp4"
            goto L_0x010d
        L_0x00ae:
            java.lang.String r0 = "audio/wav"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 12
            goto L_0x0167
        L_0x00b8:
            java.lang.String r0 = "audio/ogg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 9
            goto L_0x0167
        L_0x00c2:
            java.lang.String r0 = "audio/mp4"
            goto L_0x010d
        L_0x00c5:
            java.lang.String r0 = "audio/amr"
            goto L_0x013d
        L_0x00c8:
            java.lang.String r0 = "audio/ac4"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 1
            goto L_0x0167
        L_0x00d1:
            java.lang.String r0 = "audio/ac3"
            goto L_0x0162
        L_0x00d5:
            java.lang.String r0 = "video/x-flv"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 5
            goto L_0x0167
        L_0x00df:
            java.lang.String r0 = "application/webm"
            goto L_0x0146
        L_0x00e2:
            java.lang.String r0 = "audio/x-matroska"
            goto L_0x0146
        L_0x00e5:
            java.lang.String r0 = "image/png"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 17
            goto L_0x0167
        L_0x00ee:
            java.lang.String r0 = "image/bmp"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 19
            goto L_0x0167
        L_0x00f7:
            java.lang.String r0 = "text/vtt"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 13
            goto L_0x0167
        L_0x0101:
            java.lang.String r0 = "video/x-msvideo"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 16
            goto L_0x0167
        L_0x010b:
            java.lang.String r0 = "application/mp4"
        L_0x010d:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 8
            goto L_0x0167
        L_0x0114:
            java.lang.String r0 = "image/webp"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 18
            goto L_0x0167
        L_0x011d:
            java.lang.String r0 = "image/jpeg"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 14
            goto L_0x0167
        L_0x0126:
            java.lang.String r0 = "image/heif"
            goto L_0x012b
        L_0x0129:
            java.lang.String r0 = "image/heic"
        L_0x012b:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 20
            goto L_0x0167
        L_0x0132:
            java.lang.String r0 = "image/avif"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 21
            goto L_0x0167
        L_0x013b:
            java.lang.String r0 = "audio/amr-wb"
        L_0x013d:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 3
            goto L_0x0167
        L_0x0143:
            java.lang.String r0 = "video/webm"
        L_0x0146:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 6
            goto L_0x0167
        L_0x014c:
            java.lang.String r0 = "video/mp2t"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 11
            goto L_0x0167
        L_0x0156:
            java.lang.String r0 = "video/mp2p"
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 10
            goto L_0x0167
        L_0x0160:
            java.lang.String r0 = "audio/eac3-joc"
        L_0x0162:
            boolean r0 = r1.equals(r0)     // Catch:{ all -> 0x049a }
            r7 = 0
        L_0x0167:
            if (r0 != 0) goto L_0x016a
        L_0x0169:
            r7 = -1
        L_0x016a:
            r6 = -1
            if (r7 == r6) goto L_0x0170
            X.C11704Sf1.A00(r4, r11, r7)     // Catch:{ all -> 0x049a }
        L_0x0170:
            java.lang.String r1 = r2.getLastPathSegment()     // Catch:{ all -> 0x049a }
            r2 = -1
            if (r1 == 0) goto L_0x02fb
            java.lang.String r0 = ".ac3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f8
            java.lang.String r0 = ".ec3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f8
            java.lang.String r0 = ".ac4"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x0192
            r2 = 1
            goto L_0x02fb
        L_0x0192:
            java.lang.String r0 = ".adts"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f6
            java.lang.String r0 = ".aac"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f6
            java.lang.String r0 = ".amr"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x01ac
            goto L_0x02fa
        L_0x01ac:
            java.lang.String r0 = ".flac"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            r9 = 4
            if (r0 == 0) goto L_0x01b8
            r2 = 4
            goto L_0x02fd
        L_0x01b8:
            java.lang.String r0 = ".flv"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            r13 = 5
            if (r0 == 0) goto L_0x01c4
            r2 = 5
            goto L_0x02fd
        L_0x01c4:
            java.lang.String r0 = ".mid"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f3
            java.lang.String r0 = ".midi"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f3
            java.lang.String r0 = ".smf"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f3
            int r8 = r1.length()     // Catch:{ all -> 0x049a }
            int r9 = r8 - r9
            java.lang.String r0 = ".mk"
            boolean r0 = r1.startsWith(r0, r9)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f1
            java.lang.String r0 = ".webm"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02f1
            java.lang.String r0 = ".mp3"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x01fd
            r2 = 7
            goto L_0x02fb
        L_0x01fd:
            java.lang.String r12 = ".mp4"
            boolean r0 = r1.endsWith(r12)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02ee
            java.lang.String r0 = ".m4"
            boolean r0 = r1.startsWith(r0, r9)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02ee
            int r8 = r8 - r13
            boolean r0 = r1.startsWith(r12, r8)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02ee
            java.lang.String r0 = ".cmf"
            boolean r0 = r1.startsWith(r0, r8)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02ee
            java.lang.String r0 = ".og"
            boolean r0 = r1.startsWith(r0, r9)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02eb
            java.lang.String r0 = ".opus"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02eb
            java.lang.String r0 = ".ps"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = ".mpeg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = ".mpg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02e8
            java.lang.String r0 = ".m2p"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02e8
            java.lang.String r8 = ".ts"
            boolean r0 = r1.endsWith(r8)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02e5
            boolean r0 = r1.startsWith(r8, r9)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02e5
            java.lang.String r0 = ".wav"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02e2
            java.lang.String r0 = ".wave"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02e2
            java.lang.String r0 = ".vtt"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02df
            java.lang.String r0 = ".webvtt"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02df
            java.lang.String r0 = ".jpg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02dc
            java.lang.String r0 = ".jpeg"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02dc
            java.lang.String r0 = ".avi"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x0295
            r2 = 16
            goto L_0x02fb
        L_0x0295:
            java.lang.String r0 = ".png"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x02a0
            r2 = 17
            goto L_0x02fb
        L_0x02a0:
            java.lang.String r0 = ".webp"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x02ab
            r2 = 18
            goto L_0x02fb
        L_0x02ab:
            java.lang.String r0 = ".bmp"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02d9
            java.lang.String r0 = ".dib"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02d9
            java.lang.String r0 = ".heic"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02d6
            java.lang.String r0 = ".heif"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x02d6
            java.lang.String r0 = ".avif"
            boolean r0 = r1.endsWith(r0)     // Catch:{ all -> 0x049a }
            if (r0 == 0) goto L_0x02fb
            r2 = 21
            goto L_0x02fb
        L_0x02d6:
            r2 = 20
            goto L_0x02fb
        L_0x02d9:
            r2 = 19
            goto L_0x02fb
        L_0x02dc:
            r2 = 14
            goto L_0x02fb
        L_0x02df:
            r2 = 13
            goto L_0x02fb
        L_0x02e2:
            r2 = 12
            goto L_0x02fb
        L_0x02e5:
            r2 = 11
            goto L_0x02fb
        L_0x02e8:
            r2 = 10
            goto L_0x02fb
        L_0x02eb:
            r2 = 9
            goto L_0x02fb
        L_0x02ee:
            r2 = 8
            goto L_0x02fb
        L_0x02f1:
            r2 = 6
            goto L_0x02fb
        L_0x02f3:
            r2 = 15
            goto L_0x02fb
        L_0x02f6:
            r2 = 2
            goto L_0x02fb
        L_0x02f8:
            r2 = 0
            goto L_0x02fb
        L_0x02fa:
            r2 = 3
        L_0x02fb:
            if (r2 == r6) goto L_0x0302
        L_0x02fd:
            if (r2 == r7) goto L_0x0302
            X.C11704Sf1.A00(r4, r11, r2)     // Catch:{ all -> 0x049a }
        L_0x0302:
            r9 = 0
            r1 = 0
        L_0x0304:
            r0 = r14[r1]     // Catch:{ all -> 0x049a }
            if (r0 == r7) goto L_0x030d
            if (r0 == r2) goto L_0x030d
            X.C11704Sf1.A00(r4, r11, r0)     // Catch:{ all -> 0x049a }
        L_0x030d:
            int r1 = r1 + 1
            if (r1 < r10) goto L_0x0304
            int r8 = r11.size()     // Catch:{ all -> 0x049a }
            X.Thc[] r7 = new X.C13809Thc[r8]     // Catch:{ all -> 0x049a }
        L_0x0317:
            int r0 = r11.size()     // Catch:{ all -> 0x049a }
            if (r9 >= r0) goto L_0x0358
            java.lang.Object r2 = r11.get(r9)     // Catch:{ all -> 0x049a }
            X.Thc r2 = (X.C13809Thc) r2     // Catch:{ all -> 0x049a }
            X.Thc r0 = r2.CBL()     // Catch:{ all -> 0x049a }
            boolean r0 = r0 instanceof X.C11695Ses     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x0353
            X.Thc r0 = r2.CBL()     // Catch:{ all -> 0x049a }
            boolean r0 = r0 instanceof X.C11697Seu     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x0353
            X.Thc r0 = r2.CBL()     // Catch:{ all -> 0x049a }
            boolean r0 = r0 instanceof X.C22106XvW     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x0353
            X.Thc r0 = r2.CBL()     // Catch:{ all -> 0x049a }
            boolean r0 = r0 instanceof X.C22105XvV     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x0353
            X.Thc r0 = r2.CBL()     // Catch:{ all -> 0x049a }
            boolean r0 = r0 instanceof X.C11696Set     // Catch:{ all -> 0x049a }
            if (r0 != 0) goto L_0x0353
            X.TjD r1 = r4.A00     // Catch:{ all -> 0x049a }
            X.Sei r0 = new X.Sei     // Catch:{ all -> 0x049a }
            r0.<init>(r2, r1)     // Catch:{ all -> 0x049a }
            r2 = r0
        L_0x0353:
            r7[r9] = r2     // Catch:{ all -> 0x049a }
            int r9 = r9 + 1
            goto L_0x0317
        L_0x0358:
            monitor-exit(r4)
            r9 = 0
            r4 = 0
        L_0x035b:
            r2 = 0
            if (r4 >= r8) goto L_0x03d1
            r1 = r7[r4]
            boolean r0 = r1.Evx(r15)     // Catch:{ EOFException -> 0x0367, all -> 0x03cd }
            if (r0 == 0) goto L_0x0367
            goto L_0x036c
        L_0x0367:
            r15.A01 = r9
            int r4 = r4 + 1
            goto L_0x035b
        L_0x036c:
            r15.A01 = r9
            r3.A02 = r1
            r4 = 0
            X.Sey r0 = new X.Sey
            r0.<init>(r3)
            r1.CMU(r0)
        L_0x0379:
            X.Thc r2 = r3.A02     // Catch:{ Exception | OutOfMemoryError -> 0x0384 }
            X.TlA r1 = r3.A03     // Catch:{ Exception | OutOfMemoryError -> 0x0384 }
            X.XYr r0 = r3.A0G     // Catch:{ Exception | OutOfMemoryError -> 0x0384 }
            int r7 = r2.E67(r1, r0)     // Catch:{ Exception | OutOfMemoryError -> 0x0384 }
            goto L_0x0386
        L_0x0384:
            r4 = move-exception
            r7 = -1
        L_0x0386:
            boolean r0 = r3.A08
            if (r0 == 0) goto L_0x039b
            int r1 = r3.A00
            android.util.SparseArray r0 = r3.A09
            int r0 = r0.size()
            if (r1 < r0) goto L_0x039b
            X.Tbc r1 = r3.A04
            X.Tbc r0 = A0K
            r2 = 0
            if (r1 != r0) goto L_0x039c
        L_0x039b:
            r2 = 1
        L_0x039c:
            if (r4 != 0) goto L_0x03a2
            if (r2 == 0) goto L_0x03c1
            if (r7 != r6) goto L_0x03c1
        L_0x03a2:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            java.lang.Object[] r2 = X.Pxf.A1Y(r4, r0, r7)
            java.lang.String r1 = "setDataSource error=%s, preparing=%s, result=%s"
            java.lang.String r0 = "ExoPlayerMedia3Extractor"
            X.Q1V.A00(r0, r1, r2)
            r3.release()
            if (r4 == 0) goto L_0x03be
            java.lang.String r0 = "Exception encountered while parsing input media."
        L_0x03b9:
            X.XQX r0 = X.Pxf.A0L(r0, r4)
            throw r0
        L_0x03be:
            java.lang.String r0 = "Reached end of input before preparation completed."
            goto L_0x03b9
        L_0x03c1:
            if (r7 != r5) goto L_0x03ca
            X.XYr r0 = r3.A0G
            long r0 = r0.A00
            r3.A01(r0)
        L_0x03ca:
            if (r2 != 0) goto L_0x0379
            return
        L_0x03cd:
            r0 = move-exception
            r15.A01 = r9
            throw r0
        L_0x03d1:
            X.Tl9 r0 = r3.A01
            if (r0 == 0) goto L_0x0459
            android.net.Uri r4 = r0.getUri()
            if (r4 == 0) goto L_0x0466
            java.lang.String r0 = r4.getPath()
            if (r0 == 0) goto L_0x0466
            java.io.File r5 = X.Pxg.A0Y(r4)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "File exists: "
            r2.append(r0)
            boolean r0 = r5.exists()
            r2.append(r0)
            java.lang.String r0 = " is readable: "
            r2.append(r0)
            boolean r0 = r5.canRead()
            r2.append(r0)
            java.lang.String r0 = " is writable: "
            r2.append(r0)
            boolean r0 = r5.canWrite()
            r2.append(r0)
            java.lang.String r0 = " file size in bytes: "
            r2.append(r0)
            long r0 = r5.length()
            r2.append(r0)
            java.lang.String r0 = " file uri is: "
            java.lang.String r2 = X.AnonymousClass7TG.A0m(r4, r0, r2)
            X.Q4k r1 = r3.A06
            if (r1 == 0) goto L_0x0466
            boolean r0 = r1 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0466
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0466
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A16
            if (r0 == 0) goto L_0x0466
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch:{ IOException -> 0x045b }
            r3.<init>(r5)     // Catch:{ IOException -> 0x045b }
            byte[] r0 = new byte[r10]     // Catch:{ all -> 0x044f }
            r3.read(r0, r9, r10)     // Catch:{ all -> 0x044f }
            java.lang.String r1 = " file contents: "
            java.lang.String r0 = X.C266784aL.A04(r0)     // Catch:{ all -> 0x044f }
            java.lang.String r2 = X.002.A0g(r2, r1, r0)     // Catch:{ all -> 0x044f }
            r3.close()     // Catch:{ IOException -> 0x045b }
            goto L_0x0466
        L_0x044f:
            r1 = move-exception
            r3.close()     // Catch:{ all -> 0x0454 }
            goto L_0x0458
        L_0x0454:
            r0 = move-exception
            X.C9153RRe.A00(r1, r0)     // Catch:{ IOException -> 0x045b }
        L_0x0458:
            throw r1     // Catch:{ IOException -> 0x045b }
        L_0x0459:
            r4 = r2
            goto L_0x0466
        L_0x045b:
            r0 = move-exception
            java.lang.String r1 = " failed to read file contents: "
            java.lang.String r0 = r0.getMessage()
            java.lang.String r2 = X.002.A0g(r2, r1, r0)
        L_0x0466:
            java.lang.String r5 = "None of the available extractors ("
            java.lang.StringBuilder r3 = X.AnonymousClass7TE.A1A()
            r1 = 0
        L_0x046d:
            if (r1 >= r8) goto L_0x0482
            r0 = r7[r1]
            java.lang.String r0 = X.C51968G9o.A16(r0)
            r3.append(r0)
            int r0 = r8 + -1
            if (r1 >= r0) goto L_0x047f
            X.Pxe.A1Y(r3)
        L_0x047f:
            int r1 = r1 + 1
            goto L_0x046d
        L_0x0482:
            java.lang.String r1 = r3.toString()
            java.lang.String r0 = ") could read the stream. fileDebugInfo: "
            java.lang.String r2 = X.002.A0u(r5, r1, r0, r2)
            if (r4 != 0) goto L_0x0490
            android.net.Uri r4 = android.net.Uri.EMPTY
        L_0x0490:
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of()
            X.QDc r0 = new X.QDc
            r0.<init>(r4, r2, r1)
            throw r0
        L_0x049a:
            r0 = move-exception
            throw r0     // Catch:{ all -> 0x049c }
        L_0x049c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        L_0x049f:
            java.lang.String r0 = java.lang.String.valueOf(r2)
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12342Sro.ETt(java.lang.String):void");
    }
}
