package androidx.work.multiprocess.parcelable;

import X.AnonymousClass7TE;
import X.C255323tw;
import X.C282915Fg;
import X.C66580MXl;
import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.work.WorkerParameters;
import java.util.Set;
import java.util.UUID;

public class ParcelableWorkerParameters implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(82);
    public final int A00;
    public final int A01;
    public final C255323tw A02;
    public final C282915Fg A03;
    public final Set A04;
    public final UUID A05;

    public final int describeContents() {
        return 0;
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras, java.lang.Object] */
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A05.toString());
        new ParcelableData(this.A02).writeToParcel(parcel, i);
        parcel.writeStringList(AnonymousClass7TE.A1D(this.A04));
        C282915Fg r1 = this.A03;
        ? obj = new Object();
        obj.A00 = r1;
        obj.writeToParcel(parcel, i);
        parcel.writeInt(this.A01);
        parcel.writeInt(this.A00);
    }

    public ParcelableWorkerParameters(Parcel parcel) {
        this.A05 = UUID.fromString(parcel.readString());
        this.A02 = new ParcelableData(parcel).A00;
        this.A04 = C66580MXl.A12(parcel.createStringArrayList());
        this.A03 = new ParcelableRuntimeExtras(parcel).A00;
        this.A01 = parcel.readInt();
        this.A00 = parcel.readInt();
    }

    public ParcelableWorkerParameters(WorkerParameters workerParameters) {
        this.A05 = workerParameters.A09;
        this.A02 = workerParameters.A02;
        this.A04 = workerParameters.A08;
        this.A03 = workerParameters.A06;
        this.A01 = workerParameters.A01;
        this.A00 = workerParameters.A00;
    }
}
