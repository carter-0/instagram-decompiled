package com.instagram.business.controller.datamodel;

import X.0qQ;
import X.AnonymousClass7TE;
import X.DbT;
import X.DbZ;
import X.W6D;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public final class BusinessConversionFlowStatus implements Parcelable {
    public static final Parcelable.Creator CREATOR = new W6D(2);
    public final int A00;
    public final ImmutableList A01;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof BusinessConversionFlowStatus)) {
            return false;
        }
        BusinessConversionFlowStatus businessConversionFlowStatus = (BusinessConversionFlowStatus) obj;
        return businessConversionFlowStatus.A00 == this.A00 && 0qQ.A0K(businessConversionFlowStatus.A01, this.A01);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(this.A00);
        parcel.writeList(this.A01);
    }

    public final BusinessConversionStep A00() {
        int i = this.A00;
        if (i <= -1) {
            return null;
        }
        ImmutableList immutableList = this.A01;
        if (i != immutableList.size()) {
            return (BusinessConversionStep) immutableList.get(i);
        }
        return null;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.A00), this.A01});
    }

    public BusinessConversionFlowStatus(Parcel parcel) {
        this.A00 = parcel.readInt();
        ImmutableList.Builder builder = new ImmutableList.Builder();
        ArrayList A1C = AnonymousClass7TE.A1C();
        parcel.readList(A1C, BusinessConversionStep.class.getClassLoader());
        builder.addAll(A1C);
        this.A01 = builder.build();
    }

    public BusinessConversionFlowStatus(List list, int i) {
        0qQ.A0B(list, 1);
        if (AnonymousClass7TE.A1b(list)) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(list);
            ImmutableList A0K = DbZ.A0K(builder);
            this.A01 = A0K;
            if (i < -1 || i > A0K.size()) {
                throw DbT.A0m();
            }
            this.A00 = i;
            return;
        }
        throw DbT.A0m();
    }

    public BusinessConversionFlowStatus(List list) {
        if (AnonymousClass7TE.A1b(list)) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            builder.addAll(list);
            this.A01 = DbZ.A0K(builder);
            this.A00 = -1;
            return;
        }
        throw DbT.A0m();
    }
}
