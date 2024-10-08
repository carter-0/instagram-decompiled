package X;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class EDH extends 1P0 {
    public final Fragment A00;
    public final AnonymousClass57Y A01;
    public final UserSession A02;
    public final User A03;
    public final 0hq A04;
    public final 0sP A05;

    /* JADX WARNING: type inference failed for: r8v3, types: [X.ELT, X.FBc] */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00af, code lost:
        if (X.182.A06(r7, r9, 36312952055268913L) == false) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b5, code lost:
        if (r8.A01(r10) != false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b7, code lost:
        X.AnonymousClass36O.A0G = true;
        r11 = r6.requireActivity();
        r10 = "9";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x01e7, code lost:
        if (r8.A1n() != true) goto L_0x01e9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x01ef, code lost:
        if (r8 != null) goto L_0x006d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onSuccess(java.lang.Object r17) {
        /*
            r16 = this;
            r7 = r17
            r0 = -47451057(0xfffffffffd2bf44f, float:-1.4285407E37)
            int r14 = X.AnonymousClass0fD.A03(r0)
            X.Duv r7 = (X.C47328Duv) r7
            r0 = -2005810350(0xffffffff8871c352, float:-7.2752897E-34)
            int r12 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r7, r5)
            r3 = r16
            com.instagram.common.session.UserSession r4 = r3.A02
            X.F3s r2 = X.C49061Eof.A00(r4)
            X.EWT r1 = X.EWT.EDIT_PROFILE_PIC_FLOW
            java.lang.Integer r0 = X.AnonymousClass05K.A03
            r2.A01(r1, r0)
            X.6ve r1 = X.C322316vd.A00(r4)
            java.lang.String r0 = "profile_picture_change_successful"
            r1.A05(r0)
            X.6ve r1 = X.C322316vd.A00(r4)
            java.lang.String r0 = "edit_profile_picture"
            r1.A04(r0)
            androidx.fragment.app.Fragment r6 = r3.A00
            boolean r0 = r6.isResumed()
            if (r0 == 0) goto L_0x01f3
            boolean r0 = X.AnonymousClass36O.A0G
            com.instagram.user.model.User r8 = r7.A00
            X.57Y r3 = r3.A01
            if (r8 == 0) goto L_0x004a
            r8.A0d(r4)
        L_0x004a:
            boolean r0 = r6.isAdded()
            r2 = 1
            if (r0 == 0) goto L_0x0131
            if (r8 == 0) goto L_0x01d6
            X.0qQ.A0B(r4, r5)
            r0 = 28
            X.Phb r1 = new X.Phb
            r1.<init>(r4, r0)
            java.lang.Class<X.6qX> r0 = X.C319406qX.class
            java.lang.Object r0 = r4.A01(r0, r1)
            X.6qX r0 = (X.C319406qX) r0
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x01d6
            X.AnonymousClass36O.A0F = r2
        L_0x006d:
            boolean r0 = r8.A1n()
            if (r0 != 0) goto L_0x01c4
            X.FYr r8 = X.C48927EmR.A00(r4)
            X.FYr r0 = X.C48927EmR.A00(r4)
            com.instagram.common.session.UserSession r7 = r0.A01
            X.0Tu r11 = X.0Tu.A06
            r0 = 36312960645334583(0x81027200020637, double:3.027800760441075E-306)
            boolean r10 = X.182.A06(r11, r7, r0)
            com.instagram.common.session.UserSession r9 = r8.A01
            X.0Tu r7 = X.0Tu.A05
            r0 = 2342155969858897461(0x2081027200000635, double:4.059617104501668E-152)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 == 0) goto L_0x00b1
            X.7yS r0 = r8.A00
            boolean r0 = r0.A03
            if (r0 == 0) goto L_0x00b1
            boolean r0 = X.C50335FYr.A00(r8, r5)
            if (r0 != 0) goto L_0x00b1
            if (r10 != 0) goto L_0x00a6
            r7 = r11
        L_0x00a6:
            r0 = 36312952055268913(0x81027000000631, double:3.027795328048956E-306)
            boolean r0 = X.182.A06(r7, r9, r0)
            if (r0 != 0) goto L_0x00b7
        L_0x00b1:
            boolean r0 = r8.A01(r10)
            if (r0 == 0) goto L_0x01c4
        L_0x00b7:
            X.AnonymousClass36O.A0G = r2
            androidx.fragment.app.FragmentActivity r11 = r6.requireActivity()
            java.lang.String r10 = "9"
        L_0x00bf:
            X.0qQ.A0B(r4, r2)
            X.FYr r1 = X.C48927EmR.A00(r4)
            X.02m r9 = X.02m.A0p
            if (r9 == 0) goto L_0x00d0
            r0 = 857807376(0x33211a10, float:3.7509437E-8)
            r9.markerStart(r0)
        L_0x00d0:
            com.instagram.common.session.UserSession r8 = r1.A01
            X.0Tu r13 = X.0Tu.A06
            r7 = r13
            r0 = 2342155969859159609(0x2081027200040639, double:4.059617104723947E-152)
            boolean r0 = X.182.A06(r13, r8, r0)
            if (r0 == 0) goto L_0x00e2
            X.0Tu r13 = X.0Tu.A05
        L_0x00e2:
            r0 = 36312960645400120(0x81027200030638, double:3.027800760482521E-306)
            boolean r0 = X.182.A06(r13, r8, r0)
            java.lang.String r13 = "9"
            if (r0 == 0) goto L_0x0176
            X.1ZD r0 = X.AnonymousClass1ZD.A02
            if (r0 == 0) goto L_0x01fe
            X.ELT r8 = new X.ELT
            r8.<init>((android.app.Activity) r11, (X.0lg) r4)
            r8.A00 = r5
            r0.A00 = r8
            r0 = 2
            r8.A00 = r0
            X.0qQ.A0A(r9)
            r1 = 857803746(0x33210be2, float:3.749654E-8)
            r9.markerStart(r1)
            java.lang.String r0 = "flow"
            r9.markerAnnotate(r1, r0, r13)
            r8.A04(r10)
        L_0x0110:
            boolean r0 = r10.equals(r13)
            if (r0 == 0) goto L_0x0167
            r0 = 36314450998856242(0x8103cd00000a32, double:3.028743266009344E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 != 0) goto L_0x015a
            r0 = 36314450999052853(0x8103cd00030a35, double:3.028743266133682E-306)
            boolean r0 = X.182.A06(r7, r4, r0)
            if (r0 == 0) goto L_0x015a
            java.lang.String r0 = "IG_PROFILE_PHOTO_CHANGE_UPSELL"
        L_0x012e:
            X.C48925EmP.A00(r4, r0)
        L_0x0131:
            X.JbO r1 = X.JZM.A00(r4)
            X.28t r0 = X.28t.A05
            r1.A09(r0, r2)
            X.02m r2 = X.02m.A0p
            r1 = 18297178(0x117315a, float:2.7769728E-38)
            r0 = 2
            r2.markerEnd(r1, r0)
            android.os.Handler r1 = X.AnonymousClass36O.A0H
            X.Ftt r0 = new X.Ftt
            r0.<init>(r6, r3, r4)
            r1.post(r0)
        L_0x014d:
            r0 = -147287802(0xfffffffff7389106, float:-3.7434533E33)
            X.AnonymousClass0fD.A0A(r0, r12)
            r0 = -432608067(0xffffffffe636ecbd, float:-2.1595944E23)
            X.AnonymousClass0fD.A0A(r0, r14)
            return
        L_0x015a:
            X.0xY r1 = X.AnonymousClass7TF.A0N(r4)
            java.lang.String r0 = "fx_cal_profile_pic_is_upsell_seen"
            r1.E5T(r0, r2)
            r1.apply()
            goto L_0x0131
        L_0x0167:
            java.lang.String r0 = "21"
            boolean r0 = r10.equals(r0)
            if (r0 == 0) goto L_0x0131
            r0 = 2306(0x902, float:3.231E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            goto L_0x012e
        L_0x0176:
            r0 = 2342155969859225146(0x208102720005063a, double:4.059617104779517E-152)
            boolean r0 = X.182.A06(r7, r8, r0)
            if (r0 == 0) goto L_0x018f
            X.0qQ.A0A(r9)
            r1 = 857807444(0x33211a54, float:3.750968E-8)
            r9.markerStart(r1)
            java.lang.String r0 = "flow"
            r9.markerAnnotate(r1, r0, r13)
        L_0x018f:
            java.lang.Class<com.instagram.modal.ModalActivity> r8 = com.instagram.modal.ModalActivity.class
            java.lang.String r9 = "com.bloks.www.fxim.sync.start"
            X.FYr r0 = X.C48927EmR.A00(r4)
            boolean r0 = r0.A01(r5)
            r15 = 9
            if (r0 == 0) goto L_0x01a1
            r15 = 10
        L_0x01a1:
            java.lang.String r1 = "{server_params: {\"opt_in_flow_type\":"
            java.lang.String r0 = ", \"requested_screen_component_type\":1}}"
            java.lang.String r1 = X.002.A0c(r1, r0, r15)
            java.lang.String r0 = "params"
            java.util.HashMap r0 = X.DbY.A0m(r0, r1)
            X.DiU r1 = X.C46649DiU.A04(r9, r0)
            com.instagram.bloks.hosting.IgBloksScreenConfig r0 = X.DbS.A0N(r4)
            r0.A0k = r5
            android.os.Bundle r1 = X.C49891FBs.A00(r0, r1)
            java.lang.String r0 = "bloks"
            X.DbU.A0w(r11, r1, r4, r8, r0)
            goto L_0x0110
        L_0x01c4:
            X.FYg r0 = X.C48926EmQ.A00(r4)
            boolean r0 = r0.A00()
            if (r0 == 0) goto L_0x0131
            androidx.fragment.app.FragmentActivity r11 = r6.requireActivity()
            java.lang.String r10 = "21"
            goto L_0x00bf
        L_0x01d6:
            androidx.fragment.app.FragmentActivity r0 = r6.requireActivity()
            android.content.Context r7 = r0.getApplicationContext()
            if (r8 == 0) goto L_0x01e9
            boolean r1 = r8.A1n()
            r0 = 2131970056(0x7f134808, float:1.9577052E38)
            if (r1 == r2) goto L_0x01ec
        L_0x01e9:
            r0 = 2131970053(0x7f134805, float:1.9577046E38)
        L_0x01ec:
            X.C59689JTv.A07(r7, r0)
            if (r8 == 0) goto L_0x0131
            goto L_0x006d
        L_0x01f3:
            X.02m r2 = X.02m.A0p
            r1 = 18297178(0x117315a, float:2.7769728E-38)
            r0 = 4
            r2.markerEnd(r1, r0)
            goto L_0x014d
        L_0x01fe:
            X.DbS.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDH.onSuccess(java.lang.Object):void");
    }

    public EDH(Fragment fragment, 0hq r2, AnonymousClass57Y r3, UserSession userSession, User user, 0sP r6) {
        this.A02 = userSession;
        this.A03 = user;
        this.A00 = fragment;
        this.A04 = r2;
        this.A01 = r3;
        this.A05 = r6;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008d, code lost:
        if (r6 == null) goto L_0x008f;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x005a  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onFail(X.C268654dm r12) {
        /*
            r11 = this;
            r0 = 1108465884(0x4211d8dc, float:36.461777)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r12, r5)
            androidx.fragment.app.Fragment r1 = r11.A00
            boolean r0 = r1.isResumed()
            r2 = 18297178(0x117315a, float:2.7769728E-38)
            if (r0 == 0) goto L_0x00ac
            android.content.Context r4 = r1.requireContext()
            java.lang.Object r10 = r12.A00()
            X.1XP r10 = (X.1XP) r10
            if (r10 == 0) goto L_0x008f
            java.util.List r1 = r10.mErrorStrings
            if (r1 == 0) goto L_0x0089
            boolean r0 = r1.isEmpty()
            if (r0 != 0) goto L_0x0089
            java.lang.Object r6 = r1.get(r5)
            X.0qQ.A07(r6)
            java.lang.String r6 = (java.lang.String) r6
            X.8ab r0 = X.C49952FGh.A00(r4)
            r0.A0q(r6)
            X.DbT.A1V(r0)
            com.instagram.common.session.UserSession r7 = r11.A02
            X.F3s r4 = X.C49061Eof.A00(r7)
            X.EWT r1 = X.EWT.EDIT_PROFILE_PIC_FLOW
            java.lang.String r0 = r10.toString()
            r4.A04(r1, r0)
        L_0x004e:
            X.6ve r5 = X.C322316vd.A00(r7)
            long r0 = r5.A01
            r8 = 0
            int r4 = (r0 > r8 ? 1 : (r0 == r8 ? 0 : -1))
            if (r4 == 0) goto L_0x0069
            X.C322326ve.A01(r10, r5, r0)
            r0 = 1
            r5.A05 = r0
            com.facebook.quicklog.reliability.UserFlowLoggerImpl r1 = r5.A0A
            long r4 = r5.A01
            java.lang.String r0 = "profile_picture_change_error"
            r1.flowMarkPoint(r4, r0)
        L_0x0069:
            X.6ve r1 = X.C322316vd.A00(r7)
            java.lang.String r0 = "edit_profile_picture"
            r1.A04(r0)
            android.os.Handler r1 = X.AnonymousClass36O.A0H
            X.FsN r0 = new X.FsN
            r0.<init>(r11, r6)
            r1.post(r0)
            X.02m r1 = X.02m.A0p
            r0 = 3
        L_0x007f:
            r1.markerEnd(r2, r0)
            r0 = 677653660(0x28642c9c, float:1.2666216E-14)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x0089:
            java.lang.String r6 = r10.getErrorMessage()
            if (r6 != 0) goto L_0x0096
        L_0x008f:
            r0 = 2131956761(0x7f131419, float:1.9550087E38)
            java.lang.String r6 = X.AnonymousClass7TE.A16(r4, r0)
        L_0x0096:
            X.8ab r0 = X.C49952FGh.A00(r4)
            r0.A0q(r6)
            X.DbT.A1V(r0)
            com.instagram.common.session.UserSession r7 = r11.A02
            X.F3s r1 = X.C49061Eof.A00(r7)
            X.EWT r0 = X.EWT.EDIT_PROFILE_PIC_FLOW
            r1.A04(r0, r6)
            goto L_0x004e
        L_0x00ac:
            X.02m r1 = X.02m.A0p
            r0 = 4
            goto L_0x007f
        */
        throw new UnsupportedOperationException("Method not decompiled: X.EDH.onFail(X.4dm):void");
    }

    public final void onFinish() {
        int A032 = AnonymousClass0fD.A03(1642530851);
        0sP r1 = this.A05;
        if (r1 != null) {
            r1.invoke(AnonymousClass7TE.A0u());
        }
        if (AnonymousClass36O.A09) {
            AnonymousClass36Q.A01(this.A00, this.A04);
        }
        AnonymousClass0fD.A0A(-1844983327, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(640364563);
        if (AnonymousClass36O.A09) {
            AnonymousClass36Q.A02(this.A00, this.A04);
        }
        AnonymousClass0fD.A0A(19953916, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccessInBackground(Object obj) {
        Icon icon;
        int A032 = AnonymousClass0fD.A03(-1418940736);
        int A033 = AnonymousClass0fD.A03(1402074663);
        boolean z = AnonymousClass36O.A0G;
        User user = this.A03;
        Bitmap A0H = 1NK.A00().A0H(user.Bh3(), (String) null);
        String id = user.getId();
        if (A0H != null) {
            icon = Icon.createWithAdaptiveBitmap(A0H);
        } else {
            icon = null;
        }
        AnonymousClass90S.A01(icon, id, (String) null);
        AnonymousClass0fD.A0A(-2033945477, A033);
        AnonymousClass0fD.A0A(337487938, A032);
    }
}
