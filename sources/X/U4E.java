package X;

import android.content.Context;
import android.net.Uri;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.VideoView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.common.ui.base.IgFrameLayout;
import java.io.File;
import java.util.List;

public final class U4E extends BaseAdapter {
    public final UserSession A00;
    public final C17221VMz A01;
    public final VN0 A02;
    public final List A03;

    public U4E(UserSession userSession, C17221VMz vMz, VN0 vn0, List list) {
        0qQ.A0B(userSession, 4);
        this.A03 = list;
        this.A01 = vMz;
        this.A02 = vn0;
        this.A00 = userSession;
    }

    public final long getItemId(int i) {
        return 0;
    }

    public final int getItemViewType(int i) {
        return 1;
    }

    public final View getView(int i, View view, ViewGroup viewGroup) {
        0qQ.A0B(viewGroup, 2);
        if (view == null) {
            view = DbT.A0C(DbV.A0D(viewGroup), viewGroup, R.layout.direct_channels_nux_carousel_slide);
        }
        0qQ.A0A(view);
        V2K v2k = (V2K) this.A03.get(i);
        0qQ.A0C(v2k, "null cannot be cast to non-null type com.instagram.direct.fragment.channels.nux.CarouselNuxSlideModel");
        C15928Ukt ukt = (C15928Ukt) v2k;
        TextView A0R = AnonymousClass7TG.A0R(view, R.id.description);
        Dba.A06(view).setText(ukt.A02);
        int i2 = ukt.A00;
        A0R.setText(i2);
        if (182.A06(0Tu.A05, this.A00, 36319072383933329L)) {
            C61080JwI jwI = (C61080JwI) C226442gp.A00.A01((C239973Ja) ukt.A03.A00, WH9.A00, new WHB(view, this, i)).A00();
            if (jwI != null) {
                A00(view, jwI, this, i);
            }
        } else {
            ImageView A0J = DbX.A0J(view, R.id.image);
            A0J.setImageResource(ukt.A01);
            A0J.setVisibility(0);
        }
        Context context = A0R.getContext();
        String A16 = AnonymousClass7TE.A16(context, 2131958722);
        SpannableStringBuilder A0D = DbY.A0D(context, A16, i2);
        AnonymousClass7AV.A04(A0D, new UsT(this, DbV.A02(context)), A16);
        DbX.A1G(A0R, A0D);
        if (2eO.A00(context)) {
            WB8.A00(A0R, 31, this);
        }
        return view;
    }

    public final int getCount() {
        return this.A03.size();
    }

    public final /* bridge */ /* synthetic */ Object getItem(int i) {
        return this.A03.get(i);
    }

    public static final void A00(View view, C61080JwI jwI, U4E u4e, int i) {
        IgFrameLayout igFrameLayout = (IgFrameLayout) AnonymousClass7TF.A0F(view, R.id.video_container);
        VideoView videoView = (VideoView) AnonymousClass7TF.A0F(view, R.id.video);
        if (jwI != null) {
            Uri fromFile = Uri.fromFile((File) jwI.A00);
            0qQ.A07(fromFile);
            videoView.setVideoURI(fromFile);
            videoView.requestFocus();
            if (182.A06(0Tu.A05, u4e.A00, 36318058774468429L)) {
                videoView.setOnErrorListener(W65.A00);
            }
            videoView.setOnPreparedListener(new W67(igFrameLayout, u4e, i));
        }
    }
}
