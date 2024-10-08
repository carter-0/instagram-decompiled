package X;

import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class S7D {
    public final int A00 = AnonymousClass0HM.A00().hashCode();
    public final C11288SJh A01;
    public final C270254gR A02;

    public final void A03(Set set) {
        0qQ.A0B(set, 0);
        this.A01.A02(Integer.valueOf(this.A00), (Long) null, "check_cache_end", 772815129);
        A02(DbY.A0p("cache_layers", 002.A0E(DbT.A0z(",", set, (0sP) null), '[', ']'), AnonymousClass7TE.A1L("has_cached_screen", String.valueOf(C66580MXl.A1b(set)))));
    }

    public final void A00() {
        this.A01.A02(Integer.valueOf(this.A00), (Long) null, "check_cache_start", 772815129);
    }

    public final void A02(Map map) {
        C11288SJh sJh = this.A01;
        int i = this.A00;
        Integer valueOf = Integer.valueOf(i);
        if (sJh.A00.A09(true) && valueOf != null) {
            Iterator A0u = AnonymousClass7TF.A0u(map);
            while (A0u.hasNext()) {
                Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
                sJh.A01.markerAnnotate(772815129, i, DbT.A13(A1J), DbS.A0s(A1J));
            }
        }
    }

    public S7D(C270254gR r2) {
        this.A02 = r2;
        this.A01 = r2.A02;
    }

    public final void A01(Integer num, Integer num2, String str) {
        String str2;
        String str3;
        this.A01.A00((Long) null, 772815129, this.A00);
        0eP A1L = AnonymousClass7TE.A1L("iab_session_id", this.A02.A00.A0P.A02);
        0eP A1L2 = AnonymousClass7TE.A1L("prompt_session_id", str);
        if (num.intValue() != 0) {
            str2 = "save";
        } else {
            str2 = "usage";
        }
        0eP A1L3 = AnonymousClass7TE.A1L("prompt_type", str2);
        if (num2.intValue() != 0) {
            str3 = "PAYMENT_AUTOFILL";
        } else {
            str3 = "CONTACT_AUTOFILL";
        }
        A02(Pxh.A0v(A1L, A1L2, A1L3, AnonymousClass7TE.A1L("autofill_type", str3), AnonymousClass7TE.A1L("cache_ttl", String.valueOf(SandboxRepository.CACHE_TTL))));
    }

    public final void A04(boolean z) {
        A02(AnonymousClass7TF.A0w("was_prompt_shown", String.valueOf(z)));
        this.A01.A01(Integer.valueOf(this.A00), (Long) null, 772815129);
    }
}
