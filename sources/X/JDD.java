package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;
import com.instagram.user.model.User;

public final class JDD extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ int A02;
    public final /* synthetic */ C335867df A03;
    public final /* synthetic */ C333777a7 A04;
    public final /* synthetic */ ImageUrl A05;
    public final /* synthetic */ FollowStatus A06;
    public final /* synthetic */ User A07;
    public final /* synthetic */ Long A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ 0sP A0A;
    public final /* synthetic */ 0sP A0B;
    public final /* synthetic */ 0sK A0C;
    public final /* synthetic */ boolean A0D;
    public final /* synthetic */ boolean A0E;
    public final /* synthetic */ boolean A0F;
    public final /* synthetic */ boolean A0G;
    public final /* synthetic */ boolean A0H;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JDD(C335867df r2, C333777a7 r3, ImageUrl imageUrl, FollowStatus followStatus, User user, Long l, String str, 0sP r9, 0sP r10, 0sK r11, int i, int i2, int i3, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        super(2);
        this.A08 = l;
        this.A07 = user;
        this.A09 = str;
        this.A05 = imageUrl;
        this.A0H = z;
        this.A0F = z2;
        this.A0D = z3;
        this.A0E = z4;
        this.A0A = r9;
        this.A0C = r11;
        this.A04 = r3;
        this.A0G = z5;
        this.A0B = r10;
        this.A06 = followStatus;
        this.A03 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A02 = i3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        Long l = this.A08;
        User user = this.A07;
        String str = this.A09;
        ImageUrl imageUrl = this.A05;
        boolean z = this.A0H;
        boolean z2 = this.A0F;
        boolean z3 = this.A0D;
        boolean z4 = this.A0E;
        0sP r7 = this.A0A;
        0sK r6 = this.A0C;
        C333777a7 r5 = this.A04;
        boolean z5 = this.A0G;
        0sP r3 = this.A0B;
        FollowStatus followStatus = this.A06;
        C335867df r1 = this.A03;
        0sK r26 = r6;
        0sP r24 = r7;
        0sP r25 = r3;
        Long l2 = l;
        String str2 = str;
        FollowStatus followStatus2 = followStatus;
        User user2 = user;
        C333777a7 r18 = r5;
        ImageUrl imageUrl2 = imageUrl;
        C335867df r17 = r1;
        C54873HWg.A00(A0R, r17, r18, imageUrl2, followStatus2, user2, l2, str2, r24, r25, r26, C51966G9m.A01(this.A00), C301445zH.A00(this.A01), this.A02, z, z2, z3, z4, z5);
        return C60340gF.A00;
    }
}
