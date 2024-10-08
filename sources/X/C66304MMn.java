package X;

import android.view.View;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import org.webrtc.EglBase14Impl;

/* renamed from: X.MMn  reason: case insensitive filesystem */
public final class C66304MMn extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    public static C227862kA A00(Object obj, C62320sa r3, C62320sa r4, C62230ry r5, int i) {
        return new C227862kA(r3, r4, new C66304MMn(i, obj, (Object) null), r5);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C66304MMn(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A02 = obj;
        this.A01 = obj2;
    }

    public static C66304MMn A01(Object obj, Object obj2, int i) {
        return new C66304MMn(i, obj, obj2);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        UserSession userSession;
        C313666go r2;
        C277954w0 r0;
        C277884vt r02;
        AnonymousClass07P r1;
        Object invoke;
        switch (this.A00) {
            case 3:
                return new KD0((UserSession) this.A01, (C313666go) this.A02);
            case 4:
                View view = ((L9Q) this.A02).A01;
                Object obj = this.A01;
                C313666go r12 = C313666go.VIEWER;
                int i = R.id.iglive_surface_view_frame_container;
                if (obj == r12) {
                    i = R.id.iglive_media_layout;
                }
                return AnonymousClass7TF.A0G(view, i);
            case 9:
                userSession = (UserSession) this.A02;
                r2 = C313666go.GUEST;
                break;
            case 16:
                userSession = (UserSession) this.A02;
                r2 = C313666go.VIEWER;
                break;
            case EglBase14Impl.EGLExt_SDK_VERSION:
                AnonymousClass4DH r13 = (AnonymousClass4DH) this.A01;
                return new C61578KDf(r13.requireContext(), r13, (UserSession) this.A02);
            case 23:
                AnonymousClass4DH r14 = (AnonymousClass4DH) this.A01;
                return new C61579KDg(r14.requireContext(), r14, (UserSession) this.A02);
            case 25:
                UserSession userSession2 = ((C64083LMb) this.A02).A01;
                AnonymousClass4DH r15 = (AnonymousClass4DH) this.A01;
                return new C61580KDh(r15.requireContext(), r15, userSession2);
            case 36:
                return new KD4((AnonymousClass4DH) this.A01, (UserSession) this.A02);
            case 39:
                C62259Kct kct = (C62259Kct) this.A02;
                UserSession userSession3 = kct.A03;
                AnonymousClass4DH r22 = kct.A02;
                return new KE8(r22.requireContext(), r22, userSession3, (C313666go) this.A01);
            default:
                C62320sa r03 = (C62320sa) this.A01;
                if (r03 != null && (invoke = r03.invoke()) != null) {
                    return invoke;
                }
                AnonymousClass07g A0c = C51969G9p.A0c(this.A02);
                if (!(A0c instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) A0c) == null) {
                    return AnonymousClass2YP.A00;
                }
                return r1.getDefaultViewModelCreationExtras();
        }
        C270194gL r04 = (C270194gL) this.A01;
        boolean z = true;
        if (r04 == null || (r0 = r04.A02) == null || (r02 = r0.A0A) == null || !r02.CVs()) {
            z = false;
        }
        return new C61577KDe(userSession, r2, z);
    }
}
