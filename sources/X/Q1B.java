package X;

import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.net.Uri;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

public final class Q1B implements C13860Tig {
    public int A00;
    public long A01;
    public long A02;
    public long A03;
    public S6U A04;
    public C13725Tfv A05;
    public C266724aF A06;
    public C13780Tgv A07;
    public C13853TiW A08;
    public C7334Q4k A09;
    public URL A0A;
    public HashMap A0B;
    public long A0C;
    public long A0D;
    public C7232Q0d A0E;
    public C266714aE A0F;
    public File A0G;
    public boolean A0H;
    public boolean A0I;

    private void A01() {
        String obj;
        Q1N q1n;
        boolean z;
        Q1N q1n2;
        boolean z2;
        boolean z3;
        Q1V.A00("BaseMediaDemuxer", "checkAndInitialize", new Object[0]);
        if (!this.A0H) {
            try {
                File file = this.A0G;
                if ((file == null || !file.exists()) && this.A0A == null) {
                    throw new FileNotFoundException();
                }
                A02();
                C13853TiW AL8 = this.A07.AL8();
                this.A08 = AL8;
                URL url = this.A0A;
                if (url != null) {
                    AL8.ETt(url.toString());
                } else {
                    File file2 = this.A0G;
                    file2.getClass();
                    AL8.ETt(file2.getAbsolutePath());
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                Q1N q1n3 = null;
                try {
                    this.A08.getClass();
                    C7334Q4k q4k = this.A09;
                    if (q4k.A0E()) {
                        C13853TiW tiW = this.A08;
                        if (q4k instanceof C7964QeC) {
                            C7964QeC qeC = (C7964QeC) q4k;
                            if (1 - qeC.A00 == 0) {
                                z3 = ((SJN) qeC.A01).A12;
                            }
                            z3 = false;
                        } else {
                            if (q4k instanceof C7967QeF) {
                                z3 = 182.A06(0Tu.A05, ((C7967QeF) q4k).A00, 36316190464806983L);
                            }
                            z3 = false;
                        }
                        ArrayList A032 = Q1M.A03(tiW, "audio/");
                        if (A032.isEmpty()) {
                            q1n = null;
                        } else {
                            if (z3) {
                                Iterator it = A032.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        break;
                                    }
                                    q1n = (Q1N) it.next();
                                    if (new MediaCodecList(1).findDecoderForFormat(q1n.A01) != null) {
                                        break;
                                    }
                                }
                            }
                            q1n = (Q1N) A032.get(0);
                        }
                    } else {
                        C13853TiW tiW2 = this.A08;
                        if (q4k instanceof C7964QeC) {
                            C7964QeC qeC2 = (C7964QeC) q4k;
                            if (1 - qeC2.A00 == 0) {
                                z2 = ((SJN) qeC2.A01).A0P;
                            }
                            z2 = false;
                        } else {
                            if (q4k instanceof C7967QeF) {
                                z2 = AnonymousClass7TF.A1P(182.A06(0Tu.A06, ((C7967QeF) q4k).A00, 36320030161379203L) ? 1 : 0);
                            }
                            z2 = false;
                        }
                        q1n = Q1M.A01(tiW2, z2);
                    }
                } catch (C7960Qe1 e) {
                    DbU.A1X(e, A1C);
                    q1n = null;
                }
                try {
                    C7334Q4k q4k2 = this.A09;
                    if (q4k2.A0E()) {
                        C13853TiW tiW3 = this.A08;
                        if (q4k2 instanceof C7964QeC) {
                            C7964QeC qeC3 = (C7964QeC) q4k2;
                            if (1 - qeC3.A00 == 0) {
                                z = ((SJN) qeC3.A01).A13;
                            }
                            z = false;
                        } else {
                            if (q4k2 instanceof C7967QeF) {
                                z = 182.A06(0Tu.A05, ((C7967QeF) q4k2).A00, 36316190464741446L);
                            }
                            z = false;
                        }
                        ArrayList A033 = Q1M.A03(tiW3, "video/");
                        if (!A033.isEmpty()) {
                            if (z) {
                                Iterator it2 = A033.iterator();
                                while (true) {
                                    if (!it2.hasNext()) {
                                        break;
                                    }
                                    q1n2 = (Q1N) it2.next();
                                    if (new MediaCodecList(1).findDecoderForFormat(q1n2.A01) != null) {
                                        break;
                                    }
                                }
                                q1n3 = q1n2;
                            }
                            q1n2 = (Q1N) A033.get(0);
                            q1n3 = q1n2;
                        } else {
                            throw new Exception(002.A0R("No video track exception. Track Info List: ", Q1M.A02(Q1M.A03(tiW3, ""))));
                        }
                    } else {
                        q1n3 = Q1M.A00(this.A08);
                    }
                } catch (C7960Qe1 | Qe5 e2) {
                    DbU.A1X(e2, A1C);
                }
                if (q1n != null) {
                    HashMap hashMap = this.A0B;
                    hashMap.getClass();
                    C66581MXm.A1S(C266714aE.AUDIO, hashMap, q1n.A00);
                }
                if (q1n3 != null) {
                    HashMap hashMap2 = this.A0B;
                    hashMap2.getClass();
                    C66581MXm.A1S(C266714aE.VIDEO, hashMap2, q1n3.A00);
                }
                S6U s6u = this.A04;
                s6u.A04 = A1C.toString();
                HashMap hashMap3 = this.A0B;
                hashMap3.getClass();
                s6u.A05 = hashMap3.toString();
                this.A0H = true;
            } catch (IOException e3) {
                Q1V.A00("BaseMediaDemuxer", "checkAndInitialize MediaDemuxerException=%s", e3);
                URL url2 = this.A0A;
                if (url2 == null) {
                    File file3 = this.A0G;
                    if (file3 != null) {
                        obj = file3.getAbsolutePath();
                    } else {
                        obj = "";
                    }
                } else {
                    obj = url2.toString();
                }
                throw new Exception(002.A0R("Failed to initialize. path = ", obj), e3);
            }
        }
    }

    public final boolean AAt() {
        C13853TiW tiW = this.A08;
        if (tiW == null || !tiW.AAt()) {
            return false;
        }
        C266724aF r4 = this.A06;
        long BpD = this.A08.BpD();
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        boolean A0H2 = this.A09.A0H();
        if (BpD != -1) {
            long A022 = r4.A02(timeUnit);
            if (A022 >= 0) {
                int i = (BpD > A022 ? 1 : (BpD == A022 ? 0 : -1));
                if (!A0H2) {
                }
            }
            return true;
        }
        this.A00++;
        return false;
    }

    public final void release() {
        Q1V.A00("BaseMediaDemuxer", "release: mMediaExtractor=%s", this.A08);
        C13853TiW tiW = this.A08;
        if (tiW != null) {
            this.A0I = true;
            tiW.release();
            this.A08 = null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:8:0x0035  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void A00() {
        /*
            r7 = this;
            X.TiW r0 = r7.A08
            r0.getClass()
            X.TiW r6 = r7.A08
            long r4 = r7.A0D
            r2 = 0
            int r1 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            r0 = 0
            if (r1 != 0) goto L_0x0011
            r0 = 2
        L_0x0011:
            r6.EL0(r4, r0)
            X.TiW r0 = r7.A08
            long r0 = r0.BpD()
            boolean r0 = r7.A03(r0)
            if (r0 == 0) goto L_0x0023
            r7.A03 = r2
        L_0x0022:
            return
        L_0x0023:
            X.TiW r0 = r7.A08
            long r3 = r0.BpD()
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.4aF r1 = r7.A06
            X.Q4k r0 = r7.A09
            boolean r0 = X.C7334Q4k.A00(r1, r0, r2, r3)
            if (r0 == 0) goto L_0x004e
            X.TiW r0 = r7.A08
            long r2 = r0.BpD()
            long r0 = r7.A0D
            long r2 = r2 - r0
            long r0 = r7.A03
            long r0 = java.lang.Math.min(r2, r0)
            r7.A03 = r0
            X.TiW r0 = r7.A08
            long r0 = r0.BpD()
            r7.A02 = r0
        L_0x004e:
            long r3 = r7.A03
            r1 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 != 0) goto L_0x0022
            boolean r0 = r7.AAt()
            if (r0 != 0) goto L_0x0023
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1B.A00():void");
    }

    private void A02() {
        C266724aF r0 = this.A06;
        TimeUnit timeUnit = TimeUnit.MICROSECONDS;
        this.A0D = r0.A03(timeUnit);
        long A022 = this.A06.A02(timeUnit);
        this.A0C = A022;
        long j = this.A0D;
        if (j < 0) {
            j = 0;
        }
        this.A0D = j;
        if (A022 <= 0) {
            A022 = TimeUnit.MILLISECONDS.toMicros(BQY().A07);
            this.A0C = A022;
        }
        long j2 = this.A0D;
        if (A022 <= j2) {
            Q1V.A00("BaseMediaDemuxer", "setStartAndEndTime: MediaDemuxerException mEndTimeUs=%s, mStartTimeUs=%s", Long.valueOf(A022), Long.valueOf(j2));
            throw new Exception(002.A0f("End time is lesser than the start time. StartTimeUs : ", ", EndTimeUs = ", this.A0D, this.A0C));
        }
    }

    private boolean A03(long j) {
        if (!this.A09.A06() || j != this.A01 || this.A06.A02(TimeUnit.MICROSECONDS) > this.A01) {
            return false;
        }
        return true;
    }

    public final S6U BPw() {
        return this.A04;
    }

    public final C7232Q0d BQY() {
        C7232Q0d q0d = this.A0E;
        if (q0d == null) {
            try {
                URL url = this.A0A;
                if (url != null) {
                    q0d = this.A05.AU8(url);
                    this.A0E = q0d;
                } else {
                    C13725Tfv tfv = this.A05;
                    File file = this.A0G;
                    file.getClass();
                    q0d = tfv.AU7(Uri.fromFile(file));
                    this.A0E = q0d;
                }
                if (q0d == null) {
                    Q1V.A00("BaseMediaDemuxer", "getMediaMetadata: Media metadata is null", new Object[0]);
                    throw new Exception("Media metadata is null");
                }
            } catch (IOException e) {
                Q1V.A00("BaseMediaDemuxer", "getMediaMetadata: IOException=%s", e);
                throw new Exception("Cannot extract metadata", e);
            }
        }
        return q0d;
    }

    public final long Bjy() {
        return this.A02;
    }

    public final int BpB() {
        C13853TiW tiW = this.A08;
        if (tiW != null) {
            return tiW.BpB();
        }
        return -1;
    }

    public final MediaFormat BpC() {
        boolean z;
        HashMap hashMap;
        C266714aE r0;
        if (this.A08 == null) {
            return null;
        }
        try {
            C7334Q4k q4k = this.A09;
            if (q4k instanceof C7967QeF) {
                z = 182.A06(0Tu.A05, ((C7967QeF) q4k).A00, 36322482587838678L);
            } else if (q4k instanceof C7966QeE) {
                z = ((C7966QeE) q4k).A09;
            } else {
                z = false;
            }
            if (!z || (hashMap = this.A0B) == null || (r0 = this.A0F) == null) {
                C13853TiW tiW = this.A08;
                return tiW.C97(tiW.BpE());
            }
            Integer num = (Integer) hashMap.get(r0);
            num.getClass();
            return this.A08.C97(num.intValue());
        } catch (Exception e) {
            Q1V.A00("BaseMediaDemuxer", "getSampleMediaFormat: IllegalStateException=%s, getTrackInfos=%s", e, Q1M.A04(this.A08).toString());
            throw Pxe.A0j(String.format(Locale.ROOT, "getSampleMediaFormat failed: %s, MediaDemuxerStats: %s", new Object[]{Q1M.A04(this.A08), this.A04}), e);
        }
    }

    public final long BpD() {
        C13853TiW tiW = this.A08;
        if (tiW == null) {
            return -1;
        }
        long BpD = tiW.BpD();
        if (A03(BpD)) {
            return 0;
        }
        if (this.A06.A06(TimeUnit.MICROSECONDS, BpD, this.A09.A0H())) {
            return (BpD - this.A0D) - this.A03;
        }
        if (BpD >= 0) {
            return -2;
        }
        return BpD;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x007a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int E6i(java.nio.ByteBuffer r13) {
        /*
            r12 = this;
            X.TiW r0 = r12.A08
            if (r0 == 0) goto L_0x003e
            long r3 = r0.BpD()
            X.4aF r5 = r12.A06
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.MICROSECONDS
            X.Q4k r7 = r12.A09
            boolean r9 = r7.A0H()
            r11 = 0
            r1 = -1
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 == 0) goto L_0x002a
            long r5 = r5.A02(r8)
            r1 = 0
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 < 0) goto L_0x0029
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r9 == 0) goto L_0x0040
            if (r0 >= 0) goto L_0x002a
        L_0x0029:
            r11 = 1
        L_0x002a:
            r9 = -1
            if (r11 != 0) goto L_0x0043
            boolean r0 = r12.A03(r3)
            if (r0 != 0) goto L_0x0043
            X.S6U r5 = r12.A04
            long r1 = r5.A01
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x003e
            r5.A01 = r3
        L_0x003e:
            r0 = -1
            return r0
        L_0x0040:
            if (r0 > 0) goto L_0x002a
            goto L_0x0029
        L_0x0043:
            X.4aF r1 = r12.A06
            X.Q4k r0 = r12.A09
            boolean r0 = r0.A0H()
            boolean r0 = r1.A06(r8, r3, r0)
            if (r0 != 0) goto L_0x0095
            boolean r0 = r12.A03(r3)
            if (r0 != 0) goto L_0x0095
            X.4aF r0 = r12.A06
            long r1 = r0.A03(r8)
            int r0 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r0 >= 0) goto L_0x0065
            X.S6U r0 = r12.A04
            r0.A02 = r3
        L_0x0065:
            boolean r0 = r7 instanceof X.C7964QeC
            if (r0 == 0) goto L_0x0093
            X.QeC r7 = (X.C7964QeC) r7
            int r0 = r7.A00
            int r0 = 1 - r0
            if (r0 != 0) goto L_0x0093
            java.lang.Object r0 = r7.A01
            X.SJN r0 = (X.SJN) r0
            boolean r0 = r0.A14
        L_0x0077:
            r3 = 0
            if (r0 == 0) goto L_0x008c
            boolean r0 = r12.A0I
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Object[] r2 = new java.lang.Object[]{r0}
            java.lang.String r1 = "BaseMediaDemuxer"
            java.lang.String r0 = "readSampleData mIsReleased: %s"
            X.0KC.A0P(r1, r0, r2)
        L_0x008c:
            X.TiW r0 = r12.A08
            int r0 = r0.E6j(r13, r3)
            return r0
        L_0x0093:
            r0 = 0
            goto L_0x0077
        L_0x0095:
            X.S6U r5 = r12.A04
            long r1 = r5.A03
            int r0 = (r1 > r9 ? 1 : (r1 == r9 ? 0 : -1))
            if (r0 != 0) goto L_0x009f
            r5.A03 = r3
        L_0x009f:
            r5.A00 = r3
            goto L_0x0065
        */
        throw new UnsupportedOperationException("Method not decompiled: X.Q1B.E6i(java.nio.ByteBuffer):int");
    }

    public final void EKz(long j) {
        long j2 = j + this.A0D + this.A03;
        if (this.A08 != null) {
            if (C7334Q4k.A00(this.A06, this.A09, TimeUnit.MICROSECONDS, j2)) {
                C13853TiW tiW = this.A08;
                int i = 0;
                if (j2 == 0) {
                    i = 2;
                }
                tiW.EL0(j2, i);
            }
        }
    }

    public final void ETq(MediaComposition mediaComposition) {
        C266794aM A042 = mediaComposition.A04(C266714aE.AUDIO, 0);
        C266784aL.A06(AnonymousClass7TF.A1V(A042), "get null audio track when setting data source from MediaComposition");
        A042.getClass();
        List list = A042.A04;
        this.A0G = ((C266754aI) Pxg.A0j(list)).A04;
        this.A0A = ((C266754aI) Pxg.A0j(list)).A05;
        this.A06 = ((C266754aI) Pxg.A0j(list)).A03;
    }

    public final void EpM(C266724aF r1) {
        this.A06 = r1;
    }

    public final void FM7(C266724aF r3) {
        this.A06 = r3;
        A02();
        this.A03 = Long.MAX_VALUE;
        A00();
    }

    public final long AzU() {
        A01();
        return this.A0C - this.A0D;
    }

    public final boolean CX8(C266714aE r2) {
        A01();
        HashMap hashMap = this.A0B;
        hashMap.getClass();
        return hashMap.containsKey(r2);
    }

    public final void ELE(C266714aE r8, int i) {
        A01();
        HashMap hashMap = this.A0B;
        hashMap.getClass();
        if (hashMap.containsKey(r8)) {
            this.A0F = r8;
            int A0M = AnonymousClass7TE.A0M(hashMap.get(r8));
            this.A08.getClass();
            this.A08.ELD(A0M);
            if (this.A09.A06()) {
                this.A01 = this.A08.BpD();
            }
            A00();
            int i2 = 0;
            this.A00 = 0;
            C13853TiW tiW = this.A08;
            long j = this.A0D;
            if (j == 0) {
                i2 = 2;
            }
            tiW.EL0(j, i2);
        }
    }

    public final void ETs(File file) {
        C266784aL.A06(AnonymousClass7TF.A1V(file), (String) null);
        this.A0G = file;
    }
}
