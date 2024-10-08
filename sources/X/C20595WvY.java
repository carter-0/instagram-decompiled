package X;

import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.layout.adapter.extensions.MulticastConsumer;

/* renamed from: X.WvY  reason: case insensitive filesystem */
public final /* synthetic */ class C20595WvY extends 03J implements 0sP {
    public C20595WvY(Object obj) {
        super(1, obj, MulticastConsumer.class, "accept", "accept(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", 0);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        WindowLayoutInfo windowLayoutInfo = (WindowLayoutInfo) obj;
        ((MulticastConsumer) C51969G9p.A0t(windowLayoutInfo, this)).accept(windowLayoutInfo);
        return C60340gF.A00;
    }
}
