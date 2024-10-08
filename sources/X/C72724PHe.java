package X;

import android.view.View;
import android.widget.AdapterView;
import java.util.List;

/* renamed from: X.PHe  reason: case insensitive filesystem */
public final class C72724PHe implements G77, AdapterView.OnItemSelectedListener {
    public final /* synthetic */ C69098Ned A00;

    public final void onNothingSelected(AdapterView adapterView) {
    }

    public final void onSearchCleared(String str) {
        0qQ.A0B(str, 0);
        onSearchTextChanged(str);
    }

    public final void onSearchTextChanged(String str) {
        N9T n9t;
        0qQ.A0B(str, 0);
        C69098Ned ned = this.A00;
        ned.A02 = str;
        N9T n9t2 = (N9T) ned.A01;
        if (n9t2 != null) {
            List A002 = C69098Ned.A00(ned);
            String str2 = n9t2.A00;
            String str3 = n9t2.A01;
            List list = n9t2.A03;
            AnonymousClass7TF.A1C(str2, 0, list);
            n9t = new N9T(str2, str3, A002, list);
        } else {
            n9t = null;
        }
        ned.A0J(n9t);
    }

    public C72724PHe(C69098Ned ned) {
        this.A00 = ned;
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        N9T n9t;
        C69098Ned ned = this.A00;
        ned.A00 = i;
        N9T n9t2 = (N9T) ned.A01;
        if (n9t2 != null) {
            List A002 = C69098Ned.A00(ned);
            String str = n9t2.A00;
            String str2 = n9t2.A01;
            List list = n9t2.A03;
            AnonymousClass7TF.A1C(str, 0, list);
            n9t = new N9T(str, str2, A002, list);
        } else {
            n9t = null;
        }
        ned.A0J(n9t);
    }
}
