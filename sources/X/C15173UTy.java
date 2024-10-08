package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewParent;
import android.widget.FrameLayout;

/* renamed from: X.UTy  reason: case insensitive filesystem */
public final class C15173UTy extends U4O implements AnonymousClass03M, C59477JLb {
    public final 03N A00 = new 03N(this);
    public final WJo A01;
    public final C299025uS A02;

    public final boolean dispatchNestedFling(float f, float f2, boolean z) {
        return this.A00.A04(f, f2, z);
    }

    public final boolean dispatchNestedPreFling(float f, float f2) {
        return this.A00.A03(f, f2);
    }

    public final WJo getController() {
        return this.A01;
    }

    public final 03N getNestedScrollingChildHelper$fbandroid_libraries_bloks_components_bk_components_zoomable_bk_components_zoomable() {
        return this.A00;
    }

    public final C299025uS getRenderTreeHostView() {
        return this.A02;
    }

    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.A01.A0P;
    }

    public C15173UTy(Context context) {
        super(context);
        C299025uS r2 = new C299025uS(context);
        this.A02 = r2;
        this.A01 = new WJo(context, r2);
        addView(r2, new FrameLayout.LayoutParams(-1, -1));
        r2.setClipChildren(false);
        r2.setClipToPadding(false);
        setClipChildren(false);
        setClipToPadding(false);
    }

    public final void onAttachedToWindow() {
        int A06 = AnonymousClass0fD.A06(-693561667);
        super.onAttachedToWindow();
        this.A00.A02(true);
        AnonymousClass0fD.A0D(-1256077085, A06);
    }

    public final void onDetachedFromWindow() {
        int A06 = AnonymousClass0fD.A06(117138133);
        this.A00.A02(false);
        this.A01.A06();
        super.onDetachedFromWindow();
        AnonymousClass0fD.A0D(1902566735, A06);
    }

    public final boolean onTouchEvent(MotionEvent motionEvent) {
        int A05 = AnonymousClass0fD.A05(404208463);
        MotionEvent motionEvent2 = motionEvent;
        0qQ.A0B(motionEvent2, 0);
        WJo wJo = this.A01;
        ViewParent parent = getParent();
        if (!wJo.A0Q || motionEvent2.getPointerCount() == 2 || wJo.A0L != AnonymousClass05K.A00) {
            C15173UTy uTy = wJo.A0G;
            if (uTy != null) {
                uTy.A00.A05(0, 0);
                if (wJo.A0Q) {
                    wJo.A0U.onTouchEvent(motionEvent2);
                    int actionMasked = motionEvent2.getActionMasked();
                    if ((actionMasked == 1 || actionMasked == 3) && wJo.A0L == AnonymousClass05K.A0C) {
                        0eP A012 = WJo.A01(wJo, 1.0f);
                        float A04 = AnonymousClass7TE.A04(A012.A00);
                        float A042 = AnonymousClass7TE.A04(A012.A01);
                        WJo.A03(wJo, 1.0d, ((double) wJo.A0B) + ((double) A04), ((double) wJo.A0C) + ((double) A042), false);
                        C15173UTy uTy2 = wJo.A0G;
                        if (uTy2 != null) {
                            uTy2.A00.A01(0);
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                } else {
                    if (motionEvent2.getActionMasked() == 0) {
                        if (wJo.A0L == AnonymousClass05K.A01) {
                            2cs r8 = wJo.A0J;
                            r8.A06(r8.A09.A00);
                            2cs r9 = wJo.A0H;
                            r9.A06(r9.A09.A00);
                            2cs r7 = wJo.A0I;
                            r7.A06(r7.A09.A00);
                            r8.A01();
                            r7.A01();
                            r9.A01();
                            WJo.A02(wJo);
                        }
                        if (wJo.A0L == AnonymousClass05K.A0u) {
                            wJo.A08(AnonymousClass05K.A00);
                        }
                        wJo.A0W.forceFinished(true);
                    }
                    wJo.A0U.onTouchEvent(motionEvent2);
                    if (wJo.A0L != AnonymousClass05K.A0N && motionEvent2.getPointerCount() == 1) {
                        ((GestureDetector) wJo.A0Y.getValue()).onTouchEvent(motionEvent2);
                    }
                    int actionMasked2 = motionEvent2.getActionMasked();
                    if (actionMasked2 == 1 || actionMasked2 == 3) {
                        Integer num = wJo.A0L;
                        if (!(num == AnonymousClass05K.A0u || num == AnonymousClass05K.A01)) {
                            float A043 = C13989Tnp.A04(Float.valueOf(wJo.A02), 1.0f, wJo.A07);
                            0eP A013 = WJo.A01(wJo, A043);
                            WJo.A03(wJo, (double) A043, (double) AnonymousClass7TE.A04(A013.A00), (double) AnonymousClass7TE.A04(A013.A01), false);
                        }
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(false);
                        }
                        wJo.A0P = false;
                        C15173UTy uTy3 = wJo.A0G;
                        if (uTy3 != null) {
                            uTy3.A00.A01(0);
                            wJo.A00 = 0.0f;
                            wJo.A01 = 0.0f;
                        } else {
                            throw AnonymousClass7TE.A0y();
                        }
                    }
                }
            } else {
                throw AnonymousClass7TE.A0y();
            }
        }
        AnonymousClass0fD.A0C(1674992832, A05);
        return true;
    }
}
