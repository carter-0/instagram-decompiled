package com.fbpay.w3c.ipc;

import X.AnonymousClass0fD;
import X.AnonymousClass2E0;
import X.AnonymousClass7TG;
import X.C12990TGx;
import X.C12991TGy;
import X.C12992TGz;
import X.C66308MMr;
import X.C9678Rew;
import X.C9680Rey;
import X.S7C;
import X.SIW;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import com.fbpay.w3c.CardDetails;
import com.fbpay.w3c.FBPaymentService;
import com.fbpay.w3c.FBPaymentServiceAddCardCallback;
import com.fbpay.w3c.FBPaymentServiceAddressCallback;
import com.fbpay.w3c.FBPaymentServiceCardDetailsCallback;
import com.fbpay.w3c.FBPaymentServiceContactCallback;
import com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl;
import java.util.Collections;

public final class BaseFBPaymentServiceImpl$handler$1 extends Binder implements FBPaymentService {
    public final /* synthetic */ FBPaymentServiceImpl A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public BaseFBPaymentServiceImpl$handler$1(FBPaymentServiceImpl fBPaymentServiceImpl) {
        this();
        this.A00 = fBPaymentServiceImpl;
        AnonymousClass0fD.A0A(1046190929, AnonymousClass0fD.A03(1934758393));
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.fbpay.w3c.FBPaymentService$Stub$Proxy, java.lang.Object, com.fbpay.w3c.FBPaymentService] */
    public static FBPaymentService A00(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.fbpay.w3c.FBPaymentService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof FBPaymentService)) {
            return (FBPaymentService) queryLocalInterface;
        }
        ? obj = new Object();
        int A03 = AnonymousClass0fD.A03(1394179736);
        obj.A00 = iBinder;
        AnonymousClass0fD.A0A(1561766818, A03);
        return obj;
    }

    public final void A7m(FBPaymentServiceAddressCallback fBPaymentServiceAddressCallback) {
        int i;
        int A0D = AnonymousClass7TG.A0D(fBPaymentServiceAddressCallback, -883036859);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        SIW siw = fBPaymentServiceImpl.A01;
        if (siw == null || !siw.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceAddressCallback.DvO(Collections.emptyList());
            i = 2117006956;
        } else {
            fBPaymentServiceImpl.A00.post(new C12990TGx(fBPaymentServiceAddressCallback, fBPaymentServiceImpl));
            i = -695082795;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void A80(CardDetails cardDetails, FBPaymentServiceAddCardCallback fBPaymentServiceAddCardCallback) {
        int A03 = AnonymousClass0fD.A03(-1744128742);
        AnonymousClass7TG.A1N(cardDetails, fBPaymentServiceAddCardCallback);
        try {
            C9680Rey.A00(cardDetails);
            AnonymousClass2E0.A0D();
            FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
            S7C s7c = fBPaymentServiceImpl.A02;
            if (s7c != null) {
                C9678Rew.A00(fBPaymentServiceImpl, s7c.A01(cardDetails), new C66308MMr(fBPaymentServiceAddCardCallback, 8));
            }
            AnonymousClass0fD.A0A(1054264253, A03);
        } catch (IllegalArgumentException e) {
            fBPaymentServiceAddCardCallback.onError(e.getMessage());
            AnonymousClass0fD.A0A(304829274, A03);
        }
    }

    public final void A81(FBPaymentServiceCardDetailsCallback fBPaymentServiceCardDetailsCallback) {
        int i;
        int A0D = AnonymousClass7TG.A0D(fBPaymentServiceCardDetailsCallback, 172746894);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        SIW siw = fBPaymentServiceImpl.A01;
        if (siw == null || !siw.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceCardDetailsCallback.DvO(Collections.emptyList());
            i = -1033120705;
        } else {
            fBPaymentServiceImpl.A00.post(new C12991TGy(fBPaymentServiceCardDetailsCallback, fBPaymentServiceImpl));
            i = 2026234444;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void A86(FBPaymentServiceContactCallback fBPaymentServiceContactCallback) {
        int i;
        int A0D = AnonymousClass7TG.A0D(fBPaymentServiceContactCallback, -497492689);
        FBPaymentServiceImpl fBPaymentServiceImpl = this.A00;
        SIW siw = fBPaymentServiceImpl.A01;
        if (siw == null || !siw.A00(fBPaymentServiceImpl)) {
            fBPaymentServiceContactCallback.DvO(Collections.emptyList());
            i = 289163115;
        } else {
            fBPaymentServiceImpl.A00.post(new C12992TGz(fBPaymentServiceContactCallback, fBPaymentServiceImpl));
            i = 1339713357;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-96941445, AnonymousClass0fD.A03(-1508727806));
        return this;
    }

    /* JADX WARNING: type inference failed for: r2v1, types: [com.fbpay.w3c.FBPaymentServiceAddCardCallback$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v6, types: [com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r2v10, types: [java.lang.Object, com.fbpay.w3c.FBPaymentServiceCardDetailsCallback$Stub$Proxy] */
    /* JADX WARNING: type inference failed for: r2v15, types: [java.lang.Object, com.fbpay.w3c.FBPaymentServiceContactCallback$Stub$Proxy] */
    /* JADX WARNING: type inference failed for: r2v20, types: [java.lang.Object, com.fbpay.w3c.FBPaymentServiceAddressCallback$Stub$Proxy] */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x012a, code lost:
        if (r0 != false) goto L_0x00c0;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTransact(int r12, android.os.Parcel r13, android.os.Parcel r14, int r15) {
        /*
            r11 = this;
            r0 = -188823690(0xfffffffff4bec776, float:-1.2092065E32)
            int r5 = X.AnonymousClass0fD.A03(r0)
            r4 = 1
            java.lang.String r1 = "com.fbpay.w3c.FBPaymentService"
            if (r12 < r4) goto L_0x0188
            r0 = 16777215(0xffffff, float:2.3509886E-38)
            if (r12 > r0) goto L_0x017b
            r13.enforceInterface(r1)
            if (r12 == r4) goto L_0x0143
            r0 = 2
            if (r12 == r0) goto L_0x00b5
            r0 = 3
            if (r12 == r0) goto L_0x0086
            r0 = 4
            if (r12 == r0) goto L_0x0057
            r0 = 5
            if (r12 != r0) goto L_0x0188
            android.os.IBinder r3 = r13.readStrongBinder()
            if (r3 != 0) goto L_0x0033
            r2 = 0
        L_0x0029:
            r11.A7m(r2)
        L_0x002c:
            r0 = -742914841(0xffffffffd3b804e7, float:-1.58071246E12)
        L_0x002f:
            X.AnonymousClass0fD.A0A(r0, r5)
            return r4
        L_0x0033:
            java.lang.String r0 = "com.fbpay.w3c.FBPaymentServiceAddressCallback"
            android.os.IInterface r2 = r3.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x0042
            boolean r0 = r2 instanceof com.fbpay.w3c.FBPaymentServiceAddressCallback
            if (r0 == 0) goto L_0x0042
            com.fbpay.w3c.FBPaymentServiceAddressCallback r2 = (com.fbpay.w3c.FBPaymentServiceAddressCallback) r2
            goto L_0x0029
        L_0x0042:
            com.fbpay.w3c.FBPaymentServiceAddressCallback$Stub$Proxy r2 = new com.fbpay.w3c.FBPaymentServiceAddressCallback$Stub$Proxy
            r2.<init>()
            r0 = 79526997(0x4bd7c55, float:4.4547867E-36)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r3
            r0 = 1572529194(0x5dbae42a, float:1.68336687E18)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x0029
        L_0x0057:
            android.os.IBinder r3 = r13.readStrongBinder()
            if (r3 != 0) goto L_0x0062
            r2 = 0
        L_0x005e:
            r11.A86(r2)
            goto L_0x002c
        L_0x0062:
            java.lang.String r0 = "com.fbpay.w3c.FBPaymentServiceContactCallback"
            android.os.IInterface r2 = r3.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x0071
            boolean r0 = r2 instanceof com.fbpay.w3c.FBPaymentServiceContactCallback
            if (r0 == 0) goto L_0x0071
            com.fbpay.w3c.FBPaymentServiceContactCallback r2 = (com.fbpay.w3c.FBPaymentServiceContactCallback) r2
            goto L_0x005e
        L_0x0071:
            com.fbpay.w3c.FBPaymentServiceContactCallback$Stub$Proxy r2 = new com.fbpay.w3c.FBPaymentServiceContactCallback$Stub$Proxy
            r2.<init>()
            r0 = 1476412140(0x580042ec, float:5.6409966E14)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r3
            r0 = 2134730871(0x7f3d6877, float:2.517665E38)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x005e
        L_0x0086:
            android.os.IBinder r3 = r13.readStrongBinder()
            if (r3 != 0) goto L_0x0091
            r2 = 0
        L_0x008d:
            r11.A81(r2)
            goto L_0x002c
        L_0x0091:
            java.lang.String r0 = "com.fbpay.w3c.FBPaymentServiceCardDetailsCallback"
            android.os.IInterface r2 = r3.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x00a0
            boolean r0 = r2 instanceof com.fbpay.w3c.FBPaymentServiceCardDetailsCallback
            if (r0 == 0) goto L_0x00a0
            com.fbpay.w3c.FBPaymentServiceCardDetailsCallback r2 = (com.fbpay.w3c.FBPaymentServiceCardDetailsCallback) r2
            goto L_0x008d
        L_0x00a0:
            com.fbpay.w3c.FBPaymentServiceCardDetailsCallback$Stub$Proxy r2 = new com.fbpay.w3c.FBPaymentServiceCardDetailsCallback$Stub$Proxy
            r2.<init>()
            r0 = 1278052936(0x4c2d8a48, float:4.5492512E7)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r3
            r0 = -1947040576(0xffffffff8bf284c0, float:-9.341475E-32)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x008d
        L_0x00b5:
            java.lang.String r3 = r13.readString()
            android.os.IBinder r6 = r13.readStrongBinder()
            if (r6 != 0) goto L_0x0120
            r2 = 0
        L_0x00c0:
            r0 = 1809951111(0x6be1a987, float:5.4561776E26)
            int r6 = X.AnonymousClass0fD.A03(r0)
            r8 = 0
            X.0qQ.A0B(r3, r8)
            X.0qQ.A0B(r2, r4)
            com.instagram.fbpay.w3c.ipc.FBPaymentServiceImpl r7 = r11.A00
            X.S7C r0 = r7.A02
            if (r0 == 0) goto L_0x0118
            X.0eK r0 = r0.A01
            java.lang.Object r9 = r0.get()
            X.S3M r9 = (X.S3M) r9
            android.util.SparseArray r10 = X.Pxe.A0L()
            r0 = 20
            r10.put(r0, r3)
            X.Rq0 r0 = r9.A05
            java.lang.String r3 = "IAB_AUTOFILL"
            com.instagram.common.session.UserSession r0 = r0.A00
            X.SvH r1 = new X.SvH
            r1.<init>(r0, r3)
            r0 = 0
            X.59x r3 = r1.EE9(r10, r0)
            r0 = 5
            X.MMr r1 = new X.MMr
            r1.<init>(r9, r0)
            r0 = 49
            X.TY2 r1 = X.TY2.A00(r1, r0)
            X.Svc r0 = new X.Svc
            r0.<init>(r3, r1)
            X.0qQ.A0B(r0, r8)
            X.5A6 r3 = new X.5A6
            r3.<init>(r0)
            r1 = 11
            X.MMr r0 = new X.MMr
            r0.<init>(r2, r1)
            X.C9678Rew.A00(r7, r3, r0)
        L_0x0118:
            r0 = -807957548(0xffffffffcfd78bd4, float:-7.2325304E9)
            X.AnonymousClass0fD.A0A(r0, r6)
            goto L_0x002c
        L_0x0120:
            java.lang.String r0 = "com.fbpay.w3c.FBPaymentServiceRemoveCardCallback"
            android.os.IInterface r2 = r6.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x012d
            boolean r0 = r2 instanceof com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy
            if (r0 == 0) goto L_0x012d
            goto L_0x00c0
        L_0x012d:
            com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy r2 = new com.fbpay.w3c.FBPaymentServiceRemoveCardCallback$Stub$Proxy
            r2.<init>()
            r0 = 660933537(0x27650ba1, float:3.1786438E-15)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r6
            r0 = -179837624(0xfffffffff547e548, float:-2.5339782E32)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x00c0
        L_0x0143:
            android.os.Parcelable$Creator r0 = com.fbpay.w3c.CardDetails.CREATOR
            java.lang.Object r6 = X.Pxj.A0i(r13, r0)
            com.fbpay.w3c.CardDetails r6 = (com.fbpay.w3c.CardDetails) r6
            android.os.IBinder r3 = r13.readStrongBinder()
            if (r3 != 0) goto L_0x0157
            r2 = 0
        L_0x0152:
            r11.A80(r6, r2)
            goto L_0x002c
        L_0x0157:
            java.lang.String r0 = "com.fbpay.w3c.FBPaymentServiceAddCardCallback"
            android.os.IInterface r2 = r3.queryLocalInterface(r0)
            if (r2 == 0) goto L_0x0166
            boolean r0 = r2 instanceof com.fbpay.w3c.FBPaymentServiceAddCardCallback
            if (r0 == 0) goto L_0x0166
            com.fbpay.w3c.FBPaymentServiceAddCardCallback r2 = (com.fbpay.w3c.FBPaymentServiceAddCardCallback) r2
            goto L_0x0152
        L_0x0166:
            com.fbpay.w3c.FBPaymentServiceAddCardCallback$Stub$Proxy r2 = new com.fbpay.w3c.FBPaymentServiceAddCardCallback$Stub$Proxy
            r2.<init>()
            r0 = 1497279535(0x593eac2f, float:3.35434771E15)
            int r1 = X.AnonymousClass0fD.A03(r0)
            r2.A00 = r3
            r0 = -1950464145(0xffffffff8bbe476f, float:-7.329282E-32)
            X.AnonymousClass0fD.A0A(r0, r1)
            goto L_0x0152
        L_0x017b:
            r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
            if (r12 != r0) goto L_0x0188
            r14.writeString(r1)
            r0 = 1493318019(0x59023983, float:2.29093636E15)
            goto L_0x002f
        L_0x0188:
            boolean r1 = super.onTransact(r12, r13, r14, r15)
            r0 = 1308785614(0x4e027bce, float:5.4728794E8)
            X.AnonymousClass0fD.A0A(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fbpay.w3c.ipc.BaseFBPaymentServiceImpl$handler$1.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
    }

    public BaseFBPaymentServiceImpl$handler$1() {
        int A03 = AnonymousClass0fD.A03(1080421960);
        attachInterface(this, "com.fbpay.w3c.FBPaymentService");
        AnonymousClass0fD.A0A(1959518567, A03);
    }
}
