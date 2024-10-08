package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.model.reels.ReelViewerConfig;
import java.util.List;

public final class FkW implements AnonymousClass6WJ {
    public final /* synthetic */ long A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ AnonymousClass3BQ A02;
    public final /* synthetic */ C230212pD A03;
    public final /* synthetic */ AnonymousClass3K2 A04;
    public final /* synthetic */ Integer A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ List A07;
    public final /* synthetic */ boolean A08;

    public final void DaE(float f) {
    }

    public final void onCancel() {
    }

    public FkW(RectF rectF, AnonymousClass3BQ r2, C230212pD r3, AnonymousClass3K2 r4, Integer num, String str, List list, long j, boolean z) {
        this.A03 = r3;
        this.A07 = list;
        this.A02 = r2;
        this.A06 = str;
        this.A05 = num;
        this.A00 = j;
        this.A08 = z;
        this.A01 = rectF;
        this.A04 = r4;
    }

    public final void Dfo(String str) {
        C230212pD r7 = this.A03;
        C317766nn r3 = r7.A00;
        if (r3 == null) {
            UserSession userSession = r7.A04;
            1OP r0 = 1OP.$redex_init_class;
            0qQ.A0B(userSession, 0);
            r3 = new C315656kI(userSession);
            r7.A00 = r3;
        }
        C309416Ye A0i = DbS.A0i();
        List list = this.A07;
        UserSession userSession2 = r7.A04;
        A0i.A02(userSession2, str, list);
        AnonymousClass3BQ r2 = this.A02;
        A0i.A03(r2);
        A0i.A08(r7.A07.A04);
        A0i.A0F = this.A06;
        A0i.A08 = this.A05;
        A0i.A01(userSession2);
        A0i.A06(r3.A02);
        A0i.A01 = this.A00;
        A0i.A0d = this.A08;
        A0i.A0U = true;
        String obj = r2.toString();
        0qQ.A0B(obj, 0);
        A0i.A0I = obj;
        C227812jx r4 = r7.A03;
        A0i.A07(new C16165Upq((Activity) r4.getActivity(), this.A01, (C230222pE) r7, AnonymousClass05K.A01).A03);
        A0i.A05(this.A04.A0x);
        A0i.A03 = ReelViewerConfig.A00();
        DbU.A1K(r4, AnonymousClass6W8.A01(r4.requireActivity(), A0i.A00(), userSession2));
    }
}
