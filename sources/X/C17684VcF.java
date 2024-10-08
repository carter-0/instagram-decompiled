package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.VcF  reason: case insensitive filesystem */
public final class C17684VcF {
    public String A00;
    public final View A01;
    public final IgSimpleImageView A02;
    public final IgTextView A03;
    public final IgTextView A04;
    public final IgTextView A05;
    public final IgdsButton A06;
    public final Integer A07;
    public final String A08;
    public final String A09;

    public C17684VcF(View view, Integer num, String str, String str2) {
        AnonymousClass7TG.A1O(view, str);
        this.A01 = view;
        this.A08 = str;
        this.A09 = str2;
        this.A07 = num;
        this.A02 = (IgSimpleImageView) AnonymousClass7TE.A0b(view, R.id.tombstone_dismiss);
        this.A03 = JTO.A0X(view, R.id.tombstone_learn_more_text);
        this.A06 = (IgdsButton) view.findViewById(R.id.tombstone_learn_more_button);
        this.A04 = JTO.A0X(view, R.id.tombstone_subtitle_text);
        this.A05 = JTO.A0X(view, R.id.tombstone_title_text);
    }
}
