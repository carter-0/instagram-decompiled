package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.avatar.ui.UpdateProfilePicturePagerAdapter$UpdateProfileTabType;
import com.instagram.avatars.coinflip.AvatarCoinFlipConfig;
import com.instagram.avatars.coinflip.AvatarCoinFlipSticker;
import com.instagram.avatars.coinflip.ProfileCoinFlipView;
import com.instagram.common.session.UserSession;
import java.lang.ref.WeakReference;
import java.util.List;

/* renamed from: X.6po  reason: invalid class name and case insensitive filesystem */
public final class C318956po implements C13907Tl7 {
    public AvatarCoinFlipConfig A00;
    public boolean A01;
    public boolean A02 = true;
    public boolean A03;
    public final Context A04;
    public final View A05;
    public final ProfileCoinFlipView A06;
    public final C267624bv A07 = new C318976pq(this);
    public final AnonymousClass0iw A08;
    public final UserSession A09;
    public final C252063oV A0A;
    public final C319656qy A0B;
    public final WeakReference A0C;
    public final WeakReference A0D;
    public final AnonymousClass0eM A0E = AnonymousClass0eN.A00(0eO.A02, new AnonymousClass9LD(this, 6));
    public final C62320sa A0F;
    public final 0sP A0G;
    public final AnonymousClass3NL A0H = new C318966pp(this);
    public final C62320sa A0I;
    public final C62320sa A0J;
    public final C62320sa A0K;
    public final C62320sa A0L;

    public C318956po(Context context, View view, ProfileCoinFlipView profileCoinFlipView, AnonymousClass0iw r8, UserSession userSession, C252063oV r10, C319656qy r11, WeakReference weakReference, WeakReference weakReference2, C62320sa r14, C62320sa r15, C62320sa r16, C62320sa r17, C62320sa r18, 0sP r19) {
        0qQ.A0B(userSession, 1);
        this.A09 = userSession;
        this.A04 = context;
        this.A0C = weakReference;
        this.A0D = weakReference2;
        this.A08 = r8;
        this.A05 = view;
        this.A06 = profileCoinFlipView;
        this.A0A = r10;
        this.A0B = r11;
        this.A0I = r14;
        this.A0K = r15;
        this.A0G = r19;
        this.A0F = r16;
        this.A0J = r17;
        this.A0L = r18;
    }

    public final List A01(AvatarCoinFlipConfig avatarCoinFlipConfig) {
        0qQ.A0B(avatarCoinFlipConfig, 0);
        AvatarCoinFlipSticker avatarCoinFlipSticker = avatarCoinFlipConfig.A06;
        C321006tQ A002 = A00(this, avatarCoinFlipSticker.A03, ((float) avatarCoinFlipSticker.A02) / ((float) avatarCoinFlipSticker.A01));
        AvatarCoinFlipSticker avatarCoinFlipSticker2 = avatarCoinFlipConfig.A05;
        return 0sr.A1P(new C321006tQ[]{A002, A00(this, avatarCoinFlipSticker2.A03, ((float) avatarCoinFlipSticker2.A02) / ((float) avatarCoinFlipSticker2.A01))});
    }

    public final /* synthetic */ void onCreate(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onDestroy(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onPause(AnonymousClass07Z r1) {
    }

    public final void onResume(AnonymousClass07Z r7) {
        0qQ.A0B(r7, 0);
        if (this.A03) {
            this.A03 = false;
            Activity activity = (Activity) this.A0C.get();
            if (activity != null) {
                String moduleName = this.A08.getModuleName();
                0qQ.A0B(moduleName, 0);
                C61437K7m k7m = new C61437K7m();
                k7m.setArguments(Q21.A00(new 0eP("args_previous_module_name", moduleName), new 0eP(AnonymousClass000.A00(43), "ig_edit_profile")));
                C331127Pr r0 = new C331127Pr(this.A09);
                r0.A0U = k7m;
                C331157Pu A002 = r0.A00();
                k7m.A0E = A002;
                k7m.A01 = activity;
                A002.A02(activity, k7m);
            }
        }
    }

    public final /* synthetic */ void onStart(AnonymousClass07Z r1) {
    }

    public final /* synthetic */ void onStop(AnonymousClass07Z r1) {
    }

    public static final C321006tQ A00(C318956po r18, String str, float f) {
        int A0H2;
        int i;
        C318956po r5 = r18;
        UserSession userSession = r5.A09;
        boolean A012 = DcE.A01(userSession);
        Context context = r5.A04;
        if (A012) {
            A0H2 = R.color.fds_transparent;
        } else {
            A0H2 = 2Yu.A0H(context, R.attr.igds_color_progress_bar_on_media);
        }
        int color = context.getColor(A0H2);
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.action_button_min_width);
        if (DcE.A01(userSession)) {
            i = (int) (((double) dimensionPixelSize) * 1.1d);
        } else {
            i = dimensionPixelSize;
        }
        Drawable A013 = C320996tP.A01(context, userSession, new C50466FcE(r5), str, (String) null, (String) null, (String) null, i, dimensionPixelSize, false, true, false, true, false);
        0qQ.A0C(A013, "null cannot be cast to non-null type com.instagram.giphy.AnimatedAvatarDrawable");
        C321006tQ r1 = (C321006tQ) A013;
        r1.A0a.A01(color, color);
        r1.A01 = f;
        return r1;
    }

    public final void A02() {
        int A0H2;
        ProfileCoinFlipView profileCoinFlipView = this.A06;
        if (profileCoinFlipView != null) {
            profileCoinFlipView.A0F(C320946tJ.AVATAR);
            UserSession userSession = this.A09;
            boolean A042 = DcE.A04(userSession);
            Context context = profileCoinFlipView.getContext();
            if (A042) {
                A0H2 = R.color.grey_1;
            } else {
                A0H2 = 2Yu.A0H(context, R.attr.igds_color_elevated_highlight_background);
            }
            profileCoinFlipView.setCircleBackgroundColor(context.getColor(A0H2));
            ((ImageView) profileCoinFlipView.findViewById(R.id.avatar)).setScaleType(ImageView.ScaleType.CENTER);
            boolean A062 = 182.A06(0Tu.A05, userSession, 36322465407838403L);
            int i = R.drawable.instagram_facebook_avatars_pano_outline_24;
            if (A062) {
                i = R.drawable.instagram_avatars_pano_outline_24;
            }
            profileCoinFlipView.setAvatarImageDrawable(context.getDrawable(i));
            profileCoinFlipView.setContentDescription(context.getString(2131956849));
            AnonymousClass3NG r1 = new AnonymousClass3NG(profileCoinFlipView);
            r1.A0C = true;
            r1.A07 = true;
            r1.A04 = this.A0H;
            r1.A00();
        }
    }

    public final void A03() {
        View view;
        UserSession userSession = this.A09;
        if (C324536zU.A00(userSession)) {
            FFO.A02(this.A04, userSession, "edit_photo_and_avatar");
            return;
        }
        Activity activity = (Activity) this.A0C.get();
        if (activity == null) {
            return;
        }
        if (A06()) {
            C252063oV r0 = this.A0A;
            if (r0 != null) {
                view = r0.getView();
            } else {
                view = null;
            }
            A05(view, false);
            A04(activity);
            return;
        }
        new C331127Pr(userSession).A00().A02(activity, C48367EdO.A00(UpdateProfilePicturePagerAdapter$UpdateProfileTabType.UPDATE_AVATAR_TAB, userSession, "ig_edit_profile", this.A01, this.A02, true));
    }

    public final void A04(Activity activity) {
        AvatarCoinFlipConfig avatarCoinFlipConfig = this.A00;
        if (avatarCoinFlipConfig != null) {
            new C331127Pr(this.A09).A00().A02(activity, C48373EdU.A00(avatarCoinFlipConfig, this.A08.getModuleName()));
        }
        C62320sa r0 = this.A0K;
        if (r0 != null) {
            r0.invoke();
        }
    }

    public final void A05(View view, boolean z) {
        if (!DcE.A05(this.A09)) {
            AnimatorSet animatorSet = new AnimatorSet();
            Animator[] animatorArr = new Animator[1];
            float[] fArr = {1.0f, 0.0f};
            if (z) {
                // fill-array-data instruction
                fArr[0] = 0;
                fArr[1] = 1065353216;
                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", fArr), PropertyValuesHolder.ofFloat("scaleY", new float[]{0.0f, 1.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{0.0f, 1.0f})});
                0qQ.A07(ofPropertyValuesHolder);
                animatorArr[0] = ofPropertyValuesHolder;
                animatorSet.playTogether(animatorArr);
            } else {
                ObjectAnimator ofPropertyValuesHolder2 = ObjectAnimator.ofPropertyValuesHolder(view, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("scaleX", fArr), PropertyValuesHolder.ofFloat("scaleY", new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f})});
                0qQ.A07(ofPropertyValuesHolder2);
                animatorArr[0] = ofPropertyValuesHolder2;
                animatorSet.playTogether(animatorArr);
                animatorSet.addListener(new I7X(animatorSet, view));
            }
            animatorSet.setInterpolator(new DecelerateInterpolator());
            animatorSet.setDuration(200);
            animatorSet.start();
        }
    }

    public final boolean A06() {
        AvatarCoinFlipConfig avatarCoinFlipConfig;
        AvatarCoinFlipSticker avatarCoinFlipSticker;
        String str;
        AvatarCoinFlipSticker avatarCoinFlipSticker2;
        String str2;
        C62320sa r0;
        C62320sa r02;
        if (!0qQ.A0K(25x.A00(this.A09).A01.A00, C299715vi.A00) || !((Boolean) this.A0J.invoke()).booleanValue() || (avatarCoinFlipConfig = this.A00) == null || (avatarCoinFlipSticker = avatarCoinFlipConfig.A06) == null || (str = avatarCoinFlipSticker.A03) == null || str.length() == 0 || (avatarCoinFlipSticker2 = avatarCoinFlipConfig.A05) == null || (str2 = avatarCoinFlipSticker2.A03) == null || str2.length() == 0 || this.A01 || (r0 = this.A0I) == null || ((Boolean) r0.invoke()).booleanValue() || (r02 = this.A0L) == null || ((Boolean) r02.invoke()).booleanValue()) {
            return false;
        }
        return true;
    }
}
