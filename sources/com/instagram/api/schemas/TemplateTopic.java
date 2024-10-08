package com.instagram.api.schemas;

import X.0oU;
import X.DbS;
import X.DbY;
import X.Dbb;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.LinkedHashMap;
import java.util.Map;

public enum TemplateTopic implements Parcelable {
    UNRECOGNIZED("TemplateTopic_unspecified"),
    ANIMALS("animals"),
    BEAUTY_STYLE_FASHION("beauty_style_fashion"),
    CAMPAIGN("campaign"),
    CELEBRITY("celebrity"),
    CREATOR_TEMPLATE("creator_template"),
    END_OF_YEAR("end_of_year"),
    ENGAGEMENT("engagement"),
    FOOD_DRINK("food_drink"),
    GENERIC("generic"),
    HOME_GARDEN("home_garden"),
    REVISIT_TEMPLATE("revisit_template"),
    SAVED_TEMPLATE("saved_template"),
    SMART_TEMPLATE("smart_template"),
    SOCIAL_GRAPH("social_graph"),
    SPORTS_FITNESS("sports_fitness"),
    INTERACTIVE("template_interactive");
    
    public static final Map A01 = null;
    public static final Parcelable.Creator CREATOR = null;
    public final String A00;

    public final int describeContents() {
        return 0;
    }

    /* access modifiers changed from: public */
    static {
        int i;
        TemplateTopic[] templateTopicArr;
        A02 = 0oU.A00(templateTopicArr);
        LinkedHashMap A0x = DbS.A0x(DbY.A00(r3));
        for (TemplateTopic templateTopic : values()) {
            A0x.put(templateTopic.A00, templateTopic);
        }
        A01 = A0x;
        CREATOR = new FK6(20);
    }

    /* access modifiers changed from: public */
    TemplateTopic(String str) {
        this.A00 = str;
    }

    public final String toString() {
        return this.A00;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        Dbb.A0q(parcel, this);
    }
}
