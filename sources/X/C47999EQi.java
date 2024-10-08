package X;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.EQi  reason: case insensitive filesystem */
public final class C47999EQi extends H4J {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;
    public final String A09;
    public final String A0A;
    public final boolean A0B;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47999EQi(0hq r1, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, String str, String str2, String str3, String str4, String str5, int i, boolean z) {
        super(r1);
        this.A00 = i;
        this.A09 = str;
        this.A08 = str2;
        this.A0B = z;
        this.A01 = obj;
        this.A06 = str3;
        this.A07 = str4;
        this.A02 = obj3;
        this.A05 = obj4;
        this.A03 = obj5;
        this.A0A = str5;
        this.A04 = obj2;
    }

    public final void onFail(C268654dm r16) {
        int A032;
        int i;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(-25309798);
            ((Runnable) this.A03).run();
            C22031Xty.A0H((AnonymousClass0iw) this.A02, (0lg) this.A05, this.A06, this.A07, this.A0A, r16.A01());
            C59689JTv.A0D((Context) this.A04, "share_audio_via_app_failed");
            i = -704915296;
        } else {
            A032 = AnonymousClass0fD.A03(-1339151944);
            User user = (User) this.A04;
            UserSession userSession = (UserSession) this.A05;
            boolean z = this.A0B;
            String str = this.A06;
            AnonymousClass0iw r3 = (AnonymousClass0iw) this.A02;
            String str2 = this.A07;
            String str3 = this.A08;
            String str4 = this.A09;
            Throwable A012 = r16.A01();
            C46395DeI.A0L((Activity) this.A01, r3, userSession, user, (Runnable) this.A03, DbY.A0i(user), str, str2, str3, z);
            C22031Xty.A0H(r3, userSession, user.getId(), str, str4, A012);
            i = -795070774;
        }
        AnonymousClass0fD.A0A(i, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032;
        int i;
        Object obj2 = obj;
        if (this.A00 != 0) {
            A032 = AnonymousClass0fD.A03(798481295);
            int A033 = AnonymousClass0fD.A03(1815145838);
            String str = ((DvD) obj2).A00;
            Bundle A0D = DbX.A0D(str);
            String str2 = this.A09;
            String str3 = this.A08;
            boolean z = this.A0B;
            String str4 = this.A06;
            String str5 = this.A07;
            AnonymousClass0iw r11 = (AnonymousClass0iw) this.A02;
            UserSession userSession = (UserSession) this.A05;
            HashMap A0w = DbX.A0w(str);
            A0w.put("audio_id", str4);
            A0w.put("share_surface", str5);
            C46395DeI.A0N((Context) this.A01, (Uri) null, A0D, r11, userSession, str2, str3, A0w, false, z);
            ((Runnable) this.A03).run();
            C22031Xty.A0I(r11, userSession, str4, str5, this.A0A, str);
            AnonymousClass0fD.A0A(1579579407, A033);
            i = 789832377;
        } else {
            A032 = AnonymousClass0fD.A03(-893951443);
            int A034 = AnonymousClass0fD.A03(-1638197918);
            String str6 = ((DvK) obj2).A00;
            User user = (User) this.A04;
            UserSession userSession2 = (UserSession) this.A05;
            boolean z2 = this.A0B;
            String str7 = this.A06;
            AnonymousClass0iw r4 = (AnonymousClass0iw) this.A02;
            C46395DeI.A0L((Activity) this.A01, r4, userSession2, user, (Runnable) this.A03, str6, str7, this.A07, this.A08, z2);
            C22031Xty.A0K(r4, userSession2, user.getId(), str7, this.A09, str6, (String) null, (String) null, this.A0A);
            AnonymousClass0fD.A0A(1750018845, A034);
            i = -2110289205;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
