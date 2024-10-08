package X;

import android.database.DataSetObserver;
import android.widget.Adapter;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

/* renamed from: X.75Y  reason: invalid class name */
public final class AnonymousClass75Y extends DataSetObserver {
    public final /* synthetic */ Adapter A00;
    public final /* synthetic */ C329307Ij A01;

    public AnonymousClass75Y(Adapter adapter, C329307Ij r2) {
        this.A01 = r2;
        this.A00 = adapter;
    }

    public final void onChanged() {
        super.onChanged();
        Adapter adapter = this.A00;
        C329307Ij r0 = this.A01;
        int count = adapter.getCount();
        ComposerAutoCompleteTextView composerAutoCompleteTextView = r0.A0S;
        int i = composerAutoCompleteTextView.A01;
        int i2 = r0.A02;
        int min = Math.min(i2, i * count);
        composerAutoCompleteTextView.setDropDownVerticalOffset(i2 - min);
        composerAutoCompleteTextView.setDropDownHeight(Math.max(-1, min));
    }
}
