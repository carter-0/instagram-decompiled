package X;

import android.view.View;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.common.session.UserSession;
import com.instagram.direct.model.DirectThreadThemeInfo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* renamed from: X.4CN  reason: invalid class name */
public final class AnonymousClass4CN extends AnonymousClass4CO {
    public boolean A00 = false;
    public final Map A01 = new HashMap();
    public final WeakHashMap A02 = new WeakHashMap();
    public final int A03;
    public final UserSession A04;
    public final AnonymousClass7N3 A05;

    public final void A0J() {
        if (!this.A00) {
            this.A00 = true;
            return;
        }
        ArrayList arrayList = this.A09;
        if (!arrayList.isEmpty()) {
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C249703kE r1 = (C249703kE) it.next();
                Number number = (Number) this.A02.get(r1);
                if (number == null) {
                    number = -1;
                }
                if (A01(r1, number.intValue())) {
                    break;
                }
            }
        }
        ArrayList arrayList2 = this.A06;
        if (!arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                C249703kE r12 = (C249703kE) it2.next();
                if (A00(r12, r12.getBindingAdapterPosition())) {
                    super.A0J();
                    return;
                }
            }
        }
        Iterator it3 = arrayList.iterator();
        while (it3.hasNext()) {
            A0X((C249703kE) it3.next());
        }
        arrayList.clear();
        ArrayList arrayList3 = this.A08;
        Iterator it4 = arrayList3.iterator();
        while (it4.hasNext()) {
            C16737V3u v3u = (C16737V3u) it4.next();
            A0Z(v3u.A04, v3u.A00, v3u.A01, v3u.A02, v3u.A03);
        }
        arrayList3.clear();
        ArrayList arrayList4 = this.A07;
        Iterator it5 = arrayList4.iterator();
        while (it5.hasNext()) {
            A0a((V4L) it5.next());
        }
        arrayList4.clear();
        Iterator it6 = arrayList2.iterator();
        while (it6.hasNext()) {
            A0W((C249703kE) it6.next());
        }
        arrayList2.clear();
    }

    public final void A0W(C249703kE r9) {
        C328287Ef r7;
        C249703kE r5 = r9;
        if (A00(r9, r9.getBindingAdapterPosition())) {
            super.A0W(r9);
            return;
        }
        View view = r9.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A00.add(r9);
        if (r9 instanceof C328287Ef) {
            r7 = (C328287Ef) r5;
            if (r7 != null) {
                A0b(animate, r9, r7.BzG().A05(), r7);
            }
        } else {
            r7 = null;
        }
        animate.alpha(1.0f).translationY(0.0f).setDuration(A06()).setListener(new U0M(view, animate, r5, this, r7)).start();
    }

    private boolean A00(C249703kE r7, int i) {
        if (!(r7 instanceof AnonymousClass7PY)) {
            ViewParent parent = r7.itemView.getParent();
            if (parent == null) {
                0f9 AEf = 0wj.A01.AEf("InsertFromBottomItemAnimator unexpected null recycler view.", 20134884);
                AEf.ABO("holderPosition", i);
                AEf.report();
            } else {
                RecyclerView recyclerView = (RecyclerView) parent;
                int i2 = this.A03;
                int i3 = i2 + 1;
                if (i == i3 && (r7 instanceof AnonymousClass7PI)) {
                    C249703kE A0W = recyclerView.A0W(i2);
                    if (A0W != null && !this.A02.containsKey(A0W)) {
                        return A00(A0W, i2);
                    }
                } else if (i == i2) {
                    C249703kE A0W2 = recyclerView.A0W(i3);
                    if (A0W2 == null) {
                        return false;
                    }
                    if (!(A0W2 instanceof AnonymousClass7PI) || (A0W2 = recyclerView.A0W(i3 + 1)) != null) {
                        return !this.A02.containsKey(A0W2);
                    }
                }
            }
        }
        return true;
    }

    private boolean A01(C249703kE r4, int i) {
        if (!(r4 instanceof AnonymousClass7PY) || i != 1) {
            if (i == 0) {
                return false;
            }
            return true;
        } else if (!(r4 instanceof AnonymousClass7PI)) {
            return true;
        } else {
            ViewParent parent = r4.itemView.getParent();
            parent.getClass();
            C249703kE A0W = ((RecyclerView) parent).A0W(0);
            if (A0W == null) {
                return false;
            }
            return A01(A0W, 0);
        }
    }

    public final void A0M(C249703kE r3) {
        C328287Ef r32;
        this.A02.put(r3, Integer.valueOf(r3.getBindingAdapterPosition()));
        if (this.A01.remove(r3) != null) {
            r3.itemView.setTranslationY(0.0f);
        }
        if ((r3 instanceof C328287Ef) && (r32 = (C328287Ef) r3) != null) {
            r32.EI5();
        }
    }

    public final void A0N(C249703kE r3) {
        C328287Ef r32;
        this.A02.put(r3, Integer.valueOf(r3.getBindingAdapterPosition()));
        this.A01.remove(r3);
        if ((r3 instanceof C328287Ef) && (r32 = (C328287Ef) r3) != null) {
            r32.EI5();
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.V3u] */
    public final boolean A0R(C249703kE r9) {
        C328287Ef r2;
        ViewParent parent = r9.itemView.getParent();
        parent.getClass();
        RecyclerView recyclerView = (RecyclerView) parent;
        int i = this.A03;
        int i2 = i + 1;
        if (!this.A00 || (r9 instanceof AnonymousClass7PS)) {
            A0O(r9);
            return true ^ this.A00;
        } else if (A00(r9, r9.getBindingAdapterPosition())) {
            return super.A0R(r9);
        } else {
            A0Y(r9);
            r9.itemView.setAlpha(0.0f);
            int height = recyclerView.getHeight();
            int top = r9.itemView.getTop();
            ? obj = new Object();
            obj.A04 = r9;
            obj.A00 = 0;
            obj.A01 = height;
            obj.A02 = 0;
            obj.A03 = top;
            if (r9.getBindingAdapterPosition() == i) {
                C249703kE A0W = recyclerView.A0W(i2);
                if (A0W instanceof AnonymousClass7PI) {
                    obj.A01 += A0W.itemView.getHeight();
                }
            }
            r9.itemView.setTranslationY((float) (obj.A01 - obj.A03));
            this.A01.put(r9, obj);
            this.A06.add(r9);
            if (!(r9 instanceof C328287Ef) || (r2 = (C328287Ef) r9) == null) {
                return true;
            }
            A0b((ViewPropertyAnimator) null, r9, r2.BzG().A05(), r2);
            return true;
        }
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [java.lang.Object, X.V3u] */
    public final boolean A0S(C249703kE r8) {
        C328287Ef r3;
        C249703kE r2;
        WeakHashMap weakHashMap = this.A02;
        Number number = (Number) weakHashMap.get(r8);
        if (number == null) {
            number = -1;
        }
        if (!this.A00 || (r8 instanceof AnonymousClass7PS)) {
            A0Q(r8);
            return true ^ this.A00;
        }
        int intValue = number.intValue();
        if (A01(r8, intValue)) {
            return super.A0S(r8);
        }
        A0Y(r8);
        r8.itemView.setAlpha(1.0f);
        ViewParent parent = r8.itemView.getParent();
        parent.getClass();
        int top = r8.itemView.getTop();
        int height = ((View) parent).getHeight();
        ? obj = new Object();
        obj.A04 = r8;
        obj.A00 = 0;
        obj.A01 = top;
        obj.A02 = 0;
        obj.A03 = height;
        if (intValue == 0) {
            Iterator it = weakHashMap.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    r2 = null;
                    break;
                }
                Map.Entry entry = (Map.Entry) it.next();
                if (((Number) entry.getValue()).intValue() == 1) {
                    r2 = (C249703kE) entry.getKey();
                    break;
                }
            }
            if (r2 instanceof AnonymousClass7PI) {
                obj.A03 += r2.itemView.getHeight();
            }
        }
        r8.itemView.offsetTopAndBottom(obj.A03 - obj.A01);
        r8.itemView.setTranslationY((float) (obj.A01 - obj.A03));
        this.A01.put(r8, obj);
        this.A09.add(r8);
        if (!(r8 instanceof C328287Ef) || (r3 = (C328287Ef) r8) == null) {
            return true;
        }
        C242553Us r22 = new C242553Us();
        r22.A08(r3.BKr(), AnonymousClass05K.A00);
        A0b((ViewPropertyAnimator) null, r8, r22, r3);
        return true;
    }

    public final void A0X(C249703kE r6) {
        C328287Ef r1;
        Number number = (Number) this.A02.get(r6);
        if (number == null) {
            number = -1;
        }
        if (A01(r6, number.intValue())) {
            super.A0X(r6);
            return;
        }
        View view = r6.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A0A.add(r6);
        if ((r6 instanceof C328287Ef) && (r1 = (C328287Ef) r6) != null) {
            C242553Us A052 = r1.BKr().A05();
            r1.Ehf(A052);
            A0b(animate, r6, A052, r1);
        }
        animate.translationY(0.0f).alpha(0.0f).setDuration(A09()).setListener(new U0L(view, animate, r6, this)).start();
    }

    public final void A0Z(C249703kE r16, int i, int i2, int i3, int i4) {
        C328287Ef r6;
        C249703kE r4 = r16;
        int i5 = i4;
        int i6 = i3;
        int i7 = i;
        int i8 = i2;
        if (!(r4 instanceof C328287Ef) || (r6 = (C328287Ef) r4) == null) {
            super.A0Z(r4, i7, i8, i6, i5);
            return;
        }
        View view = r4.itemView;
        int i9 = i3 - i;
        int i10 = i4 - i2;
        if (i9 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i10 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.A04.add(r4);
        A0b(animate, r4, r6.BKr().A04(), r6);
        animate.setDuration(A08()).setListener(new C14048Tos(view, animate, r4, this, r6, i9, i10)).start();
    }

    public final void A0b(ViewPropertyAnimator viewPropertyAnimator, C249703kE r5, C242553Us r6, C328287Ef r7) {
        C14039Tog tog;
        DirectThreadThemeInfo directThreadThemeInfo;
        View view = r5.itemView;
        AnonymousClass7L2 r0 = this.A05.A00.A0j.A0M.A04;
        if (r0 == null || (directThreadThemeInfo = r0.A08) == null || !(!AnonymousClass3S1.A04(directThreadThemeInfo.A0s)) || !(!AnonymousClass3S1.A04(directThreadThemeInfo.A0q))) {
            tog = null;
        } else {
            tog = new C14039Tog(view, r7);
            r7.CsL(view.getY());
        }
        if (!r6.equals(r7.BzG())) {
            if (viewPropertyAnimator == null) {
                r7.FM4(r6, 0.0f);
            } else {
                viewPropertyAnimator.setUpdateListener(new C71166Oef(tog, r6, r7));
            }
        } else if (viewPropertyAnimator != null && tog != null) {
            viewPropertyAnimator.setUpdateListener(tog);
        }
    }

    public AnonymousClass4CN(UserSession userSession, AnonymousClass7N3 r3, int i) {
        this.A0B = new LinearInterpolator();
        this.A05 = r3;
        this.A03 = i;
        this.A04 = userSession;
    }

    public final void A0Y(C249703kE r4) {
        super.A0Y(r4);
        View view = r4.itemView;
        if (view.getTranslationY() != 0.0f) {
            view.setTranslationY(0.0f);
        }
        if (view.getTranslationX() != 0.0f) {
            view.setTranslationX(0.0f);
        }
    }
}
