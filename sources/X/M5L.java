package X;

import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.user.model.User;
import com.instagram.video.live.mvvm.view.IgLiveWithGuestFragment;
import java.util.ArrayList;
import java.util.Set;

public final class M5L implements Runnable {
    public final /* synthetic */ C62422KfX A00;

    public M5L(C62422KfX kfX) {
        this.A00 = kfX;
    }

    public final void run() {
        String str;
        String str2;
        IgLiveWithGuestFragment igLiveWithGuestFragment = this.A00.A0L;
        C62422KfX kfX = igLiveWithGuestFragment.A08;
        if (kfX != null) {
            kfX.A0I();
            kfX.A0C();
            igLiveWithGuestFragment.A08 = null;
        }
        C62264Kcy kcy = igLiveWithGuestFragment.stateView;
        if (kcy == null) {
            str2 = "stateView";
        } else {
            kcy.A01();
            LGX lgx = igLiveWithGuestFragment.A07;
            if (lgx == null) {
                str2 = "reactionsPresenter";
            } else {
                lgx.A00();
                lgx.A01();
                C64514LdG ldG = igLiveWithGuestFragment.A04;
                if (ldG == null) {
                    str2 = "igLiveQuestionsController";
                } else {
                    ldG.destroy();
                    Context context = igLiveWithGuestFragment.getContext();
                    if (context != null) {
                        View A0E = JTT.A0E(igLiveWithGuestFragment.requireView(), R.id.iglive_livewith_capture_end_stub);
                        ArrayList A1C = AnonymousClass7TE.A1C();
                        User user = igLiveWithGuestFragment.A02;
                        if (user != null) {
                            A1C.add(user);
                        }
                        C270194gL r0 = igLiveWithGuestFragment.A01;
                        if (r0 != null) {
                            Set A06 = r0.A06();
                            0qQ.A07(A06);
                            A1C.addAll(A06);
                        }
                        0eE r3 = AnonymousClass0t1.A01;
                        AnonymousClass0eM r1 = igLiveWithGuestFragment.A0G;
                        if (!A1C.contains(DbX.A0l(r3, r1))) {
                            A1C.add(DbX.A0l(r3, r1));
                        }
                        int dimensionPixelSize = DbV.A05(igLiveWithGuestFragment).getDimensionPixelSize(R.dimen.album_preview_add_item_circle_size);
                        DbU.A0F(A0E, R.id.iglive_cobroadcast_end_facepile).setImageDrawable(C244283aw.A00(context, (Drawable) null, Float.valueOf(AnonymousClass7TE.A01(DbV.A05(igLiveWithGuestFragment), R.dimen.ai_agent_share_profile_sticker_padding) / ((float) Dbb.A07(igLiveWithGuestFragment, R.dimen.album_preview_add_item_circle_size))), AnonymousClass05K.A00, Integer.valueOf(A1C.size()), (Integer) null, (Integer) null, (Integer) null, "live_cobroadcast", A1C, dimensionPixelSize, false, false, false, true, false));
                        TextView A0G = DbU.A0G(A0E, R.id.iglive_cobroadcast_end_subtitle);
                        User user2 = igLiveWithGuestFragment.A02;
                        if (user2 != null) {
                            str = user2.getUsername();
                        } else {
                            str = "host";
                        }
                        DbX.A13(context, A0G, str, 2131963880);
                        View A0G2 = AnonymousClass7TF.A0G(A0E, R.id.iglive_end_done_button);
                        2eS.A01(A0G2);
                        igLiveWithGuestFragment.A0B = true;
                        M0W m0w = igLiveWithGuestFragment.A05;
                        if (m0w == null) {
                            str2 = "liveWithGuestWaterfall";
                        } else {
                            m0w.A04 = Long.valueOf(SystemClock.elapsedRealtime());
                            LY5.A01(A0G2, 26, igLiveWithGuestFragment);
                        }
                    } else {
                        igLiveWithGuestFragment.A0B = true;
                        FragmentActivity activity = igLiveWithGuestFragment.getActivity();
                        if (activity != null) {
                            activity.setResult(-1, (Intent) null);
                            activity.onBackPressed();
                        }
                    }
                    11Z.A02(new M5A(igLiveWithGuestFragment));
                    return;
                }
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
