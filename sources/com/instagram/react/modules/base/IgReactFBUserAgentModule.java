package com.instagram.react.modules.base;

import X.1Ch;
import X.AnonymousClass7TE;
import X.Pxh;
import X.QZK;
import com.facebook.fbreact.specs.NativeFBUserAgentSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "FBUserAgent")
public class IgReactFBUserAgentModule extends NativeFBUserAgentSpec {
    public static final String NAME = "FBUserAgent";

    public String getName() {
        return "FBUserAgent";
    }

    public Map getTypedExportedConstants() {
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("webViewLikeUserAgent", 1Ch.A00());
        return A1E;
    }

    public void getWebViewLikeUserAgent(Callback callback) {
        Pxh.A1E(callback, 1Ch.A00());
    }

    public IgReactFBUserAgentModule(QZK qzk) {
        super(qzk);
    }
}
