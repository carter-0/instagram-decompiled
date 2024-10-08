package com.instagram.reels.common.ui;

import X.0qQ;
import X.2eS;
import X.AJF;
import X.AJR;
import X.AJS;
import X.AJT;
import X.AJW;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0iw;
import X.AnonymousClass80R;
import X.AnonymousClass8FF;
import X.AnonymousClass8FG;
import X.AnonymousClass8ZM;
import X.C358088aL;
import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;

public class StoryTypeSelectorView extends IgFrameLayout {
    public int A00;
    public int A01;
    public AnonymousClass8ZM A02;
    public boolean A03;
    public int A04;
    public int A05;
    public AnonymousClass8FG A06;
    public final int A07;
    public final float A08;
    public final AccelerateDecelerateInterpolator A09;
    public final AnonymousClass0eM A0A;
    public final AnonymousClass0eM A0B;
    public final AnonymousClass0eM A0C;
    public final AnonymousClass0eM A0D;
    public final AnonymousClass0eM A0E;
    public final AnonymousClass0eM A0F;
    public final boolean A0G;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, false, (UserSession) null, "", "");
        0qQ.A0B(context, 1);
    }

    public final void setFirstOptionDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        getFirstOptionImageView().setImageDrawable(drawable);
    }

    public final void setOnOptionSelectedListener(AnonymousClass8FG r2) {
        0qQ.A0B(r2, 0);
        this.A06 = r2;
    }

    public final void setOptionLabels(String str, String str2) {
        0qQ.A0B(str, 0);
        0qQ.A0B(str2, 1);
        getFirstOptionTextView().setText(str);
        getSecondOptionTextView().setText(str2);
    }

    public final void setSecondOptionDrawable(Drawable drawable) {
        FrameLayout.LayoutParams layoutParams;
        0qQ.A0B(drawable, 0);
        getSecondOptionImageView().setImageDrawable(drawable);
        ViewGroup.LayoutParams layoutParams2 = getSecondOptionImageView().getLayoutParams();
        if ((layoutParams2 instanceof FrameLayout.LayoutParams) && (layoutParams = (FrameLayout.LayoutParams) layoutParams2) != null) {
            Context context = getContext();
            layoutParams.rightMargin = context.getResources().getDimensionPixelSize(R.dimen.direct_reply_avatar_button_double_overlap_offset);
            layoutParams.gravity = 8388629;
            layoutParams.width = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
            layoutParams.height = context.getResources().getDimensionPixelSize(R.dimen.account_group_management_clickable_width);
        }
    }

    public final void setSecondOptionUrl(String str, AnonymousClass0iw r4) {
        0qQ.A0B(str, 0);
        0qQ.A0B(r4, 1);
        getSecondOptionImageView().setUrl(new SimpleImageUrl(str), r4);
    }

    public final void setSelectedType(AnonymousClass8ZM r3) {
        0qQ.A0B(r3, 0);
        this.A02 = r3;
        AnonymousClass8FG r0 = this.A06;
        if (r0 != null) {
            AnonymousClass80R r1 = ((AnonymousClass8FF) r0).A00;
            if (r3 == AnonymousClass8ZM.FIRST_OPTION) {
                r1.A0W.A0M(C358088aL.A0I);
            } else if (r3 == AnonymousClass8ZM.SECOND_OPTION) {
                r1.A0W.A0K(C358088aL.A0I);
            }
        }
        A01(this);
    }

    private final ValueAnimator A00(View view, AnonymousClass8ZM r12, float f, float f2) {
        int i;
        int i2;
        ValueAnimator ofFloat;
        ValueAnimator.AnimatorUpdateListener ajr;
        if (r12 == AnonymousClass8ZM.FIRST_OPTION) {
            i = this.A05;
            i2 = this.A04;
        } else {
            i = this.A04;
            i2 = this.A05;
        }
        View view2 = view;
        float f3 = f;
        float f4 = f2;
        if (i != i2) {
            ofFloat = ValueAnimator.ofArgb(new int[]{i, i2});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(this.A09);
            ajr = new AJW(view2, f3, f4, i, i2);
        } else {
            ofFloat = ValueAnimator.ofFloat(new float[]{f, f2});
            ofFloat.setDuration(200);
            ofFloat.setInterpolator(this.A09);
            ajr = new AJR(view);
        }
        ofFloat.addUpdateListener(ajr);
        return ofFloat;
    }

    public static final void A01(StoryTypeSelectorView storyTypeSelectorView) {
        Integer num;
        IgTextView secondOptionImageView;
        View highlightPillView;
        float f;
        boolean z = storyTypeSelectorView.A0G;
        if (!z) {
            IgTextView firstOptionTextView = storyTypeSelectorView.getFirstOptionTextView();
            num = AnonymousClass05K.A01;
            2eS.A04(firstOptionTextView, num);
            secondOptionImageView = storyTypeSelectorView.getSecondOptionTextView();
        } else {
            IgImageView firstOptionImageView = storyTypeSelectorView.getFirstOptionImageView();
            num = AnonymousClass05K.A01;
            2eS.A04(firstOptionImageView, num);
            secondOptionImageView = storyTypeSelectorView.getSecondOptionImageView();
        }
        2eS.A04((View) secondOptionImageView, num);
        int ordinal = storyTypeSelectorView.A02.ordinal();
        if (ordinal == 0) {
            if (!z) {
                storyTypeSelectorView.getFirstOptionTextView().setTextColor(storyTypeSelectorView.A00);
                storyTypeSelectorView.getSecondOptionTextView().setTextColor(storyTypeSelectorView.A07);
                storyTypeSelectorView.getFirstOptionTextView().setSelected(true);
                storyTypeSelectorView.getSecondOptionTextView().setSelected(false);
                storyTypeSelectorView.getHighlightPillView().getBackground().mutate().setTint(storyTypeSelectorView.A04);
            } else {
                storyTypeSelectorView.getFirstOptionImageView().setSelected(true);
                storyTypeSelectorView.getSecondOptionImageView().setSelected(false);
            }
            highlightPillView = storyTypeSelectorView.getHighlightPillView();
            f = 0.0f;
        } else if (ordinal == 1) {
            if (!z) {
                storyTypeSelectorView.getFirstOptionTextView().setTextColor(storyTypeSelectorView.A07);
                storyTypeSelectorView.getSecondOptionTextView().setTextColor(storyTypeSelectorView.A01);
                storyTypeSelectorView.getFirstOptionTextView().setSelected(false);
                storyTypeSelectorView.getSecondOptionTextView().setSelected(true);
                storyTypeSelectorView.getHighlightPillView().getBackground().mutate().setTint(storyTypeSelectorView.A05);
            } else {
                storyTypeSelectorView.getFirstOptionImageView().setSelected(false);
                storyTypeSelectorView.getSecondOptionImageView().setSelected(true);
            }
            highlightPillView = storyTypeSelectorView.getHighlightPillView();
            f = storyTypeSelectorView.A08;
        } else {
            throw new RuntimeException();
        }
        highlightPillView.setTranslationX(f);
    }

    private final IgImageView getFirstOptionImageView() {
        Object value = this.A0A.getValue();
        0qQ.A07(value);
        return (IgImageView) value;
    }

    private final IgTextView getFirstOptionTextView() {
        Object value = this.A0B.getValue();
        0qQ.A07(value);
        return (IgTextView) value;
    }

    private final View getHighlightPillView() {
        Object value = this.A0C.getValue();
        0qQ.A07(value);
        return (View) value;
    }

    private final IgTextView getSecondOptionTextView() {
        Object value = this.A0E.getValue();
        0qQ.A07(value);
        return (IgTextView) value;
    }

    private final View getTypeSelectorBackgroundView() {
        Object value = this.A0F.getValue();
        0qQ.A07(value);
        return (View) value;
    }

    public final void A02() {
        ValueAnimator valueAnimator;
        AnimatorSet animatorSet;
        Animator[] animatorArr;
        AnonymousClass8ZM r5;
        IgTextView secondOptionImageView;
        AnonymousClass8ZM r1;
        int i;
        ValueAnimator ofArgb;
        long j;
        IgTextView secondOptionTextView;
        int i2;
        IgTextView secondOptionImageView2;
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            r5 = AnonymousClass8ZM.SECOND_OPTION;
            setSelectedType(r5);
            boolean z = this.A0G;
            if (!z) {
                IgTextView firstOptionTextView = getFirstOptionTextView();
                if (firstOptionTextView != null) {
                    firstOptionTextView.setSelected(false);
                }
                secondOptionImageView = getSecondOptionTextView();
            } else {
                IgImageView firstOptionImageView = getFirstOptionImageView();
                if (firstOptionImageView != null) {
                    firstOptionImageView.setSelected(false);
                }
                secondOptionImageView = getSecondOptionImageView();
            }
            if (secondOptionImageView != null) {
                secondOptionImageView.setSelected(true);
            }
            valueAnimator = A00(getHighlightPillView(), r5, 0.0f, this.A08);
            if (!z) {
                IgTextView firstOptionTextView2 = getFirstOptionTextView();
                r1 = AnonymousClass8ZM.FIRST_OPTION;
                int i3 = this.A00;
                i = this.A07;
                ofArgb = ValueAnimator.ofArgb(new int[]{i3, i});
                j = 200;
                ofArgb.setDuration(200);
                ofArgb.addUpdateListener(new AJT(firstOptionTextView2));
                secondOptionTextView = getSecondOptionTextView();
            }
            animatorSet = new AnimatorSet();
            animatorSet.addListener(new AJF(this));
            animatorArr = new Animator[]{valueAnimator};
            animatorSet.playTogether(animatorArr);
            animatorSet.start();
        } else if (ordinal == 1) {
            r5 = AnonymousClass8ZM.FIRST_OPTION;
            r1 = r5;
            setSelectedType(r5);
            boolean z2 = this.A0G;
            if (!z2) {
                IgTextView firstOptionTextView3 = getFirstOptionTextView();
                if (firstOptionTextView3 != null) {
                    firstOptionTextView3.setSelected(true);
                }
                secondOptionImageView2 = getSecondOptionTextView();
            } else {
                IgImageView firstOptionImageView2 = getFirstOptionImageView();
                if (firstOptionImageView2 != null) {
                    firstOptionImageView2.setSelected(true);
                }
                secondOptionImageView2 = getSecondOptionImageView();
            }
            if (secondOptionImageView2 != null) {
                secondOptionImageView2.setSelected(false);
            }
            valueAnimator = A00(getHighlightPillView(), r5, this.A08, 0.0f);
            if (!z2) {
                IgTextView secondOptionTextView2 = getSecondOptionTextView();
                int i4 = this.A01;
                i = this.A07;
                ofArgb = ValueAnimator.ofArgb(new int[]{i4, i});
                j = 200;
                ofArgb.setDuration(200);
                ofArgb.addUpdateListener(new AJT(secondOptionTextView2));
                secondOptionTextView = getFirstOptionTextView();
            }
            animatorSet = new AnimatorSet();
            animatorSet.addListener(new AJF(this));
            animatorArr = new Animator[]{valueAnimator};
            animatorSet.playTogether(animatorArr);
            animatorSet.start();
        } else {
            throw new RuntimeException();
        }
        if (r5 == r1) {
            i2 = this.A00;
        } else {
            i2 = this.A01;
        }
        ValueAnimator ofArgb2 = ValueAnimator.ofArgb(new int[]{i, i2});
        ofArgb2.setDuration(j);
        ofArgb2.addUpdateListener(new AJS(secondOptionTextView));
        animatorSet = new AnimatorSet();
        animatorSet.addListener(new AJF(this));
        animatorArr = new Animator[]{ofArgb2, ofArgb, valueAnimator};
        animatorSet.playTogether(animatorArr);
        animatorSet.start();
    }

    public final IgImageView getSecondOptionImageView() {
        Object value = this.A0D.getValue();
        0qQ.A07(value);
        return (IgImageView) value;
    }

    public final AnonymousClass8ZM getSelectedType() {
        return this.A02;
    }

    public final boolean performClick() {
        if (this.A03) {
            return false;
        }
        return super.performClick();
    }

    public final void setBackgroundDrawable(int i) {
        getTypeSelectorBackgroundView().setBackground(getContext().getDrawable(i));
    }

    public final void setHighlightDrawable(int i) {
        getHighlightPillView().setBackground(getContext().getDrawable(i));
    }

    public final void setAnimating(boolean z) {
        this.A03 = z;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i, boolean z) {
        this(context, attributeSet, i, z, (UserSession) null, "", "");
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x00cf, code lost:
        if (r1 == false) goto L_0x00d1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0073, code lost:
        if (r1 == false) goto L_0x0075;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public StoryTypeSelectorView(android.content.Context r5, android.util.AttributeSet r6, int r7, boolean r8, com.instagram.common.session.UserSession r9, java.lang.String r10, java.lang.String r11) {
        /*
            r4 = this;
            r0 = 1
            X.0qQ.A0B(r5, r0)
            r0 = 6
            X.0qQ.A0B(r10, r0)
            r0 = 7
            X.0qQ.A0B(r11, r0)
            r4.<init>(r5, r6, r7)
            r4.A0G = r8
            r1 = 3
            X.9LS r0 = new X.9LS
            r0.<init>(r4, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r4.A0F = r0
            r1 = 2
            X.9LS r0 = new X.9LS
            r0.<init>(r4, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r4.A0C = r0
            r1 = 31
            X.9Mm r0 = new X.9Mm
            r0.<init>(r10, r4, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r4.A0B = r0
            r1 = 33
            X.9Mm r0 = new X.9Mm
            r0.<init>(r11, r4, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r4.A0E = r0
            r1 = 30
            X.9Mm r0 = new X.9Mm
            r0.<init>(r10, r4, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r4.A0A = r0
            r1 = 32
            X.9Mm r0 = new X.9Mm
            r0.<init>(r11, r4, r1)
            X.0t0 r0 = X.AnonymousClass0eN.A01(r0)
            r4.A0D = r0
            if (r8 == 0) goto L_0x00df
            android.content.res.Resources r3 = r5.getResources()
            if (r9 == 0) goto L_0x0075
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322465407838403(0x810b17000028c3, double:3.0338116105210975E-306)
            boolean r1 = X.182.A06(r2, r9, r0)
            r0 = 2131165383(0x7f0700c7, float:1.7944982E38)
            if (r1 != 0) goto L_0x0078
        L_0x0075:
            r0 = 2131165738(0x7f07022a, float:1.7945702E38)
        L_0x0078:
            int r0 = r3.getDimensionPixelSize(r0)
            float r0 = (float) r0
        L_0x007d:
            r4.A08 = r0
            android.view.animation.AccelerateDecelerateInterpolator r0 = new android.view.animation.AccelerateDecelerateInterpolator
            r0.<init>()
            r4.A09 = r0
            r1 = 2130970279(0x7f0406a7, float:1.7549264E38)
            int r0 = X.2Yu.A0H(r5, r1)
            int r0 = r5.getColor(r0)
            r4.A00 = r0
            int r0 = X.2Yu.A0H(r5, r1)
            int r0 = r5.getColor(r0)
            r4.A01 = r0
            r1 = 2131099778(0x7f060082, float:1.7811919E38)
            int r0 = r5.getColor(r1)
            r4.A04 = r0
            int r0 = r5.getColor(r1)
            r4.A05 = r0
            r0 = 2130970311(0x7f0406c7, float:1.7549329E38)
            int r0 = X.2Yu.A0H(r5, r0)
            int r0 = r5.getColor(r0)
            r4.A07 = r0
            X.8ZM r0 = X.AnonymousClass8ZM.FIRST_OPTION
            r4.A02 = r0
            if (r8 == 0) goto L_0x00db
            if (r9 == 0) goto L_0x00d1
            X.0Tu r2 = X.0Tu.A05
            r0 = 36322465407838403(0x810b17000028c3, double:3.0338116105210975E-306)
            boolean r1 = X.182.A06(r2, r9, r0)
            r0 = 2131627532(0x7f0e0e0c, float:1.8882331E38)
            if (r1 != 0) goto L_0x00d4
        L_0x00d1:
            r0 = 2131627531(0x7f0e0e0b, float:1.888233E38)
        L_0x00d4:
            android.view.View.inflate(r5, r0, r4)
            A01(r4)
            return
        L_0x00db:
            r0 = 2131627218(0x7f0e0cd2, float:1.8881694E38)
            goto L_0x00d4
        L_0x00df:
            r0 = 91
            float r0 = X.0nA.A04(r5, r0)
            goto L_0x007d
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.common.ui.StoryTypeSelectorView.<init>(android.content.Context, android.util.AttributeSet, int, boolean, com.instagram.common.session.UserSession, java.lang.String, java.lang.String):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i, boolean z, UserSession userSession, String str) {
        this(context, attributeSet, i, z, userSession, str, "");
        0qQ.A0B(context, 1);
        0qQ.A0B(str, 6);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i, boolean z, UserSession userSession) {
        this(context, attributeSet, i, z, userSession, "", "");
        0qQ.A0B(context, 1);
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ StoryTypeSelectorView(android.content.Context r9, android.util.AttributeSet r10, int r11, boolean r12, com.instagram.common.session.UserSession r13, java.lang.String r14, java.lang.String r15, int r16, kotlin.jvm.internal.DefaultConstructorMarker r17) {
        /*
            r8 = this;
            r6 = r14
            r3 = r11
            r2 = r10
            r0 = r16 & 2
            r5 = 0
            if (r0 == 0) goto L_0x0009
            r2 = r5
        L_0x0009:
            r0 = r16 & 4
            r4 = 0
            if (r0 == 0) goto L_0x000f
            r3 = 0
        L_0x000f:
            r0 = r16 & 8
            if (r0 != 0) goto L_0x0014
            r4 = r12
        L_0x0014:
            r0 = r16 & 16
            if (r0 != 0) goto L_0x0019
            r5 = r13
        L_0x0019:
            r0 = r16 & 32
            java.lang.String r7 = ""
            if (r0 == 0) goto L_0x0020
            r6 = r7
        L_0x0020:
            r0 = r16 & 64
            if (r0 != 0) goto L_0x0025
            r7 = r15
        L_0x0025:
            r0 = r8
            r1 = r9
            r0.<init>(r1, r2, r3, r4, r5, r6, r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.reels.common.ui.StoryTypeSelectorView.<init>(android.content.Context, android.util.AttributeSet, int, boolean, com.instagram.common.session.UserSession, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, false, (UserSession) null, "", "");
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public StoryTypeSelectorView(Context context) {
        this(context, (AttributeSet) null, 0, false, (UserSession) null, "", "");
        0qQ.A0B(context, 1);
    }
}
