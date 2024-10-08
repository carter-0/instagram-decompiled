package X;

import android.app.Activity;
import android.content.Context;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;

/* renamed from: X.Awe  reason: case insensitive filesystem */
public final class C41572Awe extends 0Yg implements C62320sa {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ Context A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ AnonymousClass4D6 A03;
    public final /* synthetic */ C71662eb A04;
    public final /* synthetic */ TargetViewSizeProvider A05;
    public final /* synthetic */ AnonymousClass8W6 A06;
    public final /* synthetic */ C3499582p A07;
    public final /* synthetic */ AnonymousClass8AL A08;
    public final /* synthetic */ AnonymousClass80U A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41572Awe(Activity activity, Context context, UserSession userSession, AnonymousClass4D6 r5, C71662eb r6, TargetViewSizeProvider targetViewSizeProvider, AnonymousClass8W6 r8, C3499582p r9, AnonymousClass8AL r10, AnonymousClass80U r11) {
        super(0);
        this.A01 = context;
        this.A00 = activity;
        this.A02 = userSession;
        this.A09 = r11;
        this.A07 = r9;
        this.A08 = r10;
        this.A03 = r5;
        this.A06 = r8;
        this.A04 = r6;
        this.A05 = targetViewSizeProvider;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Context context = this.A01;
        Activity activity = this.A00;
        UserSession userSession = this.A02;
        AnonymousClass80U r10 = this.A09;
        C3499582p r8 = this.A07;
        AnonymousClass8AL r9 = this.A08;
        return new C65012Llp(activity, context, userSession, this.A03, this.A04, this.A05, this.A06, r8, r9, r10);
    }
}
