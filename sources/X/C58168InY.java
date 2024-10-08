package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;

/* renamed from: X.InY  reason: case insensitive filesystem */
public final class C58168InY extends 03J implements 0sG {
    public final int A00;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58168InY(Object obj, int i) {
        super(7, obj, HPW.class, "navigateToAddFact", "navigateToAddFact(Lcom/instagram/base/fragment/IgFragment;Lcom/instagram/common/session/Session;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", 1);
        this.A00 = i;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        0eP A1L;
        0lg r4 = (0lg) obj;
        String str = (String) obj2;
        AnonymousClass7TG.A1N(r4, str);
        Object obj8 = obj6;
        Fragment fragment = (Fragment) C51965G9l.A0s(obj8, this, 5);
        0qQ.A0B(fragment, 0);
        Object obj9 = obj4;
        if (str.equals("SINGULAR_FACT")) {
            A1L = AnonymousClass7TE.A1L((Object) null, obj9);
        } else {
            Object obj10 = obj5;
            if (str.equals("AFFILIATE_LINKS")) {
                A1L = AnonymousClass7TE.A1L(obj10, obj9);
            } else {
                A1L = AnonymousClass7TE.A1L(obj9, obj10);
            }
        }
        Object obj11 = A1L.A00;
        Object obj12 = A1L.A01;
        Bundle A002 = Q21.A00(AnonymousClass7TE.A1L(C66579MXk.A00(20), HLC.POP_FRAGMENT), AnonymousClass7TE.A1L("creator_ai_add_fact_content_type", str), AnonymousClass7TE.A1L(C66579MXk.A00(116), obj11), AnonymousClass7TE.A1L(C66579MXk.A00(282), obj12), AnonymousClass7TE.A1L(AnonymousClass000.A00(4668), obj3), AnonymousClass7TE.A1L("creator_ai_creator_fbid", obj8), AnonymousClass7TE.A1L("creator_ai_entry_point_extra", obj7));
        H0U h0u = new H0U();
        h0u.setArguments(A002);
        C309516Yo A0H = DbW.A0H(fragment, r4);
        A0H.A0B((Bundle) null, h0u);
        A0H.A04();
        return C60340gF.A00;
    }
}
