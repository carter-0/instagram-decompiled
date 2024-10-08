package X;

import android.content.Context;
import android.media.MediaCodec;
import com.facebook.common.dextricks.Constants;
import com.facebook.proxygen.LigerSamplePolicy;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.nio.ByteBuffer;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.SsQ  reason: case insensitive filesystem */
public final class C12376SsQ implements C13856Tib {
    public final Context A00;
    public final MediaCodec.BufferInfo A01;
    public final C13725Tfv A02;
    public final SJL A03;
    public final C13850TiT A04;
    public final C10862RzN A05;
    public final ByteBuffer A06;
    public final ExecutorService A07;
    public final boolean A08;
    public final boolean A09;
    public final byte[] A0A = new byte[7];
    public volatile S0W A0B;
    public volatile boolean A0C;
    public volatile Future A0D;

    public final void A8G(MediaEffect mediaEffect, int i) {
    }

    public final void AAZ(int i) {
    }

    public final void APk(long j) {
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
    }

    public final void EEo(int i) {
    }

    public final void EF4(long j) {
    }

    public final void cancel() {
        this.A0C = true;
        if (this.A0D != null) {
            if (!this.A0D.isDone() && !this.A05.A0B.A03()) {
                this.A0D.cancel(true);
            }
            try {
                this.A0D.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public final boolean CQL() {
        if (this.A0D == null || !this.A0D.isDone()) {
            return false;
        }
        this.A0D.get();
        return true;
    }

    public final boolean Evd() {
        Q1A A002 = this.A0B.A00.A00(LigerSamplePolicy.CERT_DATA_SAMPLE_WEIGHT);
        if (A002 == null) {
            return false;
        }
        A002.EQ8(0, 0, 0, 4);
        this.A0B.A00.A03(A002);
        return true;
    }

    public final void EwY(Q1J q1j, int i) {
        if (!this.A0C || !this.A05.A0B.A03()) {
            C266714aE r3 = C266714aE.AUDIO;
            long A002 = S9X.A00(this.A00, this.A02, r3, this.A05);
            this.A0D = this.A07.submit(new C13149TNh(i, 0, A002, q1j, this));
        }
    }

    public final void FNG() {
        if (this.A0D != null) {
            this.A0D.get();
        }
    }

    public final void flush() {
        Q17 q17 = this.A0B.A00;
        StringBuilder sb = q17.A08;
        sb.append("flushB,");
        q17.A05.flush();
        sb.append("flushE,");
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.Q1b, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v0, types: [X.Q1b, java.lang.Object] */
    public final void release() {
        ? obj = new Object();
        try {
            S0W s0w = this.A0B;
            ? obj2 = new Object();
            new C7948Qdp((C7254Q1b) obj2, s0w.A00).A00();
            obj2.A01();
        } catch (Throwable th) {
            C7254Q1b.A00(obj, th);
        }
        obj.A01();
    }

    public C12376SsQ(Context context, C13725Tfv tfv, SJL sjl, C13804ThT thT, C10686RwQ rwQ, C10862RzN rzN, String str, ExecutorService executorService) {
        MediaCodec.BufferInfo bufferInfo;
        this.A03 = sjl;
        this.A05 = rzN;
        this.A07 = executorService;
        this.A02 = tfv;
        this.A00 = context;
        boolean Erg = thT.Erg();
        this.A08 = Erg;
        boolean endsWith = str.endsWith(".aac");
        this.A09 = endsWith;
        if (endsWith || Erg) {
            this.A06 = ByteBuffer.allocateDirect(Constants.LOAD_RESULT_NEED_REOPTIMIZATION);
            bufferInfo = new MediaCodec.BufferInfo();
        } else {
            bufferInfo = null;
        }
        this.A01 = bufferInfo;
        C13850TiT AMP = thT.AMP(rwQ);
        this.A04 = AMP;
        AMP.AJ0(str);
    }
}
