package X;

import com.instagram.profile.fragment.UserDetailTabController;
import com.instagram.user.model.User;

/* renamed from: X.H4a  reason: case insensitive filesystem */
public final class C54231H4a extends 1P0 {
    public final /* synthetic */ C50672FgX A00;

    public C54231H4a(C50672FgX fgX) {
        this.A00 = fgX;
    }

    public final void onFail(C268654dm r6) {
        int A03 = AnonymousClass0fD.A03(1709986938);
        C50672FgX fgX = this.A00;
        C59689JTv.A0F(fgX.A04.getContext(), "translation_failed", 2131975513);
        fgX.A06.A0K(C322506vw.Original);
        AnonymousClass0fD.A0A(139149447, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(782659761);
        this.A00.A06.A0K(C322506vw.Loading);
        AnonymousClass0fD.A0A(-406271069, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        UserDetailTabController userDetailTabController;
        C322506vw r0;
        int A03 = AnonymousClass0fD.A03(1828346478);
        C54067Gyq gyq = (C54067Gyq) obj;
        int A032 = AnonymousClass0fD.A03(1918297093);
        0qQ.A0B(gyq, 0);
        String str = gyq.A00;
        C50672FgX fgX = this.A00;
        if (str == null) {
            C59689JTv.A01(fgX.A04.getContext(), "translation_failed", 2131975513, 0);
            userDetailTabController = fgX.A06;
            r0 = C322506vw.Original;
        } else {
            C55006Had.A00(0MB.A05(fgX.A02), gyq.A01);
            userDetailTabController = fgX.A06;
            String str2 = gyq.A00;
            C322486vu r1 = userDetailTabController.A0P;
            User user = r1.A0J;
            if (user != null) {
                user.A03.EpE(str2);
                r1.A00();
            }
            r0 = C322506vw.Translated;
        }
        userDetailTabController.A0K(r0);
        AnonymousClass0fD.A0A(1029165865, A032);
        AnonymousClass0fD.A0A(689143499, A03);
    }
}
