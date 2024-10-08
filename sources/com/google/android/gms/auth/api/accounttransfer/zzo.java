package com.google.android.gms.auth.api.accounttransfer;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.Pxf;
import X.SWW;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.views.progressbar.ReactProgressBarViewManager;
import com.google.android.gms.common.server.response.FastJsonResponse$Field;
import com.google.android.gms.internal.auth.zzbz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public final class zzo extends zzbz {
    public static final HashMap A05;
    public static final Parcelable.Creator CREATOR = SWW.A00(80);
    public zzs A00;
    public ArrayList A01;
    public int A02;
    public final int A03;
    public final Set A04;

    static {
        HashMap A1E = AnonymousClass7TE.A1E();
        A05 = A1E;
        A1E.put(PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, new FastJsonResponse$Field(zzu.class, PublicKeyCredentialControllerUtility.JSON_KEY_AUTH_DATA, 11, 11, 2, true, true));
        A1E.put(ReactProgressBarViewManager.PROP_PROGRESS, new FastJsonResponse$Field(zzs.class, ReactProgressBarViewManager.PROP_PROGRESS, 11, 11, 4, false, false));
    }

    public zzo(zzs zzs, ArrayList arrayList, Set set, int i, int i2) {
        this.A04 = set;
        this.A03 = i;
        this.A01 = arrayList;
        this.A02 = i2;
        this.A00 = zzs;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        Set set = this.A04;
        if (Pxf.A1U(set, 1)) {
            C301145yd.A07(parcel, 1, this.A03);
        }
        if (Pxf.A1U(set, 2)) {
            C301145yd.A0E(parcel, this.A01, 2, true);
        }
        if (Pxf.A1U(set, 3)) {
            C301145yd.A07(parcel, 3, this.A02);
        }
        if (Pxf.A1U(set, 4)) {
            C301145yd.A0A(parcel, this.A00, 4, i, true);
        }
        C301145yd.A06(parcel, A032);
    }

    public zzo() {
        this.A04 = new HashSet(1);
        this.A03 = 1;
    }
}
