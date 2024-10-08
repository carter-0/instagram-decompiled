package X;

import androidx.compose.foundation.gestures.UpdatableAnimationState;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.compose.foundation.gestures.UpdatableAnimationState", f = "UpdatableAnimationState.kt", i = {0, 0, 0, 0, 1, 1}, l = {101, 147}, m = "animateToZero", n = {"this", "beforeFrame", "afterFrame", "durationScale", "this", "afterFrame"}, s = {"L$0", "L$1", "L$2", "F$0", "L$0", "L$1"})
/* renamed from: X.Ikr  reason: case insensitive filesystem */
public final class C58059Ikr extends C64101El {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ UpdatableAnimationState A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58059Ikr(UpdatableAnimationState updatableAnimationState, AnonymousClass4D7 r2) {
        super(r2);
        this.A06 = updatableAnimationState;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ikr, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A06.A00(this, (C62320sa) null, (0sP) null);
    }
}
