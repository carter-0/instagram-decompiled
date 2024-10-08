package androidx.work.multiprocess.parcelable;

import X.C282915Fg;
import X.C7216Pzk;
import X.DbS;
import X.Pxf;
import X.Pxg;
import android.net.Network;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

public class ParcelableRuntimeExtras implements Parcelable {
    public static final Parcelable.Creator CREATOR = C7216Pzk.A00(74);
    public C282915Fg A00;

    public final int describeContents() {
        return 0;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: android.net.Uri[]} */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001c, code lost:
        if (r5.isEmpty() != false) goto L_0x001e;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void writeToParcel(android.os.Parcel r8, int r9) {
        /*
            r7 = this;
            X.5Fg r2 = r7.A00
            android.net.Network r1 = r2.A00
            r6 = 1
            boolean r0 = X.AnonymousClass7TF.A1V(r1)
            r8.writeInt(r0)
            if (r0 == 0) goto L_0x0011
            r8.writeParcelable(r1, r9)
        L_0x0011:
            java.util.List r5 = r2.A02
            java.util.List r4 = r2.A01
            if (r5 == 0) goto L_0x001e
            boolean r1 = r5.isEmpty()
            r0 = 1
            if (r1 == 0) goto L_0x001f
        L_0x001e:
            r0 = 0
        L_0x001f:
            r8.writeInt(r0)
            if (r0 == 0) goto L_0x0039
            int r3 = r5.size()
            android.net.Uri[] r2 = new android.net.Uri[r3]
            r1 = 0
        L_0x002b:
            if (r1 >= r3) goto L_0x0036
            java.lang.Object r0 = r5.get(r1)
            r2[r1] = r0
            int r1 = r1 + 1
            goto L_0x002b
        L_0x0036:
            r8.writeParcelableArray(r2, r9)
        L_0x0039:
            if (r4 == 0) goto L_0x004a
            boolean r0 = r4.isEmpty()
            if (r0 != 0) goto L_0x004a
        L_0x0041:
            r8.writeInt(r6)
            if (r6 == 0) goto L_0x0049
            r8.writeStringList(r4)
        L_0x0049:
            return
        L_0x004a:
            r6 = 0
            goto L_0x0041
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.work.multiprocess.parcelable.ParcelableRuntimeExtras.writeToParcel(android.os.Parcel, int):void");
    }

    public ParcelableRuntimeExtras(Parcel parcel) {
        Network network;
        ArrayList arrayList;
        ClassLoader A0W = Pxf.A0W(this);
        ArrayList<String> arrayList2 = null;
        if (Pxg.A1U(parcel)) {
            network = (Network) parcel.readParcelable(A0W);
        } else {
            network = null;
        }
        if (parcel.readInt() == 1) {
            arrayList = DbS.A0v(r3);
            for (Parcelable add : parcel.readParcelableArray(A0W)) {
                arrayList.add(add);
            }
        } else {
            arrayList = null;
        }
        arrayList2 = parcel.readInt() == 1 ? parcel.createStringArrayList() : arrayList2;
        C282915Fg r0 = new C282915Fg();
        this.A00 = r0;
        r0.A00 = network;
        if (arrayList != null) {
            r0.A02 = arrayList;
        }
        if (arrayList2 != null) {
            r0.A01 = arrayList2;
        }
    }
}
