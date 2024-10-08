package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.List;
import java.util.Map;

public final class P8I implements AnonymousClass7DS {
    public final C332847Wp A00;

    public final void A00(MessageIdentifier messageIdentifier, String str, String str2, String str3) {
        String str4 = str;
        String str5 = str2;
        this.A00.Cqp((View) null, (ImageUrl) null, (C68168N3i) null, messageIdentifier, (GradientSpinner) null, (Long) null, (Long) null, str4, str5, (String) null, (String) null, str3, (String) null, (String) null, (List) null, (List) null, (List) null, (List) null, (List) null, (Map) null, AnonymousClass7TF.A1U(0, str4, str5) ? 1 : 0, false);
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        C328667Fr r1;
        NYM nym = (NYM) obj;
        0qQ.A0B(nym, 0);
        if (nym.A06 == null || (r1 = nym.A02) == null) {
            return true;
        }
        AnonymousClass9J6 r0 = r1.A08;
        A00(r1.A0L, r0.A01, r0.A00, nym.A07);
        return true;
    }

    public P8I(C332847Wp r1) {
        this.A00 = r1;
    }
}
