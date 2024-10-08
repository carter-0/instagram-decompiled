package com.instagram.filterkit.filtergroup.model.intf;

import android.os.Parcelable;
import com.facebook.cameracore.litecamera.mediapipeline.iglu.filter.model.FilterModel;
import com.instagram.filterkit.filtergroup.model.impl.FilterGroupModelImpl;

public interface FilterGroupModel extends Parcelable {
    FilterModel B5u(int i);

    boolean CTc(int i);

    FilterGroupModelImpl E1g();

    void EWj(FilterModel filterModel, int i);

    void EWk(FilterModelProvider filterModelProvider, int i);

    void EWl(int i, boolean z);
}
