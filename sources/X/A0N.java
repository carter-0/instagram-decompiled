package X;

import android.os.Bundle;
import com.facebook.iabeventlogging.model.IABEmptyEvent;
import com.facebook.iabeventlogging.model.IABEvent;
import com.facebook.iabeventlogging.model.IABUnifiedEvent;

public abstract class A0N {
    public static final void A00(C391409su r11, String str) {
        0qQ.A0B(str, 0);
        Bundle bundle = AQC.A04;
        AQC aqc = new AQC(SRY.A00(), str);
        IABEmptyEvent iABEmptyEvent = IABEvent.A04;
        long currentTimeMillis = System.currentTimeMillis();
        long currentTimeMillis2 = System.currentTimeMillis();
        C391409su r3 = r11;
        aqc.Cgg(new IABUnifiedEvent(r3, AnonymousClass05K.A0C, str, (String) null, currentTimeMillis, currentTimeMillis2));
    }
}
