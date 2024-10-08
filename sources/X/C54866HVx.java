package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.sharesheet.DirectShareSheetFragment;
import java.io.IOException;
import java.util.AbstractMap;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* renamed from: X.HVx  reason: case insensitive filesystem */
public abstract class C54866HVx {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        String A0R;
        C307786Rm r0 = r9.A03;
        if (r0 != null) {
            FragmentActivity A03 = C308206Td.A03(r0);
            Object obj = r10.A00.get(0);
            0qQ.A0C(obj, C66579MXk.A00(376));
            AbstractMap abstractMap = (AbstractMap) obj;
            Object obj2 = abstractMap.get("permalink");
            0qQ.A0C(obj2, "null cannot be cast to non-null type kotlin.String");
            String str = (String) obj2;
            UserSession A0R2 = DbW.A0R(r9);
            try {
                1Xx parseFromJson = AnonymousClass1Xw.parseFromJson(16P.A00(new JSONObject(abstractMap).toString()));
                AtomicBoolean atomicBoolean = 1Xj.A0i;
                0qQ.A0A(parseFromJson);
                1Xj r4 = new 1Xj(new 1hu((UserSession) null), parseFromJson);
                String id = r4.getId();
                if (id != null) {
                    C49731F3w A08 = 1as.A04.A02.A08(A0R2, 2FW.A1h, C273654mx.A00(746));
                    A08.A04 = r4;
                    A08.A07(str);
                    A08.A06(id);
                    DirectShareSheetFragment A00 = A08.A00();
                    AnonymousClass37D A0i = DbT.A0i(A03);
                    if (A0i != null) {
                        A0i.A0J(A00);
                    }
                }
                return null;
            } catch (IOException e) {
                0wj r3 = 0wj.A01;
                if (e.getMessage() == null) {
                    A0R = "Failed to parse media dict";
                } else {
                    A0R = 002.A0R("Failed to parse media dict: ", e.getMessage());
                }
                DbT.A1Q(r3, A0R, 817905368);
                return null;
            }
        } else {
            throw AnonymousClass7TE.A0y();
        }
    }
}
