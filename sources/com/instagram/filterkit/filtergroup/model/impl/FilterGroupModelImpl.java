package com.instagram.filterkit.filtergroup.model.impl;

import X.0qQ;
import X.AB4;
import X.C376399Hv;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.ColorFilter;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.basic.FilterChain;
import com.instagram.creation.photo.edit.effectfilter.PhotoFilter;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;
import com.instagram.filterkit.filtergroup.model.intf.FilterModelProvider;

public final class FilterGroupModelImpl implements FilterGroupModel {
    public static final Parcelable.Creator CREATOR = new C376399Hv(13);
    public int A00;
    public PhotoFilter A01;
    public final FilterChain A02;
    public final Integer A03;
    public final boolean A04;

    public FilterGroupModelImpl(FilterChain filterChain, PhotoFilter photoFilter, Integer num, int i, boolean z) {
        FilterModel filterModel;
        0qQ.A0B(filterChain, 1);
        this.A02 = filterChain;
        this.A03 = num;
        this.A01 = photoFilter;
        this.A00 = i;
        this.A04 = z;
        if (i != -1 && (filterModel = (FilterModel) filterChain.A01.get(i)) != null && photoFilter != null) {
            photoFilter.A03 = (ColorFilter) filterModel;
        }
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !0qQ.A0K(getClass(), obj.getClass())) {
                return false;
            }
            FilterGroupModelImpl filterGroupModelImpl = (FilterGroupModelImpl) obj;
            if (!(0qQ.A0K(this.A02, filterGroupModelImpl.A02) && this.A03 == filterGroupModelImpl.A03 && this.A04 == filterGroupModelImpl.A04)) {
                return false;
            }
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(AB4.A01(this.A03));
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeInt(this.A04 ? 1 : 0);
    }

    public final FilterModel B5u(int i) {
        return (FilterModel) this.A02.A01.get(i);
    }

    public final /* bridge */ /* synthetic */ FilterGroupModelImpl E1g() {
        FilterChain A002 = this.A02.deepCopy();
        Integer num = this.A03;
        PhotoFilter photoFilter = this.A01;
        PhotoFilter photoFilter2 = null;
        if (photoFilter != null) {
            Parcel obtain = Parcel.obtain();
            photoFilter.writeToParcel(obtain, 0);
            obtain.setDataPosition(0);
            photoFilter2 = new PhotoFilter(obtain);
        }
        return new FilterGroupModelImpl(A002, photoFilter2, num, this.A00, true);
    }

    public final void EWj(FilterModel filterModel, int i) {
        this.A02.A01(filterModel, i);
    }

    public final void EWk(FilterModelProvider filterModelProvider, int i) {
        if (filterModelProvider instanceof PhotoFilter) {
            this.A01 = (PhotoFilter) filterModelProvider;
            this.A00 = i;
        }
        this.A02.A01(filterModelProvider.B5t(), i);
    }

    public final void EWl(int i, boolean z) {
        FilterModel filterModel = (FilterModel) this.A02.A01.get(i);
        if (filterModel != null) {
            filterModel.setEnabled(z);
        }
    }

    public final boolean CTc(int i) {
        FilterModel B5u = B5u(i);
        if (B5u == null || !B5u.isEnabled()) {
            return false;
        }
        return true;
    }
}
