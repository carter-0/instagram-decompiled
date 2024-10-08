package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.File;

/* renamed from: X.F2q  reason: case insensitive filesystem */
public final class C49705F2q {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 0hq A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass4DU A04;
    public final /* synthetic */ AnonymousClass3W1 A05;
    public final /* synthetic */ C63500KyB A06;
    public final /* synthetic */ boolean A07;

    public C49705F2q(FragmentActivity fragmentActivity, 0hq r2, UserSession userSession, 1Xj r4, AnonymousClass4DU r5, AnonymousClass3W1 r6, C63500KyB kyB, boolean z) {
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = r4;
        this.A06 = kyB;
        this.A01 = r2;
        this.A04 = r5;
        this.A05 = r6;
        this.A07 = z;
    }

    public final void A00() {
        UserSession userSession = this.A02;
        0Tu r6 = 0Tu.A05;
        boolean A062 = 182.A06(r6, userSession, 36317972872238802L);
        if (A062) {
            FragmentActivity fragmentActivity = this.A00;
            1Xj r8 = this.A03;
            1Av A002 = 1Au.A00(userSession);
            if (!2R8.A02(userSession, r8)) {
                0xa r3 = A002.A01;
                if (r3.getInt("clips_3p_download_privacy_snackbar_shown_count", 0) < 1) {
                    AnonymousClass7TG.A1L(r3.AR4(), r3, "clips_3p_download_privacy_snackbar_shown_count", 0);
                    1xC r32 = 1xC.A01;
                    C310336ap A0W = DbV.A0W();
                    A0W.A09 = r8.A1Q();
                    A0W.A03();
                    DbT.A1D(fragmentActivity.getResources(), A0W, 2131955158);
                    A0W.A0L = true;
                    DbW.A0q(fragmentActivity, A0W, 2131964884);
                    FdJ.A00(A0W, fragmentActivity, userSession, 13);
                    A0W.A01 = 6000;
                    DbY.A1K(r32, A0W);
                }
            }
        }
        if (182.A06(r6, userSession, 36323406006201489L)) {
            FragmentActivity fragmentActivity2 = this.A00;
            AnonymousClass7TE.A1Z(new C51642Fxn(fragmentActivity2, this.A01, userSession, this.A03, this.A04, this.A05, this.A06, (AnonymousClass4D7) null, 1, this.A07, A062), C71772f0.A00(fragmentActivity2.getLifecycle()));
            return;
        }
        1Xj r7 = this.A03;
        FragmentActivity fragmentActivity3 = this.A00;
        LEF lef = new LEF(r7, this.A06, new File(AnonymousClass457.A09(fragmentActivity3, "mp4", System.nanoTime(), true)));
        0hq r33 = this.A01;
        LTW.A01(fragmentActivity3, r33, userSession, this.A04, this.A05, lef, this.A07, A062);
        if (A062) {
            LTW.A02(fragmentActivity3, userSession, r7, lef);
        } else {
            SQH.A02(r33);
        }
    }
}
