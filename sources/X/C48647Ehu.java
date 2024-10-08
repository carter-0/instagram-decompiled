package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.io.Serializable;

/* renamed from: X.Ehu  reason: case insensitive filesystem */
public abstract class C48647Ehu {
    public static final Object A00(C307896Rx r9, AnonymousClass6Tm r10) {
        Object A01 = r10.A01();
        String A0p = DbS.A0p(A01);
        String A0i = DbW.A0i(r10, 1);
        UserSession A0Z = DbT.A0Z(r9);
        AnonymousClass0iw A08 = C308206Td.A08(r9);
        FragmentActivity A04 = C308206Td.A04(r9);
        0qQ.A0B(A04, 1);
        AnonymousClass7TF.A1C(A0Z, 2, A08);
        C309516Yo A0M = DbS.A0M(A04, A0Z);
        E6Y e6y = new E6Y();
        Bundle A09 = DbY.A09(A0Z);
        A09.putString("SupportInboxDetailFragment.ARG_REPORTED_CONTENT_ID", (String) A01);
        A09.putString("SupportInboxDetailFragment.ARG_CTRL_TYPE", A0i);
        A09.putString("SupportInboxDetailFragment.ARG_TICKET_ID", (String) DbT.A0q(r10, A0p, 2));
        A09.putString("SupportInboxDetailFragment.ARG_STORY_ID", (String) null);
        A09.putSerializable("SupportInboxDetailFragment.ARG_SOURCE", (Serializable) null);
        DbW.A0x(A09, e6y, A0M);
        return null;
    }
}
