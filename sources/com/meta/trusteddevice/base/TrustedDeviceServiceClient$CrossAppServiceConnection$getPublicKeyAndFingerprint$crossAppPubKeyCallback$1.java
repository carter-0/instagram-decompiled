package com.meta.trusteddevice.base;

import X.AnonymousClass0fD;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C10500RtF;
import X.C10957S2p;
import X.C8985RKb;
import X.SUj;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.trusteddevice.TdfCrossAppDeviceKeyCallback;

public final class TrustedDeviceServiceClient$CrossAppServiceConnection$getPublicKeyAndFingerprint$crossAppPubKeyCallback$1 extends Binder implements TdfCrossAppDeviceKeyCallback {
    public final /* synthetic */ C10957S2p A00;
    public final /* synthetic */ C10500RtF A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public TrustedDeviceServiceClient$CrossAppServiceConnection$getPublicKeyAndFingerprint$crossAppPubKeyCallback$1(C10957S2p s2p, C10500RtF rtF) {
        this();
        this.A01 = rtF;
        this.A00 = s2p;
        AnonymousClass0fD.A0A(-185408702, AnonymousClass0fD.A03(-1457354322));
    }

    public final void D7I(String str) {
        int A0D = AnonymousClass7TG.A0D(str, 6021994);
        SUj.A0M(this.A01.A00, (Object) null, new C8985RKb(str));
        AnonymousClass0fD.A0A(652762376, A0D);
    }

    public final void D7J(String str, String str2) {
        int A03 = AnonymousClass0fD.A03(894956790);
        AnonymousClass7TG.A1N(str, str2);
        SUj.A0K(this.A01.A00, AnonymousClass7TE.A1L(str, str2));
        AnonymousClass0fD.A0A(1241600512, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(244423031, AnonymousClass0fD.A03(-1115508519));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03 = AnonymousClass0fD.A03(-146763181);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
                if (i == 1) {
                    D7J(parcel.readString(), parcel.readString());
                } else if (i == 2) {
                    D7I(parcel.readString());
                }
                parcel2.writeNoException();
                i3 = 1060128947;
            } else if (i == 1598968902) {
                parcel2.writeString("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
                i3 = -195116287;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(1368835365, A03);
        return onTransact;
    }

    public TrustedDeviceServiceClient$CrossAppServiceConnection$getPublicKeyAndFingerprint$crossAppPubKeyCallback$1() {
        int A03 = AnonymousClass0fD.A03(2009575616);
        attachInterface(this, "com.trusteddevice.TdfCrossAppDeviceKeyCallback");
        AnonymousClass0fD.A0A(497880386, A03);
    }
}
