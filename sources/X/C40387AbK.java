package X;

import android.content.Context;
import android.view.Surface;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import java.util.concurrent.TimeUnit;

/* renamed from: X.AbK  reason: case insensitive filesystem */
public final class C40387AbK implements C66567MWv {
    public STU A00;
    public final int A01;
    public final int A02;
    public final Context A03;
    public final UserSession A04;

    public final void ETr(L92 l92, int i) {
        STU stu;
        MediaComposition mediaComposition = l92.A02;
        if (mediaComposition != null && (stu = this.A00) != null) {
            stu.A0A(mediaComposition, this.A02, this.A01, -1, -1, i, false);
        }
    }

    public final void reset() {
        seekTo(0);
        pause();
    }

    /* JADX WARNING: type inference failed for: r8v1, types: [X.Q1d, java.lang.Object] */
    public final void setSurface(Surface surface) {
        C10425Rs1 rs1;
        UserSession userSession = this.A04;
        0Tu r3 = 0Tu.A05;
        int A012 = (int) 182.A01(r3, userSession, 36601908866584948L);
        SJN A013 = C64152LQr.A00.A01(userSession, 182.A06(r3, userSession, 36316040137346943L), false, false, false);
        Context context = this.A03;
        C385559jA r14 = new C385559jA(surface);
        C40201AVr A002 = C392569v1.A00(context, (C312136ds) null, (C343967r6) null, false);
        if (A013.A0q) {
            rs1 = AnonymousClass7TG.A0Z();
        } else {
            rs1 = null;
        }
        this.A00 = new STU(context, (C13886Tj9) null, new C12302Sr5(182.A06(r3, userSession, 36320433889943980L), Math.min(A012, this.A02)), new Object(), C64443Lby.A00, rs1, (AnonymousClass8MA) null, A002, A013, r14, (String) null, (String) null, (String) null, C63220KtR.A00("reels_review", (String) null), 59048);
    }

    public final void EcI(C41820B2a b2a) {
        STU stu = this.A00;
        if (stu != null) {
            stu.A06 = new C40256AXv(b2a);
        }
    }

    public final int getCurrentPosition() {
        long j;
        STU stu = this.A00;
        if (stu == null) {
            return 0;
        }
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        C13862Tii tii = stu.A04;
        if (tii != null) {
            j = tii.AuJ();
        } else {
            j = 0;
        }
        return (int) timeUnit.toMillis(j);
    }

    public final boolean isPlaying() {
        C13862Tii tii;
        STU stu = this.A00;
        if (stu == null || (tii = stu.A04) == null) {
            return false;
        }
        return tii.isPlaying();
    }

    public final void pause() {
        STU stu = this.A00;
        if (stu != null) {
            stu.A05();
        }
    }

    public final void release() {
        STU stu = this.A00;
        if (stu != null) {
            stu.A07();
        }
    }

    public final void seekTo(int i) {
        STU stu = this.A00;
        if (stu != null) {
            stu.A09(i);
        }
    }

    public final void start() {
        STU stu = this.A00;
        if (stu != null) {
            stu.A06();
        }
    }

    public C40387AbK(Context context, UserSession userSession, int i, int i2) {
        this.A03 = context;
        this.A04 = userSession;
        this.A02 = i;
        this.A01 = i2;
    }
}
