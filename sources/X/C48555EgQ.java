package X;

import android.text.SpannableStringBuilder;
import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.ActionButtonPartnerType;
import com.instagram.api.schemas.SMBPartnerType;
import com.instagram.business.fragment.SupportLinksFragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.Locale;

/* renamed from: X.EgQ  reason: case insensitive filesystem */
public abstract class C48555EgQ {
    public static final Object A00(C307896Rx r15, AnonymousClass6Tm r16) {
        String A0h = DbY.A0h(r16, 1);
        FragmentActivity A04 = C308206Td.A04(r15);
        UserSession A0W = DbX.A0W(r15);
        User A0j = DbT.A0j(A0W);
        if (A0j.A03.Bx1() == null) {
            ActionButtonPartnerType actionButtonPartnerType = ActionButtonPartnerType.SMB;
            String A00 = AnonymousClass000.A00(2288);
            A0j.A03.ElV(new C274664or(new C274664or(actionButtonPartnerType, "0", (String) null, (String) null, (String) null, (String) null, A00, "").A00, "0", (String) null, "", SMBPartnerType.GET_QUOTE.A00, (String) null, A00, ""));
            DbT.A1S(A0W, A0j);
        }
        Locale locale = Locale.ROOT;
        String A12 = DbT.A12(locale, A0h);
        if (Dbb.A1b("STICKER", A12, locale)) {
            A04.finish();
            return null;
        }
        if (Dbb.A1b("PROFILE", A12, locale)) {
            0hq A05 = C308206Td.A05(r15);
            if (A05 == null || A05.A0M() <= 0 || A05.A0G) {
                A04.onBackPressed();
            } else {
                A05.A0c();
            }
            Dba.A0j(1, A04, A0W);
            if (FGE.A02(A04)) {
                DbS.A0M(A04, A0W).A0G(SupportLinksFragment.A06, 1);
                C59689JTv.A09(A04, W3L.A01(A04, AnonymousClass7TE.A16(A04, 2131964837)));
                return null;
            }
        } else if (!Dbb.A1b("FLAGGED_FORM", A12, locale)) {
            return null;
        }
        0qQ.A0B(A04, 0);
        FGE.A00(A04);
        SpannableStringBuilder A01 = W3L.A01(A04, AnonymousClass7TE.A16(A04, 2131964837));
        C310336ap A0a = DbS.A0a();
        A0a.A0D = A01;
        DbY.A1N(A0a);
        return null;
    }
}
