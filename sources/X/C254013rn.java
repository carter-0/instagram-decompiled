package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.common.ui.widget.imageview.CircularImageView;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.direct.inbox.notes.ui.NoteBubbleView;
import com.instagram.ui.widget.bouncyufibutton.IgBouncyUfiButtonImageView;
import com.instagram.ui.widget.roundedcornerlayout.RoundedCornerConstraintLayout;

/* renamed from: X.3rn  reason: invalid class name and case insensitive filesystem */
public final class C254013rn extends C249703kE {
    public Activity A00;
    public ConstraintLayout A01;
    public IgSimpleImageView A02;
    public IgTextView A03;
    public IgTextView A04;
    public IgTextView A05;
    public IgTextView A06;
    public CircularImageView A07;
    public IgImageView A08;
    public NoteBubbleView A09;
    public C247453gM A0A;
    public AnonymousClass3W1 A0B;
    public RoundedCornerConstraintLayout A0C;
    public final View A0D;
    public final ViewGroup A0E;
    public final ViewStub A0F;
    public final ViewStub A0G;
    public final IgSimpleImageView A0H;
    public final IgSimpleImageView A0I;
    public final C252063oV A0J;
    public final C258453z5 A0K;
    public final C256053v9 A0L;
    public final C258433z0 A0M;
    public final IgBouncyUfiButtonImageView A0N;
    public final IgBouncyUfiButtonImageView A0O;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C254013rn(View view, boolean z) {
        super(view);
        C258453z5 r1;
        0qQ.A0B(view, 1);
        this.A0D = view;
        View requireViewById = view.requireViewById(R.id.row_feed_button_like);
        0qQ.A07(requireViewById);
        this.A0N = (IgBouncyUfiButtonImageView) requireViewById;
        View requireViewById2 = view.requireViewById(R.id.row_feed_button_comment);
        0qQ.A07(requireViewById2);
        this.A0H = (IgSimpleImageView) requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.row_feed_button_share);
        0qQ.A07(requireViewById3);
        this.A0I = (IgSimpleImageView) requireViewById3;
        View requireViewById4 = view.requireViewById(R.id.content_notes_button_share);
        0qQ.A07(requireViewById4);
        this.A0G = (ViewStub) requireViewById4;
        this.A04 = view.findViewById(R.id.content_notes_new_text_view);
        View requireViewById5 = view.requireViewById(R.id.row_feed_button_save);
        0qQ.A07(requireViewById5);
        this.A0O = (IgBouncyUfiButtonImageView) requireViewById5;
        this.A0E = (ViewGroup) view.findViewById(R.id.row_feed_view_group_ufi_buttons);
        this.A05 = view.findViewById(R.id.row_feed_like_count);
        this.A03 = view.findViewById(R.id.row_feed_comment_count);
        this.A06 = view.findViewById(R.id.row_feed_share_count);
        View findViewById = view.findViewById(R.id.row_feed_view_group_buttons);
        0qQ.A07(findViewById);
        this.A0M = new C258433z0(findViewById);
        View findViewById2 = view.findViewById(R.id.larger_cta_bottom_buffer);
        0qQ.A07(findViewById2);
        this.A0L = new C256053v9(findViewById2);
        this.A0F = (ViewStub) view.findViewById(R.id.row_feed_carousel_indicator_stub);
        if (z) {
            r1 = new C258453z5(view);
        } else {
            View findViewById3 = view.findViewById(R.id.row_feed_carousel_indicator_stub);
            0qQ.A07(findViewById3);
            r1 = new C258453z5((ViewStub) findViewById3, view);
        }
        this.A0K = r1;
        C252063oV A012 = 2b1.A01(view.requireViewById(R.id.visual_search_icon_stub), false, false);
        this.A0J = A012;
        A012.EeU(new AnonymousClass47A(this));
    }
}
