package com.meta.arfx.engine.interfaces;

import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.AnonymousClass7TH;
import android.os.IBinder;
import android.os.Parcel;
import android.view.Surface;
import com.facebook.cameracore.util.memory.VersionedSharedMemory;
import java.util.List;

public final class IAREngineServiceController$Stub$Proxy implements IAREngineServiceController {
    public IBinder A00;

    public final void AHJ() {
        int A03 = AnonymousClass0fD.A03(369279273);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 9);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1965803494, A03);
        }
    }

    public final void APu(List list, int i, int i2, int i3, long j, long j2, boolean z) {
        int A03 = AnonymousClass0fD.A03(208189235);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeLong(j);
            obtain.writeLong(j2);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i3);
            int size = list.size();
            obtain.writeInt(size);
            for (int i4 = 0; i4 < size; i4++) {
                AnonymousClass7TH.A0Q(obtain, list, i4);
            }
            this.A00.transact(5, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(185990321, A03);
        }
    }

    public final void EFA(IARAnalyticsLoggerHost iARAnalyticsLoggerHost, IARExperimentUtilBinding iARExperimentUtilBinding, IARNetworkClientWorkerHost iARNetworkClientWorkerHost, int i, int i2, boolean z, boolean z2, boolean z3) {
        int A03 = AnonymousClass0fD.A03(1493461390);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            int i3 = 1;
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(AnonymousClass7TF.A1P(z2 ? 1 : 0) ? 1 : 0);
            if (!z3) {
                i3 = 0;
            }
            obtain.writeInt(i3);
            obtain.writeStrongInterface(iARExperimentUtilBinding);
            obtain.writeStrongInterface(iARNetworkClientWorkerHost);
            obtain.writeStrongInterface(iARAnalyticsLoggerHost);
            this.A00.transact(2, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-673089887, A03);
        }
    }

    public final void EFB() {
        int A03 = AnonymousClass0fD.A03(-1079324397);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 11);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-981682543, A03);
        }
    }

    public final void EHx() {
        int A03 = AnonymousClass0fD.A03(827106714);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 12);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1043531412, A03);
        }
    }

    public final void EQO(int i) {
        int A03 = AnonymousClass0fD.A03(673954610);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeInt(i);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 13);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1887812272, A03);
        }
    }

    public final void EQT(int i) {
        int A03 = AnonymousClass0fD.A03(104261424);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeInt(i);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 14);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-387612865, A03);
        }
    }

    public final void EUp(String str, String str2, String str3, String str4, String str5, String str6, List list, int i, int i2, boolean z) {
        int A03 = AnonymousClass0fD.A03(-2134643320);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeString(str);
            obtain.writeString(str2);
            obtain.writeString(str3);
            obtain.writeString(str4);
            obtain.writeString(str5);
            obtain.writeInt(i);
            obtain.writeString(str6);
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i2);
            int size = list.size();
            obtain.writeInt(size);
            for (int i3 = 0; i3 < size; i3++) {
                AnonymousClass7TH.A0Q(obtain, list, i3);
            }
            this.A00.transact(4, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1845950772, A03);
        }
    }

    public final void Ejz(IAREngineServiceCallback iAREngineServiceCallback) {
        int A03 = AnonymousClass0fD.A03(1961972413);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeStrongInterface(iAREngineServiceCallback);
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 1);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(39237, A03);
        }
    }

    public final void End(Surface surface, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(2098176550);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            if (surface != null) {
                obtain.writeInt(1);
                surface.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            obtain.writeInt(i);
            obtain.writeInt(i2);
            this.A00.transact(3, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-229359283, A03);
        }
    }

    public final void ErQ(VersionedSharedMemory versionedSharedMemory) {
        int A03 = AnonymousClass0fD.A03(352148085);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            if (versionedSharedMemory != null) {
                obtain.writeInt(1);
                versionedSharedMemory.writeToParcel(obtain, 0);
            } else {
                obtain.writeInt(0);
            }
            this.A00.transact(6, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(1778988403, A03);
        }
    }

    public final void ErR(int i, int i2, int i3, int i4, boolean z) {
        int A03 = AnonymousClass0fD.A03(1479962054);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeInt(i);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeInt(i4);
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            this.A00.transact(10, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-195991976, A03);
        }
    }

    public final void EyA() {
        int A03 = AnonymousClass0fD.A03(1656276466);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            AnonymousClass7TH.A0N(this.A00, obtain, obtain2, 8);
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-802690807, A03);
        }
    }

    public final void FKS(int[] iArr, int[] iArr2, int[] iArr3, float f, float f2, float f3, int i, int i2, int i3, int i4, long j, long j2, long j3, boolean z, boolean z2) {
        int A03 = AnonymousClass0fD.A03(-111306225);
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.meta.arfx.engine.interfaces.IAREngineServiceController");
            obtain.writeInt(i);
            obtain.writeLong(j);
            int i5 = 1;
            obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
            obtain.writeInt(i2);
            obtain.writeInt(i3);
            obtain.writeFloat(f);
            obtain.writeFloat(f2);
            obtain.writeFloat(f3);
            obtain.writeLong(j2);
            obtain.writeLong(j3);
            obtain.writeIntArray(iArr);
            obtain.writeIntArray(iArr2);
            obtain.writeIntArray(iArr3);
            obtain.writeInt(i4);
            if (!z2) {
                i5 = 0;
            }
            obtain.writeInt(i5);
            this.A00.transact(7, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
            AnonymousClass0fD.A0A(-1957393777, A03);
        }
    }

    public final IBinder asBinder() {
        int A03 = AnonymousClass0fD.A03(-1340007776);
        IBinder iBinder = this.A00;
        AnonymousClass0fD.A0A(-321938493, A03);
        return iBinder;
    }
}
