package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.6jY  reason: invalid class name and case insensitive filesystem */
public final class C315226jY implements C315036jF {
    public static final Rect A00 = new Rect();

    public final View C8E(C255773uh r2, C316026kz r3) {
        return null;
    }

    public final C226262fy C8G() {
        return C226262fy.BELOW_ANCHOR;
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r8, C316026kz r9) {
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.MENTION, r8.A0b());
        FrameLayout Bkk = r9.Bkk();
        if (A002 == null || Bkk == null) {
            return null;
        }
        int width = Bkk.getWidth();
        int height = Bkk.getHeight();
        float A003 = r8.A00();
        Rect rect = A00;
        C306746Ni.A00(rect, A002, A003, width, height);
        return new AnonymousClass9UE(Bkk, rect.centerX(), rect.bottom + Bkk.getContext().getResources().getDimensionPixelOffset(R.dimen.accent_edge_thickness), false);
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        return new C315476jx(context.getText(2131975013));
    }

    public final void DsI(Context context, AnonymousClass0iw r5, UserSession userSession, C255773uh r7, C250973mM r8) {
        0xY AR4 = 1Au.A00(userSession).A01.AR4();
        AR4.E5T("has_ever_seen_share_professional_sticker", true);
        AR4.apply();
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.MENTION, r5.A0b());
        if (A002 != null && "mention_professional_username".equals(A002.A1g)) {
            User user = r5.A0i;
            user.getClass();
            if (2R8.A05(userSession, user.getId()) || 1Au.A00(userSession).A01.getBoolean("has_ever_seen_share_professional_sticker", false)) {
                return false;
            }
            return true;
        }
        return false;
    }
}
