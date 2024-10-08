package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgLinearLayout;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.common.ui.base.IgTextView;
import java.util.List;

/* renamed from: X.Dlv  reason: case insensitive filesystem */
public final class C46819Dlv extends 2Rw {
    public final E26 A00;
    public final List A01;

    public final void onBindViewHolder(C249703kE r7, int i) {
        Drawable drawable;
        0qQ.A0B(r7, 0);
        C47030DpM dpM = (C47030DpM) r7;
        F00 f00 = (F00) this.A01.get(i);
        0qQ.A0B(f00, 0);
        IgLinearLayout igLinearLayout = dpM.A03;
        C46819Dlv dlv = dpM.A08;
        FPG.A00(igLinearLayout, 70, f00, dlv);
        IgSimpleImageView igSimpleImageView = dpM.A04;
        igSimpleImageView.setImageDrawable(f00.A02);
        IgTextView igTextView = dpM.A07;
        2eS.A01(igTextView);
        igTextView.setText(f00.A04);
        IgTextView igTextView2 = dpM.A06;
        igTextView2.setText(f00.A00);
        String str = f00.A00;
        int i2 = 0;
        if (str == null || str.length() == 0) {
            i2 = 8;
        }
        igTextView2.setVisibility(i2);
        if (f00.A03 == EWN.CLOSE_FRIENDS) {
            AnonymousClass0fU.A00(new FP9((Object) dlv, 46), igTextView2);
        } else {
            igTextView2.setCompoundDrawables((Drawable) null, (Drawable) null, (Drawable) null, (Drawable) null);
        }
        IgSimpleImageView igSimpleImageView2 = dpM.A05;
        if (f00.A01) {
            drawable = dpM.A00;
        } else {
            drawable = dpM.A01;
        }
        igSimpleImageView2.setImageDrawable(drawable);
        ViewGroup.LayoutParams layoutParams = igSimpleImageView.getLayoutParams();
        Context context = dpM.A02.getContext();
        layoutParams.width = context.getResources().getDimensionPixelSize(R.dimen.abc_alert_dialog_button_dimen);
        igSimpleImageView.getLayoutParams().height = AnonymousClass7TF.A02(context, R.dimen.abc_alert_dialog_button_dimen);
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C47030DpM(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.birthday_effects_audience_item, false), this);
    }

    public C46819Dlv(E26 e26, List list) {
        this.A00 = e26;
        this.A01 = list;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(1487673881);
        int size = this.A01.size();
        AnonymousClass0fD.A0A(-239255023, A03);
        return size;
    }
}
