package X;

import android.content.Context;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.user.model.User;
import java.util.HashMap;

/* renamed from: X.Fca  reason: case insensitive filesystem */
public final class C50488Fca implements C367608rH {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;

    public C50488Fca(int i, Object obj, Object obj2, Object obj3, Object obj4) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
    }

    public final void onClick() {
        switch (this.A00) {
            case 0:
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("target_user_id", ((User) this.A03).getId());
                A1E.put("referer_type", "ProfileMore");
                C46649DiU A042 = C46649DiU.A04(AnonymousClass000.A00(45), A1E);
                IgBloksScreenConfig A0N = DbS.A0N((0lg) this.A04);
                A0N.A0U = ((Context) this.A02).getResources().getString(2131951989);
                A0N.A0R = "account_transparency_bloks";
                A042.A0D((Context) this.A01, A0N);
                return;
            case 1:
                DbS.A1U(this.A03);
                Context context = (Context) this.A01;
                Object obj = this.A02;
                C358248ab A0Y = DbS.A0Y(context);
                A0Y.A09(2131972021);
                A0Y.A0q(AnonymousClass7TF.A0e(context.getResources(), ((User) this.A04).getUsername(), 2131972020));
                A0Y.A0Y(C50021FJg.A00(obj, 49), C358278ae.RED_BOLD, AnonymousClass7TE.A16(context, 2131971974), true);
                A0Y.A0G(FJW.A00, 2131954722);
                DbT.A1V(A0Y);
                return;
            default:
                return;
        }
    }
}
