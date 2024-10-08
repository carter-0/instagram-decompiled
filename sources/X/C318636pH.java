package X;

import android.view.View;
import com.instagram.profile.intf.UserDetailEntryInfo;
import com.instagram.user.follow.FollowButton;

/* renamed from: X.6pH  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C318636pH implements View.OnClickListener {
    public final /* synthetic */ 1Xj A00;
    public final /* synthetic */ AnonymousClass710 A01;
    public final /* synthetic */ UserDetailEntryInfo A02;
    public final /* synthetic */ FollowButton A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;

    public /* synthetic */ C318636pH(1Xj r1, AnonymousClass710 r2, UserDetailEntryInfo userDetailEntryInfo, FollowButton followButton, String str, String str2, String str3, String str4) {
        this.A01 = r2;
        this.A03 = followButton;
        this.A04 = str;
        this.A00 = r1;
        this.A05 = str2;
        this.A06 = str3;
        this.A02 = userDetailEntryInfo;
        this.A07 = str4;
    }

    public final void onClick(View view) {
        AnonymousClass710 r0 = this.A01;
        FollowButton followButton = this.A03;
        String str = this.A04;
        1Xj r1 = this.A00;
        String str2 = this.A05;
        String str3 = this.A06;
        UserDetailEntryInfo userDetailEntryInfo = this.A02;
        String str4 = this.A07;
        if (r0 != null) {
            r0.D2a(r1, userDetailEntryInfo, followButton, str, str2, str3, str4);
        }
    }
}
