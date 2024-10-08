package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.opal.impl.data.OpalRepository;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: X.Fxb  reason: case insensitive filesystem */
public final class C51640Fxb extends AnonymousClass1Ek implements 0sP {
    public int A00;
    public final int A01;
    public final Object A02;
    public final String A03;
    public final boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51640Fxb(OpalRepository opalRepository, String str, AnonymousClass4D7 r4, int i, boolean z) {
        super(1, r4);
        this.A01 = i;
        this.A04 = z;
        this.A02 = opalRepository;
        this.A03 = str;
    }

    public static C61064Jw2 A00(OpalRepository opalRepository) {
        return (C61064Jw2) ((C61074JwC) opalRepository.A08.getValue()).A01;
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.Fxb, X.4D7] */
    public final AnonymousClass4D7 create(AnonymousClass4D7 r7) {
        int i;
        int i2 = this.A01;
        boolean z = this.A04;
        OpalRepository opalRepository = (OpalRepository) this.A02;
        String str = this.A03;
        if (i2 != 0) {
            i = 1;
        } else {
            i = 0;
        }
        return new C51640Fxb(opalRepository, str, r7, i, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return ((C51640Fxb) create((AnonymousClass4D7) obj)).invokeSuspend(C60340gF.A00);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Fxb, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        OpalRepository opalRepository;
        String str;
        List list;
        String str2;
        String str3;
        List list2;
        String str4;
        Object obj2 = obj;
        if (this.A01 != 0) {
            Object obj3 = 1Hj.A02;
            boolean z = true;
            ArrayList arrayList = null;
            if (this.A00 != 0) {
                0eS.A00(obj2);
            } else {
                0eS.A00(obj2);
                boolean z2 = this.A04;
                if (z2 || A00((OpalRepository) this.A02).A03) {
                    if (!z2) {
                        OpalRepository.A02((OpalRepository) this.A02, C62520KhB.Loading);
                    }
                    OpalRepository opalRepository2 = (OpalRepository) this.A02;
                    UserSession userSession = opalRepository2.A04;
                    String str5 = this.A03;
                    Integer num = AnonymousClass05K.A0C;
                    if (z2) {
                        str3 = null;
                    } else {
                        str3 = A00(opalRepository2).A02;
                    }
                    1Ef A012 = AnonymousClass94C.A01(userSession, num, str5, str3, (String) null, (String) null, false, false, false, true, false, false, false, false, false);
                    1vn r1 = opalRepository2.A05;
                    this.A00 = 1;
                    obj2 = r1.A04(A012, this);
                    if (obj2 == obj3) {
                        return obj3;
                    }
                }
                return C60340gF.A00;
            }
            C239803Ii r4 = (C239803Ii) obj2;
            if (r4 instanceof C239793Ih) {
                Object obj4 = ((C239793Ih) r4).A00;
                0qQ.A0C(obj4, "null cannot be cast to non-null type com.facebook.graphql.query.interfaces.IGraphQLResult<com.facebook.graphql.modelutil.GraphQLModel>");
                OpalRepository opalRepository3 = (OpalRepository) this.A02;
                UserSession userSession2 = opalRepository3.A04;
                C273664mz A002 = B6X.A00((AnonymousClass3JD) obj4, userSession2);
                String str6 = A002.A04;
                List<1Xj> list3 = A002.A06;
                if (list3 != null) {
                    arrayList = AnonymousClass7TE.A1C();
                    for (1Xj r5 : list3) {
                        List list4 = opalRepository3.A07;
                        0qQ.A0A(r5);
                        list4.add(r5);
                        ImageUrl A1Q = r5.A1Q();
                        if (A1Q != null) {
                            String url = A1Q.getUrl();
                            String id = r5.getId();
                            if (id != null) {
                                boolean A56 = r5.A56();
                                1iA BR7 = r5.BR7();
                                boolean A5G = r5.A5G();
                                boolean A5I = r5.A5I();
                                Integer Bd0 = r5.A0C.Bd0();
                                if (Bd0 == null) {
                                    Bd0 = r5.A0C.CEg();
                                }
                                String AXm = r5.A0C.AXm();
                                User A2A = r5.A2A(userSession2);
                                if (A2A != null) {
                                    str4 = A2A.getUsername();
                                } else {
                                    str4 = "";
                                }
                                arrayList.add(new C53311Glx(BR7, Bd0, url, id, AXm, str4, A56, A5G, A5I));
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                }
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (!this.A04) {
                    A1C.addAll((Collection) A00(opalRepository3).A00);
                }
                if (arrayList != null) {
                    list2 = 00k.A0a(arrayList);
                } else {
                    list2 = 0sn.A00;
                }
                A1C.addAll(list2);
                C62520KhB khB = C62520KhB.Loaded;
                if (str6 == null) {
                    z = false;
                }
                OpalRepository.A00(new C61064Jw2(khB, str6, (List) A1C, z), opalRepository3);
                return C60340gF.A00;
            }
            opalRepository = (OpalRepository) this.A02;
        } else {
            Object obj5 = 1Hj.A02;
            boolean z3 = true;
            ArrayList arrayList2 = null;
            if (this.A00 != 0) {
                0eS.A00(obj2);
            } else {
                0eS.A00(obj2);
                boolean z4 = this.A04;
                if (z4 || A00((OpalRepository) this.A02).A03) {
                    if (!z4) {
                        OpalRepository.A02((OpalRepository) this.A02, C62520KhB.Loading);
                    }
                    OpalRepository opalRepository4 = (OpalRepository) this.A02;
                    UserSession userSession3 = opalRepository4.A04;
                    C46323Dbr dbr = new C46323Dbr(this.A03);
                    if (z4) {
                        str = null;
                    } else {
                        str = A00(opalRepository4).A02;
                    }
                    1OC A022 = AnonymousClass94B.A02(userSession3, dbr, str, true);
                    this.A00 = 1;
                    obj2 = A022.A00(72627069, this);
                    if (obj2 == obj5) {
                        return obj5;
                    }
                }
                return C60340gF.A00;
            }
            Object obj6 = (C239803Ii) obj2;
            boolean z5 = this.A04;
            opalRepository = (OpalRepository) this.A02;
            if (obj6 instanceof C239793Ih) {
                1XO r0 = (1XO) ((C239793Ih) obj6).A00;
                String str7 = r0.A04;
                List<1Xj> list5 = r0.A06;
                if (list5 != null) {
                    arrayList2 = AnonymousClass7TE.A1C();
                    for (1Xj r6 : list5) {
                        List list6 = opalRepository.A07;
                        0qQ.A0A(r6);
                        list6.add(r6);
                        ImageUrl A1Q2 = r6.A1Q();
                        if (A1Q2 != null) {
                            String url2 = A1Q2.getUrl();
                            String id2 = r6.getId();
                            if (id2 != null) {
                                boolean A562 = r6.A56();
                                1iA BR72 = r6.BR7();
                                boolean A5G2 = r6.A5G();
                                boolean A5I2 = r6.A5I();
                                Integer Bd02 = r6.A0C.Bd0();
                                if (Bd02 == null) {
                                    Bd02 = r6.A0C.CEg();
                                }
                                String AXm2 = r6.A0C.AXm();
                                User A2A2 = r6.A2A(opalRepository.A04);
                                if (A2A2 != null) {
                                    str2 = A2A2.getUsername();
                                } else {
                                    str2 = "";
                                }
                                arrayList2.add(new C53311Glx(BR72, Bd02, url2, id2, AXm2, str2, A562, A5G2, A5I2));
                            } else {
                                throw AnonymousClass7TE.A0z("Required value was null.");
                            }
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                }
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                if (!z5) {
                    A1C2.addAll((Collection) A00(opalRepository).A00);
                }
                if (arrayList2 != null) {
                    list = 00k.A0a(arrayList2);
                } else {
                    list = 0sn.A00;
                }
                A1C2.addAll(list);
                C62520KhB khB2 = C62520KhB.Loaded;
                if (str7 == null) {
                    z3 = false;
                }
                OpalRepository.A00(new C61064Jw2(khB2, str7, (List) A1C2, z3), opalRepository);
                obj6 = C41845B3m.A0d(C60340gF.A00);
            } else if (!(obj6 instanceof C297815sO)) {
                throw AnonymousClass7TE.A1K();
            }
            if (!(obj6 instanceof C239793Ih)) {
                if (!(obj6 instanceof C297815sO)) {
                    throw AnonymousClass7TE.A1K();
                }
            }
            return C60340gF.A00;
        }
        OpalRepository.A02(opalRepository, C62520KhB.Error);
        return C60340gF.A00;
    }
}
