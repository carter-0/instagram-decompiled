package X;

import android.content.Context;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.instagram.android.R;

/* renamed from: X.9Qd  reason: invalid class name and case insensitive filesystem */
public final class C378529Qd {
    public float A00 = 1.0f;
    public ImageView A01;
    public MS7 A02;
    public final ViewGroup A03;
    public final AnonymousClass61R A04;
    public final Context A05;

    public C378529Qd(Context context, ViewGroup viewGroup) {
        this.A05 = context;
        this.A03 = viewGroup;
        this.A04 = C303756Aq.A00(context, R.raw.smart_capture_hand_indicator);
        if (viewGroup.findViewById(R.id.hand_indicator_keyframe_view) == null) {
            ((ViewStub) AnonymousClass7TF.A0F(viewGroup, R.id.pre_capture_camera_hand_indicator_container_stub)).inflate();
        }
    }
}
