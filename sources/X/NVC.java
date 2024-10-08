package X;

import android.view.View;
import com.instagram.common.session.UserSession;

public class NVC extends C68058MzP {
    public final View A00;
    public final UserSession A01;
    public final OWC A02;
    public final C71859Os0 A03;

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x007a, code lost:
        if (r0 == false) goto L_0x007c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x008d, code lost:
        if (X.C70867OPg.A01(r13.A01) != false) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00b6, code lost:
        if (X.182.A06(X.0Tu.A05, r7, 36330166284403179L) != false) goto L_0x00b8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0144, code lost:
        if (X.C70867OPg.A01(r13.A01) != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A01(X.NVH r14) {
        /*
            r13 = this;
            r3 = 0
            super.A01(r14)
            X.N3F r0 = r14.A01
            X.N37 r5 = r0.A00
            r4 = 0
            if (r5 == 0) goto L_0x01a0
            X.N2w r9 = r5.A00
        L_0x000d:
            r2 = 8
            if (r9 == 0) goto L_0x0169
            X.OWC r10 = r13.A02
            X.3oV r0 = r10.A0E
            android.view.View r0 = r0.E2D()
            if (r0 == 0) goto L_0x001e
            r0.setVisibility(r2)
        L_0x001e:
            java.lang.String r6 = r9.A06
            if (r6 == 0) goto L_0x0062
            X.JuG r8 = r14.A05
            long r0 = r14.A00
            android.view.View r2 = r13.A00
            if (r2 == 0) goto L_0x003e
            if (r8 == 0) goto L_0x003e
            com.instagram.common.session.UserSession r2 = r13.A01
            X.5yA r7 = new X.5yA
            r7.<init>(r2)
            r11 = 1000(0x3e8, double:4.94E-321)
            long r0 = r0 * r11
            X.3t2 r2 = r8.A00
            if (r2 == 0) goto L_0x015c
            boolean r2 = r2 instanceof X.C254773t1
            if (r2 != 0) goto L_0x015c
        L_0x003e:
            X.0eM r0 = r10.A0O
            com.instagram.common.ui.widget.imageview.IgImageView r8 = X.C66580MXl.A0R(r0)
            com.instagram.common.session.UserSession r7 = r13.A01
            java.lang.Integer r0 = r9.A02
            java.lang.String r1 = "Required value was null."
            if (r0 == 0) goto L_0x01ac
            int r2 = r0.intValue()
            java.lang.Integer r0 = r9.A00
            if (r0 == 0) goto L_0x01a7
            int r0 = r0.intValue()
            com.instagram.model.mediasize.ExtendedImageUrl r1 = new com.instagram.model.mediasize.ExtendedImageUrl
            r1.<init>(r6, r2, r0)
            X.Os0 r0 = r13.A03
            r8.setUrl(r7, r1, r0)
        L_0x0062:
            if (r5 == 0) goto L_0x0159
            java.util.List r0 = r5.A08
            if (r0 == 0) goto L_0x0159
            java.lang.Object r0 = X.00k.A0J(r0)
            X.N2x r0 = (X.C68157N2x) r0
            if (r0 == 0) goto L_0x0159
            java.lang.String r1 = r0.A06
        L_0x0072:
            boolean r0 = X.C66834MdS.A08(r1)
            r6 = 0
            if (r1 == 0) goto L_0x007c
            r1 = 1
            if (r0 != 0) goto L_0x0148
        L_0x007c:
            r1 = 0
            X.OWC r2 = r13.A02
            X.3oV r0 = r2.A08
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x0148
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.C70867OPg.A01(r0)
            if (r0 == 0) goto L_0x0148
        L_0x008f:
            r9 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0135
            java.lang.Integer r6 = r5.A04
            X.1iA r0 = X.1iA.A0Q
            int r1 = r0.A00
            if (r6 == 0) goto L_0x0135
            int r0 = r6.intValue()
            if (r0 != r1) goto L_0x0135
            com.instagram.model.mediasize.ImageInfo r0 = r5.A01
            com.instagram.common.session.UserSession r7 = r13.A01
            boolean r0 = X.1iI.A09(r7, r0)
            if (r0 == 0) goto L_0x0135
            X.0Tu r6 = X.0Tu.A05
            r0 = 36330166284403179(0x811218000341eb, double:3.038681675869603E-306)
            boolean r0 = X.182.A06(r6, r7, r0)
            if (r0 == 0) goto L_0x0135
        L_0x00b8:
            X.3oV r0 = r2.A07
            android.view.View r0 = r0.getView()
            if (r9 != 0) goto L_0x00c2
            r8 = 8
        L_0x00c2:
            r0.setVisibility(r8)
        L_0x00c5:
            if (r5 == 0) goto L_0x00c9
            java.lang.Integer r4 = r5.A05
        L_0x00c9:
            X.3oV r1 = r2.A0M
            boolean r0 = r1.CVM()
            if (r0 != 0) goto L_0x0126
            if (r4 == 0) goto L_0x00d9
            int r0 = r4.intValue()
            if (r0 != 0) goto L_0x0126
        L_0x00d9:
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.C70867OPg.A01(r0)
            if (r0 == 0) goto L_0x0126
        L_0x00e1:
            android.view.View r5 = r13.A00
            if (r5 == 0) goto L_0x0125
            com.instagram.common.session.UserSession r6 = r13.A01
            X.0eM r1 = r2.A0O
            android.view.View r0 = X.AnonymousClass7TE.A0c(r1)
            android.content.Context r4 = X.AnonymousClass7TE.A0S(r0)
            X.3oV r9 = r2.A0C
            com.instagram.common.ui.widget.imageview.IgImageView r7 = X.C66580MXl.A0R(r1)
            r0 = 48
            X.MYO r0 = X.MYO.A01(r13, r0)
            X.0t0 r10 = X.AnonymousClass0eN.A01(r0)
            com.instagram.common.ui.widget.imageview.IgImageView r1 = X.C66580MXl.A0R(r1)
            X.0qQ.A0B(r1, r3)
            X.3Us r0 = X.C71127OdQ.A00(r1)
            X.77D r8 = X.C3265577g.A04(r0, r1)
            r11 = 128(0x80, float:1.794E-43)
            X.759 r3 = new X.759
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11)
            com.instagram.direct.wellbeing.harmfulcontent.ondevicenudity.view.data.PrivacyMediaOverlayViewModel r2 = r14.A06
            if (r2 == 0) goto L_0x01a3
            r1 = 1
            r0 = 14
            X.Plq r0 = X.C73915Plq.A00(r13, r14, r0)
            r3.A04(r2, r0, r1)
        L_0x0125:
            return
        L_0x0126:
            android.view.View r1 = r1.getView()
            com.instagram.common.ui.base.IgTextView r1 = (com.instagram.common.ui.base.IgTextView) r1
            X.PaH r0 = new X.PaH
            r0.<init>(r1, r13, r4)
            r1.post(r0)
            goto L_0x00e1
        L_0x0135:
            r9 = 0
            X.3oV r0 = r2.A07
            boolean r0 = r0.CVM()
            if (r0 != 0) goto L_0x00b8
            com.instagram.common.session.UserSession r0 = r13.A01
            boolean r0 = X.C70867OPg.A01(r0)
            if (r0 == 0) goto L_0x00b8
            goto L_0x00c5
        L_0x0148:
            X.OWC r2 = r13.A02
            X.3oV r0 = r2.A08
            android.view.View r0 = r0.getView()
            if (r1 != 0) goto L_0x0154
            r6 = 8
        L_0x0154:
            r0.setVisibility(r6)
            goto L_0x008f
        L_0x0159:
            r1 = 0
            goto L_0x0072
        L_0x015c:
            boolean r2 = r8.A06
            boolean r0 = X.C300915yA.A01(r7, r0, r2)
            if (r0 == 0) goto L_0x003e
            X.C300915yA.A00(r7, r8, r4, r6)
            goto L_0x003e
        L_0x0169:
            X.5yB r0 = r0.A01
            if (r0 == 0) goto L_0x0062
            com.instagram.common.session.UserSession r7 = r13.A01
            X.3Q2 r0 = X.C66582MXn.A0g(r7, r0)
            if (r0 == 0) goto L_0x0197
            java.lang.String r6 = r0.A33
            if (r6 == 0) goto L_0x0197
            X.OWC r1 = r13.A02
            X.3oV r0 = r1.A0E
            android.view.View r0 = r0.E2D()
            if (r0 == 0) goto L_0x0186
            r0.setVisibility(r2)
        L_0x0186:
            X.0eM r0 = r1.A0O
            com.instagram.common.ui.widget.imageview.IgImageView r2 = X.C66580MXl.A0R(r0)
            com.instagram.common.typedurl.SimpleImageUrl r1 = X.JTQ.A0G(r6)
            X.Os0 r0 = r13.A03
            r2.setUrl(r7, r1, r0)
            goto L_0x0062
        L_0x0197:
            X.OWC r0 = r13.A02
            X.3oV r0 = r0.A0E
            X.C66580MXl.A1Q(r0, r3)
            goto L_0x0062
        L_0x01a0:
            r9 = r4
            goto L_0x000d
        L_0x01a3:
            r3.A02()
            return
        L_0x01a7:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        L_0x01ac:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NVC.A01(X.NVH):void");
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.Os0, java.lang.Object] */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ NVC(android.view.View r8, com.instagram.common.session.UserSession r9, X.OLM r10, int r11, boolean r12) {
        /*
            r7 = this;
            X.OWC r4 = new X.OWC
            r2 = r8
            r4.<init>(r8, r9)
            r3 = r10
            X.AnonymousClass7TG.A1O(r9, r10)
            r1 = r7
            r5 = r11
            r6 = r12
            r1.<init>(r2, r3, r4, r5, r6)
            r7.A01 = r9
            r7.A02 = r4
            boolean r0 = X.C66797Mcj.A00(r9)
            if (r0 == 0) goto L_0x002a
            X.0eM r0 = r4.A0P
            android.view.View r0 = X.AnonymousClass7TE.A0c(r0)
        L_0x0020:
            r7.A00 = r0
            X.Os0 r0 = new X.Os0
            r0.<init>()
            r7.A03 = r0
            return
        L_0x002a:
            r0 = 0
            goto L_0x0020
        */
        throw new UnsupportedOperationException("Method not decompiled: X.NVC.<init>(android.view.View, com.instagram.common.session.UserSession, X.OLM, int, boolean):void");
    }
}
