package com.instagram.creation.genai.themes.domain;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C53032GhN;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.creation.genai.themes.domain.AiThemesViewModel$onExamplePromptClicked$1", f = "AiThemesViewModel.kt", i = {0, 0, 0, 0}, l = {209}, m = "invokeSuspend", n = {"$this$launch", "promptTrimmed", "stringBuffer", "i"}, s = {"L$0", "L$1", "L$2", "I$0"})
public final class AiThemesViewModel$onExamplePromptClicked$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ C53032GhN A06;
    public final /* synthetic */ String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiThemesViewModel$onExamplePromptClicked$1(C53032GhN ghN, String str, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A07 = str;
        this.A06 = ghN;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.creation.genai.themes.domain.AiThemesViewModel$onExamplePromptClicked$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        ? aiThemesViewModel$onExamplePromptClicked$1 = new AiThemesViewModel$onExamplePromptClicked$1(this.A06, this.A07, r5);
        aiThemesViewModel$onExamplePromptClicked$1.A05 = obj;
        return aiThemesViewModel$onExamplePromptClicked$1;
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.creation.genai.themes.domain.AiThemesViewModel$onExamplePromptClicked$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x00a0 A[Catch:{ all -> 0x00d7 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            X.1Hj r9 = X.1Hj.A02
            int r0 = r11.A02
            if (r0 == 0) goto L_0x001b
            int r4 = r11.A01
            int r8 = r11.A00
            java.lang.Object r7 = r11.A04
            java.lang.StringBuffer r7 = (java.lang.StringBuffer) r7
            java.lang.Object r5 = r11.A03
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r6 = r11.A05
            X.4Cq r6 = (X.C262224Cq) r6
            X.0eS.A00(r12)     // Catch:{ all -> 0x00d7 }
            goto L_0x009e
        L_0x001b:
            X.0eS.A00(r12)
            java.lang.Object r6 = r11.A05
            X.4Cq r6 = (X.C262224Cq) r6
            java.lang.String r1 = r11.A07
            java.lang.String r0 = "\""
            r10 = 0
            X.0qQ.A0B(r1, r10)
            java.lang.String r5 = X.00l.A0E(r0, r0, r1)
            X.GhN r8 = r11.A06     // Catch:{ all -> 0x00d7 }
            X.05G r7 = r8.A0H     // Catch:{ all -> 0x00d7 }
        L_0x0032:
            java.lang.Object r4 = r7.getValue()     // Catch:{ all -> 0x00d7 }
            r0 = r4
            X.GnN r0 = (X.C53390GnN) r0     // Catch:{ all -> 0x00d7 }
            X.HM3 r3 = r0.A01     // Catch:{ all -> 0x00d7 }
            java.util.List r2 = r0.A03     // Catch:{ all -> 0x00d7 }
            float r1 = r0.A00     // Catch:{ all -> 0x00d7 }
            java.lang.Integer r0 = r0.A02     // Catch:{ all -> 0x00d7 }
            X.GnN r0 = X.C53390GnN.A01(r3, r0, r2, r1, r10)     // Catch:{ all -> 0x00d7 }
            boolean r0 = r7.AIY(r4, r0)     // Catch:{ all -> 0x00d7 }
            if (r0 == 0) goto L_0x0032
            java.lang.StringBuffer r7 = new java.lang.StringBuffer     // Catch:{ all -> 0x00d7 }
            r7.<init>()     // Catch:{ all -> 0x00d7 }
            X.5Oz r1 = r8.A09     // Catch:{ all -> 0x00d7 }
            java.lang.String r0 = X.DbT.A10(r7)     // Catch:{ all -> 0x00d7 }
            X.5Tl r0 = X.C51967G9n.A0L(r0)     // Catch:{ all -> 0x00d7 }
            r1.Epw(r0)     // Catch:{ all -> 0x00d7 }
            int r0 = r5.length()     // Catch:{ all -> 0x00d7 }
            int r4 = r0 + -1
            if (r4 < 0) goto L_0x00a4
            r8 = 0
        L_0x0066:
            X.19E.A06(r6)     // Catch:{ all -> 0x00d7 }
            int r0 = r5.codePointAt(r8)     // Catch:{ all -> 0x00d7 }
            r7.appendCodePoint(r0)     // Catch:{ all -> 0x00d7 }
            X.GhN r0 = r11.A06     // Catch:{ all -> 0x00d7 }
            X.5Oz r10 = r0.A09     // Catch:{ all -> 0x00d7 }
            java.lang.String r3 = X.DbT.A10(r7)     // Catch:{ all -> 0x00d7 }
            int r0 = r7.length()     // Catch:{ all -> 0x00d7 }
            long r1 = X.C3026964x.A00(r0, r0)     // Catch:{ all -> 0x00d7 }
            X.5Tl r0 = new X.5Tl     // Catch:{ all -> 0x00d7 }
            r0.<init>(r3, r1)     // Catch:{ all -> 0x00d7 }
            r10.Epw(r0)     // Catch:{ all -> 0x00d7 }
            r1 = 1
            r11.A05 = r6     // Catch:{ all -> 0x00d7 }
            r11.A03 = r5     // Catch:{ all -> 0x00d7 }
            r11.A04 = r7     // Catch:{ all -> 0x00d7 }
            r11.A00 = r8     // Catch:{ all -> 0x00d7 }
            r11.A01 = r4     // Catch:{ all -> 0x00d7 }
            r0 = 1
            r11.A02 = r0     // Catch:{ all -> 0x00d7 }
            java.lang.Object r0 = X.C241603Pv.A01(r11, r1)     // Catch:{ all -> 0x00d7 }
            if (r0 != r9) goto L_0x009e
            goto L_0x00a3
        L_0x009e:
            if (r8 == r4) goto L_0x00a4
            int r8 = r8 + 1
            goto L_0x0066
        L_0x00a3:
            return r9
        L_0x00a4:
            X.GhN r4 = r11.A06     // Catch:{ all -> 0x00d7 }
            X.5Oz r3 = r4.A09     // Catch:{ all -> 0x00d7 }
            int r0 = r7.length()     // Catch:{ all -> 0x00d7 }
            long r1 = X.C3026964x.A00(r0, r0)     // Catch:{ all -> 0x00d7 }
            X.5Tl r0 = new X.5Tl     // Catch:{ all -> 0x00d7 }
            r0.<init>(r5, r1)     // Catch:{ all -> 0x00d7 }
            r3.Epw(r0)     // Catch:{ all -> 0x00d7 }
            X.05G r6 = r4.A0H
        L_0x00ba:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.GnN r0 = (X.C53390GnN) r0
            X.HM3 r4 = r0.A01
            java.util.List r3 = r0.A03
            float r2 = r0.A00
            r1 = 1
            java.lang.Integer r0 = r0.A02
            X.GnN r0 = X.C53390GnN.A01(r4, r0, r3, r2, r1)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x00ba
            X.0gF r9 = X.C60340gF.A00
            return r9
        L_0x00d7:
            r7 = move-exception
            X.GhN r0 = r11.A06
            X.05G r6 = r0.A0H
        L_0x00dc:
            java.lang.Object r5 = r6.getValue()
            r0 = r5
            X.GnN r0 = (X.C53390GnN) r0
            X.HM3 r4 = r0.A01
            java.util.List r3 = r0.A03
            float r2 = r0.A00
            r1 = 1
            java.lang.Integer r0 = r0.A02
            X.GnN r0 = X.C53390GnN.A01(r4, r0, r3, r2, r1)
            boolean r0 = r6.AIY(r5, r0)
            if (r0 == 0) goto L_0x00dc
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.genai.themes.domain.AiThemesViewModel$onExamplePromptClicked$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((AiThemesViewModel$onExamplePromptClicked$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
