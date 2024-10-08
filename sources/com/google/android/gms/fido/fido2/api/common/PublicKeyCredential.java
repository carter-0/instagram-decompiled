package com.google.android.gms.fido.fido2.api.common;

import X.AnonymousClass00P;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C3735896d;
import X.Pxi;
import X.SA1;
import X.SDL;
import X.SWX;
import X.SyE;
import X.TAO;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.util.Arrays;

public class PublicKeyCredential extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR = SWX.A00(65);
    public final AuthenticationExtensionsClientOutputs A00;
    public final AuthenticatorAssertionResponse A01;
    public final AuthenticatorAttestationResponse A02;
    public final AuthenticatorErrorResponse A03;
    public final TAO A04;
    public final String A05;
    public final String A06;
    public final String A07;

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0017, code lost:
        if (r3 == null) goto L_0x002f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
        X.AnonymousClass3Qk.A08(r2, "Must provide id and rawId if not an error response.");
        r4.A05 = r9;
        r4.A06 = r10;
        r4.A04 = r3;
        r4.A02 = r7;
        r4.A01 = r6;
        r4.A03 = r8;
        r4.A00 = r5;
        r4.A07 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x002f, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0033, code lost:
        if (r8 != null) goto L_0x0035;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0035, code lost:
        r1 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0009, code lost:
        if (r6 == null) goto L_0x000b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x000b, code lost:
        if (r8 != null) goto L_0x000d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000d, code lost:
        r1 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x000e, code lost:
        X.AnonymousClass3Qk.A08(r1, "Must provide a response object.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        if (r8 != null) goto L_0x0019;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        if (r9 == null) goto L_0x002f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public PublicKeyCredential(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r5, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r6, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r7, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r8, java.lang.String r9, java.lang.String r10, java.lang.String r11, byte[] r12) {
        /*
            r4 = this;
            if (r12 != 0) goto L_0x0037
            r3 = 0
        L_0x0003:
            r4.<init>()
            r2 = 1
            if (r7 == 0) goto L_0x0031
            if (r6 != 0) goto L_0x000d
        L_0x000b:
            if (r8 == 0) goto L_0x0035
        L_0x000d:
            r1 = 0
        L_0x000e:
            java.lang.String r0 = "Must provide a response object."
            X.AnonymousClass3Qk.A08(r1, r0)
            if (r8 != 0) goto L_0x0019
            if (r9 == 0) goto L_0x002f
            if (r3 == 0) goto L_0x002f
        L_0x0019:
            java.lang.String r0 = "Must provide id and rawId if not an error response."
            X.AnonymousClass3Qk.A08(r2, r0)
            r4.A05 = r9
            r4.A06 = r10
            r4.A04 = r3
            r4.A02 = r7
            r4.A01 = r6
            r4.A03 = r8
            r4.A00 = r5
            r4.A07 = r11
            return
        L_0x002f:
            r2 = 0
            goto L_0x0019
        L_0x0031:
            if (r6 != 0) goto L_0x000b
            if (r8 == 0) goto L_0x000d
        L_0x0035:
            r1 = 1
            goto L_0x000e
        L_0x0037:
            int r0 = r12.length
            X.QvC r3 = X.TAO.A01(r12, r0)
            goto L_0x0003
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.<init>(com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs, com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse, com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse, java.lang.String, java.lang.String, java.lang.String, byte[]):void");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof PublicKeyCredential)) {
            return false;
        }
        PublicKeyCredential publicKeyCredential = (PublicKeyCredential) obj;
        if (!SA1.A01(this.A05, publicKeyCredential.A05) || !SA1.A01(this.A06, publicKeyCredential.A06) || !SA1.A01(this.A04, publicKeyCredential.A04) || !SA1.A01(this.A02, publicKeyCredential.A02) || !SA1.A01(this.A01, publicKeyCredential.A01) || !SA1.A01(this.A03, publicKeyCredential.A03) || !SA1.A01(this.A00, publicKeyCredential.A00)) {
            return false;
        }
        return SA1.A00(this.A07, publicKeyCredential.A07);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A06, this.A04, this.A01, this.A02, this.A03, this.A00, this.A07});
    }

    public final String toString() {
        byte[] A1b = Pxi.A1b(this.A04);
        String str = this.A06;
        String str2 = this.A05;
        AuthenticatorAttestationResponse authenticatorAttestationResponse = this.A02;
        AuthenticatorAssertionResponse authenticatorAssertionResponse = this.A01;
        AuthenticatorErrorResponse authenticatorErrorResponse = this.A03;
        AuthenticationExtensionsClientOutputs authenticationExtensionsClientOutputs = this.A00;
        String str3 = this.A07;
        String A002 = C3735896d.A00(A1b);
        String valueOf = String.valueOf(authenticatorAttestationResponse);
        String valueOf2 = String.valueOf(authenticatorAssertionResponse);
        String valueOf3 = String.valueOf(authenticatorErrorResponse);
        String valueOf4 = String.valueOf(authenticationExtensionsClientOutputs);
        StringBuilder A1A = AnonymousClass7TE.A1A();
        A1A.append("PublicKeyCredential{\n id='");
        A1A.append(str2);
        A1A.append("', \n type='");
        A1A.append(str);
        A1A.append("', \n rawId=");
        A1A.append(A002);
        A1A.append(", \n registerResponse=");
        A1A.append(valueOf);
        A1A.append(", \n signResponse=");
        A1A.append(valueOf2);
        A1A.append(", \n errorResponse=");
        A1A.append(valueOf3);
        A1A.append(", \n extensionsClientOutputs=");
        A1A.append(valueOf4);
        A1A.append(", \n authenticatorAttachment='");
        A1A.append(str3);
        return AnonymousClass7TF.A0l("'}", A1A);
    }

    public final void writeToParcel(Parcel parcel, int i) {
        SyE.A01.A00.FP1();
        SDL.A0A.FP1();
        throw AnonymousClass00P.createAndThrow();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:140:0x0283, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:142:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:145:0x0288, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:148:?, code lost:
        r0 = X.Pxe.A0h("failed to parse COSE key", r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:165:0x02ae, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:167:?, code lost:
        r2.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x02b3, code lost:
        r1 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:173:?, code lost:
        r0 = X.Pxe.A0h("failed to parse attestation object", r1);
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:143:0x0287 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:168:0x02b2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:84:0x017d */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0264 A[Catch:{ JSONException -> 0x02e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:145:0x0288 A[ExcHandler: RCN | RJv (r1v40 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:70:0x0141] */
    /* JADX WARNING: Removed duplicated region for block: B:170:0x02b3 A[ExcHandler: RCN | RJv (r1v14 'e' java.lang.Throwable A[CUSTOM_DECLARE]), Splitter:B:45:0x00b4] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x02f5 A[Catch:{ JSONException -> 0x0314 }] */
    /* JADX WARNING: Removed duplicated region for block: B:198:0x0301  */
    /* JADX WARNING: Removed duplicated region for block: B:201:0x0308 A[Catch:{ JSONException -> 0x0314 }] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:143:0x0287=Splitter:B:143:0x0287, B:84:0x017d=Splitter:B:84:0x017d} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.String A00() {
        /*
            r22 = this;
            org.json.JSONObject r8 = X.DbS.A11()     // Catch:{ JSONException -> 0x0314 }
            r9 = r22
            X.TAO r1 = r9.A04     // Catch:{ JSONException -> 0x0314 }
            if (r1 == 0) goto L_0x0017
            byte[] r0 = r1.A03()     // Catch:{ JSONException -> 0x0314 }
            int r0 = r0.length     // Catch:{ JSONException -> 0x0314 }
            if (r0 <= 0) goto L_0x0017
            java.lang.String r0 = "rawId"
            X.Pxj.A1J(r1, r0, r8)     // Catch:{ JSONException -> 0x0314 }
        L_0x0017:
            java.lang.String r1 = r9.A07     // Catch:{ JSONException -> 0x0314 }
            if (r1 == 0) goto L_0x0020
            java.lang.String r0 = "authenticatorAttachment"
            r8.put(r0, r1)     // Catch:{ JSONException -> 0x0314 }
        L_0x0020:
            java.lang.String r1 = r9.A06     // Catch:{ JSONException -> 0x0314 }
            if (r1 == 0) goto L_0x002e
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r0 = r9.A03     // Catch:{ JSONException -> 0x0314 }
            if (r0 != 0) goto L_0x002e
            java.lang.String r0 = "type"
            r8.put(r0, r1)     // Catch:{ JSONException -> 0x0314 }
        L_0x002e:
            java.lang.String r1 = r9.A05     // Catch:{ JSONException -> 0x0314 }
            if (r1 == 0) goto L_0x0037
            java.lang.String r0 = "id"
            r8.put(r0, r1)     // Catch:{ JSONException -> 0x0314 }
        L_0x0037:
            java.lang.String r21 = "response"
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAssertionResponse r3 = r9.A01     // Catch:{ JSONException -> 0x0314 }
            r11 = 0
            if (r3 == 0) goto L_0x006e
            org.json.JSONObject r0 = X.DbS.A11()     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r2 = "clientDataJSON"
            X.TAO r1 = r3.A01     // Catch:{ JSONException -> 0x0065 }
            X.Pxj.A1J(r1, r2, r0)     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r2 = "authenticatorData"
            X.TAO r1 = r3.A02     // Catch:{ JSONException -> 0x0065 }
            X.Pxj.A1J(r1, r2, r0)     // Catch:{ JSONException -> 0x0065 }
            java.lang.String r2 = "signature"
            X.TAO r1 = r3.A03     // Catch:{ JSONException -> 0x0065 }
            X.Pxj.A1J(r1, r2, r0)     // Catch:{ JSONException -> 0x0065 }
            X.TAO r2 = r3.A04     // Catch:{ JSONException -> 0x0065 }
            if (r2 == 0) goto L_0x02f2
            java.lang.String r1 = "userHandle"
            X.Pxj.A1J(r2, r1, r0)     // Catch:{ JSONException -> 0x0065 }
            goto L_0x02f2
        L_0x0065:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticatorAssertionResponse to JSON object"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r1)     // Catch:{ JSONException -> 0x0314 }
            goto L_0x02ef
        L_0x006e:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorAttestationResponse r7 = r9.A02     // Catch:{ JSONException -> 0x0314 }
            if (r7 == 0) goto L_0x02c2
            org.json.JSONObject r0 = X.DbS.A11()     // Catch:{ JSONException -> 0x02e8 }
            X.TAO r2 = r7.A01     // Catch:{ JSONException -> 0x02e8 }
            if (r2 == 0) goto L_0x007f
            java.lang.String r1 = "clientDataJSON"
            X.Pxj.A1J(r2, r1, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x007f:
            X.TAO r6 = r7.A02     // Catch:{ JSONException -> 0x02e8 }
            if (r6 == 0) goto L_0x0088
            java.lang.String r1 = "attestationObject"
            X.Pxj.A1J(r6, r1, r0)     // Catch:{ JSONException -> 0x02e8 }
        L_0x0088:
            org.json.JSONArray r5 = X.Pxe.A1E()     // Catch:{ JSONException -> 0x02e8 }
            r4 = 0
        L_0x008d:
            java.lang.String[] r3 = r7.A03     // Catch:{ JSONException -> 0x02e8 }
            int r1 = r3.length     // Catch:{ JSONException -> 0x02e8 }
            if (r4 >= r1) goto L_0x00aa
            r2 = r3[r4]     // Catch:{ JSONException -> 0x02e8 }
            com.google.android.gms.fido.common.Transport r1 = com.google.android.gms.fido.common.Transport.HYBRID     // Catch:{ JSONException -> 0x02e8 }
            boolean r1 = X.JTQ.A1Y(r1, r2)     // Catch:{ JSONException -> 0x02e8 }
            if (r1 == 0) goto L_0x00a2
            java.lang.String r1 = "hybrid"
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x00a7
        L_0x00a2:
            r1 = r3[r4]     // Catch:{ JSONException -> 0x02e8 }
            r5.put(r4, r1)     // Catch:{ JSONException -> 0x02e8 }
        L_0x00a7:
            int r4 = r4 + 1
            goto L_0x008d
        L_0x00aa:
            java.lang.String r1 = "transports"
            r0.put(r1, r5)     // Catch:{ JSONException -> 0x02e8 }
            byte[] r2 = r6.A03()     // Catch:{ JSONException -> 0x02e8 }
            r2.getClass()     // Catch:{ RCN | RJv -> 0x02b3 }
            int r1 = r2.length     // Catch:{ RCN | RJv -> 0x02b3 }
            byte[] r2 = java.util.Arrays.copyOf(r2, r1)     // Catch:{ RCN | RJv -> 0x02b3 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ RCN | RJv -> 0x02b3 }
            r1.<init>(r2)     // Catch:{ RCN | RJv -> 0x02b3 }
            X.T8y r2 = new X.T8y     // Catch:{ RCN | RJv -> 0x02b3 }
            r2.<init>(r1)     // Catch:{ RCN | RJv -> 0x02b3 }
            X.TA9 r1 = X.SA2.A00(r2, r1)     // Catch:{ all -> 0x02ae }
            r2.close()     // Catch:{ IOException -> 0x00cd, RCN | RJv -> 0x02b3 }
        L_0x00cd:
            java.lang.Class<X.QvI> r5 = X.C8473QvI.class
            X.TA9 r1 = X.TA9.A01(r1, r5)     // Catch:{ RCN | RJv -> 0x02b3 }
            X.QvI r1 = (X.C8473QvI) r1     // Catch:{ RCN | RJv -> 0x02b3 }
            X.Quu r3 = r1.A01     // Catch:{ RJv -> 0x02a6 }
            java.lang.String r2 = "authData"
            X.QvG r1 = new X.QvG     // Catch:{ RJv -> 0x02a6 }
            r1.<init>(r2)     // Catch:{ RJv -> 0x02a6 }
            java.lang.Object r1 = r3.get(r1)     // Catch:{ RJv -> 0x02a6 }
            X.TA9 r1 = (X.TA9) r1     // Catch:{ RJv -> 0x02a6 }
            if (r1 == 0) goto L_0x029f
            java.lang.Class<X.QvF> r10 = X.C8470QvF.class
            X.TA9 r1 = X.TA9.A01(r1, r10)     // Catch:{ RJv -> 0x02a6 }
            X.QvF r1 = (X.C8470QvF) r1     // Catch:{ RJv -> 0x02a6 }
            X.TAO r1 = r1.A00     // Catch:{ RJv -> 0x02a6 }
            r20 = r1
            r2 = r20
            X.QvC r2 = (X.C8467QvC) r2     // Catch:{ JSONException -> 0x02e8 }
            byte[] r4 = r2.A00     // Catch:{ JSONException -> 0x02e8 }
            boolean r1 = r2 instanceof X.C8466QvB     // Catch:{ JSONException -> 0x02e8 }
            if (r1 == 0) goto L_0x010e
            r1 = r2
            X.QvB r1 = (X.C8466QvB) r1     // Catch:{ JSONException -> 0x02e8 }
            int r3 = r1.A00     // Catch:{ JSONException -> 0x02e8 }
        L_0x0101:
            int r6 = r2.A02()     // Catch:{ JSONException -> 0x02e8 }
            java.nio.ByteBuffer r1 = java.nio.ByteBuffer.wrap(r4, r3, r6)     // Catch:{ JSONException -> 0x02e8 }
            java.nio.ByteBuffer r7 = r1.asReadOnlyBuffer()     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x0110
        L_0x010e:
            r3 = 0
            goto L_0x0101
        L_0x0110:
            int r1 = r7.position()     // Catch:{ IllegalArgumentException -> 0x0297 }
            r12 = 32
            int r1 = r1 + 32
            r7.position(r1)     // Catch:{ IllegalArgumentException -> 0x0297 }
            byte r1 = r7.get()     // Catch:{ IllegalArgumentException -> 0x0297 }
            r1 = r1 & 64
            if (r1 == 0) goto L_0x0290
            int r1 = r7.position()     // Catch:{ IllegalArgumentException -> 0x0297 }
            int r1 = r1 + 4
            r7.position(r1)     // Catch:{ IllegalArgumentException -> 0x0297 }
            int r1 = r7.position()     // Catch:{ IllegalArgumentException -> 0x0297 }
            int r1 = r1 + 16
            r7.position(r1)     // Catch:{ IllegalArgumentException -> 0x0297 }
            short r2 = r7.getShort()     // Catch:{ IllegalArgumentException -> 0x0297 }
            int r1 = r7.position()     // Catch:{ IllegalArgumentException -> 0x0297 }
            int r1 = r1 + r2
            r7.position(r1)     // Catch:{ IllegalArgumentException -> 0x0297 }
            int r2 = r7.position()     // Catch:{ RCN | RJv -> 0x0288 }
            int r1 = r20.A02()     // Catch:{ RCN | RJv -> 0x0288 }
            int r1 = X.TAO.A00(r2, r1, r6)     // Catch:{ RCN | RJv -> 0x0288 }
            if (r1 != 0) goto L_0x016f
            X.TAO r2 = X.TAO.A01     // Catch:{ RCN | RJv -> 0x0288 }
        L_0x0151:
            X.QvC r2 = (X.C8467QvC) r2     // Catch:{ RCN | RJv -> 0x0288 }
            byte[] r4 = r2.A00     // Catch:{ RCN | RJv -> 0x0288 }
            boolean r1 = r2 instanceof X.C8466QvB     // Catch:{ RCN | RJv -> 0x0288 }
            if (r1 == 0) goto L_0x016d
            r1 = r2
            X.QvB r1 = (X.C8466QvB) r1     // Catch:{ RCN | RJv -> 0x0288 }
            int r3 = r1.A00     // Catch:{ RCN | RJv -> 0x0288 }
        L_0x015e:
            int r2 = r2.A02()     // Catch:{ RCN | RJv -> 0x0288 }
            java.io.ByteArrayInputStream r1 = new java.io.ByteArrayInputStream     // Catch:{ RCN | RJv -> 0x0288 }
            r1.<init>(r4, r3, r2)     // Catch:{ RCN | RJv -> 0x0288 }
            X.T8y r2 = new X.T8y     // Catch:{ RCN | RJv -> 0x0288 }
            r2.<init>(r1)     // Catch:{ RCN | RJv -> 0x0288 }
            goto L_0x0176
        L_0x016d:
            r3 = 0
            goto L_0x015e
        L_0x016f:
            int r3 = r3 + r2
            X.QvB r2 = new X.QvB     // Catch:{ RCN | RJv -> 0x0288 }
            r2.<init>(r4, r3, r1)     // Catch:{ RCN | RJv -> 0x0288 }
            goto L_0x0151
        L_0x0176:
            X.TA9 r1 = X.SA2.A00(r2, r1)     // Catch:{ all -> 0x0283 }
            r2.close()     // Catch:{ IOException -> 0x017d, RCN | RJv -> 0x0288 }
        L_0x017d:
            X.TA9 r1 = X.TA9.A01(r1, r5)     // Catch:{ RCN | RJv -> 0x0288 }
            X.QvI r1 = (X.C8473QvI) r1     // Catch:{ RCN | RJv -> 0x0288 }
            X.Quu r7 = r1.A01     // Catch:{ JSONException -> 0x02e8 }
            r1 = 3
            X.TA9 r1 = X.C8474QvJ.A00(r7, r1)     // Catch:{ JSONException -> 0x02e8 }
            r5 = 1
            X.TA9 r2 = X.C8474QvJ.A00(r7, r5)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r19 = "COSE key missing required fields"
            if (r1 == 0) goto L_0x027e
            if (r2 == 0) goto L_0x027e
            java.lang.Class<X.QvJ> r15 = X.C8474QvJ.class
            X.TA9 r1 = X.TA9.A01(r1, r15)     // Catch:{ RJv -> 0x027c }
            X.QvJ r1 = (X.C8474QvJ) r1     // Catch:{ RJv -> 0x027c }
            long r13 = r1.A00     // Catch:{ RJv -> 0x027c }
            X.TA9 r1 = X.TA9.A01(r2, r15)     // Catch:{ RJv -> 0x027c }
            X.QvJ r1 = (X.C8474QvJ) r1     // Catch:{ RJv -> 0x027c }
            long r3 = r1.A00     // Catch:{ RJv -> 0x027c }
            r17 = 2
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 == 0) goto L_0x01b5
            int r1 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r1 != 0) goto L_0x0254
            r3 = 2
        L_0x01b5:
            r1 = -1
            X.TA9 r1 = X.C8474QvJ.A00(r7, r1)     // Catch:{ RJv -> 0x027c }
            if (r1 == 0) goto L_0x0272
            X.TA9 r1 = X.TA9.A01(r1, r15)     // Catch:{ RJv -> 0x027c }
            X.QvJ r1 = (X.C8474QvJ) r1     // Catch:{ RJv -> 0x027c }
            long r1 = r1.A00     // Catch:{ RJv -> 0x027c }
            java.lang.String r16 = "COSE coordinates are the wrong size"
            int r15 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r15 != 0) goto L_0x0217
            int r15 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x0217
            r1 = -2
            X.TA9 r4 = X.C8474QvJ.A00(r7, r1)     // Catch:{ RJv -> 0x027c }
            r1 = -3
            X.TA9 r3 = X.C8474QvJ.A00(r7, r1)     // Catch:{ RJv -> 0x027c }
            if (r4 == 0) goto L_0x0212
            if (r3 == 0) goto L_0x0212
            X.TA9 r1 = X.TA9.A01(r4, r10)     // Catch:{ RJv -> 0x027c }
            X.QvF r1 = (X.C8470QvF) r1     // Catch:{ RJv -> 0x027c }
            X.TAO r2 = r1.A00     // Catch:{ RJv -> 0x027c }
            X.TA9 r1 = X.TA9.A01(r3, r10)     // Catch:{ RJv -> 0x027c }
            X.QvF r1 = (X.C8470QvF) r1     // Catch:{ RJv -> 0x027c }
            X.TAO r4 = r1.A00     // Catch:{ RJv -> 0x027c }
            int r1 = r2.A02()     // Catch:{ RJv -> 0x027c }
            if (r1 != r12) goto L_0x0277
            int r1 = r4.A02()     // Catch:{ RJv -> 0x027c }
            if (r1 != r12) goto L_0x0277
            java.lang.String r1 = "MFkwEwYHKoZIzj0CAQYIKoZIzj0DAQcDQgAE"
            byte[] r3 = android.util.Base64.decode(r1, r11)     // Catch:{ RJv -> 0x027c }
            byte[] r2 = r2.A03()     // Catch:{ RJv -> 0x027c }
            byte[] r1 = r4.A03()     // Catch:{ RJv -> 0x027c }
            byte[][] r1 = new byte[][]{r3, r2, r1}     // Catch:{ RJv -> 0x027c }
            byte[] r3 = X.C9709RfS.A00(r1)     // Catch:{ RJv -> 0x027c }
            goto L_0x0255
        L_0x0212:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r19)     // Catch:{ RJv -> 0x027c }
            goto L_0x027b
        L_0x0217:
            int r15 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r15 != 0) goto L_0x0254
            r4 = 6
            int r3 = (r1 > r4 ? 1 : (r1 == r4 ? 0 : -1))
            if (r3 != 0) goto L_0x0254
            r1 = -2
            X.TA9 r1 = X.C8474QvJ.A00(r7, r1)     // Catch:{ RJv -> 0x027c }
            if (r1 == 0) goto L_0x024f
            X.TA9 r1 = X.TA9.A01(r1, r10)     // Catch:{ RJv -> 0x027c }
            X.QvF r1 = (X.C8470QvF) r1     // Catch:{ RJv -> 0x027c }
            X.TAO r3 = r1.A00     // Catch:{ RJv -> 0x027c }
            int r1 = r3.A02()     // Catch:{ RJv -> 0x027c }
            if (r1 != r12) goto L_0x024a
            java.lang.String r1 = "MCowBQYDK2VwAyEA"
            byte[] r2 = android.util.Base64.decode(r1, r11)     // Catch:{ RJv -> 0x027c }
            byte[] r1 = r3.A03()     // Catch:{ RJv -> 0x027c }
            byte[][] r1 = new byte[][]{r2, r1}     // Catch:{ RJv -> 0x027c }
            byte[] r3 = X.C9709RfS.A00(r1)     // Catch:{ RJv -> 0x027c }
            goto L_0x0255
        L_0x024a:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r16)     // Catch:{ RJv -> 0x027c }
            goto L_0x027b
        L_0x024f:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r19)     // Catch:{ RJv -> 0x027c }
            goto L_0x027b
        L_0x0254:
            r3 = 0
        L_0x0255:
            java.lang.String r2 = "authenticatorData"
            r1 = r20
            X.Pxj.A1J(r1, r2, r0)     // Catch:{ JSONException -> 0x02e8 }
            java.lang.String r1 = "publicKeyAlgorithm"
            r0.put(r1, r13)     // Catch:{ JSONException -> 0x02e8 }
            if (r3 == 0) goto L_0x02f2
            java.lang.String r2 = "publicKey"
            r1 = 11
            java.lang.String r1 = android.util.Base64.encodeToString(r3, r1)     // Catch:{ JSONException -> 0x02e8 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02f2
        L_0x0272:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r19)     // Catch:{ RJv -> 0x027c }
            goto L_0x027b
        L_0x0277:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r16)     // Catch:{ RJv -> 0x027c }
        L_0x027b:
            throw r0     // Catch:{ RJv -> 0x027c }
        L_0x027c:
            r1 = move-exception
            goto L_0x02bb
        L_0x027e:
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r19)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02c1
        L_0x0283:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x0287, RCN | RJv -> 0x0288 }
        L_0x0287:
            throw r0     // Catch:{ RCN | RJv -> 0x0288 }
        L_0x0288:
            r1 = move-exception
            java.lang.String r0 = "failed to parse COSE key"
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02c1
        L_0x0290:
            java.lang.String r0 = "authData does not include credential data"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ IllegalArgumentException -> 0x0297 }
            throw r0     // Catch:{ IllegalArgumentException -> 0x0297 }
        L_0x0297:
            r1 = move-exception
            java.lang.String r0 = "ill-formed authenticator data"
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02c1
        L_0x029f:
            java.lang.String r0 = "attestation object missing authData"
            java.lang.IllegalArgumentException r0 = X.AnonymousClass7TE.A0w(r0)     // Catch:{ RJv -> 0x02a6 }
            throw r0     // Catch:{ RJv -> 0x02a6 }
        L_0x02a6:
            r1 = move-exception
            java.lang.String r0 = "authData value has wrong type"
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02c1
        L_0x02ae:
            r0 = move-exception
            r2.close()     // Catch:{ IOException -> 0x02b2, RCN | RJv -> 0x02b3 }
        L_0x02b2:
            throw r0     // Catch:{ RCN | RJv -> 0x02b3 }
        L_0x02b3:
            r1 = move-exception
            java.lang.String r0 = "failed to parse attestation object"
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)     // Catch:{ JSONException -> 0x02e8 }
            goto L_0x02c1
        L_0x02bb:
            java.lang.String r0 = "COSE key ill-formed"
            java.lang.IllegalArgumentException r0 = X.Pxe.A0h(r0, r1)     // Catch:{ JSONException -> 0x02e8 }
        L_0x02c1:
            throw r0     // Catch:{ JSONException -> 0x02e8 }
        L_0x02c2:
            com.google.android.gms.fido.fido2.api.common.AuthenticatorErrorResponse r3 = r9.A03     // Catch:{ JSONException -> 0x0314 }
            if (r3 == 0) goto L_0x02f0
            org.json.JSONObject r0 = X.DbS.A11()     // Catch:{ JSONException -> 0x02e0 }
            java.lang.String r2 = "code"
            com.google.android.gms.fido.fido2.api.common.ErrorCode r1 = r3.A00     // Catch:{ JSONException -> 0x02e0 }
            int r1 = r1.A00     // Catch:{ JSONException -> 0x02e0 }
            r0.put(r2, r1)     // Catch:{ JSONException -> 0x02e0 }
            java.lang.String r2 = r3.A01     // Catch:{ JSONException -> 0x02e0 }
            if (r2 == 0) goto L_0x02dd
            java.lang.String r1 = "message"
            r0.put(r1, r2)     // Catch:{ JSONException -> 0x02e0 }
        L_0x02dd:
            java.lang.String r21 = "error"
            goto L_0x02f3
        L_0x02e0:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticatorErrorResponse to JSON object"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r1)     // Catch:{ JSONException -> 0x0314 }
            goto L_0x02ef
        L_0x02e8:
            r1 = move-exception
            java.lang.String r0 = "Error encoding AuthenticatorAttestationResponse to JSON object"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r1)     // Catch:{ JSONException -> 0x0314 }
        L_0x02ef:
            throw r0     // Catch:{ JSONException -> 0x0314 }
        L_0x02f0:
            r0 = 0
            goto L_0x02f3
        L_0x02f2:
            r11 = 1
        L_0x02f3:
            if (r0 == 0) goto L_0x02fa
            r1 = r21
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x0314 }
        L_0x02fa:
            com.google.android.gms.fido.fido2.api.common.AuthenticationExtensionsClientOutputs r0 = r9.A00     // Catch:{ JSONException -> 0x0314 }
            java.lang.String r1 = "clientExtensionResults"
            if (r0 == 0) goto L_0x0301
            goto L_0x0308
        L_0x0301:
            if (r11 == 0) goto L_0x030f
            org.json.JSONObject r0 = X.DbS.A11()     // Catch:{ JSONException -> 0x0314 }
            goto L_0x030c
        L_0x0308:
            org.json.JSONObject r0 = r0.A00()     // Catch:{ JSONException -> 0x0314 }
        L_0x030c:
            r8.put(r1, r0)     // Catch:{ JSONException -> 0x0314 }
        L_0x030f:
            java.lang.String r0 = r8.toString()
            return r0
        L_0x0314:
            r1 = move-exception
            java.lang.String r0 = "Error encoding PublicKeyCredential to JSON object"
            java.lang.RuntimeException r0 = X.Pxe.A0u(r0, r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.PublicKeyCredential.A00():java.lang.String");
    }
}
