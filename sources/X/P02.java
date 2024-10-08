package X;

import com.instagram.igds.components.bottomsheet.BottomSheetFragment;
import java.util.Calendar;
import java.util.Date;

public final class P02 implements C74441Puw {
    public final /* synthetic */ C329437Iw A00;
    public final /* synthetic */ 0rm A01;

    public final void D9d() {
    }

    public P02(C329437Iw r1, 0rm r2) {
        this.A01 = r2;
        this.A00 = r1;
    }

    public final void D7r(Date date) {
        C70670OFr oFr;
        if (date != null && (oFr = (C70670OFr) this.A01.A00) != null) {
            C329437Iw r3 = this.A00;
            Calendar instance = Calendar.getInstance();
            instance.add(12, 1);
            boolean after = date.after(instance.getTime());
            C331157Pu r0 = oFr.A00;
            if (r0 != null) {
                r0.A0Q(after);
            }
            Calendar calendar = C14240TsN.A02;
            String A002 = r3.A00(date);
            C331157Pu r2 = oFr.A00;
            if (r2 != null) {
                BottomSheetFragment bottomSheetFragment = r2.A03;
                BottomSheetFragment.A00(bottomSheetFragment).A0g = A002;
                bottomSheetFragment.A0Q();
                bottomSheetFragment.A0Q();
                r2.A02.A0g = A002;
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x00a4  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void D9n(java.util.Date r12) {
        /*
            r11 = this;
            java.util.Calendar r2 = java.util.Calendar.getInstance()
            r1 = 12
            r0 = 1
            r2.add(r1, r0)
            if (r12 == 0) goto L_0x007b
            r6 = 0
            r12.setSeconds(r6)
            java.util.Date r0 = r2.getTime()
            boolean r0 = r12.after(r0)
            if (r0 == 0) goto L_0x007b
            X.7Iw r4 = r11.A00
            r4.A00 = r12
            X.7Im r5 = r4.A06
            java.lang.String r0 = r5.AuW()
            java.lang.String r7 = X.DbV.A12(r0)
            java.util.concurrent.TimeUnit r2 = java.util.concurrent.TimeUnit.MILLISECONDS
            long r0 = r12.getTime()
            long r9 = r2.toSeconds(r0)
            com.instagram.common.session.UserSession r3 = r4.A05
            X.0Tu r2 = X.0Tu.A05
            r0 = 2342172831900582236(0x208111c80001415c, double:4.0739146854835005E-152)
            boolean r0 = X.182.A06(r2, r3, r0)
            X.7Id r2 = r4.A07
            if (r0 == 0) goto L_0x0081
            X.0qQ.A0B(r7, r6)
            X.7Ij r1 = r2.A00
            if (r1 == 0) goto L_0x004e
            r0 = 0
            r1.A06(r0)
        L_0x004e:
            X.7Ia r0 = r2.A02
            X.7Hl r0 = r0.A01
            X.7Sa r0 = r0.A1i
            X.9H7 r0 = r0.A00
            X.7TI r0 = X.AnonymousClass9H7.A01(r0)
            X.7L9 r0 = r0.A0K()
            X.7L7 r1 = r0.A05
            X.7L5 r0 = r0.A03
            java.lang.String r8 = r0.A00()
            X.7Zj r5 = r1.A03
            X.0sa r0 = r1.A08
            java.lang.Object r6 = r0.invoke()
            X.3t2 r6 = (X.C254783t2) r6
            r5.EMd(r6, r7, r8, r9)
        L_0x0073:
            X.37E r1 = X.AnonymousClass37D.A00
            android.app.Activity r0 = r4.A02
            X.DbX.A10(r0, r1)
            return
        L_0x007b:
            X.7Iw r4 = r11.A00
            r0 = 2131972671(0x7f13523f, float:1.9582356E38)
            goto L_0x0092
        L_0x0081:
            android.text.Editable r1 = r5.Azu()
            java.lang.Long r0 = java.lang.Long.valueOf(r9)
            boolean r0 = r2.A01(r1, r0, r7)
            if (r0 != 0) goto L_0x0073
            r0 = 2131972678(0x7f135246, float:1.958237E38)
        L_0x0092:
            X.6ap r3 = X.DbS.A0a()
            android.content.Context r2 = r4.A03
            X.DbS.A19(r2, r3, r0)
            r0 = 2131238465(0x7f081e41, float:1.809321E38)
            android.graphics.drawable.Drawable r1 = r2.getDrawable(r0)
            if (r1 == 0) goto L_0x00b4
            X.6ar r0 = X.C310356ar.CIRCULAR
            r3.A0B(r0)
            int r0 = X.2Yu.A05(r2)
            int r0 = r2.getColor(r0)
            r3.A08(r1, r0)
        L_0x00b4:
            X.Dbb.A1Q(r3)
            goto L_0x0073
        */
        throw new UnsupportedOperationException("Method not decompiled: X.P02.D9n(java.util.Date):void");
    }
}
