package X;

import android.content.DialogInterface;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.ArrayList;
import java.util.List;

public final class AK3 implements DialogInterface.OnClickListener {
    public final /* synthetic */ C359318cb A00;

    public AK3(C359318cb r1) {
        this.A00 = r1;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C270564gw r0;
        List BrX;
        C359318cb r10 = this.A00;
        C3511387s r11 = r10.A0u;
        AnonymousClass831 r2 = r11.A08;
        if (r2 != null) {
            r11.A0L.A0O.A02.Epw(r2);
            r11.A08 = null;
        } else {
            ClipsCreationViewModel clipsCreationViewModel = r11.A0L;
            AnonymousClass831 r02 = (AnonymousClass831) clipsCreationViewModel.A0F.A02();
            if (r02 != null) {
                ArrayList A05 = r02.A05();
                if (!A05.isEmpty() && (r0 = r11.A04) != null && (BrX = r0.BrX()) != null && !BrX.isEmpty()) {
                    int size = A05.size();
                    C270564gw r03 = r11.A04;
                    0qQ.A0A(r03);
                    int size2 = r03.BrX().size();
                    int min = Math.min(size, size2);
                    for (int i2 = 0; i2 < min; i2++) {
                        C270564gw r04 = r11.A04;
                        0qQ.A0A(r04);
                        int durationInMs = (int) ((C279454yf) r04.BrX().get(i2)).getDurationInMs();
                        if (((AnonymousClass51N) A05.get(i2)).BrP() != durationInMs) {
                            ClipsCreationViewModel.A03(C359548d5.VIDEO_CLIP_TRIM, clipsCreationViewModel, true);
                            ClipsCreationViewModel.A05(clipsCreationViewModel, i2, 0, durationInMs);
                        }
                    }
                    while (size2 < size) {
                        clipsCreationViewModel.A0U(size2, false);
                        size2++;
                    }
                }
            }
        }
        r10.A0N(C390839rv.MID_CAPTURE);
    }
}
