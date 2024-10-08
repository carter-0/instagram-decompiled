package X;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import java.util.HashMap;

/* renamed from: X.EQh  reason: case insensitive filesystem */
public final class C47998EQh extends H4J {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ AnonymousClass0iw A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ Runnable A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47998EQh(Activity activity, 0hq r2, AnonymousClass0iw r3, UserSession userSession, Runnable runnable, String str, String str2, String str3, String str4, String str5, boolean z) {
        super(r2);
        this.A00 = activity;
        this.A05 = str;
        this.A01 = r3;
        this.A06 = str2;
        this.A07 = str3;
        this.A03 = runnable;
        this.A02 = userSession;
        this.A04 = str4;
        this.A08 = str5;
        this.A09 = z;
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int A032 = AnonymousClass0fD.A03(-365372267);
        int A033 = AnonymousClass0fD.A03(1848402552);
        String str = ((DvI) obj).A00;
        Activity activity = this.A00;
        String str2 = this.A05;
        AnonymousClass0iw r12 = this.A01;
        String str3 = this.A06;
        String str4 = this.A07;
        Runnable runnable = this.A03;
        Bundle A0D = DbX.A0D(str);
        boolean z = this.A09;
        String str5 = this.A04;
        UserSession userSession = this.A02;
        HashMap A0w = DbX.A0w(str);
        A0w.put("media_id", str2);
        A0w.put("share_surface", str5);
        String str6 = str3;
        String str7 = str4;
        UserSession userSession2 = userSession;
        AnonymousClass0iw r17 = r12;
        C46395DeI.A0N(activity, (Uri) null, A0D, r17, userSession2, str7, str6, A0w, false, z);
        runnable.run();
        C22031Xty.A0I(r12, userSession, str2, str5, this.A08, str);
        AnonymousClass0fD.A0A(-1292608091, A033);
        AnonymousClass0fD.A0A(-536166559, A032);
    }

    public final void onFail(C268654dm r10) {
        int A032 = AnonymousClass0fD.A03(-1733737449);
        C59689JTv.A0D(this.A00, "share_location_via_app_failed");
        C22031Xty.A0H(this.A01, this.A02, this.A05, this.A04, this.A08, r10.A01());
        AnonymousClass0fD.A0A(1434106108, A032);
    }
}
