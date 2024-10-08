package X;

import android.view.ViewGroup;
import android.widget.TextView;
import java.util.List;

public final class U9l extends 2Rw {
    public final List A00;

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r4, int i) {
        C14900UEf uEf = (C14900UEf) r4;
        0qQ.A0B(uEf, 0);
        C17343VRw vRw = (C17343VRw) this.A00.get(i);
        0qQ.A0B(vRw, 0);
        uEf.A00 = vRw.A01;
        uEf.A01.setText(vRw.A00);
    }

    public U9l(List list) {
        this.A00 = list;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-1322374883);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(1810741360, A03);
        return size;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        DbS.A1W(viewGroup);
        return new C14900UEf(new TextView(viewGroup.getContext()));
    }
}
