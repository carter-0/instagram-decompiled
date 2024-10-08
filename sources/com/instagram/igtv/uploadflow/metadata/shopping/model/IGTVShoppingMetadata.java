package com.instagram.igtv.uploadflow.metadata.shopping.model;

import X.0qQ;
import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.DbY;
import X.JTR;
import X.W6E;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class IGTVShoppingMetadata implements Parcelable {
    public static final W6E CREATOR = new W6E(77);
    public TaggingFeedSessionInformation A00;
    public String A01;
    public String A02;
    public List A03;
    public Map A04;
    public boolean A05;

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        String str;
        String str2;
        if (this != obj) {
            if (obj != null && DbY.A1b(this, obj)) {
                IGTVShoppingMetadata iGTVShoppingMetadata = (IGTVShoppingMetadata) obj;
                String str3 = this.A02;
                if (str3 == null || (str2 = iGTVShoppingMetadata.A02) == null) {
                    str = "merchantId";
                } else if (str3.equals(str2)) {
                    List list = this.A03;
                    if (list != null) {
                        HashSet hashSet = new HashSet(list);
                        List list2 = iGTVShoppingMetadata.A03;
                        if (list2 != null) {
                            if (!hashSet.equals(new HashSet(list2)) || !0qQ.A0K(this.A01, iGTVShoppingMetadata.A01)) {
                                return false;
                            }
                        }
                    }
                    str = "productIds";
                }
                0qQ.A0F(str);
                throw AnonymousClass00P.createAndThrow();
            }
            return false;
        }
        return true;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String str;
        0qQ.A0B(parcel, 0);
        String str2 = this.A02;
        if (str2 != null) {
            parcel.writeString(str2);
            List list = this.A03;
            if (list != null) {
                parcel.writeStringList(list);
                parcel.writeString(this.A01);
                return;
            }
            str = "productIds";
        } else {
            str = "merchantId";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final int hashCode() {
        String str;
        String str2 = this.A02;
        if (str2 != null) {
            int A0O = AnonymousClass7TE.A0O(str2);
            List list = this.A03;
            if (list != null) {
                return AnonymousClass7TF.A07(list, A0O) + JTR.A0G(this.A01);
            }
            str = "productIds";
        } else {
            str = "merchantId";
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
