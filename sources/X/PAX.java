package X;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.Collections;

public final class PAX implements AnonymousClass7D2 {
    public final AnonymousClass7DZ A00;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r6, AnonymousClass7FW r7) {
        C72487P7w p7w = (C72487P7w) r6;
        NYY nyy = (NYY) r7;
        LinearLayout linearLayout = p7w.A02;
        AnonymousClass7PV.A02(linearLayout);
        String str = nyy.A04;
        boolean isEmpty = TextUtils.isEmpty(str);
        TextView textView = p7w.A04;
        if (!isEmpty) {
            textView.setVisibility(0);
            textView.setText(str);
            textView.setTextColor(AnonymousClass7FB.A01(nyy.A00.A03, false));
        } else {
            textView.setVisibility(8);
        }
        p7w.A03.setText(nyy.A02);
        C3265577g.A06(p7w.A01, linearLayout, nyy.A00, true);
        this.A00.A02(p7w, nyy);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r2) {
        this.A00.A01(r2);
    }

    public PAX(AnonymousClass7XR r3, AnonymousClass9HC r4) {
        this.A00 = new AnonymousClass7DZ(Collections.singletonList(C3259074q.A01(new P8A(r3, this), r3, r4)));
    }

    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C72487P7w p7w = new C72487P7w(DbT.A0C(layoutInflater, viewGroup, R.layout.message_content_placeholder));
        this.A00.A00(p7w);
        return p7w;
    }
}
