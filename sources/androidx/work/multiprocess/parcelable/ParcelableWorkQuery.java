package androidx.work.multiprocess.parcelable;

import X.AnonymousClass3D7;
import X.AnonymousClass7TE;
import X.C2379139t;
import X.C2379239u;
import X.C7216Pzk;
import X.DbS;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class ParcelableWorkQuery implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(79);
    public final C2379239u A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        C2379239u r2 = this.A00;
        List<Object> list = r2.A00;
        parcel.writeInt(list.size());
        if (!list.isEmpty()) {
            for (Object obj : list) {
                parcel.writeString(obj.toString());
            }
        }
        parcel.writeStringList(r2.A03);
        parcel.writeStringList(r2.A02);
        List<C2379139t> list2 = r2.A01;
        parcel.writeInt(list2.size());
        if (!list2.isEmpty()) {
            for (C2379139t A002 : list2) {
                parcel.writeInt(AnonymousClass3D7.A00(A002));
            }
        }
    }

    public ParcelableWorkQuery(Parcel parcel) {
        List emptyList = Collections.emptyList();
        int readInt = parcel.readInt();
        int i = 0;
        ArrayList arrayList = emptyList;
        if (readInt > 0) {
            ArrayList A0v = DbS.A0v(readInt);
            int i2 = 0;
            do {
                A0v.add(UUID.fromString(parcel.readString()));
                i2++;
            } while (i2 < readInt);
            arrayList = A0v;
        }
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        ArrayList<String> createStringArrayList2 = parcel.createStringArrayList();
        List emptyList2 = Collections.emptyList();
        int readInt2 = parcel.readInt();
        ArrayList arrayList2 = emptyList2;
        if (readInt2 > 0) {
            ArrayList A0v2 = DbS.A0v(readInt2);
            do {
                A0v2.add(AnonymousClass3D7.A02(parcel.readInt()));
                i++;
            } while (i < readInt2);
            arrayList2 = A0v2;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        ArrayList A1C2 = AnonymousClass7TE.A1C();
        ArrayList A1C3 = AnonymousClass7TE.A1C();
        ArrayList A1C4 = AnonymousClass7TE.A1C();
        A1C.addAll(arrayList);
        A1C2.addAll(createStringArrayList);
        A1C3.addAll(createStringArrayList2);
        A1C4.addAll(arrayList2);
        if (!A1C.isEmpty() || !A1C2.isEmpty() || !A1C3.isEmpty() || !A1C4.isEmpty()) {
            this.A00 = new C2379239u(A1C, A1C4, A1C3, A1C2);
            return;
        }
        throw AnonymousClass7TE.A0w("Must specify ids, uniqueNames, tags or states when building a WorkQuery");
    }
}
