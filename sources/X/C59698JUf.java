package X;

import com.instagram.model.people.PeopleTag;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.JUf  reason: case insensitive filesystem */
public abstract class C59698JUf {
    public static final List A00(String str) {
        PeopleTag peopleTag;
        0qQ.A0B(str, 0);
        if (str.equals("")) {
            return 0sn.A00;
        }
        List<String> A18 = DbV.A18(str, "␞");
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (String A00 : A18) {
            try {
                peopleTag = LJJ.parseFromJson(16P.A00(A00));
            } catch (IOException e) {
                0kD.A06("PeopleTagListConverter", "Failed to deserialize PeopleTag from Clips draft", e);
                peopleTag = null;
            }
            if (peopleTag != null) {
                A1C.add(peopleTag);
            }
        }
        return A1C;
    }
}
