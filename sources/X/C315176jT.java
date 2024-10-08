package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.text.NumberFormat;
import java.util.Locale;

/* renamed from: X.6jT  reason: invalid class name and case insensitive filesystem */
public final class C315176jT implements C315036jF {
    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r3, C316026kz r4) {
        return null;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }

    public final boolean EtQ(UserSession userSession, C255773uh r7, C250973mM r8, C316026kz r9) {
        User user = r7.A0i;
        user.getClass();
        if (!user.equals(AnonymousClass0t1.A01.A01(userSession)) || r7.A0a().isEmpty()) {
            return false;
        }
        1Av A00 = 1Au.A00(userSession);
        if (((Boolean) A00.A41.CDM(A00, 1Av.A8a[128])).booleanValue() || !(r9 instanceof C316006kx)) {
            return false;
        }
        C316006kx r92 = (C316006kx) r9;
        if (r92.A0A == AnonymousClass3BQ.DIRECT || r92.A1e.A0S == null) {
            return false;
        }
        return true;
    }

    public final View C8E(C255773uh r2, C316026kz r3) {
        return r3.CFK();
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r10, C250973mM r11) {
        String string;
        boolean A1m = r10.A1m();
        int size = r10.A0a().size();
        if (size != 0) {
            if (size != 1) {
                int i = R.plurals.multi_author_story_view_count_nux_photo_title_plural;
                if (A1m) {
                    i = R.plurals.multi_author_story_view_count_nux_video_title_plural;
                }
                int size2 = r10.A0a().size() - 1;
                string = context.getResources().getQuantityString(i, size2, new Object[]{r10.A0a().get(0), NumberFormat.getInstance(Locale.getDefault()).format((long) size2)});
            } else {
                int i2 = 2131967695;
                if (A1m) {
                    i2 = 2131967696;
                }
                string = context.getString(i2, new Object[]{r10.A0a().get(0)});
            }
            return new C315476jx((CharSequence) string);
        }
        throw new UnsupportedOperationException("Not expecting to generate string for reel item with no aggregated views");
    }

    public final void DsI(Context context, AnonymousClass0iw r7, UserSession userSession, C255773uh r9, C250973mM r10) {
        1Av A00 = 1Au.A00(userSession);
        A00.A41.Epx(A00, true, 1Av.A8a[128]);
    }
}
