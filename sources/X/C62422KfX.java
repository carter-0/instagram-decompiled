package X;

import android.content.Context;
import android.view.Surface;
import com.instagram.common.session.UserSession;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;
import com.instagram.video.live.streaming.common.BroadcastFailureType;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* renamed from: X.KfX  reason: case insensitive filesystem */
public final class C62422KfX extends LPE implements MTD {
    public static final long A0R = TimeUnit.SECONDS.toMillis(20);
    public int A00;
    public int A01;
    public int A02 = this.A00;
    public int A03 = this.A01;
    public Surface A04;
    public C21478XcN A05;
    public C18014Vjq A06;
    public C66537MVr A07;
    public LSQ A08;
    public C65819M0l A09;
    public List A0A = 0sn.A00;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E = true;
    public boolean A0F;
    public boolean A0G;
    public boolean A0H;
    public boolean A0I;
    public final LRP A0J;
    public final M0W A0K;
    public final IgLiveWithGuestFragment A0L;
    public final C63937LDx A0M;
    public final String A0N;
    public final String A0O;
    public final AnonymousClass0iw A0P;
    public final C262224Cq A0Q;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C62422KfX(Context context, C340307l3 r8, AnonymousClass82X r9, AnonymousClass0iw r10, UserSession userSession, LRP lrp, M0W m0w, IgLiveWithGuestFragment igLiveWithGuestFragment, String str, String str2, C262224Cq r17, int i, int i2, boolean z) {
        super(context, r8, r9, userSession);
        AnonymousClass7TF.A1F(userSession, 2, r9);
        this.A0P = r10;
        this.A0N = str;
        this.A0Q = r17;
        this.A0L = igLiveWithGuestFragment;
        this.A0K = m0w;
        this.A0J = lrp;
        this.A0H = z;
        this.A0O = str2;
        this.A00 = i;
        this.A01 = i2;
        long j = A0R;
        this.A0M = new C63937LDx(new C65815M0h(this), new MBH(this, 15), j);
        this.A02 = igLiveWithGuestFragment;
    }

    public final void A0I() {
        this.A0F = true;
        if (!this.A0B) {
            A03(this, AnonymousClass05K.A02);
            this.A0K.A0A("stop camera", "");
            C14693U1s u1s = this.A09.A09;
            u1s.sendMessageAtFrontOfQueue(u1s.obtainMessage(5));
            this.A08.A01();
            C63937LDx lDx = this.A0M;
            lDx.A02.removeCallbacks(lDx.A04);
        }
    }

    public static final void A00(C21478XcN xcN, C62422KfX kfX) {
        kfX.A0K.A0A("stop encoding", "");
        C14693U1s u1s = kfX.A09.A09;
        u1s.sendMessageAtFrontOfQueue(u1s.obtainMessage(4));
        kfX.A05 = new XPP(0, xcN, kfX);
    }

    public static final void A01(BroadcastFailureType broadcastFailureType, C62422KfX kfX, String str, String str2) {
        C62683Kkj kkj = new C62683Kkj(broadcastFailureType, str, str2);
        0wb r2 = 0wb.A01;
        String message = kkj.getMessage();
        if (message == null) {
            message = "null_message";
        }
        r2.Ew6("ig_media_creation_broadcast_trace", message, 1, kkj);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("notifyBroadcastFatalError(");
        BroadcastFailureType broadcastFailureType2 = kkj.A00;
        A1A.append(broadcastFailureType2);
        A1A.append(", ");
        String str3 = kkj.A01;
        A1A.append(str3);
        A1A.append("): ");
        0KC.A0D("IgLiveWithGuestStreamingController", AnonymousClass7TF.A0l(kkj.getMessage(), A1A));
        String name = broadcastFailureType2.name();
        String message2 = kkj.getMessage();
        Dba.A0j(1, str3, name);
        kfX.A0K.A0B(str3, name, message2, true);
        if (!kfX.A0D) {
            kfX.A0D = true;
            11Z.A03(new M8E(kkj, kfX));
        }
    }

    public static final void A02(C62422KfX kfX) {
        C62422KfX kfX2 = kfX;
        if (kfX2.A0B) {
            return;
        }
        if (kfX2.A07 == null) {
            C61514KAt kAt = new C61514KAt(kfX2, 6);
            Context context = kfX2.A05;
            UserSession userSession = kfX2.A07;
            String str = kfX2.A0N;
            L5Y l5y = new L5Y(kfX2.A01, kfX2.A00);
            C340307l3 r7 = kfX2.A06;
            C18014Vjq vjq = kfX2.A06;
            if (vjq == null) {
                0qQ.A0F("previewProvider");
                throw AnonymousClass00P.createAndThrow();
            }
            C65819M0l m0l = new C65819M0l(context, r7, userSession, vjq, kfX2.A0J, new C65817M0j(kfX2), l5y, str, false);
            String str2 = kfX2.A0O;
            if (str2 != null) {
                MJD mjd = new MJD(kAt, m0l, m0l.A0E, str2, 6);
                m0l.A03 = C51966G9m.A1L(new MGC((Object) mjd, (Object) m0l, (AnonymousClass4D7) null, 3), m0l.A0F);
                m0l.EPE(DbT.A0h().A0R());
                kfX2.A0G = m0l.A05;
                kfX2.A09 = m0l;
                kfX2.A07 = m0l;
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
        if (kfX2.A08 == null) {
            LSQ lsq = new LSQ(kfX2.A05, kfX2.A07, kfX2.A01, kfX2.A00);
            lsq.A0B = kfX2;
            kfX2.A08 = lsq;
        }
        Surface surface = kfX2.A04;
        if (surface != null) {
            kfX2.A09.A09.obtainMessage(1, surface).sendToTarget();
        }
    }

    public static final void A03(C62422KfX kfX, Integer num) {
        if (!kfX.A0E) {
            kfX.A0K.A0A("broadcast interrupted", LKE.A01(num));
            kfX.A0E = true;
            LSQ lsq = kfX.A08;
            if (lsq != null) {
                lsq.A04();
            }
            A00((C21478XcN) null, kfX);
        }
    }

    /* JADX WARNING: type inference failed for: r0v13, types: [X.KHH, X.11X] */
    public final void A0J(boolean z, boolean z2) {
        0Aj A0d;
        int i;
        if (this.A0I != z || z2) {
            this.A0I = z;
            if (z) {
                LSQ lsq = this.A08;
                if (lsq != null && lsq.A0E) {
                    lsq.A04();
                }
                LSQ lsq2 = this.A08;
                if (lsq2 != null) {
                    lsq2.A03 = this.A03;
                    lsq2.A02 = this.A02;
                    lsq2.A0A = (C21028XAh) 00k.A0J(this.A0A);
                    lsq2.A09 = AnonymousClass0t1.A01.A01(lsq2.A0J).A0D();
                    lsq2.A05 = null;
                    lsq2.A08 = null;
                    lsq2.A04 = null;
                    1ES.A03(new KHH(lsq2));
                }
                this.A08.A01();
                LSQ lsq3 = this.A08;
                if (lsq3 != null) {
                    lsq3.A05(this.A04);
                }
            } else {
                A03(this, AnonymousClass05K.A04);
                A02(this);
            }
        }
        M0W m0w = this.A0K;
        m0w.A06 = z;
        C58840Ae r1 = m0w.A0C;
        if (z) {
            A0d = C51969G9p.A0d(r1, "ig_live_broadcast_video_toggled_off");
            i = 228;
        } else {
            A0d = C51969G9p.A0d(r1, "ig_live_broadcast_video_toggled_on");
            i = 229;
        }
        M0W.A06(A0d, m0w, i);
        1ES.A03(LTC.A03(this.A07, JTP.A0j(z ? 1 : 0), this.A0N));
    }

    public final void Cr7(C21028XAh xAh) {
        C66537MVr mVr = this.A07;
        if (mVr != null) {
            mVr.Cr5(xAh);
        }
    }
}
