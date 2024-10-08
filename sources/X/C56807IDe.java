package X;

import android.content.Context;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.ConstrainedImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.IDe  reason: case insensitive filesystem */
public final class C56807IDe implements View.OnTouchListener {
    public LinearLayout A00;
    public View A01;
    public final int A02;
    public final AnonymousClass7Q6 A03;
    public final C275794rx A04;
    public final int[] A05 = new int[2];

    public C56807IDe(AnonymousClass0iw r13, UserSession userSession, ConstrainedImageView constrainedImageView, C317486nL r16, AnonymousClass7Q6 r17, int i, boolean z) {
        this.A02 = i;
        this.A03 = r17;
        Context context = constrainedImageView.getContext();
        ViewParent parent = constrainedImageView.getParent();
        parent.getClass();
        parent.requestDisallowInterceptTouchEvent(true);
        View rootView = constrainedImageView.getRootView();
        Integer num = AnonymousClass05K.A01;
        C55887Hp8 hp8 = new C55887Hp8(rootView, userSession, num, num);
        hp8.A03 = Integer.valueOf(2Yu.A04(context));
        hp8.A04 = Integer.valueOf(2Yu.A04(context));
        hp8.A02 = C54604HKn.A02;
        hp8.A00 = this;
        LinearLayout linearLayout = new LinearLayout(context);
        this.A00 = linearLayout;
        linearLayout.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        int i2 = 0;
        this.A00.setOrientation(0);
        C317486nL[] A022 = C337097fg.A02(r16.A02, z);
        while (true) {
            int length = A022.length;
            if (i2 < length) {
                IgImageView constrainedImageView2 = new ConstrainedImageView(context);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(this.A02, -2);
                if (i2 < length - 1) {
                    layoutParams.setMarginEnd(context.getResources().getDimensionPixelSize(R.dimen.abc_edit_text_inset_bottom_material));
                }
                constrainedImageView2.setLayoutParams(layoutParams);
                C317486nL r0 = A022[i2];
                constrainedImageView2.setUrl(C336957fS.A00(r0.A01, r0.A02), r13);
                constrainedImageView2.setTag(A022[i2]);
                constrainedImageView2.setFocusableInTouchMode(true);
                constrainedImageView2.setFocusable(true);
                constrainedImageView2.setContentDescription(A022[i2].A02);
                2eS.A04(constrainedImageView2, num);
                this.A00.addView(constrainedImageView2);
                i2++;
            } else {
                this.A00.requestFocusFromTouch();
                this.A00.requestFocus();
                hp8.A01 = this.A00;
                hp8.A05 = !2eO.A01(context, true);
                C275794rx r2 = new C275794rx(hp8);
                this.A04 = r2;
                r2.A02(constrainedImageView, 0, (-constrainedImageView.getHeight()) / 2, false);
                return;
            }
        }
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z;
        int i;
        int x = (int) motionEvent.getX();
        int y = (int) motionEvent.getY();
        int[] iArr = this.A05;
        view.getLocationInWindow(iArr);
        int i2 = x + iArr[0];
        int i3 = y + iArr[1];
        LinearLayout linearLayout = this.A00;
        int childCount = linearLayout.getChildCount();
        View view2 = this.A01;
        this.A01 = null;
        View childAt = linearLayout.getChildAt(0);
        childAt.getLocationInWindow(iArr);
        int width = childAt.getWidth() + ((ViewGroup.MarginLayoutParams) childAt.getLayoutParams()).rightMargin;
        int i4 = iArr[0];
        if (i2 < i4 || i2 > i4 + (childCount * width) || i3 <= (i = iArr[1]) || i3 >= i + childAt.getHeight()) {
            z = false;
        } else {
            this.A01 = linearLayout.getChildAt((i2 - iArr[0]) / width);
            z = true;
        }
        if (!(view2 == null || view2 == this.A01)) {
            view2.setPressed(false);
        }
        View view3 = this.A01;
        if (motionEvent.getAction() == 1 && view3 != null) {
            ImageView imageView = (ImageView) view3;
            C317486nL r3 = (C317486nL) imageView.getTag();
            Drawable drawable = imageView.getDrawable();
            drawable.getClass();
            BitmapDrawable bitmapDrawable = new BitmapDrawable(imageView.getResources(), ((BitmapDrawable) drawable).getBitmap());
            if (r3 != null) {
                this.A03.DBs(bitmapDrawable, imageView, r3);
            }
            this.A04.A03(true);
            return true;
        } else if (z || motionEvent.getAction() != 0) {
            return z;
        } else {
            this.A04.A03(true);
            return true;
        }
    }
}
