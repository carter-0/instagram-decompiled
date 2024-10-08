package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.google.gson.Gson;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.SHz  reason: case insensitive filesystem */
public final class C11265SHz {
    public int A00;
    public int A01;
    public long A02;
    public long A03;
    public Long A04;
    public String A05;
    public String A06;
    public String A07;
    public String A08;
    public String A09;
    public String A0A;
    public String A0B;
    public String A0C;
    public String A0D;
    public String A0E;
    public String A0F;
    public String A0G;
    public String A0H;
    public String A0I;
    public String A0J;
    public Map A0K;
    public Map A0L;
    public boolean A0M;
    public boolean A0N;
    public boolean A0O;
    public boolean A0P;
    public final boolean A0Q;

    public /* synthetic */ C11265SHz(Long l, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12, String str13, String str14, String str15, Map map, Map map2, int i, int i2, long j, long j2, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean A1V = AnonymousClass7TF.A1V(C249113j9.A01);
        this.A0I = str;
        this.A0B = str2;
        this.A0G = str3;
        this.A0F = str4;
        this.A06 = str5;
        this.A07 = str6;
        this.A0C = str7;
        this.A08 = str8;
        this.A0D = str9;
        this.A0A = str10;
        this.A09 = str11;
        this.A0H = str12;
        this.A0E = str13;
        this.A0P = z;
        this.A02 = j;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = j2;
        this.A0L = map;
        this.A0J = str14;
        this.A0O = z2;
        this.A0N = z3;
        this.A04 = l;
        this.A05 = str15;
        this.A0Q = z4;
        this.A0K = map2;
        this.A0M = A1V;
    }

    public static final void A00(C11265SHz sHz, Map map) {
        String str = sHz.A0B;
        if (!(str == null || str.length() == 0)) {
            map.put("iab_session_id", str);
        }
        String str2 = sHz.A0G;
        if (str2 != null) {
            map.put("selected_field_tag", str2);
        }
        String str3 = sHz.A0F;
        if (str3 != null) {
            map.put("requested_fields", str3);
        }
        String str4 = sHz.A06;
        if (str4 != null) {
            map.put("all_fields", str4);
        }
        String str5 = sHz.A07;
        if (str5 != null) {
            map.put("available_fields", str5);
        }
        String str6 = sHz.A0C;
        if (str6 != null) {
            map.put("new_fields", str6);
        }
        String str7 = sHz.A08;
        if (str7 != null) {
            map.put("current_url", str7);
        }
        String str8 = sHz.A0D;
        if (str8 != null) {
            map.put("origin_host", str8);
        }
        String str9 = sHz.A0A;
        if (str9 != null) {
            map.put("form_session_id", str9);
        }
        String str10 = sHz.A09;
        if (str10 != null) {
            map.put("edited_fields", str10);
        }
        String str11 = sHz.A0J;
        if (str11 != null) {
            map.put("user_credentials_status", str11);
        }
        map.put("has_helium", String.valueOf(sHz.A0M));
    }

    public final HashMap A01() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("action", "BrowserLiteIntent.IAB_AUTOFILL_INTERACTION");
        A1E.put("user_action", this.A0I);
        A00(this, A1E);
        String str = this.A0H;
        if (str != null) {
            A1E.put(PublicKeyCredentialControllerUtility.JSON_KEY_TYPE, str);
        }
        String str2 = this.A0E;
        if (str2 != null) {
            A1E.put("payment_credential_ids", str2);
        }
        A1E.put("with_ads_disclosure", String.valueOf(this.A0P));
        long j = this.A02;
        if (j != 0) {
            A1E.put("form_completion_duration", String.valueOf(j));
        }
        int i = this.A00;
        if (i != 0) {
            A1E.put("event_times", String.valueOf(i));
        }
        int i2 = this.A01;
        if (i2 != 0) {
            A1E.put("time_spend", String.valueOf(i2));
        }
        long j2 = this.A03;
        if (j2 > 0) {
            A1E.put("index", String.valueOf(j2));
        }
        Map map = this.A0L;
        if (map != null) {
            map.put("is_bloks_screen", String.valueOf(this.A0Q));
            String A0C2 = new Gson().A0C(map, new R2O().type);
            0qQ.A07(A0C2);
            A1E.put("enhanced_regex_new_fields_metadata", A0C2);
        }
        A1E.put("is_payment_opt_in", String.valueOf(this.A0O));
        A1E.put("is_contact_opt_in", String.valueOf(this.A0N));
        A1E.put("has_helium", String.valueOf(this.A0M));
        String str3 = this.A05;
        if (str3 != null) {
            A1E.put("ad_id", str3);
        }
        A1E.put("IS_BLOKS_LOG_EVENT", String.valueOf(this.A0Q));
        Map map2 = this.A0K;
        if (map2 != null) {
            String A0C3 = new Gson().A0C(map2, new R2N().type);
            0qQ.A07(A0C3);
            A1E.put("experiments", A0C3);
        }
        return A1E;
    }
}
