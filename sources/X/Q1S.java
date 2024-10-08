package X;

import android.app.ActivityManager;
import android.content.Context;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Process;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.react.modules.product.IgReactMediaPickerNativeModule;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public final class Q1S implements C13855Tia {
    public int A00;
    public long A01;
    public C7232Q0d A02;
    public C11354SOn A03;
    public C10685RwP A04;
    public C9136RQl A05;
    public C13276TSr A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final int A0F;
    public final Context A0G;
    public final C13725Tfv A0H;
    public final SJL A0I;
    public final C13590TdI A0J;
    public final C13780Tgv A0K;
    public final C10862RzN A0L;
    public final C13726Tfw A0M;
    public final C13598TdQ A0N;
    public final ExecutorService A0O;
    public volatile long A0P;
    public volatile C13860Tig A0Q;
    public volatile C13854TiZ A0R;
    public volatile Future A0S;
    public volatile boolean A0T;
    public volatile boolean A0U;
    public volatile boolean A0V;

    private void A03() {
        Q1V.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture", new Object[0]);
        if (this.A0S != null && !this.A0S.isDone()) {
            C13276TSr tSr = this.A06;
            Object[] objArr = new Object[0];
            if (tSr.A00) {
                Q1V.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock.isEnabled", objArr);
                this.A0V = true;
                try {
                    long j = this.A01;
                    if (j >= 0) {
                        this.A0S.get(j, TimeUnit.MILLISECONDS);
                    } else {
                        this.A0S.get();
                    }
                } catch (Throwable th) {
                    if (this.A09) {
                        this.A0S.cancel(true);
                    }
                    throw th;
                }
                if (this.A09) {
                    this.A0S.cancel(true);
                }
                if (tSr.A00) {
                    tSr.lock();
                }
                try {
                    Q1V.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock.open", new Object[0]);
                    tSr.close();
                    Q1V.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture mExtractFuturelock done", new Object[0]);
                } catch (Throwable th2) {
                    C9153RRe.A00(th, th2);
                    throw th;
                }
            } else {
                Q1V.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture: mExtractFuture.cancel", objArr);
                this.A0S.cancel(true);
                try {
                    this.A0S.get();
                } catch (Throwable th3) {
                    Q1V.A00("VideoDemuxDecodeWrapperTag", "cancelExtractionFuture Throwable=%s", th3);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:84:0x01ea, code lost:
        if (r4 == false) goto L_0x0261;
     */
    /* JADX WARNING: Removed duplicated region for block: B:101:0x0182 A[EDGE_INSN: B:101:0x0182->B:73:0x0182 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fb A[SYNTHETIC, Splitter:B:36:0x00fb] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void AIw(int r21) {
        /*
            r20 = this;
            r13 = 0
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r0 = "configure"
            java.lang.String r2 = "VideoDemuxDecodeWrapperTag"
            X.Q1V.A00(r2, r0, r1)
            r14 = r20
            r12 = r21
            r14.A00 = r12
            X.TdI r3 = r14.A0J
            X.Tfv r1 = r14.A0H
            X.Tgv r0 = r14.A0K
            X.RzN r4 = r14.A0L
            X.Q4k r10 = r4.A0B
            X.Tig r0 = r3.AL7(r1, r0, r10)
            r14.A0Q = r0
            X.Tfw r0 = r14.A0M
            X.TiZ r0 = r0.ALq()
            r14.A0R = r0
            X.Tig r0 = r14.A0Q
            X.S9X.A01(r0, r4)
            X.Tig r1 = r14.A0Q
            X.4aE r0 = X.C266714aE.VIDEO
            r1.ELE(r0, r12)
            boolean r0 = X.SRj.A04(r4)
            if (r0 != 0) goto L_0x0050
            X.Tig r0 = r14.A0Q
            X.Q0d r3 = r0.BQY()
            r14.A02 = r3
            X.SOn r1 = r4.A06
            int r0 = r3.A05
            r1.A08 = r0
            int r0 = r3.A03
            r1.A06 = r0
            int r0 = r3.A04
            r1.A07 = r0
        L_0x0050:
            boolean r4 = r10 instanceof X.C7964QeC
            if (r4 == 0) goto L_0x0066
            r1 = r10
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x00e2
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0j
        L_0x0063:
            if (r0 == 0) goto L_0x00e2
            goto L_0x007b
        L_0x0066:
            boolean r0 = r10 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x00e2
            r0 = r10
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36316671497278035(0x8105d200051253, double:3.0301475181525156E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            goto L_0x0063
        L_0x007b:
            X.TiZ r1 = r14.A0R     // Catch:{ all -> 0x0090 }
            X.Tig r0 = r14.A0Q     // Catch:{ all -> 0x0090 }
            android.media.MediaFormat r15 = r0.BpC()     // Catch:{ all -> 0x0090 }
            r16 = r1
            r17 = r12
            r18 = r13
            r19 = r13
            r14.A06(r15, r16, r17, r18, r19)     // Catch:{ all -> 0x0090 }
            goto L_0x0182
        L_0x0090:
            r9 = move-exception
            if (r4 == 0) goto L_0x00b5
            r1 = r10
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x01ec
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0L
        L_0x00a2:
            if (r0 == 0) goto L_0x01ea
            X.Q0d r1 = r14.A02
            if (r1 == 0) goto L_0x01ea
            int r0 = r1.A04
            int r0 = r0 % 180
            boolean r8 = X.AnonymousClass7TF.A1P(r0)
            int r7 = r1.A05
            int r5 = r1.A03
            goto L_0x00ca
        L_0x00b5:
            boolean r0 = r10 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0261
            r0 = r10
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36316190465921111(0x81056200511057, double:3.029843311985439E-306)
            boolean r0 = X.182.A06(r3, r5, r0)
            goto L_0x00a2
        L_0x00ca:
            int r1 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x01ea }
            r0 = 29
            if (r1 < r0) goto L_0x012f
            X.Tig r0 = r14.A0Q     // Catch:{ Exception -> 0x01ea }
            android.media.MediaFormat r3 = r0.BpC()     // Catch:{ Exception -> 0x01ea }
            r3.getClass()     // Catch:{ Exception -> 0x01ea }
            java.lang.String r1 = "frame-rate"
            r0 = 0
            float r0 = r3.getFloat(r1, r0)     // Catch:{ Exception -> 0x01ea }
            int r6 = (int) r0     // Catch:{ Exception -> 0x01ea }
            goto L_0x0130
        L_0x00e2:
            X.TiZ r8 = r14.A0R
            X.Tig r0 = r14.A0Q
            android.media.MediaFormat r9 = r0.BpC()
            if (r8 == 0) goto L_0x0182
            if (r9 == 0) goto L_0x0182
            java.util.ArrayList r11 = X.AnonymousClass7TE.A1C()
            r14.A05(r9)
            r0 = 0
        L_0x00f6:
            int r4 = r0 + 1
            r3 = 4
            if (r0 >= r3) goto L_0x0182
            r8.E41(r9, r10, r11, r12, r13)     // Catch:{ all -> 0x0100 }
            goto L_0x0182
        L_0x0100:
            r1 = move-exception
            boolean r0 = r1 instanceof java.lang.IllegalStateException
            if (r0 == 0) goto L_0x0211
            if (r4 > r3) goto L_0x0211
            java.lang.String r0 = r1.getMessage()
            if (r0 == 0) goto L_0x0128
            java.lang.String r3 = r1.getMessage()
            java.lang.String r0 = "codec name:"
            boolean r0 = r3.startsWith(r0)
            if (r0 == 0) goto L_0x0128
            java.lang.String r1 = r1.getMessage()
            r0 = 11
            java.lang.String r0 = r1.substring(r0)
            r11.add(r0)
        L_0x0126:
            r0 = r4
            goto L_0x00f6
        L_0x0128:
            boolean r0 = r10.A0D()
            if (r0 == 0) goto L_0x0211
            goto L_0x0126
        L_0x012f:
            r6 = 0
        L_0x0130:
            r0 = -1
            if (r5 <= r0) goto L_0x01ea
            if (r7 <= r0) goto L_0x01ea
            if (r6 <= 0) goto L_0x01ea
            if (r8 == 0) goto L_0x013a
            r7 = r5
        L_0x013a:
            if (r4 == 0) goto L_0x01d4
            r1 = r10
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x01ec
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            int r0 = r0.A05
        L_0x014b:
            if (r7 > r0) goto L_0x01ea
            if (r4 == 0) goto L_0x01bf
            r1 = r10
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x01ec
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            int r0 = r0.A04
        L_0x015e:
            if (r6 > r0) goto L_0x01ea
            if (r4 == 0) goto L_0x01ab
            X.QeC r10 = (X.C7964QeC) r10
            int r0 = r10.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0261
            java.lang.Object r0 = r10.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A10
        L_0x0170:
            if (r0 == 0) goto L_0x0261
            X.TiZ r1 = r14.A0R
            X.Tig r0 = r14.A0Q
            android.media.MediaFormat r4 = r0.BpC()
            r7 = 1
            r3 = r14
            r5 = r1
            r6 = r12
            r8 = r13
            r3.A06(r4, r5, r6, r7, r8)
        L_0x0182:
            X.RQl r0 = r14.A02()
            r14.A05 = r0
            X.RwP r0 = r14.A01()
            r14.A04 = r0
            X.SJL r1 = r14.A0I
            X.TiZ r0 = r14.A0R
            java.lang.String r0 = r0.Avf()
            r1.A0H = r0
            X.TiZ r0 = r14.A0R
            java.lang.String r0 = r0.Avd()
            r1.A0G = r0
            r0 = 1
            r14.A0B = r0
            java.lang.Object[] r1 = new java.lang.Object[r13]
            java.lang.String r0 = "configure: mIsConfigured done"
            X.Q1V.A00(r2, r0, r1)
            return
        L_0x01ab:
            boolean r0 = r10 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0261
            X.QeF r10 = (X.C7967QeF) r10
            com.instagram.common.session.UserSession r4 = r10.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36316190465855574(0x81056200501056, double:3.029843311943993E-306)
            boolean r0 = X.182.A06(r3, r4, r0)
            goto L_0x0170
        L_0x01bf:
            boolean r0 = r10 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0261
            r0 = r10
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36597665442499437(0x820562004f0b6d, double:3.207849220582329E-306)
            int r0 = X.DbS.A04(r3, r5, r0)
            goto L_0x015e
        L_0x01d4:
            boolean r0 = r10 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0261
            r0 = r10
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r5 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36597665442696046(0x82056200520b6e, double:3.2078492207066655E-306)
            int r0 = X.DbS.A04(r3, r5, r0)
            goto L_0x014b
        L_0x01ea:
            if (r4 == 0) goto L_0x0261
        L_0x01ec:
            X.QeC r10 = (X.C7964QeC) r10
            int r0 = r10.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0261
            java.lang.Object r0 = r10.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0T
            if (r0 == 0) goto L_0x0261
            X.TiZ r1 = r14.A0R
            X.Tig r0 = r14.A0Q
            android.media.MediaFormat r15 = r0.BpC()
            r19 = 1
            r16 = r1
            r17 = r12
            r18 = r13
            r14.A06(r15, r16, r17, r18, r19)
            goto L_0x0182
        L_0x0211:
            boolean r0 = r1 instanceof android.media.MediaCodec.CodecException
            if (r0 == 0) goto L_0x0262
            r0 = r1
            android.media.MediaCodec$CodecException r0 = (android.media.MediaCodec.CodecException) r0
            java.lang.String r5 = X.C266784aL.A02(r0)
        L_0x021c:
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            java.lang.Object[] r0 = r11.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            java.lang.Object[] r3 = new java.lang.Object[]{r9, r3, r0, r5, r1}
            java.lang.String r0 = "prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, mediaCodecException=%s, Exception=%s"
            X.Q1V.A00(r2, r0, r3)
            java.lang.StringBuilder r2 = X.AnonymousClass7TE.A1A()
            java.lang.String r0 = "media format:"
            r2.append(r0)
            r2.append(r9)
            java.lang.String r0 = ", number of retries:"
            r2.append(r0)
            r2.append(r4)
            java.lang.String r0 = ", blacklisted decoders:"
            r2.append(r0)
            java.lang.Object[] r0 = r11.toArray()
            java.lang.String r0 = java.util.Arrays.toString(r0)
            r2.append(r0)
            java.lang.String r0 = " mediaCodecException: "
            java.lang.String r0 = X.Pxg.A0s(r0, r5, r2)
            java.lang.IllegalStateException r9 = X.Pxe.A0j(r0, r1)
        L_0x0261:
            throw r9
        L_0x0262:
            java.lang.String r5 = "null"
            goto L_0x021c
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1S.AIw(int):void");
    }

    public final void FM5(C266724aF r5) {
        Q1V.A00("VideoDemuxDecodeWrapperTag", "updateTrim", new Object[0]);
        A03();
        this.A0Q.FM7(r5);
        this.A0C = false;
    }

    private long A00(long j) {
        C9136RQl rQl = this.A05;
        if (rQl == null || j < 0) {
            return j;
        }
        if (!rQl.A04) {
            rQl.A00 = rQl.A03.A00(TimeUnit.MICROSECONDS, j);
            rQl.A04 = true;
        }
        rQl.A01 = (long) (((float) rQl.A01) + (((float) (j - rQl.A02)) / rQl.A00));
        rQl.A00 = rQl.A03.A00(TimeUnit.MICROSECONDS, j);
        rQl.A02 = j;
        return rQl.A01;
    }

    private C10685RwP A01() {
        MediaComposition mediaComposition = this.A0L.A08;
        if (mediaComposition == null) {
            return null;
        }
        C10685RwP rwP = new C10685RwP(mediaComposition);
        C266714aE r2 = C266714aE.VIDEO;
        int i = this.A00;
        rwP.A00 = r2;
        C266794aM A042 = rwP.A03.A04(r2, i);
        rwP.A01 = A042;
        if (A042 != null) {
            Iterator A16 = Pxg.A16(A042.A06);
            rwP.A02 = A16;
            if (A16 != null && A16.hasNext()) {
                rwP.A02.next();
            }
            return rwP;
        }
        throw AnonymousClass7TE.A0w("Requested Track is not available");
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.RQl, java.lang.Object] */
    private C9136RQl A02() {
        C10862RzN rzN = this.A0L;
        MediaComposition mediaComposition = rzN.A08;
        if (mediaComposition == null) {
            return null;
        }
        Q1K q1k = new Q1K(mediaComposition, rzN.A0B.A0H());
        q1k.A01(C266714aE.VIDEO, this.A00);
        ? obj = new Object();
        obj.A04 = false;
        obj.A00 = 1.0f;
        obj.A02 = 0;
        obj.A01 = 0;
        obj.A03 = q1k;
        return obj;
    }

    private void A04() {
        if (!this.A0D && !this.A0E) {
            Q1V.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not started", new Object[0]);
            throw new Exception("VideoDemuxDecodeWrapper not started");
        }
    }

    private void A05(MediaFormat mediaFormat) {
        C7232Q0d q0d;
        int i;
        int i2;
        C11354SOn sOn = this.A03;
        if (sOn != null && (q0d = this.A02) != null) {
            C7334Q4k q4k = this.A0L.A0B;
            if (q4k instanceof C7964QeC) {
                C7964QeC qeC = (C7964QeC) q4k;
                if (1 - qeC.A00 == 0 && ((SJN) qeC.A01).A0U) {
                    boolean A1P = AnonymousClass7TF.A1P(q0d.A04 % 180);
                    int i3 = q0d.A05;
                    int i4 = q0d.A03;
                    if (i4 > -1 && i3 > -1) {
                        int i5 = i3;
                        int i6 = i4;
                        if (A1P) {
                            i5 = i4;
                            i6 = i3;
                        }
                        if (sOn.A0B % 180 != 0) {
                            i = sOn.A0A;
                            i2 = sOn.A0C;
                        } else {
                            i = sOn.A0C;
                            i2 = sOn.A0A;
                        }
                        int i7 = i3 * i4;
                        int i8 = i * i2;
                        if (i7 >= i8) {
                            i5 = i;
                        }
                        if (i7 >= i8) {
                            i6 = i2;
                        }
                        int i9 = i5;
                        if (A1P) {
                            i9 = i6;
                        }
                        mediaFormat.setInteger(IgReactMediaPickerNativeModule.WIDTH, i9);
                        if (!A1P) {
                            i5 = i6;
                        }
                        mediaFormat.setInteger(IgReactMediaPickerNativeModule.HEIGHT, i5);
                    }
                }
            }
        }
    }

    private void A06(MediaFormat mediaFormat, C13854TiZ tiZ, int i, boolean z, boolean z2) {
        String str;
        long j;
        C7232Q0d q0d;
        int i2;
        int i3;
        C13854TiZ tiZ2 = tiZ;
        if (tiZ != null) {
            MediaFormat mediaFormat2 = mediaFormat;
            if (mediaFormat != null) {
                Exception e = null;
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (z2) {
                    C11354SOn sOn = this.A03;
                    if (!(sOn == null || (q0d = this.A02) == null)) {
                        C7334Q4k q4k = this.A0L.A0B;
                        if (q4k instanceof C7964QeC) {
                            C7964QeC qeC = (C7964QeC) q4k;
                            int i4 = qeC.A00;
                            switch (i4) {
                                case 1:
                                    SJN sjn = (SJN) qeC.A01;
                                    if (sjn.A0T) {
                                        boolean A1P = AnonymousClass7TF.A1P(q0d.A04 % 180);
                                        int i5 = q0d.A05;
                                        int i6 = q0d.A03;
                                        switch (i4) {
                                            case 1:
                                                i2 = sjn.A02;
                                                break;
                                            default:
                                                i2 = -1;
                                                break;
                                        }
                                        if (1 - i4 != 0) {
                                            i3 = -1;
                                        } else {
                                            i3 = sjn.A01;
                                        }
                                        if (i6 > -1 && i5 > -1 && i2 > -1 && i3 > -1) {
                                            int i7 = i3;
                                            if (sOn.A0B % 180 == 0) {
                                                i7 = i2;
                                                i2 = i3;
                                            }
                                            if (i7 * i2 < i5 * i6) {
                                                int i8 = i7;
                                                if (A1P) {
                                                    i8 = i2;
                                                }
                                                mediaFormat2.setInteger(IgReactMediaPickerNativeModule.WIDTH, i8);
                                                int i9 = i2;
                                                if (A1P) {
                                                    i9 = i7;
                                                }
                                                mediaFormat2.setInteger(IgReactMediaPickerNativeModule.HEIGHT, i9);
                                                sOn.A0C = i7;
                                                sOn.A0A = i2;
                                                break;
                                            }
                                        }
                                    }
                                    break;
                            }
                        }
                    }
                } else {
                    A05(mediaFormat2);
                }
                int i10 = 0;
                while (i10 < 4) {
                    try {
                        tiZ2.E41(mediaFormat2, this.A0L.A0B, A1C, i, z);
                        return;
                    } catch (Exception e2) {
                        e = e2;
                        if (e instanceof IllegalStateException) {
                            if (e.getMessage() != null && e.getMessage().startsWith("codec name:")) {
                                A1C.add(e.getMessage().substring(11));
                            } else if (this.A0L.A0B.A0D()) {
                            }
                            i10++;
                        }
                    }
                }
                if (e instanceof MediaCodec.CodecException) {
                    str = C266784aL.A02((MediaCodec.CodecException) e);
                } else {
                    str = "null";
                }
                ActivityManager activityManager = (ActivityManager) this.A0G.getSystemService("activity");
                if (activityManager != null) {
                    ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                    activityManager.getMemoryInfo(memoryInfo);
                    j = memoryInfo.availMem;
                } else {
                    j = -1;
                }
                long j2 = 0JS.A03;
                long j3 = 0JS.A02;
                long j4 = 0JS.A04;
                long j5 = 0JS.A01;
                Q1V.A00("VideoDemuxDecodeWrapperTag", "prepareDecoderWithRetry: media format=%s, number of retries=%s, blacklisted decoders=%s, availMem=%s, successCreateCodecs=%d, requestReleaseCodecs=%d, successReleaseCodecs=%d, failedReleaseCodecs=%d, badThreads=%s, mediaCodecException=%s, Exception=%s", mediaFormat2, Integer.valueOf(i10), Arrays.toString(A1C.toArray()), Long.valueOf(j), Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(j4), Long.valueOf(j5), AnonymousClass0IG.A00(), str, e);
                StringBuilder A1A = AnonymousClass7TE.A1A();
                A1A.append("media format:");
                A1A.append(mediaFormat2);
                A1A.append(", number of retries:");
                A1A.append(i10);
                A1A.append(", avail mem:");
                A1A.append(j);
                A1A.append(", successCreateCodecs:");
                A1A.append(j2);
                A1A.append(", requestReleaseCodecs:");
                A1A.append(j3);
                A1A.append(", successReleaseCodecs:");
                A1A.append(j4);
                A1A.append(", failedReleaseCodecs:");
                A1A.append(j5);
                A1A.append(", badThreads:");
                A1A.append(AnonymousClass0IG.A00());
                A1A.append(", blacklisted decoders:");
                A1A.append(Arrays.toString(A1C.toArray()));
                throw Pxe.A0j(Pxg.A0s(" mediaCodecException: ", str, A1A), e);
            }
        }
        throw AnonymousClass7TE.A11("videoDecoder or mediaFormat is null");
    }

    public final long ANt() {
        C349257zq.A03("VideoDemuxDecodeWrapper.decodeFrameAndAdvance");
        A04();
        this.A0C = false;
        long j = this.A0P;
        try {
            C13854TiZ tiZ = this.A0R;
            long j2 = (long) this.A0F;
            long ANv = tiZ.ANv(j2) + j;
            while (ANv < 0 && !this.A0R.CdV() && !this.A0T) {
                C349257zq.A03("VideoDemuxDecodeWrapper.decodeFrameAndAdvanceLoop");
                ANv = this.A0P + this.A0R.ANv(j2);
                C349257zq.A01();
            }
            if (this.A0S.isDone() && !this.A0U) {
                this.A0S.get();
                this.A0U = true;
            }
            if (this.A0R.CdV() && !this.A0U) {
                if (this.A08) {
                    Q1V.A00("VideoDemuxDecodeWrapperTag", "decodeFrameAndAdvance mEnableCancelDecoderExtractFuture", new Object[0]);
                    A03();
                } else {
                    this.A0S.get();
                }
            }
            long A002 = A00(ANv);
            C349257zq.A01();
            return A002;
        } catch (IllegalStateException e) {
            throw new IllegalStateException(002.A0Q("Previous Enqueue Buffer: ", j), e);
        }
    }

    public final long Avc() {
        C266794aM r0;
        long Avc = this.A0R.Avc() + this.A0P;
        C10685RwP rwP = this.A04;
        if (rwP == null || (r0 = rwP.A01) == null || AnonymousClass7TE.A1D(r0.A06).isEmpty()) {
            return A00(Avc);
        }
        C266784aL.A06(AnonymousClass7TF.A1V(this.A04.A00), "No track is selected");
        return Avc;
    }

    public final S6U BPw() {
        return this.A0Q.BPw();
    }

    public final boolean CRE() {
        return this.A0R.CdV();
    }

    public final void FNL() {
        C349257zq.A03("VideoDemuxDecodeWrapper.warmup");
        A04();
        while (this.A0R.Avc() + this.A0P < 0 && !this.A0R.CdV() && !this.A0T) {
            this.A0R.ANv((long) this.A0F);
        }
        this.A0C = true;
        C349257zq.A01();
    }

    public final void start() {
        if (this.A0B) {
            int threadPriority = Process.getThreadPriority(Process.myTid());
            Q1V.A00("VideoDemuxDecodeWrapperTag", "start", new Object[0]);
            this.A0V = false;
            this.A0S = this.A0O.submit(new TNS(this, threadPriority, 1));
            this.A0E = true;
            return;
        }
        Q1V.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", Pxe.A1b());
        throw new Exception("VideoDemuxDecodeWrapper not configured");
    }

    public final void ANu(long j) {
        A04();
        while (Avc() <= j && !this.A0R.CdV() && !this.A0T) {
            ANt();
        }
    }

    public final void EKz(long j) {
        float f;
        C266794aM r0;
        Q1V.A00("VideoDemuxDecodeWrapperTag", "seekTo: ptsUs=%s", Long.valueOf(j));
        if (this.A0B) {
            boolean z = this.A0D;
            if (z || !this.A0E) {
                C10685RwP rwP = this.A04;
                if (rwP == null || (r0 = rwP.A01) == null || AnonymousClass7TE.A1D(r0.A06).isEmpty()) {
                    float f2 = (float) j;
                    C10862RzN rzN = this.A0L;
                    MediaComposition mediaComposition = rzN.A08;
                    if (mediaComposition != null) {
                        Q1K q1k = new Q1K(mediaComposition, rzN.A0B.A0H());
                        q1k.A01(C266714aE.VIDEO, this.A00);
                        f = q1k.A00(TimeUnit.MICROSECONDS, j);
                    } else {
                        f = 1.0f;
                    }
                    j = (long) (f2 * f);
                } else {
                    C10685RwP A012 = A01();
                    this.A04 = A012;
                    C266784aL.A06(AnonymousClass7TF.A1V(A012.A00), "No track is selected");
                }
                long j2 = 0;
                if (z) {
                    if (!this.A0C || j != 0) {
                        this.A0C = false;
                        Q1V.A00("VideoDemuxDecodeWrapperTag", "seekTo mIsRealtime", new Object[0]);
                        A03();
                        this.A0R.flush();
                        this.A0Q.EKz(j);
                        if (this.A0Q.BpD() > 0) {
                            j2 = this.A0Q.BpD();
                        }
                        this.A0P = j2;
                        this.A05 = A02();
                        start();
                    }
                } else if (j >= 0) {
                    this.A0Q.EKz(j);
                }
            } else {
                Q1V.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper has already started", new Object[0]);
                throw new Exception("VideoDemuxDecodeWrapper has already started");
            }
        } else {
            Q1V.A00("VideoDemuxDecodeWrapperTag", "throwIfNotStartedNonRealtime: VideoDemuxDecodeWrapper not configured", new Object[0]);
            throw new Exception("VideoDemuxDecodeWrapper not configured");
        }
    }

    public final void cancel() {
        Q1V.A00("VideoDemuxDecodeWrapperTag", "cancel", Pxe.A1b());
        this.A0T = true;
        A03();
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [X.Q1b, java.lang.Object] */
    public final void release() {
        Q1V.A00("VideoDemuxDecodeWrapperTag", "release", Pxe.A1b());
        if (this.A07) {
            cancel();
        }
        ? obj = new Object();
        new C7948Qdp((C7254Q1b) obj, this.A0Q).A00();
        C13854TiZ tiZ = this.A0R;
        if (tiZ != null) {
            try {
                tiZ.AVT();
            } catch (Throwable th) {
                C7254Q1b.A00(obj, th);
            }
        }
        obj.A01();
    }

    /* JADX WARNING: type inference failed for: r0v43, types: [X.TSr, java.util.concurrent.locks.ReentrantLock] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x003f  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x009e  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b0  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00e2  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x010b  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x016b  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01af  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public Q1S(android.content.Context r7, X.C13725Tfv r8, X.SJL r9, X.C13590TdI r10, X.C13780Tgv r11, X.C10862RzN r12, X.C13726Tfw r13, X.C13598TdQ r14, java.util.concurrent.ExecutorService r15, boolean r16) {
        /*
            r6 = this;
            r6.<init>()
            r6.A0G = r7
            r6.A0O = r15
            r6.A0L = r12
            r6.A0N = r14
            r6.A0J = r10
            r6.A0H = r8
            r6.A0K = r11
            r6.A0I = r9
            r6.A0M = r13
            r0 = r16
            r6.A0D = r0
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            if (r16 == 0) goto L_0x01e1
            r0 = 10
        L_0x001f:
            long r1 = r2.toMicros(r0)
            int r0 = (int) r1
            r6.A0F = r0
            X.Q4k r5 = r12.A0B
            boolean r4 = r5 instanceof X.C7964QeC
            if (r4 == 0) goto L_0x01de
            r1 = r5
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x01de
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A14
        L_0x003b:
            r6.A0A = r0
            if (r4 == 0) goto L_0x01af
            r1 = r5
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x01a2;
                case 1: goto L_0x019a;
                default: goto L_0x0047;
            }
        L_0x0047:
            java.lang.Object r0 = r1.A01
            X.833 r0 = (X.AnonymousClass833) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324179099856734(0x810ca600012f5e, double:3.034895356253974E-306)
        L_0x0054:
            boolean r0 = X.182.A06(r3, r2, r0)
        L_0x0058:
            r6.A07 = r0
            if (r4 == 0) goto L_0x016b
            r1 = r5
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x015e;
                case 1: goto L_0x0156;
                default: goto L_0x0064;
            }
        L_0x0064:
            java.lang.Object r0 = r1.A01
            X.833 r0 = (X.AnonymousClass833) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324179100643174(0x810ca6000d2f66, double:3.034895356751322E-306)
        L_0x0071:
            boolean r0 = X.182.A06(r3, r2, r0)
        L_0x0075:
            r6.A08 = r0
            if (r4 == 0) goto L_0x0136
            r1 = r5
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            switch(r0) {
                case 0: goto L_0x0129;
                case 1: goto L_0x0121;
                default: goto L_0x0081;
            }
        L_0x0081:
            java.lang.Object r0 = r1.A01
            X.833 r0 = (X.AnonymousClass833) r0
            com.instagram.common.session.UserSession r2 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324179100184417(0x810ca600062f61, double:3.034895356461202E-306)
        L_0x008e:
            boolean r1 = X.182.A06(r3, r2, r0)
        L_0x0092:
            X.TSr r0 = new X.TSr
            r0.<init>()
            r0.A00 = r1
            r6.A06 = r0
            r1 = r5
            if (r4 == 0) goto L_0x010b
            X.QeC r1 = (X.C7964QeC) r1
            int r0 = r1.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x011f
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0W
        L_0x00ac:
            r6.A09 = r0
            if (r4 == 0) goto L_0x00e2
            X.QeC r5 = (X.C7964QeC) r5
            int r0 = r5.A00
            switch(r0) {
                case 0: goto L_0x00d6;
                case 1: goto L_0x00cf;
                default: goto L_0x00b7;
            }
        L_0x00b7:
            java.lang.Object r0 = r5.A01
            X.833 r0 = (X.AnonymousClass833) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.0Tu r3 = X.0Tu.A05
            r1 = 36605654076691743(0x820ca60003151f, double:3.2129012650131914E-306)
        L_0x00c4:
            long r0 = X.182.A01(r3, r0, r1)
        L_0x00c8:
            r6.A01 = r0
            X.SOn r0 = r12.A06
            r6.A03 = r0
            return
        L_0x00cf:
            java.lang.Object r0 = r5.A01
            X.SJN r0 = (X.SJN) r0
            long r0 = r0.A06
            goto L_0x00c8
        L_0x00d6:
            java.lang.Object r0 = r5.A01
            X.0lg r0 = (X.0lg) r0
            X.0Tu r3 = X.0Tu.A05
            r1 = 36605654076757280(0x820ca600041520, double:3.212901265054637E-306)
            goto L_0x00c4
        L_0x00e2:
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x00f6
            X.QeF r5 = (X.C7967QeF) r5
            com.instagram.common.session.UserSession r3 = r5.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36597665440271212(0x820562002d0b6c, double:3.207849219173191E-306)
            long r0 = X.182.A01(r2, r3, r0)
            goto L_0x00c8
        L_0x00f6:
            boolean r0 = r5 instanceof X.C7965QeD
            if (r0 == 0) goto L_0x00ff
            X.QeD r5 = (X.C7965QeD) r5
            long r0 = r5.A00
            goto L_0x00c8
        L_0x00ff:
            boolean r0 = r5 instanceof X.C7966QeE
            if (r0 == 0) goto L_0x0108
            X.QeE r5 = (X.C7966QeE) r5
            long r0 = r5.A01
            goto L_0x00c8
        L_0x0108:
            r0 = -1
            goto L_0x00c8
        L_0x010b:
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x011f
            X.QeF r1 = (X.C7967QeF) r1
            com.instagram.common.session.UserSession r3 = r1.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316190463627321(0x810562002e1039, double:3.029843310534837E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x00ac
        L_0x011f:
            r0 = 0
            goto L_0x00ac
        L_0x0121:
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r1 = r0.A0X
            goto L_0x0092
        L_0x0129:
            java.lang.Object r2 = r1.A01
            X.0lg r2 = (X.0lg) r2
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324179100118880(0x810ca600052f60, double:3.034895356419756E-306)
            goto L_0x008e
        L_0x0136:
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x013d
            r1 = 1
            goto L_0x0092
        L_0x013d:
            boolean r0 = r5 instanceof X.C7965QeD
            if (r0 == 0) goto L_0x0148
            r0 = r5
            X.QeD r0 = (X.C7965QeD) r0
            boolean r1 = r0.A04
            goto L_0x0092
        L_0x0148:
            boolean r0 = r5 instanceof X.C7966QeE
            if (r0 == 0) goto L_0x0153
            r0 = r5
            X.QeE r0 = (X.C7966QeE) r0
            boolean r1 = r0.A05
            goto L_0x0092
        L_0x0153:
            r1 = 0
            goto L_0x0092
        L_0x0156:
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0R
            goto L_0x0075
        L_0x015e:
            java.lang.Object r2 = r1.A01
            X.0lg r2 = (X.0lg) r2
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324179100708711(0x810ca6000e2f67, double:3.0348953567927676E-306)
            goto L_0x0071
        L_0x016b:
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x0181
            r0 = r5
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316190462513198(0x810562001d102e, double:3.029843309830261E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0075
        L_0x0181:
            boolean r0 = r5 instanceof X.C7965QeD
            if (r0 == 0) goto L_0x018c
            r0 = r5
            X.QeD r0 = (X.C7965QeD) r0
            boolean r0 = r0.A03
            goto L_0x0075
        L_0x018c:
            boolean r0 = r5 instanceof X.C7966QeE
            if (r0 == 0) goto L_0x0197
            r0 = r5
            X.QeE r0 = (X.C7966QeE) r0
            boolean r0 = r0.A04
            goto L_0x0075
        L_0x0197:
            r0 = 0
            goto L_0x0075
        L_0x019a:
            java.lang.Object r0 = r1.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A0Q
            goto L_0x0058
        L_0x01a2:
            java.lang.Object r2 = r1.A01
            X.0lg r2 = (X.0lg) r2
            X.0Tu r3 = X.0Tu.A05
            r0 = 36324179099791197(0x810ca600002f5d, double:3.034895356212528E-306)
            goto L_0x0054
        L_0x01af:
            boolean r0 = r5 instanceof X.C7967QeF
            if (r0 == 0) goto L_0x01c5
            r0 = r5
            X.QeF r0 = (X.C7967QeF) r0
            com.instagram.common.session.UserSession r3 = r0.A00
            X.0Tu r2 = X.0Tu.A05
            r0 = 36316190464938057(0x81056200421049, double:3.029843311363752E-306)
            boolean r0 = X.182.A06(r2, r3, r0)
            goto L_0x0058
        L_0x01c5:
            boolean r0 = r5 instanceof X.C7965QeD
            if (r0 == 0) goto L_0x01d0
            r0 = r5
            X.QeD r0 = (X.C7965QeD) r0
            boolean r0 = r0.A02
            goto L_0x0058
        L_0x01d0:
            boolean r0 = r5 instanceof X.C7966QeE
            if (r0 == 0) goto L_0x01db
            r0 = r5
            X.QeE r0 = (X.C7966QeE) r0
            boolean r0 = r0.A03
            goto L_0x0058
        L_0x01db:
            r0 = 0
            goto L_0x0058
        L_0x01de:
            r0 = 0
            goto L_0x003b
        L_0x01e1:
            r0 = 250(0xfa, double:1.235E-321)
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1S.<init>(android.content.Context, X.Tfv, X.SJL, X.TdI, X.Tgv, X.RzN, X.Tfw, X.TdQ, java.util.concurrent.ExecutorService, boolean):void");
    }
}
