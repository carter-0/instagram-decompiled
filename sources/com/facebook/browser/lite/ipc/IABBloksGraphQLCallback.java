package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IABBloksGraphQLCallback extends IInterface {

    public abstract class Stub extends Binder implements IABBloksGraphQLCallback {

        public final class Proxy implements IABBloksGraphQLCallback {
            public IBinder A00;

            public final void Czq(String str) {
                int A03 = AnonymousClass0fD.A03(252985085);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
                    obtain.writeString(str);
                    Pxi.A0z(this.A00, obtain);
                } finally {
                    obtain.recycle();
                    AnonymousClass0fD.A0A(-1202713748, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0fD.A03(1864703456);
                IBinder iBinder = this.A00;
                AnonymousClass0fD.A0A(793954775, A03);
                return iBinder;
            }
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [com.facebook.browser.lite.ipc.IABBloksGraphQLCallback, com.facebook.browser.lite.ipc.IABBloksGraphQLCallback$Stub$Proxy, java.lang.Object] */
        public static IABBloksGraphQLCallback A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IABBloksGraphQLCallback)) {
                return (IABBloksGraphQLCallback) queryLocalInterface;
            }
            ? obj = new Object();
            int A03 = AnonymousClass0fD.A03(-1834413364);
            obj.A00 = iBinder;
            AnonymousClass0fD.A0A(319826482, A03);
            return obj;
        }

        public Stub() {
            int A03 = AnonymousClass0fD.A03(1105193225);
            attachInterface(this, "com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
            AnonymousClass0fD.A0A(-638811634, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0fD.A0A(-15576269, AnonymousClass0fD.A03(-1840867321));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0fD.A03(665434273);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
                    if (i == 1) {
                        Czq(parcel.readString());
                        i3 = -1802016688;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.IABBloksGraphQLCallback");
                    i3 = -1474905564;
                }
                AnonymousClass0fD.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            AnonymousClass0fD.A0A(-1245108017, A03);
            return onTransact;
        }
    }

    void Czq(String str);
}
