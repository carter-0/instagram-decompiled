package com.instagram.model.effect;

import X.0lg;
import X.1Ng;
import X.AnonymousClass05K;
import X.AnonymousClass1Nd;
import X.AnonymousClass7TF;
import X.C243373Ym;
import X.C62622Kit;
import X.C71269Ogb;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.EffectThumbnailImageDict;
import com.instagram.model.shopping.ProductAREffectContainer;
import com.instagram.user.model.User;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class AttributedAREffect extends AREffect {
    public static final Parcelable.Creator CREATOR = C71269Ogb.A00(51);
    public int A00;
    public ImageUrl A01;
    public ImageUrl A02;
    public C62622Kit A03;
    public ProductAREffectContainer A04;
    public C243373Ym A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public List A0E;
    public List A0F;
    public List A0G;

    public AttributedAREffect(ImageUrl imageUrl, ImageUrl imageUrl2, C62622Kit kit, ProductAREffectContainer productAREffectContainer, String str, String str2, String str3, String str4, String str5, String str6, String str7, List list, List list2, List list3, int i, boolean z) {
        C243373Ym r1;
        this.A09 = str;
        this.A0A = str2;
        this.A02 = imageUrl;
        this.A07 = str3;
        this.A06 = str4;
        this.A01 = imageUrl2;
        this.A00 = i;
        if (z) {
            r1 = C243373Ym.SAVED;
        } else {
            r1 = C243373Ym.NOT_SAVED;
        }
        this.A05 = r1;
        this.A0E = list;
        this.A0G = list2;
        this.A0F = list3;
        this.A08 = str5;
        this.A0D = null;
        this.A0B = str6;
        this.A04 = productAREffectContainer;
        this.A0C = str7;
        this.A03 = kit;
    }

    public final String A04() {
        return null;
    }

    public final String A06() {
        return "0";
    }

    public final String A07() {
        return null;
    }

    public final List A08() {
        return null;
    }

    public final List A09() {
        return null;
    }

    public final boolean A0C() {
        return false;
    }

    public final int describeContents() {
        return 0;
    }

    public final ImageUrl A01() {
        EffectThumbnailImageDict effectThumbnailImageDict;
        ImageUrl imageUrl;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer == null || (effectThumbnailImageDict = productAREffectContainer.A00.A00.A02) == null || (imageUrl = effectThumbnailImageDict.A00) == null) {
            return this.A02;
        }
        return imageUrl;
    }

    public final String A02() {
        return this.A06;
    }

    public final String A03() {
        User user;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer == null || (user = productAREffectContainer.A00.A01.A0G) == null) {
            return this.A07;
        }
        return user.getUsername();
    }

    public final String A05() {
        String str;
        ProductAREffectContainer productAREffectContainer = this.A04;
        if (productAREffectContainer == null || (str = productAREffectContainer.A00.A01.A0e) == null) {
            return this.A0A;
        }
        return str;
    }

    public final List A0A() {
        return this.A0E;
    }

    public final List A0B() {
        return this.A0G;
    }

    public final C243373Ym BpO() {
        return this.A05;
    }

    public final String BpP() {
        String str = this.A09;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final Collection BpQ() {
        return Collections.EMPTY_LIST;
    }

    public final Integer BpT() {
        return AnonymousClass05K.A0N;
    }

    public final boolean CbC() {
        return AnonymousClass7TF.A1W(this.A05, C243373Ym.SAVED);
    }

    public final String getId() {
        return this.A09;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A09);
        parcel.writeString(this.A0A);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A07);
        parcel.writeString(this.A06);
        parcel.writeParcelable(this.A01, i);
        parcel.writeInt(this.A00);
        parcel.writeByte(AnonymousClass7TF.A1W(this.A05, C243373Ym.SAVED) ? (byte) 1 : 0);
        parcel.writeStringList(this.A0E);
        parcel.writeStringList(this.A0G);
        parcel.writeString(this.A0C);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0B);
        parcel.writeStringList(this.A0F);
        parcel.writeString(this.A08);
        parcel.writeString(this.A0D);
        parcel.writeSerializable(this.A03);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.1qK, java.lang.Object, X.8Yi] */
    public final void AE7(0lg r5) {
        1Ng A002 = AnonymousClass1Nd.A00(r5);
        String str = this.A09;
        C243373Ym r1 = this.A05;
        ? obj = new Object();
        obj.A01 = str;
        obj.A00 = r1;
        A002.A00(obj);
    }

    public final void EjB(C243373Ym r1) {
        this.A05 = r1;
    }
}
