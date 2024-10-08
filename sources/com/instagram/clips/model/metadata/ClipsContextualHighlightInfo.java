package com.instagram.clips.model.metadata;

import X.0qQ;
import X.AnonymousClass0T0;
import X.C376419Hx;
import X.C41878B4w;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContextualHighlightType;

public final class ClipsContextualHighlightInfo extends AnonymousClass0T0 implements Parcelable, ClipsContextualHighlightInfoIntf {
    public static final Parcelable.Creator CREATOR = new C376419Hx(68);
    public final ContextualHighlightType A00;
    public final String A01;
    public final String A02;
    public final String A03;

    public ClipsContextualHighlightInfo(ContextualHighlightType contextualHighlightType, String str, String str2, String str3) {
        0qQ.A0B(str2, 2);
        0qQ.A0B(str3, 3);
        0qQ.A0B(contextualHighlightType, 4);
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
        this.A00 = contextualHighlightType;
    }

    public final ClipsContextualHighlightInfo FDg() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ClipsContextualHighlightInfo) {
                ClipsContextualHighlightInfo clipsContextualHighlightInfo = (ClipsContextualHighlightInfo) obj;
                if (!0qQ.A0K(this.A01, clipsContextualHighlightInfo.A01) || !0qQ.A0K(this.A02, clipsContextualHighlightInfo.A02) || !0qQ.A0K(this.A03, clipsContextualHighlightInfo.A03) || this.A00 != clipsContextualHighlightInfo.A00) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.A01;
        return ((((((str == null ? 0 : str.hashCode()) * 31) + this.A02.hashCode()) * 31) + this.A03.hashCode()) * 31) + this.A00.hashCode();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A01);
        parcel.writeString(this.A02);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A00, i);
    }

    public final ContextualHighlightType Ar9() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return new TreeUpdaterJNI("XDTContextualHighlightInfo", C41878B4w.A00(this));
    }

    public final String getChainingMediaId() {
        return this.A01;
    }

    public final String getContextualHighlightId() {
        return this.A02;
    }

    public final String getContextualHighlightTitle() {
        return this.A03;
    }
}
