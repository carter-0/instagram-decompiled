package X;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import com.instagram.user.model.User;

public final class K7K extends AnonymousClass4DH implements C273494mf {
    public static final String __redex_internal_original_name = "NewUserActivationLoginFragment";
    public final AnonymousClass0eM A00 = C227642jf.A02(this);

    public final /* synthetic */ void configureElementAboveTitle(C252063oV r1) {
    }

    public final String getModuleName() {
        return "new_user_activation_login";
    }

    public final /* synthetic */ void onBottomSheetPositionChanged(int i, int i2) {
    }

    public final /* synthetic */ EVS backPressDestination() {
        return EVS.CLOSED_STATE;
    }

    public final /* synthetic */ boolean doNotDismissOnDraggingDown() {
        return false;
    }

    public final /* synthetic */ boolean doNotDragWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ boolean doNotFlingWhenDismissLocked() {
        return false;
    }

    public final /* synthetic */ int dragLockBouncePx() {
        return 0;
    }

    public final /* synthetic */ double getDragUpReleaseRatio() {
        return 0.5d;
    }

    public final /* synthetic */ int getExtraDragSpace() {
        return 0;
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A00);
    }

    public final /* synthetic */ double getSwipeDownDistanceAdjustment() {
        return 0.5d;
    }

    public final /* synthetic */ double getSwipeUpDistanceAdjustment() {
        return 0.0d;
    }

    public final /* synthetic */ boolean includeFragmentDragSpace() {
        return false;
    }

    public final /* synthetic */ boolean isElementAboveTitleEnabled() {
        return false;
    }

    public final /* synthetic */ boolean isScrolledToBottom() {
        return true;
    }

    public final /* synthetic */ boolean isScrolledToTop() {
        return true;
    }

    public final void onBottomSheetClosed() {
        Integer num;
        AnonymousClass37D A0g = DbV.A0g(this, AnonymousClass37D.A00);
        if (A0g != null) {
            num = ((AnonymousClass37F) A0g).A0K;
        } else {
            num = null;
        }
        if (num != AnonymousClass05K.A00) {
            AnonymousClass0eM r0 = this.A00;
            UserSession A0l = AnonymousClass7TE.A0l(r0);
            String A0p = JTT.A0p(r0);
            C62656KkI kkI = C62656KkI.PROFILE_LOGIN;
            LT4.A01(C62640Kk2.A02, C62662KkO.EXIT, (C62655KkH) null, C62644Kk6.DISMISS, (C62645Kk7) null, (C62646Kk8) null, kkI, A0l, A0p);
        }
    }

    public final /* synthetic */ boolean useCustomScrollDetermination() {
        return false;
    }

    public final /* synthetic */ float getSwipeDownFlingVelocity() {
        return 3500.0f;
    }

    public final /* synthetic */ float getSwipeUpFlingVelocity() {
        return 3500.0f;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        Drawable drawable;
        Bitmap bitmap;
        int A02 = AnonymousClass0fD.A02(-1625697316);
        LayoutInflater layoutInflater2 = layoutInflater;
        0qQ.A0B(layoutInflater2, 0);
        AnonymousClass0eM r6 = this.A00;
        UserSession A0l = AnonymousClass7TE.A0l(r6);
        String A0p = JTT.A0p(r6);
        LT4.A02(C62640Kk2.A02, (C62646Kk8) null, C62656KkI.PROFILE_LOGIN, A0l, A0p);
        User A0l2 = DbX.A0l(AnonymousClass0t1.A01, r6);
        View inflate = layoutInflater2.inflate(R.layout.new_user_activation_login, viewGroup, false);
        ViewStub A0F = DbS.A0F(inflate, R.id.login_button_view_stub);
        0lg A0X = DbT.A0X(r6);
        0Tu r8 = 0Tu.A05;
        boolean A06 = 182.A06(r8, A0X, 36324101790773033L);
        int i2 = R.layout.threads_login_button;
        if (A06) {
            i2 = R.layout.threads_login_button_with_chevron;
        }
        View A0H = JTP.A0H(A0F, i2);
        if (!(A0H instanceof ConstraintLayout) || A0H == null) {
            i = 1094703388;
        } else {
            TextView A0d = AnonymousClass7TE.A0d(inflate, R.id.not_now_button);
            boolean A062 = 182.A06(r8, DbT.A0X(r6), 36324101790838570L);
            Context requireContext = requireContext();
            int i3 = R.color.default_cta_dominant_color;
            if (A062) {
                i3 = R.color.igds_primary_text;
            }
            DbT.A17(requireContext, A0d, i3);
            DbU.A1H(AnonymousClass7TE.A0d(A0H, R.id.login_button_username), A0l2);
            GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) A0H.findViewById(R.id.login_button_profile_image);
            gradientSpinnerAvatarView.A05();
            if (AnonymousClass3HA.A00(requireContext())) {
                Context requireContext2 = requireContext();
                float A04 = 0nA.A04(requireContext2, 16);
                float A042 = 0nA.A04(requireContext2, 12);
                float A043 = 0nA.A04(requireContext2, 2);
                int i4 = (int) A04;
                Bitmap createBitmap = Bitmap.createBitmap(i4, i4, Bitmap.Config.ARGB_8888);
                0qQ.A07(createBitmap);
                Paint A0C = JTO.A0C();
                AnonymousClass7TE.A1N(requireContext2, A0C, R.color.grey_9);
                A0C.setAntiAlias(true);
                AnonymousClass7TE.A1Q(A0C);
                Paint A0C2 = JTO.A0C();
                A0C2.setAntiAlias(true);
                A0C2.setColorFilter(new PorterDuffColorFilter(AnonymousClass7TE.A0A(requireContext2), PorterDuff.Mode.SRC_IN));
                Drawable drawable2 = requireContext2.getDrawable(R.drawable.instagram_app_instagram_pano_outline_24);
                if (drawable2 != null) {
                    int i5 = (int) A042;
                    if (!(drawable2 instanceof BitmapDrawable) || ((BitmapDrawable) drawable2).getBitmap() != null) {
                        bitmap = C62953Kp5.A00(drawable2, i5, i5);
                    } else {
                        bitmap = null;
                    }
                } else {
                    bitmap = null;
                }
                Canvas A0B = JTO.A0B(createBitmap);
                float f = A04 / 2.0f;
                A0B.drawCircle(f, f, f, A0C);
                if (bitmap != null) {
                    A0B.drawBitmap(bitmap, A043, A043, A0C2);
                }
                drawable = new BitmapDrawable(AnonymousClass7TF.A0A(requireContext2), createBitmap);
            } else {
                drawable = requireContext().getDrawable(R.drawable.ig_badge_color_logo);
            }
            gradientSpinnerAvatarView.setBottomBadgeDrawable(drawable);
            gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, this, A0l2.Bh3());
            gradientSpinnerAvatarView.A00 = 0nA.A04(requireContext(), 4);
            gradientSpinnerAvatarView.A01 = 0nA.A04(requireContext(), 4);
            LYB.A00(A0H, 57, this);
            LYB.A00(A0d, 58, this);
            i = -600096601;
        }
        AnonymousClass0fD.A09(i, A02);
        return inflate;
    }
}
