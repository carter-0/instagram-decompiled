package X;

import android.widget.RadioGroup;
import java.util.Iterator;
import java.util.List;

public final class FQW implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ C61079JwH A00;
    public final /* synthetic */ ERZ A01;
    public final /* synthetic */ List A02;

    public FQW(C61079JwH jwH, ERZ erz, List list) {
        this.A00 = jwH;
        this.A02 = list;
        this.A01 = erz;
    }

    public final void onCheckedChanged(RadioGroup radioGroup, int i) {
        Object obj;
        F21 f21;
        C61079JwH jwH = this.A00;
        List list = this.A02;
        Iterator it = ((List) jwH.A00).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (0qQ.A0K(((C46539Dgg) obj).A01, ((C70953OTa) list.get(i)).A02)) {
                break;
            }
        }
        C46539Dgg dgg = (C46539Dgg) obj;
        if (dgg != null && (f21 = this.A01.A00) != null) {
            f21.A00(jwH, dgg, true);
        }
    }
}
