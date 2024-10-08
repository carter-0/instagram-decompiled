package X;

import android.content.Context;
import android.view.View;
import androidx.cardview.widget.CardView;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.model.reels.Reel;
import com.instagram.model.reels.ReelType;
import com.instagram.user.model.FollowStatus;
import java.util.List;

/* renamed from: X.Iy2  reason: case insensitive filesystem */
public final class C58817Iy2 extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58817Iy2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, boolean z) {
        super(1);
        this.A00 = i;
        this.A06 = obj;
        this.A05 = obj2;
        this.A08 = z;
        this.A01 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A04 = obj6;
        this.A07 = obj7;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C305006Gb r14 = (C305006Gb) obj2;
                0qQ.A0B(r14, 0);
                List list = (List) this.A07;
                Object obj3 = this.A05;
                boolean z = this.A08;
                Object obj4 = this.A03;
                Object obj5 = this.A01;
                Object obj6 = this.A06;
                Object obj7 = this.A04;
                Object obj8 = this.A02;
                r14.CfA((0sP) null, new MP4(list, 19), AnonymousClass5PI.A03(new C59440JJp(list, obj3, obj5, obj4, obj8, obj7, obj6, 0, z), -1091073711), list.size());
                break;
            case 1:
                0qQ.A0B(obj2, 0);
                if (!this.A08) {
                    int indexOf = ((List) this.A05).indexOf(obj2);
                    C51967G9n.A0w(indexOf, (0sP) this.A02);
                    C55647Hl6 hl6 = (C55647Hl6) this.A04;
                    AnonymousClass7TE.A1Z(new C66164MGb(hl6, (AnonymousClass4D7) null, indexOf, 26), (C262224Cq) this.A03);
                    int A032 = hl6.A00.A03();
                    String str = ((C47183Dry) this.A06).A05.A05;
                    I7S.A0B((AnonymousClass0iw) this.A01, (UserSession) this.A07, str, "tap", A032);
                    break;
                }
                break;
            case 2:
                JP8 jp8 = (JP8) obj2;
                0qQ.A0B(jp8, 0);
                C61064Jw2 jw2 = (C61064Jw2) this.A06;
                List list2 = (List) jw2.A00;
                Object obj9 = this.A05;
                boolean z2 = this.A08;
                Object obj10 = this.A01;
                Object obj11 = this.A03;
                Object obj12 = this.A02;
                Object obj13 = this.A04;
                Object obj14 = this.A07;
                int size = list2.size();
                jp8.CfC((0sP) null, new G4S(list2, 0), (0sL) null, AnonymousClass5PI.A04(new C59440JJp(list2, obj9, obj10, obj11, obj12, obj13, obj14, 1, z2), 1229287273, true), size);
                if (jw2.A01 == C62520KhB.Loading) {
                    jp8.Cf5(AnonymousClass7TG.A0m(obj9, "loading", AnonymousClass7TE.A1A()), (Object) null, J4D.A00, C55349HgH.A00);
                    break;
                }
                break;
            case 3:
                FollowStatus followStatus = (FollowStatus) obj2;
                0qQ.A0B(followStatus, 0);
                Context context = (Context) this.A02;
                CardView cardView = (CardView) this.A03;
                C2806352u.A00(context, cardView, (IgImageView) this.A04, followStatus);
                Reel reel = (Reel) this.A06;
                if (reel.A0P == ReelType.A0i && followStatus == FollowStatus.A05) {
                    reel.A0P = ReelType.A0n;
                }
                0qQ.A0A(context);
                if (followStatus == FollowStatus.A07) {
                    C59689JTv.A07(context, 2131962625);
                }
                ((View) this.A01).postDelayed(new C57979IjY(context, cardView, reel, (C230242pG) this.A07, (AnonymousClass3N9) this.A05, this.A08), 1000);
                break;
            default:
                C305006Gb A0L = C51968G9o.A0L(obj2);
                List list3 = (List) this.A07;
                J4T j4t = J4T.A00;
                Object obj15 = this.A05;
                Object obj16 = this.A03;
                Object obj17 = this.A01;
                Object obj18 = this.A02;
                Object obj19 = this.A04;
                Object obj20 = this.A06;
                J4U j4u = J4U.A00;
                int size2 = list3.size();
                C51967G9n.A12(A0L, new C59437JJm(2, obj20, obj15, list3, obj18, obj16, obj17, obj19), new C74186PqS(34, list3, (0sP) j4t), new C74186PqS(35, list3, (0sP) j4u), size2);
                if (this.A08) {
                    A0L.Cf4((Object) null, C55353HgL.A00);
                    break;
                }
                break;
        }
        return C60340gF.A00;
    }
}
