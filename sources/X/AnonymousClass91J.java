package X;

import android.os.Bundle;
import android.os.Parcelable;
import androidx.fragment.app.FragmentActivity;
import com.facebook.base.activity.parcel.OpaqueParcelable;
import com.instagram.common.session.UserSession;
import com.instagram.direct.thread.analytics.DirectThreadAnalyticsParams;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.user.model.User;

/* renamed from: X.91J  reason: invalid class name */
public final class AnonymousClass91J implements AnonymousClass91K {
    public final /* synthetic */ C66770McF A00;

    public AnonymousClass91J(C66770McF mcF) {
        this.A00 = mcF;
    }

    public final void D9N() {
        C66770McF.A00(this.A00);
    }

    public final void DZL() {
        C66770McF mcF = this.A00;
        C66770McF.A00(mcF);
        Bundle bundle = new Bundle();
        UserSession userSession = mcF.A08;
        bundle.putString("IgSessionManager.SESSION_TOKEN_KEY", userSession.A05);
        bundle.putString("ODNC_USER_ROLE_KEY", "RECEIVER");
        bundle.putString(C66579MXk.A00(249), "BANNER");
        bundle.putBoolean(C66579MXk.A00(239), mcF.A05);
        DirectThreadAnalyticsParams directThreadAnalyticsParams = mcF.A01;
        if (directThreadAnalyticsParams != null) {
            bundle.putParcelable(C66579MXk.A00(216), new OpaqueParcelable((Parcelable) directThreadAnalyticsParams));
            FragmentActivity fragmentActivity = mcF.A07;
            AnonymousClass6W8 A03 = AnonymousClass6W8.A03(fragmentActivity, bundle, userSession, ModalActivity.class, C273654mx.A00(61));
            A03.A08();
            A03.A0C(fragmentActivity);
            if (mcF.A05) {
                C69459Nm3 nm3 = C69459Nm3.RECEIVER;
                C69483NmR nmR = C69483NmR.BANNER;
                DirectThreadAnalyticsParams directThreadAnalyticsParams2 = mcF.A01;
                if (directThreadAnalyticsParams2 != null) {
                    C71137Odf.A02(nmR, nm3, userSession, directThreadAnalyticsParams2);
                    return;
                }
            } else {
                return;
            }
        }
        0qQ.A0F("directThreadAnalyticsParams");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Di4() {
        C66770McF mcF = this.A00;
        C66770McF.A00(mcF);
        User user = mcF.A03;
        String str = "sender";
        if (user != null) {
            if (!user.CPV()) {
                FragmentActivity fragmentActivity = mcF.A07;
                UserSession userSession = mcF.A08;
                User user2 = mcF.A03;
                if (user2 != null) {
                    AnonymousClass2Ep r6 = mcF.A00;
                    if (r6 == null) {
                        str = "extendedDirectThread";
                    } else {
                        String str2 = mcF.A04;
                        if (str2 == null) {
                            str = "threadId";
                        } else {
                            MessageIdentifier messageIdentifier = mcF.A02;
                            if (messageIdentifier == null) {
                                str = "messageIdentifier";
                            } else {
                                A03.A00(fragmentActivity, userSession, mcF.A09, r6, messageIdentifier, user2, str2, "NudityReceiverEducationQPBanner");
                                return;
                            }
                        }
                    }
                }
            } else {
                return;
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }
}
