package X;

import com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.wellbeing.limitsplus.data.LimitsPlusRepository", f = "LimitsPlusRepository.kt", i = {0, 0, 0, 0, 0}, l = {125}, m = "saveAudienceOption", n = {"this", "limitsEnabled", "newFollowers", "nonFollowers", "nonCloseFriends"}, s = {"L$0", "L$1", "Z$0", "Z$1", "Z$2"})
/* renamed from: X.Ikw  reason: case insensitive filesystem */
public final class C58064Ikw extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public boolean A03;
    public boolean A04;
    public boolean A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ LimitsPlusRepository A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58064Ikw(LimitsPlusRepository limitsPlusRepository, AnonymousClass4D7 r2) {
        super(r2);
        this.A07 = limitsPlusRepository;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Ikw, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A07.A07(this, false, false, false);
    }
}
