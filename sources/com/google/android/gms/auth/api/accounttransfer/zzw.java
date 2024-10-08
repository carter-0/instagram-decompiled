package com.google.android.gms.auth.api.accounttransfer;

import X.04u;
import X.AnonymousClass7TE;
import X.C301145yd;
import X.Pxf;
import X.SWW;
import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.HashMap;
import java.util.Set;

public final class zzw extends zzbz {
    public static final HashMap A07;
    public static final Parcelable.Creator CREATOR = SWW.A00(83);
    public int A00;
    public String A01;
    public byte[] A02;
    public PendingIntent A03;
    public DeviceMetaData A04;
    public final int A05;
    public final Set A06;

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A07 = A1E;
        A1E.put("accountType", new FastJsonResponse$Field((Class) null, "accountType", 7, 7, 2, false, false));
        A1E.put(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, new FastJsonResponse$Field((Class) null, IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, 0, 0, 3, false, false));
        A1E.put("transferBytes", new FastJsonResponse$Field((Class) null, "transferBytes", 8, 8, 4, false, false));
    }

    public zzw(PendingIntent pendingIntent, DeviceMetaData deviceMetaData, String str, Set set, byte[] bArr, int i, int i2) {
        this.A06 = set;
        this.A05 = i;
        this.A01 = str;
        this.A00 = i2;
        this.A02 = bArr;
        this.A03 = pendingIntent;
        this.A04 = deviceMetaData;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        Set set = this.A06;
        if (Pxf.A1U(set, 1)) {
            C301145yd.A07(parcel, 1, this.A05);
        }
        if (Pxf.A1U(set, 2)) {
            C301145yd.A0C(parcel, this.A01, 2, true);
        }
        if (Pxf.A1U(set, 3)) {
            C301145yd.A07(parcel, 3, this.A00);
        }
        if (Pxf.A1U(set, 4)) {
            C301145yd.A0F(parcel, this.A02, 4, true);
        }
        if (Pxf.A1U(set, 5)) {
            C301145yd.A0A(parcel, this.A03, 5, i, true);
        }
        if (Pxf.A1U(set, 6)) {
            C301145yd.A0A(parcel, this.A04, 6, i, true);
        }
        C301145yd.A06(parcel, A032);
    }

    public zzw() {
        this.A06 = new 04u(3);
        this.A05 = 1;
    }
}
