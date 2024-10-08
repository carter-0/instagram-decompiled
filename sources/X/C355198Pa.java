package X;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.File;
import java.util.Map;

/* renamed from: X.8Pa  reason: invalid class name and case insensitive filesystem */
public final class C355198Pa implements C355208Pb {
    public final /* synthetic */ AnonymousClass8PZ A00;

    public final Integer BPR() {
        return null;
    }

    public final int BlP() {
        return 60000;
    }

    public final void DSn() {
    }

    public C355198Pa(AnonymousClass8PZ r1) {
        this.A00 = r1;
    }

    public final AnonymousClass51M CEK() {
        return this.A00.A07;
    }

    public final void D0a() {
        AnonymousClass8PZ.A00(this.A00, false);
    }

    public final void D5Y() {
        AnonymousClass8PZ r8 = this.A00;
        int i = r8.A01;
        int i2 = r8.A00;
        if (i == i2) {
            C59689JTv.A07(r8.A0B, 2131975540);
            return;
        }
        AnonymousClass8Q2 r2 = r8.A0K;
        if (r2.A02 != AnonymousClass05K.A00) {
            AnonymousClass51M r0 = r8.A07;
            if (r0 != null) {
                AnonymousClass51R r7 = r0.A0F;
                boolean z = r2.A04;
                File file = new File(r7.A0F);
                CameraSpec A002 = r8.A0M.A00();
                int i3 = A002.A03;
                int i4 = A002.A02;
                0na r10 = new 0na(70, 3, false, true);
                C12326SrY srY = new C12326SrY();
                C40402AbZ abZ = new C40402AbZ(r8);
                Context context = r8.A0B;
                C11354SOn A003 = C9606Rdk.A00(context, file, false);
                if (A003 == null) {
                    abZ.DtT(new Exception("metadata corrupt"), true);
                } else {
                    SRj.A03(A003, A002.A04, (Map) null, i3, i4, true);
                    0nY.A00().ATE(new RAY(A003, srY, abZ, r7, r8, file, r10, i2, i, i3, i4, z));
                }
                FragmentActivity requireActivity = r8.A0D.requireActivity();
                FrameLayout frameLayout = new FrameLayout(context);
                r8.A06 = frameLayout;
                frameLayout.setClickable(true);
                requireActivity.getLayoutInflater().inflate(R.layout.layout_spinner_for_processing_video, r8.A06);
                requireActivity.addContentView(r8.A06, new FrameLayout.LayoutParams(-1, -1));
                return;
            }
            throw new IllegalStateException("Required value was null.");
        }
        AnonymousClass8PZ.A00(r8, true);
    }

    public final void DFU() {
        AnonymousClass8PZ r2 = this.A00;
        AnonymousClass4MM r1 = r2.A08;
        if (r1 != null) {
            r1.seekTo(r2.A01);
            AnonymousClass4MM r0 = r2.A08;
            if (r0 != null) {
                r0.start();
                return;
            }
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DFV() {
        AnonymousClass4MM r0 = this.A00.A08;
        if (r0 != null) {
            r0.pause();
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void Dgq() {
        AnonymousClass8PZ r5 = this.A00;
        int i = r5.A03;
        int i2 = r5.A02;
        boolean z = r5.A0K.A04;
        if (r5.A05 != null) {
            0nA.A0p(r5.A0C, new C41215AqD(r5, i, i2, z));
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DiT(int i) {
        AnonymousClass4MM r0 = this.A00.A08;
        if (r0 != null) {
            r0.seekTo(i);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DuD(int i) {
        AnonymousClass8PZ r1 = this.A00;
        AnonymousClass4MM r0 = r1.A08;
        if (r0 != null) {
            r1.A00 = i;
            r0.seekTo(i);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }

    public final void DuF(int i) {
        AnonymousClass8PZ r1 = this.A00;
        AnonymousClass4MM r0 = r1.A08;
        if (r0 != null) {
            r1.A01 = i;
            r0.seekTo(i);
            return;
        }
        throw new IllegalStateException("Required value was null.");
    }
}
