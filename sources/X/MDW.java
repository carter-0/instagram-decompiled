package X;

import com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.pendingmedia.service.igapi.ConfigureAsyncHelper", f = "ConfigureAsyncHelper.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, l = {63, 75}, m = "pollingConfigureStatus", n = {"module", "uploadAttempt", "pendingMedia", "userSession", "shareTarget", "configureHandler", "reliabilityLogger", "failure", "moreTimeRequestCount", "retryIntervalTimeMs", "retryMaxCount", "module", "uploadAttempt", "pendingMedia", "userSession", "shareTarget", "configureHandler", "reliabilityLogger", "failure", "needMoreTime", "moreTimeRequestCount", "retryIntervalTimeMs", "retryMaxCount"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "J$0", "I$1", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "I$1", "J$0", "I$2"})
public final class MDW extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public Object A0C;
    public /* synthetic */ Object A0D;
    public final /* synthetic */ ConfigureAsyncHelper A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDW(ConfigureAsyncHelper configureAsyncHelper, AnonymousClass4D7 r2) {
        super(r2);
        this.A0E = configureAsyncHelper;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MDW, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A0D = obj;
        this.A03 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return ConfigureAsyncHelper.A00((AnonymousClass0iw) null, (LP8) null, this.A0E, this);
    }
}
