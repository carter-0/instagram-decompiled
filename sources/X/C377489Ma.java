package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.constants.ShareType;
import com.instagram.profile.fragment.UserDetailFragment;
import com.instagram.react.modules.base.IgReactQEModule;
import com.instagram.user.model.User;

/* renamed from: X.9Ma  reason: invalid class name and case insensitive filesystem */
public final class C377489Ma extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final Object A04;
    public final Object A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C377489Ma(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A04 = obj2;
        this.A05 = obj3;
        this.A02 = obj4;
        this.A03 = obj5;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        1Xj r1;
        switch (this.A00) {
            case 0:
                AnonymousClass9H6 r7 = (AnonymousClass9H6) this.A05;
                AnonymousClass4DH r8 = r7.A00;
                C73897PlY plY = new C73897PlY(r7, 11);
                AnonymousClass0eM A002 = AnonymousClass0eN.A00(0eO.A02, new C73897PlY(new C73897PlY(r8, 12), 13));
                C227862kA r0 = new C227862kA(new C73897PlY(A002, 14), plY, new C73665Phe(9, A002, (Object) null), new 0Yh(C314326i1.class));
                UserSession userSession = r7.A01;
                AnonymousClass7SM r11 = (AnonymousClass7SM) this.A04;
                return new C72528P9l(r8.requireActivity(), (C314326i1) r0.getValue(), r8, (AnonymousClass0iw) this.A01, userSession, r11, (C332247Uf) this.A02, r11, (AnonymousClass0eK) this.A03);
            case 1:
                AnonymousClass9H6 r12 = (AnonymousClass9H6) this.A05;
                return new C72504P8n(r12.A00.requireActivity(), r12.A01, (C332837Wo) ((AnonymousClass0eM) this.A04).getValue(), (C332887Wv) ((AnonymousClass0eM) this.A03).getValue(), (AnonymousClass7XL) ((AnonymousClass0eM) this.A01).getValue(), (AnonymousClass0eK) this.A02);
            case 2:
                AnonymousClass9H6 r02 = (AnonymousClass9H6) this.A05;
                UserSession userSession2 = r02.A01;
                FragmentActivity requireActivity = r02.A00.requireActivity();
                C73897PlY plY2 = new C73897PlY(this.A01, 18);
                return new P9J((Fragment) this.A03, requireActivity, userSession2, (OT9) ((AnonymousClass0eM) this.A02).getValue(), (C273434mZ) this.A04, plY2);
            case 3:
                AnonymousClass0eK r6 = (AnonymousClass0eK) this.A01;
                AnonymousClass9H6 r03 = (AnonymousClass9H6) this.A05;
                UserSession userSession3 = r03.A01;
                FragmentActivity requireActivity2 = r03.A00.requireActivity();
                AnonymousClass0eM r04 = (AnonymousClass0eM) this.A02;
                AnonymousClass7SM r5 = (AnonymousClass7SM) this.A04;
                return new C40470Acf(0sr.A1P(new C332867Wr[]{new C72506P8p(requireActivity2, userSession3, (OT9) r04.getValue(), r5, r6), new C72507P8q((AnonymousClass4DH) this.A03, userSession3, (OT9) r04.getValue(), r5, r6)}));
            case 4:
                return new A7A((Fragment) this.A03, ((AnonymousClass9H6) this.A05).A01, (AnonymousClass7SM) this.A04, (C332247Uf) this.A01, (AnonymousClass0eK) this.A02);
            case 5:
                AnonymousClass9H6 r13 = (AnonymousClass9H6) this.A05;
                C332907Wx r10 = (C332907Wx) ((AnonymousClass0eM) this.A04).getValue();
                C3258674m r122 = new C3258674m((C62320sa) this.A03);
                return new C3258774n(r13.A00.requireActivity(), (AnonymousClass0iw) this.A01, r13.A01, r13.A02, r10, (AnonymousClass0eK) this.A02, r122);
            case 6:
                AnonymousClass334 r05 = (AnonymousClass334) this.A05;
                AnonymousClass07Z r82 = r05.A00;
                AnonymousClass4DU r132 = r05.A04;
                AnonymousClass33B Aqg = ((AnonymousClass314) this.A02).Aqg();
                Context context = (Context) this.A01;
                UserSession userSession4 = (UserSession) this.A04;
                return new HFm(context, (FragmentActivity) this.A03, r82, r05.A01, userSession4, Aqg, (C252613pO) r05.A0U.getValue(), r132);
            case 7:
                1Xj r2 = (1Xj) this.A03;
                return ((C263044Gz) ((C245813dW) this.A05).A08.getValue()).A01((Context) this.A01, r2, r2, (AnonymousClass4DU) this.A02, (AnonymousClass3W1) this.A04);
            case 8:
                AnonymousClass2rB r06 = (AnonymousClass2rB) this.A05;
                return new C232432th((Context) this.A01, r06.A01, r06.A00, (C230582pr) this.A03, (C249763kK) this.A04, (C230662pz) this.A02);
            case 9:
                C230582pr r9 = (C230582pr) this.A03;
                AnonymousClass2rB r07 = (AnonymousClass2rB) this.A05;
                AnonymousClass4DU r72 = r07.A01;
                Context context2 = (Context) this.A01;
                C249763kK r102 = (C249763kK) this.A04;
                return new C232442ti(context2, r72, r07.A00, r9, r102, (C230662pz) this.A02);
            case 10:
                UserSession userSession5 = ((AnonymousClass2rB) this.A05).A00;
                return new C232482tn((Context) this.A01, (Fragment) this.A02, (C229382nI) this.A03, userSession5, (C230072os) this.A04);
            case 11:
                AnonymousClass2rB r08 = (AnonymousClass2rB) this.A05;
                return new C231692s7((Context) this.A01, r08.A01, r08.A00, (C228412ld) this.A04, (C229332nD) this.A02, (C229182my) this.A03);
            case IgReactQEModule.CONFIG_KEY_OFFSET /*12*/:
                AnonymousClass2rB r09 = (AnonymousClass2rB) this.A05;
                UserSession userSession6 = r09.A00;
                return new C231742sF((Context) this.A01, r09.A01, userSession6, (AnonymousClass2p0) this.A04, (C230162p3) this.A03, ((C229792oF) this.A02).A01);
            case 13:
                AnonymousClass2rB r010 = (AnonymousClass2rB) this.A05;
                return new AnonymousClass2sD((Context) this.A01, r010.A01, r010.A00, (C230212pD) this.A02, (C228102kn) this.A03, (C230272pJ) this.A04);
            case 14:
                ((UserDetailFragment) this.A03).A0q();
                2FW r14 = 2FW.A1O;
                C49731F3w A07 = 1as.A04.A02.A07((AnonymousClass0iw) this.A02, (UserSession) this.A05, r14);
                A07.A06(((User) this.A04).getId());
                AnonymousClass37D A012 = AnonymousClass37D.A00.A01((Activity) this.A01);
                A07.A01();
                if (A012 != null) {
                    A012.A0J(A07.A00());
                    break;
                }
                break;
            default:
                1ZU A003 = C48794EkH.A00();
                FragmentActivity fragmentActivity = (FragmentActivity) this.A01;
                AnonymousClass35W r4 = (AnonymousClass35W) this.A05;
                A003.A03(fragmentActivity, r4.A0T, (1Xj) this.A02);
                ShareType shareType = (ShareType) this.A04;
                AnonymousClass3Q2 r15 = (AnonymousClass3Q2) this.A03;
                C2368135e r22 = r4.A0Z;
                if (r22.A01(r15, shareType) && (r1 = r15.A1C) != null) {
                    r22.A00(fragmentActivity, r1, shareType, r4.A0Y.getSessionId());
                    break;
                }
        }
        return C60340gF.A00;
    }
}
