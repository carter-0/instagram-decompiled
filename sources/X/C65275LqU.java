package X;

import android.view.ContextThemeWrapper;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel;
import java.util.Map;

/* renamed from: X.LqU  reason: case insensitive filesystem */
public final class C65275LqU implements C74501Pvv {
    public C61203Jyw A00;
    public MessageActionsViewModel A01;
    public final AnonymousClass4DH A02;
    public final UserSession A03;
    public final C64300LZa A04;
    public final C60314JjH A05;
    public final AnonymousClass7L0 A06;

    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d3, code lost:
        r2.Epw(new X.C61202Jyv(r4, r3, r1));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00db, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x025e, code lost:
        X.1Eo.A03(r2, r0, r9, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x0261, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CI7(java.lang.Integer r16, java.lang.String r17, boolean r18) {
        /*
            r15 = this;
            r9 = 0
            r0 = r16
            X.0qQ.A0B(r0, r9)
            X.Jyw r5 = r15.A00
            if (r5 == 0) goto L_0x0011
            int r0 = r0.intValue()
            switch(r0) {
                case 1: goto L_0x027c;
                case 3: goto L_0x0012;
                case 5: goto L_0x0174;
                case 13: goto L_0x0265;
                case 14: goto L_0x0265;
                case 37: goto L_0x0126;
                case 41: goto L_0x00dc;
                case 42: goto L_0x00be;
                case 43: goto L_0x00b1;
                default: goto L_0x0011;
            }
        L_0x0011:
            return
        L_0x0012:
            X.JjH r2 = r15.A05
            java.lang.String r8 = r5.A05
            java.lang.String r10 = r5.A04
            com.instagram.user.model.User r4 = r5.A03
            X.AnonymousClass7TF.A1B(r8, r9, r4)
            X.Kfd r7 = new X.Kfd
            r7.<init>(r2, r8, r10)
            org.json.JSONObject r12 = X.DbS.A11()
            java.lang.String r0 = "comment_id"
            org.json.JSONObject r3 = r12.put(r0, r8)     // Catch:{ JSONException -> 0x0033 }
            java.lang.String r1 = "surface"
            java.lang.String r0 = "comment"
            r3.put(r1, r0)     // Catch:{ JSONException -> 0x0033 }
        L_0x0033:
            X.05G r1 = r2.A0D
            X.TpH r5 = X.C14068TpH.COMMENTS
            X.UzD r6 = X.C16677UzD.COMMENT
            X.GmL r0 = r2.A03
            java.lang.String r11 = r0.A0E
            X.Jyx r3 = new X.Jyx
            r9 = r8
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12)
            r1.Epw(r3)
            X.LSm r4 = r2.A08
            boolean r9 = X.AnonymousClass7TF.A1V(r10)
            X.2Ep r3 = X.LSm.A00(r4)
            if (r3 == 0) goto L_0x0011
            r0 = r3
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r1 = r0.A0s
            if (r1 == 0) goto L_0x0011
            X.0eM r0 = r4.A04
            X.6gx r8 = X.DbZ.A0R(r0)
            int r7 = r3.AdN()
            java.lang.String r6 = r3.C6C()
            java.lang.String r5 = r3.C6k()
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r4.A01
            java.lang.String r2 = r0.A00()
            java.lang.String r1 = X.LSm.A01(r4, r1, r3)
            X.1Ln r4 = X.DbT.A0J(r8)
            boolean r0 = X.DbT.A1Y(r4)
            if (r0 == 0) goto L_0x0011
            java.lang.String r0 = "message_client_context_id"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r2)
            java.lang.String r0 = "user_type"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r1)
            if (r9 == 0) goto L_0x00ae
            java.lang.String r1 = "True"
        L_0x0091:
            java.lang.String r0 = "is_reply"
            java.util.LinkedHashMap r1 = X.JTS.A0p(r0, r1, r3, r2)
            X.DbW.A17(r4, r8)
            java.lang.String r0 = "report_comment_sheet_rendered"
            X.DbV.A1M(r4, r0)
            java.lang.String r0 = "comment_options_report"
            r4.A0p(r0)
            java.lang.String r0 = "comments_view"
            java.lang.Long r0 = X.DbZ.A0b(r4, r0, r6, r5, r7)
            X.JTQ.A1C(r4, r0, r1)
            return
        L_0x00ae:
            java.lang.String r1 = "False"
            goto L_0x0091
        L_0x00b1:
            X.JjH r0 = r15.A05
            java.lang.String r4 = r5.A05
            java.lang.String r3 = r5.A04
            X.0qQ.A0B(r4, r9)
            X.05G r2 = r0.A0D
            r1 = 2
            goto L_0x00d3
        L_0x00be:
            X.JjH r1 = r15.A05
            java.lang.String r4 = r5.A05
            java.lang.String r3 = r5.A04
            X.0qQ.A0B(r4, r9)
            r0 = 407(0x197, float:5.7E-43)
            java.lang.String r0 = X.C66579MXk.A00(r0)
            X.C60314JjH.A02(r1, r4, r0)
            X.05G r2 = r1.A0D
            r1 = 1
        L_0x00d3:
            X.Jyv r0 = new X.Jyv
            r0.<init>(r4, r3, r1)
            r2.Epw(r0)
            return
        L_0x00dc:
            X.JjH r0 = r15.A05
            java.lang.String r6 = r5.A05
            java.lang.String r7 = r5.A04
            X.0qQ.A0B(r6, r9)
            X.L87 r5 = r0.A0A
            X.6oS r1 = X.C318116oQ.A00(r0)
            X.05G r11 = r0.A0D
            r0 = 3
            X.0qQ.A0B(r11, r0)
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r8 = 0
            X.MES r4 = new X.MES
            r4.<init>(r5, r6, r7, r8, r9)
            X.19B r0 = X.19B.A00
            X.1Er r3 = X.1Eo.A03(r2, r0, r4, r1)
            java.util.Map r2 = r5.A02
            r2.put(r6, r3)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r2 = r5.A00
            X.4Cq r4 = r2.A01
            com.instagram.comments.mvvm.data.MediaCommentListRepository$locallyHideComment$1 r3 = new com.instagram.comments.mvvm.data.MediaCommentListRepository$locallyHideComment$1
            r3.<init>(r2, r6, r7, r8)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.1Eo.A05(r0, r3, r4)
            X.Jyv r3 = new X.Jyv
            r3.<init>(r6, r7, r9)
            r11.Epw(r3)
            r14 = 32
            X.MGl r9 = new X.MGl
            r10 = r5
            r12 = r6
            r13 = r8
            r9.<init>((java.lang.Object) r10, (java.lang.Object) r11, (java.lang.String) r12, (X.AnonymousClass4D7) r13, (int) r14)
            goto L_0x025e
        L_0x0126:
            X.4DH r6 = r15.A02
            android.content.Context r1 = r6.requireContext()
            com.instagram.common.session.UserSession r0 = r15.A03
            X.Dg1 r5 = new X.Dg1
            r5.<init>(r1, r0)
            r0 = 1
            r5.A05 = r0
            com.instagram.direct.messagethread.messageactions.model.MessageActionsViewModel r0 = r15.A01
            if (r0 != 0) goto L_0x0142
            X.C51965G9l.A15()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0142:
            java.util.List r0 = r0.A0O
            java.util.Iterator r4 = r0.iterator()
        L_0x0148:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0170
            java.lang.Object r3 = r4.next()
            com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData r3 = (com.instagram.direct.messagethread.interaction.longpressaction.LongPressActionData) r3
            r0 = 4
            X.LXU r2 = new X.LXU
            r1 = r18
            r2.<init>(r0, r3, r15, r1)
            X.NkG r1 = r3.A01
            X.NkG r0 = X.C69376NkG.A07
            boolean r1 = X.AnonymousClass7TF.A1W(r1, r0)
            java.lang.String r0 = r3.A04
            if (r1 == 0) goto L_0x016c
            r5.A0A(r0, r2)
            goto L_0x0148
        L_0x016c:
            r5.A0C(r0, r2)
            goto L_0x0148
        L_0x0170:
            X.C49945FFy.A00(r6, r5)
            return
        L_0x0174:
            X.JjH r6 = r15.A05
            java.lang.String r4 = r5.A05
            java.lang.String r3 = r5.A04
            com.instagram.user.model.User r2 = r5.A03
            X.AnonymousClass7TF.A1B(r4, r9, r2)
            X.LSm r12 = r6.A08
            boolean r14 = X.AnonymousClass7TF.A1V(r3)
            java.lang.Boolean r13 = java.lang.Boolean.valueOf(r14)
            X.2Ep r5 = X.LSm.A00(r12)
            if (r5 == 0) goto L_0x01f7
            r0 = r5
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r1 = r0.A0s
            if (r1 == 0) goto L_0x01f7
            X.0eM r0 = r12.A04
            X.6gx r11 = X.DbZ.A0R(r0)
            int r9 = r5.AdN()
            java.lang.String r8 = r5.C6C()
            java.lang.String r7 = r5.C6k()
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r12.A01
            java.lang.String r10 = r0.A00()
            java.lang.String r1 = X.LSm.A01(r12, r1, r5)
            X.1Ln r5 = X.DbT.A0J(r11)
            boolean r0 = X.DbT.A1Y(r5)
            if (r0 == 0) goto L_0x01f7
            java.lang.String r0 = "message_client_context_id"
            X.0eP r12 = X.AnonymousClass7TE.A1L(r0, r10)
            java.lang.String r0 = "user_type"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r10 = "False"
            java.lang.String r0 = "is_bulk_deletion"
            java.util.LinkedHashMap r1 = X.JTS.A0p(r0, r10, r12, r1)
            if (r13 == 0) goto L_0x01dd
            if (r14 == 0) goto L_0x01d8
            java.lang.String r10 = "True"
        L_0x01d8:
            java.lang.String r0 = "is_reply"
            r1.put(r0, r10)
        L_0x01dd:
            X.DbW.A17(r5, r11)
            r0 = 2986(0xbaa, float:4.184E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.DbV.A1M(r5, r0)
            java.lang.String r0 = "comment_options_remove"
            r5.A0p(r0)
            java.lang.String r0 = "comments_view"
            java.lang.Long r0 = X.DbZ.A0b(r5, r0, r8, r7, r9)
            X.JTQ.A1C(r5, r0, r1)
        L_0x01f7:
            X.L6X r7 = r6.A0B
            X.6oS r1 = X.C318116oQ.A00(r6)
            X.05G r6 = r6.A0D
            r0 = 4
            X.0qQ.A0B(r6, r0)
            java.util.Set r4 = X.JTP.A0y(r4)
            if (r3 == 0) goto L_0x0262
            java.util.Set r3 = X.JTP.A0y(r3)
        L_0x020d:
            java.util.Set r0 = X.JTP.A0y(r2)
            X.JwM r5 = new X.JwM
            r5.<init>((java.util.Set) r4, (java.util.Set) r3, (java.util.Set) r0)
            r8 = 0
            java.lang.Integer r2 = X.AnonymousClass05K.A01
            r9 = 6
            X.MfO r4 = new X.MfO
            r4.<init>(r5, r6, r7, r8, r9)
            X.19B r0 = X.19B.A00
            X.1Er r3 = X.1Eo.A03(r2, r0, r4, r1)
            java.util.Map r2 = r7.A02
            r2.put(r5, r3)
            X.Jyt r2 = new X.Jyt
            r2.<init>(r5)
            r6.Epw(r2)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r4 = r7.A00
            java.lang.Object r3 = r5.A01
            java.util.Set r3 = (java.util.Set) r3
            java.lang.Object r2 = r5.A02
            java.util.Set r2 = (java.util.Set) r2
            r4.A0P(r3, r2)
            X.LDm r4 = r7.A01
            int r2 = r4.A00
            int r2 = r2 + -1
            r4.A00 = r2
            r2 = 26
            X.MFz r3 = new X.MFz
            r3.<init>(r4, r8, r2)
            java.lang.Integer r2 = X.AnonymousClass05K.A00
            X.1Eo.A05(r0, r3, r1)
            r14 = 35
            X.MGi r9 = new X.MGi
            r10 = r5
            r11 = r6
            r12 = r7
            r13 = r8
            r9.<init>(r10, r11, r12, r13, r14)
        L_0x025e:
            X.1Eo.A03(r2, r0, r9, r1)
            return
        L_0x0262:
            X.0sl r3 = X.0sl.A00
            goto L_0x020d
        L_0x0265:
            X.JjH r4 = r15.A05
            X.4DH r0 = r15.A02
            r0.requireContext()
            java.lang.String r3 = r5.A05
            java.lang.String r2 = r5.A04
            boolean r1 = r5.A07
            com.instagram.user.model.User r0 = r5.A03
            java.lang.String r0 = r0.getId()
            r4.A05(r3, r2, r0, r1)
            return
        L_0x027c:
            X.JjH r3 = r15.A05
            java.lang.String r2 = r5.A05
            java.lang.String r1 = r5.A04
            X.0qQ.A0B(r2, r9)
            com.instagram.comments.mvvm.data.MediaCommentListRepository r0 = r3.A05
            X.7aH r0 = X.C51968G9o.A0g(r0)
            X.7dj r0 = X.C335067cK.A01(r0, r2, r1)
            if (r0 == 0) goto L_0x02dc
            X.C60314JjH.A00(r0, r3)
            X.LSm r5 = r3.A08
            boolean r1 = X.AnonymousClass7TF.A1V(r1)
            X.2Ep r4 = X.LSm.A00(r5)
            if (r4 == 0) goto L_0x02dc
            r0 = r4
            X.3U9 r0 = (X.AnonymousClass3U9) r0
            X.3S9 r0 = r0.A01
            X.3Te r0 = r0.A0s
            if (r0 == 0) goto L_0x02dc
            X.0eP r3 = X.LSm.A02(r5)
            X.0eP r2 = X.LSm.A03(r5, r0, r4)
            if (r1 == 0) goto L_0x02eb
            java.lang.String r1 = "True"
        L_0x02b5:
            java.lang.String r0 = "is_reply"
            java.util.LinkedHashMap r8 = X.JTS.A0p(r0, r1, r3, r2)
            X.0eM r0 = r5.A04
            X.6gx r1 = X.DbZ.A0R(r0)
            int r9 = r4.AdN()
            java.lang.String r6 = r4.C6C()
            java.lang.String r7 = r4.C6k()
            r0 = 280(0x118, float:3.92E-43)
            java.lang.String r2 = X.C66579MXk.A00(r0)
            java.lang.String r3 = "tap"
            java.lang.String r4 = "comment_options_reply"
            java.lang.String r5 = "comments_view"
            r1.A0W(r2, r3, r4, r5, r6, r7, r8, r9)
        L_0x02dc:
            X.LZa r0 = r15.A04
            X.L9i r2 = r0.A03
            com.instagram.ui.widget.textview.ComposerAutoCompleteTextView r1 = r2.A03
            X.M42 r0 = new X.M42
            r0.<init>(r2)
            r1.post(r0)
            return
        L_0x02eb:
            java.lang.String r1 = "False"
            goto L_0x02b5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C65275LqU.CI7(java.lang.Integer, java.lang.String, boolean):void");
    }

    public final void D9w() {
    }

    public final void DCK() {
    }

    public final void DDO() {
    }

    public final void DVv() {
    }

    public final void CIh(C254783t2 r7, C254743sy r8, String str, String str2, String str3, Map map, Map map2, boolean z) {
        C61203Jyw jyw = this.A00;
        if (jyw != null) {
            C60314JjH jjH = this.A05;
            this.A02.requireContext();
            jjH.A05(jyw.A05, jyw.A04, jyw.A03.getId(), jyw.A07);
        }
    }

    public final void Cyt() {
        AnonymousClass4DH r3 = this.A02;
        AnonymousClass2uJ.A04(r3.requireActivity(), C242363Tt.A01(new ContextThemeWrapper(r3.requireContext(), this.A06.A0E), R.attr.backgroundColorSecondary));
        C64300LZa lZa = this.A04;
        if (lZa.A00) {
            C63853L9i l9i = lZa.A03;
            l9i.A03.post(new M44(l9i));
        }
        C60314JjH jjH = this.A05;
        jjH.A04.A01();
        jjH.A0C.Epw(P0g.A00);
    }

    public final void D9I() {
        this.A05.A05.A0D();
    }

    public final void D9d() {
        AnonymousClass37D A0i;
        FragmentActivity activity = this.A02.getActivity();
        if (activity != null && (A0i = DbT.A0i(activity)) != null && !((AnonymousClass37F) A0i).A0g) {
            AnonymousClass2uJ.A04(activity, activity.getColor(R.color.igds_transparent_navigation_bar));
            2db.A02(activity, activity.getColor(R.color.fds_transparent));
        }
    }

    public C65275LqU(AnonymousClass4DH r1, UserSession userSession, C64300LZa lZa, C60314JjH jjH, AnonymousClass7L0 r5) {
        C51972G9s.A1C(userSession, jjH);
        this.A02 = r1;
        this.A03 = userSession;
        this.A04 = lZa;
        this.A05 = jjH;
        this.A06 = r5;
    }
}
