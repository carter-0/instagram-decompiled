package X;

import com.instagram.common.session.UserSession;
import com.instagram.feed.ui.state.IntentAwareAdPivotState;
import java.util.List;

/* renamed from: X.Ixt  reason: case insensitive filesystem */
public final class C58808Ixt extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58808Ixt(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i, int i2) {
        super(1);
        this.A00 = i2;
        this.A07 = obj;
        this.A05 = obj2;
        this.A01 = i;
        this.A04 = obj3;
        this.A06 = obj4;
        this.A02 = obj5;
        this.A03 = obj6;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        int i;
        C230282pK r3;
        C54077Gz1 gz1;
        IntentAwareAdPivotState intentAwareAdPivotState;
        Integer num;
        switch (this.A00) {
            case 0:
                C305006Gb r14 = (C305006Gb) obj;
                0qQ.A0B(r14, 0);
                C53295Glh glh = (C53295Glh) this.A07;
                if (glh.A06) {
                    int i2 = this.A01;
                    C51967G9n.A11(r14, new C59366JGs((C284945Oz) this.A06, (C284945Oz) this.A02, glh, (0sL) this.A04, i2), (Object) null, -666838915);
                }
                Object obj2 = this.A03;
                C51967G9n.A11(r14, new JHG(this.A01, 0, glh, this.A02, this.A06, obj2, this.A04), (Object) null, -1645033886);
                C53373Gn3 gn3 = (C53373Gn3) this.A05;
                if (gn3.A04) {
                    HZ8.A00(r14, (C59500JLy) gn3.A03, (C54617HLa) gn3.A02, gn3.A01);
                    break;
                }
                break;
            case 2:
            case 3:
                i = this.A01;
                ((C227802jw) this.A04).A0K((1Xj) this.A02, (AnonymousClass3W1) this.A07, i);
                r3 = (C230282pK) this.A05;
                gz1 = (C54077Gz1) this.A03;
                intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                num = AnonymousClass05K.A0C;
                break;
            case 5:
                C305006Gb A0L = C51968G9o.A0L(obj);
                List list = (List) this.A03;
                J46 j46 = J46.A00;
                J47 j47 = J47.A00;
                int i3 = this.A01;
                C284945Oz r7 = (C284945Oz) this.A02;
                UserSession userSession = (UserSession) this.A07;
                int size = list.size();
                C51967G9n.A12(A0L, new C59430JJf(r7, userSession, list, (0sP) this.A05, (0sP) this.A04, i3), new MPB(40, list, (0sP) j46), new MPB(41, list, (0sP) j47), size);
                if (this.A06 == C62520KhB.Loading) {
                    A0L.Cf3("loadingindicator", (Object) null, C55348HgG.A00);
                    break;
                }
                break;
            default:
                i = this.A01;
                ((C227802jw) this.A04).A0J((1Xj) this.A02, (AnonymousClass3W1) this.A07, i);
                r3 = (C230282pK) this.A05;
                gz1 = (C54077Gz1) this.A03;
                intentAwareAdPivotState = (IntentAwareAdPivotState) this.A06;
                num = AnonymousClass05K.A0N;
                break;
        }
        r3.A0F(intentAwareAdPivotState, gz1, num, i);
        return C60340gF.A00;
    }
}
