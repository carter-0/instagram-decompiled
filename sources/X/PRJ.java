package X;

import android.graphics.drawable.Drawable;
import android.view.View;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;

public final class PRJ implements AnonymousClass7Q6 {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public PRJ(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj2;
        this.A02 = obj;
    }

    public final void DBs(Drawable drawable, View view, C317486nL r8) {
        if (this.A00 != 0) {
            ((OLV) this.A02).A04.A0I(((C317486nL) this.A01).A02, NetInfoModule.CONNECTION_TYPE_NONE, "quick_emoji_tray", (String) null);
            return;
        }
        0qQ.A0B(r8, 0);
        ((0sL) this.A01).invoke(r8, C66580MXl.A0B((View) this.A02));
    }
}
