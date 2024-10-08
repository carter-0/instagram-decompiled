package X;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import com.instagram.user.model.User;

public final class FOC implements View.OnClickListener {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public FOC(Object obj, Object obj2, Object obj3, String str, int i, int i2) {
        this.A00 = i2;
        this.A04 = obj3;
        this.A05 = str;
        this.A02 = obj;
        this.A01 = i;
        this.A03 = obj2;
    }

    public final void onClick(View view) {
        int A052;
        int i;
        int i2;
        switch (this.A00) {
            case 0:
                A052 = AnonymousClass0fD.A05(620411045);
                C68031Myx myx = (C68031Myx) this.A03;
                myx.A00.setEnabled(false);
                ((C18783W1j) this.A02).A04(myx, (C17966Vj0) this.A04, this.A01);
                i = 1701396839;
                break;
            case 1:
                A052 = AnonymousClass0fD.A05(-2009707771);
                C68031Myx myx2 = (C68031Myx) this.A03;
                myx2.A02.setEnabled(false);
                ((C18783W1j) this.A02).A04(myx2, (C17966Vj0) this.A04, this.A01);
                i = 1943473480;
                break;
            case 2:
                A052 = AnonymousClass0fD.A05(-951456063);
                G88 g88 = (G88) this.A02;
                Integer Auv = g88.Auv(DbS.A0q(this.A04));
                AnonymousClass3UM r2 = (AnonymousClass3UM) this.A03;
                if (Auv != null) {
                    i2 = Auv.intValue();
                } else {
                    i2 = this.A01;
                }
                g88.D9T(r2, this.A05, i2);
                i = 25095678;
                break;
            case 3:
                A052 = AnonymousClass0fD.A05(76085466);
                1WM.getInstance();
                T8B A012 = new T8B((0lg) this.A04).A01(this.A05);
                Context context = (Context) this.A02;
                A012.A07 = context.getResources().getString(this.A01);
                A012.A00((Bundle) this.A03);
                A012.A08 = true;
                A012.A02(context);
                i = 1605113420;
                break;
            default:
                A052 = AnonymousClass0fD.A05(1330732209);
                int i3 = this.A01;
                ((C51917G7l) this.A02).DBl(AnonymousClass7TE.A0S(((F18) this.A03).A01), (User) this.A04, this.A05, i3);
                i = 1693703445;
                break;
        }
        AnonymousClass0fD.A0C(i, A052);
    }
}
