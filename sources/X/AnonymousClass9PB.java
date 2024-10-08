package X;

import com.instagram.stickersearch.AvatarStickerPreRenderInteractor;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.stickersearch.AvatarStickerPreRenderInteractor", f = "AvatarStickerPreRenderInteractor.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {330, 344}, m = "maybeRequestPreRendering", n = {"this", "stickerPackType", "surface", "shouldUpdateAvatarInfoCache", "this", "stickerPackerId", "shouldUpdateAvatarInfoCache", "isVersionRenderingCacheEmpty"}, s = {"L$0", "L$1", "L$2", "Z$0", "L$0", "L$1", "Z$0", "Z$1"})
/* renamed from: X.9PB  reason: invalid class name */
public final class AnonymousClass9PB extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public boolean A04;
    public boolean A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ AvatarStickerPreRenderInteractor A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9PB(AvatarStickerPreRenderInteractor avatarStickerPreRenderInteractor, AnonymousClass4D7 r2) {
        super(r2);
        this.A07 = avatarStickerPreRenderInteractor;
    }

    /* JADX WARNING: type inference failed for: r3v0, types: [X.9PB, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A07.A02((C317846nw) null, (C317866ny) null, this, false);
    }
}
