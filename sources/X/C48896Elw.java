package X;

import android.app.Activity;
import android.os.Bundle;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.Elw  reason: case insensitive filesystem */
public abstract class C48896Elw {
    public static final void A00(Activity activity, UserSession userSession, C42829Bjb bjb, String str) {
        Enum enumR;
        ImmutableList optionalCompactedTreeListField;
        0qQ.A0B(str, 2);
        Bundle A09 = DbY.A09(userSession);
        A09.putString("media_id", str);
        Class<C42828Bja> cls = C42828Bja.class;
        String A00 = AnonymousClass000.A00(1945);
        C250663lr A03 = bjb.A03(cls, A00, 1677196193);
        ArrayList arrayList = null;
        if (A03 != null) {
            enumR = A03.getOptionalEnumField(0, AnonymousClass000.A00(1649), EX2.UNSET_OR_UNRECOGNIZED_ENUM_VALUE);
        } else {
            enumR = null;
        }
        A09.putString("media_eligibility", String.valueOf(enumR));
        C250663lr A032 = bjb.A03(cls, A00, 1677196193);
        if (!(A032 == null || (optionalCompactedTreeListField = A032.getOptionalCompactedTreeListField(1, "prompts", BjZ.class, 237858497)) == null)) {
            arrayList = AnonymousClass7TG.A0r(optionalCompactedTreeListField);
            Iterator it = optionalCompactedTreeListField.iterator();
            while (it.hasNext()) {
                arrayList.add(C41845B3m.A0V(it).A07("prompt_text"));
            }
        }
        A09.putString("prompts", String.valueOf(arrayList));
        A09.putString("launcher_value", String.valueOf(182.A06(0Tu.A06, userSession, 36327494814546395L)));
        ERW erw = new ERW();
        C331127Pr A0V = DbV.A0V(A09, erw, userSession);
        A0V.A0d = "Content Deep Dives";
        DbU.A0y(activity, erw, A0V);
    }
}
