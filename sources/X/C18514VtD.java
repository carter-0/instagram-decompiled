package X;

import android.content.Context;
import android.text.InputFilter;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgEditText;
import com.instagram.common.ui.base.IgTextView;

/* renamed from: X.VtD  reason: case insensitive filesystem */
public final class C18514VtD {
    public C20854X1g A00 = ((C20854X1g) A00(this).A0G.getValue());
    public final Context A01;
    public final View A02;
    public final View A03;
    public final TextView A04;
    public final AnonymousClass07Z A05;
    public final UserSession A06;
    public final IgEditText A07;
    public final IgTextView A08;
    public final AnonymousClass0eM A09;

    public static final U91 A00(C18514VtD vtD) {
        return (U91) vtD.A09.getValue();
    }

    public C18514VtD(View view, AnonymousClass07Z r6, AnonymousClass07g r7, UserSession userSession) {
        C51974G9v.A1L(userSession, r7, view);
        this.A06 = userSession;
        this.A05 = r6;
        this.A01 = view.getContext();
        View requireViewById = view.requireViewById(R.id.reel_viewer_message_composer);
        DbU.A11(this.A01, requireViewById, R.drawable.story_message_composer_background);
        this.A02 = requireViewById;
        View requireViewById2 = view.requireViewById(R.id.reel_viewer_message_composer_container);
        DbT.A16(this.A01, requireViewById2, R.color.black_65_transparent);
        WB0.A00(requireViewById2, 17, this);
        this.A03 = requireViewById2;
        View requireViewById3 = view.requireViewById(R.id.reel_viewer_message_composer_text);
        IgEditText igEditText = (IgEditText) requireViewById3;
        Context context = igEditText.getContext();
        igEditText.setHintTextColor(context.getColor(2Yu.A0A(context)));
        igEditText.setFilters(new InputFilter[]{new InputFilter.LengthFilter(context.getResources().getInteger(R.integer.max_message_length))});
        igEditText.addTextChangedListener(new W7b(this, 16));
        igEditText.setOnFocusChangeListener(new WBI(this, 9));
        0qQ.A07(requireViewById3);
        this.A07 = igEditText;
        View requireViewById4 = view.requireViewById(R.id.reel_viewer_message_composer_text_send_btn);
        TextView textView = (TextView) requireViewById4;
        textView.setTypeface(AnonymousClass7TG.A0N(AnonymousClass7TE.A0S(textView)));
        WB0.A00(textView, 18, this);
        0qQ.A07(requireViewById4);
        this.A04 = textView;
        this.A08 = DbX.A0Z(view, R.id.reel_viewer_composer_top_message);
        this.A09 = C49154EqL.A00(new WEG(), r7, new 0Yh(U91.class));
        C13991Tnr.A1K(this, AnonymousClass07a.A00(r6), 41);
    }
}
