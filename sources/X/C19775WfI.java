package X;

import android.view.View;
import com.instagram.analytics.eventlog.EventLogListFragment;
import com.instagram.ui.widget.typeahead.TypeaheadHeader;

/* renamed from: X.WfI  reason: case insensitive filesystem */
public final class C19775WfI implements G6X {
    public final int A00;
    public final Object A01;

    public C19775WfI(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final View getRowView() {
        TypeaheadHeader typeaheadHeader;
        if (this.A00 != 0) {
            typeaheadHeader = ((C15389Ubr) this.A01).A01;
            if (typeaheadHeader == null) {
                throw new IllegalStateException(C66579MXk.A00(8));
            }
        } else {
            typeaheadHeader = ((EventLogListFragment) this.A01).A03;
            if (typeaheadHeader == null) {
                throw new IllegalStateException(C66579MXk.A00(8));
            }
        }
        return typeaheadHeader;
    }
}
