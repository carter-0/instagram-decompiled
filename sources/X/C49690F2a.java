package X;

import android.content.Context;
import com.instagram.igds.components.form.IgFormField;
import java.util.regex.Pattern;

/* renamed from: X.F2a  reason: case insensitive filesystem */
public final class C49690F2a {
    public C49346EuA A00;
    public boolean A01;
    public final Context A02;
    public final IgFormField A03;
    public final IgFormField A04;

    public C49690F2a(Context context, IgFormField igFormField, IgFormField igFormField2) {
        int A032 = DbW.A03(2, igFormField, igFormField2);
        this.A02 = context;
        this.A04 = igFormField;
        this.A03 = igFormField2;
        igFormField.setRuleChecker(new C50497Fcj(this, 2));
        igFormField.A0G(new C48054ESy(this, 4));
        IgFormField igFormField3 = this.A03;
        igFormField3.setRuleChecker(new C50497Fcj(this, A032));
        igFormField3.A0G(new C48054ESy(this, 5));
    }

    public final String A00() {
        Context context;
        int i;
        IgFormField igFormField = this.A04;
        String A0o = DbU.A0o(igFormField);
        String A0o2 = DbU.A0o(this.A03);
        Pattern pattern = 0mp.A01;
        if (A0o == null || A0o.length() < 6 || A0o2 == null || A0o2.length() < 6) {
            context = igFormField.getContext();
            i = 2131969198;
        } else if (A0o.equals(A0o2)) {
            return null;
        } else {
            context = igFormField.getContext();
            i = 2131969203;
        }
        return context.getString(i);
    }
}
