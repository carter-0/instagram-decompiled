package com.instagram.opal.impl.ui;

import X.0eS;
import X.0sL;
import X.AnonymousClass000;
import X.AnonymousClass0iw;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C49049EoT;
import X.C60340gF;
import X.HLK;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.opal.impl.ui.OpalTabContentKt$OpalTabEmptyContent$2$1", f = "OpalTabContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class OpalTabContentKt$OpalTabEmptyContent$2$1 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ AnonymousClass0iw A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ HLK A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public OpalTabContentKt$OpalTabEmptyContent$2$1(AnonymousClass0iw r2, UserSession userSession, HLK hlk, String str, AnonymousClass4D7 r6, boolean z) {
        super(2, r6);
        this.A02 = hlk;
        this.A04 = z;
        this.A03 = str;
        this.A01 = userSession;
        this.A00 = r2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.opal.impl.ui.OpalTabContentKt$OpalTabEmptyContent$2$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r9) {
        HLK hlk = this.A02;
        boolean z = this.A04;
        String str = this.A03;
        return new OpalTabContentKt$OpalTabEmptyContent$2$1(this.A00, this.A01, hlk, str, r9, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((OpalTabContentKt$OpalTabEmptyContent$2$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        String str;
        String A002;
        0eS.A00(obj);
        int ordinal = this.A02.ordinal();
        if (ordinal == 0) {
            str = "empty_post";
        } else if (ordinal == 1) {
            str = "empty_reel";
        } else {
            throw AnonymousClass7TE.A1K();
        }
        boolean z = this.A04;
        String str2 = this.A03;
        UserSession userSession = this.A01;
        AnonymousClass0iw r1 = this.A00;
        if (z) {
            A002 = "opal_self_profile";
        } else {
            A002 = AnonymousClass000.A00(1650);
        }
        C49049EoT.A00(r1, userSession, "impression", str, A002, str2, (String) null);
        return C60340gF.A00;
    }
}
