package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.WgF  reason: case insensitive filesystem */
public final class C19834WgF implements MXE {
    public boolean A00;
    public X7B A01;
    public final AnonymousClass0iw A02;
    public final C17889Vhg A03;
    public final C17294VPv A04;
    public final Context A05;

    public final /* synthetic */ void CJ5(C20864X1q x1q) {
    }

    public final void CfL() {
        this.A00 = false;
        C17294VPv vPv = this.A04;
        C17650Vbg vbg = vPv.A00;
        C16480Uva uva = vbg.A03;
        if (!(uva instanceof C16377Utu) && !(uva instanceof C16378Utv)) {
            Uw8 uw8 = vbg.A01;
            Integer num = vbg.A04;
            String str = vbg.A06;
            C17650Vbg vbg2 = new C17650Vbg(vbg.A00, uw8, Uw8.A03, C16480Uva.A04, num, str, vbg.A05);
            vPv.A00 = vbg2;
            this.A03.A00(this.A02, vbg2);
        }
    }

    public final void CfM() {
        this.A00 = true;
        hide();
    }

    public final void EhZ(X7B x7b) {
        this.A01 = x7b;
    }

    public final void EpQ(C63671L2h l2h) {
        this.A03.A00 = l2h;
    }

    public final void Euy(ImageUrl imageUrl, String str, String str2, long j) {
        C16480Uva uva;
        Uw8 uw8 = Uw8.A04;
        C17294VPv vPv = this.A04;
        Uw8 uw82 = Uw8.A03;
        if (!this.A00) {
            uva = C16480Uva.A05;
        } else {
            uva = C16480Uva.A06;
        }
        String str3 = str;
        if (str.length() == 0) {
            uva = C16480Uva.A03;
        }
        C17650Vbg vbg = new C17650Vbg(imageUrl, uw8, uw82, uva, AnonymousClass05K.A01, str2, str3);
        vPv.A00 = vbg;
        this.A03.A00(this.A02, vbg);
    }

    public final void Euz(long j, String str) {
        C16480Uva uva;
        Uw8 uw8 = Uw8.A04;
        C17294VPv vPv = this.A04;
        Uw8 uw82 = Uw8.A03;
        if (!this.A00) {
            uva = C16480Uva.A05;
        } else {
            uva = C16480Uva.A06;
        }
        String str2 = str;
        if (str.length() == 0) {
            uva = C16480Uva.A03;
        }
        C17650Vbg vbg = new C17650Vbg((ImageUrl) null, uw8, uw82, uva, AnonymousClass05K.A00, AnonymousClass7TE.A16(this.A05, 2131964421), str2);
        vPv.A00 = vbg;
        this.A03.A00(this.A02, vbg);
    }

    public final void hide() {
        C17294VPv vPv = this.A04;
        C17650Vbg vbg = vPv.A00;
        Uw8 uw8 = vbg.A01;
        Integer num = vbg.A04;
        String str = vbg.A06;
        ImageUrl imageUrl = vbg.A00;
        String str2 = vbg.A05;
        C17650Vbg vbg2 = new C17650Vbg(imageUrl, Uw8.A03, uw8, C16480Uva.A02, num, str, str2);
        vPv.A00 = vbg2;
        this.A03.A00(this.A02, vbg2);
    }

    public final void remove() {
        C17294VPv vPv = this.A04;
        C17650Vbg vbg = vPv.A00;
        Uw8 uw8 = vbg.A01;
        Integer num = vbg.A04;
        String str = vbg.A06;
        ImageUrl imageUrl = vbg.A00;
        String str2 = vbg.A05;
        C17650Vbg vbg2 = new C17650Vbg(imageUrl, Uw8.A03, uw8, C16480Uva.A03, num, str, str2);
        vPv.A00 = vbg2;
        this.A03.A00(this.A02, vbg2);
        X7B x7b = this.A01;
        if (x7b != null) {
            x7b.EOa(false);
        }
        X7B x7b2 = this.A01;
        if (x7b2 != null) {
            x7b2.CsD();
        }
    }

    public C19834WgF(Context context, AnonymousClass0iw r2, C17889Vhg vhg, C17294VPv vPv) {
        this.A05 = context;
        this.A02 = r2;
        this.A04 = vPv;
        this.A03 = vhg;
    }

    public final void destroy() {
        remove();
    }
}
