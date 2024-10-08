package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;

/* renamed from: X.ONc  reason: case insensitive filesystem */
public final class C70830ONc {
    public final Activity A00;
    public final UserSession A01;
    public final C66930MfP A02;
    public final AnonymousClass0iw A03;
    public final C49341Etw A04;

    public C70830ONc(Activity activity, AnonymousClass0iw r3, UserSession userSession, C49341Etw etw) {
        0qQ.A0B(r3, 3);
        this.A01 = userSession;
        this.A00 = activity;
        this.A03 = r3;
        this.A04 = etw;
        this.A02 = new C66930MfP(userSession);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x00ca  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(X.C59832Ja7 r19, X.C69309NjA r20, X.C69365Nk5 r21, com.instagram.model.direct.DirectThreadKey r22, int r23, int r24) {
        /*
            r18 = this;
            r3 = 0
            r5 = r21
            X.0qQ.A0B(r5, r3)
            r6 = 1
            r4 = r18
            com.instagram.common.session.UserSession r0 = r4.A01
            X.0iw r1 = r4.A03
            X.7IQ r10 = X.AnonymousClass7IP.A00(r1, r0)
            r2 = r22
            java.lang.String r12 = r2.A00
            java.lang.String r13 = r2.A01
            java.lang.String r1 = r5.toString()
            java.lang.String r1 = X.AnonymousClass7TF.A0j(r1)
            com.instagram.direct.prompts.DirectPromptTypes r8 = X.AnonymousClass79B.A01(r1)
            r9 = 28
            r1 = r23
            r7 = r24
            if (r1 == r9) goto L_0x00a3
            r9 = 29
            if (r1 == r9) goto L_0x007b
            r9 = 61
            if (r1 == r9) goto L_0x00a3
            X.0eM r9 = r10.A05
            java.lang.Object r11 = r9.getValue()
            X.ONz r11 = (X.C70846ONz) r11
            r10 = 0
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r3)
            r11.A03(r8, r9, r10)
        L_0x0043:
            int r9 = r5.ordinal()
            r8 = 2
            if (r9 != r8) goto L_0x00ca
            X.0xa r9 = X.AnonymousClass7TE.A0q(r0)
            java.lang.String r8 = "broadcast_channel_challenges_nux"
            boolean r8 = r9.getBoolean(r8, r3)
            if (r8 != 0) goto L_0x00ca
            X.P1H r9 = new X.P1H
            r12 = r2
            r13 = r1
            r14 = r7
            r10 = r5
            r11 = r4
            r9.<init>(r10, r11, r12, r13, r14)
            r10 = 0
            X.NjA r8 = X.C69309NjA.COMPOSER
            r11 = r10
            r12 = r10
            r13 = r6
            r7 = r0
            X.NJH r2 = X.OPE.A00(r7, r8, r9, r10, r11, r12, r13)
            X.7Pr r0 = X.DbX.A0e(r0, r3)
            r0.A1P = r6
            X.7Pu r1 = r0.A00()
            android.app.Activity r0 = r4.A00
            r1.A02(r0, r2)
            return
        L_0x007b:
            X.OyG r10 = X.C66583MXo.A0Q(r10)
            com.instagram.direct.prompts.DirectPromptTypes r9 = com.instagram.direct.prompts.DirectPromptTypes.QUESTIONS
            if (r8 != r9) goto L_0x0093
            java.lang.Integer r11 = java.lang.Integer.valueOf(r7)
            r17 = 0
            java.lang.String r14 = "direct_composer_tap_question"
            java.lang.String r15 = "tap"
            java.lang.String r16 = "ama_questions_button"
            X.C72195OyG.A00(r10, r11, r12, r13, r14, r15, r16, r17)
            goto L_0x0043
        L_0x0093:
            X.0wb r10 = X.0wb.A01
            java.lang.String r9 = "Invalid prompt type "
            java.lang.String r8 = r8.A01
            java.lang.String r9 = X.002.A0R(r9, r8)
            java.lang.String r8 = "prompt_broadcast_logger"
            r10.Ew0(r8, r9)
            goto L_0x0043
        L_0x00a3:
            X.OyH r10 = X.C66583MXo.A0R(r10)
            com.instagram.direct.prompts.DirectPromptTypes r9 = com.instagram.direct.prompts.DirectPromptTypes.QUESTIONS
            if (r8 != r9) goto L_0x00b8
            X.EZp r8 = X.C48147EZp.AMA_QUESTIONS_BUTTON
            X.EZo r9 = X.C48146EZo.THREAD_VIEW
            r13 = 0
            java.lang.String r11 = "direct_composer_tap_question"
            java.lang.String r12 = "tap"
            X.C72196OyH.A00(r8, r9, r10, r11, r12, r13)
            goto L_0x0043
        L_0x00b8:
            X.0wj r11 = X.0wj.A01
            r10 = 20134884(0x1333be4, float:3.2920077E-38)
            java.lang.String r9 = "Invalid prompt type "
            java.lang.String r8 = r8.A01
            java.lang.String r8 = X.002.A0R(r9, r8)
            r11.AEf(r8, r10)
            goto L_0x0043
        L_0x00ca:
            X.Nk5 r3 = X.C69365Nk5.CHALLENGES
            r8 = r20
            if (r5 != r3) goto L_0x0105
            X.78w r3 = X.C3269778w.A00
            r6 = r19
            boolean r3 = r3.A02(r6, r0, r2)
            if (r3 == 0) goto L_0x0105
            android.os.Bundle r6 = X.DbV.A0A(r0)
            java.lang.String r3 = "direct_thread_key"
            r6.putParcelable(r3, r2)
            java.lang.String r2 = "prompts_tab"
            r6.putSerializable(r2, r5)
            java.lang.String r2 = "direct_thread_sub_type"
            r6.putInt(r2, r1)
            java.lang.String r1 = "direct_thread_audience_type"
            r6.putInt(r1, r7)
            if (r20 == 0) goto L_0x00f9
            java.lang.String r1 = "prompts_entry_point"
            r6.putSerializable(r1, r8)
        L_0x00f9:
            android.app.Activity r2 = r4.A00
            r1 = 2249(0x8c9, float:3.152E-42)
            java.lang.String r1 = X.C273654mx.A00(r1)
            X.DbY.A0u(r2, r6, r0, r1)
            return
        L_0x0105:
            r9 = r5
            r10 = r2
            r11 = r1
            r12 = r7
            r7 = r4
            r7.A02(r8, r9, r10, r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70830ONc.A00(X.Ja7, X.NjA, X.Nk5, com.instagram.model.direct.DirectThreadKey, int, int):void");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x0077: MOVE  (r3v2 androidx.core.app.ComponentActivity) = (r4v1 androidx.core.app.ComponentActivity)
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void A02(X.C69309NjA r9, X.C69365Nk5 r10, com.instagram.model.direct.DirectThreadKey r11, int r12, int r13) {
        /*
            r8 = this;
            r0 = 0
            X.0qQ.A0B(r10, r0)
            r4 = 1
            android.os.Bundle r3 = X.AnonymousClass7TE.A0a()
            com.instagram.common.session.UserSession r2 = r8.A01
            X.AnonymousClass0Dg.A00(r3, r2)
            java.lang.String r0 = "direct_thread_key"
            r3.putParcelable(r0, r11)
            java.lang.String r0 = "prompts_tab"
            r3.putSerializable(r0, r10)
            java.lang.String r0 = "direct_thread_sub_type"
            r3.putInt(r0, r12)
            java.lang.String r0 = "direct_thread_audience_type"
            r3.putInt(r0, r13)
            if (r9 == 0) goto L_0x0029
            java.lang.String r0 = "prompts_entry_point"
            r3.putSerializable(r0, r9)
        L_0x0029:
            r0 = 2
            int r1 = r10.ordinal()
            if (r1 == r0) goto L_0x005a
            if (r1 == r4) goto L_0x0054
            r0 = 3
            if (r1 != r0) goto L_0x008e
            X.NVX r7 = new X.NVX
            r7.<init>()
        L_0x003a:
            r7.setArguments(r3)
            X.Nk5 r0 = X.C69365Nk5.CHALLENGES
            if (r10 == r0) goto L_0x0051
            X.Nk5 r0 = X.C69365Nk5.DAILY_PROMPT
            if (r10 != r0) goto L_0x0060
            r0 = 650(0x28a, float:9.11E-43)
        L_0x0047:
            java.lang.String r1 = X.C273654mx.A00(r0)
            android.app.Activity r0 = r8.A00
            X.DbY.A0u(r0, r3, r2, r1)
            return
        L_0x0051:
            r0 = 649(0x289, float:9.1E-43)
            goto L_0x0047
        L_0x0054:
            X.NVV r7 = new X.NVV
            r7.<init>()
            goto L_0x003a
        L_0x005a:
            X.NVW r7 = new X.NVW
            r7.<init>()
            goto L_0x003a
        L_0x0060:
            X.7Pr r1 = X.DbX.A0e(r2, r4)
            r1.A0T = r7
            r0 = 1065353216(0x3f800000, float:1.0)
            r1.A03 = r0
            X.7Pu r6 = r1.A00()
            X.Etw r5 = r8.A04
            android.app.Activity r4 = r8.A00
            boolean r0 = r4 instanceof androidx.fragment.app.FragmentActivity
            if (r0 == 0) goto L_0x008a
            r3 = r4
            androidx.core.app.ComponentActivity r3 = (androidx.core.app.ComponentActivity) r3
            if (r3 == 0) goto L_0x008a
            X.0hq r2 = X.AnonymousClass37E.A00(r4)
            r0 = 4
            X.FQm r1 = new X.FQm
            r1.<init>(r5, r0)
            java.lang.String r0 = "DirectPromptsFragment.CONVERSATION_STARTERS_QUESTIONS_PROMPT_REQUEST_KEY"
            r2.A0v(r1, r3, r0)
        L_0x008a:
            r6.A02(r4, r7)
            return
        L_0x008e:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C70830ONc.A02(X.NjA, X.Nk5, com.instagram.model.direct.DirectThreadKey, int, int):void");
    }

    public final void A01(C69309NjA njA, C69365Nk5 nk5, AnonymousClass914 r16, 2Er r17, DirectThreadKey directThreadKey) {
        AnonymousClass914 r7 = r16;
        boolean A1Z = DbW.A1Z(r7);
        UserSession userSession = this.A01;
        int i = 2131958870;
        if (AnonymousClass7K4.A02(userSession)) {
            i = 2131958869;
        }
        int i2 = 2131958863;
        if (AnonymousClass7K4.A02(userSession)) {
            i2 = 2131958862;
        }
        Activity activity = this.A00;
        C358248ab A0X = DbS.A0X(activity);
        DbT.A19(activity, A0X, i);
        2Er r12 = r17;
        A0X.A0R(new C71185Of3(8, this, r12, r7), C358278ae.BLUE_BOLD, 2131958864);
        A0X.A0G(new FIh(2, njA, directThreadKey, nk5, r12, this), i2);
        A0X.A0C(new C71183Of1(16, r12, this));
        AnonymousClass7TH.A0a(A0X, A1Z);
    }
}
