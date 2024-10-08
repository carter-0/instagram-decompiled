package com.facebook.graphql.enums;

import X.AnonymousClass7TH;
import com.facebook.catalyst.modules.netinfo.NetInfoModule;
import java.util.HashSet;
import java.util.Set;

public final class GraphQLWebAuthnAttestationConveyanceSet {
    public static final HashSet A00 = AnonymousClass7TH.A0F("DIRECT", "INDIRECT", NetInfoModule.CONNECTION_TYPE_NONE_DEPRECATED);

    public static final Set getSet() {
        return A00;
    }
}
