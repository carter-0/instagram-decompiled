package X;

import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.widget.TextView;

/* renamed from: X.Oka  reason: case insensitive filesystem */
public final class C71435Oka implements View.OnTouchListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C71435Oka(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj4;
        this.A04 = obj2;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        ViewParent parent;
        ViewParent parent2;
        ViewParent parent3;
        ViewParent parent4;
        ViewParent parent5;
        ViewParent parent6;
        ViewParent parent7;
        switch (this.A00) {
            case 0:
                if (((GestureDetector) this.A01).onTouchEvent(motionEvent)) {
                    return false;
                }
                int action = motionEvent.getAction();
                if (action == 0) {
                    ((0rh) this.A02).A00 = motionEvent.getX();
                    ((0rh) this.A03).A00 = motionEvent.getY();
                } else if (action == 1) {
                    ((0rh) this.A02).A00 = 0.0f;
                    ((0rh) this.A03).A00 = 0.0f;
                    return false;
                } else if (action != 2) {
                    return false;
                } else {
                    if (AnonymousClass7TE.A00(motionEvent.getX(), ((0rh) this.A02).A00) > AnonymousClass7TE.A00(motionEvent.getY(), ((0rh) this.A03).A00)) {
                        ViewParent parent8 = view.getParent();
                        if (parent8 == null || (parent5 = parent8.getParent()) == null || (parent6 = parent5.getParent()) == null || (parent7 = parent6.getParent()) == null) {
                            return false;
                        }
                        parent7.requestDisallowInterceptTouchEvent(false);
                        return false;
                    }
                }
                int i = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                TextView textView = ((C67969Mxt) this.A04).A00;
                if (textView.getLineCount() <= textView.getMaxLines() || (parent = view.getParent()) == null || (parent2 = parent.getParent()) == null || (parent3 = parent2.getParent()) == null || (parent4 = parent3.getParent()) == null) {
                    return false;
                }
                parent4.requestDisallowInterceptTouchEvent(true);
                return false;
            case 1:
                if (!182.A06(0Tu.A05, (0lg) this.A04, 36317431707604107L)) {
                    return false;
                }
                break;
            case 2:
                if (182.A06(0Tu.A05, (0lg) this.A04, 36317431707931790L)) {
                    return false;
                }
                break;
            default:
                return false;
        }
        1Xj BPf = ((C296925qs) this.A03).BPf();
        0qQ.A0A(view);
        0qQ.A0A(motionEvent);
        ((WW4) this.A01).DQs(motionEvent, view, (C296995qz) this.A02, BPf);
        return false;
    }
}
