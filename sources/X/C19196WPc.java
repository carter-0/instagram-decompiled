package X;

import android.os.Handler;
import com.instagram.common.session.UserSession;
import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: X.WPc  reason: case insensitive filesystem */
public final class C19196WPc implements AnonymousClass0iw {
    public static final String __redex_internal_original_name = "IgdsVariableSamplingLoggingStrategy";
    public Integer A00;
    public final Handler A01 = AnonymousClass7TF.A0D();
    public final 0wc A02;
    public final VOD A03;
    public final VOE A04;
    public final Map A05;
    public final 2SP A06 = 2SP.A00;
    public final String A07;
    public volatile boolean A08;

    public final String getModuleName() {
        return this.A07;
    }

    public C19196WPc(UserSession userSession) {
        VOD vod = new VOD(userSession);
        this.A03 = vod;
        this.A02 = AnonymousClass0kN.A01(this, userSession);
        this.A04 = new VOE(vod);
        this.A05 = new LinkedHashMap();
        this.A07 = __redex_internal_original_name;
    }
}
