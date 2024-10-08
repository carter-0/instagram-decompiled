package X;

import android.content.Context;
import android.os.Handler;
import android.widget.Toast;
import androidx.preference.Preference;
import androidx.preference.PreferenceGroup;
import com.instagram.quickpromotion.debug.devtool.IGDevToolPersistentStateHandler;

public final class WEN implements C20872X1y {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public WEN(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A02 = obj2;
        this.A01 = obj;
    }

    public final boolean DYi(Preference preference) {
        switch (this.A00) {
            case 0:
                ((PreferenceGroup) this.A02).A00 = Integer.MAX_VALUE;
                UAT uat = (UAT) this.A01;
                Handler handler = uat.A02;
                Runnable runnable = uat.A03;
                handler.removeCallbacks(runnable);
                handler.post(runnable);
                return true;
            case 1:
                IGDevToolPersistentStateHandler iGDevToolPersistentStateHandler = (2cW) this.A02;
                AnonymousClass424 r1 = new AnonymousClass424(new 0xc((0xa) iGDevToolPersistentStateHandler.A02.getValue()), iGDevToolPersistentStateHandler.A01.A06, "dummy");
                AnonymousClass424.A02(r1, AnonymousClass05K.A0N);
                AnonymousClass424.A02(r1, AnonymousClass05K.A00);
                Toast.makeText((Context) this.A01, "Delay reset", 1).show();
                return true;
            default:
                return false;
        }
    }
}
