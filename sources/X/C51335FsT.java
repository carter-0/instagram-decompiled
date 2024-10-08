package X;

import android.widget.ListView;
import com.instagram.business.fragment.CategorySearchFragment;

/* renamed from: X.FsT  reason: case insensitive filesystem */
public final class C51335FsT implements Runnable {
    public final /* synthetic */ CategorySearchFragment A00;
    public final /* synthetic */ Integer A01;

    public C51335FsT(CategorySearchFragment categorySearchFragment, Integer num) {
        this.A00 = categorySearchFragment;
        this.A01 = num;
    }

    public final void run() {
        ListView listView = this.A00.categoriesListView;
        0qQ.A0A(listView);
        listView.setSelection(this.A01.intValue());
    }
}
