package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DE6;
import X.DbS;
import X.Dbb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.LinkedHashMap;
import java.util.Map;

public enum RankingAlgorithm implements Parcelable {
    UNRECOGNIZED("RankingAlgorithm_unspecified"),
    CLOSE_FRIENDING("close_friending_optimized"),
    A07(NetInfoModule.CONNECTION_TYPE_NONE),
    PRODUCERS_UNIT("sp_unit"),
    SU_DEFAULT("su_default"),
    FEED_IMPRESSION_OPT("su_feed_imp_optimized"),
    INVENTORY_OPT("su_inventory_optimized"),
    NOTIF("su_notification");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        RankingAlgorithm[] rankingAlgorithmArr;
        A02 = 0oU.A00(rankingAlgorithmArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (RankingAlgorithm rankingAlgorithm : values()) {
            A0x.put(rankingAlgorithm.A00, rankingAlgorithm);
        }
        A01 = A0x;
        CREATOR = new DE6(63);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    RankingAlgorithm(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
