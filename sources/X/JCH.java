package X;

import com.instagram.common.typedurl.ImageUrl;
import com.instagram.user.model.FollowStatus;

public final class JCH extends 0Yg implements 0sL {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ImageUrl A02;
    public final /* synthetic */ FollowStatus A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ C62320sa A07;
    public final /* synthetic */ C62320sa A08;
    public final /* synthetic */ 0sP A09;
    public final /* synthetic */ boolean A0A;
    public final /* synthetic */ boolean A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public JCH(ImageUrl imageUrl, FollowStatus followStatus, String str, String str2, String str3, C62320sa r7, C62320sa r8, 0sP r9, int i, int i2, boolean z, boolean z2, boolean z3) {
        super(2);
        this.A02 = imageUrl;
        this.A05 = str;
        this.A06 = str2;
        this.A04 = str3;
        this.A0A = z;
        this.A03 = followStatus;
        this.A0B = z2;
        this.A0C = z3;
        this.A09 = r9;
        this.A08 = r7;
        this.A07 = r8;
        this.A00 = i;
        this.A01 = i2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        ImageUrl imageUrl = this.A02;
        String str = this.A05;
        String str2 = this.A06;
        String str3 = this.A04;
        boolean z = this.A0A;
        FollowStatus followStatus = this.A03;
        boolean z2 = this.A0B;
        boolean z3 = this.A0C;
        C56670I6z.A04(A0R, imageUrl, followStatus, str, str2, str3, this.A08, this.A07, this.A09, C51966G9m.A01(this.A00), C301445zH.A00(this.A01), z, z2, z3);
        return C60340gF.A00;
    }
}
