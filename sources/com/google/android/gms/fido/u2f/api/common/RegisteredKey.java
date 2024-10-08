package com.google.android.gms.fido.u2f.api.common;

import X.AnonymousClass3Qk;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C301145yd;
import X.C41845B3m;
import X.DbS;
import X.Pxf;
import X.Pxi;
import X.SWR;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

@Deprecated
public class RegisteredKey extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWR.A00(8);
    public String A00;
    public final KeyHandle A01;
    public final String A02;

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0010, code lost:
        if (r0 == null) goto L_0x0012;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r3 = 1
            if (r4 == r5) goto L_0x0033
            boolean r0 = r5 instanceof com.google.android.gms.fido.u2f.api.common.RegisteredKey
            r2 = 0
            if (r0 == 0) goto L_0x0024
            com.google.android.gms.fido.u2f.api.common.RegisteredKey r5 = (com.google.android.gms.fido.u2f.api.common.RegisteredKey) r5
            java.lang.String r1 = r4.A00
            java.lang.String r0 = r5.A00
            if (r1 != 0) goto L_0x0025
            if (r0 != 0) goto L_0x0024
        L_0x0012:
            com.google.android.gms.fido.u2f.api.common.KeyHandle r1 = r4.A01
            com.google.android.gms.fido.u2f.api.common.KeyHandle r0 = r5.A01
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0024
            java.lang.String r1 = r4.A02
            java.lang.String r0 = r5.A02
            if (r1 != 0) goto L_0x002c
            if (r0 == 0) goto L_0x0033
        L_0x0024:
            return r2
        L_0x0025:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0012
            return r2
        L_0x002c:
            boolean r0 = r1.equals(r0)
            if (r0 != 0) goto L_0x0033
            return r2
        L_0x0033:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.u2f.api.common.RegisteredKey.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        int A0N = AnonymousClass7TE.A0N(this.A01, (AnonymousClass7TG.A0E(this.A00) + 31) * 31);
        return (A0N * 31) + C41845B3m.A00(this.A02);
    }

    public RegisteredKey(KeyHandle keyHandle, String str, String str2) {
        AnonymousClass3Qk.A02(keyHandle);
        this.A01 = keyHandle;
        this.A00 = str;
        this.A02 = str2;
    }

    public final String toString() {
        try {
            JSONObject A11 = DbS.A11();
            KeyHandle keyHandle = this.A01;
            A11.put("keyHandle", Base64.encodeToString(keyHandle.A03, 11));
            ProtocolVersion protocolVersion = keyHandle.A01;
            if (protocolVersion != ProtocolVersion.UNKNOWN) {
                A11.put("version", protocolVersion.toString());
            }
            List list = keyHandle.A02;
            if (list != null) {
                A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_TRANSPORTS, list.toString());
            }
            String str = this.A00;
            if (str != null) {
                A11.put(PublicKeyCredentialControllerUtility.JSON_KEY_CHALLENGE, str);
            }
            String str2 = this.A02;
            if (str2 != null) {
                A11.put("appId", str2);
            }
            return A11.toString();
        } catch (JSONException e) {
            throw C41845B3m.A0j(e);
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int A03 = Pxf.A03(parcel);
        boolean A1R = Pxi.A1R(parcel, this.A01, i);
        C301145yd.A0C(parcel, this.A00, 3, A1R);
        Pxi.A14(parcel, this.A02, A03, A1R);
    }
}
