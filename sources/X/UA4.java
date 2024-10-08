package X;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.style.CharacterStyle;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.model.shopping.ProductVariantDimension;

public final class UA4 extends 2Rw {
    public int A00 = -1;
    public ProductVariantDimension A01;
    public C20926X4r A02;
    public boolean A03;
    public boolean A04;
    public ImageUrl[] A05;
    public String[] A06 = new String[0];
    public boolean[] A07 = new boolean[0];
    public final AnonymousClass0iw A08;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UE9(DbU.A09(DbX.A0F(viewGroup, 0), viewGroup, R.layout.thumbnail_image_selector_item, false), this.A03);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        C14682U1d u1d;
        UE9 ue9 = (UE9) r8;
        0qQ.A0B(ue9, 0);
        ImageUrl[] imageUrlArr = this.A05;
        if (imageUrlArr != null && this.A01 != null && this.A02 != null) {
            View view = ue9.A01;
            Context context = view.getContext();
            ImageUrl imageUrl = imageUrlArr[i];
            if (imageUrl != null) {
                ue9.A05.setUrl(imageUrl, this.A08);
            }
            boolean z = this.A07[i];
            float f = 0.5f;
            if (z) {
                f = 1.0f;
            }
            if (z) {
                u1d = null;
            } else {
                u1d = ue9.A00;
                if (u1d == null) {
                    if (context != null) {
                        u1d = new C14682U1d(context);
                    } else {
                        u1d = null;
                    }
                    ue9.A00 = u1d;
                    if (u1d != null) {
                        u1d.A00 = R.dimen.abc_action_bar_elevation_material;
                    }
                }
            }
            ue9.A03.setForeground(u1d);
            ue9.A05.setAlpha(f);
            boolean z2 = false;
            ue9.A07.A03(DbW.A00(this.A07[i] ? 1 : 0));
            ue9.A06.A03(DbW.A00(this.A07[i] ? 1 : 0));
            if (this.A00 == i) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.A06[i]);
                C51971G9r.A0y(spannableStringBuilder, new CharacterStyle(), 0);
                ue9.A04.setText(spannableStringBuilder);
                ue9.A02.setVisibility(0);
            } else {
                ue9.A04.setText(this.A06[i]);
                ue9.A02.setVisibility(8);
            }
            if (this.A00 == i) {
                z2 = true;
            }
            view.setSelected(z2);
            if (this.A07[i] || !this.A04) {
                ProductVariantDimension productVariantDimension = this.A01;
                if (productVariantDimension != null) {
                    WB3.A00(view, productVariantDimension, this, i, 10);
                    return;
                }
                return;
            }
            view.setOnClickListener((View.OnClickListener) null);
        }
    }

    public UA4(AnonymousClass0iw r3) {
        this.A08 = r3;
    }

    public final int getItemCount() {
        int i;
        int A032 = AnonymousClass0fD.A03(703008872);
        String[] strArr = this.A06;
        if (strArr != null) {
            i = strArr.length;
        } else {
            i = 0;
        }
        AnonymousClass0fD.A0A(-676319233, A032);
        return i;
    }
}
