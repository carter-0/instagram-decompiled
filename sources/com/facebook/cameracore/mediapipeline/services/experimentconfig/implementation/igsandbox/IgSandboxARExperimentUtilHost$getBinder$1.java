package com.facebook.cameracore.mediapipeline.services.experimentconfig.implementation.igsandbox;

import X.0Tu;
import X.0lg;
import X.0qQ;
import X.182;
import X.AnonymousClass0fD;
import X.C40107ARu;
import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.meta.arfx.engine.interfaces.IARExperimentUtilBinding;

public final class IgSandboxARExperimentUtilHost$getBinder$1 extends Binder implements IARExperimentUtilBinding {
    public final /* synthetic */ C40107ARu A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgSandboxARExperimentUtilHost$getBinder$1(C40107ARu aRu) {
        this();
        this.A00 = aRu;
        AnonymousClass0fD.A0A(-1752207492, AnonymousClass0fD.A03(-944097367));
    }

    public final boolean Agr(int i, boolean z) {
        int A03 = AnonymousClass0fD.A03(421478584);
        boolean A002 = C40107ARu.A00(this.A00, i, z);
        AnonymousClass0fD.A0A(-585848973, A03);
        return A002;
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-1725831901, AnonymousClass0fD.A03(-1633869614));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        0lg r5;
        0Tu r2;
        long j;
        0lg r52;
        0Tu r22;
        long j2;
        int A03 = AnonymousClass0fD.A03(-572490334);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
                boolean z = false;
                if (i == 1) {
                    int readInt = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    z = Agr(readInt, z);
                    parcel2.writeNoException();
                    parcel2.writeInt(z ? 1 : 0);
                } else if (i == 2) {
                    int readInt2 = parcel.readInt();
                    if (parcel.readInt() != 0) {
                        z = true;
                    }
                    int A032 = AnonymousClass0fD.A03(-330753731);
                    C40107ARu aRu = this.A00;
                    if (readInt2 == 65) {
                        z = 182.A06(0Tu.A06, aRu.A00, 36311831069917975L);
                    }
                    AnonymousClass0fD.A0A(453750789, A032);
                    parcel2.writeNoException();
                    parcel2.writeInt(z ? 1 : 0);
                } else if (i == 3) {
                    int readInt3 = parcel.readInt();
                    long readLong = parcel.readLong();
                    int A033 = AnonymousClass0fD.A03(1705918781);
                    C40107ARu aRu2 = this.A00;
                    if (readInt3 == 1) {
                        r5 = aRu2.A00;
                        r2 = 0Tu.A05;
                        j = 36592867958915811L;
                    } else {
                        if (readInt3 == 18) {
                            r5 = aRu2.A00;
                            r2 = 0Tu.A05;
                            j = 36596716249614930L;
                        }
                        AnonymousClass0fD.A0A(816682553, A033);
                        parcel2.writeNoException();
                        parcel2.writeLong(readLong);
                    }
                    readLong = 182.A01(r2, r5, j);
                    AnonymousClass0fD.A0A(816682553, A033);
                    parcel2.writeNoException();
                    parcel2.writeLong(readLong);
                } else if (i == 4) {
                    parcel.readInt();
                    String readString = parcel.readString();
                    int A034 = AnonymousClass0fD.A03(-145675198);
                    0qQ.A0B(readString, 1);
                    AnonymousClass0fD.A0A(-484011465, A034);
                    parcel2.writeNoException();
                    parcel2.writeString(readString);
                } else if (i == 5) {
                    int readInt4 = parcel.readInt();
                    double readDouble = parcel.readDouble();
                    int A035 = AnonymousClass0fD.A03(-633337263);
                    C40107ARu aRu3 = this.A00;
                    if (readInt4 == 2) {
                        r52 = aRu3.A00;
                        r22 = 0Tu.A05;
                        j2 = 37162990507917568L;
                    } else {
                        if (readInt4 == 3) {
                            r52 = aRu3.A00;
                            r22 = 0Tu.A05;
                            j2 = 37171142355583522L;
                        }
                        AnonymousClass0fD.A0A(-1891922512, A035);
                        parcel2.writeNoException();
                        parcel2.writeDouble(readDouble);
                    }
                    readDouble = 182.A00(r22, r52, j2);
                    AnonymousClass0fD.A0A(-1891922512, A035);
                    parcel2.writeNoException();
                    parcel2.writeDouble(readDouble);
                }
                i3 = 63890202;
            } else if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
                i3 = -679938119;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-1731147070, A03);
        return onTransact;
    }

    public IgSandboxARExperimentUtilHost$getBinder$1() {
        int A03 = AnonymousClass0fD.A03(-483049334);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IARExperimentUtilBinding");
        AnonymousClass0fD.A0A(-2081057953, A03);
    }
}
