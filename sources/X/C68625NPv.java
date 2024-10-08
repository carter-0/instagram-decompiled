package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.widget.imageview.IgImageView;

/* renamed from: X.NPv  reason: case insensitive filesystem */
public final class C68625NPv extends C232232tF {
    public final AnonymousClass0iw A00;
    public final NKI A01;
    public final boolean A02;

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        LayoutInflater A0F = DbX.A0F(viewGroup, 0);
        boolean z = this.A02;
        int i = R.layout.direct_thread_color_picker_item_view;
        if (z) {
            i = R.layout.direct_thread_color_picker_grid_item_view;
        }
        return new C68022Myo(DbU.A09(A0F, viewGroup, i, false));
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r10, C249703kE r11) {
        Drawable A002;
        Ou8 ou8 = (Ou8) r10;
        C68022Myo myo = (C68022Myo) r11;
        AnonymousClass7TF.A1H(ou8, myo);
        IgImageView igImageView = myo.A03;
        Context context = igImageView.getContext();
        TextView textView = myo.A01;
        String str = ou8.A08;
        textView.setText(str);
        textView.setContentDescription(str);
        boolean z = this.A02;
        if (z) {
            IgImageView igImageView2 = myo.A04;
            if (igImageView2 != null) {
                igImageView2.setVisibility(DbW.A01(ou8.A09 ? 1 : 0));
            }
        } else {
            myo.A05.setChecked(ou8.A09);
        }
        2eS.A04(myo.A05, AnonymousClass05K.A00);
        View view = myo.A00;
        2eS.A04(view, AnonymousClass05K.A02);
        String str2 = ou8.A04;
        if (ou8.A05 == null) {
            myo.A02.setVisibility(8);
        } else {
            TextView textView2 = myo.A02;
            textView2.setVisibility(0);
            textView2.setText(ou8.A05);
        }
        igImageView.setScaleType(ou8.A02);
        DbT.A16(context, igImageView, 2Yu.A0H(context, R.attr.igds_color_secondary_background));
        int i = ou8.A01;
        if (i != 0) {
            A002 = context.getDrawable(i);
            if (A002 != null) {
                Integer num = ou8.A03;
                if (num != null) {
                    A002.setTint(num.intValue());
                }
            } else {
                A002 = null;
            }
        } else if (str2 == null || !C253833rU.A03(str2)) {
            int[] iArr = ou8.A06;
            int i2 = ou8.A00;
            int i3 = R.drawable.direct_thread_color_picker_color_preview;
            if (z) {
                i3 = R.drawable.direct_thread_color_picker_grid_color_preview;
            }
            A002 = C69930NuW.A00(context, iArr, i2, i3);
        } else {
            igImageView.setUrl(C253833rU.A00(DbT.A09(str2), -1, -1), this.A00);
            C71399Ojy.A00(view, ou8, this, myo, 9);
        }
        igImageView.setImageDrawable(A002);
        C71399Ojy.A00(view, ou8, this, myo, 9);
    }

    public final Class modelClass() {
        return Ou8.class;
    }

    public C68625NPv(AnonymousClass0iw r1, NKI nki, boolean z) {
        this.A00 = r1;
        this.A01 = nki;
        this.A02 = z;
    }
}
