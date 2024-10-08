package X;

import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import com.instagram.music.common.model.AudioOverlayTrack;
import com.instagram.music.common.model.MusicAssetModel;
import java.util.ArrayList;
import java.util.List;

/* renamed from: X.Abb  reason: case insensitive filesystem */
public final class C40404Abb implements C66474MTc {
    public final /* synthetic */ C353498Hw A00;
    public final /* synthetic */ C293505kq A01;

    public C40404Abb(C353498Hw r1, C293505kq r2) {
        this.A00 = r1;
        this.A01 = r2;
    }

    public final void DAK(List list) {
        String str;
        C353498Hw r6 = this.A00;
        ClipsCreationViewModel clipsCreationViewModel = r6.A1n;
        ArrayList A0r = AnonymousClass7TG.A0r(list);
        for (Object r1 : list) {
            A0r.add(new AnonymousClass8Y4(r1));
        }
        clipsCreationViewModel.A0K.A0C(A0r);
        AudioOverlayTrack audioOverlayTrack = (AudioOverlayTrack) 00k.A0L(list);
        if (audioOverlayTrack != null) {
            C293505kq r12 = this.A01;
            29I r4 = 27p.A01(r6.A1D).A02;
            String str2 = r12.A0T;
            String str3 = audioOverlayTrack.A0A;
            String str4 = audioOverlayTrack.A0B;
            MusicAssetModel musicAssetModel = audioOverlayTrack.A08;
            if (musicAssetModel != null) {
                str = musicAssetModel.A0I;
            } else {
                str = null;
            }
            r4.A05(str2, str3, str4, str);
        }
    }

    public final void DAL() {
        C353498Hw r3 = this.A00;
        if (r3.A0l) {
            C59689JTv.A0F(r3.A11, "music_track_not_available", 2131967895);
            C353498Hw.A0b(r3);
            r3.A1h.A03();
        }
    }
}
