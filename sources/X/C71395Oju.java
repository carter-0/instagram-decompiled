package X;

import android.view.View;

/* renamed from: X.Oju  reason: case insensitive filesystem */
public final class C71395Oju implements View.OnClickListener {
    public final int A00;
    public final Object A01;

    public C71395Oju(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public static void A00(View view, int i, Object obj) {
        AnonymousClass0fU.A00(new C71395Oju(obj, i), view);
    }

    /* JADX WARNING: type inference failed for: r1v192, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:118:0x029e, code lost:
        r4 = "threadCapabilities";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:122:0x02c9, code lost:
        r4 = "threadId";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:301:0x0a13, code lost:
        if (r3 != null) goto L_0x0a15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:452:0x0fa2, code lost:
        X.AnonymousClass0fD.A0C(r1, r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:453:0x0fa5, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x0111, code lost:
        r4 = "viewModel";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x003d, code lost:
        X.0qQ.A0F(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0044, code lost:
        throw X.AnonymousClass00P.createAndThrow();
     */
    /* JADX WARNING: Removed duplicated region for block: B:350:0x0b00  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r20) {
        /*
            r19 = this;
            r1 = r19
            int r0 = r1.A00
            r2 = r20
            switch(r0) {
                case 0: goto L_0x02cd;
                case 1: goto L_0x0f68;
                case 2: goto L_0x0f3e;
                case 3: goto L_0x0f0d;
                case 4: goto L_0x02a2;
                case 5: goto L_0x0eb3;
                case 6: goto L_0x024e;
                case 7: goto L_0x0235;
                case 8: goto L_0x01fd;
                case 9: goto L_0x0e9b;
                case 10: goto L_0x0e88;
                case 11: goto L_0x0e75;
                case 12: goto L_0x0e62;
                case 13: goto L_0x0e46;
                case 14: goto L_0x0e31;
                case 15: goto L_0x0dfe;
                case 16: goto L_0x0dbb;
                case 17: goto L_0x0d87;
                case 18: goto L_0x01e6;
                case 19: goto L_0x042c;
                case 20: goto L_0x03e0;
                case 21: goto L_0x0d51;
                case 22: goto L_0x0d24;
                case 23: goto L_0x0ce2;
                case 24: goto L_0x0cb6;
                case 25: goto L_0x0c83;
                case 26: goto L_0x0c64;
                case 27: goto L_0x0c51;
                case 28: goto L_0x01b9;
                case 29: goto L_0x0bf1;
                case 30: goto L_0x0bde;
                case 31: goto L_0x09d0;
                case 32: goto L_0x0933;
                case 33: goto L_0x08f0;
                case 34: goto L_0x08db;
                case 35: goto L_0x0898;
                case 36: goto L_0x0881;
                case 37: goto L_0x0864;
                case 38: goto L_0x0840;
                case 39: goto L_0x082b;
                case 40: goto L_0x0816;
                case 41: goto L_0x0801;
                case 42: goto L_0x07e9;
                case 43: goto L_0x07c2;
                case 44: goto L_0x07ad;
                case 45: goto L_0x0795;
                case 46: goto L_0x0115;
                case 47: goto L_0x0782;
                case 48: goto L_0x076f;
                case 49: goto L_0x0750;
                case 50: goto L_0x073d;
                case 51: goto L_0x0337;
                case 52: goto L_0x06cd;
                case 53: goto L_0x06ae;
                case 54: goto L_0x069b;
                case 55: goto L_0x066c;
                case 56: goto L_0x0630;
                case 57: goto L_0x0612;
                case 58: goto L_0x00af;
                case 59: goto L_0x0045;
                case 60: goto L_0x05e3;
                case 61: goto L_0x05b4;
                case 62: goto L_0x0585;
                case 63: goto L_0x0556;
                case 64: goto L_0x0541;
                case 65: goto L_0x0528;
                case 66: goto L_0x0517;
                case 67: goto L_0x0506;
                case 68: goto L_0x0490;
                case 69: goto L_0x009b;
                default: goto L_0x0009;
            }
        L_0x0009:
            r0 = -754845262(0xffffffffd301f9b2, float:-5.5823997E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NIn r4 = (X.C68449NIn) r4
            X.MuH r2 = X.C68449NIn.A02(r4)
            r3 = 0
            X.05G r1 = r2.A0R
            r1.Epw(r3)
            X.05G r1 = r2.A0S
            r1.Epw(r3)
            X.C67761MuH.A02(r2)
            X.MuH r2 = X.C68449NIn.A02(r4)
            X.05G r1 = r2.A0Q
            r1.Epw(r3)
            X.C67761MuH.A02(r2)
            java.lang.String r1 = "deleted captured media"
            X.C68449NIn.A0R(r4, r1)
            com.instagram.common.ui.base.IgEditText r1 = r4.A0H
            if (r1 != 0) goto L_0x0f8d
            java.lang.String r4 = "noteEditText"
        L_0x003d:
            X.0qQ.A0F(r4)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0045:
            r0 = 1389199686(0x52cd8146, float:4.41318572E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r9 = r1.A01
            X.NJR r9 = (X.NJR) r9
            java.lang.Integer r1 = r9.A07
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            if (r1 != r10) goto L_0x0061
            r9.onBackPressed()
            X.Dbb.A0z(r9)
        L_0x005c:
            r1 = -351003412(0xffffffffeb141cec, float:-1.790576E26)
            goto L_0x0fa2
        L_0x0061:
            X.Mtj r3 = r9.A05
            if (r3 == 0) goto L_0x0111
            X.0Ud r1 = r3.A02
            java.lang.Object r2 = r1.getValue()
            X.NoZ r2 = (X.C69591NoZ) r2
            boolean r1 = r2 instanceof X.NWD
            if (r1 == 0) goto L_0x008e
            X.NWD r2 = (X.NWD) r2
            X.NWE r8 = r2.A00
            X.05G r7 = r3.A01
        L_0x0077:
            java.lang.Object r6 = r7.getValue()
            java.lang.String r5 = r8.A02
            java.lang.String r4 = r8.A06
            java.lang.String r3 = r8.A03
            java.lang.String r2 = r8.A05
            X.NWA r1 = new X.NWA
            r1.<init>(r5, r4, r3, r2)
            boolean r1 = r7.AIY(r6, r1)
            if (r1 == 0) goto L_0x0077
        L_0x008e:
            r9.A06 = r10
            android.view.View r1 = r9.A00
            if (r1 == 0) goto L_0x0097
            X.0nA.A0N(r1)
        L_0x0097:
            X.C66582MXn.A16(r9)
            goto L_0x005c
        L_0x009b:
            r0 = -265741459(0xfffffffff0291b6d, float:-2.0934449E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NOq r1 = (X.C68594NOq) r1
            X.NKj r5 = r1.A02
            X.30l r4 = r5.A00
            if (r4 != 0) goto L_0x02eb
            java.lang.String r4 = "closeFriendsController"
            goto L_0x003d
        L_0x00af:
            r0 = -1932506217(0xffffffff8cd04b97, float:-3.2092968E-31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NJR r2 = (X.NJR) r2
            com.instagram.common.ui.base.IgEditText r1 = r2.A01
            r8 = 0
            if (r1 == 0) goto L_0x010f
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x010f
            java.lang.String r7 = r1.toString()
        L_0x00c9:
            com.instagram.common.ui.base.IgEditText r1 = r2.A04
            if (r1 == 0) goto L_0x010d
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x010d
            java.lang.String r6 = r1.toString()
        L_0x00d7:
            com.instagram.common.ui.base.IgEditText r1 = r2.A02
            if (r1 == 0) goto L_0x010b
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x010b
            java.lang.String r4 = r1.toString()
        L_0x00e5:
            com.instagram.common.ui.base.IgEditText r1 = r2.A03
            if (r1 == 0) goto L_0x0109
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0109
            java.lang.String r5 = r1.toString()
        L_0x00f3:
            X.Mtj r3 = r2.A05
            if (r3 == 0) goto L_0x0111
            X.6oS r1 = X.C318116oQ.A00(r3)
            r9 = 1
            X.MEm r2 = new X.MEm
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            X.AnonymousClass7TE.A1Z(r2, r1)
            r1 = -771805484(0xffffffffd1ff2ed4, float:-1.37000288E11)
            goto L_0x0fa2
        L_0x0109:
            r5 = r8
            goto L_0x00f3
        L_0x010b:
            r4 = r8
            goto L_0x00e5
        L_0x010d:
            r6 = r8
            goto L_0x00d7
        L_0x010f:
            r7 = r8
            goto L_0x00c9
        L_0x0111:
            java.lang.String r4 = "viewModel"
            goto L_0x003d
        L_0x0115:
            r0 = 436702091(0x1a078b8b, float:2.8030068E-23)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NKP r2 = (X.NKP) r2
            X.17i r3 = r2.A03
            r5 = 0
            if (r3 != 0) goto L_0x0129
            java.lang.String r4 = "userCache"
            goto L_0x003d
        L_0x0129:
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r1 = r2.A01
            java.lang.String r4 = "content"
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r1.A04
            com.instagram.user.model.User r1 = r3.A02(r1)
            if (r1 == 0) goto L_0x02f8
            com.instagram.model.direct.DirectShareTarget r7 = new com.instagram.model.direct.DirectShareTarget
            r7.<init>((com.instagram.user.model.User) r1)
            X.1E8 r3 = r2.A02
            if (r3 != 0) goto L_0x0144
            java.lang.String r4 = "mediaCache"
            goto L_0x003d
        L_0x0144:
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r1 = r2.A01
            if (r1 == 0) goto L_0x003d
            java.lang.String r1 = r1.A05
            X.1Xj r6 = r3.A02(r1)
            if (r6 == 0) goto L_0x02f8
            com.instagram.common.ui.base.IgEditText r1 = r2.A00
            if (r1 == 0) goto L_0x0190
            android.text.Editable r1 = r1.getText()
            if (r1 == 0) goto L_0x0190
            java.lang.String r1 = r1.toString()
            if (r1 == 0) goto L_0x0190
            java.lang.String r8 = X.DbV.A12(r1)
            if (r8 == 0) goto L_0x0190
            int r1 = r8.length()
            if (r1 <= 0) goto L_0x0190
            boolean r3 = r6.A5G()
            X.1as r9 = X.1as.A04
            X.0eM r1 = r2.A07
            com.instagram.common.session.UserSession r11 = X.AnonymousClass7TE.A0l(r1)
            if (r3 == 0) goto L_0x01a6
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r1 = r2.A01
            if (r1 == 0) goto L_0x003d
            com.instagram.api.schemas.SocialContextType r4 = r1.A00
            java.lang.String r9 = "clips_interaction_reply_sheet"
            java.lang.String r10 = "clips_social_context_bubble"
            r12 = 0
            X.0qQ.A0B(r11, r12)
            X.7Z7 r3 = X.OXC.A01(r11, r7)
            r11 = r5
            r3.ELV(r4, r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x0190:
            android.content.Context r3 = r2.getContext()
            if (r3 == 0) goto L_0x019d
            r1 = 2131966208(0x7f133900, float:1.9569248E38)
            java.lang.String r5 = r3.getString(r1)
        L_0x019d:
            android.content.Context r1 = r2.getContext()
            X.C59689JTv.A09(r1, r5)
            goto L_0x030f
        L_0x01a6:
            java.lang.String r14 = "clips_interaction_reply_sheet"
            com.instagram.direct.inbox.clipsinteractionreply.ClipsInteractionReplySheetContent r3 = r2.A01
            if (r3 == 0) goto L_0x003d
            java.lang.String r1 = r3.A02
            com.instagram.api.schemas.SocialContextType r10 = r3.A00
            r12 = r6
            r13 = r7
            r15 = r8
            r16 = r1
            r9.A05(r10, r11, r12, r13, r14, r15, r16)
            goto L_0x0190
        L_0x01b9:
            r0 = -1988475270(0xffffffff897a467a, float:-3.0125793E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment r2 = (com.instagram.direct.fragment.visual.DirectVisualMessageActionLogPriorityFragment) r2
            X.Pv5 r1 = r2.A00
            if (r1 != 0) goto L_0x01cc
            java.lang.String r4 = "controller"
            goto L_0x003d
        L_0x01cc:
            X.11X r1 = r1.Ex0()
            if (r1 == 0) goto L_0x01d5
            r2.schedule(r1)
        L_0x01d5:
            com.instagram.ui.widget.spinner.SpinnerImageView r2 = r2.spinner
            if (r2 == 0) goto L_0x01e2
            r1 = 0
            r2.setOnClickListener(r1)
            r1 = 607493419(0x24359d2b, float:3.9381245E-17)
            goto L_0x0fa2
        L_0x01e2:
            java.lang.String r4 = "spinner"
            goto L_0x003d
        L_0x01e6:
            r0 = 907224949(0x36132775, float:2.1927674E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.P2x r2 = (X.C72358P2x) r2
            r1 = 1
            X.C72358P2x.A00(r2, r1)
            X.7Pu r1 = r2.A00
            if (r1 != 0) goto L_0x0317
            java.lang.String r4 = "bottomSheetNux"
            goto L_0x003d
        L_0x01fd:
            r0 = -649050268(0xffffffffd9504764, float:-3.66408062E15)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.NJY r6 = (X.NJY) r6
            X.0eM r1 = r6.A14
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.direct.capabilities.Capabilities r4 = r6.A03
            if (r4 == 0) goto L_0x029e
            X.3t3 r3 = r6.A0c
            if (r3 == 0) goto L_0x02c9
            r1 = 0
            X.0qQ.A0B(r5, r1)
            com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl r1 = com.instagram.direct.disappearingmode.impl.DisappearingModePluginImpl.A01
            if (r1 == 0) goto L_0x0230
            X.NJO r2 = new X.NJO
            r2.<init>()
            android.os.Bundle r1 = X.DbY.A09(r5)
            X.OXL.A01(r1, r4, r3)
            r2.setArguments(r1)
            X.C66584MXp.A0l(r2, r6)
        L_0x0230:
            r1 = 1175712872(0x4613f468, float:9469.102)
            goto L_0x0fa2
        L_0x0235:
            r0 = -1862020640(0xffffffff9103d1e0, float:-1.039875E-28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.NJY r5 = (X.NJY) r5
            X.0eM r1 = r5.A14
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.KWk r3 = r5.A0V
            if (r3 != 0) goto L_0x031f
            java.lang.String r4 = "customerDetailsRepository"
            goto L_0x003d
        L_0x024e:
            r0 = -177586925(0xfffffffff56a3d13, float:-2.9693267E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r10 = r1.A01
            X.NJY r10 = (X.NJY) r10
            X.NmZ r1 = X.C69491NmZ.CHAT_CONTROLS
            X.NJY.A05(r1, r10)
            android.os.Bundle r2 = r10.requireArguments()
            X.0eM r1 = r10.A14
            com.instagram.common.session.UserSession r9 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.direct.capabilities.Capabilities r8 = r10.A03
            if (r8 == 0) goto L_0x029e
            X.3t3 r7 = r10.A0c
            if (r7 == 0) goto L_0x02c9
            r1 = -1
            java.lang.String r6 = "DirectFragment.DIRECT_FRAGMENT_THREAD_POSITION"
            int r5 = r2.getInt(r6, r1)
            r1 = 0
            java.lang.String r4 = "DirectThreadDetailFragment.TRANSLATION_FROM_BANNER"
            boolean r3 = r2.getBoolean(r4, r1)
            X.0qQ.A0B(r9, r1)
            X.NJk r2 = new X.NJk
            r2.<init>()
            android.os.Bundle r1 = X.DbY.A09(r9)
            X.OXL.A01(r1, r8, r7)
            r1.putInt(r6, r5)
            r1.putBoolean(r4, r3)
            r2.setArguments(r1)
            X.C66584MXp.A0l(r2, r10)
            r1 = -513502614(0xffffffffe164926a, float:-2.635255E20)
            goto L_0x0fa2
        L_0x029e:
            java.lang.String r4 = "threadCapabilities"
            goto L_0x003d
        L_0x02a2:
            r0 = 1174118709(0x45fba135, float:8052.151)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.NJY r4 = (X.NJY) r4
            X.0eM r1 = r4.A14
            com.instagram.common.session.UserSession r3 = X.AnonymousClass7TE.A0l(r1)
            X.3t3 r2 = r4.A0c
            if (r2 == 0) goto L_0x02c9
            r1 = 4103(0x1007, float:5.75E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r1)
            X.NJl r1 = X.C69939Nuf.A00(r3, r2, r1)
            X.C66584MXp.A0l(r1, r4)
            r1 = -1739024261(0xffffffff9858987b, float:-2.7994329E-24)
            goto L_0x0fa2
        L_0x02c9:
            java.lang.String r4 = "threadId"
            goto L_0x003d
        L_0x02cd:
            r0 = 341801711(0x145f7aef, float:1.1282867E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Mxs r1 = (X.C67968Mxs) r1
            com.instagram.direct.ui.polls.PollMessageOptionView r1 = r1.A02
            com.instagram.common.ui.base.IgEditText r1 = r1.A00
            java.lang.String r4 = "editText"
            if (r1 == 0) goto L_0x003d
            r1.requestFocus()
            X.0nA.A0Q(r1)
            r1 = -445799135(0xffffffffe56da521, float:-7.0140434E22)
            goto L_0x0fa2
        L_0x02eb:
            X.Ki7 r3 = X.C62574Ki7.NOTES_CREATION_SHEET
            r2 = 2002(0x7d2, float:2.805E-42)
            r1 = 0
            r4.A00(r5, r3, r2, r1)
            r1 = 364462793(0x15b942c9, float:7.4826273E-26)
            goto L_0x0fa2
        L_0x02f8:
            android.content.Context r3 = r2.getContext()
            if (r3 == 0) goto L_0x0305
            r1 = 2131966207(0x7f1338ff, float:1.9569246E38)
            java.lang.String r5 = r3.getString(r1)
        L_0x0305:
            android.content.Context r4 = r2.getContext()
            java.lang.String r3 = "message_fail"
            r1 = 0
            X.C59689JTv.A00(r4, r5, r3, r1)
        L_0x030f:
            X.DbX.A1J(r2)
            r1 = -518086553(0xffffffffe11ea067, float:-1.8288399E20)
            goto L_0x0fa2
        L_0x0317:
            r1.A07()
            r1 = -1665727642(0xffffffff9cb70366, float:-1.2110803E-21)
            goto L_0x0fa2
        L_0x031f:
            r1 = 1
            X.0qQ.A0B(r4, r1)
            X.Mtj r2 = new X.Mtj
            r2.<init>(r4, r3)
            X.NJR r1 = new X.NJR
            r1.<init>()
            r1.A05 = r2
            X.C66584MXp.A0l(r1, r5)
            r1 = 488455769(0x1d1d3e59, float:2.081101E-21)
            goto L_0x0fa2
        L_0x0337:
            r0 = 2097370729(0x7d035669, float:1.0911096E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Mkx r5 = (X.C67263Mkx) r5
            com.instagram.common.session.UserSession r2 = r5.A0A
            X.0iw r1 = r5.A09
            r6 = 1
            X.Mos r3 = new X.Mos
            r3.<init>(r1, r2)
            java.lang.String r2 = "bulk_reply_button_click"
            r1 = 0
            X.C67498Mos.A00(r3, r2, r1)
            X.Moq r4 = r5.A01
            if (r4 == 0) goto L_0x03a7
            java.util.HashMap r1 = r5.A0D
            java.util.LinkedHashMap r1 = X.0Yt.A03(r1)
            r4.A04 = r1
            X.Niy r3 = X.C69298Niy.A05
            int r2 = r1.size()
            r1 = 10
            if (r2 <= r1) goto L_0x03c0
            X.Niy r1 = X.C69298Niy.EXCEED_MAX_COUNT
        L_0x036a:
            X.6ap r5 = X.DbS.A0a()
            androidx.fragment.app.FragmentActivity r4 = r4.A05
            r2 = 2131238261(0x7f081d75, float:1.8092796E38)
            android.graphics.drawable.Drawable r3 = r4.getDrawable(r2)
            int r2 = r1.ordinal()
            r1 = 0
            if (r2 == r1) goto L_0x03b4
            if (r2 == r6) goto L_0x03b0
            r1 = 2
            if (r2 == r1) goto L_0x03ac
            r1 = 3
            if (r2 == r1) goto L_0x03b8
            r1 = 4
            if (r2 != r1) goto L_0x03db
            java.lang.String r1 = ""
        L_0x038b:
            X.0qQ.A0A(r1)
            r5.A0D = r1
            r5.A02()
            if (r3 == 0) goto L_0x039f
            r1 = 2130970182(0x7f040646, float:1.7549067E38)
            int r1 = X.AnonymousClass7TF.A03(r4, r1)
            r5.A08(r3, r1)
        L_0x039f:
            X.1xC r1 = X.1xC.A01
            r5.A06()
            X.DbY.A1K(r1, r5)
        L_0x03a7:
            r1 = -45656134(0xfffffffffd4757ba, float:-1.6560742E37)
            goto L_0x0fa2
        L_0x03ac:
            r1 = 2131967723(0x7f133eeb, float:1.957232E38)
            goto L_0x03bb
        L_0x03b0:
            r1 = 2131967721(0x7f133ee9, float:1.9572316E38)
            goto L_0x03bb
        L_0x03b4:
            r1 = 2131967720(0x7f133ee8, float:1.9572314E38)
            goto L_0x03bb
        L_0x03b8:
            r1 = 2131967722(0x7f133eea, float:1.9572318E38)
        L_0x03bb:
            java.lang.String r1 = r4.getString(r1)
            goto L_0x038b
        L_0x03c0:
            java.util.Map r2 = r4.A0D
            boolean r1 = r2.isEmpty()
            r1 = r1 ^ 1
            if (r1 == 0) goto L_0x03d7
            java.util.Collection r1 = r2.values()
            java.lang.Object r1 = X.00k.A09(r1)
            X.Niy r1 = (X.C69298Niy) r1
            if (r1 == r3) goto L_0x03d7
            goto L_0x036a
        L_0x03d7:
            X.C67496Moq.A00(r4)
            goto L_0x03a7
        L_0x03db:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x03e0:
            r0 = 1879251254(0x70031936, float:1.6229206E29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.P2e r1 = (X.C72339P2e) r1
            X.OVU r4 = r1.A00
            X.N4P r2 = r4.A00
            if (r2 == 0) goto L_0x0422
            X.3sy r1 = r2.A08()
            boolean r1 = r1 instanceof com.instagram.model.direct.DirectThreadKey
            if (r1 == 0) goto L_0x0422
            X.3sy r1 = r2.A08()
            java.lang.String r7 = X.C66647MaG.A09(r1)
            if (r7 == 0) goto L_0x0427
            com.instagram.common.session.UserSession r3 = r4.A05
            X.1as r1 = X.1as.A04
            X.1ap r5 = r1.A02
            X.OLT r6 = r4.A01
            java.util.Set r9 = r4.A07
            boolean r10 = r2.A0D()
            r8 = 0
            X.NJ6 r2 = r5.A03(r6, r7, r8, r9, r10)
            androidx.fragment.app.FragmentActivity r1 = r4.A04
            X.6Yo r1 = X.DbS.A0M(r1, r3)
            X.0qQ.A0A(r2)
            X.Dba.A0w(r8, r2, r1)
        L_0x0422:
            r1 = 115666212(0x6e4ed24, float:8.6112515E-35)
            goto L_0x0fa2
        L_0x0427:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x042c:
            r0 = 1852248620(0x6e67122c, float:1.7878251E28)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.P2e r1 = (X.C72339P2e) r1
            X.OVU r7 = r1.A00
            X.N4P r3 = r7.A00
            X.OLT r6 = r7.A01
            if (r3 == 0) goto L_0x0486
            if (r6 == 0) goto L_0x0486
            java.util.Set r2 = r7.A07
            boolean r1 = X.C66580MXl.A1b(r2)
            if (r1 == 0) goto L_0x0486
            X.3sy r1 = r3.A08()
            boolean r1 = r1 instanceof com.instagram.model.direct.DirectThreadKey
            if (r1 == 0) goto L_0x0486
            java.util.LinkedList r5 = new java.util.LinkedList
            r5.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x045a:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x0464
            X.DbY.A1W(r5, r2)
            goto L_0x045a
        L_0x0464:
            X.3sy r1 = r3.A08()
            java.lang.String r4 = X.C66647MaG.A09(r1)
            if (r4 == 0) goto L_0x048b
            X.NKQ r1 = r7.A06
            r3 = 1
            X.NLD r2 = r1.A04
            if (r2 == 0) goto L_0x047c
            X.Npe r1 = r2.A02
            r1.A01 = r3
            r2.notifyDataSetChanged()
        L_0x047c:
            com.instagram.common.session.UserSession r2 = r7.A05
            X.PE7 r1 = new X.PE7
            r1.<init>(r7, r6)
            X.OXI.A02(r2, r1, r4, r5)
        L_0x0486:
            r1 = 667274203(0x27c5cbdb, float:5.4899505E-15)
            goto L_0x0fa2
        L_0x048b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x0490:
            r0 = 151783804(0x90c097c, float:1.6856347E-33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.NPK r6 = (X.NPK) r6
            X.Mld r1 = r6.A01
            X.OWM r3 = X.OWM.A00
            X.Ma2 r7 = r1.A00
            com.instagram.common.session.UserSession r2 = r7.A0p()
            java.lang.String r4 = "inbox"
            r1 = 0
            r3.A00(r2, r4, r1)
            X.0eM r2 = r7.A2G
            java.lang.Object r1 = r2.getValue()
            X.Q2C r1 = (X.Q2C) r1
            boolean r1 = r1.A01()
            if (r1 == 0) goto L_0x04e7
            java.lang.Object r5 = r2.getValue()
            X.Q2C r5 = (X.Q2C) r5
            X.4DH r3 = r7.A1J
            r2 = 0
            X.P4H r1 = new X.P4H
            r1.<init>(r7, r2)
            r5.A00(r3, r1, r2)
        L_0x04ca:
            com.instagram.common.session.UserSession r2 = r6.A00
            r1 = 0
            X.0qQ.A0B(r2, r1)
            X.0Aj r2 = X.C66584MXp.A0B(r2)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x04e2
            java.lang.String r1 = "click_locked_folder"
            X.DbS.A1J(r2, r1)
            X.DbV.A1J(r2, r4)
        L_0x04e2:
            r1 = 1746119124(0x6813a9d4, float:2.7892826E24)
            goto L_0x0fa2
        L_0x04e7:
            X.4DH r1 = r7.A1J
            X.8ab r3 = X.Dba.A0H(r1)
            r1 = 2131963799(0x7f132f97, float:1.9564362E38)
            r3.A09(r1)
            r1 = 2131963797(0x7f132f95, float:1.9564358E38)
            r3.A08(r1)
            r2 = 2131963798(0x7f132f96, float:1.956436E38)
            r1 = 47
            X.OgE r1 = X.C71249OgE.A00(r7, r1)
            X.Dba.A0t(r1, r3, r2)
            goto L_0x04ca
        L_0x0506:
            r0 = -369470217(0xffffffffe9fa54f7, float:-3.7829086E25)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = -133431124(0xfffffffff80c00ac, float:-1.1358362E34)
            goto L_0x0fa2
        L_0x0517:
            r0 = 2101197129(0x7d3db949, float:1.5761634E37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.DbS.A1U(r1)
            r1 = 660686237(0x2761459d, float:3.126276E-15)
            goto L_0x0fa2
        L_0x0528:
            r0 = -137675125(0xfffffffff7cb3e8b, float:-8.2445686E33)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            com.instagram.direct.inbox.fragment.DirectSearchInboxFragment r1 = (com.instagram.direct.inbox.fragment.DirectSearchInboxFragment) r1
            X.OsH r1 = r1.A02()
            if (r1 == 0) goto L_0x053c
            r1.DDU()
        L_0x053c:
            r1 = -985213865(0xffffffffc546d457, float:-3181.2712)
            goto L_0x0fa2
        L_0x0541:
            r0 = 1615020279(0x604340f7, float:5.6278067E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.MjJ r2 = (X.C67161MjJ) r2
            X.Mle r1 = X.C67304Mle.A05
            r2.A00(r1)
            r1 = 1485354379(0x5888b58b, float:1.20250642E15)
            goto L_0x0fa2
        L_0x0556:
            r0 = 284798692(0x10f9aee4, float:9.8482644E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.OZ3 r5 = X.OZ3.A00
            java.lang.Object r4 = r1.A01
            X.NJR r4 = (X.NJR) r4
            X.0eM r1 = r4.A0F
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            r7 = 0
            r10 = 1
            r8 = r7
            r9 = r7
            r5.A01(r6, r7, r8, r9, r10)
            com.instagram.common.ui.base.IgEditText r3 = r4.A03
            android.content.Context r2 = r4.requireContext()
            r1 = 2131959538(0x7f131ef2, float:1.955572E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r1)
            X.NJR.A00(r3, r4, r1)
            r1 = -1637268390(0xffffffff9e69445a, float:-1.2349052E-20)
            goto L_0x0fa2
        L_0x0585:
            r0 = 1963126512(0x7502eef0, float:1.6597774E32)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.OZ3 r5 = X.OZ3.A00
            java.lang.Object r4 = r1.A01
            X.NJR r4 = (X.NJR) r4
            X.0eM r1 = r4.A0F
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            r7 = 0
            r9 = 1
            r8 = r7
            r10 = r7
            r5.A01(r6, r7, r8, r9, r10)
            com.instagram.common.ui.base.IgEditText r3 = r4.A02
            android.content.Context r2 = r4.requireContext()
            r1 = 2131959537(0x7f131ef1, float:1.9555717E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r1)
            X.NJR.A00(r3, r4, r1)
            r1 = 1932256499(0x732be4f3, float:1.3618872E31)
            goto L_0x0fa2
        L_0x05b4:
            r0 = 810321536(0x304c8680, float:7.4405904E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.OZ3 r5 = X.OZ3.A00
            java.lang.Object r4 = r1.A01
            X.NJR r4 = (X.NJR) r4
            X.0eM r1 = r4.A0F
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            r7 = 0
            r8 = 1
            r9 = r7
            r10 = r7
            r5.A01(r6, r7, r8, r9, r10)
            com.instagram.common.ui.base.IgEditText r3 = r4.A04
            android.content.Context r2 = r4.requireContext()
            r1 = 2131959542(0x7f131ef6, float:1.9555727E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r1)
            X.NJR.A00(r3, r4, r1)
            r1 = 1081624281(0x407846d9, float:3.8793242)
            goto L_0x0fa2
        L_0x05e3:
            r0 = 730617108(0x2b8c5514, float:9.971212E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.OZ3 r5 = X.OZ3.A00
            java.lang.Object r4 = r1.A01
            X.NJR r4 = (X.NJR) r4
            X.0eM r1 = r4.A0F
            com.instagram.common.session.UserSession r6 = X.AnonymousClass7TE.A0l(r1)
            r7 = 1
            r8 = 0
            r9 = r8
            r10 = r8
            r5.A01(r6, r7, r8, r9, r10)
            com.instagram.common.ui.base.IgEditText r3 = r4.A01
            android.content.Context r2 = r4.requireContext()
            r1 = 2131959536(0x7f131ef0, float:1.9555715E38)
            java.lang.String r1 = X.AnonymousClass7TE.A16(r2, r1)
            X.NJR.A00(r3, r4, r1)
            r1 = -1457506651(0xffffffffa92036a5, float:-3.5574533E-14)
            goto L_0x0fa2
        L_0x0612:
            r0 = 2078603496(0x7be4f8e8, float:2.3777842E36)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NJR r2 = (X.NJR) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A01
            r2.A06 = r1
            android.view.View r1 = r2.A00
            if (r1 == 0) goto L_0x0628
            X.0nA.A0N(r1)
        L_0x0628:
            X.C66582MXn.A16(r2)
            r1 = 749233973(0x2ca86735, float:4.7863055E-12)
            goto L_0x0fa2
        L_0x0630:
            r0 = -339085928(0xffffffffebc9f598, float:-4.8830775E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.NJR r6 = (X.NJR) r6
            X.0eM r1 = r6.A0F
            com.instagram.common.session.UserSession r5 = X.AnonymousClass7TE.A0l(r1)
            java.lang.Integer r1 = r6.A07
            if (r1 == 0) goto L_0x0669
            java.lang.String r2 = X.C69971NvB.A00(r1)
        L_0x0649:
            r4 = 0
            X.0qQ.A0B(r5, r4)
            java.lang.String r1 = "entry_point"
            java.util.Map r3 = X.AnonymousClass7TF.A0w(r1, r2)
            java.lang.String r2 = "customer_details_page_edit_click"
            java.lang.String r1 = ""
            X.OZ3.A00(r5, r2, r1, r3)
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            r6.A06 = r1
            X.NJR.A04(r6, r4)
            X.C66582MXn.A16(r6)
            r1 = 1068050017(0x3fa92661, float:1.3214837)
            goto L_0x0fa2
        L_0x0669:
            java.lang.String r2 = ""
            goto L_0x0649
        L_0x066c:
            r0 = -2106939712(0xffffffff826aa6c0, float:-1.723946E-37)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NOx r1 = (X.C68601NOx) r1
            X.OBd r2 = r1.A00
            X.MiA r1 = r2.A01
            X.Ma2 r1 = r1.A00
            com.instagram.common.session.UserSession r5 = r1.A0p()
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            android.app.Activity r2 = r2.A00
            r1 = 2256(0x8d0, float:3.161E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.6W8 r1 = X.AnonymousClass6W8.A03(r2, r3, r5, r4, r1)
            r1.A0C(r2)
            r1 = -1372635235(0xffffffffae2f3f9d, float:-3.9846893E-11)
            goto L_0x0fa2
        L_0x069b:
            r0 = -1901764905(0xffffffff8ea55ed7, float:-4.0766968E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Mkx r1 = (X.C67263Mkx) r1
            X.C67263Mkx.A02(r1)
            r1 = 1891669617(0x70c09671, float:4.7682396E29)
            goto L_0x0fa2
        L_0x06ae:
            r0 = 874297568(0x341cb8e0, float:1.459589E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Mkx r2 = (X.C67263Mkx) r2
            java.util.HashSet r1 = r2.A0E
            boolean r1 = X.DbT.A1b(r1)
            if (r1 == 0) goto L_0x06c9
            X.C67263Mkx.A01(r2)
        L_0x06c4:
            r1 = 1535748923(0x5b89ab3b, float:7.7500683E16)
            goto L_0x0fa2
        L_0x06c9:
            X.C67263Mkx.A03(r2)
            goto L_0x06c4
        L_0x06cd:
            r0 = -332324819(0xffffffffec31202d, float:-8.565273E26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.Mkx r5 = (X.C67263Mkx) r5
            r12 = 1
            androidx.fragment.app.FragmentActivity r6 = r5.A08
            com.instagram.common.session.UserSession r9 = r5.A0A
            X.0iw r8 = r5.A09
            X.Mky r3 = r5.A0C
            X.2EM r10 = r3.A00()
            r11 = -1
            r7 = r6
            boolean r1 = X.C71118OdC.A03(r6, r7, r8, r9, r10, r11, r12)
            if (r1 != 0) goto L_0x0738
            X.2EM r1 = r3.A00()
            X.2EU r4 = X.AnonymousClass2EU.A00
            boolean r1 = X.0qQ.A0K(r1, r4)
            if (r1 != 0) goto L_0x070d
            X.2EM r2 = r3.A00()
            X.2EL r1 = X.AnonymousClass2EL.A00
            boolean r1 = X.0qQ.A0K(r2, r1)
            if (r1 != 0) goto L_0x070d
            X.2EM r1 = r3.A00()
            boolean r1 = r1 instanceof X.2Ej
            if (r1 == 0) goto L_0x071f
        L_0x070d:
            boolean r1 = X.2El.A08(r9)
            if (r1 == 0) goto L_0x0724
            X.2EM r2 = r3.A00()
            X.PF9 r1 = new X.PF9
            r1.<init>(r5)
            X.C70886OQd.A01(r6, r9, r2, r1)
        L_0x071f:
            r1 = -625621713(0xffffffffdab5c52f, float:-2.55818882E16)
            goto L_0x0fa2
        L_0x0724:
            X.2EM r1 = r3.A00()
            boolean r4 = X.0qQ.A0K(r1, r4)
            X.Mom r3 = r5.A0B
            java.util.HashMap r2 = r5.A0D
            X.N4G r1 = new X.N4G
            r1.<init>(r4)
            r3.Cog(r1, r2)
        L_0x0738:
            r1 = 0
            X.C67263Mkx.A07(r5, r1)
            goto L_0x071f
        L_0x073d:
            r0 = 1397687178(0x534f038a, float:8.8911761E11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Mkx r1 = (X.C67263Mkx) r1
            X.C67263Mkx.A02(r1)
            r1 = 1602742835(0x5f87ea33, float:1.9587393E19)
            goto L_0x0fa2
        L_0x0750:
            r0 = -708225058(0xffffffffd5c957de, float:-2.7672403E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.Mkx r2 = (X.C67263Mkx) r2
            java.util.HashSet r1 = r2.A0E
            boolean r1 = X.DbT.A1b(r1)
            if (r1 == 0) goto L_0x076b
            X.C67263Mkx.A01(r2)
        L_0x0766:
            r1 = 1396609735(0x533e92c7, float:8.185063E11)
            goto L_0x0fa2
        L_0x076b:
            X.C67263Mkx.A03(r2)
            goto L_0x0766
        L_0x076f:
            r0 = -1788049914(0xffffffff956c8606, float:-4.7765546E-26)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NKP r1 = (X.NKP) r1
            X.NKP.A01(r1)
            r1 = -976064383(0xffffffffc5d27081, float:-6734.063)
            goto L_0x0fa2
        L_0x0782:
            r0 = -2119075582(0xffffffff81b17902, float:-6.519317E-38)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NKP r1 = (X.NKP) r1
            X.NKP.A01(r1)
            r1 = -649629555(0xffffffffd947708d, float:-3.50857945E15)
            goto L_0x0fa2
        L_0x0795:
            r0 = 1040728949(0x3e084375, float:0.13306983)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.MfU r1 = r1.A08
            X.0qQ.A0A(r2)
            r1.A06(r2)
            r1 = -1120426198(0xffffffffbd37a72a, float:-0.044837154)
            goto L_0x0fa2
        L_0x07ad:
            r0 = -825104623(0xffffffffced1e711, float:-1.76079066E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.MfU r1 = r1.A08
            r1.A02()
            r1 = -1609150853(0xffffffffa0164e7b, float:-1.2731461E-19)
            goto L_0x0fa2
        L_0x07c2:
            r0 = 130564767(0x7c8429f, float:3.0131812E-34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.MfU r3 = r1.A08
            X.0sa r1 = r3.A07
            java.lang.Object r2 = r1.invoke()
            X.Mkx r2 = (X.C67263Mkx) r2
            if (r2 == 0) goto L_0x07dd
            r1 = 0
            X.C67263Mkx.A07(r2, r1)
        L_0x07dd:
            X.Ma2 r1 = r3.A02
            android.view.View r1 = r1.A0D
            X.AnonymousClass7TF.A16(r1)
            r1 = 1414466048(0x544f0a00, float:3.55690401E12)
            goto L_0x0fa2
        L_0x07e9:
            r0 = 898975275(0x3595462b, float:1.1121787E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.MfU r1 = r1.A08
            X.0qQ.A0A(r2)
            r1.A08(r2)
            r1 = 504260570(0x1e0e67da, float:7.5388934E-21)
            goto L_0x0fa2
        L_0x0801:
            r0 = -396402604(0xffffffffe85f6054, float:-4.2194587E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.MfU r1 = r1.A08
            r1.A03()
            r1 = 742767634(0x2c45bc12, float:2.8099784E-12)
            goto L_0x0fa2
        L_0x0816:
            r0 = 2014390866(0x78112a52, float:1.177721E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.MfU r1 = r1.A08
            r1.A01()
            r1 = 133870787(0x7fab4c3, float:3.7722061E-34)
            goto L_0x0fa2
        L_0x082b:
            r0 = 749747679(0x2cb03ddf, float:5.00909E-12)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.MfU r1 = r1.A08
            r1.A00()
            r1 = -1507106479(0xffffffffa62b6151, float:-5.945943E-16)
            goto L_0x0fa2
        L_0x0840:
            r0 = 1126996489(0x432c9a09, float:172.6017)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MfT r1 = (X.C66934MfT) r1
            X.MfU r1 = r1.A08
            com.instagram.common.session.UserSession r4 = r1.A01
            X.4DH r1 = r1.A00
            androidx.fragment.app.FragmentActivity r3 = r1.requireActivity()
            X.Nml r1 = X.C69503Nml.A03
            java.lang.String r2 = r1.toString()
            r1 = 0
            X.C49951FGg.A00(r3, r1, r4, r2, r1)
            r1 = -693765084(0xffffffffd6a5fc24, float:-9.1251177E13)
            goto L_0x0fa2
        L_0x0864:
            r0 = 1936570486(0x736db876, float:1.8834162E31)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MjR r1 = (X.C67169MjR) r1
            X.MjD r1 = r1.A02
            X.Ma2 r1 = r1.A00
            X.4DH r1 = r1.A1J
            android.content.Context r1 = r1.requireContext()
            X.AnonymousClass0oH.A00(r1)
            r1 = 981218392(0x3a7c3458, float:9.620837E-4)
            goto L_0x0fa2
        L_0x0881:
            r0 = 764161038(0x2d8c2c0e, float:1.5935721E-11)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MjR r1 = (X.C67169MjR) r1
            X.MjD r1 = r1.A02
            X.Ma2 r1 = r1.A00
            X.C66633Ma2.A0Q(r1)
            r1 = -341323501(0xffffffffeba7d113, float:-4.0575587E26)
            goto L_0x0fa2
        L_0x0898:
            r0 = 1462024273(0x5724b851, float:1.8111154E14)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.MjR r1 = (X.C67169MjR) r1
            X.MjD r1 = r1.A02
            X.Ma2 r1 = r1.A00
            X.Moi r5 = r1.A0b
            if (r5 == 0) goto L_0x08d6
            com.instagram.common.session.UserSession r4 = r5.A03
            X.Mle r1 = r5.A00
            X.48q r1 = r1.A01
            java.lang.String r3 = r1.A00
            X.AnonymousClass7TG.A1N(r4, r3)
            X.0kM r2 = new X.0kM
            r2.<init>(r4)
            java.lang.String r1 = "direct_inbox"
            X.0wc r2 = X.C66580MXl.A0N(r2, r1)
            java.lang.String r1 = "direct_thread_action"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            java.lang.String r1 = "selected_filter"
            r2.AAJ(r1, r3)
            java.lang.String r1 = "inbox_button"
            X.DbV.A1G(r2, r1)
            X.Mle r1 = X.C67304Mle.A05
            r5.A02(r1)
        L_0x08d6:
            r1 = -1061275222(0xffffffffc0be39aa, float:-5.944539)
            goto L_0x0fa2
        L_0x08db:
            r0 = 919107471(0x36c8778f, float:5.974383E-6)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Mbk r1 = (X.C66739Mbk) r1
            X.PxD r1 = r1.A04
            r1.EB8()
            r1 = 984630072(0x3ab04338, float:0.0013447767)
            goto L_0x0fa2
        L_0x08f0:
            r0 = 1130688737(0x4364f0e1, float:228.94093)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.Mjc r1 = (X.C67180Mjc) r1
            X.MjO r1 = r1.A00
            X.Ma2 r4 = r1.A00
            X.0eM r1 = r4.A1i
            java.lang.Object r3 = r1.getValue()
            X.6cm r3 = (X.C311496cm) r3
            X.4DH r6 = r4.A1J
            java.lang.String r2 = r6.getModuleName()
            r11 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r11)
            r9 = 0
            r3.A02(r1, r9, r2, r9)
            com.instagram.common.session.UserSession r8 = r4.A0p()
            X.FGL r5 = new X.FGL
            r7 = r6
            r10 = r9
            r5.<init>(r6, r7, r8, r9, r10)
            X.EX9 r9 = X.EX9.DIRECT_INBOX
            X.Ozj r8 = new X.Ozj
            r8.<init>(r4)
            r10 = 1
            r7 = r5
            r12 = r11
            r7.A05(r8, r9, r10, r11, r12)
            r1 = 129734134(0x7bb95f6, float:2.8224772E-34)
            goto L_0x0fa2
        L_0x0933:
            r0 = 1755075188(0x689c5274, float:5.9056813E24)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r6 = r1.A01
            X.NKN r6 = (X.NKN) r6
            X.0eM r1 = r6.A0O
            java.lang.Object r1 = r1.getValue()
            X.Mu2 r1 = (X.C67749Mu2) r1
            X.OLv r7 = r1.A04
            if (r7 == 0) goto L_0x0961
            boolean r1 = r7 instanceof X.C68750NVk
            if (r1 == 0) goto L_0x0969
            X.NVk r7 = (X.C68750NVk) r7
            java.lang.String r1 = r7.A09
            if (r1 == 0) goto L_0x0961
            X.4Cq r4 = r7.A06
            r3 = 0
            r2 = 49
            X.MFz r1 = new X.MFz
            r1.<init>(r7, r3, r2)
            X.AnonymousClass7TE.A1Z(r1, r4)
        L_0x0961:
            X.DbZ.A17(r6)
            r1 = -1489319232(0xffffffffa73acac0, float:-2.5922596E-15)
            goto L_0x0fa2
        L_0x0969:
            boolean r1 = r7 instanceof X.C68749NVj
            if (r1 == 0) goto L_0x0961
            X.NVj r7 = (X.C68749NVj) r7
            java.lang.String r3 = r7.A08
            if (r3 == 0) goto L_0x0961
            X.Ne1 r2 = r7.A04
            r1 = 0
            java.lang.String r4 = ""
            r2.A02(r3, r1, r4)
            com.instagram.common.session.UserSession r3 = r7.A02
            X.1Ng r2 = X.AnonymousClass1Nd.A00(r3)
            X.Osc r1 = new X.Osc
            r1.<init>()
            r2.A00(r1)
            X.C69875Ntd.A00(r3, r4)
            X.0eM r1 = r7.A09
            java.lang.Object r5 = r1.getValue()
            X.FYv r5 = (X.C50338FYv) r5
            X.NjJ r2 = r7.A03
            X.0wc r1 = r5.A02
            X.1Ln r4 = X.1Ln.A0F(r1)
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x0961
            java.lang.String r1 = X.C50338FYv.A02(r2)
            if (r1 == 0) goto L_0x0961
            X.NjJ r1 = X.C69318NjJ.NOTIFICATION
            if (r2 != r1) goto L_0x0961
            java.util.HashMap r3 = X.AnonymousClass7TE.A1E()
            java.lang.String r2 = "entrypoint"
            java.lang.String r1 = "notification"
            r3.put(r2, r1)
            X.C50338FYv.A04(r4, r5)
            java.lang.String r1 = "decline_invite"
            X.DbV.A1M(r4, r1)
            java.lang.String r1 = "join_bottom_sheet"
            r4.A0p(r1)
            java.lang.String r1 = "direct_invite"
            X.Dba.A1E(r4, r1)
            r4.A0w(r3)
            r4.Cgf()
            goto L_0x0961
        L_0x09d0:
            r0 = 1334957132(0x4f91d44c, float:4.8932188E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NKN r1 = (X.NKN) r1
            X.0eM r1 = r1.A0O
            java.lang.Object r1 = r1.getValue()
            X.Mu2 r1 = (X.C67749Mu2) r1
            X.OLv r14 = r1.A04
            if (r14 == 0) goto L_0x0a1a
            X.05G r3 = r1.A0D
        L_0x09e9:
            java.lang.Object r2 = r3.getValue()
            X.NVo r1 = X.C68754NVo.A00
            boolean r1 = r3.AIY(r2, r1)
            if (r1 == 0) goto L_0x09e9
            boolean r1 = r14 instanceof X.C68750NVk
            if (r1 == 0) goto L_0x0aa3
            X.NVk r14 = (X.C68750NVk) r14
            com.instagram.common.session.UserSession r1 = r14.A03
            X.17i r3 = X.17h.A00(r1)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r2 = r14.A07
            java.lang.Long r1 = r2.A04
            java.lang.String r1 = java.lang.String.valueOf(r1)
            com.instagram.user.model.User r6 = r3.A02(r1)
            boolean r1 = r2.A0G
            if (r1 == 0) goto L_0x0a1f
            X.OMD r3 = r14.A06
        L_0x0a13:
            if (r3 == 0) goto L_0x0a1a
        L_0x0a15:
            java.lang.String r1 = r2.A0A
            r3.A01(r1)
        L_0x0a1a:
            r1 = -531928015(0xffffffffe04b6c31, float:-5.863258E19)
            goto L_0x0fa2
        L_0x0a1f:
            boolean r3 = r14.A00()
            X.0eM r1 = r14.A0A
            java.lang.Object r9 = r1.getValue()
            X.FYu r9 = (X.C50337FYu) r9
            if (r3 == 0) goto L_0x0a62
            X.NjJ r1 = r14.A04
            X.0eP r1 = X.C50337FYu.A00(r1)
            if (r1 == 0) goto L_0x0a45
            java.lang.Object r8 = r1.A00
            X.EZo r8 = (X.C48146EZo) r8
            java.lang.Object r7 = r1.A01
            X.EZp r7 = (X.C48147EZp) r7
            r12 = 0
            java.lang.String r10 = "follow_to_join_chat_sheet_rendered"
            java.lang.String r11 = "tap"
            X.C50337FYu.A01(r7, r8, r9, r10, r11, r12)
        L_0x0a45:
            if (r6 == 0) goto L_0x0a1a
            X.OMD r1 = r14.A06
            if (r1 == 0) goto L_0x0a1a
            java.lang.String r5 = r2.A0A
            r4 = 1
            X.Mu2 r1 = r1.A00
            X.05G r3 = r1.A0E
        L_0x0a52:
            java.lang.Object r2 = r3.getValue()
            X.NVw r1 = new X.NVw
            r1.<init>(r6, r5, r4)
            boolean r1 = r3.AIY(r2, r1)
            if (r1 == 0) goto L_0x0a52
            goto L_0x0a1a
        L_0x0a62:
            boolean r2 = r14.A00
            X.NjJ r1 = r14.A04
            X.0eP r1 = X.C50337FYu.A00(r1)
            if (r1 == 0) goto L_0x0a85
            java.lang.Object r8 = r1.A00
            X.EZo r8 = (X.C48146EZo) r8
            java.lang.Object r7 = r1.A01
            X.EZp r7 = (X.C48147EZp) r7
            if (r2 == 0) goto L_0x0a9d
            java.lang.String r2 = "True"
        L_0x0a78:
            java.lang.String r1 = "follow_to_join"
            java.util.Map r12 = X.AnonymousClass7TF.A0w(r1, r2)
            java.lang.String r10 = "thread_join"
            java.lang.String r11 = "tap"
            X.C50337FYu.A01(r7, r8, r9, r10, r11, r12)
        L_0x0a85:
            X.Ne1 r5 = r14.A05
            X.N49 r4 = r14.A00
            X.N49 r3 = r14.A02
            X.N49 r2 = r14.A01
            r1 = 0
            X.0r6 r3 = r5.A00(r4, r3, r2, r1)
            if (r3 == 0) goto L_0x0aa0
            X.4Cq r2 = r14.A06
            r1 = 28
            X.C73568Pfp.A02(r3, r14, r2, r1)
            goto L_0x0a1a
        L_0x0a9d:
            java.lang.String r2 = "False"
            goto L_0x0a78
        L_0x0aa0:
            X.OMD r1 = r14.A06
            goto L_0x0afe
        L_0x0aa3:
            boolean r1 = r14 instanceof X.C68749NVj
            if (r1 == 0) goto L_0x0acb
            X.NVj r14 = (X.C68749NVj) r14
            boolean r1 = r14.A0B
            if (r1 == 0) goto L_0x0ab5
            X.OMD r3 = r14.A05
            if (r3 == 0) goto L_0x0a1a
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r2 = r14.A06
            goto L_0x0a15
        L_0x0ab5:
            X.Ne1 r4 = r14.A04
            X.N49 r3 = r14.A00
            X.N49 r2 = r14.A01
            r1 = 0
            X.0r6 r3 = r4.A00(r3, r2, r1, r1)
            if (r3 == 0) goto L_0x0afc
            X.4Cq r2 = r14.A06
            r1 = 27
            X.C73568Pfp.A02(r3, r14, r2, r1)
            goto L_0x0a1a
        L_0x0acb:
            boolean r1 = r14 instanceof X.C68748NVi
            if (r1 == 0) goto L_0x0b0e
            X.NVi r14 = (X.C68748NVi) r14
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r2 = r14.A05
            boolean r1 = r2.A0G
            if (r1 != 0) goto L_0x0b0a
            java.lang.String r1 = r2.A0A
            if (r1 == 0) goto L_0x0ae1
            int r1 = r1.length()
            if (r1 != 0) goto L_0x0b0a
        L_0x0ae1:
            X.Ne1 r5 = r14.A03
            X.N49 r4 = r14.A00
            X.N49 r3 = r14.A01
            r2 = 0
            java.lang.String r1 = r14.A06
            X.0r6 r3 = r5.A00(r4, r3, r2, r1)
            if (r3 == 0) goto L_0x0af9
            X.4Cq r2 = r14.A06
            r1 = 26
            X.C73568Pfp.A02(r3, r14, r2, r1)
            goto L_0x0a1a
        L_0x0af9:
            X.OMD r1 = r14.A04
            goto L_0x0afe
        L_0x0afc:
            X.OMD r1 = r14.A05
        L_0x0afe:
            if (r1 == 0) goto L_0x0a1a
            r2 = 2131963207(0x7f132d47, float:1.956316E38)
            X.Mu2 r1 = r1.A00
            X.C67749Mu2.A00(r1, r2)
            goto L_0x0a1a
        L_0x0b0a:
            X.OMD r3 = r14.A04
            goto L_0x0a13
        L_0x0b0e:
            X.NVl r14 = (X.C68751NVl) r14
            com.instagram.direct.request.response.GroupLinkPreviewResponse$BroadcastThreadGroupLinkPreviewInfo r15 = r14.A04
            if (r15 == 0) goto L_0x0a1a
            boolean r1 = r14.A00()
            if (r1 == 0) goto L_0x0b51
            com.instagram.common.session.UserSession r1 = r14.A00
            X.17i r2 = X.17h.A00(r1)
            java.lang.String r1 = r15.A02
            com.instagram.user.model.User r6 = r2.A02(r1)
            X.0eM r1 = r14.A07
            X.6gx r4 = X.DbZ.A0R(r1)
            int r3 = r15.A00
            X.NjJ r2 = r14.A01
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r1 = r14.A05
            java.lang.String r5 = r1.A0A
            r4.A0F(r2, r5, r3)
            if (r6 == 0) goto L_0x0b51
            X.OMD r1 = r14.A03
            if (r1 == 0) goto L_0x0b51
            r4 = 0
            X.Mu2 r1 = r1.A00
            X.05G r3 = r1.A0E
        L_0x0b42:
            java.lang.Object r2 = r3.getValue()
            X.NVw r1 = new X.NVw
            r1.<init>(r6, r5, r4)
            boolean r1 = r3.AIY(r2, r1)
            if (r1 == 0) goto L_0x0b42
        L_0x0b51:
            boolean r1 = r14.A09
            if (r1 == 0) goto L_0x0a1a
            X.OIo r1 = X.C69318NjJ.A00
            X.NjJ r6 = r14.A01
            boolean r1 = r1.A00(r6)
            if (r1 == 0) goto L_0x0a1a
            boolean r1 = r15.A03
            if (r1 != 0) goto L_0x0ba5
            int r2 = r6.ordinal()
            r1 = 3
            if (r2 == r1) goto L_0x0ba2
            r1 = 1
            if (r2 == r1) goto L_0x0b9f
            r1 = 183(0xb7, float:2.56E-43)
        L_0x0b6f:
            java.lang.String r5 = X.C273654mx.A00(r1)
        L_0x0b73:
            X.0eM r1 = r14.A07
            X.6gx r2 = X.DbZ.A0R(r1)
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r1 = r14.A05
            java.lang.String r3 = r1.A0A
            r4 = 0
            int r8 = r15.A00
            boolean r13 = r1.A0D
            r9 = 0
            r6 = r4
            r7 = r4
            r10 = r9
            r11 = r9
            r12 = r9
            r2.A0V(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            if (r3 == 0) goto L_0x0a1a
            X.4Cq r1 = r14.A06
            r18 = 37
            X.MGl r13 = new X.MGl
            r16 = r3
            r17 = r4
            r13.<init>((java.lang.Object) r14, (java.lang.Object) r15, (java.lang.String) r16, (X.AnonymousClass4D7) r17, (int) r18)
            X.AnonymousClass7TE.A1Z(r13, r1)
            goto L_0x0a1a
        L_0x0b9f:
            r1 = 254(0xfe, float:3.56E-43)
            goto L_0x0b6f
        L_0x0ba2:
            java.lang.String r5 = "inbox_search"
            goto L_0x0b73
        L_0x0ba5:
            X.0eM r1 = r14.A07
            X.6gx r5 = X.DbZ.A0R(r1)
            int r4 = r15.A00
            com.instagram.direct.request.response.GroupLinkPreviewResponse$Success r1 = r14.A05
            java.lang.String r3 = r1.A0A
            X.1Ln r2 = X.DbT.A0J(r5)
            boolean r1 = X.DbT.A1Y(r2)
            if (r1 == 0) goto L_0x0bd5
            X.DbW.A17(r2, r5)
            java.lang.String r1 = "bc_jcs_thread_open"
            X.DbV.A1M(r2, r1)
            java.lang.String r1 = "see_broadcast_chat_button"
            r2.A0p(r1)
            java.lang.String r1 = X.C313756gx.A02(r6)
            X.DbZ.A1L(r2, r1, r4)
            r2.A0s(r3)
            r2.Cgf()
        L_0x0bd5:
            X.OMD r1 = r14.A03
            if (r1 == 0) goto L_0x0a1a
            r1.A01(r3)
            goto L_0x0a1a
        L_0x0bde:
            r0 = -110333483(0xfffffffff96c71d5, float:-7.673068E34)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NIk r1 = (X.C68447NIk) r1
            X.C68447NIk.A01(r1)
            r1 = -1278212821(0xffffffffb3d0052b, float:-9.686695E-8)
            goto L_0x0fa2
        L_0x0bf1:
            r0 = -1257307046(0xffffffffb50f045a, float:-5.3277984E-7)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r8 = r1.A01
            X.NIk r8 = (X.C68447NIk) r8
            X.7I3 r1 = r8.A08
            if (r1 == 0) goto L_0x0c3c
            boolean r3 = r8.A0K
            boolean r7 = r8.A0J
            java.lang.String r6 = r8.A0E
            java.lang.String r5 = r8.A0L
            boolean r2 = r8.A0H
            X.0wc r1 = r1.A01
            X.1Ln r4 = X.1Ln.A0J(r1)
            X.XSV r3 = X.AnonymousClass7I3.A00(r7, r3)
            if (r2 == 0) goto L_0x0c4e
            X.Nml r2 = X.C69503Nml.A0K
        L_0x0c18:
            boolean r1 = X.DbT.A1Y(r4)
            if (r1 == 0) goto L_0x0c3c
            r1 = 27
            r4.A0Z(r1)
            r1 = 0
            r4.A0X(r1)
            java.lang.String r1 = "cancel"
            X.C66580MXl.A1L(r4, r1)
            java.lang.String r1 = "entry_point"
            r4.A0M(r2, r1)
            X.C66584MXp.A0o(r3, r4, r6, r7)
            java.lang.String r1 = "creation_session_id"
            r4.A0R(r1, r5)
            r4.Cgf()
        L_0x0c3c:
            X.ODl r1 = r8.A0C
            if (r1 == 0) goto L_0x0c49
            X.7Cf r1 = r1.A00
            X.7Pu r1 = r1.A00
            if (r1 == 0) goto L_0x0c49
            r1.A07()
        L_0x0c49:
            r1 = 718352629(0x2ad130f5, float:3.715983E-13)
            goto L_0x0fa2
        L_0x0c4e:
            X.Nml r2 = X.C69503Nml.A0L
            goto L_0x0c18
        L_0x0c51:
            r0 = 791465602(0x2f2cce82, float:1.5716675E-10)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            X.DbX.A1J(r1)
            r1 = -1934786767(0xffffffff8cad7f31, float:-2.673142E-31)
            goto L_0x0fa2
        L_0x0c64:
            r0 = 533271045(0x1fc91205, float:8.515662E-20)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.P2j r5 = (X.C72344P2j) r5
            com.instagram.common.session.UserSession r4 = r5.A03
            X.N4P r1 = r5.A04
            X.Dri r3 = X.C71123OdH.A00(r4, r1)
            androidx.fragment.app.FragmentActivity r2 = r5.A01
            X.0iw r1 = r5.A02
            X.OXA.A00(r2, r1, r4, r3)
            r1 = 1709124116(0x65df2a14, float:1.3173299E23)
            goto L_0x0fa2
        L_0x0c83:
            r0 = -693874054(0xffffffffd6a4527a, float:-9.0337071E13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.OZ2 r3 = X.OZ2.A00
            java.lang.Object r2 = r1.A01
            X.P2v r2 = (X.C72356P2v) r2
            android.content.Context r4 = r2.A00
            com.instagram.common.session.UserSession r9 = r2.A05
            androidx.fragment.app.FragmentActivity r5 = r2.A01
            X.N4P r11 = r2.A07
            X.0eM r1 = r11.A0c
            java.util.List r1 = X.JTO.A15(r1)
            java.lang.Object r12 = X.AnonymousClass7TE.A13(r1)
            X.N9q r12 = (X.C68303N9q) r12
            X.0wc r8 = r2.A04
            X.07i r6 = r2.A02
            X.0iw r7 = r2.A03
            X.G87 r13 = r2.A08
            X.Mfy r10 = r2.A06
            r3.A01(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            r1 = 791475392(0x2f2cf4c0, float:1.5730262E-10)
            goto L_0x0fa2
        L_0x0cb6:
            r0 = 2040384298(0x799dcb2a, float:1.0241391E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.P2t r2 = (X.C72354P2t) r2
            X.N4P r7 = r2.A04
            X.0eM r1 = r7.A0c
            java.util.List r1 = X.JTO.A15(r1)
            java.lang.Object r8 = X.AnonymousClass7TE.A13(r1)
            X.N9q r8 = (X.C68303N9q) r8
            X.OdB r3 = X.C71117OdB.A00
            com.instagram.common.session.UserSession r6 = r2.A03
            androidx.fragment.app.FragmentActivity r4 = r2.A01
            boolean r10 = r2.A05
            X.0iw r5 = r2.A02
            r9 = 0
            r3.A04(r4, r5, r6, r7, r8, r9, r10)
            r1 = 1554413699(0x5ca67883, float:3.74858801E17)
            goto L_0x0fa2
        L_0x0ce2:
            r0 = 543992335(0x206caa0f, float:2.0046245E-19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r3 = r1.A01
            X.P2q r3 = (X.C72351P2q) r3
            X.0wc r2 = r3.A02
            java.lang.String r1 = "direct_thread_details_click_action_privacy_safety"
            X.0Aj r2 = X.AnonymousClass7TE.A0e(r2, r1)
            boolean r1 = r2.isSampled()
            if (r1 == 0) goto L_0x0d00
            java.lang.String r1 = "report_group_chat"
            X.DbV.A1G(r2, r1)
        L_0x0d00:
            com.instagram.common.session.UserSession r4 = r3.A03
            com.instagram.direct.capabilities.Capabilities r5 = r3.A04
            X.N4P r1 = r3.A05
            X.3t3 r6 = r1.A0L
            int r7 = r1.A09
            r8 = 0
            r9 = 1
            X.NKQ r2 = X.C69941Nuh.A00(r4, r5, r6, r7, r8, r9)
            androidx.fragment.app.FragmentActivity r1 = r3.A00
            X.6Yo r2 = X.DbV.A0M(r2, r1, r4)
            X.0iw r1 = r3.A01
            java.lang.String r1 = r1.getModuleName()
            X.C66583MXo.A1G(r2, r1)
            r1 = -1679629825(0xffffffff9be2e1ff, float:-3.753461E-22)
            goto L_0x0fa2
        L_0x0d24:
            r0 = -1547291744(0xffffffffa3c633a0, float:-2.1489067E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.OZ1 r3 = X.OZ1.A00
            java.lang.Object r2 = r1.A01
            X.P2p r2 = (X.C72350P2p) r2
            com.instagram.common.session.UserSession r7 = r2.A03
            androidx.fragment.app.FragmentActivity r5 = r2.A01
            X.N4P r9 = r2.A05
            com.instagram.direct.capabilities.Capabilities r8 = r2.A04
            X.0eM r1 = r9.A0c
            java.util.List r1 = X.JTO.A15(r1)
            java.lang.Object r10 = X.AnonymousClass7TE.A13(r1)
            X.N9q r10 = (X.C68303N9q) r10
            androidx.fragment.app.Fragment r4 = r2.A00
            X.0iw r6 = r2.A02
            r3.A01(r4, r5, r6, r7, r8, r9, r10)
            r1 = -1625639471(0xffffffff9f1ab5d1, float:-3.2761163E-20)
            goto L_0x0fa2
        L_0x0d51:
            r0 = -1138766800(0xffffffffbc1fcc30, float:-0.009753272)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.P2o r5 = (X.C72349P2o) r5
            android.os.Bundle r4 = X.AnonymousClass7TE.A0a()
            X.Dri r1 = r5.A03
            X.7Cl r1 = r1.A05
            int r2 = r1.A00
            java.lang.String r1 = "DIRECT_MEMBER_ADD_MODE_SELECTED"
            r4.putInt(r1, r2)
            X.NgV r3 = new X.NgV
            r3.<init>()
            X.O7K r1 = new X.O7K
            r1.<init>(r5)
            r3.A00 = r1
            androidx.fragment.app.FragmentActivity r2 = r5.A00
            com.instagram.common.session.UserSession r1 = r5.A02
            X.6Yo r1 = X.DbS.A0M(r2, r1)
            X.Dba.A0w(r4, r3, r1)
            r1 = -361492997(0xffffffffea740dfb, float:-7.376098E25)
            goto L_0x0fa2
        L_0x0d87:
            r0 = 1323405120(0x4ee18f40, float:1.89213082E9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.P2a r2 = (X.C72335P2a) r2
            r1 = 41
            X.OgE r3 = X.C71249OgE.A00(r2, r1)
            android.content.Context r1 = r2.A00
            X.8ab r2 = X.DbS.A0Y(r1)
            java.lang.String r1 = "Are You Sure?"
            r2.A05 = r1
            java.lang.String r1 = "If you only intend to try e2ee messaging, please try \"Send with Armadillo Express\" toggle."
            r2.A0q(r1)
            r1 = 2131956706(0x7f1313e2, float:1.9549975E38)
            r2.A0K(r3, r1)
            X.Off r1 = X.C71214Off.A00
            r2.A0C(r1)
            r1 = 1
            X.AnonymousClass7TH.A0a(r2, r1)
            r1 = -1576271735(0xffffffffa20c0089, float:-1.8973821E-18)
            goto L_0x0fa2
        L_0x0dbb:
            r0 = 1610358393(0x5ffc1e79, float:3.6334182E19)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.P2T r1 = (X.P2T) r1
            X.O7A r1 = r1.A00
            if (r1 == 0) goto L_0x0df9
            X.NJl r4 = r1.A00
            X.N4P r3 = r4.A01
            if (r3 == 0) goto L_0x0df6
            X.0eM r1 = r4.A0G
            java.lang.Object r2 = r1.getValue()
            X.OBy r2 = (X.C70576OBy) r2
            int r13 = r3.A06()
            X.3t3 r1 = r3.A0L
            java.lang.String r10 = X.C66580MXl.A0x(r1)
            java.lang.String r11 = r3.A0Q
            X.0eM r1 = r2.A01
            X.6gx r5 = X.DbZ.A0R(r1)
            java.lang.String r6 = "emoji_moderation_bottom_sheet_rendered"
            java.lang.String r7 = "tap"
            java.lang.String r8 = "manage_hidden_reactions_section"
            java.lang.String r9 = "thread_channel_controls"
            r12 = 0
            r5.A0W(r6, r7, r8, r9, r10, r11, r12, r13)
        L_0x0df6:
            X.C68473NJl.A00(r4)
        L_0x0df9:
            r1 = -154133222(0xfffffffff6d01d1a, float:-2.1105234E33)
            goto L_0x0fa2
        L_0x0dfe:
            r0 = 713755186(0x2a8b0a32, float:2.4698434E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r4 = r1.A01
            X.P2y r4 = (X.C72359P2y) r4
            X.N4P r1 = r4.A06
            X.3sy r1 = r1.A08()
            java.lang.String r2 = X.C66647MaG.A09(r1)
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            java.lang.String r1 = "direct_thread_key"
            r3.putString(r1, r2)
            androidx.fragment.app.FragmentActivity r2 = r4.A01
            com.instagram.common.session.UserSession r1 = r4.A02
            X.6Yo r2 = X.DbS.A0M(r2, r1)
            com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment r1 = new com.instagram.debug.devoptions.direct.burner.BurnerSendThreadDetailsFragment
            r1.<init>()
            X.Dba.A0w(r3, r1, r2)
            r1 = -914031884(0xffffffffc984faf4, float:-1089374.5)
            goto L_0x0fa2
        L_0x0e31:
            r0 = -1864974096(0xffffffff90d6c0f0, float:-8.4705384E-29)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NVe r1 = (X.C68744NVe) r1
            X.0sa r1 = r1.A06
            r1.invoke()
            r1 = -150424360(0xfffffffff708b4d8, float:-2.7727356E33)
            goto L_0x0fa2
        L_0x0e46:
            r0 = -1322732740(0xffffffffb128b33c, float:-2.45491E-9)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NJY r2 = (X.NJY) r2
            X.NmZ r1 = X.C69491NmZ.PRIVACY_CONTROL
            X.NJY.A05(r1, r2)
            X.NJm r1 = X.NJY.A02(r2)
            X.C66584MXp.A0l(r1, r2)
            r1 = -1624360655(0xffffffff9f2e3931, float:-3.689324E-20)
            goto L_0x0fa2
        L_0x0e62:
            r0 = -1098784045(0xffffffffbe81e2d3, float:-0.25368366)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJY r1 = (X.NJY) r1
            X.NJY.A0A(r1)
            r1 = 1167911247(0x459ce94f, float:5021.1636)
            goto L_0x0fa2
        L_0x0e75:
            r0 = -1895143629(0xffffffff8f0a6733, float:-6.823801E-30)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJY r1 = (X.NJY) r1
            X.NJY.A09(r1)
            r1 = -588789637(0xffffffffdce7c87b, float:-5.21929202E17)
            goto L_0x0fa2
        L_0x0e88:
            r0 = -1419612204(0xffffffffab626fd4, float:-8.044652E-13)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJY r1 = (X.NJY) r1
            X.NJY.A06(r1)
            r1 = 1537294623(0x5ba1411f, float:9.0778145E16)
            goto L_0x0fa2
        L_0x0e9b:
            r0 = 1547118814(0x5c3728de, float:2.06219419E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r2 = r1.A01
            X.NJY r2 = (X.NJY) r2
            X.NmZ r1 = X.C69491NmZ.PEOPLE
            X.NJY.A05(r1, r2)
            X.NJY.A08(r2)
            r1 = 854004287(0x32e7123f, float:2.6900237E-8)
            goto L_0x0fa2
        L_0x0eb3:
            r0 = -596548181(0xffffffffdc7165ab, float:-2.71789018E17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.util.HashMap r6 = X.AnonymousClass7TE.A1E()
            java.lang.String r4 = "channel_name"
            java.lang.Object r5 = r1.A01
            X.NJY r5 = (X.NJY) r5
            X.N4P r2 = r5.A0Z
            r1 = 0
            if (r2 == 0) goto L_0x0ecb
            java.lang.String r1 = r2.A0P
        L_0x0ecb:
            java.lang.String r3 = ""
            if (r1 != 0) goto L_0x0ed0
            r1 = r3
        L_0x0ed0:
            r6.put(r4, r1)
            java.lang.String r2 = "target_id"
            X.N4P r1 = r5.A0Z
            if (r1 == 0) goto L_0x0ede
            java.lang.String r1 = r1.A0Q
            if (r1 == 0) goto L_0x0ede
            r3 = r1
        L_0x0ede:
            r6.put(r2, r3)
            java.lang.String r2 = "period"
            java.lang.String r1 = "THIS_WEEK"
            r6.put(r2, r1)
            java.lang.String r1 = "com.bloks.www.ig.insights.account.channel.insights"
            X.DiU r4 = X.C46649DiU.A04(r1, r6)
            androidx.fragment.app.FragmentActivity r3 = r5.getActivity()
            X.0eM r1 = r5.A14
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            com.instagram.bloks.hosting.IgBloksScreenConfig r2 = X.DbS.A0N(r1)
            r1 = 2131958955(0x7f131cab, float:1.9554537E38)
            java.lang.String r1 = r5.getString(r1)
            r2.A0U = r1
            r4.A0D(r3, r2)
            r1 = -1835101406(0xffffffff929e9322, float:-1.0007473E-27)
            goto L_0x0fa2
        L_0x0f0d:
            r0 = 1227048105(0x492344a9, float:668746.56)
            int r0 = X.AnonymousClass0fD.A05(r0)
            X.NKJ r4 = new X.NKJ
            r4.<init>()
            java.lang.Object r3 = r1.A01
            X.NJY r3 = (X.NJY) r3
            boolean r1 = X.NJY.A0L(r3)
            if (r1 == 0) goto L_0x0f3a
            X.7Pu r2 = X.C66582MXn.A0f(r3)
            X.0eM r1 = r3.A14
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.7Pr r1 = X.DbS.A0W(r1)
            if (r2 == 0) goto L_0x0f36
            r2.A0F(r4, r1)
        L_0x0f36:
            r1 = 1183525141(0x468b2915, float:17812.541)
            goto L_0x0fa2
        L_0x0f3a:
            X.C66584MXp.A0l(r4, r3)
            goto L_0x0f36
        L_0x0f3e:
            r0 = 2044804116(0x79e13c14, float:1.4618567E35)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r1 = r1.A01
            X.NJY r1 = (X.NJY) r1
            androidx.fragment.app.FragmentActivity r2 = r1.requireActivity()
            X.0eM r1 = r1.A14
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.6Yo r2 = X.DbS.A0M(r2, r1)
            X.NIy r1 = new X.NIy
            r1.<init>()
            r2.A0D(r1)
            java.lang.String r1 = "ThreadDetailHomePageFragment"
            X.C66583MXo.A1G(r2, r1)
            r1 = -1853765114(0xffffffff9181ca06, float:-2.0477118E-28)
            goto L_0x0fa2
        L_0x0f68:
            r0 = 612679697(0x2484c011, float:5.757125E-17)
            int r0 = X.AnonymousClass0fD.A05(r0)
            java.lang.Object r5 = r1.A01
            X.NJY r5 = (X.NJY) r5
            X.0eM r1 = r5.A14
            com.instagram.common.session.UserSession r4 = X.AnonymousClass7TE.A0l(r1)
            X.0Tu r3 = X.0Tu.A05
            r1 = 36331085407208326(0x8112ee00004386, double:3.039262932832588E-306)
            boolean r1 = X.182.A06(r3, r4, r1)
            if (r1 == 0) goto L_0x0f89
            X.NJY.A06(r5)
        L_0x0f89:
            r1 = -242940250(0xfffffffff18506a6, float:-1.3174254E30)
            goto L_0x0fa2
        L_0x0f8d:
            X.C69979NvJ.A00(r1)
            X.0eM r1 = r4.A1T
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r1)
            X.60k r2 = X.C3018660j.A01(r1)
            X.Nmo r1 = X.C69506Nmo.A08
            r2.A0C(r1)
            r1 = -686474532(0xffffffffd7153adc, float:-1.64080032E14)
        L_0x0fa2:
            X.AnonymousClass0fD.A0C(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71395Oju.onClick(android.view.View):void");
    }
}
