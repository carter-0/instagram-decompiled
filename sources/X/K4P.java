package X;

import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;
import com.instagram.android.R;
import com.instagram.debug.devoptions.sandboxselector.DevServerEntity;
import java.io.File;
import java.io.Serializable;
import org.webrtc.MediaStreamTrack;

public final class K4P extends AnonymousClass4DH {
    public static final String __redex_internal_original_name = "CreatorActivationSlideFragment";
    public int A00;
    public K4J A01;
    public C62519KhA A02;
    public Integer A03;
    public final AnonymousClass0eM A04 = C227642jf.A02(this);

    public final String getModuleName() {
        return "direct_creator_activation_slide_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C239973Ja r3;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        Integer num = this.A03;
        if (num != null) {
            int intValue = num.intValue();
            DbU.A1A(DbV.A05(this), AnonymousClass7TG.A0R(view, R.id.title), intValue);
        }
        C62519KhA khA = this.A02;
        if (khA != null) {
            C226442gp r4 = C226442gp.A00;
            switch (khA.ordinal()) {
                case 0:
                    r3 = Et2.A00;
                    break;
                case 1:
                    r3 = Et2.A01;
                    break;
                case 2:
                    r3 = Et2.A02;
                    break;
                case 3:
                    r3 = Et2.A03;
                    break;
                case 4:
                    r3 = Et2.A04;
                    break;
                case 5:
                    r3 = Et2.A05;
                    break;
                default:
                    throw AnonymousClass7TE.A1K();
            }
            C61078JwG jwG = (C61078JwG) r4.A01(r3, C64381Lay.A00, new C64383Lb0(1, view, this)).A00();
            if (jwG != null) {
                A00(view, jwG, this);
            }
        }
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A04);
    }

    public static final void A00(View view, C61078JwG jwG, K4P k4p) {
        View A0F = AnonymousClass7TF.A0F(view, R.id.video_container);
        VideoView videoView = (VideoView) AnonymousClass7TF.A0F(view, R.id.video);
        if (jwG != null) {
            Uri fromFile = Uri.fromFile((File) jwG.A00);
            0qQ.A07(fromFile);
            videoView.setVideoURI(fromFile);
            videoView.requestFocus();
            videoView.setOnPreparedListener(new LVJ(A0F, 4));
            videoView.setOnCompletionListener(new LVC(k4p, 5));
        }
    }

    public final void onCreate(Bundle bundle) {
        C62519KhA khA;
        int A022 = AnonymousClass0fD.A02(865457536);
        K4P.super.onCreate(bundle);
        this.A00 = requireArguments().getInt("position");
        this.A03 = DbV.A0o(requireArguments(), DevServerEntity.COLUMN_DESCRIPTION);
        Serializable serializable = requireArguments().getSerializable(MediaStreamTrack.VIDEO_TRACK_KIND);
        if (serializable instanceof C62519KhA) {
            khA = (C62519KhA) serializable;
        } else {
            khA = null;
        }
        this.A02 = khA;
        AnonymousClass0fD.A09(1473297298, A022);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1222378496);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.direct_thread_null_state_slide, false);
        AnonymousClass0fD.A09(-2138088009, A022);
        return A0D;
    }
}
