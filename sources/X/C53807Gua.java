package X;

import android.widget.ImageView;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Gua  reason: case insensitive filesystem */
public final class C53807Gua extends C251343mx {
    public final C267324bN A00;
    public final AnonymousClass0iw A01;
    public final ClipsViewerSource A02;
    public final C52058GDe A03;
    public final UserSession A04;
    public final JTB A05;

    public C53807Gua(ClipsViewerSource clipsViewerSource, C267324bN r3, C52058GDe gDe, AnonymousClass0iw r5, UserSession userSession, JTB jtb) {
        0qQ.A0B(userSession, 2);
        AnonymousClass7TG.A1S(jtb, r5);
        this.A00 = r3;
        this.A04 = userSession;
        this.A03 = gDe;
        this.A02 = clipsViewerSource;
        this.A05 = jtb;
        this.A01 = r5;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r23) {
        C267324bN r6;
        C251263mp gsV;
        AnonymousClass3Y5 r4 = r23;
        0qQ.A0B(r4, 0);
        C52058GDe gDe = this.A03;
        0qQ.A0B(gDe, 0);
        if (C51969G9p.A1a(gDe.A0D, AnonymousClass3WA.A0F)) {
            r6 = this.A00;
            gsV = new C53722GtD(r6, gDe, this.A05);
        } else {
            UserSession userSession = this.A04;
            r6 = this.A00;
            ClipsViewerSource clipsViewerSource = this.A02;
            boolean A1U = AnonymousClass7TF.A1U(0, userSession, r6);
            if (!C52146GGo.A00(r6, gDe, userSession) || clipsViewerSource == ClipsViewerSource.ACTIVITY_CENTER) {
                1Xj r0 = r6.A02;
                if (r0 == null || r0.A5f() != A1U) {
                    return null;
                }
                AnonymousClass0iw r2 = this.A01;
                1Xj r1 = r6.A02;
                if (r1 != null) {
                    I2F.A02(r1, r2, userSession, AnonymousClass05K.A0Y);
                    gsV = new C53678GsV(r6, this.A05);
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            } else {
                gsV = new C53721GtC(r6, gDe, this.A05);
            }
        }
        AnonymousClass3XV r02 = 2WX.A02;
        Integer num = AnonymousClass05K.A00;
        2WX A0X = C51971G9r.A0X((2WX) null, num, 100.0f, 0);
        Integer num2 = AnonymousClass05K.A01;
        2WX A0X2 = C51971G9r.A0X(A0X, num2, 100.0f, 0);
        2Wb A0Q = C51972G9s.A0Q(r4);
        1Xj r8 = r6.A02;
        if (r8 != null) {
            ExtendedImageUrl A1n = r8.A1n(C243803a8.A00(r4));
            if (A1n == null) {
                A1n = r8.A1l();
            }
            2WX A0O = C51974G9v.A0O(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), num, num2, 100.0f, 0);
            if (A1n != null) {
                A0Q.A00(new GYW(ImageView.ScaleType.CENTER_CROP, A0O, this.A01, A1n, (ImageUrl) null, (C240963Ni) null, C55402Hh8.A00, r8.BTL(), 3, false, false));
                return C51967G9n.A0P(gsV, A0Q, r4, A0X2);
            }
            throw AnonymousClass7TE.A0z("Required value was null.");
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }
}
