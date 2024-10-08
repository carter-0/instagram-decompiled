package X;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TimeInterpolator;
import android.graphics.Path;
import android.os.Build;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.TtI  reason: case insensitive filesystem */
public abstract class C14284TtI implements Cloneable {
    public static ThreadLocal A0Q = new ThreadLocal();
    public static final C16763V4w A0R = new C16763V4w();
    public static final int[] A0S = {2, 1, 3, 4};
    public static final Animator[] A0T = new Animator[0];
    public int A00 = 0;
    public long A01 = -1;
    public long A02;
    public long A03 = -1;
    public long A04;
    public TimeInterpolator A05 = null;
    public C16763V4w A06 = A0R;
    public V27 A07;
    public UF9 A08;
    public C14284TtI A09 = null;
    public UF5 A0A = null;
    public VXU A0B = new VXU();
    public VXU A0C = new VXU();
    public String A0D = C66581MXm.A0y(this);
    public ArrayList A0E = new ArrayList();
    public ArrayList A0F = new ArrayList();
    public ArrayList A0G;
    public ArrayList A0H;
    public ArrayList A0I = new ArrayList();
    public ArrayList A0J = new ArrayList();
    public boolean A0K = false;
    public int[] A0L = A0S;
    public ArrayList A0M = null;
    public boolean A0N = false;
    public Animator[] A0O = A0T;
    public C20991X8n[] A0P;

    public static Path A00(int i, int i2, int i3, int i4) {
        Path path = new Path();
        path.moveTo((float) i, (float) i2);
        path.lineTo((float) i3, (float) i4);
        return path;
    }

    public static 0yf A01() {
        ThreadLocal threadLocal = A0Q;
        0yf r1 = (0yf) threadLocal.get();
        if (r1 != null) {
            return r1;
        }
        01r r12 = new 01r(0);
        threadLocal.set(r12);
        return r12;
    }

    public static void A02(View view, C14286TtK ttK, VXU vxu) {
        vxu.A02.put(view, ttK);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = vxu.A00;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, (Object) null);
            } else {
                sparseArray.put(id, view);
            }
        }
        String transitionName = view.getTransitionName();
        if (transitionName != null) {
            0yf r1 = vxu.A01;
            if (r1.containsKey(transitionName)) {
                r1.put(transitionName, (Object) null);
            } else {
                r1.put(transitionName, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                01c r4 = vxu.A03;
                if (r4.A01(itemIdAtPosition) >= 0) {
                    View view2 = (View) r4.A05(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        r4.A09(itemIdAtPosition, (Object) null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                r4.A09(itemIdAtPosition, view);
            }
        }
    }

    private void A03(View view, boolean z) {
        VXU vxu;
        if (view != null) {
            view.getId();
            if (view.getParent() instanceof ViewGroup) {
                C14286TtK ttK = new C14286TtK(view);
                if (z) {
                    A0Y(ttK);
                } else {
                    A0W(ttK);
                }
                ttK.A01.add(this);
                A0X(ttK);
                if (z) {
                    vxu = this.A0C;
                } else {
                    vxu = this.A0B;
                }
                A02(view, ttK, vxu);
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    A03(viewGroup.getChildAt(i), z);
                }
            }
        }
    }

    public static void A04(XA8 xa8, C14284TtI ttI, C14284TtI ttI2, boolean z) {
        C14284TtI ttI3 = ttI.A09;
        if (ttI3 != null) {
            A04(xa8, ttI3, ttI2, z);
        }
        ArrayList arrayList = ttI.A0M;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = arrayList.size();
            C20991X8n[] x8nArr = ttI.A0P;
            if (x8nArr == null) {
                x8nArr = new C20991X8n[size];
            }
            ttI.A0P = null;
            C20991X8n[] x8nArr2 = (C20991X8n[]) arrayList.toArray(x8nArr);
            for (int i = 0; i < size; i++) {
                C20991X8n x8n = x8nArr2[i];
                switch (((C18953WEg) xa8).A00) {
                    case 0:
                        x8n.Dtr(ttI2, z);
                        break;
                    case 1:
                        x8n.Dtm(ttI2);
                        break;
                    case 2:
                        x8n.Dtl(ttI2);
                        break;
                    case 3:
                        x8n.Dtn(ttI2);
                        break;
                    default:
                        x8n.Dtp(ttI2);
                        break;
                }
                x8nArr2[i] = null;
            }
            ttI.A0P = x8nArr2;
        }
    }

    public final UF9 A05() {
        UF9 uf9 = new UF9(this);
        this.A08 = uf9;
        A0A(uf9);
        return this.A08;
    }

    public final C14284TtI A07() {
        UF5 uf5 = this.A0A;
        if (uf5 != null) {
            return uf5.A07();
        }
        return this;
    }

    public C14284TtI A08(View view) {
        this.A0J.add(view);
        return this;
    }

    public C14284TtI A09(View view) {
        this.A0J.remove(view);
        return this;
    }

    public C14284TtI A0A(C20991X8n x8n) {
        ArrayList arrayList = this.A0M;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.A0M = arrayList;
        }
        arrayList.add(x8n);
        return this;
    }

    public C14284TtI A0B(C20991X8n x8n) {
        C14284TtI ttI;
        ArrayList arrayList = this.A0M;
        if (arrayList != null) {
            if (!arrayList.remove(x8n) && (ttI = this.A09) != null) {
                ttI.A0B(x8n);
            }
            if (this.A0M.size() == 0) {
                this.A0M = null;
            }
        }
        return this;
    }

    public final C14286TtK A0C(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        UF5 uf5 = this.A0A;
        if (uf5 != null) {
            return uf5.A0C(view, z);
        }
        if (z) {
            arrayList = this.A0H;
        } else {
            arrayList = this.A0G;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            C14286TtK ttK = (C14286TtK) arrayList.get(i);
            if (ttK == null) {
                return null;
            }
            if (ttK.A00 != view) {
                i++;
            } else if (i < 0) {
                return null;
            } else {
                if (z) {
                    arrayList2 = this.A0G;
                } else {
                    arrayList2 = this.A0H;
                }
                return (C14286TtK) arrayList2.get(i);
            }
        }
        return null;
    }

    public final C14286TtK A0D(View view, boolean z) {
        VXU vxu;
        UF5 uf5 = this.A0A;
        if (uf5 != null) {
            return uf5.A0D(view, z);
        }
        if (z) {
            vxu = this.A0C;
        } else {
            vxu = this.A0B;
        }
        return (C14286TtK) vxu.A02.get(view);
    }

    public String A0E(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(C51968G9o.A16(this));
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        long j = this.A01;
        if (j != -1) {
            sb.append("dur(");
            sb.append(j);
            sb.append(") ");
        }
        long j2 = this.A03;
        if (j2 != -1) {
            sb.append("dly(");
            sb.append(j2);
            sb.append(") ");
        }
        TimeInterpolator timeInterpolator = this.A05;
        if (timeInterpolator != null) {
            sb.append("interp(");
            sb.append(timeInterpolator);
            sb.append(") ");
        }
        ArrayList arrayList = this.A0I;
        if (arrayList.size() > 0 || this.A0J.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            ArrayList arrayList2 = this.A0J;
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public void A0F() {
        ArrayList arrayList = this.A0F;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0O);
        this.A0O = A0T;
        while (true) {
            size--;
            if (size >= 0) {
                Animator animator = animatorArr[size];
                animatorArr[size] = null;
                animator.cancel();
            } else {
                this.A0O = animatorArr;
                A04(XA8.A00, this, this, false);
                return;
            }
        }
    }

    public final void A0G() {
        long j;
        if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            uf5.A04 = 0;
            UF2 uf2 = new UF2(uf5, 0);
            int i = 0;
            while (true) {
                ArrayList arrayList = uf5.A02;
                if (i < arrayList.size()) {
                    C14284TtI ttI = (C14284TtI) arrayList.get(i);
                    ttI.A0A(uf2);
                    ttI.A0G();
                    long j2 = ttI.A04;
                    boolean z = uf5.A03;
                    long j3 = uf5.A04;
                    if (z) {
                        j = Math.max(j3, j2);
                    } else {
                        ttI.A02 = j3;
                        j = j3 + j2;
                    }
                    uf5.A04 = j;
                    i++;
                } else {
                    return;
                }
            }
        } else {
            0yf A012 = A01();
            this.A04 = 0;
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0E;
                if (i2 < arrayList2.size()) {
                    Animator animator = (Animator) arrayList2.get(i2);
                    C16741V3y v3y = (C16741V3y) A012.get(animator);
                    if (!(animator == null || v3y == null)) {
                        long j4 = this.A01;
                        if (j4 >= 0) {
                            v3y.A00.setDuration(j4);
                        }
                        long j5 = this.A03;
                        if (j5 >= 0) {
                            Animator animator2 = v3y.A00;
                            animator2.setStartDelay(j5 + animator2.getStartDelay());
                        }
                        TimeInterpolator timeInterpolator = this.A05;
                        if (timeInterpolator != null) {
                            v3y.A00.setInterpolator(timeInterpolator);
                        }
                        this.A0F.add(animator);
                        this.A04 = Math.max(this.A04, animator.getTotalDuration());
                    }
                    i2++;
                } else {
                    arrayList2.clear();
                    return;
                }
            }
        }
    }

    /* JADX WARNING: type inference failed for: r2v2, types: [X.UF1, X.X8n, java.lang.Object] */
    public final void A0H() {
        ArrayList arrayList;
        if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            if (uf5.A02.isEmpty()) {
                uf5.A0K();
                uf5.A0J();
                return;
            }
            ? obj = new Object();
            obj.A00 = uf5;
            Iterator it = uf5.A02.iterator();
            while (it.hasNext()) {
                ((C14284TtI) it.next()).A0A(obj);
            }
            uf5.A01 = uf5.A02.size();
            if (!uf5.A03) {
                int i = 1;
                while (true) {
                    arrayList = uf5.A02;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ((C14284TtI) arrayList.get(i - 1)).A0A(new UF3(1, arrayList.get(i), uf5));
                    i++;
                }
                C14284TtI ttI = (C14284TtI) arrayList.get(0);
                if (ttI != null) {
                    ttI.A0H();
                    return;
                }
                return;
            }
            Iterator it2 = uf5.A02.iterator();
            while (it2.hasNext()) {
                ((C14284TtI) it2.next()).A0H();
            }
            return;
        }
        A0K();
        0yf A012 = A01();
        Iterator it3 = this.A0E.iterator();
        while (it3.hasNext()) {
            Animator animator = (Animator) it3.next();
            if (A012.containsKey(animator)) {
                A0K();
                if (animator != null) {
                    animator.addListener(new U0F(0, this, A012));
                    long j = this.A01;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.A03;
                    if (j2 >= 0) {
                        animator.setStartDelay(j2 + animator.getStartDelay());
                    }
                    TimeInterpolator timeInterpolator = this.A05;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new U0N(this, 1));
                    animator.start();
                }
            }
        }
        this.A0E.clear();
        A0J();
    }

    public final void A0I() {
        if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            uf5.A00 |= 2;
            int size = uf5.A02.size();
            for (int i = 0; i < size; i++) {
                ((C14284TtI) uf5.A02.get(i)).A0I();
            }
        }
    }

    public final void A0J() {
        int i = this.A00 - 1;
        this.A00 = i;
        if (i == 0) {
            A04(XA8.A01, this, this, false);
            int i2 = 0;
            while (true) {
                01c r1 = this.A0C.A03;
                if (i2 >= r1.A00()) {
                    break;
                }
                View view = (View) r1.A04(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
                i2++;
            }
            int i3 = 0;
            while (true) {
                01c r12 = this.A0B.A03;
                if (i3 < r12.A00()) {
                    View view2 = (View) r12.A04(i3);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                    }
                    i3++;
                } else {
                    this.A0K = true;
                    return;
                }
            }
        }
    }

    public final void A0K() {
        if (this.A00 == 0) {
            A04(XA8.A04, this, this, false);
            this.A0K = false;
        }
        this.A00++;
    }

    public final void A0L(long j) {
        if (this instanceof UF5) {
            ((UF5) this).A0d(j);
        } else {
            this.A01 = j;
        }
    }

    public final void A0M(long j, long j2) {
        long j3 = j;
        long j4 = j2;
        if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            long j5 = uf5.A04;
            if (uf5.A0A != null) {
                if (j < 0 && j2 < 0) {
                    return;
                }
                if (j > j5 && j2 > j5) {
                    return;
                }
            }
            int i = 0;
            boolean A1T = C51970G9q.A1T((j > j2 ? 1 : (j == j2 ? 0 : -1)));
            if ((j >= 0 && j2 < 0) || (j <= j5 && j2 > j5)) {
                uf5.A0K = false;
                A04(XA8.A04, uf5, uf5, A1T);
            }
            if (uf5.A03) {
                while (true) {
                    ArrayList arrayList = uf5.A02;
                    if (i >= arrayList.size()) {
                        break;
                    }
                    ((C14284TtI) arrayList.get(i)).A0M(j3, j4);
                    i++;
                }
            } else {
                int i2 = 1;
                while (true) {
                    ArrayList arrayList2 = uf5.A02;
                    if (i2 < arrayList2.size()) {
                        if (((C14284TtI) arrayList2.get(i2)).A02 > j2) {
                            break;
                        }
                        i2++;
                    } else {
                        i2 = arrayList2.size();
                        break;
                    }
                }
                int i3 = i2 - 1;
                if (j < j2) {
                    while (i3 >= 0) {
                        C14284TtI ttI = (C14284TtI) uf5.A02.get(i3);
                        long j6 = ttI.A02;
                        long j7 = j - j6;
                        ttI.A0M(j7, j2 - j6);
                        if (j7 >= 0) {
                            break;
                        }
                        i3--;
                    }
                } else {
                    while (true) {
                        ArrayList arrayList3 = uf5.A02;
                        if (i3 >= arrayList3.size()) {
                            break;
                        }
                        C14284TtI ttI2 = (C14284TtI) arrayList3.get(i3);
                        long j8 = ttI2.A02;
                        long j9 = j - j8;
                        if (j9 < 0) {
                            break;
                        }
                        ttI2.A0M(j9, j2 - j8);
                        i3++;
                    }
                }
            }
            if (uf5.A0A == null) {
                return;
            }
            if ((j > j5 && j2 <= j5) || (j < 0 && j2 >= 0)) {
                if (j > j5) {
                    uf5.A0K = true;
                }
                A04(XA8.A01, uf5, uf5, A1T);
                return;
            }
            return;
        }
        long j10 = this.A04;
        boolean A1T2 = C51970G9q.A1T((j > j2 ? 1 : (j == j2 ? 0 : -1)));
        if ((j2 < 0 && j >= 0) || (j2 > j10 && j <= j10)) {
            this.A0K = false;
            A04(XA8.A04, this, this, A1T2);
        }
        ArrayList arrayList4 = this.A0F;
        int size = arrayList4.size();
        Animator[] animatorArr = (Animator[]) arrayList4.toArray(this.A0O);
        this.A0O = A0T;
        for (int i4 = 0; i4 < size; i4++) {
            Animator animator = animatorArr[i4];
            animatorArr[i4] = null;
            ((AnimatorSet) animator).setCurrentPlayTime(Math.min(Math.max(0, j3), animator.getTotalDuration()));
        }
        this.A0O = animatorArr;
        if ((j > j10 && j2 <= j10) || (j < 0 && j2 >= 0)) {
            if (j > j10) {
                this.A0K = true;
            }
            A04(XA8.A01, this, this, A1T2);
        }
    }

    public final void A0N(TimeInterpolator timeInterpolator) {
        if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            uf5.A00 |= 1;
            ArrayList arrayList = uf5.A02;
            if (arrayList != null) {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    ((C14284TtI) uf5.A02.get(i)).A0N(timeInterpolator);
                }
            }
            uf5.A05 = timeInterpolator;
            return;
        }
        this.A05 = timeInterpolator;
    }

    public void A0O(View view) {
        if (!this.A0K) {
            ArrayList arrayList = this.A0F;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0O);
            this.A0O = A0T;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.A0O = animatorArr;
            A04(XA8.A02, this, this, false);
            this.A0N = true;
        }
    }

    public void A0P(View view) {
        if (this.A0N) {
            if (!this.A0K) {
                ArrayList arrayList = this.A0F;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.A0O);
                this.A0O = A0T;
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    Animator animator = animatorArr[size];
                    animatorArr[size] = null;
                    animator.resume();
                }
                this.A0O = animatorArr;
                A04(XA8.A03, this, this, false);
            }
            this.A0N = false;
        }
    }

    public final void A0R(ViewGroup viewGroup) {
        C16741V3y v3y;
        C14286TtK ttK;
        View view;
        View view2;
        View view3;
        this.A0H = new ArrayList();
        this.A0G = new ArrayList();
        VXU vxu = this.A0C;
        VXU vxu2 = this.A0B;
        0yf r0 = vxu.A02;
        01r r7 = new 01r(0);
        r7.A09(r0);
        0yf r02 = vxu2.A02;
        01r r4 = new 01r(0);
        r4.A09(r02);
        int i = 0;
        while (true) {
            int[] iArr = this.A0L;
            if (i >= iArr.length) {
                break;
            }
            int i2 = iArr[i];
            if (i2 == 1) {
                int size = r7.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    View view4 = (View) r7.A05(size);
                    if (view4 != null && A0b(view4) && (ttK = (C14286TtK) r4.remove(view4)) != null && A0b(ttK.A00)) {
                        this.A0H.add(r7.A04(size));
                        this.A0G.add(ttK);
                    }
                }
            } else if (i2 == 2) {
                0yf r13 = vxu.A01;
                0yf r12 = vxu2.A01;
                int size2 = r13.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    View view5 = (View) r13.A06(i3);
                    if (view5 != null && A0b(view5) && (view = (View) r12.get(r13.A05(i3))) != null && A0b(view)) {
                        Object obj = r7.get(view5);
                        Object obj2 = r4.get(view);
                        if (!(obj == null || obj2 == null)) {
                            this.A0H.add(obj);
                            this.A0G.add(obj2);
                            r7.remove(view5);
                            r4.remove(view);
                        }
                    }
                }
            } else if (i2 == 3) {
                SparseArray sparseArray = vxu.A00;
                SparseArray sparseArray2 = vxu2.A00;
                int size3 = sparseArray.size();
                for (int i4 = 0; i4 < size3; i4++) {
                    View view6 = (View) sparseArray.valueAt(i4);
                    if (view6 != null && A0b(view6) && (view2 = (View) sparseArray2.get(sparseArray.keyAt(i4))) != null && A0b(view2)) {
                        Object obj3 = r7.get(view6);
                        Object obj4 = r4.get(view2);
                        if (!(obj3 == null || obj4 == null)) {
                            this.A0H.add(obj3);
                            this.A0G.add(obj4);
                            r7.remove(view6);
                            r4.remove(view2);
                        }
                    }
                }
            } else if (i2 == 4) {
                01c r122 = vxu.A03;
                01c r11 = vxu2.A03;
                int A002 = r122.A00();
                for (int i5 = 0; i5 < A002; i5++) {
                    View view7 = (View) r122.A04(i5);
                    if (view7 != null && A0b(view7) && (view3 = (View) r11.A05(r122.A02(i5))) != null && A0b(view3)) {
                        Object obj5 = r7.get(view7);
                        Object obj6 = r4.get(view3);
                        if (!(obj5 == null || obj6 == null)) {
                            this.A0H.add(obj5);
                            this.A0G.add(obj6);
                            r7.remove(view7);
                            r4.remove(view3);
                        }
                    }
                }
            }
            i++;
        }
        for (int i6 = 0; i6 < r7.size(); i6++) {
            C14286TtK ttK2 = (C14286TtK) r7.A06(i6);
            if (A0b(ttK2.A00)) {
                this.A0H.add(ttK2);
                this.A0G.add((Object) null);
            }
        }
        for (int i7 = 0; i7 < r4.size(); i7++) {
            C14286TtK ttK3 = (C14286TtK) r4.A06(i7);
            if (A0b(ttK3.A00)) {
                this.A0G.add(ttK3);
                this.A0H.add((Object) null);
            }
        }
        0yf A012 = A01();
        int size4 = A012.size();
        ViewGroup viewGroup2 = viewGroup;
        WindowId windowId = viewGroup2.getWindowId();
        for (int i8 = size4 - 1; i8 >= 0; i8--) {
            Animator animator = (Animator) A012.A05(i8);
            if (!(animator == null || (v3y = (C16741V3y) A012.get(animator)) == null || v3y.A01 == null || !windowId.equals(v3y.A02))) {
                C14286TtK ttK4 = v3y.A04;
                View view8 = v3y.A01;
                C14286TtK A0D2 = A0D(view8, true);
                C14286TtK A0C2 = A0C(view8, true);
                if (!(A0D2 == null && A0C2 == null && (A0C2 = (C14286TtK) this.A0B.A02.get(view8)) == null) && v3y.A03.A0c(ttK4, A0C2)) {
                    C14284TtI ttI = v3y.A03;
                    if (ttI.A07().A08 != null) {
                        animator.cancel();
                        ArrayList arrayList = ttI.A0F;
                        arrayList.remove(animator);
                        A012.remove(animator);
                        if (arrayList.size() == 0) {
                            A04(XA8.A00, ttI, ttI, false);
                            if (!ttI.A0K) {
                                ttI.A0K = true;
                                A04(XA8.A01, ttI, ttI, false);
                            }
                        }
                    } else if (animator.isRunning() || animator.isStarted()) {
                        animator.cancel();
                    } else {
                        A012.remove(animator);
                    }
                }
            }
        }
        A0S(viewGroup2, this.A0C, this.A0B, this.A0H, this.A0G);
        if (this.A08 == null) {
            A0H();
        } else if (Build.VERSION.SDK_INT >= 34) {
            A0G();
            this.A08.A01();
            this.A08.A02();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v0, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v1, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v2, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v25, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v26, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v30, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v33, resolved type: android.animation.AnimatorSet} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v12, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v13, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v40, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v41, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v44, resolved type: android.animation.ObjectAnimator} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v45, resolved type: android.animation.ObjectAnimator} */
    /* JADX WARNING: type inference failed for: r9v3, types: [X.U0P, android.animation.Animator$AnimatorPauseListener, android.animation.Animator$AnimatorListener] */
    /* JADX WARNING: type inference failed for: r1v31, types: [X.V3y, java.lang.Object] */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x0104, code lost:
        if (r10 != r9) goto L_0x0106;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:209:0x009b A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00ad  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0148  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01ea  */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A0S(android.view.ViewGroup r43, X.VXU r44, X.VXU r45, java.util.ArrayList r46, java.util.ArrayList r47) {
        /*
            r42 = this;
            r5 = r42
            boolean r0 = r5 instanceof X.UF5
            r41 = r43
            r40 = r45
            r39 = r46
            r38 = r47
            if (r0 == 0) goto L_0x004d
            r10 = r5
            X.UF5 r10 = (X.UF5) r10
            long r5 = r10.A03
            java.util.ArrayList r0 = r10.A02
            int r9 = r0.size()
            r8 = 0
        L_0x001a:
            if (r8 >= r9) goto L_0x04e6
            java.util.ArrayList r0 = r10.A02
            java.lang.Object r7 = r0.get(r8)
            X.TtI r7 = (X.C14284TtI) r7
            r3 = 0
            int r0 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x0039
            boolean r0 = r10.A03
            if (r0 != 0) goto L_0x0030
            if (r8 != 0) goto L_0x0039
        L_0x0030:
            long r1 = r7.A03
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 <= 0) goto L_0x004a
            long r1 = r1 + r5
            r7.A03 = r1
        L_0x0039:
            r13 = r44
            r11 = r7
            r12 = r41
            r14 = r40
            r15 = r39
            r16 = r38
            r11.A0S(r12, r13, r14, r15, r16)
            int r8 = r8 + 1
            goto L_0x001a
        L_0x004a:
            r7.A03 = r5
            goto L_0x0039
        L_0x004d:
            X.0yf r28 = A01()
            android.util.SparseIntArray r27 = new android.util.SparseIntArray
            r27.<init>()
            int r31 = r39.size()
            X.TtI r0 = r5.A07()
            X.UF9 r0 = r0.A08
            boolean r30 = X.AnonymousClass7TF.A1V(r0)
            r16 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r29 = 0
        L_0x006b:
            r1 = r29
            r0 = r31
            if (r1 >= r0) goto L_0x04af
            r0 = r39
            java.lang.Object r7 = r0.get(r1)
            X.TtK r7 = (X.C14286TtK) r7
            r0 = r38
            java.lang.Object r6 = r0.get(r1)
            X.TtK r6 = (X.C14286TtK) r6
            if (r7 == 0) goto L_0x008c
            java.util.ArrayList r0 = r7.A01
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x008c
            r7 = 0
        L_0x008c:
            if (r6 == 0) goto L_0x0097
            java.util.ArrayList r0 = r6.A01
            boolean r0 = r0.contains(r5)
            if (r0 != 0) goto L_0x0097
            r6 = 0
        L_0x0097:
            if (r7 != 0) goto L_0x009e
            if (r6 != 0) goto L_0x00a6
        L_0x009b:
            int r29 = r29 + 1
            goto L_0x006b
        L_0x009e:
            if (r6 == 0) goto L_0x00a6
            boolean r0 = r5.A0c(r7, r6)
            if (r0 == 0) goto L_0x009b
        L_0x00a6:
            r4 = r5
            boolean r0 = r5 instanceof X.C14287TtL
            r26 = r0
            if (r0 == 0) goto L_0x01ea
            X.TtL r4 = (X.C14287TtL) r4
            if (r7 == 0) goto L_0x009b
            if (r6 == 0) goto L_0x009b
            java.util.Map r15 = r7.A02
            java.util.Map r14 = r6.A02
            java.lang.String r0 = "android:changeBounds:parent"
            java.lang.Object r1 = r15.get(r0)
            java.lang.Object r0 = r14.get(r0)
            if (r1 == 0) goto L_0x009b
            if (r0 == 0) goto L_0x009b
            android.view.View r0 = r6.A00
            r21 = r0
            java.lang.String r0 = "android:changeBounds:bounds"
            java.lang.Object r1 = r15.get(r0)
            android.graphics.Rect r1 = (android.graphics.Rect) r1
            java.lang.Object r0 = r14.get(r0)
            android.graphics.Rect r0 = (android.graphics.Rect) r0
            int r12 = r1.left
            int r11 = r0.left
            int r10 = r1.top
            int r9 = r0.top
            int r8 = r1.right
            int r3 = r0.right
            int r2 = r1.bottom
            int r1 = r0.bottom
            int r20 = r8 - r12
            int r19 = r2 - r10
            int r18 = r3 - r11
            int r13 = r1 - r9
            java.lang.String r0 = "android:changeBounds:clip"
            java.lang.Object r15 = r15.get(r0)
            java.lang.Object r14 = r14.get(r0)
            if (r20 == 0) goto L_0x00fd
            if (r19 != 0) goto L_0x0101
        L_0x00fd:
            if (r18 == 0) goto L_0x01e7
            if (r13 == 0) goto L_0x01e7
        L_0x0101:
            if (r12 != r11) goto L_0x0106
            r0 = 0
            if (r10 == r9) goto L_0x0107
        L_0x0106:
            r0 = 1
        L_0x0107:
            if (r8 != r3) goto L_0x010b
            if (r2 == r1) goto L_0x010d
        L_0x010b:
            int r0 = r0 + 1
        L_0x010d:
            if (r15 == 0) goto L_0x01e1
            boolean r14 = r15.equals(r14)
            if (r14 == 0) goto L_0x01e3
        L_0x0115:
            if (r0 <= 0) goto L_0x009b
            r14 = 2
            X.V4c r32 = X.C17158VKk.A02
            r33 = r21
            r34 = r12
            r35 = r10
            r36 = r8
            r37 = r2
            r32.A05(r33, r34, r35, r36, r37)
            if (r0 != r14) goto L_0x01cd
            r14 = r20
            r0 = r18
            if (r14 != r0) goto L_0x019b
            r0 = r19
            if (r0 != r13) goto L_0x019b
            android.graphics.Path r3 = A00(r12, r10, r11, r9)
            android.util.Property r2 = X.C14287TtL.A02
        L_0x0139:
            r1 = 0
            r0 = r21
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofObject(r0, r2, r1, r3)
        L_0x0140:
            android.view.ViewParent r0 = r21.getParent()
            boolean r0 = r0 instanceof android.view.ViewGroup
            if (r0 == 0) goto L_0x015e
            android.view.ViewParent r3 = r21.getParent()
            android.view.ViewGroup r3 = (android.view.ViewGroup) r3
            r0 = 1
            X.VJL.A00(r3, r0)
            X.TtI r1 = r4.A07()
            X.UF7 r0 = new X.UF7
            r0.<init>(r3)
            r1.A0A(r0)
        L_0x015e:
            if (r2 == 0) goto L_0x009b
            if (r6 == 0) goto L_0x0465
            android.view.View r4 = r6.A00
            if (r26 == 0) goto L_0x0192
            java.lang.String[] r11 = X.C14287TtL.A05
        L_0x0168:
            r6 = r2
            if (r11 == 0) goto L_0x0468
            int r10 = r11.length
            if (r10 <= 0) goto L_0x0468
            X.TtK r7 = new X.TtK
            r7.<init>(r4)
            r0 = r40
            X.0yf r0 = r0.A02
            java.lang.Object r9 = r0.get(r4)
            X.TtK r9 = (X.C14286TtK) r9
            if (r9 == 0) goto L_0x0433
            r8 = 0
        L_0x0180:
            java.util.Map r3 = r7.A02
            r1 = r11[r8]
            java.util.Map r0 = r9.A02
            java.lang.Object r0 = r0.get(r1)
            r3.put(r1, r0)
            int r8 = r8 + 1
            if (r8 >= r10) goto L_0x0433
            goto L_0x0180
        L_0x0192:
            boolean r0 = r5 instanceof X.UF6
            if (r0 == 0) goto L_0x0199
            java.lang.String[] r11 = X.UF6.A01
            goto L_0x0168
        L_0x0199:
            r11 = 0
            goto L_0x0168
        L_0x019b:
            X.Vax r13 = new X.Vax
            r0 = r21
            r13.<init>(r0)
            android.graphics.Path r9 = A00(r12, r10, r11, r9)
            android.util.Property r0 = X.C14287TtL.A04
            r10 = 0
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofObject(r13, r0, r10, r9)
            android.graphics.Path r1 = A00(r8, r2, r3, r1)
            android.util.Property r0 = X.C14287TtL.A01
            android.animation.ObjectAnimator r0 = android.animation.ObjectAnimator.ofObject(r13, r0, r10, r1)
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[]{r9, r0}
            r2.playTogether(r0)
            X.U06 r0 = new X.U06
            r0.<init>(r13, r4)
            r2.addListener(r0)
            goto L_0x0140
        L_0x01cd:
            if (r12 != r11) goto L_0x01d9
            if (r10 != r9) goto L_0x01d9
            android.graphics.Path r3 = A00(r8, r2, r3, r1)
            android.util.Property r2 = X.C14287TtL.A00
            goto L_0x0139
        L_0x01d9:
            android.graphics.Path r3 = A00(r12, r10, r11, r9)
            android.util.Property r2 = X.C14287TtL.A03
            goto L_0x0139
        L_0x01e1:
            if (r14 == 0) goto L_0x0115
        L_0x01e3:
            int r0 = r0 + 1
            goto L_0x0115
        L_0x01e7:
            r0 = 0
            goto L_0x010d
        L_0x01ea:
            boolean r0 = r5 instanceof X.UF6
            if (r0 == 0) goto L_0x009b
            X.UF6 r4 = (X.UF6) r4
            X.Va3 r1 = X.UF6.A01(r7, r6)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x009b
            android.view.ViewGroup r0 = r1.A03
            if (r0 != 0) goto L_0x0200
            android.view.ViewGroup r0 = r1.A02
            if (r0 == 0) goto L_0x009b
        L_0x0200:
            boolean r0 = r1.A04
            if (r0 == 0) goto L_0x0266
            int r0 = r4.A00
            r9 = 1
            r0 = r0 & 1
            if (r0 != r9) goto L_0x009b
            if (r6 == 0) goto L_0x009b
            if (r7 != 0) goto L_0x022a
            android.view.View r0 = r6.A00
            android.view.ViewParent r2 = r0.getParent()
            android.view.View r2 = (android.view.View) r2
            r0 = 0
            X.TtK r1 = r4.A0C(r2, r0)
            X.TtK r0 = r4.A0D(r2, r0)
            X.Va3 r0 = X.UF6.A01(r1, r0)
            boolean r0 = r0.A05
            if (r0 == 0) goto L_0x022a
            goto L_0x009b
        L_0x022a:
            android.view.View r8 = r6.A00
            android.util.Property r0 = X.C17158VKk.A00
            r2 = 0
            if (r7 == 0) goto L_0x023f
            java.util.Map r1 = r7.A02
            java.lang.String r0 = "android:fade:transitionAlpha"
            java.lang.Number r0 = X.C51966G9m.A14(r0, r1)
            if (r0 == 0) goto L_0x023f
            float r2 = r0.floatValue()
        L_0x023f:
            r3 = 1065353216(0x3f800000, float:1.0)
            int r0 = (r2 > r3 ? 1 : (r2 == r3 ? 0 : -1))
            if (r0 == 0) goto L_0x009b
            X.V4c r0 = X.C17158VKk.A02
            r0.A03(r8, r2)
            android.util.Property r2 = X.C17158VKk.A01
            float[] r1 = new float[r9]
            r0 = 0
            r1[r0] = r3
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r8, r2, r1)
            X.U0O r1 = new X.U0O
            r1.<init>(r8)
            r2.addListener(r1)
            X.TtI r0 = r4.A07()
            r0.A0A(r1)
            goto L_0x015e
        L_0x0266:
            int r3 = r1.A00
            int r0 = r4.A00
            r25 = 2
            r1 = r0 & 2
            r13 = 0
            r0 = r25
            if (r1 != r0) goto L_0x009b
            if (r7 == 0) goto L_0x009b
            android.view.View r8 = r7.A00
            if (r6 == 0) goto L_0x0430
            android.view.View r11 = r6.A00
        L_0x027b:
            r24 = 2131440637(0x7f0b33fd, float:1.8503263E38)
            r0 = r24
            java.lang.Object r1 = r8.getTag(r0)
            android.view.View r1 = (android.view.View) r1
            r10 = 0
            r9 = 1
            if (r1 == 0) goto L_0x02af
            r12 = 1
        L_0x028b:
            android.animation.ObjectAnimator r2 = r4.A0d(r1, r7, r6)
            if (r12 != 0) goto L_0x015e
            if (r2 != 0) goto L_0x029c
            android.view.ViewGroupOverlay r0 = r41.getOverlay()
            r0.remove(r1)
            goto L_0x009b
        L_0x029c:
            r0 = r24
            r8.setTag(r0, r1)
            X.U0P r9 = new X.U0P
            r0 = r41
            r9.<init>(r1, r8, r0, r4)
            r2.addListener(r9)
            r2.addPauseListener(r9)
            goto L_0x02d3
        L_0x02af:
            if (r11 == 0) goto L_0x02dc
            android.view.ViewParent r0 = r11.getParent()
            if (r0 == 0) goto L_0x042a
            r0 = 4
            if (r3 == r0) goto L_0x02bc
            if (r8 != r11) goto L_0x02dc
        L_0x02bc:
            int r1 = r11.getVisibility()
            X.V4c r0 = X.C17158VKk.A02
            r0.A04(r11, r10)
            android.animation.ObjectAnimator r2 = r4.A0d(r11, r7, r6)
            if (r2 == 0) goto L_0x0496
            X.U0Q r9 = new X.U0Q
            r9.<init>(r11, r3)
            r2.addListener(r9)
        L_0x02d3:
            X.TtI r0 = r4.A07()
            r0.A0A(r9)
            goto L_0x015e
        L_0x02dc:
            android.view.ViewParent r0 = r8.getParent()
            if (r0 != 0) goto L_0x031a
            r12 = 0
            r1 = r8
        L_0x02e4:
            java.util.Map r2 = r7.A02
            java.lang.String r0 = "android:visibility:screenLocation"
            java.lang.Object r0 = r2.get(r0)
            int[] r0 = (int[]) r0
            r3 = r0[r10]
            r2 = r0[r9]
            r0 = r25
            int[] r11 = new int[r0]
            r0 = r41
            r0.getLocationOnScreen(r11)
            r0 = r11[r10]
            int r3 = r3 - r0
            int r0 = r1.getLeft()
            int r3 = r3 - r0
            r1.offsetLeftAndRight(r3)
            r0 = r11[r9]
            int r2 = r2 - r0
            int r0 = r1.getTop()
            int r2 = r2 - r0
            r1.offsetTopAndBottom(r2)
            android.view.ViewGroupOverlay r0 = r41.getOverlay()
            r0.add(r1)
            goto L_0x028b
        L_0x031a:
            android.view.ViewParent r0 = r8.getParent()
            boolean r0 = r0 instanceof android.view.View
            if (r0 == 0) goto L_0x009b
            android.view.ViewParent r2 = r8.getParent()
            android.view.View r2 = (android.view.View) r2
            X.TtK r1 = r4.A0D(r2, r9)
            X.TtK r0 = r4.A0C(r2, r9)
            X.Va3 r0 = X.UF6.A01(r1, r0)
            boolean r0 = r0.A05
            if (r0 != 0) goto L_0x049b
            android.graphics.Matrix r12 = new android.graphics.Matrix
            r12.<init>()
            int r0 = r2.getScrollX()
            int r0 = -r0
            float r1 = (float) r0
            int r0 = r2.getScrollY()
            int r0 = -r0
            float r0 = (float) r0
            r12.setTranslate(r1, r0)
            X.V4c r1 = X.C17158VKk.A02
            r1.A01(r12, r8)
            r0 = r41
            r1.A02(r12, r0)
            int r0 = r8.getWidth()
            float r2 = (float) r0
            int r0 = r8.getHeight()
            float r1 = (float) r0
            r0 = 0
            android.graphics.RectF r14 = new android.graphics.RectF
            r14.<init>(r0, r0, r2, r1)
            r12.mapRect(r14)
            float r0 = r14.left
            int r23 = java.lang.Math.round(r0)
            float r0 = r14.top
            int r22 = java.lang.Math.round(r0)
            float r0 = r14.right
            int r21 = java.lang.Math.round(r0)
            float r0 = r14.bottom
            int r20 = java.lang.Math.round(r0)
            android.content.Context r0 = r8.getContext()
            android.widget.ImageView r11 = new android.widget.ImageView
            r11.<init>(r0)
            android.widget.ImageView$ScaleType r0 = android.widget.ImageView.ScaleType.CENTER_CROP
            r11.setScaleType(r0)
            boolean r0 = r8.isAttachedToWindow()
            r1 = 1
            r19 = r0 ^ 1
            r3 = 0
            boolean r0 = r41.isAttachedToWindow()
            if (r0 != 0) goto L_0x039e
            r1 = 0
        L_0x039e:
            if (r19 == 0) goto L_0x042e
            if (r1 == 0) goto L_0x0412
            android.view.ViewParent r2 = r8.getParent()
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = r2.indexOfChild(r8)
            android.view.ViewGroupOverlay r0 = r41.getOverlay()
            r0.add(r8)
        L_0x03b3:
            float r0 = r14.width()
            int r15 = java.lang.Math.round(r0)
            float r0 = r14.height()
            int r1 = java.lang.Math.round(r0)
            if (r15 <= 0) goto L_0x0401
            if (r1 <= 0) goto L_0x0401
            r18 = 1065353216(0x3f800000, float:1.0)
            r13 = 1233125376(0x49800000, float:1048576.0)
            int r0 = r15 * r1
            float r0 = (float) r0
            float r13 = r13 / r0
            r0 = r18
            float r13 = java.lang.Math.min(r0, r13)
            float r0 = (float) r15
            int r15 = X.AnonymousClass7TE.A05(r0, r13)
            float r0 = (float) r1
            int r1 = X.AnonymousClass7TE.A05(r0, r13)
            float r0 = r14.left
            float r0 = -r0
            float r14 = r14.top
            float r14 = -r14
            r12.postTranslate(r0, r14)
            r12.postScale(r13, r13)
            android.graphics.Picture r0 = new android.graphics.Picture
            r0.<init>()
            android.graphics.Canvas r1 = r0.beginRecording(r15, r1)
            r1.concat(r12)
            r8.draw(r1)
            r0.endRecording()
            android.graphics.Bitmap r13 = android.graphics.Bitmap.createBitmap(r0)
        L_0x0401:
            if (r19 == 0) goto L_0x040d
            android.view.ViewGroupOverlay r0 = r41.getOverlay()
            r0.remove(r8)
            r2.addView(r8, r3)
        L_0x040d:
            if (r13 == 0) goto L_0x0412
            r11.setImageBitmap(r13)
        L_0x0412:
            int r0 = r21 - r23
            r2 = 1073741824(0x40000000, float:2.0)
            int r1 = android.view.View.MeasureSpec.makeMeasureSpec(r0, r2)
            int r0 = r20 - r22
            X.C13988Tno.A11(r11, r0, r2, r1)
            r3 = r23
            r2 = r22
            r1 = r21
            r0 = r20
            r11.layout(r3, r2, r1, r0)
        L_0x042a:
            r12 = 0
            r1 = r11
            goto L_0x02e4
        L_0x042e:
            r2 = r13
            goto L_0x03b3
        L_0x0430:
            r11 = r13
            goto L_0x027b
        L_0x0433:
            int r8 = r28.size()
            r3 = 0
        L_0x0438:
            if (r3 >= r8) goto L_0x0469
            r0 = r28
            java.lang.Object r1 = r0.A05(r3)
            java.lang.Object r9 = r0.get(r1)
            X.V3y r9 = (X.C16741V3y) r9
            X.TtK r0 = r9.A04
            if (r0 == 0) goto L_0x0462
            android.view.View r0 = r9.A01
            if (r0 != r4) goto L_0x0462
            java.lang.String r1 = r9.A05
            java.lang.String r0 = r5.A0D
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x0462
            X.TtK r0 = r9.A04
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x0462
            goto L_0x009b
        L_0x0462:
            int r3 = r3 + 1
            goto L_0x0438
        L_0x0465:
            r6 = r2
            android.view.View r4 = r7.A00
        L_0x0468:
            r7 = 0
        L_0x0469:
            java.lang.String r3 = r5.A0D
            android.view.WindowId r0 = r41.getWindowId()
            X.V3y r1 = new X.V3y
            r1.<init>()
            r1.A01 = r4
            r1.A05 = r3
            r1.A04 = r7
            r1.A02 = r0
            r1.A03 = r5
            r1.A00 = r2
            if (r30 == 0) goto L_0x048a
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r2.play(r6)
        L_0x048a:
            r0 = r28
            r0.put(r2, r1)
            java.util.ArrayList r0 = r5.A0E
            r0.add(r2)
            goto L_0x009b
        L_0x0496:
            r0.A04(r11, r1)
            goto L_0x009b
        L_0x049b:
            int r1 = r2.getId()
            android.view.ViewParent r0 = r2.getParent()
            if (r0 != 0) goto L_0x009b
            r0 = -1
            if (r1 == r0) goto L_0x009b
            r0 = r41
            r0.findViewById(r1)
            goto L_0x009b
        L_0x04af:
            int r0 = r27.size()
            if (r0 == 0) goto L_0x04e6
            r6 = 0
        L_0x04b6:
            int r0 = r27.size()
            if (r6 >= r0) goto L_0x04e6
            r0 = r27
            int r1 = r0.keyAt(r6)
            java.util.ArrayList r0 = r5.A0E
            java.lang.Object r1 = r0.get(r1)
            r0 = r28
            java.lang.Object r1 = r0.get(r1)
            X.V3y r1 = (X.C16741V3y) r1
            r0 = r27
            int r0 = r0.valueAt(r6)
            long r3 = (long) r0
            long r3 = r3 - r16
            android.animation.Animator r2 = r1.A00
            long r0 = r2.getStartDelay()
            long r3 = r3 + r0
            r2.setStartDelay(r3)
            int r6 = r6 + 1
            goto L_0x04b6
        L_0x04e6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14284TtI.A0S(android.view.ViewGroup, X.VXU, X.VXU, java.util.ArrayList, java.util.ArrayList):void");
    }

    public final void A0T(ViewGroup viewGroup, boolean z) {
        VXU vxu;
        VXU vxu2;
        VXU vxu3;
        if (z) {
            this.A0C.A02.clear();
            this.A0C.A00.clear();
            vxu = this.A0C;
        } else {
            this.A0B.A02.clear();
            this.A0B.A00.clear();
            vxu = this.A0B;
        }
        vxu.A03.A07();
        ArrayList arrayList = this.A0I;
        if (arrayList.size() > 0 || this.A0J.size() > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                View findViewById = viewGroup.findViewById(((Number) arrayList.get(i)).intValue());
                if (findViewById != null) {
                    C14286TtK ttK = new C14286TtK(findViewById);
                    if (z) {
                        A0Y(ttK);
                    } else {
                        A0W(ttK);
                    }
                    ttK.A01.add(this);
                    A0X(ttK);
                    if (z) {
                        vxu3 = this.A0C;
                    } else {
                        vxu3 = this.A0B;
                    }
                    A02(findViewById, ttK, vxu3);
                }
            }
            int i2 = 0;
            while (true) {
                ArrayList arrayList2 = this.A0J;
                if (i2 < arrayList2.size()) {
                    View view = (View) arrayList2.get(i2);
                    C14286TtK ttK2 = new C14286TtK(view);
                    if (z) {
                        A0Y(ttK2);
                    } else {
                        A0W(ttK2);
                    }
                    ttK2.A01.add(this);
                    A0X(ttK2);
                    if (z) {
                        vxu2 = this.A0C;
                    } else {
                        vxu2 = this.A0B;
                    }
                    A02(view, ttK2, vxu2);
                    i2++;
                } else {
                    return;
                }
            }
        } else {
            A03(viewGroup, z);
        }
    }

    public void A0U(C16763V4w v4w) {
        if (v4w == null) {
            v4w = A0R;
        }
        this.A06 = v4w;
    }

    public final void A0V(V27 v27) {
        if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            uf5.A07 = v27;
            uf5.A00 |= 8;
            int size = uf5.A02.size();
            for (int i = 0; i < size; i++) {
                ((C14284TtI) uf5.A02.get(i)).A0V(v27);
            }
            return;
        }
        this.A07 = v27;
    }

    public final void A0W(C14286TtK ttK) {
        if (this instanceof UF6) {
            UF6.A02(ttK);
        } else if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            View view = ttK.A00;
            if (uf5.A0b(view)) {
                Iterator it = uf5.A02.iterator();
                while (it.hasNext()) {
                    C14284TtI ttI = (C14284TtI) it.next();
                    if (ttI.A0b(view)) {
                        ttI.A0W(ttK);
                        ttK.A01.add(ttI);
                    }
                }
            }
        } else {
            C14287TtL.A01(ttK);
        }
    }

    public final void A0X(C14286TtK ttK) {
        if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            int size = uf5.A02.size();
            for (int i = 0; i < size; i++) {
                ((C14284TtI) uf5.A02.get(i)).A0X(ttK);
            }
        }
    }

    public final void A0Y(C14286TtK ttK) {
        float f;
        if (this instanceof UF6) {
            UF6.A02(ttK);
            View view = ttK.A00;
            Object tag = view.getTag(R.id.transition_pause_alpha);
            if (tag == null) {
                if (view.getVisibility() == 0) {
                    f = C17158VKk.A02.A00(view);
                } else {
                    f = 0.0f;
                }
                tag = Float.valueOf(f);
            }
            ttK.A02.put("android:fade:transitionAlpha", tag);
        } else if (this instanceof UF5) {
            UF5 uf5 = (UF5) this;
            View view2 = ttK.A00;
            if (uf5.A0b(view2)) {
                Iterator it = uf5.A02.iterator();
                while (it.hasNext()) {
                    C14284TtI ttI = (C14284TtI) it.next();
                    if (ttI.A0b(view2)) {
                        ttI.A0Y(ttK);
                        ttK.A01.add(ttI);
                    }
                }
            }
        } else {
            C14287TtL.A01(ttK);
        }
    }

    public final boolean A0Z() {
        if (!(this instanceof UF5)) {
            return DbT.A1b(this.A0F);
        }
        UF5 uf5 = (UF5) this;
        int i = 0;
        while (true) {
            ArrayList arrayList = uf5.A02;
            if (i >= arrayList.size()) {
                return false;
            }
            if (((C14284TtI) arrayList.get(i)).A0Z()) {
                return true;
            }
            i++;
        }
    }

    public final boolean A0a() {
        if (this instanceof UF5) {
            ArrayList arrayList = ((UF5) this).A02;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (!((C14284TtI) arrayList.get(i)).A0a()) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0007, code lost:
        if (r9 == null) goto L_0x0009;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean A0c(X.C14286TtK r8, X.C14286TtK r9) {
        /*
            r7 = this;
            boolean r0 = r7 instanceof X.UF6
            r6 = 0
            if (r0 == 0) goto L_0x001d
            if (r8 != 0) goto L_0x000a
            if (r9 != 0) goto L_0x0075
        L_0x0009:
            return r6
        L_0x000a:
            if (r9 == 0) goto L_0x0075
            java.util.Map r0 = r9.A02
            java.lang.String r2 = "android:visibility:visibility"
            boolean r1 = r0.containsKey(r2)
            java.util.Map r0 = r8.A02
            boolean r0 = r0.containsKey(r2)
            if (r1 == r0) goto L_0x0075
            return r6
        L_0x001d:
            if (r8 == 0) goto L_0x0009
            if (r9 == 0) goto L_0x0009
            boolean r0 = r7 instanceof X.C14287TtL
            if (r0 == 0) goto L_0x004b
            java.lang.String[] r5 = X.C14287TtL.A05
            r4 = 5
            r3 = 0
        L_0x0029:
            r2 = r5[r3]
            java.util.Map r0 = r8.A02
            java.lang.Object r1 = r0.get(r2)
            java.util.Map r0 = r9.A02
            java.lang.Object r0 = r0.get(r2)
            if (r1 != 0) goto L_0x0040
            if (r0 != 0) goto L_0x0085
        L_0x003b:
            int r3 = r3 + 1
            if (r3 >= r4) goto L_0x0009
            goto L_0x0029
        L_0x0040:
            if (r0 == 0) goto L_0x0085
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x003b
            goto L_0x0085
        L_0x004b:
            java.util.Map r4 = r8.A02
            java.util.Iterator r3 = X.DbV.A16(r4)
        L_0x0051:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0009
            java.lang.Object r2 = r3.next()
            java.lang.Object r1 = r4.get(r2)
            java.util.Map r0 = r9.A02
            java.lang.Object r0 = r0.get(r2)
            if (r1 != 0) goto L_0x006a
            if (r0 != 0) goto L_0x0085
            goto L_0x0051
        L_0x006a:
            if (r0 == 0) goto L_0x0085
            boolean r0 = r1.equals(r0)
            r0 = r0 ^ 1
            if (r0 == 0) goto L_0x0051
            goto L_0x0085
        L_0x0075:
            X.Va3 r1 = X.UF6.A01(r8, r9)
            boolean r0 = r1.A05
            if (r0 == 0) goto L_0x0009
            int r0 = r1.A01
            if (r0 == 0) goto L_0x0085
            int r0 = r1.A00
            if (r0 != 0) goto L_0x0009
        L_0x0085:
            r6 = 1
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C14284TtI.A0c(X.TtK, X.TtK):boolean");
    }

    public final String toString() {
        return A0E("");
    }

    /* renamed from: A06 */
    public C14284TtI clone() {
        try {
            C14284TtI ttI = (C14284TtI) super.clone();
            ttI.A0E = new ArrayList();
            ttI.A0C = new VXU();
            ttI.A0B = new VXU();
            ttI.A0H = null;
            ttI.A0G = null;
            ttI.A08 = null;
            ttI.A09 = this;
            ttI.A0M = null;
            return ttI;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void A0Q(ViewGroup viewGroup) {
        0yf A012 = A01();
        int size = A012.size();
        if (size != 0) {
            WindowId windowId = viewGroup.getWindowId();
            01r r2 = new 01r(0);
            r2.A09(A012);
            A012.clear();
            while (true) {
                size--;
                if (size >= 0) {
                    C16741V3y v3y = (C16741V3y) r2.A06(size);
                    if (v3y.A01 != null && windowId.equals(v3y.A02)) {
                        ((Animator) r2.A05(size)).end();
                    }
                } else {
                    return;
                }
            }
        }
    }

    public final boolean A0b(View view) {
        int id = view.getId();
        ArrayList arrayList = this.A0I;
        if ((arrayList.size() != 0 || this.A0J.size() != 0) && !arrayList.contains(Integer.valueOf(id)) && !this.A0J.contains(view)) {
            return false;
        }
        return true;
    }
}
