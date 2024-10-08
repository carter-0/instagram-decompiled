package com.instagram.release.lockout;

import X.0qQ;
import X.1vm;
import X.1vn;
import X.AnonymousClass39A;
import X.AnonymousClass39E;
import com.instagram.common.session.UserSession;

public final class DogfoodingEligibilityApi {
    public final 1vn A00;
    public final AnonymousClass39E A01;
    public final AnonymousClass39A A02;

    public DogfoodingEligibilityApi(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        AnonymousClass39E r3 = new AnonymousClass39E();
        1vn A012 = 1vm.A01(userSession);
        AnonymousClass39A r1 = new AnonymousClass39A(userSession);
        0qQ.A0B(A012, 2);
        this.A01 = r3;
        this.A00 = A012;
        this.A02 = r1;
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r5v4 */
    /* JADX WARNING: type inference failed for: r5v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0044  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A00(X.AnonymousClass4D7 r7) {
        /*
            r6 = this;
            r3 = 40
            boolean r0 = X.C66138MDq.A02(r3, r7)
            if (r0 == 0) goto L_0x0067
            r5 = r7
            X.MDq r5 = (X.C66138MDq) r5
            int r2 = r5.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0067
            int r2 = r2 - r1
            r5.A00 = r2
        L_0x0016:
            java.lang.Object r4 = r5.A02
            X.1Hj r3 = X.1Hj.A02
            int r0 = r5.A00
            r2 = 1
            if (r0 == 0) goto L_0x0050
            if (r0 != r2) goto L_0x0073
            java.lang.Object r1 = r5.A01
            com.instagram.release.lockout.DogfoodingEligibilityApi r1 = (com.instagram.release.lockout.DogfoodingEligibilityApi) r1
            X.0eS.A00(r4)
        L_0x0028:
            X.3Ii r4 = (X.C239803Ii) r4
            boolean r0 = r4 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x0044
            X.39A r1 = r1.A02
            X.HOo r0 = X.C54683HOo.ELIGIBILITY_SERVICE_SUCCESS
            r1.A00(r0)
            X.3Ih r4 = (X.C239793Ih) r4
            java.lang.Object r0 = r4.A00
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r2 = r0.booleanValue()
        L_0x003f:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
            return r0
        L_0x0044:
            boolean r0 = r4 instanceof X.C297815sO
            if (r0 == 0) goto L_0x006d
            X.39A r1 = r1.A02
            X.HOo r0 = X.C54683HOo.ELIGIBILITY_SERVICE_FAILURE
            r1.A00(r0)
            goto L_0x003f
        L_0x0050:
            X.0eS.A00(r4)
            X.39A r1 = r6.A02
            X.HOo r0 = X.C54683HOo.ELIGIBILITY_SERVICE_CHECK
            r1.A00(r0)
            r5.A01 = r6
            r5.A00 = r2
            java.lang.Object r4 = r6.A01(r5)
            if (r4 != r3) goto L_0x0065
            return r3
        L_0x0065:
            r1 = r6
            goto L_0x0028
        L_0x0067:
            X.MDq r5 = new X.MDq
            r5.<init>(r6, r7, r3)
            goto L_0x0016
        L_0x006d:
            X.Wub r1 = new X.Wub
            r1.<init>()
            throw r1
        L_0x0073:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.lockout.DogfoodingEligibilityApi.A00(X.4D7):java.lang.Object");
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.4D7, X.MEA] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002a  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x005b  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x006b  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0075  */
    /* JADX WARNING: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A01(X.AnonymousClass4D7 r8) {
        /*
            r7 = this;
            r3 = 10
            boolean r0 = X.MEA.A03(r3, r8)
            if (r0 == 0) goto L_0x009b
            r6 = r8
            X.MEA r6 = (X.MEA) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x009b
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            if (r0 == 0) goto L_0x0075
            if (r0 != r4) goto L_0x00aa
            X.0eS.A00(r1)
        L_0x0024:
            X.3Ii r1 = (X.C239803Ii) r1
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 == 0) goto L_0x006b
            X.3Ih r1 = (X.C239793Ih) r1
            java.lang.Object r0 = r1.A00
            X.3JC r0 = (X.AnonymousClass3JC) r0
            java.lang.Object r5 = r0.A01
            X.3lr r5 = (X.C250663lr) r5
            if (r5 == 0) goto L_0x0069
            java.lang.Class<X.BnG> r3 = X.BnG.class
            r2 = 0
            r0 = 4225(0x1081, float:5.92E-42)
            java.lang.String r1 = X.AnonymousClass000.A00(r0)
            r0 = 367519779(0x15e7e823, float:9.3666404E-26)
            X.3lr r1 = r5.getRequiredTreeField(r2, r1, r3, r0)
            if (r1 == 0) goto L_0x0069
            java.lang.String r0 = "status"
            boolean r0 = r1.getRequiredBooleanField(r2, r0)
        L_0x004e:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            X.3Ih r1 = new X.3Ih
            r1.<init>(r0)
        L_0x0057:
            boolean r0 = r1 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x0068
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 == 0) goto L_0x00a4
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r4)
            X.5sO r1 = new X.5sO
            r1.<init>(r0)
        L_0x0068:
            return r1
        L_0x0069:
            r0 = 1
            goto L_0x004e
        L_0x006b:
            boolean r0 = r1 instanceof X.C297815sO
            if (r0 != 0) goto L_0x0057
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x0075:
            X.0eS.A00(r1)
            X.39E r3 = r7.A01
            r0 = 7
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            X.2IS r1 = r3.A00
            java.lang.String r0 = "lookback_days"
            r1.A03(r0, r2)
            r3.A02 = r4
            X.1Ef r1 = r3.build()
            X.1vn r0 = r7.A00
            X.0qQ.A0A(r1)
            r6.A00 = r4
            java.lang.Object r1 = r0.A04(r1, r6)
            if (r1 != r5) goto L_0x0024
            return r5
        L_0x009b:
            r0 = 42
            X.MEA r6 = new X.MEA
            r6.<init>(r7, r8, r3, r0)
            goto L_0x0016
        L_0x00a4:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x00aa:
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.release.lockout.DogfoodingEligibilityApi.A01(X.4D7):java.lang.Object");
    }
}
