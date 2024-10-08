package X;

import android.view.View;

/* renamed from: X.OjY  reason: case insensitive filesystem */
public final class C71374OjY implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ AnonymousClass61R A02;
    public final /* synthetic */ O6F A03;
    public final /* synthetic */ C67739Mts A04;
    public final /* synthetic */ C69365Nk5 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public C71374OjY(AnonymousClass61R r1, O6F o6f, C67739Mts mts, C69365Nk5 nk5, String str, String str2, int i, int i2) {
        this.A03 = o6f;
        this.A04 = mts;
        this.A06 = str;
        this.A07 = str2;
        this.A01 = i;
        this.A00 = i2;
        this.A05 = nk5;
        this.A02 = r1;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00df, code lost:
        if (r6 != 61) goto L_0x007a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r16) {
        /*
            r15 = this;
            r0 = -1346429425(0xffffffffafbf1e0f, float:-3.4764056E-10)
            int r2 = X.AnonymousClass0fD.A05(r0)
            X.O6F r0 = r15.A03
            if (r0 == 0) goto L_0x0045
            X.NKH r1 = r0.A00
            X.ONz r3 = r1.A06
            r6 = 0
            if (r3 != 0) goto L_0x001c
            java.lang.String r0 = "directPromptsPrivateAndSocialGroupsLogger"
        L_0x0014:
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            X.Nmf r4 = X.C69497Nmf.DICE_TAPPED
            com.instagram.direct.prompts.DirectEditAddYoursParams r0 = r1.A08
            if (r0 != 0) goto L_0x002b
            X.Nmc r5 = X.C69494Nmc.PROMPT
        L_0x0024:
            X.Mts r0 = r1.A07
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "promptNamingSuggestionsViewModel"
            goto L_0x0014
        L_0x002b:
            X.Nmc r5 = X.C69494Nmc.EDIT_FLOW
            goto L_0x0024
        L_0x002e:
            X.OBU r0 = r0.A01
            if (r0 == 0) goto L_0x0034
            java.lang.String r6 = r0.A00
        L_0x0034:
            java.lang.String r8 = r1.A0C
            com.instagram.model.direct.DirectThreadKey r0 = r1.A0A
            if (r0 != 0) goto L_0x003d
            java.lang.String r0 = "threadKey"
            goto L_0x0014
        L_0x003d:
            java.lang.String r7 = r0.A00
            r3.A00(r4, r5, r6, r7, r8)
            r0 = 1
            r1.A0E = r0
        L_0x0045:
            X.Mts r0 = r15.A04
            X.0eM r1 = r0.A06
            java.lang.Object r7 = r1.getValue()
            X.7IQ r7 = (X.AnonymousClass7IQ) r7
            java.lang.String r8 = r15.A06
            java.lang.String r9 = r15.A07
            int r6 = r15.A01
            int r5 = r15.A00
            X.Nk5 r1 = r15.A05
            int r3 = r1.A01
            com.instagram.direct.prompts.DirectPromptTypes r4 = X.AnonymousClass79B.A00(r3)
            com.instagram.direct.prompts.DirectPromptTypes r3 = com.instagram.direct.prompts.DirectPromptTypes.CHALLENGES
            if (r4 != r3) goto L_0x00d5
            X.0eM r3 = r7.A03
            X.OyR r6 = X.C66580MXl.A0T(r3)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.lang.String r10 = "challenge_dice_roll_suggested"
            java.lang.String r11 = "tap"
            java.lang.String r12 = "dice_roll_button"
            java.lang.String r13 = "challenge_null_creation_sheet"
            r5 = 0
            r14 = r5
            X.C72202OyR.A03(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14)
        L_0x007a:
            X.61R r3 = r15.A02
            r3.E2p()
            java.util.List r4 = r0.A05
            boolean r3 = X.AnonymousClass7TE.A1b(r4)
            if (r3 == 0) goto L_0x00bd
            X.Nk5 r3 = X.C69365Nk5.ADD_YOURS
            if (r1 != r3) goto L_0x00b5
            X.2SQ r1 = X.2SP.A00
            int r3 = r4.size()
            X.2SP r1 = X.2SP.A01
            int r3 = r1.A05(r3)
        L_0x0097:
            java.lang.Object r1 = r4.get(r3)
            X.OBU r1 = (X.OBU) r1
            r0.A01 = r1
            if (r1 == 0) goto L_0x00a8
            X.05G r5 = r0.A08
            java.lang.String r1 = r1.A01
        L_0x00a5:
            r5.Epw(r1)
        L_0x00a8:
            int r1 = r0.A00
            int r1 = r1 + 1
            r0.A00 = r1
        L_0x00ae:
            r0 = 835921639(0x31d326e7, float:6.145331E-9)
            X.AnonymousClass0fD.A0C(r0, r2)
            return
        L_0x00b5:
            int r3 = r0.A00
            int r1 = r4.size()
            int r3 = r3 % r1
            goto L_0x0097
        L_0x00bd:
            java.util.List r1 = r0.A02
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            if (r1 == 0) goto L_0x00ae
            X.05G r5 = r0.A08
            java.util.List r4 = r0.A02
            int r3 = r0.A00
            int r1 = r4.size()
            int r3 = r3 % r1
            java.lang.Object r1 = r4.get(r3)
            goto L_0x00a5
        L_0x00d5:
            r3 = 28
            if (r6 == r3) goto L_0x00f8
            r3 = 29
            if (r6 == r3) goto L_0x00e2
            r3 = 61
            if (r6 == r3) goto L_0x00f8
            goto L_0x007a
        L_0x00e2:
            X.OyG r6 = X.C66583MXo.A0Q(r7)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            java.util.Map r13 = X.C66584MXp.A0g(r4)
            java.lang.String r10 = "direct_question_tap_dice_roll"
            java.lang.String r11 = "tap"
            java.lang.String r12 = "prompt"
            X.C72195OyG.A00(r6, r7, r8, r9, r10, r11, r12, r13)
            goto L_0x007a
        L_0x00f8:
            X.OyH r7 = X.C66583MXo.A0R(r7)
            X.EZp r5 = X.C48147EZp.PROMPT
            X.EZo r6 = X.C48146EZo.THREAD_VIEW
            java.util.Map r10 = X.C66584MXp.A0g(r4)
            java.lang.String r8 = "direct_question_tap_dice_roll"
            java.lang.String r9 = "tap"
            X.C72196OyH.A00(r5, r6, r7, r8, r9, r10)
            goto L_0x007a
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C71374OjY.onClick(android.view.View):void");
    }
}
