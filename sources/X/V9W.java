package X;

import android.view.View;
import java.lang.ref.Reference;

public abstract class V9W {
    public static final Object A00(C307896Rx r4, AnonymousClass6Tm r5) {
        C15667UgY ugY;
        Reference reference;
        C15667UgY ugY2;
        0qQ.A0C(r5.A01(), C66579MXk.A00(0));
        int A04 = DbW.A04(r5.A02(), "null cannot be cast to non-null type kotlin.Number");
        C308206Td.A0B(r4);
        int i = C17151VKd.A00;
        if (A04 != i) {
            if (!(i == -1 || (reference = (Reference) C51968G9o.A0z(C17151VKd.A01, i)) == null || (ugY2 = (C15667UgY) reference.get()) == null)) {
                ugY2.A0T().A02("scroll");
            }
            Reference reference2 = (Reference) C51968G9o.A0z(C17151VKd.A01, A04);
            if (reference2 == null || (ugY = (C15667UgY) reference2.get()) == null) {
                C17151VKd.A00 = -1;
                return null;
            }
            C17151VKd.A00 = A04;
            C18065Vkr A0T = ugY.A0T();
            1Xj A0R = ugY.A0R();
            A0T.A00(A0R);
            View view = ugY.A00;
            if (view != null) {
                ugY.A00 = view;
                ((C234372xl) ugY.A03.getValue()).start();
                ugY.A0T().A00(A0R);
                ugY.A0U(true);
            } else {
                0qQ.A0F("viewContent");
                throw AnonymousClass00P.createAndThrow();
            }
        }
        return null;
    }
}
