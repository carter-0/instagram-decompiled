package X;

import android.view.MotionEvent;
import android.view.View;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.messageid.DirectMessageIdentifier;
import com.instagram.ui.widget.gradientspinner.GradientSpinner;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public final class P89 implements AnonymousClass7DS {
    public final /* synthetic */ C72543PAa A00;
    public final /* synthetic */ AnonymousClass7XA A01;

    public P89(C72543PAa pAa, AnonymousClass7XA r2) {
        this.A00 = pAa;
        this.A01 = r2;
    }

    public final /* bridge */ /* synthetic */ boolean DRa(MotionEvent motionEvent, Object obj, Object obj2) {
        List singletonList;
        C328667Fr r1 = (C328667Fr) obj;
        AnonymousClass7XA r4 = this.A01;
        AnonymousClass9J6 r0 = r1.A08;
        String str = r0.A01;
        AnonymousClass777 r2 = r1.A0F;
        String str2 = r0.A00;
        DirectMessageIdentifier directMessageIdentifier = r1.A0L;
        boolean BCL = r1.BCL();
        if (str == null || C70020Nvy.A00((C332927Wz) r4, directMessageIdentifier, BCL)) {
            return true;
        }
        C332847Wp r42 = (C332847Wp) r4;
        String str3 = str.toString();
        if (r2 == null) {
            singletonList = null;
        } else {
            singletonList = Collections.singletonList(((AnonymousClass776) r2).A00);
        }
        r42.Cqp((View) null, (ImageUrl) null, (C68168N3i) null, directMessageIdentifier, (GradientSpinner) null, (Long) null, (Long) null, str3, str2, (String) null, (String) null, (String) null, (String) null, (String) null, (List) null, singletonList, (List) null, (List) null, (List) null, (Map) null, 0, false);
        return true;
    }
}
