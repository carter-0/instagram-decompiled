package com.instagram.reels.interactive.view;

import X.AnonymousClass0fD;
import X.AnonymousClass17L;
import X.C71382cm;
import X.U1N;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;

public class AvatarView extends View {
    public final U1N A00;

    public void setAvatarSecondaryStrokeColor(int i) {
        U1N u1n = this.A00;
        u1n.A04.setColor(i);
        u1n.invalidateSelf();
    }

    public void setAvatarSecondaryStrokeWidth(int i) {
        U1N u1n = this.A00;
        u1n.A00 = (float) i;
        u1n.invalidateSelf();
    }

    public void setAvatarUrl(ImageUrl imageUrl) {
        this.A00.A00(imageUrl);
    }

    public void setAvatarUser(AnonymousClass17L r3) {
        this.A00.A00(r3.Bh3());
    }

    public void setStrokeColor(int i) {
        U1N u1n = this.A00;
        u1n.A05.setColor(i);
        u1n.invalidateSelf();
    }

    public void setStrokeWidth(int i) {
        U1N u1n = this.A00;
        u1n.A01 = (float) i;
        u1n.invalidateSelf();
    }

    public AvatarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        U1N u1n = new U1N(context);
        this.A00 = u1n;
        u1n.setCallback(this);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C71382cm.A03);
        setStrokeColor(obtainStyledAttributes.getColor(0, 0));
        setStrokeWidth(obtainStyledAttributes.getDimensionPixelSize(1, 0));
        obtainStyledAttributes.recycle();
    }

    public final void draw(Canvas canvas) {
        int A03 = AnonymousClass0fD.A03(-2059590778);
        super.draw(canvas);
        this.A00.draw(canvas);
        AnonymousClass0fD.A0A(84522386, A03);
    }

    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        int A06 = AnonymousClass0fD.A06(-823627433);
        super.onSizeChanged(i, i2, i3, i4);
        this.A00.setBounds(0, 0, i, i2);
        AnonymousClass0fD.A0D(-1084320302, A06);
    }

    public final boolean verifyDrawable(Drawable drawable) {
        if (super.verifyDrawable(drawable) || drawable == this.A00) {
            return true;
        }
        return false;
    }

    public AvatarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AvatarView(Context context) {
        this(context, (AttributeSet) null);
    }
}
