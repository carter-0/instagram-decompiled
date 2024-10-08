package X;

import com.instagram.wonderwall.model.WallPostItem;
import com.instagram.wonderwall.repository.WallPostRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wonderwall.repository.WallPostRepository", f = "WallPostRepository.kt", i = {0, 0, 0, 0}, l = {60}, m = "reactToWallPost", n = {"this", "wallPostItem", "currentReactionCount", "currentReaction"}, s = {"L$0", "L$1", "I$0", "Z$0"})
/* renamed from: X.Ikt  reason: case insensitive filesystem */
public final class C58061Ikt extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ WallPostRepository A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58061Ikt(WallPostRepository wallPostRepository, AnonymousClass4D7 r2) {
        super(r2);
        this.A06 = wallPostRepository;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ikt, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A06.A01((C61046Jvk) null, (WallPostItem) null, this);
    }
}
