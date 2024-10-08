package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

/* renamed from: X.APh  reason: case insensitive filesystem */
public final class C40051APh implements AnonymousClass2gO {
    public final /* synthetic */ C359318cb A00;

    public C40051APh(C359318cb r1) {
        this.A00 = r1;
    }

    public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
        C353538Ia r0;
        List list = (List) obj;
        if (list != null && !list.isEmpty()) {
            C359318cb r3 = this.A00;
            UserSession userSession = r3.A0b;
            AnonymousClass8A2 A01 = AnonymousClass8A1.A01(userSession);
            28D r5 = r3.A0Y;
            int size = list.size();
            String str = ((C279284yO) r3.A0d.A08.A00).A02;
            C2801950r r6 = r3.A0w;
            A01.A04(r5, r6, str, AnonymousClass7TF.A0g(userSession), size);
            ClipsCreationViewModel clipsCreationViewModel = r3.A0s;
            if (r5.ordinal() == 357) {
                r0 = C387899mx.A00;
            } else {
                r0 = C387839mr.A00;
            }
            clipsCreationViewModel.A0X(r0);
            C359318cb.A05(r3.A0h.A02, r3, r6, list);
        }
    }
}
