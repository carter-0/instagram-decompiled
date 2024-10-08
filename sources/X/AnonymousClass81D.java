package X;

import android.content.Context;
import android.os.Parcelable;
import androidx.fragment.app.Fragment;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: X.81D  reason: invalid class name */
public final class AnonymousClass81D implements AnonymousClass81E {
    public final UserSession A00;
    public final AnonymousClass818 A01;
    public final AnonymousClass819 A02;
    public final AnonymousClass81A A03;
    public final boolean A04;

    public AnonymousClass81D(AnonymousClass818 r2, AnonymousClass819 r3, AnonymousClass81A r4, UserSession userSession, boolean z) {
        0qQ.A0B(userSession, 1);
        0qQ.A0B(r2, 2);
        0qQ.A0B(r3, 3);
        0qQ.A0B(r4, 4);
        this.A00 = userSession;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = r4;
        this.A04 = z;
    }

    public final void A02(Context context, C20986X8c x8c) {
        C359598dB A012 = A01(context, x8c);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) this.A00);
        igBloksScreenConfig.A0R = "com.bloks.www.cxp.xposting_upsells.native_shell";
        igBloksScreenConfig.A0k = false;
        igBloksScreenConfig.A0p = true;
        if (x8c != null) {
            igBloksScreenConfig.A05 = new C15406UcI(x8c);
        }
        if (A012.A01.nextClearBit(0) >= 1) {
            C359598dB.A00(A012).A0E(A012.A00, igBloksScreenConfig);
            return;
        }
        throw new IllegalStateException("Missing Required Props");
    }

    public final void A03(Context context, C359588dA r10) {
        C359638dF.A00(context, new C359618dD(this.A00), "com.bloks.www.cxp.xposting_upsells.native_shell", (String) null, C359608dC.A01(A01(context, (C20986X8c) null).A03), 900).A9V(new C359998dp(r10));
    }

    public final /* synthetic */ void A7M(Parcelable parcelable) {
    }

    public final C359598dB A01(Context context, C20986X8c x8c) {
        C359598dB r3 = new C359598dB(context);
        String str = this.A01.A00;
        Map map = r3.A03;
        map.put("crosspost_upsell_entrypoint", str);
        r3.A01.set(0);
        map.put("crosspost_upsell_variant", this.A02.A00);
        map.put("should_dismiss", Boolean.valueOf(this.A04));
        if (x8c != null) {
            r3.A02.put("action_callback", new Q3B(new C41471AuV(r3, new C20705Wxc(x8c, 31))));
        }
        map.put("extras_json", new JSONObject(this.A03.A00).toString());
        return r3;
    }

    public final /* synthetic */ Parcelable ANX() {
        return null;
    }

    public final Fragment A00(Context context, C20986X8c x8c) {
        C359598dB A012 = A01(context, x8c);
        IgBloksScreenConfig igBloksScreenConfig = new IgBloksScreenConfig((0lg) this.A00);
        igBloksScreenConfig.A0R = "com.bloks.www.cxp.xposting_upsells.native_shell";
        igBloksScreenConfig.A0k = false;
        igBloksScreenConfig.A0p = true;
        igBloksScreenConfig.A05 = new C15406UcI(x8c);
        if (A012.A01.nextClearBit(0) >= 1) {
            AnonymousClass3M3 A0C = C359598dB.A00(A012).A0C(A012.A00, igBloksScreenConfig);
            0qQ.A07(A0C);
            return A0C;
        }
        throw new IllegalStateException("Missing Required Props");
    }
}
