package android.view;

import X.AnonymousClass00P;
import X.AnonymousClass0fD;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

public interface IRotationWatcher extends IInterface {

    public abstract class Stub extends Binder implements IRotationWatcher {
        public static IRotationWatcher asInterface(IBinder iBinder) {
            return null;
        }

        public abstract IBinder asBinder();

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            throw AnonymousClass00P.createAndThrow();
        }

        public class Proxy implements IRotationWatcher {
            public Proxy(IBinder iBinder) {
                AnonymousClass0fD.A0A(875279929, AnonymousClass0fD.A03(851862653));
            }

            public IBinder asBinder() {
                AnonymousClass0fD.A0A(1166090037, AnonymousClass0fD.A03(2136751874));
                return null;
            }

            public String getInterfaceDescriptor() {
                AnonymousClass0fD.A0A(1597013778, AnonymousClass0fD.A03(540220819));
                return null;
            }

            public void onRotationChanged(int i) {
                AnonymousClass0fD.A0A(-1896582477, AnonymousClass0fD.A03(1888122664));
            }
        }

        public Stub() {
            throw AnonymousClass00P.createAndThrow();
        }
    }

    void onRotationChanged(int i);
}
