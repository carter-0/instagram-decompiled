package X;

import android.content.Context;
import androidx.preference.Preference;
import androidx.preference.PreferenceScreen;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;
import java.util.Map;

public final class WEP implements C20872X1y {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ PreferenceScreen A01;
    public final /* synthetic */ C18550Vu2 A02;
    public final /* synthetic */ 2cW A03;
    public final /* synthetic */ Map A04;

    public WEP(Context context, PreferenceScreen preferenceScreen, C18550Vu2 vu2, 2cW r4, Map map) {
        this.A03 = r4;
        this.A04 = map;
        this.A02 = vu2;
        this.A01 = preferenceScreen;
        this.A00 = context;
    }

    public final boolean DYi(Preference preference) {
        IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = this.A03;
        AnonymousClass424 r4 = new AnonymousClass424(new 0xc((0xa) iGDevToolPersistentStateHandler.A02.getValue()), iGDevToolPersistentStateHandler.A01.A06, "dummy");
        for (Integer A022 : AnonymousClass05K.A00(10)) {
            AnonymousClass424.A02(r4, A022);
        }
        return true;
    }
}
