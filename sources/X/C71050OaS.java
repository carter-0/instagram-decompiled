package X;

import android.os.Build;
import android.util.Size;
import android.view.View;
import android.webkit.URLUtil;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel;

/* renamed from: X.OaS  reason: case insensitive filesystem */
public abstract class C71050OaS {
    public static final Size A00(IgImageView igImageView) {
        int i;
        0qQ.A0B(igImageView, 0);
        int dimensionPixelSize = igImageView.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        if (igImageView.getHeight() > 0) {
            dimensionPixelSize = igImageView.getHeight();
        }
        if (igImageView.getWidth() > 0) {
            i = igImageView.getWidth();
        } else {
            i = (int) (((float) dimensionPixelSize) * 0.75f);
        }
        return new Size(i, dimensionPixelSize);
    }

    public static final void A02(View view, UserSession userSession, IgImageView igImageView, C231672s5 r12, C252063oV r13, C68821NYf nYf, C328687Ft r15, AnonymousClass0eM r16, boolean z) {
        View view2 = view;
        IgImageView igImageView2 = igImageView;
        C252063oV r8 = r13;
        AnonymousClass7TG.A1U(igImageView, view, r13);
        C68821NYf nYf2 = nYf;
        AnonymousClass0eM r9 = r16;
        AnonymousClass7TF.A1E(r9, 5, nYf);
        UserSession userSession2 = userSession;
        if (r13.CVM() || nYf.A07 || !C70867OPg.A01(userSession)) {
            AnonymousClass759 r2 = new AnonymousClass759(AnonymousClass7TE.A0S(igImageView2), view2, userSession2, igImageView2, r12, r8, r9, 128);
            PrivacyMediaOverlayViewModel privacyMediaOverlayViewModel = nYf.A04;
            C328687Ft r82 = r15;
            if (nYf.A07 && privacyMediaOverlayViewModel != null) {
                r2.A04(privacyMediaOverlayViewModel, new C58208IoC(43, r82, userSession2, privacyMediaOverlayViewModel, nYf2), nYf.A00);
            } else if (r15.A07) {
                r2.A03(r15.A00, z);
            } else {
                r2.A02();
            }
        }
    }

    public static final boolean A03(C68821NYf nYf) {
        C300925yB r2;
        AnonymousClass776 r1;
        0qQ.A0B(nYf, 0);
        AnonymousClass77B r0 = nYf.A01;
        Integer num = null;
        if (r0 != null) {
            r2 = r0.A0F;
        } else {
            r2 = null;
        }
        AnonymousClass777 r12 = nYf.A02.A0F;
        if (!(r12 == null || !(r12 instanceof AnonymousClass776) || (r1 = (AnonymousClass776) r12) == null)) {
            num = r1.A03;
        }
        if ((r2 == null || !r2.A05()) && num == null) {
            return false;
        }
        return true;
    }

    public static final void A01(Size size, AnonymousClass0iw r15, UserSession userSession, IgImageView igImageView, C231672s5 r18, C68821NYf nYf, C262224Cq r20) {
        C300925yB r0;
        IgImageView igImageView2 = igImageView;
        C68821NYf nYf2 = nYf;
        int A1Z = AnonymousClass7TG.A1Z(igImageView2, nYf2);
        C262224Cq r13 = r20;
        0qQ.A0B(r13, 5);
        AnonymousClass77B r02 = nYf2.A01;
        String str = null;
        if (r02 == null || (r0 = r02.A0F) == null || (str = r0.A08) == null || !URLUtil.isNetworkUrl(str)) {
            Size size2 = size;
            UserSession userSession2 = userSession;
            if (Build.VERSION.SDK_INT < 29 || !nYf2.A05 || str == null || str.length() == 0 || !C66580MXl.A1a("content://", A1Z, str)) {
                AnonymousClass777 r7 = nYf2.A02.A0F;
                if (r7 instanceof AnonymousClass776) {
                    AnonymousClass776 r72 = (AnonymousClass776) r7;
                    int A0A = AnonymousClass7TG.A0A(r72.A05);
                    int A04 = C51967G9n.A04(r72.A04, 0);
                    int width = size.getWidth();
                    int height = size.getHeight();
                    int i = 1;
                    if (A04 > height || A0A > width) {
                        int i2 = A04 / 2;
                        int i3 = A0A / 2;
                        while (i2 / i >= height && i3 / i >= width) {
                            i *= 2;
                        }
                        if (i > A1Z && 182.A06(0Tu.A05, userSession2, 36328813369572966L)) {
                            igImageView2.A0E(r15, r72.A00, i);
                            return;
                        }
                    }
                    igImageView2.setUrl(userSession2, r72.A00, r15);
                    return;
                }
                igImageView2.A09();
                return;
            }
            OZ4.A00.A01(AnonymousClass7TE.A0S(igImageView2), size2, userSession2, str, new C74185PqR(29, (Object) igImageView2, (Object) r18), r13);
            return;
        }
        igImageView2.setUrl(DbS.A0V(str), r15);
    }
}
