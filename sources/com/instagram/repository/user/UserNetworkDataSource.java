package com.instagram.repository.user;

import X.0Tu;
import X.0qQ;
import X.182;
import X.1NY;
import X.1OC;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C323066wt;
import X.C3727892k;
import X.C3727992l;
import X.C46323Dbr;
import X.C46456DfK;
import X.DbZ;
import X.EDJ;
import X.G5K;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;

public final class UserNetworkDataSource {
    public EDJ A00;
    public final UserSession A01;
    public final boolean A02;
    public final boolean A03;

    public UserNetworkDataSource(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = userSession;
        0Tu r2 = 0Tu.A05;
        this.A02 = 182.A06(r2, userSession, 36316388029829421L);
        this.A03 = 182.A06(r2, userSession, 36316388029894958L);
    }

    public static final 1OC A00(UserNetworkDataSource userNetworkDataSource, C323066wt r3, G5K g5k, String str, String str2, boolean z) {
        String str3;
        String str4;
        1NY A0b = AnonymousClass7TG.A0b(userNetworkDataSource.A01);
        A0b.A0Q(C3727892k.class, C3727992l.class);
        if (g5k instanceof C46323Dbr) {
            A0b.A0A("users/{user_id}/info/");
            A0b.A0A = "users/{user_id}/info/";
            A0b.A0C = "user_info_by_id";
            str3 = ((C46323Dbr) g5k).A00;
            str4 = CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID;
        } else if (g5k instanceof C46456DfK) {
            A0b.A0A("users/{user_name}/usernameinfo/");
            A0b.A0A = "users/{user_name}/usernameinfo/";
            A0b.A0C = "user_info_by_username";
            str3 = ((C46456DfK) g5k).A00;
            str4 = "user_name";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A0b.A9m(str4, str3);
        DbZ.A1O(A0b, r3, str, str2, z);
        return A0b.A0M();
    }

    /* JADX WARNING: type inference failed for: r4v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r4v4 */
    /* JADX WARNING: type inference failed for: r4v5 */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        if (r2 == 404) goto L_0x0054;
     */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0022  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.C323066wt r13, X.G5K r14, java.lang.String r15, java.lang.String r16, X.AnonymousClass4D7 r17, int r18, boolean r19) {
        /*
            r12 = this;
            r3 = 18
            r5 = r17
            boolean r0 = X.MEA.A03(r3, r5)
            r6 = r12
            if (r0 == 0) goto L_0x007f
            r4 = r5
            X.MEA r4 = (X.MEA) r4
            int r2 = r4.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x007f
            int r2 = r2 - r1
            r4.A00 = r2
        L_0x0019:
            java.lang.Object r3 = r4.A01
            X.1Hj r2 = X.1Hj.A02
            int r1 = r4.A00
            r0 = 1
            if (r1 == 0) goto L_0x0060
            if (r1 != r0) goto L_0x008c
            X.0eS.A00(r3)
        L_0x0027:
            r2 = r3
            X.3Ii r2 = (X.C239803Ii) r2
            boolean r0 = r2 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x005f
            boolean r0 = r2 instanceof X.C297815sO
            if (r0 == 0) goto L_0x0087
            X.5sO r2 = (X.C297815sO) r2
            java.lang.Object r1 = r2.A00
            X.4dm r1 = (X.C268654dm) r1
            boolean r3 = r1 instanceof X.C268674do
            if (r3 == 0) goto L_0x0054
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<com.instagram.api.schemas.UserInfoResponse_Response>"
            X.0qQ.A0C(r1, r0)
            X.4do r1 = (X.C268674do) r1
            java.lang.Object r1 = r1.A00
            X.1XR r1 = (X.1XR) r1
            r0 = 0
            X.0qQ.A0B(r1, r0)
            int r2 = r1.getStatusCode()
            r0 = 404(0x194, float:5.66E-43)
            r1 = 0
            if (r2 != r0) goto L_0x0055
        L_0x0054:
            r1 = 1
        L_0x0055:
            X.Ewu r0 = new X.Ewu
            r0.<init>(r3, r1)
            X.5sO r2 = new X.5sO
            r2.<init>(r0)
        L_0x005f:
            return r2
        L_0x0060:
            X.0eS.A00(r3)
            r7 = r13
            r8 = r14
            r9 = r15
            r10 = r16
            r11 = r19
            X.1OC r1 = A00(r6, r7, r8, r9, r10, r11)
            r3 = r18
            X.DbZ.A1U(r1, r3)
            r4.A00 = r0
            r0 = 1671325816(0x639e6878, float:5.8442267E21)
            java.lang.Object r3 = r1.A00(r0, r4)
            if (r3 != r2) goto L_0x0027
            return r2
        L_0x007f:
            r0 = 42
            X.MEA r4 = new X.MEA
            r4.<init>(r12, r5, r3, r0)
            goto L_0x0019
        L_0x0087:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x008c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.user.UserNetworkDataSource.A01(X.6wt, X.G5K, java.lang.String, java.lang.String, X.4D7, int, boolean):java.lang.Object");
    }
}
