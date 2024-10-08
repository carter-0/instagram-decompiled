package X;

import android.app.Activity;
import com.instagram.common.session.UserSession;

/* renamed from: X.WYc  reason: case insensitive filesystem */
public final class C19409WYc implements X8T {
    public final /* synthetic */ C15997Ume A00;
    public final /* synthetic */ C45884D9d A01;
    public final /* synthetic */ String A02;

    public C19409WYc(C15997Ume ume, C45884D9d d9d, String str) {
        this.A00 = ume;
        this.A02 = str;
        this.A01 = d9d;
    }

    public final void DTg() {
        C15997Ume ume = this.A00;
        ((C14771U8h) ume.A0A.getValue()).A01(((C16037UnQ) ume.A0B.getValue()).A07, false);
    }

    public final void DZL() {
        C15997Ume ume = this.A00;
        AnonymousClass0eM r2 = ume.A0B;
        ((C14771U8h) ume.A0A.getValue()).A00(((C16037UnQ) r2.getValue()).A07, false);
        C15997Ume ume2 = ume;
        C18744Vze.A00.A01(DbT.A03(ume), ume.requireArguments(), ume, ((C16037UnQ) r2.getValue()).A04, ume2, this.A01, this.A02);
    }

    public final void onDismiss() {
        C15997Ume ume = this.A00;
        UserSession userSession = ((C16037UnQ) ume.A0B.getValue()).A04;
        Activity A03 = DbT.A03(ume);
        AnonymousClass7TG.A1N(userSession, A03);
        C71342cb.A00(userSession).A06(A03);
        A03.finish();
    }

    public final void onShow() {
        C15997Ume ume = this.A00;
        ((C14771U8h) ume.A0A.getValue()).A02(((C16037UnQ) ume.A0B.getValue()).A07, false);
    }
}
