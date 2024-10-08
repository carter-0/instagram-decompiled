package com.instagram.api.schemas;

import X.17P;
import X.1E6;
import X.1E9;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass7TH;
import X.C17946Vib;
import X.C3035269k;
import X.C41845B3m;
import X.C41846B3n;
import X.C41847B3o;
import X.C41848B3p;
import X.C46097DMc;
import X.C46098DMd;
import X.CTB;
import X.V8F;
import android.os.Parcel;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.user.model.ImmutablePandoUserDict;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class ImmutablePandoStoryPromptTappableData extends 17P implements StoryPromptTappableDataIntf {
    public static final C3035269k CREATOR = CTB.A00(87);
    public User A00;
    public List A01;

    public final /* synthetic */ C17946Vib AKQ() {
        return new C17946Vib(this);
    }

    public final StoryPromptDisablementState Axh() {
        return (StoryPromptDisablementState) A0M(186507096, C46097DMc.A00);
    }

    public final ElectionAddYoursInfoDictIntf B0N() {
        return (ElectionAddYoursInfoDictIntf) A05(917294641, ImmutablePandoElectionAddYoursInfoDict.class);
    }

    public final List B3f() {
        List list = this.A01;
        if (list != null) {
            return list;
        }
        throw AnonymousClass7TE.A1B("Please call reconciledWithStore() first to access the 'facepileTopParticipants' field.");
    }

    public final GenAIToolInfoDictIntf B91() {
        return (GenAIToolInfoDictIntf) A05(1337664557, ImmutablePandoGenAIToolInfoDict.class);
    }

    public final User BYz() {
        return this.A00;
    }

    public final StoryPromptParticipationFrictionInfoDict Ban() {
        return (StoryPromptParticipationFrictionInfoDict) A05(-1767801771, ImmutablePandoStoryPromptParticipationFrictionInfoDict.class);
    }

    public final StoryPromptFailureTooltipDictIntf Bho() {
        return (StoryPromptFailureTooltipDictIntf) A05(-885136013, ImmutablePandoStoryPromptFailureTooltipDict.class);
    }

    public final StoryPromptType Bhw() {
        return (StoryPromptType) A0N(1634479413, C46098DMd.A00);
    }

    public final StoryTemplateDictIntf C1M() {
        return (StoryTemplateDictIntf) A05(1530218628, ImmutablePandoStoryTemplateDict.class);
    }

    public final StoryPromptTappableDataIntf E8t(1E9 r4) {
        List A0o = A0o(-1167125638, ImmutablePandoUserDict.class);
        ArrayList A0r = AnonymousClass7TG.A0r(A0o);
        Iterator it = A0o.iterator();
        while (it.hasNext()) {
            C41847B3o.A1R(r4, A0r, it);
        }
        this.A01 = A0r;
        this.A00 = C41848B3p.A1B(r4, this, -821815367);
        return this;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v0, resolved type: X.17P} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.instagram.api.schemas.StoryPromptTappableData FAr(X.1E9 r34) {
        /*
            r33 = this;
            r0 = r33
            java.lang.String r25 = X.C41845B3m.A0r(r0)
            com.instagram.api.schemas.StoryPromptDisablementState r7 = r0.Axh()
            com.instagram.api.schemas.ElectionAddYoursInfoDictIntf r1 = r0.B0N()
            r11 = 0
            if (r1 == 0) goto L_0x0032
            com.instagram.api.schemas.ElectionAddYoursInfoDict r5 = r1.F2j()
        L_0x0015:
            java.lang.Class<com.instagram.user.model.ImmutablePandoUserDict> r2 = com.instagram.user.model.ImmutablePandoUserDict.class
            r1 = -1167125638(0xffffffffba6f137a, float:-9.1200287E-4)
            java.util.List r1 = r0.A0o(r1, r2)
            java.util.ArrayList r4 = X.AnonymousClass7TG.A0r(r1)
            java.util.Iterator r3 = r1.iterator()
        L_0x0026:
            boolean r2 = r3.hasNext()
            r1 = r34
            if (r2 == 0) goto L_0x0034
            X.C41847B3o.A1R(r1, r4, r3)
            goto L_0x0026
        L_0x0032:
            r5 = r11
            goto L_0x0015
        L_0x0034:
            java.util.ArrayList r3 = X.AnonymousClass7TG.A0r(r4)
            java.util.Iterator r4 = r4.iterator()
        L_0x003c:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x0046
            X.C41847B3o.A1Q(r1, r3, r4)
            goto L_0x003c
        L_0x0046:
            com.instagram.api.schemas.GenAIToolInfoDictIntf r2 = r0.B91()
            if (r2 == 0) goto L_0x0108
            com.instagram.api.schemas.GenAIToolInfoDict r6 = r2.F3O()
        L_0x0050:
            r2 = 849767883(0x32a66dcb, float:1.9374871E-8)
            java.lang.Boolean r13 = r0.getOptionalBooleanValueByHashCode(r2)
            java.lang.String r26 = r0.A0g()
            r2 = -1025303767(0xffffffffc2e31b29, float:-113.55305)
            java.lang.Boolean r14 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = -1475936846(0xffffffffa806fdb2, float:-7.493506E-15)
            java.lang.Boolean r15 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 405415469(0x182a262d, float:2.1991259E-24)
            java.lang.Boolean r16 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 1597787285(0x5f3c4c95, float:1.3568384E19)
            java.lang.Boolean r17 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 493270317(0x1d66b52d, float:3.0533912E-21)
            java.lang.Boolean r18 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 1356750754(0x50de5fa2, float:2.98464748E10)
            java.lang.Boolean r19 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = -1911580874(0xffffffff8e0f9736, float:-1.7698916E-30)
            java.lang.Boolean r20 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 1233798655(0x498a45ff, float:1132735.9)
            java.lang.Boolean r21 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = -1114680033(0xffffffffbd8f551f, float:-0.069986574)
            java.lang.Boolean r22 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = -1996772183(0xffffffff88fbaca9, float:-1.5147105E-33)
            java.lang.Boolean r23 = r0.getOptionalBooleanValueByHashCode(r2)
            r2 = 464576065(0x1bb0de41, float:2.9260386E-22)
            java.lang.Boolean r24 = r0.getOptionalBooleanValueByHashCode(r2)
            java.lang.String r27 = r0.A0f()
            r2 = -821815367(0xffffffffcf0417b9, float:-2.2161472E9)
            com.instagram.user.model.ImmutablePandoUserDict r2 = X.C41845B3m.A0Z(r0, r2)
            if (r2 == 0) goto L_0x0106
            com.instagram.user.model.User r2 = X.C41845B3m.A0b(r1, r2)
            if (r2 == 0) goto L_0x0106
            com.instagram.user.model.User r12 = X.C41846B3n.A0b(r1, r2)
        L_0x00bf:
            r1 = 1324364035(0x4ef03103, float:2.01487194E9)
            int r32 = r0.getIntValueByHashCode(r1)
            com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDict r1 = r0.Ban()
            if (r1 == 0) goto L_0x0104
            com.instagram.api.schemas.StoryPromptParticipationFrictionInfoDictImpl r9 = r1.FAq()
        L_0x00d0:
            com.instagram.api.schemas.StoryPromptFailureTooltipDictIntf r1 = r0.Bho()
            if (r1 == 0) goto L_0x0102
            com.instagram.api.schemas.StoryPromptFailureTooltipDict r8 = r1.FAp()
        L_0x00da:
            r1 = -871809258(0xffffffffcc093f16, float:-3.5978328E7)
            java.lang.String r28 = r0.A0i(r1)
            com.instagram.api.schemas.StoryPromptType r10 = r0.Bhw()
            r1 = -1061345759(0xffffffffc0bd2621, float:-5.9109044)
            java.lang.String r29 = r0.A0i(r1)
            com.instagram.api.schemas.StoryTemplateDictIntf r1 = r0.C1M()
            if (r1 == 0) goto L_0x00f6
            com.instagram.api.schemas.StoryTemplateDict r11 = r1.FBY()
        L_0x00f6:
            java.lang.String r30 = r0.A0P()
            com.instagram.api.schemas.StoryPromptTappableData r4 = new com.instagram.api.schemas.StoryPromptTappableData
            r31 = r3
            r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31, r32)
            return r4
        L_0x0102:
            r8 = r11
            goto L_0x00da
        L_0x0104:
            r9 = r11
            goto L_0x00d0
        L_0x0106:
            r12 = r11
            goto L_0x00bf
        L_0x0108:
            r6 = r11
            goto L_0x0050
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData.FAr(X.1E9):com.instagram.api.schemas.StoryPromptTappableData");
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData, com.instagram.api.schemas.StoryPromptTappableDataIntf] */
    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0S(this, V8F.A00(this));
    }

    public final /* synthetic */ int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean BBm() {
        return getOptionalBooleanValueByHashCode(849767883);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final int Bak() {
        return getIntValueByHashCode(1324364035);
    }

    public final String Bhs() {
        return A0i(-871809258);
    }

    public final String Bzk() {
        return A0i(-1061345759);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean CPO() {
        return getOptionalBooleanValueByHashCode(-1025303767);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean CQE() {
        return getOptionalBooleanValueByHashCode(-1475936846);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean CQh() {
        return getOptionalBooleanValueByHashCode(405415469);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean CTy() {
        return getOptionalBooleanValueByHashCode(1597787285);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean CUt() {
        return getOptionalBooleanValueByHashCode(493270317);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean CYj() {
        return getOptionalBooleanValueByHashCode(1356750754);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean CZB() {
        return getOptionalBooleanValueByHashCode(-1911580874);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean CcH() {
        return getOptionalBooleanValueByHashCode(1233798655);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean Ccg() {
        return getOptionalBooleanValueByHashCode(-1114680033);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean Cdf() {
        return getOptionalBooleanValueByHashCode(-1996772183);
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final Boolean Cej() {
        return getOptionalBooleanValueByHashCode(464576065);
    }

    public final StoryPromptTappableData FAs(1E6 r2) {
        return FAr(C41846B3n.A0S(r2));
    }

    public final String getBackgroundColor() {
        return C41845B3m.A0r(this);
    }

    public final String getId() {
        return A0g();
    }

    public final String getMediaId() {
        return A0f();
    }

    public final String getText() {
        return A0P();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.facebook.pando.TreeJNI, com.instagram.api.schemas.ImmutablePandoStoryPromptTappableData] */
    public final void writeToParcel(Parcel parcel, int i) {
        AnonymousClass7TH.A0O(parcel, this);
    }
}
