package X;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.AbstractCollection;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.4CO  reason: invalid class name */
public abstract class AnonymousClass4CO extends AnonymousClass3AR {
    public ArrayList A00 = new ArrayList();
    public ArrayList A01 = new ArrayList();
    public ArrayList A02 = new ArrayList();
    public ArrayList A03 = new ArrayList();
    public ArrayList A04 = new ArrayList();
    public ArrayList A05 = new ArrayList();
    public ArrayList A06 = new ArrayList();
    public ArrayList A07 = new ArrayList();
    public ArrayList A08 = new ArrayList();
    public ArrayList A09 = new ArrayList();
    public ArrayList A0A = new ArrayList();
    public TimeInterpolator A0B;

    public void A0Z(C249703kE r9, int i, int i2, int i3, int i4) {
        C249703kE r4 = r9;
        View view = r9.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.A04.add(r9);
        animate.setDuration(A08()).setListener(new C14040Toh(view, animate, r4, this, i5, i6)).start();
    }

    private boolean A05(C249703kE r5, V4L v4l) {
        if (v4l.A04 == r5) {
            v4l.A04 = null;
        } else if (v4l.A05 != r5) {
            return false;
        } else {
            v4l.A05 = null;
        }
        r5.itemView.setAlpha(1.0f);
        r5.itemView.setTranslationX(0.0f);
        r5.itemView.setTranslationY(0.0f);
        A0C(r5);
        return true;
    }

    public final void A0I() {
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C249703kE r1 = ((C16737V3u) arrayList.get(size)).A04;
            View view = r1.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            A0P(r1);
            arrayList.remove(size);
        }
        ArrayList arrayList2 = this.A09;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            A0Q((C249703kE) arrayList2.get(size2));
            arrayList2.remove(size2);
        }
        ArrayList arrayList3 = this.A06;
        int size3 = arrayList3.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            C249703kE r12 = (C249703kE) arrayList3.get(size3);
            r12.itemView.setAlpha(1.0f);
            A0O(r12);
            arrayList3.remove(size3);
        }
        ArrayList arrayList4 = this.A07;
        int size4 = arrayList4.size();
        while (true) {
            size4--;
            if (size4 < 0) {
                break;
            }
            V4L v4l = (V4L) arrayList4.get(size4);
            C249703kE r0 = v4l.A05;
            if (r0 != null) {
                A05(r0, v4l);
            }
            C249703kE r02 = v4l.A04;
            if (r02 != null) {
                A05(r02, v4l);
            }
        }
        arrayList4.clear();
        if (A0L()) {
            ArrayList arrayList5 = this.A05;
            int size5 = arrayList5.size();
            while (true) {
                size5--;
                if (size5 < 0) {
                    break;
                }
                AbstractList abstractList = (AbstractList) arrayList5.get(size5);
                int size6 = abstractList.size();
                while (true) {
                    size6--;
                    if (size6 >= 0) {
                        C249703kE r13 = ((C16737V3u) abstractList.get(size6)).A04;
                        View view2 = r13.itemView;
                        view2.setTranslationY(0.0f);
                        view2.setTranslationX(0.0f);
                        A0P(r13);
                        abstractList.remove(size6);
                        if (abstractList.isEmpty()) {
                            arrayList5.remove(abstractList);
                        }
                    }
                }
            }
            ArrayList arrayList6 = this.A01;
            int size7 = arrayList6.size();
            while (true) {
                size7--;
                if (size7 < 0) {
                    break;
                }
                AbstractList abstractList2 = (AbstractList) arrayList6.get(size7);
                int size8 = abstractList2.size();
                while (true) {
                    size8--;
                    if (size8 >= 0) {
                        C249703kE r14 = (C249703kE) abstractList2.get(size8);
                        r14.itemView.setAlpha(1.0f);
                        A0O(r14);
                        abstractList2.remove(size8);
                        if (abstractList2.isEmpty()) {
                            arrayList6.remove(abstractList2);
                        }
                    }
                }
            }
            ArrayList arrayList7 = this.A03;
            int size9 = arrayList7.size();
            while (true) {
                size9--;
                if (size9 >= 0) {
                    AbstractList abstractList3 = (AbstractList) arrayList7.get(size9);
                    int size10 = abstractList3.size();
                    while (true) {
                        size10--;
                        if (size10 >= 0) {
                            V4L v4l2 = (V4L) abstractList3.get(size10);
                            C249703kE r03 = v4l2.A05;
                            if (r03 != null) {
                                A05(r03, v4l2);
                            }
                            C249703kE r04 = v4l2.A04;
                            if (r04 != null) {
                                A05(r04, v4l2);
                            }
                            if (abstractList3.isEmpty()) {
                                arrayList7.remove(abstractList3);
                            }
                        }
                    }
                } else {
                    A03(this.A0A);
                    A03(this.A04);
                    A03(this.A00);
                    A03(this.A02);
                    A0A();
                    return;
                }
            }
        }
    }

    public void A0J() {
        long j;
        long j2;
        ArrayList arrayList = this.A09;
        boolean z = !arrayList.isEmpty();
        ArrayList arrayList2 = this.A08;
        boolean z2 = !arrayList2.isEmpty();
        ArrayList arrayList3 = this.A07;
        boolean z3 = !arrayList3.isEmpty();
        ArrayList arrayList4 = this.A06;
        boolean z4 = !arrayList4.isEmpty();
        if (z || z2 || z4 || z3) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                A0X((C249703kE) it.next());
            }
            arrayList.clear();
            if (z2) {
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(arrayList2);
                this.A05.add(arrayList5);
                arrayList2.clear();
                C20165WmP wmP = new C20165WmP(this, arrayList5);
                if (z) {
                    ((C16737V3u) arrayList5.get(0)).A04.itemView.postOnAnimationDelayed(wmP, A09());
                } else {
                    wmP.run();
                }
            }
            if (z3) {
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(arrayList3);
                this.A03.add(arrayList6);
                arrayList3.clear();
                C20166WmQ wmQ = new C20166WmQ(this, arrayList6);
                if (z) {
                    ((V4L) arrayList6.get(0)).A05.itemView.postOnAnimationDelayed(wmQ, A09());
                } else {
                    wmQ.run();
                }
            }
            if (z4) {
                ArrayList arrayList7 = new ArrayList();
                arrayList7.addAll(arrayList4);
                this.A01.add(arrayList7);
                arrayList4.clear();
                C14046Ton ton = new C14046Ton(this, arrayList7);
                if (z || z2 || z3) {
                    long j3 = 0;
                    if (z) {
                        j = A09();
                    } else {
                        j = 0;
                    }
                    if (z2) {
                        j2 = A08();
                    } else {
                        j2 = 0;
                    }
                    if (z3) {
                        j3 = A07();
                    }
                    ((C249703kE) arrayList7.get(0)).itemView.postOnAnimationDelayed(ton, j + Math.max(j2, j3));
                    return;
                }
                ton.run();
            }
        }
    }

    public final void A0K(C249703kE r9) {
        View view = r9.itemView;
        view.animate().cancel();
        ArrayList arrayList = this.A08;
        int size = arrayList.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (((C16737V3u) arrayList.get(size)).A04 == r9) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                A0P(r9);
                arrayList.remove(size);
            }
        }
        A02(r9, this.A07);
        if (this.A09.remove(r9)) {
            view.setAlpha(1.0f);
            A0Q(r9);
        }
        if (this.A06.remove(r9)) {
            view.setAlpha(1.0f);
            A0O(r9);
        }
        ArrayList arrayList2 = this.A03;
        int size2 = arrayList2.size();
        while (true) {
            size2--;
            if (size2 < 0) {
                break;
            }
            ArrayList arrayList3 = (ArrayList) arrayList2.get(size2);
            A02(r9, arrayList3);
            if (arrayList3.isEmpty()) {
                arrayList2.remove(size2);
            }
        }
        ArrayList arrayList4 = this.A05;
        int size3 = arrayList4.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            AbstractList abstractList = (AbstractList) arrayList4.get(size3);
            int size4 = abstractList.size();
            while (true) {
                size4--;
                if (size4 < 0) {
                    break;
                } else if (((C16737V3u) abstractList.get(size4)).A04 == r9) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    A0P(r9);
                    abstractList.remove(size4);
                    if (abstractList.isEmpty()) {
                        arrayList4.remove(size3);
                    }
                }
            }
        }
        ArrayList arrayList5 = this.A01;
        int size5 = arrayList5.size();
        while (true) {
            size5--;
            if (size5 >= 0) {
                AbstractCollection abstractCollection = (AbstractCollection) arrayList5.get(size5);
                if (abstractCollection.remove(r9)) {
                    view.setAlpha(1.0f);
                    A0O(r9);
                    if (abstractCollection.isEmpty()) {
                        arrayList5.remove(size5);
                    }
                }
            } else {
                this.A0A.remove(r9);
                this.A00.remove(r9);
                this.A02.remove(r9);
                this.A04.remove(r9);
                A0V();
                return;
            }
        }
    }

    public final boolean A0L() {
        if (!this.A06.isEmpty() || !this.A07.isEmpty() || !this.A08.isEmpty() || !this.A09.isEmpty() || !this.A04.isEmpty() || !this.A0A.isEmpty() || !this.A00.isEmpty() || !this.A02.isEmpty() || !this.A05.isEmpty() || !this.A01.isEmpty() || !this.A03.isEmpty()) {
            return true;
        }
        return false;
    }

    public void A0W(C249703kE r6) {
        View view = r6.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A00.add(r6);
        animate.alpha(1.0f).setDuration(A06()).setListener(new C14041Toi(view, animate, r6, this)).start();
    }

    public void A0X(C249703kE r5) {
        View view = r5.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.A0A.add(r5);
        animate.setDuration(A09()).alpha(0.0f).setListener(new C14047Too(view, animate, r5, this)).start();
    }

    public void A0Y(C249703kE r3) {
        if (this.A0B == null) {
            this.A0B = new ValueAnimator().getInterpolator();
        }
        r3.itemView.animate().setInterpolator(this.A0B);
        A0K(r3);
    }

    public final void A0a(V4L v4l) {
        View view;
        C249703kE r0 = v4l.A05;
        View view2 = null;
        if (r0 == null) {
            view = null;
        } else {
            view = r0.itemView;
        }
        C249703kE r02 = v4l.A04;
        if (r02 != null) {
            view2 = r02.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(A07());
            this.A02.add(v4l.A05);
            duration.translationX((float) (v4l.A02 - v4l.A00));
            duration.translationY((float) (v4l.A03 - v4l.A01));
            duration.alpha(0.0f).setListener(new U0I(view, duration, v4l, this)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.A02.add(v4l.A04);
            animate.translationX(0.0f).translationY(0.0f).setDuration(A07()).alpha(1.0f).setListener(new U0J(view2, animate, v4l, this)).start();
        }
    }

    private void A02(C249703kE r4, List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                V4L v4l = (V4L) list.get(size);
                if (A05(r4, v4l) && v4l.A05 == null && v4l.A04 == null) {
                    list.remove(v4l);
                }
            } else {
                return;
            }
        }
    }

    public static final void A03(List list) {
        int size = list.size();
        while (true) {
            size--;
            if (size >= 0) {
                ((C249703kE) list.get(size)).itemView.animate().cancel();
            } else {
                return;
            }
        }
    }

    public boolean A0R(C249703kE r3) {
        A0Y(r3);
        r3.itemView.setAlpha(0.0f);
        this.A06.add(r3);
        return true;
    }

    public boolean A0S(C249703kE r2) {
        A0Y(r2);
        this.A09.add(r2);
        return true;
    }

    public final void A0V() {
        if (!A0L()) {
            A0A();
        }
    }
}
