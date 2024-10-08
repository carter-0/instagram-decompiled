package X;

import android.widget.RadioGroup;
import java.util.List;

public final class FQY implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ long A00;
    public final /* synthetic */ C48032ERv A01;
    public final /* synthetic */ List A02;

    public FQY(C48032ERv eRv, List list, long j) {
        this.A02 = list;
        this.A01 = eRv;
        this.A00 = j;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        long j;
        String str = ((C70953OTa) this.A02.get(i)).A02;
        if (!0qQ.A0K(str, "off")) {
            0qQ.A0A(str);
            j = (long) Integer.parseInt(str);
        } else {
            j = 0;
        }
        this.A01.A00 = j * this.A00;
    }
}
