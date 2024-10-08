package com.instagram.model.shopping;

import X.0qQ;
import X.AnonymousClass0T0;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass7TG;
import X.C41845B3m;
import X.C44910Cn0;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.facebook.pando.TreeUpdaterJNI;
import com.instagram.api.schemas.ContainerEffectEnum;
import com.instagram.api.schemas.DynamicEffectState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class ProductArEffectMetadata extends AnonymousClass0T0 implements Parcelable, ProductArEffectMetadataIntf {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(81);
    public final ContainerEffectEnum A00;
    public final DynamicEffectState A01;
    public final EffectThumbnailImageDict A02;
    public final String A03;
    public final String A04;
    public final HashMap A05;

    public final ProductArEffectMetadata FFJ() {
        return this;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ProductArEffectMetadata) {
                ProductArEffectMetadata productArEffectMetadata = (ProductArEffectMetadata) obj;
                if (this.A00 != productArEffectMetadata.A00 || this.A01 != productArEffectMetadata.A01 || !0qQ.A0K(this.A03, productArEffectMetadata.A03) || !0qQ.A0K(this.A05, productArEffectMetadata.A05) || !0qQ.A0K(this.A04, productArEffectMetadata.A04) || !0qQ.A0K(this.A02, productArEffectMetadata.A02)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeParcelable(this.A00, i);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A03);
        HashMap hashMap = this.A05;
        if (hashMap == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeInt(hashMap.size());
            Iterator A0s = AnonymousClass7TF.A0s(hashMap);
            while (A0s.hasNext()) {
                Map.Entry entry = (Map.Entry) A0s.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeString(this.A04);
        EffectThumbnailImageDict effectThumbnailImageDict = this.A02;
        if (effectThumbnailImageDict == null) {
            parcel.writeInt(0);
            return;
        }
        parcel.writeInt(1);
        effectThumbnailImageDict.writeToParcel(parcel, i);
    }

    public final ContainerEffectEnum AqK() {
        return this.A00;
    }

    public final DynamicEffectState Azb() {
        return this.A01;
    }

    public final /* bridge */ /* synthetic */ Map B06() {
        return this.A05;
    }

    public final String B07() {
        return this.A04;
    }

    public final /* bridge */ /* synthetic */ EffectThumbnailImageDictIntf B0G() {
        return this.A02;
    }

    public final TreeUpdaterJNI FHC() {
        TreeUpdaterJNI treeUpdaterJNI = TreeUpdaterJNI.$redex_init_class;
        return C41845B3m.A0T("XDTProductAREffectMetadataDict", C44910Cn0.A00(this));
    }

    public final String getEffectId() {
        return this.A03;
    }

    public final int hashCode() {
        return (((((((((AnonymousClass7TG.A0C(this.A00) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0E(this.A03)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0E(this.A04)) * 31) + AnonymousClass7TE.A0L(this.A02);
    }

    public ProductArEffectMetadata(ContainerEffectEnum containerEffectEnum, DynamicEffectState dynamicEffectState, EffectThumbnailImageDict effectThumbnailImageDict, String str, String str2, HashMap hashMap) {
        this.A00 = containerEffectEnum;
        this.A01 = dynamicEffectState;
        this.A03 = str;
        this.A05 = hashMap;
        this.A04 = str2;
        this.A02 = effectThumbnailImageDict;
    }
}
