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

public final class IGCommentSheetMoreInfoImpl extends AnonymousClass0T0 implements Parcelable, IGCommentSheetMoreInfo {
    public static final Parcelable.Creator CREATOR = new FK5(15);
    public final String A00;
    public final String A01;

    public final IGCommentSheetMoreInfoImpl F4A() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGCommentSheetMoreInfoImpl) {
                IGCommentSheetMoreInfoImpl iGCommentSheetMoreInfoImpl = (IGCommentSheetMoreInfoImpl) obj;
                if (!0qQ.A0K(this.A00, iGCommentSheetMoreInfoImpl.A00) || !0qQ.A0K(this.A01, iGCommentSheetMoreInfoImpl.A01)) {
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

    public final String C5e() {
        return this.A01;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        LinkedHashMap A1H = AnonymousClass7TE.A1H();
        if (getText() != null) {
            C41845B3m.A10(getText(), A1H);
        }
        if (C5e() != null) {
            A1H.put("text_source", C5e());
        }
        return C41845B3m.A0T("XDTIGCommentSheetMoreInfo", 0Yt.A0B(A1H));
    }

    public final String getText() {
        return this.A00;
    }

    public final int hashCode() {
        return (AnonymousClass7TG.A0E(this.A00) * 31) + C41845B3m.A00(this.A01);
    }

    public IGCommentSheetMoreInfoImpl(String str, String str2) {
        this.A00 = str;
        this.A01 = str2;
    }
}
