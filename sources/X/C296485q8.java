package X;

import com.instagram.location.impl.LocationPluginImpl;
import java.lang.ref.WeakReference;

/* renamed from: X.5q8  reason: invalid class name and case insensitive filesystem */
public final class C296485q8 implements Runnable {
    public final /* synthetic */ AnonymousClass60p A00;
    public final /* synthetic */ LocationPluginImpl A01;
    public final /* synthetic */ WeakReference A02;

    public C296485q8(AnonymousClass60p r1, LocationPluginImpl locationPluginImpl, WeakReference weakReference) {
        this.A01 = locationPluginImpl;
        this.A02 = weakReference;
        this.A00 = r1;
    }

    public final void run() {
        14i r0 = 14i.A08;
        14i.A0C.add(new C292405it(this));
    }
}
