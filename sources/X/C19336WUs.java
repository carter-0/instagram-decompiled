package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.instagram.android.R;

/* renamed from: X.WUs  reason: case insensitive filesystem */
public final class C19336WUs implements C355488Qe {
    public int A00;
    public int A01;
    public View A02;
    public PopupWindow A03;
    public AnonymousClass3NM A04;
    public B26 A05;
    public final Context A06;
    public final int A07;
    public final Runnable A08 = new C20012WjX(this);

    public final void Etp(View view, B26 b26, int i, boolean z) {
        if (this.A03 == null) {
            View A082 = DbU.A08(LayoutInflater.from(this.A06), R.layout.item_menu);
            PopupWindow popupWindow = new PopupWindow(A082, -2, -2, false);
            this.A03 = popupWindow;
            popupWindow.setAnimationStyle(R.style.ItemMenuAnimationStyle);
            PopupWindow popupWindow2 = this.A03;
            if (popupWindow2 != null) {
                popupWindow2.setOutsideTouchable(true);
            }
            View requireViewById = A082.requireViewById(R.id.trash_can);
            this.A02 = requireViewById;
            if (requireViewById != null) {
                AnonymousClass3NG r2 = new AnonymousClass3NG(requireViewById);
                r2.A07 = true;
                r2.A04 = new C15848UjY(this, 22);
                this.A04 = r2.A00();
                A082.measure(View.MeasureSpec.makeMeasureSpec(0, 0), View.MeasureSpec.makeMeasureSpec(0, 0));
                this.A01 = A082.getMeasuredWidth();
                this.A00 = A082.getMeasuredHeight();
            } else {
                throw DbU.A0h();
            }
        }
        CLA();
        this.A05 = b26;
        View view2 = this.A02;
        if (view2 != null) {
            view2.setVisibility(0);
            Rect rect = new Rect();
            view.getGlobalVisibleRect(rect);
            C18899WBr wBr = new C18899WBr(5, rect, this);
            PopupWindow popupWindow3 = this.A03;
            if (popupWindow3 != null) {
                View contentView = popupWindow3.getContentView();
                if (contentView != null) {
                    contentView.setOnTouchListener(wBr);
                    popupWindow3.setTouchInterceptor(wBr);
                    popupWindow3.showAtLocation(view, 51, rect.centerX() - (this.A01 / 2), (rect.top - this.A07) - this.A00);
                    View contentView2 = popupWindow3.getContentView();
                    Runnable runnable = this.A08;
                    contentView2.removeCallbacks(runnable);
                    popupWindow3.getContentView().postDelayed(runnable, 3000);
                    return;
                }
                throw new IllegalStateException("Required value was null.");
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final boolean Cc6() {
        PopupWindow popupWindow = this.A03;
        if (popupWindow == null || !popupWindow.isShowing()) {
            return false;
        }
        return true;
    }

    public C19336WUs(Context context) {
        this.A06 = context;
        this.A07 = context.getResources().getDimensionPixelSize(R.dimen.ad4ad_button_bottom_margin);
    }

    public final boolean CLA() {
        View contentView;
        if (!Cc6()) {
            return false;
        }
        PopupWindow popupWindow = this.A03;
        if (popupWindow == null || (contentView = popupWindow.getContentView()) == null) {
            throw AnonymousClass7TE.A0y();
        }
        contentView.removeCallbacks(this.A08);
        PopupWindow popupWindow2 = this.A03;
        if (popupWindow2 == null) {
            return true;
        }
        popupWindow2.dismiss();
        return true;
    }
}
