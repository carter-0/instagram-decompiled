package X;

import android.content.Context;
import android.media.MediaFormat;
import com.facebook.videolite.transcoder.base.composition.MediaEffect;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/* renamed from: X.Q4g  reason: case insensitive filesystem */
public final class C7330Q4g implements C13856Tib {
    public C7232Q0d A00;
    public final Context A01;
    public final MediaFormat A02;
    public final C13725Tfv A03;
    public final SJL A04;
    public final C7333Q4j A05;
    public final C10862RzN A06;
    public final C13726Tfw A07;
    public final ExecutorService A08;
    public volatile C13859Tie A09;
    public volatile boolean A0A;
    public volatile Future A0B;

    public final void cancel() {
        this.A0A = true;
        if (this.A0B != null) {
            if (!this.A0B.isDone() && !this.A06.A0B.A03()) {
                this.A0B.cancel(true);
            }
            try {
                this.A0B.get();
            } catch (Throwable unused) {
            }
        }
        release();
    }

    public static void A00(C7330Q4g q4g) {
        if (q4g.A09 != null) {
            MediaFormat outputFormat = q4g.A09.getOutputFormat();
            C7333Q4j q4j = q4g.A05;
            q4j.A04 = outputFormat;
            q4j.A00 = q4g.A09.BZa();
            SJL sjl = q4g.A04;
            sjl.A0P = true;
            sjl.A0E = outputFormat;
        }
    }

    public final void A8G(MediaEffect mediaEffect, int i) {
        C13859Tie tie = this.A09;
        tie.getClass();
        tie.A8G(mediaEffect, i);
    }

    public final void AAZ(int i) {
        C13859Tie tie = this.A09;
        tie.getClass();
        tie.AAZ(i);
    }

    public final void APk(long j) {
        if (j >= 0) {
            this.A09.APk(j);
        }
    }

    public final boolean CQL() {
        if (this.A0B == null || !this.A0B.isDone()) {
            return false;
        }
        this.A0B.get();
        return true;
    }

    public final void EDZ(MediaEffect mediaEffect, int i) {
        C13859Tie tie = this.A09;
        tie.getClass();
        tie.EDZ(mediaEffect, i);
    }

    public final void EEo(int i) {
        C13859Tie tie = this.A09;
        tie.getClass();
        tie.EEo(i);
    }

    public final void EF4(long j) {
        if (j >= 0) {
            this.A09.EF4(j);
        }
    }

    public final boolean Evd() {
        this.A09.Evc();
        return true;
    }

    public final void EwY(Q1J q1j, int i) {
        if (!this.A0A || !this.A06.A0B.A03()) {
            C266714aE r3 = C266714aE.VIDEO;
            long A002 = S9X.A00(this.A01, this.A03, r3, this.A06);
            this.A0B = this.A08.submit(new C13149TNh(i, 1, A002, q1j, this));
        }
    }

    public final void FNG() {
        if (this.A0B != null) {
            this.A0B.get();
        }
    }

    public final void flush() {
        this.A09.flush();
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [X.Q1b, java.lang.Object] */
    public final void release() {
        ? obj = new Object();
        try {
            if (this.A09 != null) {
                this.A09.AVT();
                this.A09 = null;
            }
        } catch (Throwable th) {
            C7254Q1b.A00(obj, th);
        }
        obj.A01();
    }

    public C7330Q4g(Context context, MediaFormat mediaFormat, C7232Q0d q0d, C13725Tfv tfv, SJL sjl, C7333Q4j q4j, C10862RzN rzN, C13726Tfw tfw, ExecutorService executorService) {
        this.A04 = sjl;
        this.A06 = rzN;
        this.A02 = mediaFormat;
        this.A08 = executorService;
        this.A03 = tfv;
        this.A01 = context;
        this.A05 = q4j;
        this.A07 = tfw;
        this.A00 = q0d;
    }
}
