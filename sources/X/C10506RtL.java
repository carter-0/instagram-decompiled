package X;

import android.content.ComponentName;
import android.support.customtabs.ICustomTabsCallback;
import android.support.customtabs.ICustomTabsService;

/* renamed from: X.RtL  reason: case insensitive filesystem */
public final class C10506RtL {
    public final ComponentName A00;
    public final ICustomTabsCallback A01;
    public final ICustomTabsService A02;

    public C10506RtL(ComponentName componentName, ICustomTabsCallback iCustomTabsCallback, ICustomTabsService iCustomTabsService) {
        this.A02 = iCustomTabsService;
        this.A01 = iCustomTabsCallback;
        this.A00 = componentName;
    }
}
