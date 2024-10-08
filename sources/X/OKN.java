package X;

import android.content.Context;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class OKN {
    public final Context A00;
    public final UserSession A01;

    public final List A00(boolean z) {
        String A04 = 182.A04(0Tu.A05, this.A01, 36880682308600153L);
        if (A04.length() == 0) {
            A04 = "astronaut riding a horse, bird wearing sunglasses, skateboarding cat, ballerina with a giraffe, elephant riding a bicycle, rainbow birthday cake, unicorn over the moon, zombie chef, racoon on a motorcycle, a cat in space, alien birthday party, panda picnic, zoo disco, dinosaur roller disco, dog and cat dancing, car full of clowns, mermaid cowboy, pizza playing basketball, pirate under a rainbow, corgi dance party, robot pianist, avocado with sunglasses, space soup, fireworks at sunset";
        }
        List A18 = DbV.A18(A04, ",");
        ArrayList<Object> A0p = AnonymousClass7TF.A0p(A18);
        Iterator it = A18.iterator();
        while (it.hasNext()) {
            A0p.add(DbV.A12(AnonymousClass7TE.A18(it)));
        }
        if (z) {
            ArrayList A0p2 = AnonymousClass7TF.A0p(A0p);
            for (Object A0h : A0p) {
                A0p2.add(DbW.A0h(this.A00, A0h, 2131958603));
            }
            A0p = A0p2;
        }
        return 0jo.A1G(A0p);
    }

    public OKN(Context context, UserSession userSession) {
        AnonymousClass7TG.A1O(context, userSession);
        this.A00 = context;
        this.A01 = userSession;
    }
}
