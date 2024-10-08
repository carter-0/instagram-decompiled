package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.C301145yd;
import X.DbS;
import X.Pxe;
import X.Pxf;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class AuthenticationExtensionsClientOutputs extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(81);
    public final AuthenticationExtensionsCredPropsOutputs A00;
    public final UvmEntries A01;
    public final zzf A02;
    public final zzh A03;
    public final String A04;

    public final boolean equals(Object obj) {
        if (!(obj instanceof AuthenticationExtensionsClientOutputs)) {
            return false;
        }
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = (AuthenticationExtensionsClientOutputs) obj;
        if (!SA1.A01(this.A01, authenticationExtensionsClientOutputs.A01) || !SA1.A01(this.A02, authenticationExtensionsClientOutputs.A02) || !SA1.A01(this.A00, authenticationExtensionsClientOutputs.A00) || !SA1.A01(this.A03, authenticationExtensionsClientOutputs.A03)) {
            return false;
        }
        return SA1.A00(this.A04, authenticationExtensionsClientOutputs.A04);
    }

    public final int hashCode() {
        return Pxf.A0C(this.A01, this.A02, this.A00, this.A03, this.A04);
    }

    public AuthenticationExtensionsClientOutputs(AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs, UvmEntries uvmEntries, zzf zzf, zzh zzh, String str) {
        this.A01 = uvmEntries;
        this.A02 = zzf;
        this.A00 = authenticationExtensionsCredPropsOutputs;
        this.A03 = zzh;
        this.A04 = str;
    }

    public final JSONObject A00() {
        RuntimeException runtimeException;
        try {
            JSONObject A11 = DbS.A11();
            AuthenticationExtensionsCredPropsOutputs authenticationExtensionsCredPropsOutputs = this.A00;
            if (authenticationExtensionsCredPropsOutputs != null) {
                try {
                    JSONObject A112 = DbS.A11();
                    A112.put(PublicKeyCredentialControllerUtility.JSON_KEY_RK, authenticationExtensionsCredPropsOutputs.A00);
                    A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_CRED_PROPS, A112);
                } catch (JSONException e) {
                    runtimeException = Pxe.A0u("Error encoding AuthenticationExtensionsCredPropsOutputs to JSON object", e);
                    throw runtimeException;
                }
            }
            UvmEntries uvmEntries = this.A01;
            if (uvmEntries != null) {
                try {
                    JSONArray A1E = Pxe.A1E();
                    List list = uvmEntries.A00;
                    if (list != null) {
                        for (int i = 0; i < list.size(); i++) {
                            UvmEntry uvmEntry = (UvmEntry) list.get(i);
                            JSONArray A1E2 = Pxe.A1E();
                            A1E2.put(uvmEntry.A02);
                            A1E2.put(uvmEntry.A01);
                            A1E2.put(uvmEntry.A02);
                            A1E.put(i, A1E2);
                        }
                    }
                    A11.put("uvm", A1E);
                } catch (JSONException e2) {
                    runtimeException = Pxe.A0u("Error encoding UvmEntries to JSON object", e2);
                    throw runtimeException;
                }
            }
            zzh zzh = this.A03;
            if (zzh != null) {
                A11.put("prf", zzh.A00());
            }
            String str = this.A04;
            if (str != null) {
                A11.put("txAuthSimple", str);
            }
            return A11;
        } catch (JSONException e3) {
            throw Pxe.A0u("Error encoding AuthenticationExtensionsClientOutputs to JSON object", e3);
        }
    }

    public final String toString() {
        return 002.A0g("AuthenticationExtensionsClientOutputs{", A00().toString(), "}");
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A032 = Pxf.A03(parcel);
        C301145yd.A0A(parcel, this.A01, 1, i, false);
        C301145yd.A0A(parcel, this.A02, 2, i, false);
        C301145yd.A0A(parcel, this.A00, 3, i, false);
        C301145yd.A0A(parcel, this.A03, 4, i, false);
        C301145yd.A0C(parcel, this.A04, 5, false);
        C301145yd.A06(parcel, A032);
    }
}
