package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

public final class N3I extends AnonymousClass0T0 {
    public final Activity A00;
    public final RectF A01;
    public final Fragment A02;
    public final UserSession A03;
    public final ImageUrl A04;
    public final OMU A05;
    public final Long A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final List A0B;
    public final List A0C;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof N3I) {
                N3I n3i = (N3I) obj;
                if (!0qQ.A0K(this.A09, n3i.A09) || !0qQ.A0K(this.A08, n3i.A08) || !0qQ.A0K(this.A07, n3i.A07) || !0qQ.A0K(this.A01, n3i.A01) || !0qQ.A0K(this.A05, n3i.A05) || !0qQ.A0K(this.A0C, n3i.A0C) || !0qQ.A0K(this.A06, n3i.A06) || !0qQ.A0K(this.A0A, n3i.A0A) || !0qQ.A0K(this.A04, n3i.A04) || !0qQ.A0K(this.A0B, n3i.A0B) || !0qQ.A0K(this.A00, n3i.A00) || !0qQ.A0K(this.A02, n3i.A02) || !0qQ.A0K(this.A03, n3i.A03)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((((((((((((((((((AnonymousClass7TF.A08(this.A08, AnonymousClass7TE.A0O(this.A09)) + AnonymousClass7TG.A0E(this.A07)) * 31) + AnonymousClass7TG.A0C(this.A01)) * 31) + AnonymousClass7TG.A0C(this.A05)) * 31) + AnonymousClass7TG.A0C(this.A0C)) * 31) + AnonymousClass7TG.A0C(this.A06)) * 31) + AnonymousClass7TG.A0E(this.A0A)) * 31) + AnonymousClass7TG.A0C(this.A04)) * 31) + AnonymousClass7TG.A0C(this.A0B)) * 31) + AnonymousClass7TG.A0C(this.A00)) * 31) + AnonymousClass7TG.A0C(this.A02)) * 31) + AnonymousClass7TE.A0L(this.A03);
    }

    public N3I(Activity activity, RectF rectF, Fragment fragment, UserSession userSession, ImageUrl imageUrl, OMU omu, Long l, String str, String str2, String str3, String str4, List list, List list2) {
        this.A09 = str;
        this.A08 = str2;
        this.A07 = str3;
        this.A01 = rectF;
        this.A05 = omu;
        this.A0C = list;
        this.A06 = l;
        this.A0A = str4;
        this.A04 = imageUrl;
        this.A0B = list2;
        this.A00 = activity;
        this.A02 = fragment;
        this.A03 = userSession;
    }
}
