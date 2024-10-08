package X;

import com.instagram.pendingmedia.service.impl.ShareVideoHelper;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.pendingmedia.service.impl.ShareVideoHelper", f = "ShareVideoHelper.kt", i = {0, 0, 0, 0, 0, 1, 1, 1, 1, 2, 2, 2, 2}, l = {40, 49, 57}, m = "tryNextStep$fbandroid_java_com_instagram_pendingmedia_service_impl_impl", n = {"uploadAttempt", "userSession", "reliabilityLogger", "targetStatus", "triedSomething", "uploadAttempt", "reliabilityLogger", "targetStatus", "triedSomething", "uploadAttempt", "reliabilityLogger", "targetStatus", "triedSomething"}, s = {"L$0", "L$1", "L$2", "L$3", "I$0", "L$0", "L$1", "L$2", "I$0", "L$0", "L$1", "L$2", "I$0"})
public final class MDQ extends C64101El {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public /* synthetic */ Object A09;
    public final /* synthetic */ ShareVideoHelper A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MDQ(ShareVideoHelper shareVideoHelper, AnonymousClass4D7 r2) {
        super(r2);
        this.A0A = shareVideoHelper;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [X.MDQ, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A09 = obj;
        this.A03 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A0A.A00((LP8) null, this);
    }
}
