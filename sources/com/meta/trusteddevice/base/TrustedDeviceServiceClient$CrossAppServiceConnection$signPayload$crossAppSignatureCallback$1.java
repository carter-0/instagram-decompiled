package com.meta.trusteddevice.base;

import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C10500RtF;
import X.C10957S2p;
import X.C8985RKb;
import X.SUj;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback;

public final class TrustedDeviceServiceClient$CrossAppServiceConnection$signPayload$crossAppSignatureCallback$1 extends Binder implements TdfTrustChainBindingSignPttPayloadCallback {
    public final /* synthetic */ C10957S2p A00;
    public final /* synthetic */ C10500RtF A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrustedDeviceServiceClient$CrossAppServiceConnection$signPayload$crossAppSignatureCallback$1(C10957S2p s2p, C10500RtF rtF) {
        this();
        this.A01 = rtF;
        this.A00 = s2p;
        AnonymousClass0fD.A0A(-458073524, AnonymousClass0fD.A03(2046777745));
    }

    public final void Daq(String str) {
        int A0D = AnonymousClass7TG.A0D(str, -1485079283);
        SUj.A0M(this.A01.A00, (Object) null, new C8985RKb(str));
        AnonymousClass0fD.A0A(-1029104835, A0D);
    }

    public final void Dar(String str) {
        int A0D = AnonymousClass7TG.A0D(str, -1066979249);
        SUj.A0K(this.A01.A00, str);
        AnonymousClass0fD.A0A(493341235, A0D);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(814833341, AnonymousClass0fD.A03(-1667484056));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(49073978);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
                if (i == 1) {
                    Dar(parcel.readString());
                } else if (i == 2) {
                    Daq(parcel.readString());
                }
                parcel2.writeNoException();
                i3 = -835153693;
            } else if (i == 1598968902) {
                parcel2.writeString("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
                i3 = -695747762;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-971539735, A03);
        return onTransact;
    }

    public TrustedDeviceServiceClient$CrossAppServiceConnection$signPayload$crossAppSignatureCallback$1() {
        int A03 = AnonymousClass0fD.A03(1764142410);
        attachInterface(this, "com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
        AnonymousClass0fD.A0A(1241891041, A03);
    }
}
