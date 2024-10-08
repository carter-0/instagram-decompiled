package X;

import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.mediasize.ExtendedImageUrl;
import com.instagram.user.model.User;

/* renamed from: X.Pmt  reason: case insensitive filesystem */
public final class C73975Pmt extends 0Yg implements 0sP {
    public final /* synthetic */ long A00;
    public final /* synthetic */ UserSession A01;
    public final /* synthetic */ DirectShareTarget A02;
    public final /* synthetic */ ExtendedImageUrl A03;
    public final /* synthetic */ User A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ boolean A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73975Pmt(UserSession userSession, DirectShareTarget directShareTarget, ExtendedImageUrl extendedImageUrl, User user, String str, String str2, long j, boolean z) {
        super(1);
        this.A02 = directShareTarget;
        this.A01 = userSession;
        this.A00 = j;
        this.A05 = str;
        this.A06 = str2;
        this.A03 = extendedImageUrl;
        this.A04 = user;
        this.A07 = z;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        C254783t2 r1 = (C254783t2) obj;
        DirectShareTarget directShareTarget = this.A02;
        if (r1 instanceof AnonymousClass9HR) {
            directShareTarget = C66584MXp.A0P(this.A01, directShareTarget, r1);
        }
        C333547Zj A002 = OXC.A00(this.A01, DbS.A0c(directShareTarget));
        long j = this.A00;
        A002.EMC((ImageUrl) null, directShareTarget, this.A03, this.A04, "", this.A05, this.A06, "", (String) null, (String) null, (String) null, j, this.A07);
        return C60340gF.A00;
    }
}
