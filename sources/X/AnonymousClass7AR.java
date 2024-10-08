package X;

import android.content.Context;
import android.text.method.LinkMovementMethod;
import android.view.View;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.model.direct.messageid.MessageIdentifier;

/* renamed from: X.7AR  reason: invalid class name */
public final class AnonymousClass7AR implements C328007Db {
    public final Context A00;
    public final IgTextView A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(new C377139Kr(this, 46));
    public final AnonymousClass7XM A03;

    public AnonymousClass7AR(Context context, IgTextView igTextView, AnonymousClass7XM r5) {
        0qQ.A0B(igTextView, 3);
        this.A00 = context;
        this.A03 = r5;
        this.A01 = igTextView;
    }

    public final void A00(C3266677r r9) {
        String str;
        CharSequence charSequence = r9.A04;
        if (charSequence != null && charSequence.length() != 0) {
            IgTextView igTextView = this.A01;
            igTextView.setMovementMethod(LinkMovementMethod.getInstance());
            igTextView.setHighlightColor(0);
            igTextView.setVisibility(0);
            AnonymousClass7XM r2 = this.A03;
            Context context = this.A00;
            MessageIdentifier messageIdentifier = r9.A03;
            if (messageIdentifier != null) {
                str = messageIdentifier.A01;
            } else {
                str = null;
            }
            igTextView.setText(((AnonymousClass7AL) this.A02.getValue()).A00(r2.CnI(context, charSequence, str, r9.A00, r9.A07), r9.A02, r9.A06, r9.A05, r9.A08));
            igTextView.setTextColor(r9.A01);
        }
    }

    public final View BJd() {
        return this.A01;
    }
}
