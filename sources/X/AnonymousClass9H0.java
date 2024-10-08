package X;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.direct.threadkey.impl.MsysPendingRecipient;
import com.instagram.model.direct.threadkey.util.ThreadIdParcelable;
import com.instagram.model.direct.threadkey.util.ThreadTargetParcelable;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.ArrayList;

/* renamed from: X.9H0  reason: invalid class name */
public abstract class AnonymousClass9H0 {
    public static final void A03(Parcel parcel, C254783t2 r3, int i) {
        if (r3 == null) {
            throw new IllegalStateException("null ThreadTarget");
        } else if (r3 instanceof C333417Yw) {
            parcel.writeInt(3);
            C333417Yw r32 = (C333417Yw) r3;
            A03(parcel, r32.A00, i);
            A03(parcel, r32.A01, i);
        } else if (r3 instanceof C254793t3) {
            parcel.writeInt(0);
            C254793t3 r33 = (C254793t3) r3;
            0qQ.A0B(r33, 1);
            parcel.writeParcelable(new ThreadIdParcelable(r33), i);
        } else if (r3 instanceof C291175gg) {
            parcel.writeInt(1);
            parcel.writeList(((C291175gg) r3).A00);
        } else if (r3 instanceof PIO) {
            parcel.writeInt(2);
            PIO pio = (PIO) r3;
            parcel.writeList(pio.A02);
            parcel.writeString(pio.A00.A00);
            parcel.writeInt(pio.A01.A00);
        } else {
            StringBuilder sb = new StringBuilder();
            sb.append("Unexpected ThreadTarget: ");
            sb.append(r3);
            throw new IllegalStateException(sb.toString());
        }
    }

    public static final void A02(Bundle bundle, C254783t2 r2, String str) {
        bundle.putParcelable(str, new ThreadTargetParcelable(r2));
    }

    public static final C254783t2 A00(Bundle bundle, String str) {
        ThreadTargetParcelable threadTargetParcelable = (ThreadTargetParcelable) bundle.getParcelable(str);
        if (threadTargetParcelable != null) {
            return threadTargetParcelable.A00;
        }
        return null;
    }

    public static final C254783t2 A01(Parcel parcel) {
        C254783t2 r0;
        int readInt = parcel.readInt();
        if (readInt == 0) {
            Parcelable readParcelable = parcel.readParcelable(ThreadIdParcelable.class.getClassLoader());
            if (readParcelable != null) {
                r0 = ((ThreadIdParcelable) readParcelable).A00;
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (readInt == 1) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, PendingRecipient.class.getClassLoader());
            r0 = new C291175gg(arrayList);
        } else if (readInt == 2) {
            ArrayList arrayList2 = new ArrayList();
            parcel.readList(arrayList2, MsysPendingRecipient.class.getClassLoader());
            String readString = parcel.readString();
            if (readString == null) {
                readString = C254923tH.ACT.A00;
            }
            0qQ.A0A(readString);
            r0 = new PIO(C395269zU.A00(readString), C70116NxW.A00(Integer.valueOf(parcel.readInt())), arrayList2);
        } else if (readInt == 3) {
            C254783t2 A01 = A01(parcel);
            0qQ.A0C(A01, AnonymousClass000.A00(30));
            C254783t2 A012 = A01(parcel);
            0qQ.A0C(A012, C66579MXk.A00(374));
            r0 = new C333417Yw((C254773t1) A01, (AnonymousClass9HR) A012);
        } else {
            throw new IllegalStateException(C66579MXk.A00(627));
        }
        return r0;
    }
}
