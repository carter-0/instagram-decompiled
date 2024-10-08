package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.EBq  reason: case insensitive filesystem */
public final class C47656EBq extends 1P0 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C47656EBq(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final void onFail(C268654dm r6) {
        int i;
        int i2;
        String str;
        switch (this.A00) {
            case 0:
                i = AnonymousClass0fD.A03(-1076584739);
                int A05 = DbS.A05(this.A01);
                C310336ap A0X = DbV.A0X();
                A0X.A0H = "batch_remove_many_followers_request_failed";
                A0X.A0D = DbV.A05((Fragment) this.A02).getQuantityString(R.plurals.batch_non_recip_remove_failed, A05);
                A0X.A06();
                DbY.A1N(A0X);
                i2 = -1725601436;
                break;
            case 2:
                i = AnonymousClass0fD.A03(-327771211);
                C59689JTv.A0E((Context) this.A01, "requestMentionTask_network_error");
                i2 = -564144948;
                break;
            case 3:
                i = AnonymousClass0fD.A03(-1141800706);
                C64986LlP llP = (C64986LlP) ((FQU) this.A01).A01;
                1Av A002 = 1Au.A00(llP.A0C);
                switch (AnonymousClass7TE.A0M(this.A02)) {
                    case 0:
                        str = "off";
                        break;
                    case 1:
                        str = "anyone";
                        break;
                    default:
                        str = "following";
                        break;
                }
                0xY A0p = AnonymousClass7TE.A0p(A002);
                A0p.E5g(AnonymousClass000.A00(754), str);
                A0p.apply();
                C59689JTv.A0A(llP.A09, "setReelMessagePrefs_error");
                C64986LlP.A04(llP);
                i2 = -736282470;
                break;
            default:
                C47656EBq.super.onFail(r6);
                return;
        }
        AnonymousClass0fD.A0A(i2, i);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A03;
        int i;
        switch (this.A00) {
            case 0:
                A03 = AnonymousClass0fD.A03(1907506848);
                int A032 = AnonymousClass0fD.A03(-200199139);
                ArrayList A1C = AnonymousClass7TE.A1C();
                Iterator it = ((List) this.A01).iterator();
                while (it.hasNext()) {
                    Dbb.A1U(AnonymousClass7TE.A18(it), A1C, ((C46430Der) this.A02).A0u);
                }
                C46430Der der = (C46430Der) this.A02;
                C46435Dex dex = der.A0E;
                if (dex != null) {
                    C46435Dex.A02(dex, der, A1C);
                    C59689JTv.A09(der.getContext(), DbY.A0d(DbV.A05(der), A1C.size(), R.plurals.batch_non_recip_remove_success));
                    AnonymousClass0fD.A0A(593837768, A032);
                    i = -1073456702;
                    break;
                } else {
                    0qQ.A0F("followListAdapter");
                    throw AnonymousClass00P.createAndThrow();
                }
            case 1:
                A03 = AnonymousClass0fD.A03(-926907430);
                C320136rp r7 = (C320136rp) obj;
                int A033 = AnonymousClass0fD.A03(894451690);
                C47498E5d e5d = (C47498E5d) this.A01;
                e5d.A0A = true;
                e5d.A0B = !r7.A0E;
                C294695ms.A00(e5d.A01).A0C(r7, (User) this.A02, (String) null);
                AnonymousClass0fD.A0A(-1469128115, A033);
                i = -158747470;
                break;
            case 2:
                A03 = AnonymousClass0fD.A03(1378711846);
                int A034 = AnonymousClass0fD.A03(-1257792593);
                C59689JTv.A07((Context) this.A01, 2131972237);
                1Xj r0 = ((C255773uh) this.A02).A0b;
                if (r0 != null) {
                    r0.A0C.Eqb(false);
                }
                AnonymousClass0fD.A0A(-1954684707, A034);
                i = -1845023843;
                break;
            default:
                A03 = AnonymousClass0fD.A03(-1274857791);
                int A035 = AnonymousClass0fD.A03(-425049769);
                C47656EBq.super.onSuccess(obj);
                AnonymousClass0fD.A0A(1402410476, A035);
                i = -1014929448;
                break;
        }
        AnonymousClass0fD.A0A(i, A03);
    }
}
