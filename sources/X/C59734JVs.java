package X;

import android.graphics.Rect;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.user.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JVs  reason: case insensitive filesystem */
public final class C59734JVs extends AnonymousClass1Ek implements 0sJ {
    public Object A00;
    public Object A01;
    public boolean A02;
    public boolean A03;
    public final int A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59734JVs(Object obj, AnonymousClass4D7 r3, int i) {
        super(4, r3);
        this.A04 = i;
        this.A01 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        C59734JVs jVs;
        boolean z;
        switch (this.A04) {
            case 0:
                boolean A1a = AnonymousClass7TE.A1a(obj2);
                z = AnonymousClass7TE.A1a(obj3);
                jVs = new C59734JVs(this.A01, (AnonymousClass4D7) obj4, 0);
                jVs.A00 = obj;
                jVs.A02 = A1a;
                break;
            case 1:
                boolean A1a2 = AnonymousClass7TE.A1a(obj);
                z = AnonymousClass7TE.A1a(obj3);
                jVs = new C59734JVs(this.A01, (AnonymousClass4D7) obj4, 1);
                jVs.A02 = A1a2;
                jVs.A00 = obj2;
                break;
            default:
                boolean A1a3 = AnonymousClass7TE.A1a(obj);
                boolean A1a4 = AnonymousClass7TE.A1a(obj2);
                jVs = new C59734JVs((LES) this.A00, (AnonymousClass4D7) obj4);
                jVs.A02 = A1a3;
                jVs.A03 = A1a4;
                jVs.A01 = obj3;
                break;
        }
        jVs.A03 = z;
        return jVs.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        boolean z2;
        AnonymousClass3NV r1;
        switch (this.A04) {
            case 0:
                0eS.A00(obj);
                List<C61073JwB> list = (List) this.A00;
                boolean z3 = this.A02;
                boolean z4 = this.A03;
                UserSession userSession = ((C60316JjJ) this.A01).A01;
                boolean A012 = C71041OaE.A01(userSession);
                ArrayList A1C = AnonymousClass7TE.A1C();
                if (!A012) {
                    User A022 = 17h.A00(userSession).A02(userSession.A06);
                    if (A022 == null) {
                        A022 = AnonymousClass7TF.A0Q(userSession);
                    }
                    if (182.A06(0Tu.A05, userSession, 36322993690323679L) && !A022.A2O()) {
                        A1C.add(new C61070Jw8((C266444Yx) DbS.A0Q(new Object[0], 2131952741), (C266444Yx) DbS.A0Q(new Object[0], 2131952715), (ImageUrl) new SimpleImageUrl(AnonymousClass7TF.A0Q(userSession).Bh3()), AnonymousClass000.A00(2946)));
                    }
                }
                for (C61073JwB jwB : list) {
                    A1C.add(new C61070Jw8((C266444Yx) JUH.A00(jwB.A03), (C266444Yx) JUH.A00(jwB.A01), (ImageUrl) new SimpleImageUrl((ImageUrl) ((QP8) 00k.A0I((List) jwB.A00)).A00), jwB.A02));
                }
                return new C61060Jvy((List) A1C, z4, z3, A012);
            case 1:
                0eS.A00(obj);
                boolean z5 = this.A02;
                Rect rect = (Rect) this.A00;
                boolean z6 = this.A03;
                if (z5 && z6 && rect != null) {
                    AnonymousClass8B2 r12 = (AnonymousClass8B2) this.A01;
                    if (!r12.A01 || (r12.A02 && rect.top == 0)) {
                        z = true;
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            default:
                0eS.A00(obj);
                boolean z7 = this.A02;
                boolean z8 = this.A03;
                C61013JvD jvD = (C61013JvD) this.A01;
                LES les = (LES) this.A00;
                if (z7) {
                    if (jvD != null) {
                        r1 = jvD.A06;
                    } else {
                        r1 = null;
                    }
                    if (r1 != AnonymousClass3NV.A07 || !z8) {
                        z2 = true;
                        AnonymousClass7TF.A1O(les.A0S, z2);
                        return C60340gF.A00;
                    }
                }
                z2 = false;
                AnonymousClass7TF.A1O(les.A0S, z2);
                return C60340gF.A00;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C59734JVs(LES les, AnonymousClass4D7 r3) {
        super(4, r3);
        this.A04 = 2;
        this.A00 = les;
    }
}
