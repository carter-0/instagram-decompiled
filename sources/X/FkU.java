package X;

import android.app.Activity;
import android.graphics.RectF;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.ReelViewerConfig;
import com.instagram.reels.recentlydeleted.ReelRecentlyDeletedViewerController;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class FkU implements AnonymousClass6WJ {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    public final void DaE(float f) {
    }

    public FkU(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        this.A00 = i;
        this.A03 = obj5;
        this.A08 = obj4;
        this.A07 = obj8;
        this.A05 = obj6;
        this.A02 = obj3;
        this.A04 = obj7;
        this.A01 = obj2;
        this.A06 = obj;
    }

    public final void Dfo(String str) {
        if (this.A00 != 0) {
            AnonymousClass32D r0 = new AnonymousClass32D();
            r0.A05 = true;
            ReelViewerConfig reelViewerConfig = new ReelViewerConfig(r0);
            C309416Ye A0i = DbS.A0i();
            List singletonList = Collections.singletonList(this.A04);
            UserSession userSession = (UserSession) this.A03;
            A0i.A02(userSession, str, singletonList);
            A0i.A0A((ArrayList) this.A08);
            A0i.A03 = reelViewerConfig;
            A0i.A03((AnonymousClass3BQ) this.A06);
            DbY.A1R(A0i);
            A0i.A01(userSession);
            A0i.A0W = true;
            A0i.A04(0);
            ReelRecentlyDeletedViewerController reelRecentlyDeletedViewerController = (ReelRecentlyDeletedViewerController) this.A01;
            Activity activity = (Activity) this.A02;
            C16165Upq upq = new C16165Upq(activity, (RectF) this.A07, (C230222pE) reelRecentlyDeletedViewerController, AnonymousClass05K.A01);
            reelRecentlyDeletedViewerController.mHideAnimationCoordinator = upq;
            A0i.A07(upq.A03);
            A0i.A05(((AnonymousClass3K2) this.A05).A0x);
            DbW.A0W(activity, A0i.A00(), userSession, TransparentModalActivity.class, "reel_viewer").A0A(activity, 1001);
            return;
        }
        C309416Ye A0i2 = DbS.A0i();
        List A1I = AnonymousClass7TE.A1I(this.A03);
        UserSession userSession2 = (UserSession) this.A08;
        A0i2.A02(userSession2, str, A1I);
        A0i2.A0A((ArrayList) this.A07);
        A0i2.A03((AnonymousClass3BQ) this.A05);
        DbY.A1R(A0i2);
        A0i2.A01(userSession2);
        A0i2.A04(0);
        EES ees = (EES) this.A02;
        Activity activity2 = (Activity) this.A01;
        A0i2.A07(new C16165Upq(activity2, (RectF) this.A06, (C230222pE) ees, AnonymousClass05K.A01).A03);
        A0i2.A05(((AnonymousClass3K2) this.A04).A0x);
        DbW.A0W(activity2, A0i2.A00(), userSession2, TransparentModalActivity.class, "reel_viewer").A0C(ees.A00);
    }

    public final void onCancel() {
    }
}
