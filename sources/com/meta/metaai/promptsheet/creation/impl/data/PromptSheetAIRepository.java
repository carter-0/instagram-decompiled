package com.meta.metaai.promptsheet.creation.impl.data;

import android.app.Application;
import com.meta.foa.session.FoaUserSession;
import com.meta.metaai.promptsheet.service.PromptSheetAINetworkService;

public final class PromptSheetAIRepository {
    public final Application A00;
    public final FoaUserSession A01;
    public final PromptSheetAINetworkService A02;

    public /* synthetic */ PromptSheetAIRepository(Application application, FoaUserSession foaUserSession) {
        PromptSheetAINetworkService promptSheetAINetworkService = new PromptSheetAINetworkService(application, foaUserSession);
        this.A00 = application;
        this.A01 = foaUserSession;
        this.A02 = promptSheetAINetworkService;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDr, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v10 */
    /* JADX WARNING: type inference failed for: r3v11 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00cd  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00e3  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C56088Hsb r12, X.AnonymousClass4D7 r13) {
        /*
            r11 = this;
            r4 = 39
            boolean r0 = X.C66139MDr.A01(r4, r13)
            if (r0 == 0) goto L_0x00c1
            r3 = r13
            X.MDr r3 = (X.C66139MDr) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c1
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x0016:
            java.lang.Object r2 = r3.A02
            X.1Hj r1 = X.1Hj.A02
            int r0 = r3.A00
            r6 = 1
            if (r0 == 0) goto L_0x00b1
            if (r0 != r6) goto L_0x00ef
            X.0eS.A00(r2)
        L_0x0024:
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00cd
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r3 = r2.A00
            X.3lr r3 = (X.C250663lr) r3
            java.lang.Class<X.BWY> r2 = X.BWY.class
            java.lang.String r1 = "xfb_prompt_sheet_starter_prompts(app:$app)"
            r0 = 759593231(0x2d46790f, float:1.1281877E-11)
            X.3lr r3 = r3.A03(r2, r1, r0)
            r8 = 0
            if (r3 == 0) goto L_0x00d6
            java.lang.Class<X.BWX> r2 = X.BWX.class
            java.lang.String r1 = "edges"
            r0 = 825027994(0x312ced9a, float:2.5164355E-9)
            com.google.common.collect.ImmutableList r0 = r3.A06(r2, r1, r0)
            if (r0 == 0) goto L_0x00d6
            java.util.ArrayList r8 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r10 = r0.iterator()
        L_0x0053:
            boolean r0 = r10.hasNext()
            if (r0 == 0) goto L_0x00d6
            X.3lr r3 = X.C41845B3m.A0V(r10)
            java.lang.Class<X.BWW> r2 = X.BWW.class
            r9 = 0
            java.lang.String r1 = "node"
            r0 = 1629675547(0x6122e01b, float:1.8778257E20)
            X.3lr r2 = r3.getOptionalTreeField(r9, r1, r2, r0)
            if (r2 == 0) goto L_0x0053
            java.lang.String r0 = "translated_full_prompt"
            java.lang.String r7 = r2.getOptionalStringField(r9, r0)
            if (r7 == 0) goto L_0x0053
            java.lang.String r0 = "strong_id__"
            java.lang.String r5 = r2.getOptionalStringField(r6, r0)
            if (r5 == 0) goto L_0x0053
            X.EX3 r1 = X.EX3.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r4 = 3
            java.lang.String r0 = "action"
            java.lang.Enum r3 = r2.getOptionalEnumField(r4, r0, r1)
            X.EX3 r3 = (X.EX3) r3
            if (r3 == 0) goto L_0x0053
            r1 = 2
            java.lang.String r0 = "emoji"
            java.lang.String r2 = r2.getOptionalStringField(r1, r0)
            if (r2 == 0) goto L_0x0053
            int r0 = r3.ordinal()
            if (r0 == r9) goto L_0x00ae
            if (r0 == r6) goto L_0x00ab
            if (r0 == r1) goto L_0x00a8
            if (r0 != r4) goto L_0x00c8
            java.lang.Integer r1 = X.AnonymousClass05K.A01
        L_0x009f:
            X.HtE r0 = new X.HtE
            r0.<init>(r1, r5, r7, r2)
            r8.add(r0)
            goto L_0x0053
        L_0x00a8:
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            goto L_0x009f
        L_0x00ab:
            java.lang.Integer r1 = X.AnonymousClass05K.A0N
            goto L_0x009f
        L_0x00ae:
            java.lang.Integer r1 = X.AnonymousClass05K.A00
            goto L_0x009f
        L_0x00b1:
            X.0eS.A00(r2)
            com.meta.metaai.promptsheet.service.PromptSheetAINetworkService r0 = r11.A02
            r3.A01 = r11
            r3.A00 = r6
            java.lang.Object r2 = r0.A00(r12, r3)
            if (r2 != r1) goto L_0x0024
            return r1
        L_0x00c1:
            X.MDr r3 = new X.MDr
            r3.<init>(r11, r13, r4)
            goto L_0x0016
        L_0x00c8:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00cd:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 != 0) goto L_0x00da
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00d6:
            X.3Ih r2 = X.C41845B3m.A0d(r8)
        L_0x00da:
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x00e3
            X.3Ih r2 = (X.C239793Ih) r2
            java.lang.Object r0 = r2.A00
            return r0
        L_0x00e3:
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00ea
            X.0sn r0 = X.0sn.A00
            return r0
        L_0x00ea:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ef:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.promptsheet.creation.impl.data.PromptSheetAIRepository.A00(X.Hsb, X.4D7):java.lang.Object");
    }
}
