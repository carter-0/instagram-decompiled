package X;

import com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.security.attestation.playintegrity.worker.PlayIntegrityAttestationWorker", f = "PlayIntegrityAttestationWorker.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {72, 80}, m = "doWork", n = {"this", "event", "attestPreferences", "errorCodes", "numRetries", "useSharedImpl", "this", "event", "attestPreferences", "errorCodes", "numRetries", "useSharedImpl"}, s = {"L$0", "L$1", "L$2", "L$3", "J$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "J$0", "Z$0"})
/* renamed from: X.Avl  reason: case insensitive filesystem */
public final class C41543Avl extends C64101El {
    public int A00;
    public long A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public boolean A06;
    public /* synthetic */ Object A07;
    public final /* synthetic */ PlayIntegrityAttestationWorker A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41543Avl(PlayIntegrityAttestationWorker playIntegrityAttestationWorker, AnonymousClass4D7 r2) {
        super(r2);
        this.A08 = playIntegrityAttestationWorker;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.4D7, X.Avl] */
    public final Object invokeSuspend(Object obj) {
        this.A07 = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A08.A03(this);
    }
}
