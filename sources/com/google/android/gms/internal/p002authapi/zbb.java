package com.google.android.gms.internal.p002authapi;

import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;

/* renamed from: com.google.android.gms.internal.auth-api.zbb  reason: invalid package */
public abstract class zbb extends Binder implements IInterface {
    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1375053497, AnonymousClass0fD.A03(1901617163));
        return this;
    }

    public zbb(String str) {
        int A03 = AnonymousClass0fD.A03(-288759801);
        attachInterface(this, str);
        AnonymousClass0fD.A0A(-1964760975, A03);
    }

    /* JADX WARNING: type inference failed for: r5v5, types: [X.63P, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v37, types: [X.QpO, X.63E] */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x02be, code lost:
        X.AnonymousClass0fD.A0A(r0, r2);
        r15.writeNoException();
        r2 = true;
        r0 = 1282656160;
     */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x008b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r13, android.os.Parcel r14, android.os.Parcel r15, int r16) {
        /*
            r12 = this;
            r0 = -1821738767(0xffffffff936a78f1, float:-2.9594581E-27)
            int r4 = X.AnonymousClass0fD.A03(r0)
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r13 <= r0) goto L_0x001c
            r0 = r16
            boolean r0 = super.onTransact(r13, r14, r15, r0)
            if (r0 == 0) goto L_0x001f
            r2 = 1
            r0 = -1380969112(0xffffffffadb01568, float:-2.001839E-11)
        L_0x0018:
            X.AnonymousClass0fD.A0A(r0, r4)
            return r2
        L_0x001c:
            X.Pxf.A14(r12, r14)
        L_0x001f:
            r5 = r12
            boolean r0 = r12 instanceof com.google.android.gms.internal.p002authapi.zbr
            if (r0 == 0) goto L_0x008b
            com.google.android.gms.internal.auth-api.zbr r5 = (com.google.android.gms.internal.p002authapi.zbr) r5
            r0 = -481026318(0xffffffffe3541ef2, float:-3.9129396E21)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r0 = 1
            if (r13 == r0) goto L_0x0050
            r0 = 2
            if (r13 == r0) goto L_0x0041
            r0 = 3
            if (r13 == r0) goto L_0x02ca
            r0 = -327185802(0xffffffffec7f8a76, float:-1.2357198E27)
            X.AnonymousClass0fD.A0A(r0, r6)
            r2 = 0
        L_0x003d:
            r0 = 1020434458(0x3cd2981a, float:0.025707293)
            goto L_0x0018
        L_0x0041:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r0 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.common.api.Status r0 = (com.google.android.gms.common.api.Status) r0
            X.SMU.A00(r14)
            r5.FOh(r0)
            goto L_0x0080
        L_0x0050:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.credentials.Credential.CREATOR
            android.os.Parcelable r3 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.auth.api.credentials.Credential r3 = (com.google.android.gms.auth.api.credentials.Credential) r3
            X.SMU.A00(r14)
            boolean r0 = r5 instanceof com.google.android.gms.internal.p002authapi.zbf
            if (r0 == 0) goto L_0x031e
            com.google.android.gms.internal.auth-api.zbf r5 = (com.google.android.gms.internal.p002authapi.zbf) r5
            r0 = 1695798971(0x6513d6bb, float:4.363431E22)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.Qto r1 = r5.A00
            X.FSu r0 = new X.FSu
            r0.<init>(r3, r7)
            r1.A06(r0)
            r0 = -2089579501(0xffffffff83738c13, float:-7.157208E-37)
            X.AnonymousClass0fD.A0A(r0, r2)
        L_0x0080:
            r15.writeNoException()
            r0 = -320535190(0xffffffffece5056a, float:-2.2149566E27)
            X.AnonymousClass0fD.A0A(r0, r6)
            r2 = 1
            goto L_0x003d
        L_0x008b:
            boolean r0 = r12 instanceof com.google.android.gms.internal.p002authapi.zbbe
            if (r0 == 0) goto L_0x00cb
            com.google.android.gms.internal.auth-api.zbbe r5 = (com.google.android.gms.internal.p002authapi.zbbe) r5
            r0 = 658063777(0x273941a1, float:2.5709485E-15)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 1
            if (r13 != r2) goto L_0x00c6
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            android.os.Parcelable$Creator r0 = android.app.PendingIntent.CREATOR
            android.os.Parcelable r6 = X.Pxh.A0L(r14, r0)
            X.SMU.A00(r14)
            r0 = -1397707610(0xffffffffacb0aca6, float:-5.0213887E-12)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.8nD r0 = r5.A00
            X.C9697RfF.A00(r7, r0, r6)
            r0 = 1144875443(0x443d69b3, float:757.65155)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1347464988(0xffffffffafaf50e4, float:-3.188979E-10)
        L_0x00c1:
            X.AnonymousClass0fD.A0A(r0, r3)
            goto L_0x003d
        L_0x00c6:
            r2 = 0
            r0 = -2064238166(0xffffffff84f639aa, float:-5.7887278E-36)
            goto L_0x00c1
        L_0x00cb:
            boolean r0 = r12 instanceof com.google.android.gms.internal.p002authapi.zbbc
            if (r0 == 0) goto L_0x0107
            com.google.android.gms.internal.auth-api.zbbc r5 = (com.google.android.gms.internal.p002authapi.zbbc) r5
            r0 = -1053139073(0xffffffffc13a5f7f, float:-11.648314)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 1
            if (r13 != r2) goto L_0x0102
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.identity.BeginSignInResult.CREATOR
            android.os.Parcelable r6 = X.Pxh.A0L(r14, r0)
            X.SMU.A00(r14)
            r0 = -1739888677(0xffffffff984b67db, float:-2.6289569E-24)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.8nD r0 = r5.A00
            X.C9697RfF.A00(r7, r0, r6)
            r0 = -795672994(0xffffffffd092fe5e, float:-1.972915E10)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = 588549441(0x23148d41, float:8.053008E-18)
            goto L_0x00c1
        L_0x0102:
            r2 = 0
            r0 = 1433290209(0x556e45e1, float:1.63739934E13)
            goto L_0x00c1
        L_0x0107:
            boolean r0 = r12 instanceof com.google.android.gms.internal.p002authapi.zbav
            if (r0 == 0) goto L_0x0144
            com.google.android.gms.internal.auth-api.zbav r5 = (com.google.android.gms.internal.p002authapi.zbav) r5
            r0 = -105227220(0xfffffffff9ba5c2c, float:-1.2095459E35)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 1
            if (r13 != r2) goto L_0x013e
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.identity.SavePasswordResult.CREATOR
            android.os.Parcelable r6 = X.Pxh.A0L(r14, r0)
            X.SMU.A00(r14)
            r0 = 1307021760(0x4de791c0, float:4.85636096E8)
            int r1 = X.AnonymousClass0fD.A03(r0)
            X.8nD r0 = r5.A00
            X.C9697RfF.A00(r7, r0, r6)
            r0 = 1044939695(0x3e4883af, float:0.19581483)
            X.AnonymousClass0fD.A0A(r0, r1)
            r0 = -1878995898(0xffffffff9000cc46, float:-2.5400915E-29)
            goto L_0x00c1
        L_0x013e:
            r2 = 0
            r0 = -283376372(0xffffffffef1c050c, float:-4.8285763E28)
            goto L_0x00c1
        L_0x0144:
            boolean r0 = r12 instanceof com.google.android.gms.internal.p002authapi.zbap
            if (r0 == 0) goto L_0x0193
            com.google.android.gms.internal.auth-api.zbap r5 = (com.google.android.gms.internal.p002authapi.zbap) r5
            r0 = 1413163608(0x543b2a58, float:3.21547718E12)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 1
            if (r13 != r2) goto L_0x018d
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r7 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.common.api.Status r7 = (com.google.android.gms.common.api.Status) r7
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.identity.AuthorizationResult.CREATOR
            android.os.Parcelable r1 = X.Pxh.A0L(r14, r0)
            X.SMU.A00(r14)
            r0 = -1143698030(0xffffffffbbd48d92, float:-0.006486603)
            int r6 = X.AnonymousClass0fD.A03(r0)
            int r0 = r7.A00
            if (r0 > 0) goto L_0x0180
            X.8nD r0 = r5.A00
            r0.A01(r1)
            r0 = 348191541(0x14c0fb35, float:1.948613E-26)
        L_0x0178:
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -576073987(0xffffffffdda9cefd, float:-1.52949943E18)
            goto L_0x00c1
        L_0x0180:
            X.8nD r1 = r5.A00
            X.RKT r0 = X.C9698RfG.A00(r7)
            r1.A00(r0)
            r0 = -1340813322(0xffffffffb014cff6, float:-5.4137617E-10)
            goto L_0x0178
        L_0x018d:
            r2 = 0
            r0 = -552336575(0xffffffffdf140341, float:-1.066544E19)
            goto L_0x00c1
        L_0x0193:
            boolean r0 = r12 instanceof com.google.android.gms.auth.api.signin.internal.zbt
            if (r0 == 0) goto L_0x026b
            com.google.android.gms.auth.api.signin.internal.zbt r5 = (com.google.android.gms.auth.api.signin.internal.zbt) r5
            r0 = 972203475(0x39f2a5d3, float:4.6281386E-4)
            int r3 = X.AnonymousClass0fD.A03(r0)
            r2 = 1
            if (r13 == r2) goto L_0x01ac
            r0 = 2
            if (r13 == r0) goto L_0x024d
            r2 = 0
            r0 = 1103574563(0x41c73623, float:24.901434)
            goto L_0x00c1
        L_0x01ac:
            r0 = -1908095713(0xffffffff8e44c51f, float:-2.4253776E-30)
            int r6 = X.AnonymousClass0fD.A03(r0)
            com.google.android.gms.auth.api.signin.internal.zbt.A00(r5)
            android.content.Context r11 = r5.A00
            X.SPD r0 = X.SPD.A00(r11)
            com.google.android.gms.auth.api.signin.GoogleSignInAccount r9 = r0.A01()
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r7 = com.google.android.gms.auth.api.signin.GoogleSignInOptions.A0C
            if (r9 == 0) goto L_0x01c8
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r7 = r0.A02()
        L_0x01c8:
            X.AnonymousClass3Qk.A02(r7)
            X.63K r10 = X.C10136RnD.A05
            X.63O r5 = new X.63O
            r5.<init>()
            android.os.Looper r0 = android.os.Looper.getMainLooper()
            r8 = 0
            X.63N r1 = new X.63N
            r1.<init>(r0, r5)
            X.QpO r0 = new X.QpO
            r0.<init>((android.content.Context) r11, (X.AnonymousClass63L) r7, (X.AnonymousClass63K) r10, (X.AnonymousClass63N) r1)
            if (r9 == 0) goto L_0x0246
            X.63S r9 = r0.A05
            android.content.Context r11 = r0.A01
            int r1 = X.C8366QpO.A02(r0)
            r0 = 3
            boolean r7 = X.AnonymousClass7TF.A1S(r1, r0)
            X.S22 r0 = X.SQR.A00
            X.SPD r1 = X.SPD.A00(r11)
            java.lang.String r0 = "refreshToken"
            java.lang.String r5 = r1.A03(r0)
            X.SQR.A02(r11)
            if (r7 == 0) goto L_0x023c
            X.S22 r0 = X.TL1.A02
            if (r5 != 0) goto L_0x022c
            r0 = 4
            com.google.android.gms.common.api.Status r5 = new com.google.android.gms.common.api.Status
            r5.<init>(r0, r8)
            com.google.android.gms.common.api.Status r0 = r5.BzI()
            int r0 = r0.A00
            boolean r0 = X.Dba.A1U(r0)
            r1 = r0 ^ 1
            java.lang.String r0 = "Status code must not be SUCCESS"
            X.AnonymousClass3Qk.A08(r1, r0)
            X.Qpa r0 = new X.Qpa
            r0.<init>(r5)
            r0.A06(r5)
        L_0x0225:
            X.SMT.A00(r0)
            r0 = 659214002(0x274aceb2, float:2.8145181E-15)
            goto L_0x0263
        L_0x022c:
            X.TL1 r1 = new X.TL1
            r1.<init>(r5)
            java.lang.Thread r0 = new java.lang.Thread
            r0.<init>(r1)
            r0.start()
            X.QpZ r0 = r1.A00
            goto L_0x0225
        L_0x023c:
            X.Qov r0 = new X.Qov
            r0.<init>(r10, r9)
            X.Qts r0 = r9.A07(r0)
            goto L_0x0225
        L_0x0246:
            r0.A03()
            r0 = 1456626855(0x56d25ca7, float:1.1564769E14)
            goto L_0x0263
        L_0x024d:
            r0 = -1912087391(0xffffffff8e07dca1, float:-1.6746264E-30)
            int r6 = X.AnonymousClass0fD.A03(r0)
            com.google.android.gms.auth.api.signin.internal.zbt.A00(r5)
            android.content.Context r0 = r5.A00
            X.SHF r0 = X.SHF.A00(r0)
            r0.A01()
            r0 = -387719590(0xffffffffe8e3de5a, float:-8.608631E24)
        L_0x0263:
            X.AnonymousClass0fD.A0A(r0, r6)
            r0 = -711435128(0xffffffffd5985c88, float:-2.09403983E13)
            goto L_0x00c1
        L_0x026b:
            com.google.android.gms.auth.api.signin.internal.zbq r5 = (com.google.android.gms.auth.api.signin.internal.zbq) r5
            r0 = 1245419149(0x4a3b968d, float:3073443.2)
            int r3 = X.AnonymousClass0fD.A03(r0)
            switch(r13) {
                case 101: goto L_0x02e4;
                case 102: goto L_0x027d;
                case 103: goto L_0x029e;
                default: goto L_0x0277;
            }
        L_0x0277:
            r2 = 0
            r0 = 69625722(0x426677a, float:1.956072E-36)
            goto L_0x00c1
        L_0x027d:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            X.SMU.A00(r14)
            boolean r0 = r5 instanceof com.google.android.gms.auth.api.signin.internal.zbh
            if (r0 == 0) goto L_0x0300
            com.google.android.gms.auth.api.signin.internal.zbh r5 = (com.google.android.gms.auth.api.signin.internal.zbh) r5
            r0 = -503809526(0xffffffffe1f87a0a, float:-5.729483E20)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.Qou r0 = r5.A00
            r0.A06(r1)
            r0 = -1113135254(0xffffffffbda6e76a, float:-0.081496075)
            goto L_0x02be
        L_0x029e:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            android.os.Parcelable r1 = X.Pxh.A0L(r14, r0)
            com.google.android.gms.common.api.Status r1 = (com.google.android.gms.common.api.Status) r1
            X.SMU.A00(r14)
            boolean r0 = r5 instanceof com.google.android.gms.auth.api.signin.internal.zbj
            if (r0 == 0) goto L_0x030f
            com.google.android.gms.auth.api.signin.internal.zbj r5 = (com.google.android.gms.auth.api.signin.internal.zbj) r5
            r0 = 1723800271(0x66bf1acf, float:4.5123326E23)
            int r2 = X.AnonymousClass0fD.A03(r0)
            X.Qov r0 = r5.A00
            r0.A06(r1)
            r0 = 2001136544(0x7746eba0, float:4.0345852E33)
        L_0x02be:
            X.AnonymousClass0fD.A0A(r0, r2)
            r15.writeNoException()
            r2 = 1
            r0 = 1282656160(0x4c73c7a0, float:6.3905408E7)
            goto L_0x00c1
        L_0x02ca:
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r14, r0)
            r14.readString()
            X.SMU.A00(r14)
            r0 = -1337636334(0xffffffffb0454a12, float:-7.177344E-10)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = -947469640(0xffffffffc786c2b8, float:-68997.44)
            goto L_0x032c
        L_0x02e4:
            android.os.Parcelable$Creator r0 = com.google.android.gms.auth.api.signin.GoogleSignInAccount.CREATOR
            X.Pxh.A0L(r14, r0)
            android.os.Parcelable$Creator r0 = com.google.android.gms.common.api.Status.CREATOR
            X.Pxh.A0L(r14, r0)
            X.SMU.A00(r14)
            r0 = 2092295690(0x7cb5e60a, float:7.555772E36)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = -997480892(0xffffffffc48ba644, float:-1117.1958)
            goto L_0x032c
        L_0x0300:
            r0 = 1701392226(0x65692f62, float:6.882409E22)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = 779169576(0x2e712f28, float:5.483894E-11)
            goto L_0x032c
        L_0x030f:
            r0 = 420049894(0x190973e6, float:7.1061395E-24)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = 981600391(0x3a820887, float:9.920754E-4)
            goto L_0x032c
        L_0x031e:
            r0 = 2033397653(0x79332f95, float:5.814914E34)
            int r2 = X.AnonymousClass0fD.A03(r0)
            java.lang.UnsupportedOperationException r1 = X.C66580MXl.A11()
            r0 = 1433453172(0x5570c274, float:1.65448725E13)
        L_0x032c:
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.p002authapi.zbb.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }
}
