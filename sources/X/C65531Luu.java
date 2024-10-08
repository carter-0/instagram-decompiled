package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.controller.helper.ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1;
import java.util.List;

/* renamed from: X.Luu  reason: case insensitive filesystem */
public final class C65531Luu implements AnonymousClass2sT {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ C293505kq A03;
    public final /* synthetic */ AnonymousClass3Q2 A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ C262224Cq A06;

    public final void DaJ(AnonymousClass3Q2 r15) {
        0qQ.A0B(r15, 0);
        String str = r15.A3V;
        if (str != null) {
            C262224Cq r0 = this.A06;
            AnonymousClass3Q2 r6 = this.A04;
            UserSession userSession = this.A02;
            List list = this.A05;
            AnonymousClass7TE.A1Z(new ClipsDirectSendHelper$sendVideoToDirect$1$onProgressChange$1$1(this.A00, this.A01, userSession, this.A03, r6, str, (String) null, (String) null, list, (AnonymousClass4D7) null, false, false), r0);
            r6.A0Z(this);
        }
    }

    public C65531Luu(Context context, FragmentActivity fragmentActivity, UserSession userSession, C293505kq r4, AnonymousClass3Q2 r5, List list, C262224Cq r7) {
        this.A06 = r7;
        this.A04 = r5;
        this.A02 = userSession;
        this.A05 = list;
        this.A01 = fragmentActivity;
        this.A00 = context;
        this.A03 = r4;
    }
}
