package com.instagram.jobscheduler.bgfetch;

import X.AnonymousClass00P;
import X.AnonymousClass409;
import X.AnonymousClass7TG;
import X.C20512Wss;
import X.C20513Wst;
import X.C20514Wsu;
import X.C255463uA;
import X.VJ6;
import java.util.List;
import kotlinx.serialization.Serializable;

@Serializable
public final class IgBgFetchMetadata {
    public static final C255463uA[] A03 = {null, new AnonymousClass409(C20512Wss.A00), new AnonymousClass409(C20514Wsu.A00)};
    public static final Companion Companion = new Object();
    public final long A00;
    public final List A01;
    public final List A02;

    public final class Companion {
        public final C255463uA serializer() {
            return C20513Wst.A00;
        }
    }

    public IgBgFetchMetadata(List list, List list2, long j) {
        AnonymousClass7TG.A1Q(list, list2);
        this.A00 = j;
        this.A01 = list;
        this.A02 = list2;
    }

    public /* synthetic */ IgBgFetchMetadata(List list, List list2, int i, long j) {
        if (7 != (i & 7)) {
            VJ6.A00(C20513Wst.A01, i, 7);
            throw AnonymousClass00P.createAndThrow();
        }
        this.A00 = j;
        this.A01 = list;
        this.A02 = list2;
    }
}
