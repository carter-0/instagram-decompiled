package X;

import android.content.Context;
import android.content.pm.ShortcutManager;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.NRz  reason: case insensitive filesystem */
public final class C68667NRz extends 0ng {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ String A01;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C68667NRz(Context context, String str) {
        super(2117970647, 3, false, false);
        this.A00 = context;
        this.A01 = str;
    }

    public final void run() {
        Context applicationContext = this.A00.getApplicationContext();
        String str = this.A01;
        List A1I = AnonymousClass7TE.A1I(str);
        ((ShortcutManager) applicationContext.getSystemService(ShortcutManager.class)).removeDynamicShortcuts(A1I);
        C66753Mby.A00(applicationContext).A01(A1I);
        Iterator it = C66753Mby.A01(applicationContext).iterator();
        if (it.hasNext()) {
            it.next();
            throw AnonymousClass7TE.A11("onShortcutRemoved");
        } else {
            C66959Mfs.A02.remove(str);
        }
    }
}
