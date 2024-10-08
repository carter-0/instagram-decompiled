package com.instagram.creation.base;

import X.A6E;
import X.C66434MRo;
import X.C66435MRp;
import X.LLB;
import android.location.Location;
import android.os.Parcelable;
import com.instagram.filterkit.filtergroup.model.intf.FilterGroupModel;

public interface MediaSession extends Parcelable {
    public static final LLB A00 = LLB.A00;

    long Afz();

    CropInfo Asr();

    C66434MRo B2U();

    String B5g();

    FilterGroupModel B5r();

    Location BNg();

    int BQn();

    String BbR();

    C66435MRp BpN();

    A6E BsX();

    Integer Bsu();

    void EPg(long j);

    void ETK(CropInfo cropInfo);

    void EWh(String str);

    void EWm(FilterGroupModel filterGroupModel);

    void EcZ(Location location);

    void EdE(int i);

    void EfV(String str);

    void Ejx(A6E a6e);
}
