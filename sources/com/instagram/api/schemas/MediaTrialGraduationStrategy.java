package com.instagram.api.schemas;

import X.0oU;
import X.AnonymousClass7TG;
import X.DbS;
import X.Dbb;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum MediaTrialGraduationStrategy implements Parcelable {
    UNRECOGNIZED("MediaTrialGraduationStrategy_unspecified"),
    MANUAL("manual"),
    SS_PERFORMANCE("ss_performance");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        MediaTrialGraduationStrategy[] mediaTrialGraduationStrategyArr;
        A02 = 0oU.A00(mediaTrialGraduationStrategyArr);
        LinkedHashMap A0x = DbS.A0x(AnonymousClass7TG.A01(r3));
        for (MediaTrialGraduationStrategy mediaTrialGraduationStrategy : values()) {
            A0x.put(mediaTrialGraduationStrategy.A00, mediaTrialGraduationStrategy);
        }
        A01 = A0x;
        CREATOR = new FK5(69);
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    MediaTrialGraduationStrategy(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
