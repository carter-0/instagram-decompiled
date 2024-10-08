package com.instagram.hallpass.repository;

import X.02z;
import X.05G;
import X.0qQ;
import X.0sn;
import X.0sr;
import X.106;
import X.10b;
import X.AnonymousClass00P;
import X.AnonymousClass0Ud;
import X.AnonymousClass43D;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C252733pa;
import X.C47199Dsl;
import X.C47202Dso;
import X.C51932G8a;
import X.DbS;
import X.EVO;
import X.G8Z;
import com.instagram.common.session.UserSession;
import com.instagram.hallpass.model.HallPassViewModel;
import java.util.ArrayList;
import java.util.List;

public final class HallPassRepository extends C252733pa {
    public final 05G A00;
    public final AnonymousClass0Ud A01;
    public final AnonymousClass0Ud A02;
    public final UserSession A03;
    public final 05G A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public HallPassRepository(UserSession userSession) {
        super("HallPass", AnonymousClass43D.A00(317297559));
        0qQ.A0B(userSession, 1);
        this.A03 = userSession;
        02z A012 = 106.A01(0sn.A00);
        this.A00 = A012;
        02z A10 = DbS.A10(EVO.Idle);
        this.A04 = A10;
        this.A02 = 10b.A03(A012);
        this.A01 = 10b.A03(A10);
    }

    private final List A00(C51932G8a g8a, String str) {
        boolean A1Q;
        List list = ((C47202Dso) g8a).A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                0sr.A1T();
                throw AnonymousClass00P.createAndThrow();
            }
            C47199Dsl dsl = (C47199Dsl) ((G8Z) next);
            String str2 = dsl.A03;
            String str3 = dsl.A04;
            String str4 = dsl.A02;
            int i3 = dsl.A00;
            int i4 = dsl.A01;
            List list2 = dsl.A05;
            if (str != null) {
                A1Q = str.equals(str2);
            } else {
                A1Q = AnonymousClass7TF.A1Q(i);
            }
            A0r.add(new HallPassViewModel(str2, str3, str4, list2, i3, i4, A1Q));
            i = i2;
        }
        return A0r;
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004d  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 36
            boolean r0 = X.C66145MDx.A02(r3, r7)
            if (r0 == 0) goto L_0x0080
            r4 = r7
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0080
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0064
            if (r0 != r2) goto L_0x008b
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r2 = r4.A01
            com.instagram.hallpass.repository.HallPassRepository r2 = (com.instagram.hallpass.repository.HallPassRepository) r2
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x005b
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.G8a r0 = (X.C51932G8a) r0
            X.05G r1 = r2.A00
            java.util.List r0 = r2.A00(r0, r6)
            r1.Epw(r0)
            X.05G r1 = r2.A04
            X.EVO r0 = X.EVO.Success
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x0049:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0058
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0086
            X.05G r1 = r2.A04
            X.EVO r0 = X.EVO.Error
            r1.Epw(r0)
        L_0x0058:
            X.0gF r3 = X.C60340gF.A00
        L_0x005a:
            return r3
        L_0x005b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0049
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x0064:
            X.0eS.A00(r1)
            X.05G r1 = r5.A04
            X.EVO r0 = X.EVO.Loading
            r1.Epw(r0)
            com.instagram.hallpass.util.HallPassApiUtil r1 = com.instagram.hallpass.util.HallPassApiUtil.A00
            com.instagram.common.session.UserSession r0 = r5.A03
            r4.A01 = r5
            r4.A02 = r6
            r4.A00 = r2
            java.lang.Object r1 = r1.A06(r0, r4)
            if (r1 == r3) goto L_0x005a
            r2 = r5
            goto L_0x002c
        L_0x0080:
            X.MDx r4 = new X.MDx
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x0086:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.repository.HallPassRepository.A01(java.lang.String, X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0032  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A02(java.lang.String r6, X.AnonymousClass4D7 r7) {
        /*
            r5 = this;
            r3 = 37
            boolean r0 = X.C66145MDx.A02(r3, r7)
            if (r0 == 0) goto L_0x0083
            r4 = r7
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x006e
            if (r0 != r2) goto L_0x008e
            java.lang.Object r6 = r4.A02
            java.lang.String r6 = (java.lang.String) r6
            java.lang.Object r3 = r4.A01
            com.instagram.hallpass.repository.HallPassRepository r3 = (com.instagram.hallpass.repository.HallPassRepository) r3
            X.0eS.A00(r1)
        L_0x002c:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0065
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.G8a r0 = (X.C51932G8a) r0
            java.util.List r2 = r3.A00(r0, r6)
            X.05G r1 = r3.A00
            java.lang.Object r0 = r1.getValue()
            boolean r0 = X.0qQ.A0K(r2, r0)
            if (r0 != 0) goto L_0x004b
            r1.Epw(r2)
        L_0x004b:
            X.05G r1 = r3.A04
            X.EVO r0 = X.EVO.Success
            X.3Ih r1 = X.Dba.A0S(r0, r1)
        L_0x0053:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0062
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0089
            X.05G r1 = r3.A04
            X.EVO r0 = X.EVO.Error
            r1.Epw(r0)
        L_0x0062:
            X.0gF r3 = X.C60340gF.A00
        L_0x0064:
            return r3
        L_0x0065:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0053
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x006e:
            X.0eS.A00(r1)
            com.instagram.hallpass.util.HallPassApiUtil r1 = com.instagram.hallpass.util.HallPassApiUtil.A00
            com.instagram.common.session.UserSession r0 = r5.A03
            r4.A01 = r5
            r4.A02 = r6
            r4.A00 = r2
            java.lang.Object r1 = r1.A06(r0, r4)
            if (r1 == r3) goto L_0x0064
            r3 = r5
            goto L_0x002c
        L_0x0083:
            X.MDx r4 = new X.MDx
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x0089:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008e:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.hallpass.repository.HallPassRepository.A02(java.lang.String, X.4D7):java.lang.Object");
    }
}
