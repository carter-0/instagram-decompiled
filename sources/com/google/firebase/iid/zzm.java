package com.google.firebase.iid;

import X.AnonymousClass7TE;
import X.SWT;
import android.os.IBinder;
import android.os.Messenger;
import android.os.Parcel;
import android.os.Parcelable;

public class zzm implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWT.A00(10);
    public Messenger A00;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        NullPointerException nullPointerException;
        if (obj == null) {
            return false;
        }
        try {
            Messenger messenger = this.A00;
            if (messenger != null) {
                IBinder binder = messenger.getBinder();
                Messenger messenger2 = ((zzm) obj).A00;
                if (messenger2 != null) {
                    return binder.equals(messenger2.getBinder());
                }
                nullPointerException = AnonymousClass7TE.A11("asBinder");
            } else {
                nullPointerException = AnonymousClass7TE.A11("asBinder");
            }
            throw nullPointerException;
        } catch (ClassCastException unused) {
            return false;
        }
    }

    public final int hashCode() {
        Messenger messenger = this.A00;
        if (messenger != null) {
            return messenger.getBinder().hashCode();
        }
        throw AnonymousClass7TE.A11("asBinder");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Messenger messenger = this.A00;
        if (messenger != null) {
            parcel.writeStrongBinder(messenger.getBinder());
            return;
        }
        throw AnonymousClass7TE.A11("asBinder");
    }
}
