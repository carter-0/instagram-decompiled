package com.instagram.direct.receiverfetch.graphql;

import X.AnonymousClass4Ks;
import X.AnonymousClass4Kx;
import X.AnonymousClass4Kz;
import X.AnonymousClass4L7;
import X.AnonymousClass4L8;
import X.AnonymousClass7TG;
import X.C250663lr;
import X.C250673ls;
import X.C66579MXk;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;

public final class IGDReceiverFetchFragmentImpl extends C250663lr implements C250673ls {

    public final class Response extends C250663lr implements C250673ls {
        public final AnonymousClass4Kx modelSelectionSet() {
            return AnonymousClass7TG.A0V(AnonymousClass4L8.A00, new AnonymousClass4L7(AnonymousClass4Kz.A00, C66579MXk.A00(1044)), TraceFieldType.ErrorCode);
        }

        public Response() {
            super(1622975823);
        }
    }

    public final AnonymousClass4Kx modelSelectionSet() {
        return AnonymousClass7TG.A0T(AnonymousClass4Ks.A02(), Response.class, PublicKeyCredentialControllerUtility.JSON_KEY_RESPONSE, 1622975823);
    }

    public IGDReceiverFetchFragmentImpl() {
        super(509676106);
    }
}
