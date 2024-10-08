package X;

import android.app.Activity;
import android.view.View;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgCheckBox;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.HKc  reason: case insensitive filesystem */
public final class C54593HKc extends C53110Gii {
    public String A00 = "";
    public final int A01;
    public final Activity A02;
    public final TextView A03;
    public final TextView A04;
    public final AnonymousClass07Z A05;
    public final AnonymousClass0iw A06;
    public final UserSession A07;
    public final IgCheckBox A08;
    public final IgImageView A09;
    public final IgImageView A0A;
    public final IgImageView A0B;
    public final 1Xj A0C;
    public final AnonymousClass0eM A0D;
    public final 0sP A0E;
    public final boolean A0F;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C54593HKc(Activity activity, View view, AnonymousClass07Z r6, AnonymousClass0iw r7, UserSession userSession, 1Xj r9, 0sP r10, boolean z) {
        super(view);
        0qQ.A0B(view, 1);
        this.A02 = activity;
        this.A07 = userSession;
        this.A0C = r9;
        this.A06 = r7;
        this.A05 = r6;
        this.A0F = z;
        this.A0E = r10;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.caption_text);
        this.A03 = A0R;
        this.A04 = AnonymousClass7TG.A0R(view, R.id.username_text);
        this.A09 = DbX.A0b(view, R.id.image);
        this.A0B = DbX.A0b(view, R.id.source_type_icon);
        this.A0A = DbX.A0b(view, R.id.navigate_to_media_button);
        this.A08 = (IgCheckBox) AnonymousClass7TF.A0F(view, R.id.save_button);
        this.A01 = AnonymousClass7TE.A0C(DbU.A05(view));
        this.A0D = AnonymousClass0eN.A00(0eO.A02, C58711IwK.A00(this, 31));
        AnonymousClass4Ed.A04(A0R);
    }

    public static final void A00(H3S h3s, C54593HKc hKc) {
        hKc.A03.setText(h3s.A02);
        TextView textView = hKc.A04;
        textView.setText(h3s.A05);
        textView.setVisibility(0);
        String url = h3s.A01.getUrl();
        0qQ.A07(url);
        int length = url.length();
        IgImageView igImageView = hKc.A09;
        if (length == 0) {
            igImageView.setImageDrawable(C51965G9l.A0D(AnonymousClass7TF.A03(DbS.A07(hKc), R.attr.igds_color_photo_placeholder)));
        } else {
            igImageView.setUrl(h3s.A01, hKc.A06);
        }
    }
}
