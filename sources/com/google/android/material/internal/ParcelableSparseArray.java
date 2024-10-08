package com.google.android.material.internal;

import X.SWO;
import android.os.Parcelable;
import android.util.SparseArray;

public class ParcelableSparseArray extends SparseArray implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWO(1);

    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v0, resolved type: android.os.Parcelable[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r6, int r7) {
        /*
            r5 = this;
            int r4 = r5.size()
            int[] r3 = new int[r4]
            android.os.Parcelable[] r2 = new android.os.Parcelable[r4]
            r1 = 0
        L_0x0009:
            if (r1 >= r4) goto L_0x001a
            int r0 = r5.keyAt(r1)
            r3[r1] = r0
            java.lang.Object r0 = r5.valueAt(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x0009
        L_0x001a:
            r6.writeInt(r4)
            r6.writeIntArray(r3)
            r6.writeParcelableArray(r2, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.internal.ParcelableSparseArray.writeToParcel(android.os.Parcel, int):void");
    }
}
