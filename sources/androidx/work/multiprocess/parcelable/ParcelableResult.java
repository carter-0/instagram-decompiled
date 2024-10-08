package androidx.work.multiprocess.parcelable;

import X.AnonymousClass5G1;
import X.AnonymousClass5G2;
import X.AnonymousClass7TE;
import X.C282925Fh;
import X.C282935Fi;
import X.C66582MXn;
import X.C7216Pzk;
import android.os.Parcel;
import android.os.Parcelable;

public class ParcelableResult implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(73);
    public final C282935Fi A00;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int i2;
        C282935Fi r2 = this.A00;
        if (r2 instanceof AnonymousClass5G2) {
            i2 = 1;
        } else if (r2 instanceof AnonymousClass5G1) {
            i2 = 2;
        } else if (r2 instanceof C282925Fh) {
            i2 = 3;
        } else {
            throw C66582MXn.A0k(r2, "Unknown Result ", AnonymousClass7TE.A1A());
        }
        parcel.writeInt(i2);
        new ParcelableData(r2.A00()).writeToParcel(parcel, i);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v8, resolved type: X.5Fi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v10, resolved type: X.5Fi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v11, resolved type: X.5Fi} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v12, resolved type: X.5Fi} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ParcelableResult(android.os.Parcel r4) {
        /*
            r3 = this;
            r3.<init>()
            int r2 = r4.readInt()
            androidx.work.multiprocess.parcelable.ParcelableData r0 = new androidx.work.multiprocess.parcelable.ParcelableData
            r0.<init>((android.os.Parcel) r4)
            X.3tw r1 = r0.A00
            r0 = 1
            if (r2 != r0) goto L_0x0019
            X.5G2 r0 = new X.5G2
            r0.<init>()
        L_0x0016:
            r3.A00 = r0
            return
        L_0x0019:
            r0 = 2
            if (r2 != r0) goto L_0x0022
            X.5G1 r0 = new X.5G1
            r0.<init>(r1)
            goto L_0x0016
        L_0x0022:
            r0 = 3
            if (r2 != r0) goto L_0x002b
            X.5Fh r0 = new X.5Fh
            r0.<init>(r1)
            goto L_0x0016
        L_0x002b:
            java.lang.String r0 = "Unknown result type "
            java.lang.IllegalStateException r0 = X.DbW.A0b(r0, r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.parcelable.ParcelableResult.<init>(android.os.Parcel):void");
    }
}
