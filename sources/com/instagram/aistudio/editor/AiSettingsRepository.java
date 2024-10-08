package com.instagram.aistudio.editor;

import X.00k;
import X.00l;
import X.02z;
import X.05G;
import X.0Df;
import X.0eP;
import X.0qQ;
import X.0sn;
import X.106;
import X.10b;
import X.1vm;
import X.1vn;
import X.2IS;
import X.AnonymousClass000;
import X.AnonymousClass0Ud;
import X.AnonymousClass0eM;
import X.AnonymousClass1EO;
import X.AnonymousClass43D;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C252733pa;
import X.C262204Co;
import X.C310336ap;
import X.C41845B3m;
import X.C43163Btn;
import X.C43347Bwl;
import X.C51966G9m;
import X.C51975G9x;
import X.C61055Jvt;
import X.C61061Jvz;
import X.C61073JwB;
import X.C62608Kif;
import X.C62626Kix;
import X.C63112Krf;
import X.C64394LbB;
import X.C64397LbE;
import X.C64406LbN;
import X.C66174MGl;
import X.C8H;
import X.DbS;
import X.DbT;
import X.DbU;
import X.DbV;
import X.DbW;
import X.DbY;
import X.JTO;
import X.JTP;
import X.JTQ;
import X.K64;
import X.MMA;
import com.facebook.graphql.calls.GraphQlCallInput;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class AiSettingsRepository extends C252733pa {
    public AnonymousClass1EO A00;
    public C262204Co A01;
    public final UserSession A02;
    public final 1vn A03;
    public final List A04;
    public final List A05;
    public final List A06;
    public final AnonymousClass0eM A07;
    public final 05G A08;
    public final 05G A09;
    public final 05G A0A;
    public final 05G A0B;
    public final 05G A0C;
    public final 05G A0D;
    public final 05G A0E;
    public final 05G A0F;
    public final 05G A0G = 106.A01((Object) null);
    public final 05G A0H;
    public final 05G A0I;
    public final 05G A0J;
    public final 05G A0K;
    public final 05G A0L;
    public final 05G A0M;
    public final 05G A0N;
    public final 05G A0O;
    public final 05G A0P;
    public final 05G A0Q;
    public final 05G A0R;
    public final 05G A0S;
    public final 05G A0T;
    public final 05G A0U;
    public final 05G A0V;
    public final 05G A0W;
    public final AnonymousClass0Ud A0X;
    public final AnonymousClass0Ud A0Y;
    public final AnonymousClass0Ud A0Z;
    public final AnonymousClass0Ud A0a;
    public final AnonymousClass0Ud A0b;
    public final AnonymousClass0Ud A0c;
    public final AnonymousClass0Ud A0d;
    public final AnonymousClass0Ud A0e;
    public final AnonymousClass0Ud A0f;
    public final AnonymousClass0Ud A0g;
    public final AnonymousClass0Ud A0h;
    public final AnonymousClass0Ud A0i;
    public final AnonymousClass0Ud A0j;
    public final AnonymousClass0Ud A0k;
    public final AnonymousClass0Ud A0l;
    public final AnonymousClass0Ud A0m;
    public final AnonymousClass0Ud A0n;
    public final AnonymousClass0Ud A0o;
    public final AnonymousClass0Ud A0p;
    public final AnonymousClass0Ud A0q;
    public final AnonymousClass0Ud A0r;
    public final AnonymousClass0Ud A0s;
    public final AnonymousClass0Ud A0t;
    public final AnonymousClass0Ud A0u;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AiSettingsRepository(UserSession userSession, 1vn r7) {
        super("AiSettingsRepository", AnonymousClass43D.A00(1968915545));
        0qQ.A0B(r7, 2);
        this.A02 = userSession;
        this.A03 = r7;
        02z A012 = 106.A01((Object) null);
        this.A08 = A012;
        this.A0X = 10b.A03(A012);
        02z A0q2 = JTQ.A0q();
        this.A09 = A0q2;
        this.A0Y = 10b.A03(A0q2);
        02z A10 = DbS.A10(false);
        this.A0M = A10;
        this.A0k = 10b.A03(A10);
        02z A013 = 106.A01((Object) null);
        this.A0V = A013;
        this.A0t = 10b.A03(A013);
        02z A102 = DbS.A10(false);
        this.A0R = A102;
        this.A0p = 10b.A03(A102);
        02z A103 = DbS.A10(false);
        this.A0S = A103;
        this.A0q = 10b.A03(A103);
        02z A104 = DbS.A10(false);
        this.A0I = A104;
        this.A0g = 10b.A03(A104);
        02z A014 = 106.A01(Integer.valueOf(C63112Krf.A00(userSession)));
        this.A0H = A014;
        this.A0f = 10b.A03(A014);
        02z A105 = DbS.A10(0);
        this.A0K = A105;
        this.A0i = 10b.A03(A105);
        02z A106 = DbS.A10(0);
        this.A0J = A106;
        this.A0h = 10b.A03(A106);
        02z A107 = DbS.A10("");
        this.A0A = A107;
        this.A0Z = 10b.A03(A107);
        02z A015 = 106.A01((Object) null);
        this.A0W = A015;
        this.A0u = 10b.A03(A015);
        02z A108 = DbS.A10(false);
        this.A0Q = A108;
        this.A0o = 10b.A03(A108);
        02z A109 = DbS.A10(false);
        this.A0T = A109;
        this.A0r = 10b.A03(A109);
        02z A1010 = DbS.A10(false);
        this.A0U = A1010;
        this.A0s = 10b.A03(A1010);
        02z A016 = 106.A01((Object) null);
        this.A0F = A016;
        this.A0e = 10b.A03(A016);
        02z A1011 = DbS.A10(false);
        this.A0N = A1011;
        this.A0l = 10b.A03(A1011);
        02z A017 = 106.A01((Object) null);
        this.A0C = A017;
        this.A0b = 10b.A03(A017);
        02z A1012 = DbS.A10(false);
        this.A0O = A1012;
        this.A0m = 10b.A03(A1012);
        02z A018 = 106.A01((Object) null);
        this.A0D = A018;
        this.A0c = 10b.A03(A018);
        02z A1013 = DbS.A10(false);
        this.A0P = A1013;
        this.A0n = 10b.A03(A1013);
        02z A019 = 106.A01((Object) null);
        this.A0E = A019;
        this.A0d = 10b.A03(A019);
        02z A1014 = DbS.A10(false);
        this.A0L = A1014;
        this.A0j = 10b.A03(A1014);
        02z A0110 = 106.A01((Object) null);
        this.A0B = A0110;
        this.A0a = 10b.A03(A0110);
        this.A05 = AnonymousClass7TE.A1C();
        this.A06 = AnonymousClass7TE.A1C();
        this.A04 = AnonymousClass7TE.A1C();
        this.A07 = MMA.A00(this, 29);
    }

    public static final String A01(AiSettingsRepository aiSettingsRepository, C43347Bwl bwl) {
        Enum enumR;
        if (bwl != null) {
            enumR = bwl.getOptionalEnumField(0, AnonymousClass000.A00(593), C62626Kix.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        } else {
            enumR = null;
        }
        Iterator A0u2 = AnonymousClass7TF.A0u(JTO.A19(aiSettingsRepository.A0Y));
        while (A0u2.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u2);
            String A13 = DbT.A13(A1J);
            if (enumR == A1J.getValue()) {
                return A13;
            }
        }
        return null;
    }

    public final void A09(String str) {
        AnonymousClass4D7 A0t2 = C51975G9x.A0t(this.A01);
        Object value = this.A0X.getValue();
        if (value != null) {
            0Df A032 = C41845B3m.A03(GraphQlCallInput.A02, ((C61061Jvz) value).A04, "persona_id");
            2IS A0D2 = JTQ.A0D(A032, str, "image_prompt");
            2IS A042 = C41845B3m.A04();
            DbW.A18(A032, A0D2, "input");
            PandoGraphQLRequest A002 = C64406LbN.A00(A0D2, A042);
            A002.setNetworkTimeoutSeconds(30);
            AnonymousClass7TF.A1O(this.A0M, true);
            this.A01 = C51966G9m.A1L(new C66174MGl((Object) this, (Object) A002, str, A0t2, 3), this.A01);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void A0A(String str) {
        C61061Jvz jvz;
        String str2 = str;
        0qQ.A0B(str2, 0);
        05G r1 = this.A08;
        C61061Jvz jvz2 = (C61061Jvz) r1.getValue();
        if (jvz2 != null) {
            jvz = C61061Jvz.A00((C61073JwB) null, jvz2, (ImageUrl) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, str2, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (List) null, 8388095, false, false);
        } else {
            jvz = null;
        }
        r1.Epw(jvz);
        A07(this, (String) null, (String) null, str2, (String) null, (String) null, (List) null, (List) null, 251);
    }

    public final void A0B(List list) {
        C61061Jvz jvz;
        List list2 = list;
        0qQ.A0B(list2, 0);
        05G r1 = this.A08;
        C61061Jvz jvz2 = (C61061Jvz) r1.getValue();
        if (jvz2 != null) {
            jvz = C61061Jvz.A00((C61073JwB) null, jvz2, (ImageUrl) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, list2, 6291455, false, false);
        } else {
            jvz = null;
        }
        r1.Epw(jvz);
        A07(this, (String) null, (String) null, (String) null, (String) null, (String) null, list2, (List) null, 191);
    }

    public final void A0C(List list) {
        List list2 = list;
        0qQ.A0B(list2, 0);
        Object value = this.A0X.getValue();
        if (value != null) {
            this.A08.Epw(C61061Jvz.A00((C61073JwB) null, (C61061Jvz) value, (ImageUrl) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, list2, (List) null, 7340031, false, false));
            A07(this, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, (List) null, 255);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final boolean A0E(String str, List list) {
        boolean A1U = AnonymousClass7TF.A1U(0, list, str);
        C61061Jvz A0M2 = JTP.A0M(this.A08);
        if (A0M2 != null) {
            UserSession userSession = this.A02;
            int A042 = DbS.A04(AnonymousClass7TF.A0H(userSession), userSession, 36605550997869822L);
            if (00l.A0W(str) || str.length() > A042) {
                return false;
            }
            int A043 = DbS.A04(AnonymousClass7TF.A0H(userSession), userSession, 36605550998131970L);
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    if (AnonymousClass7TE.A18(it).length() > A043) {
                        return false;
                    }
                }
            }
            if (str.equals(A0M2.A0B)) {
                ArrayList A0R2 = 00k.A0R(list, A0M2.A0G);
                if ((A0R2 instanceof Collection) && A0R2.isEmpty()) {
                    return false;
                }
                Iterator it2 = A0R2.iterator();
                while (it2.hasNext()) {
                    0eP A1A = JTO.A1A(it2);
                    if (C51966G9m.A1a(A1A.A00, A1A.A01)) {
                        return true;
                    }
                }
                return false;
            }
        }
        return A1U;
    }

    public static C61061Jvz A00(AiSettingsRepository aiSettingsRepository) {
        return (C61061Jvz) aiSettingsRepository.A0X.getValue();
    }

    public static final void A05(AiSettingsRepository aiSettingsRepository, C62626Kix kix) {
        String str;
        C62626Kix kix2 = C62626Kix.ONLY_ME;
        AiSettingsRepository aiSettingsRepository2 = aiSettingsRepository;
        AnonymousClass1EO r0 = aiSettingsRepository.A00;
        if (kix == kix2) {
            if (r0 != null) {
                r0.cancel();
            }
            2IS A042 = C41845B3m.A04();
            2IS A043 = C41845B3m.A04();
            C61061Jvz A0M2 = JTP.A0M(aiSettingsRepository.A08);
            if (A0M2 == null || (str = A0M2.A07) == null) {
                str = "";
            }
            PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(DbU.A0J(A042, "personaVersionId", str), "AiSafetyViolationsGraphQLSubscription", A042.getParamsCopy(), A043.getParamsCopy(), C43163Btn.class, false, PandoRealtimeInfoJNI.forSubscription("xfb_genai_persona_version_safety_status_update_subscribe"), 0, (String) null, "xfb_genai_persona_version_safety_status_update_subscribe", AnonymousClass7TE.A1C());
            aiSettingsRepository2.A00 = 1vm.A01(aiSettingsRepository2.A02).A01(new C64394LbB(aiSettingsRepository2, 2), new C64397LbE(aiSettingsRepository2, 1), pandoGraphQLRequest);
        } else if (r0 != null) {
            r0.cancel();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x012e, code lost:
        if (X.0qQ.A0K(r4, r0) == false) goto L_0x0130;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void A07(com.instagram.aistudio.editor.AiSettingsRepository r22, java.lang.String r23, java.lang.String r24, java.lang.String r25, java.lang.String r26, java.lang.String r27, java.util.List r28, java.util.List r29, int r30) {
        /*
            r3 = r30
            r6 = r28
            r7 = r27
            r1 = r26
            r8 = r25
            r9 = r24
            r4 = r29
            r10 = r23
            r0 = r30 & 1
            r11 = 0
            r2 = r22
            if (r0 == 0) goto L_0x001f
            X.Jvz r0 = A00(r2)
            if (r0 == 0) goto L_0x01ad
            java.lang.String r10 = r0.A06
        L_0x001f:
            r0 = r30 & 2
            if (r0 == 0) goto L_0x002b
            X.Jvz r0 = A00(r2)
            if (r0 == 0) goto L_0x01aa
            java.lang.String r9 = r0.A09
        L_0x002b:
            r0 = r30 & 4
            if (r0 == 0) goto L_0x0037
            X.Jvz r0 = A00(r2)
            if (r0 == 0) goto L_0x01a7
            java.lang.String r8 = r0.A0B
        L_0x0037:
            r0 = r30 & 8
            if (r0 == 0) goto L_0x0043
            X.Jvz r0 = A00(r2)
            if (r0 == 0) goto L_0x01a4
            java.lang.String r1 = r0.A08
        L_0x0043:
            r0 = r30 & 16
            if (r0 == 0) goto L_0x004c
            X.0Ud r0 = r2.A0X
            r0.getValue()
        L_0x004c:
            r0 = r30 & 32
            if (r0 == 0) goto L_0x0058
            X.Jvz r0 = A00(r2)
            if (r0 == 0) goto L_0x01a1
            java.lang.String r7 = r0.A03
        L_0x0058:
            r0 = r30 & 64
            if (r0 == 0) goto L_0x0064
            X.Jvz r0 = A00(r2)
            if (r0 == 0) goto L_0x019e
            java.util.List r6 = r0.A0D
        L_0x0064:
            r0 = r3 & 128(0x80, float:1.794E-43)
            if (r0 == 0) goto L_0x0070
            X.Jvz r0 = A00(r2)
            if (r0 == 0) goto L_0x019b
            java.util.List r4 = r0.A0E
        L_0x0070:
            X.0Ud r0 = r2.A0X
            java.lang.Object r12 = r0.getValue()
            X.Jvz r12 = (X.C61061Jvz) r12
            X.05G r0 = r2.A0G
            X.Jvz r5 = X.JTP.A0M(r0)
            r3 = 0
            if (r5 == 0) goto L_0x0198
            java.lang.String r0 = r5.A06
        L_0x0083:
            boolean r0 = X.0qQ.A0K(r10, r0)
            if (r0 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x0195
            java.lang.String r0 = r5.A09
        L_0x008d:
            boolean r0 = X.0qQ.A0K(r9, r0)
            if (r0 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x0192
            java.lang.String r0 = r5.A0B
        L_0x0097:
            boolean r0 = X.0qQ.A0K(r8, r0)
            if (r0 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x018f
            java.lang.String r0 = r5.A08
        L_0x00a1:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x018c
            java.util.List r1 = r12.A0H
        L_0x00ab:
            if (r5 == 0) goto L_0x0189
            java.util.List r0 = r5.A0H
        L_0x00af:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0186
            java.util.List r1 = r12.A0I
        L_0x00b9:
            if (r5 == 0) goto L_0x0183
            java.util.List r0 = r5.A0I
        L_0x00bd:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0180
            java.lang.String r1 = r12.A05
        L_0x00c7:
            if (r5 == 0) goto L_0x017d
            java.lang.String r0 = r5.A05
        L_0x00cb:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x017a
            com.instagram.common.typedurl.ImageUrl r1 = r12.A01
        L_0x00d5:
            if (r5 == 0) goto L_0x0177
            com.instagram.common.typedurl.ImageUrl r0 = r5.A01
        L_0x00d9:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x0174
            boolean r0 = r12.A0L
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
        L_0x00e7:
            if (r5 == 0) goto L_0x0171
            boolean r0 = r5.A0L
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x00ef:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x016f
            java.util.List r1 = r12.A0F
        L_0x00f9:
            if (r5 == 0) goto L_0x016d
            java.util.List r0 = r5.A0F
        L_0x00fd:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            if (r12 == 0) goto L_0x016b
            java.util.List r1 = r12.A0G
        L_0x0107:
            if (r5 == 0) goto L_0x0169
            java.util.List r0 = r5.A0G
        L_0x010b:
            boolean r0 = X.0qQ.A0K(r1, r0)
            if (r0 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x0167
            java.lang.String r0 = r5.A03
        L_0x0115:
            boolean r0 = X.0qQ.A0K(r7, r0)
            if (r0 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x0165
            java.util.List r0 = r5.A0D
        L_0x011f:
            boolean r0 = X.0qQ.A0K(r6, r0)
            if (r0 == 0) goto L_0x0130
            if (r5 == 0) goto L_0x0163
            java.util.List r0 = r5.A0E
        L_0x0129:
            boolean r0 = X.0qQ.A0K(r4, r0)
            r1 = 0
            if (r0 != 0) goto L_0x0131
        L_0x0130:
            r1 = 1
        L_0x0131:
            if (r12 == 0) goto L_0x015d
            boolean r0 = r12.A0K
            if (r1 == r0) goto L_0x0162
            r30 = 0
            r28 = 8380415(0x7fdfff, float:1.1743463E-38)
            r13 = r11
            r14 = r11
            r15 = r11
            r16 = r11
            r17 = r11
            r18 = r11
            r19 = r11
            r20 = r11
            r21 = r11
            r22 = r11
            r23 = r11
            r24 = r11
            r25 = r11
            r26 = r11
            r27 = r11
            r29 = r1
            X.Jvz r3 = X.C61061Jvz.A00(r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
        L_0x015d:
            X.05G r0 = r2.A08
            r0.Epw(r3)
        L_0x0162:
            return
        L_0x0163:
            r0 = r11
            goto L_0x0129
        L_0x0165:
            r0 = r11
            goto L_0x011f
        L_0x0167:
            r0 = r11
            goto L_0x0115
        L_0x0169:
            r0 = r11
            goto L_0x010b
        L_0x016b:
            r1 = r11
            goto L_0x0107
        L_0x016d:
            r0 = r11
            goto L_0x00fd
        L_0x016f:
            r1 = r11
            goto L_0x00f9
        L_0x0171:
            r0 = r11
            goto L_0x00ef
        L_0x0174:
            r1 = r11
            goto L_0x00e7
        L_0x0177:
            r0 = r11
            goto L_0x00d9
        L_0x017a:
            r1 = r11
            goto L_0x00d5
        L_0x017d:
            r0 = r11
            goto L_0x00cb
        L_0x0180:
            r1 = r11
            goto L_0x00c7
        L_0x0183:
            r0 = r11
            goto L_0x00bd
        L_0x0186:
            r1 = r11
            goto L_0x00b9
        L_0x0189:
            r0 = r11
            goto L_0x00af
        L_0x018c:
            r1 = r11
            goto L_0x00ab
        L_0x018f:
            r0 = r11
            goto L_0x00a1
        L_0x0192:
            r0 = r11
            goto L_0x0097
        L_0x0195:
            r0 = r11
            goto L_0x008d
        L_0x0198:
            r0 = r11
            goto L_0x0083
        L_0x019b:
            r4 = r11
            goto L_0x0070
        L_0x019e:
            r6 = r11
            goto L_0x0064
        L_0x01a1:
            r7 = r11
            goto L_0x0058
        L_0x01a4:
            r1 = r11
            goto L_0x0043
        L_0x01a7:
            r8 = r11
            goto L_0x0037
        L_0x01aa:
            r9 = r11
            goto L_0x002b
        L_0x01ad:
            r10 = r11
            goto L_0x001f
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.editor.AiSettingsRepository.A07(com.instagram.aistudio.editor.AiSettingsRepository, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.util.List, java.util.List, int):void");
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [X.MDw, X.4D7] */
    /* JADX WARNING: type inference failed for: r3v4 */
    /* JADX WARNING: type inference failed for: r3v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0023  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A08(X.N49 r18, java.lang.String r19, java.lang.String r20, X.AnonymousClass4D7 r21) {
        /*
            r17 = this;
            r5 = 30
            r6 = r21
            boolean r0 = X.C66144MDw.A02(r5, r6)
            r4 = r17
            if (r0 == 0) goto L_0x00c2
            r3 = r6
            X.MDw r3 = (X.C66144MDw) r3
            int r2 = r3.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x00c2
            int r2 = r2 - r1
            r3.A00 = r2
        L_0x001a:
            java.lang.Object r1 = r3.A02
            X.1Hj r2 = X.1Hj.A02
            int r0 = r3.A00
            r11 = 1
            if (r0 == 0) goto L_0x0047
            if (r0 != r11) goto L_0x00ce
            java.lang.Object r2 = r3.A01
            com.instagram.aistudio.editor.AiSettingsRepository r2 = (com.instagram.aistudio.editor.AiSettingsRepository) r2
            X.0eS.A00(r1)
        L_0x002c:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0042
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00c9
            X.05G r0 = r2.A0R
            X.JTR.A1V(r0)
            r1 = 2131952811(0x7f1304ab, float:1.9542075E38)
            java.lang.String r0 = "ai_studio_save_ai_changes_error"
            A06(r2, r0, r1)
            r11 = 0
        L_0x0042:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r11)
            return r0
        L_0x0047:
            X.0eS.A00(r1)
            r7 = r20
            r6 = r18
            if (r18 != 0) goto L_0x00ab
            if (r20 == 0) goto L_0x00d3
            r5 = 0
        L_0x0053:
            X.0K0 r1 = com.facebook.graphql.calls.GraphQlCallInput.A02
            r12 = 0
            java.lang.String r0 = "persona_id"
            X.0Df r6 = r1.A02()
            r1 = r19
            X.C41848B3p.A1M(r6, r1, r0)
            java.lang.String r1 = "new_example_dialogue"
            if (r5 == 0) goto L_0x006c
            X.0Df r0 = r5.A02()
            r6.A0E(r0, r1)
        L_0x006c:
            java.lang.String r0 = "new_fact"
            X.0Df.A00(r6, r7, r0)
            X.05G r0 = r4.A0R
            X.AnonymousClass7TF.A1O(r0, r11)
            X.2IS r5 = X.C41845B3m.A04()
            X.2IS r1 = X.C41845B3m.A04()
            java.lang.String r0 = "input"
            X.1vR r6 = X.C41847B3o.A04(r6, r5, r0)
            java.util.Map r8 = r5.getParamsCopy()
            java.util.Map r9 = r1.getParamsCopy()
            java.lang.Class<X.Btv> r10 = X.C43171Btv.class
            java.util.ArrayList r16 = X.AnonymousClass7TE.A1C()
            java.lang.String r7 = "AiStudioAddPersonaKnowledgeMutation"
            r13 = 96
            java.lang.String r15 = "xfb_genai_persona_update_persona_from_chat"
            com.facebook.pando.PandoGraphQLRequest r5 = new com.facebook.pando.PandoGraphQLRequest
            r14 = r12
            r5.<init>(r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16)
            X.1vn r0 = r4.A03
            r3.A01 = r4
            r3.A00 = r11
            java.lang.Object r1 = r0.A04(r5, r3)
            if (r1 != r2) goto L_0x00bf
            return r2
        L_0x00ab:
            X.2IV r5 = new X.2IV
            r5.<init>()
            java.lang.String r1 = r6.A00
            java.lang.String r0 = "prompt"
            r5.A09(r1, r0)
            java.lang.String r1 = r6.A01
            java.lang.String r0 = "response"
            r5.A09(r1, r0)
            goto L_0x0053
        L_0x00bf:
            r2 = r4
            goto L_0x002c
        L_0x00c2:
            X.MDw r3 = new X.MDw
            r3.<init>(r4, r6, r5)
            goto L_0x001a
        L_0x00c9:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x00ce:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00d3:
            java.lang.String r0 = "Both example dialogue and instruction cannot be null"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.editor.AiSettingsRepository.A08(X.N49, java.lang.String, java.lang.String, X.4D7):java.lang.Object");
    }

    public static final ArrayList A02(C43347Bwl bwl) {
        ImmutableList immutableList;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (bwl == null || (immutableList = bwl.getRequiredCompactedTreeListField(2, AnonymousClass000.A00(577), C8H.class, 728213440)) == null) {
            immutableList = 0sn.A00;
        }
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        for (Object next : immutableList) {
            C8H c8h = (C8H) next;
            if (!(c8h.A08("app_formatted") == null || c8h.A0E() == null)) {
                A1C2.add(next);
            }
        }
        Iterator it = A1C2.iterator();
        while (it.hasNext()) {
            C8H c8h2 = (C8H) it.next();
            String valueOf = String.valueOf(c8h2.A08("app_formatted"));
            String A092 = c8h2.A09("app_subtext");
            C62608Kif A0E2 = c8h2.A0E();
            if (A0E2 != null) {
                A1C.add(new C61055Jvt(A0E2, valueOf, A092, c8h2.getCoercedBooleanField(3, "is_enabled")));
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        return A1C;
    }

    public static void A03(K64 k64) {
        AnonymousClass1EO r0 = K64.A00(k64).A00.A00;
        if (r0 != null) {
            r0.cancel();
        }
    }

    public static final void A06(AiSettingsRepository aiSettingsRepository, String str, int i) {
        C310336ap A0X2 = DbV.A0X();
        A0X2.A0H = str;
        DbS.A19(C51966G9m.A0P(aiSettingsRepository.A02), A0X2, i);
        DbY.A1N(A0X2);
    }

    public final boolean A0D() {
        String str;
        C61061Jvz A002 = A00(this);
        String str2 = null;
        if (A002 != null) {
            str = A002.A03;
        } else {
            str = null;
        }
        C61061Jvz A0M2 = JTP.A0M(this.A0G);
        if (A0M2 != null) {
            str2 = A0M2.A03;
        }
        return C51966G9m.A1a(str, str2);
    }
}
