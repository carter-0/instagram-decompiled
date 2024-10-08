package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;

/* renamed from: X.LmP  reason: case insensitive filesystem */
public final class C65045LmP implements MTY {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C65045LmP(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A02 = obj4;
        this.A01 = obj;
    }

    public final void Dvm() {
        if (this.A00 != 0) {
            C59797JYq.A07((Context) this.A01, (UserSession) this.A04, (AnonymousClass3Q2) this.A03, "template_background_render_failure");
            return;
        }
        ((0sP) this.A01).invoke(new Error("Could not render image"));
    }

    public final /* bridge */ /* synthetic */ void Dvn(Object obj) {
        L6I l6i = (L6I) obj;
        if (this.A00 != 0) {
            AnonymousClass3Q2 A032 = C59797JYq.A03((UserSession) this.A04, ShareType.STORY_TEMPLATE_BACKGROUND_ASSET);
            A032.A33 = l6i.A02.A08;
            ((AnonymousClass3Q2) this.A03).A0X(A032);
            ((Runnable) this.A02).run();
            return;
        }
        0qQ.A0B(l6i, 0);
        UserSession userSession = (UserSession) this.A04;
        AnonymousClass3Q2 r3 = (AnonymousClass3Q2) this.A03;
        C59797JYq.A0D(userSession, l6i.A02, r3);
        C59794JYn jYn = new C59794JYn(r3);
        int i = l6i.A01;
        int i2 = l6i.A00;
        AnonymousClass3Q2 r0 = jYn.A01;
        r0.A0H = i;
        r0.A0G = i2;
        C59797JYq.A0F(userSession, r3, i, i2);
        C51965G9l.A1W(this.A02, r3);
    }
}
