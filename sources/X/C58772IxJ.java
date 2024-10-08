package X;

import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.clips.drafts.model.validation.ClipsDraftValidator;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;

/* renamed from: X.IxJ  reason: case insensitive filesystem */
public final class C58772IxJ extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;
    public final String A04;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C58772IxJ(Object obj, Object obj2, Object obj3, String str, int i) {
        super(1);
        this.A00 = i;
        this.A01 = obj;
        this.A03 = obj2;
        this.A04 = str;
        this.A02 = obj3;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2 = obj;
        switch (this.A00) {
            case 0:
                C52813Gd5 gd5 = (C52813Gd5) obj2;
                0qQ.A0B(gd5, 0);
                C55234HeP.A00(gd5, HNO.A0E, new C74189PqV(this.A01, this.A03, this.A02, this.A04, 49));
                break;
            case 1:
                GO1 go1 = (GO1) obj2;
                0qQ.A0B(go1, 0);
                Fragment fragment = (Fragment) this.A01;
                if (AnonymousClass90V.A05(fragment)) {
                    if (go1.A00.isEmpty()) {
                        C283155Gi r3 = (C283155Gi) this.A02;
                        if (0qQ.A0K(r3.A0C, "ig_media_draft_reminder") && r3.A03() == C46518DgL.A0n) {
                            FragmentActivity requireActivity = fragment.requireActivity();
                            UserSession userSession = (UserSession) this.A03;
                            String str = this.A04;
                            C243473Yx.A03(requireActivity, fragment, 28D.A12, userSession, r3.A04.A0H, (PendingRecipient) null, str, false);
                            AnonymousClass90V.A03((AnonymousClass72O) null, userSession, str);
                            break;
                        } else {
                            String str2 = this.A04;
                            UserSession userSession2 = (UserSession) this.A03;
                            AnonymousClass90V.A00((Activity) null, fragment, 28D.A12, userSession2, str2, "activity_feed_notification_tap");
                            if (0qQ.A0K(r3.A0C, "ig_media_draft_reminder")) {
                                AnonymousClass90V.A03((AnonymousClass72O) null, userSession2, str2);
                                break;
                            }
                        }
                    } else {
                        11Z.A03(new C57764Ig5(fragment));
                        break;
                    }
                }
                break;
            case 2:
                boolean A1a = AnonymousClass7TE.A1a(obj2);
                Fragment fragment2 = (Fragment) this.A01;
                if (AnonymousClass90V.A05(fragment2)) {
                    if (!A1a) {
                        Object obj3 = this.A03;
                        if (0qQ.A0K(((C283155Gi) this.A02).A0C, "ig_media_draft_reminder")) {
                            AnonymousClass7TE.A1Z(new C58107ImT(obj3, fragment2, (AnonymousClass4D7) null, 2), DbY.A0r(AnonymousClass12T.A00, 875171464));
                            break;
                        } else {
                            AnonymousClass90V.A01(fragment2);
                            break;
                        }
                    } else {
                        Context requireContext = fragment2.requireContext();
                        UserSession userSession3 = (UserSession) this.A03;
                        ClipsDraftValidator A002 = HWL.A00(requireContext, userSession3, AnonymousClass05K.A0N);
                        AnonymousClass07Z viewLifecycleOwner = fragment2.getViewLifecycleOwner();
                        String str3 = this.A04;
                        A002.A02(viewLifecycleOwner, str3, new C58772IxJ(fragment2, userSession3, this.A02, str3, 1));
                        break;
                    }
                }
                break;
            default:
                ((JTC) this.A03).D4x((C267324bN) this.A01, (C52058GDe) this.A02, this.A04);
                break;
        }
        return C60340gF.A00;
    }
}
