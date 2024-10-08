package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

public final class UEt extends C238073Al {
    public final /* synthetic */ C252553pI A00;
    public final /* synthetic */ 2We A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public UEt(C252553pI r1, RecyclerView recyclerView, 2We r3) {
        super(recyclerView);
        this.A01 = r3;
        this.A00 = r1;
    }

    public final void A0Y(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
        List list;
        super.A0Y(view, accessibilityNodeInfoCompat);
        2We r1 = this.A01;
        synchronized (r1) {
            list = r1.A0i;
        }
        int size = list.size();
        C252553pI r2 = this.A00;
        int i = 1;
        if (r2.A1Y()) {
            i = size;
        }
        if (!r2.A1X()) {
            size = 1;
        }
        accessibilityNodeInfoCompat.mInfo.setCollectionInfo(AccessibilityNodeInfo.CollectionInfo.obtain(i, size, false, 0));
    }
}
