package X;

import android.app.Activity;
import android.content.res.Resources;
import com.instagram.common.notifications.push.intf.PushChannelType;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.reels.Reel;

public final class KAV extends 1P0 {
    public final /* synthetic */ Activity A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ Reel A02;
    public final /* synthetic */ AnonymousClass6ST A03;
    public final /* synthetic */ L7T A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ boolean A07;

    public KAV(Activity activity, 1Xj r2, Reel reel, AnonymousClass6ST r4, L7T l7t, String str, C62320sa r7, boolean z) {
        this.A00 = activity;
        this.A07 = z;
        this.A03 = r4;
        this.A01 = r2;
        this.A05 = str;
        this.A04 = l7t;
        this.A02 = reel;
        this.A06 = r7;
    }

    public final void onFail(C268654dm r6) {
        int A032 = AnonymousClass0fD.A03(-170535485);
        this.A03.dismiss();
        Activity activity = this.A00;
        C59689JTv.A03(activity, activity.getString(2131975944), "UpdateHighlight_unknown_error_occured", 0);
        this.A06.invoke();
        AnonymousClass0fD.A0A(-1597931122, A032);
    }

    public final void onStart() {
        int A032 = AnonymousClass0fD.A03(661700011);
        KAV.super.onStart();
        Activity activity = this.A00;
        int i = 2131972144;
        if (this.A07) {
            i = 2131952464;
        }
        String A16 = AnonymousClass7TE.A16(activity, i);
        AnonymousClass6ST r0 = this.A03;
        r0.A00(A16);
        AnonymousClass0fN.A00(r0);
        AnonymousClass0fD.A0A(848993637, A032);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        int i;
        String str;
        int A032 = AnonymousClass0fD.A03(-1715663740);
        K14 k14 = (K14) obj;
        int A0D = AnonymousClass7TG.A0D(k14, -1104020667);
        this.A03.dismiss();
        boolean z = this.A07;
        1Xj r1 = this.A01;
        String str2 = this.A05;
        if (z) {
            r1.A4E(str2);
            i = 2131964348;
        } else {
            r1.A4F(str2);
            i = 2131964349;
        }
        AnonymousClass3HX r2 = k14.A00;
        if (r2 != null) {
            L7T l7t = this.A04;
            l7t.A00.A05(new AnonymousClass376(1OP.A05(l7t.A01).A0I(r2, true)));
        }
        L7T l7t2 = this.A04;
        Activity activity = this.A00;
        Resources resources = activity.getResources();
        Reel reel = this.A02;
        ImageUrl imageUrl = null;
        if (reel != null) {
            str = reel.A0r;
        } else {
            str = null;
        }
        String A0e = AnonymousClass7TF.A0e(resources, str, i);
        if (reel != null) {
            imageUrl = reel.A07();
        }
        C50500Fcm fcm = new C50500Fcm(1, activity, l7t2);
        2MD A012 = 2MD.A01();
        OIS A002 = OU0.A00(l7t2.A01.A06);
        A002.A0G = AnonymousClass000.A00(297);
        A002.A04 = imageUrl;
        A002.A0H = A0e;
        A002.A03 = PushChannelType.LOCAL;
        A002.A08 = fcm;
        JTT.A1O(A002, A012);
        this.A06.invoke();
        AnonymousClass0fD.A0A(347206670, A0D);
        AnonymousClass0fD.A0A(-1876581784, A032);
    }
}
