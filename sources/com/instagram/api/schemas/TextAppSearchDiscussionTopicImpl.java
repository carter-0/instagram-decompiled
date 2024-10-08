package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK6;
import X.HU6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class TextAppSearchDiscussionTopicImpl extends AnonymousClass0T0 implements Parcelable, TextAppSearchDiscussionTopic {
    public static final Parcelable.Creator CREATOR = new FK6(29);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;

    public final TextAppSearchDiscussionTopicImpl FCU() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextAppSearchDiscussionTopicImpl) {
                TextAppSearchDiscussionTopicImpl textAppSearchDiscussionTopicImpl = (TextAppSearchDiscussionTopicImpl) obj;
                if (!0qQ.A0K(this.A00, textAppSearchDiscussionTopicImpl.A00) || !0qQ.A0K(this.A01, textAppSearchDiscussionTopicImpl.A01) || !0qQ.A0K(this.A02, textAppSearchDiscussionTopicImpl.A02) || !0qQ.A0K(this.A03, textAppSearchDiscussionTopicImpl.A03) || !0qQ.A0K(this.A04, textAppSearchDiscussionTopicImpl.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A00);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
    }

    public final String B4l() {
        return this.A00;
    }

    public final String BGL() {
        return this.A01;
    }

    public final String BSr() {
        return this.A02;
    }

    public final String BxS() {
        return this.A03;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTTextAppSearchDiscussionTopic", HU6.A00(this));
    }

    public final String getTitle() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A00) * 31) + AnonymousClass7TG.A0E(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A02)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + C41845B3m.A00(this.A04);
    }

    public TextAppSearchDiscussionTopicImpl(String str, String str2, String str3, String str4, String str5) {
        this.A00 = str;
        this.A01 = str2;
        this.A02 = str3;
        this.A03 = str4;
        this.A04 = str5;
    }
}
