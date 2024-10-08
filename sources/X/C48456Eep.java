package X;

import android.content.Intent;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import java.util.Locale;

/* renamed from: X.Eep  reason: case insensitive filesystem */
public abstract class C48456Eep {
    public static final Object A00(C307896Rx r7, AnonymousClass6Tm r8) {
        String A0g = DbY.A0g(r8);
        UserSession A0W = DbX.A0W(r7);
        FragmentActivity A04 = C308206Td.A04(r7);
        Intent A03 = DbT.A0e().A03(A04, 335577088);
        Locale locale = Locale.ROOT;
        0qQ.A08(locale);
        String upperCase = A0g.toUpperCase(locale);
        0qQ.A07(upperCase);
        C270634h3 r0 = new C270634h3(ClipsViewerSource.valueOf(upperCase), A0W);
        r0.A1c = true;
        Intent data = A03.putExtra(C273654mx.A00(105), r0.A00()).setData(0cp.A03("instagram://clips_home"));
        0qQ.A07(data);
        0kR.A0B(A04, data);
        return null;
    }
}
