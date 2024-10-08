package X;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.direct.inbox.DirectInviteContactViewModel;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.user.model.User;

/* renamed from: X.Fwb  reason: case insensitive filesystem */
public final class C51587Fwb implements AnonymousClass0eL, 0sP {
    public final int A00;
    public final Object A01;

    public C51587Fwb(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final Object invoke(Object obj) {
        String A002;
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                EEP eep = (EEP) this.A01;
                FragmentActivity requireActivity = eep.A0m.requireActivity();
                AnonymousClass9B9.A00().A00(requireActivity, C69503Nml.A05, eep.A0g);
                C67089Mi7 mi7 = eep.A0o;
                C67210Mk6 mk6 = mi7.A03;
                if (mk6 != null) {
                    String str = mk6.A02;
                    if (str != null) {
                        0Aj A0e = AnonymousClass7TE.A0e(mk6.A05, "omnipicker_search_create");
                        if (A0e.isSampled()) {
                            boolean A06 = 182.A06(0Tu.A05, mk6.A06, 36325145467433598L);
                            A0e.AAJ(C66654MaN.A00(), str);
                            AnonymousClass7TE.A1W(A0e, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, 6);
                            if (A06) {
                                A002 = "ai_studio_v1.5";
                            } else {
                                A002 = AnonymousClass000.A00(2590);
                            }
                            A0e.AAJ("ai_home_version", A002);
                            A0e.Cgf();
                        }
                    }
                    EK7 ek7 = mi7.A02;
                    if (ek7 != null) {
                        ek7.A01();
                    }
                }
                requireActivity.finish();
                return null;
            case 1:
                C71874OsH osH = (C71874OsH) this.A01;
                DirectInviteContactViewModel directInviteContactViewModel = (DirectInviteContactViewModel) obj2;
                Context context = osH.A07;
                UserSession userSession = osH.A0D;
                boolean A012 = C267044ar.A01(context, userSession);
                C48145EZn eZn = C48145EZn.DIRECT_MESSAGE_SEARCH;
                if (A012) {
                    C48142EZk eZk = C48142EZk.CONTACT_SMS;
                    C49947FGb.A03(eZn, eZk, userSession, A012);
                    if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36326515562460979L)) {
                        osH.A0I.Cj6(directInviteContactViewModel, 43, directInviteContactViewModel.A00, directInviteContactViewModel.A03, directInviteContactViewModel.A05, directInviteContactViewModel.A04);
                    }
                    F8M.A01(osH.A0A, eZn, eZk, userSession, AnonymousClass05K.A0u, directInviteContactViewModel.A06);
                    return null;
                }
                C49947FGb.A06(eZn, userSession, A012);
                C49947FGb.A03(eZn, C48142EZk.SYSTEM_SHARE_SHEET, userSession, A012);
                if (182.A06(AnonymousClass7TF.A0H(userSession), userSession, 36326515562460979L)) {
                    osH.A0I.Cj6(directInviteContactViewModel, 6, directInviteContactViewModel.A00, directInviteContactViewModel.A03, directInviteContactViewModel.A05, directInviteContactViewModel.A04);
                }
                EWV ewv = EWV.A0J;
                AnonymousClass4DH r9 = osH.A0A;
                C46395DeI.A0S(r9, eZn, r9, userSession, ewv, new C51154FpQ());
                return null;
            case 2:
                ((C49916FEq) this.A01).A05.Dbp((DirectShareTarget) obj2);
                break;
            case 3:
                ((User) this.A01).A19(true);
                break;
            case 4:
                Boolean bool = (Boolean) obj2;
                DdZ ddZ = ((C46656Dib) this.A01).A0h;
                if (ddZ != null) {
                    ddZ.A02((String) null, bool);
                    break;
                }
                break;
            default:
                Fragment fragment = (Fragment) this.A01;
                TextView A0d = AnonymousClass7TE.A0d((View) obj2, R.id.ig_boost_profile_placement);
                if (A0d != null) {
                    String string = fragment.getString(2131954020);
                    AnonymousClass7AV.A01(Uri.parse(AnonymousClass000.A00(3254)), A0d, fragment.getString(2131954019), string);
                    break;
                }
                break;
        }
        return C60340gF.A00;
    }
}
