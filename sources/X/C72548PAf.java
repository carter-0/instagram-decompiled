package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import com.instagram.common.ui.widget.imageview.RoundedCornerImageView;
import com.instagram.feed.widget.IgProgressImageView;

/* renamed from: X.PAf  reason: case insensitive filesystem */
public final class C72548PAf implements AnonymousClass7D2 {
    public final AnonymousClass0iw A00;
    public final AnonymousClass7XR A01;
    public final AnonymousClass7DZ A02;

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        AnonymousClass7TF.A1H(viewGroup, layoutInflater);
        PBT pbt = new PBT(DbT.A0D(layoutInflater, viewGroup, R.layout.direct_ar_effect_message, false));
        this.A02.A00(pbt);
        return pbt;
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        0qQ.A0B(r2, 0);
        this.A02.A01(r2);
    }

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r8, AnonymousClass7FW r9) {
        PBT pbt = (PBT) r8;
        NYW nyw = (NYW) r9;
        AnonymousClass7TF.A1H(pbt, nyw);
        RoundedCornerImageView roundedCornerImageView = pbt.A04;
        roundedCornerImageView.A09();
        TextView textView = pbt.A02;
        textView.setVisibility(8);
        TextView textView2 = pbt.A01;
        textView2.setVisibility(8);
        IgProgressImageView igProgressImageView = pbt.A05;
        IgImageView igImageView = igProgressImageView.getIgImageView();
        igImageView.setImageRendererAndReset(C3265577g.A05(igImageView, nyw.A02));
        ImageUrl imageUrl = nyw.A01;
        if (imageUrl != null && !C253833rU.A02(imageUrl)) {
            igProgressImageView.setUrl(imageUrl, this.A00);
        }
        ImageUrl imageUrl2 = nyw.A00;
        if (imageUrl2 != null && !C253833rU.A02(imageUrl2)) {
            roundedCornerImageView.setUrl(imageUrl2, this.A00);
        }
        String str = nyw.A05;
        if (!TextUtils.isEmpty(str)) {
            textView.setVisibility(0);
            textView.setText(str);
        }
        String str2 = nyw.A03;
        if (!TextUtils.isEmpty(str2)) {
            textView2.setVisibility(0);
            DbY.A0y(DbU.A05(pbt.A03), textView2, str2, 2131958624);
        }
        this.A02.A02(pbt, nyw);
    }

    public C72548PAf(AnonymousClass0iw r10, AnonymousClass7XR r11, AnonymousClass9HC r12) {
        this.A01 = r11;
        this.A00 = r10;
        this.A02 = new AnonymousClass7DZ(AnonymousClass7TE.A1I(new C3266077l((AnonymousClass7DX) null, new C72488P7x(this), new AnonymousClass7DT(r11), new AnonymousClass7DV((AnonymousClass7XX) r11, r12.A1X), (C333107Xr) r11, r12, (C3266177m) null, false)));
    }
}
