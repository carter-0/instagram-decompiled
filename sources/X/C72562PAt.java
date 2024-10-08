package X;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.instagram.android.R;
import java.util.HashMap;

/* renamed from: X.PAt  reason: case insensitive filesystem */
public final class C72562PAt implements AnonymousClass7D2 {
    public final AnonymousClass7DU A00;
    public final AnonymousClass7DU A01;
    public final AnonymousClass7XR A02;
    public final C72567PAy A03;
    public final AnonymousClass768 A04;
    public final AnonymousClass7DZ A05;
    public final HashMap A06 = AnonymousClass7TE.A1E();
    public final boolean A07;
    public final boolean A08;

    public final /* bridge */ /* synthetic */ void ADp(C328007Db r6, AnonymousClass7FW r7) {
        PBX pbx = (PBX) r6;
        NYO nyo = (NYO) r7;
        C72567PAy pAy = this.A03;
        C72578PBj pBj = pbx.A02;
        C328697Fu r3 = nyo.A00;
        pAy.ADp(pBj, r3);
        AnonymousClass79c r2 = nyo.A01;
        if (r2 != null) {
            this.A04.ADp(pbx.A03, r2);
        }
        C328087Dj r0 = pBj.A01;
        if (r0 != null) {
            ((C328077Di) r0).A00 = r3;
        }
        C328087Dj BY0 = pbx.A03.BY0();
        if (BY0 != null) {
            ((C328077Di) BY0).A00 = r2;
        }
        this.A05.A02(pbx, nyo);
    }

    public final /* bridge */ /* synthetic */ void FIP(C328007Db r4) {
        PBX pbx = (PBX) r4;
        C72567PAy pAy = this.A03;
        C72578PBj pBj = pbx.A02;
        pAy.FIP(pBj);
        AnonymousClass768 r0 = this.A04;
        AnonymousClass76M r2 = pbx.A03;
        r0.FIP(r2);
        C328087Dj r1 = pBj.A01;
        if (r1 != null) {
            ((C328077Di) r1).A00 = null;
        }
        C328087Dj BY0 = r2.BY0();
        if (BY0 != null) {
            ((C328077Di) BY0).A00 = null;
        }
        this.A05.A01(pbx);
    }

    public C72562PAt(AnonymousClass7XR r3, AnonymousClass9HC r4, C72567PAy pAy, AnonymousClass768 r6, AnonymousClass7DZ r7) {
        this.A03 = pAy;
        this.A04 = r6;
        this.A05 = r7;
        this.A02 = r3;
        boolean z = r4.A1X;
        this.A08 = z;
        this.A07 = AnonymousClass7TF.A1Z(r4.A0g);
        this.A01 = new C3265977k(r3, z);
        this.A00 = new C3265977k(r3, z);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.7XR, X.7Xr, X.7XN, java.lang.Object, X.7XH, X.7XX] */
    public final /* bridge */ /* synthetic */ C328007Db ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        LayoutInflater layoutInflater2 = layoutInflater;
        ViewGroup viewGroup2 = viewGroup;
        LinearLayout linearLayout = (LinearLayout) layoutInflater2.inflate(R.layout.container_with_legacy_text, viewGroup2, false);
        C72567PAy pAy = this.A03;
        C72578PBj pBj = new C72578PBj(layoutInflater2.inflate(R.layout.direct_media_share_message, viewGroup2, false));
        pAy.A02.A00(pBj);
        FrameLayout frameLayout = pBj.A05;
        linearLayout.addView(frameLayout, frameLayout.getLayoutParams());
        AnonymousClass768 r1 = this.A04;
        AnonymousClass76M r2 = new AnonymousClass76M((TextView) layoutInflater2.inflate(R.layout.direct_text_message_text_view, viewGroup2, false));
        r1.A03.A00(r2);
        TextView textView = r2.A03;
        linearLayout.addView(textView, textView.getLayoutParams());
        PBX pbx = new PBX(linearLayout, pBj, r2);
        this.A06.put(r2, pbx);
        C72578PBj pBj2 = pbx.A02;
        ? r15 = this.A02;
        P82 p82 = new P82(r15);
        AnonymousClass7DU r13 = this.A01;
        boolean z = this.A08;
        AnonymousClass7DV r14 = new AnonymousClass7DV(r15, z);
        AnonymousClass7DX r11 = new AnonymousClass7DX(r15);
        LinearLayout linearLayout2 = pbx.A01;
        boolean z2 = this.A07;
        C72578PBj pBj3 = pBj2;
        C328067Dh r9 = new C328067Dh(linearLayout2, r11, p82, r13, r14, r15, pBj3, z, true, z2);
        pBj2.A01 = r9;
        pBj2.A05.setOnTouchListener(r9);
        AnonymousClass76M r92 = pbx.A03;
        NYF nyf = new NYF(r15, this, pbx);
        AnonymousClass76C r6 = new AnonymousClass76C(r15);
        AnonymousClass7DV r12 = new AnonymousClass7DV(r15, z);
        C328067Dh r16 = new C328067Dh(linearLayout2, new AnonymousClass7DX(r15), r6, nyf, r12, r15, r92, z, true, z2);
        TextView textView2 = r92.A03;
        AnonymousClass76R r0 = new AnonymousClass76R(r16, linearLayout2, textView2, z);
        r92.A01 = r16;
        r92.EdM(nyf);
        textView2.setOnTouchListener(r0);
        this.A05.A00(pbx);
        return pbx;
    }
}
