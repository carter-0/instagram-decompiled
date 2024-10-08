package com.instagram.leadads.repository;

import X.02z;
import X.05G;
import X.0Yt;
import X.0qQ;
import X.0sl;
import X.0sn;
import X.106;
import X.AnonymousClass05K;
import X.AnonymousClass0Ud;
import X.AnonymousClass0r6;
import X.AnonymousClass10H;
import X.AnonymousClass4D7;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C15045UKy;
import X.C16527UwW;
import X.C16595Uxp;
import X.C18027Vk5;
import X.C18462VsB;
import X.C266444Yx;
import X.C52255GKw;
import X.C61079JwH;
import X.DbW;
import X.GSY;
import X.JTO;
import X.JTP;
import X.MHs;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public final class LeadFormQuestionsRepository {
    public GSY A00;
    public C18027Vk5 A01;
    public C18462VsB A02;
    public String A03;
    public List A04;
    public Set A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public String A0D = "";
    public final UserSession A0E;
    public final AnonymousClass0r6 A0F;
    public final 05G A0G;
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final AnonymousClass0Ud A0M;
    public final AnonymousClass0Ud A0N;

    public static final C266444Yx A00(C18027Vk5 vk5, boolean z) {
        int i;
        if (z) {
            i = 2131964674;
        } else {
            String str = vk5.A01().A01;
            if (str != null) {
                return new C52255GKw(str);
            }
            i = 2131970405;
        }
        return JTP.A0Q(i);
    }

    public static final LeadGenFormBaseQuestion A01(String str) {
        return new LeadGenFormBaseQuestion(C16595Uxp.A06, (Integer) null, str, "", "", "", (String) null, (String) null, (String) null, (String) null, (String) null, 0sn.A00, (List) null, (List) null, (List) null, 0Yt.A0E(), 0, false, false, false, false);
    }

    /* JADX WARNING: type inference failed for: r0v2, types: [X.ME0, X.4D7] */
    /* JADX WARNING: type inference failed for: r0v21 */
    /* JADX WARNING: type inference failed for: r0v22 */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x02bb  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0116  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x01bb  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x026d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A02(com.instagram.leadads.repository.LeadFormQuestionsRepository r16, com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r17, java.lang.String r18, java.lang.String r19, java.util.List r20, X.AnonymousClass4D7 r21) {
        /*
            r1 = r16
            r5 = r18
            r4 = r17
            r3 = r19
            r8 = 24
            r9 = r21
            boolean r0 = X.ME0.A02(r8, r9)
            if (r0 == 0) goto L_0x02ca
            r0 = r9
            X.ME0 r0 = (X.ME0) r0
            int r7 = r0.A00
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r2 = r7 & r6
            if (r2 == 0) goto L_0x02ca
            int r7 = r7 - r6
            r0.A00 = r7
        L_0x0020:
            java.lang.Object r9 = r0.A05
            X.1Hj r7 = X.1Hj.A02
            int r8 = r0.A00
            r6 = 2
            r2 = 1
            if (r8 == 0) goto L_0x0034
            if (r8 == r2) goto L_0x00fd
            if (r8 != r6) goto L_0x02d1
            X.0eS.A00(r9)
        L_0x0031:
            X.0gF r7 = X.C60340gF.A00
            return r7
        L_0x0034:
            X.0eS.A00(r9)
            X.GSY r8 = new X.GSY
            r12 = r20
            r8.<init>((com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r4, (java.lang.String) r5, (java.lang.String) r3, (java.util.List) r12)
            r1.A00 = r8
            X.QNI r11 = new X.QNI
            r11.<init>()
            java.lang.String r8 = "lead_gen_data_id"
            r11.A07(r5, r8)
            java.lang.String r8 = "action_type"
            r11.A07(r3, r8)
            java.lang.String r9 = r1.A0D
            java.lang.String r8 = "server_cookie"
            r11.A07(r9, r8)
            java.util.ArrayList r10 = X.AnonymousClass7TF.A0p(r12)
            java.util.Iterator r14 = r12.iterator()
        L_0x005e:
            boolean r8 = r14.hasNext()
            if (r8 == 0) goto L_0x008c
            java.lang.Object r13 = r14.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r13 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r13
            X.2IV r12 = new X.2IV
            r12.<init>()
            java.lang.String r9 = "QUESTION"
            java.lang.String r8 = "primitive_id_type"
            r12.A09(r9, r8)
            java.lang.String r8 = r13.A00
            java.util.List r9 = X.AnonymousClass7TE.A1I(r8)
            java.lang.String r8 = "string_values"
            r12.A05(r8, r9)
            java.lang.String r9 = r13.A06
            java.lang.String r8 = "primitive_id"
            r12.A09(r9, r8)
            r10.add(r12)
            goto L_0x005e
        L_0x008c:
            java.lang.String r8 = "primitive_inputs"
            r11.A05(r8, r10)
            if (r17 == 0) goto L_0x00b6
            X.2IV r10 = new X.2IV
            r10.<init>()
            java.lang.String r9 = "QUESTION"
            java.lang.String r8 = "primitive_id_type"
            r10.A09(r9, r8)
            java.lang.String r8 = r4.A00
            java.util.List r9 = X.AnonymousClass7TE.A1I(r8)
            java.lang.String r8 = "string_values"
            r10.A05(r8, r9)
            java.lang.String r9 = r4.A06
            java.lang.String r8 = "primitive_id"
            r10.A09(r9, r8)
            java.lang.String r8 = "current_input"
            r11.A06(r10, r8)
        L_0x00b6:
            r17 = 0
            X.2IS r10 = new X.2IS
            r10.<init>()
            X.2IS r9 = new X.2IS
            r9.<init>()
            java.lang.String r8 = "input"
            X.1vR r11 = X.JTP.A0L(r11, r10, r8)
            java.util.Map r13 = r10.getParamsCopy()
            java.util.Map r14 = r9.getParamsCopy()
            java.lang.Class<X.UR3> r15 = X.UR3.class
            java.util.ArrayList r21 = new java.util.ArrayList
            r21.<init>()
            java.lang.String r12 = "LeadGenConditionsUserInteractionMutation"
            r18 = 96
            java.lang.String r20 = "xfb_lead_gen_conditions_user_interaction"
            com.facebook.pando.PandoGraphQLRequest r10 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r2
            r19 = r17
            r10.<init>(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            com.instagram.common.session.UserSession r8 = r1.A0E
            X.1vn r8 = X.1vm.A01(r8)
            r0.A01 = r1
            r0.A02 = r5
            r0.A03 = r4
            r0.A04 = r3
            r0.A00 = r2
            java.lang.Object r9 = r8.A04(r10, r0)
            if (r9 != r7) goto L_0x0110
            return r7
        L_0x00fd:
            java.lang.Object r3 = r0.A04
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r4 = r0.A03
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r4 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r4
            java.lang.Object r5 = r0.A02
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r1 = r0.A01
            com.instagram.leadads.repository.LeadFormQuestionsRepository r1 = (com.instagram.leadads.repository.LeadFormQuestionsRepository) r1
            X.0eS.A00(r9)
        L_0x0110:
            X.3Ii r9 = (X.C239803Ii) r9
            boolean r8 = r9 instanceof X.C239793Ih
            if (r8 == 0) goto L_0x02bb
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r8 = r9.A00
            X.3JC r8 = (X.AnonymousClass3JC) r8
            java.lang.Object r13 = r8.A01
            X.3lr r13 = (X.C250663lr) r13
            r8 = 0
            if (r13 == 0) goto L_0x02c5
            java.lang.Class<X.UR2> r11 = X.UR2.class
            r12 = 0
            java.lang.String r10 = "xfb_lead_gen_conditions_user_interaction(data:$input)"
            r9 = -1500874849(0xffffffffa68a779f, float:-9.608097E-16)
            X.3lr r13 = r13.getOptionalTreeField(r12, r10, r11, r9)
            if (r13 == 0) goto L_0x02c5
            java.lang.String r9 = "server_cookie"
            java.lang.String r9 = r13.getOptionalStringField(r12, r9)
            if (r9 == 0) goto L_0x013b
            r1.A0D = r9
        L_0x013b:
            java.lang.Class<X.UR1> r11 = X.UR1.class
            java.lang.String r10 = "success"
            r9 = 828608984(0x316391d8, float:3.311575E-9)
            com.google.common.collect.ImmutableList r11 = r13.getRequiredCompactedTreeListField(r2, r10, r11, r9)
            if (r11 == 0) goto L_0x02c5
            java.util.ArrayList r9 = X.AnonymousClass7TF.A0p(r11)
            java.util.Iterator r15 = r11.iterator()
        L_0x0150:
            boolean r11 = r15.hasNext()
            if (r11 == 0) goto L_0x0169
            java.lang.Object r14 = r15.next()
            X.3lr r14 = (X.C250663lr) r14
            java.lang.Class<X.Bqm> r13 = X.C43022Bqm.class
            r11 = -570156489(0xffffffffde041a37, float:-2.37974531E18)
            X.3lr r11 = r14.A01(r13, r11)
            r9.add(r11)
            goto L_0x0150
        L_0x0169:
            boolean r11 = X.DbT.A1b(r9)
            if (r11 != r2) goto L_0x02c5
            r0.A01 = r8
            r0.A02 = r8
            r0.A03 = r8
            r0.A04 = r8
            r0.A00 = r6
            r1.A00 = r8
            X.VsB r11 = r1.A02
            if (r11 == 0) goto L_0x0193
            X.0qQ.A0B(r3, r12)
            X.XB6 r12 = r11.A00
            java.lang.String r14 = r11.A01
            android.os.Bundle r13 = X.C18462VsB.A00(r11, r3, r8)
            java.lang.String r15 = "lead_gen_conditional_question_loading_screen"
            java.lang.String r16 = "lead_gen_conditional_question_mutation"
            r17 = r10
            r12.Cgq(r13, r14, r15, r16, r17)
        L_0x0193:
            java.lang.Object r13 = X.00k.A0J(r9)
            X.3lr r13 = (X.C250663lr) r13
            if (r13 == 0) goto L_0x021c
            X.Kii r11 = X.C62611Kii.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r12 = 4
            java.lang.String r10 = "type"
            java.lang.Enum r10 = r13.getOptionalEnumField(r12, r10, r11)
            X.Kii r10 = (X.C62611Kii) r10
            if (r10 == 0) goto L_0x021c
            int r11 = r10.ordinal()
            r10 = 3
            if (r11 == r10) goto L_0x0219
            if (r11 == r12) goto L_0x0216
            if (r11 != r2) goto L_0x021c
            java.lang.Integer r10 = X.AnonymousClass05K.A0C
        L_0x01b5:
            int r10 = r10.intValue()
            if (r10 == r6) goto L_0x026d
            if (r10 == r2) goto L_0x0258
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>()
            java.util.Iterator r14 = r9.iterator()
        L_0x01c6:
            boolean r9 = r14.hasNext()
            if (r9 == 0) goto L_0x021f
            java.lang.Object r11 = r14.next()
            X.3lr r11 = (X.C250663lr) r11
            java.lang.String r9 = "strong_id__"
            java.lang.String r12 = r11.getOptionalStringField(r2, r9)
            X.Kii r10 = X.C62611Kii.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r13 = 4
            java.lang.String r9 = "type"
            java.lang.Enum r9 = r11.getOptionalEnumField(r13, r9, r10)
            X.Kii r9 = (X.C62611Kii) r9
            if (r9 == 0) goto L_0x0213
            int r10 = r9.ordinal()
            r9 = 3
            if (r10 == r9) goto L_0x0210
            if (r10 == r13) goto L_0x020d
            if (r10 != r2) goto L_0x0213
            java.lang.Integer r13 = X.AnonymousClass05K.A0C
        L_0x01f2:
            if (r12 == 0) goto L_0x01c6
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            if (r13 != r9) goto L_0x01c6
            r10 = 3
            java.lang.String r9 = "string_values"
            com.google.common.collect.ImmutableList r11 = r11.getRequiredCompactedStringListField(r10, r9)
            X.0qQ.A07(r11)
            r10 = 19
            X.JwH r9 = new X.JwH
            r9.<init>((java.lang.Integer) r13, (java.lang.String) r12, (java.util.List) r11, (int) r10)
            r6.add(r9)
            goto L_0x01c6
        L_0x020d:
            java.lang.Integer r13 = X.AnonymousClass05K.A01
            goto L_0x01f2
        L_0x0210:
            java.lang.Integer r13 = X.AnonymousClass05K.A00
            goto L_0x01f2
        L_0x0213:
            java.lang.Integer r13 = X.AnonymousClass05K.A0u
            goto L_0x01f2
        L_0x0216:
            java.lang.Integer r10 = X.AnonymousClass05K.A01
            goto L_0x01b5
        L_0x0219:
            java.lang.Integer r10 = X.AnonymousClass05K.A00
            goto L_0x01b5
        L_0x021c:
            java.lang.Integer r10 = X.AnonymousClass05K.A0u
            goto L_0x01b5
        L_0x021f:
            java.lang.Object r2 = X.00k.A0L(r6)
            X.JwH r2 = (X.C61079JwH) r2
            if (r2 == 0) goto L_0x0249
            java.lang.String r2 = r2.A02
        L_0x0229:
            if (r4 == 0) goto L_0x022d
            java.lang.String r8 = r4.A06
        L_0x022d:
            boolean r2 = X.0qQ.A0K(r2, r8)
            if (r2 == 0) goto L_0x024b
            java.lang.String r2 = "ANSWER"
            boolean r2 = X.0qQ.A0K(r3, r2)
            if (r2 == 0) goto L_0x024b
            java.lang.String r11 = "NEXT"
            r8 = r1
            r9 = r4
            r10 = r5
            r12 = r6
            r13 = r0
            java.lang.Object r0 = A03(r8, r9, r10, r11, r12, r13)
            if (r0 != r7) goto L_0x0031
            return r7
        L_0x0249:
            r2 = r8
            goto L_0x0229
        L_0x024b:
            boolean r0 = X.DbT.A1b(r6)
            if (r0 == 0) goto L_0x0268
            X.05G r0 = r1.A0I
            r0.Epw(r6)
            goto L_0x0031
        L_0x0258:
            java.lang.Object r3 = X.00k.A0J(r9)
            X.3lr r3 = (X.C250663lr) r3
            if (r3 == 0) goto L_0x0031
            java.lang.String r0 = "strong_id__"
            java.lang.String r0 = r3.getOptionalStringField(r2, r0)
            r1.A03 = r0
        L_0x0268:
            r1.A04()
            goto L_0x0031
        L_0x026d:
            java.lang.Object r4 = X.00k.A0J(r9)
            X.3lr r4 = (X.C250663lr) r4
            if (r4 == 0) goto L_0x0031
            java.lang.String r0 = "strong_id__"
            java.lang.String r6 = r4.getOptionalStringField(r2, r0)
            if (r6 == 0) goto L_0x02c5
            X.05G r5 = r1.A0I
            java.util.List r0 = X.JTO.A16(r5)
            if (r0 == 0) goto L_0x02a5
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r0.iterator()
        L_0x028e:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x02a7
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x028e
            r4.add(r2)
            goto L_0x028e
        L_0x02a5:
            X.0sn r4 = X.0sn.A00
        L_0x02a7:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
            X.0sn r2 = X.0sn.A00
            r1 = 19
            X.JwH r0 = new X.JwH
            r0.<init>((java.lang.Integer) r3, (java.lang.String) r6, (java.util.List) r2, (int) r1)
            java.util.ArrayList r0 = X.00k.A0T(r0, r4)
            r5.Epw(r0)
            goto L_0x0031
        L_0x02bb:
            boolean r0 = r9 instanceof X.C297815sO
            if (r0 != 0) goto L_0x02c5
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x02c5:
            r1.A05(r3)
            goto L_0x0031
        L_0x02ca:
            X.ME0 r0 = new X.ME0
            r0.<init>(r1, r9, r8)
            goto L_0x0020
        L_0x02d1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.repository.LeadFormQuestionsRepository.A02(com.instagram.leadads.repository.LeadFormQuestionsRepository, com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, java.lang.String, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0068, code lost:
        if (r2 != null) goto L_0x006a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(com.instagram.leadads.repository.LeadFormQuestionsRepository r12, com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r13, java.lang.String r14, java.lang.String r15, java.util.List r16, X.AnonymousClass4D7 r17) {
        /*
            java.util.ArrayList r11 = new java.util.ArrayList
            r11.<init>()
            java.util.Iterator r6 = r16.iterator()
        L_0x0009:
            boolean r0 = r6.hasNext()
            r5 = 0
            r7 = r12
            if (r0 == 0) goto L_0x0048
            java.lang.Object r5 = r6.next()
            X.JwH r5 = (X.C61079JwH) r5
            X.05G r0 = r12.A0J
            java.util.List r0 = X.JTO.A16(r0)
            if (r0 == 0) goto L_0x0009
            java.util.Iterator r4 = r0.iterator()
        L_0x0023:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0009
            java.lang.Object r3 = r4.next()
            r2 = r3
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r2 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r2
            java.lang.String r1 = r2.A06
            java.lang.String r0 = r5.A02
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0023
            java.lang.String r0 = r2.A00
            boolean r0 = X.C51966G9m.A1X(r0)
            if (r0 == 0) goto L_0x0023
            if (r3 == 0) goto L_0x0009
            r11.add(r3)
            goto L_0x0009
        L_0x0048:
            X.05G r6 = r12.A0I
            java.util.List r0 = X.JTO.A16(r6)
            r8 = r13
            if (r0 == 0) goto L_0x0079
            java.util.Iterator r3 = r0.iterator()
        L_0x0055:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r2 = r3.next()
            r0 = r2
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.Object r1 = r0.A00
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0055
            if (r2 == 0) goto L_0x0079
        L_0x006a:
            r9 = r14
            r10 = r15
            r12 = r17
            java.lang.Object r1 = A02(r7, r8, r9, r10, r11, r12)
            X.1Hj r0 = X.1Hj.A02
            if (r1 == r0) goto L_0x0078
            X.0gF r1 = X.C60340gF.A00
        L_0x0078:
            return r1
        L_0x0079:
            java.util.List r0 = X.JTO.A16(r6)
            r4 = -1
            if (r0 == 0) goto L_0x009e
            java.util.Iterator r3 = r0.iterator()
            r2 = 0
        L_0x0085:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x009e
            java.lang.Object r0 = r3.next()
            X.JwH r0 = (X.C61079JwH) r0
            java.lang.String r1 = r0.A02
            if (r13 == 0) goto L_0x00cd
            java.lang.String r0 = r13.A06
        L_0x0097:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x00ca
            r4 = r2
        L_0x009e:
            java.util.List r5 = X.JTO.A16(r6)
            if (r5 != 0) goto L_0x00a6
            X.0sn r5 = X.0sn.A00
        L_0x00a6:
            if (r4 < 0) goto L_0x00b5
            int r0 = X.C51966G9m.A06(r5)
            if (r4 == r0) goto L_0x00b5
            r1 = 0
            int r0 = r4 + 1
            java.util.List r5 = r5.subList(r1, r0)
        L_0x00b5:
            java.lang.Integer r4 = X.AnonymousClass05K.A0Y
            X.0sn r3 = X.0sn.A00
            java.lang.String r2 = "loading"
            r1 = 19
            X.JwH r0 = new X.JwH
            r0.<init>((java.lang.Integer) r4, (java.lang.String) r2, (java.util.List) r3, (int) r1)
            java.util.ArrayList r0 = X.00k.A0T(r0, r5)
            r6.Epw(r0)
            goto L_0x006a
        L_0x00ca:
            int r2 = r2 + 1
            goto L_0x0085
        L_0x00cd:
            r0 = r5
            goto L_0x0097
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.leadads.repository.LeadFormQuestionsRepository.A03(com.instagram.leadads.repository.LeadFormQuestionsRepository, com.instagram.leadgen.core.model.LeadGenFormBaseQuestion, java.lang.String, java.lang.String, java.util.List, X.4D7):java.lang.Object");
    }

    private final void A04() {
        ArrayList arrayList;
        05G r5 = this.A0I;
        List A16 = JTO.A16(r5);
        if (A16 != null) {
            arrayList = new ArrayList();
            for (Object next : A16) {
                if (((C61079JwH) next).A00 != AnonymousClass05K.A0Y) {
                    arrayList.add(next);
                }
            }
        } else {
            arrayList = null;
        }
        r5.Epw(arrayList);
    }

    private final void A05(String str) {
        ArrayList arrayList;
        C18462VsB vsB = this.A02;
        if (vsB != null) {
            0qQ.A0B(str, 0);
            vsB.A00.Cgq(C18462VsB.A00(vsB, str, (String) null), vsB.A01, "lead_gen_conditional_question_loading_screen", "lead_gen_conditional_question_mutation", RealtimeConstants.SEND_FAIL);
        }
        05G r7 = this.A0I;
        List<C61079JwH> A16 = JTO.A16(r7);
        if (A16 != null) {
            arrayList = AnonymousClass7TG.A0r(A16);
            for (C61079JwH jwH : A16) {
                if (jwH.A00 == AnonymousClass05K.A0Y) {
                    jwH = new C61079JwH(AnonymousClass05K.A0j, "error", (List) 0sn.A00, 19);
                }
                arrayList.add(jwH);
            }
        } else {
            arrayList = null;
        }
        r7.Epw(arrayList);
    }

    public static final boolean A06(LeadFormQuestionsRepository leadFormQuestionsRepository, C15045UKy uKy, C16527UwW uwW) {
        if (!(!uKy.A08.isEmpty())) {
            if (uKy.A0G) {
                return true;
            }
            if (!(!leadFormQuestionsRepository.A05.isEmpty())) {
                boolean A1W = AnonymousClass7TF.A1W(uwW, C16527UwW.SHORT_ANSWER);
                boolean A1W2 = AnonymousClass7TF.A1W(uwW, C16527UwW.DATE_TIME);
                boolean A1a = DbW.A1a(uKy.A05);
                if (A1W || A1W2 || A1a) {
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public LeadFormQuestionsRepository(UserSession userSession) {
        this.A0E = userSession;
        0sn r6 = 0sn.A00;
        this.A04 = r6;
        02z A012 = 106.A01((Object) null);
        this.A0K = A012;
        this.A0L = 106.A01((Object) null);
        02z A013 = 106.A01((Object) null);
        this.A0J = A013;
        this.A05 = 0sl.A00;
        02z A014 = 106.A01((Object) null);
        this.A0I = A014;
        this.A0F = AnonymousClass10H.A00(new MHs(this, (AnonymousClass4D7) null, 2), A012, A013, A014);
        02z A015 = 106.A01(r6);
        this.A0G = A015;
        this.A0M = A015;
        02z A016 = 106.A01((Object) null);
        this.A0H = A016;
        this.A0N = A016;
    }
}
