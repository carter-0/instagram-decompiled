package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IABExpandableFooterCallback extends IInterface {

    public abstract class Stub extends Binder implements IABExpandableFooterCallback {

        public final class Proxy implements IABExpandableFooterCallback {
            public IBinder A00;

            public final void Czr(String str, String str2, double d, String str3) {
                int A03 = AnonymousClass0fD.A03(893140729);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
                    obtain.writeString(str);
                    obtain.writeString(str2);
                    obtain.writeDouble(d);
                    obtain.writeString(str3);
                    Pxi.A0z(this.A00, obtain);
                } finally {
                    obtain.recycle();
                    AnonymousClass0fD.A0A(-475971728, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0fD.A03(472501629);
                IBinder iBinder = this.A00;
                AnonymousClass0fD.A0A(457218659, A03);
                return iBinder;
            }
        }

        public Stub() {
            int A03 = AnonymousClass0fD.A03(453438949);
            attachInterface(this, "com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
            AnonymousClass0fD.A0A(-1861435123, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0fD.A0A(1860539680, AnonymousClass0fD.A03(-247830641));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0fD.A03(2007894037);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
                    if (i == 1) {
                        Czr(parcel.readString(), parcel.readString(), parcel.readDouble(), parcel.readString());
                        i3 = -1584519834;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.IABExpandableFooterCallback");
                    i3 = -52343557;
                }
                AnonymousClass0fD.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            AnonymousClass0fD.A0A(-1111277495, A03);
            return onTransact;
        }
    }

    void Czr(String str, String str2, double d, String str3);
}
