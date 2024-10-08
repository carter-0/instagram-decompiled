package X;

import android.view.ViewGroup;
import android.view.ViewStub;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.7Km  reason: invalid class name and case insensitive filesystem */
public final class C329857Km {
    public ViewGroup A00;
    public String A01;
    public String A02;
    public boolean A03;
    public final ViewStub A04;
    public final AnonymousClass0iw A05;
    public final UserSession A06;
    public final ImageUrl A07;
    public final String A08;

    public C329857Km(ViewStub viewStub, AnonymousClass0iw r3, UserSession userSession, ImageUrl imageUrl, String str) {
        0qQ.A0B(viewStub, 3);
        this.A08 = str;
        this.A07 = imageUrl;
        this.A04 = viewStub;
        this.A05 = r3;
        this.A06 = userSession;
    }

    public static final boolean A00(C329857Km r10, CharSequence charSequence) {
        String str;
        String str2 = r10.A01;
        if (str2 == null || (str = r10.A02) == null) {
            return false;
        }
        StringBuilder sb = new StringBuilder();
        int length = charSequence.length();
        for (int i = 0; i < length; i++) {
            char charAt = charSequence.charAt(i);
            if (Character.isLetterOrDigit(charAt)) {
                sb.append(charAt);
            }
        }
        StringBuilder sb2 = new StringBuilder();
        int length2 = str.length();
        for (int i2 = 0; i2 < length2; i2++) {
            char charAt2 = str.charAt(i2);
            if (Character.isDigit(charAt2)) {
                sb2.append(charAt2);
            }
        }
        String obj = sb2.toString();
        0qQ.A07(obj);
        int length3 = str2.length();
        if (length3 <= 3) {
            return false;
        }
        String substring = str2.substring(3);
        0qQ.A07(substring);
        StringBuilder sb3 = new StringBuilder();
        int i3 = 0;
        do {
            char charAt3 = str2.charAt(i3);
            if (Character.isDigit(charAt3)) {
                sb3.append(charAt3);
            }
            i3++;
        } while (i3 < length3);
        String obj2 = sb3.toString();
        0qQ.A07(obj2);
        if (00l.A0d(sb, obj2, false) || 00l.A0d(sb, obj, false) || 00l.A0d(sb, substring, false)) {
            return true;
        }
        return false;
    }

    public final void A01() {
        ViewGroup viewGroup = this.A00;
        if (viewGroup != null) {
            if (viewGroup.getVisibility() == 0) {
                ViewGroup viewGroup2 = this.A00;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(8);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("rootView");
        throw AnonymousClass00P.createAndThrow();
    }
}
