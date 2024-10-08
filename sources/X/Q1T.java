package X;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.view.Surface;
import java.util.List;

public final class Q1T implements C13854TiZ {
    public MediaFormat A00;
    public C7334Q4k A01;
    public long A02 = -1;
    public Q1A A03;
    public Q17 A04;
    public C10795RyH A05;
    public boolean A06;
    public final /* synthetic */ C12370SsJ A07;

    /* JADX WARNING: type inference failed for: r5v0, types: [X.Q1b, java.lang.Object] */
    public final void AVT() {
        long j;
        Q1V.A00("VideoTranscoderJBMR2", "finish", new Object[0]);
        ? obj = new Object();
        new C7948Qdp((C7254Q1b) obj, this.A04).A00();
        C10795RyH ryH = this.A05;
        if (ryH != null) {
            long j2 = ryH.A01;
            Q1W q1w = ryH.A05;
            q1w.getClass();
            synchronized (q1w) {
                j = q1w.A01;
            }
            Q1V.A00("VideoTranscoderJBMR2", "finish: mFrameDropPercent=%s", Double.valueOf((((double) (j2 - j)) / ((double) ryH.A01)) * 100.0d));
            C10795RyH ryH2 = this.A05;
            C10429Rs5 rs5 = ryH2.A06;
            Q1V.A00("TranscodeOutputSurfaceForJBMR2", "release", new Object[0]);
            Surface surface = ryH2.A04;
            if (surface != null) {
                surface.release();
            }
            if (ryH2.A02 != null) {
                C13861Tih tih = rs5.A00;
                if (tih != null) {
                    tih.DKp(ryH2.A00);
                }
                ryH2.A02.setOnFrameAvailableListener((SurfaceTexture.OnFrameAvailableListener) null);
                ryH2.A02.release();
            }
            ryH2.A04 = null;
            ryH2.A02 = null;
            ryH2.A05 = null;
            if (ryH2.A03 != null) {
                Q1V.A00("TranscodeOutputSurfaceForJBMR2", "release: mHandlerThread.quitSafely", new Object[0]);
                ryH2.A03.quitSafely();
                ryH2.A03 = null;
            }
        }
        obj.A01();
    }

    public final void E41(MediaFormat mediaFormat, C7334Q4k q4k, List list, int i, boolean z) {
        Q17 A052;
        boolean A062;
        MediaFormat mediaFormat2 = mediaFormat;
        C7334Q4k q4k2 = q4k;
        this.A00 = mediaFormat;
        this.A01 = q4k;
        C12370SsJ ssJ = this.A07;
        this.A05 = new C10795RyH(ssJ.A00, q4k, i);
        List list2 = list;
        boolean z2 = z;
        if (!list.isEmpty() || z) {
            A052 = ssJ.A02.A05(mediaFormat2, this.A05.A04, q4k2, list2, z2);
        } else {
            String string = mediaFormat.getString("mime");
            string.getClass();
            A052 = C7257Q1f.A01(mediaFormat, this.A05.A04, q4k, string);
        }
        this.A04 = A052;
        if (q4k instanceof C7964QeC) {
            C7964QeC qeC = (C7964QeC) q4k2;
            if (1 - qeC.A00 == 0) {
                A062 = ((SJN) qeC.A01).A0E;
            }
            this.A04.A02();
        }
        if (q4k instanceof C7967QeF) {
            A062 = 182.A06(0Tu.A05, ((C7967QeF) q4k2).A00, 36316190465527890L);
        }
        this.A04.A02();
        if (A062) {
            try {
                this.A04.A02();
                return;
            } catch (Exception e) {
                String str = null;
                try {
                    str = this.A04.A05.getName();
                } catch (IllegalStateException unused) {
                }
                throw Pxe.A0j(002.A0R("codec name:", str), e);
            }
        }
        this.A04.A02();
    }

    public final boolean EtW() {
        return false;
    }

    public final void flush() {
        Q1V.A00("VideoTranscoderJBMR2", "flush", new Object[0]);
        Q17 q17 = this.A04;
        q17.getClass();
        StringBuilder sb = q17.A08;
        sb.append("flushB,");
        q17.A05.flush();
        sb.append("flushE,");
        this.A02 = -1;
        this.A06 = false;
        this.A03 = null;
    }

    public Q1T(C12370SsJ ssJ) {
        this.A07 = ssJ;
    }

    public final long ANv(long j) {
        MediaFormat mediaFormat;
        C7334Q4k q4k;
        Q1A q1a = this.A03;
        long j2 = -1;
        if (q1a != null && q1a.A02 >= 0) {
            MediaCodec.BufferInfo bufferInfo = q1a.A00;
            long j3 = bufferInfo.presentationTimeUs;
            if (Build.VERSION.SDK_INT >= 29 && (mediaFormat = this.A00) != null && mediaFormat.containsKey("color-transfer") && this.A00.getInteger("color-transfer") == 6 && (q4k = this.A01) != null && (q4k instanceof C7967QeF)) {
                if (182.A06(0Tu.A05, ((C7967QeF) q4k).A00, 36316190464413761L)) {
                    int i = this.A03.A02;
                    Q17 q17 = this.A04;
                    q17.getClass();
                    C361238ft r7 = new C361238ft(q17.A05.getOutputFormat(i));
                    C10795RyH ryH = this.A05;
                    ryH.getClass();
                    C13861Tih tih = ryH.A06.A00;
                    tih.getClass();
                    tih.FKX(r7, ryH.A00);
                }
            }
            try {
                Q17 q172 = this.A04;
                q172.getClass();
                Q1A q1a2 = this.A03;
                boolean z = false;
                if (bufferInfo.presentationTimeUs >= 0) {
                    z = true;
                }
                q172.A04(q1a2, z);
                if ((bufferInfo.flags & 4) != 0) {
                    this.A06 = true;
                } else {
                    if (bufferInfo.presentationTimeUs >= 0) {
                        C10795RyH ryH2 = this.A05;
                        ryH2.getClass();
                        ryH2.A01++;
                        Q1W q1w = ryH2.A05;
                        q1w.getClass();
                        q1w.A00();
                    }
                    j2 = j3;
                }
                this.A03 = null;
            } catch (IllegalStateException e) {
                Q17 q173 = this.A04;
                q173.getClass();
                throw new IllegalStateException(002.A0q("codec info: ", q173.A01, " , mDecoder Presentation Time: ", j3), e);
            }
        }
        try {
            Q17 q174 = this.A04;
            q174.getClass();
            Q1A A012 = q174.A01(j);
            if (A012 != null && A012.A02 >= 0) {
                this.A03 = A012;
                this.A02 = A012.A00.presentationTimeUs;
            }
            return j2;
        } catch (Throwable th) {
            throw new IllegalStateException(002.A0Q("Previous pts: ", j2), th);
        }
    }

    public final Q1A AOi(long j) {
        Q17 q17 = this.A04;
        q17.getClass();
        return q17.A00(j);
    }

    public final long Avc() {
        return this.A02;
    }

    public final String Avd() {
        Q17 q17 = this.A04;
        q17.getClass();
        return q17.A01;
    }

    public final String Avf() {
        Q17 q17 = this.A04;
        q17.getClass();
        try {
            return q17.A05.getName();
        } catch (IllegalStateException unused) {
            return null;
        }
    }

    public final boolean CdV() {
        return this.A06;
    }

    public final void E5w(Q1A q1a) {
        Q17 q17 = this.A04;
        q17.getClass();
        q17.A03(q1a);
    }

    public final void FJk(int i, Bitmap bitmap) {
        C13861Tih tih = this.A07.A00.A00;
        tih.getClass();
        tih.FJk(i, bitmap);
    }
}
