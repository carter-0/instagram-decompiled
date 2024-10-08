package com.instagram.api.schemas;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C41847B3o;
import X.C44533CgT;
import X.FK6;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.common.textwithentities.model.TextWithEntities;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;

public final class TextWithEntitiesBlockDict extends AnonymousClass0T0 implements Parcelable, TextWithEntitiesBlockDictIntf {
    public static final Parcelable.Creator CREATOR = new FK6(41);
    public final TextWithEntities A00;
    public final Integer A01;
    public final String A02;

    public final TextWithEntitiesBlockDict FCq() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof TextWithEntitiesBlockDict) {
                TextWithEntitiesBlockDict textWithEntitiesBlockDict = (TextWithEntitiesBlockDict) obj;
                if (!0qQ.A0K(this.A02, textWithEntitiesBlockDict.A02) || !0qQ.A0K(this.A01, textWithEntitiesBlockDict.A01) || !0qQ.A0K(this.A00, textWithEntitiesBlockDict.A00)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A02);
        parcel.writeInt(C41847B3o.A00(parcel, this.A01));
        parcel.writeParcelable(this.A00, i);
    }

    public final Integer AwO() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ TextWithEntitiesIntf C5k() {
        return this.A00;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTTextWithEntitiesBlockDict", C44533CgT.A00(this));
    }

    public final String getBlockType() {
        return this.A02;
    }

    public final int hashCode() {
        return (((AnonymousClass7TG.A0E(this.A02) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TE.A0L(this.A00);
    }

    public TextWithEntitiesBlockDict(TextWithEntities textWithEntities, Integer num, String str) {
        this.A02 = str;
        this.A01 = num;
        this.A00 = textWithEntities;
    }
}
