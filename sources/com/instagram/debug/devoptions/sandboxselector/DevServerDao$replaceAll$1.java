package com.instagram.debug.devoptions.sandboxselector;

import X.AnonymousClass4D7;
import X.AnonymousClass972;
import X.C64101El;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.debug.devoptions.sandboxselector.DevServerDao", f = "DevServerDao.kt", i = {0, 0}, l = {27, 28}, m = "replaceAll$suspendImpl", n = {"$this", "items"}, s = {"L$0", "L$1"})
public final class DevServerDao$replaceAll$1 extends C64101El {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ DevServerDao this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DevServerDao$replaceAll$1(DevServerDao devServerDao, AnonymousClass4D7 r2) {
        super(r2);
        this.this$0 = devServerDao;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, com.instagram.debug.devoptions.sandboxselector.DevServerDao$replaceAll$1] */
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return DevServerDao.replaceAll$suspendImpl(this.this$0, (List) null, this);
    }
}
