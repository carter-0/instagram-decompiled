package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;

/* renamed from: X.9Mg  reason: invalid class name and case insensitive filesystem */
public final class C377549Mg extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;
    public final Object A06;
    public final Object A07;
    public final Object A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377549Mg(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        super(0);
        this.A00 = i;
        this.A05 = obj;
        this.A08 = obj2;
        this.A04 = obj3;
        this.A03 = obj4;
        this.A02 = obj5;
        this.A06 = obj6;
        this.A01 = obj7;
        this.A07 = obj8;
    }

    /* JADX WARNING: type inference failed for: r1v6, types: [X.0sa, X.9Na] */
    public final /* bridge */ /* synthetic */ Object invoke() {
        switch (this.A00) {
            case 0:
                AnonymousClass9H6 r2 = (AnonymousClass9H6) this.A08;
                return new C72505P8o(r2.A00.requireActivity(), (AnonymousClass4DH) this.A04, r2.A01, (OT9) ((AnonymousClass0eM) this.A03).getValue(), (C332247Uf) this.A01, (AnonymousClass7SM) this.A05, (AnonymousClass0eK) this.A02, (AnonymousClass0eK) this.A07, (AnonymousClass0eK) this.A06);
            case 1:
                AnonymousClass9H6 r5 = (AnonymousClass9H6) this.A08;
                UserSession userSession = r5.A01;
                C332237Ue r3 = (C332237Ue) this.A04;
                ? r1 = new AnonymousClass9Na(r3, 4);
                AnonymousClass0eK r4 = (AnonymousClass0eK) this.A03;
                AnonymousClass0iw r8 = (AnonymousClass0iw) this.A01;
                return new P9S(r5.A00.requireActivity(), r8, userSession, new OF1((AnonymousClass4DH) this.A05, userSession, r4, r1), (AnonymousClass7V2) r3.A0N.getValue(), (C72527P9k) ((AnonymousClass0eM) this.A06).getValue(), (AnonymousClass7XN) ((AnonymousClass0eM) this.A02).getValue(), r4, (C62320sa) this.A07);
            case 2:
                AnonymousClass9H6 r12 = (AnonymousClass9H6) this.A08;
                UserSession userSession2 = r12.A01;
                AnonymousClass0iw r82 = (AnonymousClass0iw) this.A01;
                OJa oJa = (OJa) ((AnonymousClass0eM) this.A05).getValue();
                OT9 ot9 = (OT9) ((AnonymousClass0eM) this.A04).getValue();
                AnonymousClass7SM r13 = (AnonymousClass7SM) this.A06;
                return new C72521P9e(r12.A00.requireActivity(), r82, userSession2, oJa, ot9, (C332247Uf) this.A02, r13, (AnonymousClass0eK) this.A03, (AnonymousClass0eK) this.A07);
            case 3:
                AnonymousClass9H6 r14 = (AnonymousClass9H6) this.A08;
                return new PA3(r14.A00.requireActivity(), (AnonymousClass0iw) this.A01, r14.A01, (OJa) ((AnonymousClass0eM) this.A06).getValue(), (OT9) ((AnonymousClass0eM) this.A05).getValue(), (AnonymousClass7XB) ((AnonymousClass0eM) this.A02).getValue(), (AnonymousClass0eK) this.A03, (AnonymousClass0eK) this.A07, new C41396AtI(this.A04, 10));
            case 4:
                AnonymousClass2rB r32 = (AnonymousClass2rB) this.A08;
                if (C231512rn.A00(r32.A00).A07(r32.A01.getModuleName())) {
                    return null;
                }
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                Fragment fragment = (Fragment) this.A04;
                return new C231622ry(fragmentActivity, fragment, new C231612rx(fragment, fragmentActivity), (C229382nI) this.A05, (AnonymousClass2kR) this.A03, (0Pl) this.A06, (C249763kK) this.A07, "main_feed", false, false, false);
            default:
                FragmentActivity fragmentActivity2 = (FragmentActivity) this.A01;
                Fragment fragment2 = (Fragment) this.A04;
                0Pl r132 = (0Pl) this.A07;
                AnonymousClass2oE r11 = (AnonymousClass2oE) this.A06;
                return new AnonymousClass2s3(fragmentActivity2, fragment2, new C231612rx(fragment2, fragmentActivity2), (C229382nI) this.A05, r11, (AnonymousClass2kR) this.A03, r132, (C249763kK) this.A08, "main_feed");
        }
    }
}
