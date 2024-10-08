package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.leadgen.core.api.LeadForm;
import com.instagram.leadgen.core.api.LeadGenInfoFieldData;
import java.util.List;

/* renamed from: X.Vqc  reason: case insensitive filesystem */
public abstract class C18376Vqc {
    public static final List A00 = 0sr.A1P(new C16604Uxy[]{C16604Uxy.A06, C16604Uxy.A04, C16604Uxy.A07});

    public static final String A00(FragmentActivity fragmentActivity, LeadForm leadForm) {
        0qQ.A0B(leadForm, 0);
        List<LeadGenInfoFieldData> list = leadForm.A05;
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (LeadGenInfoFieldData leadGenInfoFieldData : list) {
            if (leadGenInfoFieldData.A02) {
                i++;
            } else {
                sb.append(leadGenInfoFieldData.A00);
                sb.append(", ");
            }
        }
        if (i > 0) {
            sb.append(DbY.A0d(fragmentActivity.getResources(), i, R.plurals.lead_gen_available_forms_number_of_custom_questions));
        } else {
            sb.setLength(sb.length() - 2);
        }
        return DbT.A10(sb);
    }
}
