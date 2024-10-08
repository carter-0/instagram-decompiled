package X;

import android.content.Context;
import com.instagram.common.session.UserSession;

public abstract class F8N {
    public static final int A00(C59678JTj jTj) {
        Object obj = jTj.A01;
        if (obj instanceof C268664dn) {
            return -1;
        }
        if (obj instanceof C268674do) {
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<Error of com.instagram.util.lifecycle.HttpErrorUtilKt.statusCodeOrNegative1>");
            Object obj2 = ((C268674do) obj).A00;
            if (obj2 instanceof AnonymousClass1XT) {
                return ((1XR) obj2).getStatusCode();
            }
            return -1;
        }
        throw AnonymousClass7TE.A1K();
    }

    public static final String A01(Context context, C59678JTj jTj, UserSession userSession) {
        StringBuilder A1A;
        Object obj = jTj.A01;
        if (obj instanceof C268664dn) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append(context.getString(2131968407));
            if (1CI.A00(userSession)) {
                A1A.append(10);
                0qQ.A0C(obj, C66579MXk.A00(22));
                A1A.append(((C268664dn) obj).A00);
            }
        } else if (obj instanceof C268674do) {
            A1A = AnonymousClass7TE.A1A();
            A1A.append(context.getString(2131974097));
            0qQ.A0C(obj, "null cannot be cast to non-null type com.instagram.common.api.base.ApiError.Response<Error of com.instagram.util.lifecycle.HttpErrorUtilKt.buildErrorMessage$lambda$1>");
            AnonymousClass1XT r2 = (1XR) ((C268674do) obj).A00;
            if (1CI.A00(userSession)) {
                A1A.append(002.A00(' ', r2.getStatusCode()));
                if (r2 instanceof AnonymousClass1XT) {
                    A1A.append(002.A0D(r2.getErrorMessage(), ' '));
                }
            }
        } else {
            throw AnonymousClass7TE.A1K();
        }
        return DbT.A10(A1A);
    }
}
