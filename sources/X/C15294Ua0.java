package X;

import android.app.Activity;
import android.content.Intent;
import android.graphics.RectF;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.gallery.Medium;
import com.instagram.model.direct.camera.DirectCameraViewModel;
import com.instagram.realtimeclient.RealtimeConstants;
import java.io.File;
import java.util.ArrayList;
import org.webrtc.MediaStreamTrack;

/* renamed from: X.Ua0  reason: case insensitive filesystem */
public final class C15294Ua0 extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "RtcCallScreenCaptureShareFragment";
    public AnonymousClass80Q A00;
    public AnonymousClass80C A01;
    public DirectCameraViewModel A02;
    public boolean A03;
    public final C41837B2s A04 = new WUP(this, 9);
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final String getModuleName() {
        return "videocall_screen_capture_share_fragment";
    }

    public final void onViewCreated(View view, Bundle bundle) {
        28D r6;
        int i;
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        File file = new File(requireArguments().getString(C66579MXk.A00(1102)));
        Object obj = requireArguments().get(C66579MXk.A00(1101));
        if (!(obj instanceof 28D) || (r6 = (28D) obj) == null) {
            r6 = 28D.A5J;
        }
        String string = requireArguments().getString("screen_capture_share_arguments_key_face_effect_id");
        String string2 = requireArguments().getString("media_type");
        this.A03 = requireArguments().getBoolean(C66579MXk.A00(1098));
        this.A02 = (DirectCameraViewModel) requireArguments().getParcelable(C66579MXk.A00(1100));
        AnonymousClass80C r0 = new AnonymousClass80C();
        this.A01 = r0;
        registerLifecycleListener(r0);
        if (string2 == null || !string2.equals(MediaStreamTrack.VIDEO_TRACK_KIND)) {
            0qQ.A0B(file, 0);
            i = 1;
        } else {
            i = 3;
        }
        Medium A032 = C282665Eg.A03(file, i, 0);
        float A06 = (float) JTT.A06(this);
        float A0A = (float) C13990Tnq.A0A(this);
        AnonymousClass7TF.A17(this, new C41257Aqt(AnonymousClass7TF.A0C(A06, A0A), new RectF(0.0f, 0.0f, A06, A0A), (ViewGroup) view.findViewById(R.id.videocall_screen_capture_share_container), r6, A032, this, string));
    }

    public final /* bridge */ /* synthetic */ AnonymousClass0wW getSession() {
        return DbS.A0T(this.A05);
    }

    public final boolean onBackPressed() {
        String str;
        if (this.A02 == null) {
            str = "story";
        } else {
            str = RealtimeConstants.GRAPHQL_SUBSCRIPTION_MESSAGE_TOPIC_FOR_DIRECT_TYPING;
        }
        A00(this, AnonymousClass000.A00(2687), 0sr.A1L(new String[]{str}), false, true);
        AnonymousClass80Q r0 = this.A00;
        if (r0 != null) {
            return r0.A06();
        }
        return false;
    }

    public static final void A00(C15294Ua0 ua0, String str, ArrayList arrayList, boolean z, boolean z2) {
        FragmentActivity activity = ua0.getActivity();
        if (activity != null) {
            Intent intent = new Intent();
            intent.putExtra(C66579MXk.A00(1099), z);
            intent.putExtra(C66579MXk.A00(1097), z2);
            intent.putExtra(C66579MXk.A00(1096), str);
            intent.putStringArrayListExtra(C66579MXk.A00(1103), arrayList);
            activity.setResult(-1, intent);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int A022 = AnonymousClass0fD.A02(-1377696237);
        0qQ.A0B(layoutInflater, 0);
        View A0D = DbT.A0D(layoutInflater, viewGroup, R.layout.layout_videocall_share_screen_capture, false);
        AnonymousClass0fD.A09(-324730895, A022);
        return A0D;
    }

    public final void onDestroyView() {
        int A022 = AnonymousClass0fD.A02(1997290388);
        super.onDestroyView();
        this.A00 = null;
        AnonymousClass80C r0 = this.A01;
        if (r0 != null) {
            unregisterLifecycleListener(r0);
            r0.onDestroyView();
        }
        this.A01 = null;
        AnonymousClass0fD.A09(-821111063, A022);
    }

    public final void onResume() {
        int A022 = AnonymousClass0fD.A02(-857241524);
        super.onResume();
        Activity A032 = DbT.A03(this);
        this.A05.getValue();
        C357628Yy.A00(A032);
        AnonymousClass0fD.A09(1799807907, A022);
    }
}
