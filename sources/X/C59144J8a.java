package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.api.schemas.IntegrityInterstitialType;
import com.instagram.common.session.UserSession;
import com.instagram.creator.achievements.modules.models.Badge;
import java.util.List;

/* renamed from: X.J8a  reason: case insensitive filesystem */
public final class C59144J8a extends 0Yg implements 0sL {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59144J8a(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        super(2);
        this.A00 = i2;
        this.A02 = obj;
        this.A04 = obj2;
        this.A03 = obj3;
        this.A05 = str;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        int i = this.A00;
        C286575Wy A0R = C51966G9m.A0R(obj, obj2);
        switch (i) {
            case 0:
                C54777HSk.A00(A0R, this.A05, (0sP) this.A04, (0sL) this.A03, (AnonymousClass62P) this.A02, C51966G9m.A01(this.A01));
                break;
            case 1:
                String str = this.A05;
                C54784HSr.A00(A0R, (C61014JvE) this.A04, (C62626Kix) this.A03, str, (0sP) this.A02, C51966G9m.A01(this.A01));
                break;
            case 2:
                C54848HVf.A00(A0R, (IntegrityInterstitialType) this.A02, this.A05, (C62320sa) this.A04, (C62320sa) this.A03, C51966G9m.A01(this.A01));
                break;
            case 3:
                C62320sa r4 = (C62320sa) this.A04;
                C54853HVk.A00(A0R, this.A05, (C62320sa) this.A03, r4, (0sP) this.A02, C51966G9m.A01(this.A01));
                break;
            case 4:
                UserSession userSession = (UserSession) this.A04;
                C54935HYr.A00(A0R, (FragmentActivity) this.A03, userSession, (Badge) this.A02, this.A05, C51966G9m.A01(this.A01));
                break;
            case 5:
                UserSession userSession2 = (UserSession) this.A04;
                C54938HYu.A00(A0R, (FragmentActivity) this.A03, userSession2, this.A05, (List) this.A02, C51966G9m.A01(this.A01));
                break;
            default:
                C55133Hch.A00(A0R, this.A05, (C62320sa) this.A04, (C62320sa) this.A02, (C62320sa) this.A03, C51966G9m.A01(this.A01));
                break;
        }
        return C60340gF.A00;
    }
}
