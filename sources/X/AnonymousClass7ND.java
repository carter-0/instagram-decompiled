package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.7ND  reason: invalid class name */
public final class AnonymousClass7ND implements AnonymousClass7NE {
    public final AnonymousClass7NO A00;
    public final AnonymousClass7NQ A01;
    public final AnonymousClass7NI A02;
    public final AnonymousClass7NP A03;

    /* JADX WARNING: type inference failed for: r2v2, types: [X.7NJ, X.7NO] */
    /* JADX WARNING: type inference failed for: r2v3, types: [X.7NJ, X.7NP] */
    /* JADX WARNING: type inference failed for: r2v4, types: [X.7NJ, X.7NQ] */
    public /* synthetic */ AnonymousClass7ND(Context context, UserSession userSession, C62320sa r11) {
        AnonymousClass7NF r3 = (AnonymousClass7NF) userSession.A01(AnonymousClass7NF.class, new AnonymousClass9L0(context, 18));
        AnonymousClass7NG r6 = new AnonymousClass7NG(182.A06(0Tu.A05, userSession, 36320060226477989L));
        AnonymousClass7NH r7 = new AnonymousClass7NH(userSession, r11);
        0qQ.A0B(r3, 4);
        this.A02 = new AnonymousClass7NI(r3, r6, r7);
        this.A00 = new AnonymousClass7NJ(r3, new AnonymousClass7NL(), new AnonymousClass7NM((Handler) null, (DefaultConstructorMarker) null, 1), r6, r7);
        this.A03 = new AnonymousClass7NJ(r3, new AnonymousClass7NL(), new AnonymousClass7NM((Handler) null, (DefaultConstructorMarker) null, 1), r6, r7);
        this.A01 = new AnonymousClass7NJ(r3, new AnonymousClass7NL(), new AnonymousClass7NM((Handler) null, (DefaultConstructorMarker) null, 1), r6, r7);
    }

    public final AnonymousClass7NK ALW(AnonymousClass5FV r3) {
        C69856NtK ntK = C69856NtK.$redex_init_class;
        int ordinal = r3.ordinal();
        if (ordinal == 5) {
            return this.A02;
        }
        if (ordinal == 6) {
            return this.A00;
        }
        if (ordinal == 7) {
            return this.A03;
        }
        if (ordinal != 8) {
            return null;
        }
        return this.A01;
    }
}
