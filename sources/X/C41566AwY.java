package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import go.Seq;

/* renamed from: X.AwY  reason: case insensitive filesystem */
public final class C41566AwY extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C41566AwY(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Object invoke;
        AnonymousClass07P r1;
        2YM defaultViewModelProviderFactory;
        AnonymousClass07P r12;
        Object invoke2;
        switch (this.A00) {
            case 0:
                29P r0 = (29P) this.A02;
                return ((OKE) this.A01).A00(r0.getFilenamePrefix(), r0.getFilenameSuffix());
            case 1:
                return new C22338Xzn((AnonymousClass0iw) this.A01, (UserSession) this.A02);
            case 5:
            case 8:
                AnonymousClass07g r13 = (AnonymousClass07g) ((AnonymousClass0eM) this.A01).getValue();
                if (!(r13 instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) r13) == null || (defaultViewModelProviderFactory = r1.getDefaultViewModelProviderFactory()) == null) {
                    return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            case 9:
            case 10:
            case 13:
            case 15:
            case 19:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                C62320sa r02 = (C62320sa) this.A01;
                if (r02 == null || (invoke = r02.invoke()) == null) {
                    return ((Fragment) this.A02).requireActivity().getDefaultViewModelCreationExtras();
                }
                return invoke;
            case Seq.NULL_REFNUM:
                AnonymousClass1Nd.A00((0lg) this.A02).A00(new C64644LfW((1Xj) this.A01));
                break;
            case Seq.RefTracker.REF_OFFSET:
                UserSession userSession = (UserSession) this.A02;
                1Ng A002 = AnonymousClass1Nd.A00(userSession);
                1Xj r2 = (1Xj) this.A01;
                A002.A00(new C64644LfW(r2));
                r2.A0C.ESl((DSX) null);
                1E7.A00(userSession).A03(r2);
                break;
            case 43:
                ((C3504584s) this.A02).A00.A07((AnonymousClass82C) this.A01);
                break;
            case 44:
                AnonymousClass82X r22 = ((C3504584s) this.A02).A00;
                Object obj = this.A01;
                0qQ.A0B(obj, 0);
                r22.A05.A0R.remove(obj);
                break;
            case 45:
                ((C3503584i) ((C353778Ja) this.A02).A00.A00.A00()).EEG((AnonymousClass82C) this.A01);
                break;
            case 46:
                01N A1H = 0jo.A1H();
                A1H.add(C353728Iv.CONCEPT_SCORES);
                if (0tS.A4E.A00().A0U()) {
                    A1H.add(C353728Iv.AESTHETICS_SCORES);
                    A1H.add(C353728Iv.OFFENSIVE_SCORES);
                }
                01N A1I = 0jo.A1I(A1H);
                Context applicationContext = ((Context) this.A01).getApplicationContext();
                0qQ.A07(applicationContext);
                return new C39725A6q(applicationContext, (UserSession) this.A02, A1I);
            case 49:
                return new C57341IXy((UserSession) this.A02, (1L5) this.A01, 0);
            default:
                C62320sa r03 = (C62320sa) this.A01;
                if (r03 != null && (invoke2 = r03.invoke()) != null) {
                    return invoke2;
                }
                AnonymousClass07g r14 = (AnonymousClass07g) ((AnonymousClass0eM) this.A02).getValue();
                if (!(r14 instanceof AnonymousClass07P) || (r12 = (AnonymousClass07P) r14) == null) {
                    return AnonymousClass2YP.A00;
                }
                return r12.getDefaultViewModelCreationExtras();
        }
        return C60340gF.A00;
    }
}
