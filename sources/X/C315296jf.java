package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.reels.prompt.model.PromptStickerModel;

/* renamed from: X.6jf  reason: invalid class name and case insensitive filesystem */
public final class C315296jf implements C315036jF {
    public boolean A00;

    public final View C8E(C255773uh r2, C316026kz r3) {
        return null;
    }

    public final AnonymousClass9UE C8F(UserSession userSession, C255773uh r7, C316026kz r8) {
        C316006kx r82;
        AnonymousClass4X0 r2;
        0qQ.A0B(r8, 2);
        if (!(r8 instanceof C316006kx) || (r82 = (C316006kx) r8) == null || (r2 = r82.A1T) == null || r2.A01 == null) {
            return null;
        }
        r2.A05();
        View A05 = r2.A05();
        return new AnonymousClass9UE(A05, 0, -((A05.getHeight() / 2) + A05.getContext().getResources().getDimensionPixelOffset(R.dimen.abc_action_bar_elevation_material)), true);
    }

    public final AnonymousClass5Gs C8I(Context context, UserSession userSession, C255773uh r5, C250973mM r6) {
        0qQ.A0B(context, 1);
        String string = context.getString(2131974568);
        0qQ.A07(string);
        return new C315476jx((CharSequence) string);
    }

    public final void DsI(Context context, AnonymousClass0iw r6, UserSession userSession, C255773uh r8, C250973mM r9) {
        0qQ.A0B(userSession, 0);
        if (!this.A00) {
            this.A00 = true;
            1Av A002 = 1Au.A00(userSession);
            int i = 1Au.A00(userSession).A01.getInt("stories_template_new_sticker_impression_count", 0) + 1;
            0xY AR4 = A002.A01.AR4();
            AR4.E5Z("stories_template_new_sticker_impression_count", i);
            AR4.apply();
        }
    }

    public final boolean EtQ(UserSession userSession, C255773uh r5, C250973mM r6, C316026kz r7) {
        PromptStickerModel A0F;
        0qQ.A0B(userSession, 0);
        0qQ.A0B(r5, 1);
        0qQ.A0B(r6, 2);
        C255783ui A002 = C289745e8.A00(AnonymousClass3WT.PROMPT, r5.A0b());
        if (r6.A0H.A1a || A002 == null || A002.A0F() == null || (A0F = A002.A0F()) == null || !A0F.A0M() || this.A00 || 1Au.A00(userSession).A01.getInt("stories_template_new_sticker_impression_count", 0) >= 3 || 1Au.A00(userSession).A01.getBoolean("stories_template_add_yours_clicked", false)) {
            return false;
        }
        return true;
    }

    public final C226262fy C8G() {
        return C226262fy.ABOVE_ANCHOR;
    }
}
