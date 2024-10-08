package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.ui.widget.textview.IgAutoCompleteTextView;

public final class LBG {
    public final View A00;
    public final View A01;
    public final ViewStub A02;
    public final ScrollView A03;
    public final TextView A04;
    public final TextView A05;
    public final RecyclerView A06;
    public final L97 A07;
    public final C63892LAv A08;
    public final I22 A09;
    public final IgAutoCompleteTextView A0A;
    public final boolean A0B;

    public LBG(View view, UserSession userSession, String str) {
        I22 h9c;
        C71492dQ r3;
        AnonymousClass7TG.A1Q(userSession, str);
        this.A00 = AnonymousClass7TF.A0G(view, R.id.content_overlay);
        this.A02 = JTR.A0X(view, R.id.warning_nudge);
        this.A0A = (IgAutoCompleteTextView) AnonymousClass7TF.A0F(view, R.id.caption_input_text_view);
        boolean A062 = 182.A06(0Tu.A05, userSession, 36324746035736913L);
        this.A0B = A062;
        if (A062) {
            h9c = new H9B(view, userSession);
        } else {
            h9c = new H9C(view, userSession, str);
        }
        IgAutoCompleteTextView igAutoCompleteTextView = this.A0A;
        ViewGroup.LayoutParams layoutParams = igAutoCompleteTextView.getLayoutParams();
        if ((layoutParams instanceof C71492dQ) && (r3 = (C71492dQ) layoutParams) != null) {
            r3.A0t = this.A0B ? R.id.auto_play_clips_preview : R.id.cover_photo_preview;
            igAutoCompleteTextView.setLayoutParams(r3);
        }
        JTS.A0y(view, this.A0B ? R.id.cover_photo_preview : R.id.auto_play_clips_preview);
        this.A09 = h9c;
        this.A08 = new C63892LAv(view);
        this.A07 = new L97(AnonymousClass7TF.A0G(view, R.id.caption_suggestion_container));
        this.A03 = (ScrollView) AnonymousClass7TF.A0F(view, R.id.scroll_view);
        this.A06 = JTR.A0c(view, R.id.caption_add_on_recyclerview);
        this.A04 = AnonymousClass7TG.A0R(view, R.id.poll_preview_text);
        this.A05 = AnonymousClass7TG.A0R(view, R.id.prompt_footnote_text);
        this.A01 = AnonymousClass7TE.A0b(view, R.id.followers_share_content_rows_disabled_overlay);
    }
}
