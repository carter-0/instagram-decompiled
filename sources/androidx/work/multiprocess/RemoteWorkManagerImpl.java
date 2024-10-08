package androidx.work.multiprocess;

import X.AnonymousClass0fD;
import X.AnonymousClass385;
import X.QGB;
import X.TL7;
import android.content.Context;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;

public final class RemoteWorkManagerImpl extends Binder implements IWorkManagerImpl {
    public static byte[] A01 = new byte[0];
    public final AnonymousClass385 A00;

    public static void A01(IWorkManagerImplCallback iWorkManagerImplCallback, RemoteWorkManagerImpl remoteWorkManagerImpl, ListenableFuture listenableFuture, Executor executor, int i) {
        QGB qgb = new QGB(iWorkManagerImplCallback, remoteWorkManagerImpl, listenableFuture, executor, i);
        qgb.A01.addListener(new TL7(qgb), qgb.A02);
    }

    public RemoteWorkManagerImpl(Context context) {
        this();
        int A03 = AnonymousClass0fD.A03(852259783);
        this.A00 = AnonymousClass385.A00(context);
        AnonymousClass0fD.A0A(175402001, A03);
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [androidx.work.multiprocess.IWorkManagerImplCallback$Stub$Proxy, java.lang.Object, androidx.work.multiprocess.IWorkManagerImplCallback] */
    public static IWorkManagerImplCallback A00(Parcel parcel) {
        IBinder readStrongBinder = parcel.readStrongBinder();
        if (readStrongBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = readStrongBinder.queryLocalInterface(IWorkManagerImplCallback.A00);
        if (queryLocalInterface != null && (queryLocalInterface instanceof IWorkManagerImplCallback)) {
            return (IWorkManagerImplCallback) queryLocalInterface;
        }
        ? obj = new Object();
        int A03 = AnonymousClass0fD.A03(-666504642);
        obj.A00 = readStrongBinder;
        AnonymousClass0fD.A0A(1042408621, A03);
        return obj;
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1226538504, AnonymousClass0fD.A03(-262247747));
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v13, types: [X.39x, com.google.common.util.concurrent.ListenableFuture, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x025f, code lost:
        X.AnonymousClass0fD.A0A(r0, r5);
        r0 = 907321468;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r14, android.os.Parcel r15, android.os.Parcel r16, int r17) {
        /*
            r13 = this;
            r0 = 572054545(0x2218dc11, float:2.0716343E-18)
            int r3 = X.AnonymousClass0fD.A03(r0)
            java.lang.String r1 = androidx.work.multiprocess.IWorkManagerImpl.A00
            r2 = 1
            r4 = r16
            if (r14 < r2) goto L_0x0019
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r14 > r0) goto L_0x0266
            r15.enforceInterface(r1)
            switch(r14) {
                case 1: goto L_0x022b;
                case 2: goto L_0x01f3;
                case 3: goto L_0x01ac;
                case 4: goto L_0x0177;
                case 5: goto L_0x014c;
                case 6: goto L_0x0121;
                case 7: goto L_0x00f4;
                case 8: goto L_0x00bb;
                case 9: goto L_0x006c;
                case 10: goto L_0x0026;
                default: goto L_0x0019;
            }
        L_0x0019:
            r0 = r17
            boolean r1 = super.onTransact(r14, r15, r4, r0)
            r0 = -934836754(0xffffffffc84785ee, float:-204311.72)
            X.AnonymousClass0fD.A0A(r0, r3)
            return r1
        L_0x0026:
            byte[] r1 = r15.createByteArray()
            androidx.work.multiprocess.IWorkManagerImplCallback r8 = A00(r15)
            r0 = 59257112(0x3883118, float:8.004633E-37)
            int r5 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcelable$Creator r0 = androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo.CREATOR     // Catch:{ all -> 0x0063 }
            java.lang.Object r10 = X.S83.A00(r0, r1)     // Catch:{ all -> 0x0063 }
            androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo r10 = (androidx.work.multiprocess.parcelable.ParcelableForegroundRequestInfo) r10     // Catch:{ all -> 0x0063 }
            X.385 r9 = r13.A00     // Catch:{ all -> 0x0063 }
            X.38N r4 = r9.A06     // Catch:{ all -> 0x0063 }
            r0 = r4
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x0063 }
            X.38P r7 = r0.A01     // Catch:{ all -> 0x0063 }
            androidx.work.impl.WorkDatabase r1 = r9.A04     // Catch:{ all -> 0x0063 }
            X.39K r0 = r9.A03     // Catch:{ all -> 0x0063 }
            X.5Fo r6 = new X.5Fo     // Catch:{ all -> 0x0063 }
            r6.<init>(r1, r0, r4)     // Catch:{ all -> 0x0063 }
            android.content.Context r4 = r9.A01     // Catch:{ all -> 0x0063 }
            java.lang.String r0 = r10.A01     // Catch:{ all -> 0x0063 }
            java.util.UUID r1 = java.util.UUID.fromString(r0)     // Catch:{ all -> 0x0063 }
            X.Q4b r0 = r10.A00     // Catch:{ all -> 0x0063 }
            X.39x r1 = r6.EX9(r4, r0, r1)     // Catch:{ all -> 0x0063 }
            r0 = 9
            A01(r8, r13, r1, r7, r0)     // Catch:{ all -> 0x0063 }
            goto L_0x0067
        L_0x0063:
            r0 = move-exception
            X.TL7.A00(r8, r0)
        L_0x0067:
            r0 = -1821671022(0xffffffff936b8192, float:-2.9725053E-27)
            goto L_0x025f
        L_0x006c:
            byte[] r1 = r15.createByteArray()
            androidx.work.multiprocess.IWorkManagerImplCallback r9 = A00(r15)
            r0 = -985354320(0xffffffffc544afb0, float:-3146.9805)
            int r5 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcelable$Creator r0 = androidx.work.multiprocess.parcelable.ParcelableUpdateRequest.CREATOR     // Catch:{ all -> 0x00b2 }
            java.lang.Object r6 = X.S83.A00(r0, r1)     // Catch:{ all -> 0x00b2 }
            androidx.work.multiprocess.parcelable.ParcelableUpdateRequest r6 = (androidx.work.multiprocess.parcelable.ParcelableUpdateRequest) r6     // Catch:{ all -> 0x00b2 }
            X.385 r4 = r13.A00     // Catch:{ all -> 0x00b2 }
            X.38N r1 = r4.A06     // Catch:{ all -> 0x00b2 }
            r0 = r1
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x00b2 }
            X.38P r10 = r0.A01     // Catch:{ all -> 0x00b2 }
            androidx.work.impl.WorkDatabase r0 = r4.A04     // Catch:{ all -> 0x00b2 }
            X.5Fm r8 = new X.5Fm     // Catch:{ all -> 0x00b2 }
            r8.<init>(r0, r1)     // Catch:{ all -> 0x00b2 }
            java.lang.String r0 = r6.A01     // Catch:{ all -> 0x00b2 }
            java.util.UUID r7 = java.util.UUID.fromString(r0)     // Catch:{ all -> 0x00b2 }
            androidx.work.multiprocess.parcelable.ParcelableData r0 = r6.A00     // Catch:{ all -> 0x00b2 }
            X.3tw r6 = r0.A00     // Catch:{ all -> 0x00b2 }
            X.39x r4 = new X.39x     // Catch:{ all -> 0x00b2 }
            r4.<init>()     // Catch:{ all -> 0x00b2 }
            X.38N r1 = r8.A01     // Catch:{ all -> 0x00b2 }
            X.TJR r0 = new X.TJR     // Catch:{ all -> 0x00b2 }
            r0.<init>(r6, r8, r4, r7)     // Catch:{ all -> 0x00b2 }
            r1.ATP(r0)     // Catch:{ all -> 0x00b2 }
            r0 = 8
            A01(r9, r13, r4, r10, r0)     // Catch:{ all -> 0x00b2 }
            goto L_0x00b6
        L_0x00b2:
            r0 = move-exception
            X.TL7.A00(r9, r0)
        L_0x00b6:
            r0 = -736267194(0xffffffffd41d7446, float:-2.70504244E12)
            goto L_0x025f
        L_0x00bb:
            byte[] r1 = r15.createByteArray()
            androidx.work.multiprocess.IWorkManagerImplCallback r7 = A00(r15)
            r0 = 2047636478(0x7a0c73fe, float:1.8231854E35)
            int r5 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcelable$Creator r0 = androidx.work.multiprocess.parcelable.ParcelableWorkQuery.CREATOR     // Catch:{ all -> 0x00eb }
            java.lang.Object r1 = X.S83.A00(r0, r1)     // Catch:{ all -> 0x00eb }
            androidx.work.multiprocess.parcelable.ParcelableWorkQuery r1 = (androidx.work.multiprocess.parcelable.ParcelableWorkQuery) r1     // Catch:{ all -> 0x00eb }
            X.385 r6 = r13.A00     // Catch:{ all -> 0x00eb }
            X.38N r0 = r6.A06     // Catch:{ all -> 0x00eb }
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x00eb }
            X.38P r4 = r0.A01     // Catch:{ all -> 0x00eb }
            X.39u r1 = r1.A00     // Catch:{ all -> 0x00eb }
            X.39v r0 = new X.39v     // Catch:{ all -> 0x00eb }
            r0.<init>(r1, r6)     // Catch:{ all -> 0x00eb }
            r4.execute(r0)     // Catch:{ all -> 0x00eb }
            X.39x r1 = r0.A00     // Catch:{ all -> 0x00eb }
            r0 = 7
            A01(r7, r13, r1, r4, r0)     // Catch:{ all -> 0x00eb }
            goto L_0x00ef
        L_0x00eb:
            r0 = move-exception
            X.TL7.A00(r7, r0)
        L_0x00ef:
            r0 = 971786478(0x39ec48ee, float:4.5067765E-4)
            goto L_0x025f
        L_0x00f4:
            androidx.work.multiprocess.IWorkManagerImplCallback r6 = A00(r15)
            r0 = 1923938867(0x72acfa33, float:6.8523384E30)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.385 r1 = r13.A00     // Catch:{ all -> 0x0118 }
            X.QG5 r0 = new X.QG5     // Catch:{ all -> 0x0118 }
            r0.<init>(r1)     // Catch:{ all -> 0x0118 }
            X.38N r1 = r1.A06     // Catch:{ all -> 0x0118 }
            r1.ATP(r0)     // Catch:{ all -> 0x0118 }
            X.9Ep r0 = r0.A00     // Catch:{ all -> 0x0118 }
            X.38M r1 = (X.AnonymousClass38M) r1     // Catch:{ all -> 0x0118 }
            X.38P r4 = r1.A01     // Catch:{ all -> 0x0118 }
            X.39x r1 = r0.A00     // Catch:{ all -> 0x0118 }
            r0 = 6
            A01(r6, r13, r1, r4, r0)     // Catch:{ all -> 0x0118 }
            goto L_0x011c
        L_0x0118:
            r0 = move-exception
            X.TL7.A00(r6, r0)
        L_0x011c:
            r0 = -1294887380(0xffffffffb2d1962c, float:-2.4399093E-8)
            goto L_0x025f
        L_0x0121:
            java.lang.String r1 = r15.readString()
            androidx.work.multiprocess.IWorkManagerImplCallback r6 = A00(r15)
            r0 = 1165872815(0x457dceaf, float:4060.9177)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.385 r0 = r13.A00     // Catch:{ all -> 0x0143 }
            X.9Ep r1 = r0.A05(r1)     // Catch:{ all -> 0x0143 }
            X.38N r0 = r0.A06     // Catch:{ all -> 0x0143 }
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x0143 }
            X.38P r4 = r0.A01     // Catch:{ all -> 0x0143 }
            X.39x r1 = r1.A00     // Catch:{ all -> 0x0143 }
            r0 = 5
            A01(r6, r13, r1, r4, r0)     // Catch:{ all -> 0x0143 }
            goto L_0x0147
        L_0x0143:
            r0 = move-exception
            X.TL7.A00(r6, r0)
        L_0x0147:
            r0 = -1230561332(0xffffffffb6a71fcc, float:-4.9806895E-6)
            goto L_0x025f
        L_0x014c:
            java.lang.String r1 = r15.readString()
            androidx.work.multiprocess.IWorkManagerImplCallback r6 = A00(r15)
            r0 = -588027378(0xffffffffdcf36a0e, float:-5.48120222E17)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.385 r0 = r13.A00     // Catch:{ all -> 0x016e }
            X.9Ep r1 = r0.A04(r1)     // Catch:{ all -> 0x016e }
            X.38N r0 = r0.A06     // Catch:{ all -> 0x016e }
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x016e }
            X.38P r4 = r0.A01     // Catch:{ all -> 0x016e }
            X.39x r1 = r1.A00     // Catch:{ all -> 0x016e }
            r0 = 4
            A01(r6, r13, r1, r4, r0)     // Catch:{ all -> 0x016e }
            goto L_0x0172
        L_0x016e:
            r0 = move-exception
            X.TL7.A00(r6, r0)
        L_0x0172:
            r0 = 1489095335(0x58c1caa7, float:1.70460903E15)
            goto L_0x025f
        L_0x0177:
            java.lang.String r1 = r15.readString()
            androidx.work.multiprocess.IWorkManagerImplCallback r6 = A00(r15)
            r0 = 809952806(0x3046e626, float:7.235904E-10)
            int r5 = X.AnonymousClass0fD.A03(r0)
            X.385 r4 = r13.A00     // Catch:{ all -> 0x01a3 }
            java.util.UUID r1 = java.util.UUID.fromString(r1)     // Catch:{ all -> 0x01a3 }
            X.QG6 r0 = new X.QG6     // Catch:{ all -> 0x01a3 }
            r0.<init>(r4, r1)     // Catch:{ all -> 0x01a3 }
            X.38N r1 = r4.A06     // Catch:{ all -> 0x01a3 }
            r1.ATP(r0)     // Catch:{ all -> 0x01a3 }
            X.9Ep r0 = r0.A00     // Catch:{ all -> 0x01a3 }
            X.38M r1 = (X.AnonymousClass38M) r1     // Catch:{ all -> 0x01a3 }
            X.38P r4 = r1.A01     // Catch:{ all -> 0x01a3 }
            X.39x r1 = r0.A00     // Catch:{ all -> 0x01a3 }
            r0 = 3
            A01(r6, r13, r1, r4, r0)     // Catch:{ all -> 0x01a3 }
            goto L_0x01a7
        L_0x01a3:
            r0 = move-exception
            X.TL7.A00(r6, r0)
        L_0x01a7:
            r0 = -603946782(0xffffffffdc0080e2, float:-1.44682021E17)
            goto L_0x025f
        L_0x01ac:
            byte[] r1 = r15.createByteArray()
            androidx.work.multiprocess.IWorkManagerImplCallback r6 = A00(r15)
            r0 = -1663680490(0xffffffff9cd64016, float:-1.4177898E-21)
            int r5 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcelable$Creator r0 = androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl.CREATOR     // Catch:{ all -> 0x01eb }
            java.lang.Object r0 = X.S83.A00(r0, r1)     // Catch:{ all -> 0x01eb }
            androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl r0 = (androidx.work.multiprocess.parcelable.ParcelableWorkContinuationImpl) r0     // Catch:{ all -> 0x01eb }
            X.385 r8 = r13.A00     // Catch:{ all -> 0x01eb }
            X.SF3 r0 = r0.A00     // Catch:{ all -> 0x01eb }
            java.lang.String r10 = r0.A02     // Catch:{ all -> 0x01eb }
            java.lang.Integer r9 = r0.A01     // Catch:{ all -> 0x01eb }
            java.util.List r11 = r0.A03     // Catch:{ all -> 0x01eb }
            java.util.List r0 = r0.A00     // Catch:{ all -> 0x01eb }
            java.util.ArrayList r12 = X.SF3.A00(r8, r0)     // Catch:{ all -> 0x01eb }
            X.SSM r7 = new X.SSM     // Catch:{ all -> 0x01eb }
            r7.<init>(r8, r9, r10, r11, r12)     // Catch:{ all -> 0x01eb }
            X.9Eq r1 = r7.A02()     // Catch:{ all -> 0x01eb }
            X.38N r0 = r8.A06     // Catch:{ all -> 0x01eb }
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x01eb }
            X.38P r4 = r0.A01     // Catch:{ all -> 0x01eb }
            X.9Ep r1 = (X.C375679Ep) r1     // Catch:{ all -> 0x01eb }
            X.39x r1 = r1.A00     // Catch:{ all -> 0x01eb }
            r0 = 2
            A01(r6, r13, r1, r4, r0)     // Catch:{ all -> 0x01eb }
            goto L_0x01ef
        L_0x01eb:
            r0 = move-exception
            X.TL7.A00(r6, r0)
        L_0x01ef:
            r0 = 1702885766(0x657ff986, float:7.5550397E22)
            goto L_0x025f
        L_0x01f3:
            java.lang.String r4 = r15.readString()
            byte[] r1 = r15.createByteArray()
            androidx.work.multiprocess.IWorkManagerImplCallback r6 = A00(r15)
            r0 = -1192952002(0xffffffffb8e4ff3e, float:-1.091943E-4)
            int r5 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcelable$Creator r0 = androidx.work.multiprocess.parcelable.ParcelableWorkRequest.CREATOR     // Catch:{ all -> 0x0223 }
            java.lang.Object r0 = X.S83.A00(r0, r1)     // Catch:{ all -> 0x0223 }
            androidx.work.multiprocess.parcelable.ParcelableWorkRequest r0 = (androidx.work.multiprocess.parcelable.ParcelableWorkRequest) r0     // Catch:{ all -> 0x0223 }
            X.9En r1 = r0.A00     // Catch:{ all -> 0x0223 }
            X.385 r0 = r13.A00     // Catch:{ all -> 0x0223 }
            X.9Ep r1 = X.C375669Eo.A00(r1, r0, r4)     // Catch:{ all -> 0x0223 }
            X.38N r0 = r0.A06     // Catch:{ all -> 0x0223 }
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x0223 }
            X.38P r4 = r0.A01     // Catch:{ all -> 0x0223 }
            X.39x r1 = r1.A00     // Catch:{ all -> 0x0223 }
            r0 = 0
            A01(r6, r13, r1, r4, r0)     // Catch:{ all -> 0x0223 }
            goto L_0x0227
        L_0x0223:
            r0 = move-exception
            X.TL7.A00(r6, r0)
        L_0x0227:
            r0 = -2095991627(0xffffffff8311b4b5, float:-4.281911E-37)
            goto L_0x025f
        L_0x022b:
            byte[] r1 = r15.createByteArray()
            androidx.work.multiprocess.IWorkManagerImplCallback r6 = A00(r15)
            r0 = -1283788850(0xffffffffb37aefce, float:-5.8425762E-8)
            int r5 = X.AnonymousClass0fD.A03(r0)
            android.os.Parcelable$Creator r0 = androidx.work.multiprocess.parcelable.ParcelableWorkRequests.CREATOR     // Catch:{ all -> 0x0258 }
            java.lang.Object r0 = X.S83.A00(r0, r1)     // Catch:{ all -> 0x0258 }
            androidx.work.multiprocess.parcelable.ParcelableWorkRequests r0 = (androidx.work.multiprocess.parcelable.ParcelableWorkRequests) r0     // Catch:{ all -> 0x0258 }
            java.util.List r1 = r0.A00     // Catch:{ all -> 0x0258 }
            X.385 r0 = r13.A00     // Catch:{ all -> 0x0258 }
            X.9Eq r4 = r0.A03(r1)     // Catch:{ all -> 0x0258 }
            X.38N r0 = r0.A06     // Catch:{ all -> 0x0258 }
            X.38M r0 = (X.AnonymousClass38M) r0     // Catch:{ all -> 0x0258 }
            X.38P r1 = r0.A01     // Catch:{ all -> 0x0258 }
            X.9Ep r4 = (X.C375679Ep) r4     // Catch:{ all -> 0x0258 }
            X.39x r0 = r4.A00     // Catch:{ all -> 0x0258 }
            A01(r6, r13, r0, r1, r2)     // Catch:{ all -> 0x0258 }
            goto L_0x025c
        L_0x0258:
            r0 = move-exception
            X.TL7.A00(r6, r0)
        L_0x025c:
            r0 = -913617087(0xffffffffc98b4f41, float:-1141224.1)
        L_0x025f:
            X.AnonymousClass0fD.A0A(r0, r5)
            r0 = 907321468(0x3614a07c, float:2.2147133E-6)
            goto L_0x0271
        L_0x0266:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r14 != r0) goto L_0x0019
            r4.writeString(r1)
            r0 = -365631064(0xffffffffea34e9a8, float:-5.4677514E25)
        L_0x0271:
            X.AnonymousClass0fD.A0A(r0, r3)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.RemoteWorkManagerImpl.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public RemoteWorkManagerImpl() {
        int A03 = AnonymousClass0fD.A03(-380799638);
        attachInterface(this, IWorkManagerImpl.A00);
        AnonymousClass0fD.A0A(-292431358, A03);
    }
}
