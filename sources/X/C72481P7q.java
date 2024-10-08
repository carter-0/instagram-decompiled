package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: X.P7q  reason: case insensitive filesystem */
public final class C72481P7q implements C328347El {
    public static final C68213N6c A00(Context context, UserSession userSession, AnonymousClass9HC r12, AnonymousClass7LQ r13, AnonymousClass7L2 r14, 17i r15, boolean z) {
        AnonymousClass7TG.A1T(context, userSession, r15);
        C51973G9u.A0r(3, r14, r13, r12);
        C254703su r2 = r13.A0e;
        2FW r1 = r2.A10;
        0qQ.A07(r1);
        AnonymousClass7FE A0V = C66582MXn.A0V(userSession, r12, r13, r14, r1);
        C328667Fr A01 = new C3264276s((AnonymousClass773) null, (Map) null, (DefaultConstructorMarker) null, 3).A01(context, userSession, A0V, r12, r13);
        String A0s = C66582MXn.A0s(userSession, r2, z);
        0qQ.A0A(A0s);
        return new C68213N6c(AnonymousClass7FX.A03(context, userSession, r12, r13, r14, r15), A01, A0s);
    }

    public final /* bridge */ /* synthetic */ C232262tL AWb(Context context, UserSession userSession, AnonymousClass9HC r10, C331837So r11, AnonymousClass7L2 r12, 17i r13, boolean z) {
        return A00(context, userSession, r10, (AnonymousClass7LQ) r11, r12, r13, z);
    }
}
