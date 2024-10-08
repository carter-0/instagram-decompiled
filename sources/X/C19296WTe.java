package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.feed.ui.text.LinkTextView;

/* renamed from: X.WTe  reason: case insensitive filesystem */
public final class C19296WTe implements C2365734g {
    public final int A00;
    public final Object A01;

    public C19296WTe(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DKS(View view) {
        switch (this.A00) {
            case 0:
                ((VTD) this.A01).A00 = new C17727Vcw(view);
                return;
            case 1:
                C17590Vai vai = (C17590Vai) this.A01;
                vai.A00 = view.getContext();
                vai.A03 = (LinkTextView) view.findViewById(R.id.fundraiser_sticker_consumption_sheet_recipient_biography);
                vai.A01 = AnonymousClass7TE.A0d(view, R.id.fundraiser_sticker_consumption_sheet_recipient_external_url);
                vai.A02 = AnonymousClass7TE.A0d(view, R.id.fundraiser_sticker_consumption_sheet_recipient_follow_context);
                vai.A04 = new VTD(DbY.A0T(view, R.id.fundraiser_sticker_recipient_header_neue_stub));
                return;
            case 2:
                0qQ.A0B(view, 0);
                C14888UDq uDq = (C14888UDq) this.A01;
                uDq.A01 = AnonymousClass7TE.A0d(view, R.id.attribution);
                uDq.A00 = AnonymousClass7TE.A0d(view, R.id.attribution_shadow);
                return;
            default:
                0qQ.A0B(view, 0);
                UEA uea = (UEA) this.A01;
                uea.A03 = DbU.A0G(view, R.id.hscroll_header_title);
                uea.A02 = DbU.A0G(view, R.id.hscroll_header_title_divider);
                uea.A01 = DbU.A0G(view, R.id.hscroll_header_title_action);
                uea.A00 = DbU.A0G(view, R.id.hscroll_header_button);
                return;
        }
    }
}
