package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.C301145yd;
import X.DbS;
import X.Pxe;
import X.Pxf;
import X.Pxi;
import X.SA1;
import X.SWX;
import X.TAO;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzh extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(85);
    public final TAO A00;
    public final boolean A01;

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzh)) {
            return false;
        }
        zzh zzh = (zzh) obj;
        if (this.A01 == zzh.A01) {
            return SA1.A00(this.A00, zzh.A00);
        }
        return false;
    }

    public final int hashCode() {
        return Pxf.A0A(Boolean.valueOf(this.A01), this.A00);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        boolean z = this.A01;
        int A03 = Pxf.A03(parcel);
        C301145yd.A09(parcel, 1, z);
        C301145yd.A0F(parcel, Pxi.A1b(this.A00), 2, false);
        C301145yd.A06(parcel, A03);
    }

    public zzh(TAO tao, boolean z) {
        this.A01 = z;
        this.A00 = tao;
    }

    public final JSONObject A00() {
        byte[] bArr;
        try {
            JSONObject A11 = DbS.A11();
            if (this.A01) {
                A11.put("enabled", true);
            }
            TAO tao = this.A00;
            if (tao == null) {
                bArr = null;
            } else {
                bArr = tao.A03();
            }
            if (bArr != null) {
                JSONObject A112 = DbS.A11();
                A112.put("first", Base64.encodeToString(Arrays.copyOf(bArr, 32), 11));
                if (bArr.length == 64) {
                    A112.put("second", Base64.encodeToString(Arrays.copyOfRange(bArr, 32, 64), 11));
                }
                A11.put("results", A112);
            }
            return A11;
        } catch (JSONException e) {
            throw Pxe.A0u("Error encoding AuthenticationExtensionsPrfOutputs to JSON object", e);
        }
    }

    public final String toString() {
        return 002.A0g("AuthenticationExtensionsPrfOutputs{", A00().toString(), "}");
    }
}
