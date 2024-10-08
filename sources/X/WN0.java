package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;

public final class WN0 implements X8K {
    public final /* synthetic */ C18446Vrt A00;
    public final /* synthetic */ X8K A01;
    public final /* synthetic */ X8K A02;

    public final String BwS() {
        return "link_click_virtual_event:link_click:primary:0";
    }

    public final long C7M() {
        return this.A02.C7M();
    }

    public final String getStringForKey(String str) {
        0qQ.A0B(str, 0);
        if (str.equals(PublicKeyCredentialControllerUtility.JSON_KEY_NAME)) {
            return "link_click_virtual_event";
        }
        return this.A01.getStringForKey(str);
    }

    public WN0(C18446Vrt vrt, X8K x8k) {
        this.A01 = x8k;
        this.A00 = vrt;
        this.A02 = x8k;
    }

    public final String getDisplayName() {
        String str = (String) this.A00.A00.A02.get("link_click_virtual_event:link_click:primary:0");
        if (str == null) {
            return "";
        }
        return str;
    }
}
