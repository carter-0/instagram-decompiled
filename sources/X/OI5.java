package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.ui.widget.textview.ComposerAutoCompleteTextView;

public final class OI5 {
    public final View A00;
    public final View A01;
    public final View A02;
    public final View A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgTextView A06;
    public final IgImageView A07;
    public final ComposerAutoCompleteTextView A08;
    public final View A09;

    public OI5(View view, C62320sa r5, 0sP r6) {
        View A0F = DbY.A0F(view, R.id.clips_reply_bar_stub);
        0qQ.A07(A0F);
        this.A03 = A0F;
        this.A06 = DbX.A0Z(A0F, R.id.reply_bar_title);
        this.A02 = AnonymousClass7TF.A0G(A0F, R.id.reply_bar_container);
        this.A00 = AnonymousClass7TF.A0G(A0F, R.id.reel_viewer_message_composer);
        ComposerAutoCompleteTextView composerAutoCompleteTextView = (ComposerAutoCompleteTextView) AnonymousClass7TF.A0F(A0F, R.id.reply_bar_edittext);
        this.A08 = composerAutoCompleteTextView;
        this.A05 = DbX.A0Z(A0F, R.id.reply_bar_send_button);
        this.A07 = DbX.A0b(A0F, R.id.reply_bar_emoji_button);
        this.A04 = DbX.A0Z(A0F, R.id.reply_bar_action_pill);
        View A0F2 = DbY.A0F(view, R.id.clips_background_dimmer_stub);
        this.A09 = A0F2;
        View A0G = AnonymousClass7TF.A0G(A0F2, R.id.background_dimmer);
        this.A01 = A0G;
        C71273OhE.A00(composerAutoCompleteTextView, r5, 27);
        C71439Oke.A01(A0G, 20, r6);
    }
}
