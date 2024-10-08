package X;

import android.view.animation.AlphaAnimation;
import com.instagram.common.session.UserSession;
import com.instagram.direct.inbox.notes.models.NoteStyle;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;

/* renamed from: X.9Ou  reason: invalid class name and case insensitive filesystem */
public abstract class C378179Ou {
    public static final AnonymousClass913 A00(C279864zZ r2) {
        AnonymousClass913 r0;
        int i;
        NoteStyle noteStyle = (NoteStyle) NoteStyle.A01.get(Integer.valueOf(r2.A01));
        if (noteStyle == null) {
            noteStyle = NoteStyle.UNKNOWN;
        }
        switch (noteStyle.ordinal()) {
            case 1:
                r0 = new AnonymousClass91B(r2);
                break;
            case 2:
                r0 = new AnonymousClass912(r2);
                break;
            case 4:
                i = 4;
                break;
            case 5:
                r0 = new C382039cz(r2, 1);
                break;
            case 7:
                i = 5;
                break;
            case 8:
                i = 2;
                break;
            case 9:
                i = 1;
                break;
            case 10:
                i = 0;
                break;
            default:
                return null;
        }
        r0 = new AnonymousClass9IJ(r2, i);
        return r0;
    }

    public static final void A01(NoteBubbleView noteBubbleView, boolean z) {
        if (noteBubbleView != null) {
            float f = 0.0f;
            float f2 = 1.0f;
            if (z) {
                f2 = 0.0f;
                f = 1.0f;
            }
            AlphaAnimation alphaAnimation = new AlphaAnimation(f2, f);
            alphaAnimation.setDuration(200);
            alphaAnimation.setFillAfter(!z);
            noteBubbleView.post(new C41177Apb(alphaAnimation, noteBubbleView, z));
        }
    }

    public static final boolean A02(UserSession userSession, boolean z) {
        if (z || !AnonymousClass4AJ.A08(userSession) || !182.A06(0Tu.A05, userSession, 36328461182188907L)) {
            return false;
        }
        return true;
    }
}
