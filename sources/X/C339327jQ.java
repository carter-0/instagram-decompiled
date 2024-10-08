package X;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.common.session.UserSession;

/* renamed from: X.7jQ  reason: invalid class name and case insensitive filesystem */
public final class C339327jQ implements C339337jR {
    public final /* synthetic */ UserSession A00;
    public final /* synthetic */ C339297jN A01;

    public C339327jQ(UserSession userSession, C339297jN r2) {
        this.A01 = r2;
        this.A00 = userSession;
    }

    public final void CwQ(AnonymousClass3NV r7) {
        int i;
        Drawable A002;
        C339297jN r4 = this.A01;
        r4.A04 = r7;
        ImageView imageView = r4.A01;
        if (!(imageView == null || (A002 = C39806AAd.A00(r4.A0B.getContext(), r4.A04, true)) == null)) {
            imageView.setImageDrawable(A002);
        }
        TextView textView = r4.A02;
        if (textView != null) {
            textView.setText(C39806AAd.A01(r4.A0B.getContext(), this.A00, r4.A04, true));
        }
        if (C278264wZ.A00(this.A00)) {
            C310336ap r3 = new C310336ap();
            Resources resources = r4.A0B.requireContext().getResources();
            switch (r7.ordinal()) {
                case 0:
                    i = 2131963864;
                    break;
                case 1:
                    i = 2131963861;
                    break;
                case 2:
                    i = 2131963869;
                    break;
                case 3:
                    i = 2131963852;
                    break;
                case 4:
                    i = 2131963854;
                    break;
                case 5:
                    i = 2131963849;
                    break;
                case 6:
                    i = 2131963857;
                    break;
                default:
                    throw new UnsupportedOperationException(AnonymousClass000.A00(208));
            }
            r3.A0D = resources.getString(i);
            1xC.A01.A00(new AnonymousClass3GP(r3.A00()));
        }
    }
}
