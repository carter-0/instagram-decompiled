package X;

import com.instagram.common.session.UserSession;
import java.util.List;

public final class GI3 implements Runnable {
    public final /* synthetic */ float A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ C267324bN A02;
    public final /* synthetic */ C52058GDe A03;
    public final /* synthetic */ UserSession A04;
    public final /* synthetic */ C242423Ua A05;
    public final /* synthetic */ C263754Nf A06;
    public final /* synthetic */ AnonymousClass4M3 A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ boolean A0A;

    public GI3(C267324bN r1, C52058GDe gDe, UserSession userSession, C242423Ua r4, C263754Nf r5, AnonymousClass4M3 r6, String str, String str2, float f, int i, boolean z) {
        this.A07 = r6;
        this.A05 = r4;
        this.A06 = r5;
        this.A00 = f;
        this.A0A = z;
        this.A09 = str;
        this.A08 = str2;
        this.A01 = i;
        this.A03 = gDe;
        this.A02 = r1;
        this.A04 = userSession;
    }

    public final void run() {
        AnonymousClass3WR A092;
        1Xj A0T;
        AnonymousClass4M3 r1 = this.A07;
        C52058GDe gDe = this.A03;
        C267324bN r5 = this.A02;
        UserSession userSession = this.A04;
        Integer num = gDe.A0H;
        if (num != null) {
            int intValue = num.intValue();
            List list = r5.A0R;
            if (!(list == null || (A0T = DbZ.A0T(list, intValue)) == null)) {
                A092 = A0T.CEL();
                C242423Ua r3 = this.A05;
                C263754Nf r6 = this.A06;
                float f = this.A00;
                boolean z = this.A0A;
                String str = this.A09;
                0qQ.A0B(str, 6);
                r1.E4H(new C263794Nj(r3, new C263414Lx(false, false, false, false), A092, r6, this.A08, str, f, -1, this.A01, z));
            }
        }
        A092 = r5.A09(userSession, num);
        C242423Ua r32 = this.A05;
        C263754Nf r62 = this.A06;
        float f2 = this.A00;
        boolean z2 = this.A0A;
        String str2 = this.A09;
        0qQ.A0B(str2, 6);
        r1.E4H(new C263794Nj(r32, new C263414Lx(false, false, false, false), A092, r62, this.A08, str2, f2, -1, this.A01, z2));
    }
}
