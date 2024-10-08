package com.instagram.inappbrowser.extensions;

import X.0qQ;
import X.A7G;
import X.AnonymousClass0fD;
import X.AnonymousClass7TG;
import X.B1Z;
import X.C10037RlZ;
import X.C13497TbO;
import X.C62320sa;
import X.C8814RAq;
import X.C9110RPh;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IgIABPixelHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1 extends IABExtensionEventHandlerCallback.Stub {
    public final /* synthetic */ A7G A00;
    public final /* synthetic */ C62320sa A01;

    public IgIABPixelHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1(A7G a7g, C62320sa r4) {
        this.A00 = a7g;
        this.A01 = r4;
        AnonymousClass0fD.A0A(-1486272472, AnonymousClass0fD.A03(-393048975));
    }

    public final void Czu(List list) {
        int A0D = AnonymousClass7TG.A0D(list, 1881566943);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            IABExtensionEventHandlerPayload iABExtensionEventHandlerPayload = (IABExtensionEventHandlerPayload) it.next();
            boolean A0K = 0qQ.A0K(iABExtensionEventHandlerPayload.A00, "BLOKS");
            C9110RPh rPh = null;
            Map map = C10037RlZ.A00;
            if (A0K) {
                B1Z b1z = (B1Z) map.get("BLOKS_CONTENT_ITEM");
                if (b1z != null) {
                    rPh = b1z.B37();
                }
                if (rPh instanceof C8814RAq) {
                    String str = iABExtensionEventHandlerPayload.A01;
                    0qQ.A06(str);
                    ((C8814RAq) rPh).A03 = str;
                }
            } else {
                B1Z b1z2 = (B1Z) map.get(iABExtensionEventHandlerPayload.A01);
                if (b1z2 != null) {
                    rPh = b1z2.B37();
                }
            }
            if (rPh instanceof C13497TbO) {
                this.A00.A04.add(rPh);
            }
        }
        this.A01.invoke();
        AnonymousClass0fD.A0A(838270982, A0D);
    }
}
