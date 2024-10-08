package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.direct.fragment.permanentmedia.MediaViewerReplyBarEligibilityCheckerImpl;
import com.instagram.modal.ModalActivity;
import com.instagram.modal.TransparentModalActivity;

/* renamed from: X.FOv  reason: case insensitive filesystem */
public final class C50105FOv implements View.OnClickListener {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public C50105FOv(Object obj, Object obj2, String str, String str2, int i) {
        this.A00 = i;
        this.A01 = obj;
        this.A02 = obj2;
        this.A03 = str;
        this.A04 = str2;
    }

    public final void onClick(View view) {
        int A05;
        int i;
        String str;
        switch (this.A00) {
            case 0:
                A05 = AnonymousClass0fD.A05(1560510088);
                E0f e0f = (E0f) this.A02;
                C49950FGf.A02((Context) this.A01, e0f, AnonymousClass7TE.A0l(e0f.A00), this.A03, this.A04, "tap_on_code_media_creation");
                i = 410192838;
                break;
            case 1:
                A05 = AnonymousClass0fD.A05(571631608);
                E0f e0f2 = (E0f) this.A02;
                C49950FGf.A02((Context) this.A01, e0f2, AnonymousClass7TE.A0l(e0f2.A00), this.A03, this.A04, "copy_button_media_creation");
                i = 789275877;
                break;
            case 2:
                A05 = AnonymousClass0fD.A05(838392483);
                Fragment fragment = (Fragment) this.A02;
                FragmentActivity requireActivity = fragment.requireActivity();
                AnonymousClass37D A0i = DbT.A0i(requireActivity);
                if (A0i != null) {
                    DbU.A1U(new C50977FmQ(this.A01, requireActivity, fragment, this.A03, this.A04, 0), A0i, A0i);
                }
                i = -307647519;
                break;
            case 3:
                A05 = AnonymousClass0fD.A05(-377188386);
                F0W f0w = (F0W) this.A01;
                String str2 = this.A03;
                String str3 = this.A04;
                int ordinal = ((C62587KiK) this.A02).ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        UserSession userSession = f0w.A02;
                        C70137Nxr.A00(f0w.A00, userSession, C69309NjA.PARTICIPATION_HUB, f0w.A04, str2, str3);
                    } else if (ordinal == 2) {
                        Bundle A0a = AnonymousClass7TE.A0a();
                        String str4 = f0w.A04;
                        if (str4 != null) {
                            A0a.putString("surface", C273654mx.A00(612));
                            A0a.putString("collection_id", str2);
                            A0a.putString(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str4);
                            C67002Mga.A01(A0a, C300965yF.A05(new C254763t0(str4)), AnonymousClass000.A00(925));
                            A0a.putString(AnonymousClass000.A00(2790), str2);
                            A0a.putSerializable(C66579MXk.A00(1055), C69309NjA.PARTICIPATION_HUB);
                            A0a.putParcelable(C66579MXk.A00(542), new MediaViewerReplyBarEligibilityCheckerImpl(false, false, false));
                            Activity activity = f0w.A00;
                            AnonymousClass6W8 A0b = DbS.A0b(activity, A0a, f0w.A02, ModalActivity.class, C66579MXk.A00(120));
                            A0b.A00 = 1;
                            A0b.A0H = false;
                            A0b.A07();
                            A0b.A0C(activity);
                        }
                    } else if (ordinal == 3) {
                        Bundle A0a2 = AnonymousClass7TE.A0a();
                        A0a2.putString("bottom_sheet_content_fragment", C66579MXk.A00(123));
                        A0a2.putBoolean(C66579MXk.A00(14), true);
                        String str5 = f0w.A04;
                        A0a2.putString(AnonymousClass000.A00(1694), str5);
                        A0a2.putString(AnonymousClass000.A00(1693), str2);
                        DbU.A0w(f0w.A00, A0a2, f0w.A02, TransparentModalActivity.class, "bottom_sheet");
                        C313756gx A0R = DbZ.A0R(f0w.A06);
                        2Er r1 = f0w.A03.A06;
                        String C6k = r1.C6k();
                        int AdN = r1.AdN();
                        Integer valueOf = Integer.valueOf(AdN);
                        1Ln A0J = DbT.A0J(A0R);
                        if (DbT.A1Y(A0J)) {
                            DbW.A17(A0J, A0R);
                            DbV.A1M(A0J, "poll_options_sheet_rendered");
                            A0J.A0p(C66579MXk.A00(354));
                            A0J.A0q("thread_view");
                            if (valueOf == null || AdN != 2) {
                                str = "broadcast";
                            } else {
                                str = "subscriber_broadcast";
                            }
                            A0J.A0o(str);
                            A0J.A0M(C69493Nmb.MEMBER_PARTICIPATION_HUB, "entrypoint");
                            A0J.A0s(str5);
                            A0J.A0i(DbZ.A0d(C6k));
                            A0J.A0w(DbY.A0p("poll_id", str2, AnonymousClass7TE.A1L("user_type", "VIEWER")));
                            A0J.Cgf();
                        }
                    } else {
                        throw AnonymousClass7TE.A1K();
                    }
                } else if (str2 != null) {
                    ((C50400Fb8) f0w.A05.getValue()).Cps((OMU) null, str2);
                }
                i = -1266671447;
                break;
            case 4:
                String str6 = this.A03;
                AnonymousClass0iw r0 = (Fragment) this.A02;
                String str7 = this.A04;
                C48856ElI.A00(r0, r0.getActivity(), r0, (UserSession) this.A01, str6, str7);
                return;
            default:
                A05 = AnonymousClass0fD.A05(-1204194148);
                SUL sul = new SUL((Context) this.A01, (UserSession) this.A02, 2EG.A1s, this.A03);
                sul.A0S = this.A04;
                sul.A0A();
                i = -1275364390;
                break;
        }
        AnonymousClass0fD.A0C(i, A05);
    }

    public C50105FOv(Context context, E0f e0f, String str, String str2, int i) {
        this.A00 = i;
        switch (i) {
            case 0:
            case 1:
                this.A01 = context;
                this.A02 = e0f;
                break;
            default:
                this.A02 = e0f;
                this.A01 = context;
                break;
        }
        this.A03 = str;
        this.A04 = str2;
    }
}
