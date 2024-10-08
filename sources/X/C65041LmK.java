package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.LmK  reason: case insensitive filesystem */
public final class C65041LmK implements MV5 {
    public final Context A00;
    public final 0hq A01;
    public final UserSession A02;
    public final AnonymousClass4DU A03;
    public final AnonymousClass3W1 A04;
    public final LEF A05;
    public final boolean A06;

    public final void Doe(String str) {
        0qQ.A0B(str, 0);
        new C58694Iw3(str, this, 29).invoke();
    }

    public final void onStart() {
    }

    public static final void A00(C65041LmK lmK) {
        LEF lef = lmK.A05;
        AnonymousClass3Q2 r2 = lef.A03;
        if (r2 != null) {
            JTR.A1O(AnonymousClass7TE.A0t(r2.A1N.A0F));
            JTR.A1O(JTO.A0s(AnonymousClass457.A03(), r2.A3w));
        }
        File file = lef.A05;
        if (file != null) {
            JTR.A1O(file);
        }
        File file2 = lef.A04;
        if (file2 != null) {
            JTR.A1O(file2);
        }
    }

    public final void DEG(Exception exc) {
        if (182.A06(0Tu.A05, this.A02, 36326305108604604L)) {
            A00(this);
        }
        C59689JTv.A0A(this.A00, "watermark_render_failed");
    }

    public final void onFinish() {
        if (!182.A06(0Tu.A05, this.A02, 36326459727558421L)) {
            SQH.A01(this.A01);
        }
    }

    public C65041LmK(Context context, 0hq r3, UserSession userSession, AnonymousClass4DU r5, AnonymousClass3W1 r6, LEF lef, boolean z) {
        C51972G9s.A1D(r3, r5);
        0qQ.A0B(lef, 6);
        this.A00 = context;
        this.A02 = userSession;
        this.A01 = r3;
        this.A03 = r5;
        this.A04 = r6;
        this.A05 = lef;
        this.A06 = z;
    }
}
