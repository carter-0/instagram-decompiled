package X;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import java.util.List;

/* renamed from: X.U9x  reason: case insensitive filesystem */
public final class C14802U9x extends 2Rw {
    public final Activity A00;
    public final AnonymousClass4DU A01;
    public final C16038UnR A02;
    public final List A03;

    public C14802U9x(Activity activity, AnonymousClass4DU r3, C16038UnR unR, List list) {
        0qQ.A0B(unR, 3);
        this.A00 = activity;
        this.A01 = r3;
        this.A02 = unR;
        this.A03 = list;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C14882UDk(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.lead_ads_multi_submit_row, false));
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r5, int i) {
        C14882UDk uDk = (C14882UDk) r5;
        0qQ.A0B(uDk, 0);
        C19359WWa wWa = (C19359WWa) this.A03.get(i);
        uDk.A01.setText(wWa.A04);
        uDk.A02.setText(wWa.A06);
        ImageUrl imageUrl = wWa.A01;
        if (imageUrl != null) {
            uDk.A03.setUrl(imageUrl, new 0xG("lead_ads_multi_submit_adapter"));
        }
        View view = uDk.A00;
        WB9.A00(view, 44, uDk);
        uDk.A04.setOnCheckedChangeListener(new C50127FPz(i, 3, this));
        view.setOnLongClickListener(new C18888WBf(this, i));
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1718445486);
        int size = this.A03.size();
        AnonymousClass0fD.A0A(-1335478755, A032);
        return size;
    }
}
