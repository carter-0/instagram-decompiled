package X;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

/* renamed from: X.FIk  reason: case insensitive filesystem */
public final class C49999FIk implements DialogInterface.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    public C49999FIk(Object obj, Object obj2, Object obj3, Object obj4, String str, int i) {
        this.A00 = i;
        this.A03 = obj3;
        this.A05 = str;
        this.A02 = obj2;
        this.A04 = obj4;
        this.A01 = obj;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        switch (this.A00) {
            case 0:
                Object obj = this.A04;
                String str = this.A05;
                Object obj2 = this.A03;
                Object obj3 = this.A02;
                C18080Vl9 vl9 = new C18080Vl9((Context) this.A01);
                vl9.A08("Reset Counters");
                int length = AnonymousClass05K.A00(5).length;
                boolean[] zArr = new boolean[length];
                CharSequence[] charSequenceArr = new CharSequence[length];
                for (int i2 = 0; i2 < length; i2++) {
                    charSequenceArr[i2] = C48306EcP.A00(AnonymousClass05K.A00(5)[i2]);
                }
                C50037FJw fJw = new C50037FJw(zArr);
                C17742VdB vdB = vl9.A01;
                vdB.A0J = charSequenceArr;
                vdB.A07 = fJw;
                vdB.A0K = new boolean[length];
                vdB.A0H = true;
                FIZ fiz = new FIZ(obj3, obj2, obj, str, 0);
                vdB.A0E = "Reset All";
                vdB.A02 = fiz;
                vl9.A06(new FIi(obj3, obj2, zArr, str, length, 0), "GO!");
                AnonymousClass0fN.A00(vl9.A00());
                return;
            case 1:
                1Xj r3 = (1Xj) this.A03;
                User A29 = r3.A29();
                if (A29 != null) {
                    C347037wA.A03((Activity) this.A01, (UserSession) this.A04, r3, A29, (Class) this.A02, this.A05);
                    return;
                }
                return;
            case 2:
                UserSession userSession = (UserSession) this.A04;
                Object obj4 = this.A02;
                Object obj5 = this.A03;
                String str2 = this.A05;
                F5s.A01(C50165FRx.A00, new DFX(obj5, obj4, userSession, str2, 1), userSession, 0sn.A00, true);
                FEU feu = (FEU) this.A01;
                0Aj A002 = FEU.A00(feu);
                Dbb.A18(C48138EZg.SYSTEM_DIALOG, A002);
                A002.AAJ("target_user_id", str2);
                FEU.A01(A002, feu);
                return;
            case 3:
                ((C48068EUm) this.A01).A00((AnonymousClass0aP) this.A04);
                dialogInterface.dismiss();
                G8H g8h = (G8H) this.A03;
                if (g8h != null) {
                    g8h.Cta(this.A05, ((C49590Eyz) this.A02).A03);
                    return;
                }
                return;
            case 4:
                VK6.A00.A04((UserSession) this.A04, (AnonymousClass4O6) this.A03, ((C16530Uwa) this.A02).name(), this.A05);
                W38.A06((Activity) this.A01, (Integer) null);
                dialogInterface.cancel();
                return;
            case 5:
                0lg r4 = (0lg) this.A03;
                C319606qt A012 = C319606qt.A01(r4);
                String str3 = this.A05;
                A012.A09((Context) this.A01, (AnonymousClass0iw) this.A02, r4, (Integer) this.A04, str3, true);
                return;
            default:
                Object obj6 = this.A01;
                UserSession userSession2 = (UserSession) this.A04;
                String str4 = this.A05;
                Object obj7 = this.A02;
                1OC A022 = LSW.A02(userSession2, str4);
                A022.A00 = new EDU(obj6, userSession2, obj7, str4, 4);
                ((AnonymousClass4DH) this.A03).schedule(A022);
                return;
        }
    }
}
