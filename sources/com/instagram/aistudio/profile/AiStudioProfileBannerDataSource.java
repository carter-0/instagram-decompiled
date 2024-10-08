package com.instagram.aistudio.profile;

import X.1vm;
import X.1vn;
import X.AnonymousClass7I4;
import X.AnonymousClass7I6;
import X.MXY;
import com.instagram.common.session.UserSession;

public final class AiStudioProfileBannerDataSource implements MXY {
    public final AnonymousClass7I6 A00;
    public final 1vn A01;

    /* JADX WARNING: type inference failed for: r4v1, types: [X.MDy, X.4D7] */
    /* JADX WARNING: type inference failed for: r4v9 */
    /* JADX WARNING: type inference failed for: r4v10 */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x015f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0190  */
    /* JADX WARNING: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0025  */
    /* renamed from: A00 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object AXI(X.C324506zQ r21, X.AnonymousClass4D7 r22) {
        /*
            r20 = this;
            r0 = r21
            r6 = 16
            r7 = r22
            boolean r1 = X.C66146MDy.A02(r6, r7)
            r5 = r20
            if (r1 == 0) goto L_0x011d
            r4 = r7
            X.MDy r4 = (X.C66146MDy) r4
            int r3 = r4.A00
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r3 & r2
            if (r1 == 0) goto L_0x011d
            int r3 = r3 - r2
            r4.A00 = r3
        L_0x001c:
            java.lang.Object r7 = r4.A03
            X.1Hj r3 = X.1Hj.A02
            int r2 = r4.A00
            r1 = 1
            if (r2 == 0) goto L_0x00d1
            if (r2 != r1) goto L_0x012c
            java.lang.Object r0 = r4.A02
            X.6zQ r0 = (X.C324506zQ) r0
            java.lang.Object r4 = r4.A01
            com.instagram.aistudio.profile.AiStudioProfileBannerDataSource r4 = (com.instagram.aistudio.profile.AiStudioProfileBannerDataSource) r4
            X.0eS.A00(r7)
        L_0x0032:
            X.3Ii r7 = (X.C239803Ii) r7
            boolean r2 = r7 instanceof X.C239793Ih
            r6 = 0
            if (r2 == 0) goto L_0x0190
            X.3lr r8 = X.C41846B3n.A0R(r7)
            if (r8 == 0) goto L_0x0131
            java.lang.Class<X.Bua> r5 = X.C43212Bua.class
            r7 = 0
            r2 = 827(0x33b, float:1.159E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = -864085839(0xffffffffcc7f18b1, float:-6.6872004E7)
            X.3lr r8 = r8.getRequiredTreeField(r7, r3, r5, r2)
            if (r8 == 0) goto L_0x0131
            java.lang.Class<X.BuZ> r5 = X.C43211BuZ.class
            java.lang.String r3 = "user"
            r2 = -650419955(0xffffffffd93b610d, float:-3.29640807E15)
            X.3lr r8 = r8.getRequiredTreeField(r7, r3, r5, r2)
            if (r8 == 0) goto L_0x0131
            java.lang.Class<X.BuY> r5 = X.C43210BuY.class
            r2 = 3188(0xc74, float:4.467E-42)
            java.lang.String r3 = X.AnonymousClass000.A00(r2)
            r2 = -69969271(0xfffffffffbd45a89, float:-2.2052064E36)
            X.3lr r8 = r8.getOptionalTreeField(r7, r3, r5, r2)
            if (r8 == 0) goto L_0x0131
            java.lang.Class<X.BuX> r5 = X.C43209BuX.class
            java.lang.String r3 = "banners"
            r2 = -1906469583(0xffffffff8e5d9531, float:-2.7312186E-30)
            com.google.common.collect.ImmutableList r2 = r8.A06(r5, r3, r2)
            if (r2 == 0) goto L_0x0131
            java.util.ArrayList r5 = X.AnonymousClass7TE.A1C()
            java.util.Iterator r13 = r2.iterator()
        L_0x0084:
            boolean r2 = r13.hasNext()
            if (r2 == 0) goto L_0x0124
            X.3lr r11 = X.C41845B3m.A0V(r13)
            java.lang.String r2 = "name"
            java.lang.String r15 = r11.getRequiredStringField(r7, r2)
            X.0qQ.A07(r15)
            java.lang.String r2 = "persona_id"
            java.lang.String r16 = r11.getRequiredStringField(r1, r2)
            X.0qQ.A07(r16)
            r3 = 2
            java.lang.String r2 = "profile_image_url"
            java.lang.String r17 = r11.getRequiredStringField(r3, r2)
            X.0qQ.A07(r17)
            java.lang.Class<X.BuW> r10 = X.C43208BuW.class
            r9 = 3
            java.lang.String r8 = "ig_messaging_data"
            r3 = -1962092555(0xffffffff8b0cd7f5, float:-2.7125487E-32)
            X.3lr r12 = r11.getRequiredTreeField(r9, r8, r10, r3)
            java.lang.String r2 = "bot_id"
            java.lang.String r18 = r12.getRequiredStringField(r7, r2)
            if (r18 == 0) goto L_0x0084
            X.3lr r3 = r11.getRequiredTreeField(r9, r8, r10, r3)
            java.lang.String r2 = "thread_id"
            java.lang.String r19 = r3.getOptionalStringField(r1, r2)
            com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel r14 = new com.instagram.aistudio.profile.model.AiStudioProfileBannerPersonaModel
            r14.<init>(r15, r16, r17, r18, r19)
            r5.add(r14)
            goto L_0x0084
        L_0x00d1:
            X.0eS.A00(r7)
            X.7I6 r2 = r5.A00
            r6 = 398470550(0x17c02d96, float:1.2419217E-24)
            X.02m r2 = r2.A06
            r2.markerStart(r6)
            r15 = 0
            X.2IS r8 = X.C41845B3m.A04()
            X.2IS r7 = X.C41845B3m.A04()
            java.lang.String r6 = r0.A00
            java.lang.String r2 = "user_id"
            boolean r2 = X.C41848B3p.A1Z(r8, r2, r6)
            X.1vR r9 = X.C41845B3m.A06(r2)
            java.util.Map r11 = r8.getParamsCopy()
            java.util.Map r12 = r7.getParamsCopy()
            java.lang.Class<X.Bub> r13 = X.C43213Bub.class
            java.util.ArrayList r19 = X.AnonymousClass7TE.A1C()
            java.lang.String r10 = "AiStudioUserBannerInfo"
            r14 = 0
            java.lang.String r18 = "xdt_users__info"
            com.facebook.pando.PandoGraphQLRequest r8 = new com.facebook.pando.PandoGraphQLRequest
            r16 = r14
            r17 = r15
            r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19)
            X.1vn r2 = r5.A01
            X.C66146MDy.A00(r5, r0, r4, r1)
            java.lang.Object r7 = r2.A04(r8, r4)
            if (r7 == r3) goto L_0x018f
            r4 = r5
            goto L_0x0032
        L_0x011d:
            X.MDy r4 = new X.MDy
            r4.<init>(r5, r7, r6)
            goto L_0x001c
        L_0x0124:
            java.lang.String r0 = r0.A00
            com.instagram.aistudio.profile.model.AiStudioProfileBannerModel r8 = new com.instagram.aistudio.profile.model.AiStudioProfileBannerModel
            r8.<init>(r0, r5)
            goto L_0x0132
        L_0x012c:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0x()
            throw r0
        L_0x0131:
            r8 = r6
        L_0x0132:
            X.7I6 r2 = r4.A00
            java.lang.Integer r7 = X.AnonymousClass05K.A00
            if (r8 == 0) goto L_0x019d
            java.util.List r0 = r8.A00
            if (r0 == 0) goto L_0x019d
            int r0 = r0.size()
        L_0x0140:
            java.lang.String r5 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_of_banner"
            r3 = 398470550(0x17c02d96, float:1.2419217E-24)
            X.02m r2 = r2.A06
            r2.markerAnnotate(r3, r0, r5)
            short r0 = X.JVT.A00(r7)
            r2.markerEnd(r3, r0)
            if (r8 == 0) goto L_0x0198
            X.3Ih r3 = X.C41845B3m.A0d(r8)
        L_0x015b:
            boolean r0 = r3 instanceof X.C239793Ih
            if (r0 != 0) goto L_0x018f
            boolean r0 = r3 instanceof X.C297815sO
            if (r0 == 0) goto L_0x019f
            X.7I6 r2 = r4.A00
            java.lang.Integer r5 = X.AnonymousClass05K.A01
            r0 = 0
            java.lang.String r4 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "num_of_banner"
            r3 = 398470550(0x17c02d96, float:1.2419217E-24)
            X.02m r2 = r2.A06
            r2.markerAnnotate(r3, r0, r4)
            short r0 = X.JVT.A00(r5)
            r2.markerEnd(r3, r0)
            r0 = 62
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            X.0qQ.A0B(r0, r1)
            X.O1w r0 = new X.O1w
            r0.<init>()
            X.5sO r3 = X.C41845B3m.A0c(r0)
        L_0x018f:
            return r3
        L_0x0190:
            boolean r0 = r7 instanceof X.C297815sO
            if (r0 == 0) goto L_0x01a4
            X.5sO r7 = (X.C297815sO) r7
            java.lang.Object r6 = r7.A00
        L_0x0198:
            X.5sO r3 = X.C41845B3m.A0c(r6)
            goto L_0x015b
        L_0x019d:
            r0 = 0
            goto L_0x0140
        L_0x019f:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        L_0x01a4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.aistudio.profile.AiStudioProfileBannerDataSource.AXI(X.6zQ, X.4D7):java.lang.Object");
    }

    public AiStudioProfileBannerDataSource(UserSession userSession) {
        this.A01 = 1vm.A01(userSession);
        this.A00 = AnonymousClass7I4.A00(userSession);
    }
}
