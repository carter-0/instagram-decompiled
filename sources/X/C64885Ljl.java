package X;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.recyclerview.widget.RecyclerView;
import com.facebook.react.modules.appstate.AppStateModule;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.NineSixteenLayoutConfigImpl;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.storiestemplates.footer.PinnablesFooterHorizontalScrollView;
import com.instagram.ui.simplevideolayout.SimpleVideoLayout;
import com.instagram.ui.widget.thumbnailview.ThumbnailView;
import java.util.ArrayList;

/* renamed from: X.Ljl  reason: case insensitive filesystem */
public final class C64885Ljl implements C2365734g {
    public final int A00;
    public final Object A01;

    public C64885Ljl(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DKS(View view) {
        switch (this.A00) {
            case 0:
                LYC.A00(view, 33, this.A01);
                return;
            case 1:
                0qQ.A0B(view, 0);
                NineSixteenLayoutConfigImpl nineSixteenLayoutConfigImpl = (NineSixteenLayoutConfigImpl) ((TargetViewSizeProvider) this.A01);
                int i = nineSixteenLayoutConfigImpl.A0A;
                View A0G = AnonymousClass7TF.A0G(view, R.id.mode_picker);
                0nA.A0V(A0G, i);
                0nA.A0f(A0G, nineSixteenLayoutConfigImpl.A0K.getWidth());
                return;
            case 2:
                0qQ.A0B(view, 0);
                SimpleVideoLayout simpleVideoLayout = (SimpleVideoLayout) view.requireViewById(R.id.gallery_grid_formats_thumbnail_video);
                int i2 = C249703kE.FLAG_ADAPTER_FULLUPDATE;
                ((C60711Jpw) this.A01).A01 = simpleVideoLayout;
                return;
            case 3:
                RecyclerView recyclerView = (RecyclerView) view;
                C65012Llp llp = (C65012Llp) this.A01;
                recyclerView.setLayoutManager(llp.A04);
                recyclerView.setAdapter(llp.A0C);
                llp.A05.A0A(recyclerView);
                return;
            case 4:
                ImageView imageView = (ImageView) view;
                0qQ.A0B(imageView, 0);
                C65787Lzf lzf = (C65787Lzf) this.A01;
                AnonymousClass61R A002 = C303756Aq.A00(lzf.A0H.getContext(), R.raw.canvas_dice_animation);
                imageView.setImageDrawable(A002);
                LY8.A00(imageView, 69, A002, lzf);
                return;
            case 5:
                PinnablesFooterHorizontalScrollView pinnablesFooterHorizontalScrollView = (PinnablesFooterHorizontalScrollView) view;
                ArrayList A0q = AnonymousClass7TF.A0q(pinnablesFooterHorizontalScrollView, 0);
                C65787Lzf lzf2 = (C65787Lzf) this.A01;
                A0q.add(new C63813L7t((Integer) null, "info", new C66309MMs(lzf2, 49), R.drawable.instagram_info_outline_16));
                UserSession userSession = lzf2.A0B;
                0Tu r7 = 0Tu.A05;
                if (182.A06(r7, userSession, 36319939967590201L)) {
                    A0q.add(new C63813L7t(2131974325, AppStateModule.APP_STATE_BACKGROUND, MP5.A00(lzf2, 0), R.drawable.instagram_pin_pano_filled_16));
                }
                if (182.A06(r7, userSession, 36319939967131443L)) {
                    A0q.add(new C63813L7t(2131974326, "music_only", MP5.A00(lzf2, 1), R.drawable.instagram_pin_pano_filled_16));
                }
                pinnablesFooterHorizontalScrollView.setButtons(A0q);
                return;
            case 6:
                ImageView imageView2 = (ImageView) view;
                0qQ.A0B(imageView2, 0);
                imageView2.setImageDrawable(new C321486uG((Context) this.A01));
                return;
            default:
                ((ThumbnailView) this.A01).setupGrid((ViewGroup) view);
                return;
        }
    }
}
