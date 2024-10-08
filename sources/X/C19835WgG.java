package X;

import android.content.Context;
import com.instagram.common.typedurl.ImageUrl;

/* renamed from: X.WgG  reason: case insensitive filesystem */
public final class C19835WgG implements MXE {
    public X7B A00;
    public boolean A01;
    public final Context A02;
    public final AnonymousClass0iw A03;
    public final C17889Vhg A04;
    public final C17294VPv A05;

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void CJ5(X.C20864X1q r13) {
        /*
            r12 = this;
            r3 = 0
            boolean r0 = r13 instanceof X.C19832WgD
            if (r0 == 0) goto L_0x0060
            X.WgD r13 = (X.C19832WgD) r13
            X.Uw8 r6 = X.Uw8.A04
            X.VPv r3 = r12.A05
            X.Vbg r0 = r3.A00
            X.Uw8 r7 = r0.A01
            r2 = 1
            java.lang.String r11 = r13.A04
            int r0 = r11.length()
            if (r0 != 0) goto L_0x001a
            kotlin.enums.EnumEntries r0 = X.C16480Uva.A00
        L_0x001a:
            X.Uz5 r4 = r13.A03
            X.Uz5 r0 = X.C16669Uz5.LIVE
            android.content.Context r1 = r12.A02
            if (r4 != r0) goto L_0x005a
            com.instagram.user.model.User r0 = r13.A02
            if (r0 != 0) goto L_0x004f
            java.lang.Integer r9 = X.AnonymousClass05K.A0C
            r0 = 2131964420(0x7f133204, float:1.9565621E38)
        L_0x002b:
            java.lang.String r10 = X.AnonymousClass7TE.A16(r1, r0)
            r5 = 0
        L_0x0030:
            boolean r0 = r12.A01
            if (r0 != 0) goto L_0x004c
            X.Uva r8 = X.C16480Uva.A05
        L_0x0036:
            X.Vbg r4 = new X.Vbg
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            r3.A00 = r4
            X.Vhg r1 = r12.A04
            X.0iw r0 = r12.A03
            r1.A00(r0, r4)
            X.X7B r0 = r12.A00
            if (r0 == 0) goto L_0x004b
            r0.EOa(r2)
        L_0x004b:
            return
        L_0x004c:
            X.Uva r8 = X.C16480Uva.A06
            goto L_0x0036
        L_0x004f:
            java.lang.Integer r9 = X.AnonymousClass05K.A01
            java.lang.String r10 = r0.getUsername()
            com.instagram.common.typedurl.ImageUrl r5 = r0.Bh3()
            goto L_0x0030
        L_0x005a:
            java.lang.Integer r9 = X.AnonymousClass05K.A00
            r0 = 2131964421(0x7f133205, float:1.9565623E38)
            goto L_0x002b
        L_0x0060:
            boolean r0 = r13 instanceof X.C19831WgC
            if (r0 == 0) goto L_0x004b
            X.VPv r2 = r12.A05
            X.Vbg r0 = r2.A00
            X.Uw8 r6 = r0.A02
            X.Uw8 r7 = r0.A01
            java.lang.Integer r9 = r0.A04
            java.lang.String r10 = r0.A06
            com.instagram.common.typedurl.ImageUrl r5 = r0.A00
            java.lang.String r11 = r0.A05
            X.Uva r8 = X.C16480Uva.A03
            X.Vbg r4 = new X.Vbg
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            X.Vhg r1 = r12.A04
            X.0iw r0 = r12.A03
            r1.A00(r0, r4)
            r2.A00 = r4
            X.X7B r0 = r12.A00
            if (r0 == 0) goto L_0x004b
            r0.EOa(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C19835WgG.CJ5(X.X1q):void");
    }

    public final void CfL() {
        this.A01 = false;
        C17294VPv vPv = this.A05;
        C17650Vbg vbg = vPv.A00;
        C16480Uva uva = vbg.A03;
        if (!(uva instanceof C16377Utu) && !(uva instanceof C16378Utv)) {
            Integer num = vbg.A04;
            String str = vbg.A06;
            ImageUrl imageUrl = vbg.A00;
            String str2 = vbg.A05;
            Uw8 uw8 = Uw8.A03;
            C17650Vbg vbg2 = new C17650Vbg(imageUrl, uw8, uw8, C16480Uva.A04, num, str, str2);
            vPv.A00 = vbg2;
            this.A04.A00(this.A03, vbg2);
        }
    }

    public final void CfM() {
        this.A01 = true;
        hide();
    }

    public final void Euy(ImageUrl imageUrl, String str, String str2, long j) {
    }

    public final void Euz(long j, String str) {
    }

    public final void destroy() {
        this.A00 = null;
        remove();
    }

    public final void EhZ(X7B x7b) {
        this.A00 = x7b;
    }

    public final void EpQ(C63671L2h l2h) {
        this.A04.A00 = l2h;
    }

    public final void hide() {
        C17294VPv vPv = this.A05;
        C17650Vbg vbg = vPv.A00;
        Uw8 uw8 = vbg.A01;
        Integer num = vbg.A04;
        String str = vbg.A06;
        ImageUrl imageUrl = vbg.A00;
        String str2 = vbg.A05;
        C17650Vbg vbg2 = new C17650Vbg(imageUrl, Uw8.A03, uw8, C16480Uva.A02, num, str, str2);
        vPv.A00 = vbg2;
        this.A04.A00(this.A03, vbg2);
    }

    public final void remove() {
        C17294VPv vPv = this.A05;
        C17650Vbg vbg = vPv.A00;
        Uw8 uw8 = vbg.A01;
        Integer num = vbg.A04;
        String str = vbg.A06;
        ImageUrl imageUrl = vbg.A00;
        String str2 = vbg.A05;
        C17650Vbg vbg2 = new C17650Vbg(imageUrl, Uw8.A03, uw8, C16480Uva.A03, num, str, str2);
        vPv.A00 = vbg2;
        this.A04.A00(this.A03, vbg2);
        X7B x7b = this.A00;
        if (x7b != null) {
            x7b.EOa(false);
        }
        X7B x7b2 = this.A00;
        if (x7b2 != null) {
            x7b2.CsD();
        }
    }

    public C19835WgG(Context context, AnonymousClass0iw r2, C17889Vhg vhg, C17294VPv vPv) {
        this.A02 = context;
        this.A03 = r2;
        this.A05 = vPv;
        this.A04 = vhg;
    }
}
