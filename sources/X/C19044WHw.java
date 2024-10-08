package X;

import com.google.common.collect.ImmutableList;
import com.instagram.discovery.mediamap.model.LocationPageInformation;
import com.instagram.discovery.mediamap.model.MediaMapPin;

/* renamed from: X.WHw  reason: case insensitive filesystem */
public final class C19044WHw implements AnonymousClass2Kv {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C19044WHw(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A01 = obj3;
        this.A02 = obj2;
        this.A03 = obj;
    }

    public final void invoke(AnonymousClass3JD r6) {
        C250663lr A0U;
        C250663lr A032;
        ImmutableList A06;
        C250663lr r2;
        if (this.A00 != 0) {
            if (!(r6 == null || (A0U = C41845B3m.A0U(r6)) == null || (A032 = A0U.A03(URE.class, "xfb_fx_sso_info(account_type:\"FACEBOOK\")", -238802833)) == null || (A06 = A032.A06(URD.class, "sso_account_info", 1262586161)) == null || (r2 = (C250663lr) 00k.A0J(A06)) == null)) {
                boolean coercedBooleanField = r2.getCoercedBooleanField(0, "sso_setting_enabled");
                if (Boolean.valueOf(coercedBooleanField) != null) {
                    ((C19291WSz) this.A03).A00 = coercedBooleanField;
                }
            }
            0r1 r4 = (0r1) this.A01;
            if (!r4.A00) {
                VYN vyn = (VYN) this.A02;
                if (vyn != null) {
                    if (!((C19291WSz) this.A03).A00) {
                        FCU.A02(vyn.A00);
                        vyn.A01.onAuthorizeFail();
                    } else {
                        vyn.A01.onAuthorizeSuccess(vyn.A03, vyn.A02);
                    }
                }
                r4.A00 = true;
                return;
            }
            return;
        }
        MediaMapPin mediaMapPin = (MediaMapPin) this.A01;
        LocationPageInformation A012 = VEV.A00(r6, C18231Vnv.A01(mediaMapPin)).A01();
        MediaMapPin A013 = mediaMapPin.clone();
        A013.A0F = false;
        A013.A06 = A012;
        ((C18062Vko) this.A02).A02((C17896Vhn) this.A03, A013);
    }
}
