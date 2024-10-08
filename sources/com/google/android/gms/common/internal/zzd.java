package com.google.android.gms.common.internal;

import X.AnonymousClass0fD;
import X.AnonymousClass3Qk;
import X.C295515oM;
import X.C295525oN;
import X.C295535oP;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.internal.common.zzb;

public final class zzd extends zzb implements IGmsCallbacks {
    public BaseGmsClient A00;
    public final int A01;

    public zzd(BaseGmsClient baseGmsClient, int i) {
        this();
        int A03 = AnonymousClass0fD.A03(1789541247);
        this.A00 = baseGmsClient;
        this.A01 = i;
        AnonymousClass0fD.A0A(986536137, A03);
    }

    public final boolean A02(int i, Parcel parcel, Parcel parcel2, int i2) {
        Parcelable parcelable;
        int i3;
        int i4;
        Parcelable parcelable2;
        RootTelemetryConfiguration rootTelemetryConfiguration;
        int A03 = AnonymousClass0fD.A03(-2012596348);
        if (i != 1) {
            if (i == 2) {
                parcel.readInt();
                Parcelable.Creator creator = Bundle.CREATOR;
                if (parcel.readInt() != 0) {
                    creator.createFromParcel(parcel);
                }
                C295515oM.A00(parcel);
                i3 = AnonymousClass0fD.A03(1205045639);
                Log.wtf("GmsClient", "received deprecated onAccountValidationComplete callback, ignoring", new Exception());
                i4 = 1081273689;
            } else if (i != 3) {
                AnonymousClass0fD.A0A(979806786, A03);
                return false;
            } else {
                int readInt = parcel.readInt();
                IBinder readStrongBinder = parcel.readStrongBinder();
                Parcelable.Creator creator2 = zzk.CREATOR;
                if (parcel.readInt() == 0) {
                    parcelable2 = null;
                } else {
                    parcelable2 = (Parcelable) creator2.createFromParcel(parcel);
                }
                zzk zzk = (zzk) parcelable2;
                C295515oM.A00(parcel);
                i3 = AnonymousClass0fD.A03(-282690142);
                BaseGmsClient baseGmsClient = this.A00;
                AnonymousClass3Qk.A03(baseGmsClient, "onPostInitCompleteWithConnectionInfo can be called only once per call togetRemoteService");
                AnonymousClass3Qk.A02(zzk);
                baseGmsClient.A0Q = zzk;
                if (baseGmsClient.A09()) {
                    ConnectionTelemetryConfiguration connectionTelemetryConfiguration = zzk.A02;
                    C295525oN A002 = C295525oN.A00();
                    if (connectionTelemetryConfiguration == null) {
                        rootTelemetryConfiguration = null;
                    } else {
                        rootTelemetryConfiguration = connectionTelemetryConfiguration.A01;
                    }
                    synchronized (A002) {
                        if (rootTelemetryConfiguration == null) {
                            rootTelemetryConfiguration = C295525oN.A02;
                        } else {
                            RootTelemetryConfiguration rootTelemetryConfiguration2 = A002.A00;
                            if (rootTelemetryConfiguration2 != null) {
                                if (rootTelemetryConfiguration2.A00 < rootTelemetryConfiguration.A00) {
                                }
                            }
                        }
                        A002.A00 = rootTelemetryConfiguration;
                    }
                }
                A03(zzk.A01, readStrongBinder, readInt);
                i4 = -1455341776;
            }
            AnonymousClass0fD.A0A(i4, i3);
        } else {
            int readInt2 = parcel.readInt();
            IBinder readStrongBinder2 = parcel.readStrongBinder();
            Parcelable.Creator creator3 = Bundle.CREATOR;
            if (parcel.readInt() == 0) {
                parcelable = null;
            } else {
                parcelable = (Parcelable) creator3.createFromParcel(parcel);
            }
            C295515oM.A00(parcel);
            A03((Bundle) parcelable, readStrongBinder2, readInt2);
        }
        parcel2.writeNoException();
        AnonymousClass0fD.A0A(-1834004981, A03);
        return true;
    }

    public final void A03(Bundle bundle, IBinder iBinder, int i) {
        int A03 = AnonymousClass0fD.A03(-2065250662);
        AnonymousClass3Qk.A03(this.A00, "onPostInitComplete can be called only once per call to getRemoteService");
        BaseGmsClient baseGmsClient = this.A00;
        int i2 = this.A01;
        C295535oP r3 = new C295535oP(bundle, iBinder, baseGmsClient, i);
        Handler handler = baseGmsClient.A0G;
        handler.sendMessage(handler.obtainMessage(1, i2, -1, r3));
        this.A00 = null;
        AnonymousClass0fD.A0A(1797520623, A03);
    }

    public zzd() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
        AnonymousClass0fD.A0A(-2092427052, AnonymousClass0fD.A03(-1315334273));
    }
}
