package X;

import com.instagram.common.session.UserSession;

/* renamed from: X.P8r  reason: case insensitive filesystem */
public final class C72508P8r implements C332957Xc {
    public final AnonymousClass4DH A00;
    public final AnonymousClass7SM A01;
    public final 0wc A02;
    public final UserSession A03;
    public final C332467Vd A04;
    public final C332817Wm A05;
    public final AnonymousClass7Y8 A06;
    public final C333057Xm A07;
    public final C254923tH A08;
    public final AnonymousClass4DU A09;
    public final C62320sa A0A;
    public final C62320sa A0B;

    /* JADX WARNING: Code restructure failed: missing block: B:133:0x03a3, code lost:
        if (r1.contains(r2) == false) goto L_0x03a5;
     */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x02d1  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CtO(java.lang.String r34) {
        /*
            r33 = this;
            r3 = r34
            r11 = 0
            r5 = r33
            X.0sa r4 = r5.A0A
            android.net.Uri r2 = X.DbT.A09(r3)
            java.lang.String r1 = r2.getHost()
            java.lang.String r0 = "blend"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0040
            java.lang.String r1 = r2.getScheme()
            java.lang.String r0 = "instagram"
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0040
            android.net.Uri$Builder r2 = r2.buildUpon()
            X.7Zg r0 = X.C66580MXl.A0W(r4)
            X.7S7 r0 = r0.C6l()
            java.lang.String r1 = r0.C6C()
            java.lang.String r0 = "id"
            android.net.Uri r0 = X.DbV.A08(r2, r0, r1)
            java.lang.String r3 = r0.toString()
            X.0qQ.A0A(r3)
        L_0x0040:
            X.4DH r7 = r5.A00
            android.content.Context r2 = r7.requireContext()
            X.4DU r9 = r5.A09
            java.lang.String r1 = r9.getModuleName()
            com.instagram.common.session.UserSession r0 = r5.A03
            boolean r1 = X.FGU.A03(r2, r0, r3, r1)
            if (r1 != 0) goto L_0x0090
            if (r3 == 0) goto L_0x05a5
            X.14E r1 = X.14D.A04
            X.14D r2 = r1.A00()
            X.7Zg r1 = X.C66580MXl.A0W(r4)
            X.7S7 r16 = r1.C6l()
            if (r2 == 0) goto L_0x0091
            X.34S r1 = r2.A00(r0, r3)
            if (r1 == 0) goto L_0x0091
            X.7Wm r1 = r5.A05
            r1.CHv(r3)
        L_0x0071:
            java.lang.String r2 = r16.C6C()
            if (r2 == 0) goto L_0x0090
            X.0kM r1 = new X.0kM
            r1.<init>(r0)
            java.lang.String r0 = "direct_inbox"
            X.0wc r1 = X.C66580MXl.A0N(r1, r0)
            java.lang.String r0 = "direct_thread_action"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            X.C66580MXl.A1J(r1, r2)
            java.lang.String r0 = "action_log_clicked"
            X.DbV.A1G(r1, r0)
        L_0x0090:
            return
        L_0x0091:
            r6 = 0
            android.net.Uri r8 = X.DbT.A09(r3)
            java.lang.String r1 = r8.getScheme()
            java.lang.String r10 = "instagram"
            r12 = 1
            boolean r1 = r10.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00d0
            java.lang.String r2 = r8.getHost()
            java.lang.String r1 = "thread"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x00d0
            java.util.List r8 = r8.getPathSegments()
            boolean r1 = r8.isEmpty()
            if (r1 != 0) goto L_0x00d0
            java.lang.Object r2 = r8.get(r12)
            java.lang.String r1 = "details"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x00d0
            r1 = 2
            java.lang.Object r2 = r8.get(r1)
            java.lang.String r1 = "change_theme"
            boolean r6 = X.C51971G9r.A1Z(r2, r1, r6)
        L_0x00d0:
            java.lang.String r17 = "Required value was null."
            if (r6 == 0) goto L_0x0134
            boolean r1 = r16.CYS()
            if (r1 != 0) goto L_0x0090
            boolean r1 = r16.CdK()
            if (r1 != 0) goto L_0x0090
            X.9HW r3 = X.AnonymousClass9HV.A00(r0)
            X.3t3 r2 = r16.CBU()
            r1 = 14
            boolean r1 = r3.A00(r2, r1)
            if (r1 == 0) goto L_0x0090
            X.0wc r7 = r5.A02
            X.7Zg r1 = X.C66580MXl.A0W(r4)
            java.lang.String r6 = X.AnonymousClass747.A00(r1)
            if (r6 == 0) goto L_0x059b
            X.3tH r1 = r5.A08
            boolean r3 = r1.A00()
            java.lang.String r1 = "direct_thread_click_theme_admin_message"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r7, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0117
            X.C66580MXl.A1J(r2, r6)
            X.C66581MXm.A1H(r2, r3)
            r2.Cgf()
        L_0x0117:
            X.7Zg r1 = X.C66580MXl.A0W(r4)
            java.lang.String r3 = X.AnonymousClass747.A00(r1)
            if (r3 == 0) goto L_0x0596
            X.3t2 r1 = r16.C6c()
            X.0qQ.A07(r1)
            java.lang.String r2 = "admin_message"
            X.OX5.A02(r7, r1, r3, r2)
            X.7Wm r1 = r5.A05
            r1.AGh(r2)
            goto L_0x0071
        L_0x0134:
            java.lang.Integer r1 = X.C69885Ntn.A00(r3)
            r6 = 1
            if (r1 == 0) goto L_0x01cf
            X.7SD r1 = X.C66580MXl.A0Z(r16)
            boolean r1 = X.C308556Us.A07(r0, r1)
            if (r1 == 0) goto L_0x01cf
            X.3t3 r7 = r16.CBU()
            if (r7 == 0) goto L_0x0071
            java.lang.Integer r3 = X.C69885Ntn.A00(r3)
            if (r3 == 0) goto L_0x05a0
            X.7SD r1 = r16.C6Q()
            X.4li r1 = r1.A0N
            java.lang.Integer r2 = r1.A00
            X.7SD r1 = r16.C6Q()
            X.4li r1 = r1.A0N
            java.lang.Integer r5 = r1.A01
            X.7SD r1 = r16.C6Q()
            X.3t3 r1 = r1.A0P
            if (r1 == 0) goto L_0x01b6
            boolean r1 = r1 instanceof X.C254763t0
            if (r1 != r12) goto L_0x01b6
        L_0x016d:
            X.7SD r1 = r16.C6Q()
            X.7Kc r6 = X.C329737Ka.A01(r0, r1, r6)
            X.7SD r1 = X.C66580MXl.A0Z(r16)
            boolean r10 = r6.COV(r0, r1)
            int r1 = r3.intValue()
            int r1 = 1 - r1
            if (r1 == 0) goto L_0x01b8
            r9 = 1
            if (r2 == 0) goto L_0x01b9
            if (r10 == 0) goto L_0x018c
            if (r5 == 0) goto L_0x01b9
        L_0x018c:
            X.Och r3 = X.C71103Och.A00
            X.7SD r1 = r16.C6Q()
            X.3Tu r1 = r1.A0H
            int r2 = r2.intValue()
            boolean r1 = r3.A03(r0, r1, r5, r2)
            if (r1 == 0) goto L_0x01b9
            boolean r1 = r6.Ce2(r0)
            if (r1 == 0) goto L_0x01b9
            X.7Zg r1 = X.C66580MXl.A0W(r4)
            X.7ZA r8 = r1.C62()
            r12 = 2
            r9 = r0
            r10 = r7
            r11 = r5
            r13 = r2
            r8.FHI(r9, r10, r11, r12, r13)
            goto L_0x0071
        L_0x01b6:
            r6 = 0
            goto L_0x016d
        L_0x01b8:
            r9 = 0
        L_0x01b9:
            X.7Zg r1 = X.C66580MXl.A0W(r4)
            X.7ZA r4 = r1.C62()
            r8 = 2
            X.7SD r1 = r16.C6Q()
            X.3Tu r1 = r1.A0H
            r5 = r0
            r6 = r1
            r4.FHH(r5, r6, r7, r8, r9, r10)
            goto L_0x0071
        L_0x01cf:
            androidx.fragment.app.FragmentActivity r8 = r7.requireActivity()
            r4 = 0
            java.lang.Integer[] r15 = X.AnonymousClass05K.A00(r12)
            int r14 = r15.length
            r13 = 0
        L_0x01da:
            if (r13 >= r14) goto L_0x0264
            r12 = r15[r13]
            java.lang.String r2 = "instagram://details/disappearing_message_change_duration"
            boolean r1 = r2.equals(r3)
            if (r1 == 0) goto L_0x0260
            if (r12 == 0) goto L_0x0264
            X.7SD r1 = X.C66580MXl.A0Z(r16)
            boolean r1 = X.C308556Us.A07(r0, r1)
            if (r1 == 0) goto L_0x0264
            X.7SD r1 = X.C66580MXl.A0Z(r16)
            boolean r1 = X.C308556Us.A0A(r0, r1, r2)
            if (r1 == 0) goto L_0x0264
            X.7SD r1 = r16.C6Q()
            X.7Kc r2 = X.C329737Ka.A00(r0, r1, r6)
            X.3tH r9 = r2.Axi()
            X.7SD r1 = X.C66580MXl.A0Z(r16)
            boolean r7 = r2.COV(r0, r1)
            X.3t2 r2 = r16.C6c()
            r1 = 2
            X.0qQ.A0B(r2, r1)
            X.NK5 r6 = new X.NK5
            r6.<init>()
            android.os.Bundle r3 = X.DbY.A09(r0)
            java.lang.String r1 = "DisappearingMessagesChangeDurationBottomSheet.ARGUMENT_THREAD_TARGET"
            X.AnonymousClass9H0.A02(r3, r2, r1)
            if (r9 == 0) goto L_0x0231
            java.lang.String r2 = r9.A00
            if (r2 == 0) goto L_0x0231
            java.lang.String r1 = "dm_transport_type_for_logging"
            r3.putString(r1, r2)
        L_0x0231:
            r6.setArguments(r3)
            r3 = 2131960943(0x7f13246f, float:1.9558569E38)
            if (r7 == 0) goto L_0x023c
            r3 = 2131960945(0x7f132471, float:1.9558573E38)
        L_0x023c:
            X.7Pr r2 = X.DbS.A0W(r0)
            android.content.res.Resources r1 = r8.getResources()
            java.lang.String r1 = r1.getString(r3)
            r2.A0d = r1
            X.DbS.A1S(r2, r4)
            X.7Pu r2 = r2.A00()
            X.0qQ.A0A(r6)
            X.PjI r1 = X.C73757PjI.A00
            X.OXC.A02(r8, r6, r2, r1)
            X.7SM r1 = r5.A01
            r1.CLU()
            goto L_0x0071
        L_0x0260:
            int r13 = r13 + 1
            goto L_0x01da
        L_0x0264:
            java.lang.String r1 = "instagram://thread/update/app"
            boolean r1 = r3.equals(r1)
            if (r1 == 0) goto L_0x0273
            X.7Xm r1 = r5.A07
            r1.Cq7()
            goto L_0x0071
        L_0x0273:
            boolean r1 = X.C70005Nvj.A00(r3)
            if (r1 == 0) goto L_0x0280
            X.7Wm r1 = r5.A05
            r1.Cpg(r3)
            goto L_0x0071
        L_0x0280:
            android.net.Uri r2 = X.DbT.A09(r3)
            java.lang.String r1 = r2.getScheme()
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0313
            java.lang.String r2 = r2.getHost()
            java.lang.String r1 = "thread_details"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0313
            X.7Vd r3 = r5.A04
            X.0sa r1 = r5.A0B
            java.lang.Object r2 = r1.invoke()
            java.lang.String r2 = (java.lang.String) r2
            if (r2 == 0) goto L_0x02e1
            com.instagram.common.session.UserSession r1 = r3.A02
            X.2Dm r1 = X.1bJ.A00(r1)
            X.3U9 r1 = X.C66580MXl.A0d(r1, r2)
        L_0x02b0:
            X.C332467Vd.A01(r3, r1)
        L_0x02b3:
            X.7Zg r1 = X.C332467Vd.A00(r3)
            X.7S7 r1 = r1.C6l()
            X.3sy r1 = r1.B8S()
            java.lang.String r2 = X.C66647MaG.A09(r1)
            X.7Zg r1 = X.C332467Vd.A00(r3)
            X.7S7 r1 = r1.C6l()
            boolean r1 = r1.CZ0()
            if (r2 == 0) goto L_0x0071
            X.0wc r3 = r3.A01
            X.0qQ.A0B(r3, r4)
            java.util.HashMap r2 = X.C66584MXp.A0e(r2, r1)
            java.lang.String r1 = "admin_text_manage_button_click"
            X.C69956Nuw.A00(r3, r1, r2)
            goto L_0x0071
        L_0x02e1:
            X.7Zg r1 = X.C332467Vd.A00(r3)
            X.9Gx r2 = X.C376179Gx.PSEUDO_SHOW_THREAD_INFO_WITH_DIRECT_THREAD_OBJECT
            boolean r1 = r1.AH1(r2)
            if (r1 == 0) goto L_0x0300
            X.7Zg r1 = X.C332467Vd.A00(r3)
            X.7S7 r1 = r1.C6l()
            X.2Ep r1 = r1.Cms()
            if (r1 != 0) goto L_0x02b0
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x0300:
            X.C69865NtT.A00(r2)
            X.7Zg r1 = X.C332467Vd.A00(r3)
            X.7S7 r1 = r1.C6l()
            X.3t3 r1 = r1.CBU()
            X.C332467Vd.A02(r3, r1)
            goto L_0x02b3
        L_0x0313:
            android.net.Uri r2 = X.DbT.A09(r3)
            java.lang.String r1 = r2.getScheme()
            boolean r1 = r10.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0334
            java.lang.String r2 = r2.getHost()
            java.lang.String r1 = "ad_context"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0334
            X.7Wm r1 = r5.A05
            r1.CpF(r3)
            goto L_0x0071
        L_0x0334:
            boolean r1 = X.C69963Nv3.A00(r3)
            if (r1 == 0) goto L_0x0404
            X.7Y8 r9 = r5.A06
            r1 = 25
            X.PlY r7 = new X.PlY
            r7.<init>(r5, r1)
            boolean r1 = X.C69963Nv3.A00(r3)
            if (r1 == 0) goto L_0x0071
            android.net.Uri r1 = X.DbT.A09(r3)
            java.util.List r1 = r1.getPathSegments()
            java.lang.String r4 = X.AnonymousClass7TE.A19(r1, r4)
            if (r4 == 0) goto L_0x0071
            java.lang.String r1 = r16.C6C()
            boolean r1 = r4.equals(r1)
            if (r1 == 0) goto L_0x0071
            X.2Ep r5 = r16.Cms()
            if (r5 == 0) goto L_0x0071
            java.util.List r1 = r5.AZs()
            java.lang.String r2 = r0.A06
            boolean r28 = r1.contains(r2)
            if (r28 != 0) goto L_0x0397
            boolean r1 = r5.CUJ()
            if (r1 != 0) goto L_0x0397
            java.lang.Object r1 = r7.invoke()
            android.content.Context r1 = (android.content.Context) r1
            X.8ab r2 = X.DbS.A0Y(r1)
            r1 = 2131963159(0x7f132d17, float:1.9563064E38)
            r2.A09(r1)
            r1 = 2131963158(0x7f132d16, float:1.9563061E38)
            r2.A08(r1)
            r2.A06()
            X.AnonymousClass7TH.A0a(r2, r6)
            goto L_0x0071
        L_0x0397:
            java.util.List r1 = r5.BJl()
            if (r1 == 0) goto L_0x03a5
            boolean r1 = r1.contains(r2)
            r29 = 1
            if (r1 != 0) goto L_0x03a7
        L_0x03a5:
            r29 = 0
        L_0x03a7:
            java.lang.String r21 = r5.C6k()
            java.lang.String r22 = r5.C6f()
            X.34S r1 = X.AnonymousClass48N.A00(r0, r5)
            java.lang.Object r3 = r1.A00
            com.instagram.common.typedurl.ImageUrl r3 = (com.instagram.common.typedurl.ImageUrl) r3
            java.util.List r1 = r5.BRZ()
            int r1 = r1.size()
            int r25 = r1 + 1
            boolean r30 = r5.CUJ()
            boolean r31 = r5.COS()
            java.lang.String r23 = r5.BA0()
            int r7 = r5.C6a()
            r1 = r5
            X.3U9 r1 = (X.AnonymousClass3U9) r1
            X.3S9 r2 = r1.A01
            X.3Te r6 = r2.A0s
            r8 = 0
            r1 = 29
            if (r7 != r1) goto L_0x03e1
            if (r6 == 0) goto L_0x03e1
            java.lang.String r8 = r6.A07
        L_0x03e1:
            int r6 = r5.C6a()
            X.3Te r1 = r2.A0s
            boolean r32 = X.C66651MaK.A03(r1, r6)
            int r26 = r5.C6a()
            int r27 = r5.AdN()
            X.3Te r1 = r2.A0s
            r19 = r1
            r20 = r4
            r24 = r8
            r17 = r9
            r18 = r3
            r17.Cpl(r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            goto L_0x0071
        L_0x0404:
            boolean r1 = X.C69935Nub.A00(r3)
            if (r1 == 0) goto L_0x0411
            X.7Wm r1 = r5.A05
            r1.Cfc(r3)
            goto L_0x0071
        L_0x0411:
            java.lang.String[] r12 = X.C70391O4s.A00
            r8 = 2
            r2 = 0
        L_0x0415:
            r1 = r12[r2]
            boolean r1 = X.00l.A0d(r3, r1, r4)
            if (r1 == 0) goto L_0x044f
            android.content.Context r10 = r7.requireContext()
            java.lang.String r9 = "direct_auto_reply"
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            r5 = 0
        L_0x0428:
            r2 = r12[r5]
            boolean r1 = X.00l.A0d(r3, r2, r4)
            if (r1 == 0) goto L_0x044a
            if (r2 == 0) goto L_0x0071
            java.lang.String r1 = "entry_point"
            r6.put(r1, r9)
            X.8ey r3 = X.C359988do.A02(r11, r0, r2, r6)
            r2 = 17
            X.E85 r1 = new X.E85
            r1.<init>(r2, r10, r7, r0)
            r3.A00(r1)
            X.1ES.A03(r3)
            goto L_0x0071
        L_0x044a:
            int r5 = r5 + 1
            if (r5 >= r8) goto L_0x0071
            goto L_0x0428
        L_0x044f:
            int r2 = r2 + 1
            if (r2 < r8) goto L_0x0415
            android.net.Uri r2 = X.DbT.A09(r3)
            java.lang.String r1 = r2.getScheme()
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x04a6
            java.lang.String r2 = r2.getHost()
            java.lang.String r1 = "direct_shared_stack_camera"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x04a6
            android.net.Uri r1 = X.DbT.A09(r3)
            java.lang.String r12 = "collection_id"
            java.lang.String r11 = r1.getQueryParameter(r12)
            if (r11 == 0) goto L_0x04a6
            r2 = 17
            X.BBV r1 = new X.BBV
            r1.<init>(r11, r2)
            android.net.Uri r1 = X.DbT.A09(r3)
            java.lang.String r2 = r1.getQueryParameter(r12)
            if (r2 != 0) goto L_0x048f
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x048f:
            r1 = 17
            X.BBV r4 = new X.BBV
            r4.<init>(r2, r1)
            X.F1M r3 = X.ENY.A02
            android.content.Context r2 = r7.requireContext()
            X.PIT r1 = new X.PIT
            r1.<init>(r6, r4, r5)
            r3.A00(r2, r0, r1, r6)
            goto L_0x0071
        L_0x04a6:
            java.lang.String r1 = "instagram://edit_prompt/"
            boolean r1 = X.C66580MXl.A1a(r1, r6, r3)
            if (r1 == 0) goto L_0x04bf
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            X.3sy r1 = r16.B8S()
            com.instagram.model.direct.DirectThreadKey r1 = X.C66647MaG.A03(r1)
            X.C69962Nv2.A00(r2, r0, r1, r3)
            goto L_0x0071
        L_0x04bf:
            android.net.Uri r2 = X.DbT.A09(r3)
            java.lang.String r1 = r2.getScheme()
            boolean r1 = r10.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x050e
            java.lang.String r2 = r2.getHost()
            java.lang.String r1 = "creator_ai_thread_auto_replies_toggle"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x050e
            androidx.fragment.app.FragmentActivity r5 = r7.requireActivity()
            java.lang.String r3 = r9.getModuleName()
            r1 = 3
            X.0qQ.A0B(r3, r1)
            X.7SD r1 = r16.C6Q()
            java.util.List r1 = r1.A0b
            java.lang.Object r2 = X.00k.A0J(r1)
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            if (r2 == 0) goto L_0x0071
            X.7SD r1 = r16.C6Q()
            java.util.Map r1 = r1.A0e
            if (r1 == 0) goto L_0x0071
            java.lang.String r8 = r16.C6k()
            if (r8 == 0) goto L_0x0071
            X.1px r4 = X.AnonymousClass1q4.A00()
            r6 = r0
            r7 = r2
            r9 = r3
            r10 = r1
            r4.CfZ(r5, r6, r7, r8, r9, r10)
            goto L_0x0071
        L_0x050e:
            android.net.Uri r9 = X.DbT.A09(r3)
            java.lang.String r1 = r9.getScheme()
            boolean r1 = r10.equals(r1)
            if (r1 == 0) goto L_0x0543
            java.lang.String r2 = r9.getHost()
            java.lang.String r1 = "bloks_screen_query"
            boolean r1 = r1.equals(r2)
            if (r1 == 0) goto L_0x0543
            java.lang.String r1 = "app_id"
            java.lang.String r2 = r9.getQueryParameter(r1)
            java.lang.String r1 = "com.bloks.www.bloks.mwb.igd.channels.geoblocking.transperancy.bottom_sheet"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0543
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            android.net.Uri r1 = X.DbT.A09(r3)
            X.C48720Ej5.A00(r2, r1, r0)
            goto L_0x0071
        L_0x0543:
            r9 = 0
            android.net.Uri r7 = X.DbT.A09(r3)
            java.lang.String r1 = r7.getScheme()
            boolean r1 = r10.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x0588
            java.lang.String r2 = r7.getHost()
            java.lang.String r1 = "thread"
            boolean r1 = r1.equalsIgnoreCase(r2)
            if (r1 == 0) goto L_0x0588
            java.util.List r7 = r7.getPathSegments()
            X.0qQ.A0A(r7)
            boolean r1 = X.AnonymousClass7TE.A1b(r7)
            if (r1 == 0) goto L_0x0588
            int r2 = r7.size()
            r1 = 3
            if (r2 <= r1) goto L_0x0588
            java.lang.Object r2 = r7.get(r6)
            java.lang.String r1 = "details"
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 == 0) goto L_0x0588
            java.lang.Object r2 = r7.get(r8)
            java.lang.String r1 = "nicknames"
            boolean r9 = X.C51971G9r.A1Z(r2, r1, r4)
        L_0x0588:
            X.7Wm r1 = r5.A05
            if (r9 == 0) goto L_0x0591
            r1.Cqh(r3)
            goto L_0x0071
        L_0x0591:
            r1.CHu(r3)
            goto L_0x0071
        L_0x0596:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x059b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x05a0:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r17)
            throw r0
        L_0x05a5:
            java.lang.String r0 = "ActionUri is null"
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72508P8r.CtO(java.lang.String):void");
    }

    public C72508P8r(AnonymousClass4DH r2, 0wc r3, UserSession userSession, C332467Vd r5, AnonymousClass7SM r6, C332817Wm r7, AnonymousClass7Y8 r8, C333057Xm r9, C254923tH r10, AnonymousClass4DU r11, C62320sa r12, C62320sa r13) {
        C51972G9s.A1D(r3, r2);
        C51974G9v.A1Q(r5, r7, r9, r8);
        0qQ.A0B(r13, 12);
        this.A03 = userSession;
        this.A09 = r11;
        this.A02 = r3;
        this.A00 = r2;
        this.A08 = r10;
        this.A01 = r6;
        this.A04 = r5;
        this.A05 = r7;
        this.A07 = r9;
        this.A06 = r8;
        this.A0A = r12;
        this.A0B = r13;
    }
}
