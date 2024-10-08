package com.instagram.video.live.mvvm.viewmodel.cameraeffect;

import X.05G;
import X.0eS;
import X.0sH;
import X.AnonymousClass1Ek;
import X.AnonymousClass4D7;
import X.AnonymousClass7TE;
import X.AnonymousClass80V;
import X.C60216JhZ;
import X.C60340gF;
import X.JV5;
import X.K0R;
import X.V4Y;
import com.instagram.camera.effect.models.CameraAREffect;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "com.instagram.video.live.mvvm.viewmodel.cameraeffect.IgLiveFaceFilterViewModel$1", f = "IgLiveFaceFilterViewModel.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
public final class IgLiveFaceFilterViewModel$1 extends AnonymousClass1Ek implements 0sH {
    public /* synthetic */ Object A00;
    public /* synthetic */ boolean A01;
    public /* synthetic */ boolean A02;
    public /* synthetic */ boolean A03;
    public /* synthetic */ boolean A04;
    public final /* synthetic */ C60216JhZ A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public IgLiveFaceFilterViewModel$1(C60216JhZ jhZ, AnonymousClass4D7 r3) {
        super(6, r3);
        this.A05 = jhZ;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        boolean A1a = AnonymousClass7TE.A1a(obj);
        boolean A1a2 = AnonymousClass7TE.A1a(obj2);
        boolean A1a3 = AnonymousClass7TE.A1a(obj3);
        boolean A1a4 = AnonymousClass7TE.A1a(obj4);
        IgLiveFaceFilterViewModel$1 igLiveFaceFilterViewModel$1 = new IgLiveFaceFilterViewModel$1(this.A05, (AnonymousClass4D7) obj6);
        igLiveFaceFilterViewModel$1.A01 = A1a;
        igLiveFaceFilterViewModel$1.A02 = A1a2;
        igLiveFaceFilterViewModel$1.A03 = A1a3;
        igLiveFaceFilterViewModel$1.A04 = A1a4;
        igLiveFaceFilterViewModel$1.A00 = obj5;
        return igLiveFaceFilterViewModel$1.invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        C60216JhZ jhZ;
        AnonymousClass80V r4;
        K0R k0r;
        0eS.A00(obj);
        boolean z = this.A01;
        boolean z2 = this.A02;
        boolean z3 = this.A03;
        boolean z4 = this.A04;
        V4Y v4y = (V4Y) this.A00;
        CameraAREffect cameraAREffect = null;
        if (!(v4y instanceof K0R) || (k0r = (K0R) v4y) == null || !k0r.A01) {
            cameraAREffect = this.A05.A00;
        }
        if (!z) {
            jhZ = this.A05;
            r4 = AnonymousClass80V.HIDDEN;
        } else if (z2 || z3 || !z4) {
            jhZ = this.A05;
            r4 = AnonymousClass80V.CAPTURE;
        } else {
            jhZ = this.A05;
            r4 = AnonymousClass80V.PRE_CAPTURE_AR_EFFECT_TRAY;
        }
        05G r3 = jhZ.A06;
        r3.Epw(new JV5(cameraAREffect, r4, ((JV5) r3.getValue()).A01));
        return C60340gF.A00;
    }
}
