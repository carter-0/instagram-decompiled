package X;

import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.AutoCompleteTextView;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.Scroller;
import com.instagram.common.ui.widget.filmstriptimeline.ScrollingTimelineView;
import com.instagram.igds.components.form.IgFormField;

/* renamed from: X.WBr  reason: case insensitive filesystem */
public final class C18899WBr implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C18899WBr(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int A0G;
        1Xj r2;
        switch (this.A00) {
            case 0:
                return ((C253913rc) this.A02).A01(motionEvent);
            case 1:
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                C15224UWb uWb = (C15224UWb) this.A01;
                long currentTimeMillis = System.currentTimeMillis() - uWb.A00;
                if (currentTimeMillis < 0 || currentTimeMillis > 300) {
                    uWb.A06 = false;
                }
                C15224UWb.A01((AutoCompleteTextView) this.A02, uWb);
                return false;
            case 2:
                if (((Checkable) view).isChecked()) {
                    return ((GestureDetector) this.A02).onTouchEvent(motionEvent);
                }
                return false;
            case 3:
                if (motionEvent.getActionMasked() != 4) {
                    return false;
                }
                if (((Rect) this.A01).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    return true;
                }
                ((C18799W2m) this.A02).A09.A06();
                return true;
            case 4:
                0qQ.A0B(motionEvent, 1);
                int action = motionEvent.getAction();
                if (action == 2) {
                    ScrollingTimelineView scrollingTimelineView = (ScrollingTimelineView) this.A02;
                    if (!scrollingTimelineView.A00) {
                        scrollingTimelineView.A00 = true;
                    }
                } else if ((action == 1 || action == 3) && !((C14726U4t) this.A01).A03) {
                    ((ScrollingTimelineView) this.A02).A00 = false;
                }
                return C18899WBr.super.onTouchEvent(motionEvent);
            case 5:
                if (motionEvent.getActionMasked() != 4) {
                    return false;
                }
                if (((Rect) this.A01).contains((int) motionEvent.getRawX(), (int) motionEvent.getRawY())) {
                    return true;
                }
                ((C19336WUs) this.A02).CLA();
                return true;
            case 6:
                return ((C317396nC) this.A02).DsV(motionEvent);
            case 7:
                char c = 0;
                if (motionEvent.getAction() != 1) {
                    return false;
                }
                IgFormField igFormField = (IgFormField) this.A02;
                boolean z = true;
                if (!(igFormField.getResources().getConfiguration().getLayoutDirection() == 1 || igFormField.getMEditText().getTextDirection() == 4)) {
                    z = false;
                }
                Drawable[] compoundDrawables = igFormField.getMEditText().getCompoundDrawables();
                if (!z) {
                    c = 2;
                }
                Drawable drawable = compoundDrawables[c];
                if (drawable == null) {
                    return false;
                }
                X4F x4f = (X4F) this.A01;
                Rect A0X = AnonymousClass7TE.A0X(drawable);
                EditText mEditText = igFormField.getMEditText();
                int paddingTop = A0X.top + mEditText.getPaddingTop() + (((C13989Tnp.A0F(mEditText) - mEditText.getPaddingTop()) - A0X.height()) / 2);
                if (z) {
                    A0G = mEditText.getPaddingLeft() + A0X.width();
                } else {
                    A0G = C13989Tnp.A0G(mEditText);
                }
                if (!new Rect(A0G - A0X.width(), paddingTop, A0G, A0X.height() + paddingTop).contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                    return false;
                }
                x4f.Dmt(igFormField.getStateType$fbandroid_java_com_instagram_igds_components_form_form());
                return false;
            case 8:
                if (motionEvent.getActionMasked() == 0) {
                    C18739VzK vzK = (C18739VzK) this.A02;
                    vzK.A01 = AnonymousClass05K.A00;
                    vzK.A06.forceFinished(true);
                    ViewParent parent = vzK.A05.getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                    if (!vzK.A03) {
                        vzK.A03 = true;
                        VOY voy = vzK.A00;
                        if (voy != null) {
                            C19500Wam wam = voy.A00;
                            wam.A06.Dha(wam);
                        }
                    }
                }
                ((GestureDetector) this.A01).onTouchEvent(motionEvent);
                if (motionEvent.getActionMasked() != 1) {
                    return true;
                }
                C18739VzK vzK2 = (C18739VzK) this.A02;
                if (vzK2.A01 == AnonymousClass05K.A00 && vzK2.A03) {
                    vzK2.A03 = false;
                    VOY voy2 = vzK2.A00;
                    if (voy2 != null) {
                        C19500Wam wam2 = voy2.A00;
                        wam2.A06.DhZ(wam2);
                    }
                }
                if (vzK2.A01 != AnonymousClass05K.A01) {
                    return true;
                }
                U17 u17 = vzK2.A07;
                int i = u17.A0A;
                Scroller scroller = vzK2.A06;
                scroller.forceFinished(true);
                scroller.startScroll(0, u17.A0A, 0, u17.A02(i) - i);
                vzK2.A01 = AnonymousClass05K.A0C;
                View view2 = vzK2.A05;
                Runnable runnable = vzK2.A08;
                view2.removeCallbacks(runnable);
                view2.post(runnable);
                return true;
            case 9:
                if (1 != motionEvent.getAction()) {
                    return false;
                }
                ((C49691F2b) this.A01).A00((G8C) this.A02, AnonymousClass05K.A01);
                return false;
            case 10:
                W0K w0k = (W0K) this.A01;
                w0k.A04.requestFocus();
                if (w0k.A01) {
                    return true;
                }
                ((WBN) this.A02).A08(w0k.A02);
                return true;
            default:
                if (motionEvent.getAction() != 1 || (r2 = (1Xj) this.A02) == null) {
                    return false;
                }
                int rawX = (int) motionEvent.getRawX();
                int rawY = (int) motionEvent.getRawY();
                0sK r3 = (0sK) this.A01;
                String id = r2.getId();
                if (id != null) {
                    r3.invoke(id, Integer.valueOf(rawX), Integer.valueOf(rawY));
                    view.performClick();
                    return true;
                }
                throw AnonymousClass7TE.A0y();
        }
    }
}
