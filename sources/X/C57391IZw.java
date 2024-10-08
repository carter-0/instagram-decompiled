package X;

import com.instagram.clips.intf.ClipsWatchAndBrowseData;

/* renamed from: X.IZw  reason: case insensitive filesystem */
public final class C57391IZw implements C13823Tht {
    public final /* synthetic */ ClipsWatchAndBrowseData A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ GDS A02;

    public final /* synthetic */ void Cyn() {
    }

    public final /* synthetic */ void DVD() {
    }

    public C57391IZw(ClipsWatchAndBrowseData clipsWatchAndBrowseData, 1Xj r2, GDS gds) {
        this.A02 = gds;
        this.A01 = r2;
        this.A00 = clipsWatchAndBrowseData;
    }

    public final void DA6() {
        GDS gds = this.A02;
        GDT.A00(gds.A09, this.A01, gds.A0A, "double_tap", "fullscreen");
    }

    public final boolean DPO() {
        GDS gds = this.A02;
        GDT.A00(gds.A09, this.A01, gds.A0A, "long_press", "fullscreen");
        return this.A00.A0G;
    }

    public final void Dkz() {
        GDS gds = this.A02;
        GDT.A00(gds.A09, this.A01, gds.A0A, "single_tap", "fullscreen");
    }
}
