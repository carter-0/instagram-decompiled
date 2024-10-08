package android.support.v4.os;

import X.AnonymousClass0fD;
import X.C7216Pzk;
import X.Pxf;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;

public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(10);
    public IResultReceiver A00;

    public final class MyResultReceiver extends Binder implements IResultReceiver {
        public MyResultReceiver() {
            this();
            AnonymousClass0fD.A0A(-2120535402, AnonymousClass0fD.A03(1724869948));
        }

        public final IBinder asBinder() {
            AnonymousClass0fD.A0A(2117509100, AnonymousClass0fD.A03(897597318));
            return this;
        }

        public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            int i3;
            int A03 = AnonymousClass0fD.A03(-250147080);
            String str = IResultReceiver.A00;
            if (i >= 1) {
                if (i <= 16777215) {
                    parcel.enforceInterface(str);
                    if (i == 1) {
                        parcel.readInt();
                        Parcelable.Creator creator = Bundle.CREATOR;
                        if (parcel.readInt() != 0) {
                            creator.createFromParcel(parcel);
                        }
                        AnonymousClass0fD.A0A(-923662967, AnonymousClass0fD.A03(-2071555893));
                        i3 = 151958997;
                    }
                } else if (i == 1598968902) {
                    parcel2.writeString(str);
                    i3 = 1297152264;
                }
                AnonymousClass0fD.A0A(i3, A03);
                return true;
            }
            boolean onTransact = super.onTransact(i, parcel, parcel2, i2);
            AnonymousClass0fD.A0A(-798119436, A03);
            return onTransact;
        }

        public MyResultReceiver() {
            int A03 = AnonymousClass0fD.A03(44809228);
            attachInterface(this, IResultReceiver.A00);
            AnonymousClass0fD.A0A(-331523751, A03);
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            IResultReceiver iResultReceiver = this.A00;
            if (iResultReceiver == null) {
                iResultReceiver = new MyResultReceiver();
                this.A00 = iResultReceiver;
            }
            Pxf.A16(iResultReceiver, parcel);
        }
    }
}
