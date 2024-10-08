package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.Efd  reason: case insensitive filesystem */
public abstract class C48506Efd {
    public static final Object A00(C307896Rx r5) {
        FragmentActivity A08 = Dba.A08(r5);
        UserSession A0V = DbU.A0V(r5);
        DbS.A1Z(A0V);
        Context context = C308206Td.A09(r5).A00;
        0qQ.A0C(A08, "null cannot be cast to non-null type android.app.Activity");
        AnonymousClass4DH A02 = SQI.A02(A08);
        0qQ.A0C(A02, "null cannot be cast to non-null type com.instagram.base.fragment.IgFragment");
        Ep7.A00(context, A08, A02, A0V);
        return null;
    }
}
