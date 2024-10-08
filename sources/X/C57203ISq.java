package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import com.instagram.user.model.User;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: X.ISq  reason: case insensitive filesystem */
public final class C57203ISq implements JPO {
    public final /* synthetic */ ISR A00;
    public final /* synthetic */ 1Xj A01;
    public final /* synthetic */ AnonymousClass3W1 A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ boolean A04;

    public final void onFail(C268654dm r10) {
        String str;
        0qQ.A0B(r10, 0);
        UserSession userSession = this.A00.A01;
        C55633Hks hks = (C55633Hks) userSession.A01(C55633Hks.class, new C45999DId(userSession, 1));
        String str2 = this.A03;
        1XP r0 = (1XP) r10.A00();
        if (r0 != null) {
            str = r0.getClientFacingErrorMessage();
        } else {
            str = null;
        }
        ConcurrentHashMap concurrentHashMap = hks.A01;
        Number number = (Number) concurrentHashMap.get(str2);
        if (number != null) {
            long longValue = number.longValue();
            if (!(str == null || str.length() == 0)) {
                hks.A00.flowAnnotate(longValue, "error_message", str);
            }
            hks.A00.flowEndFail(longValue, "like_media_fail", (String) null);
            concurrentHashMap.remove(str2);
        }
    }

    public C57203ISq(ISR isr, 1Xj r2, AnonymousClass3W1 r3, String str, boolean z) {
        this.A04 = z;
        this.A00 = isr;
        this.A01 = r2;
        this.A02 = r3;
        this.A03 = str;
    }

    public final void DoR(C54068Gyr gyr) {
        User A11;
        Context context;
        if (!this.A04) {
            ISR isr = this.A00;
            C270394gf r6 = isr.A05;
            if (r6 != null) {
                Integer num = AnonymousClass05K.A00;
                UserSession userSession = isr.A01;
                AnonymousClass4DU r1 = isr.A02;
                String A2n = this.A01.A2n();
                if (A2n != null) {
                    F8R.A00(r1, userSession, r6, num, A2n);
                } else {
                    throw AnonymousClass7TE.A0z("Required value was null.");
                }
            } else {
                1Xj r3 = this.A01;
                int ordinal = r3.BR7().ordinal();
                if (ordinal == 0 || ordinal == 1 || ordinal == 4) {
                    Fragment fragment = isr.A00;
                    if (fragment.isAdded() && !fragment.mRemoving && (context = fragment.getContext()) != null) {
                        1pZ A002 = AnonymousClass1pc.A00();
                        UserSession userSession2 = isr.A01;
                        AnonymousClass4DU r8 = isr.A02;
                        C54660HMr hMr = C54660HMr.UNLIKED_MEDIA;
                        String id = r3.getId();
                        if (id != null) {
                            A002.Cne(context, r8, userSession2, r3.A2A(userSession2), hMr, id);
                        } else {
                            throw AnonymousClass7TE.A0z("Required value was null.");
                        }
                    }
                }
            }
        }
        ISR isr2 = this.A00;
        1Ux r2 = isr2.A04;
        if (r2 != null && this.A02.A0o == 1sy.A0H) {
            r2.FJQ(1Xi.A01(this.A01));
        }
        1Xj r5 = this.A01;
        FragmentActivity activity = isr2.A00.getActivity();
        if (!(activity == null || (A11 = C51966G9m.A11(r5)) == null)) {
            String id2 = A11.getId();
            UserSession userSession3 = isr2.A01;
            if (!id2.equals(userSession3.A06) && 1Wj.A00 != null) {
                1Wj A003 = DcL.A00();
                String A30 = r5.A30();
                if (A30 != null) {
                    A003.A00(activity, userSession3, "355366653495629", DbY.A0m("nua_target_id", A30));
                } else {
                    throw AnonymousClass7TE.A0y();
                }
            }
        }
        UserSession userSession4 = isr2.A01;
        C55633Hks hks = (C55633Hks) userSession4.A01(C55633Hks.class, new C45999DId(userSession4, 1));
        String str = this.A03;
        ConcurrentHashMap concurrentHashMap = hks.A01;
        Number number = (Number) concurrentHashMap.get(str);
        if (number != null) {
            hks.A00.flowEndSuccess(number.longValue());
            concurrentHashMap.remove(str);
        }
    }
}
