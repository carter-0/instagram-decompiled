package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.commonavatarliveediting.CommonSparkAvatarPreviewController", f = "CommonSparkAvatarPreviewController.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1}, l = {123, 50}, m = "initialize", n = {"this", "context", "container", "qplLogger", "onEventReceived", "liveEditingDataModel", "liveEditingInitializationParameters", "avatarEmbodimentSupport", "liveEditor", "fallbackLogicHandler", "$this$withLock_u24default$iv", "shouldRenderParametricsUsingLegacyAsset", "this", "liveEditingInitializationParameters", "liveEditor", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "Z$0", "L$0", "L$1", "L$2", "L$3"})
/* renamed from: X.WvF  reason: case insensitive filesystem */
public final class C20587WvF extends C64101El {
    public int A00;
    public Object A01;
    public Object A02;
    public Object A03;
    public Object A04;
    public Object A05;
    public Object A06;
    public Object A07;
    public Object A08;
    public Object A09;
    public Object A0A;
    public Object A0B;
    public boolean A0C;
    public /* synthetic */ Object A0D;
    public final /* synthetic */ CommonSparkAvatarPreviewController A0E;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20587WvF(CommonSparkAvatarPreviewController commonSparkAvatarPreviewController, AnonymousClass4D7 r2) {
        super(r2);
        this.A0E = commonSparkAvatarPreviewController;
    }

    /* JADX WARNING: type inference failed for: r10v0, types: [X.4D7, X.WvF] */
    public final Object invokeSuspend(Object obj) {
        this.A0D = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A0E.A00((Context) null, (ViewGroup) null, (C17788Vg0) null, (VLB) null, (C18006Vji) null, (C15037UKq) null, (C15046UKz) null, (C18073Vl1) null, (FoaLiveEditingProvider) null, this, false);
    }
}
