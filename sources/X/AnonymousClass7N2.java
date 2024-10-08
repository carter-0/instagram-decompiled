package X;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;

/* renamed from: X.7N2  reason: invalid class name */
public final class AnonymousClass7N2 extends AnonymousClass3B3 {
    public int A00;
    public final AnonymousClass7ZZ A01;
    public final int A02;
    public final int A03;
    public final int A04;
    public final Drawable A05;
    public final Drawable A06;
    public final Drawable A07;
    public final Drawable A08;
    public final C333487Zd A09;
    public final boolean A0A;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, AnonymousClass3AW r9) {
        int i;
        Boolean bool;
        0qQ.A0B(rect, 0);
        0qQ.A0B(view, 1);
        0qQ.A0B(recyclerView, 2);
        int A032 = RecyclerView.A03(view);
        C249703kE A0Z = recyclerView.A0Z(view);
        if ((A0Z instanceof AnonymousClass7PR) && A0Z.itemView.getHeight() == 0) {
            return;
        }
        if (!(A0Z instanceof C67841Mvl) || A0Z.itemView.getHeight() != 0) {
            2Rw r4 = recyclerView.A0A;
            if (A032 == -1 && (A0Z instanceof C68797NXh)) {
                bool = Boolean.valueOf(((C67977My1) ((AnonymousClass7PK) A0Z).A00).A00);
            } else if ((A0Z instanceof AnonymousClass7PU) || (A0Z instanceof AnonymousClass7PX) || ((A0Z instanceof C331027Pf) && r4 != null && A032 + 1 == r4.getItemCount())) {
                i = 0;
                rect.set(0, i, 0, A00(A032));
                return;
            } else {
                bool = null;
            }
            i = A01(bool, A032);
            rect.set(0, i, 0, A00(A032));
            return;
        }
        rect.set(0, 1, 0, 0);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, AnonymousClass3AW r20) {
        Drawable drawable;
        Drawable drawable2;
        Canvas canvas2 = canvas;
        0qQ.A0B(canvas2, 0);
        RecyclerView recyclerView2 = recyclerView;
        0qQ.A0B(recyclerView2, 1);
        int paddingLeft = recyclerView2.getPaddingLeft();
        int width = recyclerView2.getWidth() - recyclerView2.getPaddingRight();
        int childCount = recyclerView2.getChildCount();
        AnonymousClass7ZZ r5 = this.A01;
        if (r5.CdD()) {
            drawable = this.A06;
            drawable2 = this.A05;
        } else {
            drawable = this.A08;
            drawable2 = this.A07;
        }
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView2.getChildAt(i);
            int A032 = RecyclerView.A03(childAt);
            if (r5.CVk(A032)) {
                ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
                0qQ.A0C(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                int translationY = (int) childAt.getTranslationY();
                int bottom = childAt.getBottom() + marginLayoutParams.bottomMargin + translationY;
                int A002 = A00(A032) + bottom;
                if (A032 == 0 && r5.CVk(A032)) {
                    A002 -= this.A02;
                }
                drawable.setBounds(paddingLeft, bottom, width, A002);
                drawable.draw(canvas2);
                int top = (childAt.getTop() - marginLayoutParams.topMargin) + translationY;
                int A012 = top - A01((Boolean) null, A032);
                drawable.setBounds(paddingLeft, A012, width, top);
                drawable.draw(canvas2);
                if (r5.CVn(A032)) {
                    drawable2.setBounds(paddingLeft, A012 - this.A04, width, A012);
                    drawable2.draw(canvas2);
                }
                if (A02(A032)) {
                    drawable2.setBounds(paddingLeft, A002, width, this.A04 + A002);
                    drawable2.draw(canvas2);
                }
            }
        }
    }

    private final int A00(int i) {
        if (i == 0 && this.A01.CVk(i)) {
            return this.A02 * 2;
        }
        AnonymousClass7ZZ r0 = this.A01;
        if (r0.CVk(i) != r0.CXJ(i)) {
            return this.A02;
        }
        if (i == -1 || !this.A09.CUT(i)) {
            return this.A03;
        }
        return this.A00;
    }

    private final int A01(Boolean bool, int i) {
        int i2;
        boolean CUS;
        AnonymousClass7ZZ r2 = this.A01;
        if (r2.CVk(i) != r2.CXG(i)) {
            i2 = this.A02;
        } else {
            if (i == -1) {
                if (bool != null) {
                    CUS = bool.booleanValue();
                }
                i2 = this.A03;
            } else {
                CUS = this.A09.CUS(i);
            }
            if (CUS) {
                i2 = this.A00;
            }
            i2 = this.A03;
        }
        if (r2.CVn(i)) {
            i2 += this.A04;
        }
        if (A02(i)) {
            return i2 + this.A04;
        }
        return i2;
    }

    private final boolean A02(int i) {
        boolean CXJ;
        boolean z = this.A0A;
        AnonymousClass7ZZ r1 = this.A01;
        if (z) {
            if (!r1.CVm(i)) {
                if (!r1.CVk(i) || r1.CXJ(i)) {
                    return false;
                }
                CXJ = r1.CVl(i);
            }
            return true;
        } else if (!r1.CVk(i)) {
            return false;
        } else {
            CXJ = r1.CXJ(i);
        }
        if (!CXJ) {
            return true;
        }
        return false;
    }

    public AnonymousClass7N2(Context context, C333487Zd r5, AnonymousClass7ZZ r6, C329967Kx r7, boolean z) {
        this.A09 = r5;
        this.A01 = r6;
        this.A0A = z;
        this.A03 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap) / 2;
        this.A02 = context.getResources().getDimensionPixelSize(R.dimen.account_discovery_bottom_gap);
        this.A04 = context.getResources().getDimensionPixelSize(R.dimen.account_recs_header_image_margin);
        int i = r7.A0A;
        this.A08 = new ColorDrawable(i);
        this.A07 = new ColorDrawable(context.getColor(R.color.interleaved_shh_messages_border_color));
        this.A06 = new ColorDrawable(i);
        this.A05 = new ColorDrawable(context.getColor(R.color.grey_6));
        this.A00 = context.getResources().getDimensionPixelOffset(R.dimen.abc_control_corner_material) / 2;
    }
}
