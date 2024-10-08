package com.instagram.api.schemas;

import X.0qQ;
import X.1E6;
import X.1E9;
import X.AnonymousClass0T0;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C41848B3p;
import X.C44400CeK;
import X.DE6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.Iterator;
import java.util.List;

public final class StoryGroupMentionTappableData extends AnonymousClass0T0 implements Parcelable, StoryGroupMentionTappableDataIntf {
    public static final Parcelable.Creator CREATOR = DE6.A00(93);
    public final Integer A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final List A04;

    public final StoryGroupMentionTappableData FAA(1E9 r1) {
        return this;
    }

    public final StoryGroupMentionTappableData FAB(1E6 r1) {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof StoryGroupMentionTappableData) {
                StoryGroupMentionTappableData storyGroupMentionTappableData = (StoryGroupMentionTappableData) obj;
                if (!0qQ.A0K(this.A01, storyGroupMentionTappableData.A01) || !0qQ.A0K(this.A02, storyGroupMentionTappableData.A02) || !0qQ.A0K(this.A04, storyGroupMentionTappableData.A04) || !0qQ.A0K(this.A00, storyGroupMentionTappableData.A00) || !0qQ.A0K(this.A03, storyGroupMentionTappableData.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        Iterator A1F = C41848B3p.A1F(parcel, this.A04);
        while (A1F.hasNext()) {
            C41847B3o.A1I(parcel, A1F, i);
        }
        parcel.writeInt(C41847B3o.A00(parcel, this.A00));
        parcel.writeString(this.A03);
    }

    public final String Auy() {
        return this.A01;
    }

    public final List BRk() {
        return this.A04;
    }

    public final Integer Bzj() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTStoryGroupMentionTappableData", C44400CeK.A00(this));
    }

    public final String getId() {
        return this.A02;
    }

    public final String getText() {
        return this.A03;
    }

    public final int hashCode() {
        return ((AnonymousClass7TF.A07(this.A04, AnonymousClass7TF.A08(this.A02, AnonymousClass7TG.A0E(this.A01) * 31)) + AnonymousClass7TG.A0C(this.A00)) * 31) + C41845B3m.A00(this.A03);
    }

    public StoryGroupMentionTappableData(Integer num, String str, String str2, String str3, List list) {
        AnonymousClass7TG.A1Q(str2, list);
        this.A01 = str;
        this.A02 = str2;
        this.A04 = list;
        this.A00 = num;
        this.A03 = str3;
    }

    public final StoryGroupMentionTappableDataIntf E8a(1E9 r1) {
        return this;
    }
}
