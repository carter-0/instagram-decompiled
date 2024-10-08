package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.EQm  reason: case insensitive filesystem */
public final class C48003EQm extends H4J {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48003EQm(0hq r1, Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, int i) {
        super(r1);
        this.A00 = i;
        this.A04 = obj4;
        this.A02 = obj3;
        this.A05 = str;
        this.A06 = str2;
        this.A01 = obj;
        this.A03 = obj2;
    }

    public final void onFail(C268654dm r10) {
        int A032;
        int i;
        switch (this.A00) {
            case 0:
                A032 = AnonymousClass0fD.A03(1368682467);
                C59689JTv.A0D((Context) this.A01, "fetch_audio_permalink_failed");
                C22031Xty.A0H((AnonymousClass0iw) this.A02, (0lg) this.A04, this.A05, this.A06, "copy_link", r10.A01());
                i = 1515607519;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(1184322247);
                ((Runnable) this.A02).run();
                C22031Xty.A0H((AnonymousClass0iw) this.A01, (0lg) this.A04, this.A05, this.A06, "system_share_sheet", r10.A01());
                C59689JTv.A0D(DbT.A08(this.A03), "share_audio_failed");
                i = 423525748;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(-1014532926);
                C22031Xty.A0H((AnonymousClass0iw) this.A01, (0lg) this.A04, this.A06, this.A05, "system_share_sheet", r10.A01());
                C59689JTv.A0D(DbT.A08(this.A03), "share_location_failed");
                i = 1365603075;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-775630613);
                UserSession userSession = (UserSession) this.A04;
                AnonymousClass0iw r2 = (AnonymousClass0iw) this.A02;
                String str = this.A06;
                C22031Xty.A0H(r2, userSession, str, "live_action_sheet", "system_share_sheet", r10.A01());
                C46395DeI.A0V(r2, userSession, str, "live_action_sheet", "system_share_sheet", DbS.A0q(this.A03), (String) null);
                i = -29192741;
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
                A032 = AnonymousClass0fD.A03(2126780645);
                DvD dvD = (DvD) obj2;
                int A033 = AnonymousClass0fD.A03(460352540);
                C22031Xty.A0I((AnonymousClass0iw) this.A02, (UserSession) this.A04, this.A05, this.A06, "copy_link", dvD.A00);
                Context context = (Context) this.A01;
                0nC.A00(context, dvD.A00);
                C49118Eph.A00(context, (View) this.A03, (String) null, true);
                AnonymousClass0fD.A0A(1925248999, A033);
                i = 188875909;
                break;
            case 1:
                A032 = AnonymousClass0fD.A03(1370070003);
                int A034 = AnonymousClass0fD.A03(-1401292902);
                Bundle A0a = AnonymousClass7TE.A0a();
                String str = ((DvD) obj2).A00;
                A0a.putString("android.intent.extra.TEXT", str);
                FragmentActivity A0E = DbZ.A0E(this.A03);
                String str2 = this.A05;
                String str3 = this.A06;
                AnonymousClass0iw r7 = (AnonymousClass0iw) this.A01;
                UserSession userSession = (UserSession) this.A04;
                HashMap A0w = DbX.A0w(str);
                A0w.put("audio_id", str2);
                A0w.put("share_surface", str3);
                C46395DeI.A0Q(A0E, A0a, r7, userSession, "share_to_system_sheet", A0w);
                if (!AnonymousClass7TF.A0R(0Tu.A05, userSession, 36323942876589693L).booleanValue()) {
                    C22031Xty.A0I(r7, userSession, str2, str3, "system_share_sheet", str);
                }
                ((Runnable) this.A02).run();
                AnonymousClass0fD.A0A(-1738576255, A034);
                i = -287398885;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(-354754076);
                DvI dvI = (DvI) obj2;
                int A035 = AnonymousClass0fD.A03(62571055);
                Bundle A0a2 = AnonymousClass7TE.A0a();
                A0a2.putString("android.intent.extra.TEXT", dvI.A00);
                String str4 = dvI.A00;
                FragmentActivity A0E2 = DbZ.A0E(this.A03);
                String str5 = this.A06;
                String str6 = this.A05;
                AnonymousClass0iw r72 = (AnonymousClass0iw) this.A01;
                UserSession userSession2 = (UserSession) this.A04;
                HashMap A0w2 = DbX.A0w(str4);
                A0w2.put("media_id", str5);
                A0w2.put("share_surface", str6);
                C46395DeI.A0Q(A0E2, A0a2, r72, userSession2, "share_to_system_sheet", A0w2);
                C22031Xty.A0I(r72, userSession2, str5, str6, "system_share_sheet", str4);
                Runnable runnable = (Runnable) this.A02;
                if (runnable != null) {
                    runnable.run();
                }
                AnonymousClass0fD.A0A(-1566380505, A035);
                i = -996092644;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-815528938);
                int A036 = AnonymousClass0fD.A03(-963799030);
                String str7 = ((DvH) obj2).A00;
                String str8 = this.A06;
                User user = (User) this.A03;
                String id = user.getId();
                AnonymousClass0iw r6 = (AnonymousClass0iw) this.A02;
                UserSession userSession3 = (UserSession) this.A04;
                C46395DeI.A0V(r6, userSession3, str8, "live_action_sheet", "system_share_sheet", id, str7);
                C46395DeI.A02((Activity) this.A01, DbX.A0D(str7), r6, userSession3, user, (String) null, "share_to_system_sheet", str7, this.A05, "live_action_sheet", true, false);
                C22031Xty.A0I(r6, userSession3, str8, "live_action_sheet", "system_share_sheet", str7);
                AnonymousClass0fD.A0A(-186195835, A036);
                i = -66452076;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C48003EQm(Fragment fragment, 0hq r2, AnonymousClass0iw r3, UserSession userSession, Runnable runnable, String str, String str2, int i) {
        super(r2);
        this.A00 = i;
        if (1 - i != 0) {
            this.A04 = userSession;
            this.A01 = r3;
            this.A06 = str;
            this.A05 = str2;
            this.A03 = fragment;
        } else {
            this.A03 = fragment;
            this.A05 = str;
            this.A06 = str2;
            this.A01 = r3;
            this.A04 = userSession;
        }
        this.A02 = runnable;
    }
}
