package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import com.instagram.common.session.UserSession;
import com.instagram.model.hashtag.Hashtag;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* renamed from: X.EQe  reason: case insensitive filesystem */
public final class C47995EQe extends H4J {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final String A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47995EQe(0hq r1, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, String str, int i) {
        super(r1);
        this.A00 = i;
        this.A04 = obj5;
        this.A07 = str;
        this.A01 = obj;
        this.A06 = obj2;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A03 = obj6;
    }

    public final void onFail(C268654dm r14) {
        int A032;
        int i;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-1327370076);
                C59689JTv.A0D((Context) this.A01, "fetch_hashtag_permalink_failed");
                Hashtag hashtag = (Hashtag) this.A05;
                if (hashtag.getId() != null) {
                    C22031Xty.A0H((AnonymousClass0iw) this.A02, (0lg) this.A03, hashtag.getId(), "hashtag_page_overflow_menu", this.A07, r14.A01());
                }
                i = -1409751932;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(1866769942);
                Runnable runnable = (Runnable) this.A03;
                if (runnable != null) {
                    runnable.run();
                }
                i = -1079741982;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-709511283);
                Runnable runnable2 = (Runnable) this.A02;
                if (runnable2 != null) {
                    runnable2.run();
                }
                UserSession userSession = (UserSession) this.A06;
                AnonymousClass4DU r3 = (AnonymousClass4DU) this.A03;
                String str = ((C255773uh) this.A04).A0j;
                String str2 = this.A07;
                C22031Xty.A0H(r3, userSession, str, str2, "system_share_sheet", r14.A01());
                C46395DeI.A0W(userSession, r3, str, str2, "system_share_sheet", DbS.A0q(this.A05), (String) null);
                i = 962459576;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(-1084700062);
                DvF dvF = (DvF) obj2;
                int A033 = AnonymousClass0fD.A03(545109053);
                AnonymousClass2hV r4 = (AnonymousClass2hV) this.A04;
                String str = dvF.A00;
                if (str != null) {
                    r4.apply(str);
                    Hashtag hashtag = (Hashtag) this.A05;
                    if (hashtag.getId() != null && AnonymousClass7TE.A1a(this.A06)) {
                        UserSession userSession = (UserSession) this.A03;
                        AnonymousClass0iw r6 = (AnonymousClass0iw) this.A02;
                        String id = hashtag.getId();
                        String str2 = this.A07;
                        String str3 = dvF.A00;
                        if (str3 != null) {
                            C22031Xty.A0I(r6, userSession, id, "hashtag_page_overflow_menu", str2, str3);
                        }
                    }
                    AnonymousClass0fD.A0A(-245253284, A033);
                    i = 165530387;
                    break;
                }
                0qQ.A0F("hashtagUrl");
                throw AnonymousClass00P.createAndThrow();
            case 1:
                A032 = AnonymousClass0fD.A03(2000973272);
                C47354Dvo dvo = (C47354Dvo) obj2;
                int A034 = AnonymousClass0fD.A03(-1551224075);
                Bundle A0a = AnonymousClass7TE.A0a();
                A0a.putString("android.intent.extra.TEXT", dvo.A00);
                EWV ewv = (EWV) this.A04;
                switch (ewv.ordinal()) {
                    case 1:
                    case 4:
                    case 7:
                    case 10:
                    case 11:
                    case 14:
                        String str4 = ewv.A04;
                        String str5 = ewv.A03;
                        boolean z = ewv.A06;
                        C46395DeI.A0N((Context) this.A01, (Uri) null, A0a, (AnonymousClass0iw) this.A02, (0lg) this.A05, str4, str5, new C51638FxW(this, dvo, 5), false, z);
                        break;
                    case 2:
                        Context context = (Context) this.A01;
                        0nC.A00(context, dvo.A00);
                        C49118Eph.A00(context, (View) this.A06, (String) null, true);
                        break;
                    case 9:
                        C46395DeI.A0Q((Context) this.A01, A0a, (AnonymousClass0iw) this.A02, (0lg) this.A05, "share_to_system_sheet", new C51638FxW(this, dvo, 4));
                        break;
                    case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                        C49899FCc.A02((Context) this.A01, this.A07, dvo.A00);
                        break;
                }
                Runnable runnable = (Runnable) this.A03;
                if (runnable != null) {
                    runnable.run();
                }
                AnonymousClass0fD.A0A(77270794, A034);
                i = -1141626351;
                break;
            default:
                A032 = AnonymousClass0fD.A03(851837239);
                DvL dvL = (DvL) obj2;
                int A035 = AnonymousClass0fD.A03(-1675724820);
                Runnable runnable2 = (Runnable) this.A02;
                if (runnable2 != null) {
                    runnable2.run();
                }
                String str6 = dvL.A00;
                C255773uh r0 = (C255773uh) this.A04;
                String str7 = r0.A0j;
                String str8 = this.A07;
                User user = (User) this.A05;
                String id2 = user.getId();
                AnonymousClass4DU r7 = (AnonymousClass4DU) this.A03;
                UserSession userSession2 = (UserSession) this.A06;
                C46395DeI.A0W(userSession2, r7, str7, str8, "system_share_sheet", id2, str6);
                C46395DeI.A03((Activity) this.A01, DbX.A0D(str6), userSession2, r7, user, (String) null, "share_to_system_sheet", str6, r0.A0k, str7, str8, true, false);
                if (!AnonymousClass7TF.A0R(0Tu.A05, userSession2, 36323942876589693L).booleanValue()) {
                    C22031Xty.A0I(r7, userSession2, str7, str8, "system_share_sheet", str6);
                }
                AnonymousClass0fD.A0A(889679319, A035);
                i = -1072322573;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
