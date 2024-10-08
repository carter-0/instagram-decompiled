package X;

import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.base.IgView;
import com.instagram.igds.components.button.IgdsButton;
import java.util.List;

/* renamed from: X.U9p  reason: case insensitive filesystem */
public final class C14795U9p extends 2Rw {
    public final List A00;
    public final 0sP A01;

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new UDR(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.lead_ads_multi_submit_thank_you_row, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        String str;
        UDR udr = (UDR) r5;
        0qQ.A0B(udr, 0);
        List list = this.A00;
        C19359WWa wWa = (C19359WWa) list.get(i);
        udr.A00.setText(wWa.A04);
        IgdsButton igdsButton = udr.A03;
        C45884D9d d9d = ((C19359WWa) list.get(i)).A00;
        if (d9d == null || (str = d9d.A02) == null) {
            str = "";
        }
        igdsButton.setText(str);
        WB1.A00(igdsButton, this, i, 3);
        ImageUrl imageUrl = wWa.A01;
        if (imageUrl != null) {
            udr.A02.setUrl(imageUrl, new 0xG("lead_ads_multi_submit_thank_you_adapter"));
        }
        IgView igView = udr.A01;
        int i2 = 0;
        if (i == 0) {
            i2 = 8;
        }
        igView.setVisibility(i2);
    }

    public C14795U9p(0sP r1, List list) {
        this.A00 = list;
        this.A01 = r1;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-158679080);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(343340833, A03);
        return size;
    }
}
