package X;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import androidx.activity.ComponentActivity;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.fragment.app.Fragment;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.assetpicker.cutout.data.CutoutStickerRepository;
import com.instagram.creation.capture.quickcapture.aspectratioutil.TargetViewSizeProvider;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubNetworkDataSource;
import com.instagram.creation.capture.quickcapture.inspirationhub.network.InspirationHubRepository;
import go.Seq;
import java.util.ArrayList;
import java.util.List;

public final class MJ9 extends 0Yg implements C62320sa {
    public final int A00;
    public final Object A01;
    public final Object A02;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public MJ9(int i, Object obj, Object obj2) {
        super(0);
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        C318136oS r5;
        0sL r4;
        Object invoke;
        Object invoke2;
        AnonymousClass07P r1;
        2YM defaultViewModelProviderFactory;
        AnonymousClass07P r12;
        Object invoke3;
        switch (this.A00) {
            case 0:
                C357638Yz r2 = (C357638Yz) this.A02;
                C3495480u r13 = (C3495480u) this.A01;
                0qQ.A0B(r13, 0);
                r2.A09.A02(r13);
                r2.A0J.remove(r13);
                break;
            case 1:
                29J r22 = (29J) this.A01;
                JZ7 jz7 = (JZ7) this.A02;
                boolean z = true;
                if (jz7.A07.size() <= jz7.A00 && !AnonymousClass7TE.A1b(jz7.A06)) {
                    z = false;
                }
                boolean z2 = r22.A01;
                if (!z) {
                    if (!z2 && r22.A03) {
                        29E r3 = r22.A04;
                        r3.A0C("ui_load_failure", r22.A00);
                        r22.A00 = r3.A07("ui_load_failure", "", 17640780, r22.A00);
                        break;
                    }
                } else if (!z2 && r22.A03) {
                    29E r52 = r22.A04;
                    r52.A0C("ui_load_success", r22.A00);
                    r22.A00 = r52.A02(17640780, r22.A00);
                    r22.A01 = true;
                    break;
                }
            case 2:
            case 3:
            case 4:
                ((29J) this.A02).A01(((C317876nz) this.A01).A0Z);
                break;
            case 6:
            case 8:
            case 9:
                C62320sa r0 = (C62320sa) this.A01;
                if (r0 == null || (invoke = r0.invoke()) == null) {
                    return JTU.A08(this.A02);
                }
                return invoke;
            case 7:
                return new CutoutStickerRepository((Context) this.A01, (UserSession) this.A02);
            case 10:
                Activity activity = (Activity) 0mE.A00((Context) this.A01, Activity.class);
                if (activity != null) {
                    UserSession userSession = (UserSession) this.A02;
                    0qQ.A0B(userSession, 1);
                    AnonymousClass37E r32 = AnonymousClass37D.A00;
                    AnonymousClass37D A012 = r32.A01(activity);
                    boolean z3 = true;
                    if (A012 == null || !((AnonymousClass37F) A012).A0g) {
                        z3 = false;
                    }
                    Fragment fragment = null;
                    if (!z3) {
                        C63135Ks3.A00(activity, (Fragment) null, userSession);
                        break;
                    } else {
                        AnonymousClass37D A013 = r32.A01(activity);
                        if (A013 != null) {
                            fragment = A013.A09();
                        }
                        AnonymousClass37D A014 = r32.A01(activity);
                        if (A014 != null) {
                            ((AnonymousClass37F) A014).A0H = new C65751Lz5(1, activity, fragment, userSession);
                        }
                        DbX.A10(activity, r32);
                        break;
                    }
                }
                break;
            case 11:
                JW7 jw7 = (JW7) this.A02;
                ArrayList arrayList = (ArrayList) this.A01;
                try {
                    C64151LQo lQo = C63528Kyd.A00;
                    UserSession userSession2 = jw7.A0z;
                    AnonymousClass4DH r6 = jw7.A0x;
                    Resources resources = jw7.getResources();
                    0qQ.A07(resources);
                    jw7.A0X((L0A) null, AnonymousClass7TE.A1D(lQo.A02(resources, r6, userSession2, "posts", arrayList)), false);
                    break;
                } catch (C270384ge unused) {
                    C59689JTv.A0F(AnonymousClass7TE.A0S(jw7), AnonymousClass000.A00(1381), 2131962946);
                    break;
                }
            case 14:
                C19319WUb wUb = (C19319WUb) this.A02;
                Context context = wUb.A0H;
                0qQ.A07(context);
                return new AnonymousClass87F(context, (AnonymousClass3E6) this.A01, wUb.A0P);
            case 15:
                return new C3497781s((View) this.A02, (AnonymousClass80D) this.A01);
            case 16:
                return new C349317zw((Activity) this.A01, (UserSession) this.A02);
            case 17:
                return new C342227oF((TargetViewSizeProvider) this.A01, new C64981LlK((C39903AIl) this.A02));
            case 19:
                C362048hG r14 = (C362048hG) this.A02;
                C362048hG.A0K(r14, (List) this.A01);
                r14.A10.A0C.Epw((Object) null);
                break;
            case 20:
                C362048hG.A0J((C362048hG) this.A02, AnonymousClass7TE.A1I(this.A01));
                break;
            case 21:
                ((Runnable) this.A01).run();
                29R A0b = JTO.A0b(((AnonymousClass8XA) this.A02).A0F);
                1Ln A08 = 1Ln.A08(A0b.A02);
                C279294yP A0J = A0b.A0J();
                if (DbT.A1Y(A08) && A0J != null) {
                    JTO.A1V(A08);
                    AnonymousClass283 A082 = Dbc.A08(A08, A0J, A0b, "TIMELINE_SWAP_SHORTER_DONE_TAP");
                    A08.A0n(27x.A09.getModuleName());
                    A08.A0c(A082.A0A);
                    JTS.A1E(A08);
                    break;
                }
            case 23:
                2YL r33 = (2YL) this.A02;
                Object obj = this.A01;
                r5 = C318116oQ.A00(r33);
                r4 = new C66163MGa(obj, r33, (AnonymousClass4D7) null, 34);
                break;
            case 24:
                return AnonymousClass7TE.A0u();
            case 25:
                UserSession userSession3 = (UserSession) this.A02;
                return new InspirationHubRepository(userSession3, new InspirationHubNetworkDataSource(userSession3, (Context) this.A01), 1Au.A00(userSession3));
            case 27:
                return new KCZ((UserSession) this.A01, ((C65786Lze) this.A02).A01);
            case 28:
                C339407jY r23 = (C339407jY) this.A02;
                C339417jZ r15 = r23.A01;
                C339417jZ r02 = C339417jZ.A03;
                if (r15 != r02) {
                    C339407jY.A01(r02, r23);
                }
                DbS.A1U(this.A01);
                break;
            case 30:
                C19318WUa wUa = (C19318WUa) this.A02;
                Context context2 = wUa.A08;
                0qQ.A07(context2);
                return new AnonymousClass87F(context2, (AnonymousClass3E6) this.A01, wUa.A0E);
            case 31:
                View findViewById = ((C40347Aag) this.A02).A00.A0N().findViewById(R.id.exit_button);
                AnonymousClass0fU.A00(new AOX((C351978Be) this.A01, 10), findViewById);
                return findViewById;
            case 34:
                ((0sP) this.A02).invoke(this.A01);
                break;
            case 35:
            case 36:
            case 37:
                2YL A0H = DbS.A0H(((K4N) this.A02).A01);
                boolean A1X = C51971G9r.A1X((C270284gU) this.A01);
                r5 = C318116oQ.A00(A0H);
                r4 = new JV6((Object) A0H, (AnonymousClass4D7) null, 16, A1X);
                break;
            case 38:
                return Boolean.valueOf(AnonymousClass7TF.A1R(((WindowInsets) C51966G9m.A18(this.A02)).AhD((C268024cd) this.A01)));
            case Seq.NULL_REFNUM:
                C59938Jc2 jc2 = (C59938Jc2) this.A02;
                jc2.A01((C62320sa) this.A01);
                jc2.A00 = null;
                break;
            case Seq.RefTracker.REF_OFFSET:
            case 43:
                C62320sa r03 = (C62320sa) this.A01;
                if (r03 == null || (invoke2 = r03.invoke()) == null) {
                    return ((ComponentActivity) this.A02).getDefaultViewModelCreationExtras();
                }
                return invoke2;
            case 44:
                AnonymousClass07g A0c = C51969G9p.A0c(this.A01);
                if (!(A0c instanceof AnonymousClass07P) || (r1 = (AnonymousClass07P) A0c) == null || (defaultViewModelProviderFactory = r1.getDefaultViewModelProviderFactory()) == null) {
                    return ((Fragment) this.A02).getDefaultViewModelProviderFactory();
                }
                return defaultViewModelProviderFactory;
            case 45:
                ((B21) this.A01).DCS(this.A02);
                break;
            default:
                C62320sa r04 = (C62320sa) this.A01;
                if (r04 != null && (invoke3 = r04.invoke()) != null) {
                    return invoke3;
                }
                AnonymousClass07g A0c2 = C51969G9p.A0c(this.A02);
                if (!(A0c2 instanceof AnonymousClass07P) || (r12 = (AnonymousClass07P) A0c2) == null) {
                    return AnonymousClass2YP.A00;
                }
                return r12.getDefaultViewModelCreationExtras();
        }
        AnonymousClass7TE.A1Z(r4, r5);
        return C60340gF.A00;
    }
}
