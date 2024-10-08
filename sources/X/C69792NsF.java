package X;

import com.facebook.quicklog.PointEditor;
import com.instagram.common.session.UserSession;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.NsF  reason: case insensitive filesystem */
public abstract class C69792NsF {
    public static final Object A00(C307896Rx r8, AnonymousClass6Tm r9) {
        1QP A00;
        String valueOf;
        int A04 = DbW.A04(r9.A01(), "null cannot be cast to non-null type kotlin.Number");
        int A042 = DbW.A04(r9.A02(), "null cannot be cast to non-null type kotlin.Number");
        Object A002 = r9.A00();
        DbS.A1Y(A002);
        String str = (String) A002;
        Map map = (Map) r9.A00.get(3);
        0lg A0B = C308206Td.A0B(r8);
        if (!(A0B instanceof UserSession) || A0B == null) {
            A00 = C69748NrX.A00();
        } else {
            A00 = AnonymousClass1QO.A00(A0B);
        }
        long generateFlowId = A00.generateFlowId(A04, A042);
        if (map == null) {
            A00.flowMarkPoint(generateFlowId, str);
            return null;
        }
        PointEditor markPointWithEditor = A00.markPointWithEditor(generateFlowId, str);
        Iterator A0u = AnonymousClass7TF.A0u(map);
        while (A0u.hasNext()) {
            Map.Entry A1J = AnonymousClass7TE.A1J(A0u);
            Object value = A1J.getValue();
            if (value instanceof Number) {
                markPointWithEditor.addPointData(DbT.A13(A1J), C66582MXn.A08(A1J));
            } else {
                boolean z = value instanceof Boolean;
                String A13 = DbT.A13(A1J);
                Object value2 = A1J.getValue();
                if (z) {
                    markPointWithEditor.addPointData(A13, AnonymousClass7TE.A1a(value2));
                } else {
                    if (value2 instanceof Number) {
                        valueOf = value2.toString();
                    } else {
                        valueOf = String.valueOf(value2);
                    }
                    markPointWithEditor.addPointData(A13, valueOf);
                }
            }
        }
        markPointWithEditor.markerEditingCompleted();
        return null;
    }
}
