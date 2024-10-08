package X;

import com.instagram.mainfeed.network.flashfeed.FlashFeedCache;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.mainfeed.network.flashfeed.FlashFeedCache", f = "FlashFeedCache.kt", i = {0, 0, 0, 1}, l = {420, 292}, m = "saveItems", n = {"this", "$this$withLock_u24default$iv", "clearOrderedFeedCache", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "Z$0", "L$0"})
/* renamed from: X.7xW  reason: invalid class name and case insensitive filesystem */
public final class C347877xW extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ FlashFeedCache A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C347877xW(FlashFeedCache flashFeedCache, AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = flashFeedCache;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, X.7xW] */
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A05.A07(this, false);
    }
}
