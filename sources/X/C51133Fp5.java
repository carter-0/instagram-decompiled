package X;

import android.app.Activity;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.facebook.common.callercontext.CallerContext;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity;
import fxcache.model.FxCalAccount;

/* renamed from: X.Fp5  reason: case insensitive filesystem */
public final class C51133Fp5 implements G7U {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C51133Fp5(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
        this.A03 = obj3;
    }

    public final void onAuthorizeFail() {
        if (this.A00 != 0) {
            C59689JTv.A0B(DbT.A07(this.A01), "authorize_failed");
        } else {
            ((G7U) this.A03).onAuthorizeFail();
        }
    }

    /* JADX WARNING: type inference failed for: r5v1, types: [android.content.Context, X.0iw, com.instagram.urlhandlers.fbprofilelink.FbProfileLinkUrlHandlerActivity, java.lang.Object, android.app.Activity] */
    public final void onAuthorizeSuccess(String str, String str2) {
        Uri uri;
        String str3;
        if (this.A00 != 0) {
            ? r5 = (FbProfileLinkUrlHandlerActivity) this.A03;
            UserSession userSession = (UserSession) this.A02;
            Object obj = this.A01;
            FxCalAccount A012 = new 2Ly(userSession).A01(CallerContext.A00(FbProfileLinkUrlHandlerActivity.class), "ig_to_fb_sharing_account");
            if (A012 == null || (str3 = A012.A08) == null) {
                uri = null;
            } else {
                uri = 0cp.A03(str3);
            }
            View inflate = LayoutInflater.from(r5).inflate(R.layout.layout_links_fb_dialog, (ViewGroup) null);
            0qQ.A07(inflate);
            C358248ab A0X = DbS.A0X(r5);
            A0X.A09(2131969901);
            A0X.A08(2131970007);
            A0X.A0I(new C50026FJl(35, obj, (Object) r5, (Object) userSession), 2131969900);
            C50025FJk.A02(A0X, userSession, r5, 55, 2131968513);
            if (uri != null) {
                DbX.A0b(inflate, R.id.profile_link_facebook_image).setUrl(C253833rU.A00(uri, -1, -1), r5);
                A0X.A0k(inflate);
            }
            DbT.A1V(A0X);
            return;
        }
        AnonymousClass7TG.A1N(str, str2);
        ((C19291WSz) this.A02).A00(new VYN((Activity) this.A01, (G7U) this.A03, str, str2));
    }
}
