package X;

import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import com.facebook.common.callercontext.ContextChain;

/* renamed from: X.Ge7  reason: case insensitive filesystem */
public final class C52873Ge7 extends ImageView {
    public Rect A00;
    public AnonymousClass6QN A01;
    public AnonymousClass579 A02;
    public 1U1 A03;
    public C226662he A04;
    public Object A05;
    public ContextChain A06;

    public static final void A00(C52873Ge7 ge7) {
        C268734du r0;
        C226732hl r11 = null;
        C226662he r5 = ge7.A04;
        if (r5 != null) {
            Rect rect = ge7.A00;
            if (rect != null) {
                1U1 r2 = ge7.A03;
                if (r2 == null) {
                    r2 = null;
                } else if ((r2.A0Z && r2.A0Y) || r2.A0U) {
                    AnonymousClass1U3 r3 = new AnonymousClass1U3(r2);
                    int width = rect.width();
                    int height = rect.height();
                    if (width <= 0 || height <= 0) {
                        r0 = null;
                    } else {
                        r0 = new C268734du(width, height);
                    }
                    r3.A0L = r0;
                    r2 = new 1U1(r3);
                }
                1TS A012 = C226722hk.A01();
                Resources resources = ge7.getResources();
                0qQ.A07(resources);
                r11 = A012.A02(resources, r2, r5, false);
            }
            1Tq A002 = C226722hk.A00();
            Drawable drawable = ge7.getDrawable();
            0qQ.A0C(drawable, Pxd.A00(20));
            Object obj = ge7.A05;
            A002.AUi(rect, ge7.A06, ge7.A01, (JLT) null, (C226742hm) drawable, r11, (C226702hi) null, ge7.A02, obj);
        }
    }

    public final void setFrescoDrawable(C226742hm r2) {
        0qQ.A0B(r2, 0);
        setImageDrawable((Drawable) r2);
    }

    public final Object getCallerContext() {
        return this.A05;
    }

    public final ContextChain getContextChain() {
        return this.A06;
    }

    public final AnonymousClass579 getImageListener() {
        return this.A02;
    }

    public final AnonymousClass6QN getPerfDataListener() {
        return this.A01;
    }

    public final C226742hm getFrescoDrawable() {
        Drawable drawable = getDrawable();
        0qQ.A0C(drawable, Pxd.A00(20));
        return (C226742hm) drawable;
    }

    public final void onAttachedToWindow() {
        int A062 = AnonymousClass0fD.A06(357778360);
        super.onAttachedToWindow();
        A00(this);
        Drawable drawable = getDrawable();
        String A002 = Pxd.A00(20);
        0qQ.A0C(drawable, A002);
        0qQ.A0C(getDrawable(), A002);
        AnonymousClass0fD.A0D(-1951583753, A062);
    }

    public final void onDetachedFromWindow() {
        boolean z;
        Animatable animatable;
        int A062 = AnonymousClass0fD.A06(-1087528758);
        super.onDetachedFromWindow();
        1U1 r0 = this.A03;
        if (r0 != null) {
            z = r0.A0T;
        } else {
            z = true;
        }
        String A002 = Pxd.A00(20);
        if (z) {
            Drawable drawable = getDrawable();
            0qQ.A0C(drawable, A002);
            Drawable AYq = ((C226742hm) drawable).AYq();
            if ((AYq instanceof Animatable) && (animatable = (Animatable) AYq) != null) {
                animatable.stop();
            }
        }
        0qQ.A0C(getDrawable(), A002);
        0qQ.A0C(getDrawable(), A002);
        1Tq A003 = C226722hk.A00();
        Drawable drawable2 = getDrawable();
        0qQ.A0C(drawable2, A002);
        A003.ECa((C226742hm) drawable2);
        AnonymousClass0fD.A0D(816161132, A062);
    }

    public final void setCallerContext(Object obj) {
        this.A05 = obj;
    }

    public final void setContextChain(ContextChain contextChain) {
        this.A06 = contextChain;
    }

    public final void setImageListener(AnonymousClass579 r1) {
        this.A02 = r1;
    }

    public final void setPerfDataListener(AnonymousClass6QN r1) {
        this.A01 = r1;
    }
}
