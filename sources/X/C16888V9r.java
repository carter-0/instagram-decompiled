package X;

import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.leadgen.organic.model.LeadGenFormData;
import java.util.ArrayList;

/* renamed from: X.V9r  reason: case insensitive filesystem */
public abstract class C16888V9r {
    public static final Object A00(C307896Rx r14) {
        FragmentActivity A04 = C308206Td.A04(r14);
        UserSession A0W = DbX.A0W(r14);
        Dbb.A0o((Bundle) null, DbU.A0R().A04(A0W, new LeadGenFormData((ImageUrl) null, C16602Uxw.A05, "", "", "", (String) null, new ArrayList(), true, false, false, false)), A04, A0W);
        return null;
    }
}
