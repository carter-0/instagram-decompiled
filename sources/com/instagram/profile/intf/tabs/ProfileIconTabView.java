package com.instagram.profile.intf.tabs;

import X.0ok;
import X.0qQ;
import X.2b1;
import X.2eS;
import X.AnonymousClass00P;
import X.AnonymousClass700;
import X.C252063oV;
import X.C324826zy;
import X.C49018Enu;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;

public final class ProfileIconTabView extends FrameLayout implements C324826zy {
    public int A00;
    public Drawable A01;
    public Drawable A02;
    public ColorFilterAlphaImageView A03;
    public C252063oV A04;
    public C252063oV A05;
    public C252063oV A06;
    public boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileIconTabView(Context context) {
        super(context);
        0qQ.A0B(context, 1);
        A00(context);
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        0qQ.A0B(accessibilityNodeInfo, 0);
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClickable(false);
    }

    public void setTitle(String str) {
    }

    public void setTitleDrawable(Drawable drawable) {
    }

    public View getView() {
        return this;
    }

    public void setActiveColor(int i) {
        String str;
        this.A00 = i;
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
        if (colorFilterAlphaImageView == null) {
            str = "iconView";
        } else {
            colorFilterAlphaImageView.setActiveColor(i);
            C252063oV r0 = this.A05;
            if (r0 == null) {
                str = "endIconView";
            } else {
                ColorFilterAlphaImageView colorFilterAlphaImageView2 = (ColorFilterAlphaImageView) r0.E2D();
                if (colorFilterAlphaImageView2 != null) {
                    colorFilterAlphaImageView2.setActiveColor(i);
                    return;
                }
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void setActiveIcon(Drawable drawable) {
        if (drawable != null) {
            this.A01 = drawable;
            ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
            if (colorFilterAlphaImageView == null) {
                0qQ.A0F("iconView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                colorFilterAlphaImageView.setImageDrawable(0ok.A02(this.A02, drawable));
            }
        }
    }

    public void setBadgeCount(int i) {
        String str;
        String str2;
        int i2 = 0;
        if (this.A07) {
            str = "badgeCountHolder";
            C252063oV r0 = this.A04;
            if (i > 0) {
                if (r0 != null) {
                    r0.setVisibility(0);
                    C252063oV r02 = this.A04;
                    if (r02 != null) {
                        TextView textView = (TextView) r02.getView();
                        if (i < 100) {
                            str2 = String.valueOf(i);
                        } else {
                            str2 = "•••";
                        }
                        C49018Enu.A00(textView, str2);
                        return;
                    }
                }
            } else if (r0 != null) {
                r0.setVisibility(8);
                return;
            }
        } else {
            C252063oV r03 = this.A06;
            if (r03 == null) {
                str = "ledNotificationHolder";
            } else {
                if (i <= 0) {
                    i2 = 8;
                }
                r03.setVisibility(i2);
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void setContentDescription(CharSequence charSequence) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
        if (colorFilterAlphaImageView == null) {
            0qQ.A0F("iconView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            colorFilterAlphaImageView.setContentDescription(charSequence);
        }
    }

    public void setEndIcon(Drawable drawable) {
        String str = "endIconView";
        if (drawable == null) {
            C252063oV r1 = this.A05;
            if (r1 != null) {
                r1.setVisibility(8);
                return;
            }
        } else {
            C252063oV r0 = this.A05;
            if (r0 != null) {
                r0.setVisibility(0);
                C252063oV r02 = this.A05;
                if (r02 != null) {
                    ((ImageView) r02.getView()).setImageDrawable(drawable);
                    int dimensionPixelSize = getContext().getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                    C252063oV r03 = this.A05;
                    if (r03 != null) {
                        View view = r03.getView();
                        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
                        if (colorFilterAlphaImageView == null) {
                            str = "iconView";
                        } else {
                            view.setPaddingRelative(colorFilterAlphaImageView.getDrawable().getIntrinsicWidth() + (dimensionPixelSize * 2) + drawable.getIntrinsicWidth(), 0, 0, 0);
                            return;
                        }
                    }
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public void setIcon(Drawable drawable) {
        if (drawable != null) {
            this.A02 = drawable;
            ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
            if (colorFilterAlphaImageView == null) {
                0qQ.A0F("iconView");
                throw AnonymousClass00P.createAndThrow();
            } else {
                colorFilterAlphaImageView.setImageDrawable(0ok.A02(drawable, this.A01));
            }
        }
    }

    public void setOnClickListener(View.OnClickListener onClickListener) {
        ColorFilterAlphaImageView colorFilterAlphaImageView = this.A03;
        if (colorFilterAlphaImageView == null) {
            0qQ.A0F("iconView");
            throw AnonymousClass00P.createAndThrow();
        } else {
            colorFilterAlphaImageView.setOnClickListener(onClickListener);
        }
    }

    private final void A00(Context context) {
        String str;
        View.inflate(context, R.layout.profile_icon_tab_view, this);
        ColorFilterAlphaImageView colorFilterAlphaImageView = (ColorFilterAlphaImageView) requireViewById(R.id.profile_tab_icon_view);
        this.A03 = colorFilterAlphaImageView;
        if (colorFilterAlphaImageView == null) {
            str = "iconView";
        } else {
            2eS.A03(colorFilterAlphaImageView, context.getString(2131974924));
            this.A04 = 2b1.A01(findViewById(R.id.profile_tab_badge_count_view_stub), false, false);
            this.A06 = 2b1.A01(findViewById(R.id.profile_tab_led_notification_stub), false, false);
            C252063oV A012 = 2b1.A01(findViewById(R.id.profile_tab_icon_end_layout_view_stub), false, false);
            this.A05 = A012;
            if (A012 == null) {
                str = "endIconView";
            } else {
                A012.EeU(new AnonymousClass700(this));
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void EHN(boolean z) {
        this.A07 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileIconTabView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        A00(context);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileIconTabView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        A00(context);
    }
}
