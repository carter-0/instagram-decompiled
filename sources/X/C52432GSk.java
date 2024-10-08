package X;

import android.content.Context;
import android.os.Bundle;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.profile.intf.UserDetailLaunchConfig;
import com.instagram.user.model.User;

/* renamed from: X.GSk  reason: case insensitive filesystem */
public final class C52432GSk extends C48203Eaj {
    public AnonymousClass32N A00;
    public String A01;
    public final int A02;
    public final Context A03;
    public final Bundle A04;
    public final FragmentActivity A05;
    public final UserSession A06;
    public final 2el A07;
    public final 1Xl A08;
    public final AnonymousClass4DU A09;
    public final UserDetailLaunchConfig A0A;
    public final User A0B;
    public final String A0C;
    public final AnonymousClass0iw A0D;

    public final String A00() {
        String str = this.A01;
        if (str != null) {
            return str;
        }
        0qQ.A0F("sessionId");
        throw AnonymousClass00P.createAndThrow();
    }

    public C52432GSk(Context context, Bundle bundle, FragmentActivity fragmentActivity, AnonymousClass0iw r5, UserSession userSession, 2el r7, 1Xl r8, AnonymousClass4DU r9, UserDetailLaunchConfig userDetailLaunchConfig, User user, String str, int i) {
        AnonymousClass7TG.A1O(userSession, userDetailLaunchConfig);
        0qQ.A0B(r7, 8);
        this.A06 = userSession;
        this.A0A = userDetailLaunchConfig;
        this.A0B = user;
        this.A0D = r5;
        this.A04 = bundle;
        this.A05 = fragmentActivity;
        this.A03 = context;
        this.A07 = r7;
        this.A09 = r9;
        this.A08 = r8;
        this.A02 = i;
        this.A0C = str;
    }
}
