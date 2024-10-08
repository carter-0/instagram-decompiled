package com.instagram.shopping.intf;

import X.0qQ;
import X.AnonymousClass000;
import X.AnonymousClass3ZA;
import X.C51975G9x;
import X.C66579MXk;
import X.DbX;
import X.Pxd;
import X.W6F;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.instagram.api.schemas.RankingInfo;
import com.instagram.model.shopping.productfeed.ProductTileMedia;
import com.instagram.shopping.model.analytics.ShoppingGuideLoggingInfo;
import com.instagram.shopping.model.analytics.ShoppingSearchLoggingInfo;
import com.instagram.user.model.Product;
import com.instagram.user.model.User;
import java.util.TimeZone;
import org.json.JSONObject;

public final class ProductDetailsPageArguments implements Parcelable {
    public static final W6F CREATOR = new W6F(38);
    public final long A00;
    public final Bundle A01;
    public final RankingInfo A02;
    public final ProductTileMedia A03;
    public final ShoppingGuideLoggingInfo A04;
    public final ShoppingSearchLoggingInfo A05;
    public final Product A06;
    public final Integer A07;
    public final Integer A08;
    public final Integer A09;
    public final String A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final String A0E;
    public final String A0F;
    public final String A0G;
    public final String A0H;
    public final String A0I;
    public final String A0J;
    public final String A0K;
    public final String A0L;
    public final String A0M;
    public final String A0N;
    public final String A0O;
    public final String A0P;
    public final String A0Q;
    public final String A0R;
    public final String A0S;
    public final String A0T;
    public final String A0U;
    public final String A0V;
    public final String A0W;
    public final String A0X;
    public final String A0Y;
    public final JSONObject A0Z;
    public final boolean A0a;
    public final boolean A0b;
    public final boolean A0c;
    public final boolean A0d;
    public final boolean A0e;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        0qQ.A0B(parcel, 0);
        parcel.writeString(this.A0H);
        parcel.writeString(this.A0Q);
        parcel.writeString(this.A0R);
        parcel.writeParcelable(this.A03, i);
        parcel.writeString(this.A0K);
        parcel.writeString(this.A0E);
        parcel.writeString(this.A0F);
        parcel.writeValue(this.A08);
        parcel.writeValue(this.A07);
        parcel.writeString(this.A0V);
        parcel.writeByte(this.A0b ? (byte) 1 : 0);
        parcel.writeString(this.A0M);
        parcel.writeValue(this.A09);
        parcel.writeParcelable(this.A06, i);
        parcel.writeString(this.A0U);
        parcel.writeString(this.A0O);
        parcel.writeString(this.A0N);
        parcel.writeByte(this.A0d ? (byte) 1 : 0);
        parcel.writeString(this.A0I);
        parcel.writeParcelable(this.A05, i);
        parcel.writeByte(this.A0e ? (byte) 1 : 0);
        parcel.writeParcelable(this.A04, i);
        parcel.writeString(this.A0W);
        parcel.writeLong(this.A00);
        parcel.writeBundle(this.A01);
        parcel.writeParcelable(this.A02, i);
        parcel.writeString(this.A0P);
        parcel.writeString(this.A0Y);
        parcel.writeByte(this.A0a ? (byte) 1 : 0);
        parcel.writeString(this.A0G);
        parcel.writeString(this.A0D);
        parcel.writeString(this.A0A);
        parcel.writeString(this.A0C);
        parcel.writeString(this.A0B);
        parcel.writeString(this.A0S);
        parcel.writeString(this.A0T);
        parcel.writeString(DbX.A0t(this.A0Z));
        parcel.writeByte(this.A0c ? (byte) 1 : 0);
        parcel.writeString(this.A0J);
        String str = this.A0X;
        if (str == null) {
            str = TimeZone.getDefault().getID();
        }
        parcel.writeString(str);
        parcel.writeString(this.A0L);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ProductDetailsPageArguments(entryPoint='");
        sb.append(this.A0H);
        sb.append("', priorModule='");
        sb.append(this.A0Q);
        sb.append("', priorSubmodule=");
        sb.append(this.A0R);
        sb.append(", heroCarouselPinnedMedia=");
        sb.append(this.A03);
        sb.append(", heroCarouselPinnedMediaId=");
        sb.append(this.A0K);
        sb.append(", callSiteOverridePinnedMediaId=");
        sb.append(this.A0E);
        sb.append(", callSiteOverridePinnedMediaUrl=");
        sb.append(this.A0F);
        sb.append(", callSiteOverridePinnedMediaWidth=");
        sb.append(this.A08);
        sb.append(", callSiteOverridePinnedMediaHeight=");
        sb.append(this.A07);
        sb.append(", referencePrice=");
        sb.append(this.A0V);
        sb.append(", shouldShowAllCatalogImagesLast=");
        sb.append(this.A0b);
        sb.append(", mediaId=");
        sb.append(this.A0M);
        sb.append(", mediaCarouselIndex=");
        sb.append(this.A09);
        sb.append(Pxd.A00(117));
        sb.append(this.A06);
        sb.append(C66579MXk.A00(439));
        sb.append(this.A0O);
        sb.append(", isLastSavedItem=");
        sb.append(this.A0d);
        sb.append(", featuredProductPermissionId=");
        sb.append(this.A0I);
        sb.append(", shoppingSearchLoggingInfo=");
        sb.append(this.A05);
        sb.append(", isShowingAsSwipeUp=");
        sb.append(this.A0e);
        sb.append(", shoppingGuideLoggingInfo=");
        sb.append(this.A04);
        sb.append(", shopsFirstEntryPoint=");
        sb.append(this.A0W);
        sb.append(", shopsProfileEntryIgId=");
        sb.append(this.A00);
        sb.append(", analyticsExtras=");
        sb.append(this.A01);
        sb.append(", shoppingRankingLoggingInfo=");
        sb.append(this.A02);
        sb.append(", navBar=");
        sb.append(this.A0P);
        sb.append(", upcomingEventId=");
        sb.append(this.A0Y);
        sb.append(", isFromAd=");
        sb.append(this.A0a);
        sb.append(", collectionPageId=");
        sb.append(this.A0G);
        sb.append(", affiliateMarketerId=");
        sb.append(this.A0D);
        sb.append(Pxd.A00(112));
        sb.append(this.A0A);
        sb.append(AnonymousClass000.A00(1995));
        sb.append(this.A0C);
        sb.append(", adMediaId=");
        sb.append(this.A0B);
        sb.append(Pxd.A00(116));
        sb.append(this.A0N);
        sb.append(Pxd.A00(48));
        sb.append(this.A0U);
        sb.append(", isCpdpDisabled=");
        sb.append(this.A0c);
        sb.append(", giftRecipientId=");
        sb.append(this.A0J);
        sb.append(", timezone=");
        sb.append(this.A0X);
        sb.append(", layoutType=");
        return C51975G9x.A0i(this.A0L, sb);
    }

    public ProductDetailsPageArguments(Bundle bundle, RankingInfo rankingInfo, ProductTileMedia productTileMedia, ShoppingGuideLoggingInfo shoppingGuideLoggingInfo, ShoppingSearchLoggingInfo shoppingSearchLoggingInfo, Product product, Integer num, Integer num2, Integer num3, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, String str16, String str17, String str18, String str19, String str20, String str21, String str22, String str23, String str24, String str25, JSONObject jSONObject, long j, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        User user;
        String str26 = str11;
        this.A0H = str;
        this.A0Q = str2;
        this.A0R = str3;
        this.A03 = productTileMedia;
        this.A0K = str4;
        this.A0E = str5;
        this.A0F = str6;
        this.A08 = num;
        this.A07 = num2;
        this.A0V = str7;
        this.A0b = z;
        this.A0M = str8;
        this.A09 = num3;
        this.A06 = product;
        this.A0O = str10;
        this.A0d = z2;
        this.A0I = str12;
        this.A05 = shoppingSearchLoggingInfo;
        this.A0e = z3;
        this.A04 = shoppingGuideLoggingInfo;
        this.A0W = str13;
        this.A00 = j;
        this.A01 = bundle;
        this.A02 = rankingInfo;
        this.A0P = str14;
        this.A0Y = str15;
        this.A0a = z4;
        this.A0G = str16;
        this.A0D = str17;
        this.A0A = str18;
        this.A0C = str19;
        this.A0B = str20;
        this.A0S = str21;
        this.A0T = str22;
        this.A0Z = jSONObject;
        this.A0c = z5;
        this.A0J = str23;
        this.A0X = str24;
        this.A0L = str25;
        String str27 = null;
        if (str11 == null) {
            if (product == null || (user = product.A0B) == null) {
                str26 = null;
            } else {
                str26 = AnonymousClass3ZA.A00(user);
            }
        }
        this.A0N = str26;
        if (str9 != null) {
            str27 = str9;
        } else if (product != null) {
            str27 = product.A0H;
        }
        this.A0U = str27;
    }
}
