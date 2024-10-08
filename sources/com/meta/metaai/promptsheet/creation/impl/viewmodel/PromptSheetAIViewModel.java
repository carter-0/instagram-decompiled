package com.meta.metaai.promptsheet.creation.impl.viewmodel;

import X.02z;
import X.05G;
import X.0qQ;
import X.106;
import X.2YL;
import X.AnonymousClass0Ud;
import X.C54549HIk;
import X.C56088Hsb;
import X.C56506Hzc;
import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.promptsheet.creation.impl.data.PromptSheetAIRepository;

public final class PromptSheetAIViewModel extends 2YL {
    public final Application A00;
    public final FoaUserSession A01;
    public final C56506Hzc A02;
    public final PromptSheetAIRepository A03;
    public final C56088Hsb A04;
    public final 05G A05;
    public final AnonymousClass0Ud A06;

    public /* synthetic */ PromptSheetAIViewModel(Application application, FoaUserSession foaUserSession, C56506Hzc hzc, C56088Hsb hsb) {
        PromptSheetAIRepository promptSheetAIRepository = new PromptSheetAIRepository(application, foaUserSession);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A04 = hsb;
        this.A02 = hzc;
        this.A03 = promptSheetAIRepository;
        C54549HIk hIk = C54549HIk.A00;
        0qQ.A0C(hIk, "null cannot be cast to non-null type com.meta.metaai.promptsheet.creation.impl.viewmodel.MetaAIPromptUIState");
        02z A012 = 106.A01(hIk);
        this.A05 = A012;
        this.A06 = A012;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x004f  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005f A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0021  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A00(com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r6, com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r7, X.AnonymousClass4D7 r8) {
        /*
            r3 = 41
            boolean r0 = X.C66139MDr.A01(r3, r8)
            if (r0 == 0) goto L_0x002c
            r5 = r8
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x002c
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r5.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r5.A00
            r6 = 3
            r3 = 2
            r2 = 1
            if (r0 == 0) goto L_0x0032
            if (r0 == r2) goto L_0x0044
            if (r0 == r3) goto L_0x007b
            if (r0 == r6) goto L_0x007b
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002c:
            X.MDr r5 = new X.MDr
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0032:
            X.0eS.A00(r1)
            com.meta.metaai.promptsheet.creation.impl.data.PromptSheetAIRepository r1 = r7.A03
            X.Hsb r0 = r7.A04
            r5.A01 = r7
            r5.A00 = r2
            java.lang.Object r1 = r1.A00(r0, r5)
            if (r1 != r4) goto L_0x004b
            return r4
        L_0x0044:
            java.lang.Object r7 = r5.A01
            com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r7 = (com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel) r7
            X.0eS.A00(r1)
        L_0x004b:
            java.util.List r1 = (java.util.List) r1
            if (r1 == 0) goto L_0x0060
            r0 = 46
            X.IwN r0 = X.C58714IwN.A01(r7, r0)
            r5.A01 = r7
            r5.A00 = r3
            java.lang.Object r0 = A01(r7, r1, r5, r0)
        L_0x005d:
            if (r0 != r4) goto L_0x007e
            return r4
        L_0x0060:
            java.lang.String r0 = "Result is null"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r0 = 0
            r5.A01 = r0
            r5.A00 = r6
            X.05G r1 = r7.A05
            X.HIi r0 = new X.HIi
            r0.<init>(r2)
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 == r4) goto L_0x0080
            X.0gF r0 = X.C60340gF.A00
            goto L_0x005d
        L_0x007b:
            X.0eS.A00(r1)
        L_0x007e:
            X.0gF r4 = X.C60340gF.A00
        L_0x0080:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel.A00(com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel, com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A01(com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel r6, java.util.List r7, X.AnonymousClass4D7 r8, X.C62320sa r9) {
        /*
            r3 = 40
            boolean r0 = X.C66139MDr.A01(r3, r8)
            if (r0 == 0) goto L_0x0062
            r5 = r8
            X.MDr r5 = (X.C66139MDr) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0062
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 2
            r1 = 1
            if (r0 == 0) goto L_0x0035
            if (r0 == r1) goto L_0x0031
            if (r0 != r2) goto L_0x0068
            java.lang.Object r9 = r5.A01
            X.0sa r9 = (X.C62320sa) r9
            X.0eS.A00(r4)
        L_0x002b:
            r9.invoke()
        L_0x002e:
            X.0gF r3 = X.C60340gF.A00
            return r3
        L_0x0031:
            X.0eS.A00(r4)
            goto L_0x002e
        L_0x0035:
            X.0eS.A00(r4)
            if (r7 != 0) goto L_0x0050
            java.lang.String r0 = "There is no prompts"
            java.lang.IllegalStateException r2 = X.AnonymousClass7TE.A0z(r0)
            r5.A00 = r1
            X.05G r1 = r6.A05
            X.HIi r0 = new X.HIi
            r0.<init>(r2)
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r3) goto L_0x002e
            return r3
        L_0x0050:
            X.05G r1 = r6.A05
            X.HIj r0 = new X.HIj
            r0.<init>(r7)
            r5.A01 = r9
            r5.A00 = r2
            java.lang.Object r0 = r1.emit(r0, r5)
            if (r0 != r3) goto L_0x002b
            return r3
        L_0x0062:
            X.MDr r5 = new X.MDr
            r5.<init>(r6, r8, r3)
            goto L_0x0016
        L_0x0068:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel.A01(com.meta.metaai.promptsheet.creation.impl.viewmodel.PromptSheetAIViewModel, java.util.List, X.4D7, X.0sa):java.lang.Object");
    }
}
