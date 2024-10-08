package com.meta.arfx.engine.common;

import X.AIb;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.C345937uK;
import X.C368648t4;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Surface;
import com.meta.arfx.engine.interfaces.IAREngineServiceCallback;
import java.util.List;

public final class AREngineServiceManager$callback$1 extends Binder implements IAREngineServiceCallback {
    public final /* synthetic */ AIb A00;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AREngineServiceManager$callback$1(AIb aIb) {
        this();
        this.A00 = aIb;
        AnonymousClass0fD.A0A(-1277488028, AnonymousClass0fD.A03(-1376519212));
    }

    public final void Crr(String str) {
        int A03 = AnonymousClass0fD.A03(72276081);
        AIb.A00(this.A00);
        AnonymousClass0fD.A0A(619959275, A03);
    }

    public final void EZu(Surface surface, int i, int i2) {
        int A03 = AnonymousClass0fD.A03(1390202621);
        AIb aIb = this.A00;
        C368648t4 r1 = aIb.A0Y.A00;
        C345937uK r0 = r1.A03;
        if (r0 != null) {
            r0.A02();
        }
        r1.A03 = null;
        r1.A01 = surface;
        aIb.A0D = AnonymousClass05K.A0C;
        AnonymousClass0fD.A0A(944754407, A03);
    }

    public final void Ek0(List list) {
        int A0D = AnonymousClass7TG.A0D(list, 1545844758);
        this.A00.A0c.addAll(list);
        AnonymousClass0fD.A0A(-692877887, A0D);
    }

    public final IBinder asBinder() {
        AnonymousClass0fD.A0A(-959230627, AnonymousClass0fD.A03(1869203473));
        return this;
    }

    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        int i3;
        Object obj;
        int A03 = AnonymousClass0fD.A03(-738987168);
        if (i >= 1) {
            if (i <= 16777215) {
                parcel.enforceInterface("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
                if (i == 1) {
                    Parcelable.Creator creator = Surface.CREATOR;
                    if (parcel.readInt() != 0) {
                        obj = creator.createFromParcel(parcel);
                    } else {
                        obj = null;
                    }
                    EZu((Surface) obj, parcel.readInt(), parcel.readInt());
                } else if (i == 2) {
                    Ek0(parcel.createTypedArrayList(Bundle.CREATOR));
                } else if (i == 3) {
                    Crr(parcel.readString());
                }
                parcel2.writeNoException();
                i3 = 80746524;
            } else if (i == 1598968902) {
                parcel2.writeString("com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
                i3 = 602747455;
            }
            AnonymousClass0fD.A0A(i3, A03);
            return true;
        }
        boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
        AnonymousClass0fD.A0A(-662114915, A03);
        return onTransact;
    }

    public AREngineServiceManager$callback$1() {
        int A03 = AnonymousClass0fD.A03(-1578594945);
        attachInterface(this, "com.meta.arfx.engine.interfaces.IAREngineServiceCallback");
        AnonymousClass0fD.A0A(1915699844, A03);
    }
}
