package X;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.List;

/* renamed from: X.OOs  reason: case insensitive filesystem */
public abstract class C70861OOs {
    public static final void A00(Fragment fragment, UserSession userSession, 1Xj r7, C62320sa r8) {
        if (fragment.getActivity() != null) {
            View view = fragment.mView;
            if (view != null) {
                0nA.A0N(view);
            }
            User A2A = r7.A2A(userSession);
            0xY A0N = AnonymousClass7TF.A0N(userSession);
            A0N.E5T(Pxd.A00(754), true);
            A0N.apply();
            OOA A06 = 1as.A04.A02.A06((AnonymousClass0iw) fragment, userSession, "feed_ufi");
            A06.A02(r7.getId());
            String A0r = DbX.A0r(A2A);
            Bundle bundle = A06.A01;
            bundle.putString("DirectReplyModalFragment.user_id_to_send_message_to", A0r);
            bundle.putBoolean("DirectReplyModalFragment.allow_swipe_down_to_dismiss", true);
            AnonymousClass37D A0i = DbX.A0i(fragment);
            if (A0i != null) {
                A0i.A0Q(new NgD(r8, 0));
                A0i.A0J(A06.A00());
            }
        }
    }

    public static final void A01(Fragment fragment, 1Xj r9) {
        List AtA;
        AnonymousClass5HT BYk = r9.A0C.BYk();
        if (BYk != null && (AtA = BYk.AtA()) != null) {
            String str = (String) 00k.A0J(AtA);
            if (str == null) {
                str = "";
            }
            if (str.length() != 0) {
                if (0oI.A0G(fragment.requireContext())) {
                    String queryParameter = 0cp.A03(str).getQueryParameter("phone");
                    String queryParameter2 = 0cp.A03(str).getQueryParameter("text");
                    if (queryParameter != null) {
                        if (queryParameter.length() != 0) {
                            Context requireContext = fragment.requireContext();
                            0qQ.A07(requireContext.getResources().getString(2131976859));
                            0qQ.A07(requireContext.getResources().getString(2131976858));
                            String str2 = "";
                            if (queryParameter2 != null) {
                                str2 = queryParameter2;
                            }
                            Uri.Builder builder = new Uri.Builder();
                            builder.scheme("whatsapp").authority("send").appendQueryParameter("phone", queryParameter).appendQueryParameter("text", 002.A0B(str2));
                            str = DbT.A10(builder);
                        } else {
                            return;
                        }
                    }
                }
                FH7.A03(fragment.requireContext(), str);
            }
        }
    }
}
