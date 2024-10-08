package X;

import android.view.View;
import androidx.transition.FragmentTransitionSupport;
import java.util.ArrayList;

/* renamed from: X.WEf  reason: case insensitive filesystem */
public final class C18952WEf implements C20991X8n {
    public final /* synthetic */ View A00;
    public final /* synthetic */ FragmentTransitionSupport A01;
    public final /* synthetic */ ArrayList A02;

    public final void Dtl(C14284TtI ttI) {
    }

    public final void Dtn(C14284TtI ttI) {
    }

    public final void Dtp(C14284TtI ttI) {
    }

    public C18952WEf(View view, FragmentTransitionSupport fragmentTransitionSupport, ArrayList arrayList) {
        this.A01 = fragmentTransitionSupport;
        this.A00 = view;
        this.A02 = arrayList;
    }

    public final void Dtm(C14284TtI ttI) {
        ttI.A0B(this);
        this.A00.setVisibility(8);
        ArrayList arrayList = this.A02;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((View) arrayList.get(i)).setVisibility(0);
        }
    }

    public final /* synthetic */ void Dtr(C14284TtI ttI, boolean z) {
        ttI.A0B(this);
        ttI.A0A(this);
    }
}
