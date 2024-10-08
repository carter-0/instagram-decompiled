package X;

import android.app.Activity;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;
import java.util.List;

public final class ITZ implements C229992ok {
    public final AnonymousClass0iw A00;
    public final AnonymousClass57L A01;
    public final C229982oj A02;
    public final C230012om A03;
    public final Integer A04;

    public final void Ckj(AnonymousClass3UH r1) {
    }

    public final void Ckk(AnonymousClass3UH r1) {
    }

    public final void Ckl(AnonymousClass3UH r1) {
    }

    public final void DpF(Activity activity, View view, UserSession userSession, AnonymousClass3UM r19, Integer num, String str, String str2, String str3, String str4, String str5, List list, int i, int i2, int i3) {
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 0);
        this.A02.DpF(activity, view, userSession2, r19, num, str, str2, str3, str4, str5, list, i, i2, i3);
    }

    public final void DpO(C292975jp r1, User user, int i) {
    }

    public final AnonymousClass0iw AbT() {
        return this.A00;
    }

    public final void DpE(1UQ r9, AnonymousClass3UO r10, Integer num, String str, String str2, String str3, List list) {
        this.A02.DpE(r9, r10, num, str, str2, str3, list);
    }

    public final void DpH(1UQ r10, AnonymousClass3UM r11, String str, String str2, String str3, String str4, int i, int i2) {
        this.A02.DpH(r10, r11, str, str2, str3, str4, i, i2);
    }

    public final void DpJ(AnonymousClass3UM r11, Long l, String str, String str2, String str3, String str4, int i, int i2, int i3) {
        this.A02.DpJ(r11, l, str, "profile", str3, str4, i, i2, i3);
    }

    public final void DpM(1UQ r9, Integer num, String str, String str2, String str3, String str4, int i) {
        this.A02.DpM(r9, num, str, str2, str3, str4, i);
    }

    public final void DpN() {
        this.A02.DpN();
        this.A01.A00 = true;
    }

    public ITZ(Fragment fragment, FragmentActivity fragmentActivity, AnonymousClass0iw r12, UserSession userSession, AnonymousClass57L r14, Integer num) {
        this.A02 = new C229982oj(fragment, fragmentActivity, r12, userSession, (C229962oh) null, (AnonymousClass2oG) null, (C229972oi) null, num);
        this.A00 = r12;
        this.A04 = num;
        this.A01 = r14;
        this.A03 = new C230012om(r12, userSession);
    }

    public final void A9R(AnonymousClass3O9 r2, C242803Vz r3) {
        AnonymousClass7TG.A1N(r2, r3);
        this.A02.A9R(r2, r3);
    }

    public final void DpI(AnonymousClass3UM r20, String str, String str2, String str3, String str4, int i, int i2) {
        EWA ewa;
        String str5;
        User CCd = r20.CCd();
        String str6 = null;
        if (CCd != null) {
            FollowStatus B6o = CCd.B6o();
            str6 = GTN.A00(GTO.A00(B6o));
            ewa = C292995jr.A02(B6o);
        } else {
            ewa = null;
        }
        String A002 = C294615mk.A00(this.A04);
        String id = r20.getId();
        String moduleName = this.A00.getModuleName();
        AnonymousClass7TG.A1Q(id, moduleName);
        String str7 = "";
        String algorithm = r20.getAlgorithm();
        String CDC = r20.CDC();
        if (CDC != null) {
            str7 = CDC;
        }
        String BxN = r20.BxN();
        if (ewa == null || (str5 = ewa.A00) == null) {
            str5 = "";
        }
        C230012om.A05(this.A03, algorithm, moduleName, (String) null, (String) null, str6, str7, (String) null, str3, str4, str5, BxN, id, A002, i2, i);
    }

    public final void EBq(View view, AnonymousClass3O9 r3) {
        AnonymousClass7TG.A1N(r3, view);
        this.A02.EBq(view, r3);
    }
}
