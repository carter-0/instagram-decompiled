package X;

import android.content.Context;
import com.facebook.phonenumbers.PhoneNumberUtil;

/* renamed from: X.3DP  reason: invalid class name */
public final class AnonymousClass3DP implements AnonymousClass1qK {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public boolean A04 = false;

    public AnonymousClass3DP(Context context, String str, String str2) {
        this.A03 = str;
        this.A02 = str2;
        try {
            C3259474u A0F = PhoneNumberUtil.A01(context).A0F(str2, (String) null);
            this.A00 = String.valueOf(A0F.A00);
            this.A01 = String.valueOf(A0F.A02);
        } catch (C231962sh unused) {
            0wb.A03("PhoneNumberVerifiedEvent", "Unable to parse verified phone number.");
            this.A04 = true;
        }
    }

    public AnonymousClass3DP() {
    }
}
