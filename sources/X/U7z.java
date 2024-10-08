package X;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.fragment.app.Fragment;

public final class U7z extends 06N {
    public final int A00;
    public final Object A01;

    public U7z(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void A01(Bundle bundle, View view, Fragment fragment, 0hq r11) {
        C227762js BD0;
        if (this.A00 != 0) {
            U7z.super.A01(bundle, view, fragment, r11);
        } else if (fragment instanceof AnonymousClass32G) {
            C15670Ugb ugb = (C15670Ugb) this.A01;
            if (fragment.equals(ugb.A01)) {
                AnonymousClass32G r4 = (AnonymousClass32G) fragment;
                0S7.A00(r4);
                ListView listView = r4.A04;
                0qQ.A07(listView);
                ListAdapter adapter = listView.getAdapter();
                if ((fragment instanceof AnonymousClass4DT) && (adapter instanceof C231302rO) && (BD0 = ((AnonymousClass4DT) fragment).BD0()) != null) {
                    BD0.A06((C231302rO) adapter, r4.getScrollingViewProxy(), 0);
                }
                listView.getViewTreeObserver().addOnGlobalLayoutListener(new WCC(2, ugb, listView, view));
            }
        }
    }

    public final void A05(Fragment fragment, 0hq r3) {
        boolean z;
        switch (this.A00) {
            case 1:
                z = fragment instanceof C14557TyM;
                break;
            case 2:
                z = fragment instanceof AnonymousClass3M3;
                break;
            default:
                U7z.super.A05(fragment, r3);
                return;
        }
        if (z && r3.A0U.A04().isEmpty()) {
            ((Activity) this.A01).finish();
        }
    }
}
