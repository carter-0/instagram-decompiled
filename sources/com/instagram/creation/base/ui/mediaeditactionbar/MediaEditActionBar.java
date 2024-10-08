package com.instagram.creation.base.ui.mediaeditactionbar;

import X.0qQ;
import X.1Ng;
import X.1wn;
import X.2Yu;
import X.AnonymousClass05K;
import X.AnonymousClass0fD;
import X.AnonymousClass1Nd;
import X.AnonymousClass2uJ;
import X.AnonymousClass37N;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.C267854cK;
import X.C273604mr;
import X.C273654mx;
import X.C51968G9o;
import X.C59885Jb9;
import X.C59890JbF;
import X.C62526KhI;
import X.DbT;
import X.DbU;
import X.DbX;
import X.JTO;
import X.JWN;
import X.LY1;
import X.MQ7;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewSwitcher;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.creation.activity.MediaCaptureActivity;
import com.instagram.ui.widget.trianglespinner.TriangleSpinner;

public final class MediaEditActionBar extends ViewSwitcher implements 1wn {
    public MQ7 A00;
    public boolean A01;
    public boolean A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public TextView A06;
    public boolean A07;
    public final View A08;
    public final View A09;
    public final LinearLayout A0A;
    public final TextView A0B;
    public final IgSimpleImageView A0C = DbX.A0Y(this, R.id.button_back);
    public final TriangleSpinner A0D;
    public final Paint A0E;
    public final 1Ng A0F;
    public final boolean A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MediaEditActionBar(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        Context context2 = getContext();
        0qQ.A0C(context2, "null cannot be cast to non-null type com.instagram.creation.base.SessionProvider");
        this.A0F = AnonymousClass1Nd.A00(((C267854cK) context2).CCy());
        View inflate = LayoutInflater.from(context).inflate(R.layout.media_edit_action_bar, this);
        0qQ.A07(inflate);
        this.A08 = inflate;
        TextView textView = null;
        setBackButtonClickListener((View.OnClickListener) null);
        TextView A0G2 = DbU.A0G(this, R.id.action_bar_textview_title);
        this.A0B = A0G2;
        this.A0D = (TriangleSpinner) findViewById(R.id.user_spinner);
        this.A09 = JWN.A01((View.OnClickListener) null, this, AnonymousClass05K.A01, false);
        0qQ.A07(context2);
        boolean A052 = JWN.A05(context2);
        this.A0G = A052;
        A0G2.setAccessibilityHeading(true);
        Paint A0C2 = JTO.A0C();
        this.A0E = A0C2;
        A0C2.setColor(2Yu.A0F(context2, R.attr.creationDividerColor));
        JTO.A1N(A0C2);
        A0C2.setStrokeWidth(1.0f);
        if (!A052) {
            FrameLayout frameLayout = new FrameLayout(context2);
            View inflate2 = LayoutInflater.from(context).inflate(R.layout.accept_reject_edit_buttons_small, frameLayout, false);
            inflate2.setId(R.id.primary_accept_buttons);
            View inflate3 = LayoutInflater.from(context).inflate(R.layout.accept_reject_edit_buttons_small, frameLayout, false);
            inflate3.setId(R.id.secondary_accept_buttons);
            setupDividers(inflate2);
            setupDividers(inflate3);
            frameLayout.addView(inflate2);
            frameLayout.addView(inflate3);
            addView(frameLayout);
            textView = AnonymousClass7TE.A0d(requireViewById(R.id.primary_accept_buttons), R.id.adjust_title);
        }
        this.A06 = textView;
        LinearLayout linearLayout = new LinearLayout(context2);
        this.A0A = linearLayout;
        linearLayout.setId(R.id.creation_secondary_actions);
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(0, -1, 1.0f);
        View childAt = getChildAt(0);
        0qQ.A0C(childAt, C273654mx.A00(1));
        ((ViewGroup) childAt).addView(linearLayout, 1, layoutParams);
        A0G2.setVisibility(8);
    }

    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas, 0);
        super.dispatchDraw(canvas);
        if (this.A01) {
            int left = getLeft();
            int right = getRight();
            float bottom = (float) (getBottom() - 1);
            canvas2.drawLine((float) left, bottom, (float) right, bottom, this.A0E);
        }
    }

    public final void setIsDarkModeEnabled(boolean z) {
        this.A02 = true;
    }

    public static /* synthetic */ void setBackButtonClickListener$default(MediaEditActionBar mediaEditActionBar, View.OnClickListener onClickListener, int i, Object obj) {
        if ((i & 1) != 0) {
            onClickListener = null;
        }
        mediaEditActionBar.setBackButtonClickListener(onClickListener);
    }

    public final void A01() {
        TextView textView;
        TriangleSpinner triangleSpinner;
        setupBackButton(C62526KhI.BACK);
        boolean z = this.A03;
        View view = this.A09;
        if (!z) {
            view.setVisibility(8);
            this.A05 = false;
        } else {
            view.setVisibility(0);
        }
        this.A0A.setVisibility(8);
        if (this.A04) {
            textView = this.A0B;
            textView.setText(2131968296);
            textView.setVisibility(0);
            triangleSpinner = this.A0D;
            if (triangleSpinner == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            triangleSpinner.setVisibility(8);
        } else if (this.A05) {
            textView = this.A0B;
            textView.setVisibility(8);
            TriangleSpinner triangleSpinner2 = this.A0D;
            if (triangleSpinner2 != null) {
                triangleSpinner2.setVisibility(0);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        } else {
            boolean z2 = this.A07;
            textView = this.A0B;
            int i = 2131973482;
            if (z2) {
                i = 2131968297;
            }
            textView.setText(i);
            textView.setVisibility(0);
            triangleSpinner = this.A0D;
            if (triangleSpinner == null) {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
            triangleSpinner.setVisibility(8);
        }
        Context context = getContext();
        int A042 = C51968G9o.A04(context);
        DbT.A16(context, this.A08, 2Yu.A0C(context));
        IgSimpleImageView igSimpleImageView = this.A0C;
        igSimpleImageView.setBackgroundResource(R.drawable.igds_action_bar_default_button_background);
        textView.setTextColor(A042);
        Drawable drawable = igSimpleImageView.getDrawable();
        if (drawable != null) {
            drawable.setTint(A042);
            return;
        }
        throw AnonymousClass7TE.A0z("Required value was null.");
    }

    public final void A03(String str, boolean z) {
        TextView textView;
        if (!z) {
            if (!this.A01) {
                this.A01 = true;
                invalidate();
            }
            this.A09.setVisibility(8);
            TriangleSpinner triangleSpinner = this.A0D;
            if (triangleSpinner != null) {
                triangleSpinner.setVisibility(8);
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        if (this.A0G) {
            textView = this.A0B;
            textView.setText(str);
            textView.setVisibility(0);
            this.A0A.setVisibility(8);
            if (!this.A02) {
                return;
            }
        } else {
            TextView textView2 = this.A06;
            if (textView2 != null) {
                textView2.setText(str);
                if (str != null) {
                    setDisplayedChild(1);
                    if (this.A02) {
                        textView = this.A0B;
                    } else {
                        return;
                    }
                } else {
                    setDisplayedChild(0);
                    return;
                }
            } else {
                throw AnonymousClass7TE.A0z("Required value was null.");
            }
        }
        Context context = getContext();
        DbT.A17(context, textView, 2Yu.A0E(context));
    }

    public final LinearLayout getSecondaryActionsView() {
        return this.A0A;
    }

    public final TriangleSpinner getUserSpinner() {
        return this.A0D;
    }

    public final void setBackButtonClickListener(View.OnClickListener onClickListener) {
        LY1 ly1 = new LY1(this, 62);
        IgSimpleImageView igSimpleImageView = this.A0C;
        if (onClickListener == null) {
            onClickListener = ly1;
        }
        igSimpleImageView.setOnClickListener(onClickListener);
    }

    public final void setBackButtonVisibility(int i) {
        this.A0C.setVisibility(i);
    }

    public final void setIsQuietPostingFlow(boolean z) {
        this.A07 = z;
        A01();
    }

    public final void setupBackButton(C62526KhI khI) {
        IgSimpleImageView igSimpleImageView;
        int i;
        Context context;
        int i2;
        if (khI != null) {
            int ordinal = khI.ordinal();
            if (ordinal == 0) {
                igSimpleImageView = this.A0C;
                context = getContext();
                i2 = R.attr.backButtonIcon;
            } else if (ordinal != 7) {
                if (ordinal == 3) {
                    igSimpleImageView = this.A0C;
                    i = R.drawable.instagram_x_pano_outline_24;
                } else if (ordinal == 4) {
                    igSimpleImageView = this.A0C;
                    i = R.drawable.instagram_check_pano_filled_24;
                } else if (ordinal == 5) {
                    setBackButtonVisibility(8);
                }
                igSimpleImageView.setImageResource(i);
            } else {
                igSimpleImageView = this.A0C;
                context = getContext();
                i2 = R.attr.backButtonCarrotIcon;
            }
            i = 2Yu.A0H(context, i2);
            igSimpleImageView.setImageResource(i);
        }
        if (this.A02) {
            Drawable drawable = this.A0C.getDrawable();
            if (drawable != null) {
                Context context2 = getContext();
                DbU.A10(context2, drawable, 2Yu.A0A(context2));
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    private final void setupDividers(View view) {
        View requireViewById = view.requireViewById(R.id.button_cancel_adjust);
        Context context = getContext();
        Resources.Theme theme = context.getTheme();
        0qQ.A07(theme);
        Integer num = AnonymousClass05K.A00;
        requireViewById.setBackground(new AnonymousClass37N(theme, num));
        View requireViewById2 = view.requireViewById(R.id.button_accept_adjust);
        Resources.Theme theme2 = context.getTheme();
        0qQ.A07(theme2);
        requireViewById2.setBackground(new AnonymousClass37N(theme2, num));
    }

    public final void A00() {
        Context context = getContext();
        int A032 = AnonymousClass7TF.A03(context, R.attr.igds_color_media_background);
        AnonymousClass2uJ.A04((Activity) context, A032);
        this.A08.setBackgroundColor(A032);
        IgSimpleImageView igSimpleImageView = this.A0C;
        igSimpleImageView.setBackgroundResource(R.drawable.igds_action_bar_default_button_background_night);
        Drawable drawable = igSimpleImageView.getDrawable();
        drawable.getClass();
        DbU.A10(context, drawable, 2Yu.A0A(context));
        this.A02 = true;
    }

    public final void A02(int i, boolean z) {
        setBackButtonVisibility(i);
        this.A0A.setVisibility(i);
        if (z) {
            this.A09.setVisibility(i);
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1311023865);
        super.onAttachedToWindow();
        Context context = getContext();
        0qQ.A0C(context, "null cannot be cast to non-null type com.instagram.creation.state.StateMachineProvider");
        MediaCaptureActivity mediaCaptureActivity = (MediaCaptureActivity) ((C273604mr) context);
        C59885Jb9 jb9 = mediaCaptureActivity.A0A;
        if (jb9 == null) {
            mediaCaptureActivity.A0M.add(this);
        } else {
            jb9.A01(this);
        }
        AnonymousClass0fD.A0D(-464394390, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-49481709);
        super.onDetachedFromWindow();
        this.A0F.A02(this, C59890JbF.class);
        this.A00 = null;
        AnonymousClass0fD.A0D(-1598417570, A062);
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x003e, code lost:
        X.AnonymousClass0fD.A0A(-421256982, r2);
        X.AnonymousClass0fD.A0A(188944928, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x004a, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0117, code lost:
        r1.setVisibility(0);
        r0 = r8.A0A;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0181, code lost:
        r1.setText(r0);
        r8.A0A.setVisibility(8);
        r0 = r8.A09;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x018b, code lost:
        r0.setVisibility(8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0022, code lost:
        if (r7 == com.instagram.creation.state.CreationState.A02) goto L_0x0024;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ void onEvent(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 314483075(0x12bea183, float:1.2030501E-27)
            int r3 = X.AnonymousClass0fD.A03(r0)
            X.JbF r9 = (X.C59890JbF) r9
            r0 = -1397635106(0xffffffffacb1c7de, float:-5.0528323E-12)
            int r2 = X.AnonymousClass0fD.A03(r0)
            r5 = 0
            X.0qQ.A0B(r9, r5)
            com.instagram.creation.state.CreationState r7 = r9.A02
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0R
            r6 = 1
            if (r7 == r0) goto L_0x0024
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A0c
            if (r7 == r0) goto L_0x0024
            com.instagram.creation.state.CreationState r0 = com.instagram.creation.state.CreationState.A02
            r1 = 0
            if (r7 != r0) goto L_0x0025
        L_0x0024:
            r1 = 1
        L_0x0025:
            boolean r0 = r8.A01
            if (r1 == r0) goto L_0x002e
            r8.A01 = r1
            r8.invalidate()
        L_0x002e:
            com.instagram.ui.widget.trianglespinner.TriangleSpinner r0 = r8.A0D
            if (r0 == 0) goto L_0x0195
            r4 = 8
            r0.setVisibility(r4)
            int r0 = r7.ordinal()
            switch(r0) {
                case 0: goto L_0x013f;
                case 1: goto L_0x00a8;
                case 2: goto L_0x012e;
                case 3: goto L_0x0088;
                case 4: goto L_0x013f;
                case 10: goto L_0x016a;
                case 16: goto L_0x0088;
                case 17: goto L_0x004b;
                case 21: goto L_0x015e;
                case 23: goto L_0x00c2;
                case 24: goto L_0x010b;
                case 25: goto L_0x0176;
                case 26: goto L_0x004b;
                case 28: goto L_0x00f9;
                case 29: goto L_0x00d5;
                case 31: goto L_0x00ef;
                case 32: goto L_0x011d;
                case 37: goto L_0x00f9;
                default: goto L_0x003e;
            }
        L_0x003e:
            r0 = -421256982(0xffffffffe6e420ea, float:-5.3865336E23)
            X.AnonymousClass0fD.A0A(r0, r2)
            r0 = 188944928(0xb431220, float:3.756927E-32)
            X.AnonymousClass0fD.A0A(r0, r3)
            return
        L_0x004b:
            r8.setDisplayedChild(r5)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x0056
            r8.A00()
            goto L_0x003e
        L_0x0056:
            android.content.Context r5 = r8.getContext()
            int r0 = X.2Yu.A0C(r5)
            int r4 = r5.getColor(r0)
            android.view.View r0 = r8.A08
            r0.setBackgroundColor(r4)
            com.instagram.common.ui.base.IgSimpleImageView r1 = r8.A0C
            r0 = 2131237761(0x7f081b81, float:1.8091782E38)
            r1.setBackgroundResource(r0)
            r0 = r5
            android.app.Activity r0 = (android.app.Activity) r0
            X.AnonymousClass2uJ.A04(r0, r4)
            android.view.View r0 = r8.A09
            r0.setBackgroundColor(r4)
            android.graphics.drawable.Drawable r1 = r1.getDrawable()
            if (r1 == 0) goto L_0x0190
            int r0 = X.2Yu.A07(r5)
            X.DbU.A10(r5, r1, r0)
            goto L_0x003e
        L_0x0088:
            android.widget.TextView r0 = r8.A0B
            r0.setVisibility(r4)
            r8.setBackButtonVisibility(r5)
            android.widget.LinearLayout r0 = r8.A0A
            r0.setVisibility(r5)
            boolean r0 = r8.A02
            if (r0 == 0) goto L_0x009c
            r8.A00()
        L_0x009c:
            X.MQ7 r0 = r8.A00
            if (r0 == 0) goto L_0x003e
            X.Lkp r0 = (X.C64950Lkp) r0
            com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar r0 = r0.A00
            r0.setDisplayedChild(r5)
            goto L_0x003e
        L_0x00a8:
            X.JbD r0 = r9.A00
            X.JbE r1 = r0.A00
            boolean r0 = r1 instanceof X.KPN
            if (r0 == 0) goto L_0x003e
            android.view.View r0 = r8.A09
            r0.setVisibility(r4)
            r8.setBackButtonVisibility(r4)
            java.lang.String r0 = "null cannot be cast to non-null type com.instagram.creation.state.CreationAction.EffectClick"
            X.0qQ.A0C(r1, r0)
            X.KPN r1 = (X.KPN) r1
            java.lang.String r0 = r1.A00
            goto L_0x00ea
        L_0x00c2:
            android.view.View r0 = r8.A09
            r0.setVisibility(r4)
            X.KhI r0 = X.C62526KhI.FINISH
            r8.setupBackButton(r0)
            android.widget.TextView r1 = r8.A0B
            r0 = 2131965835(0x7f13378b, float:1.9568491E38)
            r1.setText(r0)
            goto L_0x0117
        L_0x00d5:
            android.view.View r0 = r8.A09
            r0.setVisibility(r4)
            X.KhI r0 = X.C62526KhI.BACK
            r8.setupBackButton(r0)
            android.content.Context r1 = r8.getContext()
            r0 = 2131969753(0x7f1346d9, float:1.9576438E38)
            java.lang.String r0 = r1.getString(r0)
        L_0x00ea:
            r8.A03(r0, r6)
            goto L_0x003e
        L_0x00ef:
            android.view.View r0 = r8.A09
            r0.setVisibility(r4)
            r8.A01()
            goto L_0x003e
        L_0x00f9:
            android.widget.TextView r0 = r8.A0B
            r0.setVisibility(r4)
            r8.setBackButtonVisibility(r5)
            android.widget.LinearLayout r0 = r8.A0A
            r0.setVisibility(r5)
            r8.setDisplayedChild(r5)
            goto L_0x003e
        L_0x010b:
            X.KhI r0 = X.C62526KhI.CANCEL
            r8.setupBackButton(r0)
            android.widget.TextView r0 = r8.A0B
            r0.setVisibility(r5)
            android.view.View r1 = r8.A09
        L_0x0117:
            r1.setVisibility(r5)
            android.widget.LinearLayout r0 = r8.A0A
            goto L_0x018b
        L_0x011d:
            r8.setBackButtonVisibility(r5)
            X.KhI r0 = X.C62526KhI.CANCEL
            r8.setupBackButton(r0)
            android.widget.TextView r1 = r8.A0B
            r1.setVisibility(r5)
            r0 = 2131969734(0x7f1346c6, float:1.95764E38)
            goto L_0x0181
        L_0x012e:
            r8.setBackButtonVisibility(r5)
            X.KhI r0 = X.C62526KhI.BACK
            r8.setupBackButton(r0)
            android.widget.TextView r1 = r8.A0B
            r1.setVisibility(r5)
            r0 = 2131952518(0x7f130386, float:1.954148E38)
            goto L_0x0181
        L_0x013f:
            r8.setBackButtonVisibility(r5)
            X.KhI r0 = X.C62526KhI.BACK
            r8.setupBackButton(r0)
            android.widget.TextView r1 = r8.A0B
            r1.setVisibility(r5)
            r0 = 2131952938(0x7f13052a, float:1.9542333E38)
            r1.setText(r0)
            android.widget.LinearLayout r0 = r8.A0A
            r0.setVisibility(r4)
            android.view.View r0 = r8.A09
            r0.setVisibility(r5)
            goto L_0x003e
        L_0x015e:
            r8.setBackButtonVisibility(r5)
            android.widget.TextView r1 = r8.A0B
            r1.setVisibility(r5)
            r0 = 2131964963(0x7f133423, float:1.9566722E38)
            goto L_0x0181
        L_0x016a:
            r8.setBackButtonVisibility(r5)
            android.widget.TextView r1 = r8.A0B
            r1.setVisibility(r5)
            r0 = 2131954185(0x7f130a09, float:1.9544862E38)
            goto L_0x0181
        L_0x0176:
            r8.setBackButtonVisibility(r5)
            android.widget.TextView r1 = r8.A0B
            r1.setVisibility(r5)
            r0 = 2131969192(0x7f1344a8, float:1.95753E38)
        L_0x0181:
            r1.setText(r0)
            android.widget.LinearLayout r0 = r8.A0A
            r0.setVisibility(r4)
            android.view.View r0 = r8.A09
        L_0x018b:
            r0.setVisibility(r4)
            goto L_0x003e
        L_0x0190:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            throw r1
        L_0x0195:
            java.lang.IllegalStateException r1 = X.AnonymousClass7TE.A0y()
            r0 = 436187193(0x19ffb039, float:2.6437558E-23)
            X.AnonymousClass0fD.A0A(r0, r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.creation.base.ui.mediaeditactionbar.MediaEditActionBar.onEvent(java.lang.Object):void");
    }

    public final void setIsDraftShare(boolean z) {
        this.A03 = z;
    }

    public final void setIsProfilePhoto(boolean z) {
        this.A04 = z;
    }

    public final void setListener(MQ7 mq7) {
        this.A00 = mq7;
    }

    public final void setShouldShowUserSpinner(boolean z) {
        this.A05 = z;
    }
}
