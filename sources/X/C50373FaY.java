package X;

import android.content.Context;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.direct.request.DirectThreadApi;
import java.util.HashMap;
import java.util.List;

/* renamed from: X.FaY  reason: case insensitive filesystem */
public final class C50373FaY implements C51900G6u {
    public final /* synthetic */ int A00;
    public final /* synthetic */ Fragment A01;
    public final /* synthetic */ C49729F3u A02;
    public final /* synthetic */ Boolean A03;
    public final /* synthetic */ Integer A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ List A06;

    public final void D6w(String str) {
        0qQ.A0B(str, 0);
        if (this.A04 != null) {
            UserSession userSession = this.A02.A01;
            if (userSession != null) {
                F5Z.A00(userSession, EV0.Social);
            }
            0qQ.A0F("userSession");
            throw AnonymousClass00P.createAndThrow();
        }
        String str2 = this.A05;
        List list = this.A06;
        int size = list.size();
        Integer valueOf = Integer.valueOf(size);
        Boolean bool = this.A03;
        int i = this.A00;
        Integer valueOf2 = Integer.valueOf(i);
        C49729F3u f3u = this.A02;
        UserSession userSession2 = f3u.A01;
        if (userSession2 != null) {
            C50338FYv A002 = C69866NtU.A00(userSession2);
            1Ln A003 = C50338FYv.A00(A002);
            if (DbT.A1Y(A003)) {
                C50338FYv.A04(A003, A002);
                Dba.A1D(A003, "thread_create_successful");
                A003.A0p("create_public_chat");
                C50338FYv.A05(A003, A002, "invite_people");
                A003.A0s(str);
                A003.A0i(AnonymousClass7TE.A10(str));
                HashMap A1E = AnonymousClass7TE.A1E();
                A1E.put("chat_type", "public");
                if (str2 != null) {
                    A1E.put("chat_creation_source", str2);
                }
                A1E.put("has_thread_photo", "False");
                String str3 = "True";
                A1E.put("limited_to_subscribers", str3);
                if (bool != null) {
                    if (!bool.booleanValue()) {
                        str3 = "False";
                    }
                    A1E.put("show_on_profile", str3);
                }
                if (valueOf != null) {
                    A1E.put("number_invited", String.valueOf(size));
                }
                if (182.A06(0Tu.A05, A002.A03, 36327615073892919L) && valueOf2 != null) {
                    A1E.put("chat_duration_seconds", String.valueOf(i));
                }
                A003.A0w(A1E);
                A003.Cgf();
            }
            UserSession userSession3 = f3u.A01;
            if (userSession3 != null) {
                if (182.A06(0Tu.A05, userSession3, 36320309334384860L)) {
                    UserSession userSession4 = f3u.A01;
                    if (userSession4 != null) {
                        if (!182.A06(0Tu.A06, userSession4, 36320309334515934L)) {
                            UserSession userSession5 = f3u.A01;
                            if (userSession5 != null) {
                                1OC A0F = DirectThreadApi.A0F(userSession5, str, list, 0sn.A00);
                                UserSession userSession6 = f3u.A01;
                                if (userSession6 != null) {
                                    Fragment fragment = this.A01;
                                    ((C49687F1x) userSession6.A01(C49687F1x.class, new C46570DhC(userSession6, 13))).A00(A0F, new C73949PmT(f3u, fragment, str, 24), new C73949PmT(f3u, fragment, str, 25));
                                    return;
                                }
                            }
                        }
                    }
                }
                f3u.A05(this.A01, str);
                return;
            }
        }
        0qQ.A0F("userSession");
        throw AnonymousClass00P.createAndThrow();
    }

    public C50373FaY(Fragment fragment, C49729F3u f3u, Boolean bool, Integer num, String str, List list, int i) {
        this.A04 = num;
        this.A02 = f3u;
        this.A05 = str;
        this.A06 = list;
        this.A03 = bool;
        this.A00 = i;
        this.A01 = fragment;
    }

    public final void D6v(Throwable th) {
        String str;
        String str2;
        C49729F3u f3u = this.A02;
        C50337FYu fYu = (C50337FYu) f3u.A0A.getValue();
        if (th == null || (str = th.toString()) == null) {
            str = "";
        }
        C50337FYu.A01(C48147EZp.CHAT_VIEW, C48146EZo.CREATE_SUBSCRIBER_CHAT, fYu, "thread_create_error", "view", AnonymousClass7TF.A0w("error_message", str));
        Context context = f3u.A00;
        if (context == null) {
            str2 = "context";
        } else {
            C69904Nu6.A00(context, true);
            G84 g84 = f3u.A02;
            if (g84 == null) {
                str2 = "delegate";
            } else {
                g84.D1T();
                return;
            }
        }
        0qQ.A0F(str2);
        throw AnonymousClass00P.createAndThrow();
    }
}
