package X;

import android.app.Activity;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.direct.fragment.prompts.challenges.model.ChannelChallengeShareInfo;

public final class ECJ extends 1P0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ View A01;
    public final /* synthetic */ AnonymousClass0iw A02;
    public final /* synthetic */ UserSession A03;
    public final /* synthetic */ ChannelChallengeShareInfo A04;
    public final /* synthetic */ EWV A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;

    public ECJ(Activity activity, View view, AnonymousClass0iw r3, UserSession userSession, ChannelChallengeShareInfo channelChallengeShareInfo, EWV ewv, String str, String str2, String str3) {
        this.A03 = userSession;
        this.A02 = r3;
        this.A06 = str;
        this.A07 = str2;
        this.A05 = ewv;
        this.A00 = activity;
        this.A04 = channelChallengeShareInfo;
        this.A08 = str3;
        this.A01 = view;
    }

    public final void onFail(C268654dm r9) {
        int A032 = AnonymousClass0fD.A03(1244395315);
        UserSession userSession = this.A03;
        String str = this.A06;
        String str2 = this.A07;
        EWV ewv = this.A05;
        C22031Xty.A0H(this.A02, userSession, str, str2, ewv.A05, r9.A01());
        AnonymousClass0fD.A0A(483341680, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        int A032 = AnonymousClass0fD.A03(1991185389);
        int A033 = AnonymousClass0fD.A03(-215898073);
        Object obj2 = ((AnonymousClass3JC) obj).A01;
        if (obj2 != null) {
            String optionalStringField = ((C250663lr) obj2).getRequiredTreeField(0, AnonymousClass000.A00(4234), BnC.class, -2100137207).getOptionalStringField(0, AnonymousClass000.A00(4102));
            if (optionalStringField != null) {
                UserSession userSession = this.A03;
                AnonymousClass0iw r7 = this.A02;
                String str = this.A06;
                String str2 = this.A07;
                EWV ewv = this.A05;
                C22031Xty.A0I(r7, userSession, str, str2, ewv.A05, optionalStringField);
                Activity activity = this.A00;
                String str3 = this.A08;
                View view = this.A01;
                if (ewv == EWV.A0C) {
                    0nC.A00(activity, optionalStringField);
                    C49118Eph.A00(activity, view, (String) null, true);
                } else if (ewv == EWV.A0K) {
                    C49899FCc.A01(activity, optionalStringField, str3);
                } else {
                    C46395DeI.A0M(activity, r7, userSession, ewv, optionalStringField);
                }
                i = 856607853;
                AnonymousClass0fD.A0A(i, A033);
                AnonymousClass0fD.A0A(209298543, A032);
            }
        }
        C22031Xty.A0H(this.A02, this.A03, this.A06, this.A07, this.A05.A05, (Throwable) null);
        i = -797562511;
        AnonymousClass0fD.A0A(i, A033);
        AnonymousClass0fD.A0A(209298543, A032);
    }
}
