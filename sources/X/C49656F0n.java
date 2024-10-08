package X;

import android.view.View;
import android.widget.LinearLayout;
import com.instagram.android.R;
import com.instagram.share.facebook.widget.FindPeopleButton;

/* renamed from: X.F0n  reason: case insensitive filesystem */
public final class C49656F0n {
    public final View A00;
    public final View A01;
    public final LinearLayout A02;
    public final FindPeopleButton A03;
    public final FindPeopleButton A04;
    public final FindPeopleButton A05;
    public final FindPeopleButton A06;
    public final FindPeopleButton A07;

    public C49656F0n(View view) {
        0qQ.A0B(view, 1);
        this.A01 = view;
        this.A05 = (FindPeopleButton) AnonymousClass7TF.A0F(view, R.id.facebook_button);
        this.A03 = (FindPeopleButton) AnonymousClass7TF.A0F(view, R.id.contacts_button);
        this.A02 = (LinearLayout) AnonymousClass7TF.A0F(view, R.id.redesigned_contacts_button);
        this.A07 = (FindPeopleButton) AnonymousClass7TF.A0F(view, R.id.sync_button);
        this.A06 = (FindPeopleButton) AnonymousClass7TF.A0F(view, R.id.share_profile_button);
        this.A04 = (FindPeopleButton) AnonymousClass7TF.A0F(view, R.id.discover_top_accounts_button);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.row_find_people_buttons_bottom_divider);
    }
}
