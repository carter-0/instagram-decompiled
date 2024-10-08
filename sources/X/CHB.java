package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public final class CHB extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public CHB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public final void onFail(C268654dm r5) {
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                i = AnonymousClass7TG.A0D(r5, 215613165);
                CHB.super.onFail(r5);
                ((C62320sa) this.A01).invoke();
                i2 = -741324661;
                break;
            case 1:
                i = AnonymousClass7TG.A0D(r5, -1329492830);
                CHB.super.onFail(r5);
                ((C62320sa) this.A01).invoke();
                i2 = 72986348;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-1468328783);
                C45233Cso A002 = C44808ClK.A00((UserSession) this.A02);
                0sn r1 = 0sn.A00;
                0qQ.A0B(r1, 0);
                A002.A00 = r1;
                ((0sP) this.A01).invoke(r1);
                i2 = -621592757;
                break;
            case 3:
                i = AnonymousClass0fD.A03(458636466);
                DQw dQw = (DQw) this.A01;
                if (dQw != null) {
                    dQw.DcS();
                }
                i2 = -2045672616;
                break;
            default:
                CHB.super.onFail(r5);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int i2;
        ArrayList arrayList;
        C45233Cso cso;
        C250663lr optionalTreeField;
        ImmutableList requiredCompactedTreeListField;
        DQw dQw;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(1728269427);
                CFM cfm = (CFM) obj;
                int A0D = AnonymousClass7TG.A0D(cfm, 1532781728);
                ((0sP) this.A02).invoke(cfm.A00);
                AnonymousClass0fD.A0A(-667901323, A0D);
                i2 = 603294359;
                break;
            case 1:
                i = AnonymousClass0fD.A03(854302752);
                CFP cfp = (CFP) obj;
                int A0D2 = AnonymousClass7TG.A0D(cfp, -1157319181);
                CHB.super.onSuccess(cfp);
                List unmodifiableList = Collections.unmodifiableList(cfp.A00);
                0qQ.A07(unmodifiableList);
                ((0sP) this.A02).invoke(unmodifiableList);
                AnonymousClass0fD.A0A(1621540325, A0D2);
                i2 = 836178899;
                break;
            case 2:
                i = AnonymousClass0fD.A03(294314951);
                AnonymousClass3JC r12 = (AnonymousClass3JC) obj;
                int A03 = AnonymousClass0fD.A03(949280123);
                0qQ.A0B(r12, 0);
                C250663lr r4 = (C250663lr) r12.A01;
                if (r4 == null || (optionalTreeField = r4.getOptionalTreeField(0, "me", C43376BxE.class, 532359718)) == null || (requiredCompactedTreeListField = optionalTreeField.getRequiredCompactedTreeListField(0, "shared_accounts", C43375BxD.class, -129741997)) == null) {
                    cso = C44808ClK.A00((UserSession) this.A02);
                    arrayList = 0sn.A00;
                    0qQ.A0B(arrayList, 0);
                } else {
                    arrayList = AnonymousClass7TG.A0r(requiredCompactedTreeListField);
                    Iterator it = requiredCompactedTreeListField.iterator();
                    while (it.hasNext()) {
                        C250663lr A0V = C41845B3m.A0V(it);
                        arrayList.add(new C61037Jvb(A0V.getOptionalStringField(0, "instagram_user_id"), A0V.A08(C46326Dbu.A01(19, 8, 3)), A0V.A09("profile_image_uri(size:150)"), 16));
                    }
                    cso = C44808ClK.A00((UserSession) this.A02);
                }
                cso.A00 = arrayList;
                ((0sP) this.A01).invoke(arrayList);
                AnonymousClass0fD.A0A(1927238318, A03);
                i2 = -699392481;
                break;
            case 3:
                i = AnonymousClass0fD.A03(260194830);
                C43852CFs cFs = (C43852CFs) obj;
                int A032 = AnonymousClass0fD.A03(-11193763);
                if (cFs != null) {
                    if (cFs.A01 != null) {
                        Reel A0I = 1OP.A05((UserSession) this.A02).A0I(cFs.A01, false);
                        DQw dQw2 = (DQw) this.A01;
                        if (dQw2 != null) {
                            dQw2.DcB(A0I);
                        }
                    } else {
                        1Xj r1 = cFs.A00;
                        if (!(r1 == null || (dQw = (DQw) this.A01) == null)) {
                            dQw.DcD(r1);
                        }
                    }
                }
                AnonymousClass0fD.A0A(-93458477, A032);
                i2 = -858086424;
                break;
            default:
                i = AnonymousClass0fD.A03(2039020643);
                C43786CDe cDe = (C43786CDe) obj;
                int A033 = AnonymousClass0fD.A03(-601981946);
                0qQ.A0B(cDe, 0);
                User user = (User) this.A01;
                C253353qe r13 = cDe.A00;
                if (r13 != null) {
                    user.A03.ENi(r13);
                    ((17i) this.A02).A01(user, true, false);
                    AnonymousClass0fD.A0A(-908108723, A033);
                    i2 = 1298466579;
                    break;
                } else {
                    C41845B3m.A0v();
                    throw AnonymousClass00P.createAndThrow();
                }
        }
        AnonymousClass0fD.A0A(i2, i);
    }
}
