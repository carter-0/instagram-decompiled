package X;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.igds.components.button.IgdsButton;

/* renamed from: X.52D  reason: invalid class name */
public abstract class AnonymousClass52D {
    public AnonymousClass523 A00;

    public void A02(String str, View.OnClickListener onClickListener) {
    }

    public void A01(AnonymousClass523 r8) {
        if (this instanceof AnonymousClass52C) {
            AnonymousClass52C r2 = (AnonymousClass52C) this;
            AnonymousClass523 r0 = r2.A00;
            if (r0 != null) {
                r0.A05.removeUpdateListener(r2.A00);
            }
            r2.A00 = r8;
            ((AnonymousClass528) r2.A03).A00(r8.A00);
            AnonymousClass523 r02 = r2.A00;
            if (r02 != null) {
                r02.A05.addUpdateListener(r2.A00);
                return;
            }
            return;
        }
        AnonymousClass52F r6 = (AnonymousClass52F) this;
        r6.A01.getLayoutParams().height = -2;
        IgImageView igImageView = r6.A03;
        Context context = igImageView.getContext();
        0qQ.A07(context);
        int[] iArr = new int[5];
        C267014am.A03(context, (AttributeSet) null, iArr, R.style.GradientPatternStyle);
        igImageView.setImageDrawable(AnonymousClass3JT.A04(context, iArr, R.drawable.instagram_star_pano_filled_12));
        IgImageView igImageView2 = r6.A04;
        igImageView2.setImageDrawable(0mk.A00(igImageView2.getContext(), R.drawable.instagram_chevron_right_pano_outline_12));
    }

    public void A03(String str, View.OnClickListener onClickListener) {
        IgdsButton igdsButton;
        int i;
        if (this instanceof AnonymousClass52C) {
            AnonymousClass52C r2 = (AnonymousClass52C) this;
            if (str == null || str.length() == 0 || onClickListener == null) {
                igdsButton = r2.A04;
                i = 8;
            } else {
                IgdsButton igdsButton2 = r2.A04;
                igdsButton2.setText(str);
                AnonymousClass0fU.A00(onClickListener, igdsButton2);
                igdsButton2.setVisibility(0);
                return;
            }
        } else {
            AnonymousClass52F r1 = (AnonymousClass52F) this;
            AnonymousClass0fU.A00(onClickListener, r1.A00);
            igdsButton = r1.A04;
            i = 4;
            if (onClickListener != null) {
                i = 0;
            }
        }
        igdsButton.setVisibility(i);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0014, code lost:
        if (r6.length() == 0) goto L_0x0016;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void A04(java.lang.String r6, java.lang.String r7) {
        /*
            r5 = this;
            boolean r0 = r5 instanceof X.AnonymousClass52C
            if (r0 == 0) goto L_0x002e
            r4 = r5
            X.52C r4 = (X.AnonymousClass52C) r4
            com.instagram.common.ui.base.IgTextView r3 = r4.A02
            r3.setText(r6)
            r2 = 0
            if (r6 == 0) goto L_0x0016
            int r1 = r6.length()
            r0 = 0
            if (r1 != 0) goto L_0x0018
        L_0x0016:
            r0 = 8
        L_0x0018:
            r3.setVisibility(r0)
            com.instagram.common.ui.base.IgTextView r1 = r4.A01
            r1.setText(r7)
            if (r7 == 0) goto L_0x0028
            int r0 = r7.length()
            if (r0 != 0) goto L_0x002a
        L_0x0028:
            r2 = 8
        L_0x002a:
            r1.setVisibility(r2)
            return
        L_0x002e:
            r0 = r5
            X.52F r0 = (X.AnonymousClass52F) r0
            com.instagram.common.ui.base.IgTextView r0 = r0.A02
            r0.setText(r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.AnonymousClass52D.A04(java.lang.String, java.lang.String):void");
    }

    public void A00(1sU r1) {
    }
}
