package X;

import android.content.SharedPreferences;
import java.io.File;

public final class AVP implements 1LX {
    public final 1Lb A00;
    public final 1B5 A01;

    public final /* bridge */ /* synthetic */ void DWM(1Fd r3, AnonymousClass1BG r4, File file) {
        this.A01.A04(AnonymousClass05K.A00).execute(new C41201Apz(r3, this, (1Fg) r4, file));
    }

    public AVP(1B5 r4) {
        1Lb r0;
        this.A01 = r4;
        SharedPreferences sharedPreferences = r4.A06;
        if (sharedPreferences == null) {
            r0 = new 1Lb("stale_removal");
        } else {
            r0 = new 1La(sharedPreferences, "stale_removal");
        }
        this.A00 = r0;
    }
}
