package com.instagram.friendmap.configs;

import X.00k;
import X.0qQ;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C49870FAr;
import X.DbV;
import X.DbX;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class FriendMapLaunchConfig implements Parcelable {
    public static final C49870FAr A0C = new Object();
    public static final Parcelable.Creator CREATOR = new W6E(54);
    public AggregatedBannerConfig A00;
    public String A01;
    public String A02;
    public String A03;
    public List A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public boolean A08;
    public final Integer A09;
    public final List A0A;
    public final boolean A0B;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        switch (this.A09.intValue()) {
            case 0:
                str = "INBOX_NOTES_TRAY";
                break;
            case 1:
                str = "PUSH_NOTIFICATION";
                break;
            case 2:
                str = "ACTIVITY_FEED";
                break;
            case 3:
                str = "DEEPLINK";
                break;
            case 4:
                str = "MAIN_FEED_ACTION_BAR";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        parcel.writeString(str);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeStringList(this.A04);
        parcel.writeInt(this.A08 ? 1 : 0);
        AggregatedBannerConfig aggregatedBannerConfig = this.A00;
        if (aggregatedBannerConfig == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            aggregatedBannerConfig.writeToParcel(parcel, i);
        }
        parcel.writeInt(this.A07 ? 1 : 0);
        parcel.writeInt(this.A05 ? 1 : 0);
    }

    public FriendMapLaunchConfig(AggregatedBannerConfig aggregatedBannerConfig, Integer num, String str, String str2, String str3, List list, boolean z, boolean z2, boolean z3) {
        List list2;
        List A0x;
        this.A09 = num;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A04 = list;
        this.A08 = z;
        this.A00 = aggregatedBannerConfig;
        this.A07 = z2;
        this.A05 = z3;
        boolean z4 = false;
        if (str2 == null || (A0x = DbX.A0x(str2)) == null) {
            list2 = null;
        } else {
            ArrayList A0r = AnonymousClass7TG.A0r(A0x);
            Iterator it = A0x.iterator();
            while (it.hasNext()) {
                A0r.add(DbV.A12(AnonymousClass7TE.A18(it)));
            }
            list2 = 00k.A0a(A0r);
        }
        this.A0A = list2;
        this.A0B = !((list2 == null || list2.isEmpty()) ? true : z4);
    }
}
