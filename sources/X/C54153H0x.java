package X;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import com.instagram.schools.management.data.SchoolInfo;
import com.instagram.schools.management.data.SchoolOnboardingParcelData;
import java.util.Iterator;

/* renamed from: X.H0x  reason: case insensitive filesystem */
public abstract class C54153H0x extends AnonymousClass4DH implements AnonymousClass4DR, AnonymousClass4DS {
    public static final String __redex_internal_original_name = "SchoolOnboardingBaseFragment";
    public final AnonymousClass0eM A00;
    public final AnonymousClass0eM A01 = AnonymousClass0eN.A01(new C58681Ivq(this, 8));
    public final AnonymousClass0eM A02;
    public final AnonymousClass0eM A03 = C227642jf.A02(this);
    public final AnonymousClass0eM A04;

    public final void configureActionBar(2da r2) {
        int i;
        0qQ.A0B(r2, 0);
        switch (A04().ordinal()) {
            case 0:
                i = 2131968792;
                break;
            case 1:
                i = 2131968810;
                break;
            case 2:
                i = 2131968809;
                break;
            case 3:
                i = 2131968808;
                break;
            case 4:
                i = 2131968802;
                break;
            default:
                i = 2131968797;
                break;
        }
        DbW.A1B(r2, i);
    }

    public void onViewCreated(View view, Bundle bundle) {
        0qQ.A0B(view, 0);
        super.onViewCreated(view, bundle);
        HMD A042 = A04();
        0qQ.A0B(A042, 0);
        C55352HgK.A00.add(A042);
        INA A0a = G9w.A0a(this);
        C54672HOd hOd = C53035GhR.A00(this).A00;
        C54684HOp A002 = A00(this);
        String str = C53035GhR.A00(this).A0E;
        AnonymousClass7TG.A1T(hOd, A002, str);
        C51976G9y.A0U(hOd, A002, INA.A00(A0a), "ig_school_registration_page_impression", str);
    }

    public final UserSession A03() {
        if (this instanceof HEH) {
            return AnonymousClass7TE.A0l(((HEH) this).A00);
        }
        if (this instanceof HEK) {
            return AnonymousClass7TE.A0l(((HEK) this).A01);
        }
        if (this instanceof HEG) {
            return AnonymousClass7TE.A0l(((HEG) this).A00);
        }
        if (this instanceof HEF) {
            return AnonymousClass7TE.A0l(((HEF) this).A00);
        }
        if (this instanceof HEI) {
            return AnonymousClass7TE.A0l(((HEI) this).A00);
        }
        return AnonymousClass7TE.A0l(((HEJ) this).A00);
    }

    public final HMD A04() {
        if (this instanceof HEH) {
            return HMD.SWITCH_SCHOOL;
        }
        if (this instanceof HEK) {
            return HMD.STUDENT_EMAIL;
        }
        if (this instanceof HEG) {
            return HMD.SCHOOL_SELECTION;
        }
        if (this instanceof HEF) {
            return HMD.GRADUATION_DATE;
        }
        if (this instanceof HEI) {
            return HMD.CONFIRM_SCHOOL;
        }
        return HMD.ADD_SCHOOL;
    }

    public final C53035GhR A05() {
        return (C53035GhR) this.A04.getValue();
    }

    public C54153H0x() {
        0eO r5 = 0eO.A02;
        this.A02 = C51804G2n.A01(this, "EXTRA_SCHOOL_ONBOARDING_DATA", r5, 37);
        C58681Ivq ivq = new C58681Ivq(this, 12);
        AnonymousClass0eM A002 = AnonymousClass0eN.A00(r5, new C58681Ivq(new C58681Ivq(this, 9), 10));
        this.A04 = DbS.A0I(new C58681Ivq(A002, 11), ivq, new C58691Iw0(20, (Object) null, A002), DbS.A0z(C53035GhR.class));
        this.A00 = AnonymousClass0eN.A00(r5, new C58681Ivq(this, 7));
    }

    public static final C54684HOp A00(C54153H0x h0x) {
        switch (h0x.A04().ordinal()) {
            case 0:
                return C54684HOp.ADD_SCHOOL;
            case 1:
                return C54684HOp.SWITCH_SCHOOL;
            case 2:
                return C54684HOp.CONFIRM_ENROLLMENT;
            case 3:
                return C54684HOp.MULTI_SCHOOL;
            case 4:
                return C54684HOp.GRADUATION_DATE;
            default:
                return C54684HOp.CONFIRM_SCHOOL;
        }
    }

    public static final SchoolOnboardingParcelData A01(C54153H0x h0x) {
        C53393GnQ A002 = C53035GhR.A00(h0x);
        String str = A002.A09;
        String str2 = A002.A0D;
        HM6 hm6 = A002.A05;
        Integer num = A002.A07;
        Integer num2 = A002.A08;
        ImmutableList immutableList = A002.A02;
        ImmutableList immutableList2 = A002.A03;
        String str3 = A002.A0C;
        String str4 = A002.A0B;
        String str5 = A002.A0A;
        boolean z = A002.A0F;
        HM5 hm5 = A002.A04;
        C54635HLs hLs = A002.A06;
        boolean z2 = A002.A0G;
        String str6 = A002.A0E;
        C54672HOd hOd = A002.A00;
        String str7 = str;
        return new SchoolOnboardingParcelData(hOd, hm5, hm6, hLs, num, num2, str7, str2, str3, str4, str5, str6, immutableList, immutableList2, A002.A01, z, z2);
    }

    public final void A06() {
        DbW.A1J(this, Dba.A0J(requireContext(), A03(), 2EG.A1V, "https://help.instagram.com/772158705067006"));
        G9w.A0a(this).A06(C53035GhR.A00(this).A00, A00(this), C53035GhR.A00(this).A0E);
    }

    public final void A07() {
        String str = "continue";
        switch (A04().ordinal()) {
            case 2:
            case 3:
                break;
            case 5:
                str = "confirm_school";
                break;
            default:
                str = "next";
                break;
        }
        INA A0a = G9w.A0a(this);
        C54672HOd hOd = C53035GhR.A00(this).A00;
        C54684HOp A002 = A00(this);
        String str2 = C53035GhR.A00(this).A0E;
        AnonymousClass7TG.A1T(hOd, A002, str2);
        0Aj A0e = AnonymousClass7TE.A0e(INA.A00(A0a), "ig_school_registration_progress_button_tap");
        if (A0e.isSampled()) {
            C51971G9r.A15(hOd, A002, A0e);
            A0e.AAJ("waterfall_id", str2);
            A0e.AAJ(C273654mx.A00(244), str);
            DbX.A1L(A0e);
        }
    }

    public final void A08() {
        INA A0a = G9w.A0a(this);
        C54672HOd hOd = C53035GhR.A00(this).A00;
        C54684HOp A002 = A00(this);
        String str = C53035GhR.A00(this).A0E;
        AnonymousClass7TG.A1T(hOd, A002, str);
        C51976G9y.A0U(hOd, A002, INA.A00(A0a), "ig_school_registration_exit", str);
    }

    public final void A09() {
        int ordinal;
        C309516Yo r4;
        SchoolOnboardingParcelData schoolOnboardingParcelData;
        Fragment fragment;
        Object obj;
        String str;
        HMD hmd = (HMD) 00k.A0O(C53035GhR.A00(this).A01, C53035GhR.A00(this).A01.indexOf(A04()) + 1);
        if (hmd == null) {
            ordinal = -1;
        } else {
            ordinal = hmd.ordinal();
        }
        switch (ordinal) {
            case -1:
                Intent intent = new Intent();
                C53393GnQ A002 = C53035GhR.A00(this);
                Iterator it = A002.A02.iterator();
                while (true) {
                    if (it.hasNext()) {
                        obj = it.next();
                        if (0qQ.A0K(((SchoolInfo) obj).A01, A002.A0C)) {
                        }
                    } else {
                        obj = null;
                    }
                }
                SchoolInfo schoolInfo = (SchoolInfo) obj;
                if (schoolInfo == null || (str = schoolInfo.A02) == null) {
                    str = "";
                }
                AnonymousClass1Nd.A00(A03()).A00(new C321916ux(A002.A00, str, A002.A0E));
                FragmentActivity activity = getActivity();
                if (activity != null) {
                    activity.setResult(-1, intent);
                }
                DbX.A1I(this);
                return;
            case 0:
            case 1:
                return;
            case 2:
                r4 = C51975G9x.A0U(this);
                schoolOnboardingParcelData = A01(this);
                fragment = new HEK();
                break;
            case 3:
                r4 = C51975G9x.A0U(this);
                schoolOnboardingParcelData = A01(this);
                fragment = new HEG();
                break;
            case 4:
                r4 = C51975G9x.A0U(this);
                schoolOnboardingParcelData = A01(this);
                fragment = new HEF();
                break;
            case 5:
                r4 = C51975G9x.A0U(this);
                schoolOnboardingParcelData = A01(this);
                fragment = new HEI();
                break;
            default:
                throw AnonymousClass7TE.A1K();
        }
        Bundle A0a = AnonymousClass7TE.A0a();
        A0a.putParcelable("EXTRA_SCHOOL_ONBOARDING_DATA", schoolOnboardingParcelData);
        DbW.A0x(A0a, fragment, r4);
    }

    public final void A0A(C54681HOm hOm, String str) {
        INA A0a = G9w.A0a(this);
        C54672HOd hOd = C53035GhR.A00(this).A00;
        C54684HOp A002 = A00(this);
        String str2 = C53035GhR.A00(this).A0E;
        AnonymousClass7TG.A1T(hOd, A002, str2);
        0Aj A0e = AnonymousClass7TE.A0e(INA.A00(A0a), "ig_school_client_error");
        if (A0e.isSampled()) {
            C51971G9r.A15(hOd, A002, A0e);
            A0e.AAJ("waterfall_id", str2);
            A0e.A8M(hOm, "error");
            A0e.AAJ(AnonymousClass000.A00(241), str);
            DbX.A1L(A0e);
        }
    }

    public boolean onBackPressed() {
        INA A0a = G9w.A0a(this);
        C54672HOd hOd = C53035GhR.A00(this).A00;
        C54684HOp A002 = A00(this);
        String str = C53035GhR.A00(this).A0E;
        AnonymousClass7TG.A1T(hOd, A002, str);
        C51976G9y.A0U(hOd, A002, INA.A00(A0a), "ig_school_registration_back_button_tap", str);
        return false;
    }
}
