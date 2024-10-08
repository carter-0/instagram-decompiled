package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass4D7;
import X.AnonymousClass972;
import X.C64101El;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi", f = "GraphQLDevServerApi.kt", i = {}, l = {26}, m = "getDevServers", n = {}, s = {})
public final class GraphQLDevServerApi$getDevServers$1 extends C64101El {
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ GraphQLDevServerApi this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GraphQLDevServerApi$getDevServers$1(GraphQLDevServerApi graphQLDevServerApi, AnonymousClass4D7 r2) {
        super(r2);
        this.this$0 = graphQLDevServerApi;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [com.instagram.debug.devoptions.sandboxselector.GraphQLDevServerApi$getDevServers$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.this$0.getDevServers((UserSession) null, this);
    }
}
