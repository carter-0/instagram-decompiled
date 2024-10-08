package X;

import com.instagram.igds.components.form.IgFormField;
import java.util.Map;

/* renamed from: X.RgW  reason: case insensitive filesystem */
public abstract class C9774RgW {
    public static final void A00(IgFormField igFormField, String str, Map map) {
        String A12 = DbV.A12(igFormField.getText().toString());
        if (str.length() != 0 && A12.length() != 0) {
            map.put(str, A12);
        }
    }
}
