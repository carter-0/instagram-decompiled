package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import X.AnonymousClass7TF;
import X.C41848B3p;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface AutofillOptOutCallback extends IInterface {

    public abstract class Stub extends Binder implements AutofillOptOutCallback {

        public final class Proxy implements AutofillOptOutCallback {
            public IBinder A00;

            public final void Czt(String str, boolean z) {
                int A03 = AnonymousClass0fD.A03(1246329137);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    obtain.writeString(str);
                    obtain.writeInt(AnonymousClass7TF.A1P(z ? 1 : 0) ? 1 : 0);
                    this.A00.transact(1, obtain, (Parcel) null, 1);
                } finally {
                    obtain.recycle();
                    AnonymousClass0fD.A0A(649622755, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0fD.A03(-1936173714);
                IBinder iBinder = this.A00;
                AnonymousClass0fD.A0A(-820015047, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0fD.A03(-1742465275);
            attachInterface(this, "com.facebook.browser.lite.ipc.AutofillOptOutCallback");
            AnonymousClass0fD.A0A(602685671, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0fD.A0A(-387477542, AnonymousClass0fD.A03(-617270258));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0fD.A03(-454439569);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    if (i == 1) {
                        Czt(parcel.readString(), C41848B3p.A1X(parcel));
                        i3 = -2058053722;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.AutofillOptOutCallback");
                    i3 = -918341382;
                }
                AnonymousClass0fD.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            AnonymousClass0fD.A0A(1617105194, A03);
            return onTransact;
        }
    }

    void Czt(String str, boolean z);
}
