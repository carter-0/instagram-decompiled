package X;

import android.content.Context;
import android.text.Spannable;
import android.text.TextUtils;
import com.instagram.ui.text.TextShadow;
import java.util.List;
import org.webrtc.CameraVideoCapturer;

/* renamed from: X.9o8  reason: invalid class name and case insensitive filesystem */
public final class C388629o8 extends AnonymousClass91c {
    public float A00;
    public int A01;
    public final int A02;
    public final C360728f3 A03 = C360728f3.FLASHING;
    public final List A04;

    public final int getDurationInMs() {
        return CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS;
    }

    public C388629o8(Context context, int i) {
        super(context, i);
        Float valueOf = Float.valueOf(0.0f);
        Float valueOf2 = Float.valueOf(0.5f);
        Float valueOf3 = Float.valueOf(0.9f);
        Float valueOf4 = Float.valueOf(1.0f);
        List A1P = 0sr.A1P(new Float[]{valueOf, valueOf2, valueOf3, valueOf4, valueOf4, valueOf4, valueOf4, valueOf3, valueOf2, valueOf});
        this.A04 = A1P;
        this.A02 = CameraVideoCapturer.CameraStatistics.CAMERA_FREEZE_REPORT_TIMOUT_MS / A1P.size();
    }

    public final void A0R() {
        int i;
        super.A0R();
        if (!TextUtils.isEmpty(this.A0F)) {
            Spannable spannable = this.A0F;
            0qQ.A07(spannable);
            C380239Xe r2 = (C380239Xe) C263324Kh.A00(spannable, C380239Xe.class);
            if (r2 == null) {
                Spannable spannable2 = this.A0F;
                0qQ.A07(spannable2);
                C358848bZ[] r22 = (C358848bZ[]) C263324Kh.A06(spannable2, C358848bZ.class);
                if (r22.length == 0) {
                    i = this.A0b.getColor();
                } else {
                    i = r22[0].A05;
                }
                Context context = this.A0Z;
                0qQ.A07(context);
                r2 = new C380239Xe(context);
                r2.A01 = i;
                r2.A00 = i;
                r2.updateDrawState(this.A0b);
                AnonymousClass7TG.A17(this.A0F, r2);
            }
            TextShadow textShadow = r2.A03;
            Context context2 = this.A0Z;
            0qQ.A07(context2);
            this.A00 = textShadow.A01(context2);
            float[] fArr = new float[3];
            2eL.A09(r2.A00, fArr);
            this.A01 = 2eL.A07(new float[]{fArr[0], fArr[1] * 0.5f, fArr[2] - 0.2f});
        }
    }
}
