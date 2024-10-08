package X;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.StateListDrawable;
import android.util.AttributeSet;
import androidx.cardview.widget.CardView;
import com.google.android.material.card.MaterialCardView;
import com.instagram.android.R;

public final class W34 {
    public static final double A0I = Math.cos(Math.toRadians(45.0d));
    public static final int[] A0J = {16842912};
    public int A00;
    public int A01;
    public int A02;
    public ColorStateList A03;
    public ColorStateList A04;
    public ColorStateList A05;
    public Drawable A06;
    public Drawable A07;
    public Drawable A08;
    public LayerDrawable A09;
    public C297875sV A0A;
    public C297895sX A0B;
    public boolean A0C;
    public boolean A0D = false;
    public final Rect A0E = new Rect();
    public final MaterialCardView A0F;
    public final C297875sV A0G;
    public final C297875sV A0H;

    public static C14680U1b A03(Drawable drawable, W34 w34) {
        int i;
        int i2;
        float f;
        float f2;
        W34 w342 = w34;
        MaterialCardView materialCardView = w34.A0F;
        if (materialCardView.A00) {
            float maxCardElevation = materialCardView.getMaxCardElevation() * 1.5f;
            if (A04(w34)) {
                f = A00(w34);
            } else {
                f = 0.0f;
            }
            i2 = (int) Math.ceil((double) (maxCardElevation + f));
            float maxCardElevation2 = materialCardView.getMaxCardElevation();
            if (A04(w34)) {
                f2 = A00(w34);
            } else {
                f2 = 0.0f;
            }
            i = (int) Math.ceil((double) (maxCardElevation2 + f2));
        } else {
            i = 0;
            i2 = 0;
        }
        return new C14680U1b(drawable, w342, i, i2, i, i2);
    }

    public static float A00(W34 w34) {
        C297915sZ r1 = w34.A0B.A06;
        C297875sV r5 = w34.A0G;
        float A012 = A01(r1, r5.A07());
        C297915sZ r12 = w34.A0B.A07;
        C297935sb r0 = r5.A00.A0K.A03;
        RectF rectF = r5.A0C;
        C13988Tno.A0v(rectF, r5);
        float max = Math.max(A012, A01(r12, r0.ArV(rectF)));
        C297915sZ r13 = w34.A0B.A05;
        C297935sb r02 = r5.A00.A0K.A01;
        C13988Tno.A0v(rectF, r5);
        float A013 = A01(r13, r02.ArV(rectF));
        C297915sZ r14 = w34.A0B.A04;
        C297935sb r03 = r5.A00.A0K.A00;
        C13988Tno.A0v(rectF, r5);
        return Math.max(max, Math.max(A013, A01(r14, r03.ArV(rectF))));
    }

    public static float A01(C297915sZ r3, float f) {
        if (r3 instanceof C297905sY) {
            return (float) ((1.0d - A0I) * ((double) f));
        }
        if (r3 instanceof UWS) {
            return f / 2.0f;
        }
        return 0.0f;
    }

    public static LayerDrawable A02(W34 w34) {
        if (w34.A08 == null) {
            C297875sV r3 = new C297875sV(w34.A0B);
            w34.A0A = r3;
            w34.A08 = new RippleDrawable(w34.A04, (Drawable) null, r3);
        }
        if (w34.A09 == null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable = w34.A06;
            if (drawable != null) {
                stateListDrawable.addState(A0J, drawable);
            }
            LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{w34.A08, w34.A0H, stateListDrawable});
            w34.A09 = layerDrawable;
            layerDrawable.setId(2, R.id.mtrl_card_checked_layer_id);
        }
        return w34.A09;
    }

    public static boolean A04(W34 w34) {
        MaterialCardView materialCardView = w34.A0F;
        if (!materialCardView.A01 || !w34.A0G.A0I() || !materialCardView.A00) {
            return false;
        }
        return true;
    }

    public final void A05() {
        float A002;
        float f;
        MaterialCardView materialCardView = this.A0F;
        if ((!materialCardView.A01 || this.A0G.A0I()) && !A04(this)) {
            A002 = 0.0f;
        } else {
            A002 = A00(this);
        }
        if (!materialCardView.A01 || !materialCardView.A00) {
            f = 0.0f;
        } else {
            f = (float) ((1.0d - A0I) * ((double) materialCardView.getCardViewRadius()));
        }
        int i = (int) (A002 - f);
        Rect rect = this.A0E;
        materialCardView.A02.set(rect.left + i, rect.top + i, rect.right + i, rect.bottom + i);
        CardView.A05.FL2(materialCardView.A04);
    }

    public final void A06() {
        if (!this.A0D) {
            this.A0F.setBackgroundInternal(A03(this.A0G, this));
        }
        this.A0F.setForeground(A03(this.A07, this));
    }

    public final void A07(Drawable drawable) {
        this.A06 = drawable;
        if (drawable != null) {
            Drawable mutate = drawable.mutate();
            this.A06 = mutate;
            mutate.setTintList(this.A03);
        }
        if (this.A09 != null) {
            StateListDrawable stateListDrawable = new StateListDrawable();
            Drawable drawable2 = this.A06;
            if (drawable2 != null) {
                stateListDrawable.addState(A0J, drawable2);
            }
            this.A09.setDrawableByLayerId(R.id.mtrl_card_checked_layer_id, stateListDrawable);
        }
    }

    public final void A08(C297895sX r3) {
        this.A0B = r3;
        C297875sV r1 = this.A0G;
        r1.setShapeAppearanceModel(r3);
        r1.A03 = !r1.A0I();
        this.A0H.setShapeAppearanceModel(r3);
        C297875sV r0 = this.A0A;
        if (r0 != null) {
            r0.setShapeAppearanceModel(r3);
        }
    }

    public W34(AttributeSet attributeSet, MaterialCardView materialCardView, int i) {
        this.A0F = materialCardView;
        Paint paint = C297875sV.A0M;
        Context context = materialCardView.getContext();
        C297875sV r1 = new C297875sV(new C297895sX(C297895sX.A01(context, attributeSet, i, 2132018517)));
        this.A0G = r1;
        r1.A0E(context);
        r1.A0C(-12303292);
        C324126yg r3 = new C324126yg(r1.A00.A0K);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C297865sU.A05, i, R.style.CardView);
        if (obtainStyledAttributes.hasValue(3)) {
            r3.A00(obtainStyledAttributes.getDimension(3, 0.0f));
        }
        this.A0H = new C297875sV();
        A08(new C297895sX(r3));
        obtainStyledAttributes.recycle();
    }
}
