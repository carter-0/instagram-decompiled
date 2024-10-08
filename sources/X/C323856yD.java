package X;

import android.database.DataSetObserver;
import com.google.android.material.tabs.TabLayout;

/* renamed from: X.6yD  reason: invalid class name and case insensitive filesystem */
public final class C323856yD extends DataSetObserver {
    public final /* synthetic */ TabLayout A00;

    public C323856yD(TabLayout tabLayout) {
        this.A00 = tabLayout;
    }

    public final void onChanged() {
        this.A00.A08();
    }

    public final void onInvalidated() {
        this.A00.A08();
    }
}
