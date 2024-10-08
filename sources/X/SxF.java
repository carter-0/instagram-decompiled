package X;

import android.content.IntentSender;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationSettingsResult;

public final class SxF implements C13634Te0 {
    public final /* synthetic */ C8779R9f A00;

    public SxF(C8779R9f r9f) {
        this.A00 = r9f;
    }

    public final /* bridge */ /* synthetic */ void DfS(AnonymousClass63X r6) {
        Integer num;
        String str;
        Status status = ((LocationSettingsResult) r6).A00;
        int i = status.A00;
        if (i == 0) {
            this.A00.A00.A09();
            num = AnonymousClass05K.A0C;
        } else if (i != 6) {
            this.A00.A00.A09();
            num = AnonymousClass05K.A0N;
        } else {
            try {
                C8779R9f r9f = this.A00;
                r9f.A00.A09();
                r9f.A01 = true;
                status.A00(r9f.A03, 5005);
                return;
            } catch (IntentSender.SendIntentException e) {
                0KC.A0G("GooglePlayLocationSettingsControllerImpl", "Error starting google play services location dialog", e);
                num = AnonymousClass05K.A0Y;
            }
        }
        C8779R9f r9f2 = this.A00;
        r9f2.A06.D1W(num);
        S0M s0m = r9f2.A04;
        String A002 = C8779R9f.A00(r9f2);
        switch (num.intValue()) {
            case 2:
                str = "DIALOG_NOT_NEEDED";
                break;
            case 3:
                str = "DIALOG_NOT_POSSIBLE";
                break;
            default:
                str = "UNKNOWN_FAILURE";
                break;
        }
        s0m.A00(A002, str);
        r9f2.A05.A01.clear();
    }
}
