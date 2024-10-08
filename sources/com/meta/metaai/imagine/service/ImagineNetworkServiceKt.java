package com.meta.metaai.imagine.service;

import X.0eP;
import X.0qQ;
import X.AnonymousClass05K;
import X.AnonymousClass9NE;
import X.BWK;
import X.C297815sO;
import X.C41847B3o;
import X.C44041CTc;
import X.C44043CTe;
import X.C44049CTs;
import X.C54726HQf;
import X.C56125HtD;
import X.CTf;
import X.EX8;
import X.HMY;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public abstract class ImagineNetworkServiceKt {
    public static final C56125HtD A00(BWK bwk) {
        String A0A;
        String A07 = bwk.A07(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
        if (A07 == null || (A0A = bwk.A0A(AnonymousClass9NE.A01(52, 8, 53))) == null) {
            return null;
        }
        return new C56125HtD(A07, A0A, bwk.A09("profile_picture_url"), C41847B3o.A1b(bwk, 1));
    }

    /* JADX WARNING: type inference failed for: r0v3, types: [X.HQf, java.lang.Object] */
    public static C54726HQf A01(Object obj) {
        C44049CTs cTs = (C44049CTs) ((C297815sO) obj).A00;
        if (cTs instanceof C44043CTe) {
            return new Object();
        }
        0qQ.A0C(cTs, "null cannot be cast to non-null type com.meta.metaai.shared.graphql.GraphQLError.Failure");
        return new C44041CTc(((CTf) cTs).A00);
    }

    public static final Integer A02(EX8 ex8) {
        if (ex8 != null) {
            int ordinal = ex8.ordinal();
            if (ordinal == 5) {
                return AnonymousClass05K.A01;
            }
            if (ordinal == 2) {
                return AnonymousClass05K.A0C;
            }
            if (ordinal == 9) {
                return AnonymousClass05K.A0N;
            }
            if (ordinal == 8) {
                return AnonymousClass05K.A0Y;
            }
            if (ordinal == 3) {
                return AnonymousClass05K.A0j;
            }
        }
        return AnonymousClass05K.A00;
    }

    /* JADX WARNING: type inference failed for: r6v1, types: [X.Il6, X.4D7] */
    /* JADX WARNING: type inference failed for: r6v4 */
    /* JADX WARNING: type inference failed for: r6v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0020  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object A03(X.AnonymousClass4D7 r7, X.0sL r8, long r9) {
        /*
            r3 = 33
            boolean r0 = X.C58074Il6.A02(r3, r7)
            if (r0 == 0) goto L_0x0023
            r6 = r7
            X.Il6 r6 = (X.C58074Il6) r6
            int r2 = r6.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0023
            int r2 = r2 - r1
            r6.A00 = r2
        L_0x0016:
            java.lang.Object r1 = r6.A01
            X.1Hj r5 = X.1Hj.A02
            int r0 = r6.A00
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L_0x002e
            if (r0 != r4) goto L_0x0029
            goto L_0x0043
        L_0x0023:
            X.Il6 r6 = new X.Il6
            r6.<init>(r3, r7)
            goto L_0x0016
        L_0x0029:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x002e:
            X.0eS.A00(r1)
            r2 = 45
            r1 = 42
            X.MGC r0 = new X.MGC     // Catch:{ 3EF -> 0x0051, CancellationException -> 0x004b, Exception -> 0x0049 }
            r0.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r3, (int) r2, (int) r1)     // Catch:{ 3EF -> 0x0051, CancellationException -> 0x004b, Exception -> 0x0049 }
            r6.A00 = r4     // Catch:{ 3EF -> 0x0051, CancellationException -> 0x004b, Exception -> 0x0049 }
            java.lang.Object r1 = X.I3P.A00(r6, r0, r9)     // Catch:{ 3EF -> 0x0051, CancellationException -> 0x004b, Exception -> 0x0049 }
            if (r1 != r5) goto L_0x0046
            return r5
        L_0x0043:
            X.0eS.A00(r1)     // Catch:{ 3EF -> 0x0051, CancellationException -> 0x004b, Exception -> 0x0049 }
        L_0x0046:
            X.3Ii r1 = (X.C239803Ii) r1     // Catch:{ 3EF -> 0x0051, CancellationException -> 0x004b, Exception -> 0x0049 }
            return r1
        L_0x0049:
            r0 = move-exception
            throw r0
        L_0x004b:
            X.HId r0 = new X.HId
            r0.<init>()
            goto L_0x0056
        L_0x0051:
            X.CTb r0 = new X.CTb
            r0.<init>()
        L_0x0056:
            X.5sO r1 = X.C41845B3m.A0c(r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.meta.metaai.imagine.service.ImagineNetworkServiceKt.A03(X.4D7, X.0sL, long):java.lang.Object");
    }

    public static final 0eP A04(HMY hmy, EX8 ex8) {
        if (ex8 == null || ex8.ordinal() != 2) {
            if (hmy == HMY.SQUARE) {
                return ImagineNetworkService.A08;
            }
            return ImagineNetworkService.A07;
        } else if (hmy == HMY.SQUARE) {
            return ImagineNetworkService.A06;
        } else {
            return ImagineNetworkService.A05;
        }
    }
}
