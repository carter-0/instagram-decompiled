package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.widget.EditText;
import com.instagram.android.R;

/* renamed from: X.F2l  reason: case insensitive filesystem */
public final class C49700F2l {
    public C49347EuB A00;
    public boolean A01;
    public boolean A02;
    public final Drawable A03;
    public final Drawable A04;
    public final EditText A05;
    public final EditText A06;

    public final boolean A00() {
        String A0f = AnonymousClass7TF.A0f(this.A06);
        String A0f2 = AnonymousClass7TF.A0f(this.A05);
        if (TextUtils.isEmpty(A0f) || TextUtils.isEmpty(A0f2)) {
            return false;
        }
        return true;
    }

    public C49700F2l(Resources resources, EditText editText, EditText editText2) {
        this.A06 = editText;
        this.A05 = editText2;
        this.A03 = resources.getDrawable(R.drawable.profile_glyph_password);
        this.A04 = resources.getDrawable(R.drawable.profile_glyph_password_red);
        EditText editText3 = this.A06;
        FPM.A00(editText3, 10, this);
        editText3.addTextChangedListener(new C48054ESy(this, 2));
        EditText editText4 = this.A05;
        FPM.A00(editText4, 11, this);
        editText4.addTextChangedListener(new C48054ESy(this, 3));
    }
}
