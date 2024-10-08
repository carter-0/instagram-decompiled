package X;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.instagram.android.R;
import com.instagram.feed.feeditem.SuggestedChannels;

/* renamed from: X.NIr  reason: case insensitive filesystem */
public final class C68453NIr extends AnonymousClass4DH implements AnonymousClass4DS {
    public static final String __redex_internal_original_name = "AllSuggestedChannelsFragment";
    public AnonymousClass2r8 A00;
    public final AnonymousClass0eM A01 = C227642jf.A02(this);

    public final void configureActionBar(2da r2) {
        0qQ.A0B(r2, 0);
        DbW.A1B(r2, 2131952879);
    }

    public final String getModuleName() {
        return __redex_internal_original_name;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        RecyclerView recyclerView = (RecyclerView) AnonymousClass7TE.A0b(view, R.id.all_channels_recyler_view);
        DbY.A16(this, recyclerView);
        Context requireContext = requireContext();
        AnonymousClass2r8 r0 = this.A00;
        if (r0 != null) {
            C67795Muz muz = new C67795Muz(requireContext, r0);
            SuggestedChannels suggestedChannels = (SuggestedChannels) C320236s2.A00(requireArguments(), SuggestedChannels.class, "suggested_channels_key");
            0qQ.A0B(suggestedChannels, 0);
            muz.A00 = suggestedChannels;
            recyclerView.setAdapter(muz);
            return;
        }
        throw AnonymousClass7TE.A0y();
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A01);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A02 = AnonymousClass0fD.A02(265525747);
        0qQ.A0B(layoutInflater, 0);
        View inflate = layoutInflater.inflate(R.layout.all_channels_fragment, viewGroup, false);
        AnonymousClass0fD.A09(-1681260696, A02);
        return inflate;
    }
}
