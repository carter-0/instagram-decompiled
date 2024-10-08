package com.google.android.gms.fido.fido2.api.common;

import X.002;
import X.AnonymousClass7TE;
import X.C301145yd;
import X.C3735896d;
import X.C9709RfS;
import X.DbS;
import X.Pxf;
import X.Pxj;
import X.SWX;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

public final class zzak extends AbstractSafeParcelable {
    public static final byte[] A01 = "WebAuthn PRF\u0000".getBytes(StandardCharsets.UTF_8);
    public static final Parcelable.Creator CREATOR = SWX.A00(63);
    public final byte[][] A00;

    public static zzak A00(JSONObject jSONObject, boolean z) {
        byte[] bArr;
        byte[] bArr2;
        byte[] bArr3;
        ArrayList A1C = AnonymousClass7TE.A1C();
        try {
            if (jSONObject.has("eval")) {
                A1C.add((Object) null);
                if (z) {
                    bArr3 = A02(jSONObject.getJSONObject("eval"));
                } else {
                    JSONObject jSONObject2 = jSONObject.getJSONObject("eval");
                    bArr3 = A03(Pxj.A1a("first", jSONObject2));
                    if (jSONObject2.has("second")) {
                        bArr3 = C9709RfS.A00(bArr3, A03(Pxj.A1a("second", jSONObject2)));
                    }
                }
                A1C.add(bArr3);
            }
            if (jSONObject.has("evalByCredential")) {
                JSONObject jSONObject3 = jSONObject.getJSONObject("evalByCredential");
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String A18 = AnonymousClass7TE.A18(keys);
                    if (A18 == null) {
                        bArr = null;
                    } else {
                        bArr = Base64.decode(A18, 11);
                    }
                    A1C.add(bArr);
                    if (z) {
                        bArr2 = A02(jSONObject3.getJSONObject(A18));
                    } else {
                        JSONObject jSONObject4 = jSONObject3.getJSONObject(A18);
                        bArr2 = A03(Pxj.A1a("first", jSONObject4));
                        if (jSONObject4.has("second")) {
                            bArr2 = C9709RfS.A00(bArr2, A03(Pxj.A1a("second", jSONObject4)));
                        }
                    }
                    A1C.add(bArr2);
                }
            }
            return new zzak((byte[][]) A1C.toArray(new byte[0][]));
        } catch (IllegalArgumentException unused) {
            throw new JSONException("invalid base64url value");
        }
    }

    public static byte[] A02(JSONObject jSONObject) {
        byte[] A1a = Pxj.A1a("first", jSONObject);
        if (A1a.length != 32) {
            throw new JSONException("hashed PRF value with wrong length");
        } else if (!jSONObject.has("second")) {
            return A1a;
        } else {
            byte[] A1a2 = Pxj.A1a("second", jSONObject);
            if (A1a2.length == 32) {
                return C9709RfS.A00(A1a, A1a2);
            }
            throw new JSONException("hashed PRF value with wrong length");
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x003b  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0080  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static byte[] A03(byte[] r8) {
        /*
            X.Tb5 r2 = X.C9993Rkn.A00
            X.SyG r2 = (X.SyG) r2
            boolean r0 = r2.A02
            if (r0 == 0) goto L_0x0018
            java.security.MessageDigest r0 = r2.A01     // Catch:{ CloneNotSupportedException -> 0x0018 }
            java.lang.Object r1 = r0.clone()     // Catch:{ CloneNotSupportedException -> 0x0018 }
            java.security.MessageDigest r1 = (java.security.MessageDigest) r1     // Catch:{ CloneNotSupportedException -> 0x0018 }
            int r0 = r2.A00     // Catch:{ CloneNotSupportedException -> 0x0018 }
            X.Qv6 r7 = new X.Qv6     // Catch:{ CloneNotSupportedException -> 0x0018 }
            r7.<init>(r1, r0)     // Catch:{ CloneNotSupportedException -> 0x0018 }
            goto L_0x0029
        L_0x0018:
            java.security.MessageDigest r0 = r2.A01
            java.lang.String r0 = r0.getAlgorithm()
            java.security.MessageDigest r1 = java.security.MessageDigest.getInstance(r0)     // Catch:{ NoSuchAlgorithmException -> 0x0085 }
            int r0 = r2.A00
            X.Qv6 r7 = new X.Qv6
            r7.<init>(r1, r0)
        L_0x0029:
            byte[] r6 = A01
            r6.getClass()
            int r5 = r6.length
            boolean r0 = r7.A00
            r1 = r0 ^ 1
            r0 = 2136(0x858, float:2.993E-42)
            java.lang.String r4 = X.AnonymousClass000.A00(r0)
            if (r1 == 0) goto L_0x0080
            java.security.MessageDigest r3 = r7.A02
            r2 = 0
            r3.update(r6, r2, r5)
            r8.getClass()
            int r1 = r8.length
            boolean r0 = r7.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x007b
            r3.update(r8, r2, r1)
            boolean r0 = r7.A00
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0076
            r0 = 1
            r7.A00 = r0
            int r1 = r7.A01
            int r0 = r3.getDigestLength()
            if (r1 != r0) goto L_0x006d
            byte[] r1 = r3.digest()
        L_0x0063:
            X.Qv7 r0 = new X.Qv7
            r0.<init>(r1)
            byte[] r0 = r0.A00()
            return r0
        L_0x006d:
            byte[] r0 = r3.digest()
            byte[] r1 = java.util.Arrays.copyOf(r0, r1)
            goto L_0x0063
        L_0x0076:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x007b:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0080:
            java.lang.IllegalStateException r0 = X.AnonymousClass7TE.A0z(r4)
            throw r0
        L_0x0085:
            r0 = move-exception
            java.lang.AssertionError r0 = X.Pxe.A0e(r0)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzak.A03(byte[]):byte[]");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzak)) {
            return false;
        }
        return Arrays.deepEquals(this.A00, ((zzak) obj).A00);
    }

    public final int hashCode() {
        int i = 0;
        for (byte[] bArr : this.A00) {
            if (bArr != null) {
                i ^= Pxf.A08(bArr);
            }
        }
        return i;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        byte[][] bArr = this.A00;
        int A03 = Pxf.A03(parcel);
        C301145yd.A0I(parcel, bArr, 1);
        C301145yd.A06(parcel, A03);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x001f, code lost:
        if (r6[r3] != null) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public zzak(byte[][] r6) {
        /*
            r5 = this;
            r5.<init>()
            r2 = 1
            boolean r0 = X.AnonymousClass7TF.A1V(r6)
            X.AnonymousClass3Qk.A07(r0)
            int r4 = r6.length
            r0 = r4 & 1
            r1 = r0 ^ 1
            r0 = 1
            if (r2 == r1) goto L_0x0014
            r0 = 0
        L_0x0014:
            X.AnonymousClass3Qk.A07(r0)
            r3 = 0
        L_0x0018:
            if (r3 >= r4) goto L_0x0043
            if (r3 == 0) goto L_0x0021
            r1 = r6[r3]
            r0 = 0
            if (r1 == 0) goto L_0x0022
        L_0x0021:
            r0 = 1
        L_0x0022:
            X.AnonymousClass3Qk.A07(r0)
            int r1 = r3 + 1
            r0 = r6[r1]
            boolean r0 = X.AnonymousClass7TF.A1V(r0)
            X.AnonymousClass3Qk.A07(r0)
            r0 = r6[r1]
            int r2 = r0.length
            r0 = 32
            if (r2 == r0) goto L_0x003c
            r1 = 64
            r0 = 0
            if (r2 != r1) goto L_0x003d
        L_0x003c:
            r0 = 1
        L_0x003d:
            X.AnonymousClass3Qk.A07(r0)
            int r3 = r3 + 2
            goto L_0x0018
        L_0x0043:
            r5.A00 = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.fido.fido2.api.common.zzak.<init>(byte[][]):void");
    }

    public static JSONObject A01(byte[] bArr) {
        JSONObject A11 = DbS.A11();
        if (bArr.length == 32) {
            A11.put("first", Base64.encodeToString(bArr, 11));
            return A11;
        }
        A11.put("first", Base64.encodeToString(bArr, 0, 32, 11));
        A11.put("second", Base64.encodeToString(bArr, 32, 32, 11));
        return A11;
    }

    public final String toString() {
        try {
            JSONObject A11 = DbS.A11();
            int i = 0;
            JSONObject jSONObject = null;
            while (true) {
                byte[][] bArr = this.A00;
                if (i >= bArr.length) {
                    return 002.A0g("PrfExtension{", A11.toString(), "}");
                }
                if (bArr[i] == null) {
                    A11.put("eval", A01(bArr[i + 1]));
                } else {
                    if (jSONObject == null) {
                        jSONObject = DbS.A11();
                        A11.put("evalByCredential", jSONObject);
                    }
                    jSONObject.put(C3735896d.A00(bArr[i]), A01(bArr[i + 1]));
                }
                i += 2;
            }
        } catch (JSONException e) {
            return 002.A0g("PrfExtension{Exception:", e.getMessage(), "}");
        }
    }
}
