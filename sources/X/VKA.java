package X;

import android.content.res.Resources;
import com.instagram.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class VKA {
    public static List A00;

    public static ArrayList A00(Resources resources) {
        List list = A00;
        if (list == null) {
            String[] stringArray = resources.getStringArray(R.array.quiz_sticker_answer_row_hint_text);
            list = Arrays.asList(new C21026XAf[]{new C15057UNa((Boolean) null, (Integer) null, stringArray[0], (String) null), new C15057UNa((Boolean) null, (Integer) null, stringArray[1], (String) null)});
            A00 = list;
        }
        return new ArrayList(list);
    }
}
