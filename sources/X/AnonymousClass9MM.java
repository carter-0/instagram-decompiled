package X;

import android.content.Context;
import android.net.Uri;
import com.instagram.common.session.UserSession;
import com.instagram.model.androidlink.AndroidLink;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.9MM  reason: invalid class name */
public final class AnonymousClass9MM extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public AnonymousClass9MM(int i, int i2, Object obj, Object obj2, Object obj3) {
        super(1);
        this.A00 = i2;
        this.A04 = obj;
        this.A02 = obj2;
        this.A03 = obj3;
        this.A01 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        String Avj;
        String queryParameter;
        int i;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                if (obj2 != this.A04) {
                    if (obj2 instanceof C284925Ox) {
                        int i2 = ((AnonymousClass5XG) this.A02).A00;
                        0vu r2 = (0vu) this.A03;
                        int i3 = i2 - this.A01;
                        int A032 = r2.A03(obj2);
                        if (A032 >= 0) {
                            i = r2.A02[A032];
                        } else {
                            i = Integer.MAX_VALUE;
                        }
                        r2.A06(obj2, Math.min(i3, i));
                        break;
                    }
                } else {
                    throw new IllegalStateException("A derived state calculation cannot read itself");
                }
                break;
            case 1:
                AnonymousClass5Q3 r14 = (AnonymousClass5Q3) obj2;
                0qQ.A0B(r14, 0);
                int i4 = this.A01;
                C289545dm r4 = (C289545dm) this.A02;
                AnonymousClass5b4 r3 = (AnonymousClass5b4) this.A04;
                float f = 0.0f;
                for (0eP r6 : (List) this.A03) {
                    long j = ((AnonymousClass5RW) r6.A01).A00;
                    float f2 = ((C289095d0) r6.A00).A00;
                    float f3 = r4.A00;
                    long A002 = C289325dP.A00(f + (((float) i4) * (r14.F06(f3) - (r14.F06(f3) * ((Number) r3.A04.getValue()).floatValue()))), 0.0f);
                    r14.AQV((C288195bW) null, C289635dw.A00, r14.F06(f2) / 2.0f, 1.0f, 3, j, A002);
                    f += r14.F06(f2) + r14.F06(f3);
                }
                break;
            case 2:
                Context context = (Context) obj2;
                0qQ.A0B(context, 0);
                1Xj r5 = (1Xj) this.A02;
                AnonymousClass0iw r42 = (AnonymousClass0iw) this.A03;
                UserSession userSession = ((C274134nl) this.A04).A00;
                AndroidLink A022 = AnonymousClass47K.A02(context, userSession, r5, this.A01 - 1, false);
                if (!(A022 == null || (Avj = A022.Avj()) == null || Avj.length() == 0)) {
                    String Avj2 = A022.Avj();
                    if (Avj2 != null) {
                        Uri A033 = 0cp.A03(Avj2);
                        if (!(A033 == null || (queryParameter = A033.getQueryParameter(AnonymousClass000.A00(55))) == null || queryParameter.length() == 0)) {
                            C61076JwE A012 = SAZ.A01(userSession, r5, A022, r42.getModuleName());
                            if (A012 != null) {
                                C359638dF.A04(context, new C359618dD(userSession), A012.A01, (HashMap) A012.A00, A2X.A00);
                                break;
                            } else {
                                throw new IllegalStateException("link is valid and bloksRequestInput cannot be null");
                            }
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                }
            case 3:
                C376689Iy r1 = (C376689Iy) this.A04;
                AnonymousClass3W1 r43 = (AnonymousClass3W1) this.A03;
                int i5 = this.A01;
                0qQ.A0B(r1, 0);
                0qQ.A0B(r43, 1);
                ((AnonymousClass53Y) this.A02).A00.A00.D2u((1Xj) r1.A01, r43, (Boolean) null, i5, false);
                break;
            default:
                ((C56153Htf) this.A03).A03(((C253993rl) this.A02).A0F, (C53281GlT) this.A04, this.A01);
                break;
        }
        return C60340gF.A00;
    }
}
