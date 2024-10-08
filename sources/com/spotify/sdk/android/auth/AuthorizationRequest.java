package com.spotify.sdk.android.auth;

import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C66581MXm;
import X.DbS;
import X.DbT;
import X.Pxe;
import X.Pxf;
import X.Pxh;
import X.SWU;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.Iterator;
import java.util.Map;

public class AuthorizationRequest implements Parcelable {
    public static final Parcelable.Creator CREATOR = new SWU(52);
    public final String A00;
    public final String A01;
    public final String A02;
    public final String A03;
    public final String A04;
    public final String[] A05;
    public final Map A06;
    public final boolean A07;

    public final int describeContents() {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.A01);
        parcel.writeString(this.A03);
        parcel.writeString(this.A02);
        parcel.writeString(this.A04);
        parcel.writeStringArray(this.A05);
        parcel.writeByte(this.A07 ? (byte) 1 : 0);
        parcel.writeString(this.A00);
        Bundle A0a = AnonymousClass7TE.A0a();
        Iterator A0u = AnonymousClass7TF.A0u(this.A06);
        while (A0u.hasNext()) {
            Pxh.A17(A0a, A0u);
        }
        parcel.writeBundle(A0a);
    }

    public AuthorizationRequest(Parcel parcel) {
        this.A01 = parcel.readString();
        this.A03 = parcel.readString();
        this.A02 = parcel.readString();
        this.A04 = parcel.readString();
        this.A05 = parcel.createStringArray();
        this.A07 = C66581MXm.A1V(parcel.readByte());
        this.A06 = AnonymousClass7TE.A1E();
        this.A00 = parcel.readString();
        Bundle readBundle = parcel.readBundle(Pxf.A0W(this));
        Iterator A0t = Pxf.A0t(readBundle);
        while (A0t.hasNext()) {
            String A18 = AnonymousClass7TE.A18(A0t);
            this.A06.put(A18, readBundle.getString(A18));
        }
    }

    public final Uri A00() {
        int length;
        Uri.Builder A0I = Pxe.A0I();
        String str = "android-sdk";
        Uri.Builder appendQueryParameter = A0I.scheme("https").authority("accounts.spotify.com").appendPath("authorize").appendQueryParameter("client_id", this.A01).appendQueryParameter("response_type", this.A03).appendQueryParameter("redirect_uri", this.A02).appendQueryParameter("show_dialog", String.valueOf(this.A07)).appendQueryParameter("utm_source", "spotify-sdk").appendQueryParameter("utm_medium", str);
        String str2 = this.A00;
        if (!TextUtils.isEmpty(str2)) {
            str = str2;
        }
        appendQueryParameter.appendQueryParameter("utm_campaign", str);
        String[] strArr = this.A05;
        if (strArr != null && (length = strArr.length) > 0) {
            StringBuilder A1A = AnonymousClass7TE.A1A();
            int i = 0;
            do {
                A1A.append(strArr[i]);
                A1A.append(" ");
                i++;
            } while (i < length);
            A0I.appendQueryParameter("scope", A1A.toString().trim());
        }
        String str3 = this.A04;
        if (str3 != null) {
            A0I.appendQueryParameter(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATE, str3);
        }
        Map map = this.A06;
        if (map.size() > 0) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                A0I.appendQueryParameter(DbT.A13(A1J), DbS.A0s(A1J));
            }
        }
        return A0I.build();
    }

    public AuthorizationRequest(String str, String str2, Map map, String[] strArr) {
        this.A01 = str;
        this.A03 = IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_CODE;
        this.A02 = str2;
        this.A04 = null;
        this.A05 = strArr;
        this.A07 = false;
        this.A06 = map;
        this.A00 = "instagram_save";
    }
}
