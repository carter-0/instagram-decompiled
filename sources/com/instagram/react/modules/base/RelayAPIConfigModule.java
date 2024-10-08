package com.instagram.react.modules.base;

import X.0lg;
import X.0mp;
import X.1Ma;
import X.AnonymousClass000;
import X.AnonymousClass1Q2;
import X.AnonymousClass7TE;
import X.QZK;
import com.facebook.cameracore.instagram.ardelivery.networkconsentmanager.IgNetworkConsentStorage;
import com.facebook.common.callercontext.CallerContext;
import com.facebook.common.callercontext.CallerContextable;
import com.facebook.fbreact.specs.NativeRelayConfigSpec;
import com.facebook.react.module.annotations.ReactModule;
import java.util.HashMap;
import java.util.Map;

@ReactModule(name = "RelayAPIConfig")
public final class RelayAPIConfigModule extends NativeRelayConfigSpec implements CallerContextable {
    public static final String API_PATH = "/api/v1/ads/";
    public static final CallerContext CALLER_CONTEXT = CallerContext.A00(RelayAPIConfigModule.class);
    public static final String GRAPHQL_URL = "%s%s/?locale=%s";
    public static final String MODULE_NAME = "RelayAPIConfig";
    public final 0lg mSession;

    public String getName() {
        return "RelayAPIConfig";
    }

    public Map getTypedExportedConstants() {
        String A03 = 1Ma.A03(API_PATH);
        String A00 = AnonymousClass1Q2.A00();
        HashMap A1E = AnonymousClass7TE.A1E();
        A1E.put("fetchTimeout", 30000);
        A1E.put("retryDelays", Integer.valueOf(IgNetworkConsentStorage.MAX_ENTRIES));
        A1E.put("graphBatchURI", 0mp.A06(GRAPHQL_URL, new Object[]{A03, "graphqlbatch", A00}));
        A1E.put("graphURI", 0mp.A06(GRAPHQL_URL, new Object[]{A03, AnonymousClass000.A00(3200), A00}));
        return A1E;
    }

    public RelayAPIConfigModule(QZK qzk, 0lg r2) {
        super(qzk);
        this.mSession = r2;
    }
}
