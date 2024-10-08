package X;

import android.content.Context;
import android.view.ViewGroup;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;

/* renamed from: X.8M3  reason: invalid class name */
public final /* synthetic */ class AnonymousClass8M3 implements AnonymousClass2gO {
    public final /* synthetic */ AnonymousClass8LU A00;

    public /* synthetic */ AnonymousClass8M3(AnonymousClass8LU r1) {
        this.A00 = r1;
    }

    public final void onChanged(Object obj) {
        0sP r1;
        float f;
        C376429Hy r4;
        AnonymousClass8LU r3 = this.A00;
        C381529bu r12 = (C381529bu) obj;
        AnonymousClass8M1 r0 = r3.A0v;
        AnonymousClass8M1 r18 = r0;
        if (r0 != null) {
            C354428Lz r9 = r3.A0n;
            UserSession userSession = r3.A0c;
            C354188Kz r8 = r3.A0o;
            AnonymousClass861 r28 = r3.A0y;
            ClipsCreationViewModel clipsCreationViewModel = r3.A0u;
            AnonymousClass80G r7 = r3.A04;
            ViewGroup viewGroup = r3.A0X;
            C41407AtT atT = new C41407AtT(r3);
            0qQ.A0B(userSession, 0);
            0qQ.A0B(r12, 1);
            0qQ.A0B(r8, 2);
            0qQ.A0B(r28, 3);
            0qQ.A0B(clipsCreationViewModel, 4);
            0qQ.A0B(r7, 6);
            0qQ.A0B(viewGroup, 7);
            switch (r12.A05.ordinal()) {
                case 0:
                    C376429Hy r21 = r12.A03;
                    float f2 = r12.A01;
                    float f3 = r12.A00;
                    if (f2 < 0.5625f) {
                        f = 0.5625f / f2;
                    } else {
                        f = 1.0f;
                    }
                    float f4 = f * 3.0f;
                    if (r9.A00 != f4) {
                        r8.A09 = true;
                        r8.A00 = f3;
                        r8.A01 = 3.0f;
                        float f5 = 0.5625f / f2;
                        r8.A08 = new B0A(r9, new float[]{0.0f, 0.0f, 0.5625f, 0.0f, 0.5625f, f5, 0.0f, f5}, f2, f4);
                        Context context = viewGroup.getContext();
                        0qQ.A07(context);
                        C380379Xt r02 = r9.A02;
                        if (r02 == null) {
                            r02 = new C380379Xt(context);
                            r9.A02 = r02;
                        }
                        r02.setShowGuide(true);
                        r1 = new C41667AyJ(viewGroup, r21, r7, r9, r8, r02, clipsCreationViewModel, r18, r28, f4, f2);
                        break;
                    } else {
                        return;
                    }
                case 1:
                    r4 = r12.A03;
                    break;
                case 2:
                    r8.A09(0.33333334f, 0.0f, 0.0f, 0.0f);
                    return;
                case 3:
                    r4 = r12.A03;
                    r9.A04 = false;
                    C376429Hy A03 = C39899AIg.A03(r4, r9.A01);
                    float f6 = A03.A02;
                    float f7 = A03.A00;
                    float f8 = r9.A00;
                    r8.A09(A03.A03 / 3.0f, f6, f7 / f8, A03.A01 / f8);
                    r9.A04 = true;
                    break;
                case 4:
                    r8.A00 = r12.A00;
                    return;
                case 5:
                    C376429Hy r5 = r12.A04;
                    float f9 = r5.A02;
                    float f10 = r5.A00;
                    float f11 = r9.A00;
                    r8.A09(r5.A03 / 3.0f, f9, f10 / f11, r5.A01 / f11);
                    return;
                default:
                    throw new RuntimeException();
            }
            if (r9.A00 != 1.0f) {
                r8.A09 = false;
                Context context2 = viewGroup.getContext();
                0qQ.A07(context2);
                C380379Xt r03 = r9.A02;
                if (r03 == null) {
                    r03 = new C380379Xt(context2);
                    r9.A02 = r03;
                }
                r03.setShowGuide(true);
                float f12 = r9.A00;
                C41668AyK ayK = new C41668AyK(r9, r28, r18, r4, r03, r7, atT, clipsCreationViewModel, r8, viewGroup, 1);
                if (f12 < 0.0f) {
                    r7.A09(ayK);
                    return;
                }
                r1 = new C58733Iwg(ayK, f12, 5);
                r7.A09(r1);
            }
        }
    }
}
