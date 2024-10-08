package com.instagram.trials.view;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.1Hj;
import X.AnonymousClass000;
import X.AnonymousClass1Ek;
import X.AnonymousClass1Nd;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C239793Ih;
import X.C239803Ii;
import X.C294255m9;
import X.C297815sO;
import X.C321786uk;
import X.C46327Dbv;
import X.C59689JTv;
import X.C60340gF;
import X.C60763Jqu;
import X.C62320sa;
import X.LSk;
import android.content.Context;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.common.session.UserSession;
import com.instagram.trials.repository.ClipsTrialBottomSheetRepositoryImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.trials.view.ClipsTrialBottomSheetFragment$openActionSheet$1$2$1", f = "ClipsTrialBottomSheetFragment.kt", i = {}, l = {313}, m = "invokeSuspend", n = {}, s = {})
public final class ClipsTrialBottomSheetFragment$openActionSheet$1$2$1 extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ C46327Dbv A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ LSk A04;
    public final /* synthetic */ ClipsTrialBottomSheetRepositoryImpl A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ C62320sa A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ClipsTrialBottomSheetFragment$openActionSheet$1$2$1(Context context, C46327Dbv dbv, UserSession userSession, LSk lSk, ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl, String str, String str2, AnonymousClass4D7 r9, C62320sa r10) {
        super(2, r9);
        this.A04 = lSk;
        this.A06 = str;
        this.A07 = str2;
        this.A02 = dbv;
        this.A05 = clipsTrialBottomSheetRepositoryImpl;
        this.A08 = r10;
        this.A03 = userSession;
        this.A01 = context;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.trials.view.ClipsTrialBottomSheetFragment$openActionSheet$1$2$1, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        LSk lSk = this.A04;
        String str = this.A06;
        String str2 = this.A07;
        C46327Dbv dbv = this.A02;
        ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl = this.A05;
        C62320sa r9 = this.A08;
        return new ClipsTrialBottomSheetFragment$openActionSheet$1$2$1(this.A01, dbv, this.A03, lSk, clipsTrialBottomSheetRepositoryImpl, str, str2, r12, r9);
    }

    /* JADX WARNING: type inference failed for: r11v0, types: [com.instagram.trials.view.ClipsTrialBottomSheetFragment$openActionSheet$1$2$1, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        Context context;
        int i;
        1Hj r4 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            LSk lSk = this.A04;
            String str = this.A06;
            String str2 = this.A07;
            C46327Dbv dbv = this.A02;
            0qQ.A0B(str, 0);
            C60763Jqu A012 = LSk.A01(dbv, str2);
            String A002 = AnonymousClass000.A00(739);
            LSk.A02(A012, lSk, PublicKeyCredentialControllerUtility.JSON_KEY_USER, A002, "tap_share", str);
            ClipsTrialBottomSheetRepositoryImpl clipsTrialBottomSheetRepositoryImpl = this.A05;
            this.A00 = 1;
            obj = clipsTrialBottomSheetRepositoryImpl.A02(str, A002, this);
            if (obj == r4) {
                return r4;
            }
        }
        C239803Ii r12 = (C239803Ii) obj;
        boolean z = r12 instanceof C239793Ih;
        String A003 = AnonymousClass000.A00(4128);
        if (z) {
            if (AnonymousClass7TE.A1a(((C239793Ih) r12).A00)) {
                C62320sa r0 = this.A08;
                if (r0 != null) {
                    r0.invoke();
                }
                UserSession userSession = this.A03;
                AnonymousClass1Nd.A00(userSession).A00(new C321786uk(C294255m9.A04, userSession.A06));
                context = this.A01;
                i = 2131973611;
                A003 = null;
            }
            context = this.A01;
            i = 2131974093;
        } else {
            if (!(r12 instanceof C297815sO)) {
                throw AnonymousClass7TE.A1K();
            }
            context = this.A01;
            i = 2131974093;
        }
        C59689JTv.A0F(context, A003, i);
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ClipsTrialBottomSheetFragment$openActionSheet$1$2$1) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
