package X;

import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;

/* renamed from: X.OTa  reason: case insensitive filesystem */
public final class C70953OTa {
    public View.OnClickListener A00;
    public final SpannableStringBuilder A01;
    public final String A02;
    public final String A03;

    public C70953OTa(String str, String str2) {
        SpannableStringBuilder spannableStringBuilder;
        if (!TextUtils.isEmpty("")) {
            spannableStringBuilder = DbS.A0C("");
        } else {
            spannableStringBuilder = null;
        }
        this.A02 = str;
        this.A03 = str2;
        this.A01 = spannableStringBuilder;
    }

    public C70953OTa(String str, String str2, String str3) {
        SpannableStringBuilder spannableStringBuilder;
        if (!TextUtils.isEmpty(str3)) {
            spannableStringBuilder = DbS.A0C(str3);
        } else {
            spannableStringBuilder = null;
        }
        this.A02 = str;
        this.A03 = str2;
        this.A01 = spannableStringBuilder;
    }
}
