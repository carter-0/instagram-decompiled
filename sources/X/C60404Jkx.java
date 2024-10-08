package X;

import android.content.Context;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.creation.capture.quickcapture.thirdpartymedia.GiphyClipsBrowserFragment;
import java.util.List;

/* renamed from: X.Jkx  reason: case insensitive filesystem */
public final class C60404Jkx extends 2Rw {
    public List A00 = AnonymousClass7TE.A1C();
    public final Context A01;
    public final AnonymousClass0eM A02 = AnonymousClass0eN.A01(MMQ.A00(this, 2));
    public final int A03;
    public final UserSession A04;
    public final GiphyClipsBrowserFragment A05;

    public C60404Jkx(Context context, UserSession userSession, GiphyClipsBrowserFragment giphyClipsBrowserFragment, int i) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = context;
        this.A03 = i;
        this.A05 = giphyClipsBrowserFragment;
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        return new C60591Jo0(DbT.A0D(LayoutInflater.from(this.A01), viewGroup, R.layout.giphy_clips_browser_item, false), this.A04, this.A05);
    }

    public final void onBindViewHolder(C249703kE r34, int i) {
        C249703kE r9 = r34;
        0qQ.A0B(r9, 0);
        if (r9 instanceof C60591Jo0) {
            C60591Jo0 jo0 = (C60591Jo0) r9;
            int i2 = i;
            C60956JuE juE = (C60956JuE) this.A00.get(i2);
            int i3 = this.A03 / 2;
            0qQ.A0B(juE, 0);
            ImageView A0G = DbS.A0G(jo0.itemView, R.id.gif_image);
            View findViewById = jo0.itemView.findViewById(R.id.black_dim);
            View findViewById2 = jo0.itemView.findViewById(R.id.shimmer);
            View findViewById3 = jo0.itemView.findViewById(R.id.loading_spinner);
            TextView A0d = AnonymousClass7TE.A0d(jo0.itemView, R.id.duration_label);
            A0d.setText(C347917xa.A01(juE.A00));
            C63879LAi lAi = juE.A02;
            float f = lAi.A01 / lAi.A00;
            if (Float.isNaN(f)) {
                f = 1.0f;
            }
            C321076tX A002 = C321066tW.A00(f, i3, 0, -1);
            int intValue = juE.A04.intValue();
            if (intValue == 2) {
                Dba.A0y(findViewById2, findViewById3, A0G, 8, 0);
                A0d.setVisibility(0);
            } else if (intValue == 1) {
                JTT.A14(A0G, findViewById3, A0d, 8);
                findViewById2.getLayoutParams().width = A002.A02;
                findViewById2.getLayoutParams().height = A002.A00;
                findViewById2.setVisibility(0);
            } else if (intValue == 0) {
                JTT.A14(A0G, findViewById3, A0d, 8);
                ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
                int i4 = A002.A02;
                layoutParams.width = i4;
                ViewGroup.LayoutParams layoutParams2 = findViewById2.getLayoutParams();
                int i5 = A002.A00;
                layoutParams2.height = i5;
                findViewById2.setVisibility(0);
                findViewById.getLayoutParams().width = i4;
                findViewById.getLayoutParams().height = i5;
                findViewById.setVisibility(8);
                Context A06 = JTQ.A06(jo0);
                UserSession userSession = jo0.A00;
                ImageUrl imageUrl = lAi.A05;
                0qQ.A07(imageUrl);
                String str = juE.A05;
                int color = JTQ.A06(jo0).getColor(R.color.cds_white_a20);
                int color2 = JTQ.A06(jo0).getColor(R.color.black_20_transparent);
                C321076tX r21 = A002;
                UserSession userSession2 = userSession;
                ImageUrl imageUrl2 = imageUrl;
                A0G.setImageDrawable(new C321016tR(A06, userSession2, imageUrl2, (ImageUrl) null, new AZ3(1, A0d, findViewById2, A0G, jo0), r21, AnonymousClass05K.A01, str, (float) JTP.A04(JTS.A07(jo0)), color, color2, false));
                A0G.setOnTouchListener(new C64282LYi(3, new GestureDetector(JTQ.A06(jo0), new C60031Jdh(A0G, jo0, juE, i2)), findViewById));
            } else {
                throw AnonymousClass7TE.A1K();
            }
        }
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-77127632);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(-1944406819, A032);
        return size;
    }
}
