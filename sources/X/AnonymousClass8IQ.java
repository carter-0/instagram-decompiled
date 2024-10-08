package X;

import android.app.Application;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.sundial.viewmodel.ClipsCreationViewModel;
import java.util.List;

/* renamed from: X.8IQ  reason: invalid class name */
public final class AnonymousClass8IQ {
    public final FragmentActivity A00;
    public final UserSession A01;
    public final TargetViewSizeProvider A02;
    public final C3511387s A03;
    public final AnonymousClass8IR A04;
    public final AnonymousClass0eM A05 = AnonymousClass0eN.A01(new AnonymousClass9LJ(this, 40));
    public final C3499582p A06;
    public final AnonymousClass835 A07;
    public final ClipsCreationViewModel A08;
    public final AnonymousClass88V A09;

    /* JADX WARNING: type inference failed for: r0v3, types: [java.lang.Object, X.2YM] */
    public AnonymousClass8IQ(FragmentActivity fragmentActivity, AnonymousClass4DH r9, UserSession userSession, TargetViewSizeProvider targetViewSizeProvider, C3499582p r12, AnonymousClass8IP r13) {
        0qQ.A0B(r12, 6);
        this.A01 = userSession;
        this.A00 = fragmentActivity;
        this.A02 = targetViewSizeProvider;
        this.A06 = r12;
        C3511387s A002 = new 2YN(new C3511287r(fragmentActivity, userSession), fragmentActivity).A00(C3511387s.class);
        this.A03 = A002;
        AnonymousClass88V A003 = new 2YN(new Object(), fragmentActivity).A00(AnonymousClass88V.class);
        this.A09 = A003;
        ClipsCreationViewModel A004 = new 2YN(new C3500182v(userSession, fragmentActivity), fragmentActivity).A00(ClipsCreationViewModel.class);
        this.A08 = A004;
        Application application = fragmentActivity.getApplication();
        0qQ.A07(application);
        AnonymousClass835 A005 = C3500382y.A00(application, userSession).A00(A004.A0S);
        this.A07 = A005;
        this.A04 = new AnonymousClass8IR(fragmentActivity, userSession);
        AnonymousClass07Z viewLifecycleOwner = r9.getViewLifecycleOwner();
        A002.A0H.A06(r9, new AnonymousClass8IS(new AnonymousClass9M5(5, this, r13)));
        A005.A05.A00.A06(r9, new AnonymousClass8IS(new C377089Km(this, 3)));
        AnonymousClass11O.A03(AnonymousClass07a.A00(viewLifecycleOwner), new C61860pz(new AnonymousClass9K8(r13, this, (AnonymousClass4D7) null), A003.A0A));
    }

    public final int A00() {
        String str;
        List BrX;
        int i;
        C279454yf r0;
        Integer num;
        int intValue;
        C3511387s r2 = this.A03;
        C270564gw r02 = r2.A04;
        if (r02 == null || (BrX = r02.BrX()) == null) {
            str = "Template segments info is null.";
        } else {
            2Fk r1 = this.A07.A05.A00;
            AnonymousClass831 r03 = (AnonymousClass831) r1.A02();
            if (r03 != null) {
                i = AnonymousClass8YL.A00(r03);
            } else {
                AnonymousClass831 r04 = (AnonymousClass831) r1.A02();
                if (r04 != null) {
                    i = r04.A01.size();
                } else {
                    i = 0;
                }
            }
            if (r2.A0N() && (num = r2.A0A) != null && (intValue = num.intValue()) < BrX.size()) {
                r0 = (C279454yf) 00k.A0O(BrX, intValue);
                if (r0 == null) {
                    str = "Index to replace is out of bounds.";
                }
            } else if (i < BrX.size()) {
                r0 = (C279454yf) 00k.A0O(BrX, i);
                if (r0 == null) {
                    str = "Segment store size is out of bounds.";
                }
            } else {
                str = "Getting segment length after all empty segments filled.";
            }
            return (int) r0.getDurationInMs();
        }
        0kD.A07("ClipsTemplateCaptureController", str, (Throwable) null);
        return 15000;
    }
}
