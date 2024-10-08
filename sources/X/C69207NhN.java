package X;

import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.NhN  reason: case insensitive filesystem */
public final class C69207NhN extends C243843aC {
    public final /* synthetic */ int A00;
    public final /* synthetic */ C67687MsP A01;
    public final /* synthetic */ AnonymousClass3UL A02;

    public final void D2Y(FollowStatus followStatus, User user) {
        0qQ.A0B(user, 0);
        int i = this.A00;
        if (i != -1) {
            C67687MsP msP = this.A01;
            AnonymousClass3UH r0 = msP.A01;
            if (r0 != null) {
                AnonymousClass3UL r4 = this.A02;
                msP.A07.DpI(r4, r0.A0C, "fish-eye", r0.getId(), r0.A0I, r0.A01, i);
            }
            FollowStatus A0i = DbV.A0i(msP.A06, user);
            if (A0i == FollowStatus.A05 || A0i == FollowStatus.A07) {
                msP.A08.run();
            }
        }
        if (C231732sB.A00) {
            0fE.A00(this.A01, -563442104);
        }
    }

    public C69207NhN(C67687MsP msP, AnonymousClass3UL r2, int i) {
        this.A00 = i;
        this.A01 = msP;
        this.A02 = r2;
    }
}
