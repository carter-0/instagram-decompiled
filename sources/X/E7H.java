package X;

import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public final class E7H extends MYR {
    public static final String __redex_internal_original_name = "RtcCowatchClosedCaptionSelectorFragment";
    public final UserSession A00;
    public final int A01;
    public final List A02;
    public final 0sP A03;

    public E7H(UserSession userSession, List list, 0sP r4, int i) {
        0qQ.A0B(list, 1);
        this.A02 = list;
        this.A03 = r4;
        this.A00 = userSession;
        this.A01 = i;
    }

    public final String getModuleName() {
        return "rtc_cowatch_closed_caption_selector_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        List<C7607QOp> list = this.A02;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (C7607QOp qOp : list) {
            A0r.add(new FYG(qOp.A05, list.indexOf(qOp) + 1, this.A01));
        }
        ArrayList A0U = 00k.A0U(A0r);
        A0U.add(0, new FYG(AnonymousClass7TE.A16(view.getContext(), 2131956824), 0, this.A01));
        A0B(A0U);
    }

    public final Collection getDefinitions() {
        return AnonymousClass7TE.A1I(new C47761EFv(this.A03));
    }

    public final OID getRecyclerConfigBuilder() {
        return configBuilder(C51834G3s.A00);
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return this.A00;
    }
}
