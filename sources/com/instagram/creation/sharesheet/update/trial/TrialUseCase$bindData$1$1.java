package com.instagram.creation.sharesheet.update.trial;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import X.C61075JwD;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.sharesheet.update.trial.TrialUseCase$bindData$1$1", f = "TrialUseCase.kt", i = {0, 0, 0}, l = {82}, m = "invokeSuspend", n = {"$this$update$iv", "prevValue$iv", "isTrialToggleEnabled"}, s = {"L$0", "L$3", "I$0"})
public final class TrialUseCase$bindData$1$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public final /* synthetic */ C61075JwD A09;
    public final /* synthetic */ TrialUseCase A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public TrialUseCase$bindData$1$1(C61075JwD jwD, TrialUseCase trialUseCase, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A09 = jwD;
        this.A0A = trialUseCase;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.creation.sharesheet.update.trial.TrialUseCase$bindData$1$1] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        return new TrialUseCase$bindData$1$1(this.A09, this.A0A, r5);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v2, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v8, resolved type: boolean} */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0082  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0084  */
    /* JADX WARNING: Removed duplicated region for block: B:6:0x0032  */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            X.1Hj r10 = X.1Hj.A02
            int r0 = r12.A02
            r9 = 1
            if (r0 == 0) goto L_0x0054
            int r8 = r12.A01
            boolean r7 = r12.A08
            int r6 = r12.A00
            java.lang.Object r5 = r12.A06
            java.lang.Object r4 = r12.A05
            X.JwD r4 = (X.C61075JwD) r4
            java.lang.Object r3 = r12.A04
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r3 = (com.instagram.creation.sharesheet.update.trial.TrialUseCase) r3
            java.lang.Object r2 = r12.A03
            X.05G r2 = (X.05G) r2
            X.0eS.A00(r13)
        L_0x001e:
            boolean r8 = X.AnonymousClass7TF.A1P(r8)
            boolean r11 = X.AnonymousClass7TE.A1a(r13)
        L_0x0026:
            r1 = 4
            X.JVq r0 = new X.JVq
            r0.<init>((boolean) r8, (boolean) r7, (boolean) r11, (int) r1)
            boolean r0 = r2.AIY(r5, r0)
            if (r0 == 0) goto L_0x0063
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r3 = r12.A0A
            X.05G r2 = r3.A06
            boolean r0 = X.DbX.A1b(r2)
            if (r0 == 0) goto L_0x0051
        L_0x003c:
            java.lang.Object r1 = r2.getValue()
            java.lang.Boolean r0 = X.AnonymousClass7TE.A0u()
            boolean r0 = r2.AIY(r1, r0)
            if (r0 == 0) goto L_0x003c
            X.4Cq r1 = r3.A04
            r0 = 41
            X.MH9.A04(r3, r1, r0)
        L_0x0051:
            X.0gF r10 = X.C60340gF.A00
            return r10
        L_0x0054:
            X.0eS.A00(r13)
            X.JwD r4 = r12.A09
            X.JwI r0 = r4.A01
            boolean r6 = X.AnonymousClass7TF.A1V(r0)
            com.instagram.creation.sharesheet.update.trial.TrialUseCase r3 = r12.A0A
            X.05G r2 = r3.A07
        L_0x0063:
            java.lang.Object r5 = r2.getValue()
            boolean r8 = X.AnonymousClass7TF.A1P(r6)
            com.instagram.common.session.UserSession r0 = r3.A00
            boolean r7 = X.LTP.A03(r0)
            X.JwI r0 = r4.A01
            if (r0 == 0) goto L_0x0084
            X.JwI r0 = r4.A01
            if (r0 == 0) goto L_0x0082
            java.lang.Object r1 = r0.A00
        L_0x007b:
            com.instagram.api.schemas.MediaTrialGraduationStrategy r0 = com.instagram.api.schemas.MediaTrialGraduationStrategy.SS_PERFORMANCE
            boolean r11 = X.AnonymousClass7TF.A1W(r1, r0)
            goto L_0x0026
        L_0x0082:
            r1 = 0
            goto L_0x007b
        L_0x0084:
            X.0eM r0 = r3.A03
            java.lang.Object r0 = X.AnonymousClass7TE.A14(r0)
            com.instagram.trials.impl.TrialsPreferencesImpl r0 = (com.instagram.trials.impl.TrialsPreferencesImpl) r0
            r12.A03 = r2
            r12.A04 = r3
            r12.A05 = r4
            r12.A06 = r5
            r12.A07 = r5
            r12.A00 = r6
            r12.A08 = r7
            r12.A01 = r8
            r12.A02 = r9
            java.lang.Object r13 = r0.A02(r12)
            if (r13 != r10) goto L_0x001e
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.sharesheet.update.trial.TrialUseCase$bindData$1$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((TrialUseCase$bindData$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
