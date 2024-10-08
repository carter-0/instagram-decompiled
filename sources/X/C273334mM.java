package X;

import android.app.ResourcesManager;

/* renamed from: X.4mM  reason: invalid class name and case insensitive filesystem */
public final class C273334mM implements C273294mI {
    public final String getName() {
        return "ResourceManagerWatchdog";
    }

    public final void CoZ() {
        ResourcesManager instance = ResourcesManager.getInstance();
        if (instance != null) {
            synchronized (instance) {
            }
        }
    }
}
