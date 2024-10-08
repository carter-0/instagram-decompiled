package com.facebook.cameracore.ardelivery.xplat.scripting;

import X.0qQ;
import X.1Ef;
import X.C313026fe;
import X.C313036ff;
import X.C377189Kw;
import X.C45199CsA;
import X.C45495CxV;
import X.C45910DEq;
import X.C45933DFn;
import X.DFT;
import com.facebook.cameracore.ardelivery.scripting.ScriptingPackageMetadata;
import java.lang.reflect.InvocationTargetException;

public final class XplatScriptingMetadataFetcher {
    public C313036ff metadataDownloader;

    public XplatScriptingMetadataFetcher(C313036ff r2) {
        0qQ.A0B(r2, 1);
        this.metadataDownloader = r2;
    }

    public final void fetchMetadata(String str, XplatScriptingMetadataCompletionCallback xplatScriptingMetadataCompletionCallback) {
        0qQ.A0B(str, 0);
        0qQ.A0B(xplatScriptingMetadataCompletionCallback, 1);
        C313036ff r4 = this.metadataDownloader;
        C45199CsA csA = new C45199CsA(xplatScriptingMetadataCompletionCallback);
        C313026fe r42 = (C313026fe) r4;
        synchronized (r42) {
            ScriptingPackageMetadata scriptingPackageMetadata = (ScriptingPackageMetadata) r42.A01.get(str);
            if (scriptingPackageMetadata != null) {
                csA.A00.onSuccess(scriptingPackageMetadata);
            } else {
                C377189Kw r5 = new C377189Kw(csA, 16);
                try {
                    C45933DFn dFn = (C45933DFn) C45495CxV.class.getMethod("create", new Class[0]).invoke((Object) null, new Object[0]);
                    dFn.A00.A04("package_hash", str);
                    dFn.A02 = true;
                    1Ef build = dFn.build();
                    0qQ.A0A(build);
                    r42.A00.ATL(new C45910DEq(r5), new DFT(r42, csA, str, r5), build);
                } catch (ClassNotFoundException | IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }

    public final void setMetadataDownloader(C313036ff r2) {
        0qQ.A0B(r2, 0);
        this.metadataDownloader = r2;
    }

    public final C313036ff getMetadataDownloader() {
        return this.metadataDownloader;
    }
}
