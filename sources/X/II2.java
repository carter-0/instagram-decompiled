package X;

import com.instagram.schools.management.data.SchoolSettingsRepository;

public final class II2 implements AnonymousClass2Kv {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ SchoolSettingsRepository A02;
    public final /* synthetic */ C62320sa A03;
    public final /* synthetic */ C62320sa A04;

    public II2(SchoolSettingsRepository schoolSettingsRepository, C62320sa r2, C62320sa r3, int i, int i2) {
        this.A04 = r2;
        this.A02 = schoolSettingsRepository;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = r3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:26:0x00fe  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0034  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(X.AnonymousClass3JD r28) {
        /*
            r27 = this;
            if (r28 == 0) goto L_0x00fb
            X.3lr r4 = X.C41845B3m.A0U(r28)
            if (r4 == 0) goto L_0x00fb
            java.lang.Class<com.instagram.schools.management.data.UpdateGradYearResponseImpl$XdtUpdateGraduation> r3 = com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 374151420(0x164d18fc, float:1.6567652E-25)
            r2 = 0
            r0 = 1948(0x79c, float:2.73E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r1 = r4.getRequiredTreeField(r2, r0, r3, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation"
            X.0qQ.A0C(r1, r0)
            if (r1 == 0) goto L_0x00fb
            java.lang.String r0 = "success"
            boolean r0 = r1.getRequiredBooleanField(r2, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
        L_0x002b:
            r14 = 1
            boolean r0 = X.AnonymousClass7TF.A1Y(r0, r14)
            r1 = r27
            if (r0 == 0) goto L_0x00fe
            X.0sa r0 = r1.A04
            r0.invoke()
            com.instagram.schools.management.data.SchoolSettingsRepository r13 = r1.A02
            int r15 = r1.A00
            int r12 = r1.A01
            X.05G r11 = r13.A03
        L_0x0041:
            java.lang.Object r10 = r11.getValue()
            r9 = r10
            X.JwL r9 = (X.C61083JwL) r9
            java.lang.Object r0 = r9.A01
            X.Gm0 r0 = (X.C53314Gm0) r0
            if (r0 == 0) goto L_0x00f9
            java.lang.String r8 = r0.A04
            com.instagram.schools.management.data.SchoolAddress r7 = r0.A02
            X.62P r6 = r0.A06
            java.lang.String r5 = r0.A05
            boolean r4 = r0.A09
            boolean r3 = r0.A08
            java.lang.String r2 = r0.A03
            X.62P r1 = r0.A07
            r0 = 0
            X.0qQ.A0B(r8, r0)
            X.DbW.A1N(r7, r14, r5)
            r0 = 8
            X.0qQ.A0B(r2, r0)
            X.Gm0 r0 = new X.Gm0
            r26 = r3
            r25 = r4
            r24 = r12
            r23 = r15
            r22 = r1
            r21 = r6
            r20 = r2
            r19 = r5
            r18 = r8
            r17 = r7
            r16 = r0
            r16.<init>(r17, r18, r19, r20, r21, r22, r23, r24, r25, r26)
        L_0x0085:
            java.lang.Object r2 = r9.A00
            java.lang.Integer r2 = (java.lang.Integer) r2
            X.0qQ.A0B(r2, r14)
            X.JwL r1 = new X.JwL
            r1.<init>((X.C53314Gm0) r0, (java.lang.Integer) r2)
            boolean r0 = r11.AIY(r10, r1)
            if (r0 == 0) goto L_0x0041
            if (r28 == 0) goto L_0x00f8
            X.3lr r3 = X.C41845B3m.A0U(r28)
            if (r3 == 0) goto L_0x00f8
            java.lang.Class<com.instagram.schools.management.data.UpdateGradYearResponseImpl$XdtUpdateGraduation> r2 = com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation.class
            X.3sh r0 = X.C250663lr.Companion
            r1 = 374151420(0x164d18fc, float:1.6567652E-25)
            r0 = 1948(0x79c, float:2.73E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r3 = r3.A05(r2, r0, r1)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation"
            X.0qQ.A0C(r3, r0)
            if (r3 == 0) goto L_0x00f8
            java.lang.Class<com.instagram.schools.management.data.UpdateGradYearResponseImpl$XdtUpdateGraduation$User> r2 = com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation.User.class
            r1 = 491786776(0x1d501218, float:2.7537925E-21)
            java.lang.String r0 = "user"
            X.3lr r3 = r3.getOptionalTreeField(r14, r0, r2, r1)
            if (r3 == 0) goto L_0x00f8
            java.lang.Class<com.instagram.schools.management.data.UpdateGradYearResponseImpl$XdtUpdateGraduation$User$ShowSchoolsBadge> r2 = com.instagram.schools.management.data.UpdateGradYearResponseImpl.XdtUpdateGraduation.User.ShowSchoolsBadge.class
            r1 = 1109422879(0x4220731f, float:40.112423)
            r0 = 4006(0xfa6, float:5.614E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.3lr r3 = r3.A03(r2, r0, r1)
            if (r3 == 0) goto L_0x00f8
            r1 = 2
            r0 = 1393(0x571, float:1.952E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            int r2 = r3.getRequiredIntField(r1, r0)
            r1 = 0
            r0 = 3926(0xf56, float:5.501E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = X.C41847B3o.A1A(r3, r0, r1)
            r0 = 3927(0xf57, float:5.503E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r3.getOptionalStringField(r14, r0)
            com.instagram.schools.management.data.SchoolSettingsRepository.A02(r13, r1, r0, r2)
        L_0x00f8:
            return
        L_0x00f9:
            r0 = 0
            goto L_0x0085
        L_0x00fb:
            r0 = 0
            goto L_0x002b
        L_0x00fe:
            X.0sa r0 = r1.A03
            r0.invoke()
            com.instagram.schools.management.data.SchoolSettingsRepository r0 = r1.A02
            X.0eM r0 = r0.A02
            X.INA r1 = X.C51966G9m.A0z(r0)
            r0 = 3100(0xc1c, float:4.344E-42)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            r1.A07(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.II2.invoke(X.3JD):void");
    }
}
