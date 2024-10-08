package X;

import android.content.Context;
import android.content.res.Resources;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.Tup  reason: case insensitive filesystem */
public final class C14360Tup implements C230842qN {
    public long A00;
    public EditText A01;
    public final Integer A02 = AnonymousClass05K.A00;

    public final int CGx(Context context, UserSession userSession) {
        0qQ.A0B(context, 0);
        EditText editText = this.A01;
        int i = 0;
        if (editText == null) {
            return 0;
        }
        Resources resources = context.getResources();
        if (resources != null) {
            i = resources.getDimensionPixelOffset(R.dimen.abc_select_dialog_padding_start_material) / 2;
        }
        return editText.getPaddingStart() + i;
    }

    public final Integer Aw1() {
        return this.A02;
    }

    public final int CHU(Context context) {
        EditText editText = this.A01;
        if (editText != null) {
            return editText.getHeight() + (editText.getPaddingBottom() / 2);
        }
        return 0;
    }

    public final boolean CTz() {
        return false;
    }

    public final long EKO() {
        return this.A00;
    }
}
