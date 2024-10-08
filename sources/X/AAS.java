package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgTextView;

public abstract class AAS {
    /* JADX WARNING: type inference failed for: r4v0, types: [android.widget.ImageView, android.view.View, com.instagram.common.ui.widget.imageview.ConstrainedImageView] */
    public static final void A00(UserSession userSession, AnonymousClass8MJ r13, C380549Yp r14, C317876nz r15, Long l, float f) {
        float f2;
        int A0H;
        AnonymousClass7TG.A1O(r14, r15);
        29J r2 = 27p.A01(userSession).A01;
        0qQ.A07(r2);
        r2.A02(r15.A0Z, r15.A00().name());
        View view = r14.A01;
        Context A0S = AnonymousClass7TE.A0S(view);
        A66 A02 = AJA.A02(A0S, userSession, r13, r15);
        r14.A03.A02();
        view.setVisibility(0);
        ? r4 = r14.A04;
        r4.setLayoutParams(new ViewGroup.LayoutParams(-2, (int) (((double) A0S.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height)) * C346897vw.A00(userSession))));
        Drawable drawable = A02.A00;
        r4.setImageDrawable(drawable);
        view.setContentDescription(A02.A02);
        view.setRotation(f);
        r14.A00 = new A75(userSession, r13, r14, r15, l);
        boolean A01 = A01(userSession, r13, r15);
        IgTextView igTextView = r14.A02;
        if (A01) {
            igTextView.setVisibility(0);
            igTextView.setTypeface(AnonymousClass0qo.A00(A0S).A02(0qm.A0T));
            GradientDrawable gradientDrawable = new GradientDrawable();
            gradientDrawable.setShape(0);
            gradientDrawable.setCornerRadius(AnonymousClass7TE.A01(igTextView.getContext().getResources(), R.dimen.abc_dialog_padding_top_material));
            Integer num = A02.A01;
            if (num != null) {
                A0H = num.intValue();
            } else {
                A0H = 2Yu.A0H(A0S, R.attr.igds_color_creation_tools_purple);
            }
            gradientDrawable.setColor(A0S.getColor(A0H));
            igTextView.setBackground(gradientDrawable);
        } else {
            igTextView.setVisibility(8);
        }
        AnonymousClass7TG.A1B(r4, drawable);
        Drawable drawable2 = r4.getDrawable();
        0qQ.A0A(drawable2);
        0qQ.A0B(drawable2, 0);
        int intrinsicWidth = drawable2.getIntrinsicWidth();
        int intrinsicHeight = drawable2.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            f2 = 2.2f;
        } else {
            f2 = ((float) intrinsicWidth) / ((float) intrinsicHeight);
        }
        r4.A00 = f2;
        int dimensionPixelSize = (int) (((double) A0S.getResources().getDimensionPixelSize(R.dimen.asset_picker_redesign_sticker_height)) * C346897vw.A00(userSession));
        r4.getLayoutParams().height = dimensionPixelSize;
        r4.getLayoutParams().width = (int) (((float) dimensionPixelSize) * f2);
        r4.setScaleType(ImageView.ScaleType.FIT_CENTER);
        r4.A01 = null;
        new C55973Hqe(r4, new MJ9(4, r15, r2), 182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36327297246050631L)).A00();
    }

    public static final boolean A01(UserSession userSession, AnonymousClass8MJ r6, C317876nz r7) {
        C317936o5 r2 = new C317936o5(userSession);
        boolean contains = AnonymousClass7TE.A0q(userSession).C1t("preference_sticker_drops_new_badge_interacted_with_sticker_ids").contains(r7.A0Z);
        if (r7.A00() == C318046oG.AVATAR_SEARCH && !contains && r2.A04()) {
            return true;
        }
        if (r7.A00() == C318046oG.IMAGINE_ME && !contains && 182.A06(0Tu.A05, userSession, 36327258594294069L)) {
            return true;
        }
        if (r7.A00() == C318046oG.WHATSAPP_STICKER && !contains) {
            return true;
        }
        if (!r6.CcX() || !AnonymousClass7TF.A1Y(r7.A0A, true) || contains) {
            return false;
        }
        return true;
    }
}
