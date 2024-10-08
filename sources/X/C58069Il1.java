package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.audio.soundsync.viewmodel.SoundSyncVideoLoader", f = "SoundSyncVideoLoader.kt", i = {0, 0, 0, 0, 0}, l = {289}, m = "onSoundSyncComplete", n = {"this", "destination$iv$iv", "igClipSegment", "isSkipSoundSync", "index$iv$iv"}, s = {"L$0", "L$1", "L$3", "Z$0", "I$0"})
/* renamed from: X.Il1  reason: case insensitive filesystem */
public final class C58069Il1 extends C64101El {
    public int A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public boolean A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ C56569I1z A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58069Il1(C56569I1z i1z, AnonymousClass4D7 r2) {
        super(r2);
        this.A0A = i1z;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Il1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A09 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A0A.A01(this, false);
    }
}
