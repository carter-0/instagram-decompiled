package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.quickpromotion.sdk.InstagramQpSdkModule;
import java.util.Map;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.quickpromotion.sdk.InstagramQpSdkModule", f = "InstagramQPSdkModule.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, l = {247}, m = "choosePromotions", n = {"this", "userSession", "context", "triggerContext", "callback", "schedulerHelper", "qpUserFlowLogger", "fetchScope", "$this$choosePromotions_u24lambda_u242", "controllerManager", "destination$iv$iv", "surface"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$9", "L$10", "L$13"})
/* renamed from: X.41t  reason: invalid class name and case insensitive filesystem */
public final class C2594541t extends C64101El {
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
    public Object A0C;
    public Object A0D;
    public Object A0E;
    public /* synthetic */ Object A0F;
    public final /* synthetic */ InstagramQpSdkModule A0G;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C2594541t(InstagramQpSdkModule instagramQpSdkModule, AnonymousClass4D7 r2) {
        super(r2);
        this.A0G = instagramQpSdkModule;
    }

    /* JADX WARNING: type inference failed for: r8v0, types: [X.41t, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        this.A0F = obj;
        this.A00 |= AnonymousClass972.MUTABLE_FLAG_MASK;
        return InstagramQpSdkModule.A00((Context) null, (UserSession) null, (2br) null, (2cX) null, (C228012ke) null, (C2594441s) null, this.A0G, (Map) null, this, (C262224Cq) null);
    }
}
