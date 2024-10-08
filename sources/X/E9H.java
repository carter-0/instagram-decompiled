package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.HashSet;
import java.util.List;
import java.util.Map;

public final class E9H extends 2Ru implements C231272rL {
    public AnonymousClass4UE A00;
    public List A01;
    public final C47638EAy A02;
    public final C231982sj A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public E9H(Context context, AnonymousClass0iw r11, UserSession userSession, C51959G9f g9f, 2bv r14) {
        super(false);
        0qQ.A0B(userSession, 2);
        C47638EAy eAy = new C47638EAy(context, r11, userSession, g9f, new DdG(userSession));
        this.A02 = eAy;
        AnonymousClass2bO.A00();
        C231982sj r0 = new C231982sj(userSession, r14, new C231912sc(r11, userSession), (Map) null);
        this.A03 = r0;
        init(new C231642s0[]{r0, eAy});
    }

    public final /* bridge */ /* synthetic */ Object getAdapter() {
        return this;
    }

    public static final void A00(E9H e9h) {
        e9h.clear();
        AnonymousClass4UE r1 = e9h.A00;
        if (r1 != null) {
            e9h.addModel(r1, e9h.A03);
        }
        List list = e9h.A01;
        if (list != null && AnonymousClass7TE.A1b(list)) {
            HashSet A1F = AnonymousClass7TE.A1F();
            int count = e9h.getCount();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                Object obj = list.get(i);
                if (!A1F.contains(obj)) {
                    e9h.addModel(obj, Integer.valueOf(i + count), e9h.A02);
                    A1F.add(obj);
                }
            }
        }
        e9h.notifyDataSetChanged();
    }
}
