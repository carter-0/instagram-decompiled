package com.instagram.inappbrowser.extensions;

import X.0qQ;
import X.A85;
import X.AnonymousClass0fD;
import X.AnonymousClass0iw;
import X.AnonymousClass0xx;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.AnonymousClass9ZX;
import X.B1Z;
import X.C10037RlZ;
import X.C62320sa;
import X.C8814RAq;
import X.C9110RPh;
import X.SRY;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerCallback;
import com.facebook.browser.lite.ipc.IABExtensionEventHandlerPayload;
import com.instagram.common.session.UserSession;
import com.instagram.inappbrowser.extensions.bloks.IgBloksIABExtension$fetchPreExitHandlerAction$1;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class IgIABPreExitHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1 extends IABExtensionEventHandlerCallback.Stub {
    public final /* synthetic */ A85 A00;
    public final /* synthetic */ C62320sa A01;

    public IgIABPreExitHandlerExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1(A85 a85, C62320sa r4) {
        this.A00 = a85;
        this.A01 = r4;
        AnonymousClass0fD.A0A(1723743301, AnonymousClass0fD.A03(2014022200));
    }

    public final void Czu(List list) {
        String str;
        int A03 = AnonymousClass0fD.A03(1342416523);
        List list2 = list;
        0qQ.A0B(list2, 0);
        A85 a85 = this.A00;
        ArrayList A0r = AnonymousClass7TG.A0r(list2);
        Iterator it = list2.iterator();
        while (true) {
            C9110RPh rPh = null;
            if (!it.hasNext()) {
                break;
            }
            IABExtensionEventHandlerPayload iABExtensionEventHandlerPayload = (IABExtensionEventHandlerPayload) it.next();
            boolean A0K = 0qQ.A0K(iABExtensionEventHandlerPayload.A00, "BLOKS");
            Map map = C10037RlZ.A00;
            if (A0K) {
                str = "BLOKS_CONTENT_ITEM";
            } else {
                str = iABExtensionEventHandlerPayload.A01;
            }
            B1Z b1z = (B1Z) map.get(str);
            if (b1z != null) {
                rPh = b1z.B37();
            }
            if (rPh instanceof C8814RAq) {
                C8814RAq rAq = (C8814RAq) rPh;
                String str2 = iABExtensionEventHandlerPayload.A01;
                0qQ.A06(str2);
                rAq.A03 = str2;
                UserSession userSession = a85.A05;
                FragmentActivity fragmentActivity = a85.A02;
                AnonymousClass0iw r14 = a85.A04;
                String str3 = a85.A07;
                String str4 = a85.A06;
                String str5 = a85.A08;
                Bundle bundle = a85.A01;
                AnonymousClass0xx r2 = a85.A03;
                SRY A002 = SRY.A00();
                String str6 = rAq.A03;
                SRY sry = A002;
                String str7 = str3;
                String str8 = str6;
                String str9 = str4;
                Bundle bundle2 = bundle;
                SRY.A02(new AnonymousClass9ZX(bundle2, sry, new IgBloksIABExtension$fetchPreExitHandlerAction$1(fragmentActivity, r2, r14, userSession, rAq), str7, str8, str9, str5, AnonymousClass7TE.A1I("CORE_HANDLER")), A002, false);
            }
            A0r.add(rPh);
        }
        ArrayList A1C = AnonymousClass7TE.A1C();
        Iterator it2 = A0r.iterator();
        while (it2.hasNext()) {
            Object next = it2.next();
            if ((next instanceof C8814RAq) && next != null) {
                A1C.add(next);
            }
        }
        List list3 = a85.A09;
        list3.clear();
        list3.addAll(A1C);
        this.A01.invoke();
        AnonymousClass0fD.A0A(1465387483, A03);
    }
}
