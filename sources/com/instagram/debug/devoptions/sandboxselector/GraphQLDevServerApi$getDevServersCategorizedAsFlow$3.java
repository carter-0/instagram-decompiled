package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass3JD;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServersCategorizedAsFlow$3", f = "GraphQLDevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GraphQLDevServerApi$getDevServersCategorizedAsFlow$3 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object L$0;
    public int label;

    public GraphQLDevServerApi$getDevServersCategorizedAsFlow$3(AnonymousClass4D7 r2) {
        super(2, r2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServersCategorizedAsFlow$3, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r3) {
        ? graphQLDevServerApi$getDevServersCategorizedAsFlow$3 = new GraphQLDevServerApi$getDevServersCategorizedAsFlow$3(r3);
        graphQLDevServerApi$getDevServersCategorizedAsFlow$3.L$0 = obj;
        return graphQLDevServerApi$getDevServersCategorizedAsFlow$3;
    }

    public final Object invoke(AnonymousClass3JD r3, AnonymousClass4D7 r4) {
        GraphQLDevServerApi$getDevServersCategorizedAsFlow$3 graphQLDevServerApi$getDevServersCategorizedAsFlow$3 = new GraphQLDevServerApi$getDevServersCategorizedAsFlow$3(r4);
        graphQLDevServerApi$getDevServersCategorizedAsFlow$3.L$0 = r3;
        return graphQLDevServerApi$getDevServersCategorizedAsFlow$3.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        Object obj2;
        if (this.label == 0) {
            0eS.A00(obj);
            AnonymousClass3JD r0 = (AnonymousClass3JD) this.L$0;
            if (r0 != null) {
                obj2 = r0.Bny();
            } else {
                obj2 = null;
            }
            0qQ.A0C(obj2, "null cannot be cast to non-null type com.instagram.debug.devoptions.sandboxselector.DevserversCategoryInfoResponseImpl");
            return obj2;
        }
        throw AnonymousClass7TE.A0x();
    }
}
