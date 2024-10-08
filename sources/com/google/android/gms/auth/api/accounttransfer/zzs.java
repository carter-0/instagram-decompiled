package com.google.android.gms.auth.api.accounttransfer;

import X.0yf;
import X.C301145yd;
import X.Pxe;
import X.Pxi;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import com.instagram.realtimeclient.RealtimeConstants;
import java.util.List;

public final class zzs extends zzbz {
    public static final 0yf A06;
    public static final Parcelable.Creator CREATOR = SWW.A00(81);
    public List A00;
    public List A01;
    public List A02;
    public List A03;
    public List A04;
    public final int A05;

    static {
        0yf A0N = Pxe.A0N(0);
        A06 = A0N;
        A0N.put("registered", FastJsonResponse$Field.A00("registered", 2));
        A0N.put("in_progress", FastJsonResponse$Field.A00("in_progress", 3));
        A0N.put(RealtimeConstants.SEND_SUCCESS, FastJsonResponse$Field.A00(RealtimeConstants.SEND_SUCCESS, 4));
        A0N.put("failed", FastJsonResponse$Field.A00("failed", 5));
        A0N.put("escrowed", FastJsonResponse$Field.A00("escrowed", 6));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A062 = Pxi.A06(parcel, this.A05);
        C301145yd.A0D(parcel, this.A00, 2);
        C301145yd.A0D(parcel, this.A01, 3);
        C301145yd.A0D(parcel, this.A02, 4);
        C301145yd.A0D(parcel, this.A03, 5);
        C301145yd.A0D(parcel, this.A04, 6);
        C301145yd.A06(parcel, A062);
    }

    public zzs(List list, List list2, List list3, List list4, List list5, int i) {
        this.A05 = i;
        this.A00 = list;
        this.A01 = list2;
        this.A02 = list3;
        this.A03 = list4;
        this.A04 = list5;
    }

    public zzs() {
        this.A05 = 1;
    }
}
