package com.instagram.clips.animatedthumbnail;

import X.00k;
import X.0eP;
import X.0qQ;
import X.0wb;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.C297585s0;
import X.C64200LTm;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.animation.LinearInterpolator;
import android.widget.ImageView;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.igds.components.imagebutton.IgImageButton;
import com.instagram.model.mediasize.SpritesheetInfo;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class AnimatedThumbnailView extends IgImageButton {
    public int A00;
    public float A01;
    public float A02;
    public float A03;
    public int A04;
    public int A05;
    public int A06;
    public ValueAnimator A07;
    public SpritesheetInfo A08;
    public ArrayList A09;
    public boolean A0A;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public AnimatedThumbnailView(Context context) {
        this(context, (AttributeSet) null);
        0qQ.A0B(context, 1);
    }

    public static /* synthetic */ void setSpriteSheetInfo$default(AnimatedThumbnailView animatedThumbnailView, SpritesheetInfo spritesheetInfo, AnonymousClass0iw r10, double d, long j, boolean z, int i, Object obj) {
        boolean z2 = z;
        if ((i & 16) != 0) {
            z2 = false;
        }
        animatedThumbnailView.A0I(r10, spritesheetInfo, d, j, z2);
    }

    public final void A0I(AnonymousClass0iw r2, SpritesheetInfo spritesheetInfo, double d, long j, boolean z) {
        0qQ.A0B(spritesheetInfo, 0);
        0qQ.A0B(r2, 1);
        this.A08 = spritesheetInfo;
        this.A01 = (float) d;
        this.A05 = (int) j;
        this.A0A = z;
        Integer C79 = spritesheetInfo.C79();
        if (C79 != null) {
            this.A04 = C79.intValue();
            ImageUrl spriteImageUrl = getSpriteImageUrl();
            if (spriteImageUrl != null) {
                setUrl(spriteImageUrl, r2);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [com.instagram.clips.animatedthumbnail.AnimatedThumbnailView, android.view.View, com.instagram.igds.components.imagebutton.IgImageButton] */
    public final void onDraw(Canvas canvas) {
        SpritesheetInfo spritesheetInfo;
        Integer ByU;
        Integer ByS;
        0qQ.A0B(canvas, 0);
        if (this.A06 > 0 && getHeight() > 0 && this.A09.size() > this.A00 && (spritesheetInfo = this.A08) != null && (ByU = spritesheetInfo.ByU()) != null) {
            int intValue = ByU.intValue();
            SpritesheetInfo spritesheetInfo2 = this.A08;
            if (spritesheetInfo2 != null && (ByS = spritesheetInfo2.ByS()) != null) {
                if (intValue > ByS.intValue()) {
                    float height = this.A02 * ((float) getHeight());
                    float height2 = (float) (getHeight() / this.A06);
                    float f = height / ((float) this.A04);
                    Object obj = this.A09.get(this.A00);
                    0qQ.A07(obj);
                    0eP r1 = (0eP) obj;
                    float floatValue = ((Number) r1.A00).floatValue() * f;
                    canvas.save();
                    float f2 = this.A03;
                    canvas.scale(f2, f2);
                    canvas.translate(floatValue + ((height - ((float) getWidth())) / 2.0f), (((Number) r1.A01).floatValue() * height2) + 0.0f);
                    super.onDraw(canvas);
                    canvas.restore();
                    return;
                }
                0wb.A03("AnimatedThumbnailView", "sprite sheet dimension is not supported");
            }
        }
    }

    /* JADX WARNING: type inference failed for: r1v3, types: [java.lang.Object, X.0rk] */
    public static final void A01(AnimatedThumbnailView animatedThumbnailView) {
        Float C6u;
        ValueAnimator valueAnimator = animatedThumbnailView.A07;
        int i = 1;
        if (valueAnimator == null || !valueAnimator.isRunning()) {
            ValueAnimator valueAnimator2 = animatedThumbnailView.A07;
            if (valueAnimator2 == null || !valueAnimator2.isStarted()) {
                int totalAnimationFrames = animatedThumbnailView.getTotalAnimationFrames();
                if (animatedThumbnailView.getTotalAnimationFrames() > 0) {
                    float f = animatedThumbnailView.A01;
                    if (f == 0.0f) {
                        SpritesheetInfo spritesheetInfo = animatedThumbnailView.A08;
                        if (spritesheetInfo == null || (C6u = spritesheetInfo.C6u()) == null) {
                            f = 0.0f;
                        } else {
                            f = C6u.floatValue() * ((float) totalAnimationFrames);
                        }
                    }
                    ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, totalAnimationFrames - 1});
                    if (ofInt != null) {
                        ofInt.setInterpolator(new LinearInterpolator());
                        ofInt.setDuration((long) (f * 1000.0f));
                        if (!animatedThumbnailView.A0A) {
                            i = 2;
                        }
                        ofInt.setRepeatMode(i);
                        ofInt.setRepeatCount(-1);
                        ofInt.addUpdateListener(new C64200LTm(animatedThumbnailView, new Object()));
                        ofInt.start();
                    } else {
                        ofInt = null;
                    }
                    animatedThumbnailView.A07 = ofInt;
                }
            }
        }
    }

    private final ArrayList getListOfCoordinates() {
        ArrayList arrayList = new ArrayList();
        int i = this.A06;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = this.A04;
            for (int i4 = 0; i4 < i3; i4++) {
                arrayList.add(new 0eP(Integer.valueOf(-i4), Integer.valueOf(-i2)));
            }
        }
        return arrayList;
    }

    private final ImageUrl getSpriteImageUrl() {
        List ByT;
        ImageUrl imageUrl;
        SpritesheetInfo spritesheetInfo = this.A08;
        if (spritesheetInfo == null || (ByT = spritesheetInfo.ByT()) == null || (imageUrl = (ImageUrl) 00k.A0O(ByT, 0)) == null) {
            return null;
        }
        return new SimpleImageUrl(imageUrl);
    }

    private final int getTotalAnimationFrames() {
        int i;
        Integer BPQ;
        Integer C8r;
        SpritesheetInfo spritesheetInfo = this.A08;
        int i2 = 0;
        if (spritesheetInfo == null || (C8r = spritesheetInfo.C8r()) == null) {
            i = 0;
        } else {
            i = C8r.intValue();
        }
        SpritesheetInfo spritesheetInfo2 = this.A08;
        if (!(spritesheetInfo2 == null || (BPQ = spritesheetInfo2.BPQ()) == null)) {
            i2 = BPQ.intValue();
        }
        int min = Math.min(i, i2);
        int i3 = this.A05;
        if (i3 != 0) {
            return Math.min(i3, min);
        }
        return min;
    }

    /* access modifiers changed from: private */
    public final void setUpThumbnailDimensions(Bitmap bitmap) {
        Integer ByU;
        Integer C6w;
        Integer C77;
        Integer ByS;
        SpritesheetInfo spritesheetInfo = this.A08;
        if (spritesheetInfo != null && (ByU = spritesheetInfo.ByU()) != null) {
            float intValue = ((float) ByU.intValue()) / ((float) bitmap.getWidth());
            SpritesheetInfo spritesheetInfo2 = this.A08;
            if (spritesheetInfo2 != null && (C6w = spritesheetInfo2.C6w()) != null) {
                int intValue2 = C6w.intValue();
                SpritesheetInfo spritesheetInfo3 = this.A08;
                if (spritesheetInfo3 != null && (C77 = spritesheetInfo3.C77()) != null) {
                    float width = ((float) bitmap.getWidth()) / (((float) C77.intValue()) / intValue);
                    float height = ((float) bitmap.getHeight()) / (((float) intValue2) / intValue);
                    SpritesheetInfo spritesheetInfo4 = this.A08;
                    if (spritesheetInfo4 != null && (ByS = spritesheetInfo4.ByS()) != null) {
                        this.A06 = ByS.intValue() / intValue2;
                        this.A02 = ((float) bitmap.getWidth()) / ((float) bitmap.getHeight());
                        if (width > height) {
                            width = height;
                        }
                        this.A03 = width;
                        this.A09 = getListOfCoordinates();
                    }
                }
            }
        }
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(1257573375);
        AnimatedThumbnailView.super.onAttachedToWindow();
        if (this.A07 == null) {
            A01(this);
        }
        AnonymousClass0fD.A0D(-2079346015, A062);
    }

    public final void onDetachedFromWindow() {
        int A062 = AnonymousClass0fD.A06(500263684);
        AnimatedThumbnailView.super.onDetachedFromWindow();
        ValueAnimator valueAnimator = this.A07;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.A07 = null;
        AnonymousClass0fD.A0D(2019929606, A062);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ AnimatedThumbnailView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.common.ui.widget.imageview.IgImageView, com.instagram.clips.animatedthumbnail.AnimatedThumbnailView, android.widget.ImageView] */
    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnimatedThumbnailView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        0qQ.A0B(context, 1);
        this.A03 = 1.0f;
        this.A09 = new ArrayList();
        this.A02 = 1.0f;
        setScaleType(ImageView.ScaleType.CENTER_CROP);
        this.A0I = new C297585s0(this);
    }
}
