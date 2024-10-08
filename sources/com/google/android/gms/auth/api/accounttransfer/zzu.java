package com.google.android.gms.auth.api.accounttransfer;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.Pxf;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class zzu extends zzbz {
    public static final HashMap A06;
    public static final Parcelable.Creator CREATOR = SWW.A00(82);
    public zzw A00;
    public String A01;
    public String A02;
    public String A03;
    public final int A04;
    public final Set A05;

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A06 = A1E;
        A1E.put("authenticatorInfo", new FastJsonResponse$Field(zzw.class, "authenticatorInfo", 11, 11, 2, false, false));
        A1E.put(PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, new FastJsonResponse$Field((Class) null, PublicKeyCredentialControllerUtility.JSON_KEY_SIGNATURE, 7, 7, 3, false, false));
        A1E.put("package", new FastJsonResponse$Field((Class) null, "package", 7, 7, 4, false, false));
    }

    public zzu(zzw zzw, String str, String str2, String str3, Set set, int i) {
        this.A05 = set;
        this.A04 = i;
        this.A00 = zzw;
        this.A01 = str;
        this.A02 = str2;
        this.A03 = str3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        Set set = this.A05;
        if (Pxf.A1U(set, 1)) {
            C301145yd.A07(parcel, 1, this.A04);
        }
        if (Pxf.A1U(set, 2)) {
            C301145yd.A0A(parcel, this.A00, 2, i, true);
        }
        if (Pxf.A1U(set, 3)) {
            C301145yd.A0C(parcel, this.A01, 3, true);
        }
        if (Pxf.A1U(set, 4)) {
            C301145yd.A0C(parcel, this.A02, 4, true);
        }
        if (Pxf.A1U(set, 5)) {
            C301145yd.A0C(parcel, this.A03, 5, true);
        }
        C301145yd.A06(parcel, A032);
    }

    public zzu() {
        this.A05 = new HashSet(3);
        this.A04 = 1;
    }
}
