package com.instagram.igds.components.imagebutton;

import X.00p;
import X.0nA;
import X.0qQ;
import X.2Yu;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass9L3;
import X.C244303ay;
import X.C295195nk;
import X.C295225nn;
import X.C295285nt;
import X.C295295nu;
import X.C321546uM;
import X.C321556uN;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public class IgImageButton extends ConstrainedImageView implements Drawable.Callback {
    public Drawable A00;
    public C321556uN A01;
    public String A02;
    public String A03;
    public int A04;
    public int A05;
    public int A06;
    public int A07;
    public Drawable A08;
    public Drawable A09;
    public C295225nn A0A;
    public C295225nn A0B;
    public C321546uM A0C;
    public C321546uM A0D;
    public boolean A0E;
    public final C295195nk A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;
    public final AnonymousClass0eM A0I;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgImageButton(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public static /* synthetic */ void setIconDrawable$default(IgImageButton igImageButton, Drawable drawable, C295225nn r11, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i9 = -1;
            }
            if ((i5 & 8) != 0) {
                i8 = -1;
            }
            if ((i5 & 16) != 0) {
                i7 = -1;
            }
            if ((i5 & 32) != 0) {
                i6 = -1;
            }
            0qQ.A0B(drawable, 0);
            0qQ.A0B(r11, 1);
            A05(drawable, r11, (C321546uM) null, igImageButton, i8, i7, i9, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconDrawable");
    }

    public static /* synthetic */ void setIconDrawableInternal$default(IgImageButton igImageButton, C321546uM r9, Drawable drawable, C295225nn r11, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if (obj == null) {
            if ((i5 & 8) != 0) {
                i9 = -1;
            }
            if ((i5 & 16) != 0) {
                i8 = -1;
            }
            if ((i5 & 32) != 0) {
                i7 = -1;
            }
            if ((i5 & 64) != 0) {
                i6 = -1;
            }
            Drawable drawable2 = drawable;
            C295225nn r1 = r11;
            A05(drawable2, r1, r9, igImageButton, i9, i8, i7, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setIconDrawableInternal");
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ void setIconDrawableResource$default(com.instagram.igds.components.imagebutton.IgImageButton r8, int r9, X.C295225nn r10, int r11, int r12, int r13, int r14, int r15, java.lang.Object r16) {
        /*
            r7 = r14
            r5 = r13
            r4 = r12
            r6 = r11
            if (r16 != 0) goto L_0x002f
            r0 = r15 & 4
            if (r0 == 0) goto L_0x000b
            r6 = -1
        L_0x000b:
            r0 = r15 & 8
            if (r0 == 0) goto L_0x0010
            r4 = -1
        L_0x0010:
            r0 = r15 & 16
            if (r0 == 0) goto L_0x0015
            r5 = -1
        L_0x0015:
            r0 = r15 & 32
            if (r0 == 0) goto L_0x001a
            r7 = -1
        L_0x001a:
            r0 = 1
            r1 = r10
            X.0qQ.A0B(r10, r0)
            r3 = r8
            android.content.Context r0 = r8.getContext()
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r9)
            if (r0 == 0) goto L_0x002e
            r2 = 0
            A05(r0, r1, r2, r3, r4, r5, r6, r7)
        L_0x002e:
            return
        L_0x002f:
            java.lang.String r1 = "Super calls with default arguments not supported in this target, function: setIconDrawableResource"
            java.lang.UnsupportedOperationException r0 = new java.lang.UnsupportedOperationException
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.imagebutton.IgImageButton.setIconDrawableResource$default(com.instagram.igds.components.imagebutton.IgImageButton, int, X.5nn, int, int, int, int, int, java.lang.Object):void");
    }

    public static /* synthetic */ void setSecondaryIconDrawable$default(IgImageButton igImageButton, Drawable drawable, C295225nn r11, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if (obj == null) {
            if ((i5 & 4) != 0) {
                i9 = -1;
            }
            if ((i5 & 8) != 0) {
                i8 = -1;
            }
            if ((i5 & 16) != 0) {
                i7 = -1;
            }
            if ((i5 & 32) != 0) {
                i6 = -1;
            }
            0qQ.A0B(drawable, 0);
            0qQ.A0B(r11, 1);
            A06(drawable, r11, (C321546uM) null, igImageButton, i8, i7, i9, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSecondaryIconDrawable");
    }

    public static /* synthetic */ void setSecondaryIconDrawableInternal$default(IgImageButton igImageButton, C321546uM r9, Drawable drawable, C295225nn r11, int i, int i2, int i3, int i4, int i5, Object obj) {
        int i6 = i4;
        int i7 = i3;
        int i8 = i2;
        int i9 = i;
        if (obj == null) {
            if ((i5 & 8) != 0) {
                i9 = -1;
            }
            if ((i5 & 16) != 0) {
                i8 = -1;
            }
            if ((i5 & 32) != 0) {
                i7 = -1;
            }
            if ((i5 & 64) != 0) {
                i6 = -1;
            }
            Drawable drawable2 = drawable;
            C295225nn r1 = r11;
            A06(drawable2, r1, r9, igImageButton, i9, i8, i7, i6);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: setSecondaryIconDrawableInternal");
    }

    /* JADX WARNING: type inference failed for: r9v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public void onDraw(Canvas canvas) {
        0qQ.A0B(canvas, 0);
        IgImageButton.super.onDraw(canvas);
        this.A0F.A00(canvas);
        C321556uN r0 = this.A01;
        if (r0 != null) {
            Context context = getContext();
            canvas.drawColor(context.getColor(2Yu.A0H(context, r0.A00)));
        }
        C321556uN r1 = this.A01;
        if (r1 != null && r1 == C321556uN.DELETED_STORY_WARNING) {
            canvas.drawColor(getContext().getColor(R.color.black));
        }
        if (this.A0E) {
            canvas.drawRect(getTopLegibilityRect(), getTopLegibilityGradientPaint());
        }
        Drawable drawable = this.A08;
        if (drawable != null) {
            drawable.draw(canvas);
        }
        Drawable drawable2 = this.A09;
        if (drawable2 != null) {
            drawable2.draw(canvas);
        }
        Context context2 = getContext();
        0qQ.A07(context2);
        int A042 = (int) 0nA.A04(context2, 8);
        int A043 = (int) 0nA.A04(context2, 14);
        Drawable drawable3 = this.A00;
        if (drawable3 != null) {
            float intrinsicWidth = ((float) drawable3.getIntrinsicWidth()) + ((float) (A042 * 2));
            String str = this.A03;
            if (str != null) {
                canvas.drawText(TextUtils.ellipsize(str, getTextPaint(), (((float) canvas.getWidth()) - intrinsicWidth) - ((float) A042), TextUtils.TruncateAt.END).toString(), intrinsicWidth, ((float) getHeight()) - ((float) A043), getTextPaint());
            }
            drawable3.draw(canvas);
        }
        float A044 = 0nA.A04(context2, 8);
        int A045 = (int) 0nA.A04(context2, 10);
        String str2 = this.A02;
        if (str2 != null) {
            canvas.drawText(TextUtils.ellipsize(str2, getTextPaint(), ((float) canvas.getWidth()) - A044, TextUtils.TruncateAt.END).toString(), A044, ((float) getHeight()) - ((float) A045), getTextPaint());
        }
        C321556uN r12 = this.A01;
        if (r12 != null && r12 == C321556uN.JUST_SEEN) {
            String string = context2.getString(2131964530);
            0qQ.A07(string);
            canvas.drawText(string, (((float) canvas.getWidth()) - getTextPaint().measureText(string)) / 2.0f, ((float) getHeight()) / 2.0f, getTextPaint());
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void setIcon(C321546uM r9) {
        Drawable drawable;
        C321546uM r2 = r9;
        0qQ.A0B(r9, 0);
        if (this.A0C != r9 && (drawable = getContext().getDrawable(r9.A03)) != null) {
            A05(drawable, r9.A05, r2, this, r9.A04, r9.A02, r9.A01, r9.A00);
        }
    }

    public final void setIconDrawable(Drawable drawable, C295225nn r11) {
        0qQ.A0B(drawable, 0);
        0qQ.A0B(r11, 1);
        A05(drawable, r11, (C321546uM) null, this, -1, -1, -1, -1);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void setSecondaryIcon(C321546uM r9) {
        Drawable drawable;
        C321546uM r2 = r9;
        0qQ.A0B(r9, 0);
        if (this.A0C != r9 && this.A0D != r9 && (drawable = getContext().getDrawable(r9.A03)) != null) {
            A06(drawable, r9.A05, r2, this, r9.A04, r9.A02, r9.A01, r9.A00);
        }
    }

    public final void setSecondaryIconDrawable(Drawable drawable, C295225nn r11) {
        0qQ.A0B(drawable, 0);
        0qQ.A0B(r11, 1);
        A06(drawable, r11, (C321546uM) null, this, -1, -1, -1, -1);
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [android.graphics.drawable.Drawable$Callback, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void setUserInfo(ImageUrl imageUrl, String str) {
        ImageUrl imageUrl2 = imageUrl;
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(str, 1);
        String str2 = this.A03;
        if (str2 == null || !str2.equals(str)) {
            Context context = getContext();
            0qQ.A07(context);
            C244303ay r1 = new C244303ay(imageUrl2, "ig_image_button", (int) 0nA.A04(context, 20), 0, 0, context.getColor(R.color.fds_transparent));
            r1.setCallback(this);
            setUserInfoInternal(r1, str);
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A05(android.graphics.drawable.Drawable r4, X.C295225nn r5, X.C321546uM r6, com.instagram.igds.components.imagebutton.IgImageButton r7, int r8, int r9, int r10, int r11) {
        /*
            r7.A0C = r6
            r7.A08 = r4
            r3 = -1
            if (r10 == r3) goto L_0x001d
            if (r4 == 0) goto L_0x000c
            r4.mutate()
        L_0x000c:
            android.graphics.drawable.Drawable r2 = r7.A08
            if (r2 == 0) goto L_0x001d
            android.content.Context r0 = r7.getContext()
            int r1 = r0.getColor(r10)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r1, r0)
        L_0x001d:
            if (r11 == r3) goto L_0x002d
            android.graphics.drawable.Drawable r0 = r7.A08
            if (r0 == 0) goto L_0x0026
            r0.mutate()
        L_0x0026:
            android.graphics.drawable.Drawable r0 = r7.A08
            if (r0 == 0) goto L_0x002d
            r0.setAlpha(r11)
        L_0x002d:
            r0 = r5
            r7.A0A = r5
            r2 = r8
            r7.A05 = r8
            r3 = r9
            r7.A04 = r9
            android.graphics.drawable.Drawable r1 = r7.A08
            if (r1 == 0) goto L_0x0045
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r0.A00(r1, r2, r3, r4, r5)
        L_0x0045:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.imagebutton.IgImageButton.A05(android.graphics.drawable.Drawable, X.5nn, X.6uM, com.instagram.igds.components.imagebutton.IgImageButton, int, int, int, int):void");
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void A06(android.graphics.drawable.Drawable r4, X.C295225nn r5, X.C321546uM r6, com.instagram.igds.components.imagebutton.IgImageButton r7, int r8, int r9, int r10, int r11) {
        /*
            r7.A0D = r6
            r7.A09 = r4
            r3 = -1
            if (r10 == r3) goto L_0x001d
            if (r4 == 0) goto L_0x000c
            r4.mutate()
        L_0x000c:
            android.graphics.drawable.Drawable r2 = r7.A09
            if (r2 == 0) goto L_0x001d
            android.content.Context r0 = r7.getContext()
            int r1 = r0.getColor(r10)
            android.graphics.PorterDuff$Mode r0 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r2.setColorFilter(r1, r0)
        L_0x001d:
            if (r11 == r3) goto L_0x002d
            android.graphics.drawable.Drawable r0 = r7.A09
            if (r0 == 0) goto L_0x0026
            r0.mutate()
        L_0x0026:
            android.graphics.drawable.Drawable r0 = r7.A09
            if (r0 == 0) goto L_0x002d
            r0.setAlpha(r11)
        L_0x002d:
            r0 = r5
            r7.A0B = r5
            r2 = r8
            r7.A07 = r8
            r3 = r9
            r7.A06 = r9
            android.graphics.drawable.Drawable r1 = r7.A09
            if (r1 == 0) goto L_0x0045
            int r4 = r7.getWidth()
            int r5 = r7.getHeight()
            r0.A00(r1, r2, r3, r4, r5)
        L_0x0045:
            r7.invalidate()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.imagebutton.IgImageButton.A06(android.graphics.drawable.Drawable, X.5nn, X.6uM, com.instagram.igds.components.imagebutton.IgImageButton, int, int, int, int):void");
    }

    private final Paint getTopLegibilityGradientPaint() {
        return (Paint) this.A0H.getValue();
    }

    private final Rect getTopLegibilityRect() {
        return (Rect) this.A0I.getValue();
    }

    public final void A0H() {
        A05((Drawable) null, C295225nn.A06, (C321546uM) null, this, -1, -1, -1, -1);
    }

    public final boolean getShouldDrawLegibilityBackground() {
        return this.A0E;
    }

    public final TextPaint getTextPaint() {
        return (TextPaint) this.A0G.getValue();
    }

    public final void setEnableTouchOverlay(boolean z) {
        this.A0F.A00 = z;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void setHighlightName(String str) {
        this.A02 = str;
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void setMediaOverlay(C321556uN r1) {
        this.A01 = r1;
        invalidate();
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void setUserInfoInternal(C244303ay r3, String str) {
        if (!00p.A0j(this.A03, str, false)) {
            this.A00 = r3;
            this.A03 = str;
            getWidth();
            A04(getHeight());
            invalidate();
        }
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    private final void A04(int i) {
        Context context = getContext();
        0qQ.A07(context);
        int A042 = (int) 0nA.A04(context, 8);
        int A043 = (int) 0nA.A04(context, 8);
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setBounds(A042, (i - drawable.getIntrinsicHeight()) - A043, drawable.getIntrinsicWidth() + A042, i - A043);
        }
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [android.view.View, com.instagram.igds.components.imagebutton.IgImageButton] */
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A062 = AnonymousClass0fD.A06(-531236997);
        int i5 = i;
        int i6 = i2;
        IgImageButton.super.onSizeChanged(i5, i6, i3, i4);
        Drawable drawable = this.A08;
        if (drawable != null) {
            C295225nn r14 = this.A0A;
            int i7 = this.A05;
            int i8 = i7;
            r14.A00(drawable, i8, this.A04, i5, i6);
            getTopLegibilityGradientPaint().setShader(new LinearGradient(((float) getWidth()) / 2.0f, 0.0f, ((float) getWidth()) / 2.0f, (float) drawable.getIntrinsicHeight(), new int[]{getContext().getColor(R.color.black_50_transparent), 0}, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
            getTopLegibilityRect().set(0, 0, getWidth(), drawable.getIntrinsicHeight());
        }
        Drawable drawable2 = this.A09;
        if (drawable2 != null) {
            this.A0B.A00(drawable2, this.A07, this.A06, i5, i6);
        }
        A04(i6);
        AnonymousClass0fD.A0D(-1156262012, A062);
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001f, code lost:
        if (r0 != false) goto L_0x0021;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean onTouchEvent(android.view.MotionEvent r4) {
        /*
            r3 = this;
            r0 = -1722906845(0xffffffff994e8723, float:-1.0677241E-23)
            int r2 = X.AnonymousClass0fD.A05(r0)
            r0 = 0
            X.0qQ.A0B(r4, r0)
            X.5nk r1 = r3.A0F
            boolean r0 = r1.A00
            if (r0 == 0) goto L_0x0016
            X.5nl r0 = r1.A02
            r0.A02(r4)
        L_0x0016:
            boolean r0 = com.instagram.igds.components.imagebutton.IgImageButton.super.onTouchEvent(r4)
            if (r0 != 0) goto L_0x0021
            boolean r0 = r1.A00
            r1 = 0
            if (r0 == 0) goto L_0x0022
        L_0x0021:
            r1 = 1
        L_0x0022:
            r0 = 1126293271(0x4321df17, float:161.87144)
            X.AnonymousClass0fD.A0C(r0, r2)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.igds.components.imagebutton.IgImageButton.onTouchEvent(android.view.MotionEvent):boolean");
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    public final void invalidateDrawable(Drawable drawable) {
        invalidate();
    }

    public final void setShouldDrawLegibilityBackground(boolean z) {
        this.A0E = z;
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, android.widget.ImageView, com.instagram.igds.components.imagebutton.IgImageButton, android.view.View] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgImageButton(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        C295195nk r3 = new C295195nk(this);
        this.A0F = r3;
        this.A0A = C295225nn.A06;
        this.A05 = -1;
        this.A04 = -1;
        this.A0B = C295225nn.A05;
        this.A07 = -1;
        this.A06 = -1;
        this.A0H = AnonymousClass0eN.A01(C295285nt.A00);
        this.A0I = AnonymousClass0eN.A01(C295295nu.A00);
        this.A0G = AnonymousClass0eN.A01(new AnonymousClass9L3(context, 10));
        setAdjustViewBounds(false);
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        setPlaceHolderColor(context.getColor(2Yu.A0H(context, R.attr.igds_color_highlight_background)));
        r3.A00 = true;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ IgImageButton(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgImageButton(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
