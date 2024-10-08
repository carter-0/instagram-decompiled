package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Jks  reason: case insensitive filesystem */
public final class C60399Jks extends 2Rw {
    public List A00;
    public final Context A01;
    public final AnonymousClass0iw A02;
    public final K6R A03;

    public C60399Jks(Context context, AnonymousClass0iw r3, K6R k6r, List list) {
        0qQ.A0B(list, 2);
        this.A01 = context;
        this.A00 = list;
        this.A02 = r3;
        this.A03 = k6r;
    }

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C60610JoJ(DbT.A0D(DbX.A0E(viewGroup), viewGroup, R.layout.layout_clips_sfx_effect_item, false), this);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r6, int i) {
        C60610JoJ joJ = (C60610JoJ) r6;
        0qQ.A0B(joJ, 0);
        C61079JwH jwH = (C61079JwH) this.A00.get(i);
        0qQ.A0B(jwH, 0);
        joJ.A00.setText(jwH.A02);
        IgImageView igImageView = joJ.A01;
        igImageView.setAngle(0.0f);
        C60399Jks jks = joJ.A02;
        igImageView.setUrl((ImageUrl) jwH.A01, jks.A02);
        igImageView.A01 = LYA.A00(joJ, jwH, jks, 21);
        igImageView.setOnLongClickListener(new LYV(3, jwH, jks));
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-685371959);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1445443658, A032);
        return size;
    }
}
