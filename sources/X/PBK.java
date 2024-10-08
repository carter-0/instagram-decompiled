package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;

public final class PBK implements AnonymousClass7DY {
    public final /* synthetic */ C332767Wh A00;

    public PBK(C332767Wh r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void Cy2(Object obj, Object obj2) {
        2FW Aqm;
        C328667Fr r6 = (C328667Fr) obj2;
        if (r6 != null) {
            DirectMessageIdentifier directMessageIdentifier = r6.A0L;
            String str = directMessageIdentifier.A01;
            String str2 = r6.A0Y;
            if (str2 != null || (str2 = r6.A0T) != null || ((Aqm = r6.Aqm()) != null && (str2 = Aqm.toString()) != null)) {
                C66582MXn.A1J(r6, this.A00, directMessageIdentifier, str, str2);
            }
        }
    }

    public final /* bridge */ /* synthetic */ void D77(Object obj) {
        View A01;
        C3257073v r4 = (C3257073v) obj;
        if (r4 != null && (A01 = r4.A0G.A01()) != null) {
            A01.setLayoutParams(new LinearLayout.LayoutParams(330, 330));
        }
    }

    public final /* bridge */ /* synthetic */ void DuS(Object obj) {
    }
}
