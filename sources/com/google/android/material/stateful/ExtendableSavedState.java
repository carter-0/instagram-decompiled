package com.google.android.material.stateful;

import X.01r;
import X.AnonymousClass7TE;
import X.C66582MXn;
import X.Pxf;
import X.SWO;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class ExtendableSavedState extends AbsSavedState {
    public static final Parcelable.Creator CREATOR = new SWO(2);
    public final 01r A00;

    public ExtendableSavedState(Parcel parcel, ClassLoader classLoader) {
        super(parcel, classLoader);
        int readInt = parcel.readInt();
        String[] strArr = new String[readInt];
        parcel.readStringArray(strArr);
        Bundle[] bundleArr = new Bundle[readInt];
        parcel.readTypedArray(bundleArr, Bundle.CREATOR);
        this.A00 = new 01r(readInt);
        for (int i = 0; i < readInt; i++) {
            this.A00.put(strArr[i], bundleArr[i]);
        }
    }

    public final String toString() {
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("ExtendableSavedState{");
        A1A.append(Pxf.A0h(this));
        A1A.append(" states=");
        return C66582MXn.A0v(this.A00, A1A);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: java.lang.String[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: android.os.Bundle[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            com.google.android.material.stateful.ExtendableSavedState.super.writeToParcel(r8, r9)
            X.01r r6 = r7.A00
            int r5 = r6.size()
            r8.writeInt(r5)
            java.lang.String[] r4 = new java.lang.String[r5]
            android.os.Bundle[] r3 = new android.os.Bundle[r5]
            r2 = 0
            r1 = 0
        L_0x0012:
            if (r1 >= r5) goto L_0x0023
            java.lang.Object r0 = r6.A05(r1)
            r4[r1] = r0
            java.lang.Object r0 = r6.A06(r1)
            r3[r1] = r0
            int r1 = r1 + 1
            goto L_0x0012
        L_0x0023:
            r8.writeStringArray(r4)
            r8.writeTypedArray(r3, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.stateful.ExtendableSavedState.writeToParcel(android.os.Parcel, int):void");
    }
}
