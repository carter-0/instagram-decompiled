package com.instagram.url;

import X.032;
import X.0eS;
import X.0rm;
import X.0sL;
import X.1Hj;
import X.AnonymousClass0Zq;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass7TG;
import X.C20426WrB;
import X.C60340gF;
import X.C66174MGl;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1", f = "DeepLinkUtil.kt", i = {}, l = {699}, m = "invokeSuspend", n = {}, s = {})
public final class DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ FragmentActivity A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ 0rm A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, AnonymousClass4D7 r6, 0rm r7, int i, int i2) {
        super(2, r6);
        this.A04 = userSession;
        this.A06 = str;
        this.A07 = r7;
        this.A03 = fragmentActivity;
        this.A05 = str2;
        this.A01 = i;
        this.A02 = i2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        return new DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1(this.A03, this.A04, this.A06, this.A05, r11, this.A07, this.A01, this.A02);
    }

    /* JADX WARNING: type inference failed for: r13v0, types: [com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r5 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            UserSession userSession = this.A04;
            String str = this.A06;
            AnonymousClass7TG.A1N(userSession, str);
            032 A002 = AnonymousClass0Zq.A00(new C66174MGl(str, (Object) userSession, (AnonymousClass4D7) null, 46));
            C20426WrB wrB = new C20426WrB(this.A03, userSession, this.A05, this.A07, this.A01, this.A02);
            this.A00 = 1;
            if (A002.collect(wrB, this) == r5) {
                return r5;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DeepLinkUtil$handlePromoteFlowDeepLinkWithClientSpecOverride$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
