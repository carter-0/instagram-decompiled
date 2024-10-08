package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.9MB  reason: invalid class name */
public final class AnonymousClass9MB extends 0Yg implements 0sL {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final boolean A03;

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C246153e7 r5;
        Object obj3 = obj2;
        if (this.A00 != 0) {
            View view = (View) obj;
            AnonymousClass4DU r9 = (AnonymousClass4DU) obj3;
            0qQ.A0B(view, 0);
            0qQ.A0B(r9, 1);
            C267154b3.A01(view, ((C242923Ws) this.A02).A00, (1Xj) this.A01, r9, this.A03);
        } else {
            View view2 = (View) obj;
            AnonymousClass4DU r92 = (AnonymousClass4DU) obj3;
            0qQ.A0B(view2, 0);
            0qQ.A0B(r92, 1);
            1Xj r8 = (1Xj) this.A01;
            boolean z = this.A03;
            UserSession userSession = ((C242923Ws) this.A02).A00;
            C238833Dp A002 = C238833Dp.A00(userSession);
            0qQ.A07(A002);
            A002.A05(view2, C238863Ds.STORY_HEADER);
            if (z) {
                Context context = view2.getContext();
                0qQ.A07(context);
                r5 = new C246153e7(new AnonymousClass4HH(context, new AnonymousClass3W1(r8.A0o(), r8.A4o()), userSession, r8), userSession, r8, r92, "in_app_browser_v2", 0sl.A00);
            } else {
                r5 = new C246153e7((AnonymousClass4HI) null, userSession, r8, r92);
            }
            A002.A0A(view2, r5);
        }
        return C60340gF.A00;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MB(int i, Object obj, Object obj2, boolean z) {
        super(2);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = z;
    }
}
