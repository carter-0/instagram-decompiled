package X;

import android.app.Activity;
import android.content.Context;
import android.graphics.RectF;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.TransparentModalActivity;
import com.instagram.model.venue.Venue;
import com.instagram.user.model.User;

public final class FT6 implements AnonymousClass2hV {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;
    public final boolean A06;

    public FT6(Object obj, Object obj2, Object obj3, Object obj4, String str, int i, boolean z) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj3;
        this.A03 = obj2;
        this.A04 = obj4;
        this.A05 = str;
        this.A06 = z;
    }

    public final Object apply(Object obj) {
        Object obj2 = obj;
        if (this.A00 != 0) {
            Context context = (Context) this.A01;
            UserSession userSession = (UserSession) this.A02;
            AnonymousClass0iw r4 = (AnonymousClass0iw) this.A03;
            Venue venue = (Venue) this.A04;
            String str = this.A05;
            boolean z = this.A06;
            String str2 = (String) obj2;
            new LT3(context, r4, userSession, new C50998Fml(r4, userSession, venue, str2, 2, z), str2, venue.A05(), context.getResources().getString(2131970997), str, (String) null, false).A04();
            return null;
        }
        UserSession userSession2 = (UserSession) this.A01;
        User user = (User) this.A02;
        Activity activity = (Activity) this.A03;
        AnonymousClass0iw r14 = (AnonymousClass0iw) this.A04;
        String str3 = this.A05;
        boolean z2 = this.A06;
        String str4 = (String) obj2;
        0Tu r5 = 0Tu.A05;
        if (182.A06(r5, userSession2, 36314859023502165L) || 182.A06(r5, userSession2, 36314859024485214L)) {
            EWD ewd = EWD.PROFILE_NAV_ICON;
            String username = user.getUsername();
            String fullName = user.getFullName();
            String A032 = AnonymousClass3VO.A03(user.getId());
            Bundle A002 = C343547qO.A00((RectF) null, ewd, false);
            A002.putString(AnonymousClass000.A00(988), username);
            A002.putString(AnonymousClass000.A00(987), fullName);
            A002.putString(AnonymousClass000.A00(989), A032);
            A002.putBoolean(C273654mx.A00(221), false);
            Dbb.A0i(activity, A002, userSession2, TransparentModalActivity.class, "nametag");
            return null;
        }
        new LT3(activity, r14, userSession2, new C50998Fml(user, userSession2, r14, str4, 0, z2), str4, AnonymousClass3VO.A03(user.getId()), activity.getResources().getString(2131970999), str3, (String) null, false).A04();
        return null;
    }
}
