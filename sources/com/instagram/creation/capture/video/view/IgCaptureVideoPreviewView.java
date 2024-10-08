package com.instagram.creation.capture.video.view;

import X.0qQ;
import X.AnonymousClass4M7;
import X.AnonymousClass514;
import X.C3499682q;
import X.C71382cm;
import X.JTT;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import com.instagram.common.ui.widget.videopreviewview.VideoPreviewView;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class IgCaptureVideoPreviewView extends VideoPreviewView {
    public float A00;
    public C3499682q A01;

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgCaptureVideoPreviewView(Context context) {
        this(context, (AttributeSet) null, 0);
        0qQ.A0B(context, 1);
    }

    public float getMaxFitAspectRatio() {
        return 1.91f;
    }

    public final C3499682q getCreationCameraSession() {
        return this.A01;
    }

    public final float getMinAspectRatio() {
        return this.A00;
    }

    public float getMinFitAspectRatio() {
        return this.A00;
    }

    public AnonymousClass4M7 getScaleType() {
        AnonymousClass514 r1;
        C3499682q r2 = this.A01;
        if (r2 != null) {
            r1 = r2.ANP();
        } else {
            r1 = null;
        }
        if (r1 == AnonymousClass514.FOUR_BY_FIVE) {
            return AnonymousClass4M7.FIT_WITH_LIMITS;
        }
        if (r2 != null) {
            return AnonymousClass4M7.FILL;
        }
        AnonymousClass4M7 r0 = this.A02;
        0qQ.A0A(r0);
        return r0;
    }

    public final void setAspectRatio(float f) {
        int height;
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (f > 1.0f) {
            ViewParent parent = getParent();
            0qQ.A0C(parent, "null cannot be cast to non-null type android.view.View");
            int width = ((View) parent).getWidth();
            layoutParams.width = width;
            height = (int) (((float) width) / f);
        } else {
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            ViewParent parent2 = getParent();
            0qQ.A0C(parent2, "null cannot be cast to non-null type android.view.View");
            View view = (View) parent2;
            if (i < 0) {
                height = view.getHeight();
                layoutParams.width = (int) (((float) height) * f);
            } else {
                layoutParams.width = view.getWidth();
                ViewParent parent3 = getParent();
                0qQ.A0C(parent3, "null cannot be cast to non-null type android.view.View");
                height = ((View) parent3).getHeight();
            }
        }
        layoutParams.height = height;
        setLayoutParams(layoutParams);
    }

    public final void setCreationCameraSession(C3499682q r1) {
        this.A01 = r1;
    }

    public final void setMinAspectRatio(float f) {
        this.A00 = f;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        0qQ.A0B(context, 1);
        this.A00 = 0.8f;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C71382cm.A10);
        0qQ.A07(obtainStyledAttributes);
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            setContentDescription(context.getText(resourceId));
        }
        obtainStyledAttributes.recycle();
    }

    public /* synthetic */ IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i2), JTT.A01(i2, i));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public IgCaptureVideoPreviewView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
        0qQ.A0B(context, 1);
    }
}
