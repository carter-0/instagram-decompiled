package X;

import android.os.Bundle;
import com.facebook.browser.lite.BrowserLiteFragment;
import com.facebook.iabeventlogging.model.IABHistoryEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;

/* renamed from: X.QKx  reason: case insensitive filesystem */
public final class C7582QKx extends C11364SPc implements B3J, C13923TlR, C13922TlQ, C13921TlP {
    public SFP A00;
    public SRY A01 = SRY.A00();
    public final AnonymousClass0Gt A02;

    public static final void A00(C7582QKx qKx) {
        A9z a9z;
        C7582QKx qKx2 = qKx;
        SFP sfp = qKx2.A00;
        if (sfp != null) {
            String[] strArr = (String[]) sfp.A04.toArray(new String[0]);
            C340027ka r3 = qKx2.A03;
            if (!(r3 == null || (a9z = ((BrowserLiteFragment) r3).A0d) == null)) {
                Long l = sfp.A02;
                Long l2 = sfp.A01;
                Long l3 = sfp.A00;
                boolean z = sfp.A03;
                long now = a9z.A0m.now();
                IABHistoryEvent iABHistoryEvent = new IABHistoryEvent(l, l2, l3, a9z.A0Z, strArr, now, now, z);
                if (!sfp.A04.isEmpty()) {
                    BrowserLiteFragment browserLiteFragment = (BrowserLiteFragment) r3;
                    Bundle bundle = browserLiteFragment.A08;
                    ZonePolicy zonePolicy = browserLiteFragment.A0e;
                    if (zonePolicy == null) {
                        zonePolicy = ZonePolicy.A05;
                    }
                    r3.CjX(bundle, iABHistoryEvent, zonePolicy);
                }
            }
            qKx2.A00 = null;
        }
    }

    public C7582QKx() {
        AnonymousClass0Gt r0 = AnonymousClass0Gt.A00;
        0qQ.A07(r0);
        this.A02 = r0;
    }

    public final void destroy() {
        A00(this);
        super.destroy();
    }
}
