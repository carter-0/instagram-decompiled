package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

public final class ELR extends DdO {
    public final /* synthetic */ AnonymousClass32F A00;

    public final void DGN(AnonymousClass3UM r10, String str, int i) {
        String str2;
        0qQ.A0B(r10, 0);
        AnonymousClass32F r1 = this.A00;
        C54229H3y h3y = r1.A09;
        if (h3y == null) {
            str2 = "adapter";
        } else {
            h3y.notifyDataSetChanged();
            C293005js r2 = r1.A03;
            if (r2 == null) {
                str2 = "followChainingLogger";
            } else {
                String A0q = DbU.A0q(r10);
                String str3 = r1.A0D;
                if (str3 != null) {
                    r2.A02(A0q, str3, "direct_pivot_unit", r10.getAlgorithm(), r10.BxN(), i);
                    return;
                }
                throw AnonymousClass7TE.A0y();
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DgN(AnonymousClass3UM r10, String str, int i) {
        0qQ.A0B(r10, 0);
        AnonymousClass32F r2 = this.A00;
        if (r2.A0d.add(DbU.A0q(r10))) {
            C293005js r0 = r2.A03;
            if (r0 == null) {
                0qQ.A0F("followChainingLogger");
                throw AnonymousClass00P.createAndThrow();
            }
            String A0q = DbU.A0q(r10);
            String str2 = r2.A0D;
            if (str2 != null) {
                r0.A04(A0q, str2, "direct_pivot_unit", r10.getAlgorithm(), r10.BxN(), i, 0);
                return;
            }
            throw AnonymousClass7TE.A0y();
        }
    }

    public final void Dw1(AnonymousClass3UM r9, String str, int i) {
        0qQ.A0B(r9, 0);
        AnonymousClass32F r7 = this.A00;
        C293005js r0 = r7.A03;
        if (r0 == null) {
            0qQ.A0F("followChainingLogger");
            throw AnonymousClass00P.createAndThrow();
        }
        String A0q = DbU.A0q(r9);
        String str2 = r7.A0D;
        if (str2 != null) {
            r0.A03(A0q, str2, "direct_pivot_unit", r9.getAlgorithm(), r9.BxN(), i);
            C46474Dfc.A03(DbS.A0M(r7.requireActivity(), AnonymousClass32F.A01(r7)), AnonymousClass32F.A01(r7), C46447Df9.A02(), C46548Dgp.A01(AnonymousClass32F.A01(r7), DbU.A0q(r9), "feed_single_media_user_button", r7.getModuleName()));
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELR(FragmentActivity fragmentActivity, UserSession userSession, AnonymousClass32F r3) {
        super(fragmentActivity, r3, userSession);
        this.A00 = r3;
        0qQ.A0A(fragmentActivity);
    }
}
