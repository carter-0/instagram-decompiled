package X;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: X.Qts  reason: case insensitive filesystem */
public abstract class C8412Qts extends BasePendingResult implements C13468Tav {
    public final AnonymousClass63G A00;
    public final AnonymousClass63K A01;

    /* JADX WARNING: Can't wrap try/catch for region: R(11:19|(4:21|22|23|(1:29))|30|31|(1:33)(1:34)|35|36|37|38|39|40) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:30:0x013f */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0166 A[Catch:{ all -> 0x0199, DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0168 A[Catch:{ all -> 0x0199, DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A09(X.AnonymousClass648 r9) {
        /*
            r8 = this;
            r4 = r8
            boolean r0 = r8 instanceof X.C8411Qtr     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r0 == 0) goto L_0x00aa
            X.Qtr r4 = (X.C8411Qtr) r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.common.internal.BaseGmsClient r9 = (com.google.android.gms.common.internal.BaseGmsClient) r9     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.IInterface r3 = r9.A03()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.auth-api.zbt r3 = (com.google.android.gms.internal.p002authapi.zbt) r3     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            boolean r0 = r4 instanceof X.C8407Qtn     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r0 == 0) goto L_0x0041
            com.google.android.gms.internal.auth-api.zbk r5 = new com.google.android.gms.internal.auth-api.zbk     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r5.<init>(r4)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 446697625(0x1aa01099, float:6.6201264E-23)
            int r4 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 1625149835(0x60ddd18b, float:1.27869675E20)
            int r2 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r1 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            java.lang.String r0 = r3.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r1.writeInterfaceToken(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -135530439(0xfffffffff7ebf839, float:-9.572065E33)
            X.AnonymousClass0fD.A0A(r0, r2)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            X.Pxf.A16(r5, r1)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 4
            r3.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 1009048364(0x3c24db2c, float:0.01006202)
            goto L_0x01f4
        L_0x0041:
            boolean r0 = r4 instanceof X.C8409Qtp     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r0 == 0) goto L_0x0067
            X.Qtp r4 = (X.C8409Qtp) r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.auth-api.zbk r2 = new com.google.android.gms.internal.auth-api.zbk     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.<init>(r4)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.auth.api.credentials.Credential r0 = r4.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.auth-api.zbu r1 = new com.google.android.gms.internal.auth-api.zbu     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r1.<init>(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 273623450(0x104f299a, float:4.08556E-29)
            int r4 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r1 = com.google.android.gms.internal.p002authapi.zba.A00(r2, r1, r3)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 2
            r3.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -821565376(0xffffffffcf07e840, float:-2.2801449E9)
            goto L_0x01f4
        L_0x0067:
            boolean r0 = r4 instanceof X.C8408Qto     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r0 == 0) goto L_0x0088
            X.Qto r4 = (X.C8408Qto) r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.auth-api.zbf r2 = new com.google.android.gms.internal.auth-api.zbf     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.<init>(r4)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.auth.api.credentials.CredentialRequest r1 = r4.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -1184094116(0xffffffffb96c285c, float:-2.2521749E-4)
            int r4 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r1 = com.google.android.gms.internal.p002authapi.zba.A00(r2, r1, r3)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 1
            r3.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 184478729(0xafeec09, float:2.4548097E-32)
            goto L_0x01f4
        L_0x0088:
            X.Qtq r4 = (X.C8410Qtq) r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.auth-api.zbk r2 = new com.google.android.gms.internal.auth-api.zbk     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.<init>(r4)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.auth.api.credentials.Credential r0 = r4.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.auth-api.zbp r1 = new com.google.android.gms.internal.auth-api.zbp     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r1.<init>(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -1558616712(0xffffffffa3196578, float:-8.3156335E-18)
            int r4 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r1 = com.google.android.gms.internal.p002authapi.zba.A00(r2, r1, r3)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 3
            r3.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 273468191(0x104ccb1f, float:4.0388385E-29)
            goto L_0x01f4
        L_0x00aa:
            boolean r0 = r8 instanceof X.C8369QpY     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r0 == 0) goto L_0x0109
            X.QpY r4 = (X.C8369QpY) r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.common.internal.BaseGmsClient r9 = (com.google.android.gms.common.internal.BaseGmsClient) r9     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.location.LocationSettingsRequest r7 = r4.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r6 = 0
            r9.A07()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.location.zzaz r5 = new com.google.android.gms.internal.location.zzaz     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r5.<init>()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -1680838155(0xffffffff9bd071f5, float:-3.4484356E-22)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r5.A00 = r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -1594797497(0xffffffffa0f15247, float:-4.0881435E-19)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.IInterface r3 = r9.A03()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.location.zzal r3 = (com.google.android.gms.internal.location.zzal) r3     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.location.zzb r3 = (com.google.android.gms.internal.location.zzb) r3     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -1136123051(0xffffffffbc482355, float:-0.012215455)
            int r4 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 489795492(0x1d31afa4, float:2.351656E-21)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            java.lang.String r0 = r3.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.writeInterfaceToken(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -1050705418(0xffffffffc15f81f6, float:-13.969229)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r1 = 0
            r0 = 1
            r2.writeInt(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r7.writeToParcel(r2, r1)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            X.Pxf.A16(r5, r2)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.writeString(r6)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 63
            r3.A00(r2, r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -1944852402(0xffffffff8c13e84e, float:-1.1394375E-31)
            goto L_0x01f4
        L_0x0109:
            boolean r0 = r8 instanceof X.C8596Qxa     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r0 == 0) goto L_0x01a7
            X.Qxa r4 = (X.C8596Qxa) r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            X.Qq1 r9 = (X.C8396Qq1) r9     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.safetynet.zzg r7 = r4.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            byte[] r3 = r4.A02     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            java.lang.String r2 = r4.A01     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            boolean r0 = android.text.TextUtils.isEmpty(r2)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r0 == 0) goto L_0x013f
            java.lang.String r5 = "com.google.android.safetynet.ATTEST_API_KEY"
            r2 = 0
            android.content.Context r0 = r9.A00     // Catch:{ NameNotFoundException -> 0x013f }
            android.content.pm.PackageManager r4 = r0.getPackageManager()     // Catch:{ NameNotFoundException -> 0x013f }
            if (r4 == 0) goto L_0x013f
            java.lang.String r1 = r0.getPackageName()     // Catch:{ NameNotFoundException -> 0x013f }
            r0 = 128(0x80, float:1.794E-43)
            android.content.pm.ApplicationInfo r0 = r4.getApplicationInfo(r1, r0)     // Catch:{ NameNotFoundException -> 0x013f }
            if (r0 == 0) goto L_0x013f
            android.os.Bundle r0 = r0.metaData     // Catch:{ NameNotFoundException -> 0x013f }
            if (r0 == 0) goto L_0x013f
            java.lang.Object r0 = r0.get(r5)     // Catch:{ NameNotFoundException -> 0x013f }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ NameNotFoundException -> 0x013f }
            r2 = r0
        L_0x013f:
            android.os.IInterface r6 = r9.A03()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.safetynet.zzi r6 = (com.google.android.gms.internal.safetynet.zzi) r6     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.safetynet.zzj r6 = (com.google.android.gms.internal.safetynet.zzj) r6     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -1812876441(0xffffffff93f1b367, float:-6.1013857E-27)
            int r5 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -2041824502(0xffffffff864c3b0a, float:-3.841151E-35)
            int r1 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r4 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            java.lang.String r0 = "com.google.android.gms.safetynet.internal.ISafetyNetService"
            r4.writeInterfaceToken(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 1015539355(0x3c87e69b, float:0.016589453)
            X.AnonymousClass0fD.A0A(r0, r1)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r7 != 0) goto L_0x0168
            r0 = 0
            goto L_0x016c
        L_0x0168:
            android.os.IBinder r0 = r7.asBinder()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
        L_0x016c:
            r4.writeStrongBinder(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r4.writeByteArray(r3)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r4.writeString(r2)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r1 = 7
            r0 = -303491184(0xffffffffede91790, float:-9.0173116E27)
            int r3 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r2 = android.os.Parcel.obtain()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.IBinder r0 = r6.A00     // Catch:{ all -> 0x0199 }
            X.AnonymousClass7TH.A0N(r0, r4, r2, r1)     // Catch:{ all -> 0x0199 }
            r4.recycle()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.recycle()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -634569487(0xffffffffda2d3cf1, float:-1.21905442E16)
            X.AnonymousClass0fD.A0A(r0, r3)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 656932770(0x2727ffa2, float:2.3314484E-15)
            X.AnonymousClass0fD.A0A(r0, r5)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            return
        L_0x0199:
            r1 = move-exception
            r4.recycle()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.recycle()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 1716373439(0x664dc7bf, float:2.4294245E23)
            X.AnonymousClass0fD.A0A(r0, r3)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            throw r1     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
        L_0x01a7:
            boolean r0 = r8 instanceof X.C8342Qov     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            if (r0 == 0) goto L_0x01d0
            X.Qov r4 = (X.C8342Qov) r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            X.Qq3 r9 = (X.C8398Qq3) r9     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.IInterface r3 = r9.A03()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.auth-api.zba r3 = (com.google.android.gms.internal.p002authapi.zba) r3     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.auth.api.signin.internal.zbj r2 = new com.google.android.gms.auth.api.signin.internal.zbj     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.<init>(r4)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r9.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -620025741(0xffffffffdb0b2873, float:-3.9169496E16)
            int r4 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r1 = com.google.android.gms.internal.p002authapi.zba.A00(r2, r1, r3)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 103(0x67, float:1.44E-43)
            r3.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = -756663817(0xffffffffd2e639f7, float:-4.94407483E11)
            goto L_0x01f4
        L_0x01d0:
            X.Qou r4 = (X.C8341Qou) r4     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            X.Qq3 r9 = (X.C8398Qq3) r9     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.IInterface r3 = r9.A03()     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.internal.auth-api.zba r3 = (com.google.android.gms.internal.p002authapi.zba) r3     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.auth.api.signin.internal.zbh r2 = new com.google.android.gms.auth.api.signin.internal.zbh     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r2.<init>(r4)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            com.google.android.gms.auth.api.signin.GoogleSignInOptions r1 = r9.A00     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 856895497(0x33133009, float:3.4269792E-8)
            int r4 = X.AnonymousClass0fD.A03(r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            android.os.Parcel r1 = com.google.android.gms.internal.p002authapi.zba.A00(r2, r1, r3)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 102(0x66, float:1.43E-43)
            r3.A01(r1, r0)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            r0 = 1117280424(0x429858a8, float:76.17316)
        L_0x01f4:
            X.AnonymousClass0fD.A0A(r0, r4)     // Catch:{ DeadObjectException -> 0x0209, RemoteException -> 0x01f8 }
            return
        L_0x01f8:
            r0 = move-exception
            java.lang.String r3 = r0.getLocalizedMessage()
            r2 = 0
            r1 = 8
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r2, r3, r1)
            r8.A0A(r0)
            return
        L_0x0209:
            r4 = move-exception
            java.lang.String r3 = r4.getLocalizedMessage()
            r2 = 0
            r1 = 8
            com.google.android.gms.common.api.Status r0 = new com.google.android.gms.common.api.Status
            r0.<init>(r2, r2, r3, r1)
            r8.A0A(r0)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C8412Qts.A09(X.648):void");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C8412Qts(AnonymousClass63K r2, AnonymousClass63S r3) {
        super(r3);
        AnonymousClass3Qk.A03(r3, "GoogleApiClient must not be null");
        AnonymousClass3Qk.A03(r2, "Api must not be null");
        this.A00 = r2.A01;
        this.A01 = r2;
    }

    public final void A0A(Status status) {
        AnonymousClass3Qk.A08(!Dba.A1U(status.A00), "Failed result must not be success");
        A06(A03(status));
    }
}
