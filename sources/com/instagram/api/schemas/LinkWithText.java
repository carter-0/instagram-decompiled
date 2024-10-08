package com.instagram.api.schemas;

import X.0Yt;
import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import java.util.LinkedHashMap;

public final class LinkWithText extends AnonymousClass0T0 implements Parcelable, LinkWithTextIntf {
    public static final Parcelable.Creator CREATOR = new FK5(53);
    public final String A00;
    public final String A01;

    public final LinkWithText F5P() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof LinkWithText) {
                LinkWithText linkWithText = (LinkWithText) obj;
                if (!0qQ.A0K(this.A00, linkWithText.A00) || !0qQ.A0K(this.A01, linkWithText.A01)) {
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
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getText() != null) {
            C41845B3m.A10(getText(), A1H);
        }
        if (getUrl() != null) {
            C41845B3m.A0y(getUrl(), A1H);
        }
        return C41845B3m.A0T("XDTLinkWithText", 0Yt.A0B(A1H));
    }

    public final String getText() {
        return this.A00;
    }

    public final String getUrl() {
        return this.A01;
    }

    public final int hashCode() {
        return C41845B3m.A01(this.A01, AnonymousClass7TE.A0O(this.A00));
    }

    public LinkWithText(String str, String str2) {
        AnonymousClass7TG.A1O(str, str2);
        this.A00 = str;
        this.A01 = str2;
    }
}
