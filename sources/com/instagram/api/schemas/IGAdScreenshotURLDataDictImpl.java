package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44169CYi;
import X.FK5;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;

public final class IGAdScreenshotURLDataDictImpl extends AnonymousClass0T0 implements Parcelable, IGAdScreenshotURLDataDict {
    public static final Parcelable.Creator CREATOR = new FK5(4);
    public final IGProjectPortalInfoDict A00;
    public final Integer A01;
    public final Integer A02;
    public final String A03;
    public final String A04;

    public final IGAdScreenshotURLDataDictImpl F3t() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof IGAdScreenshotURLDataDictImpl) {
                IGAdScreenshotURLDataDictImpl iGAdScreenshotURLDataDictImpl = (IGAdScreenshotURLDataDictImpl) obj;
                if (!0qQ.A0K(this.A03, iGAdScreenshotURLDataDictImpl.A03) || !0qQ.A0K(this.A01, iGAdScreenshotURLDataDictImpl.A01) || !0qQ.A0K(this.A00, iGAdScreenshotURLDataDictImpl.A00) || !0qQ.A0K(this.A04, iGAdScreenshotURLDataDictImpl.A04) || !0qQ.A0K(this.A02, iGAdScreenshotURLDataDictImpl.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A03);
        AnonymousClass7TG.A16(parcel, this.A01, 0, 1);
        parcel.writeParcelable(this.A00, i);
        parcel.writeString(this.A04);
        AnonymousClass7TG.A16(parcel, this.A02, 0, 1);
    }

    public final Integer BCu() {
        return this.A01;
    }

    public final IGProjectPortalInfoDict BPk() {
        return this.A00;
    }

    public final Integer CGY() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTIGAdScreenshotURLDataDict", C44169CYi.A00(this));
    }

    public final String getDominantColor() {
        return this.A03;
    }

    public final String getUrl() {
        return this.A04;
    }

    public final int hashCode() {
        return (((((((AnonymousClass7TG.A0E(this.A03) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public IGAdScreenshotURLDataDictImpl(IGProjectPortalInfoDict iGProjectPortalInfoDict, Integer num, Integer num2, String str, String str2) {
        this.A03 = str;
        this.A01 = num;
        this.A00 = iGProjectPortalInfoDict;
        this.A04 = str2;
        this.A02 = num2;
    }
}
