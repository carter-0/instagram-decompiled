package X;

import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository", f = "LimitsPlusRepository.kt", i = {0, 0, 0, 0}, l = {163}, m = "saveFeatureOption", n = {"this", "limitsEnabled", "someInteractions", "mostInteractions"}, s = {"L$0", "L$1", "Z$0", "Z$1"})
/* renamed from: X.Iks  reason: case insensitive filesystem */
public final class C58060Iks extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public /* synthetic */ Object A05;
    public final /* synthetic */ LimitsPlusRepository A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58060Iks(LimitsPlusRepository limitsPlusRepository, AnonymousClass4D7 r2) {
        super(r2);
        this.A06 = limitsPlusRepository;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Iks, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A05 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A06.A06(this, false, false);
    }
}
