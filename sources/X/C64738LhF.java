package X;

import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.LhF  reason: case insensitive filesystem */
public final /* synthetic */ class C64738LhF implements C232292tQ {
    public final /* synthetic */ C65808M0a A00;

    public C64738LhF(C65808M0a m0a) {
        this.A00 = m0a;
    }

    public final void DYE(int i, int i2) {
        String str;
        1Xj r6;
        0Aj A0e;
        Long A0h;
        FollowStatus followStatus;
        C65808M0a m0a = this.A00;
        C232262tL r4 = (C232262tL) 00k.A0O(m0a.A0D, i);
        if (r4 != null) {
            if (r4 instanceof C61170JyM) {
                C62261Kcv kcv = m0a.A0A;
                C61170JyM jyM = (C61170JyM) r4;
                C270194gL r7 = jyM.A04;
                List list = m0a.A0C;
                int i3 = jyM.A00;
                AnonymousClass7TG.A1N(r7, list);
                C270194gL r9 = kcv.A00;
                if (r9 != null) {
                    L5O l5o = (L5O) C313636gl.A00(kcv, AnonymousClass7TE.A0l(kcv.A08)).A03.getValue();
                    int size = list.size();
                    String str2 = kcv.A04;
                    if (str2 != null) {
                        String str3 = kcv.A02;
                        if (str3 != null) {
                            UserSession userSession = l5o.A01;
                            AnonymousClass0iw r5 = l5o.A00;
                            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "ig_live_suggested_live_impression");
                            A0e.A9F("a_pk", DbV.A0q(JTP.A0q(r7)));
                            String str4 = r7.A0X;
                            str4.getClass();
                            A0e.A9F("b_pk", DbV.A0q(str4));
                            String str5 = r7.A0e;
                            str5.getClass();
                            C51965G9l.A1I(A0e, str5);
                            JTT.A19(A0e, r9);
                            A0e.A9F("suggested_live_position", DbS.A0j(i3));
                            A0e.A9F("suggested_live_count", DbV.A0p(A0e, "suggested_live_follow_status", 1aC.A06(AnonymousClass2f1.A00(userSession).A0N(r7.A03())), size));
                            C51969G9p.A1A(A0e, r5);
                            A0e.AAJ(MYP.A00(), str2);
                            C51965G9l.A1O(A0e, str2);
                            DbS.A1N(A0e, str3);
                        }
                        str = "entryPoint";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    str = "viewerSessionId";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            } else if (r4 instanceof C64790LiA) {
                C62261Kcv kcv2 = m0a.A0A;
                C64790LiA liA = (C64790LiA) r4;
                CGB cgb = liA.A02;
                List list2 = m0a.A0B;
                int i4 = liA.A00;
                0qQ.A0B(list2, 1);
                C270194gL r10 = kcv2.A00;
                if (r10 != null && (r6 = cgb.A01) != null) {
                    L5O l5o2 = (L5O) C313636gl.A00(kcv2, AnonymousClass7TE.A0l(kcv2.A08)).A03.getValue();
                    int size2 = list2.size();
                    String str6 = kcv2.A04;
                    if (str6 != null) {
                        String str7 = kcv2.A02;
                        if (str7 != null) {
                            UserSession userSession2 = l5o2.A01;
                            A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(l5o2.A00, userSession2), "ig_live_suggested_post_live_impression");
                            User A2A = r6.A2A(userSession2);
                            if (A2A != null && (A0h = C51972G9s.A0h(A2A)) != null) {
                                A0e.A9F("parent_a_pk", DbV.A0q(JTP.A0q(r10)));
                                String str8 = r10.A0X;
                                str8.getClass();
                                A0e.A9F("parent_b_pk", DbV.A0q(str8));
                                String str9 = r10.A0e;
                                str9.getClass();
                                A0e.A9F("suggested_live_position", DbV.A0p(A0e, "parent_m_pk", str9, i4));
                                User A2A2 = r6.A2A(userSession2);
                                if (A2A2 != null) {
                                    followStatus = AnonymousClass2f1.A00(userSession2).A0N(A2A2);
                                } else {
                                    followStatus = null;
                                }
                                A0e.A9F("suggested_live_count", DbV.A0p(A0e, "suggested_live_follow_status", 1aC.A06(followStatus), size2));
                                A0e.A9F("a_pk", A0h);
                                String id = r6.getId();
                                if (id != null) {
                                    C51965G9l.A1I(A0e, id);
                                    C51965G9l.A1O(A0e, str6);
                                    DbS.A1N(A0e, str7);
                                } else {
                                    throw AnonymousClass7TE.A0y();
                                }
                            } else {
                                return;
                            }
                        }
                        str = "entryPoint";
                        0qQ.A0F(str);
                        throw AnonymousClass00P.createAndThrow();
                    }
                    str = "viewerSessionId";
                    0qQ.A0F(str);
                    throw AnonymousClass00P.createAndThrow();
                }
                return;
            } else {
                return;
            }
            A0e.Cgf();
        }
    }
}
