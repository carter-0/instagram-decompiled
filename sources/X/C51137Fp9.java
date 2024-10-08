package X;

import android.content.Context;
import com.facebook.proxygen.TraceFieldType;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: X.Fp9  reason: case insensitive filesystem */
public final class C51137Fp9 implements 1aV {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C51137Fp9(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        String str;
        String A002;
        2YL r2;
        C318136oS A003;
        int i;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C74233PrM prM = (C74233PrM) obj2;
                0qQ.A0B(prM, 0);
                DbS.A1V(this.A01);
                if (prM instanceof C66990MgO) {
                    FBR fbr = (FBR) this.A02;
                    DbX.A1J(fbr.A03);
                    if (fbr.A01 == 29) {
                        int ordinal = fbr.A07.ordinal();
                        if (ordinal == 1) {
                            C72180Oxp A004 = C69867NtV.A00(fbr.A05);
                            C69871NtZ.A00(A004.A00, C300965yF.A07(fbr.A06), fbr.A08, "thread_add_moderators_success", "view", AnonymousClass000.A00(1076), "thread_view", (HashMap) null, fbr.A00);
                        } else if (ordinal == 2) {
                            C313756gx A005 = C313746gw.A00(fbr.A05);
                            int i2 = fbr.A00;
                            String A07 = C300965yF.A07(fbr.A06);
                            String str2 = fbr.A08;
                            1Ln A0J = DbT.A0J(A005);
                            if (DbT.A1Y(A0J)) {
                                DbW.A17(A0J, A005);
                                Dba.A1D(A0J, "thread_add_collaborators_success");
                                A0J.A0p("add_collaborator");
                                A0J.A0i(DbZ.A0b(A0J, "thread_view", A07, str2, i2));
                                A0J.Cgf();
                            }
                        }
                        C59689JTv.A07(fbr.A02, 2131958682);
                        return;
                    }
                    return;
                }
                Object A012 = C66996MgU.A01(prM);
                0qQ.A07(A012);
                C47124Dr1 dr1 = (C47124Dr1) A012;
                FBR fbr2 = (FBR) this.A02;
                AnonymousClass4DH r5 = fbr2.A03;
                if (!r5.isResumed()) {
                    return;
                }
                if (fbr2.A01 == 29) {
                    String str3 = dr1.A01;
                    String str4 = dr1.A02;
                    String str5 = str4;
                    int ordinal2 = fbr2.A07.ordinal();
                    if (ordinal2 == 1) {
                        C72180Oxp A006 = C69867NtV.A00(fbr2.A05);
                        int i3 = fbr2.A00;
                        String A072 = C300965yF.A07(fbr2.A06);
                        String str6 = fbr2.A08;
                        String str7 = str4;
                        String str8 = str3;
                        HashMap A1E = AnonymousClass7TE.A1E();
                        if (str4 == null) {
                            str7 = "";
                        }
                        A1E.put("error_message", str7);
                        if (str3 == null) {
                            str8 = "";
                        }
                        A1E.put(TraceFieldType.ErrorCode, str8);
                        C69871NtZ.A00(A006.A00, A072, str6, "thread_add_moderators_error", "view", AnonymousClass000.A00(1076), "thread_view", A1E, i3);
                    } else if (ordinal2 == 2) {
                        C313756gx A007 = C313746gw.A00(fbr2.A05);
                        int i4 = fbr2.A00;
                        String A073 = C300965yF.A07(fbr2.A06);
                        String str9 = fbr2.A08;
                        String str10 = str4;
                        String str11 = str3;
                        1Ln A0J2 = DbT.A0J(A007);
                        if (DbT.A1Y(A0J2)) {
                            HashMap A1E2 = AnonymousClass7TE.A1E();
                            if (str4 == null) {
                                str10 = "";
                            }
                            A1E2.put("error_message", str10);
                            if (str3 == null) {
                                str11 = "";
                            }
                            A1E2.put(TraceFieldType.ErrorCode, str11);
                            DbW.A17(A0J2, A007);
                            Dba.A1D(A0J2, "thread_add_collaborators_error");
                            A0J2.A0p("add_collaborator");
                            A0J2.A0i(DbZ.A0b(A0J2, "thread_view", A073, str9, i4));
                            A0J2.A0w(A1E2);
                            A0J2.Cgf();
                        }
                    }
                    Context context = fbr2.A02;
                    if (!0qQ.A0K(str3, "575") || str4 == null || str4.length() == 0) {
                        str5 = context.getString(2131960632);
                    }
                    if (!0qQ.A0K(str3, "575") || str4 == null || str4.length() == 0) {
                        A002 = C66579MXk.A00(799);
                    } else {
                        A002 = "ChannelsConstants.BC_COLLABORATOR_CUSTOM_ERROR_CODE";
                    }
                    C59689JTv.A03(context, str5, A002, 0);
                    return;
                }
                String str12 = dr1.A04;
                if (str12 == null || (str = dr1.A00) == null) {
                    UserSession userSession = fbr2.A05;
                    String A074 = C300965yF.A07(fbr2.A06);
                    0qQ.A0B(A074, 2);
                    0Aj A0e = AnonymousClass7TE.A0e(AnonymousClass0kN.A01(r5, userSession), "direct_group_add_member_fail");
                    if (A0e.isSampled()) {
                        A0e.AAJ("open_thread_id", A074);
                        A0e.Cgf();
                    }
                    C69904Nu6.A00(fbr2.A02, dr1.A05);
                    return;
                }
                Dba.A1L(DbX.A0g(fbr2.A02, str, str12));
                String str13 = dr1.A03;
                if (str13 != null && str13.length() != 0 && C66579MXk.A00(466).equalsIgnoreCase(str13)) {
                    C391629tO r4 = C391629tO.A0S;
                    C254793t3 r0 = fbr2.A06;
                    C3265677h.A06(r4, r5, fbr2.A05, r0.toString(), r0 instanceof MsysThreadId);
                    return;
                }
                return;
            case 1:
                C257443xP r1 = (C257443xP) obj2;
                if (!r1.A06() || !((1XQ) r1.A03()).isOk()) {
                    C47162Drd drd = (C47162Drd) this.A01;
                    if (drd != null) {
                        drd.A00 = "enabled";
                    }
                    r2 = (C46786DlE) this.A02;
                    r2.A03.A0B(drd);
                    A003 = C318116oQ.A00(r2);
                    i = 19;
                } else {
                    r2 = (2YL) this.A02;
                    A003 = C318116oQ.A00(r2);
                    i = 18;
                }
                C51645Fy4.A01(r2, A003, i);
                return;
            default:
                C257443xP r12 = (C257443xP) obj2;
                if (r12.A06() && ((AnonymousClass3JC) r12.A03()).A01 != null) {
                    Object obj3 = ((AnonymousClass3JC) r12.A03()).A01;
                    if (obj3 != null) {
                        ImmutableList A022 = ((AnonymousClass3FZ) obj3).A02("pay_financial_entity_by_admin", C47109Dql.class);
                        0qQ.A07(A022);
                        Object obj4 = this.A02;
                        Iterator it = A022.iterator();
                        Enum enumR = null;
                        AnonymousClass3FZ r6 = null;
                        while (true) {
                            boolean z = false;
                            if (it.hasNext()) {
                                AnonymousClass3FZ r7 = (AnonymousClass3FZ) it.next();
                                Class<C47107Dqj> cls = C47107Dqj.class;
                                ImmutableList A023 = r7.A02("payees", cls);
                                if (A023 != null && !A023.isEmpty()) {
                                    ImmutableList A024 = r7.A02("payees", cls);
                                    0qQ.A07(A024);
                                    Iterator it2 = A024.iterator();
                                    while (it2.hasNext()) {
                                        if (((AnonymousClass3FZ) it2.next()).A04("subtype", EXJ.A0A) == obj4) {
                                            r6 = r7;
                                        }
                                    }
                                }
                            } else if (r6 == null) {
                                ((0sK) this.A01).invoke(false, false, (Object) null);
                                return;
                            } else {
                                ImmutableList A025 = r6.A02("payout_hold", C47108Dqk.class);
                                if (A025 != null) {
                                    Iterator it3 = A025.iterator();
                                    while (it3.hasNext()) {
                                        AnonymousClass3FZ r62 = (AnonymousClass3FZ) it3.next();
                                        EXI exi = EXI.A04;
                                        if (r62.A04("external_reason_code", exi) == EXI.A03 || r62.A04("external_reason_code", exi) == EXI.A02) {
                                            enumR = r62.A04("external_reason_code", exi);
                                            z = true;
                                        }
                                    }
                                }
                                ((0sK) this.A01).invoke(true, Boolean.valueOf(z), enumR);
                                return;
                            }
                        }
                    } else {
                        throw AnonymousClass7TE.A0y();
                    }
                } else {
                    return;
                }
                break;
        }
    }
}
