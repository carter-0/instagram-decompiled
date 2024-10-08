package X;

import android.app.Activity;
import android.graphics.RectF;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.reels.Reel;
import java.util.ArrayList;
import java.util.List;

public final class FkT implements AnonymousClass6WJ {
    public final /* synthetic */ RectF A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Reel A03;
    public final /* synthetic */ AnonymousClass3BQ A04;
    public final /* synthetic */ AnonymousClass3K2 A05;
    public final /* synthetic */ ArrayList A06;

    public final void DaE(float f) {
    }

    public final void onCancel() {
    }

    public FkT(RectF rectF, FragmentActivity fragmentActivity, UserSession userSession, Reel reel, AnonymousClass3BQ r5, AnonymousClass3K2 r6, ArrayList arrayList) {
        this.A01 = fragmentActivity;
        this.A03 = reel;
        this.A02 = userSession;
        this.A06 = arrayList;
        this.A04 = r5;
        this.A05 = r6;
        this.A00 = rectF;
    }

    public final void Dfo(String str) {
        FragmentActivity fragmentActivity = this.A01;
        fragmentActivity.onBackPressed();
        C309416Ye A0i = DbS.A0i();
        List A1I = AnonymousClass7TE.A1I(this.A03);
        UserSession userSession = this.A02;
        A0i.A02(userSession, str, A1I);
        A0i.A0A(this.A06);
        A0i.A03(this.A04);
        DbY.A1R(A0i);
        A0i.A01(userSession);
        A0i.A04(0);
        AnonymousClass3K2 r4 = this.A05;
        A0i.A07(new C16165Upq((Activity) fragmentActivity, this.A00, (C230222pE) new FkY(6), AnonymousClass05K.A01).A03);
        A0i.A05(r4.A0x);
        DbW.A0W(fragmentActivity, A0i.A00(), userSession, TransparentModalActivity.class, "reel_viewer").A0C(fragmentActivity);
    }
}
