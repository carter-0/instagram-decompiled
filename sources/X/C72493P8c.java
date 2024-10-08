package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.P8c  reason: case insensitive filesystem */
public final class C72493P8c implements AnonymousClass7XS {
    public MessageIdentifier A00;
    public AnonymousClass6ST A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public C273414mX A06;
    public final Activity A07;
    public final UserSession A08;
    public final OT9 A09;
    public final AnonymousClass0eK A0A;
    public final AnonymousClass0eK A0B;
    public final AnonymousClass4DU A0C;
    public final C62320sa A0D;

    public C72493P8c(Activity activity, UserSession userSession, OT9 ot9, AnonymousClass4DU r5, AnonymousClass0eK r6, AnonymousClass0eK r7, C62320sa r8) {
        C51974G9v.A0d(3, r6, ot9, r5, r7);
        0qQ.A0B(r8, 7);
        this.A08 = userSession;
        this.A07 = activity;
        this.A0A = r6;
        this.A09 = ot9;
        this.A0C = r5;
        this.A0B = r7;
        this.A0D = r8;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0034, code lost:
        if (X.0qQ.A0K(r13, "swipe") != false) goto L_0x0036;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void EuG(com.instagram.model.direct.messageid.MessageIdentifier r7, X.C273414mX r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, java.lang.String r13) {
        /*
            r6 = this;
            r0 = 0
            X.0qQ.A0B(r7, r0)
            X.0eK r1 = r6.A0A
            X.7S7 r2 = X.C66582MXn.A0d(r1)
            X.7SD r0 = r2.C6Q()
            boolean r0 = r0.A0n
            if (r0 != 0) goto L_0x0025
            com.instagram.common.session.UserSession r2 = r6.A08
            android.app.Activity r1 = r6.A07
            X.DbS.A1X(r1)
            X.0eK r0 = r6.A0B
            java.lang.Object r0 = r0.get()
            X.3sy r0 = (X.C254743sy) r0
            X.C69874Ntc.A00(r1, r2, r0)
            return
        L_0x0025:
            java.lang.String r0 = "long_press"
            boolean r0 = X.0qQ.A0K(r13, r0)
            if (r0 != 0) goto L_0x0036
            java.lang.String r0 = "swipe"
            boolean r0 = X.0qQ.A0K(r13, r0)
            r3 = 0
            if (r0 == 0) goto L_0x0037
        L_0x0036:
            r3 = 1
        L_0x0037:
            X.3t3 r2 = r2.CBU()
            if (r2 == 0) goto L_0x00ce
            X.3t0 r2 = (X.C254763t0) r2
            X.0sa r0 = r6.A0D
            java.lang.Object r0 = r0.invoke()
            X.6ST r0 = (X.AnonymousClass6ST) r0
            r6.A01 = r0
            if (r0 == 0) goto L_0x004e
            X.AnonymousClass0fN.A00(r0)
        L_0x004e:
            r6.A00 = r7
            r6.A05 = r10
            r6.A04 = r13
            r6.A06 = r8
            r6.A03 = r11
            r6.A02 = r12
            if (r9 != 0) goto L_0x0097
            com.instagram.common.session.UserSession r0 = r6.A08
            java.lang.String r5 = X.C66580MXl.A0x(r2)
            X.1NY r4 = X.AnonymousClass7TG.A0a(r0)
            java.lang.String r0 = r7.A01
            java.lang.Object[] r1 = new java.lang.Object[]{r0}
            java.lang.String r0 = "direct_v2/items/%s/comments/facade_media/"
            r4.A0K(r0, r1)
            java.lang.String r1 = r7.A00()
            java.lang.String r0 = "original_message_client_context"
            r4.A9m(r0, r1)
            java.lang.String r0 = "thread_id"
            r4.A9m(r0, r5)
            java.lang.Class<X.NH2> r1 = X.NH2.class
            java.lang.Class<X.Met> r0 = X.C66910Met.class
            X.1OC r4 = X.DbU.A0S(r4, r1, r0)
            r1 = 2
            X.NMG r0 = new X.NMG
            r0.<init>(r1, r2, r6, r3)
            r4.A00 = r0
            X.1ET r0 = X.1ES.A01()
            r0.schedule(r4)
            return
        L_0x0097:
            r4 = 95
            boolean r0 = X.00l.A0X(r9, r4)
            if (r0 != 0) goto L_0x00bb
            X.7ZY r1 = X.C66582MXn.A0W(r1)
            com.instagram.model.direct.messageid.MessageIdentifier r0 = r6.A00
            if (r0 != 0) goto L_0x00b1
            java.lang.String r0 = "messageIdentifier"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x00b1:
            java.lang.String r0 = r1.BsP(r0)
            if (r0 == 0) goto L_0x00bb
            java.lang.String r9 = X.002.A0T(r9, r0, r4)
        L_0x00bb:
            com.instagram.common.session.UserSession r0 = r6.A08
            X.1Xj r0 = X.DbV.A0U(r0, r9)
            if (r0 == 0) goto L_0x00ca
            java.lang.String r0 = r0.getId()
            if (r0 == 0) goto L_0x00ca
            r9 = r0
        L_0x00ca:
            A00(r6, r2, r9, r3)
            return
        L_0x00ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72493P8c.EuG(com.instagram.model.direct.messageid.MessageIdentifier, X.4mX, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):void");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x009f, code lost:
        if (r15 == X.2FW.A17) goto L_0x00a1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01f5, code lost:
        X.DbW.A17(r4, r0);
        r4.A0l("comments_sheet_rendered");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0201, code lost:
        if (r15.equals(r13) != false) goto L_0x0205;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0203, code lost:
        r13 = "tap";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0205, code lost:
        r4.A0k(r13);
        r4.A0p(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:0x020f, code lost:
        if (r15.equals(" notification") == false) goto L_0x0248;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x0211, code lost:
        r0 = X.C273654mx.A00(3469);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0217, code lost:
        X.DbZ.A1L(r4, r0, r12);
        r4.A0s(r11);
        r4.A0i(X.C51972G9s.A0i(r16));
        r4.A0w(X.0Yt.A06(X.AnonymousClass7TH.A0h("message_id", r9, X.AnonymousClass7TE.A1L("message_client_context_id", r10), X.AnonymousClass7TE.A1L("user_type", r2), X.AnonymousClass7TE.A1L("comment_id", r1))));
        r4.Cgf();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:89:0x0248, code lost:
        r0 = "thread_view";
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x011a  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x024b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A00(X.C72493P8c r17, X.C254763t0 r18, java.lang.String r19, boolean r20) {
        /*
            r8 = r17
            com.instagram.model.direct.messageid.MessageIdentifier r6 = r8.A00
            if (r6 != 0) goto L_0x0010
            java.lang.String r1 = "messageIdentifier"
        L_0x0008:
            X.0qQ.A0F(r1)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0010:
            X.6ST r0 = r8.A01
            if (r0 == 0) goto L_0x0017
            r0.dismiss()
        L_0x0017:
            X.0eK r4 = r8.A0A
            X.7S7 r1 = X.C66582MXn.A0d(r4)
            com.instagram.common.session.UserSession r5 = r8.A08
            X.9HW r2 = X.AnonymousClass9HV.A00(r5)
            X.7SD r0 = r1.C6Q()
            int r3 = r0.A07
            r0 = 8
            boolean r14 = X.AnonymousClass7TF.A1S(r3, r0)
            X.OT9 r9 = r8.A09
            java.lang.String r7 = r6.A01
            java.lang.String r3 = "DirectCommentMessageInteractor"
            r0 = 0
            X.3su r10 = X.OT9.A00(r9, r7, r3, r0)
            X.17i r3 = X.17h.A00(r5)
            r11 = 0
            if (r10 == 0) goto L_0x0272
            java.lang.String r0 = r10.A1u
        L_0x0043:
            com.instagram.user.model.User r17 = r3.A02(r0)
            X.17i r3 = X.17h.A00(r5)
            java.lang.String r0 = r1.BiB()
            com.instagram.user.model.User r16 = r3.A02(r0)
            X.1Y4 r0 = X.C3018960m.A00()
            r0.A00()
            android.os.Bundle r9 = X.JTP.A0F(r5)
            java.lang.String r0 = "message_non_null_identifier"
            r9.putString(r0, r7)
            java.lang.String r3 = r6.A00()
            java.lang.String r0 = "message_client_context"
            r9.putString(r0, r3)
            r12 = r18
            java.lang.String r3 = r12.A00
            java.lang.String r0 = "thread_id"
            r9.putString(r0, r3)
            java.lang.String r0 = "media_id"
            r7 = r19
            r9.putString(r0, r7)
            android.app.Activity r3 = r8.A07
            java.lang.String r13 = X.AnonymousClass7FM.A00(r3, r10)
            java.lang.String r0 = "message_content"
            r9.putString(r0, r13)
            if (r10 == 0) goto L_0x026f
            java.lang.String r13 = r10.A1u
        L_0x008b:
            java.lang.String r0 = "message_owner_user_id"
            r9.putString(r0, r13)
            if (r10 == 0) goto L_0x026c
            X.2FW r15 = r10.A10
        L_0x0094:
            X.2FW r0 = X.2FW.A1g
            if (r15 == r0) goto L_0x00a1
            X.2FW r0 = X.2FW.A1s
            if (r15 == r0) goto L_0x00a1
            X.2FW r0 = X.2FW.A17
            r13 = 0
            if (r15 != r0) goto L_0x00a2
        L_0x00a1:
            r13 = 1
        L_0x00a2:
            java.lang.String r0 = "should_quote_message_content"
            r9.putBoolean(r0, r13)
            java.lang.String r13 = r8.A02
            if (r13 != 0) goto L_0x00b1
            if (r17 == 0) goto L_0x0269
            java.lang.String r13 = X.DbU.A0p(r17)
        L_0x00b1:
            java.lang.String r0 = "message_sender_profile_pic_url"
            r9.putString(r0, r13)
            java.lang.String r0 = "should_show_keyboard"
            r13 = r20
            r9.putBoolean(r0, r13)
            java.lang.String r13 = r8.A03
            if (r13 != 0) goto L_0x00c5
            java.lang.String r13 = r1.BiB()
        L_0x00c5:
            java.lang.String r0 = "channel_creator_id"
            r9.putString(r0, r13)
            if (r16 == 0) goto L_0x0266
            java.lang.String r13 = X.DbU.A0p(r16)
        L_0x00d0:
            java.lang.String r0 = "channel_creator_profile_url"
            r9.putString(r0, r13)
            java.lang.String r0 = "has_channel_ended"
            r9.putBoolean(r0, r14)
            if (r14 == 0) goto L_0x024e
            r0 = 2131960786(0x7f1323d2, float:1.955825E38)
        L_0x00df:
            java.lang.String r2 = r3.getString(r0)
        L_0x00e3:
            java.lang.String r0 = "channel_disabled_replies_composer"
            r9.putString(r0, r2)
            java.lang.String r2 = r5.A06
            boolean r12 = r1.COR(r2)
            java.lang.String r0 = "current_user_bc_creator"
            r9.putBoolean(r0, r12)
            boolean r12 = r1.CXj(r2)
            java.lang.String r0 = "current_user_bc_moderator"
            r9.putBoolean(r0, r12)
            java.lang.String r12 = r8.A05
            r0 = 376(0x178, float:5.27E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r9.putString(r0, r12)
            com.instagram.direct.model.DirectThreadThemeInfo r0 = r1.C6d()
            com.facebook.base.activity.parcel.OpaqueParcelable r1 = X.0B0.A00(r0)
            java.lang.String r0 = "channel_thread_theme_info"
            r9.putParcelable(r0, r1)
            if (r10 == 0) goto L_0x024b
            com.instagram.direct.model.comments.DirectMessageComments r0 = r10.A0q
            if (r0 == 0) goto L_0x024b
            int r1 = r0.A00
        L_0x011c:
            java.lang.String r0 = "channel_thread_replies_count"
            r9.putInt(r0, r1)
            X.K6q r1 = new X.K6q
            r1.<init>()
            r1.setArguments(r9)
            X.DbS.A1X(r3)
            androidx.fragment.app.FragmentActivity r3 = (androidx.fragment.app.FragmentActivity) r3
            X.6Yo r0 = X.DbU.A0Q(r3, r5)
            r0.A0B(r11, r1)
            r0.A07()
            X.7S7 r3 = X.C66582MXn.A0d(r4)
            int r1 = X.C66580MXl.A05(r3)
            X.2Ep r0 = r3.Cms()
            r9 = 0
            if (r0 == 0) goto L_0x0196
            X.3Te r0 = X.C66580MXl.A0b(r0)
            if (r0 == 0) goto L_0x0196
            java.lang.String r2 = X.C329997La.A00(r0, r2, r1)
            X.6gx r0 = X.C313746gw.A00(r5)
            int r12 = r3.AdN()
            X.3t3 r1 = r3.CBU()
            if (r1 == 0) goto L_0x0163
            java.lang.String r11 = X.C66580MXl.A0x(r1)
        L_0x0163:
            java.lang.String r16 = r3.C6k()
            com.instagram.model.direct.messageid.MessageIdentifier r3 = r8.A00
            java.lang.String r1 = "messageIdentifier"
            if (r3 == 0) goto L_0x0008
            java.lang.String r10 = r3.A00()
            java.lang.String r15 = r8.A04
            java.lang.String r1 = "entrypoint"
            if (r15 == 0) goto L_0x0008
            java.lang.String r14 = " notification"
            boolean r1 = r15.equals(r14)
            if (r1 == 0) goto L_0x0181
            java.lang.String r9 = r3.A01
        L_0x0181:
            java.lang.String r1 = r8.A05
            X.1Ln r4 = X.DbT.A0J(r0)
            boolean r3 = X.DbT.A1Y(r4)
            if (r3 == 0) goto L_0x0196
            int r3 = r15.hashCode()
            java.lang.String r13 = "swipe"
            switch(r3) {
                case -326696768: goto L_0x01ca;
                case -203728629: goto L_0x01d5;
                case 109854522: goto L_0x01e2;
                case 795504409: goto L_0x01eb;
                default: goto L_0x0196;
            }
        L_0x0196:
            if (r19 == 0) goto L_0x01c9
            X.0eK r0 = r8.A0B
            java.lang.Object r2 = r0.get()
            boolean r0 = r2 instanceof com.instagram.model.direct.DirectThreadKey
            if (r0 == 0) goto L_0x01c9
            com.instagram.model.direct.DirectThreadKey r2 = (com.instagram.model.direct.DirectThreadKey) r2
            if (r2 == 0) goto L_0x01c9
            r0 = 32
            X.PhW r1 = new X.PhW
            r1.<init>(r5, r0)
            java.lang.Class<X.Oy9> r0 = X.Oy9.class
            java.lang.Object r1 = r5.A01(r0, r1)
            X.Oy9 r1 = (X.Oy9) r1
            com.instagram.model.direct.DirectThreadKey r0 = r1.A00
            boolean r0 = X.0qQ.A0K(r0, r2)
            if (r0 != 0) goto L_0x01c4
            r1.A00 = r2
            java.util.Map r0 = r1.A01
            r0.clear()
        L_0x01c4:
            java.util.Map r0 = r1.A01
            r0.put(r7, r6)
        L_0x01c9:
            return
        L_0x01ca:
            java.lang.String r3 = "long_press"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x0196
            java.lang.String r3 = "message_options"
            goto L_0x01f5
        L_0x01d5:
            boolean r3 = r15.equals(r14)
            if (r3 == 0) goto L_0x0196
            r3 = 2113(0x841, float:2.961E-42)
            java.lang.String r3 = X.C273654mx.A00(r3)
            goto L_0x01f5
        L_0x01e2:
            boolean r3 = r15.equals(r13)
            if (r3 == 0) goto L_0x0196
            java.lang.String r3 = "comments_swipe_shortcut"
            goto L_0x01f5
        L_0x01eb:
            java.lang.String r3 = "comment_pill"
            boolean r3 = r15.equals(r3)
            if (r3 == 0) goto L_0x0196
            java.lang.String r3 = "comments_pill"
        L_0x01f5:
            X.DbW.A17(r4, r0)
            java.lang.String r0 = "comments_sheet_rendered"
            r4.A0l(r0)
            boolean r0 = r15.equals(r13)
            if (r0 != 0) goto L_0x0205
            java.lang.String r13 = "tap"
        L_0x0205:
            r4.A0k(r13)
            r4.A0p(r3)
            boolean r0 = r15.equals(r14)
            if (r0 == 0) goto L_0x0248
            r0 = 3469(0xd8d, float:4.861E-42)
            java.lang.String r0 = X.C273654mx.A00(r0)
        L_0x0217:
            X.DbZ.A1L(r4, r0, r12)
            r4.A0s(r11)
            java.lang.Long r0 = X.C51972G9s.A0i(r16)
            r4.A0i(r0)
            java.lang.String r0 = "message_client_context_id"
            X.0eP r3 = X.AnonymousClass7TE.A1L(r0, r10)
            java.lang.String r0 = "user_type"
            X.0eP r2 = X.AnonymousClass7TE.A1L(r0, r2)
            java.lang.String r0 = "comment_id"
            X.0eP r1 = X.AnonymousClass7TE.A1L(r0, r1)
            java.lang.String r0 = "message_id"
            X.0eP[] r0 = X.AnonymousClass7TH.A0h(r0, r9, r3, r2, r1)
            java.util.LinkedHashMap r0 = X.0Yt.A06(r0)
            r4.A0w(r0)
            r4.Cgf()
            goto L_0x0196
        L_0x0248:
            java.lang.String r0 = "thread_view"
            goto L_0x0217
        L_0x024b:
            r1 = -1
            goto L_0x011c
        L_0x024e:
            r0 = 44
            boolean r0 = r2.A00(r12, r0)
            if (r0 == 0) goto L_0x0263
            r0 = 46
            boolean r0 = r2.A00(r12, r0)
            if (r0 != 0) goto L_0x0263
            r0 = 2131960787(0x7f1323d3, float:1.9558253E38)
            goto L_0x00df
        L_0x0263:
            r2 = 0
            goto L_0x00e3
        L_0x0266:
            r13 = r11
            goto L_0x00d0
        L_0x0269:
            r13 = r11
            goto L_0x00b1
        L_0x026c:
            r15 = r11
            goto L_0x0094
        L_0x026f:
            r13 = r11
            goto L_0x008b
        L_0x0272:
            r0 = r11
            goto L_0x0043
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C72493P8c.A00(X.P8c, X.3t0, java.lang.String, boolean):void");
    }
}
