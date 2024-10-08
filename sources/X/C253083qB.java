package X;

import android.graphics.Shader;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* renamed from: X.3qB  reason: invalid class name and case insensitive filesystem */
public final class C253083qB {
    public Set A00;
    public final UserSession A01;

    public final void A01(SpannableStringBuilder spannableStringBuilder) {
        Set set = this.A00;
        if (set == null) {
            set = A00();
            this.A00 = set;
        }
        if (!set.isEmpty()) {
            String obj = spannableStringBuilder.toString();
            0qQ.A07(obj);
            Locale locale = Locale.getDefault();
            0qQ.A07(locale);
            String lowerCase = obj.toLowerCase(locale);
            0qQ.A07(lowerCase);
            if (set.contains(lowerCase) && A02(this.A01)) {
                C380229Xd r2 = new C380229Xd(spannableStringBuilder.toString(), (float[]) null, AnonymousClass5BH.A00);
                r2.A01 = 7;
                r2.A02 = Shader.TileMode.REPEAT;
                spannableStringBuilder.setSpan(r2, 0, spannableStringBuilder.length(), 33);
            }
        }
    }

    public final boolean A02(UserSession userSession) {
        0qQ.A0B(userSession, 0);
        boolean z = false;
        if (182.A04(0Tu.A06, userSession, 36877302168223874L).length() == 0) {
            z = true;
        }
        return !z;
    }

    public final HashSet A00() {
        HashSet hashSet = new HashSet();
        UserSession userSession = this.A01;
        if (A02(userSession)) {
            try {
                0qQ.A0B(userSession, 0);
                for (String str : (String[]) new 11S(",").A03(new String(Base64.decode(182.A04(0Tu.A06, userSession, 36877302168223874L), 0), AnonymousClass15Q.A05)).toArray(new String[0])) {
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        int i2 = length;
                        if (!z) {
                            i2 = i;
                        }
                        int A002 = 0qQ.A00(str.charAt(i2), 32);
                        boolean z2 = false;
                        if (A002 <= 0) {
                            z2 = true;
                        }
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (!z2) {
                            z = true;
                        } else {
                            i++;
                        }
                    }
                    String obj = str.subSequence(i, length + 1).toString();
                    Locale locale = Locale.getDefault();
                    0qQ.A07(locale);
                    String lowerCase = obj.toLowerCase(locale);
                    0qQ.A07(lowerCase);
                    if (!00p.A0k(lowerCase, "#", false)) {
                        lowerCase = 002.A0D(lowerCase, '#');
                    }
                    hashSet.add(lowerCase);
                }
            } catch (IllegalArgumentException e) {
                0wb.A06("HashtagColorizer", "Error parsing colorized hashtag list", e);
                return hashSet;
            }
        }
        return hashSet;
    }

    public C253083qB(UserSession userSession) {
        this.A01 = userSession;
    }
}
