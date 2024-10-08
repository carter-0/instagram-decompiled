package X;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import java.util.List;
import java.util.Map;

/* renamed from: X.LYx  reason: case insensitive filesystem */
public final class C64297LYx implements ViewTreeObserver.OnGlobalLayoutListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C64297LYx(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj;
        this.A02 = obj2;
        this.A01 = i;
    }

    public final void onGlobalLayout() {
        ViewTreeObserver viewTreeObserver;
        C66539MVt mVt;
        C60036Jdo jdo;
        int A002;
        List list;
        RecyclerView A0F;
        switch (this.A00) {
            case 0:
                U6C u6c = (U6C) this.A03;
                C51967G9n.A0y(u6c, this);
                V4Z v4z = ((VUN) this.A02).A02;
                if (!(v4z == null || (list = v4z.A04) == null)) {
                    u6c.A03(list);
                }
                Drawable progressDrawable = u6c.getProgressDrawable();
                int i = u6c.getProgressDrawable().getBounds().left;
                int i2 = u6c.getProgressDrawable().getBounds().left;
                Context A0S = AnonymousClass7TE.A0S(u6c);
                int A003 = i2 + U6C.A00(A0S, 4);
                int i3 = u6c.getProgressDrawable().getBounds().right;
                int i4 = this.A01;
                if (i4 == 0) {
                    A002 = JTO.A06(u6c.getProgressDrawable());
                } else {
                    A002 = i4 - U6C.A00(A0S, 4);
                }
                progressDrawable.setBounds(i, A003, i3, A002);
                return;
            case 1:
                View view = (View) this.A03;
                C51967G9n.A0y(view, this);
                Rect A0W = AnonymousClass7TE.A0W();
                View view2 = (View) this.A02;
                View view3 = view2;
                view2.getHitRect(A0W);
                while (true) {
                    ViewParent parent = view3.getParent();
                    if (0qQ.A0K(parent, view) || !(parent instanceof View)) {
                        int i5 = A0W.left;
                        int i6 = this.A01;
                        A0W.left = i5 - i6;
                        A0W.top -= i6;
                        A0W.right += i6;
                        A0W.bottom += i6;
                        TouchDelegate touchDelegate = new TouchDelegate(A0W, view2);
                        TouchDelegate touchDelegate2 = view.getTouchDelegate();
                    } else {
                        view3 = (View) parent;
                        A0W.offset(view3.getLeft(), view3.getTop());
                    }
                }
                int i52 = A0W.left;
                int i62 = this.A01;
                A0W.left = i52 - i62;
                A0W.top -= i62;
                A0W.right += i62;
                A0W.bottom += i62;
                TouchDelegate touchDelegate3 = new TouchDelegate(A0W, view2);
                TouchDelegate touchDelegate22 = view.getTouchDelegate();
                if (!(touchDelegate22 instanceof C60036Jdo) || (jdo = (C60036Jdo) touchDelegate22) == null) {
                    jdo = new C60036Jdo(view);
                }
                Map map = jdo.A00;
                if (!map.containsKey(Integer.valueOf(view2.getId()))) {
                    C51967G9n.A1O(touchDelegate3, map, view2.getId());
                }
                view.setTouchDelegate(jdo);
                return;
            case 2:
                ((C353308Hc) this.A03).A01.A08(this.A01);
                viewTreeObserver = ((View) this.A02).getViewTreeObserver();
                break;
            case 3:
                C64908Lk8 lk8 = (C64908Lk8) this.A03;
                RecyclerView recyclerView = lk8.A04;
                int i7 = this.A01;
                C249703kE A0W2 = recyclerView.A0W(i7);
                if (!(A0W2 instanceof C60511Jmi) || (mVt = ((C60511Jmi) A0W2).A00) == null) {
                    KB5 kb5 = ((L01) this.A02).A00;
                    kb5.A0U.A0M();
                    kb5.A0R.setVisibility(0);
                } else {
                    if (!2Ht.A02(lk8.A05)) {
                        mVt.CnG();
                    }
                    mVt.E2V(new C64914LkE((L01) this.A02, lk8, i7));
                }
                viewTreeObserver = lk8.CEp();
                break;
            default:
                C322936we r3 = (C322936we) this.A03;
                View view4 = r3.A0C.mView;
                if (view4 != null && (A0F = DbZ.A0F(view4, R.id.highlights_reel_tray_recycler_view)) != null && A0F.getHeight() != 0 && !r3.A07.A0A()) {
                    List list2 = r3.A03;
                    if (list2 != null) {
                        list2.remove(this);
                    }
                    int i8 = this.A01;
                    A0F.A0p(i8);
                    if (A0F.A0W(i8) != null) {
                        C51967G9n.A0y(view4, this);
                        ((A8s) this.A02).A00(A0F);
                        return;
                    }
                    return;
                }
                return;
        }
        viewTreeObserver.removeOnGlobalLayoutListener(this);
    }
}
