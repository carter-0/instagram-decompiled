package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.C13639Te6;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;

public class COSEAlgorithmIdentifier implements Parcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(92);
    public final C13639Te6 A00;

    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: X.RJ5[]} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: X.RJ5} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: X.RJ6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: X.RJ6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: X.RJ6} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: X.RJ6} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier A00(int r6) {
        /*
            r0 = -262(0xfffffffffffffefa, float:NaN)
            if (r6 != r0) goto L_0x000c
            X.RJ6 r3 = X.RJ6.RS1
        L_0x0006:
            com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier r0 = new com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier
            r0.<init>(r3)
            return r0
        L_0x000c:
            X.RJ6[] r5 = X.RJ6.values()
            int r2 = r5.length
            r4 = 0
            r1 = 0
        L_0x0013:
            if (r1 >= r2) goto L_0x001e
            r3 = r5[r1]
            int r0 = r3.A00
            if (r0 == r6) goto L_0x0006
            int r1 = r1 + 1
            goto L_0x0013
        L_0x001e:
            X.RJ5[] r2 = X.RJ5.values()
            int r1 = r2.length
        L_0x0023:
            if (r4 >= r1) goto L_0x002e
            r3 = r2[r4]
            int r0 = r3.A00
            if (r0 == r6) goto L_0x0006
            int r4 = r4 + 1
            goto L_0x0023
        L_0x002e:
            java.lang.String r1 = "Algorithm with COSE value "
            java.lang.String r0 = " not supported"
            java.lang.String r1 = X.002.A0c(r1, r0, r6)
            X.RJn r0 = new X.RJn
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier.A00(int):com.google.android.gms.fido.fido2.api.common.COSEAlgorithmIdentifier");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof COSEAlgorithmIdentifier) || this.A00.Aaf() != ((COSEAlgorithmIdentifier) obj).A00.Aaf()) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return Pxf.A08(this.A00);
    }

    public final String toString() {
        return 002.A0g("COSEAlgorithmIdentifier{algorithm=", String.valueOf(this.A00), "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.A00.Aaf());
    }

    public COSEAlgorithmIdentifier(C13639Te6 te6) {
        this.A00 = te6;
    }
}
