package X;

import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import com.facebook.react.uimanager.ViewManager;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class W4T implements ComponentCallbacks2 {
    public final Map A00;

    public final synchronized ViewManager A00(String str) {
        ViewManager viewManager;
        Map map = this.A00;
        viewManager = (ViewManager) map.get(str);
        if (viewManager == null && (viewManager = (ViewManager) map.get(002.A0R("RCT", str))) == null) {
            throw new QZA(002.A0R("No ViewManager found for class ", str));
        }
        return viewManager;
    }

    public final void onConfigurationChanged(Configuration configuration) {
    }

    public final void onLowMemory() {
        onTrimMemory(0);
    }

    public final void onTrimMemory(int i) {
        ArrayList A0e;
        synchronized (this) {
            A0e = Dba.A0e(this.A00);
        }
        C20143Wm3 wm3 = new C20143Wm3(this, A0e);
        if (C18773W0w.A02()) {
            wm3.run();
        } else {
            C18773W0w.A01(wm3);
        }
    }

    public W4T(List list) {
        HashMap hashMap = new HashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ViewManager viewManager = (ViewManager) it.next();
            hashMap.put(viewManager.getName(), viewManager);
        }
        this.A00 = hashMap;
    }
}
