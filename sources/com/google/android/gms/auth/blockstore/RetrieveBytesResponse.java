package com.google.android.gms.auth.blockstore;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class RetrieveBytesResponse extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(16);
    public final Map A00;
    @Deprecated
    public final Bundle A01;
    public final List A02;

    public class BlockstoreData extends AbstractSafeParcelable {
        public static final Parcelable.Creator CREATOR = SWX.A00(13);
        public final String A00;
        public final byte[] A01;

        public final boolean equals(Object obj) {
            if (!(obj instanceof BlockstoreData)) {
                return false;
            }
            if (this == obj) {
                return true;
            }
            return Arrays.equals(this.A01, ((BlockstoreData) obj).A01);
        }

        public final int hashCode() {
            return Arrays.hashCode(AnonymousClass7TF.A1b(Arrays.hashCode(this.A01)));
        }

        public BlockstoreData(byte[] bArr, String str) {
            this.A01 = bArr;
            this.A00 = str;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int A03 = Pxf.A03(parcel);
            C301145yd.A0F(parcel, this.A01, 1, false);
            C301145yd.A0B(parcel, this.A00);
            C301145yd.A06(parcel, A03);
        }
    }

    public RetrieveBytesResponse(List list, Bundle bundle) {
        this.A01 = bundle;
        this.A02 = list;
        HashMap A1E = AnonymousClass7TE.A1E();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            BlockstoreData blockstoreData = (BlockstoreData) it.next();
            A1E.put(blockstoreData.A00, blockstoreData);
        }
        this.A00 = A1E;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A02(this.A01, parcel, 1);
        C301145yd.A0E(parcel, this.A02, 2, false);
        C301145yd.A06(parcel, A03);
    }
}
