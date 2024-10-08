package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.JfA  reason: case insensitive filesystem */
public final class C60076JfA extends ConstraintLayout {
    public String A00;
    public boolean A01;
    public Drawable A02;
    public CharSequence A03;
    public String A04;
    public String A05;
    public final View A06 = findViewById(R.id.new_badge_stub);
    public final TextView A07 = DbU.A0G(this, R.id.description);
    public final TextView A08 = DbU.A0G(this, R.id.inline_subtitle);
    public final TextView A09 = Dba.A05(this);
    public final TextView A0A = Dba.A06(this);
    public final IgSimpleImageView A0B = JTP.A0T(this, R.id.chevron_icon);
    public final IgSimpleImageView A0C = JTP.A0T(this, R.id.clear_button);
    public final IgSimpleImageView A0D = JTP.A0T(this, R.id.icon);
    public final IgSimpleImageView A0E = JTP.A0T(this, R.id.info_icon);
    public final IgLinearLayout A0F = ((IgLinearLayout) requireViewById(R.id.app_list_container));
    public final IgLinearLayout A0G = ((IgLinearLayout) requireViewById(R.id.custom_inline_subtitle_container));

    public final void setAppListContainerItems(List list) {
        0qQ.A0B(list, 0);
        if (!list.isEmpty()) {
            IgLinearLayout igLinearLayout = this.A0F;
            igLinearLayout.removeAllViews();
            igLinearLayout.setVisibility(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                igLinearLayout.addView(JTO.A0H(it));
            }
        }
    }

    public final void setInlineSubtitleContainerItems(List list) {
        0qQ.A0B(list, 0);
        if (!list.isEmpty()) {
            IgLinearLayout igLinearLayout = this.A0G;
            igLinearLayout.removeAllViews();
            igLinearLayout.setVisibility(0);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                igLinearLayout.addView(JTO.A0H(it));
            }
        }
    }

    public final void A0D() {
        this.A0C.setVisibility(8);
        this.A0E.setVisibility(8);
        this.A0B.setVisibility(0);
    }

    public final IgSimpleImageView getArrowImageView() {
        return this.A0B;
    }

    public final CharSequence getDescription() {
        return this.A03;
    }

    public final TextView getDescriptionTextView() {
        return this.A07;
    }

    public final Drawable getIcon() {
        return this.A02;
    }

    public final View getIconImageView() {
        return this.A0D;
    }

    public final IgSimpleImageView getInfoIconImageView() {
        return this.A0E;
    }

    public final String getInlineSubtitle() {
        return this.A04;
    }

    public final TextView getInlineSubtitleTextView() {
        return this.A08;
    }

    public final View getNewBadgeView() {
        return this.A06;
    }

    public final boolean getShowDisabledState() {
        return this.A01;
    }

    public final String getSubtitle() {
        return this.A05;
    }

    public final String getTitle() {
        return this.A00;
    }

    public final TextView getTitleTextView() {
        return this.A0A;
    }

    public final void setDescription(CharSequence charSequence) {
        this.A03 = charSequence;
        TextView textView = this.A07;
        textView.setText(charSequence);
        int i = 0;
        if (charSequence == null || 00l.A0W(charSequence)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setIcon(Drawable drawable) {
        this.A02 = drawable;
        IgSimpleImageView igSimpleImageView = this.A0D;
        igSimpleImageView.setImageDrawable(drawable);
        int i = 0;
        if (drawable == null) {
            i = 8;
        }
        igSimpleImageView.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (X.00l.A0W(r5) != false) goto L_0x0011;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void setInlineSubtitle(java.lang.String r5) {
        /*
            r4 = this;
            r4.A04 = r5
            android.widget.TextView r3 = r4.A08
            r3.setText(r5)
            r2 = 0
            if (r5 == 0) goto L_0x0011
            boolean r1 = X.00l.A0W(r5)
            r0 = 0
            if (r1 == 0) goto L_0x0012
        L_0x0011:
            r0 = 1
        L_0x0012:
            r1 = 8
            if (r0 == 0) goto L_0x001a
            r3.setVisibility(r1)
        L_0x0019:
            return
        L_0x001a:
            r3.setVisibility(r2)
            android.view.View r0 = r4.A06
            if (r0 == 0) goto L_0x0019
            r0.setVisibility(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C60076JfA.setInlineSubtitle(java.lang.String):void");
    }

    public final void setShowDisabledState(boolean z) {
        this.A01 = z;
        TextView textView = this.A0A;
        float f = 0.3f;
        float f2 = 1.0f;
        if (z) {
            f2 = 0.3f;
        }
        textView.setAlpha(f2);
        TextView textView2 = this.A09;
        float f3 = 1.0f;
        if (this.A01) {
            f3 = 0.3f;
        }
        textView2.setAlpha(f3);
        TextView textView3 = this.A08;
        float f4 = 1.0f;
        if (this.A01) {
            f4 = 0.3f;
        }
        textView3.setAlpha(f4);
        IgSimpleImageView igSimpleImageView = this.A0D;
        if (!this.A01) {
            f = 1.0f;
        }
        igSimpleImageView.setAlpha(f);
    }

    public final void setSubtitle(String str) {
        this.A05 = str;
        TextView textView = this.A09;
        textView.setText(str);
        int i = 0;
        if (str == null || 00l.A0W(str)) {
            i = 8;
        }
        textView.setVisibility(i);
    }

    public final void setTitle(String str) {
        this.A00 = str;
        this.A0A.setText(str);
    }

    public C60076JfA(Context context) {
        super(new ContextThemeWrapper(context, R.style.ClipsShareOptionContainer));
        View.inflate(context, R.layout.layout_share_content_row_action_with_arrow, this);
        2eS.A01(this);
    }
}
