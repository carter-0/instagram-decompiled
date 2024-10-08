package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

/* renamed from: X.Hni  reason: case insensitive filesystem */
public final class C55802Hni {
    public final C54336H8i A00;
    public final 2el A01;
    public final C229932oe A02 = new C229932oe();
    public final HC4 A03;
    public final UserSession A04;

    /* JADX WARNING: type inference failed for: r7v0, types: [X.2oN, java.lang.Object] */
    public C55802Hni(Context context, C234072ww r10, 0wc r11, UserSession userSession, 2el r13, AnonymousClass4DU r14) {
        C51973G9u.A0r(3, userSession, r13, r10);
        this.A04 = userSession;
        this.A01 = r13;
        this.A00 = new C54336H8i(this, r11, (long) context.getResources().getInteger(17694721));
        AnonymousClass4DU r5 = r14;
        this.A03 = new HC4(r10, userSession, r5, AnonymousClass2oO.A00(userSession), new Object());
    }
}
