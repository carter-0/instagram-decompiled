package X;

import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import com.instagram.igds.components.textcell.IgdsListCell;

public final class U31 extends View.AccessibilityDelegate {
    public final /* synthetic */ IgdsListCell A00;
    public final /* synthetic */ boolean A01;

    public U31(IgdsListCell igdsListCell, boolean z) {
        this.A01 = z;
        this.A00 = igdsListCell;
    }

    public final void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfo accessibilityNodeInfo) {
        boolean A1Z = AnonymousClass7TG.A1Z(view, accessibilityNodeInfo);
        super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        accessibilityNodeInfo.setCheckable(A1Z);
        accessibilityNodeInfo.setChecked(this.A01);
        C69349Njo njo = this.A00.A0G;
        if (njo != C69349Njo.TYPE_UNKNOWN) {
            accessibilityNodeInfo.setClassName(C226302gX.A01(njo.A00));
        }
    }
}
