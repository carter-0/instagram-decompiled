package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C16844V7z;
import X.C17665Vbw;
import X.C376389Hu;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.List;

public final class OnFeedMessages extends AnonymousClass0T0 implements OnFeedMessagesIntf, Parcelable {
    public static final Parcelable.Creator CREATOR = new C376389Hu(86);
    public final GreetingAttachment A00;
    public final Boolean A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final List A08;

    public final OnFeedMessages F70() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof OnFeedMessages) {
                OnFeedMessages onFeedMessages = (OnFeedMessages) obj;
                if (!0qQ.A0K(this.A02, onFeedMessages.A02) || !0qQ.A0K(this.A03, onFeedMessages.A03) || !0qQ.A0K(this.A04, onFeedMessages.A04) || !0qQ.A0K(this.A05, onFeedMessages.A05) || !0qQ.A0K(this.A06, onFeedMessages.A06) || !0qQ.A0K(this.A07, onFeedMessages.A07) || !0qQ.A0K(this.A08, onFeedMessages.A08) || !0qQ.A0K(this.A00, onFeedMessages.A00) || !0qQ.A0K(this.A01, onFeedMessages.A01)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        Integer num = this.A02;
        int i = 0;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.A04;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.A05;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.A06;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.A07;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List list = this.A08;
        int hashCode7 = (hashCode6 + (list == null ? 0 : list.hashCode())) * 31;
        GreetingAttachment greetingAttachment = this.A00;
        int hashCode8 = (hashCode7 + (greetingAttachment == null ? 0 : greetingAttachment.hashCode())) * 31;
        Boolean bool = this.A01;
        if (bool != null) {
            i = bool.hashCode();
        }
        return hashCode8 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        Integer num = this.A02;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(num.intValue());
        }
        parcel.writeString(this.A03);
        parcel.writeString(this.A04);
        parcel.writeString(this.A05);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        List<Parcelable> list = this.A08;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(list.size());
            for (Parcelable writeParcelable : list) {
                parcel.writeParcelable(writeParcelable, i);
            }
        }
        parcel.writeParcelable(this.A00, i);
        Boolean bool = this.A01;
        if (bool == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        parcel.writeInt(bool.booleanValue() ? 1 : 0);
    }

    public final /* bridge */ /* synthetic */ C17665Vbw AKI() {
        return new C17665Vbw(this);
    }

    public final Integer Awj() {
        return this.A02;
    }

    public final String B96() {
        return this.A03;
    }

    public final String B9l() {
        return this.A04;
    }

    public final String BCi() {
        return this.A05;
    }

    public final String BE4() {
        return this.A06;
    }

    public final String BE5() {
        return this.A07;
    }

    public final List BE6() {
        return this.A08;
    }

    public final /* bridge */ /* synthetic */ GreetingAttachmentIntf BFz() {
        return this.A00;
    }

    public final Boolean BuX() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTOnFeedMessages", C16844V7z.A00(this));
    }

    public OnFeedMessages(GreetingAttachment greetingAttachment, Boolean bool, Integer num, String str, String str2, String str3, String str4, String str5, List list) {
        this.A02 = num;
        this.A03 = str;
        this.A04 = str2;
        this.A05 = str3;
        this.A06 = str4;
        this.A07 = str5;
        this.A08 = list;
        this.A00 = greetingAttachment;
        this.A01 = bool;
    }
}
