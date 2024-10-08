package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.9mG  reason: invalid class name and case insensitive filesystem */
public final class C387469mG extends AA8 {
    public int A00;
    public C39688A5e A01;
    public final AnonymousClass87H A02;
    public final Context A03;
    public final UserSession A04;

    public C387469mG(Context context, UserSession userSession, AnonymousClass87H r3) {
        this.A04 = userSession;
        this.A02 = r3;
        this.A03 = context;
    }

    public static void A00(AnonymousClass57C r4, C387469mG r5) {
        String upperCase;
        C17942ViX A002 = VG0.A00();
        C39688A5e a5e = r5.A01;
        a5e.getClass();
        A002.A04 = a5e.A00.toUpperCase(Locale.getDefault());
        if (AnonymousClass3S1.A04(r5.A01.A01)) {
            upperCase = "";
        } else {
            upperCase = AnonymousClass7TE.A19(r5.A01.A01, r5.A00).toUpperCase(Locale.getDefault());
        }
        A002.A07 = upperCase;
        Context context = r5.A03;
        A002.A0B = VKA.A00(context.getResources());
        r5.A02.A0A(new C16149Upa(context, r5.A04, new C19471WaJ(A002.A00())), r4, C317876nz.A1K);
    }
}
