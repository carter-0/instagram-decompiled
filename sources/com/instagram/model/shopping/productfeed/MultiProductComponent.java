package com.instagram.model.shopping.productfeed;

import X.2PP;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C16558UxA;
import X.C16671Uz7;
import X.C16675UzB;
import X.C268374dH;
import X.C41847B3o;
import X.JTQ;
import X.JTR;
import X.LVO;
import X.WZC;
import X.X9B;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.ProductCardSubtitleType;
import com.instagram.common.session.UserSession;
import com.instagram.model.shopping.reels.ProductCollectionLink;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class MultiProductComponent implements C268374dH, Parcelable {
    public static final Parcelable.Creator CREATOR = new LVO(12);
    public int A00;
    public C16558UxA A01;
    public C16671Uz7 A02;
    public ProductFeedResponse A03;
    public C16675UzB A04;
    public ProductCollectionLink A05;
    public String A06;
    public String A07;
    public String A08;
    public final Map A09;

    public final String Bxn() {
        return null;
    }

    public final String Bxr() {
        return null;
    }

    public final String C2K() {
        return null;
    }

    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MultiProductComponent)) {
            return false;
        }
        MultiProductComponent multiProductComponent = (MultiProductComponent) obj;
        return 2PP.A00(this.A04, multiProductComponent.A04) && 2PP.A00(this.A06, multiProductComponent.A06) && 2PP.A00(this.A07, multiProductComponent.A07) && 2PP.A00(this.A08, multiProductComponent.A08) && this.A02 == multiProductComponent.A02 && this.A01 == multiProductComponent.A01 && this.A00 == multiProductComponent.A00 && 2PP.A00(this.A03, multiProductComponent.A03) && 2PP.A00(this.A05, multiProductComponent.A05);
    }

    public final String A00() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.A04);
        sb.append("_");
        return AnonymousClass7TF.A0i(this.A02, sb);
    }

    public final void A01() {
        Iterator A0h = JTQ.A0h(this.A03.A03);
        while (A0h.hasNext()) {
            ProductFeedItem productFeedItem = (ProductFeedItem) A0h.next();
            this.A09.put(productFeedItem.getId(), productFeedItem);
        }
    }

    public final void A02(ProductFeedItem productFeedItem) {
        Map map = this.A09;
        if (!map.containsKey(productFeedItem.getId())) {
            this.A03.A03.add(0, productFeedItem);
            map.put(productFeedItem.getId(), productFeedItem);
            this.A00++;
        }
    }

    public final boolean A03(String str) {
        Map map = this.A09;
        ProductFeedItem productFeedItem = (ProductFeedItem) map.get(str);
        if (productFeedItem == null) {
            return false;
        }
        ProductFeedResponse productFeedResponse = this.A03;
        String id = productFeedItem.getId();
        Iterator it = productFeedResponse.A03.iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (((ProductFeedItem) it.next()).getId().equals(id)) {
                it.remove();
                z = true;
            }
        }
        if (!z) {
            return false;
        }
        map.remove(str);
        this.A00--;
        return true;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.X9B, java.lang.Object] */
    public final X9B Aif() {
        ProductCollectionLink productCollectionLink = this.A05;
        if (productCollectionLink != null) {
            return new WZC(productCollectionLink);
        }
        return new Object();
    }

    public final C16675UzB B5W() {
        return this.A04;
    }

    public final ProductCardSubtitleType Bfz() {
        return ProductCardSubtitleType.PRICE_WITH_SOLD_OUT;
    }

    public final ProductFeedResponse Bg7() {
        return this.A03;
    }

    public final boolean Esx(UserSession userSession) {
        return AnonymousClass7TF.A1V(this.A05);
    }

    public final String getId() {
        return this.A06;
    }

    public final String getTitle() {
        return this.A07;
    }

    public final int hashCode() {
        int A0K = AnonymousClass7TE.A0K(this.A04);
        int i = 0;
        int A072 = AnonymousClass7TF.A07(this.A02, (AnonymousClass7TF.A08(this.A06, A0K) + JTR.A0G(this.A07)) * 31);
        int A073 = AnonymousClass7TF.A07(this.A03, (((AnonymousClass7TF.A07(this.A01, A072) + JTR.A0G(this.A08)) * 31) + this.A00) * 31);
        ProductCollectionLink productCollectionLink = this.A05;
        if (productCollectionLink != null) {
            i = productCollectionLink.hashCode();
        }
        return A073 + i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeSerializable(this.A04);
        parcel.writeString(this.A06);
        parcel.writeString(this.A07);
        parcel.writeString(this.A08);
        parcel.writeSerializable(this.A02);
        parcel.writeString(this.A01.A00);
        parcel.writeInt(this.A00);
        parcel.writeParcelable(this.A03, i);
        parcel.writeParcelable(this.A05, i);
    }

    public MultiProductComponent(Parcel parcel) {
        this.A02 = C16671Uz7.GRID;
        C16558UxA uxA = C16558UxA.BELOW_THUMBNAIL;
        this.A01 = uxA;
        this.A09 = new HashMap();
        Serializable readSerializable = parcel.readSerializable();
        readSerializable.getClass();
        this.A04 = (C16675UzB) readSerializable;
        String readString = parcel.readString();
        readString.getClass();
        this.A06 = readString;
        this.A07 = parcel.readString();
        String readString2 = parcel.readString();
        readString2.getClass();
        this.A08 = readString2;
        Serializable readSerializable2 = parcel.readSerializable();
        readSerializable2.getClass();
        this.A02 = (C16671Uz7) readSerializable2;
        C16558UxA uxA2 = (C16558UxA) C16558UxA.A01.get(parcel.readString());
        this.A01 = uxA2 == null ? uxA : uxA2;
        this.A00 = parcel.readInt();
        Parcelable A032 = C41847B3o.A03(parcel, ProductFeedResponse.class);
        A032.getClass();
        this.A03 = (ProductFeedResponse) A032;
        this.A05 = (ProductCollectionLink) C41847B3o.A03(parcel, ProductCollectionLink.class);
        A01();
    }

    public MultiProductComponent() {
        this.A02 = C16671Uz7.GRID;
        this.A01 = C16558UxA.BELOW_THUMBNAIL;
        this.A09 = new HashMap();
    }
}
