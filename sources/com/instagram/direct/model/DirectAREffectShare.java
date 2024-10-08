package com.instagram.direct.model;

import X.0mp;
import X.AnonymousClass3HX;
import X.DbS;
import X.LVP;
import X.NML;
import X.O95;
import X.O96;
import X.OEI;
import X.OHW;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.user.model.User;
import java.util.Collections;
import java.util.List;

public final class DirectAREffectShare implements Parcelable {
    public static final Parcelable.Creator CREATOR = new LVP(91);
    public ImageUrl A00;
    public ImageUrl A01;
    public NML A02;
    public AnonymousClass3HX A03;
    public ProductAREffectContainer A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public List A09 = Collections.emptyList();
    public List A0A = Collections.emptyList();

    public final int describeContents() {
        return 0;
    }

    public final ImageUrl A00() {
        O96 o96;
        OHW ohw;
        O95 o95;
        EffectThumbnailImageDict effectThumbnailImageDict;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null && (effectThumbnailImageDict = productAREffectContainer.A00.A00.A02) != null) {
            return effectThumbnailImageDict.A00;
        }
        ImageUrl imageUrl = this.A01;
        if (imageUrl != null) {
            return imageUrl;
        }
        NML nml = this.A02;
        if (nml == null || (o96 = nml.A00) == null || (ohw = o96.A00) == null || (o95 = ohw.A03) == null || 0mp.A0B(o95.A00)) {
            return null;
        }
        return DbS.A0V(o95.A00);
    }

    public final String A01() {
        O96 o96;
        OHW ohw;
        User user;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer != null && (user = productAREffectContainer.A00.A01.A0G) != null) {
            return user.getUsername();
        }
        String str = this.A06;
        if (str != null) {
            return str;
        }
        NML nml = this.A02;
        if (!(nml == null || (o96 = nml.A00) == null || (ohw = o96.A00) == null)) {
            OEI oei = ohw.A00;
            if (oei == null) {
                return "Instagram";
            }
            String str2 = oei.A02;
            if (str2 != null) {
                return str2;
            }
        }
        return "";
    }

    public final String A02() {
        O96 o96;
        OHW ohw;
        String str;
        String str2 = this.A07;
        if (str2 == null) {
            NML nml = this.A02;
            str2 = "";
            if (nml == null || (o96 = nml.A00) == null || (ohw = o96.A00) == null || (str = ohw.A05) == null) {
                return str2;
            }
            return str;
        }
        return str2;
    }

    public final String A03() {
        String str;
        O96 o96;
        OHW ohw;
        String str2;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if ((productAREffectContainer == null || (str = productAREffectContainer.A00.A01.A0e) == null) && (str = this.A08) == null) {
            NML nml = this.A02;
            str = "";
            if (nml == null || (o96 = nml.A00) == null || (ohw = o96.A00) == null || (str2 = ohw.A06) == null) {
                return str;
            }
            return str2;
        }
        return str;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeParcelable(this.A01, i);
        parcel.writeString(this.A06);
        parcel.writeString(this.A05);
        parcel.writeParcelable(this.A00, i);
    }
}
