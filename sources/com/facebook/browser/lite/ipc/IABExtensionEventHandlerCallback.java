package com.facebook.browser.lite.ipc;

import X.AnonymousClass0fD;
import X.Pxi;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

public interface IABExtensionEventHandlerCallback extends IInterface {

    public abstract class Stub extends Binder implements IABExtensionEventHandlerCallback {

        public final class Proxy implements IABExtensionEventHandlerCallback {
            public IBinder A00;

            public final void Czu(List list) {
                int A03 = AnonymousClass0fD.A03(343207619);
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
                    if (list == null) {
                        obtain.writeInt(-1);
                    } else {
                        int size = list.size();
                        obtain.writeInt(size);
                        for (int i = 0; i < size; i++) {
                            Parcelable parcelable = (Parcelable) list.get(i);
                            if (parcelable != null) {
                                obtain.writeInt(1);
                                parcelable.writeToParcel(obtain, 0);
                            } else {
                                obtain.writeInt(0);
                            }
                        }
                    }
                    Pxi.A0z(this.A00, obtain);
                } finally {
                    obtain.recycle();
                    AnonymousClass0fD.A0A(1478802445, A03);
                }
            }

            public final IBinder asBinder() {
                int A03 = AnonymousClass0fD.A03(585042068);
                IBinder iBinder = this.A00;
                AnonymousClass0fD.A0A(2073608240, A03);
                return iBinder;
            }
        }

        /* JADX WARNING: type inference failed for: r2v1, types: [java.lang.Object, com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback$Stub$Proxy, com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback] */
        public static IABExtensionEventHandlerCallback A00(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
            if (queryLocalInterface != null && (queryLocalInterface instanceof IABExtensionEventHandlerCallback)) {
                return (IABExtensionEventHandlerCallback) queryLocalInterface;
            }
            ? obj = new Object();
            int A03 = AnonymousClass0fD.A03(-1190475058);
            obj.A00 = iBinder;
            AnonymousClass0fD.A0A(1487629942, A03);
            return obj;
        }

        public Stub() {
            int A03 = AnonymousClass0fD.A03(-139052413);
            attachInterface(this, "com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
            AnonymousClass0fD.A0A(1803873047, A03);
        }

        public final IBinder asBinder() {
            AnonymousClass0fD.A0A(-32870102, AnonymousClass0fD.A03(-953322939));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0fD.A03(2120226932);
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
                    if (i == 1) {
                        Czu(parcel.createTypedArrayList(IABExtensionEventHandlerPayload.CREATOR));
                        i3 = -1770727813;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString("com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback");
                    i3 = 746145367;
                }
                AnonymousClass0fD.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            AnonymousClass0fD.A0A(-1683237057, A03);
            return onTransact;
        }
    }

    void Czu(List list);
}
