package com.facebook.iabeventlogging.model;

import X.C8945RGn;
import X.Pxe;
import X.Pxf;
import X.Pxg;
import X.Pxh;
import X.RFY;
import android.os.Parcel;
import com.facebook.browser.iabcontext.IabCommonTrait;
import com.facebook.browser.lite.viewmode.IABViewModeLaunchConfig;
import com.facebook.privacy.zone.api.ZonedValue;
import java.util.Arrays;
import java.util.List;

public class IABLaunchEvent extends IABEvent {
    public final long A00;
    public final long A01;
    public final IabCommonTrait A02;
    public final IABViewModeLaunchConfig A03;
    public final ZonedValue A04;
    public final String A05;
    public final String A06;
    public final List A07;

    public IABLaunchEvent(IabCommonTrait iabCommonTrait, IABViewModeLaunchConfig iABViewModeLaunchConfig, ZonedValue zonedValue, String str, String str2, String str3, List list, long j, long j2, long j3, long j4) {
        super(C8945RGn.IAB_LAUNCH, str, j, j2);
        this.A04 = zonedValue;
        this.A01 = j3;
        this.A05 = str2;
        this.A00 = j4;
        this.A07 = list;
        this.A03 = iABViewModeLaunchConfig;
        this.A02 = iabCommonTrait;
        this.A06 = str3;
    }

    public final String toString() {
        StringBuilder A16 = Pxe.A16("IABLaunchEvent{");
        A16.append("userClickTs=");
        A16.append(this.A01);
        A16.append(", clickSource='");
        char A002 = Pxf.A00(this.A05, A16);
        A16.append(", flags=");
        A16.append(this.A00);
        Pxh.A1D(this, A16, A002);
        A16.append(this.A00);
        A16.append(", eligibleExperiences=");
        List list = this.A07;
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((RFY) list.get(i)).A00;
        }
        A16.append(Arrays.toString(iArr));
        A16.append(", iabViewModeLaunchConfig=");
        A16.append(this.A03);
        A16.append(", iabContext=");
        A16.append(this.A02);
        A16.append(", extraInfo=");
        A16.append(this.A06);
        return Pxg.A0x(A16);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeParcelable(this.A04, i);
        parcel.writeLong(this.A01);
        parcel.writeString(this.A05);
        parcel.writeLong(this.A00);
        List list = this.A07;
        int[] iArr = new int[list.size()];
        for (int i2 = 0; i2 < list.size(); i2++) {
            iArr[i2] = ((RFY) list.get(i2)).A00;
        }
        parcel.writeIntArray(iArr);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A06);
    }
}
