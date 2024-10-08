package X;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;

/* renamed from: X.Tp2  reason: case insensitive filesystem */
public final class C14054Tp2 extends LinearLayoutManager {
    public final /* synthetic */ ViewPager2 A00;

    public final boolean A0x(Rect rect, View view, RecyclerView recyclerView, boolean z, boolean z2) {
        return false;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C14054Tp2(Context context, ViewPager2 viewPager2) {
        super(context);
        this.A00 = viewPager2;
    }

    public final void A0m(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AnonymousClass3AN r11, AnonymousClass3AW r12) {
        int i;
        int i2;
        ViewPager2 viewPager2 = this.A00.A09.A04;
        if (viewPager2.getOrientation() == 1) {
            i = C252553pI.A06(view);
        } else {
            i = 0;
        }
        if (viewPager2.getOrientation() == 0) {
            i2 = C252553pI.A06(view);
        } else {
            i2 = 0;
        }
        accessibilityNodeInfoCompat.mInfo.setCollectionItemInfo(AccessibilityNodeInfo.CollectionItemInfo.obtain(i, 1, i2, 1, false, false));
    }

    public final void A1s(AnonymousClass3AW r4, int[] iArr) {
        ViewPager2 viewPager2 = this.A00;
        int i = viewPager2.A01;
        if (i == -1) {
            super.A1s(r4, iArr);
            return;
        }
        int pageSize = viewPager2.getPageSize() * i;
        iArr[0] = pageSize;
        iArr[1] = pageSize;
    }

    public final boolean A0y(Bundle bundle, AnonymousClass3AN r3, AnonymousClass3AW r4, int i) {
        return super.A0y(bundle, r3, r4, i);
    }

    public final void A17(AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, AnonymousClass3AN r2, AnonymousClass3AW r3) {
        super.A17(accessibilityNodeInfoCompat, r2, r3);
    }
}
