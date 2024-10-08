package X;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.LruCache;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import java.util.Locale;

public final class T0U implements 2IR {
    public final /* synthetic */ Intent A00;
    public final /* synthetic */ Bundle A01;
    public final /* synthetic */ FragmentActivity A02;
    public final /* synthetic */ C58840Ae A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ boolean A05;

    public final void onFailure(Throwable th) {
        0qQ.A0B(th, 0);
        FragmentActivity fragmentActivity = this.A02;
        fragmentActivity.setResult(0, Pxj.A0F(DbS.A09(), "result_type", "new_token", th));
        if (this.A05) {
            SRE.A01(fragmentActivity, AnonymousClass05K.A01);
        }
        fragmentActivity.finish();
        SRE sre = SRE.A00;
        Pxk.A0Q(this.A01, this.A03, sre, AnonymousClass05K.A0j, th);
    }

    public T0U(Intent intent, Bundle bundle, FragmentActivity fragmentActivity, C58840Ae r4, UserSession userSession, boolean z) {
        this.A02 = fragmentActivity;
        this.A03 = r4;
        this.A01 = bundle;
        this.A05 = z;
        this.A04 = userSession;
        this.A00 = intent;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        String str;
        C13935Tld tld;
        C13934Tlc tlc;
        AnonymousClass3JD r9 = (AnonymousClass3JD) obj;
        if (r9 == null || (tld = (C13935Tld) r9.Bny()) == null || (tlc = (C13934Tlc) ((C250663lr) tld).getOptionalTreeField(0, "xfb_amazon_bwp_login_url(extra_data:$extra_data)", C7629QQv.class, -1418799253)) == null) {
            str = null;
        } else {
            str = ((C250663lr) tlc).getOptionalStringField(0, "login_url");
        }
        if (str == null) {
            FragmentActivity fragmentActivity = this.A02;
            fragmentActivity.setResult(0, DbS.A09().putExtra("result_type", "new_token").putExtra("error", "null login url"));
            SRE.A00.A02(this.A01, this.A03, AnonymousClass05K.A0j, "null login url");
            if (this.A05) {
                SRE.A01(fragmentActivity, AnonymousClass05K.A01);
            }
            fragmentActivity.finish();
            return;
        }
        LruCache lruCache = 0cp.A00;
        Uri parse = Uri.parse(str);
        0qQ.A07(parse);
        UserSession userSession = this.A04;
        0Tu r2 = 0Tu.A05;
        if (182.A06(r2, userSession, 36324690201096437L)) {
            0kR.A0D(this.A02.getApplicationContext(), Pxe.A0F(parse));
        } else if (182.A06(r2, userSession, 36324690200965363L)) {
            Intent intent = this.A00;
            if (intent == null) {
                FragmentActivity fragmentActivity2 = this.A02;
                Intent flags = C66580MXl.A0A(fragmentActivity2, Class.forName("com.instagram.inappbrowser.fragments.BrowserLiteInMainProcessIGActivity")).setData(parse).setFlags(268435456);
                0qQ.A07(flags);
                flags.putExtra("IgSessionManager.SESSION_TOKEN_KEY", userSession.getToken());
                C11038S6q s6q = new C11038S6q();
                Locale locale = Pxf.A0G(fragmentActivity2).locale;
                Intent intent2 = s6q.A02;
                intent2.putExtra("BrowserLiteIntent.EXTRA_LOCALE", locale);
                intent2.putExtra("BrowserLiteIntent.EXTRA_SHOW_DOMAIN_NAME", false);
                intent2.putExtra("BrowserLiteIntent.IAB_EXTERNAL_INTERSTITIAL_ENABLED", false);
                flags.putExtras(s6q.A00());
                0kR.A0B(fragmentActivity2, flags);
            } else {
                Intent flags2 = new Intent(intent).setData(parse).setFlags(268435456);
                0qQ.A07(flags2);
                0kR.A0B(this.A02, flags2);
            }
        } else {
            new SO4().A01().A00(this.A02, parse);
        }
        SRE.A00.A02(this.A01, this.A03, AnonymousClass05K.A01, (String) null);
    }
}
