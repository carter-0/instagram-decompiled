package X;

import android.content.Context;
import android.view.View;
import android.widget.TextView;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.Product;

public final class IO3 implements 1wn {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public IO3(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A03 = obj2;
        this.A01 = obj;
        this.A02 = obj3;
    }

    public final void onEvent(Object obj) {
        int A032;
        int i;
        View A002;
        switch (this.A00) {
            case 0:
                Product product = (Product) this.A01;
                View view = (View) this.A02;
                UserSession userSession = (UserSession) this.A03;
                if (((AnonymousClass3DT) obj).A00.BpP().equals(product.A0H)) {
                    view.setSelected(C323496xa.A00(userSession).A03(product));
                    return;
                }
                return;
            case 1:
                A032 = AnonymousClass0fD.A03(-1371898882);
                int A033 = AnonymousClass0fD.A03(-964963544);
                Integer num = ((WQM) obj).A01;
                Integer num2 = AnonymousClass05K.A00;
                C276544tV r3 = (C276544tV) this.A03;
                int i2 = 70;
                if (num == num2) {
                    i2 = 71;
                }
                C277014uI A0A = r3.A0A(i2);
                C307786Rm r1 = (C307786Rm) this.A02;
                if (A0A != null) {
                    C308276Tl r0 = new C308276Tl();
                    r0.A01(r3);
                    r0.A02(r1);
                    C307886Rw.A03(r1, r3, r0.A00(), A0A);
                }
                AnonymousClass0fD.A0A(1260765466, A033);
                i = 1546277798;
                break;
            case 2:
                A032 = AnonymousClass0fD.A03(-499540564);
                C57070INk iNk = (C57070INk) obj;
                int A0D = AnonymousClass7TG.A0D(iNk, -211173577);
                String str = iNk.A00;
                GTD gtd = (GTD) this.A01;
                if (0qQ.A0K(str, gtd.A00)) {
                    TextView textView = gtd.A05;
                    GTF gtf = (GTF) this.A03;
                    textView.setText(1sx.A05(gtf.A01, gtf.A02, (1Xj) this.A02, iNk.A01));
                }
                AnonymousClass0fD.A0A(-985850112, A0D);
                i = 1364522033;
                break;
            case 3:
                A032 = AnonymousClass0fD.A03(1822373797);
                int A034 = AnonymousClass0fD.A03(1395879222);
                FRW frw = (FRW) this.A03;
                if (FRW.A00((Context) this.A01, frw, (EXD) this.A02)) {
                    frw.A01();
                }
                AnonymousClass0fD.A0A(1046729482, A034);
                i = 1302238090;
                break;
            default:
                A032 = AnonymousClass0fD.A03(-1550275503);
                int A035 = AnonymousClass0fD.A03(-1619823657);
                GI5 gi5 = (GI5) this.A03;
                C267324bN r7 = (C267324bN) this.A01;
                View view2 = (View) this.A02;
                UserSession userSession2 = gi5.A07;
                if (AnonymousClass3ZC.A09(gi5.A05, r7, userSession2) && (A002 = GI5.A00(view2)) != null) {
                    GI5.A02(A002, C226262fy.LEFT_ANCHOR, (C315476jx) null, gi5, 2131960321);
                    C22031Xty.A0C(gi5.A06, userSession2, r7.getId(), DbX.A0r(r7.A08(userSession2)), "clips_action_sheet");
                }
                AnonymousClass1Nd.A00(userSession2).A02(this, INX.class);
                AnonymousClass0fD.A0A(1659490479, A035);
                i = -1431110445;
                break;
        }
        AnonymousClass0fD.A0A(i, A032);
    }
}
