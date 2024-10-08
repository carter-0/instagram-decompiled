package com.google.android.gms.auth.blockstore;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.C301145yd;
import X.Pxf;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class DeleteBytesRequest extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(14);
    public final List A00;
    public final boolean A01;

    public DeleteBytesRequest(List list, boolean z) {
        if (z) {
            boolean z2 = true;
            if (list != null && !list.isEmpty()) {
                z2 = false;
            }
            AnonymousClass3Qk.A09(z2, "deleteAll was set to true but other constraint(s) was also provided: keys");
        }
        this.A01 = z;
        this.A00 = AnonymousClass7TE.A1C();
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String A18 = AnonymousClass7TE.A18(it);
                AnonymousClass3Qk.A06(A18, "Element in keys cannot be null or empty");
                this.A00.add(A18);
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        C301145yd.A0D(parcel, Collections.unmodifiableList(this.A00), 1);
        C301145yd.A09(parcel, 2, this.A01);
        C301145yd.A06(parcel, A03);
    }
}
