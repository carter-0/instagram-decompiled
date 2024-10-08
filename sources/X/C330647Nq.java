package X;

import android.view.View;
import android.widget.EditText;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;

/* renamed from: X.7Nq  reason: invalid class name and case insensitive filesystem */
public final class C330647Nq implements C2365734g {
    public final /* synthetic */ C330637Np A00;
    public final /* synthetic */ AnonymousClass7WY A01;

    public C330647Nq(C330637Np r1, AnonymousClass7WY r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DKS(View view) {
        Integer num;
        Float f;
        0qQ.A0B(view, 0);
        C330637Np r2 = this.A00;
        View requireViewById = view.requireViewById(R.id.thread_title_change_container);
        r2.A00 = requireViewById;
        if (!(requireViewById == null || (f = r2.A05.A03) == null)) {
            requireViewById.setAlpha(f.floatValue());
        }
        View view2 = r2.A00;
        if (view2 != null) {
            view2.setTranslationZ(1.0f);
            EditText editText = (EditText) view.requireViewById(R.id.new_thread_title);
            r2.A01 = editText;
            if (!(editText == null || (num = r2.A05.A04) == null)) {
                editText.setBackgroundColor(num.intValue());
            }
            AnonymousClass7WY r4 = this.A01;
            UserSession userSession = r4.A09;
            0Tu r7 = 0Tu.A05;
            if (182.A06(r7, userSession, 36317216957797228L)) {
                EditText editText2 = r2.A01;
                if (editText2 != null) {
                    editText2.setHint(2131960588);
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            EditText editText3 = r2.A01;
            if (editText3 != null) {
                editText3.setOnEditorActionListener(r4);
                View requireViewById2 = view.requireViewById(R.id.cancel_change_title);
                0qQ.A07(requireViewById2);
                if (182.A06(r7, userSession, 36317216957797228L)) {
                    requireViewById2.setContentDescription(r4.A06.requireContext().getString(2131960585));
                }
                AnonymousClass0fU.A00(new C330657Nr(r2, r4), requireViewById2);
                r4.A00 = new C330667Ns(r2);
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        throw new IllegalStateException("Required value was null.");
    }
}
