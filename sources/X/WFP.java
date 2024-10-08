package X;

import com.instagram.archive.fragment.ArchiveReelMapFragment;
import java.util.ArrayList;

public final /* synthetic */ class WFP implements X2E {
    public final /* synthetic */ int A00;
    public final /* synthetic */ int A01;
    public final /* synthetic */ ArchiveReelMapFragment A02;

    public /* synthetic */ WFP(ArchiveReelMapFragment archiveReelMapFragment, int i, int i2) {
        this.A02 = archiveReelMapFragment;
        this.A00 = i;
        this.A01 = i2;
    }

    public final void DPZ(WFU wfu) {
        ArchiveReelMapFragment archiveReelMapFragment = this.A02;
        int i = this.A00;
        int i2 = this.A01;
        archiveReelMapFragment.mFacebookMap = wfu;
        archiveReelMapFragment.A03 = new WFB(wfu, archiveReelMapFragment.getSession(), archiveReelMapFragment, new ArrayList(), i, i2);
        archiveReelMapFragment.mFacebookMap.A08(3.0f);
        ArchiveReelMapFragment.A01(archiveReelMapFragment);
        WFU wfu2 = archiveReelMapFragment.mFacebookMap;
        wfu2.A05 = new WFE(archiveReelMapFragment, 0);
        UH0 uh0 = new UH0((X8E) archiveReelMapFragment.A03, wfu2);
        wfu2.A0A(uh0);
        archiveReelMapFragment.mClusterOverlay = uh0;
        C17369VSw vSw = archiveReelMapFragment.A06;
        C17552Va5 va5 = uh0.A07;
        va5.A02 = vSw;
        va5.A04.A00 = vSw.A01;
        ArchiveReelMapFragment.A00(archiveReelMapFragment.mFacebookMap.A02(), archiveReelMapFragment);
    }
}
