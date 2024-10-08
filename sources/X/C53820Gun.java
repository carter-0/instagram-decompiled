package X;

import android.graphics.Color;
import android.graphics.RectF;
import android.graphics.drawable.GradientDrawable;
import android.util.Size;
import android.widget.ImageView;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Gun  reason: case insensitive filesystem */
public final class C53820Gun extends C251343mx {
    public final C52129GFx A00;
    public final C267324bN A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;
    public final JP2 A04;
    public final boolean A05;
    public final boolean A06;

    public C53820Gun(C267324bN r2, AnonymousClass0iw r3, UserSession userSession, JP2 jp2, C52129GFx gFx, boolean z, boolean z2) {
        0qQ.A0B(gFx, 3);
        this.A03 = userSession;
        this.A01 = r2;
        this.A00 = gFx;
        this.A04 = jp2;
        this.A05 = z;
        this.A02 = r3;
        this.A06 = z2;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r29) {
        0eP r1;
        String str;
        String str2;
        GradientDrawable gradientDrawable;
        ExtendedImageUrl A1n;
        C271264iX AhE;
        C271264iX C8L;
        float f;
        AnonymousClass3Y5 r15 = r29;
        0qQ.A0B(r15, 0);
        C267324bN r10 = this.A01;
        1Xj r0 = r10.A02;
        if (r0 != null) {
            float A0l = r0.A0l();
            JP2 jp2 = this.A04;
            float f2 = 0.0f;
            Float valueOf = Float.valueOf(0.0f);
            if (jp2 != null) {
                Size BJW = jp2.BJW();
                float width = (float) BJW.getWidth();
                float height = (float) BJW.getHeight();
                float f3 = width / height;
                if (A0l > f3) {
                    f = C51967G9n.A00(height, width / A0l);
                } else {
                    if (A0l < f3) {
                        f2 = C51967G9n.A00(width, height * A0l);
                    }
                    f = 0.0f;
                }
                r1 = G9t.A1E(f2, f);
            } else {
                r1 = new 0eP(valueOf, valueOf);
            }
            float A042 = AnonymousClass7TE.A04(r1.A00);
            float A043 = AnonymousClass7TE.A04(r1.A01);
            if (r10.CcK()) {
                C257803xz r02 = r10.A06().A0H;
                if (r02 == null || (C8L = r02.C8L()) == null) {
                    str = null;
                } else {
                    str = C8L.getBackgroundColor();
                }
                C257803xz r03 = r10.A06().A0H;
                if (r03 == null || (AhE = r03.AhE()) == null) {
                    str2 = null;
                } else {
                    str2 = AhE.getBackgroundColor();
                }
                if (str == null || str2 == null) {
                    gradientDrawable = null;
                } else {
                    RectF rectF = 0nA.A01;
                    gradientDrawable = C51970G9q.A0O(GradientDrawable.Orientation.TOP_BOTTOM, Color.parseColor(str), Color.parseColor(str2));
                }
                AnonymousClass3XV r04 = 2WX.A02;
                C244413b9 r12 = C244413b9.ABSOLUTE;
                Integer num = AnonymousClass05K.A0Y;
                2WX A0X = C51971G9r.A0X(C51971G9r.A0Y((2WX) null, num, r12, 3), AnonymousClass05K.A01, 100.0f, 0);
                Integer num2 = AnonymousClass05K.A00;
                2WX A0Y = C51971G9r.A0Y(C51971G9r.A0X(A0X, num2, 100.0f, 0), num2, gradientDrawable, 4);
                2Wb A0Q = C51972G9s.A0Q(r15);
                GGH ggh = GGH.A00;
                2WX A0Y2 = C51971G9r.A0Y((2WX) null, num, r12, 3);
                UserSession userSession = this.A03;
                2WX A0Y3 = C51971G9r.A0Y(C52371GPs.A00(C243803a8.A00(A0Q), ggh.A00(C243803a8.A00(A0Q), ggh.A01(C243803a8.A00(A0Q), A0Y2, userSession, jp2), userSession), jp2, A0l, 0.0f, 0.0f, 0, this.A05, true, false, true), AnonymousClass05K.A04, new C58732Iwf(this, A042, A043), 4);
                2Wb A0w = G9t.A0w(A0Q);
                1Xj r4 = r10.A02;
                if (!(r4 == null || (A1n = r4.A1n(C243803a8.A00(A0w))) == null)) {
                    A0w.A00(new GYW(ImageView.ScaleType.FIT_CENTER, (2WX) null, this.A02, A1n, (ImageUrl) null, (C240963Ni) null, (C226632hb) null, (String) null, 3, this.A06, false));
                }
                C51967G9n.A1F(A0w, A0Q, A0Y3);
                return C243563Zg.A04(A0Q, r15, A0Y);
            }
        }
        return null;
    }
}
