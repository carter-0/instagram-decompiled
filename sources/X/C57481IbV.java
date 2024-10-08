package X;

import com.instagram.wonderwall.model.WallPostItem;

/* renamed from: X.IbV  reason: case insensitive filesystem */
public final class C57481IbV implements JQP {
    public final /* synthetic */ WallPostItem A00;
    public final /* synthetic */ C53048Ghg A01;

    public C57481IbV(WallPostItem wallPostItem, C53048Ghg ghg) {
        this.A01 = ghg;
        this.A00 = wallPostItem;
    }

    public final void DXF() {
        C53048Ghg ghg = this.A01;
        G9w.A1K(ghg.A00, C57484IbY.A00, ghg.A02.A01);
    }

    public final void Dzx(String str) {
        C53048Ghg ghg = this.A01;
        G9w.A1K(ghg.A00, new C57483IbX(this.A00), ghg.A02.A01);
        C53048Ghg.A02(C57514Ic2.A00, ghg);
    }

    public final void E01(WallPostItem wallPostItem) {
        C53048Ghg ghg = this.A01;
        C53048Ghg.A03(ghg, C59098J6g.A01(wallPostItem, 20));
        G9w.A1K(ghg.A00, new C57482IbW(wallPostItem), ghg.A02.A01);
    }
}
