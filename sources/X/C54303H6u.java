package X;

import android.app.Application;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncBeatsInfoRepository;
import com.instagram.clips.audio.soundsync.repository.ClipsSoundSyncMediaImportRepository;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.cameraspec.CameraSpec;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

/* renamed from: X.H6u  reason: case insensitive filesystem */
public final class C54303H6u extends C228042kh {
    public final int A00;
    public final Application A01;
    public final Fragment A02;
    public final FragmentActivity A03;
    public final C53401GnY A04;
    public final UserSession A05;
    public final C357638Yz A06;
    public final CameraSpec A07;
    public final String A08;
    public final List A09;
    public final boolean A0A;
    public final boolean A0B;

    public C54303H6u(Fragment fragment, FragmentActivity fragmentActivity, C53401GnY gnY, UserSession userSession, C357638Yz r6, CameraSpec cameraSpec, String str, List list, int i, boolean z, boolean z2) {
        C51973G9u.A0r(1, userSession, cameraSpec, str);
        0qQ.A0B(r6, 7);
        this.A05 = userSession;
        this.A03 = fragmentActivity;
        this.A02 = fragment;
        this.A07 = cameraSpec;
        this.A08 = str;
        this.A04 = gnY;
        this.A06 = r6;
        this.A0B = z;
        this.A0A = z2;
        this.A09 = list;
        this.A00 = i;
        this.A01 = fragmentActivity.getApplication();
    }

    public final /* bridge */ /* synthetic */ 2YL create() {
        int i;
        if (this.A0B) {
            i = 90000;
        } else {
            i = this.A00;
        }
        Application application = this.A01;
        0qQ.A06(application);
        UserSession userSession = this.A05;
        FragmentActivity fragmentActivity = this.A03;
        Context A052 = DbT.A05(fragmentActivity);
        0qQ.A0B(userSession, 1);
        ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository = new ClipsSoundSyncMediaImportRepository(application, userSession, this.A07, this.A08);
        ClipsSoundSyncBeatsInfoRepository clipsSoundSyncBeatsInfoRepository = new ClipsSoundSyncBeatsInfoRepository(userSession);
        int dimensionPixelSize = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.achievements_list_container_height);
        int dimensionPixelSize2 = fragmentActivity.getResources().getDimensionPixelSize(R.dimen.add_to_story_dual_destination_share_sheet_story_row_height);
        C55451Hhv hhv = new C55451Hhv(new C355608Qq(application, userSession, AnonymousClass05K.A00, dimensionPixelSize, dimensionPixelSize2, false));
        C357638Yz r15 = this.A06;
        C53401GnY gnY = this.A04;
        boolean z = this.A0A;
        C356988Vz A002 = new 2YN(this.A02).A00(C356988Vz.class);
        ClipsCreationViewModel A003 = new 2YN(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        C3495780x A004 = new 2YN(new C3495680w(A052, userSession), fragmentActivity).A00(C3495780x.class);
        C55451Hhv hhv2 = hhv;
        UserSession userSession2 = userSession;
        C357638Yz r25 = r15;
        ClipsSoundSyncMediaImportRepository clipsSoundSyncMediaImportRepository2 = clipsSoundSyncMediaImportRepository;
        C55963HqU hqU = (C55963HqU) userSession.A01(C55963HqU.class, new C58188Ins(1, application, userSession));
        ClipsSoundSyncBeatsInfoRepository clipsSoundSyncBeatsInfoRepository2 = clipsSoundSyncBeatsInfoRepository;
        return new C52974GgR(application, gnY, (C55914Hpb) userSession.A01(C55914Hpb.class, new C20609Wvq(userSession, 47)), clipsSoundSyncBeatsInfoRepository2, hqU, clipsSoundSyncMediaImportRepository2, hhv2, userSession2, r25, A002, A003, A004, new 2YN(fragmentActivity).A00(AnonymousClass8J5.class), this.A09, i, z);
    }
}
