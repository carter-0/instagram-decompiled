package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import com.instagram.common.ui.widget.reboundhorizontalscrollview.ReboundHorizontalScrollView;
import java.util.List;

/* renamed from: X.Lk7  reason: case insensitive filesystem */
public final class C64907Lk7 implements C66545MVz {
    public C63611Kzz A00;
    public final ReboundHorizontalScrollView A01;

    public C64907Lk7(ReboundHorizontalScrollView reboundHorizontalScrollView) {
        0qQ.A0B(reboundHorizontalScrollView, 1);
        this.A01 = reboundHorizontalScrollView;
    }

    public final C66539MVt Au6() {
        return null;
    }

    public final void CNC(C63610Kzy kzy, List list, int i, int i2, boolean z) {
    }

    public final void EDx(C60478JmA jmA) {
        0qQ.A0B(jmA, 0);
        this.A01.A0J.remove(jmA);
    }

    public final void EFE() {
    }

    public final void EHO(L01 l01) {
    }

    public final void EHc(C66539MVt mVt) {
    }

    public final void EKf(int i) {
    }

    public final void EjA(boolean z) {
        this.A01.setSaveEnabled(true);
    }

    public final void ElY(boolean z) {
        this.A01.A0A = true;
    }

    public final void Etv() {
    }

    public final void EzF(int i, int i2) {
    }

    public final void addView(View view, int i) {
        0qQ.A0B(view, 0);
        this.A01.addView(view, i);
    }

    public final int indexOfChild(View view) {
        0qQ.A0B(view, 0);
        return this.A01.indexOfChild(view);
    }

    public final void removeItem(int i) {
    }

    public final void removeView(View view) {
        0qQ.A0B(view, 0);
        this.A01.removeView(view);
    }

    public final void A97(C60478JmA jmA) {
        this.A01.A0A(jmA);
    }

    public final void AAf(View view) {
        this.A01.addView(view);
    }

    public final View AnC(int i) {
        return this.A01.getChildAt(i);
    }

    public final int AnH() {
        return this.A01.getChildCount();
    }

    public final int Atv() {
        return this.A01.getCurrentChildIndex();
    }

    public final ViewGroup.LayoutParams BLw() {
        ViewGroup.LayoutParams layoutParams = this.A01.getLayoutParams();
        0qQ.A07(layoutParams);
        return layoutParams;
    }

    public final /* bridge */ /* synthetic */ View Bq9() {
        return this.A01;
    }

    public final float CDb() {
        return this.A01.getVelocity();
    }

    public final ViewTreeObserver CEp() {
        ViewTreeObserver viewTreeObserver = this.A01.getViewTreeObserver();
        0qQ.A07(viewTreeObserver);
        return viewTreeObserver;
    }

    public final void EDK() {
        this.A01.removeAllViews();
    }

    public final void EKa(int i, float f) {
        this.A01.A09(i, f);
    }

    public final void EKe(float f) {
        this.A01.A05(f);
    }

    public final void EKk(float f) {
        this.A01.A06(f);
    }

    public final void EU0(float f) {
        this.A01.A00 = f;
    }

    public final void Ebw(ViewGroup.LayoutParams layoutParams) {
        this.A01.setLayoutParams(layoutParams);
    }

    public final void EjL(C71392co r2) {
        this.A01.setScrollingSpringConfig(r2);
    }

    public final void ElZ(C71392co r2) {
        this.A01.setSnappingSpringConfig(r2);
    }

    public final int getWidth() {
        return this.A01.getWidth();
    }

    public final void requestDisallowInterceptTouchEvent(boolean z) {
        this.A01.requestDisallowInterceptTouchEvent(z);
    }

    public final void requestLayout() {
        this.A01.requestLayout();
    }

    public final void setVisibility(int i) {
        this.A01.setVisibility(i);
    }

    public final void EaX(C63611Kzz kzz) {
        this.A00 = kzz;
    }
}
