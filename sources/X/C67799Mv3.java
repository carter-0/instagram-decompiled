package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.ui.base.IgSimpleImageView;
import com.instagram.model.direct.DirectSearchPrompt;
import com.instagram.model.direct.DirectSearchResult;
import java.util.List;

/* renamed from: X.Mv3  reason: case insensitive filesystem */
public final class C67799Mv3 extends 2Rw {
    public List A00 = 0sn.A00;
    public final Context A01;
    public final O7S A02;
    public final C294875nB A03;
    public final boolean A04;

    public final void onBindViewHolder(C249703kE r12, int i) {
        int i2;
        0qQ.A0B(r12, 0);
        if (r12 instanceof C68010Myc) {
            C294875nB r1 = this.A03;
            DirectSearchResult directSearchResult = (DirectSearchResult) this.A00.get(i);
            r1.DpB(JTO.A0F(r12), (C67058MhZ) null, directSearchResult, "direct_user_search", 40, -1, i, -1, false);
            Context context = this.A01;
            boolean z = this.A04;
            C68010Myc myc = (C68010Myc) r12;
            DirectSearchPrompt directSearchPrompt = (DirectSearchPrompt) this.A00.get(i);
            AnonymousClass7TG.A1Q(myc, directSearchPrompt);
            TextView textView = myc.A02;
            textView.setText(directSearchPrompt.A03);
            0nA.A0Z(textView, 0);
            IgSimpleImageView igSimpleImageView = myc.A03;
            AnonymousClass9VB r0 = directSearchPrompt.A00;
            if (z) {
                i2 = R.drawable.messenger_icons_gen_ai_ring_16;
            } else {
                int ordinal = r0.ordinal();
                i2 = R.drawable.instagram_gen_ai_pano_filled_24;
                if (ordinal == 0) {
                    i2 = R.drawable.instagram_photo_gen_ai_pano_outline_24;
                }
            }
            igSimpleImageView.setImageResource(i2);
            0nA.A0U(igSimpleImageView, AnonymousClass7TG.A03(context));
            myc.A01 = directSearchPrompt;
            myc.A00 = i;
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        Context context = this.A01;
        O7S o7s = this.A02;
        View A09 = DbU.A09(LayoutInflater.from(context), viewGroup, R.layout.pill_search_keyword, false);
        C68010Myc myc = new C68010Myc(A09);
        C71409Ok8.A01(A09, 35, myc, o7s);
        0nA.A0j(A09, context.getResources().getDimensionPixelSize(R.dimen.abc_action_bar_elevation_material), 0, AnonymousClass7TF.A02(context, R.dimen.abc_action_bar_elevation_material), 0);
        return myc;
    }

    public C67799Mv3(Context context, O7S o7s, C294875nB r4, boolean z) {
        this.A01 = context;
        this.A04 = z;
        this.A02 = o7s;
        this.A03 = r4;
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-180251761);
        int size = this.A00.size();
        AnonymousClass0fD.A0A(412257414, A032);
        return size;
    }
}
