package X;

import android.content.Context;
import android.view.View;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.clips.intf.ClipsViewerConfig;
import com.instagram.common.session.UserSession;
import org.webrtc.CameraCapturer;

/* renamed from: X.GMi  reason: case insensitive filesystem */
public final class C52292GMi extends C251343mx {
    public final View.OnClickListener A00;
    public final ClipsViewerConfig A01;
    public final C267324bN A02;
    public final C67231sQ A03;
    public final C52058GDe A04;
    public final UserSession A05;
    public final JTB A06;
    public final boolean A07;
    public final boolean A08;
    public final boolean A09;

    public C52292GMi(View.OnClickListener onClickListener, ClipsViewerConfig clipsViewerConfig, C267324bN r4, C67231sQ r5, C52058GDe gDe, UserSession userSession, JTB jtb, boolean z, boolean z2, boolean z3) {
        C51974G9v.A0d(3, userSession, clipsViewerConfig, gDe, jtb);
        this.A02 = r4;
        this.A03 = r5;
        this.A05 = userSession;
        this.A01 = clipsViewerConfig;
        this.A04 = gDe;
        this.A06 = jtb;
        this.A09 = z;
        this.A00 = onClickListener;
        this.A07 = z2;
        this.A08 = z3;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r19) {
        2WX r10;
        long A0A;
        AnonymousClass3Y5 r7 = r19;
        0qQ.A0B(r7, 0);
        C267324bN r3 = this.A02;
        1Xj r2 = r3.A02;
        if (r2 != null) {
            C67231sQ r1 = this.A03;
            ClipsViewerConfig clipsViewerConfig = this.A01;
            AnonymousClass4Ke r11 = (AnonymousClass4Ke) AnonymousClass3Zw.A00(r7, C58697Iw6.A00(r2, r7, this, 48), new Object[]{r3, r2, r1, clipsViewerConfig, this.A05});
            if (r11 != null) {
                boolean z = r11.A05;
                AnonymousClass4Ey A002 = 2Vi.A00(C243533Zd.LOCAL, "audio_cta");
                C51966G9m.A1M(A002, CameraCapturer.OPEN_CAMERA_DELAY_MS);
                float A032 = C51970G9q.A03(A002, C246033ds.A00);
                AnonymousClass4F7.A00(r7, A002);
                Object A003 = AnonymousClass3Zw.A00(r7, C58697Iw6.A00(r11, r7, this, 47), new Object[]{r11});
                GAM gam = (GAM) AnonymousClass3Zw.A00(r7, C58699Iw8.A00(A003, r7, this, r11, 47), new Object[]{r11});
                C243773a4.A00(r7, C58715IwO.A01(gam, 6), new Object[]{gam});
                if (clipsViewerConfig.A1Q || z) {
                    r10 = null;
                } else {
                    AnonymousClass3XV r0 = 2WX.A02;
                    r10 = C51971G9r.A0Z(C51965G9l.A0X((2WX) null, new C244253at(AnonymousClass05K.A00, J6F.A00(gam, 40), (String) null)), AnonymousClass05K.A01, J6F.A00(gam, 41), (String) null);
                }
                AnonymousClass3XV r02 = 2WX.A02;
                Integer num = AnonymousClass05K.A00;
                Integer num2 = AnonymousClass05K.A01;
                GH5 gh5 = new GH5(gam, (ImageView.ScaleType) null, AnonymousClass9JR.A00(C51971G9r.A0X((2WX) null, num, 100.0f, 0), num2, 0, ((long) gam.getIntrinsicHeight()) | 9221401712017801216L).A00(r10), false);
                int dimensionPixelSize = C51969G9p.A0M(r7).getDimensionPixelSize(R.dimen.afi_margin_top) * 2;
                Context A004 = C243803a8.A00(r7);
                int A062 = (int) (((double) (0nA.A06(A004) - (AnonymousClass7TG.A03(A004) * 2))) * 0.4d);
                C306386Ly r03 = gam.A02;
                if (r03 == null) {
                    0qQ.A0F("textDrawableStart");
                    throw AnonymousClass00P.createAndThrow();
                }
                gam.A02(Integer.valueOf(A062), Integer.valueOf(r03.A0A + gam.A06 + gam.A07 + dimensionPixelSize));
                2WX A0R = C51973G9u.A0R(C51974G9v.A0C((2WX) null, C51965G9l.A0c(num, 0, ((long) A062) | 9221401712017801216L), A032), C51966G9m.A0k(0, 9221401712017801224L), 0, C244013aV.A05(r7));
                if (this.A09) {
                    A0A = C51969G9p.A0D();
                } else {
                    A0A = C244013aV.A0A(r7);
                }
                2WX A0Z = C51971G9r.A0Z(C51971G9r.A0Y(C51972G9s.A0V(C51972G9s.A0R(A0R, 0, A0A), J6F.A00(this, 37)), AnonymousClass05K.A04, J6F.A00(this, 38), 4), num, J6F.A00(this, 39), (String) null);
                if (A003 != null) {
                    A0Z = C51971G9r.A0Y(A0Z, AnonymousClass05K.A0N, A003, 0);
                }
                2WX A0U = C51972G9s.A0U(A0Z, num2, 0);
                2Wb A0Q = C51972G9s.A0Q(r7);
                return C51967G9n.A0P(C243563Zg.A0G(G9t.A0v(gh5, A0Q.A00), A0Q, (2WX) null), A0Q, r7, A0U);
            }
        }
        return null;
    }
}
