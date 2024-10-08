package X;

import android.app.Application;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Jff  reason: case insensitive filesystem */
public final class C60099Jff extends C361478gI {
    public final ClipsCreationViewModel A00;
    public final 05G A01;
    public final UserSession A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C60099Jff(Application application, UserSession userSession, ClipsCreationViewModel clipsCreationViewModel) {
        super(application);
        ClipsCreationViewModel clipsCreationViewModel2 = clipsCreationViewModel;
        AnonymousClass7TF.A1C(userSession, 2, clipsCreationViewModel2);
        this.A02 = userSession;
        this.A00 = clipsCreationViewModel2;
        ArrayList A0v = DbS.A0v(2);
        A0v.add(new C61188Jyh(A0D().getString(2131969670), (String) null, R.drawable.instagram_spark_none_outline_32, 2131969670, true));
        ArrayList A0v2 = DbS.A0v(r5);
        for (C357588Yu r2 : C357588Yu.values()) {
            Application A0D = A0D();
            int i = r2.A03;
            A0v2.add(new C61188Jyh(A0D.getString(i), r2.A04, r2.A02, i, false));
        }
        0tw.A00(A0v2.toArray(new C61188Jyh[0]), A0v);
        this.A01 = 106.A01(0sr.A1P(A0v.toArray(new C61188Jyh[A0v.size()])));
    }

    public static final void A00(C357588Yu r11, C60099Jff jff) {
        String str;
        boolean z;
        05G r4 = jff.A01;
        ArrayList A0U = 00k.A0U(JTO.A13(r4));
        ArrayList A0r = AnonymousClass7TG.A0r(A0U);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            C61188Jyh jyh = (C61188Jyh) it.next();
            String str2 = jyh.A03;
            if (r11 != null) {
                str = r11.A04;
            } else {
                str = null;
            }
            boolean A0K = 0qQ.A0K(str2, str);
            String str3 = jyh.A02;
            if (A0K) {
                z = true;
            } else {
                z = false;
            }
            A0r.add(new C61188Jyh(str3, str2, jyh.A00, jyh.A01, z));
        }
        r4.Epw(00k.A0U(A0r));
    }
}
