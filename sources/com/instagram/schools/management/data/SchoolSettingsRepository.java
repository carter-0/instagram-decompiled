package com.instagram.schools.management.data;

import X.05G;
import X.0eE;
import X.0qQ;
import X.AnonymousClass0eM;
import X.AnonymousClass0t1;
import X.AnonymousClass1Nd;
import X.AnonymousClass43D;
import X.C252733pa;
import X.C298895uD;
import X.C53314Gm0;
import X.C57064INe;
import X.C58685Ivu;
import X.C61083JwL;
import X.DbS;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class SchoolSettingsRepository extends C252733pa {
    public final UserSession A00;
    public final SchoolSettingsDataSource A01;
    public final AnonymousClass0eM A02 = C58685Ivu.A00(this, 38);
    public final 05G A03 = DbS.A10(new C61083JwL((C53314Gm0) null, (Integer) null, (DefaultConstructorMarker) null, 3, 1));

    public SchoolSettingsRepository(UserSession userSession, SchoolSettingsDataSource schoolSettingsDataSource) {
        super("ig_school", AnonymousClass43D.A01(1384462179, 3));
        this.A00 = userSession;
        this.A01 = schoolSettingsDataSource;
    }

    public static SchoolSettingsRepository A00(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        return new SchoolSettingsRepository(userSession, new SchoolSettingsDataSource(userSession));
    }

    public static final void A02(SchoolSettingsRepository schoolSettingsRepository, String str, String str2, int i) {
        0qQ.A0B(str, 1);
        C298895uD r2 = new C298895uD(i, str, str2);
        0eE r0 = AnonymousClass0t1.A01;
        UserSession userSession = schoolSettingsRepository.A00;
        r0.A01(userSession).A03.El7(r2);
        AnonymousClass1Nd.A00(userSession).A00(new C57064INe(userSession.A06));
    }

    public static final void A01(SchoolSettingsRepository schoolSettingsRepository, Integer num) {
        Object value;
        05G r3 = schoolSettingsRepository.A03;
        do {
            value = r3.getValue();
            0qQ.A0B(num, 1);
        } while (!r3.AIY(value, new C61083JwL((C53314Gm0) ((C61083JwL) value).A01, num)));
    }

    /* JADX WARNING: type inference failed for: r7v1, types: [X.MDq, X.4D7] */
    /* JADX WARNING: type inference failed for: r7v4 */
    /* JADX WARNING: type inference failed for: r7v5 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0050  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0061  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x001f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object A03(X.AnonymousClass4D7 r9) {
        /*
            r8 = this;
            r3 = 43
            boolean r0 = X.C66138MDq.A02(r3, r9)
            if (r0 == 0) goto L_0x0083
            r7 = r9
            X.MDq r7 = (X.C66138MDq) r7
            int r2 = r7.A00
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L_0x0083
            int r2 = r2 - r1
            r7.A00 = r2
        L_0x0016:
            java.lang.Object r6 = r7.A02
            X.1Hj r4 = X.1Hj.A02
            int r0 = r7.A00
            r5 = 1
            if (r0 == 0) goto L_0x0061
            if (r0 != r5) goto L_0x0089
            java.lang.Object r1 = r7.A01
            com.instagram.schools.management.data.SchoolSettingsRepository r1 = (com.instagram.schools.management.data.SchoolSettingsRepository) r1
            X.0eS.A00(r6)
        L_0x0028:
            X.MQ0 r6 = (X.MQ0) r6
            boolean r0 = X.C59678JTj.A01(r5, r6)
            if (r0 == 0) goto L_0x0050
            X.05G r4 = r1.A03
        L_0x0032:
            java.lang.Object r3 = r4.getValue()
            r0 = r6
            X.JTj r0 = (X.C59678JTj) r0
            java.lang.Object r2 = r0.A01
            X.Gm0 r2 = (X.C53314Gm0) r2
            java.lang.Integer r1 = X.AnonymousClass05K.A0C
            X.0qQ.A0B(r1, r5)
            X.JwL r0 = new X.JwL
            r0.<init>((X.C53314Gm0) r2, (java.lang.Integer) r1)
            boolean r0 = r4.AIY(r3, r0)
            if (r0 == 0) goto L_0x0032
        L_0x004d:
            X.0gF r4 = X.C60340gF.A00
        L_0x004f:
            return r4
        L_0x0050:
            java.lang.Integer r0 = X.AnonymousClass05K.A0N
            A01(r1, r0)
            X.0eM r0 = r1.A02
            X.INA r1 = X.C51966G9m.A0z(r0)
            java.lang.String r0 = "failed to fetch school settings"
            r1.A07(r0)
            goto L_0x004d
        L_0x0061:
            X.0eS.A00(r6)
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            A01(r8, r0)
            X.4Cq r0 = r8.A01
            X.4Cc r3 = r0.ArX()
            r2 = 0
            r1 = 46
            X.MG3 r0 = new X.MG3
            r0.<init>((java.lang.Object) r8, (X.AnonymousClass4D7) r2, (int) r1)
            r7.A01 = r8
            r7.A00 = r5
            java.lang.Object r6 = X.1Eo.A00(r7, r3, r0)
            if (r6 == r4) goto L_0x004f
            r1 = r8
            goto L_0x0028
        L_0x0083:
            X.MDq r7 = new X.MDq
            r7.<init>(r8, r9, r3)
            goto L_0x0016
        L_0x0089:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.schools.management.data.SchoolSettingsRepository.A03(X.4D7):java.lang.Object");
    }
}
