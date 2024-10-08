package X;

import android.content.Context;
import android.view.View;
import com.instagram.common.session.UserSession;

/* renamed from: X.6uI  reason: invalid class name and case insensitive filesystem */
public final class C321506uI implements View.OnClickListener {
    public final /* synthetic */ int A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ AnonymousClass32J A04;
    public final /* synthetic */ boolean A05;
    public final /* synthetic */ boolean A06;

    public C321506uI(AnonymousClass0iw r1, UserSession userSession, 1Xj r3, AnonymousClass32J r4, int i, boolean z, boolean z2) {
        this.A04 = r4;
        this.A03 = r3;
        this.A06 = z;
        this.A02 = userSession;
        this.A01 = r1;
        this.A00 = i;
        this.A05 = z2;
    }

    public final void onClick(View view) {
        int A052 = AnonymousClass0fD.A05(-454979231);
        AnonymousClass32J r6 = this.A04;
        if (r6 != null) {
            1Xj r7 = this.A03;
            if (r7.A50() && this.A06) {
                Context context = view.getContext();
                0qQ.A07(context);
                AnonymousClass4U8 r1 = new AnonymousClass4U8(context, this.A02, r7.CEL(), this.A01.getModuleName());
                r1.A02 = true;
                AnonymousClass4UA.A00(r1.A00());
            }
            r6.DIH(view, r7, this.A00);
            if (this.A05) {
                UserSession userSession = this.A02;
                I2F.A00(HNS.GO_TO_POST, HNP.MEDIA_GRID, r7, this.A01, userSession, AnonymousClass05K.A01);
            }
        }
        AnonymousClass0fD.A0C(-1691968609, A052);
    }
}
