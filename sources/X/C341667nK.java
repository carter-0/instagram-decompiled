package X;

import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Handler;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.ScreenCapturerAndroid;

/* renamed from: X.7nK  reason: invalid class name and case insensitive filesystem */
public class C341667nK {
    public static final C341687nM A0I = new C341677nL();
    public C39676A4s A00;
    public HashMap A01;
    public AtomicBoolean A02;
    public MediaFormat A03;
    public C341687nM A04;
    public A7Q A05;
    public boolean A06;
    public AD9 A07;
    public final Handler A08;
    public final C343967r6 A09;
    public final C341567nA A0A;
    public final Runnable A0B = new C341697nN(this);
    public volatile boolean A0C;
    public volatile boolean A0D;
    public volatile boolean A0E;
    public volatile int[] A0F = new int[1];
    public volatile long A0G;
    public volatile boolean A0H;

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9dU, X.9tX] */
    private void A00(C341687nM r6, Exception exc, String str, int i) {
        ? r3 = new C391719tX(str, exc, i);
        r3.A00("muxer_first_samples_written", 002.A1C("v", "_a", this.A0D, this.A0C));
        r3.A00("muxer_has_started", String.valueOf(this.A0E));
        if (r6 != null) {
            this.A08.post(new C41116Aoc(r6, r3, this));
        }
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.9dU, X.9tX] */
    private void A01(C341687nM r4, Exception exc, String str, String str2, int i, int i2, boolean z, boolean z2, boolean z3) {
        ? r2 = new C391719tX(str, exc, i);
        r2.A00 = str2;
        r2.A00("muxer_first_samples_written", 002.A1C("v", "_a", z2, z3));
        r2.A00("muxer_has_started", String.valueOf(z));
        r2.A00("muxer_detailed_error_code", String.valueOf(i2));
        C18097VlR.A00(this.A08, r2, r4);
    }

    public final void A02() {
        A7Q a7q;
        if (!this.A06 && (a7q = this.A05) != null) {
            ADI adi = a7q.A05;
            if (!adi.A01) {
                adi.A03.ASX();
                adi.A01 = true;
            }
            this.A06 = true;
        }
    }

    public void A03(MediaCodec.BufferInfo bufferInfo, C341767nU r23, ByteBuffer byteBuffer) {
        C341687nM r11;
        String str = null;
        C349257zq.A03("writeSampleData");
        try {
            if (this.A0E && !this.A06) {
                r11 = this.A04;
                if (this.A05 != null) {
                    int ordinal = r23.ordinal();
                    MediaCodec.BufferInfo bufferInfo2 = bufferInfo;
                    ByteBuffer byteBuffer2 = byteBuffer;
                    if (ordinal == 2) {
                        str = "AUDIO";
                        C349257zq.A03(str);
                        try {
                            if (this.A07.A00 == Long.MAX_VALUE || !this.A0C || bufferInfo2.presentationTimeUs - this.A0G <= this.A07.A00) {
                                A7Q a7q = this.A05;
                                long j = bufferInfo2.presentationTimeUs;
                                if (j >= a7q.A02 && j >= 0) {
                                    a7q.A02 = j;
                                    long j2 = a7q.A00;
                                    if (j2 == -1) {
                                        a7q.A00 = j;
                                        j2 = j;
                                    }
                                    if (!a7q.A04) {
                                        long j3 = -1;
                                        if (!(j == -1 || j2 == -1)) {
                                            j3 = (long) (((double) (j - j2)) * 1.0d);
                                        }
                                        bufferInfo2.set(bufferInfo2.offset, bufferInfo2.size, j3, bufferInfo2.flags);
                                    }
                                    ADI adi = a7q.A05;
                                    if (!adi.A01) {
                                        if (!adi.A09) {
                                            adi.A08 = true;
                                            CountDownLatch countDownLatch = adi.A00;
                                            if (countDownLatch != null) {
                                                countDownLatch.countDown();
                                                countDownLatch.await(2, TimeUnit.SECONDS);
                                            }
                                            ADI.A00(adi);
                                            if (!adi.A09) {
                                            }
                                        }
                                        adi.A03.FNl(bufferInfo2, byteBuffer2);
                                        if (!this.A0C) {
                                            this.A0C = true;
                                            this.A0G = bufferInfo2.presentationTimeUs;
                                        }
                                    }
                                }
                            } else {
                                if (!this.A0H) {
                                    this.A0H = true;
                                    C341687nM r0 = this.A07.A01;
                                    if (r0 != null) {
                                        A04(r0);
                                    }
                                }
                                C349257zq.A01();
                            }
                        } catch (IOException | InterruptedException e) {
                            A00(r11, e, "Error while writing sample audio data", 21004);
                        }
                    } else if (ordinal == 0) {
                        str = "VIDEO";
                        C349257zq.A03(str);
                        A7Q a7q2 = this.A05;
                        if ((bufferInfo2.flags & 2) == 0) {
                            long j4 = bufferInfo2.presentationTimeUs;
                            long j5 = a7q2.A03;
                            if (j4 > j5 || j4 <= 0) {
                                if (a7q2.A01 == -1) {
                                    a7q2.A01 = j4;
                                }
                                if (j4 < 0) {
                                    0KC.A0D("MuxerWrapperManager", String.format((Locale) null, "Video PTS negative - current pts %d last pts %d ", new Object[]{Long.valueOf(j4), Long.valueOf(j5)}));
                                    j4 = a7q2.A03 + 1;
                                }
                                a7q2.A03 = j4;
                                if (!a7q2.A04) {
                                    long j6 = -1;
                                    if (j4 != -1) {
                                        long j7 = a7q2.A01;
                                        if (j7 != -1) {
                                            j6 = (long) (((double) (j4 - j7)) * 1.0d);
                                        }
                                    }
                                    bufferInfo2.set(bufferInfo2.offset, bufferInfo2.size, j6, bufferInfo2.flags);
                                }
                            }
                        }
                        ADI adi2 = a7q2.A05;
                        if (!adi2.A01) {
                            if (!adi2.A09) {
                                adi2.A0B = true;
                                CountDownLatch countDownLatch2 = adi2.A00;
                                if (countDownLatch2 != null) {
                                    countDownLatch2.countDown();
                                    countDownLatch2.await(2, TimeUnit.SECONDS);
                                }
                                ADI.A00(adi2);
                                if (!adi2.A09) {
                                }
                            }
                            adi2.A03.FOJ(bufferInfo2, byteBuffer2);
                            if (!this.A0D) {
                                this.A0D = true;
                                HashMap hashMap = this.A01;
                                C341767nU r1 = C341767nU.VIDEO;
                                if (hashMap.get(r1) != null) {
                                    this.A03 = ((B15) this.A01.get(r1)).BZV();
                                }
                            }
                        }
                    } else if (ordinal == 3) {
                        throw new RuntimeException("METADATA not implemented yet");
                    }
                } else {
                    A00(r11, (Exception) null, "mMuxerWrapperManager is null", 21000);
                }
                C39676A4s a4s = this.A00;
                if ((this.A0C || !this.A01.containsKey(C341767nU.AUDIO)) && ((this.A0D || !this.A01.containsKey(C341767nU.VIDEO)) && a4s != null && this.A02.compareAndSet(false, true))) {
                    Handler handler = this.A08;
                    handler.removeCallbacks(this.A0B);
                    handler.post(new C40962Am8(a4s, this));
                }
                if (str == null) {
                    return;
                }
                C349257zq.A01();
            }
        } catch (IOException | IllegalStateException | InterruptedException e2) {
            A00(r11, e2, "Error while writing sample video data", 21004);
        } catch (Throwable th) {
            if (str != null) {
                try {
                    C349257zq.A01();
                    throw th;
                } catch (Throwable th2) {
                    C9153RRe.A00(th, th2);
                    throw th;
                }
            }
            throw th;
        }
    }

    public final void A04(C341687nM r27) {
        int i;
        this.A0F[0] = 0;
        HashMap hashMap = new HashMap();
        MediaFormat mediaFormat = this.A03;
        if (mediaFormat != null) {
            hashMap.put(AnonymousClass000.A00(1740), mediaFormat.toString());
        }
        C341567nA r4 = this.A0A;
        r4.Cjv((C391719tX) null, "stop_recording_muxer_started", "AvRecordingTrackMuxer", "", (String) null, hashMap, (long) hashCode());
        Handler handler = this.A08;
        handler.removeCallbacks(this.A0B);
        boolean z = this.A0E;
        boolean z2 = this.A0D;
        boolean z3 = this.A0C;
        this.A0E = false;
        C341687nM r14 = r27;
        try {
            A7Q a7q = this.A05;
            if (a7q != null) {
                int[] iArr = this.A0F;
                ADI adi = a7q.A05;
                synchronized (adi) {
                    try {
                        if (adi.A09) {
                            i = adi.A03.Ey3(iArr);
                        } else {
                            i = 90;
                            if (adi.A08) {
                                i = 190;
                            }
                            if (adi.A0B) {
                                i += 200;
                            }
                            if (adi.A0C) {
                                i += ScreenCapturerAndroid.VIRTUAL_DISPLAY_DPI;
                            }
                        }
                        adi.A09 = false;
                        adi.A0A = true;
                        adi.A08 = false;
                        adi.A0B = false;
                        adi.A0C = false;
                    } catch (Throwable th) {
                        adi.A09 = false;
                        adi.A0A = true;
                        adi.A08 = false;
                        adi.A0B = false;
                        adi.A0C = false;
                        throw th;
                    }
                }
                this.A0F[0] = 4;
            } else {
                i = IgNetworkConsentStorage.MAX_ENTRIES;
            }
            this.A05 = null;
            this.A04 = null;
            this.A00 = null;
            if (i == 0 || !z) {
                r4.Cjv((C391719tX) null, "stop_recording_muxer_finished", "AvRecordingTrackMuxer", "", (String) null, (Map) null, (long) hashCode());
                this.A0F[0] = 5;
                C18097VlR.A01(r14, handler);
                return;
            }
            A01(r14, (Exception) null, "Muxer output is empty", "low", 21001, i, z, z2, z3);
        } catch (Exception e) {
            try {
                A7Q a7q2 = this.A05;
                long j = a7q2.A02;
                long j2 = -1;
                if (j != -1) {
                    long j3 = a7q2.A00;
                    if (j3 != -1) {
                        j2 = (long) (((double) (j - j3)) * 1.0d);
                    }
                }
                long j4 = a7q2.A03;
                long j5 = -1;
                if (j4 != -1) {
                    long j6 = a7q2.A01;
                    if (j6 != -1) {
                        j5 = (long) (((double) (j4 - j6)) * 1.0d);
                    }
                }
                if (j2 <= -1 || j2 >= 10000) {
                    if (j5 <= -1 || j5 >= 10000) {
                        A01(r14, e, "Error while stopping", "medium", 21000, 0, z, z2, z3);
                    }
                }
                A01(r14, e, "Muxer output is empty - not enough data written", "low", 21001, 0, z, z2, z3);
            } finally {
                this.A05 = null;
                this.A04 = null;
                this.A00 = null;
            }
        }
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.B31] */
    /* JADX WARNING: type inference failed for: r8v4 */
    /* JADX WARNING: type inference failed for: r8v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A05(X.C341687nM r13, X.AD9 r14, X.C39676A4s r15) {
        /*
            r12 = this;
            r12.A04 = r13
            r12.A00 = r15
            r12.A07 = r14
            java.util.HashMap r0 = r12.A01
            X.7nU r3 = X.C341767nU.AUDIO
            java.lang.Object r0 = r0.get(r3)
            if (r0 == 0) goto L_0x0086
            X.AUT r8 = new X.AUT
            r8.<init>()
        L_0x0015:
            X.7r6 r1 = r12.A09
            r0 = 3
            java.lang.String r0 = r1.B4t(r0)
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x002d
            java.io.File r0 = r14.A02
            java.io.File r0 = r0.getParentFile()
            if (r0 == 0) goto L_0x007d
            r0.mkdirs()
        L_0x002d:
            java.io.File r0 = r14.A02
            java.lang.String r10 = r0.getAbsolutePath()
            java.util.HashMap r0 = r12.A01
            java.lang.Object r5 = r0.get(r3)
            X.B15 r5 = (X.B15) r5
            java.util.HashMap r1 = r12.A01
            X.7nU r0 = X.C341767nU.VIDEO
            java.lang.Object r6 = r1.get(r0)
            X.B15 r6 = (X.B15) r6
            X.7nA r3 = r12.A0A
            java.lang.Integer r9 = r14.A04
            X.ADI r4 = new X.ADI
            r7 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10)
            X.A7Q r0 = new X.A7Q
            r0.<init>(r14, r4)
            r12.A05 = r0
            r2 = 0
            r12.A0C = r2
            r12.A0D = r2
            r12.A0H = r2
            r0 = 0
            r12.A0G = r0
            java.util.concurrent.atomic.AtomicBoolean r0 = r12.A02
            r0.set(r2)
            java.lang.String r6 = "AvRecordingTrackMuxer"
            int r0 = r12.hashCode()
            long r10 = (long) r0
            r4 = 0
            java.lang.String r5 = "start_recording_muxer_prepared"
            java.lang.String r7 = ""
            r8 = r4
            r9 = r4
            r3.Cjv(r4, r5, r6, r7, r8, r9, r10)
            X.7nM r0 = r12.A04
            r0.onSuccess()
            return
        L_0x007d:
            r2 = 21004(0x520c, float:2.9433E-41)
            r1 = 0
            java.lang.String r0 = "Muxer has video output file directory null"
            r12.A00(r13, r1, r0, r2)
            goto L_0x002d
        L_0x0086:
            X.SoD r8 = new X.SoD
            r8.<init>()
            goto L_0x0015
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C341667nK.A05(X.7nM, X.AD9, X.A4s):void");
    }

    public C341667nK(Handler handler, C343967r6 r4, C341567nA r5) {
        this.A08 = handler;
        this.A0A = r5;
        this.A09 = r4;
        this.A02 = new AtomicBoolean(false);
    }
}
