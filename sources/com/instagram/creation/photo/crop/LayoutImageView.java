package com.instagram.creation.photo.crop;

import X.0qQ;
import X.1MF;
import X.C59741JVz;
import X.C60032Jdi;
import X.C64927LkS;
import X.C66512MUq;
import X.JTO;
import X.JTT;
import X.U02;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.GestureDetector;
import kotlin.jvm.internal.DefaultConstructorMarker;

public final class LayoutImageView extends C59741JVz {
    public C66512MUq A00;
    public boolean A01;
    public U02 A02;

    /* JADX WARNING: type inference failed for: r2v0, types: [X.JbJ, java.lang.Object] */
    public final void A0O(int i, int i2, Bitmap bitmap, int i3) {
        Bitmap A0A = 1MF.A0A(bitmap, i, i2, false);
        0qQ.A07(A0A);
        ? obj = new Object();
        obj.A01 = A0A;
        obj.A00 = i3 % 360;
        setImageRotateBitmapResetBase(obj, (float[]) null, getLayoutParams());
        A0A.getHeight();
        A0A.getWidth();
        A0P(A0A, i3);
        A0N();
    }

    /* JADX WARNING: type inference failed for: r4v0, types: [com.instagram.creation.photo.crop.LayoutImageView, android.view.View, java.lang.Object] */
    public final void A0N() {
        if (this.A01) {
            U02 u02 = new U02();
            u02.A00 = 1.0f;
            u02.A01 = new GestureDetector(getContext(), new C60032Jdi(this, 4));
            u02.A02 = new C64927LkS(this, 1);
            this.A02 = u02;
            setOnTouchListener(u02);
        }
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [com.instagram.creation.photo.crop.LayoutImageView, X.JVz, android.view.View] */
    public final void A0P(Bitmap bitmap, int i) {
        boolean z;
        int width;
        int height;
        float f;
        float f2;
        if ((i / 90) % 2 != 0) {
            z = true;
            width = bitmap.getHeight();
            height = bitmap.getWidth();
        } else {
            z = false;
            width = bitmap.getWidth();
            height = bitmap.getHeight();
        }
        float f3 = (float) getLayoutParams().width;
        float f4 = (float) getLayoutParams().height;
        float f5 = (float) width;
        float f6 = f5 / f3;
        float f7 = (float) height;
        float f8 = f7 / f4;
        if (f6 < f8) {
            f2 = f6 * f4;
            f = f5;
        } else {
            f = f8 * f3;
            f2 = f7;
        }
        float A04 = (float) JTO.A04(f5 - f, 2.0f);
        float A042 = (float) JTO.A04(f7 - f2, 2.0f);
        float f9 = f5 - A04;
        float f10 = f7 - A042;
        RectF rectF = new RectF(A04, A042, f9, f10);
        if (z) {
            rectF = new RectF(A042, A04, f10, f9);
        }
        A0K(rectF, 1.0f, 10.0f);
    }

    public /* synthetic */ LayoutImageView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, JTT.A0D(attributeSet, i));
    }

    public final void setDelegate(C66512MUq mUq) {
        this.A00 = mUq;
    }

    public final void setTouchEnabled(boolean z) {
        this.A01 = z;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public LayoutImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        0qQ.A0B(context, 1);
        this.A01 = true;
    }
}
