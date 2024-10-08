package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextSwitcher;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import com.instagram.ui.widget.spinner.SpinnerImageView;

/* renamed from: X.3yv  reason: invalid class name and case insensitive filesystem */
public class C258383yv {
    public final Context A00;
    public final UserSession A01;
    public final C258373yu A02;
    public final C258403yx A03;
    public final AnonymousClass4DU A04;
    public final boolean A05;

    public C258383yv(Context context, UserSession userSession, C258373yu r4, AnonymousClass4DU r5, boolean z) {
        0qQ.A0B(context, 1);
        0qQ.A0B(userSession, 2);
        this.A00 = context;
        this.A01 = userSession;
        this.A04 = r5;
        this.A05 = z;
        this.A02 = r4;
        this.A03 = C258393yw.A00(userSession);
    }

    public final View A00(Context context, ViewGroup viewGroup, UserSession userSession, AnonymousClass3YT r13) {
        0qQ.A0B(context, 0);
        0qQ.A0B(userSession, 1);
        View inflate = LayoutInflater.from(context).inflate(R.layout.row_feed_cta, viewGroup, false);
        AnonymousClass4DU r8 = this.A04;
        0qQ.A0A(inflate);
        C254073rt A012 = A01(context, inflate, viewGroup, userSession, r13, r8);
        inflate.setTag(A012);
        A012.A0J.addOnAttachStateChangeListener(new AnonymousClass473(userSession, A012));
        return inflate;
    }

    public final C254073rt A01(Context context, View view, ViewGroup viewGroup, UserSession userSession, AnonymousClass3YT r49, AnonymousClass4DU r50) {
        MediaFrameLayout mediaFrameLayout;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        View view2 = view;
        0qQ.A0B(view2, 3);
        ViewGroup viewGroup2 = viewGroup;
        if (viewGroup != null) {
            mediaFrameLayout = (MediaFrameLayout) viewGroup2.findViewById(R.id.collection_main_media_group);
        } else {
            mediaFrameLayout = null;
        }
        int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        C258373yu r20 = this.A02;
        View requireViewById = view2.requireViewById(R.id.row_feed_cta);
        0qQ.A07(requireViewById);
        View requireViewById2 = view2.requireViewById(R.id.row_feed_cta_overlay);
        0qQ.A07(requireViewById2);
        View requireViewById3 = view2.requireViewById(R.id.cta_text);
        0qQ.A07(requireViewById3);
        View requireViewById4 = view2.requireViewById(R.id.cta_text_2_line_alternate);
        0qQ.A07(requireViewById4);
        View requireViewById5 = view2.requireViewById(R.id.cta_text_wa_icon);
        0qQ.A07(requireViewById5);
        View requireViewById6 = view2.requireViewById(R.id.cta_motion_text_switcher);
        0qQ.A07(requireViewById6);
        IgTextView requireViewById7 = view2.requireViewById(R.id.link_secondary_texts);
        0qQ.A07(requireViewById7);
        IgTextView requireViewById8 = view2.requireViewById(R.id.link_secondary_texts_2_line_alternate);
        0qQ.A07(requireViewById8);
        C71662eb r0 = new C71662eb((ViewStub) view2.requireViewById(R.id.link_texts_divider_stub));
        View requireViewById9 = view2.requireViewById(R.id.cta_metadata);
        0qQ.A07(requireViewById9);
        View requireViewById10 = view2.requireViewById(R.id.cta_chevron);
        0qQ.A07(requireViewById10);
        View requireViewById11 = view2.requireViewById(R.id.cta_spinner);
        0qQ.A07(requireViewById11);
        View requireViewById12 = view2.requireViewById(R.id.cta_delete);
        0qQ.A07(requireViewById12);
        View requireViewById13 = view2.requireViewById(R.id.divider_view);
        0qQ.A07(requireViewById13);
        View requireViewById14 = view2.requireViewById(R.id.leftaccessory);
        0qQ.A07(requireViewById14);
        View requireViewById15 = view2.requireViewById(R.id.rightaccessory);
        0qQ.A07(requireViewById15);
        C258433z0 r13 = new C258433z0(view2);
        C258373yu r38 = r20;
        UserSession userSession3 = userSession2;
        return new C254073rt(context, view2, requireViewById2, requireViewById13, (ViewGroup) requireViewById, (TextSwitcher) requireViewById6, (TextView) requireViewById3, (TextView) requireViewById4, (TextView) requireViewById5, (TextView) requireViewById9, userSession3, (IgSimpleImageView) requireViewById12, (IgSimpleImageView) requireViewById14, (IgSimpleImageView) requireViewById15, requireViewById7, requireViewById8, (ColorFilterAlphaImageView) requireViewById10, r0, r49, r38, this.A03, r50, r13, mediaFrameLayout, (SpinnerImageView) requireViewById11);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:39:0x01aa, code lost:
        if (r5.A01(r8, r4) != false) goto L_0x01ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x01d5, code lost:
        if (r5.A01(r8, r4) != false) goto L_0x01d7;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A02(X.C282815Ev r32, X.C254073rt r33, X.AnonymousClass3W1 r34) {
        /*
            r31 = this;
            r9 = 0
            r5 = r33
            X.0qQ.A0B(r5, r9)
            r0 = 1
            r6 = r32
            X.0qQ.A0B(r6, r0)
            r10 = 2
            r4 = r34
            X.0qQ.A0B(r4, r10)
            X.3W1 r1 = r5.A09
            if (r1 == r4) goto L_0x001c
            if (r1 == 0) goto L_0x001c
            r0 = 0
            r1.A0M(r5, r0, r9)
        L_0x001c:
            r7 = r31
            boolean r0 = r7.A05
            if (r0 == 0) goto L_0x0028
            android.view.ViewGroup r1 = r5.A0J
            r0 = 4
            X.2eQ.A04(r1, r0)
        L_0x0028:
            int r0 = r4.A02
            X.5Eu r3 = r6.A00
            X.0sP r1 = r3.A05
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            java.lang.Object r0 = r1.invoke(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x026e
            r5.A08 = r6
            r5.A09 = r4
            com.instagram.common.session.UserSession r2 = r7.A01
            X.32g r0 = X.C2360432f.A00(r2)
            X.1Xj r8 = r6.A02
            long r0 = r0.A01(r8, r4)
            r5.A00 = r0
            X.0Tu r20 = X.0Tu.A05
            r0 = 36325678043444354(0x810e0300013482, double:3.035843294214546E-306)
            r11 = r20
            boolean r0 = X.182.A06(r11, r2, r0)
            r5.A0E = r0
            X.5Ex r11 = X.C282835Ex.A00
            X.4DU r12 = r7.A04
            boolean r0 = r11.A05(r2, r8, r12)
            r5.A0C = r0
            X.0Tu r13 = X.0Tu.A06
            r0 = 36327619368663611(0x810fc700013a3b, double:3.0370709961002935E-306)
            boolean r1 = X.182.A06(r13, r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r1)
            X.0qQ.A0A(r0)
            r5.A0D = r1
            boolean r0 = r11.A03(r2, r8, r12)
            r5.A0A = r0
            boolean r0 = r11.A04(r2, r8, r12)
            r5.A0B = r0
            r0 = 0
            r4.A0L(r5, r0, r9)
            X.0sP r0 = r3.A03
            android.content.Context r11 = r7.A00
            java.lang.Object r13 = r0.invoke(r11)
            java.lang.CharSequence r13 = (java.lang.CharSequence) r13
            boolean r0 = X.1sx.A0J(r8)
            if (r0 == 0) goto L_0x00b0
            X.0qQ.A0B(r8, r10)
            X.IO0 r10 = new X.IO0
            r10.<init>(r5, r5, r8)
            r5.A03 = r10
            X.1Ng r1 = X.AnonymousClass1Nd.A00(r2)
            java.lang.Class<X.INk> r0 = X.C57070INk.class
            r1.A01(r10, r0)
        L_0x00b0:
            X.0sP r0 = r3.A02
            java.lang.Object r1 = r0.invoke(r11)
            java.lang.String r1 = (java.lang.String) r1
            X.5F0 r15 = X.AnonymousClass5F0.A00
            android.view.ViewGroup r14 = r5.A0J
            android.content.Context r10 = r14.getContext()
            X.0qQ.A07(r10)
            java.lang.String r0 = r12.getModuleName()
            int r10 = r15.A01(r10, r2, r8, r0)
            android.view.ViewGroup$LayoutParams r0 = r14.getLayoutParams()
            r0.height = r10
            r14.setVisibility(r9)
            X.3yu r0 = r7.A02
            r30 = r0
            r16 = 0
            if (r1 == 0) goto L_0x00de
            r16 = 1
        L_0x00de:
            boolean r0 = r4.A1u
            if (r0 != 0) goto L_0x0102
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r10 = r5.A0P
            r10.setVisibility(r9)
            X.3z2 r15 = r5.A0S
            java.lang.String r0 = r6.A06
            if (r0 == 0) goto L_0x0263
            boolean r0 = X.1sx.A0G(r2, r0)
            if (r0 == 0) goto L_0x0263
            r0 = 2131099701(0x7f060035, float:1.7811763E38)
        L_0x00f6:
            int r0 = r11.getColor(r0)
        L_0x00fa:
            r10.setNormalColor(r0)
            int r0 = r15.A02
            r10.setActiveColor(r0)
        L_0x0102:
            android.widget.TextView r10 = r5.A0M
            if (r1 == 0) goto L_0x025f
            r10.setText(r1)
            r0 = 0
        L_0x010a:
            r10.setVisibility(r0)
            X.0sa r0 = r3.A01
            java.lang.Object r0 = r0.invoke()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x018e
            com.instagram.user.model.UpcomingEvent r26 = r8.A27(r2)
            if (r26 == 0) goto L_0x018e
            r0 = 33
            X.Ini r1 = new X.Ini
            r1.<init>(r2, r0)
            java.lang.Class<X.5F2> r0 = X.AnonymousClass5F2.class
            java.lang.Object r10 = r2.A01(r0, r1)
            X.5F2 r10 = (X.AnonymousClass5F2) r10
            com.instagram.common.ui.base.IgTextView r0 = r5.A06
            r22 = r0
            r10.A00(r4)
            android.content.Context r15 = r22.getContext()
            X.0qQ.A07(r15)
            X.0nE r1 = X.C61410nE.A00
            X.Hq9 r19 = new X.Hq9
            r0 = r19
            r0.<init>(r15, r1)
            long r16 = X.C18810W3l.A01(r26)
            java.util.Date r15 = new java.util.Date
            r0 = r16
            r15.<init>(r0)
            long r28 = r15.getTime()
            java.util.Date r0 = new java.util.Date
            r0.<init>()
            long r0 = r0.getTime()
            long r28 = r28 - r0
            X.5F4 r0 = r10.A03
            r17 = 0
            long r0 = r0.A01
            int r16 = (r28 > r0 ? 1 : (r28 == r0 ? 0 : -1))
            if (r16 > 0) goto L_0x024e
            int r0 = (r17 > r28 ? 1 : (r17 == r28 ? 0 : -1))
            if (r0 > 0) goto L_0x024e
            X.Gd0 r0 = new X.Gd0
            r24 = r4
            r25 = r19
            r27 = r15
            r21 = r0
            r23 = r10
            r21.<init>(r22, r23, r24, r25, r26, r27, r28)
            java.util.HashMap r10 = r10.A02
            int r1 = r4.hashCode()
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r10.put(r1, r0)
            r0.start()
        L_0x018e:
            X.5Ew r1 = r6.A01
            X.0sL r0 = r3.A07
            java.lang.Object r12 = r0.invoke(r11, r12)
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12
            X.0sa r0 = r3.A00
            java.lang.Object r10 = r0.invoke()
            java.util.List r10 = (java.util.List) r10
            boolean r11 = r6.A0A
            if (r11 != 0) goto L_0x01ac
            boolean r0 = r5.A01(r8, r4)
            r27 = 0
            if (r0 == 0) goto L_0x01ae
        L_0x01ac:
            r27 = 1
        L_0x01ae:
            boolean r0 = r6.A0B
            r21 = r5
            r22 = r1
            r23 = r4
            r24 = r13
            r25 = r12
            r26 = r10
            r28 = r0
            r21.A00(r22, r23, r24, r25, r26, r27, r28)
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x01cc
            X.3z0 r1 = r5.A0X
            X.3g4 r0 = r6.A03
            X.C271284ib.A00(r0, r1, r4)
        L_0x01cc:
            boolean r10 = r4.A29
            if (r11 != 0) goto L_0x01d7
            boolean r1 = r5.A01(r8, r4)
            r0 = 0
            if (r1 == 0) goto L_0x01d8
        L_0x01d7:
            r0 = 1
        L_0x01d8:
            X.AnonymousClass5F6.A01(r5, r10, r9, r0)
            if (r13 == 0) goto L_0x0249
            X.5Ev r0 = r5.A08
            if (r0 == 0) goto L_0x0249
            X.5Ew r0 = r0.A01
            if (r0 == 0) goto L_0x0249
            com.instagram.common.ui.base.IgSimpleImageView r0 = r5.A04
            X.3aa r1 = X.C244063aa.CTA
            X.C244083ac.A05(r0, r1)
            android.widget.TextView r0 = r5.A0L
        L_0x01ee:
            X.C244083ac.A05(r0, r1)
            r0 = 17
            X.9MC r1 = new X.9MC
            r1.<init>(r0, r7, r5, r4)
            X.0sP r0 = r3.A04
            r0.invoke(r1)
            r0 = 36314871905651563(0x81042f00000b6b, double:3.029009449161561E-306)
            r8 = r20
            boolean r0 = X.182.A06(r8, r2, r0)
            if (r0 == 0) goto L_0x0213
            X.3Dp r1 = X.C238833Dp.A00(r2)
            X.3Ds r0 = X.C238863Ds.GENERIC_CALL_TO_ACTION_BUTTON
            r1.A05(r14, r0)
        L_0x0213:
            X.5F7 r0 = new X.5F7
            r8 = r0
            r9 = r2
            r10 = r6
            r11 = r5
            r12 = r7
            r13 = r4
            r8.<init>(r9, r10, r11, r12, r13)
            r14.setOnTouchListener(r0)
            X.0sL r1 = r3.A08
            r0 = r30
            r1.invoke(r0, r5)
        L_0x0228:
            boolean r0 = r5.A0B
            if (r0 != 0) goto L_0x023f
            boolean r0 = r5.A0A
            if (r0 == 0) goto L_0x023f
            boolean r0 = r5.A0C
            if (r0 == 0) goto L_0x023f
            com.instagram.common.session.UserSession r0 = r7.A01
            X.5ji r2 = X.C292885jg.A00(r0)
            long r0 = r5.A00
            r2.A02(r4, r0)
        L_0x023f:
            X.5FA r2 = X.AnonymousClass5F9.A00()
            long r0 = r5.A00
            r2.A01(r4, r0)
            return
        L_0x0249:
            android.widget.TextView r0 = r5.A01
            X.3aa r1 = X.C244063aa.CTA
            goto L_0x01ee
        L_0x024e:
            java.lang.Integer r1 = X.C18810W3l.A03(r26)
            r0 = r19
            java.lang.String r1 = r0.A00(r1, r15)
            r0 = r22
            r0.setText(r1)
            goto L_0x018e
        L_0x025f:
            r0 = 8
            goto L_0x010a
        L_0x0263:
            if (r16 == 0) goto L_0x026a
            r0 = 2131099734(0x7f060056, float:1.781183E38)
            goto L_0x00f6
        L_0x026a:
            int r0 = r15.A03
            goto L_0x00fa
        L_0x026e:
            android.view.ViewGroup r1 = r5.A0J
            r0 = 8
            r1.setVisibility(r0)
            goto L_0x0228
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C258383yv.A02(X.5Ev, X.3rt, X.3W1):void");
    }
}
