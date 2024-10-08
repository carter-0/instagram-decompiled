package X;

import android.content.Context;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;

public final class WEO implements C20872X1y {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PreferenceScreen A01;
    public final /* synthetic */ C18550Vu2 A02;
    public final /* synthetic */ 2cW A03;

    public WEO(Context context, PreferenceScreen preferenceScreen, C18550Vu2 vu2, 2cW r4) {
        this.A03 = r4;
        this.A00 = context;
        this.A02 = vu2;
        this.A01 = preferenceScreen;
    }

    public final boolean DYi(Preference preference) {
        2cW r4 = this.A03;
        Context context = this.A00;
        Toast.makeText(context, "Reset Force Modes", 1).show();
        this.A02.A01(context, this.A01, r4);
        return true;
    }
}
