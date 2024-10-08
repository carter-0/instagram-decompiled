package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.leadgen.core.model.privacypolicy.LeadGenPrivacyPolicy;

public abstract class VEQ {
    public static final void A00(TextView textView, UserSession userSession, LeadGenPrivacyPolicy leadGenPrivacyPolicy, boolean z) {
        SpannableStringBuilder spannableStringBuilder;
        SpannableStringBuilder spannableStringBuilder2;
        String str;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 2);
        TextView textView2 = textView;
        Context context = textView2.getContext();
        LeadGenPrivacyPolicy leadGenPrivacyPolicy2 = leadGenPrivacyPolicy;
        String str2 = leadGenPrivacyPolicy2.A04;
        boolean z2 = false;
        if (str2 != null) {
            z2 = 00l.A0d(str2, ";;/;;", false);
        }
        if (z2) {
            spannableStringBuilder = new SpannableStringBuilder();
            if (str2 != null) {
                try {
                    if (leadGenPrivacyPolicy2.A01 != null) {
                        String str3 = leadGenPrivacyPolicy2.A00;
                        if (str3 != null) {
                            spannableStringBuilder.append(00p.A0g(str2, ";;/;;", str3, false));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        spannableStringBuilder.append(00p.A0g(str2, ";;/;;", "", false));
                    }
                } catch (NullPointerException unused) {
                    spannableStringBuilder.append(str2);
                }
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        } else if (str2 != null) {
            spannableStringBuilder = new SpannableStringBuilder(str2);
            if (leadGenPrivacyPolicy2.A01 != null) {
                SpannableStringBuilder append = spannableStringBuilder.append(" ");
                String str4 = leadGenPrivacyPolicy2.A02;
                if (str4 != null) {
                    spannableStringBuilder2 = append.append(str4).append(context.getResources().getString(2131961000));
                    str = leadGenPrivacyPolicy2.A00;
                    if (str == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            } else if (leadGenPrivacyPolicy2.A03 != null) {
                spannableStringBuilder2 = spannableStringBuilder.append(" ");
                str = leadGenPrivacyPolicy2.A02;
                if (str == null) {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            spannableStringBuilder2.append(str);
        } else {
            throw new IllegalStateException("Required value was null.");
        }
        String str5 = leadGenPrivacyPolicy2.A03;
        boolean z3 = z;
        if (str5 != null) {
            String str6 = leadGenPrivacyPolicy2.A02;
            if (str6 != null) {
                Uri A09 = DbT.A09(str5);
                0qQ.A0A(context);
                U2J u2j = new U2J(context, A09, userSession2, z3);
                String A10 = DbT.A10(spannableStringBuilder);
                int A08 = 00l.A08(A10, str6, 0, false);
                while (A08 >= 0) {
                    AnonymousClass0eM r0 = 0mp.A09;
                    int length = A08 + str6.length();
                    spannableStringBuilder.setSpan(new U2J(u2j.A00, u2j.A01, u2j.A02, u2j.A03), A08, length, 33);
                    A08 = 00l.A08(A10, str6, length, false);
                }
                DbT.A1H(textView2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        String str7 = leadGenPrivacyPolicy2.A01;
        if (str7 != null) {
            String str8 = leadGenPrivacyPolicy2.A00;
            if (str8 != null) {
                Uri A092 = DbT.A09(str7);
                0qQ.A0A(context);
                AnonymousClass7AV.A05(spannableStringBuilder, new U2J(context, A092, userSession2, z3), str8);
                DbT.A1H(textView2);
            } else {
                throw new IllegalStateException("Required value was null.");
            }
        }
        textView2.setText(spannableStringBuilder);
    }
}
