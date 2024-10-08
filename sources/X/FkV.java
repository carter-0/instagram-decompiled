package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import java.util.List;

public final class FkV implements AnonymousClass6WJ {
    public final /* synthetic */ int A00;
    public final /* synthetic */ RectF A01;
    public final /* synthetic */ C330367Mm A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ AnonymousClass3BQ A04;
    public final /* synthetic */ AnonymousClass3K2 A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ List A08;

    public final void DaE(float f) {
    }

    public FkV(RectF rectF, C330367Mm r2, Reel reel, AnonymousClass3BQ r4, AnonymousClass3K2 r5, String str, String str2, List list, int i) {
        this.A02 = r2;
        this.A08 = list;
        this.A03 = reel;
        this.A04 = r4;
        this.A00 = i;
        this.A07 = str;
        this.A06 = str2;
        this.A05 = r5;
        this.A01 = rectF;
    }

    public final void Dfo(String str) {
        C330367Mm r6 = this.A02;
        if (!r6.A07.isResumed()) {
            onCancel();
            return;
        }
        C309416Ye A0i = DbS.A0i();
        List list = this.A08;
        String id = this.A03.getId();
        UserSession userSession = r6.A06;
        A0i.A02(userSession, id, list);
        A0i.A03(this.A04);
        DbY.A1R(A0i);
        A0i.A01(userSession);
        A0i.A04(Integer.valueOf(this.A00));
        A0i.A03 = r6.A00;
        C317766nn r0 = r6.A01;
        if (r0 != null) {
            A0i.A06(r0.A02);
            String str2 = this.A07;
            if (str2 != null) {
                A0i.A0E = str2;
            }
            String str3 = this.A06;
            if (str3 != null) {
                A0i.A0B = str3;
            }
            AnonymousClass3K2 r4 = this.A05;
            RectF rectF = this.A01;
            AnonymousClass6UX r2 = r6.A02;
            if (r2 == null) {
                r2 = new C16165Upq(r6.A04, rectF, (C230222pE) r6, AnonymousClass05K.A01);
                r6.A02 = r2;
            }
            A0i.A07(r2.A03);
            A0i.A05(r4.A0x);
            Activity activity = r6.A04;
            DbW.A0W(activity, A0i.A00(), userSession, TransparentModalActivity.class, "reel_viewer").A0C(activity);
            02m.A0p.markerEnd(18941461, 2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void onCancel() {
        AnonymousClass6VJ r1 = this.A02.A03;
        if (r1 != null) {
            r1.A05(AnonymousClass05K.A0Y);
        }
    }
}
