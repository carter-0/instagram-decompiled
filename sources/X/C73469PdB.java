package X;

import android.content.Context;
import com.facebook.msys.mca.MailboxFeature;
import com.facebook.msys.mca.MailboxFutureImpl;
import java.util.List;

/* renamed from: X.PdB  reason: case insensitive filesystem */
public final class C73469PdB implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public C73469PdB(int i, Object obj, Object obj2) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.A00) {
            case 0:
                List list = ((AnonymousClass6Tm) obj).A00;
                ((0sK) this.A02).invoke(list.get(0), list.get(1), list.get(2));
                return null;
            case 1:
                Context context = (Context) this.A01;
                Object obj2 = this.A02;
                return new GRE((String) obj).A00(context, new C73468PdA(obj2, 3), AnonymousClass3HA.A00(context));
            default:
                MailboxFeature mailboxFeature = (MailboxFeature) obj;
                AnonymousClass68L A0I = C66581MXm.A0I(mailboxFeature);
                MailboxFutureImpl A0G = C66580MXl.A0G(A0I);
                C66582MXn.A1D(A0I, new C71723Oph(31, (Object) mailboxFeature, (Object) A0G), A0G);
                A0G.addResultCallback(new C71721Opf((Object) this, 43));
                return C60340gF.A00;
        }
    }
}
