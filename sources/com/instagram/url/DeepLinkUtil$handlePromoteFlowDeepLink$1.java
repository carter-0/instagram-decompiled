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
import X.C20428WrD;
import X.C60340gF;
import X.C66174MGl;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLink$1", f = "DeepLinkUtil.kt", i = {}, l = {751}, m = "invokeSuspend", n = {}, s = {})
public final class DeepLinkUtil$handlePromoteFlowDeepLink$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ FragmentActivity A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ 0rm A08;
    public final /* synthetic */ boolean A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DeepLinkUtil$handlePromoteFlowDeepLink$1(FragmentActivity fragmentActivity, UserSession userSession, String str, String str2, String str3, String str4, String str5, AnonymousClass4D7 r9, 0rm r10, boolean z, boolean z2, boolean z3) {
        super(2, r9);
        this.A02 = userSession;
        this.A05 = str;
        this.A08 = r10;
        this.A01 = fragmentActivity;
        this.A04 = str2;
        this.A06 = str3;
        this.A09 = z;
        this.A0B = z2;
        this.A0A = z3;
        this.A03 = str4;
        this.A07 = str5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLink$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r15) {
        UserSession userSession = this.A02;
        String str = this.A05;
        0rm r9 = this.A08;
        return new DeepLinkUtil$handlePromoteFlowDeepLink$1(this.A01, userSession, str, this.A04, this.A06, this.A03, this.A07, r15, r9, this.A09, this.A0B, this.A0A);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [com.instagram.url.DeepLinkUtil$handlePromoteFlowDeepLink$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        1Hj r1 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            UserSession userSession = this.A02;
            String str = this.A05;
            AnonymousClass7TG.A1N(userSession, str);
            032 A002 = AnonymousClass0Zq.A00(new C66174MGl(str, (Object) userSession, (AnonymousClass4D7) null, 46));
            0rm r11 = this.A08;
            C20428WrD wrD = new C20428WrD(this.A01, userSession, this.A04, this.A06, this.A03, this.A07, r11, this.A09, this.A0B, this.A0A);
            this.A00 = 1;
            if (A002.collect(wrD, this) == r1) {
                return r1;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((DeepLinkUtil$handlePromoteFlowDeepLink$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
