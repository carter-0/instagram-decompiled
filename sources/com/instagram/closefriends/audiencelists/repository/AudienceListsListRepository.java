package com.instagram.closefriends.audiencelists.repository;

import X.00k;
import X.02z;
import X.05G;
import X.0qQ;
import X.10b;
import X.AnonymousClass0Ud;
import X.AnonymousClass43D;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C62494Kgk;
import X.DbS;
import X.JTO;
import X.JTR;
import com.instagram.closefriends.audiencelists.model.AudienceListViewModel;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class AudienceListsListRepository extends C252733pa {
    public List A00;
    public final 05G A01;
    public final AnonymousClass0Ud A02;
    public final AnonymousClass0Ud A03;
    public final UserSession A04;
    public final 05G A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AudienceListsListRepository(UserSession userSession) {
        super("AudienceListsList", AnonymousClass43D.A00(687420290));
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        02z A1J = JTO.A1J();
        this.A01 = A1J;
        02z A10 = DbS.A10(C62494Kgk.Idle);
        this.A05 = A10;
        this.A02 = 10b.A03(A1J);
        this.A03 = 10b.A03(A10);
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDg, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x004a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x0088  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r6) {
        /*
            r5 = this;
            r3 = 28
            boolean r0 = X.C66128MDg.A01(r3, r6)
            if (r0 == 0) goto L_0x0064
            r4 = r6
            X.MDg r4 = (X.C66128MDg) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0064
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x004a
            if (r0 != r2) goto L_0x0073
            java.lang.Object r3 = r4.A01
            com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository r3 = (com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository) r3
            X.0eS.A00(r1)
        L_0x0028:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006a
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.MWM r0 = (X.MWM) r0
            X.JxS r0 = (X.C61116JxS) r0
            java.util.List r0 = r0.A00
            java.util.ArrayList r2 = X.AnonymousClass7TG.A0r(r0)
            java.util.Iterator r1 = r0.iterator()
        L_0x0040:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0078
            X.C61113JxP.A00(r2, r1)
            goto L_0x0040
        L_0x004a:
            X.0eS.A00(r1)
            X.05G r1 = r5.A05
            X.Kgk r0 = X.C62494Kgk.Loading
            r1.Epw(r0)
            com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil r1 = com.instagram.closefriends.audiencelists.api.AudienceListsApiUtil.A00
            com.instagram.common.session.UserSession r0 = r5.A04
            r4.A01 = r5
            r4.A00 = r2
            java.lang.Object r1 = r1.A0A(r0, r4)
            if (r1 == r3) goto L_0x0095
            r3 = r5
            goto L_0x0028
        L_0x0064:
            X.MDg r4 = new X.MDg
            r4.<init>(r5, r6, r3)
            goto L_0x0016
        L_0x006a:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0084
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0073:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0078:
            r0 = 0
            r3.A01(r2, r0)
            X.05G r1 = r3.A05
            X.Kgk r0 = X.C62494Kgk.Success
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x0084:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0093
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0096
            X.05G r1 = r3.A05
            X.Kgk r0 = X.C62494Kgk.Error
            r1.Epw(r0)
        L_0x0093:
            X.0gF r3 = X.C60340gF.A00
        L_0x0095:
            return r3
        L_0x0096:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.closefriends.audiencelists.repository.AudienceListsListRepository.A00(X.4D7):java.lang.Object");
    }

    public final void A01(List list, boolean z) {
        List<AudienceListViewModel> list2 = list;
        0qQ.A0B(list2, 0);
        05G r3 = this.A01;
        List A16 = JTO.A16(r3);
        List list3 = this.A00;
        if (list3 != null) {
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : list2) {
                AudienceListViewModel audienceListViewModel = (AudienceListViewModel) next;
                if (!(list3 instanceof Collection) || !list3.isEmpty()) {
                    Iterator it = list3.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (0qQ.A0K(it.next(), audienceListViewModel.A01)) {
                                A1C.add(next);
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            }
            list2 = A1C;
        }
        if (!z) {
            ArrayList A0r = AnonymousClass7TG.A0r(list2);
            for (AudienceListViewModel audienceListViewModel2 : list2) {
                ArrayList A1C2 = AnonymousClass7TE.A1C();
                for (Object next2 : A16) {
                    JTR.A1P(((AudienceListViewModel) next2).A01, audienceListViewModel2.A01, next2, A1C2);
                }
                AudienceListViewModel audienceListViewModel3 = (AudienceListViewModel) 00k.A0O(A1C2, 0);
                if (audienceListViewModel3 != null) {
                    String str = audienceListViewModel2.A01;
                    String str2 = audienceListViewModel2.A02;
                    int i = audienceListViewModel2.A00;
                    audienceListViewModel2 = new AudienceListViewModel(str, str2, audienceListViewModel2.A03, i, audienceListViewModel2.A05, audienceListViewModel2.A06, audienceListViewModel3.A04);
                }
                A0r.add(audienceListViewModel2);
            }
            list2 = A0r;
        }
        r3.Epw(list2);
    }
}
