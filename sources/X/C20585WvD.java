package X;

import android.content.Context;
import android.view.ViewGroup;
import com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.facebook.fbavatar.cdsavatareditor.liveediting.ig.FoaLiveEditingProvider", f = "FoaLiveEditingProvider.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {121}, m = "initialize", n = {"this", "context", "container", "qplLogger", "benchmarkingKey", "onEventReceived", "fallbackLogicHandler", "liveEditingInitializationParameters", "richAvatarViewProvider", "cdlProviderHolder"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9"})
/* renamed from: X.WvD  reason: case insensitive filesystem */
public final class C20585WvD extends C64101El {
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
    public /* synthetic */ Object A0A;
    public final /* synthetic */ FoaLiveEditingProvider A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20585WvD(FoaLiveEditingProvider foaLiveEditingProvider, AnonymousClass4D7 r2) {
        super(r2);
        this.A0B = foaLiveEditingProvider;
    }

    /* JADX WARNING: type inference failed for: r7v0, types: [X.WvD, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A0A = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return this.A0B.A00((Context) null, (ViewGroup) null, (C17788Vg0) null, (C18006Vji) null, (C15046UKz) null, (C18073Vl1) null, this, false);
    }
}
