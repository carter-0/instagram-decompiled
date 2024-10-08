package androidx.emoji2.text;

import X.AnonymousClass07V;
import X.AnonymousClass07Z;
import X.AnonymousClass08d;
import X.AnonymousClass7TE;
import X.C13993Tnu;
import X.C13994Tnw;
import X.C13995Tnx;
import X.C71498Oln;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.startup.AppInitializer;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer implements AnonymousClass08d {
    public final /* bridge */ /* synthetic */ Object ALE(Context context) {
        Object obj;
        C13994Tnw tnw = new C13994Tnw(context);
        C13995Tnx tnx = new C13995Tnx();
        if (C13993Tnu.A09 == null) {
            synchronized (C13993Tnu.A08) {
                if (C13993Tnu.A09 == null) {
                    C13993Tnu.A09 = new C13993Tnu(tnx, tnw);
                }
            }
        }
        AppInitializer instance = AppInitializer.getInstance(context);
        Class<ProcessLifecycleInitializer> cls = ProcessLifecycleInitializer.class;
        synchronized (AppInitializer.A03) {
            obj = instance.A01.get(cls);
            if (obj == null) {
                obj = AppInitializer.A00(instance, cls, new HashSet());
            }
        }
        AnonymousClass07V lifecycle = ((AnonymousClass07Z) obj).getLifecycle();
        lifecycle.A09(new C71498Oln(0, this, lifecycle));
        return AnonymousClass7TE.A0v();
    }

    public final List AOg() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }
}
