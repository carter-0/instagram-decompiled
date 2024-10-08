package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadads.repository.LeadFormQuestionsRepository;
import com.instagram.leadads.repository.LeadFormRepository;
import com.instagram.leadgen.core.model.LeadGenFormBaseQuestion;
import com.instagram.leadgen.core.model.LeadGenProfileContentInfo;
import com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload;
import com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer;
import com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.UnS  reason: case insensitive filesystem */
public final class C16039UnS extends U8P {
    public LeadGenCustomDisclaimer A00;
    public LeadGenDisqualifyingScreenData A01;
    public LeadGenPrivacyPolicy A02;
    public String A03;
    public boolean A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public boolean A0F;
    public boolean A0G;
    public final UserSession A0H;
    public final WYW A0I;
    public final LeadFormQuestionsRepository A0J;
    public final LeadFormRepository A0K;
    public final C18461VsA A0L;
    public final C18462VsB A0M;
    public final VOJ A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final C249513ju A0X;
    public final AnonymousClass0r6 A0Y;
    public final 05G A0Z;
    public final 05G A0a;
    public final 05G A0b;
    public final 05G A0c;
    public final boolean A0d;
    public final boolean A0e;
    public final boolean A0f;
    public final boolean A0g;

    public final void A05(String str) {
        User A2A;
        String fbidV2;
        String str2 = this.A0O;
        if (str2 != null) {
            UserSession userSession = this.A0H;
            1Xj A022 = 1E7.A00(userSession).A02(this.A0W);
            if (A022 != null && (A2A = A022.A2A(userSession)) != null && (fbidV2 = A2A.A03.getFbidV2()) != null) {
                AnonymousClass7TE.A1Z(new C66178MGp(this, A022, str2, fbidV2, str, (AnonymousClass4D7) null, 5), C67391tE.A00);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v6, resolved type: com.instagram.leadgen.core.model.LeadGenFormBaseQuestion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v9, resolved type: com.instagram.leadgen.core.model.LeadGenFormBaseQuestion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r14v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v133, resolved type: com.instagram.leadgen.core.model.LeadGenFormBaseQuestion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r13v11, resolved type: com.instagram.leadgen.core.model.LeadGenFormBaseQuestion} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v10, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v15, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v16, resolved type: boolean} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v17, resolved type: int} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v18, resolved type: boolean} */
    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:181:0x042c, code lost:
        if (r3 != false) goto L_0x042e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0435, code lost:
        if (r3 != false) goto L_0x0437;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:201:0x0480, code lost:
        if (r16 == 0) goto L_0x0482;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x01bb, code lost:
        if (r2.A09 != false) goto L_0x01bd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x01e5, code lost:
        if ((!r5.isEmpty()) != true) goto L_0x01e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0255, code lost:
        if (X.DbY.A1Z(X.0Tu.A06, r13, 36317908447532683L) != false) goto L_0x0257;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:104:0x02d3  */
    /* JADX WARNING: Removed duplicated region for block: B:129:0x036e  */
    /* JADX WARNING: Removed duplicated region for block: B:143:0x03a0  */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x03b1  */
    /* JADX WARNING: Removed duplicated region for block: B:154:0x03c5  */
    /* JADX WARNING: Removed duplicated region for block: B:159:0x03d7  */
    /* JADX WARNING: Removed duplicated region for block: B:163:0x03ea  */
    /* JADX WARNING: Removed duplicated region for block: B:180:0x042a  */
    /* JADX WARNING: Removed duplicated region for block: B:185:0x0434  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x043e  */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0446  */
    /* JADX WARNING: Removed duplicated region for block: B:197:0x045e  */
    /* JADX WARNING: Removed duplicated region for block: B:200:0x047b  */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x04b4  */
    /* JADX WARNING: Removed duplicated region for block: B:213:0x04f2  */
    /* JADX WARNING: Removed duplicated region for block: B:216:0x0508  */
    /* JADX WARNING: Removed duplicated region for block: B:217:0x050c  */
    /* JADX WARNING: Removed duplicated region for block: B:244:0x040a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:246:0x03d3 A[EDGE_INSN: B:246:0x03d3->B:157:0x03d3 ?: BREAK  , SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x01af  */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x027c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ C16039UnS(X.C319836rJ r43, com.instagram.common.session.UserSession r44, X.WYW r45) {
        /*
            r42 = this;
            com.instagram.leadads.repository.LeadFormRepository r1 = new com.instagram.leadads.repository.LeadFormRepository
            r3 = r44
            r1.<init>(r3)
            X.VOJ r0 = new X.VOJ
            r0.<init>(r3)
            com.instagram.leadads.repository.LeadFormQuestionsRepository r8 = new com.instagram.leadads.repository.LeadFormQuestionsRepository
            r8.<init>(r3)
            r6 = 1
            r2 = r42
            r2.<init>()
            r2.A0H = r3
            r7 = r45
            r2.A0I = r7
            r2.A0K = r1
            r2.A0N = r0
            r2.A0J = r8
            java.lang.String r0 = "mediaID"
            r1 = r43
            java.lang.Object r0 = r1.A00(r0)
            java.lang.String r3 = "Required value was null."
            if (r0 == 0) goto L_0x0526
            java.lang.String r0 = (java.lang.String) r0
            r2.A0W = r0
            java.lang.String r0 = "is_from_lead_ad_activity"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            r4 = 0
            boolean r0 = X.AnonymousClass7TG.A1X(r0)
            r2.A0f = r0
            java.lang.String r0 = "is_bottom_sheet_flow"
            boolean r0 = X.C13991Tnr.A1X(r1, r0)
            r2.A0e = r0
            java.lang.String r0 = "formID"
            java.lang.Object r0 = r1.A00(r0)
            if (r0 == 0) goto L_0x0520
            java.lang.String r0 = (java.lang.String) r0
            r2.A0V = r0
            java.lang.String r0 = X.C13991Tnr.A0f(r1)
            r2.A0Q = r0
            java.lang.String r0 = "adID"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0O = r0
            java.lang.String r5 = r2.A0Q
            java.lang.String r3 = r2.A0V
            X.VsB r0 = new X.VsB
            r0.<init>(r7, r5, r3)
            r2.A0M = r0
            java.lang.String r5 = r2.A0Q
            java.lang.String r3 = r2.A0V
            X.VsA r0 = new X.VsA
            r0.<init>(r7, r5, r3)
            r2.A0L = r0
            java.lang.String r0 = "is_sensitive_vertical_ad"
            boolean r3 = X.C13991Tnr.A1X(r1, r0)
            r2.A0g = r3
            r0 = 216(0xd8, float:3.03E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Object r0 = r1.A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0S = r0
            r0 = 217(0xd9, float:3.04E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Object r0 = r1.A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0U = r0
            java.lang.String r0 = "first_question_sticker_name_answer_value"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0T = r0
            java.lang.String r0 = "first_question_sticker_email_answer_value"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0R = r0
            java.lang.String r0 = "trackingToken"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.String r0 = (java.lang.String) r0
            r2.A0P = r0
            java.lang.String r0 = "should_show_inline_context_card"
            boolean r0 = X.C13991Tnr.A1X(r1, r0)
            r2.A0d = r0
            r2.A0G = r6
            X.0Ud r7 = r8.A0M
            r9 = 0
            r5 = 9
            X.WvV r0 = new X.WvV
            r0.<init>(r2, r9, r5)
            X.02x r5 = X.10q.A01(r0, r7)
            X.6oS r0 = X.C318116oQ.A00(r2)
            X.AnonymousClass11O.A03(r0, r5)
            X.VsB r0 = r2.A0M
            X.0qQ.A0B(r0, r4)
            r8.A02 = r0
            X.Vtw r5 = X.C18544Vtw.A01
            java.lang.String r0 = r2.A0V
            X.Vk5 r7 = r5.A00(r0)
            java.lang.String r0 = "is_form_extension"
            java.lang.Object r0 = r1.A00(r0)
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r6)
            r2.A09 = r0
            java.lang.String r0 = "is_first_question_sticker"
            boolean r0 = X.C13991Tnr.A1X(r1, r0)
            r2.A07 = r0
            r0 = 104(0x68, float:1.46E-43)
            java.lang.String r0 = X.Pxd.A00(r0)
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            if (r0 == 0) goto L_0x0112
            boolean r4 = r0.booleanValue()
        L_0x0112:
            r2.A0D = r4
            com.instagram.common.session.UserSession r0 = r2.A0H
            boolean r0 = X.C18215Vnf.A00(r0, r3)
            r2.A0F = r0
            r8 = 0
            if (r7 == 0) goto L_0x0366
            X.Cu5 r0 = r7.A00()
            java.lang.String r10 = r0.A01
            X.Cu5 r0 = r7.A00()
            com.instagram.common.typedurl.ImageUrl r8 = r0.A00
        L_0x012b:
            boolean r0 = r2.A09
            r3 = 0
            if (r0 == 0) goto L_0x0155
            java.lang.String r0 = "advertiserFollowerCount"
            java.lang.Object r0 = r1.A00(r0)
            java.lang.Number r0 = (java.lang.Number) r0
            if (r0 == 0) goto L_0x013e
            int r3 = r0.intValue()
        L_0x013e:
            X.05G r4 = r2.A0Z
            r1 = 3
            X.N4Q r0 = new X.N4Q
            r0.<init>(r8, r10, r3, r1)
        L_0x0146:
            r4.Epw(r0)
        L_0x0149:
            if (r7 != 0) goto L_0x01a5
            X.6oS r1 = X.C318116oQ.A00(r2)
            r0 = 15
            X.C13991Tnr.A1L(r2, r1, r0)
            return
        L_0x0155:
            if (r10 == 0) goto L_0x0149
            if (r8 == 0) goto L_0x0149
            java.lang.String r0 = "igUserName"
            java.lang.Object r5 = r1.A00(r0)
            java.lang.String r5 = (java.lang.String) r5
            java.lang.String r0 = "profilePicURI"
            java.lang.Object r4 = r1.A00(r0)
            com.instagram.common.typedurl.ImageUrl r4 = (com.instagram.common.typedurl.ImageUrl) r4
            X.CwD r0 = r7.A00
            X.VcQ r11 = r0.A02
            X.W3g r0 = X.C18809W3g.A00
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r1 = r0.A0A(r11)
            boolean r12 = X.C18809W3g.A09(r1)
            boolean r0 = r2.A0g
            if (r0 != 0) goto L_0x0182
            if (r12 != 0) goto L_0x0181
            boolean r0 = r2.A0d
            if (r0 == 0) goto L_0x0182
        L_0x0181:
            r3 = 1
        L_0x0182:
            r2.A0B = r3
            if (r3 == 0) goto L_0x01a5
            if (r1 == 0) goto L_0x018c
            java.lang.Integer r3 = r1.A04
            if (r3 != 0) goto L_0x018e
        L_0x018c:
            java.lang.Integer r3 = X.AnonymousClass05K.A0C
        L_0x018e:
            if (r12 != 0) goto L_0x0193
            if (r11 != 0) goto L_0x0334
            r1 = 0
        L_0x0193:
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r3 != r0) goto L_0x035d
            if (r5 == 0) goto L_0x035d
            if (r4 == 0) goto L_0x035d
            X.05G r3 = r2.A0b
            com.instagram.leadgen.core.model.LeadGenProfileContentInfo r0 = new com.instagram.leadgen.core.model.LeadGenProfileContentInfo
            r0.<init>(r4, r1, r5)
            r3.Epw(r0)
        L_0x01a5:
            X.CwD r8 = r7.A00
            boolean r0 = r8.A0E
            r2.A0A = r0
            X.Cut r13 = r8.A04
            if (r13 != 0) goto L_0x02d3
            r0 = r9
        L_0x01b0:
            r2.A00 = r0
            boolean r1 = r2.A0A
            if (r1 != 0) goto L_0x01b8
            if (r0 == 0) goto L_0x01bd
        L_0x01b8:
            boolean r1 = r2.A09
            r0 = 1
            if (r1 == 0) goto L_0x01be
        L_0x01bd:
            r0 = 0
        L_0x01be:
            r2.A0E = r0
            com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy r0 = r8.A08
            r21 = r0
            if (r0 == 0) goto L_0x0516
            r2.A02 = r0
            X.Cu5 r0 = r7.A00()
            java.lang.String r0 = r0.A01
            r2.A03 = r0
            com.instagram.leadgen.core.model.disqualifyingscreen.LeadGenDisqualifyingScreenData r0 = r8.A07
            r2.A01 = r0
            boolean r0 = r7.A02()
            r2.A06 = r0
            java.util.Set r5 = r8.A0D
            if (r5 == 0) goto L_0x01e7
            boolean r0 = r5.isEmpty()
            r1 = r0 ^ 1
            r0 = 1
            if (r1 == r6) goto L_0x01e8
        L_0x01e7:
            r0 = 0
        L_0x01e8:
            r2.A05 = r0
            java.lang.String r11 = r2.A0S
            if (r11 == 0) goto L_0x01f4
            int r0 = r11.length()
            if (r0 != 0) goto L_0x01f6
        L_0x01f4:
            java.lang.String r11 = r2.A0U
        L_0x01f6:
            com.instagram.leadads.repository.LeadFormQuestionsRepository r4 = r2.A0J
            X.6oS r20 = X.C318116oQ.A00(r2)
            boolean r13 = r2.A0E
            boolean r3 = r2.A09
            boolean r12 = r2.A0g
            boolean r1 = r2.A07
            java.lang.String r10 = r2.A0T
            java.lang.String r0 = r2.A0R
            r19 = r0
            boolean r0 = r2.A0D
            r16 = r0
            boolean r14 = r2.A0d
            r2 = 0
            r4.A01 = r7
            r4.A08 = r1
            r4.A0B = r13
            com.instagram.common.session.UserSession r13 = r4.A0E
            X.0Tu r15 = X.0Tu.A05
            r0 = 36325398870504379(0x810dc2000033bb, double:3.035666744123167E-306)
            boolean r0 = X.182.A06(r15, r13, r0)
            r4.A09 = r0
            X.VcQ r1 = r8.A02
            X.W3g r0 = X.C18809W3g.A00
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r0 = r0.A0A(r1)
            if (r12 != 0) goto L_0x02d0
            boolean r0 = X.C18809W3g.A09(r0)
            if (r0 != 0) goto L_0x0238
            if (r14 == 0) goto L_0x02d0
        L_0x0238:
            r0 = 1
        L_0x0239:
            r4.A0A = r0
            r4.A06 = r14
            r0 = r12 ^ 1
            r4.A0C = r0
            X.Cuu r0 = r7.A01()
            com.google.common.collect.ImmutableList r14 = r0.A00
            if (r16 != 0) goto L_0x0257
            X.0Tu r15 = X.0Tu.A06
            r0 = 36317908447532683(0x8106f20000168b, double:3.030929770474354E-306)
            boolean r0 = X.DbY.A1Z(r15, r13, r0)
            r1 = 0
            if (r0 == 0) goto L_0x0258
        L_0x0257:
            r1 = 1
        L_0x0258:
            boolean r0 = X.C18215Vnf.A01(r13, r12, r6)
            java.util.ArrayList r12 = X.C18809W3g.A03(r13, r14, r12, r1, r0)
            boolean r0 = r12 instanceof java.util.Collection
            if (r0 == 0) goto L_0x02aa
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x02aa
        L_0x026a:
            r0 = 0
        L_0x026b:
            r4.A07 = r0
            java.util.ArrayList r18 = new java.util.ArrayList
            r18.<init>()
            java.util.Iterator r14 = r12.iterator()
        L_0x0276:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x0369
            java.lang.Object r1 = r14.next()
            r0 = r1
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            X.0qQ.A0B(r0, r2)
            X.Uxp r13 = r0.A03
            X.Uxp r0 = X.C16595Uxp.A06
            if (r13 == r0) goto L_0x0276
            X.Uxp r0 = X.C16595Uxp.A0U
            if (r13 == r0) goto L_0x0276
            X.Uxp r0 = X.C16595Uxp.A0V
            if (r13 == r0) goto L_0x0276
            X.Uxp r0 = X.C16595Uxp.A08
            if (r13 == r0) goto L_0x0276
            boolean r0 = r4.A07
            if (r0 == 0) goto L_0x02a4
            X.Uxp r0 = X.C16595Uxp.A0a
            if (r13 == r0) goto L_0x0276
            X.Uxp r0 = X.C16595Uxp.A0Q
            if (r13 == r0) goto L_0x0276
        L_0x02a4:
            r0 = r18
            r0.add(r1)
            goto L_0x0276
        L_0x02aa:
            java.util.Iterator r14 = r12.iterator()
        L_0x02ae:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x026a
            java.lang.Object r13 = r14.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r13 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r13
            X.Uxp r1 = X.C16595Uxp.A0U
            X.Uxp r0 = X.C16595Uxp.A0V
            X.Uxp[] r0 = new X.C16595Uxp[]{r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            X.Uxp r0 = r13.A03
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x02ae
            r0 = 1
            goto L_0x026b
        L_0x02d0:
            r0 = 0
            goto L_0x0239
        L_0x02d3:
            X.Cu6 r0 = r13.A01
            java.lang.String r11 = r0.A01
            com.google.common.collect.ImmutableList r0 = r0.A00
            java.util.ArrayList r10 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r5 = r0.iterator()
        L_0x02e1:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L_0x02fc
            java.lang.Object r0 = r5.next()
            X.Cus r0 = (X.C45350Cus) r0
            int r4 = r0.A01
            int r3 = r0.A00
            java.lang.String r1 = r0.A02
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges r0 = new com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBodyUrlRanges
            r0.<init>(r4, r3, r1)
            r10.add(r0)
            goto L_0x02e1
        L_0x02fc:
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody r12 = new com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerBody
            r12.<init>(r11, r10)
            java.lang.String r11 = r13.A02
            com.google.common.collect.ImmutableList r0 = r13.A00
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            java.util.Iterator r13 = r0.iterator()
        L_0x030e:
            boolean r0 = r13.hasNext()
            if (r0 == 0) goto L_0x032d
            java.lang.Object r0 = r13.next()
            X.CvS r0 = (X.C45386CvS) r0
            java.lang.String r5 = r0.A00
            if (r5 == 0) goto L_0x030e
            java.lang.String r4 = r0.A01
            boolean r3 = r0.A02
            boolean r1 = r0.A03
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox r0 = new com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimerCheckbox
            r0.<init>(r4, r5, r3, r1)
            r10.add(r0)
            goto L_0x030e
        L_0x032d:
            com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer r0 = new com.instagram.leadgen.core.model.disclaimer.LeadGenCustomDisclaimer
            r0.<init>(r12, r11, r10)
            goto L_0x01b0
        L_0x0334:
            X.UyO r0 = r11.A09
            if (r0 == 0) goto L_0x035a
            int r1 = r0.ordinal()
            if (r1 == r6) goto L_0x0357
            r0 = 2
            if (r1 != r0) goto L_0x035a
            java.lang.Integer r17 = X.AnonymousClass05K.A00
        L_0x0343:
            java.lang.String r0 = r11.A0A
            X.0sn r19 = X.0sn.A00
            com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload r1 = new com.instagram.leadgen.core.model.LeadGenTrustSignalsPayload
            r11 = r1
            r12 = r9
            r13 = r9
            r14 = r9
            r15 = r9
            r16 = r9
            r18 = r0
            r11.<init>(r12, r13, r14, r15, r16, r17, r18, r19)
            goto L_0x0193
        L_0x0357:
            java.lang.Integer r17 = X.AnonymousClass05K.A01
            goto L_0x0343
        L_0x035a:
            java.lang.Integer r17 = X.AnonymousClass05K.A0C
            goto L_0x0343
        L_0x035d:
            X.05G r4 = r2.A0b
            com.instagram.leadgen.core.model.LeadGenProfileContentInfo r0 = new com.instagram.leadgen.core.model.LeadGenProfileContentInfo
            r0.<init>(r8, r1, r10)
            goto L_0x0146
        L_0x0366:
            r10 = r9
            goto L_0x012b
        L_0x0369:
            boolean r0 = r4.A07
            r13 = 0
            if (r0 == 0) goto L_0x038e
            X.05G r15 = r4.A0H
            java.util.Iterator r16 = r12.iterator()
        L_0x0374:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x040c
            java.lang.Object r14 = r16.next()
            r0 = r14
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            X.Uxp r1 = r0.A03
            X.Uxp r0 = X.C16595Uxp.A0a
            if (r1 == r0) goto L_0x038b
            X.Uxp r0 = X.C16595Uxp.A0Q
            if (r1 != r0) goto L_0x0374
        L_0x038b:
            r15.Epw(r14)
        L_0x038e:
            if (r10 == 0) goto L_0x03b3
            int r0 = r10.length()
            if (r0 == 0) goto L_0x03b3
            java.util.Iterator r15 = r18.iterator()
        L_0x039a:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x040a
            java.lang.Object r14 = r15.next()
            r0 = r14
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            X.Uxp r1 = r0.A03
            X.Uxp r0 = X.C16595Uxp.A0O
            if (r1 != r0) goto L_0x039a
        L_0x03ad:
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r14 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r14
            if (r14 == 0) goto L_0x03b3
            r14.A00 = r10
        L_0x03b3:
            if (r19 == 0) goto L_0x03db
            int r0 = r19.length()
            if (r0 == 0) goto L_0x03db
            java.util.Iterator r15 = r18.iterator()
        L_0x03bf:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x03d3
            java.lang.Object r14 = r15.next()
            r0 = r14
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            X.Uxp r1 = r0.A03
            X.Uxp r0 = X.C16595Uxp.A0A
            if (r1 != r0) goto L_0x03bf
            r13 = r14
        L_0x03d3:
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r13 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r13
            if (r13 == 0) goto L_0x03db
            r0 = r19
            r13.A00 = r0
        L_0x03db:
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.util.Iterator r14 = r12.iterator()
        L_0x03e4:
            boolean r0 = r14.hasNext()
            if (r0 == 0) goto L_0x040f
            java.lang.Object r13 = r14.next()
            r0 = r13
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            X.0qQ.A0B(r0, r2)
            X.Uxp r12 = r0.A03
            X.Uxp r0 = X.C16595Uxp.A06
            if (r12 == r0) goto L_0x0406
            X.Uxp r0 = X.C16595Uxp.A0U
            if (r12 == r0) goto L_0x0406
            X.Uxp r0 = X.C16595Uxp.A0V
            if (r12 == r0) goto L_0x0406
            X.Uxp r0 = X.C16595Uxp.A08
            if (r12 != r0) goto L_0x03e4
        L_0x0406:
            r1.add(r13)
            goto L_0x03e4
        L_0x040a:
            r14 = r13
            goto L_0x03ad
        L_0x040c:
            r14 = r13
            goto L_0x038b
        L_0x040f:
            if (r11 == 0) goto L_0x041b
            java.lang.Object r0 = X.00k.A0O(r1, r2)
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            if (r0 == 0) goto L_0x041b
            r0.A00 = r11
        L_0x041b:
            X.05G r0 = r4.A0J
            r0.Epw(r1)
            X.05G r11 = r4.A0K
            boolean r1 = X.AnonymousClass7TE.A1b(r1)
            boolean r0 = r4.A0B
            if (r0 != 0) goto L_0x042e
            r28 = r21
            if (r3 == 0) goto L_0x0430
        L_0x042e:
            r28 = r9
        L_0x0430:
            r17 = 0
            if (r0 != 0) goto L_0x0437
            r0 = 0
            if (r3 == 0) goto L_0x0438
        L_0x0437:
            r0 = 1
        L_0x0438:
            X.4Yx r12 = com.instagram.leadads.repository.LeadFormQuestionsRepository.A00(r7, r0)
            if (r3 == 0) goto L_0x050c
            r22 = r9
        L_0x0440:
            if (r1 != 0) goto L_0x0508
            boolean r0 = r4.A06
            if (r0 == 0) goto L_0x0508
            X.UKg r25 = X.C18809W3g.A00(r7)
        L_0x044a:
            X.UwW r26 = X.C16527UwW.CUSTOMER_INFO
            r1 = 2
            X.N4R r13 = new X.N4R
            r13.<init>((X.C266444Yx) r12, (java.lang.Integer) r9, (int) r1)
            X.Cu5 r0 = r7.A00()
            com.instagram.common.typedurl.ImageUrl r0 = r0.A00
            r24 = r0
            java.util.List r0 = r8.A0B
            if (r0 != 0) goto L_0x0463
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L_0x0463:
            java.util.Set r12 = r4.A05
            boolean r12 = r12.isEmpty()
            r33 = r12 ^ 1
            boolean r12 = r4.A07
            r34 = r12
            boolean r12 = r4.A08
            r36 = r12
            boolean r15 = r4.A0A
            boolean r14 = r4.A0C
            boolean r12 = r4.A09
            if (r10 == 0) goto L_0x0482
            int r16 = r10.length()
            r10 = 0
            if (r16 != 0) goto L_0x0483
        L_0x0482:
            r10 = 1
        L_0x0483:
            r40 = r10 ^ 1
            if (r19 == 0) goto L_0x048d
            int r10 = r19.length()
            if (r10 != 0) goto L_0x048f
        L_0x048d:
            r17 = 1
        L_0x048f:
            r41 = r17 ^ 1
            X.0sn r32 = X.0sn.A00
            X.UKy r10 = new X.UKy
            r23 = r13
            r27 = r9
            r29 = r22
            r30 = r18
            r31 = r0
            r35 = r3
            r37 = r15
            r38 = r14
            r39 = r12
            r22 = r10
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
            r11.Epw(r10)
            X.05G r10 = r4.A0L
            r0 = 0
            if (r3 == 0) goto L_0x04e6
            X.4Yx r0 = com.instagram.leadads.repository.LeadFormQuestionsRepository.A00(r7, r2)
            X.UwW r26 = X.C16527UwW.SINGLE_SCREEN_PRIVACY_POLICY
            X.N4R r3 = new X.N4R
            r3.<init>((X.C266444Yx) r0, (java.lang.Integer) r9, (int) r1)
            X.UKy r0 = new X.UKy
            r22 = r0
            r23 = r3
            r24 = r9
            r25 = r9
            r28 = r21
            r29 = r9
            r30 = r32
            r31 = r32
            r33 = r2
            r34 = r2
            r35 = r6
            r36 = r2
            r37 = r2
            r38 = r2
            r39 = r2
            r40 = r2
            r41 = r2
            r22.<init>(r23, r24, r25, r26, r27, r28, r29, r30, r31, r32, r33, r34, r35, r36, r37, r38, r39, r40, r41)
        L_0x04e6:
            r10.Epw(r0)
            X.05G r1 = r4.A0I
            java.util.List r0 = r8.A0A
            r1.Epw(r0)
            if (r5 != 0) goto L_0x04f4
            X.0sl r5 = X.0sl.A00
        L_0x04f4:
            r4.A05 = r5
            X.0r6 r2 = r4.A0F
            r1 = 3
            X.MHs r0 = new X.MHs
            r0.<init>(r4, r9, r1)
            X.0pt r1 = X.AnonymousClass10H.A00(r0, r11, r10, r2)
            r0 = r20
            X.AnonymousClass11O.A03(r0, r1)
            return
        L_0x0508:
            r25 = r9
            goto L_0x044a
        L_0x050c:
            X.Cuu r0 = r7.A01()
            java.lang.String r0 = r0.A02
            r22 = r0
            goto L_0x0440
        L_0x0516:
            java.lang.String r0 = "leadAdsPrivacyPolicy"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x0520:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        L_0x0526:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16039UnS.<init>(X.6rJ, com.instagram.common.session.UserSession, X.WYW):void");
    }

    public final String A01(int i) {
        C16527UwW uwW;
        String obj;
        C15045UKy A0Q2 = C13991Tnr.A0Q(this.A0a, i);
        if (A0Q2 == null || (uwW = A0Q2.A03) == null || (obj = uwW.toString()) == null) {
            return "Unknown";
        }
        return obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0090 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.util.List A02() {
        /*
            r6 = this;
            X.05G r0 = r6.A0a
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0010:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0022
            java.lang.Object r0 = r1.next()
            X.UKy r0 = (X.C15045UKy) r0
            java.util.List r0 = r0.A08
            r2.add(r0)
            goto L_0x0010
        L_0x0022:
            java.util.ArrayList r5 = X.0Yv.A1F(r2)
            boolean r0 = r5 instanceof java.util.Collection
            if (r0 == 0) goto L_0x005d
            boolean r0 = r5.isEmpty()
            if (r0 == 0) goto L_0x005d
        L_0x0030:
            r2 = 0
        L_0x0031:
            com.instagram.leadads.repository.LeadFormQuestionsRepository r1 = r6.A0J
            boolean r0 = r1.A07
            if (r0 == 0) goto L_0x0083
            if (r2 != 0) goto L_0x0083
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r5.iterator()
        L_0x0042:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x008f
            java.lang.Object r2 = r3.next()
            r0 = r2
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r0 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r0
            X.Uxp r1 = r0.A03
            X.Uxp r0 = X.C16595Uxp.A0a
            if (r1 == r0) goto L_0x0042
            X.Uxp r0 = X.C16595Uxp.A0Q
            if (r1 == r0) goto L_0x0042
            r4.add(r2)
            goto L_0x0042
        L_0x005d:
            java.util.Iterator r3 = r5.iterator()
        L_0x0061:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0030
            java.lang.Object r2 = r3.next()
            com.instagram.leadgen.core.model.LeadGenFormBaseQuestion r2 = (com.instagram.leadgen.core.model.LeadGenFormBaseQuestion) r2
            X.Uxp r1 = X.C16595Uxp.A0U
            X.Uxp r0 = X.C16595Uxp.A0V
            X.Uxp[] r0 = new X.C16595Uxp[]{r1, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            X.Uxp r0 = r2.A03
            boolean r0 = r1.contains(r0)
            if (r0 == 0) goto L_0x0061
            r2 = 1
            goto L_0x0031
        L_0x0083:
            X.0Ud r0 = r1.A0N
            java.lang.Object r0 = r0.getValue()
            if (r0 == 0) goto L_0x0090
            java.util.ArrayList r4 = X.00k.A0T(r0, r5)
        L_0x008f:
            return r4
        L_0x0090:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C16039UnS.A02():java.util.List");
    }

    public final void A03(int i) {
        C16527UwW uwW;
        String str;
        C16527UwW uwW2;
        LeadGenTrustSignalsPayload leadGenTrustSignalsPayload;
        Integer num;
        XB6 xb6;
        String str2;
        Bundle A0B2;
        String str3;
        String str4;
        05G r3 = this.A0a;
        C15045UKy A0Q2 = C13991Tnr.A0Q(r3, i);
        if (A0Q2 != null) {
            uwW = A0Q2.A03;
            if (uwW != null) {
                int ordinal = uwW.ordinal();
                if (ordinal == 8) {
                    C18462VsB vsB = this.A0M;
                    xb6 = vsB.A00;
                    str2 = vsB.A01;
                    A0B2 = DbY.A0B("form_id", vsB.A02);
                    str3 = "lead_gen_conditional_question_loading_screen";
                    str4 = "loading_screen_impression";
                } else if (ordinal == 11) {
                    C18462VsB vsB2 = this.A0M;
                    xb6 = vsB2.A00;
                    str2 = vsB2.A01;
                    A0B2 = DbY.A0B("form_id", vsB2.A02);
                    str3 = "lead_gen_conditional_question_error_screen";
                    str4 = "error_screen_impression";
                } else if (ordinal == 9) {
                    C18462VsB vsB3 = this.A0M;
                    xb6 = vsB3.A00;
                    str2 = vsB3.A01;
                    A0B2 = DbY.A0B("form_id", vsB3.A02);
                    str3 = "lead_gen_conditional_question_disqualifying_screen";
                    str4 = "disqualifying_screen_impression";
                }
                xb6.Cgq(A0B2, str2, str3, str4, "impression");
                return;
            }
        } else {
            uwW = null;
        }
        C18462VsB vsB4 = this.A0M;
        if (uwW == null || (str = uwW.toString()) == null) {
            str = "Unknown";
        }
        XB6 xb62 = vsB4.A00;
        String str5 = vsB4.A01;
        xb62.Cgq(C18462VsB.A00(vsB4, str, (String) null), str5, "lead_gen_multi_step_consumer_questions", "consumer_question_multi_step_page_impression", "impression");
        C15045UKy A0Q3 = C13991Tnr.A0Q(r3, i);
        if (A0Q3 != null) {
            List<LeadGenFormBaseQuestion> list = A0Q3.A08;
            if (list != null) {
                for (LeadGenFormBaseQuestion leadGenFormBaseQuestion : list) {
                    W33 w33 = W33.A00;
                    String A072 = w33.A07(leadGenFormBaseQuestion);
                    String A062 = w33.A06(leadGenFormBaseQuestion);
                    0qQ.A0B(A072, 0);
                    xb62.Cgq(C18462VsB.A00(vsB4, A072, A062), str5, "lead_gen_multi_step_consumer_questions", "question_impression", "impression");
                    if (leadGenFormBaseQuestion.A01) {
                        String A073 = w33.A07(leadGenFormBaseQuestion);
                        String A063 = w33.A06(leadGenFormBaseQuestion);
                        0qQ.A0B(A073, 0);
                        xb62.Cgq(C18462VsB.A00(vsB4, A073, A063), str5, "lead_gen_multi_step_consumer_questions", "answer_prefilled", "impression");
                        if (!this.A0C) {
                            A04(leadGenFormBaseQuestion);
                        }
                    }
                }
            }
            uwW2 = A0Q3.A03;
        } else {
            uwW2 = null;
        }
        if (uwW2 == C16527UwW.CUSTOMER_INFO) {
            this.A0C = true;
        }
        LeadGenProfileContentInfo leadGenProfileContentInfo = (LeadGenProfileContentInfo) this.A0b.getValue();
        if (leadGenProfileContentInfo != null && (leadGenTrustSignalsPayload = leadGenProfileContentInfo.A01) != null && (num = leadGenTrustSignalsPayload.A04) != null && num == AnonymousClass05K.A00) {
            C16611Uy7 A002 = leadGenTrustSignalsPayload.A00();
            String str6 = A002.A02;
            if (str6 == null) {
                str6 = A002.toString();
            }
            String A012 = A01(i);
            if (!Dba.A1X(C16527UwW.LOADING, A012)) {
                xb62.Cgq(C18462VsB.A00(vsB4, A012, str6), str5, "lead_gen_multi_step_consumer_questions", "business_profile_header_impression", "impression");
            }
        }
    }

    public final void A04(LeadGenFormBaseQuestion leadGenFormBaseQuestion) {
        C18462VsB vsB = this.A0M;
        W33 w33 = W33.A00;
        String A072 = w33.A07(leadGenFormBaseQuestion);
        String A062 = w33.A06(leadGenFormBaseQuestion);
        0qQ.A0B(A072, 0);
        vsB.A00.Cgq(C18462VsB.A00(vsB, A072, A062), vsB.A01, "lead_gen_multi_step_consumer_questions", "question_filled", "impression");
    }

    public final void A06(List list) {
        05G r4 = this.A0a;
        ArrayList A0U2 = 00k.A0U((Collection) r4.getValue());
        Iterator it = A0U2.iterator();
        int i = 0;
        while (it.hasNext()) {
            if (((C15045UKy) it.next()).A03 != C16527UwW.STORE_LOCATOR) {
                i++;
            } else if (i >= 0) {
                C15045UKy uKy = (C15045UKy) A0U2.get(i);
                List list2 = uKy.A08;
                C16527UwW uwW = uKy.A03;
                A0U2.set(i, new C15045UKy(uKy.A00, (ImageUrl) null, (C15027UKg) null, uwW, (LeadGenDisqualifyingScreenData) null, (LeadGenPrivacyPolicy) null, (String) null, list2, 0sn.A00, list, false, false, this.A09, false, false, uKy.A0B, uKy.A0A, false, false));
                r4.Epw(00k.A0a(A0U2));
                return;
            } else {
                return;
            }
        }
    }

    public final boolean A07() {
        boolean z = this.A0g;
        UserSession userSession = this.A0H;
        0qQ.A0B(userSession, 1);
        if (z) {
            return false;
        }
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36323122537900917L) || 182.A06(r2, userSession, 36329264341139341L)) {
            return true;
        }
        return false;
    }

    public static C18462VsB A00(C15267UYh uYh) {
        return ((C16039UnS) uYh.A07()).A0M;
    }

    public C16039UnS() {
        1HR A0f2 = C13990Tnq.A0f();
        this.A0X = A0f2;
        this.A0Y = 0u9.A04(A0f2);
        this.A0E = true;
        this.A0Z = 106.A01((Object) null);
        this.A0b = 106.A01((Object) null);
        this.A0a = 106.A01(0sn.A00);
        02z A012 = 106.A01((Object) null);
        this.A0c = A012;
        AnonymousClass11O.A03(C318116oQ.A00(this), 10q.A01(new C20592WvV(this, (AnonymousClass4D7) null, 26), AnonymousClass11F.A01(C20744WyH.A00, new AnonymousClass0qC(A012))));
    }
}
