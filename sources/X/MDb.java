package X;

import com.instagram.pendingmedia.service.igapi.ConfigureMediaStep;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.pendingmedia.service.igapi.ConfigureMediaStep", f = "ConfigureMediaStep.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {164, 183}, m = "sendConfigureMediaRequestInternal", n = {"this", "uploadAttempt", "pendingMedia", "userSession", "logger", "shareTarget", "multiConfigShareType", "reliabilityLogger", "failure", "needMoreTime", "moreTimeRequestCount", "retryCooldownTime", "this", "uploadAttempt", "pendingMedia", "userSession", "logger", "shareTarget", "multiConfigShareType", "reliabilityLogger", "failure", "configureHandler", "attemptId", "needMoreTime", "moreTimeRequestCount", "retryCooldownTime"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "I$1", "I$2", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "I$0", "I$1", "I$2"})
public final class MDb extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
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
    public Object A0E;
    public /* synthetic */ Object A0F;
    public final /* synthetic */ ConfigureMediaStep A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDb(ConfigureMediaStep configureMediaStep, AnonymousClass4D7 r2) {
        super(r2);
        this.A0G = configureMediaStep;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MDb, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A0F = obj;
        this.A03 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return ConfigureMediaStep.A01((LP8) null, this.A0G, this);
    }
}
