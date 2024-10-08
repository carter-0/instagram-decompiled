package X;

import android.graphics.Paint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Occ  reason: case insensitive filesystem */
public final class C71102Occ {
    public static final C71102Occ A00 = new Object();

    public static final ViewGroup A00(ViewGroup viewGroup, C247833gz r8, UserSession userSession, C226642hc r10, C309646Zb r11) {
        ViewGroup viewGroup2;
        AnonymousClass7TF.A1B(viewGroup, 1, r11);
        0qQ.A0B(userSession, 5);
        LayoutInflater A0D = DbV.A0D(viewGroup);
        if (!182.A06(0Tu.A05, userSession, 36323320106593354L)) {
            View inflate = A0D.inflate(R.layout.layout_iglive_archive_reel_item, viewGroup, false);
            0qQ.A0C(inflate, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) inflate;
            C51968G9o.A1D(viewGroup2, -1);
        } else {
            0qQ.A0A(A0D);
            View A002 = 2Su.A00(A0D, new ViewGroup.LayoutParams(-1, -1), viewGroup, R.layout.layout_iglive_archive_reel_item);
            0qQ.A0C(A002, "null cannot be cast to non-null type android.view.ViewGroup");
            viewGroup2 = (ViewGroup) A002;
        }
        C305736Ji r2 = new C305736Ji(viewGroup2, userSession, r11);
        r2.BQU().setCornerRadius(0);
        if (r10 != null) {
            r2.A00().setPostProcessor(r10);
        }
        if (r8 != null) {
            r2.A00().setProgressiveImageConfig(r8);
        }
        AnonymousClass7TE.A0c(r2.A0F).setLayerType(1, (Paint) null);
        viewGroup2.setTag(r2);
        return viewGroup2;
    }

    public static final void A02(UserSession userSession, C255773uh r8, C250973mM r9, AnonymousClass3BQ r10, C305736Ji r11, int i, int i2) {
        AnonymousClass7TF.A1C(r11, 1, r8);
        0qQ.A0B(r10, 6);
        C309426Yf r5 = new C309426Yf(true);
        0xG A0O = DbS.A0O("reel_animator");
        UserSession userSession2 = userSession;
        C250973mM r3 = r9;
        A01(A0O, userSession2, r8, r3, r10, r5, r11, i, i2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0099, code lost:
        if (r5 == false) goto L_0x009b;
     */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00c2  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x00f4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A01(X.AnonymousClass0iw r14, com.instagram.common.session.UserSession r15, X.C255773uh r16, X.C250973mM r17, X.AnonymousClass3BQ r18, X.C309426Yf r19, X.C305736Ji r20, int r21, int r22) {
        /*
            r10 = r20
            X.6Yf r0 = r10.A02
            r2 = r19
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x0013
            X.6Yf r0 = r10.A02
            if (r0 == 0) goto L_0x0013
            r0.A04(r10)
        L_0x0013:
            X.3uh r0 = r10.A00
            r11 = r16
            boolean r16 = r11.equals(r0)
            com.instagram.feed.widget.IgProgressImageView r0 = r10.A00()
            r1 = 8
            r0.setVisibility(r1)
            X.0eM r13 = r10.A0F
            X.DbW.A1R(r13, r1)
            X.0eM r12 = r10.A0K
            X.JTS.A1W(r12, r1)
            X.0eM r0 = r10.A0C
            X.JTS.A1W(r0, r1)
            X.0eM r0 = r10.A0I
            X.JTS.A1W(r0, r1)
            X.0eM r0 = r10.A0H
            X.JTS.A1W(r0, r1)
            X.0eM r0 = r10.A06
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r9 = 0
            r0.setVisibility(r9)
            r0 = r17
            r10.A01 = r0
            com.instagram.user.model.User r8 = r11.A0i
            if (r8 == 0) goto L_0x005e
            com.instagram.common.typedurl.ImageUrl r1 = r8.Bh3()
            X.0eM r0 = r10.A0D
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r0 = (com.instagram.common.ui.widget.imageview.IgImageView) r0
            r0.setUrl(r1, r14)
        L_0x005e:
            r10.A00 = r11
            r10.A02 = r2
            boolean r0 = r11.A1N()
            if (r0 == 0) goto L_0x00f8
            r0 = 0
            r10.A00 = r0
            r10.A02 = r0
            java.lang.Object r1 = r13.getValue()
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r1 = (com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar) r1
            r0 = 0
            r1.setProgress(r0)
            com.instagram.feed.widget.IgProgressImageView r0 = r10.A00()
            r0.A04()
            com.instagram.feed.widget.IgProgressImageView r0 = r10.A00()
        L_0x0082:
            r0.setVisibility(r9)
        L_0x0085:
            if (r8 == 0) goto L_0x00ac
            boolean r5 = r18.A00()
            X.0eM r1 = r10.A0O
            android.widget.TextView r4 = X.JTQ.A0A(r1)
            boolean r0 = r8.isVerified()
            r3 = 0
            if (r0 == 0) goto L_0x009b
            r2 = 1
            if (r5 != 0) goto L_0x009c
        L_0x009b:
            r2 = 0
        L_0x009c:
            android.view.View r0 = X.AnonymousClass7TH.A06(r1)
            android.content.res.Resources r0 = r0.getResources()
            int r1 = X.JTP.A03(r0)
            r0 = -1
            X.C244273av.A09(r4, r3, r1, r0, r2)
        L_0x00ac:
            X.0eM r0 = r10.A07
            java.lang.Object r3 = X.AnonymousClass7TE.A14(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r3 = (com.instagram.common.ui.widget.imageview.IgImageView) r3
            android.content.Context r0 = r3.getContext()
            com.instagram.common.typedurl.ImageUrl r2 = r11.A08(r0)
            boolean r0 = X.C253833rU.A02(r2)
            if (r0 != 0) goto L_0x00f4
            long r0 = r11.A02()
            r3.A05 = r0
            X.0qQ.A0A(r2)
            r3.setUrl(r2, r14)
        L_0x00ce:
            if (r16 != 0) goto L_0x00d4
            r0 = 0
            r3.setVisibility(r0)
        L_0x00d4:
            X.0eM r0 = r10.A0R
            java.lang.Object r2 = r0.getValue()
            X.2eb r2 = (X.C71662eb) r2
            X.3kW r0 = X.AnonymousClass1Qz.A00(r15)
            X.1R7 r0 = r0.C82()
            java.lang.String r1 = "ig_zero_rating_data_banner"
            java.util.Set r0 = r0.A0C
            boolean r0 = r0.contains(r1)
            int r0 = X.DbW.A01(r0)
            r2.A03(r0)
            return
        L_0x00f4:
            r3.A0B()
            goto L_0x00ce
        L_0x00f8:
            r2.A03(r10)
            X.4gL r7 = r11.A0c
            if (r7 == 0) goto L_0x0139
            X.0eM r0 = r10.A0O
            android.widget.TextView r6 = X.JTQ.A0A(r0)
            long r0 = r7.A01()
            double r4 = (double) r0
            long r2 = java.lang.System.currentTimeMillis()
            double r0 = (double) r2
            r2 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r0 = r0 / r2
            java.lang.String r2 = "MMMM d"
            java.lang.String r0 = X.1G0.A0F(r2, r4, r0)
            r6.setText(r0)
            android.widget.TextView r3 = X.JTQ.A0A(r12)
            r0 = 3
            java.text.DateFormat r2 = java.text.DateFormat.getTimeInstance(r0)
            long r0 = r7.A01()
            java.lang.Long r0 = X.C66582MXn.A0l(r0)
            java.lang.String r0 = r2.format(r0)
            r3.setText(r0)
            X.JTS.A1W(r12, r9)
        L_0x0139:
            java.lang.Object r0 = r13.getValue()
            com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar r0 = (com.instagram.ui.widget.segmentedprogressbar.SegmentedProgressBar) r0
            r1 = r21
            r0.setSegments(r1)
            r1 = r22
            r0.A06(r1, r9)
            r0.setVisibility(r9)
            X.0eM r0 = r10.A0J
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 22
            X.C71396Ojv.A00(r1, r0, r10)
            X.0eM r0 = r10.A09
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 23
            X.C71396Ojv.A00(r1, r0, r10)
            X.0eM r0 = r10.A08
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 24
            X.C71396Ojv.A00(r1, r0, r10)
            com.instagram.user.model.User r1 = X.DbT.A0j(r15)
            boolean r0 = r1.A2L()
            if (r0 == 0) goto L_0x019a
            boolean r0 = r1.A1P()
            if (r0 == 0) goto L_0x019a
            X.0Tu r2 = X.0Tu.A05
            r0 = 36311650680177344(0x810141000002c0, double:3.026972333200831E-306)
            boolean r0 = X.182.A06(r2, r15, r0)
            if (r0 == 0) goto L_0x019a
            X.0eM r0 = r10.A0A
            X.JTS.A1W(r0, r9)
            android.view.View r1 = X.AnonymousClass7TH.A06(r0)
            r0 = 25
            X.C71396Ojv.A00(r1, r0, r10)
            goto L_0x0085
        L_0x019a:
            X.0eM r0 = r10.A0A
            android.view.View r0 = X.AnonymousClass7TH.A06(r0)
            r9 = 8
            goto L_0x0082
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71102Occ.A01(X.0iw, com.instagram.common.session.UserSession, X.3uh, X.3mM, X.3BQ, X.6Yf, X.6Ji, int, int):void");
    }
}
