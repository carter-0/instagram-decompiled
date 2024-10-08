package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.MediaControlEventSourceEnum;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import java.util.HashMap;

public final class IVU implements MVB {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public final /* synthetic */ void onTextClick(View view) {
    }

    public IVU(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void onButtonClick(View view) {
        Context context;
        JR4 jr4;
        String str;
        AnonymousClass6W8 A0b;
        switch (this.A00) {
            case 0:
                context = (Context) this.A01;
                jr4 = (JR4) this.A02;
                str = "see_less";
                break;
            case 1:
                context = (Context) this.A01;
                jr4 = (JR4) this.A02;
                str = "see_more";
                break;
            case 2:
                DbS.A1U(this.A01);
                return;
            case 3:
                C231142qw r0 = (C231142qw) this.A03;
                boolean z = r0.A0D;
                1Y8 A002 = C55115HcO.A00();
                FragmentActivity fragmentActivity = r0.A01;
                UserSession userSession = r0.A02;
                String str2 = r0.A0C;
                String moduleName = r0.A03.getModuleName();
                if (z) {
                    if (182.A06(DbS.A0J(moduleName, 3), userSession, 36312814616446213L)) {
                        HashMap A1E = AnonymousClass7TE.A1E();
                        String str3 = "";
                        if (str2 == null) {
                            str2 = str3;
                        }
                        A1E.put("shopping_session_id", str2);
                        A1E.put("prior_module", moduleName);
                        A1E.put("collection_id", str3);
                        if (!182.A06(0Tu.A06, userSession, 36314146056178143L)) {
                            str3 = new S2J(fragmentActivity).A00();
                        }
                        A1E.put(AnonymousClass000.A00(769), str3);
                        IgBloksScreenConfig A0N = DbS.A0N(userSession);
                        A0N.A0i = true;
                        C46649DiU A04 = C46649DiU.A04(AnonymousClass000.A00(1185), A1E);
                        A04.A00 = 760101916;
                        A0b = DbS.A0b(fragmentActivity, C49891FBs.A00(A0N, A04), userSession, ModalActivity.class, "bloks");
                    } else {
                        Bundle A0a = AnonymousClass7TE.A0a();
                        A0a.putString("shopping_session_id", str2);
                        A0a.putString(AnonymousClass000.A00(1703), moduleName);
                        A0a.putInt(AnonymousClass000.A00(391), 37367682);
                        A0b = DbS.A0b(fragmentActivity, A0a, userSession, ModalActivity.class, C273654mx.A00(3281));
                    }
                    A0b.A0C(fragmentActivity);
                    return;
                }
                A002.A07(fragmentActivity, userSession, str2, moduleName);
                return;
            case 4:
                1Xj r1 = (1Xj) this.A02;
                C52029GCb.A08((MediaControlEventSourceEnum) this.A01, r1, (C52029GCb) this.A03);
                return;
            default:
                ((0r1) this.A01).A00 = true;
                I4M i4m = (I4M) this.A03;
                I4M.A00((C241293Oq) this.A02, i4m.A0C, i4m);
                C55680Hld hld = i4m.A01;
                if (hld != null) {
                    0Aj A0e = AnonymousClass7TE.A0e(hld.A01, "follow_prompt_clicked");
                    DbW.A15(A0e, hld.A00);
                    C51974G9v.A0s(A0e, "toast", (String) null);
                    A0e.A8k("num_facepiles", (Integer) null);
                    A0e.Cgf();
                    return;
                }
                return;
        }
        C310336ap A0Z = C51975G9x.A0Z();
        DbS.A19(context, A0Z, 2131975852);
        A0Z.A0R = true;
        Dbb.A1Q(A0Z);
        jr4.Cl2(str);
    }

    public final void onDismiss() {
        Integer num;
        switch (this.A00) {
            case 2:
                C69111Neq neq = (C69111Neq) this.A03;
                C71111Ocu ocu = neq.A0E;
                N9C n9c = neq.A04;
                if (n9c == null || (num = n9c.A02) == null) {
                    num = AnonymousClass05K.A00;
                }
                ocu.A03(new PPW(num, false));
                return;
            case 5:
                0r1 r1 = (0r1) this.A01;
                if (r1.A00) {
                    r1.A00 = false;
                    return;
                }
                C55680Hld hld = ((I4M) this.A03).A01;
                if (hld != null) {
                    0Aj A0e = AnonymousClass7TE.A0e(hld.A01, "follow_prompt_denied");
                    DbW.A15(A0e, hld.A00);
                    C51974G9v.A0s(A0e, "toast", (String) null);
                    A0e.A8k("num_facepiles", (Integer) null);
                    A0e.Cgf();
                    return;
                }
                return;
            default:
                return;
        }
    }

    public final void onShow() {
        Integer num;
        switch (this.A00) {
            case 2:
                C69111Neq neq = (C69111Neq) this.A03;
                C71111Ocu ocu = neq.A0E;
                N9C n9c = neq.A04;
                if (n9c == null || (num = n9c.A02) == null) {
                    num = AnonymousClass05K.A00;
                }
                ocu.A03(new PPW(num, true));
                DbS.A1U(this.A02);
                return;
            case 5:
                C55680Hld hld = ((I4M) this.A03).A01;
                if (hld != null) {
                    0Aj A0e = AnonymousClass7TE.A0e(hld.A01, "follow_prompt_impression");
                    DbW.A15(A0e, hld.A00);
                    C51974G9v.A0s(A0e, "toast", (String) null);
                    A0e.A8k("num_facepiles", (Integer) null);
                    A0e.Cgf();
                    return;
                }
                return;
            default:
                return;
        }
    }
}
