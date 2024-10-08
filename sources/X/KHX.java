package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.igds.components.switchbutton.IgdsSwitch;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;

public final class KHX extends IgLinearLayout {
    public View.OnClickListener A00;
    public View A01;
    public View A02;
    public TextView A03;
    public TextView A04;
    public C358618bC A05;
    public IgdsSwitch A06;
    public CharSequence A07;
    public CharSequence A08;
    public 0sL A09;
    public boolean A0A = true;
    public boolean A0B;
    public boolean A0C;
    public boolean A0D;
    public boolean A0E;
    public final View A0F;
    public final GradientSpinnerAvatarView A0G;

    public KHX(Context context) {
        super(context);
        View A0C2 = DbT.A0C(LayoutInflater.from(context), this, R.layout.layout_share_content_row_action_with_profile_Image_and_switch);
        this.A0F = A0C2;
        this.A0G = (GradientSpinnerAvatarView) A0C2.requireViewById(R.id.profile_picture);
    }

    private final void A00() {
        TextView textView = this.A04;
        float f = 0.3f;
        if (textView != null) {
            float f2 = 1.0f;
            if (this.A0E) {
                f2 = 0.3f;
            }
            textView.setAlpha(f2);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            if (!this.A0E) {
                f = 1.0f;
            }
            textView2.setAlpha(f);
        }
    }

    private final void setShouldShowFeaturedBadge(boolean z) {
        View view = this.A01;
        if (view != null) {
            view.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    private final void setShouldShowNewBadge(boolean z) {
        this.A0D = z;
        View view = this.A02;
        if (view != null) {
            view.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    public final boolean getEnableSwitchView() {
        return this.A0A;
    }

    public final boolean getHideSwitchView() {
        return this.A0B;
    }

    public final 0sL getOnCheckedChangeListener() {
        return this.A09;
    }

    public final View.OnClickListener getOnCheckedClickedListener() {
        return this.A00;
    }

    public final C358618bC getOnToggleListener() {
        return this.A05;
    }

    public final View getPrimaryTextView() {
        return this.A04;
    }

    public final GradientSpinnerAvatarView getProfileImageView() {
        return this.A0G;
    }

    public final boolean getShowDisabledState() {
        return this.A0E;
    }

    public final CharSequence getSubtitle() {
        return this.A07;
    }

    public final View getSwitchView() {
        return this.A06;
    }

    public final CharSequence getTitle() {
        return this.A08;
    }

    public final void setChecked(boolean z) {
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch == null) {
            this.A0C = z;
        } else {
            igdsSwitch.setChecked(z);
        }
    }

    public final void setEnableSwitchView(boolean z) {
        this.A0A = z;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            igdsSwitch.setEnabled(z);
        }
    }

    public final void setHideSwitchView(boolean z) {
        this.A0B = z;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            igdsSwitch.setVisibility(DbW.A00(z ? 1 : 0));
        }
    }

    public final void setInlineSubtitleLinkable(boolean z) {
        TextView textView;
        if (z && (textView = this.A03) != null) {
            DbT.A1H(textView);
        }
    }

    public final void setOnCheckedChangeListener(0sL r4) {
        LZJ lzj;
        this.A09 = r4;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            if (r4 != null) {
                lzj = new LZJ((Object) r4, 15);
            } else {
                lzj = null;
            }
            igdsSwitch.setOnCheckedChangeListener(lzj);
        }
    }

    public final void setOnCheckedClickedListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            igdsSwitch.setOnClickListener(onClickListener);
        }
    }

    public final void setOnToggleListener(C358618bC r2) {
        this.A05 = r2;
        IgdsSwitch igdsSwitch = this.A06;
        if (igdsSwitch != null) {
            igdsSwitch.A07 = r2;
        }
    }

    public final void setProfileImage(Drawable drawable) {
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0G;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setBottomBadgeDrawable((Drawable) null);
            gradientSpinnerAvatarView.A0D(drawable);
            gradientSpinnerAvatarView.A05();
        }
    }

    public final void setShowDisabledState(boolean z) {
        this.A0E = z;
        A00();
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.A07 = charSequence;
        TextView textView = this.A03;
        if (textView != null) {
            textView.setText(charSequence);
        }
        TextView textView2 = this.A03;
        if (textView2 != null) {
            int i = 0;
            if (charSequence == null || 00l.A0W(charSequence)) {
                i = 8;
            }
            textView2.setVisibility(i);
        }
    }

    public final void setTitle(CharSequence charSequence) {
        this.A08 = charSequence;
        TextView textView = this.A04;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final void onAttachedToWindow() {
        LZJ lzj;
        int A062 = AnonymousClass0fD.A06(-470734323);
        super.onAttachedToWindow();
        View view = this.A0F;
        if (view.getParent() == null) {
            this.A04 = Dba.A06(view);
            this.A03 = Dba.A05(view);
            IgdsSwitch igdsSwitch = (IgdsSwitch) view.requireViewById(R.id.toggle);
            this.A06 = igdsSwitch;
            int i = 8;
            if (igdsSwitch != null) {
                igdsSwitch.setVisibility(DbW.A00(this.A0B ? 1 : 0));
            }
            IgdsSwitch igdsSwitch2 = this.A06;
            if (igdsSwitch2 != null) {
                igdsSwitch2.setEnabled(this.A0A);
            }
            this.A02 = view.requireViewById(R.id.new_badge_stub);
            this.A01 = view.requireViewById(R.id.featured_badge_stub);
            view.setFocusable(true);
            TextView textView = this.A04;
            if (textView != null) {
                textView.setText(this.A08);
            }
            TextView textView2 = this.A03;
            if (textView2 != null) {
                textView2.setText(this.A07);
            }
            CharSequence charSequence = this.A07;
            if (charSequence != null && !00l.A0W(charSequence)) {
                TextView textView3 = this.A03;
                if (textView3 != null) {
                    textView3.setVisibility(0);
                }
                TextView textView4 = this.A03;
                if (textView4 != null) {
                    textView4.setFocusable(true);
                }
            }
            IgdsSwitch igdsSwitch3 = this.A06;
            if (igdsSwitch3 != null) {
                igdsSwitch3.setChecked(this.A0C);
            }
            IgdsSwitch igdsSwitch4 = this.A06;
            if (igdsSwitch4 != null) {
                0sL r2 = this.A09;
                if (r2 != null) {
                    lzj = new LZJ((Object) r2, 15);
                } else {
                    lzj = null;
                }
                igdsSwitch4.setOnCheckedChangeListener(lzj);
            }
            IgdsSwitch igdsSwitch5 = this.A06;
            if (igdsSwitch5 != null) {
                igdsSwitch5.setOnClickListener(this.A00);
            }
            IgdsSwitch igdsSwitch6 = this.A06;
            if (igdsSwitch6 != null) {
                igdsSwitch6.A07 = this.A05;
            }
            A00();
            View view2 = this.A02;
            if (view2 != null) {
                if (this.A0D) {
                    i = 0;
                }
                view2.setVisibility(i);
            }
            2eS.A04(view, AnonymousClass05K.A06);
            addView(view);
        }
        AnonymousClass0fD.A0D(105911006, A062);
    }

    public final void setProfileImage(AnonymousClass0iw r5, String str, Drawable drawable) {
        AnonymousClass7TG.A1N(r5, str);
        0qQ.A0B(drawable, 2);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = this.A0G;
        if (gradientSpinnerAvatarView != null) {
            gradientSpinnerAvatarView.setBottomBadgeDrawable(drawable);
            gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, r5, DbS.A0V(str));
            gradientSpinnerAvatarView.A00 = 0nA.A04(AnonymousClass7TE.A0S(getRootView()), 2);
            gradientSpinnerAvatarView.A01 = 0nA.A04(AnonymousClass7TE.A0S(getRootView()), 2);
            gradientSpinnerAvatarView.A05();
        }
    }
}
