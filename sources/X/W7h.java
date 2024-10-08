package X;

import android.text.Editable;
import android.text.TextWatcher;
import com.instagram.api.schemas.AdvantageAudienceData;
import com.instagram.api.schemas.TargetingRelaxationConstants;
import java.util.List;

public final class W7h implements TextWatcher {
    public final /* synthetic */ C306146Ky A00;

    public final void afterTextChanged(Editable editable) {
        Object value;
        0qQ.A0B(editable, 0);
        U92 A01 = C306146Ky.A01(this.A00);
        String obj = editable.toString();
        0qQ.A0B(obj, 0);
        05G r2 = A01.A02.A01;
        do {
            value = r2.getValue();
        } while (!r2.AIY(value, C15053ULv.A00((AdvantageAudienceData) null, (TargetingRelaxationConstants) null, (C15053ULv) value, obj, (List) null, (List) null, (List) null, 0, 0, 1021, false)));
    }

    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public W7h(C306146Ky r1) {
        this.A00 = r1;
    }
}
