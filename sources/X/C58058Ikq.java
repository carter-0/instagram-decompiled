package X;

import com.meta.compose.component.swipeable.SwipeableState;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.meta.compose.component.swipeable.SwipeableState", f = "Swipeable.kt", i = {1, 1, 1, 2, 2, 2}, l = {153, 177, 180}, m = "processNewAnchors$fbandroid_java_com_meta_compose_component_swipeable_swipeable", n = {"this", "newAnchors", "targetOffset", "this", "newAnchors", "targetOffset"}, s = {"L$0", "L$1", "F$0", "L$0", "L$1", "F$0"})
/* renamed from: X.Ikq  reason: case insensitive filesystem */
public final class C58058Ikq extends C64101El {
    public float A00;
    public int A01;
    public Object A02;
    public Object A03;
    public /* synthetic */ Object A04;
    public final /* synthetic */ SwipeableState A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58058Ikq(SwipeableState swipeableState, AnonymousClass4D7 r2) {
        super(r2);
        this.A05 = swipeableState;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ikq, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A04 = obj;
        this.A01 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A05.A02((Map) null, (Map) null, this);
    }
}
