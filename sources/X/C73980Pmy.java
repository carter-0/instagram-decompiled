package X;

import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.gifs.DirectAnimatedMedia;
import com.instagram.model.mediasize.ExtendedImageUrl;

/* renamed from: X.Pmy  reason: case insensitive filesystem */
public final class C73980Pmy extends 0Yg implements 0sP {
    public final int A00;
    public final long A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final String A06;
    public final String A07;
    public final String A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73980Pmy(Object obj, Object obj2, Object obj3, Object obj4, String str, String str2, String str3, int i, long j) {
        super(1);
        this.A00 = i;
        this.A04 = obj;
        this.A05 = obj2;
        this.A01 = j;
        this.A03 = obj3;
        this.A08 = str;
        this.A07 = str2;
        this.A02 = obj4;
        this.A06 = str3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i = this.A00;
        C254783t2 r15 = (C254783t2) obj;
        DirectShareTarget directShareTarget = (DirectShareTarget) this.A04;
        boolean z = r15 instanceof AnonymousClass9HR;
        if (i != 0) {
            if (z) {
                directShareTarget = C66584MXp.A0P((0lg) this.A05, directShareTarget, r15);
            }
            UserSession userSession = (UserSession) this.A05;
            DirectThreadKey BJy = 1bJ.A00(userSession).BYf(directShareTarget).BJz();
            C333547Zj A002 = OXC.A00(userSession, DbS.A0c(directShareTarget));
            long j = this.A01;
            A002.EMB((C317966o8) this.A03, BJy, (ExtendedImageUrl) this.A02, this.A08, this.A07, this.A06, j);
            C3018660j.A01(userSession).A0E(C69506Nmo.A0V, (GT1) null, (HOK) null, Boolean.valueOf(z), AnonymousClass7TE.A0v(), (Long) null, (String) null, (String) null);
            return C60340gF.A00;
        }
        if (z) {
            directShareTarget = C66584MXp.A0P((0lg) this.A05, directShareTarget, r15);
        }
        UserSession userSession2 = (UserSession) this.A05;
        DirectThreadKey BJy2 = 1bJ.A00(userSession2).BYf(directShareTarget).BJz();
        C333547Zj A003 = OXC.A00(userSession2, DbS.A0c(directShareTarget));
        C254783t2 A0c = DbS.A0c(directShareTarget);
        long j2 = this.A01;
        A003.EMA(BJy2, (DirectAnimatedMedia) this.A02, A0c, (ExtendedImageUrl) this.A03, this.A08, this.A07, this.A06, j2);
        C3018660j.A01(userSession2).A0E(C69506Nmo.A0V, (GT1) null, (HOK) null, Boolean.valueOf(z), AnonymousClass7TE.A0v(), (Long) null, (String) null, (String) null);
        return C60340gF.A00;
    }
}
