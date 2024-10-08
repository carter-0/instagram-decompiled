package com.instagram.upcomingevents.common.model;

import X.0oU;
import X.AnonymousClass7TG;
import X.Pxg;
import X.W6F;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum UpcomingEventReminderAction implements Parcelable {
    SET_REMINDER("set_reminder"),
    UNSET_REMINDER("unset_reminder");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        UpcomingEventReminderAction[] upcomingEventReminderActionArr;
        A02 = 0oU.A00(upcomingEventReminderActionArr);
        CREATOR = new W6F(86);
        LinkedHashMap linkedHashMap = new LinkedHashMap(AnonymousClass7TG.A01(r3));
        for (UpcomingEventReminderAction upcomingEventReminderAction : values()) {
            linkedHashMap.put(upcomingEventReminderAction.A00, upcomingEventReminderAction);
        }
        A01 = linkedHashMap;
    }

    public final String toString() {
        return this.A00;
    }

    /* access modifiers changed from: public */
    UpcomingEventReminderAction(String str) {
        this.A00 = str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Pxg.A1G(parcel, this);
    }
}
