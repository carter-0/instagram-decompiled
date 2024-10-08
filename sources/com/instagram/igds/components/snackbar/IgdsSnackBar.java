package com.instagram.igds.components.snackbar;

import X.00l;
import X.0qQ;
import X.0xG;
import X.2eS;
import X.AnonymousClass000;
import X.AnonymousClass05K;
import X.AnonymousClass0iw;
import X.AnonymousClass9IV;
import X.C71492dQ;
import X.C71662eb;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgFrameLayout;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.gradientspinneravatarview.GradientSpinnerAvatarView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgdsSnackBar extends IgFrameLayout {
    public static final AnonymousClass0iw A0D = new 0xG("igds_snack_bar");
    public final View A00;
    public final FrameLayout A01;
    public final ImageView A02;
    public final ImageView A03;
    public final TextView A04;
    public final TextView A05;
    public final C71662eb A06;
    public final C71662eb A07;
    public final C71662eb A08;
    public final ViewGroup A09;
    public final FrameLayout A0A;
    public final TextView A0B;
    public final C71662eb A0C;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsSnackBar(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public final void setAvatarImageDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A06.A01();
        0qQ.A0A(gradientSpinnerAvatarView);
        this.A01.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0D(drawable);
    }

    public final void setAvatarImageUri(ImageUrl imageUrl) {
        0qQ.A0B(imageUrl, 0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A06.A01();
        0qQ.A0A(gradientSpinnerAvatarView);
        this.A01.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0F((AnonymousClass9IV) null, A0D, imageUrl);
    }

    public final void setButtonTextAndOnClickListener(String str, View.OnClickListener onClickListener) {
        if (str == null || 00l.A0W(str)) {
            this.A0B.setVisibility(8);
            return;
        }
        TextView textView = this.A0B;
        textView.setText(str);
        textView.setOnClickListener(onClickListener);
        textView.setVisibility(0);
        2eS.A04(textView, AnonymousClass05K.A01);
    }

    public final void setCircularImageDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        ImageView imageView = (ImageView) this.A07.A01();
        0qQ.A0A(imageView);
        A00(imageView);
        imageView.setImageDrawable(drawable);
    }

    public final void setCircularImageUri(ImageUrl imageUrl) {
        0qQ.A0B(imageUrl, 0);
        IgImageView A012 = this.A07.A01();
        0qQ.A0A(A012);
        A00(A012);
        A012.setUrl(imageUrl, A0D);
    }

    public final void setIconDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        ImageView imageView = this.A03;
        A00(imageView);
        imageView.setImageDrawable(drawable);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0008, code lost:
        if (r4.length() == 0) goto L_0x000a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setMessageDescriptionText(java.lang.String r4) {
        /*
            r3 = this;
            r2 = 0
            if (r4 == 0) goto L_0x000a
            int r0 = r4.length()
            r1 = 0
            if (r0 != 0) goto L_0x000b
        L_0x000a:
            r1 = 1
        L_0x000b:
            android.widget.TextView r0 = r3.A04
            r0.setText(r4)
            if (r1 == 0) goto L_0x0014
            r2 = 8
        L_0x0014:
            r0.setVisibility(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.snackbar.IgdsSnackBar.setMessageDescriptionText(java.lang.String):void");
    }

    public final void setMessageText(CharSequence charSequence) {
        int i = 0;
        0qQ.A0B(charSequence, 0);
        TextView textView = this.A05;
        if (charSequence.length() == 0) {
            i = 8;
        }
        textView.setVisibility(i);
        textView.setText(charSequence);
    }

    public final void setSquareImageDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        ImageView imageView = (ImageView) this.A08.A01();
        0qQ.A0A(imageView);
        A00(imageView);
        imageView.setImageDrawable(drawable);
    }

    public final void setSquareImageUri(ImageUrl imageUrl) {
        0qQ.A0B(imageUrl, 0);
        IgImageView A012 = this.A08.A01();
        0qQ.A0A(A012);
        A00(A012);
        A012.setUrl(imageUrl, A0D);
    }

    private final void A00(ImageView imageView) {
        this.A01.setVisibility(0);
        imageView.setVisibility(0);
    }

    public final View getCloseImageView() {
        return this.A00;
    }

    public final void setAvatarRingColor(int i) {
        ((GradientSpinnerAvatarView) this.A06.A01()).setBackgroundRingColor(i);
    }

    public final void setButtonImageAndOnClickListener(ImageUrl imageUrl, View.OnClickListener onClickListener) {
        if (imageUrl == null) {
            this.A0A.setVisibility(8);
            this.A0C.A01().setVisibility(8);
            return;
        }
        IgImageView A012 = this.A0C.A01();
        A012.setVisibility(0);
        FrameLayout frameLayout = this.A0A;
        frameLayout.setVisibility(0);
        A012.setUrl(imageUrl, A0D);
        A012.setOnClickListener(onClickListener);
        2eS.A01(frameLayout);
    }

    public final void setButtonTextColor(int i) {
        this.A0B.setTextColor(i);
    }

    public final void setCircularImageDrawableRes(int i) {
        ImageView imageView = (ImageView) this.A07.A01();
        0qQ.A0A(imageView);
        A00(imageView);
        imageView.setImageResource(i);
    }

    public final void setMessageMovementMethod(MovementMethod movementMethod) {
        this.A05.setMovementMethod(movementMethod);
    }

    public final void setMessageOnClick(View.OnClickListener onClickListener) {
        this.A05.setOnClickListener(onClickListener);
    }

    public final void setPresenceBadgeDrawable(Drawable drawable) {
        View A012 = this.A06.A01();
        0qQ.A07(A012);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) A012;
        gradientSpinnerAvatarView.setPresenceBadgeDrawable(drawable);
        gradientSpinnerAvatarView.A02 = -0.03f;
    }

    public final void setSnackBarBackgroundColor(int i) {
        GradientDrawable gradientDrawable;
        ViewGroup viewGroup = this.A09;
        if (viewGroup.getBackground() instanceof GradientDrawable) {
            Drawable background = viewGroup.getBackground();
            if ((background instanceof GradientDrawable) && (gradientDrawable = (GradientDrawable) background) != null) {
                gradientDrawable.setColor(i);
                return;
            }
            return;
        }
        viewGroup.setBackgroundColor(i);
    }

    public final void setSquareImageDrawableRes(int i) {
        ImageView imageView = (ImageView) this.A08.A01();
        0qQ.A0A(imageView);
        A00(imageView);
        imageView.setImageResource(i);
    }

    /*  JADX ERROR: JadxRuntimeException in pass: CodeShrinkVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Don't wrap MOVE or CONST insns: 0x000c: MOVE  (r1v2 com.instagram.common.ui.widget.imageview.RoundedCornerImageView) = 
          (r1v1 com.instagram.common.ui.widget.imageview.RoundedCornerImageView)
        
        	at jadx.core.dex.instructions.args.InsnArg.wrapArg(InsnArg.java:164)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.assignInline(CodeShrinkVisitor.java:133)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.checkInline(CodeShrinkVisitor.java:118)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkBlock(CodeShrinkVisitor.java:65)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.shrinkMethod(CodeShrinkVisitor.java:43)
        	at jadx.core.dex.visitors.shrink.CodeShrinkVisitor.visit(CodeShrinkVisitor.java:35)
        */
    public final void setSquareImageStrokeEnabled(boolean r3) {
        /*
            r2 = this;
            X.2eb r0 = r2.A08
            android.view.View r1 = r0.A01()
            com.instagram.common.ui.widget.imageview.IgImageView r1 = (com.instagram.common.ui.widget.imageview.IgImageView) r1
            boolean r0 = r1 instanceof com.instagram.common.ui.widget.imageview.RoundedCornerImageView
            if (r0 == 0) goto L_0x0013
            com.instagram.common.ui.widget.imageview.RoundedCornerImageView r1 = (com.instagram.common.ui.widget.imageview.RoundedCornerImageView) r1
            if (r1 == 0) goto L_0x0013
            r1.setStrokeEnabled(r3)
        L_0x0013:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.snackbar.IgdsSnackBar.setSquareImageStrokeEnabled(boolean):void");
    }

    public final void setSwipeListener(View.OnTouchListener onTouchListener) {
        this.A09.setOnTouchListener(onTouchListener);
    }

    public final void setTextColor(int i) {
        this.A05.setTextColor(i);
    }

    public final void setTypeface(boolean z) {
        TextView textView = this.A05;
        Typeface typeface = textView.getTypeface();
        if (typeface != null) {
            int style = typeface.getStyle();
            if (Integer.valueOf(style) != null && style == z) {
                return;
            }
        }
        textView.setTypeface((Typeface) null, z ? 1 : 0);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int id;
        int i5;
        int id2;
        int i6;
        int id3;
        int i7;
        int id4;
        super.onLayout(z, i, i2, i3, i4);
        TextView textView = this.A04;
        ViewGroup.LayoutParams layoutParams = textView.getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        int i8 = ((C71492dQ) layoutParams).A0G;
        TextView textView2 = this.A0B;
        boolean z2 = false;
        boolean z3 = false;
        if (i8 == textView2.getId()) {
            z3 = true;
        }
        TextView textView3 = this.A05;
        if ((textView3.getLineCount() > 1 || textView.getLineCount() > 1) && ((float) textView2.getMeasuredWidth()) / ((float) this.A09.getMeasuredWidth()) > 0.25f) {
            z2 = true;
        }
        if (z3 != z2) {
            ViewGroup.LayoutParams layoutParams2 = textView3.getLayoutParams();
            if (layoutParams2 != null) {
                C71492dQ r1 = (C71492dQ) layoutParams2;
                int i9 = -1;
                if (z2) {
                    id = -1;
                } else {
                    id = textView2.getId();
                }
                r1.A0N = id;
                if (z2) {
                    i5 = this.A09.getId();
                } else {
                    i5 = -1;
                }
                r1.A0M = i5;
                textView3.setLayoutParams(r1);
                ViewGroup.LayoutParams layoutParams3 = textView.getLayoutParams();
                if (layoutParams3 != null) {
                    C71492dQ r12 = (C71492dQ) layoutParams3;
                    if (z2) {
                        id2 = -1;
                    } else {
                        id2 = this.A09.getId();
                    }
                    r12.A0F = id2;
                    if (z2) {
                        i6 = textView2.getId();
                    } else {
                        i6 = -1;
                    }
                    r12.A0G = i6;
                    textView.setLayoutParams(r12);
                    ViewGroup.LayoutParams layoutParams4 = textView2.getLayoutParams();
                    if (layoutParams4 != null) {
                        C71492dQ r13 = (C71492dQ) layoutParams4;
                        if (z2) {
                            id3 = -1;
                        } else {
                            id3 = this.A09.getId();
                        }
                        r13.A0u = id3;
                        if (z2) {
                            i7 = textView.getId();
                        } else {
                            i7 = -1;
                        }
                        r13.A0t = i7;
                        textView2.setLayoutParams(r13);
                        View view = this.A00;
                        ViewGroup.LayoutParams layoutParams5 = view.getLayoutParams();
                        if (layoutParams5 != null) {
                            C71492dQ r14 = (C71492dQ) layoutParams5;
                            if (z2) {
                                id4 = -1;
                            } else {
                                id4 = this.A09.getId();
                            }
                            r14.A0u = id4;
                            if (z2) {
                                i9 = textView.getId();
                            }
                            r14.A0t = i9;
                            view.setLayoutParams(r14);
                            Resources resources = getResources();
                            int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
                            int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material);
                            ViewGroup viewGroup = this.A09;
                            int paddingLeft = viewGroup.getPaddingLeft();
                            int paddingTop = viewGroup.getPaddingTop();
                            int paddingRight = viewGroup.getPaddingRight();
                            if (z2) {
                                dimensionPixelSize -= dimensionPixelSize2;
                            }
                            viewGroup.setPadding(paddingLeft, paddingTop, paddingRight, dimensionPixelSize);
                            return;
                        }
                        throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                }
                throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
            }
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
    }

    /* JADX WARNING: type inference failed for: r1v10, types: [android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public IgdsSnackBar(android.content.Context r6, android.util.AttributeSet r7, int r8) {
        /*
            r5 = this;
            r0 = 1
            X.0qQ.A0B(r6, r0)
            r5.<init>(r6, r7, r8)
            boolean r2 = X.C61670oa.A06()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r6)
            r0 = 2131626091(0x7f0e086b, float:1.8879408E38)
            if (r2 == 0) goto L_0x0017
            r0 = 2131626081(0x7f0e0861, float:1.8879388E38)
        L_0x0017:
            r1.inflate(r0, r5)
            r0 = 2131441509(0x7f0b3765, float:1.8505032E38)
            android.view.View r4 = r5.findViewById(r0)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            r5.A09 = r4
            r0 = 2131434545(0x7f0b1c31, float:1.8490907E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.A01 = r0
            r0 = 2131429925(0x7f0b0a25, float:1.8481536E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            r2 = 0
            if (r0 == 0) goto L_0x00f7
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x003e:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A07 = r0
            r0 = 2131441655(0x7f0b37f7, float:1.8505328E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00f4
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0052:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A08 = r0
            r0 = 2131428425(0x7f0b0449, float:1.8478494E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00f1
            android.view.ViewStub r1 = (android.view.ViewStub) r1
        L_0x0066:
            X.2eb r0 = new X.2eb
            r0.<init>(r1)
            r5.A06 = r0
            r0 = 2131434056(0x7f0b1a48, float:1.8489915E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A03 = r0
            r0 = 2131441512(0x7f0b3768, float:1.8505038E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A05 = r0
            r0 = 2131441513(0x7f0b3769, float:1.850504E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A04 = r0
            r0 = 2131441515(0x7f0b376b, float:1.8505044E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.TextView r0 = (android.widget.TextView) r0
            r5.A0B = r0
            r0 = 2131441510(0x7f0b3766, float:1.8505034E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r5.A02 = r0
            r0 = 2131441511(0x7f0b3767, float:1.8505036E38)
            android.view.View r0 = r5.findViewById(r0)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r5.A0A = r0
            r0 = 2131441654(0x7f0b37f6, float:1.8505326E38)
            android.view.View r1 = r5.findViewById(r0)
            boolean r0 = r1 instanceof android.view.ViewStub
            if (r0 == 0) goto L_0x00bd
            r2 = r1
            android.view.ViewStub r2 = (android.view.ViewStub) r2
        L_0x00bd:
            X.2eb r0 = new X.2eb
            r0.<init>(r2)
            r5.A0C = r0
            r0 = 2131441508(0x7f0b3764, float:1.850503E38)
            android.view.View r0 = r5.findViewById(r0)
            r5.A00 = r0
            r0 = 2
            r4.setImportantForAccessibility(r0)
            android.graphics.drawable.GradientDrawable r3 = new android.graphics.drawable.GradientDrawable
            r3.<init>()
            android.content.res.Resources r2 = r4.getResources()
            boolean r1 = X.C61670oa.A06()
            r0 = 2131165196(0x7f07000c, float:1.7944602E38)
            if (r1 == 0) goto L_0x00e5
            r0 = 2131165184(0x7f070000, float:1.7944578E38)
        L_0x00e5:
            int r0 = r2.getDimensionPixelSize(r0)
            float r0 = (float) r0
            r3.setCornerRadius(r0)
            r4.setBackground(r3)
            return
        L_0x00f1:
            r1 = r2
            goto L_0x0066
        L_0x00f4:
            r1 = r2
            goto L_0x0052
        L_0x00f7:
            r1 = r2
            goto L_0x003e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.snackbar.IgdsSnackBar.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    /* JADX WARNING: type inference failed for: r0v5, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.widget.ImageView] */
    public final void setAvatarImageDrawable(Drawable drawable, Drawable drawable2) {
        ? r0;
        0qQ.A0B(drawable, 0);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A06.A01();
        0qQ.A0A(gradientSpinnerAvatarView);
        this.A01.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        if (!gradientSpinnerAvatarView.A08 || (r0 = gradientSpinnerAvatarView.A0L) == 0) {
            throw new IllegalStateException(AnonymousClass000.A00(463));
        }
        r0.setImageDrawable(drawable);
        IgImageView igImageView = gradientSpinnerAvatarView.A0K;
        if (drawable2 == null) {
            igImageView.A0B();
        } else {
            igImageView.setImageDrawable(drawable2);
        }
        GradientSpinnerAvatarView.A03((AnonymousClass9IV) null, gradientSpinnerAvatarView);
    }

    public final void setAvatarImageUri(ImageUrl imageUrl, ImageUrl imageUrl2) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(imageUrl2, 1);
        GradientSpinnerAvatarView gradientSpinnerAvatarView = (GradientSpinnerAvatarView) this.A06.A01();
        0qQ.A0A(gradientSpinnerAvatarView);
        this.A01.setVisibility(0);
        gradientSpinnerAvatarView.setVisibility(0);
        gradientSpinnerAvatarView.A0G((AnonymousClass9IV) null, A0D, imageUrl, imageUrl2);
    }

    public final void setIconDrawable(int i) {
        ImageView imageView = this.A03;
        A00(imageView);
        imageView.setImageResource(i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgdsSnackBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgdsSnackBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
