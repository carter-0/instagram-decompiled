package X;

import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.ArrayList;

public final class FkL implements AnonymousClass6VG {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public FkL(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj;
        this.A02 = obj3;
        this.A01 = obj2;
    }

    /* JADX WARNING: type inference failed for: r1v0, types: [com.instagram.common.ui.widget.imageview.CircularImageView, android.view.View] */
    public final void CfR(long j, boolean z) {
        boolean z2 = z;
        if (this.A00 != 0) {
            EEQ eeq = (EEQ) this.A03;
            C227812jx r5 = eeq.A04;
            if (r5.isResumed()) {
                AnonymousClass3N3 r3 = (AnonymousClass3N3) this.A01;
                r3.CLE();
                C309416Ye A0i = DbS.A0i();
                ArrayList A022 = eeq.A0A.A02();
                String id = ((Reel) this.A02).getId();
                UserSession userSession = eeq.A06;
                A0i.A02(userSession, id, A022);
                A0i.A03(AnonymousClass3BQ.FOLLOWING_FEED_TRAY);
                A0i.A08(eeq.A01.A04);
                A0i.A01(userSession);
                A0i.A0M = eeq.A01.A03;
                A0i.A0d = z2;
                A0i.A03 = new ReelViewerConfig(new AnonymousClass32D());
                AnonymousClass6W8.A01(r5.getActivity(), A0i.A00(), userSession).A0A(r5.getActivity(), 60574);
                r3.Eu3(eeq.A05);
                return;
            }
            return;
        }
        ELQ elq = (ELQ) this.A03;
        Reel reel = (Reel) this.A02;
        F1A f1a = (F1A) this.A01;
        ? r1 = f1a.A0E;
        RectF A0F = 0nA.A0F(r1);
        r1.setVisibility(4);
        ArrayList A14 = DbV.A14(reel);
        RectF rectF = new RectF(A0F.centerX(), A0F.centerY(), A0F.centerX(), A0F.centerY());
        C227812jx r6 = elq.A01;
        1OP.A07(r6.requireActivity(), elq.A02).A0T(A0F, rectF, r6, reel, elq.A03, new FkS(elq, f1a, A14, j, z2), -1);
    }
}
