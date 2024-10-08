package X;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: X.8pi  reason: invalid class name and case insensitive filesystem */
public final class C366808pi extends AnonymousClass3NZ implements Animatable {
    public C366838pl A00;
    public final Context A01;
    public final Drawable.Callback A02;
    public final C366828pk A03;

    public final boolean canApplyTheme() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.canApplyTheme();
        }
        return false;
    }

    public final void draw(Canvas canvas) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        C366828pk r1 = this.A03;
        r1.A02.draw(canvas);
        if (r1.A00.isStarted()) {
            invalidateSelf();
        }
    }

    public final int getAlpha() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getAlpha();
        }
        return this.A03.A02.getAlpha();
    }

    public final int getChangingConfigurations() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations();
    }

    public final ColorFilter getColorFilter() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getColorFilter();
        }
        return this.A03.A02.getColorFilter();
    }

    public final Drawable.ConstantState getConstantState() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return new C366838pl(drawable.getConstantState());
        }
        return null;
    }

    public final int getIntrinsicHeight() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.A03.A02.getIntrinsicHeight();
    }

    public final int getIntrinsicWidth() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.A03.A02.getIntrinsicWidth();
    }

    public final int getOpacity() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.A03.A02.getOpacity();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray obtainAttributes;
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    int[] iArr = C39627A2r.A00;
                    if (theme == null) {
                        obtainAttributes = resources.obtainAttributes(attributeSet, iArr);
                    } else {
                        obtainAttributes = theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
                    }
                    int resourceId = obtainAttributes.getResourceId(0, 0);
                    if (resourceId != 0) {
                        AnonymousClass3NY r3 = new AnonymousClass3NY();
                        r3.A00 = resources.getDrawable(resourceId, theme);
                        r3.A01 = false;
                        r3.setCallback(this.A02);
                        C366828pk r2 = this.A03;
                        AnonymousClass3NY r1 = r2.A02;
                        if (r1 != null) {
                            r1.setCallback((Drawable.Callback) null);
                        }
                        r2.A02 = r3;
                    }
                } else if ("target".equals(name)) {
                    obtainAttributes = resources.obtainAttributes(attributeSet, C39627A2r.A01);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.A01;
                        if (context != null) {
                            Animator loadAnimator = AnimatorInflater.loadAnimator(context, resourceId2);
                            C366828pk r22 = this.A03;
                            loadAnimator.setTarget(r22.A02.A00.A08.A0E.get(string));
                            ArrayList arrayList = r22.A03;
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                r22.A03 = arrayList;
                                r22.A01 = new 01r(0);
                            }
                            arrayList.add(loadAnimator);
                            r22.A01.put(loadAnimator, string);
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                } else {
                    continue;
                }
                obtainAttributes.recycle();
            }
            eventType = xmlPullParser.next();
        }
        C366828pk r0 = this.A03;
        AnimatorSet animatorSet = r0.A00;
        if (animatorSet == null) {
            animatorSet = new AnimatorSet();
            r0.A00 = animatorSet;
        }
        animatorSet.playTogether(r0.A03);
    }

    public final boolean isAutoMirrored() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isAutoMirrored();
        }
        return this.A03.A02.isAutoMirrored();
    }

    public final boolean isRunning() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.A03.A00.isRunning();
    }

    public final boolean isStateful() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.A03.A02.isStateful();
    }

    public final Drawable mutate() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    public final void onBoundsChange(Rect rect) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A03.A02;
        }
        drawable.setBounds(rect);
    }

    public final boolean onLevelChange(int i) {
        Drawable drawable = this.A00;
        if (drawable == null) {
            drawable = this.A03.A02;
        }
        return drawable.setLevel(i);
    }

    public final boolean onStateChange(int[] iArr) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.A03.A02.setState(iArr);
    }

    public final void setAlpha(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.A03.A02.setAlpha(i);
        }
    }

    public final void setAutoMirrored(boolean z) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setAutoMirrored(z);
        } else {
            this.A03.A02.setAutoMirrored(z);
        }
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.A03.A02.setColorFilter(colorFilter);
        }
    }

    public final void setTint(int i) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setTint(i);
        } else {
            this.A03.A02.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setTintList(colorStateList);
        } else {
            this.A03.A02.setTintList(colorStateList);
        }
    }

    public final void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            drawable.setTintMode(mode);
        } else {
            this.A03.A02.setTintMode(mode);
        }
    }

    public final boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.A00;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.A03.A02.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    public final void start() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
            return;
        }
        C366828pk r1 = this.A03;
        if (!r1.A00.isStarted()) {
            r1.A00.start();
            invalidateSelf();
        }
    }

    public final void stop() {
        Drawable drawable = this.A00;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.A03.A00.end();
        }
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.8pk, android.graphics.drawable.Drawable$ConstantState] */
    public C366808pi(Context context) {
        this.A02 = new C366818pj(this);
        this.A01 = context;
        this.A03 = new Drawable.ConstantState();
    }

    /* JADX WARNING: type inference failed for: r0v1, types: [X.8pk, android.graphics.drawable.Drawable$ConstantState] */
    public C366808pi() {
        this.A02 = new C366818pj(this);
        this.A01 = null;
        this.A03 = new Drawable.ConstantState();
    }

    public final void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, (Resources.Theme) null);
    }
}
