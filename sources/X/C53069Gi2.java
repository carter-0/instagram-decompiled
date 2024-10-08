package X;

import android.view.View;
import android.view.ViewGroup;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.feed.widget.IgProgressImageView;
import com.instagram.ui.widget.framelayout.MediaFrameLayout;
import java.util.List;

/* renamed from: X.Gi2  reason: case insensitive filesystem */
public final class C53069Gi2 extends 2Rw {
    public C55967HqY A00;
    public final UserSession A01;
    public final List A02 = AnonymousClass7TE.A1C();

    public final /* bridge */ /* synthetic */ C249703kE onCreateViewHolder(ViewGroup viewGroup, int i) {
        0qQ.A0B(viewGroup, 0);
        int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
        View inflate = DbV.A0D(viewGroup).inflate(R.layout.row_feed_collection_thumbnail_media_rounded_border, viewGroup, false);
        0qQ.A0C(inflate, AnonymousClass000.A00(3671));
        return new C53121Git((MediaFrameLayout) inflate);
    }

    public final /* bridge */ /* synthetic */ void onBindViewHolder(C249703kE r8, int i) {
        C53121Git git = (C53121Git) r8;
        0qQ.A0B(git, 0);
        C55967HqY hqY = this.A00;
        if (hqY != null) {
            MediaFrameLayout mediaFrameLayout = git.A01;
            IgProgressImageView igProgressImageView = git.A00;
            hqY.A00((C53267GlF) this.A02.get(i), igProgressImageView, mediaFrameLayout, i, false);
        }
    }

    public C53069Gi2(UserSession userSession) {
        this.A01 = userSession;
    }

    public final int getItemCount() {
        int A03 = AnonymousClass0fD.A03(-960292130);
        int size = this.A02.size();
        AnonymousClass0fD.A0A(-1163498329, A03);
        return size;
    }
}
