package com.instagram.debug.devoptions.sandboxselector;

import X.0eS;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C60340gF;
import com.instagram.debug.devoptions.sandboxselector.DevserverListError;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServersCategorizedAsFlow$2", f = "GraphQLDevServerApi.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class GraphQLDevServerApi$getDevServersCategorizedAsFlow$2 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object L$0;
    public int label;

    public GraphQLDevServerApi$getDevServersCategorizedAsFlow$2(AnonymousClass4D7 r2) {
        super(2, r2);
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.4D7, com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServersCategorizedAsFlow$2] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r3) {
        ? graphQLDevServerApi$getDevServersCategorizedAsFlow$2 = new GraphQLDevServerApi$getDevServersCategorizedAsFlow$2(r3);
        graphQLDevServerApi$getDevServersCategorizedAsFlow$2.L$0 = obj;
        return graphQLDevServerApi$getDevServersCategorizedAsFlow$2;
    }

    public final Object invoke(Throwable th, AnonymousClass4D7 r4) {
        GraphQLDevServerApi$getDevServersCategorizedAsFlow$2 graphQLDevServerApi$getDevServersCategorizedAsFlow$2 = new GraphQLDevServerApi$getDevServersCategorizedAsFlow$2(r4);
        graphQLDevServerApi$getDevServersCategorizedAsFlow$2.L$0 = th;
        return graphQLDevServerApi$getDevServersCategorizedAsFlow$2.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        if (this.label == 0) {
            0eS.A00(obj);
            return new DevserverListError.HttpError(0, ((Throwable) this.L$0).getMessage());
        }
        throw AnonymousClass7TE.A0x();
    }
}
