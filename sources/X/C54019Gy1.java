package X;

import android.content.Context;
import android.util.AttributeSet;
import com.facebook.litho.BaseMountingView;

/* renamed from: X.Gy1  reason: case insensitive filesystem */
public final class C54019Gy1 extends U4O implements AnonymousClass03M, C59477JLb {
    public final C53605GrK A00;
    public final 03N A01 = new 03N(this);

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A01.A04(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A01.A03(f, f2);
    }

    public final 03N getNestedScrollingChildHelper() {
        return this.A01;
    }

    public final C53605GrK getRenderTreeView() {
        return this.A00;
    }

    public C54019Gy1(Context context) {
        super(context);
        BaseMountingView baseMountingView = new BaseMountingView(context, (AttributeSet) null);
        this.A00 = baseMountingView;
        addView(baseMountingView);
        baseMountingView.setClipChildren(false);
        baseMountingView.setClipToPadding(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-1103827572);
        super.onAttachedToWindow();
        this.A01.A02(true);
        AnonymousClass0fD.A0D(-1714288172, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(797325590);
        this.A01.A02(false);
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(362904315, A06);
    }
}
