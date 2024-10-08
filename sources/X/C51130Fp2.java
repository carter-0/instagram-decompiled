package X;

import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.business.analytics.logger.BusinessFlowAnalyticsLogger;
import com.instagram.business.fragment.ConnectFBPageFragment;
import com.instagram.nux.cal.model.ConnectContent;
import fxcache.model.FxCalAccount;
import java.util.Map;

/* renamed from: X.Fp2  reason: case insensitive filesystem */
public final class C51130Fp2 implements G7U {
    public final int A00;
    public final Object A01;

    public C51130Fp2(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void onAuthorizeFail() {
        switch (this.A00) {
            case 0:
                ConnectFBPageFragment.A01((ConnectFBPageFragment) this.A01);
                DbZ.A0s(2131965609);
                return;
            case 3:
                C59689JTv.A0B(((Ey8) this.A01).A01.getContext(), "authorize_failed");
                return;
            case 7:
                ((G7M) this.A01).onAuthorizeFail();
                return;
            default:
                return;
        }
    }

    public final void onAuthorizeSuccess(String str, String str2) {
        String str3;
        Uri uri;
        String str4;
        switch (this.A00) {
            case 0:
                ConnectFBPageFragment connectFBPageFragment = (ConnectFBPageFragment) this.A01;
                ConnectFBPageFragment.A00(connectFBPageFragment);
                BusinessFlowAnalyticsLogger businessFlowAnalyticsLogger = connectFBPageFragment.A00;
                if (businessFlowAnalyticsLogger != null) {
                    businessFlowAnalyticsLogger.Ci7(new C22030Xtl("facebook_connect", connectFBPageFragment.A06, (String) null, (String) null, (String) null, (Map) null, (Map) null, (Map) null));
                }
                G8D g8d = connectFBPageFragment.A01;
                if (g8d != null) {
                    g8d.Clz(DbV.A0C("fb_account_linked", (String) null));
                    return;
                }
                return;
            case 3:
                Ey8 ey8 = (Ey8) this.A01;
                ey8.A00 = new C51657FyJ(ey8, 10);
                FG4.A02(ey8.A02, ey8, 13);
                return;
            case 4:
                E3F e3f = (E3F) this.A01;
                2Ly r3 = e3f.A02;
                if (r3 == null) {
                    str3 = "fxIgMasterAccountCache";
                    break;
                } else {
                    FxCalAccount A012 = r3.A01(CallerContext.A00(E3F.class), "ig_to_fb_sharing_account");
                    if (A012 == null || (str4 = A012.A08) == null) {
                        uri = null;
                    } else {
                        uri = 0cp.A03(str4);
                    }
                    View inflate = DbV.A0E(e3f).inflate(R.layout.layout_links_fb_dialog, (ViewGroup) null);
                    0qQ.A07(inflate);
                    C358248ab A0U = DbW.A0U(e3f);
                    A0U.A09(2131970014);
                    A0U.A08(2131970007);
                    C50021FJg.A01(A0U, e3f, 15, 2131970013);
                    A0U.A0C(C50021FJg.A00(e3f, 16));
                    if (uri != null) {
                        DbX.A0b(inflate, R.id.profile_link_facebook_image).setUrl(C253833rU.A00(uri, -1, -1), e3f);
                        A0U.A0k(inflate);
                    }
                    DbT.A1V(A0U);
                    return;
                }
                break;
            case 5:
                E3F.A03((E3F) this.A01);
                return;
            case 6:
                C50865Fjj fjj = (C50865Fjj) this.A01;
                DbS.A0M(fjj.A00, fjj.A01).A0G((String) null, 1);
                return;
            case 7:
                0qQ.A0B(str2, 1);
                ((G7M) this.A01).onAuthorizeSuccess(str2);
                return;
            case 8:
                0Tu A0J = DbS.A0J(str, 0);
                str3 = "calHelper";
                if (1AW.A06(A0J, 18296135479197816L)) {
                    C47491E4v e4v = (C47491E4v) this.A01;
                    CallerContext callerContext = C47491E4v.A0B;
                    if (e4v.A01 != null) {
                        AnonymousClass0eM r1 = e4v.A06;
                        C49776F6j.A00(true, AnonymousClass7TE.A0l(r1));
                        1NY A0N = DbU.A0N(DbT.A0X(r1));
                        A0N.A0A("fb/nux_fb_content/");
                        A0N.A9m("access_token", str);
                        0qQ.A0B("linking_entry_point", 0);
                        1OC A0K = Dbb.A0K(A0N, ConnectContent.class, C49779F6m.class);
                        A0K.A00 = new C47648EBi(e4v, str);
                        1ES.A03(A0K);
                        return;
                    }
                } else {
                    if (1AW.A06(A0J, 18296135479263353L)) {
                        C47491E4v e4v2 = (C47491E4v) this.A01;
                        CallerContext callerContext2 = C47491E4v.A0B;
                        if (e4v2.A01 != null) {
                            C49776F6j.A00(false, AnonymousClass7TE.A0l(e4v2.A06));
                        }
                    }
                    C47491E4v.A01((C47491E4v) this.A01);
                    return;
                }
                break;
            default:
                return;
        }
        0qQ.A0F(str3);
        throw AnonymousClass00P.createAndThrow();
    }
}
