package com.meta.trusteddevice.service;

import X.0qQ;
import X.2Mg;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.Pxf;
import X.Pxg;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.facebook.profilo.provider.constants.ExternalProvider;
import com.facebook.profilo.provider.constants.ExternalProviders;
import com.trusteddevice.TdfCrossAppDeviceKeyCallback;
import com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback;
import com.trusteddevice.TrustedDeviceFoundationService;
import java.security.MessageDigest;

public final class TrustedDeviceFoundationServiceImpl$binder$1 extends Binder implements TrustedDeviceFoundationService {
    /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, com.trusteddevice.TrustedDeviceFoundationService$Stub$Proxy, com.trusteddevice.TrustedDeviceFoundationService] */
    public static TrustedDeviceFoundationService A00(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.trusteddevice.TrustedDeviceFoundationService");
        if (queryLocalInterface != null && (queryLocalInterface instanceof TrustedDeviceFoundationService)) {
            return (TrustedDeviceFoundationService) queryLocalInterface;
        }
        ? obj = new Object();
        int A03 = AnonymousClass0fD.A03(1777308267);
        obj.A00 = iBinder;
        AnonymousClass0fD.A0A(-219579509, A03);
        return obj;
    }

    public TrustedDeviceFoundationServiceImpl$binder$1() {
        int A03 = AnonymousClass0fD.A03(-1371540307);
        attachInterface(this, "com.trusteddevice.TrustedDeviceFoundationService");
        AnonymousClass0fD.A0A(952489638, A03);
        AnonymousClass0fD.A0A(86718919, AnonymousClass0fD.A03(958367783));
    }

    public final void BYe(TdfCrossAppDeviceKeyCallback tdfCrossAppDeviceKeyCallback) {
        int A0D = AnonymousClass7TG.A0D(tdfCrossAppDeviceKeyCallback, 888820015);
        try {
            2Mg r3 = new 2Mg("autofill_key");
            String A0p = Pxf.A0p(r3.A03(), 2);
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.update(r3.A03());
            byte[] digest = instance.digest();
            0qQ.A07(digest);
            tdfCrossAppDeviceKeyCallback.D7J(A0p, Pxg.A0z(digest));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Could not fetch device key and/or fingerprint";
            }
            tdfCrossAppDeviceKeyCallback.D7I(message);
        }
        AnonymousClass0fD.A0A(298862475, A0D);
    }

    public final void Evb(TdfTrustChainBindingSignPttPayloadCallback tdfTrustChainBindingSignPttPayloadCallback, byte[] bArr) {
        int A03 = AnonymousClass0fD.A03(1754526082);
        AnonymousClass7TG.A1N(bArr, tdfTrustChainBindingSignPttPayloadCallback);
        try {
            tdfTrustChainBindingSignPttPayloadCallback.Dar(new 2Mg("autofill_key").A02(bArr));
        } catch (Exception e) {
            String message = e.getMessage();
            if (message == null) {
                message = "Could not sign payload";
            }
            tdfTrustChainBindingSignPttPayloadCallback.Daq(message);
        }
        AnonymousClass0fD.A0A(1560994886, A03);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(1835662453, AnonymousClass0fD.A03(147517702));
        return this;
    }

    /* JADX WARNING: type inference failed for: r4v2, types: [com.trusteddevice.TdfCrossAppDeviceKeyCallback$Stub$Proxy, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r4v7, types: [com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback$Stub$Proxy, java.lang.Object] */
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        int A03;
        int i4;
        TdfCrossAppDeviceKeyCallback tdfCrossAppDeviceKeyCallback;
        TdfTrustChainBindingSignPttPayloadCallback tdfTrustChainBindingSignPttPayloadCallback;
        int A032 = AnonymousClass0fD.A03(271649577);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.trusteddevice.TrustedDeviceFoundationService");
                if (i != 1) {
                    if (i == 2) {
                        IBinder readStrongBinder = parcel.readStrongBinder();
                        if (readStrongBinder == null) {
                            tdfCrossAppDeviceKeyCallback = null;
                        } else {
                            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.trusteddevice.TdfCrossAppDeviceKeyCallback");
                            if (queryLocalInterface == null || !(queryLocalInterface instanceof TdfCrossAppDeviceKeyCallback)) {
                                ? obj = new Object();
                                int A033 = AnonymousClass0fD.A03(-1816182754);
                                obj.A00 = readStrongBinder;
                                AnonymousClass0fD.A0A(-1369539470, A033);
                                tdfCrossAppDeviceKeyCallback = obj;
                            } else {
                                tdfCrossAppDeviceKeyCallback = (TdfCrossAppDeviceKeyCallback) queryLocalInterface;
                            }
                        }
                        BYe(tdfCrossAppDeviceKeyCallback);
                    } else if (i == 3) {
                        byte[] createByteArray = parcel.createByteArray();
                        IBinder readStrongBinder2 = parcel.readStrongBinder();
                        if (readStrongBinder2 == null) {
                            tdfTrustChainBindingSignPttPayloadCallback = null;
                        } else {
                            IInterface queryLocalInterface2 = readStrongBinder2.queryLocalInterface("com.trusteddevice.TdfTrustChainBindingSignPttPayloadCallback");
                            if (queryLocalInterface2 == null || !(queryLocalInterface2 instanceof TdfTrustChainBindingSignPttPayloadCallback)) {
                                ? obj2 = new Object();
                                int A034 = AnonymousClass0fD.A03(1140012108);
                                obj2.A00 = readStrongBinder2;
                                AnonymousClass0fD.A0A(-1056416580, A034);
                                tdfTrustChainBindingSignPttPayloadCallback = obj2;
                            } else {
                                tdfTrustChainBindingSignPttPayloadCallback = (TdfTrustChainBindingSignPttPayloadCallback) queryLocalInterface2;
                            }
                        }
                        Evb(tdfTrustChainBindingSignPttPayloadCallback, createByteArray);
                    } else if (i == 4) {
                        A03 = AnonymousClass0fD.A03(1115787087);
                        i4 = 1578985273;
                    }
                    parcel2.writeNoException();
                    i3 = -1748581730;
                } else {
                    IBinder readStrongBinder3 = parcel.readStrongBinder();
                    if (readStrongBinder3 != null) {
                        readStrongBinder3.queryLocalInterface("com.trusteddevice.TdfCrossAppRegistrationCallback");
                        ExternalProvider externalProvider = ExternalProviders.A07;
                        externalProvider.A07().A00(6, 22, 161864556, 0, externalProvider.A07().A00(6, 21, 651056728, 0, 0));
                    }
                    A03 = AnonymousClass0fD.A03(1577274277);
                    i4 = 1317880184;
                }
                AnonymousClass0fD.A0A(i4, A03);
                parcel2.writeNoException();
                i3 = -1748581730;
            } else if (i == 1598968902) {
                parcel2.writeString("com.trusteddevice.TrustedDeviceFoundationService");
                i3 = -1989194703;
            }
            AnonymousClass0fD.A0A(i3, A032);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(160569117, A032);
        return onTransact;
    }
}
