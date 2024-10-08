package com.facebook.rendercore.text;

import X.02Z;
import X.03v;
import X.AnonymousClass0fD;
import X.AnonymousClass90O;
import X.C20881X2i;
import X.C299145ue;
import X.C300985yH;
import X.C308186Tb;
import X.WK5;
import X.WK6;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.CornerPathEffect;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.text.style.ImageSpan;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;

public class RCTextView extends View {
    public float A00;
    public float A01;
    public Layout A02;
    public CharSequence A03;
    public boolean A04;
    public boolean A05 = false;
    public ClickableSpan[] A06;
    public int A07;
    public int A08;
    public int A09;
    public int A0A;
    public int A0B;
    public ColorStateList A0C;
    public Paint A0D;
    public Path A0E;
    public boolean A0F;
    public ImageSpan[] A0G;
    public final C299145ue A0H;

    public static int A00(RCTextView rCTextView, int i, int i2) {
        float paragraphLeft;
        float lineMax;
        int i3 = (int) (((float) i2) - rCTextView.A01);
        int i4 = (int) (((float) i) - rCTextView.A00);
        int lineForVertical = rCTextView.A02.getLineForVertical(i3);
        Layout.Alignment alignment = rCTextView.A02.getAlignment();
        Layout.Alignment alignment2 = Layout.Alignment.ALIGN_CENTER;
        Layout layout = rCTextView.A02;
        if (alignment == alignment2) {
            paragraphLeft = layout.getLineLeft(lineForVertical);
            lineMax = rCTextView.A02.getLineRight(lineForVertical);
        } else {
            boolean z = false;
            if (layout.getParagraphDirection(lineForVertical) == -1) {
                z = true;
            }
            Layout layout2 = rCTextView.A02;
            if (z) {
                paragraphLeft = ((float) layout2.getWidth()) - rCTextView.A02.getLineMax(lineForVertical);
                lineMax = (float) rCTextView.A02.getParagraphRight(lineForVertical);
            } else {
                paragraphLeft = (float) layout2.getParagraphLeft(lineForVertical);
                lineMax = rCTextView.A02.getLineMax(lineForVertical);
            }
        }
        float f = (float) i4;
        if (f >= paragraphLeft && f <= lineMax) {
            try {
                return rCTextView.A02.getOffsetForHorizontal(lineForVertical, f);
            } catch (ArrayIndexOutOfBoundsException unused) {
            }
        }
        return -1;
    }

    public final void A04() {
        this.A03 = null;
        this.A02 = null;
        this.A00 = 0.0f;
        this.A01 = 0.0f;
        this.A07 = 0;
        this.A08 = 0;
        this.A0C = null;
        this.A09 = 0;
        ImageSpan[] imageSpanArr = this.A0G;
        if (imageSpanArr != null) {
            int length = imageSpanArr.length;
            for (int i = 0; i < length; i++) {
                Drawable drawable = this.A0G[i].getDrawable();
                drawable.setCallback((Drawable.Callback) null);
                drawable.setVisible(false, false);
            }
            this.A0G = null;
        }
        this.A06 = null;
        setContentDescription("");
        C299145ue r0 = this.A0H;
        if (r0 != null) {
            r0.A0c();
        }
    }

    private void A02(int i, int i2) {
        CornerPathEffect cornerPathEffect;
        if (Color.alpha(this.A07) == 0) {
            return;
        }
        if (this.A0B != i || this.A0A != i2) {
            this.A0B = i;
            this.A0A = i2;
            Paint paint = this.A0D;
            if (paint == null) {
                paint = new Paint();
                this.A0D = paint;
            }
            paint.setColor(this.A07);
            int i3 = this.A08;
            Paint paint2 = this.A0D;
            if (i3 != 0) {
                cornerPathEffect = new CornerPathEffect((float) i3);
            } else {
                cornerPathEffect = null;
            }
            paint2.setPathEffect(cornerPathEffect);
            this.A0F = true;
            invalidate();
        }
    }

    public static void A03(Canvas canvas, RCTextView rCTextView) {
        rCTextView.A02.draw(canvas, rCTextView.getSelectionPath(), rCTextView.A0D, 0);
    }

    private C300985yH[] getOnPrePostDrawableSpans() {
        CharSequence charSequence = this.A03;
        if (!(charSequence instanceof Spanned)) {
            return new C300985yH[0];
        }
        return (C300985yH[]) ((Spanned) charSequence).getSpans(0, charSequence.length(), C300985yH.class);
    }

    private Path getSelectionPath() {
        if (this.A0B == this.A0A || Color.alpha(this.A07) == 0) {
            return null;
        }
        if (this.A0F) {
            Path path = this.A0E;
            if (path == null) {
                path = new Path();
                this.A0E = path;
            }
            this.A02.getSelectionPath(this.A0B, this.A0A, path);
            this.A0F = false;
        }
        return this.A0E;
    }

    /* access modifiers changed from: private */
    public CharSequence getTextForAccessibility() {
        CharSequence charSequence = this.A03;
        if (charSequence == null || charSequence.length() < 1000000) {
            return this.A03;
        }
        if (!Character.isHighSurrogate(this.A03.charAt(999999)) || !Character.isLowSurrogate(this.A03.charAt(1000000))) {
            return this.A03.subSequence(0, 1000000);
        }
        return this.A03.subSequence(0, 999999);
    }

    private void setSelection(ClickableSpan clickableSpan) {
        Spanned spanned = (Spanned) this.A03;
        A02(spanned.getSpanStart(clickableSpan), spanned.getSpanEnd(clickableSpan));
    }

    public final void A05(C308186Tb r6) {
        AnonymousClass90O r1 = r6.A03;
        ColorStateList colorStateList = r1.A0R;
        this.A03 = r6.A04;
        this.A02 = r6.A02;
        this.A00 = r6.A00;
        this.A01 = r6.A01;
        this.A07 = r1.A0A;
        this.A08 = r1.A0B;
        this.A04 = r6.A05;
        int i = r1.A0O;
        if (i != 0) {
            this.A0C = null;
            this.A09 = i;
        } else {
            this.A0C = colorStateList;
            this.A09 = colorStateList.getDefaultColor();
            Layout layout = this.A02;
            if (layout != null) {
                layout.getPaint().setColor(this.A0C.getColorForState(getDrawableState(), this.A09));
            }
        }
        A02(0, 0);
        ImageSpan[] imageSpanArr = r6.A07;
        if (imageSpanArr != null) {
            this.A0G = imageSpanArr;
            int length = imageSpanArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                Drawable drawable = this.A0G[i2].getDrawable();
                drawable.setCallback(this);
                drawable.setVisible(true, false);
            }
        }
        this.A06 = r6.A06;
        String str = r6.A03.A0Z;
        if (str != null) {
            setContentDescription(str);
        }
        invalidate();
    }

    public final boolean dispatchHoverEvent(MotionEvent motionEvent) {
        C299145ue r0 = this.A0H;
        if ((r0 == null || !r0.A0o(motionEvent)) && !super.dispatchHoverEvent(motionEvent)) {
            return false;
        }
        return true;
    }

    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        C299145ue r1 = this.A0H;
        if ((r1 == null || this.A06.length <= 0 || !r1.A0n(keyEvent)) && !super.dispatchKeyEvent(keyEvent)) {
            return false;
        }
        return true;
    }

    public Layout getLayout() {
        return this.A02;
    }

    public float getLayoutTranslationX() {
        return this.A00;
    }

    public float getLayoutTranslationY() {
        return this.A01;
    }

    public CharSequence getText() {
        return this.A03;
    }

    public RCTextView(Context context) {
        super(context);
        if (getImportantForAccessibility() == 0) {
            C299145ue r1 = new C299145ue(this);
            this.A0H = r1;
            this.A05 = true;
            03v.A0B(this, r1);
            this.A05 = false;
            return;
        }
        this.A0H = null;
    }

    public final void draw(Canvas canvas) {
        int save;
        int i;
        int A032 = AnonymousClass0fD.A03(-35733133);
        super.draw(canvas);
        if (this.A02 == null) {
            i = 612983937;
        } else {
            boolean z = false;
            if (this.A00 == 0.0f && this.A01 == 0.0f && getPaddingTop() == 0 && getPaddingLeft() == 0) {
                save = 0;
            } else {
                save = canvas.save();
                canvas.translate(this.A00, this.A01);
                canvas.translate((float) getPaddingLeft(), (float) getPaddingTop());
                z = true;
            }
            C300985yH[] onPrePostDrawableSpans = getOnPrePostDrawableSpans();
            int length = onPrePostDrawableSpans.length;
            if (length == 0) {
                A03(canvas, this);
            } else {
                C20881X2i wk5 = new WK5(this);
                Spanned spanned = (Spanned) this.A03;
                while (true) {
                    length--;
                    C20881X2i x2i = wk5;
                    if (length < 0) {
                        break;
                    }
                    C300985yH r0 = onPrePostDrawableSpans[length];
                    spanned.getSpanStart(r0);
                    spanned.getSpanEnd(r0);
                    wk5 = new WK6(x2i, r0, this);
                }
                wk5.AQG(canvas);
            }
            if (z) {
                canvas.restoreToCount(save);
            }
            i = -509071747;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final void onFocusChanged(boolean z, int i, Rect rect) {
        int A062 = AnonymousClass0fD.A06(-510871704);
        super.onFocusChanged(z, i, rect);
        C299145ue r1 = this.A0H;
        if (r1 != null && this.A06.length > 0) {
            r1.A0j(z, i, rect);
        }
        AnonymousClass0fD.A0D(1223856925, A062);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        boolean onTouchEvent;
        int i;
        ClickableSpan[] clickableSpanArr;
        ClickableSpan clickableSpan;
        int A052 = AnonymousClass0fD.A05(-1766223610);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            A02(0, 0);
            onTouchEvent = false;
            i = -819567802;
        } else {
            int A002 = A00(this, (int) motionEvent.getX(), (int) motionEvent.getY());
            CharSequence charSequence = this.A03;
            if (!(charSequence instanceof Spanned) || A002 < 0 || (clickableSpanArr = (ClickableSpan[]) ((Spanned) charSequence).getSpans(A002, A002, ClickableSpan.class)) == null || clickableSpanArr.length <= 0 || (clickableSpan = clickableSpanArr[0]) == null) {
                A02(0, 0);
                onTouchEvent = super.onTouchEvent(motionEvent);
                i = 1041940516;
            } else {
                onTouchEvent = true;
                if (actionMasked == 1) {
                    A02(0, 0);
                    clickableSpan.onClick(this);
                } else if (actionMasked == 0) {
                    setSelection(clickableSpan);
                }
                i = -418670402;
            }
        }
        AnonymousClass0fD.A0C(i, A052);
        return onTouchEvent;
    }

    public void setAccessibilityDelegate(View.AccessibilityDelegate accessibilityDelegate) {
        02Z A012;
        super.setAccessibilityDelegate(accessibilityDelegate);
        02Z r1 = this.A0H;
        if (r1 != null && !this.A05 && (A012 = 03v.A01(this)) != r1) {
            r1.A00 = A012;
            this.A05 = true;
            03v.A0B(this, r1);
            this.A05 = false;
        }
    }
}
