package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.api.schemas.MediaGenAIDetectionMethod;
import com.instagram.api.schemas.RepostRestrictedReason;
import com.instagram.api.schemas.XDTTextAppQuoteAttachmentEligibility;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

public final class ILM implements C299665vd {
    public final C299635va A00;
    public final AnonymousClass4DU A01;
    public final 0sP A02;
    public final Context A03;
    public final C55798Hne A04;
    public final C57191ISe A05;
    public final UserSession A06;
    public final AnonymousClass3KN A07;
    public final boolean A08;

    public final void CtP(AnonymousClass6CS r16, AnonymousClass6CT r17, String str, String str2, String str3, String str4, int i, boolean z) {
        Long l;
        String str5;
        Long l2;
        String str6 = str;
        0qQ.A0B(str6, 0);
        AnonymousClass6CS r8 = r16;
        AnonymousClass6CT r9 = r17;
        String str7 = str4;
        C51974G9v.A1N(r8, r9, str7);
        UserSession userSession = this.A06;
        AnonymousClass4DU r7 = this.A01;
        1Xj A0U = DbV.A0U(userSession, str6);
        String str8 = str2;
        String str9 = str3;
        if (A0U != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "instagram_organic_action_menu");
            String id = A0U.getId();
            if (id != null) {
                C51965G9l.A1I(A0e, id);
                String organicTrackingToken = A0U.A0C.getOrganicTrackingToken();
                if (organicTrackingToken == null) {
                    organicTrackingToken = "";
                }
                C51965G9l.A1L(A0e, organicTrackingToken);
                String id2 = A0U.getId();
                if (id2 != null) {
                    String A062 = 1Xv.A06(id2);
                    0qQ.A0B(A062, 0);
                    C51965G9l.A1E(A0e, 00y.A0n(10, A062));
                    User A11 = C51966G9m.A11(A0U);
                    Long l3 = null;
                    if (A11 != null) {
                        l = 00y.A0n(10, A11.getId());
                    } else {
                        l = null;
                    }
                    C51965G9l.A1H(A0e, l);
                    User A112 = C51966G9m.A11(A0U);
                    if (A112 != null) {
                        str5 = A112.B6o().toString();
                    } else {
                        str5 = null;
                    }
                    A0e.AAJ(C273654mx.A00(275), str5);
                    C51969G9p.A19(A0e, r7);
                    A0e.A9F("m_ix", DbS.A0j(i));
                    if (str2 != null) {
                        String A063 = 1Xv.A06(str8);
                        0qQ.A0B(A063, 0);
                        l2 = 00y.A0n(10, A063);
                    } else {
                        l2 = null;
                    }
                    A0e.A9F("barcelona_source_reply_id", l2);
                    if (str3 != null) {
                        String A064 = 1Xv.A06(str9);
                        0qQ.A0B(A064, 0);
                        l3 = 00y.A0n(10, A064);
                    }
                    A0e.A9F("barcelona_source_quote_post_id", l3);
                    C51972G9s.A14(A0e, A0U);
                    A0e.Cgf();
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        this.A00.Cq9(r8, r9, str6, str7, str8, str9, z);
    }

    public final void Ctr(C53310Glw glw) {
        String str;
        0qQ.A0B(glw, 0);
        Context context = this.A03;
        UserSession userSession = this.A06;
        AnonymousClass4DU r1 = this.A01;
        List<AndroidLink> list = glw.A07;
        if (list != null) {
            for (AndroidLink androidLink : list) {
                AnonymousClass47L A012 = C271714jT.A01(androidLink);
                if (A012 != null) {
                    int ordinal = A012.ordinal();
                    if (ordinal != 0) {
                        if (ordinal == 1) {
                            String CHl = androidLink.CHl();
                            if (CHl != null) {
                                str = DbT.A10(0oI.A03(CHl, androidLink.BlB()));
                            } else {
                                throw AnonymousClass7TE.A0y();
                            }
                        } else if (ordinal != 2) {
                            continue;
                        } else {
                            str = androidLink.Avj();
                            if (str == null) {
                                throw AnonymousClass7TE.A0y();
                            }
                        }
                        if (C48381Edc.A00(context, str)) {
                            return;
                        }
                    } else {
                        String CGH = androidLink.CGH();
                        if (CGH != null) {
                            SUL sul = new SUL(context, userSession, 2EG.A42, CGH, false);
                            sul.A0P = androidLink.BkT();
                            sul.A0T = Collections.unmodifiableList(glw.A06);
                            sul.A0C(glw.A03);
                            sul.A0B(glw.A00);
                            sul.A0S = r1.getModuleName();
                            sul.A0D(glw.A05);
                            sul.A0A();
                            return;
                        }
                        throw AnonymousClass7TE.A0y();
                    }
                }
            }
        }
    }

    public final void D6N(String str, String str2, long j) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A06;
        AnonymousClass4DU r2 = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "threads_24hr_timer_tap");
        if (A0e.isSampled()) {
            DbW.A15(A0e, r2);
            C51965G9l.A1K(A0e, DbY.A0a());
            G9t.A1J(A0e, C51965G9l.A0u(str));
            A0e.Cgf();
        }
        this.A00.CpT(str, str2, j);
    }

    public final void D8K(String str) {
        0qQ.A0B(str, 0);
        this.A02.invoke(new ILQ(str));
    }

    public final void DDe(String str) {
    }

    public final void DGU(0xF r8, String str, String str2, String str3, String str4, boolean z, boolean z2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A02.invoke(new ILZ(r8, str, str2, str3, str4));
        if (z2) {
            C55798Hne hne = this.A04;
            Dba.A1S(hne, hne.A04, 11, z);
        }
    }

    public final void DHd(String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A06;
        AnonymousClass4DU r1 = this.A01;
        String moduleName = r1.getModuleName();
        AnonymousClass9OT r3 = AnonymousClass9OT.THREADS_POST;
        C250563lf.A0e(r3, (MediaGenAIDetectionMethod) null, userSession, (Boolean) null, moduleName, C273654mx.A00(152), str);
        JUL.A00(this.A03, r3, (MediaGenAIDetectionMethod) null, userSession, r1.getModuleName(), str, true);
    }

    public final void DHe(String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A06;
        String moduleName = this.A01.getModuleName();
        C250563lf.A0e(AnonymousClass9OT.THREADS_POST, (MediaGenAIDetectionMethod) null, userSession, (Boolean) null, moduleName, "genai_transparency_label_impression", str);
    }

    public final void DJE(String str) {
    }

    public final void DL0(String str) {
        0qQ.A0B(str, 0);
        this.A02.invoke(new ILR(str));
    }

    public final void DNV(Boolean bool, String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z) {
        0qQ.A0B(str, 0);
        this.A02.invoke(new C57008ILa(str, str2, str3, str4, str5, z, str7));
    }

    public final void DOq(String str) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A06;
        AnonymousClass4DU r4 = this.A01;
        Long A0n = C51971G9r.A0n(0, C51965G9l.A0u(str));
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "threads_subtitle_impression");
        if (A0e.isSampled()) {
            DbW.A15(A0e, r4);
            C51968G9o.A1I(A0e, A0n, "nav_chain", DbY.A0a());
            A0e.A8M(HO8.A02, "subtitle_type");
            A0e.Cgf();
        }
    }

    public final void DOr(String str, String str2, String str3) {
        String str4 = str2;
        String str5 = str3;
        AnonymousClass7TG.A1T(str, str2, str3);
        UserSession userSession = this.A06;
        AnonymousClass4DU r4 = this.A01;
        Long A0n = C51971G9r.A0n(0, C51965G9l.A0u(str));
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "threads_subtitle_tap");
        if (A0e.isSampled()) {
            DbW.A15(A0e, r4);
            C51968G9o.A1I(A0e, A0n, "nav_chain", DbY.A0a());
            A0e.A8M(HO8.A02, "subtitle_type");
            A0e.Cgf();
        }
        this.A00.Cqb(str5, AnonymousClass000.A00(1560), (String) null, str4, (String) null);
    }

    public final void DPs(C66920MfE mfE, Integer num, String str, String str2, String str3, String str4) {
        String str5 = str;
        String str6 = str2;
        AnonymousClass7TG.A1N(str, str2);
        UserSession userSession = this.A06;
        AnonymousClass4DU r3 = this.A01;
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null) {
            0wc A0b = C51973G9u.A0b(r3, userSession);
            C254523sc A0c = C51967G9n.A0c(userSession, A0U, r3, AnonymousClass000.A00(662));
            if (num != null) {
                A0c.A08(num.intValue());
            }
            XXC.A00(A0b, A0c, r3);
        }
        this.A00.Cq0(mfE, str5, str6, str3, str4);
    }

    public final void DZT(String str, boolean z) {
        0qQ.A0B(str, 0);
        C55798Hne hne = this.A04;
        AnonymousClass7TE.A1Z(new MEW(hne, str, (AnonymousClass4D7) null, 1, z), hne.A04);
    }

    public final void DbO(String str) {
        XDTTextAppQuoteAttachmentEligibility xDTTextAppQuoteAttachmentEligibility;
        C274334o8 BtE;
        0qQ.A0B(str, 0);
        1Xj A0U = DbV.A0U(this.A06, str);
        if (A0U != null) {
            C274354oA A0x = C51966G9m.A0x(A0U);
            if (A0x == null || (BtE = A0x.BtE()) == null || (xDTTextAppQuoteAttachmentEligibility = BtE.AkL()) == null) {
                xDTTextAppQuoteAttachmentEligibility = XDTTextAppQuoteAttachmentEligibility.NOT_APPLICABLE;
            }
            C55798Hne hne = this.A04;
            AnonymousClass7TE.A1Z(new MHC((Object) xDTTextAppQuoteAttachmentEligibility, (Object) hne, (AnonymousClass4D7) null, 12), hne.A04);
        }
    }

    public final void DeB(RepostRestrictedReason repostRestrictedReason, String str, String str2, String str3, boolean z, boolean z2) {
        0qQ.A0B(str, 0);
        UserSession userSession = this.A06;
        AnonymousClass4DU r3 = this.A01;
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "barcelona_organic_repost_button_tap");
            DbW.A15(A0e, r3);
            C51965G9l.A1K(A0e, DbY.A0a());
            AtomicBoolean atomicBoolean = 1Xj.A0i;
            String id = A0U.getId();
            if (id != null) {
                G9t.A1J(A0e, 1Xv.A06(id));
                C51969G9p.A1A(A0e, r3);
                User A11 = C51966G9m.A11(A0U);
                Long l = null;
                if (A11 != null) {
                    l = C51972G9s.A0h(A11);
                }
                C51965G9l.A1H(A0e, l);
                C51976G9y.A0V(A0e, new 0bb());
                A0e.Cgf();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        if (this.A08) {
            String moduleName = r3.getModuleName();
            long currentTimeMillis = System.currentTimeMillis();
            0qQ.A0B(moduleName, 0);
            A00((C57094IOi) userSession.A01(C57094IOi.class, C58284IpR.A00), Long.valueOf(currentTimeMillis), "repost_tap", moduleName, str);
        }
        if (z || z2) {
            this.A00.CqC(str, str2, str3, r3.getModuleName());
        } else if (repostRestrictedReason != null && repostRestrictedReason.ordinal() == 3) {
            C59689JTv.A07(this.A03, 2131972223);
        }
    }

    public final void DeC(RepostRestrictedReason repostRestrictedReason, String str, String str2, boolean z) {
        Long l;
        Long l2;
        0qQ.A0B(str, 0);
        UserSession userSession = this.A06;
        AnonymousClass4DU r2 = this.A01;
        1Xj A0U = DbV.A0U(userSession, str);
        if (A0U != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "barcelona_organic_quote_post_tap");
            DbW.A15(A0e, r2);
            C51965G9l.A1K(A0e, DbY.A0a());
            AtomicBoolean atomicBoolean = 1Xj.A0i;
            String id = A0U.getId();
            if (id != null) {
                G9t.A1J(A0e, 1Xv.A06(id));
                C51969G9p.A1A(A0e, r2);
                User A11 = C51966G9m.A11(A0U);
                if (A11 != null) {
                    l = C51972G9s.A0h(A11);
                } else {
                    l = null;
                }
                C51965G9l.A1H(A0e, l);
                if (str2 != null) {
                    l2 = C51971G9r.A0n(0, 1Xv.A06(str2));
                } else {
                    l2 = null;
                }
                A0e.A9F("barcelona_source_reply_id", l2);
                A0e.A7p(AnonymousClass000.A00(3424), true);
                A0e.AAK((0bb) null, "search_context");
                C51972G9s.A14(A0e, A0U);
                A0e.Cgf();
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        this.A00.CpU(str);
    }

    public final void Dfl(String str) {
        0qQ.A0B(str, 0);
        this.A02.invoke(new ILS(str));
    }

    public final void Dfr(String str) {
    }

    public final void DhC(String str, long j) {
        0qQ.A0B(str, 0);
        this.A05.A00 = str;
        this.A07.DhB(j);
    }

    public final void Dhy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        String id;
        String A052;
        Long A0n;
        String id2;
        String A042;
        Long A0n2;
        String str8 = str;
        AnonymousClass7TG.A1N(str, str2);
        String str9 = str3;
        if (0qQ.A0K(str3, "timely_topics")) {
            UserSession userSession = this.A06;
            AnonymousClass4DU r4 = this.A01;
            1Xj A0U = DbV.A0U(userSession, str2);
            if (!(A0U == null || (id = A0U.getId()) == null || (A052 = 1Xv.A05(id)) == null || (A0n = 00y.A0n(10, A052)) == null || (id2 = A0U.getId()) == null || (A042 = 1Xv.A04(id2)) == null || (A0n2 = 00y.A0n(10, A042)) == null)) {
                0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "barcelona_timely_topic_tap");
                if (A0e.isSampled()) {
                    C51965G9l.A1K(A0e, DbY.A0a());
                    C51969G9p.A19(A0e, r4);
                    C51965G9l.A1H(A0e, A0n2);
                    C51968G9o.A1I(A0e, A0n, "timely_topic_text", str);
                    A0e.Cgf();
                }
            }
        }
        String str10 = str5;
        if (str5 != null) {
            String str11 = str6;
            if (str6 != null) {
                this.A02.invoke(new ILY(str4, str10, str11, str7));
            }
        }
        this.A00.Cqb(str8, str9, (String) null, (String) null, (String) null);
    }

    public final void DiK(String str) {
        0qQ.A0B(str, 0);
        this.A02.invoke(new ILT(str));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0096, code lost:
        if (X.182.A06(r8, r11, 36328521311731084L) == false) goto L_0x0098;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void Djw(java.lang.String r23, java.lang.String r24, java.lang.String r25) {
        /*
            r22 = this;
            r5 = 0
            r4 = r23
            X.0qQ.A0B(r4, r5)
            r6 = r22
            com.instagram.common.session.UserSession r11 = r6.A06
            X.4DU r10 = r6.A01
            r13 = 0
            r2 = 1
            X.1Xj r12 = X.DbV.A0U(r11, r4)
            if (r12 == 0) goto L_0x004a
            r14 = r13
            r15 = r13
            r16 = r13
            r17 = r13
            r18 = r13
            r19 = r13
            r20 = r13
            r21 = r5
            X.C56293Hw6.A00(r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21)
            X.0wc r3 = X.C51973G9u.A0b(r10, r11)
            r0 = 3376(0xd30, float:4.731E-42)
            java.lang.String r20 = X.AnonymousClass000.A00(r0)
            java.lang.Integer r19 = X.C51967G9n.A0j()
            r14 = r11
            r15 = r12
            r16 = r10
            X.3sc r1 = X.C254513sb.A02(r14, r15, r16, r17, r18, r19, r20)
            if (r1 == 0) goto L_0x004a
            int r0 = r12.A0v()
            java.lang.Long r0 = X.DbS.A0j(r0)
            r1.A3c = r0
            X.XXD.A00(r3, r1)
        L_0x004a:
            boolean r0 = r6.A08
            if (r0 == 0) goto L_0x006c
            java.lang.Class<X.IOi> r1 = X.C57094IOi.class
            X.IpR r0 = X.C58284IpR.A00
            java.lang.Object r9 = r11.A01(r1, r0)
            X.IOi r9 = (X.C57094IOi) r9
            java.lang.String r3 = r10.getModuleName()
            long r7 = java.lang.System.currentTimeMillis()
            X.0qQ.A0B(r3, r5)
            java.lang.String r1 = "share_tap"
            java.lang.Long r0 = java.lang.Long.valueOf(r7)
            A00(r9, r0, r1, r3, r4)
        L_0x006c:
            X.1Xj r3 = X.DbV.A0U(r11, r4)
            X.0Tu r8 = X.0Tu.A05
            r0 = 36325682338346116(0x810e0400003484, double:3.0358460103277147E-306)
            boolean r7 = X.182.A06(r8, r11, r0)
            X.4Cl r0 = X.DbV.A0k(r11)
            java.lang.Boolean r0 = r0.CdL()
            if (r0 == 0) goto L_0x0098
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L_0x0098
            r0 = 36328521311731084(0x81109900003d8c, double:3.037641388527997E-306)
            boolean r0 = X.182.A06(r8, r11, r0)
            r19 = 1
            if (r0 != 0) goto L_0x009a
        L_0x0098:
            r19 = 0
        L_0x009a:
            r9 = r24
            r8 = r25
            if (r7 == 0) goto L_0x0129
            if (r3 == 0) goto L_0x0129
            X.1Xy r0 = r3.A0C
            X.1bZ r0 = r0.BtX()
            if (r0 == 0) goto L_0x0129
            android.content.Context r7 = r6.A03
            X.DbS.A1X(r7)
            r0 = r7
            androidx.fragment.app.FragmentActivity r0 = (androidx.fragment.app.FragmentActivity) r0
            X.2nI r11 = X.C229382nI.A04(r0, r10, r11)
            X.Hm8 r3 = new X.Hm8
            r3.<init>()
            java.lang.String r12 = "com.bloks.www.threads.igwb.exp.reshare.friction.open"
            java.util.Map r10 = r3.A02
            r0 = 526(0x20e, float:7.37E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.put(r0, r12)
            java.lang.String r0 = "media_id"
            r10.put(r0, r4)
            java.util.BitSet r13 = r3.A00
            r13.set(r5)
            r0 = 2
            java.lang.Long r1 = java.lang.Long.valueOf(r0)
            r0 = 368(0x170, float:5.16E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r10.put(r0, r1)
            r13.set(r2)
            X.Ix3 r2 = new X.Ix3
            r14 = r2
            r15 = r6
            r16 = r4
            r17 = r9
            r18 = r8
            r14.<init>(r15, r16, r17, r18, r19)
            r1 = 16
            X.TPJ r0 = new X.TPJ
            r0.<init>(r1, r2, r3)
            X.Q3B r1 = new X.Q3B
            r1.<init>(r0)
            java.util.Map r3 = r3.A01
            java.lang.String r0 = "user_action_callback"
            r3.put(r0, r1)
            X.INF r2 = new X.INF
            r14 = r2
            r14.<init>(r15, r16, r17, r18, r19)
            int r1 = r13.nextClearBit(r5)
            r0 = 2
            if (r1 < r0) goto L_0x0124
            X.FBO r1 = new X.FBO
            r1.<init>(r12)
            java.util.HashMap r0 = X.C359608dC.A01(r10)
            r1.A04 = r0
            r1.A03 = r3
            r1.A02 = r2
            r1.A01(r7, r11)
            return
        L_0x0124:
            java.lang.IllegalStateException r0 = X.DbU.A0i()
            throw r0
        L_0x0129:
            if (r19 == 0) goto L_0x0136
            X.0sP r1 = r6.A02
            X.LdE r0 = new X.LdE
            r0.<init>(r4, r9, r8, r5)
            r1.invoke(r0)
            return
        L_0x0136:
            X.5va r1 = r6.A00
            java.lang.String r0 = r10.getModuleName()
            r1.CqD(r4, r0, r9, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ILM.Djw(java.lang.String, java.lang.String, java.lang.String):void");
    }

    public final void Dk0(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        this.A02.invoke(new C64512LdE(str, str2, str3, true));
    }

    public final void DqP(String str, String str2, String str3, String str4) {
        String id;
        String A052;
        Long A0n;
        String A042;
        String str5 = str;
        AnonymousClass7TG.A1N(str, str2);
        UserSession userSession = this.A06;
        AnonymousClass4DU r7 = this.A01;
        1Xj A0U = DbV.A0U(userSession, str2);
        if (!(A0U == null || (id = A0U.getId()) == null || (A052 = 1Xv.A05(id)) == null || (A0n = 00y.A0n(10, A052)) == null)) {
            String id2 = A0U.getId();
            Long l = null;
            if (!(id2 == null || (A042 = 1Xv.A04(id2)) == null)) {
                l = 00y.A0n(10, A042);
            }
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r7, userSession), "barcelona_tags_caption_tap");
            if (A0e.isSampled()) {
                C51969G9p.A19(A0e, r7);
                C51968G9o.A1I(A0e, A0n, "nav_chain", DbY.A0a());
                C51965G9l.A1H(A0e, l);
                C51972G9s.A14(A0e, A0U);
                A0e.A7p("is_hashtag", Boolean.valueOf(00p.A0k(str, "#", false)));
                A0e.Cgf();
            }
        }
        this.A00.Cqb(str5, str3, str4, (String) null, (String) null);
    }

    public final void Duf(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        this.A02.invoke(new ILW(str, str2, str3));
    }

    public final void Dug(String str) {
    }

    public final void Dvh(String str) {
        0qQ.A0B(str, 0);
        C55798Hne hne = this.A04;
        AnonymousClass7TE.A1Z(new MGE(hne, str, (AnonymousClass4D7) null, 16), hne.A04);
    }

    public static void A00(C57094IOi iOi, Long l, String str, String str2, String str3) {
        C57094IOi.A00(new C61079JwH(str, l), iOi, str2, str3);
    }

    private final void A01(String str) {
        UserSession userSession = this.A06;
        if (182.A06(0Tu.A05, userSession, 36330492701786777L)) {
            HUQ.A00(C238863Ds.MEDIA_GENERIC, userSession, this.A01, str);
        }
    }

    public final void D4P(String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        HOD hod;
        String str6 = str5;
        String str7 = str3;
        AnonymousClass7TF.A1B(str, 0, str3);
        UserSession userSession = this.A06;
        AnonymousClass4DU r3 = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "barcelona_collapsed_post_tap");
        if (A0e.isSampled()) {
            G9t.A1J(A0e, C51965G9l.A0u(str));
            C51969G9p.A19(A0e, r3);
            C51965G9l.A1K(A0e, DbY.A0a());
            if (z) {
                hod = HOD.PARENT;
            } else {
                hod = HOD.CHILD;
            }
            A0e.A8M(hod, "collapsed_post_type");
            Long l = null;
            C51965G9l.A1H(A0e, C51972G9s.A0j(str4));
            A0e.A8k("m_ix", Integer.valueOf(i));
            if (str2 != null) {
                l = DbV.A0q(1Xv.A06(str2));
            }
            A0e.A9F("repost_media_id", l);
            C51976G9y.A0V(A0e, new 0bb());
            A0e.Cgf();
        }
        if (str5 == null) {
            str6 = str3;
        }
        A01(str6);
        this.A00.Cq8(str7, r3.getModuleName(), (String) null, (String) null, (List) null, false);
    }

    public final void D4j(String str, String str2, String str3, String str4, String str5, boolean z, String str6) {
        String str7 = str;
        String str8 = str2;
        String str9 = str5;
        AnonymousClass7TG.A1N(str7, str8);
        String str10 = str3;
        if (z) {
            UserSession userSession = this.A06;
            AnonymousClass4DU r2 = this.A01;
            HVP.A00(userSession, r2, str7, str10, str4);
            if (this.A08) {
                String moduleName = r2.getModuleName();
                long currentTimeMillis = System.currentTimeMillis();
                0qQ.A0B(moduleName, 0);
                A00((C57094IOi) userSession.A01(C57094IOi.class, C58284IpR.A00), Long.valueOf(currentTimeMillis), "comment_tap", moduleName, str7);
            }
        }
        I0K i0k = I0K.A00;
        UserSession userSession2 = this.A06;
        AnonymousClass4DU r8 = this.A01;
        i0k.A00(r8, userSession2, str7, str6, (String) null, str10, (String) null);
        if (str5 == null) {
            str9 = str8;
        }
        A01(str9);
        this.A00.Cq8(str8, r8.getModuleName(), str10, (String) null, (List) null, 182.A06(0Tu.A05, userSession2, 36330406802637429L));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a3, code lost:
        if (X.182.A06(r3, r2, 36327585008990754L) != false) goto L_0x00b3;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D6d(java.lang.String r13, java.lang.String r14, java.lang.String r15, java.lang.String r16, java.lang.String r17, java.lang.String r18, java.lang.String r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, boolean r25) {
        /*
            r12 = this;
            r0 = r19
            r7 = 0
            r8 = r14
            r2 = r15
            X.C51973G9u.A1E(r13, r14, r15)
            r4 = r17
            if (r21 == 0) goto L_0x00c1
            com.instagram.common.session.UserSession r2 = r12.A06
            X.4DU r3 = r12.A01
            if (r25 == 0) goto L_0x00ad
            java.lang.String r5 = "ufi_reply_button"
            X.1Xj r6 = X.DbV.A0U(r2, r14)
            if (r6 == 0) goto L_0x0065
            X.0wc r1 = X.AnonymousClass0kN.A01(r3, r2)
            java.lang.String r0 = "instagram_organic_comment"
            X.0Aj r4 = X.AnonymousClass7TE.A0e(r1, r0)
            java.lang.String r0 = r6.getId()
            if (r0 == 0) goto L_0x00bc
            X.C51965G9l.A1I(r4, r0)
            X.1Xy r0 = r6.A0C
            java.lang.String r0 = r0.getOrganicTrackingToken()
            X.C51965G9l.A1L(r4, r0)
            java.lang.String r1 = X.C51965G9l.A0t(r6)
            java.lang.String r0 = "inventory_source"
            X.C51974G9v.A0p(r4, r6, r0, r1)
            java.lang.String r1 = "0"
            java.lang.String r0 = "is_from_inline_composer"
            r4.AAJ(r0, r1)
            X.C51972G9s.A14(r4, r6)
            java.lang.Long r1 = X.C51971G9r.A0m()
            java.lang.String r0 = "comment_compose_duration"
            r4.A9F(r0, r1)
            X.DbS.A1N(r4, r5)
            java.lang.String r1 = X.C324716zm.A00()
            r0 = 265(0x109, float:3.71E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r4.AAJ(r0, r1)
            r4.Cgf()
        L_0x0065:
            boolean r0 = r12.A08
            if (r0 == 0) goto L_0x0087
            java.lang.Class<X.IOi> r1 = X.C57094IOi.class
            X.IpR r0 = X.C58284IpR.A00
            java.lang.Object r6 = r2.A01(r1, r0)
            X.IOi r6 = (X.C57094IOi) r6
            java.lang.String r5 = r3.getModuleName()
            long r3 = java.lang.System.currentTimeMillis()
            X.0qQ.A0B(r5, r7)
            java.lang.String r1 = "comment_tap"
            java.lang.Long r0 = java.lang.Long.valueOf(r3)
            A00(r6, r0, r1, r5, r14)
        L_0x0087:
            r9 = r16
            if (r23 == 0) goto L_0x00b3
            if (r22 == 0) goto L_0x00a5
            X.0Tu r3 = X.0Tu.A05
            r0 = 36327585008859680(0x810fbf00003a20, double:3.037049266821932E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 == 0) goto L_0x00a5
            r0 = 36327585008990754(0x810fbf00023a22, double:3.0370492669048235E-306)
            boolean r0 = X.182.A06(r3, r2, r0)
            if (r0 != 0) goto L_0x00b3
        L_0x00a5:
            X.5va r0 = r12.A00
            r1 = r20
            r0.CqH(r13, r14, r9, r1)
            return
        L_0x00ad:
            r0 = r18
            X.HVP.A00(r2, r3, r14, r4, r0)
            goto L_0x0065
        L_0x00b3:
            X.5va r6 = r12.A00
            r7 = 0
            r10 = r7
            r11 = r7
            r6.CqY(r7, r8, r9, r10, r11)
            return
        L_0x00bc:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0y()
            throw r0
        L_0x00c1:
            if (r19 != 0) goto L_0x00c4
            r0 = r15
        L_0x00c4:
            r12.A01(r0)
            X.5va r1 = r12.A00
            r5 = 0
            X.4DU r0 = r12.A01
            java.lang.String r3 = r0.getModuleName()
            r6 = r5
            r1.Cq8(r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ILM.D6d(java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, boolean, boolean, boolean, boolean, boolean):void");
    }

    public final void DF2(boolean z) {
        C55798Hne hne = this.A04;
        Dba.A1S(hne, hne.A04, 10, z);
    }

    public final void DLT() {
        C55798Hne hne = this.A04;
        AnonymousClass7TE.A1Z(new MFS(hne, (AnonymousClass4D7) null, 40), hne.A04);
    }

    public final void DYP(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        String str7 = str6;
        String str8 = str;
        String str9 = str3;
        AnonymousClass7TF.A1B(str8, 0, str9);
        I0K i0k = I0K.A00;
        UserSession userSession = this.A06;
        AnonymousClass4DU r8 = this.A01;
        String str10 = str5;
        i0k.A00(r8, userSession, str8, str2, str4, str10, (String) null);
        if (str6 == null) {
            str7 = str9;
        }
        A01(str7);
        String str11 = str9;
        this.A00.Cq8(str11, r8.getModuleName(), str10, (String) null, list, false);
        if (this.A08) {
            String moduleName = r8.getModuleName();
            long currentTimeMillis = System.currentTimeMillis();
            0qQ.A0B(moduleName, 0);
            A00((C57094IOi) userSession.A01(C57094IOi.class, C58284IpR.A00), Long.valueOf(currentTimeMillis), "post_tap", moduleName, str8);
        }
    }

    public final void Da2(String str, String str2, String str3, String str4, String str5) {
        Long l;
        String str6 = str5;
        String str7 = str2;
        String str8 = str;
        AnonymousClass7TG.A1N(str8, str7);
        UserSession userSession = this.A06;
        AnonymousClass4DU r13 = this.A01;
        0wc A0b = C51973G9u.A0b(r13, userSession);
        1Xj A0U = DbV.A0U(userSession, str7);
        String str9 = str4;
        String str10 = str3;
        if (A0U != null) {
            Long l2 = null;
            C254523sc A022 = C254513sb.A02(userSession, A0U, r13, (C249763kK) null, (Integer) null, C51967G9n.A0j(), AnonymousClass000.A00(1483));
            if (A022 != null) {
                A022.A4W = str8;
                if (str3 != null) {
                    l = C51971G9r.A0n(0, C51965G9l.A0u(str10));
                } else {
                    l = null;
                }
                if (str4 != null) {
                    l2 = C51971G9r.A0n(0, C51965G9l.A0u(str9));
                }
                XXA.A00(A0b, A022, r13, l, l2);
            }
        }
        if (182.A06(0Tu.A05, userSession, 36330492701786777L)) {
            if (str5 == null) {
                str6 = str7;
            }
            HUQ.A00(C238863Ds.PROFILE_NAV_ITEM, userSession, r13, str6);
        }
        this.A00.CqP(str8, str7, str10, str9);
        if (this.A08) {
            String moduleName = r13.getModuleName();
            long currentTimeMillis = System.currentTimeMillis();
            0qQ.A0B(moduleName, 0);
            A00((C57094IOi) userSession.A01(C57094IOi.class, C58284IpR.A00), Long.valueOf(currentTimeMillis), "profile_tap", moduleName, str7);
        }
    }

    public final void DbQ(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i) {
        String str8 = str7;
        String str9 = str;
        String str10 = str3;
        String str11 = str4;
        DbZ.A0t(0, str9, str10, str11);
        I0K i0k = I0K.A00;
        UserSession userSession = this.A06;
        AnonymousClass4DU r10 = this.A01;
        String str12 = str2;
        String str13 = str6;
        i0k.A00(r10, userSession, str10, str12, str11, str5, str13);
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r10, userSession), "barcelona_quoted_post_tap");
        if (A0e.isSampled()) {
            G9t.A1J(A0e, C51965G9l.A0u(str9));
            G9t.A1K(A0e, str11);
            C51969G9p.A19(A0e, r10);
            C51965G9l.A1K(A0e, DbY.A0a());
            Long l = null;
            A0e.A9F("barcelona_source_quote_post_id", (Long) null);
            A0e.A8k("m_ix", Integer.valueOf(i));
            if (str2 != null) {
                l = DbV.A0q(1Xv.A06(str12));
            }
            A0e.A9F("repost_media_id", l);
            C51976G9y.A0V(A0e, new 0bb());
            A0e.Cgf();
        }
        if (str7 == null) {
            str8 = str10;
        }
        A01(str8);
        String str14 = str13;
        this.A00.Cq8(str10, r10.getModuleName(), (String) null, str14, (List) null, false);
        if (this.A08) {
            Class<C57094IOi> cls = C57094IOi.class;
            C58284IpR ipR = C58284IpR.A00;
            String moduleName = r10.getModuleName();
            long currentTimeMillis = System.currentTimeMillis();
            0qQ.A0B(moduleName, 0);
            A00((C57094IOi) userSession.A01(cls, ipR), Long.valueOf(currentTimeMillis), "post_tap", moduleName, str10);
            String moduleName2 = r10.getModuleName();
            long currentTimeMillis2 = System.currentTimeMillis();
            0qQ.A0B(moduleName2, 0);
            A00((C57094IOi) userSession.A01(cls, ipR), Long.valueOf(currentTimeMillis2), "quoted_post_tap", moduleName2, str9);
        }
    }

    public final void Dvo() {
        C55798Hne hne = this.A04;
        AnonymousClass7TE.A1Z(new MFS(hne, (AnonymousClass4D7) null, 42), hne.A04);
    }

    public ILM(Context context, C299635va r5, C55798Hne hne, UserSession userSession, AnonymousClass4DU r8, 0sP r9, boolean z) {
        this.A02 = r9;
        this.A00 = r5;
        this.A04 = hne;
        this.A06 = userSession;
        this.A01 = r8;
        this.A03 = context;
        this.A08 = z;
        C57191ISe iSe = new C57191ISe(userSession);
        this.A05 = iSe;
        this.A07 = new AnonymousClass3KN(userSession, iSe, r8, (String) null);
    }

    public final void DBO(String str, String str2) {
        long j;
        long j2;
        AnonymousClass7TG.A1N(str, str2);
        C55798Hne hne = this.A04;
        UserSession userSession = hne.A03;
        AnonymousClass0iw r3 = hne.A02;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r3, userSession), "barcelona_post_edited_toast_impression");
        if (A0e.isSampled()) {
            DbW.A15(A0e, r3);
            C51965G9l.A1K(A0e, DbY.A0a());
            try {
                j = Long.parseLong(C51965G9l.A0u(str));
            } catch (NumberFormatException unused) {
                j = 0;
            }
            C51970G9q.A18(A0e, j);
            try {
                j2 = Long.parseLong(str2);
            } catch (NumberFormatException unused2) {
                j2 = 0;
            }
            C51970G9q.A1C(A0e, j2);
            A0e.Cgf();
        }
        AnonymousClass7TE.A1Z(new MFS(hne, (AnonymousClass4D7) null, 41), hne.A04);
    }

    public final void DKy(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A02.invoke(new C64511LdD(str, str2));
    }

    public final void DKz(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A02.invoke(new C64511LdD(str, str2));
    }

    public final void DRC(String str, boolean z, String str2) {
        C254523sc A022;
        DbY.A1S(str, str2);
        UserSession userSession = this.A06;
        AnonymousClass4DU r4 = this.A01;
        0wc A0b = C51973G9u.A0b(r4, userSession);
        1Xj A0U = DbV.A0U(userSession, str2);
        if (!(A0U == null || (A022 = C254513sb.A02(userSession, A0U, r4, (C249763kK) null, (Integer) null, C51967G9n.A0j(), AnonymousClass000.A00(1483))) == null)) {
            A022.A4W = null;
            XXA.A00(A0b, A022, r4, (Long) null, (Long) null);
        }
        C299635va r0 = this.A00;
        if (z) {
            r0.Cpq(str, str2);
        } else {
            r0.CqS(str);
        }
    }

    public final void DY5(String str, String str2, int i) {
        AnonymousClass7TG.A1N(str, str2);
        this.A02.invoke(new ILX(str, str2, i));
    }

    public final void DZ5(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        UserSession userSession = this.A06;
        AnonymousClass4DU r4 = this.A01;
        Long A0n = 00y.A0n(10, str);
        String A0u = C51965G9l.A0u(str2);
        0qQ.A0B(A0u, 0);
        Long A0n2 = 00y.A0n(10, A0u);
        if (A0n != null) {
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r4, userSession), "barcelona_active_now_impression");
            if (A0e.isSampled()) {
                DbW.A15(A0e, r4);
                C51965G9l.A1K(A0e, DbY.A0a());
                A0e.A9F("target_user_igid", A0n);
                C51965G9l.A1E(A0e, A0n2);
                A0e.Cgf();
            }
        }
    }

    public final void DbP(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A00.CpV(str2, "long_press");
        UserSession userSession = this.A06;
        AnonymousClass4DU r2 = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "barcelona_organic_quote_media_tap");
        if (A0e.isSampled()) {
            C51965G9l.A1K(A0e, DbY.A0a());
            G9t.A1J(A0e, C51965G9l.A0u(str));
            C51969G9p.A1A(A0e, r2);
            DbS.A1N(A0e, "long_press");
            A0e.Cgf();
        }
    }

    public final void Dhn(String str, String str2, String str3) {
        AnonymousClass7TG.A1T(str, str2, str3);
        this.A00.Cpx(str2, str3);
        UserSession userSession = this.A06;
        AnonymousClass4DU r2 = this.A01;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r2, userSession), "barcelona_organic_view_media_quote_usage_tap");
        if (A0e.isSampled()) {
            C51965G9l.A1K(A0e, DbY.A0a());
            G9t.A1J(A0e, C51965G9l.A0u(str));
            C51969G9p.A1A(A0e, r2);
            DbS.A1N(A0e, str3);
            A0e.Cgf();
        }
    }

    public final void DqO(String str, String str2) {
        String id;
        String A052;
        Long A0n;
        Long l;
        String A042;
        AnonymousClass7TG.A1N(str, str2);
        UserSession userSession = this.A06;
        AnonymousClass4DU r6 = this.A01;
        1Xj A0U = DbV.A0U(userSession, str);
        if (!(A0U == null || (id = A0U.getId()) == null || (A052 = 1Xv.A05(id)) == null || (A0n = 00y.A0n(10, A052)) == null)) {
            String id2 = A0U.getId();
            if (id2 == null || (A042 = 1Xv.A04(id2)) == null) {
                l = null;
            } else {
                l = 00y.A0n(10, A042);
            }
            0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r6, userSession), "barcelona_tags_participation_entrypoint_tap");
            if (A0e.isSampled()) {
                C51969G9p.A19(A0e, r6);
                C51968G9o.A1I(A0e, A0n, "nav_chain", DbY.A0a());
                C51965G9l.A1H(A0e, l);
                C51972G9s.A14(A0e, A0U);
                A0e.Cgf();
            }
        }
        this.A00.CpW(str2);
    }

    public final void Ds1(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        this.A02.invoke(new ILU(str, str2));
    }

    public final void DvU(C299585vR r3, String str, int i) {
        DbY.A1S(str, r3);
        this.A02.invoke(new ILV(r3, str, i));
    }

    public final void E19(String str, String str2) {
        AnonymousClass7TG.A1N(str, str2);
        UserSession userSession = this.A06;
        0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(this.A01, userSession), "p92_rights_management_media_notice_click");
        if (A0e.isSampled()) {
            A0e.A9F("ig_user_id", DbV.A0q(userSession.A06));
            A0e.A9F("media_igid", DbV.A0q(C51965G9l.A0u(str)));
            A0e.Cgf();
        }
        Context context = this.A03;
        0qQ.A0C(context, "null cannot be cast to non-null type android.app.Activity");
        FH7.A01((Activity) context, userSession, str2, str);
    }
}
