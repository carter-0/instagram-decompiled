package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C44555Cgp;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class UntaggableReason extends AnonymousClass0T0 implements Parcelable, UntaggableReasonIntf {
    public static final Parcelable.Creator CREATOR = new FK6(51);
    public final InstagramProductTaggabilityState A00;
    public final LinkWithText A01;
    public final LinkWithText A02;
    public final String A03;
    public final String A04;

    public final UntaggableReason FCz() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof UntaggableReason) {
                UntaggableReason untaggableReason = (UntaggableReason) obj;
                if (!0qQ.A0K(this.A01, untaggableReason.A01) || !0qQ.A0K(this.A03, untaggableReason.A03) || !0qQ.A0K(this.A02, untaggableReason.A02) || this.A00 != untaggableReason.A00 || !0qQ.A0K(this.A04, untaggableReason.A04)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        LinkWithText linkWithText = this.A01;
        int i = 0;
        int hashCode = (linkWithText == null ? 0 : linkWithText.hashCode()) * 31;
        String str = this.A03;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        LinkWithText linkWithText2 = this.A02;
        int hashCode3 = (hashCode2 + (linkWithText2 == null ? 0 : linkWithText2.hashCode())) * 31;
        InstagramProductTaggabilityState instagramProductTaggabilityState = this.A00;
        int hashCode4 = (hashCode3 + (instagramProductTaggabilityState == null ? 0 : instagramProductTaggabilityState.hashCode())) * 31;
        String str2 = this.A04;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode4 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A02, i);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
    }

    public final /* bridge */ /* synthetic */ LinkWithTextIntf AYC() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ LinkWithTextIntf BCz() {
        return this.A02;
    }

    public final InstagramProductTaggabilityState C3w() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTUntaggableReason", C44555Cgp.A00(this));
    }

    public final String getDescription() {
        return this.A03;
    }

    public final String getTitle() {
        return this.A04;
    }

    public UntaggableReason(InstagramProductTaggabilityState instagramProductTaggabilityState, LinkWithText linkWithText, LinkWithText linkWithText2, String str, String str2) {
        this.A01 = linkWithText;
        this.A03 = str;
        this.A02 = linkWithText2;
        this.A00 = instagramProductTaggabilityState;
        this.A04 = str2;
    }
}
