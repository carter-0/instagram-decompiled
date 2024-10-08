package X;

import android.content.Context;
import com.instagram.debug.devoptions.sandboxselector.SandboxRepository;
import java.util.Map;
import java.util.Set;

/* renamed from: X.ShU  reason: case insensitive filesystem */
public final class C11842ShU implements C13811The {
    public static final Set A03 = 0sl.A00;
    public final Map A00;
    public final Map A01;
    public final /* synthetic */ C11844ShW A02;

    public final String Bpq() {
        return null;
    }

    public C11842ShU(Map map, Map map2) {
        this.A00 = map;
        this.A01 = map2;
        this.A02 = new C11844ShW("com.bloks.www.iaw.autofill.payment.save.bottomsheet.screen_query", (String) null, (String) null, map, map2, 772803329, SandboxRepository.CACHE_TTL, true);
    }

    public final Set AjL(C13690Tf8 tf8, C307506Qj r3) {
        AnonymousClass7TG.A1N(tf8, r3);
        return this.A02.AjL(tf8, r3);
    }

    public final void CNo(C13690Tf8 tf8, C307506Qj r3) {
        AnonymousClass7TG.A1N(tf8, r3);
        this.A02.CNo(tf8, r3);
    }

    public final void E0s(Context context, C13690Tf8 tf8, C307506Qj r4) {
        AnonymousClass7TG.A1T(context, r4, tf8);
        this.A02.E0s(context, tf8, r4);
    }

    public final void E3a(C13690Tf8 tf8, C307506Qj r3, JPG jpg, boolean z) {
        DbY.A1S(tf8, r3);
        this.A02.E3a(tf8, r3, jpg, z);
    }
}
