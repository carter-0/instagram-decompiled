package com.instagram.feed.widget;

import X.0lg;
import X.0nA;
import X.0qQ;
import X.1Pp;
import X.AnonymousClass00P;
import X.AnonymousClass05K;
import X.AnonymousClass0eM;
import X.AnonymousClass0eN;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass1Po;
import X.AnonymousClass9L2;
import X.C226642hc;
import X.C238293Bh;
import X.C240963Ni;
import X.C242463Uf;
import X.C242473Ug;
import X.C242493Ui;
import X.C242503Uj;
import X.C242523Ul;
import X.C247813gx;
import X.C247833gz;
import X.C247853h1;
import X.C71382cm;
import X.C71622eP;
import X.C74351PtR;
import X.SN3;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Deprecated;
import kotlin.ReplaceWith;

public final class IgProgressImageView extends FrameLayout {
    public ImageView.ScaleType A00;
    public C240963Ni A01;
    public IgImageView A02;
    public C242463Uf A03;
    public C74351PtR A04;
    public boolean A05;
    public boolean A06;
    public boolean A07;
    public float A08;
    public Integer A09;
    public String A0A;
    public boolean A0B;
    public final SparseArray A0C = new SparseArray();
    public final SparseArray A0D = new SparseArray();
    public final 1Pp A0E;
    public final AnonymousClass0eM A0F;
    public final AnonymousClass0eM A0G;
    public final AnonymousClass0eM A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgProgressImageView(Context context) {
        super(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
        1Pp r0 = AnonymousClass1Po.A00;
        0qQ.A07(r0);
        this.A0E = r0;
        this.A0G = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 33));
        this.A0H = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 34));
        this.A0F = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 32));
        this.A0B = true;
        this.A09 = AnonymousClass05K.A00;
        this.A03 = C242463Uf.RETRY_TEXT;
        this.A08 = 1.0f;
        A01((AttributeSet) null);
    }

    public static /* synthetic */ void setUrlWithFallback$default(IgProgressImageView igProgressImageView, 0lg r7, ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass0iw r10, boolean z, int i, Object obj) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = true;
        }
        igProgressImageView.A07(r10, r7, imageUrl, imageUrl2, z2);
    }

    @Deprecated(message = "Use reset(resetListeners = true) instead", replaceWith = @ReplaceWith(expression = "reset(resetListeners = true)", imports = {}))
    public final void A04() {
        A0B(false);
    }

    public final void A07(AnonymousClass0iw r9, 0lg r10, ImageUrl imageUrl, ImageUrl imageUrl2, boolean z) {
        0qQ.A0B(imageUrl, 1);
        0qQ.A0B(imageUrl2, 2);
        0qQ.A0B(r9, 3);
        1Pp r1 = this.A0E;
        r1.A02(this, C238293Bh.Unset);
        r1.A02(this, C238293Bh.LoadingData);
        this.A07 = false;
        A02(this, AnonymousClass05K.A01);
        C247853h1 r6 = new C247853h1(this);
        IgImageView igImageView = getIgImageView();
        igImageView.A0C(r9, r10, imageUrl, imageUrl2, r6, z);
    }

    public final void A09(AnonymousClass0iw r2, ImageUrl imageUrl, boolean z) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r2, 1);
        A08(r2, (0lg) null, imageUrl, z);
    }

    public final void setAspectRatio(float f) {
        if (f > 0.0f) {
            this.A08 = f;
            return;
        }
        throw new IllegalStateException("Aspect ratio must be greater than 0");
    }

    public final void setBitmapAndImageRenderer(Bitmap bitmap, C226642hc r3) {
        0qQ.A0B(bitmap, 0);
        getIgImageView().setBitmapAndImageRenderer(bitmap, r3);
        A02(this, AnonymousClass05K.A0N);
    }

    public final void setErrorMode(C242463Uf r2) {
        0qQ.A0B(r2, 0);
        this.A03 = r2;
    }

    public final void setImageBitmap(Bitmap bitmap) {
        0qQ.A0B(bitmap, 0);
        getIgImageView().setImageBitmap(bitmap);
        A02(this, AnonymousClass05K.A0N);
    }

    public final void setIndeterminateProgressBarDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        getProgressBar().setIndeterminateDrawable(drawable);
    }

    public final void setOnFallbackListener(C240963Ni r2) {
        0qQ.A0B(r2, 0);
        this.A01 = r2;
    }

    public final void setPlaceHolderColor(ColorDrawable colorDrawable) {
        0qQ.A0B(colorDrawable, 0);
        getIgImageView().setPlaceHolderColor(colorDrawable);
    }

    public final void setProgressBarDrawable(Drawable drawable) {
        0qQ.A0B(drawable, 0);
        getProgressBar().setProgressDrawable(drawable);
    }

    public final void setProgressiveImageConfig(C247833gz r2) {
        0qQ.A0B(r2, 0);
        getIgImageView().A0A = r2;
    }

    public final void setScaleType(ImageView.ScaleType scaleType) {
        0qQ.A0B(scaleType, 0);
        getIgImageView().setScaleType(scaleType);
    }

    public final void setTrackedBitmap(Bitmap bitmap, ImageUrl imageUrl, String str, int i, AnonymousClass0iw r11) {
        0qQ.A0B(bitmap, 0);
        0qQ.A0B(imageUrl, 1);
        0qQ.A0B(str, 2);
        0qQ.A0B(r11, 4);
        getIgImageView().setPrefetchedBitmap(bitmap, imageUrl, str, i, r11);
        A02(this, AnonymousClass05K.A0N);
    }

    public final void setUrl(0lg r2, ImageUrl imageUrl, AnonymousClass0iw r4) {
        0qQ.A0B(imageUrl, 1);
        0qQ.A0B(r4, 2);
        A08(r4, r2, imageUrl, false);
    }

    public final void setUrlWithFallback(ImageUrl imageUrl, ImageUrl imageUrl2, AnonymousClass0iw r9) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(imageUrl2, 1);
        0qQ.A0B(r9, 2);
        A07(r9, (0lg) null, imageUrl, imageUrl2, true);
    }

    public static final void A02(IgProgressImageView igProgressImageView, Integer num) {
        if (igProgressImageView.A09 != num) {
            igProgressImageView.A09 = num;
            ProgressBar progressBar = igProgressImageView.getProgressBar();
            int i = 0;
            if (igProgressImageView.A09 != AnonymousClass05K.A01 || !igProgressImageView.A0B) {
                i = 8;
            }
            progressBar.setVisibility(i);
            igProgressImageView.A03();
            C74351PtR ptR = igProgressImageView.A04;
            if (ptR != null) {
                ptR.Dmr(num);
            }
        }
    }

    private final ColorFilterAlphaImageView getErrorRetryImageView() {
        return (ColorFilterAlphaImageView) this.A0F.getValue();
    }

    /* access modifiers changed from: private */
    public final ProgressBar getProgressBar() {
        return (ProgressBar) this.A0G.getValue();
    }

    private final TextView getTextView() {
        return (TextView) this.A0H.getValue();
    }

    private final C238293Bh getUIContentState() {
        int intValue = this.A09.intValue();
        if (intValue == 1 || intValue == 2) {
            return C238293Bh.LoadingData;
        }
        if (intValue == 3) {
            return C238293Bh.ShowingData;
        }
        if (intValue == 4) {
            return C238293Bh.FailedToLoad;
        }
        if (intValue == 0) {
            return C238293Bh.Unset;
        }
        throw new RuntimeException();
    }

    public final void A06(int i) {
        this.A0C.delete(i);
    }

    public final void A08(AnonymousClass0iw r3, 0lg r4, ImageUrl imageUrl, boolean z) {
        1Pp r1 = this.A0E;
        r1.A02(this, C238293Bh.Unset);
        r1.A02(this, C238293Bh.LoadingData);
        A02(this, AnonymousClass05K.A01);
        getIgImageView().A0D(r3, r4, imageUrl, z);
    }

    public final void A0A(C247813gx r2, int i) {
        this.A0C.put(i, r2);
    }

    public final void A0B(boolean z) {
        this.A0E.A02(this, C238293Bh.Unset);
        this.A07 = false;
        A02(this, AnonymousClass05K.A01);
        getProgressBar().setProgress(0);
        if (z) {
            this.A01 = null;
            this.A0C.clear();
        }
        getIgImageView().A09();
    }

    public final IgImageView getIgImageView() {
        IgImageView igImageView = this.A02;
        if (igImageView != null) {
            return igImageView;
        }
        0qQ.A0F("igImageView");
        throw AnonymousClass00P.createAndThrow();
    }

    public final C74351PtR getOnImageStateChangedListener() {
        return this.A04;
    }

    public final void onMeasure(int i, int i2) {
        View textView;
        if (this.A06) {
            int size = View.MeasureSpec.getSize(i);
            int i3 = (int) (((float) size) / this.A08);
            int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i3, SN3.MAX_SIGNED_POWER_OF_TWO);
            getIgImageView().measure(i, makeMeasureSpec);
            ProgressBar progressBar = getProgressBar();
            Context context = getContext();
            0qQ.A07(context);
            progressBar.measure(i, (int) 0nA.A04(context, 10));
            if (this.A03 == C242463Uf.RETRY_ICON) {
                textView = getErrorRetryImageView();
            } else {
                textView = getTextView();
            }
            textView.measure(i, makeMeasureSpec);
            setMeasuredDimension(size, i3);
            return;
        }
        super.onMeasure(i, i2);
    }

    public final void setEnableProgressBar(boolean z) {
        this.A0B = z;
        ProgressBar progressBar = getProgressBar();
        int i = 0;
        if (this.A09 != AnonymousClass05K.A01 || !z) {
            i = 8;
        }
        progressBar.setVisibility(i);
    }

    private final void A01(AttributeSet attributeSet) {
        IgImageView igImageView;
        View textView;
        removeAllViews();
        Context context = getContext();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A1E);
        0qQ.A07(obtainStyledAttributes);
        this.A0A = C71622eP.A00(context, obtainStyledAttributes, 6);
        this.A05 = obtainStyledAttributes.getBoolean(2, false);
        this.A06 = obtainStyledAttributes.getBoolean(3, false);
        this.A00 = ImageView.ScaleType.values()[obtainStyledAttributes.getInt(0, ImageView.ScaleType.FIT_XY.ordinal())];
        this.A03 = C242463Uf.values()[obtainStyledAttributes.getInt(7, 0)];
        if (this.A05) {
            igImageView = new CircularImageView(context, (AttributeSet) null, 0);
        } else {
            igImageView = new IgImageView(context);
            igImageView.setScaleType(this.A00);
        }
        this.A02 = igImageView;
        getIgImageView().A0G = new C242473Ug(this);
        getIgImageView().A0P = true;
        getIgImageView().A0E = new C242493Ui(this);
        getIgImageView().setProgressiveImageListener(new C242503Uj(this));
        getIgImageView().setMiniPreviewLoadListener(new C242523Ul(this));
        getIgImageView().setAdjustViewBounds(obtainStyledAttributes.getBoolean(1, false));
        getIgImageView().setMaxWidth(obtainStyledAttributes.getDimensionPixelSize(5, getIgImageView().getMaxWidth()));
        getIgImageView().setMaxHeight(obtainStyledAttributes.getDimensionPixelSize(4, getIgImageView().getMaxHeight()));
        obtainStyledAttributes.recycle();
        int i = -1;
        addView(getIgImageView(), new FrameLayout.LayoutParams(-1, -1, 17));
        addView(getProgressBar(), new FrameLayout.LayoutParams(-1, -1, 17));
        C242463Uf r1 = this.A03;
        if (r1 == C242463Uf.RETRY_ICON) {
            i = (int) getErrorRetryImageView().getResources().getDimension(R.dimen.ad_not_delivering_thumbnail_height);
            textView = getErrorRetryImageView();
        } else {
            if (r1 == C242463Uf.RETRY_TEXT) {
                textView = getTextView();
            }
            A02(this, AnonymousClass05K.A01);
            this.A07 = false;
        }
        addView(textView, new FrameLayout.LayoutParams(i, i, 17));
        A02(this, AnonymousClass05K.A01);
        this.A07 = false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r6.A0B == false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A03() {
        /*
            r6 = this;
            android.widget.ProgressBar r5 = r6.getProgressBar()
            java.lang.Integer r1 = r6.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A01
            r4 = 1
            r3 = 0
            if (r1 != r0) goto L_0x0011
            boolean r0 = r6.A0B
            r1 = 1
            if (r0 != 0) goto L_0x0012
        L_0x0011:
            r1 = 0
        L_0x0012:
            r2 = 8
            r0 = 8
            if (r1 == 0) goto L_0x0019
            r0 = 0
        L_0x0019:
            r5.setVisibility(r0)
            X.3Uf r0 = r6.A03
            int r1 = r0.ordinal()
            if (r1 == r4) goto L_0x003e
            if (r1 == r3) goto L_0x0043
            r0 = 2
            if (r1 != r0) goto L_0x0038
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r0 = r6.getErrorRetryImageView()
            r0.setVisibility(r2)
            android.widget.TextView r0 = r6.getTextView()
            r0.setVisibility(r2)
            return
        L_0x0038:
            X.Wub r0 = new X.Wub
            r0.<init>()
            throw r0
        L_0x003e:
            com.instagram.common.ui.colorfilter.ColorFilterAlphaImageView r2 = r6.getErrorRetryImageView()
            goto L_0x0047
        L_0x0043:
            android.widget.TextView r2 = r6.getTextView()
        L_0x0047:
            android.view.View r2 = (android.view.View) r2
            java.lang.Integer r1 = r6.A09
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 == r0) goto L_0x0051
            r3 = 8
        L_0x0051:
            r2.setVisibility(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.instagram.feed.widget.IgProgressImageView.A03():void");
    }

    public final void A05() {
        getTextView().setText(2131975846);
    }

    public final AtomicInteger getCurrentScans() {
        return getIgImageView().A0a;
    }

    public final Drawable getImageDrawable() {
        return getIgImageView().getDrawable();
    }

    public final C226642hc getPostProcessor() {
        return getIgImageView().A0I;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(-144968289);
        super.onAttachedToWindow();
        1Pp r1 = this.A0E;
        r1.A03(this, this.A0A);
        r1.A02(this, getUIContentState());
        AnonymousClass0fD.A0D(275576131, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(-1485281054);
        super.onDetachedFromWindow();
        this.A0E.A01(this);
        AnonymousClass0fD.A0D(-1860593333, A062);
    }

    public final void setAdjustViewBounds(boolean z) {
        getIgImageView().setAdjustViewBounds(z);
    }

    public final void setExpiration(long j) {
        getIgImageView().A05 = j;
    }

    public final void setImageDrawable(Drawable drawable) {
        getIgImageView().setImageDrawable(drawable);
    }

    public final void setMiniPreviewBlurRadius(int i) {
        getIgImageView().A04 = i;
    }

    public final void setMiniPreviewPayload(String str) {
        getIgImageView().A0K = str;
    }

    public final void setPostProcessor(C226642hc r2) {
        getIgImageView().A0I = r2;
    }

    public final void setProgressBarGravity(int i) {
        ProgressBar progressBar = getProgressBar();
        ViewGroup.LayoutParams layoutParams = getProgressBar().getLayoutParams();
        0qQ.A0C(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = i;
        progressBar.setLayoutParams(layoutParams2);
    }

    public final void setProgressBarIndeterminate(boolean z) {
        getProgressBar().setIndeterminate(z);
    }

    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
    }

    public final void setFitAspectRatio(boolean z) {
        this.A06 = z;
    }

    public final void setOnImageStateChangedListener(C74351PtR ptR) {
        this.A04 = ptR;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgProgressImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        1Pp r0 = AnonymousClass1Po.A00;
        0qQ.A07(r0);
        this.A0E = r0;
        this.A0G = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 33));
        this.A0H = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 34));
        this.A0F = AnonymousClass0eN.A01(new AnonymousClass9L2(this, 32));
        this.A0B = true;
        this.A09 = AnonymousClass05K.A00;
        this.A03 = C242463Uf.RETRY_TEXT;
        this.A08 = 1.0f;
        A01(attributeSet);
    }

    public final void setPlaceHolderColor(int i) {
        getIgImageView().setPlaceHolderColor(i);
    }

    public final void setUrl(ImageUrl imageUrl, AnonymousClass0iw r3) {
        0qQ.A0B(imageUrl, 0);
        0qQ.A0B(r3, 1);
        setUrl((0lg) null, imageUrl, r3);
    }
}
