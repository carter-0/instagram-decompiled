package X;

import android.content.Context;
import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.List;

/* renamed from: X.ViG  reason: case insensitive filesystem */
public final class C17925ViG {
    public Runnable A00;
    public final int A01;
    public final Context A02;
    public final Handler A03 = new Handler(C64021Cb.A00());
    public final AnonymousClass540 A04;
    public final UserSession A05;
    public final C278774xV A06;
    public final List A07 = Pxf.A0v();
    public final List A08 = Pxf.A0v();

    public final synchronized void A00() {
        List list = this.A08;
        if (!list.isEmpty() || !this.A07.isEmpty()) {
            list.size();
            this.A07.size();
        } else {
            Runnable runnable = this.A00;
            if (runnable != null) {
                this.A03.removeCallbacks(runnable);
            }
            C278774xV r1 = this.A06;
            if (C278774xV.A00(r1)) {
                r1.A01.flowEndSuccess(r1.A00);
            }
            this.A04.AVX(C273654mx.A00(141));
        }
    }

    public C17925ViG(Context context, AnonymousClass540 r5, UserSession userSession, C278774xV r7) {
        AnonymousClass7TG.A1S(r5, r7);
        this.A05 = userSession;
        this.A02 = context;
        this.A04 = r5;
        this.A06 = r7;
        this.A01 = (int) 182.A01(0Tu.A05, userSession, 36606388516296103L);
    }
}
