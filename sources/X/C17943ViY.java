package X;

import android.content.Context;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.ViY  reason: case insensitive filesystem */
public final class C17943ViY {
    public String A00;
    public String A01;
    public String A02;
    public String A03;
    public String A04;
    public String A05;
    public String A06;
    public String A07;
    public final FragmentActivity A08;
    public final 28D A09;
    public final UserSession A0A;
    public final String A0B;
    public final String A0C;
    public final String A0D;
    public final C297765sI A0E;
    public final Integer A0F;

    public C17943ViY(FragmentActivity fragmentActivity, 28D r3, C297765sI r4, UserSession userSession, Integer num, String str, String str2, String str3) {
        0qQ.A0B(r4, 8);
        this.A08 = fragmentActivity;
        this.A0A = userSession;
        this.A09 = r3;
        this.A0C = str;
        this.A0D = str2;
        this.A0F = num;
        this.A0B = str3;
        this.A0E = r4;
    }

    public final void A00() {
        C16601Uxv uxv;
        if (this.A0F.intValue() == 0) {
            uxv = C16601Uxv.IG_AR_DYNAMIC_ADS;
        } else {
            uxv = C16601Uxv.IG_AR_ADS;
        }
        1ZN A002 = C297725sE.A00();
        UserSession userSession = this.A0A;
        Context applicationContext = this.A08.getApplicationContext();
        0qQ.A07(applicationContext);
        WT1 A022 = A002.A02(applicationContext, uxv, new VM7(), userSession, "ar_ads_camera");
        A022.A01();
        A022.A03("ARCommerceCamerasQPLEffectID", this.A0C);
        String str = this.A0B;
        A022.A03("ARCommerceCamerasAdToken", str);
        String str2 = this.A00;
        if (str2 != null) {
            A022.A03("ARCommerceCamerasAdGroupId", str2);
        }
        String str3 = this.A05;
        if (str3 != null) {
            A022.A03("ARCommerceCamerasProductId", str3);
        }
        WT1.A00(C16612Uy8.AD_QUERY_STARTED, A022);
        this.A0E.A01(str).A04(new WGV(0, this, A022));
    }
}
