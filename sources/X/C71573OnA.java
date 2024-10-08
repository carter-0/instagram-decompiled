package X;

import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.OnA  reason: case insensitive filesystem */
public final class C71573OnA implements AnonymousClass2Kv {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ AnonymousClass77Z A01;
    public final /* synthetic */ String A02;

    public C71573OnA(UserSession userSession, AnonymousClass77Z r2, String str) {
        this.A00 = userSession;
        this.A02 = str;
        this.A01 = r2;
    }

    public final void invoke(AnonymousClass3JD r8) {
        ImmutableList requiredCompactedTreeListField;
        ArrayList A0q = AnonymousClass7TF.A0q(r8, 0);
        C250663lr A0U = C41845B3m.A0U(r8);
        if (!(A0U == null || (requiredCompactedTreeListField = A0U.getRequiredCompactedTreeListField(0, "ig_direct_get_thread_items_v2(ig_item_ids:$ig_item_ids,ig_thread_id:$ig_thread_id,otids:$otids)", C42977Bot.class, -938060838)) == null)) {
            C249803kO A0J = C66580MXl.A0J(requiredCompactedTreeListField);
            while (A0J.hasNext()) {
                C250663lr A0V = C41845B3m.A0V(A0J);
                0c5 r2 = 0c9.A04;
                UserSession userSession = this.A00;
                String requiredStringField = A0V.getRequiredStringField(0, "full_item_dict");
                0qQ.A07(requiredStringField);
                C254703su A002 = C254703su.A00(r2.A01(userSession, requiredStringField), (DirectThreadKey) null, false);
                if (A002 != null) {
                    A0q.add(A002);
                }
            }
        }
        List A003 = C66785McW.A00(this.A00, this.A02, A0q);
        if (AnonymousClass7TE.A1b(A003)) {
            this.A01.Doh(A003);
        } else {
            this.A01.DEc("fail_to_update_local_cache");
        }
    }
}
