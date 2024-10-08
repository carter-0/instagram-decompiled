package X;

import android.content.Context;
import android.text.TextUtils;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;

public final class ED2 extends 1P0 {
    public C48251EbW A00;
    public final Context A01;
    public final UserSession A02;

    public ED2(Context context, UserSession userSession, C48251EbW ebW) {
        this.A02 = userSession;
        this.A01 = context;
        this.A00 = ebW;
    }

    public final void onFail(C268654dm r6) {
        Integer num;
        int A03 = AnonymousClass0fD.A03(2037447252);
        User A0j = DbT.A0j(this.A02);
        Integer A0N = A0j.A0N();
        Integer num2 = AnonymousClass05K.A0C;
        if (A0N == num2) {
            num = AnonymousClass05K.A01;
        } else {
            num = num2;
        }
        A0j.A0q(num);
        C48251EbW ebW = this.A00;
        if (ebW != null && (ebW instanceof C47934ENl)) {
            0qQ.A0B(r6, 0);
            ESI esi = ((C47934ENl) ebW).A00;
            0eE r0 = AnonymousClass0t1.A01;
            AnonymousClass0eM r1 = esi.A0E;
            ESI.A0A(esi, AnonymousClass7TF.A1W(DbX.A0l(r0, r1).A0N(), num2));
            C49952FGh.A07(esi, r6);
            C49905FEd.A01(AnonymousClass7TE.A0l(r1));
        }
        AnonymousClass0fD.A0A(-327204551, A03);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(-26927604);
        C48251EbW ebW = this.A00;
        if (ebW != null && (ebW instanceof C47934ENl)) {
            ((C47934ENl) ebW).A00.A09 = false;
        }
        AnonymousClass0fD.A0A(-1983286310, A03);
    }

    public final void onStart() {
        AnonymousClass0fD.A0A(-286362420, AnonymousClass0fD.A03(-61118774));
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        C358248ab A0Y;
        int A03 = AnonymousClass0fD.A03(-1493145733);
        DwB dwB = (DwB) obj;
        int A032 = AnonymousClass0fD.A03(-1233725082);
        if (dwB.A03) {
            String str = dwB.A02;
            String str2 = dwB.A01;
            if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
                C49952FGh.A01(this.A01);
            } else {
                if (!dwB.A04 || DbT.A0j(this.A02).A0N() != AnonymousClass05K.A01) {
                    A0Y = DbS.A0Y(this.A01);
                    Dba.A1M(A0Y);
                    A0Y.A05 = dwB.A02;
                    A0Y.A0q(dwB.A01);
                    A0Y.A06();
                    A0Y.A0f(new C50030FJp(4, dwB, this));
                } else {
                    Context context = this.A01;
                    A0Y = DbX.A0g(context, str2, str);
                    A0Y.A0d(C50020FJf.A00(this, 55), context.getString(2131965817));
                    A0Y.A0X(C50020FJf.A00(this, 54), C358278ae.BLUE_BOLD, context.getString(2131954722), true);
                    C49968FHb.A00(A0Y, this, 5);
                }
                DbT.A1V(A0Y);
            }
        } else {
            C48251EbW ebW = this.A00;
            if (ebW != null) {
                ebW.A00(dwB);
            }
        }
        AnonymousClass0fD.A0A(-1824819817, A032);
        AnonymousClass0fD.A0A(1114817841, A03);
    }
}
