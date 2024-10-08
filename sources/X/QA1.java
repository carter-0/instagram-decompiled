package X;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.fbpay.w3c.CardDetails;
import com.instagram.android.R;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.LinkedHashSet;
import java.util.Set;

public final class QA1 extends LinearLayout implements XBN {
    public static final int[] A04 = {16842912};
    public CardDetails A00;
    public boolean A01;
    public boolean A02;
    public final Set A03 = new LinkedHashSet(1);

    public final void A00(CardDetails cardDetails) {
        Integer valueOf;
        int i;
        this.A00 = cardDetails;
        TextView A0G = DbU.A0G(this, R.id.card_info_line_1);
        String str = C11334SNo.A01(cardDetails.A05).A03;
        Resources resources = getResources();
        A0G.setText(resources.getString(2131969215, new Object[]{str, cardDetails.A0A}));
        TextView A0G2 = DbU.A0G(this, R.id.card_info_line_2);
        Integer num = cardDetails.A04;
        if (num == null) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(num.intValue() % 100);
        }
        A0G2.setText(resources.getString(2131969216, new Object[]{cardDetails.A03, valueOf}));
        IgImageView requireViewById = requireViewById(R.id.autofill_payment_item_icon);
        String str2 = cardDetails.A06;
        if (str2 != null) {
            requireViewById.setUrl(new SimpleImageUrl(str2), new C12758T5s());
            return;
        }
        Context context = getContext();
        switch (C8946RGo.A06.A02(this.A00.A07).ordinal()) {
            case 0:
                i = R.drawable.checkout_acceptance_amex;
                break;
            case 1:
                i = R.drawable.checkout_acceptance_discover;
                break;
            case 2:
                i = R.drawable.checkout_acceptance_jcb;
                break;
            case 3:
                i = R.drawable.checkout_acceptance_mastercard;
                break;
            case 4:
                i = R.drawable.checkout_acceptance_rupay;
                break;
            case 5:
                i = R.drawable.checkout_acceptance_visa;
                break;
            default:
                i = R.drawable.rectangular_placeholder;
                break;
        }
        DbU.A13(context, requireViewById, i);
    }

    public final void A9W(MT5 mt5) {
        this.A03.add(mt5);
    }

    public final void EEF(MT5 mt5) {
        this.A03.remove(mt5);
    }

    public CardDetails getCardDetails() {
        return this.A00;
    }

    public final boolean isChecked() {
        return this.A02;
    }

    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 1);
        if (isChecked()) {
            View.mergeDrawableStates(onCreateDrawableState, A04);
        }
        return onCreateDrawableState;
    }

    public void setChecked(boolean z) {
        if (this.A02 != z) {
            this.A02 = z;
            refreshDrawableState();
            if (!this.A01) {
                this.A01 = true;
                for (MT5 D1Y : this.A03) {
                    D1Y.D1Y(this, this.A02);
                }
                this.A01 = false;
            }
        }
    }

    public QA1(Context context) {
        super(context);
        DbV.A0D(this).inflate(R.layout.layout_autofill_payment_item, this, true);
        setGravity(16);
        Resources resources = getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.abc_edit_text_inset_top_material);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(R.dimen.abc_select_dialog_padding_start_material);
        setPadding(dimensionPixelSize2, dimensionPixelSize, dimensionPixelSize2, dimensionPixelSize);
        setId(View.generateViewId());
        setOnClickListener(new C11497SbK(this, 7));
    }

    public final void toggle() {
        if (!isChecked()) {
            setChecked(!this.A02);
        }
    }
}
