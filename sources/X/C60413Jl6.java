package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.typedurl.SimpleImageUrl;
import com.instagram.common.ui.widget.imageview.IgImageView;
import java.util.List;

/* renamed from: X.Jl6  reason: case insensitive filesystem */
public final class C60413Jl6 extends 2Rw {
    public List A00 = 0sn.A00;
    public final FragmentActivity A01;
    public final AnonymousClass0iw A02;
    public final UserSession A03;

    public C60413Jl6(FragmentActivity fragmentActivity, AnonymousClass0iw r3, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A01 = fragmentActivity;
        this.A03 = userSession;
        this.A02 = r3;
    }

    public final void onBindViewHolder(C249703kE r9, int i) {
        View view;
        int i2;
        C294075lo B8L;
        String url;
        if (JTP.A07(this, r9, 0, i) == 0) {
            TextView textView = ((C60526Jmx) r9).A00;
            DbT.A18(textView.getContext(), textView, 2131974436);
            return;
        }
        C60608JoH joH = (C60608JoH) r9;
        int i3 = i - 1;
        if (i3 < this.A00.size()) {
            AnonymousClass3HY r6 = (AnonymousClass3HY) this.A00.get(i3);
            C239703Hr As1 = r6.As1();
            if (As1 == null || (B8L = As1.B8L()) == null || (url = B8L.getUrl()) == null) {
                view = joH.A00;
                i2 = 8;
            } else {
                view = joH.A00;
                Context context = view.getContext();
                int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.boost_guidance_preview_height);
                int dimensionPixelSize2 = context.getResources().getDimensionPixelSize(R.dimen.clips_editor_timeline_v3_single_segment_drawer_height);
                IgImageView igImageView = joH.A02;
                igImageView.setUrl(this.A03, new SimpleImageUrl(url, dimensionPixelSize2, dimensionPixelSize), this.A02);
                LY8.A00(igImageView, 24, r6, this);
                i2 = 0;
            }
            view.setVisibility(i2);
            String title = r6.getTitle();
            TextView textView2 = joH.A01;
            if (title == null) {
                title = "";
            }
            textView2.setText(title);
        }
    }

    public final C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        LayoutInflater A0E = DbX.A0E(viewGroup);
        if (i == 0) {
            return new C60526Jmx(DbT.A0D(A0E, viewGroup, R.layout.story_highlights_to_reels_header, false));
        }
        return new C60608JoH(DbT.A0D(A0E, viewGroup, R.layout.story_highlights_to_reels_preview_item, false));
    }

    public final int getItemCount() {
        int A032 = AnonymousClass0fD.A03(-1780187901);
        int size = this.A00.size() + 1;
        AnonymousClass0fD.A0A(1511904820, A032);
        return size;
    }

    public final int getItemViewType(int i) {
        int A032 = AnonymousClass0fD.A03(218458633);
        boolean A1U = C51970G9q.A1U(i);
        AnonymousClass0fD.A0A(-1885283208, A032);
        return A1U ? 1 : 0;
    }
}
