package com.instagram.model.shopping;

import X.0qQ;
import X.17Z;
import X.AnonymousClass000;
import X.AnonymousClass3ZA;
import X.C14502TxO;
import X.C273654mx;
import X.C62630Kj1;
import X.C71269Ogb;
import X.JTO;
import android.graphics.PointF;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.model.shopping.productintfs.TaggingFeedSessionInformation;
import com.instagram.tagging.model.Tag;
import com.instagram.tagging.model.TaggableModel;
import com.instagram.user.model.Product;
import com.instagram.user.model.ProductDetailsProductItemDictIntf;

public class ProductTag extends Tag {
    public static final Parcelable.Creator CREATOR = new C71269Ogb(88);
    public int A00;
    public ProductAutoTagMetadata A01;
    public ProductDetailsProductItemDictIntf A02;
    public String A03;
    public boolean A04;

    public final String A03() {
        return "product_id";
    }

    public final PointF A00() {
        return this.A00;
    }

    public final C62630Kj1 A01() {
        return C62630Kj1.PRODUCT;
    }

    public final String A04() {
        return this.A02.getName();
    }

    public final /* bridge */ /* synthetic */ void A06(TaggableModel taggableModel) {
        Product product = (Product) taggableModel;
        0qQ.A0B(product, 0);
        this.A02 = product.A01;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        return this.A02.equals(((ProductTag) obj).A02);
    }

    public final int hashCode() {
        return this.A02.hashCode();
    }

    public ProductTag(Product product) {
        this.A03 = null;
        this.A01 = null;
        0qQ.A0B(product, 0);
        this.A02 = product.A01;
    }

    public final /* bridge */ /* synthetic */ TaggableModel A02() {
        return JTO.A0q(this);
    }

    public final void A05(17Z r3) {
        r3.A0R("merchant_id", AnonymousClass3ZA.A00(JTO.A0q(this).A0B));
        if (!(JTO.A0q(this).A04 == null || JTO.A0q(this).A04.AaC() == null)) {
            r3.A0R(C273654mx.A00(533), JTO.A0q(this).A04.AaC());
        }
        if (JTO.A0q(this).A00 != null) {
            r3.A0R("waterfall_id", JTO.A0q(this).A00.A01);
            r3.A0R("session_instance_id", JTO.A0q(this).A00.A00);
        }
        String str = this.A03;
        if (str != null) {
            r3.A0R(AnonymousClass000.A00(2941), str);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
        parcel.writeString(this.A03);
        parcel.writeParcelable(this.A01, i);
    }

    public ProductTag() {
        this(new Product((TaggingFeedSessionInformation) null, C14502TxO.A01()));
    }
}
