package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "kotlinx.coroutines.DelayKt", f = "Delay.kt", i = {}, l = {160}, m = "awaitCancellation", n = {}, s = {})
/* renamed from: X.7cP  reason: invalid class name and case insensitive filesystem */
public final class C335117cP extends C64101El {
    public int A00;
    public /* synthetic */ Object A01;

    public C335117cP(AnonymousClass4D7 r1) {
        super(r1);
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.7cP, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A01 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return C241603Pv.A03(this);
    }
}
