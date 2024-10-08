package X;

import android.content.Context;
import android.view.View;
import com.instagram.android.R;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.newsfeed.ui.InlineLinkUrn;
import java.util.function.Function;

public final class ELP extends C253103qD {
    public final int A00 = 3;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELP(C65265LqK lqK, MessageIdentifier messageIdentifier, Integer num, int i) {
        super("", i, true);
        this.A03 = lqK;
        this.A01 = messageIdentifier;
        this.A02 = num;
    }

    public final void onClick(View view) {
        String str;
        switch (this.A00) {
            case 0:
                P30 p30 = (P30) this.A03;
                AnonymousClass7S7 C6l = p30.A01.C6l();
                int AdN = C6l.AdN();
                C254793t3 CBU = C6l.CBU();
                String C6k = C6l.C6k();
                C313756gx A0R = DbZ.A0R(p30.A03);
                if (CBU != null) {
                    str = C300965yF.A07(CBU);
                } else {
                    str = null;
                }
                1Ln A0J = DbT.A0J(A0R);
                if (DbT.A1Y(A0J)) {
                    DbW.A17(A0J, A0R);
                    DbV.A1M(A0J, "translation_footer_nux_clicked");
                    A0J.A0p(C273654mx.A00(3437));
                    A0J.A0i(DbZ.A0b(A0J, "thread_view", str, C6k, AdN));
                    Dba.A1C(A0J, A0R);
                }
                Context context = (Context) this.A02;
                C358248ab A0Y = DbS.A0Y(context);
                A0Y.A0j(context.getDrawable(R.drawable.ig_illustrations_illo_translate_refresh));
                A0Y.A09(2131958740);
                A0Y.A08(2131958737);
                A0Y.A0J(new FIi(this.A01, CBU, p30, C6k, AdN, 1), 2131958739);
                A0Y.A0G(new FIU(p30, CBU, C6k, AdN), 2131958738);
                A0Y.A0g(new C50040FJz(p30, CBU, C6k, AdN));
                DbT.A1V(A0Y);
                return;
            case 1:
                ((C65265LqK) this.A03).Ds0((MessageIdentifier) this.A01, (Integer) this.A02);
                return;
            case 2:
                ((C72542P9z) this.A03).Dry((MessageIdentifier) this.A01, (Integer) this.A02);
                return;
            default:
                String str2 = ((C283155Gi) this.A03).A04.A0o;
                str2.getClass();
                ((Function) this.A02).apply(InlineLinkUrn.Companion.A00((C47156DrX) this.A01, str2));
                return;
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELP(C47156DrX drX, C283155Gi r3, Function function, int i) {
        super(true, i);
        this.A02 = function;
        this.A01 = drX;
        this.A03 = r3;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELP(C72542P9z p9z, MessageIdentifier messageIdentifier, Integer num, int i) {
        super("", i, true);
        this.A03 = p9z;
        this.A01 = messageIdentifier;
        this.A02 = num;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public ELP(Context context, P30 p30, C332907Wx r5, int i) {
        super("", i, true);
        this.A03 = p30;
        this.A02 = context;
        this.A01 = r5;
    }
}
