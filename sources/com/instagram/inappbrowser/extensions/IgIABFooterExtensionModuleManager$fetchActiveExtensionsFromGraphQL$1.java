package com.instagram.inappbrowser.extensions;

import X.AnonymousClass0fD;
import X.B1Z;
import X.C10037RlZ;
import X.C13789Th4;
import X.C51974G9v;
import X.C62320sa;
import X.C9110RPh;
import X.SlK;
import com.facebook.browser.lite.ipc.IABExpandableFooterCallback;

public final class IgIABFooterExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1 extends IABExpandableFooterCallback.Stub {
    public final /* synthetic */ SlK A00;
    public final /* synthetic */ C62320sa A01;

    public IgIABFooterExtensionModuleManager$fetchActiveExtensionsFromGraphQL$1(SlK slK, C62320sa r4) {
        this.A00 = slK;
        this.A01 = r4;
        AnonymousClass0fD.A0A(-1262145246, AnonymousClass0fD.A03(14547766));
    }

    public final void Czr(String str, String str2, double d, String str3) {
        C9110RPh rPh;
        int A03 = AnonymousClass0fD.A03(-1626806273);
        C51974G9v.A1K(str, str2, str3);
        SlK slK = this.A00;
        slK.A03 = str;
        slK.A04 = str3;
        B1Z b1z = (B1Z) C10037RlZ.A00.get(str2);
        if (b1z != null) {
            rPh = b1z.B37();
        } else {
            rPh = null;
        }
        if (rPh instanceof C13789Th4) {
            slK.A01 = (C13789Th4) rPh;
        }
        this.A01.invoke();
        AnonymousClass0fD.A0A(959763288, A03);
    }
}
