package com.instagram.profile.interest;

import X.00k;
import X.05G;
import X.0Tu;
import X.0eS;
import X.0qQ;
import X.0sH;
import X.0sn;
import X.182;
import X.AnonymousClass000;
import X.AnonymousClass00P;
import X.AnonymousClass0t1;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C262184Cl;
import X.C318116oQ;
import X.C41845B3m;
import X.C46792DlR;
import X.C47135DrC;
import X.C47142DrJ;
import X.C47189Dsb;
import X.C47205Dss;
import X.C47238DtP;
import X.C47314Duh;
import X.C47317Duk;
import X.C51933G8b;
import X.C51954G8x;
import X.C52255GKw;
import X.C59678JTj;
import X.C59702JUj;
import X.C60340gF;
import X.C61082JwK;
import X.DbS;
import X.DbX;
import X.GKO;
import X.JV5;
import X.MQ0;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.profile.interest.ProfileInterestPickerViewModel$viewState$1", f = "ProfileInterestPickerViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ProfileInterestPickerViewModel$viewState$1 extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ Object A00;
    public /* synthetic */ Object A01;
    public /* synthetic */ Object A02;
    public /* synthetic */ Object A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ C46792DlR A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileInterestPickerViewModel$viewState$1(C46792DlR dlR, AnonymousClass4D7 r3) {
        super(6, r3);
        this.A05 = dlR;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AnonymousClass7TE.A1a(obj5);
        ProfileInterestPickerViewModel$viewState$1 profileInterestPickerViewModel$viewState$1 = new ProfileInterestPickerViewModel$viewState$1(this.A05, (AnonymousClass4D7) obj6);
        profileInterestPickerViewModel$viewState$1.A00 = obj;
        profileInterestPickerViewModel$viewState$1.A01 = obj2;
        profileInterestPickerViewModel$viewState$1.A02 = obj3;
        profileInterestPickerViewModel$viewState$1.A03 = obj4;
        profileInterestPickerViewModel$viewState$1.A04 = A1a;
        return profileInterestPickerViewModel$viewState$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        ArrayList arrayList;
        Object value;
        boolean z;
        String str;
        Object obj2;
        GKO gko;
        C52255GKw gKw;
        0eS.A00(obj);
        MQ0 mq0 = (MQ0) this.A00;
        MQ0 mq02 = (MQ0) this.A01;
        List<C61082JwK> list = (List) this.A02;
        Object obj3 = this.A03;
        boolean z2 = this.A04;
        ArrayList A1C = AnonymousClass7TE.A1C();
        if ((mq0 instanceof C59702JUj) || (mq02 instanceof C59702JUj)) {
            A1C.add(new Object());
        } else if (C59678JTj.A01(1, mq0) && C59678JTj.A01(1, mq02)) {
            C46792DlR dlR = this.A05;
            if (!dlR.A01) {
                dlR.A02((Boolean) null, AnonymousClass000.A00(3517), (List) null);
                dlR.A01 = true;
            }
            ArrayList A1C2 = AnonymousClass7TE.A1C();
            C47142DrJ drJ = ((C47317Duk) ((C59678JTj) mq0).A01).A00;
            if (drJ != null) {
                List<C51933G8b> list2 = drJ.A00;
                if (list2 != null) {
                    ArrayList A0p = AnonymousClass7TF.A0p(list2);
                    for (C51933G8b g8b : list2) {
                        ArrayList A1C3 = AnonymousClass7TE.A1C();
                        C47205Dss dss = (C47205Dss) g8b;
                        List<C51954G8x> list3 = dss.A02;
                        C47135DrC drC = ((C47314Duh) ((C59678JTj) mq02).A01).A00;
                        if (drC != null) {
                            List list4 = drC.A00;
                            if (list3 != null) {
                                ArrayList A0p2 = AnonymousClass7TF.A0p(list3);
                                for (C51954G8x g8x : list3) {
                                    boolean z3 = false;
                                    if (C46792DlR.A00(g8x.B6N(), list) != -1) {
                                        z3 = true;
                                    }
                                    C61082JwK jwK = new C61082JwK(g8x, z3);
                                    A1C3.add(jwK);
                                    if (list4 != null && 00k.A0u(list4, g8x.B6N())) {
                                        A1C2.add(jwK);
                                    }
                                    A0p2.add(C60340gF.A00);
                                }
                            }
                            String str2 = dss.A00;
                            if (str2 != null) {
                                gKw = new C52255GKw(str2);
                            } else {
                                gKw = null;
                            }
                            String str3 = dss.A01;
                            if (str3 == null) {
                                str3 = "";
                            }
                            A0p.add(new C47238DtP(gKw, new C52255GKw(str3), A1C3));
                        }
                    }
                    List A0a = 00k.A0a(A1C2);
                    if (AnonymousClass7TE.A1b(A0a)) {
                        if (!182.A06(0Tu.A05, dlR.A02, 36316345079894255L)) {
                            gko = DbS.A0Q(new Object[0], 2131970002);
                        } else {
                            gko = null;
                        }
                        A1C.add(new C47238DtP(gko, DbS.A0Q(new Object[0], 2131970001), A0a));
                    }
                    A1C.addAll(A0p);
                }
            }
            C41845B3m.A0v();
            throw AnonymousClass00P.createAndThrow();
        } else if (C59678JTj.A02(mq0)) {
            C46792DlR dlR2 = this.A05;
            DbX.A1X(dlR2, C318116oQ.A00(dlR2), 5);
        }
        if (C59678JTj.A01(1, obj3)) {
            C46792DlR dlR3 = this.A05;
            DbX.A1X(dlR3, C318116oQ.A00(dlR3), 6);
            User A012 = AnonymousClass0t1.A01.A01(dlR3.A02);
            ArrayList A0p3 = AnonymousClass7TF.A0p(list);
            for (C61082JwK jwK2 : list) {
                if (jwK2 != null) {
                    obj2 = jwK2.A00;
                } else {
                    obj2 = null;
                }
                A0p3.add(obj2);
            }
            List<C51954G8x> A0a2 = 00k.A0a(00k.A0X(A0p3));
            C262184Cl r7 = A012.A03;
            ArrayList<C51954G8x> A0p4 = AnonymousClass7TF.A0p(A0a2);
            for (C51954G8x FC1 : A0a2) {
                A0p4.add(FC1.FC1());
            }
            0qQ.A0B(A0p4, 1);
            ArrayList A0p5 = AnonymousClass7TF.A0p(A0p4);
            for (C51954G8x FC12 : A0p4) {
                A0p5.add(FC12.FC1());
            }
            r7.EPb(new C47189Dsb(A0p5));
        } else if (C59678JTj.A02(obj3)) {
            C46792DlR dlR4 = this.A05;
            DbX.A1X(dlR4, C318116oQ.A00(dlR4), 7);
        } else if (!(obj3 instanceof C59702JUj)) {
            throw AnonymousClass7TE.A1K();
        }
        C46792DlR dlR5 = this.A05;
        List<C51954G8x> list5 = dlR5.A05;
        if (list5 != null) {
            arrayList = AnonymousClass7TF.A0p(list5);
            for (C51954G8x g8x2 : list5) {
                if (g8x2 != null) {
                    str = g8x2.B6N();
                } else {
                    str = null;
                }
                arrayList.add(str);
            }
        } else {
            arrayList = 0sn.A00;
        }
        dlR5.A00 = !0qQ.A0K(arrayList, C46792DlR.A01((List) dlR5.A0B.getValue()));
        05G r2 = dlR5.A09;
        do {
            value = r2.getValue();
            z = dlR5.A00;
            if (z) {
                z = true;
            }
        } while (!r2.AIY(value, Boolean.valueOf(z)));
        return new JV5(00k.A0a(A1C), (List) list, 18, z2);
    }
}
