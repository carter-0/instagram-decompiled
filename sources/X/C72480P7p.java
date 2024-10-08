package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.P7p  reason: case insensitive filesystem */
public final class C72480P7p implements C328347El {
    public static final C71987OuL A00(Context context, UserSession userSession, AnonymousClass9HC r11, AnonymousClass7LQ r12, AnonymousClass7L2 r13, 17i r14) {
        AnonymousClass7TG.A1T(context, userSession, r14);
        C51973G9u.A0r(3, r13, r12, r11);
        2FW r1 = r12.A0e.A10;
        0qQ.A07(r1);
        AnonymousClass7FE A0V = C66582MXn.A0V(userSession, r11, r12, r13, r1);
        return new C71987OuL(AnonymousClass7FX.A03(context, userSession, r11, r12, r13, r14), new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3).A01(context, userSession, A0V, r11, r12));
    }

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r9, C331837So r10, AnonymousClass7L2 r11, 17i r12, boolean z) {
        return A00(context, userSession, r9, (AnonymousClass7LQ) r10, r11, r12);
    }
}
