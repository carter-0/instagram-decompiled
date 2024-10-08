package X;

import androidx.paging.PageEvent$Insert;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "androidx.paging.PageEvent$Insert", f = "PageEvent.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {158}, m = "filter", n = {"predicate", "this_$iv$iv", "destination$iv$iv$iv", "it", "data", "originalIndices", "t", "index$iv", "index"}, s = {"L$0", "L$1", "L$3", "L$5", "L$6", "L$7", "L$9", "I$0", "I$1"})
public final class MDZ extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public Object A0D;
    public /* synthetic */ Object A0E;
    public final /* synthetic */ PageEvent$Insert A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDZ(PageEvent$Insert pageEvent$Insert, AnonymousClass4D7 r2) {
        super(r2);
        this.A0F = pageEvent$Insert;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MDZ, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A0E = obj;
        this.A02 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A0F.A00(this, (0sL) null);
    }
}
