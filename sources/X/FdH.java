package X;

import android.view.View;
import androidx.fragment.app.Fragment;

public final class FdH implements MVB {
    public final int A00;
    public final Object A01;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public FdH(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(C310336ap r1, Object obj, int i) {
        r1.A0A = new FdH(obj, i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b3, code lost:
        if (r0 != null) goto L_0x00b5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b5, code lost:
        r1.A0C(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b8, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e9, code lost:
        r7.A04();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ec, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ed, code lost:
        r0 = "activity";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00ef, code lost:
        X.0qQ.A0F(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f6, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onButtonClick(android.view.View r9) {
        /*
            r8 = this;
            int r0 = r8.A00
            switch(r0) {
                case 0: goto L_0x00f7;
                case 1: goto L_0x000c;
                case 2: goto L_0x0099;
                case 3: goto L_0x0005;
                case 4: goto L_0x0091;
                case 5: goto L_0x006b;
                case 6: goto L_0x0005;
                case 7: goto L_0x004f;
                case 8: goto L_0x0005;
                case 9: goto L_0x0005;
                case 10: goto L_0x000c;
                case 11: goto L_0x000c;
                case 12: goto L_0x00bc;
                case 13: goto L_0x0027;
                case 14: goto L_0x000d;
                default: goto L_0x0005;
            }
        L_0x0005:
            java.lang.Object r0 = r8.A01
            X.G5q r0 = (X.C51878G5q) r0
            r0.Dfh()
        L_0x000c:
            return
        L_0x000d:
            java.lang.Object r2 = r8.A01
            X.FnN r2 = (X.C51031FnN) r2
            androidx.fragment.app.Fragment r0 = r2.A02
            androidx.fragment.app.FragmentActivity r1 = r0.requireActivity()
            com.instagram.common.session.UserSession r0 = r2.A04
            X.6Yo r7 = X.DbU.A0Q(r1, r0)
            X.ESI r0 = new X.ESI
            r0.<init>()
            r7.A0D(r0)
            goto L_0x00e9
        L_0x0027:
            java.util.HashMap r1 = X.AnonymousClass7TE.A1E()
            java.lang.String r0 = "com.instagram.portable_settings.story_replies"
            X.DiU r4 = X.C46649DiU.A04(r0, r1)
            java.lang.Object r0 = r8.A01
            X.FnN r0 = (X.C51031FnN) r0
            androidx.fragment.app.Fragment r1 = r0.A02
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            com.instagram.common.session.UserSession r0 = r0.A04
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r0)
            android.content.Context r1 = r1.requireContext()
            r0 = 2131971630(0x7f134e2e, float:1.9580245E38)
            X.DbS.A18(r1, r2, r0)
            r4.A0D(r3, r2)
            return
        L_0x004f:
            java.lang.Object r0 = r8.A01
            X.H4f r0 = (X.C54236H4f) r0
            java.lang.Object r4 = r0.A01
            X.0iw r4 = (X.AnonymousClass0iw) r4
            java.lang.Object r3 = r0.A02
            android.content.Context r3 = (android.content.Context) r3
            java.lang.Object r2 = r0.A05
            com.instagram.common.session.UserSession r2 = (com.instagram.common.session.UserSession) r2
            java.lang.Object r1 = r0.A03
            java.util.List r1 = (java.util.List) r1
            java.lang.Object r0 = r0.A04
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            X.C56669I6y.A07(r3, r4, r2, r0, r1)
            return
        L_0x006b:
            java.lang.Object r5 = r8.A01
            X.Fjy r5 = (X.C50880Fjy) r5
            androidx.fragment.app.FragmentActivity r4 = r5.A01
            com.instagram.common.session.UserSession r3 = r5.A03
            if (r4 != 0) goto L_0x007e
            java.lang.Integer r2 = X.AnonymousClass05K.A15
            r1 = 0
            java.lang.String r0 = "method: RequestEnableDirectOnlyNotificationsHandler Unable to lookup the attached fragment activity for navigation to notification settings"
            X.C46436Dey.A00(r3, r2, r0, r1)
            return
        L_0x007e:
            java.lang.Class<com.instagram.modal.ModalActivity> r2 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r1 = X.AnonymousClass7TE.A0a()
            r0 = 955(0x3bb, float:1.338E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
            X.6W8 r1 = X.DbW.A0W(r4, r1, r3, r2, r0)
            android.content.Context r0 = r5.A00
            goto L_0x00b5
        L_0x0091:
            java.lang.Object r0 = r8.A01
            X.Fk1 r0 = (X.C50883Fk1) r0
            X.C50883Fk1.A00(r0)
            return
        L_0x0099:
            java.lang.Object r5 = r8.A01
            X.E3B r5 = (X.E3B) r5
            com.instagram.common.session.UserSession r4 = r5.A07
            if (r4 == 0) goto L_0x00b9
            java.lang.Class<com.instagram.modal.ModalActivity> r3 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r2 = X.AnonymousClass7TE.A0a()
            android.app.Activity r1 = r5.A00
            if (r1 == 0) goto L_0x00ed
            java.lang.String r0 = "direct_greeting_setting_fragment"
            X.6W8 r1 = X.DbS.A0b(r1, r2, r4, r3, r0)
            android.app.Activity r0 = r5.A00
            if (r0 == 0) goto L_0x00ed
        L_0x00b5:
            r1.A0C(r0)
            return
        L_0x00b9:
            java.lang.String r0 = "userSession"
            goto L_0x00ef
        L_0x00bc:
            java.lang.Object r6 = r8.A01
            X.E2v r6 = (X.C47449E2v) r6
            X.0eM r5 = r6.A09
            com.instagram.common.session.UserSession r2 = X.AnonymousClass7TE.A0l(r5)
            java.lang.String r1 = "igwb"
            java.lang.String r0 = "show_confirmation_toast_button_tapped"
            r4 = 0
            X.FCT.A01(r6, r2, r1, r0, r4)
            X.6Yo r7 = X.DbZ.A0P(r6, r5)
            X.1ZQ r0 = X.C48883Elj.A00()
            X.1ZR r3 = r0.A00
            androidx.fragment.app.FragmentActivity r2 = r6.A00
            if (r2 == 0) goto L_0x00ed
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r5)
            java.lang.Integer r0 = X.AnonymousClass05K.A15
            androidx.fragment.app.Fragment r0 = r3.A00(r2, r1, r0)
            r7.A0B(r4, r0)
        L_0x00e9:
            r7.A04()
            return
        L_0x00ed:
            java.lang.String r0 = "activity"
        L_0x00ef:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00f7:
            java.lang.Object r4 = r8.A01
            X.E3p r4 = (X.C47467E3p) r4
            X.0eM r0 = r4.A0L
            X.0lg r0 = X.DbT.A0X(r0)
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "coin_flip_toast_action"
            X.0Aj r3 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r3.isSampled()
            if (r0 == 0) goto L_0x0124
            java.lang.String r1 = "action"
            java.lang.String r0 = "View"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r1, r0)
            java.lang.String r1 = "surface"
            java.lang.String r0 = "ig_external_profile"
            java.util.LinkedHashMap r0 = X.DbY.A0p(r1, r0, r2)
            X.DbV.A1L(r3, r0)
        L_0x0124:
            android.content.Intent r2 = r4.A0H
            r0 = 3996(0xf9c, float:5.6E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 1
            r2.putExtra(r1, r0)
            X.C47467E3p.A01(r4)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FdH.onButtonClick(android.view.View):void");
    }

    public final void onDismiss() {
        switch (this.A00) {
            case 1:
                DbX.A1I((Fragment) this.A01);
                return;
            case 10:
                G8B g8b = (G8B) this.A01;
                if (g8b != null) {
                    g8b.Doy();
                    return;
                }
                return;
            case 11:
                ((0r1) this.A01).A00 = true;
                return;
            default:
                return;
        }
    }

    public final void onShow() {
    }
}
