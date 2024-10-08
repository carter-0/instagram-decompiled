package X;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.SJe  reason: case insensitive filesystem */
public final class C11286SJe {
    public final int A00;
    public final long A01;
    public final Integer A02;
    public final String A03;
    public final String A04;
    public final String A05;
    public final String A06;
    public final String A07;
    public final Collection A08;
    public final HashMap A09;
    public final Map A0A;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj == null || !DbY.A1b(this, obj)) {
                return false;
            }
            C11286SJe sJe = (C11286SJe) obj;
            if (this.A01 != sJe.A01 || !0qQ.A0K(this.A05, sJe.A05) || !0qQ.A0K(this.A03, sJe.A03) || RVL.A00(this.A02) != RVL.A00(sJe.A02) || this.A00 != sJe.A00 || !RVK.A00(this.A07, sJe.A07) || !RVK.A00(this.A04, sJe.A04) || !RVK.A00(this.A09, sJe.A09) || !RVK.A00(this.A0A, sJe.A0A) || !RVK.A00(this.A08, sJe.A08) || !RVK.A00(this.A06, sJe.A06)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.A05, this.A03, Integer.valueOf(RVL.A00(this.A02)), Long.valueOf(this.A01), this.A07, this.A04, this.A09, Integer.valueOf(this.A00), this.A0A, this.A08, this.A06});
    }

    public C11286SJe(JSONObject jSONObject) {
        Integer num;
        this.A05 = jSONObject.optString("mSuccessfulResult", "");
        this.A03 = jSONObject.optString("mResponse", "");
        int A082 = Pxg.A08("mDedupState", jSONObject);
        if (A082 == 1) {
            num = AnonymousClass05K.A01;
        } else if (A082 != 2) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A0C;
        }
        this.A02 = num;
        String optString = jSONObject.optString("mUploadId", "");
        this.A07 = AnonymousClass7TF.A1Q(optString.length()) ? null : optString;
        String optString2 = jSONObject.optString("mStatus", "");
        this.A04 = optString2.length() == 0 ? null : optString2;
        String optString3 = jSONObject.optString("mUploadDomain", "");
        this.A06 = optString3.length() == 0 ? null : optString3;
        this.A01 = (long) Pxg.A08("mDedupDigestComputeTimeMs", jSONObject);
        this.A09 = null;
        this.A08 = null;
        this.A0A = 0Yt.A0E();
        this.A00 = jSONObject.optInt("mStatusCode", 0);
    }

    public final JSONObject A00() {
        JSONObject A11 = DbS.A11();
        A11.put("mSuccessfulResult", this.A05);
        A11.put("mResponse", this.A03);
        A11.put("mDedupState", RVL.A00(this.A02));
        A11.put("mUploadId", this.A07);
        A11.put("mStatus", this.A04);
        A11.put("mUploadDomain", this.A06);
        A11.put("mDedupDigestComputeTimeMs", this.A01);
        A11.put("mStatusCode", this.A00);
        return A11;
    }

    public final String toString() {
        String str;
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("mSuccessfulResult", this.A05);
        A1E.put("mResponse", this.A03);
        switch (this.A02.intValue()) {
            case 0:
                str = "NOT_ATTEMPTED";
                break;
            case 1:
                str = "FOUND";
                break;
            default:
                str = "NOT_FOUND";
                break;
        }
        A1E.put("mDedupState", str);
        A1E.put("mUploadId", this.A07);
        A1E.put("mStatus", this.A04);
        HashMap hashMap = this.A09;
        String str2 = null;
        if (hashMap != null) {
            str2 = hashMap.toString();
        }
        A1E.put("xSharingNonces", str2);
        A1E.put("mStatusCode", String.valueOf(this.A00));
        A1E.put("mResponseHeaders", this.A0A.toString());
        return A1E.toString();
    }

    public C11286SJe(Integer num, String str, String str2, String str3, String str4, String str5, ArrayList arrayList, HashMap hashMap, Map map, int i, long j) {
        0qQ.A0B(str, 1);
        this.A05 = str;
        this.A03 = str2;
        this.A02 = num;
        this.A01 = j;
        this.A07 = str3;
        this.A06 = str5;
        this.A04 = str4;
        this.A09 = hashMap;
        this.A08 = arrayList;
        this.A00 = i;
        this.A0A = map;
    }
}
