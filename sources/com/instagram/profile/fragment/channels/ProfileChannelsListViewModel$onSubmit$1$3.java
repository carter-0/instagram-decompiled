package com.instagram.profile.fragment.channels;

import X.0eS;
import X.0qQ;
import X.0sL;
import X.AnonymousClass1Ek;
import X.AnonymousClass1XT;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.C268664dn;
import X.C268674do;
import X.C46769Dkw;
import X.C47262Dtq;
import X.C49071Eop;
import X.C50336FYs;
import X.C59678JTj;
import X.C60340gF;
import X.C66579MXk;
import X.DbS;
import X.DbX;
import X.ExW;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.profile.fragment.channels.ProfileChannelsListViewModel$onSubmit$1$3", f = "ProfileChannelsListViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class ProfileChannelsListViewModel$onSubmit$1$3 extends AnonymousClass1Ek implements 0sL {
    public /* synthetic */ Object A00;
    public final /* synthetic */ C46769Dkw A01;
    public final /* synthetic */ String A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ProfileChannelsListViewModel$onSubmit$1$3(C46769Dkw dkw, String str, AnonymousClass4D7 r4) {
        super(2, r4);
        this.A01 = dkw;
        this.A02 = str;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [com.instagram.profile.fragment.channels.ProfileChannelsListViewModel$onSubmit$1$3, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r5) {
        ? profileChannelsListViewModel$onSubmit$1$3 = new ProfileChannelsListViewModel$onSubmit$1$3(this.A01, this.A02, r5);
        profileChannelsListViewModel$onSubmit$1$3.A00 = obj;
        return profileChannelsListViewModel$onSubmit$1$3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((ProfileChannelsListViewModel$onSubmit$1$3) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C46769Dkw dkw;
        C50336FYs A002;
        String str;
        String errorMessage;
        String errorCode;
        String str2;
        String str3;
        0eS.A00(obj);
        Object obj2 = ((C59678JTj) this.A00).A01;
        if (obj2 instanceof C268664dn) {
            0qQ.A0C(obj2, C66579MXk.A00(22));
            Throwable th = ((C268664dn) obj2).A00;
            dkw = this.A01;
            A002 = C49071Eop.A00(dkw.A02);
            str = this.A02;
            errorMessage = null;
            str2 = th.getStackTrace().toString();
            str3 = DbX.A0t(th.getCause());
            errorCode = null;
        } else if (obj2 instanceof C268674do) {
            0qQ.A0C(obj2, C66579MXk.A00(995));
            AnonymousClass1XT r1 = (AnonymousClass1XT) ((C268674do) obj2).A00;
            dkw = this.A01;
            A002 = C49071Eop.A00(dkw.A02);
            str = this.A02;
            errorMessage = r1.getErrorMessage();
            errorCode = r1.getErrorCode();
            str2 = null;
            str3 = null;
        } else {
            throw AnonymousClass7TE.A1K();
        }
        A002.A01(str, errorMessage, errorCode, str2, str3);
        dkw.A04.Epw(new C47262Dtq(DbS.A0Q(new Object[0], 2131974093)));
        ExW exW = dkw.A00;
        if (exW != null) {
            dkw.A03.A03(exW);
        }
        dkw.A00();
        return C60340gF.A00;
    }
}
