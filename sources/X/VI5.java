package X;

import java.util.ArrayList;
import java.util.List;

public abstract class VI5 {
    public static final ArrayList A00(String str, List list) {
        X75 x75;
        ArrayList<C18441Vrk> arrayList = new ArrayList<>();
        for (Object next : list) {
            C18441Vrk vrk = (C18441Vrk) next;
            if (0qQ.A0K(vrk.A01, str) && (vrk instanceof X75) && (x75 = (X75) vrk) != null && x75.CL0()) {
                arrayList.add(next);
            }
        }
        ArrayList A0r = AnonymousClass7TG.A0r(arrayList);
        for (C18441Vrk vrk2 : arrayList) {
            0qQ.A0C(vrk2, "null cannot be cast to non-null type com.instagram.survey.structuredsurvey.model.AnswerableItem<*>");
            A0r.add(((X75) vrk2).Abu());
        }
        ArrayList arrayList2 = new ArrayList(A0r);
        if (!arrayList2.isEmpty()) {
            return arrayList2;
        }
        return null;
    }
}
