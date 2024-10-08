package X;

import android.view.View;
import android.view.ViewGroup;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewGroupManager;
import com.google.android.material.button.MaterialButton;
import java.util.Comparator;

/* renamed from: X.WqM  reason: case insensitive filesystem */
public final class C20381WqM implements Comparator {
    public final int A00;
    public final Object A01;

    public C20381WqM(0sL r1, int i) {
        this.A00 = i;
        this.A01 = r1;
    }

    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        switch (this.A00) {
            case 0:
                return ((int[]) obj)[0] - ((int[]) obj2)[0];
            case 1:
                long A002 = ((C17847Vh0) obj).A00();
                long A003 = ((C17847Vh0) obj2).A00();
                if (A002 < A003) {
                    return -1;
                }
                if (A003 == A002) {
                    return 0;
                }
                return 1;
            case 2:
                return ((AnonymousClass8KU) obj).CED().A00 - ((AnonymousClass8KU) obj2).CED().A00;
            case 4:
                View view = (View) obj2;
                Integer viewZIndex = ViewGroupManager.getViewZIndex((View) obj);
                Integer A0k = C51967G9n.A0k();
                if (viewZIndex == null) {
                    viewZIndex = A0k;
                }
                Integer viewZIndex2 = ViewGroupManager.getViewZIndex(view);
                if (viewZIndex2 != null) {
                    A0k = viewZIndex2;
                }
                return viewZIndex.intValue() - A0k.intValue();
            case 5:
                return ((ReadableMap) obj).getInt("index") - ((ReadableMap) obj2).getInt("index");
            case 6:
                MaterialButton materialButton = (MaterialButton) obj;
                MaterialButton materialButton2 = (MaterialButton) obj2;
                int compareTo = Boolean.valueOf(materialButton.isChecked()).compareTo(Boolean.valueOf(materialButton2.isChecked()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(materialButton.isPressed()).compareTo(Boolean.valueOf(materialButton2.isPressed()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                ViewGroup viewGroup = (ViewGroup) this.A01;
                return Integer.valueOf(viewGroup.indexOfChild(materialButton)).compareTo(Integer.valueOf(viewGroup.indexOfChild(materialButton2)));
            case 9:
                return (((1Xj) obj).A1A() > ((1Xj) obj2).A1A() ? 1 : (((1Xj) obj).A1A() == ((1Xj) obj2).A1A() ? 0 : -1));
            case 10:
                return ((Comparable) obj).compareTo(obj2);
            default:
                return AnonymousClass7TE.A0M(((0sL) this.A01).invoke(obj, obj2));
        }
    }

    public C20381WqM(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }
}
