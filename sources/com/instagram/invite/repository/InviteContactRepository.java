package com.instagram.invite.repository;

import X.02z;
import X.05G;
import X.0Aj;
import X.0sl;
import X.0sn;
import X.106;
import X.10b;
import X.1DL;
import X.AnonymousClass0Ud;
import X.AnonymousClass0kN;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C48145EZn;
import X.DbS;
import X.DbX;
import X.DbY;
import X.EVC;
import X.F0B;
import X.FFE;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.request.InviteContactApi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

public final class InviteContactRepository {
    public final AnonymousClass0Ud A00;
    public final AnonymousClass0Ud A01;
    public final AnonymousClass0Ud A02;
    public final AnonymousClass0Ud A03;
    public final UserSession A04;
    public final InviteContactApi A05;
    public final 05G A06;
    public final 05G A07;
    public final 05G A08;
    public final 05G A09;

    public final void A01(Context context, C48145EZn eZn) {
        0Aj r1;
        List list;
        AnonymousClass7TF.A1H(context, eZn);
        05G r5 = this.A06;
        r5.Epw(EVC.PROGRESS);
        if (1DL.A07(context, "android.permission.READ_CONTACTS")) {
            UserSession userSession = this.A04;
            LinkedHashMap A022 = FFE.A02(context, userSession, false, false);
            ArrayList A0v = DbS.A0v(A022.size());
            Iterator A0s = AnonymousClass7TF.A0s(A022);
            while (A0s.hasNext()) {
                A0v.add(AnonymousClass7TE.A1J(A0s).getValue());
            }
            ArrayList A1C = AnonymousClass7TE.A1C();
            for (Object next : A0v) {
                F0B f0b = (F0B) next;
                if (!f0b.A04.isEmpty() && (list = f0b.A05) != null && !list.isEmpty()) {
                    A1C.add(next);
                }
            }
            this.A07.Epw(A1C);
            r5.Epw(EVC.COMPLETE);
            r1 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(userSession), "contact_list_client_fetch_success");
            if (r1.isSampled()) {
                DbX.A1K(eZn, r1, DbY.A0a());
            } else {
                return;
            }
        } else {
            r5.Epw(EVC.FAILED);
            r1 = AnonymousClass7TE.A0e(AnonymousClass0kN.A02(this.A04), "contact_list_client_fetch_failed");
            if (r1.isSampled()) {
                DbX.A1K(eZn, r1, DbY.A0a());
                r1.AAJ("error", (String) null);
            } else {
                return;
            }
        }
        r1.Cgf();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDx, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v8 */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:28:0x00a6  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.C48145EZn r6, X.AnonymousClass4D7 r7, boolean r8) {
        /*
            r5 = this;
            r3 = 48
            boolean r0 = X.C66145MDx.A02(r3, r7)
            if (r0 == 0) goto L_0x006e
            r4 = r7
            X.MDx r4 = (X.C66145MDx) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x006e
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r0 = r4.A00
            r2 = 1
            if (r0 == 0) goto L_0x0054
            if (r0 != r2) goto L_0x00a1
            java.lang.Object r6 = r4.A02
            X.EZn r6 = (X.C48145EZn) r6
            java.lang.Object r4 = r4.A01
            com.instagram.invite.repository.InviteContactRepository r4 = (com.instagram.invite.repository.InviteContactRepository) r4
            X.0eS.A00(r1)
        L_0x002c:
            X.G8c r1 = (X.C51934G8c) r1
            if (r1 == 0) goto L_0x00a6
            X.Dst r1 = (X.C47206Dst) r1
            java.util.List r0 = r1.A00
            if (r0 == 0) goto L_0x00a6
            java.util.ArrayList r3 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r1 = r0.iterator()
        L_0x003e:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x0074
            java.lang.Object r0 = r1.next()
            X.DR4 r0 = (X.DR4) r0
            X.BET r0 = (X.BET) r0
            java.lang.String r0 = r0.A00
            if (r0 == 0) goto L_0x003e
            r3.add(r0)
            goto L_0x003e
        L_0x0054:
            X.0eS.A00(r1)
            X.05G r1 = r5.A09
            X.EVC r0 = X.EVC.PROGRESS
            r1.Epw(r0)
            com.instagram.request.InviteContactApi r0 = r5.A05
            r4.A01 = r5
            r4.A02 = r6
            r4.A00 = r2
            java.lang.Object r1 = r0.A00(r4, r8)
            if (r1 == r3) goto L_0x00d5
            r4 = r5
            goto L_0x002c
        L_0x006e:
            X.MDx r4 = new X.MDx
            r4.<init>(r5, r7, r3)
            goto L_0x0016
        L_0x0074:
            X.05G r1 = r4.A08
            java.util.Set r0 = X.00k.A0k(r3)
            r1.Epw(r0)
            X.05G r1 = r4.A09
            X.EVC r0 = X.EVC.COMPLETE
            r1.Epw(r0)
            com.instagram.common.session.UserSession r0 = r4.A04
            X.0qQ.A0B(r6, r2)
            X.0wc r1 = X.AnonymousClass0kN.A02(r0)
            java.lang.String r0 = "contact_list_server_fetch_success"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = X.DbY.A0a()
            X.DbX.A1K(r6, r1, r0)
            goto L_0x00d0
        L_0x00a1:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x00a6:
            X.05G r1 = r4.A09
            X.EVC r0 = X.EVC.FAILED
            r1.Epw(r0)
            com.instagram.common.session.UserSession r1 = r4.A04
            r2 = 0
            r0 = 2
            X.0qQ.A0B(r6, r0)
            X.0wc r1 = X.AnonymousClass0kN.A02(r1)
            java.lang.String r0 = "contact_list_server_fetch_failed"
            X.0Aj r1 = X.AnonymousClass7TE.A0e(r1, r0)
            boolean r0 = r1.isSampled()
            if (r0 == 0) goto L_0x00d3
            java.lang.String r0 = X.DbY.A0a()
            X.DbX.A1K(r6, r1, r0)
            java.lang.String r0 = "error"
            r1.AAJ(r0, r2)
        L_0x00d0:
            r1.Cgf()
        L_0x00d3:
            X.0gF r3 = X.C60340gF.A00
        L_0x00d5:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.invite.repository.InviteContactRepository.A00(X.EZn, X.4D7, boolean):java.lang.Object");
    }

    public InviteContactRepository(UserSession userSession, InviteContactApi inviteContactApi) {
        this.A05 = inviteContactApi;
        this.A04 = userSession;
        02z A012 = 106.A01(0sl.A00);
        this.A08 = A012;
        this.A02 = 10b.A03(A012);
        02z A013 = 106.A01(0sn.A00);
        this.A07 = A013;
        this.A01 = 10b.A03(A013);
        EVC evc = EVC.PROGRESS;
        02z A10 = DbS.A10(evc);
        this.A09 = A10;
        this.A03 = 10b.A03(A10);
        02z A102 = DbS.A10(evc);
        this.A06 = A102;
        this.A00 = 10b.A03(A102);
    }
}
