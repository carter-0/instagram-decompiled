package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEmptyEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABUnifiedEvent;
import com.facebook.privacy.zone.policy.ZonePolicy;
import java.util.HashMap;

public final class AQC implements C41803B1i {
    public static final Bundle A04 = AnonymousClass7TE.A0a();
    public HashMap A00 = AnonymousClass7TE.A1E();
    public final SRY A01;
    public final AnonymousClass0JP A02 = AnonymousClass0Gt.A00;
    public final String A03;

    public final void Cgg(IABEvent iABEvent) {
        this.A01.A06(A04, iABEvent, ZonePolicy.A05);
    }

    public final void Cgm(C391409su r10, Integer num) {
        long now = this.A02.now();
        String str = this.A03;
        IABEmptyEvent iABEmptyEvent = IABEvent.A04;
        0qQ.A0B(num, 5);
        Cgg(new IABUnifiedEvent(r10, num, str, (String) null, now, now));
    }

    public AQC(SRY sry, String str) {
        this.A01 = sry;
        this.A03 = str;
    }
}
