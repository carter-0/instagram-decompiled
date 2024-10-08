package X;

import android.content.Context;
import java.util.Set;
import org.webrtc.CameraCapturer;

/* renamed from: X.VcZ  reason: case insensitive filesystem */
public final class C17704VcZ {
    public int A00;
    public int A01;
    public int A02;
    public int A03;
    public long A04;
    public W3O A05;
    public WGM A06;
    public C18038VkM A07;
    public C17790Vg2 A08;
    public C17337VRq A09;
    public final Context A0A;
    public final VLJ A0B;

    public C17704VcZ(Context context, C18031VkB vkB, C17770Vfh vfh, C18038VkM vkM, C17337VRq vRq, Set set, Set set2, AnonymousClass0eK r18) {
        this.A0A = context;
        this.A0B = new VLJ(r18);
        this.A07 = vkM;
        this.A09 = vRq;
        WGM wgm = new WGM(vfh);
        this.A06 = wgm;
        C17790Vg2 vg2 = new C17790Vg2();
        this.A08 = vg2;
        vg2.A01.add(wgm);
        C17790Vg2 vg22 = this.A08;
        vg22.A00.add(this.A06);
        for (Object next : set2) {
            if (next != null) {
                this.A08.A01.add(next);
            }
        }
        for (Object next2 : set) {
            if (next2 != null) {
                this.A08.A00.add(next2);
            }
        }
        this.A00 = 50;
        this.A01 = 1;
        this.A02 = CameraCapturer.OPEN_CAMERA_TIMEOUT;
        this.A03 = 3;
        this.A04 = 86400000;
        VLJ vlj = this.A0B;
        this.A05 = new W3O(this.A0A, this, vlj, this.A08, this.A06, vkB, this.A07, this.A09);
    }
}
