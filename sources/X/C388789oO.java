package X;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.os.Handler;
import android.view.Surface;
import com.facebook.common.math.matrix.Matrix4;
import com.facebook.videolite.transcoder.base.composition.MediaComposition;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.ClipInfo;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.9oO  reason: invalid class name and case insensitive filesystem */
public final class C388789oO extends C378459Pw implements C13753TgP {
    public float A00;
    public int A01;
    public long A02;
    public SurfaceTexture A03;
    public Surface A04;
    public STU A05;
    public C388779oN A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public final Context A0B;
    public final Handler A0C = AnonymousClass7TF.A0D();
    public final AnonymousClass8MA A0D;
    public final UserSession A0E;
    public final A41 A0F;
    public final String A0G;
    public final AtomicBoolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C388789oO(Context context, AnonymousClass8MA r4, UserSession userSession, C41843B2y b2y, A41 a41, C39888ADk aDk, AnonymousClass9RG r9, AnonymousClass9R7 r10, String str, boolean z, boolean z2) {
        super(userSession, b2y, aDk);
        AnonymousClass7TF.A1E(context, 1, userSession);
        this.A0B = context;
        this.A07 = z;
        this.A0E = userSession;
        this.A0F = a41;
        this.A0G = str;
        this.A0D = r4;
        this.A06 = new C388779oN(this, r9, r10);
        this.A00 = z2 ? 1.0f : 0.0f;
        this.A01 = A07();
        this.A0H = new AtomicBoolean(false);
    }

    public final void A0J(UserSession userSession, AnonymousClass3Q2 r13, int i) {
        MediaComposition mediaComposition;
        boolean A1U = AnonymousClass7TF.A1U(0, userSession, r13);
        int i2 = i;
        super.A0J(userSession, r13, i);
        AnonymousClass3Q2 r0 = this.A09;
        if (r0 != null && (mediaComposition = r0.A0r) != null) {
            STU stu = this.A05;
            if (stu != null) {
                ClipInfo clipInfo = r0.A1N;
                if (clipInfo != null) {
                    int i3 = clipInfo.A09;
                    int i4 = clipInfo.A06;
                    C378369Pn r1 = this.A0F.A00;
                    Matrix4 matrix4 = C378369Pn.A0R;
                    stu.A0A(mediaComposition, i3, i4, r1.A03, r1.A02, i2, A1U);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            }
            boolean z = this.A07;
            STU stu2 = this.A05;
            if (z) {
                if (stu2 != null) {
                    stu2.A06();
                }
            } else if (stu2 != null) {
                stu2.A09(0);
            }
        }
    }

    public final void DXb(long j) {
    }

    public final void DXi(C390949s6 r10, C390949s6 r11) {
        C41843B2y b2y;
        C41843B2y b2y2;
        C13862Tii tii;
        C379139Sq r0;
        C41838B2t b2t;
        STU stu;
        long j;
        0qQ.A0B(r11, 1);
        if (r11 != C390949s6.ERROR) {
            C390949s6 r3 = C390949s6.PLAYING;
            if (r10 == r3) {
                if (r11 == C390949s6.SEEKING && (stu = this.A05) != null) {
                    TimeUnit timeUnit = TimeUnit.NANOSECONDS;
                    C13862Tii tii2 = stu.A04;
                    if (tii2 != null) {
                        j = tii2.AuJ();
                    } else {
                        j = 0;
                    }
                    if (timeUnit.toMillis(j) == 0) {
                        AnonymousClass9T2 r02 = this.A06;
                        if (r02 != null) {
                            r02.A01.run();
                        }
                    }
                }
                if (r11 == C390949s6.PLAYBACK_COMPLETE && (b2t = this.A04) != null) {
                    b2t.DyY();
                }
            }
            if (r10 == C390949s6.SEEKING && r11 == r3 && (r0 = this.A02) != null) {
                r0.A00();
            }
            STU stu2 = this.A05;
            if (stu2 != null && (tii = stu2.A04) != null && tii.isPlaying() && r11 == r3) {
                this.A0A = false;
            }
            if (r11 == C390949s6.PREPARING) {
                if (!this.A0H.get() && (b2y2 = this.A05) != null) {
                    b2y2.Dwp();
                }
                C41838B2t b2t2 = this.A04;
                if (b2t2 != null) {
                    b2t2.Dy0();
                }
            }
            if (r11 == C390949s6.READY) {
                if (!this.A0H.get() && (b2y = this.A05) != null) {
                    b2y.Dwq();
                }
                C41838B2t b2t3 = this.A04;
                if (b2t3 != null) {
                    b2t3.Dy2();
                }
            }
        }
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        C388779oN r1 = this.A06;
        r1.A00 = 3;
        r1.A00.A03((Long) null);
    }
}
