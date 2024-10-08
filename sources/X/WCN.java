package X;

import android.animation.AnimatorSet;
import android.view.View;
import android.view.ViewTreeObserver;
import com.instagram.ui.widget.expanding.ExpandingListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public final class WCN implements ViewTreeObserver.OnPreDrawListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ ViewTreeObserver A02;
    public final /* synthetic */ ExpandingListView A03;
    public final /* synthetic */ HashMap A04;

    public WCN(View view, ViewTreeObserver viewTreeObserver, ExpandingListView expandingListView, HashMap hashMap, int i) {
        this.A03 = expandingListView;
        this.A02 = viewTreeObserver;
        this.A01 = view;
        this.A04 = hashMap;
        this.A00 = i;
    }

    public final boolean onPreDraw() {
        this.A02.removeOnPreDrawListener(this);
        ArrayList arrayList = new ArrayList();
        ExpandingListView expandingListView = this.A03;
        View view = this.A01;
        int indexOfChild = expandingListView.indexOfChild(view);
        if (indexOfChild >= 0) {
            int i = indexOfChild - 1;
            if (expandingListView.getChildAt(i) != null) {
                View childAt = expandingListView.getChildAt(i);
                int childCount = expandingListView.getChildCount();
                int top = view.getTop();
                HashMap hashMap = this.A04;
                Object obj = hashMap.get(view);
                obj.getClass();
                int i2 = top - ((int[]) obj)[0];
                HashSet hashSet = new HashSet();
                while (indexOfChild < childCount) {
                    View childAt2 = expandingListView.getChildAt(indexOfChild);
                    int[] iArr = (int[]) hashMap.get(childAt2);
                    hashSet.add(childAt2);
                    if (iArr == null) {
                        int top2 = childAt2.getTop();
                        int i3 = this.A00;
                        childAt2.setTop(top2 - i3);
                        childAt2.setBottom(childAt2.getBottom() - i3);
                    } else {
                        childAt2.setTop(iArr[0]);
                        childAt2.setBottom(iArr[1]);
                    }
                    if (childAt2.getParent() == null) {
                        expandingListView.A02.add(childAt2);
                        float f = (float) this.A00;
                        arrayList.add(ExpandingListView.A00(childAt2, childAt, f, f, i2));
                    } else {
                        if (childAt2 != view) {
                            float f2 = (float) this.A00;
                            arrayList.add(ExpandingListView.A00(childAt2, childAt, f2, f2, i2));
                        }
                        childAt2.setHasTransientState(false);
                    }
                    indexOfChild++;
                }
                Iterator A0u = Pxf.A0u(hashMap);
                while (A0u.hasNext()) {
                    View A0H = JTO.A0H(A0u);
                    if (!hashSet.contains(A0H) && A0H != childAt) {
                        Object obj2 = hashMap.get(A0H);
                        obj2.getClass();
                        A0H.setTop(((int[]) obj2)[0]);
                        Object obj3 = hashMap.get(A0H);
                        obj3.getClass();
                        A0H.setBottom(((int[]) obj3)[1]);
                        expandingListView.A02.add(A0H);
                        float f3 = (float) this.A00;
                        arrayList.add(ExpandingListView.A00(A0H, childAt, f3, f3, i2));
                    }
                }
                arrayList.add(ExpandingListView.A00(view, childAt, 0.0f, (float) this.A00, i2));
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(arrayList);
                U0N.A00(animatorSet, this, 22);
                animatorSet.start();
            }
        }
        return true;
    }
}
