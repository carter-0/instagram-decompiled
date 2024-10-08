package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgLinearLayout;

public final class KHS extends IgLinearLayout {
    public View.OnClickListener A00;
    public boolean A01;
    public boolean A02;
    public final TextView A03 = DbU.A0G(this, R.id.audio_subtitle);
    public final TextView A04 = DbU.A0G(this, R.id.audio_title);
    public final ImageView A05;
    public final ImageView A06;
    public final UserSession A07;
    public final AnonymousClass3NM A08;
    public final boolean A09;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public KHS(Context context, UserSession userSession, Integer num, int i) {
        super(context, (AttributeSet) null, 0);
        TextView textView;
        int i2;
        0qQ.A0B(num, 5);
        this.A07 = userSession;
        boolean z = true;
        setOrientation(1);
        Context context2 = getContext();
        View.inflate(context2, R.layout.music_tray_item_layout, this);
        ImageView A0F = DbU.A0F(this, R.id.audio_image);
        this.A05 = A0F;
        this.A06 = DbU.A0F(this, R.id.audio_selected_icon);
        z = num != AnonymousClass05K.A01 ? false : z;
        this.A09 = z;
        if (z) {
            TextView textView2 = this.A04;
            textView2.setTextAppearance(R.style.igds_emphasized_body_2);
            DbY.A12(textView2, context2);
            textView = this.A03;
            i2 = R.style.PrivacyTextStyle;
        } else {
            TextView textView3 = this.A04;
            textView3.setTextAppearance(R.style.PrivacyTextStyle);
            DbT.A17(context2, textView3, R.color.canvas_bottom_sheet_description_text_color);
            textView = this.A03;
            i2 = R.style.igds_emphasized_body_2;
        }
        textView.setTextAppearance(i2);
        0nA.A0V(A0F, i);
        0nA.A0f(A0F, i);
        AnonymousClass3NG A0m = AnonymousClass7TE.A0m(A0F);
        A0m.A04 = new C61685KHt(this, 28);
        A0m.A02 = 0.92f;
        A0m.A07 = false;
        this.A08 = A0m.A00();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0013, code lost:
        if (X.JWB.A01(r3.A07) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void A00(android.graphics.drawable.Drawable r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
            X.0qQ.A0B(r4, r0)
            android.content.Context r2 = X.AnonymousClass7TE.A0S(r3)
            boolean r0 = r3.A09
            if (r0 == 0) goto L_0x0015
            com.instagram.common.session.UserSession r0 = r3.A07
            boolean r1 = X.JWB.A01(r0)
            r0 = 1
            if (r1 == 0) goto L_0x0016
        L_0x0015:
            r0 = 0
        L_0x0016:
            X.Jbq r1 = new X.Jbq
            r1.<init>(r2, r4, r0)
            boolean r0 = r3.A01
            r1.A00 = r0
            r1.A00 = r5
            android.widget.ImageView r0 = r3.A05
            r0.setImageDrawable(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.KHS.A00(android.graphics.drawable.Drawable, boolean):void");
    }

    public final void setSubtitle(String str) {
        0qQ.A0B(str, 0);
        this.A03.setText(str);
    }

    public final void setTalkback(String str) {
        0qQ.A0B(str, 0);
        this.A05.setContentDescription(str);
    }

    public final void setTitle(String str) {
        0qQ.A0B(str, 0);
        this.A04.setText(str);
    }

    public final View.OnClickListener getItemOnClickListener() {
        return this.A00;
    }

    public final boolean getItemSelected() {
        return this.A02;
    }

    public void setSelected(boolean z) {
        this.A02 = z;
        this.A05.setSelected(z);
        this.A04.setSelected(z);
        this.A03.setSelected(z);
        if (this.A09) {
            this.A06.setVisibility(DbW.A01(z ? 1 : 0));
        }
    }

    public final void setItemHighlightable(boolean z) {
        this.A01 = z;
    }

    public final void setItemOnClickListener(View.OnClickListener onClickListener) {
        this.A00 = onClickListener;
    }

    public final void setItemSelected(boolean z) {
        this.A02 = z;
    }
}
