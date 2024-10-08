package X;

import com.instagram.creation.genai.magicmod.model.MagicModPostCaptureTransform;
import java.util.List;

/* renamed from: X.IyF  reason: case insensitive filesystem */
public final class C58830IyF extends 0Yg implements 0sP {
    public final /* synthetic */ C3018260f A00;
    public final /* synthetic */ C3018260f A01;
    public final /* synthetic */ MagicModPostCaptureTransform A02;
    public final /* synthetic */ C53527Gpx A03;
    public final /* synthetic */ C55638Hkx A04;
    public final /* synthetic */ C62320sa A05;
    public final /* synthetic */ C62320sa A06;
    public final /* synthetic */ 0sP A07;
    public final /* synthetic */ 0sP A08;
    public final /* synthetic */ 0sL A09;
    public final /* synthetic */ AnonymousClass62P A0A;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58830IyF(C3018260f r2, C3018260f r3, MagicModPostCaptureTransform magicModPostCaptureTransform, C53527Gpx gpx, C55638Hkx hkx, C62320sa r7, C62320sa r8, 0sP r9, 0sP r10, 0sL r11, AnonymousClass62P r12) {
        super(1);
        this.A0A = r12;
        this.A03 = gpx;
        this.A07 = r9;
        this.A09 = r11;
        this.A08 = r10;
        this.A02 = magicModPostCaptureTransform;
        this.A00 = r2;
        this.A01 = r3;
        this.A04 = hkx;
        this.A06 = r7;
        this.A05 = r8;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        JP8 jp8 = (JP8) obj;
        0qQ.A0B(jp8, 0);
        AnonymousClass62P r10 = this.A0A;
        J2H j2h = J2H.A00;
        0sP r13 = this.A07;
        0sL r11 = this.A09;
        0sP r12 = this.A08;
        MagicModPostCaptureTransform magicModPostCaptureTransform = this.A02;
        J2J j2j = J2J.A00;
        int size = r10.size();
        C59102J6k j6k = new C59102J6k(13, (List) r10, (0sP) j2h);
        C59102J6k j6k2 = j6k;
        jp8.CfC(j6k2, new C59102J6k(14, (List) r10, (0sP) j2j), (0sL) null, AnonymousClass5PI.A04(new C59433JJi(1, r10, r11, r12, r13, magicModPostCaptureTransform), 699646206, true), size);
        C53527Gpx gpx = this.A03;
        int i = gpx.A00;
        jp8.CfC((0sP) null, C58871Iyw.A00, (0sL) null, AnonymousClass5PI.A04(new C59427JJc(4, this.A00, this.A01, this.A04, gpx), 1311419882, true), i);
        jp8.Cf5((Object) null, (Object) null, J2I.A00, AnonymousClass5PI.A04(new C59361JGn(10, this.A05, this.A06, gpx), 895029836, true));
        return C60340gF.A00;
    }
}
