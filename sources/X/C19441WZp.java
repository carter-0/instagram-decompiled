package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.hashtag.Hashtag;

/* renamed from: X.WZp  reason: case insensitive filesystem */
public final class C19441WZp implements X4N {
    public final int A00;
    public final Object A01;

    public C19441WZp(Object obj, int i) {
        this.A00 = i;
        this.A01 = obj;
    }

    public final void DIp() {
        UserSession userSession;
        Class<ModalActivity> cls;
        Bundle bundle;
        Fragment fragment;
        FragmentActivity fragmentActivity;
        String str;
        switch (this.A00) {
            case 0:
                fragment = (C15362UbE) this.A01;
                VXN vxn = fragment.A07;
                if (vxn != null) {
                    Hashtag hashtag = fragment.A04;
                    C310216ac r3 = vxn.A02.A00;
                    if (r3 != null) {
                        r3.A00(hashtag, vxn.A00, vxn.A01);
                    }
                }
                userSession = fragment.A01;
                cls = ModalActivity.class;
                bundle = W0l.A00(fragment.A04, C49092EpH.A00(fragment, fragment.A08), "reel_context_sheet_hashtag");
                fragmentActivity = fragment.requireActivity();
                str = "hashtag_feed";
                break;
            case 1:
                fragment = (C15361UbD) this.A01;
                if (1Wr.A00 != null) {
                    VXM vxm = fragment.A03;
                    if (vxm != null) {
                        String A05 = fragment.A01.A05();
                        C315656kI r0 = vxm.A02;
                        C255783ui r32 = vxm.A01;
                        C250973mM r5 = vxm.A00;
                        C310216ac r1 = r0.A00;
                        if (r1 != null) {
                            0qQ.A0B(A05, 0);
                            C310016aI r4 = r1.A03;
                            String str2 = r32.A1f;
                            0qQ.A07(str2);
                            r4.A0N(r5, true, "location", A05, str2);
                        }
                    }
                    userSession = fragment.A00;
                    cls = ModalActivity.class;
                    1Wr.A00.getFragmentFactory();
                    String A052 = fragment.A01.A05();
                    bundle = DbY.A0A(A052);
                    bundle.putString(AnonymousClass000.A00(229), A052);
                    fragmentActivity = fragment.requireActivity();
                    str = "location_feed";
                    break;
                } else {
                    return;
                }
            default:
                C47497E5c.A02((C47497E5c) this.A01);
                return;
        }
        DbT.A1L(fragment, DbV.A0Y(fragmentActivity, bundle, userSession, cls, str));
    }
}
