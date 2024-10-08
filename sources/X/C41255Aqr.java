package X;

import com.google.common.collect.ImmutableList;
import com.instagram.camera.effect.models.CameraAREffect;
import com.instagram.common.gallery.Medium;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Aqr  reason: case insensitive filesystem */
public final class C41255Aqr implements Runnable {
    public final /* synthetic */ 1NW A00;
    public final /* synthetic */ CameraSpec A01;
    public final /* synthetic */ C353498Hw A02;
    public final /* synthetic */ C10812RyY A03;
    public final /* synthetic */ File A04;
    public final /* synthetic */ List A05;
    public final /* synthetic */ boolean A06;

    public C41255Aqr(1NW r1, CameraSpec cameraSpec, C353498Hw r3, C10812RyY ryY, File file, List list, boolean z) {
        this.A02 = r3;
        this.A06 = z;
        this.A05 = list;
        this.A04 = file;
        this.A01 = cameraSpec;
        this.A03 = ryY;
        this.A00 = r1;
    }

    public final void run() {
        C353538Ia r0;
        C353498Hw r12 = this.A02;
        C353278Gz r5 = r12.A0C;
        if (r5 != null) {
            r5.A01 = false;
        }
        if (this.A06) {
            ImmutableList.Builder builder = new ImmutableList.Builder();
            List<C10641Rva> list = this.A05;
            for (C10641Rva rva : list) {
                try {
                    C349307zv r1 = rva.A02;
                    CameraAREffect cameraAREffect = r1.A0P;
                    if (cameraAREffect != null) {
                        builder.add(cameraAREffect);
                        if (!r1.A18) {
                            AnonymousClass7TE.A0t(r1.A0k).delete();
                        }
                    }
                } catch (RuntimeException unused) {
                    0kD.A07("ClipsCaptureControllerImpl", "unable to delete file for layout video", (Throwable) null);
                }
            }
            File file = this.A04;
            Medium A032 = C282665Eg.A03(file, 3, 0);
            CameraSpec cameraSpec = this.A01;
            int i = cameraSpec.A03;
            int i2 = cameraSpec.A02;
            A032.A0B = i;
            A032.A04 = i2;
            ArrayList A0r = AnonymousClass7TG.A0r(list);
            for (C10641Rva rva2 : list) {
                A0r.add(rva2.A02.A02().A03);
            }
            A032.A0G.A03 = C59737JVv.A02(r12.A1D, "", 00k.A0X(A0r));
            C349307zv r13 = new C349307zv(A032, i, i2, 0);
            int i3 = (int) this.A03.A06;
            r13.A07 = i3;
            r13.A0H = 0;
            r13.A06 = i3;
            0qQ.A07(file.getAbsolutePath());
            C353498Hw.A0J(builder.build(), (ImmutableList) null, r12.A1m.A00(), r12, r13, file, (Boolean) null, AnonymousClass05K.A01, (String) null, i3, 0, 0, i3, false, true);
            r12.A1F.A0M(C358088aL.A0z);
            if (r12.A1g()) {
                r0 = new C366388oq(false);
            } else if (C353498Hw.A05(r12) != null) {
                r0 = C379279Tf.A00;
            } else if (C353498Hw.A1X(r12)) {
                r0 = new C366378op(false);
            }
            C353498Hw.A0O(r0, r12);
        } else {
            String absolutePath = this.A04.getAbsolutePath();
            0qQ.A07(absolutePath);
            C353498Hw.A16(r12, (Exception) null, absolutePath, "onMergingStarted failed", false, false);
            if (r5 != null) {
                C381799cL r14 = C381799cL.A02;
                0qQ.A0B(r14, 0);
                r5.A03.A0A(r14);
            }
            r12.A1h.A0A("onMergingStarted failed");
        }
        this.A00.getLooper().quitSafely();
    }
}
