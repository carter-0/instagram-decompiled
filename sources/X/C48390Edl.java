package X;

import androidx.fragment.app.FragmentActivity;
import com.facebook.proxygen.TraceEventType;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import java.util.HashMap;
import java.util.Map;

/* renamed from: X.Edl  reason: case insensitive filesystem */
public abstract class C48390Edl {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String A0h = DbY.A0h(r10, 0);
        Object A02 = r10.A02();
        0qQ.A0C(A02, "null cannot be cast to non-null type kotlin.collections.Map<kotlin.Any, kotlin.Any>");
        Map map = (Map) A02;
        FragmentActivity A04 = C308206Td.A04(r9);
        AnonymousClass7TF.A1C(A04, 0, map);
        HashMap A0H = C308206Td.A0H(map);
        C229382nI A06 = C308206Td.A06(r9);
        Integer A00 = C48718Ej3.A00(TraceEventType.Push);
        IgBloksScreenConfig A0N = DbS.A0N(C308206Td.A0B(r9));
        A0N.A07 = null;
        A0N.A0l = false;
        A0N.A0f = false;
        A0N.A0h = false;
        A0N.A0g = false;
        A0N.A0c = A06.A00;
        A0N.A0P = A00;
        A0N.A0S = null;
        A0N.A0R = null;
        C46649DiU A042 = C46649DiU.A04(A0h, A0H);
        A042.A00 = 719983200;
        A042.A0D(A04, A0N);
        return null;
    }
}
