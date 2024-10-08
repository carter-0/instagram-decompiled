package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass7TE;
import X.C301145yd;
import X.C3735896d;
import X.C66584MXp;
import X.Pxf;
import X.Pxg;
import X.Pxi;
import X.SA1;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import java.util.Arrays;
import java.util.List;

public class PublicKeyCredentialCreationOptions extends RequestOptions {
    public static final Parcelable.Creator CREATOR = SWX.A00(64);
    public ResultReceiver A00;
    public final AttestationConveyancePreference A01;
    public final AuthenticationExtensions A02;
    public final AuthenticatorSelectionCriteria A03;
    public final PublicKeyCredentialRpEntity A04;
    public final PublicKeyCredentialUserEntity A05;
    public final TokenBinding A06;
    public final Double A07;
    public final Integer A08;
    public final String A09;
    public final List A0A;
    public final List A0B;
    public final byte[] A0C;

    public final boolean equals(Object obj) {
        if (obj instanceof PublicKeyCredentialCreationOptions) {
            PublicKeyCredentialCreationOptions publicKeyCredentialCreationOptions = (PublicKeyCredentialCreationOptions) obj;
            if (SA1.A01(this.A04, publicKeyCredentialCreationOptions.A04) && SA1.A01(this.A05, publicKeyCredentialCreationOptions.A05) && Arrays.equals(this.A0C, publicKeyCredentialCreationOptions.A0C) && SA1.A01(this.A07, publicKeyCredentialCreationOptions.A07)) {
                List list = this.A0A;
                List list2 = publicKeyCredentialCreationOptions.A0A;
                if (list.containsAll(list2) && list2.containsAll(list)) {
                    List list3 = this.A0B;
                    List list4 = publicKeyCredentialCreationOptions.A0B;
                    if (list3 != null ? !(list4 == null || !list3.containsAll(list4) || !list4.containsAll(list3)) : list4 == null) {
                        if (SA1.A01(this.A03, publicKeyCredentialCreationOptions.A03) && SA1.A01(this.A08, publicKeyCredentialCreationOptions.A08) && SA1.A01(this.A06, publicKeyCredentialCreationOptions.A06) && SA1.A01(this.A01, publicKeyCredentialCreationOptions.A01) && SA1.A01(this.A02, publicKeyCredentialCreationOptions.A02)) {
                            return SA1.A00(this.A09, publicKeyCredentialCreationOptions.A09);
                        }
                    }
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A04, this.A05, Integer.valueOf(Arrays.hashCode(this.A0C)), this.A0A, this.A07, this.A0B, this.A03, this.A08, this.A06, this.A01, this.A02, this.A09});
    }

    public final String toString() {
        AuthenticationExtensions authenticationExtensions = this.A02;
        AttestationConveyancePreference attestationConveyancePreference = this.A01;
        TokenBinding tokenBinding = this.A06;
        AuthenticatorSelectionCriteria authenticatorSelectionCriteria = this.A03;
        List list = this.A0B;
        List list2 = this.A0A;
        byte[] bArr = this.A0C;
        PublicKeyCredentialUserEntity publicKeyCredentialUserEntity = this.A05;
        String valueOf = String.valueOf(this.A04);
        String valueOf2 = String.valueOf(publicKeyCredentialUserEntity);
        String A002 = C3735896d.A00(bArr);
        String valueOf3 = String.valueOf(list2);
        String valueOf4 = String.valueOf(list);
        String valueOf5 = String.valueOf(authenticatorSelectionCriteria);
        String valueOf6 = String.valueOf(tokenBinding);
        String valueOf7 = String.valueOf(attestationConveyancePreference);
        String valueOf8 = String.valueOf(authenticationExtensions);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PublicKeyCredentialCreationOptions{\n rp=");
        A1A.append(valueOf);
        A1A.append(", \n user=");
        A1A.append(valueOf2);
        A1A.append(", \n challenge=");
        A1A.append(A002);
        A1A.append(", \n parameters=");
        A1A.append(valueOf3);
        A1A.append(", \n timeoutSeconds=");
        A1A.append(this.A07);
        A1A.append(", \n excludeList=");
        A1A.append(valueOf4);
        A1A.append(", \n authenticatorSelection=");
        A1A.append(valueOf5);
        A1A.append(", \n requestId=");
        A1A.append(this.A08);
        A1A.append(", \n tokenBinding=");
        A1A.append(valueOf6);
        A1A.append(", \n attestationConveyancePreference=");
        A1A.append(valueOf7);
        A1A.append(", \n authenticationExtensions=");
        return C66584MXp.A0a(valueOf8, A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        String obj;
        int A032 = Pxf.A03(parcel);
        boolean A1R = Pxi.A1R(parcel, this.A04, i);
        C301145yd.A0A(parcel, this.A05, 3, i, A1R);
        C301145yd.A0F(parcel, this.A0C, 4, A1R);
        C301145yd.A0E(parcel, this.A0A, 5, A1R);
        Double d = this.A07;
        if (d != null) {
            Pxg.A1H(parcel, d, 524294);
        }
        C301145yd.A0E(parcel, this.A0B, 7, A1R);
        C301145yd.A0A(parcel, this.A03, 8, i, A1R);
        Integer num = this.A08;
        if (num != null) {
            parcel.writeInt(262153);
            Pxf.A19(parcel, num);
        }
        C301145yd.A0A(parcel, this.A06, 10, i, A1R);
        AttestationConveyancePreference attestationConveyancePreference = this.A01;
        if (attestationConveyancePreference == null) {
            obj = null;
        } else {
            obj = attestationConveyancePreference.toString();
        }
        C301145yd.A0C(parcel, obj, 11, A1R);
        C301145yd.A0A(parcel, this.A02, 12, i, A1R);
        C301145yd.A0C(parcel, this.A09, 13, A1R);
        C301145yd.A0A(parcel, this.A00, 14, i, A1R);
        C301145yd.A06(parcel, A032);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v0, resolved type: com.google.android.gms.fido.fido2.api.common.zzu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v1, resolved type: com.google.android.gms.fido.fido2.api.common.zzu} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r30v3, resolved type: com.google.android.gms.fido.fido2.api.common.zzu} */
    /* JADX WARNING: type inference failed for: r4v0, types: [X.S3L, java.lang.Object] */
    /* JADX WARNING: Can't wrap try/catch for region: R(10:24|25|26|27|28|29|30|(2:32|157)(1:158)|33|22) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:28:0x00b8 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PublicKeyCredentialCreationOptions(android.os.ResultReceiver r33, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r34, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r35, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r36, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r37, com.google.android.gms.fido.fido2.api.common.TokenBinding r38, java.lang.Double r39, java.lang.Integer r40, java.lang.String r41, java.lang.String r42, java.util.List r43, java.util.List r44, byte[] r45) {
        /*
            r32 = this;
            r5 = r32
            r5.<init>()
            r0 = r33
            r5.A00 = r0
            r18 = r42
            if (r42 == 0) goto L_0x0389
            org.json.JSONObject r6 = X.C66580MXl.A17(r18)     // Catch:{ JSONException -> 0x0382 }
            X.S3L r4 = new X.S3L     // Catch:{ JSONException -> 0x0382 }
            r4.<init>()     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "rp"
            org.json.JSONObject r1 = r6.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r11 = "id"
            java.lang.String r7 = r1.getString(r11)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r3 = "name"
            java.lang.String r2 = r1.getString(r3)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r10 = "icon"
            boolean r0 = r1.has(r10)     // Catch:{ JSONException -> 0x0382 }
            r8 = 0
            if (r0 == 0) goto L_0x004c
            java.lang.String r1 = r1.optString(r10)     // Catch:{ JSONException -> 0x0382 }
        L_0x0037:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity r0 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity     // Catch:{ JSONException -> 0x0382 }
            r0.<init>(r7, r2, r1)     // Catch:{ JSONException -> 0x0382 }
            r4.A03 = r0     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "user"
            org.json.JSONObject r9 = r6.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r1 = r9.getString(r11)     // Catch:{ JSONException -> 0x0382 }
            if (r1 != 0) goto L_0x0050
            goto L_0x004e
        L_0x004c:
            r1 = r8
            goto L_0x0037
        L_0x004e:
            r7 = 0
            goto L_0x0056
        L_0x0050:
            r0 = 11
            byte[] r7 = android.util.Base64.decode(r1, r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x0056:
            java.lang.String r3 = r9.getString(r3)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "displayName"
            java.lang.String r2 = r9.optString(r0)     // Catch:{ JSONException -> 0x0382 }
            boolean r0 = r9.has(r10)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x007a
            java.lang.String r1 = r9.optString(r10)     // Catch:{ JSONException -> 0x0382 }
        L_0x006a:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity r0 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity     // Catch:{ JSONException -> 0x0382 }
            r0.<init>(r3, r7, r1, r2)     // Catch:{ JSONException -> 0x0382 }
            r4.A04 = r0     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "challenge"
            java.lang.String r1 = r6.getString(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 != 0) goto L_0x007e
            goto L_0x007c
        L_0x007a:
            r1 = r8
            goto L_0x006a
        L_0x007c:
            r0 = 0
            goto L_0x0084
        L_0x007e:
            r0 = 11
            byte[] r0 = android.util.Base64.decode(r1, r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x0084:
            X.AnonymousClass3Qk.A02(r0)     // Catch:{ JSONException -> 0x0382 }
            r4.A08 = r0     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "pubKeyCredParams"
            org.json.JSONArray r9 = r6.getJSONArray(r0)     // Catch:{ JSONException -> 0x0382 }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x0382 }
            r10 = 0
            r3 = 0
        L_0x0096:
            int r0 = r9.length()     // Catch:{ JSONException -> 0x0382 }
            if (r3 >= r0) goto L_0x00c8
            org.json.JSONObject r1 = r9.getJSONObject(r3)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "type"
            java.lang.String r2 = r1.getString(r0)     // Catch:{ IllegalArgumentException -> 0x00b8 }
            java.lang.String r0 = "alg"
            int r1 = r1.getInt(r0)     // Catch:{ IllegalArgumentException -> 0x00b8 }
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters r0 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialParameters     // Catch:{ IllegalArgumentException -> 0x00b8 }
            r0.<init>(r2, r1)     // Catch:{ IllegalArgumentException -> 0x00b8 }
            X.Qum r1 = new X.Qum     // Catch:{ IllegalArgumentException -> 0x00b8 }
            r1.<init>(r0)     // Catch:{ IllegalArgumentException -> 0x00b8 }
            goto L_0x00ba
        L_0x00b8:
            X.Qun r1 = X.C8442Qun.A00     // Catch:{ JSONException -> 0x0382 }
        L_0x00ba:
            boolean r0 = r1 instanceof X.C8441Qum     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x00c5
            X.Qum r1 = (X.C8441Qum) r1     // Catch:{ JSONException -> 0x0382 }
            java.lang.Object r0 = r1.A00     // Catch:{ JSONException -> 0x0382 }
            r7.add(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x00c5:
            int r3 = r3 + 1
            goto L_0x0096
        L_0x00c8:
            r4.A06 = r7     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r1 = "timeout"
            boolean r0 = r6.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x00e3
            double r2 = r6.getDouble(r1)     // Catch:{ JSONException -> 0x0382 }
            r0 = 4652007308841189376(0x408f400000000000, double:1000.0)
            double r2 = r2 / r0
            java.lang.Double r0 = java.lang.Double.valueOf(r2)     // Catch:{ JSONException -> 0x0382 }
            r4.A05 = r0     // Catch:{ JSONException -> 0x0382 }
        L_0x00e3:
            java.lang.String r1 = "excludeCredentials"
            boolean r0 = r6.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x0166
            org.json.JSONArray r9 = r6.getJSONArray(r1)     // Catch:{ JSONException -> 0x0382 }
            java.util.ArrayList r7 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x0382 }
        L_0x00f3:
            int r0 = r9.length()     // Catch:{ JSONException -> 0x0382 }
            if (r10 >= r0) goto L_0x0164
            org.json.JSONObject r2 = r9.getJSONObject(r10)     // Catch:{ JSONException -> 0x0382 }
            android.os.Parcelable$Creator r0 = com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor.CREATOR     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "type"
            java.lang.String r12 = r2.getString(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r1 = r2.getString(r11)     // Catch:{ JSONException -> 0x0382 }
            r0 = 11
            byte[] r3 = android.util.Base64.decode(r1, r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r1 = "transports"
            boolean r0 = r2.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x0153
            org.json.JSONArray r14 = r2.getJSONArray(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r14 != 0) goto L_0x0121
            r1 = 0
            goto L_0x0159
        L_0x0121:
            int r0 = r14.length()     // Catch:{ JSONException -> 0x0382 }
            java.util.HashSet r13 = new java.util.HashSet     // Catch:{ JSONException -> 0x0382 }
            r13.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
            r2 = 0
        L_0x012b:
            int r0 = r14.length()     // Catch:{ JSONException -> 0x0382 }
            if (r2 >= r0) goto L_0x0155
            java.lang.String r1 = r14.getString(r2)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x0150
            boolean r0 = r1.isEmpty()     // Catch:{ JSONException -> 0x0382 }
            if (r0 != 0) goto L_0x0150
            com.google.android.gms.fido.common.Transport r0 = com.google.android.gms.fido.common.Transport.A00(r1)     // Catch:{ RJk -> 0x0145 }
            r13.add(r0)     // Catch:{ RJk -> 0x0145 }
            goto L_0x0150
        L_0x0145:
            java.lang.String r0 = "Ignoring unrecognized transport "
            java.lang.String r1 = r0.concat(r1)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "Transport"
            android.util.Log.w(r0, r1)     // Catch:{ JSONException -> 0x0382 }
        L_0x0150:
            int r2 = r2 + 1
            goto L_0x012b
        L_0x0153:
            r1 = 0
            goto L_0x0159
        L_0x0155:
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1D(r13)     // Catch:{ JSONException -> 0x0382 }
        L_0x0159:
            com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor r0 = new com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialDescriptor     // Catch:{ JSONException -> 0x0382 }
            r0.<init>(r12, r1, r3)     // Catch:{ JSONException -> 0x0382 }
            r7.add(r0)     // Catch:{ JSONException -> 0x0382 }
            int r10 = r10 + 1
            goto L_0x00f3
        L_0x0164:
            r4.A07 = r7     // Catch:{ JSONException -> 0x0382 }
        L_0x0166:
            java.lang.String r1 = "authenticatorSelection"
            boolean r0 = r6.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x01b0
            org.json.JSONObject r9 = r6.getJSONObject(r1)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r1 = "authenticatorAttachment"
            boolean r0 = r9.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x0274
            java.lang.String r7 = r9.optString(r1)     // Catch:{ JSONException -> 0x0382 }
        L_0x017e:
            java.lang.String r1 = "residentKey"
            boolean r0 = r9.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x0271
            java.lang.String r3 = r9.optString(r1)     // Catch:{ JSONException -> 0x0382 }
        L_0x018b:
            java.lang.String r1 = "requireResidentKey"
            boolean r0 = r9.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x026e
            boolean r0 = r9.optBoolean(r1)     // Catch:{ JSONException -> 0x0382 }
            java.lang.Boolean r2 = java.lang.Boolean.valueOf(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x019c:
            java.lang.String r1 = "userVerification"
            boolean r0 = r9.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x01a9
            java.lang.String r8 = r9.optString(r1)     // Catch:{ JSONException -> 0x0382 }
        L_0x01a9:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria r0 = new com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria     // Catch:{ JSONException -> 0x0382 }
            r0.<init>(r2, r7, r8, r3)     // Catch:{ JSONException -> 0x0382 }
            r4.A02 = r0     // Catch:{ JSONException -> 0x0382 }
        L_0x01b0:
            java.lang.String r1 = "extensions"
            boolean r0 = r6.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x035b
            org.json.JSONObject r3 = r6.getJSONObject(r1)     // Catch:{ JSONException -> 0x0382 }
            r2 = 0
            r15 = 0
            r8 = 0
            r14 = 0
            r13 = 0
            r11 = 0
            r30 = 0
            r10 = 0
            r9 = 0
            r27 = 0
            r16 = 0
            r26 = 0
            java.lang.String r0 = "fidoAppIdExtension"
            boolean r7 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r1 = "appid"
            if (r7 == 0) goto L_0x01e3
            org.json.JSONObject r0 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = r0.getString(r1)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r2 = new com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension     // Catch:{ JSONException -> 0x0382 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x01e3:
            boolean r0 = r3.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x01f2
            java.lang.String r0 = r3.getString(r1)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension r2 = new com.google.android.gms.fido.fido2.api.common.FidoAppIdExtension     // Catch:{ JSONException -> 0x0382 }
            r2.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x01f2:
            java.lang.String r1 = "prf"
            boolean r12 = r3.has(r1)     // Catch:{ JSONException -> 0x0382 }
            r7 = 0
            java.lang.String r0 = "prfAlreadyHashed"
            if (r12 == 0) goto L_0x025e
            boolean r0 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r0 != 0) goto L_0x0277
            org.json.JSONObject r0 = r3.getJSONObject(r1)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.zzak r27 = com.google.android.gms.fido.fido2.api.common.zzak.A00(r0, r7)     // Catch:{ JSONException -> 0x0382 }
        L_0x020d:
            java.lang.String r0 = "cableAuthenticationExtension"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x0284
            org.json.JSONArray r17 = r3.getJSONArray(r0)     // Catch:{ JSONException -> 0x0382 }
            java.util.ArrayList r1 = X.AnonymousClass7TE.A1C()     // Catch:{ JSONException -> 0x0382 }
        L_0x021d:
            int r0 = r17.length()     // Catch:{ JSONException -> 0x0382 }
            if (r7 >= r0) goto L_0x027f
            r0 = r17
            org.json.JSONObject r8 = r0.getJSONObject(r7)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "version"
            long r23 = r8.getLong(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "clientEid"
            java.lang.String r12 = r8.getString(r0)     // Catch:{ JSONException -> 0x0382 }
            r0 = 11
            byte[] r20 = android.util.Base64.decode(r12, r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r12 = "authenticatorEid"
            java.lang.String r12 = r8.getString(r12)     // Catch:{ JSONException -> 0x0382 }
            byte[] r21 = android.util.Base64.decode(r12, r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r12 = "sessionPreKey"
            java.lang.String r8 = r8.getString(r12)     // Catch:{ JSONException -> 0x0382 }
            byte[] r22 = android.util.Base64.decode(r8, r0)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.zzq r0 = new com.google.android.gms.fido.fido2.api.common.zzq     // Catch:{ JSONException -> 0x0382 }
            r19 = r0
            r19.<init>(r20, r21, r22, r23)     // Catch:{ JSONException -> 0x0382 }
            r1.add(r0)     // Catch:{ JSONException -> 0x0382 }
            int r7 = r7 + 1
            goto L_0x021d
        L_0x025e:
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x020d
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            r0 = 1
            com.google.android.gms.fido.fido2.api.common.zzak r27 = com.google.android.gms.fido.fido2.api.common.zzak.A00(r1, r0)     // Catch:{ JSONException -> 0x0382 }
            goto L_0x020d
        L_0x026e:
            r2 = r8
            goto L_0x019c
        L_0x0271:
            r3 = r8
            goto L_0x018b
        L_0x0274:
            r7 = r8
            goto L_0x017e
        L_0x0277:
            java.lang.String r1 = "both prf and prfAlreadyHashed extensions found"
            org.json.JSONException r0 = new org.json.JSONException     // Catch:{ JSONException -> 0x0382 }
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0382 }
            throw r0     // Catch:{ JSONException -> 0x0382 }
        L_0x027f:
            com.google.android.gms.fido.fido2.api.common.zzs r8 = new com.google.android.gms.fido.fido2.api.common.zzs     // Catch:{ JSONException -> 0x0382 }
            r8.<init>(r1)     // Catch:{ JSONException -> 0x0382 }
        L_0x0284:
            java.lang.String r0 = "userVerificationMethodExtension"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x029d
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "uvm"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension r15 = new com.google.android.gms.fido.fido2.api.common.UserVerificationMethodExtension     // Catch:{ JSONException -> 0x0382 }
            r15.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x029d:
            java.lang.String r0 = "google_multiAssertionExtension"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x02b5
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "requestForMultiAssertion"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.zzz r14 = new com.google.android.gms.fido.fido2.api.common.zzz     // Catch:{ JSONException -> 0x0382 }
            r14.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x02b5:
            java.lang.String r0 = "google_sessionIdExtension"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x02ce
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "sessionId"
            int r0 = r1.getInt(r0)     // Catch:{ JSONException -> 0x0382 }
            long r0 = (long) r0     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.zzab r13 = new com.google.android.gms.fido.fido2.api.common.zzab     // Catch:{ JSONException -> 0x0382 }
            r13.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x02ce:
            java.lang.String r0 = "google_silentVerificationExtension"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x02e6
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "silentVerification"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.zzad r11 = new com.google.android.gms.fido.fido2.api.common.zzad     // Catch:{ JSONException -> 0x0382 }
            r11.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x02e6:
            java.lang.String r0 = "devicePublicKeyExtension"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x02fc
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "devicePublicKey"
            r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.zzu r30 = new com.google.android.gms.fido.fido2.api.common.zzu     // Catch:{ JSONException -> 0x0382 }
            r30.<init>()     // Catch:{ JSONException -> 0x0382 }
        L_0x02fc:
            java.lang.String r0 = "google_tunnelServerIdExtension"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x0314
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "tunnelServerId"
            java.lang.String r0 = r1.getString(r0)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.zzag r10 = new com.google.android.gms.fido.fido2.api.common.zzag     // Catch:{ JSONException -> 0x0382 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x0314:
            java.lang.String r0 = "google_thirdPartyPaymentExtension"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x032c
            org.json.JSONObject r1 = r3.getJSONObject(r0)     // Catch:{ JSONException -> 0x0382 }
            java.lang.String r0 = "thirdPartyPayment"
            boolean r0 = r1.getBoolean(r0)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension r9 = new com.google.android.gms.fido.fido2.api.common.GoogleThirdPartyPaymentExtension     // Catch:{ JSONException -> 0x0382 }
            r9.<init>(r0)     // Catch:{ JSONException -> 0x0382 }
        L_0x032c:
            java.lang.String r0 = "txAuthSimple"
            boolean r1 = r3.has(r0)     // Catch:{ JSONException -> 0x0382 }
            if (r1 == 0) goto L_0x0340
            java.lang.String r1 = r3.getString(r0)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.zzaw r16 = new com.google.android.gms.fido.fido2.api.common.zzaw     // Catch:{ JSONException -> 0x0382 }
            r0 = r16
            r0.<init>(r1)     // Catch:{ JSONException -> 0x0382 }
        L_0x0340:
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions r0 = new com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions     // Catch:{ JSONException -> 0x0382 }
            r28 = r16
            r29 = r8
            r31 = r14
            r22 = r15
            r23 = r13
            r24 = r11
            r25 = r10
            r19 = r0
            r20 = r2
            r21 = r9
            r19.<init>(r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30, r31)     // Catch:{ JSONException -> 0x0382 }
            r4.A01 = r0     // Catch:{ JSONException -> 0x0382 }
        L_0x035b:
            java.lang.String r1 = "attestation"
            boolean r0 = r6.has(r1)     // Catch:{ JSONException -> 0x0382 }
            if (r0 == 0) goto L_0x037a
            java.lang.String r0 = r6.getString(r1)     // Catch:{ RJm -> 0x036e }
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r0 = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.A00(r0)     // Catch:{ RJm -> 0x036e }
            r4.A00 = r0     // Catch:{ RJm -> 0x036e }
            goto L_0x037a
        L_0x036e:
            r2 = move-exception
            java.lang.String r1 = "PKCCreationOptions"
            java.lang.String r0 = "Invalid AttestationConveyancePreference"
            android.util.Log.w(r1, r0, r2)     // Catch:{ JSONException -> 0x0382 }
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r0 = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.NONE     // Catch:{ JSONException -> 0x0382 }
            r4.A00 = r0     // Catch:{ JSONException -> 0x0382 }
        L_0x037a:
            r4.A00()     // Catch:{ JSONException -> 0x0382 }
            r0 = r18
            r5.A09 = r0
            return
        L_0x0382:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x0389:
            r0 = r36
            X.AnonymousClass3Qk.A02(r0)
            r5.A04 = r0
            r0 = r37
            X.AnonymousClass3Qk.A02(r0)
            r5.A05 = r0
            r0 = r45
            X.AnonymousClass3Qk.A02(r0)
            r5.A0C = r0
            r0 = r43
            X.AnonymousClass3Qk.A02(r0)
            r5.A0A = r0
            r0 = r39
            r5.A07 = r0
            r0 = r44
            r5.A0B = r0
            r0 = r35
            r5.A03 = r0
            r0 = r40
            r5.A08 = r0
            r0 = r38
            r5.A06 = r0
            if (r41 == 0) goto L_0x03c9
            com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference r0 = com.google.android.gms.fido.fido2.api.common.AttestationConveyancePreference.A00(r41)     // Catch:{ RJm -> 0x03c2 }
            r5.A01 = r0     // Catch:{ RJm -> 0x03c2 }
            goto L_0x03c9
        L_0x03c2:
            r1 = move-exception
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            r0.<init>(r1)
            throw r0
        L_0x03c9:
            r0 = r34
            r5.A02 = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialCreationOptions.<init>(android.os.ResultReceiver, com.google.android.gms.fido.fido2.api.common.AuthenticationExtensions, com.google.android.gms.fido.fido2.api.common.AuthenticatorSelectionCriteria, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialRpEntity, com.google.android.gms.fido.fido2.api.common.PublicKeyCredentialUserEntity, com.google.android.gms.fido.fido2.api.common.TokenBinding, java.lang.Double, java.lang.Integer, java.lang.String, java.lang.String, java.util.List, java.util.List, byte[]):void");
    }
}
