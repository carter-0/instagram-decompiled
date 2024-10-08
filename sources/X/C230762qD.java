package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.discoverpeople.model.FindPeopleButtonOverride;
import com.instagram.nux.cal.model.DpActionContent;

/* renamed from: X.2qD  reason: invalid class name and case insensitive filesystem */
public final class C230762qD {
    public final 1Ng A00;
    public final UserSession A01;
    public final Fragment A02;

    public C230762qD(Fragment fragment, UserSession userSession) {
        0qQ.A0B(userSession, 2);
        this.A02 = fragment;
        this.A01 = userSession;
        this.A00 = AnonymousClass1Nd.A00(userSession);
    }

    /* JADX WARNING: type inference failed for: r0v8, types: [X.1qK, java.lang.Object] */
    /* JADX WARNING: type inference failed for: r0v10, types: [X.1qK, java.lang.Object] */
    public final void A00(EXN exn) {
        C309516Yo r3;
        Fragment e3o;
        if (exn == EXN.MEGAPHONE || exn == EXN.NUX_MAIN_SCREEN || exn == EXN.FOLLOW_PEOPLE || exn == EXN.OPTION_FOLLOW_PEOPLE || exn == EXN.DIRECT_INBOX_TAB) {
            Fragment fragment = this.A02;
            if (fragment instanceof G6Q) {
                this.A00.A00(new Object());
            } else if (FC6.A02()) {
                r3 = new C309516Yo(fragment.requireActivity(), this.A01);
                FC6.A00().A00();
                Bundle bundle = new Bundle();
                bundle.putBoolean(C273654mx.A00(35), false);
                e3o = new E3O();
                e3o.setArguments(bundle);
            }
            AnonymousClass1Nd.A00(this.A01).A00(new Object());
        }
        if (exn == EXN.NUX_DISCOVER_PEOPLE_SCREEN && FC6.A02()) {
            UserSession userSession = this.A01;
            DpActionContent dpActionContent = (DpActionContent) userSession.A00(DpActionContent.class);
            Bundle bundle2 = new Bundle();
            if (dpActionContent != null) {
                String str = dpActionContent.A02;
                if (str != null) {
                    String str2 = dpActionContent.A00;
                    if (str2 != null) {
                        String str3 = dpActionContent.A01;
                        if (str3 != null) {
                            bundle2.putParcelable("FACEBOOK", new FindPeopleButtonOverride(str, str2, str3));
                        } else {
                            throw new IllegalStateException("Required value was null.");
                        }
                    } else {
                        throw new IllegalStateException("Required value was null.");
                    }
                } else {
                    throw new IllegalStateException("Required value was null.");
                }
            }
            r3 = new C309516Yo(this.A02.requireActivity(), userSession);
            FC6.A00().A00();
            String A002 = C273654mx.A00(354);
            Bundle bundle3 = new Bundle();
            bundle3.putString(AnonymousClass000.A00(4345), "nux");
            bundle3.putString(AnonymousClass000.A00(4346), A002);
            bundle3.putBundle(AnonymousClass000.A00(942), bundle2);
            e3o = C48890Elq.A00(bundle3);
        }
        AnonymousClass1Nd.A00(this.A01).A00(new Object());
        r3.A0D(e3o);
        r3.A04();
        AnonymousClass1Nd.A00(this.A01).A00(new Object());
    }
}
