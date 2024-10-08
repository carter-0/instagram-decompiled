package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

/* renamed from: X.Edw  reason: case insensitive filesystem */
public abstract class C48401Edw {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        DwI parseFromJson = F66.parseFromJson(16P.A00(DbY.A0h(r9, 1)));
        0qQ.A0A(parseFromJson);
        Context requireContext = DbU.A0H(r8).requireContext();
        FragmentActivity A04 = C308206Td.A04(r8);
        Fragment A0H = DbU.A0H(r8);
        AnonymousClass0aP A0B = C308206Td.A0B(r8);
        0qQ.A0C(A0B, AnonymousClass000.A00(36));
        C48971En9.A00(requireContext, A0H, A04, C308206Td.A06(r8), A0B, parseFromJson, true);
        return null;
    }
}
