package X;

import android.content.Context;
import android.graphics.Bitmap;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

public final class MJL extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;
    public final String A05;
    public final String A06;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJL(Object obj, Object obj2, Object obj3, String str, String str2, String str3, int i) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A05 = str;
        this.A04 = str2;
        this.A06 = str3;
        this.A01 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C249463jp r1;
        switch (this.A00) {
            case 0:
                String str = this.A05;
                String str2 = this.A04;
                String str3 = this.A06;
                C64176LSd.A01((Context) this.A02, (Bitmap) this.A01, (UserSession) this.A03, str, str2, str3);
                break;
            case 1:
                Context context = (Context) this.A02;
                MJL mjl = new MJL(context, this.A03, this.A01, this.A05, this.A04, this.A06, 0);
                C310336ap A0X = DbV.A0X();
                A0X.A02 = context.getResources().getDimensionPixelOffset(R.dimen.audio_page_audio_filter_tooltip_vertical_offset);
                A0X.A0H = "collage_send_failure";
                DbS.A19(context, A0X, 2131965697);
                DbW.A0q(context, A0X, 2131965696);
                A0X.A0A(new KSH(mjl, 0));
                A0X.A0L = true;
                A0X.A06();
                AnonymousClass2ZQ A002 = C71172bH.A00();
                if ((A002 instanceof C249463jp) && (r1 = (C249463jp) A002) != null) {
                    r1.Bx5().A0A(A0X.A00());
                    break;
                } else {
                    Dbb.A1Q(A0X);
                    break;
                }
                break;
            default:
                C61417K6o k6o = (C61417K6o) this.A03;
                ((LC8) k6o.A08.getValue()).A00((LO0) this.A02, this.A05, this.A06, new C73673Phm(this.A01, k6o, this.A04, 21));
                break;
        }
        return C60340gF.A00;
    }
}
