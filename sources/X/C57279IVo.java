package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

/* renamed from: X.IVo  reason: case insensitive filesystem */
public final class C57279IVo implements AnonymousClass2p0 {
    public final AnonymousClass0iw A00;
    public final C230142oz A01;
    public final C230012om A02;
    public final Integer A03;

    public final void DLD(1UQ r2, AnonymousClass3UH r3) {
        this.A01.DLD(r2, r3);
    }

    public final void DLE(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2) {
        this.A01.DLE(vc5, str, "preview", str3, i, i2);
    }

    public final void DLF(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2) {
        this.A01.DLF(vc5, str, "preview", str3, i, i2);
    }

    public final void DLG(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2) {
        this.A01.DLG(vc5, str, "preview", str3, i, i2);
    }

    public final void DLH(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, long j) {
        AnonymousClass7TF.A1C(vc5, 0, str);
        this.A01.DLH(vc5, str, "preview", str3, i, i2, j);
    }

    public final void DLI(C17674Vc5 vc5, int i, int i2, int i3) {
        this.A01.DLI(vc5, i, i2, i3);
    }

    public final void DLJ(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, long j) {
        AnonymousClass7TF.A1C(vc5, 0, str);
        this.A01.DLJ(vc5, str, "topic_card", str3, i, i2, j);
    }

    public final void DLK(1UQ r2) {
        this.A01.DLK(r2);
    }

    public final void DLL(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2) {
        this.A01.DLL(vc5, str, "preview", str3, i, i2);
    }

    public final void DLM(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, int i3) {
        String str4;
        C17674Vc5 vc52 = vc5;
        User user = vc52.A02;
        if (user != null) {
            FollowStatus B6o = user.B6o();
            Integer A002 = GTO.A00(B6o);
            String A003 = C294615mk.A00(this.A03);
            String id = user.getId();
            String moduleName = this.A00.getModuleName();
            0qQ.A0B(moduleName, 3);
            String A004 = GTN.A00(A002);
            String str5 = vc52.A03;
            EWA A022 = C292995jr.A02(B6o);
            if (A022 != null) {
                str4 = A022.A00;
            } else {
                str4 = null;
            }
            C230012om.A05(this.A02, "", moduleName, str5, "preview", A004, "", str, str3, (String) null, str4, (String) null, id, A003, i, i2);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final void DLN(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, int i3) {
        this.A01.DLN(vc5, str, "preview", str3, i, i2, i3);
    }

    public final void DLO(C17674Vc5 vc5, String str, String str2, String str3, int i, int i2, int i3, long j) {
        AnonymousClass7TF.A1D(vc5, 0, str);
        this.A01.DLO(vc5, str, "preview", str3, i, i2, 0, j);
    }

    public C57279IVo(FragmentActivity fragmentActivity, AnonymousClass0iw r9, UserSession userSession, C230132oy r11, Integer num) {
        this.A01 = new C230142oz(fragmentActivity, r9, userSession, (AnonymousClass2oG) null, r11, num);
        this.A03 = num;
        this.A00 = r9;
        this.A02 = new C230012om(r9, userSession);
    }

    public final void A9R(AnonymousClass3O9 r2, C242803Vz r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A01.A9R(r2, r3);
    }

    public final void EBq(View view, AnonymousClass3O9 r3) {
        AnonymousClass7TG.A1N(r3, view);
        this.A01.EBq(view, r3);
    }
}
