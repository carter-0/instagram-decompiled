package com.instagram.repository.user;

import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C323066wt;
import X.C60340gF;
import X.Dd7;
import X.G5K;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.repository.user.UserRepository$fetchUserInfoUsingReactiveStream$1", f = "UserRepository.kt", i = {1}, l = {323, 356}, m = "invokeSuspend", n = {"fetchedUserDetail"}, s = {"L$0"})
public final class UserRepository$fetchUserInfoUsingReactiveStream$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public Object A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C323066wt A03;
    public final /* synthetic */ Dd7 A04;
    public final /* synthetic */ G5K A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UserRepository$fetchUserInfoUsingReactiveStream$1(C323066wt r2, Dd7 dd7, G5K g5k, String str, String str2, AnonymousClass4D7 r7, int i, boolean z) {
        super(2, r7);
        this.A04 = dd7;
        this.A05 = g5k;
        this.A07 = str;
        this.A06 = str2;
        this.A02 = i;
        this.A03 = r2;
        this.A08 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.repository.user.UserRepository$fetchUserInfoUsingReactiveStream$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        return new UserRepository$fetchUserInfoUsingReactiveStream$1(this.A03, this.A04, this.A05, this.A07, this.A06, r11, this.A02, this.A08);
    }

    /* JADX WARNING: type inference failed for: r12v0, types: [com.instagram.repository.user.UserRepository$fetchUserInfoUsingReactiveStream$1, X.4D7] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0062  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x009b A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x00ae  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            r21 = this;
            r9 = r22
            X.1Hj r1 = X.1Hj.A02
            r12 = r21
            int r2 = r12.A00
            r0 = 2
            r6 = 1
            if (r2 == 0) goto L_0x002d
            if (r2 == r6) goto L_0x0049
            java.lang.Object r13 = r12.A01
            X.Euu r13 = (X.C49392Euu) r13
            X.0eS.A00(r9)
        L_0x0015:
            boolean r0 = r13 instanceof X.EQI
            if (r0 == 0) goto L_0x002a
            X.Dd7 r0 = r12.A04
            X.5CJ r2 = r0.A03
            com.instagram.user.model.User r0 = r13.A00
            java.lang.String r1 = r0.getId()
            X.16V r0 = r0.A0J()
            r2.ENY(r0, r1)
        L_0x002a:
            X.0gF r1 = X.C60340gF.A00
            return r1
        L_0x002d:
            X.0eS.A00(r9)
            X.Dd7 r2 = r12.A04
            com.instagram.repository.user.UserNetworkDataSource r7 = r2.A02
            X.G5K r9 = r12.A05
            java.lang.String r10 = r12.A07
            java.lang.String r11 = r12.A06
            int r13 = r12.A02
            X.6wt r8 = r12.A03
            boolean r14 = r12.A08
            r12.A00 = r6
            java.lang.Object r9 = r7.A01(r8, r9, r10, r11, r12, r13, r14)
            if (r9 != r1) goto L_0x004c
            return r1
        L_0x0049:
            X.0eS.A00(r9)
        L_0x004c:
            X.3Ii r9 = (X.C239803Ii) r9
            X.Dd7 r4 = r12.A04
            X.02m r8 = r4.A00
            r7 = 31784979(0x1e50013, float:8.412142E-38)
            int r5 = r12.A02
            java.lang.String r3 = "profile_info_data_source"
            java.lang.String r2 = "reactive_stream_network"
            r8.markerAnnotate(r7, r5, r3, r2)
            boolean r2 = r9 instanceof X.C239793Ih
            if (r2 == 0) goto L_0x00ae
            X.3Ih r9 = (X.C239793Ih) r9
            java.lang.Object r7 = r9.A00
            X.92k r7 = (X.C3727892k) r7
            com.instagram.user.model.User r16 = X.C324696zk.A00(r7)
            if (r16 == 0) goto L_0x009c
            X.6wt r5 = r12.A03
            java.lang.String r17 = X.C324696zk.A01(r7)
            long r2 = r7.mServerElapsedTime
            boolean r20 = r7.CPt()
            X.6zl r15 = r5.A00()
            java.lang.Object r5 = r7.FH3()
            X.5uH r5 = (X.C298935uH) r5
            X.9El r14 = r5.BkJ()
            X.EQI r13 = new X.EQI
            r18 = r2
            r13.<init>(r14, r15, r16, r17, r18, r20)
        L_0x008f:
            X.0V2 r2 = r4.A04
            r12.A01 = r13
            r12.A00 = r0
            java.lang.Object r0 = r2.emit(r13, r12)
            if (r0 != r1) goto L_0x0015
            return r1
        L_0x009c:
            X.G5K r2 = r12.A05
            com.instagram.user.model.User r5 = X.Dd7.A00(r2)
            r3 = 0
            X.Ewu r2 = new X.Ewu
            r2.<init>(r3, r6)
            X.EQH r13 = new X.EQH
            r13.<init>(r2, r5)
            goto L_0x008f
        L_0x00ae:
            boolean r2 = r9 instanceof X.C297815sO
            if (r2 == 0) goto L_0x00c4
            X.G5K r2 = r12.A05
            com.instagram.user.model.User r3 = X.Dd7.A00(r2)
            X.5sO r9 = (X.C297815sO) r9
            java.lang.Object r2 = r9.A00
            X.Ewu r2 = (X.C49515Ewu) r2
            X.EQH r13 = new X.EQH
            r13.<init>(r2, r3)
            goto L_0x008f
        L_0x00c4:
            X.Wub r0 = X.AnonymousClass7TE.A1K()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.repository.user.UserRepository$fetchUserInfoUsingReactiveStream$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((UserRepository$fetchUserInfoUsingReactiveStream$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
