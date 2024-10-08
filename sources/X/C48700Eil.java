package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Eil  reason: case insensitive filesystem */
public abstract class C48700Eil {
    public static final Object A00(C307896Rx r10, AnonymousClass6Tm r11) {
        String str;
        ArrayList A01;
        List list = r11.A00;
        String A0t = DbU.A0t(list, 0);
        String A0t2 = DbU.A0t(list, 1);
        C277014uI A0R = DbV.A0R(list, 2);
        0lg A0B = C308206Td.A0B(r10);
        FragmentActivity A04 = C308206Td.A04(r10);
        Context A042 = DbT.A04();
        if (A0R == null) {
            return null;
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        if (A0t != null) {
            int hashCode = A0t.hashCode();
            if (hashCode != 69888) {
                if (hashCode != 561774310) {
                    if (hashCode == 2032871314 && A0t.equals("Instagram")) {
                        A01 = FHC.A04(A0B, A0t2);
                        A1C.addAll(A01);
                        DbX.A1P(r10, DbS.A0P(), A0R, A1C, 0);
                        return null;
                    }
                } else if (A0t.equals("Facebook")) {
                    A1C.addAll(FHC.A07(A042, A04, A0B, A0t2));
                    0qQ.A0B(A0B, 0);
                    A01 = FHC.A00(A042, A0B, "ig_android_access_library_fx_fetch_active_msgr_token", "FxNativeAuthDataHelper");
                    A1C.addAll(A01);
                    DbX.A1P(r10, DbS.A0P(), A0R, A1C, 0);
                    return null;
                }
            } else if (A0t.equals("FRL")) {
                0qQ.A0B(A0B, 0);
                str = "FxNativeAuthDataHelper";
                A01 = FHC.A01(A042, A0B, "ig_android_access_library_fx_fetch_active_twilight_token", str);
                A1C.addAll(A01);
                DbX.A1P(r10, DbS.A0P(), A0R, A1C, 0);
                return null;
            }
        }
        A1C.addAll(FHC.A04(A0B, A0t2));
        A1C.addAll(FHC.A07(A042, A04, A0B, A0t2));
        0qQ.A0B(A0B, 0);
        str = "FxNativeAuthDataHelper";
        A1C.addAll(FHC.A00(A042, A0B, "ig_android_access_library_fx_fetch_active_msgr_token", str));
        A01 = FHC.A01(A042, A0B, "ig_android_access_library_fx_fetch_active_twilight_token", str);
        A1C.addAll(A01);
        DbX.A1P(r10, DbS.A0P(), A0R, A1C, 0);
        return null;
    }
}
