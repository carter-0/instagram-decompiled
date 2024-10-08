package com.instagram.profile.ui.fadeinfollowbutton;

import X.002;
import X.0nA;
import X.0qQ;
import X.0xF;
import X.1P0;
import X.1QE;
import X.1Xj;
import X.AnonymousClass0fD;
import X.AnonymousClass3GL;
import X.AnonymousClass3W1;
import X.C243853aD;
import X.C318556p9;
import X.C323356xM;
import X.FH6;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewStub;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import org.json.JSONObject;

public class FadeInFollowButton extends ViewSwitcher {
    public int A00;
    public ViewStub A01;
    public TextView A02;
    public UserSession A03;
    public 1Xj A04;
    public UserDetailEntryInfo A05;
    public C323356xM A06;
    public C243853aD A07;
    public User A08;
    public String A09;
    public String A0A;
    public boolean A0B;
    public int A0C;
    public final AlphaAnimation A0D;
    public final AlphaAnimation A0E;
    public final C243853aD A0F = new C318556p9(this);

    public void setContentDescription(CharSequence charSequence) {
        getChildAt(0).setContentDescription(charSequence);
    }

    private FollowStatus getOptimisticFollowStatus() {
        User user = this.A08;
        user.getClass();
        int intValue = user.A0N().intValue();
        if (intValue == 0 || intValue == 2) {
            return FollowStatus.A07;
        }
        return FollowStatus.A05;
    }

    public final void A04(boolean z, UserSession userSession) {
        if (!this.A0B) {
            this.A02.setText(this.A00);
            A01();
            if (AnonymousClass3GL.A01(userSession)) {
                setSelected(true);
            }
            AlphaAnimation alphaAnimation = this.A0D;
            setInAnimation(alphaAnimation);
            AlphaAnimation alphaAnimation2 = this.A0E;
            setOutAnimation(alphaAnimation2);
            setId(R.id.follow_button);
            if (1QE.A0E().A00) {
                Context context = getContext();
                setPadding(0, 0, (int) 0nA.A04(context, 12), (int) 0nA.A04(context, 8));
            }
            if (z) {
                setInAnimation((Animation) null);
                setOutAnimation((Animation) null);
            }
            setDisplayedChild(1);
            if (z) {
                setInAnimation(alphaAnimation);
                setOutAnimation(alphaAnimation2);
            }
        }
    }

    @Deprecated
    public void setDisplayedChild(int i) {
        if (!this.A0B) {
            super.setDisplayedChild(i);
        }
    }

    public void setFollowText(int i) {
        this.A00 = i;
        if (getDisplayedChild() == 1) {
            A03(this);
        }
    }

    public void setFollowingText(int i) {
        this.A0C = i;
        if (getDisplayedChild() == 1) {
            A03(this);
        }
    }

    public FadeInFollowButton(Context context) {
        super(context);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A0D = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A0E = alphaAnimation2;
        this.A00 = 2131962612;
        this.A0C = 2131962616;
        alphaAnimation.setStartOffset(200);
        alphaAnimation.setDuration(200);
        alphaAnimation2.setDuration(200);
        A00();
    }

    private void A00() {
        int A032 = AnonymousClass0fD.A03(737597827);
        View.inflate(getContext(), R.layout.navbar_overflow_view_switcher_with_follow_button, this);
        this.A02 = (TextView) requireViewById(R.id.action_bar_overflow_text);
        this.A01 = (ViewStub) requireViewById(R.id.action_bar_view_stub);
        AnonymousClass0fD.A0A(792004905, A032);
    }

    private void A01() {
        if (1QE.A0E().A00) {
            Context context = getContext();
            this.A02.setTextSize(14.0f);
            int A042 = (int) 0nA.A04(context, 16);
            int A043 = (int) 0nA.A04(context, 8);
            this.A02.setPadding(A042, A043, A042, A043);
            TextView textView = this.A02;
            1QE.A0H(textView, textView);
            this.A02.invalidate();
        }
    }

    public static void A02(FadeInFollowButton fadeInFollowButton) {
        0xF r3;
        Context context = fadeInFollowButton.getContext();
        UserSession userSession = fadeInFollowButton.A03;
        userSession.getClass();
        User user = fadeInFollowButton.A08;
        user.getClass();
        C243853aD r9 = fadeInFollowButton.A0F;
        String str = fadeInFollowButton.A0A;
        String str2 = fadeInFollowButton.A09;
        UserDetailEntryInfo userDetailEntryInfo = fadeInFollowButton.A05;
        1Xj r6 = fadeInFollowButton.A04;
        if (r6 != null) {
            r3 = new 0xF();
            0xF.A00(r3, r6.getId(), "starting_clips_media_id");
            0xF.A00(r3, fadeInFollowButton.A04.A0C.getLoggingInfoToken(), "starting_clips_ranking_info_token");
        } else {
            r3 = null;
        }
        0qQ.A0B(context, 0);
        FH6.A08(context, r3, (1P0) null, userSession, r6, (AnonymousClass3W1) null, userDetailEntryInfo, r9, user, "user_profile_top_bar", str, str2, (String) null, (JSONObject) null);
    }

    public static void A03(FadeInFollowButton fadeInFollowButton) {
        int i;
        FollowStatus optimisticFollowStatus = fadeInFollowButton.getOptimisticFollowStatus();
        int ordinal = fadeInFollowButton.getOptimisticFollowStatus().ordinal();
        if (ordinal == 4) {
            i = fadeInFollowButton.A0C;
        } else if (ordinal == 5) {
            i = 2131962625;
        } else {
            throw new IllegalArgumentException(002.A0R("FadeInFollowButton doesn't support expected follow state ", optimisticFollowStatus.name()));
        }
        fadeInFollowButton.A02.setText(i);
        fadeInFollowButton.A01();
    }

    public FadeInFollowButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
        this.A0D = alphaAnimation;
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        this.A0E = alphaAnimation2;
        this.A00 = 2131962612;
        this.A0C = 2131962616;
        alphaAnimation.setStartOffset(200);
        alphaAnimation.setDuration(200);
        alphaAnimation2.setDuration(200);
        A00();
    }
}
