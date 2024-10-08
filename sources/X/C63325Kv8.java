package X;

import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.direct.intf.DirectShareSheetAppearance;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.Kv8  reason: case insensitive filesystem */
public abstract class C63325Kv8 {
    public static final void A00(AnonymousClass4DH r20, UserSession userSession, MXF mxf, C62548Khe khe, C62549Khf khf, C66555MWj mWj, List list, C62320sa r27, 0sP r28) {
        Integer num;
        String A00;
        C66555MWj mWj2 = mWj;
        UserSession userSession2 = userSession;
        0qQ.A0B(userSession2, 1);
        MXF mxf2 = mxf;
        C62548Khe khe2 = khe;
        C62549Khf khf2 = khf;
        AnonymousClass7TG.A0w(2, mxf2, khf2, khe2);
        C62320sa r2 = r27;
        0sP r3 = r28;
        AnonymousClass7TF.A1F(r3, 7, r2);
        Integer num2 = AnonymousClass05K.A08;
        HashMap A1E = AnonymousClass7TE.A1E();
        int ordinal = khf2.ordinal();
        if (ordinal == 0) {
            num = AnonymousClass05K.A00;
        } else if (ordinal != 1) {
            num = AnonymousClass05K.A0C;
        } else {
            num = AnonymousClass05K.A01;
        }
        switch (C51967G9n.A03(num, 0)) {
            case 0:
                A00 = AnonymousClass000.A00(1278);
                break;
            case 1:
                A00 = "system_tray";
                break;
            default:
                A00 = "copy_link";
                break;
        }
        A1E.put("share_mode", A00);
        A1E.put("source", khe2.A00);
        C64127LPb.A02(mxf2, num2, A1E);
        AnonymousClass4DH r13 = r20;
        if (ordinal != 2) {
            C61221JzE jzE = (C61221JzE) mWj2;
            if (ordinal != 1) {
                String str = jzE.A03;
                if (str != null) {
                    Integer num3 = AnonymousClass05K.A0k;
                    HashMap A1E2 = AnonymousClass7TE.A1E();
                    List list2 = list;
                    A1E2.put("suggested_thread_ids", DbT.A0z(",", list2, (0sP) null));
                    C64127LPb.A02(mxf2, num3, A1E2);
                    C49731F3w A07 = 1as.A04.A02.A07(r13, userSession2, 2FW.A1B);
                    A07.A06(str);
                    Bundle bundle = A07.A07;
                    bundle.putBoolean(AnonymousClass000.A00(2217), true);
                    bundle.putBoolean(AnonymousClass000.A00(2216), true);
                    A07.A08(false);
                    bundle.putStringArrayList(AnonymousClass000.A00(2224), AnonymousClass7TE.A1D(list2));
                    bundle.putParcelable(AnonymousClass000.A00(42), new DirectShareSheetAppearance((String) null, (String) null, AnonymousClass972.MUTABLE_FLAG_MASK, false, false, false, true, false, false, false, false, false, false, false, false, false, false));
                    A07.A01 = new C65270LqP(mxf2, r2);
                    r3.invoke(A07.A00());
                    return;
                }
                return;
            }
            Bundle A0B = DbY.A0B("android.intent.extra.TEXT", jzE.A04);
            C46395DeI.A0Q(r13.requireActivity(), A0B, r13, userSession2, C66579MXk.A00(73), AnonymousClass7TE.A1E());
            return;
        }
        0nC.A00(r13.requireActivity(), ((C61221JzE) mWj2).A04);
        r2.invoke();
    }
}
