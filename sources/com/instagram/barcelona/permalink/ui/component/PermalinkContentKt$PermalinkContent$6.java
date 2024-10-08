package com.instagram.barcelona.permalink.ui.component;

import X.0eS;
import X.0sL;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C46649DiU;
import X.C60340gF;
import X.C62320sa;
import X.DbS;
import X.DbY;
import X.Dbp;
import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.barcelona.permalink.ui.component.PermalinkContentKt$PermalinkContent$6", f = "PermalinkContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class PermalinkContentKt$PermalinkContent$6 extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ Context A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ C62320sa A04;
    public final /* synthetic */ C62320sa A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public PermalinkContentKt$PermalinkContent$6(Context context, UserSession userSession, String str, String str2, AnonymousClass4D7 r6, C62320sa r7, C62320sa r8) {
        super(2, r6);
        this.A04 = r7;
        this.A05 = r8;
        this.A03 = str;
        this.A00 = context;
        this.A01 = userSession;
        this.A02 = str2;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.barcelona.permalink.ui.component.PermalinkContentKt$PermalinkContent$6, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        C62320sa r6 = this.A04;
        C62320sa r7 = this.A05;
        return new PermalinkContentKt$PermalinkContent$6(this.A00, this.A01, this.A03, this.A02, r10, r6, r7);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((PermalinkContentKt$PermalinkContent$6) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        this.A04.invoke();
        this.A05.invoke();
        C46649DiU A042 = C46649DiU.A04("com.bloks.www.instagram.igwb.exp.geogating_viewer", DbY.A0p(Dbp.A00(), "", AnonymousClass7TE.A1L("media_id", this.A03)));
        Context context = this.A00;
        IgBloksScreenConfig A0N = DbS.A0N(this.A01);
        A0N.A0P = AnonymousClass05K.A00;
        A0N.A0U = this.A02;
        A042.A0D(context, A0N);
        return C60340gF.A00;
    }
}
