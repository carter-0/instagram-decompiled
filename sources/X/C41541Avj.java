package X;

import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.wellbeing.teensafety.safetyinterventions.data.database.SafetyInterventionsMutationsDao", f = "SafetyInterventionsMutationsDao.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2}, l = {52, 58, 62, 69}, m = "incrementImpression$suspendImpl", n = {"$this", "queriesDao", "interventionType", "otherUserId", "timestamp", "$this", "queriesDao", "interventionType", "otherUserId", "timestamp", "$this", "interventionType", "otherUserId", "timestamp"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "L$3", "J$0", "L$0", "L$1", "L$2", "J$0"})
/* renamed from: X.Avj  reason: case insensitive filesystem */
public final class C41541Avj extends C64101El {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public /* synthetic */ Object A06;
    public final /* synthetic */ C332417Uy A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41541Avj(C332417Uy r1, AnonymousClass4D7 r2) {
        super(r2);
        this.A07 = r1;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.Avj, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A06 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return C332417Uy.A00(this.A07, (C332407Ux) null, (String) null, (String) null, this);
    }
}
