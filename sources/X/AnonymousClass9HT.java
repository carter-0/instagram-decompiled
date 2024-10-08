package X;

import com.instagram.common.session.UserSession;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/* renamed from: X.9HT  reason: invalid class name */
public abstract class AnonymousClass9HT extends MYU {
    public boolean A00;
    public final int A01;
    public final C2366634p A02;
    public final C2366634p A03;
    public final C2366634p A04;
    public final C2366634p A05 = A02("on_resume");
    public final C2366634p A06;
    public final UserSession A07;
    public final AnonymousClass9HU A08;

    public void A05() {
        A0K("navigation_perf_logger", true);
        A0K("is_professional_account", this.A00);
        UserSession userSession = this.A07;
        for (Map.Entry entry : C250563lf.A0J(userSession).entrySet()) {
            A0J((String) entry.getKey(), (String) entry.getValue());
        }
        HashMap A002 = C67025Mgy.A00(userSession);
        if (A002 instanceof Map) {
            for (Map.Entry entry2 : A002.entrySet()) {
                A0K((String) entry2.getKey(), ((Boolean) entry2.getValue()).booleanValue());
            }
        }
        0qQ.A0B(userSession, 0);
        A0G("mem_offline_sync_queue_size", AnonymousClass6AP.A00(userSession).A02);
    }

    public final int A0L() {
        return this.A01;
    }

    public AnonymousClass9HT(UserSession userSession, String str, int i, boolean z, boolean z2) {
        super(userSession);
        C2366634p r0;
        this.A07 = userSession;
        this.A01 = i;
        this.A00 = z;
        C2366634p r02 = new C2366634p(this, "on_create");
        Set set = this.A06;
        set.add(r02);
        this.A02 = r02;
        C2366634p r03 = new C2366634p(this, "on_create_view");
        set.add(r03);
        this.A03 = r03;
        C2366634p r04 = new C2366634p(this, "on_pause");
        set.add(r04);
        this.A04 = r04;
        if (z2) {
            r0 = A02("on_view_created");
        } else {
            r0 = null;
        }
        this.A06 = r0;
        this.A08 = new AnonymousClass9HU(A02(002.A0R(str, "_render")), this);
    }
}
