package com.instagram.feed.ui.state;

import X.0qQ;
import X.1L2;
import X.AnonymousClass7TE;
import X.C242803Vz;
import X.C53261Gl9;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.Map;

public final class IntentAwareAdPivotState implements Parcelable, C242803Vz {
    public static final Parcelable.Creator CREATOR = new W6E(45);
    public int A00;
    public int A01;
    public int A02 = -1;
    public Parcelable A03 = new Object();
    public C53261Gl9 A04;
    public String A05 = "";
    public String A06;
    public Map A07 = AnonymousClass7TE.A1H();
    public boolean A08;
    public boolean A09;
    public boolean A0A;
    public boolean A0B;
    public boolean A0C = true;
    public boolean A0D = true;
    public final String A0E = 1L2.A00().A00;
    public final List A0F = AnonymousClass7TE.A1C();
    public final Map A0G = AnonymousClass7TE.A1H();
    public final Map A0H = AnonymousClass7TE.A1H();

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeInt(1);
    }

    public final List A00(String str) {
        if (str != null) {
            Map map = this.A0H;
            if (!map.containsKey(str)) {
                map.put(str, AnonymousClass7TE.A1C());
            }
            List list = (List) map.get(str);
            if (list != null) {
                return list;
            }
        }
        return AnonymousClass7TE.A1C();
    }

    public final /* synthetic */ int BKg() {
        return -1;
    }

    public final /* synthetic */ int BL7() {
        return -1;
    }

    public final int getPosition() {
        return this.A02;
    }
}
