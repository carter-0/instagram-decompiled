package X;

import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Map;

public final class P16 implements C74446Pv1 {
    public final /* synthetic */ NVM A00;

    public final void Dg4(String str, int i, Integer num) {
        0qQ.A0B(str, 0);
        C71140Odl odl = (C71140Odl) this.A00.A04.getValue();
        String A02 = C71140Odl.A02(num);
        C71140Odl.A06(odl, DbS.A0j(i), str, A02, "inbox_invites_sheet", (String) null, (Map) null, true);
    }

    public final void DgA(Integer num, String str, String str2, String str3, int i) {
        String str4 = str;
        0qQ.A0B(str, 0);
        if (num != null) {
            int intValue = num.intValue();
            if (intValue == 29) {
                NVM nvm = this.A00;
                UserSession A0l = AnonymousClass7TE.A0l(nvm.A05);
                FragmentActivity requireActivity = nvm.requireActivity();
                0qQ.A0B(A0l, 0);
                1pE A01 = 1pE.A01(requireActivity, nvm, A0l, "inbox_channel_invitation");
                A01.A00 = nvm;
                DbZ.A1Z(A01, str);
                A01.A0F = 107;
                A01.A0K = null;
                DbV.A1R(A01);
            } else if (intValue == 32) {
                String str5 = str2;
                if (str2 != null) {
                    String str6 = str3;
                    if (str3 != null) {
                        NVM nvm2 = this.A00;
                        nvm2.A0F(num, str, str5, str6);
                        nvm2.A01 = str;
                    }
                }
            }
        }
        C71140Odl.A05((C71140Odl) this.A00.A04.getValue(), DbS.A0j(i), str4, C71140Odl.A02(num), "inbox_invites_sheet", (String) null, (Map) null, true);
    }

    public P16(NVM nvm) {
        this.A00 = nvm;
    }

    public final void DgI(View view, String str, String str2, int i) {
        AnonymousClass7TG.A1N(str, str2);
        this.A00.A0E(view, str, str2, i);
    }
}
