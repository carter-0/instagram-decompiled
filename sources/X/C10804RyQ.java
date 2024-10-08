package X;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.RyQ  reason: case insensitive filesystem */
public final class C10804RyQ {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public List A07;

    public static Bundle A00(String str, String str2, String str3, String str4, String str5, String str6, List list) {
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putString("autofill_iab_session_id", str5);
        A0a.putString("ad_id", str);
        A0a.putString("current_url", str3);
        A0a.putString("origin_host", str6);
        A0a.putString("autofill_form_id", str4);
        A0a.putString("autofill_mobile_app_id", "5678");
        A0a.putString("autofill_type", str2);
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C10847Rz7 rz7 = (C10847Rz7) it.next();
            Bundle A0a2 = AnonymousClass7TE.A0a();
            A0a2.putString("InputAutocomplete", rz7.A04);
            A0a2.putString("PlaceHolder", rz7.A0A);
            A0a2.putString("DetectionResult", rz7.A03);
            A0a2.putString("Message", rz7.A09);
            A0a2.putString("InputType", rz7.A07);
            A0a2.putString("InputId", rz7.A05);
            A0a2.putString("InputName", rz7.A06);
            A0a2.putString("AutofillTag", rz7.A01);
            A0a2.putString("label", rz7.A08);
            A0a2.putString("detected_autofill_tag", rz7.A02);
            A0a2.putBoolean("is_valid_credit_card", rz7.A0D);
            A0a2.putBoolean("is_digit", rz7.A0B);
            A0a2.putBoolean("is_luhn_compliant", rz7.A0C);
            A0a2.putInt("text_length", rz7.A00);
            A1C.add(A0a2);
        }
        A0a.putParcelableArrayList("autofill_field_detection_bundle_data_list", A1C);
        return A0a;
    }
}
