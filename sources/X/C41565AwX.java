package X;

import android.content.Context;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.friendmap.data.FriendMapRepository;

/* renamed from: X.AwX  reason: case insensitive filesystem */
public final class C41565AwX extends 0Yg implements C62320sa {
    public final int A00;
    public final long A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41565AwX(long j, Object obj, int i) {
        super(0);
        this.A00 = i;
        this.A01 = j;
        this.A02 = obj;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass6GP A0Z = ((AnonymousClass5SI) this.A02).A0I.A0W.A04.A0Z();
                0qQ.A0A(A0Z);
                A0Z.Cnz(this.A01);
                break;
            case 1:
                return ((C298605tj) ((C304786Ff) this.A02)).A01(this.A01);
            case 2:
                FriendMapRepository friendMapRepository = ((C69028NdD) this.A02).A05;
                long j = this.A01;
                if (!friendMapRepository.A0B(j)) {
                    friendMapRepository.A06(j);
                    break;
                }
                break;
            case 3:
                return new C294665mp((C250653lq) this.A02, 500 + this.A01);
            case 4:
                AnonymousClass2j8 r0 = (AnonymousClass2j8) this.A02;
                UserSession userSession = r0.A02;
                Context context = r0.A00;
                C227462jM A002 = C227462jM.A00(context, userSession);
                long j2 = this.A01;
                C227502jR r3 = new C227502jR(AnonymousClass45O.A05.A01, R.id.feed_background_prefetch_job_scheduler_id);
                r3.A05 = true;
                r3.A00 = 1;
                r3.A02 = j2;
                r3.A06 = 182.A06(0Tu.A05, userSession, 36315309994151043L);
                A002.A03(context, userSession, new C227512jS(r3));
                break;
            default:
                AnonymousClass2V4 r32 = ((AnonymousClass3Y5) this.A02).Aqq().A0D;
                0qQ.A07(r32);
                int A003 = C245073cH.A00(this.A01);
                return Float.valueOf(((float) A003) / r32.A01.getDisplayMetrics().density);
        }
        return C60340gF.A00;
    }
}
