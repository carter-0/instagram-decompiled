package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.UfT  reason: case insensitive filesystem */
public final class C15601UfT extends 1P0 {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final boolean A05;

    public C15601UfT(Object obj, Object obj2, Object obj3, int i, int i2, boolean z) {
        this.A00 = i2;
        this.A02 = obj2;
        this.A05 = z;
        this.A03 = obj3;
        this.A04 = obj;
        this.A01 = i;
    }

    public final void onFail(C268654dm r6) {
        int A032;
        int i;
        String str;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(2112935907);
            boolean z = this.A05;
            C46521DgO dgO = (C46521DgO) this.A02;
            C283155Gi r2 = (C283155Gi) this.A04;
            int i2 = this.A01;
            if (z) {
                str = "remove_from_profile_failed";
            } else {
                str = "show_on_profile_failed";
            }
            C46521DgO.A04(dgO, r2, str, i2);
            i = -2139496223;
        } else {
            A032 = AnonymousClass0fD.A03(-450835575);
            C15601UfT.super.onFail(r6);
            ((C17966Vj0) this.A04).A00 = !this.A05;
            C18783W1j w1j = (C18783W1j) this.A02;
            C18783W1j.A02(w1j, this.A01);
            C48774Ejx.A00((Context) w1j.A05.get(), r6, "create_feed_favorites_status_request_failure");
            i = 1758941560;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX WARNING: type inference failed for: r0v10, types: [X.1qK, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        1Xj r1;
        boolean z;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-1863950024);
            int A033 = AnonymousClass0fD.A03(238192666);
            boolean z2 = this.A05;
            C46521DgO dgO = (C46521DgO) this.A02;
            C283155Gi r2 = (C283155Gi) this.A04;
            int i2 = this.A01;
            if (z2) {
                C46521DgO.A04(dgO, r2, "remove_from_profile_success", i2);
                r1 = (1Xj) this.A03;
                z = false;
            } else {
                C46521DgO.A04(dgO, r2, "show_on_profile_success", i2);
                r1 = (1Xj) this.A03;
                z = true;
            }
            r1.A0C.Efg(Boolean.valueOf(z));
            AnonymousClass0fD.A0A(1802343781, A033);
            i = 816287579;
        } else {
            A032 = AnonymousClass0fD.A03(-957456286);
            int A034 = AnonymousClass0fD.A03(1725757848);
            C15601UfT.super.onSuccess(obj);
            boolean z3 = this.A05;
            C18783W1j w1j = (C18783W1j) this.A02;
            C18068Vku vku = w1j.A02;
            User user = (User) this.A03;
            if (z3) {
                vku.A02(user);
            } else {
                vku.A03(user);
            }
            user.A11(z3);
            C18783W1j.A01(w1j);
            C49905FEd fEd = FA1.A01;
            UserSession userSession = w1j.A04;
            fEd.A02(userSession);
            if (182.A06(0Tu.A05, userSession, 36318312174458958L)) {
                AnonymousClass1Nd.A00(userSession).A00(new Object());
            }
            AnonymousClass0fD.A0A(721550663, A034);
            i = 1364155995;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
