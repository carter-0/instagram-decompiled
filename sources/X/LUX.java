package X;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class LUX implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    public LUX(Object obj, Object obj2, Object obj3, String str, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A02 = obj3;
        this.A04 = str;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        1OC A07;
        int i2;
        boolean z;
        switch (this.A00) {
            case 0:
                LRN lrn = (LRN) this.A02;
                LRO.A01(LRN.A01(lrn, AnonymousClass05K.A00, AnonymousClass05K.A0j), lrn);
                UserSession userSession = (UserSession) this.A03;
                C309516Yo A0M = DbS.A0M((FragmentActivity) this.A01, userSession);
                A0M.A0E = true;
                A0M.A0B((Bundle) null, AnonymousClass2BF.A00().A02().A00(userSession, "REEL", (String) null, this.A04, true));
                A0M.A04();
                return;
            case 1:
                Context context = (Context) this.A01;
                UserSession userSession2 = (UserSession) this.A03;
                Object obj = this.A02;
                String str = this.A04;
                C41566AwY awY = new C41566AwY(41, obj, userSession2);
                J6O j6o = new J6O(context, 1);
                Integer A022 = C319116q4.A02(userSession2, false);
                if (A022 == AnonymousClass05K.A00) {
                    2IS A042 = C41845B3m.A04();
                    DbW.A18(JTU.A0A(str), A042, "input");
                    A07 = JTS.A0S(A042, userSession2, C60833Js2.class, "ContentSchedulingDeleteMutation", true).A05();
                    i2 = 4;
                } else {
                    Integer num = AnonymousClass05K.A01;
                    if (A022 == num) {
                        2IS A043 = C41845B3m.A04();
                        DbW.A18(JTU.A0A(str), A043, "input");
                        A07 = JTS.A0S(A043, userSession2, C60832Js1.class, "ContentSchedulingDeleteGenPopLinkedMutation", true).A07(num);
                        i2 = 5;
                    } else {
                        j6o.invoke("Scheduling not enabled");
                        C59689JTv.A07(context, 2131957623);
                        return;
                    }
                }
                A07.A00 = new C15625Ufr(i2, context, j6o, awY);
                1ES.A03(A07);
                C59689JTv.A07(context, 2131957623);
                return;
            case 2:
                z = true;
                ((C363008it) this.A02).A05(true, "ig_story_composer");
                C64370Lam.A01(C368278sM.ACCEPT, (UserSession) this.A03, this.A04, (String) null);
                break;
            case 3:
                VK6.A00.A02((UserSession) this.A03, (AnonymousClass4O6) this.A02, ((C16530Uwa) this.A01).name(), this.A04);
                dialogInterface.cancel();
                return;
            default:
                UserSession userSession3 = (UserSession) this.A03;
                z = true;
                ((C363548ju) this.A02).A01(userSession3, "upsell", true);
                C64373Lap.A03(C368278sM.ACCEPT, userSession3, this.A04, (String) null);
                break;
        }
        C66461MSp mSp = (C66461MSp) this.A01;
        if (mSp != null) {
            mSp.afterSelection(z);
        }
    }
}
