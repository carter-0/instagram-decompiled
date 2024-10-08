package com.instagram.direct.fragment.cardgallery.plugin;

import X.0eP;
import X.0eS;
import X.0qQ;
import X.0sL;
import X.2FW;
import X.AnonymousClass05K;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass77B;
import X.AnonymousClass7TE;
import X.AnonymousClass7TF;
import X.AnonymousClass9HC;
import X.C239793Ih;
import X.C239803Ii;
import X.C250563lf;
import X.C3262776c;
import X.C3262876d;
import X.C329967Kx;
import X.C332917Wy;
import X.C60340gF;
import X.C62320sa;
import X.C68168N3i;
import X.C71039Oa5;
import X.OQ3;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import java.util.List;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.direct.fragment.cardgallery.plugin.ChallengesLauncher$maybeOpenSubmission$1$1", f = "ChallengesLauncher.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ChallengesLauncher$maybeOpenSubmission$1$1 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ C62320sa A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ChallengesLauncher$maybeOpenSubmission$1$1(Context context, UserSession userSession, String str, String str2, String str3, AnonymousClass4D7 r7, C62320sa r8, C62320sa r9) {
        super(2, r7);
        this.A07 = r8;
        this.A06 = r9;
        this.A01 = context;
        this.A02 = userSession;
        this.A05 = str;
        this.A03 = str2;
        this.A04 = str3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.direct.fragment.cardgallery.plugin.ChallengesLauncher$maybeOpenSubmission$1$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r11) {
        ? challengesLauncher$maybeOpenSubmission$1$1 = new ChallengesLauncher$maybeOpenSubmission$1$1(this.A01, this.A02, this.A05, this.A03, this.A04, r11, this.A07, this.A06);
        challengesLauncher$maybeOpenSubmission$1$1.A00 = obj;
        return challengesLauncher$maybeOpenSubmission$1$1;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ChallengesLauncher$maybeOpenSubmission$1$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eP r0;
        C71039Oa5 oa5;
        ImmutableList immutableList;
        0eS.A00(obj);
        C239803Ii r1 = (C239803Ii) this.A00;
        if (!(!(r1 instanceof C239793Ih) || (r0 = (0eP) ((C239793Ih) r1).A00) == null || (oa5 = (C71039Oa5) r0.A00) == null || (immutableList = (ImmutableList) r0.A01) == null)) {
            AnonymousClass9HC r13 = (AnonymousClass9HC) this.A07.invoke();
            Context context = this.A01;
            UserSession userSession = this.A02;
            C3262876d A002 = C3262776c.A00(context, userSession);
            String str = this.A05;
            AnonymousClass77B A032 = A002.A03(userSession, oa5, new DirectThreadKey(str, (List) null), (Long) null, this.A03, "challenges", false);
            String str2 = this.A04;
            Resources A0A = AnonymousClass7TF.A0A(context);
            String A052 = oa5.A05();
            String str3 = userSession.A06;
            C329967Kx r14 = C250563lf.A07(context, r13, false).A04;
            boolean A0K = 0qQ.A0K(oa5.A07(), str3);
            2FW r15 = 2FW.A0a;
            new Integer(29);
            A032.A00 = OQ3.A01(A0A, immutableList, userSession, r13, r14, r15, new Long(AnonymousClass7TE.A0P(oa5.A01())), A052, "challenges", str, str3, str2, A0K);
            List A1I = AnonymousClass7TE.A1I(A032);
            ((C332917Wy) this.A06.invoke()).Cpz((View) null, new C68168N3i(AnonymousClass7TE.A0Y(), 0.0f), AnonymousClass05K.A0C, A1I, 0, false, true);
        }
        return C60340gF.A00;
    }
}
