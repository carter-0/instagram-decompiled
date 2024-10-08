package X;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.instagram.common.session.UserSession;
import com.instagram.discoverpeople.model.FindPeopleButtonOverride;

public class EEF extends C252233om {
    public boolean A00;
    public final Fragment A01;
    public final Fragment A02;
    public final AnonymousClass0iw A03;
    public final UserSession A04;
    public final EXN A05;
    public final G7U A06;
    public final String A07 = "revised_inline_upsell";
    public final String A08 = "inline_upsell";
    public final 1wn A09 = FXZ.A00(this, 67);
    public final 1wn A0A = FXZ.A00(this, 68);
    public final 1wn A0B = FXZ.A00(this, 69);

    public EEF(Fragment fragment, AnonymousClass0iw r3, AnonymousClass4DJ r4, UserSession userSession, EXN exn, G7U g7u) {
        0qQ.A0B(userSession, 1);
        this.A04 = userSession;
        this.A01 = fragment;
        this.A03 = r3;
        this.A05 = exn;
        this.A06 = g7u;
        this.A02 = fragment.mParentFragment;
        r4.registerLifecycleListener(this);
    }

    public final FindPeopleButtonOverride A00(Integer num) {
        String str;
        if (!(this instanceof EUL)) {
            return null;
        }
        0qQ.A0B(num, 0);
        Bundle bundle = ((EUL) this).A00.A00;
        if (bundle == null) {
            return null;
        }
        if (num.intValue() != 0) {
            str = "CONTACTS";
        } else {
            str = "FACEBOOK";
        }
        return (FindPeopleButtonOverride) bundle.getParcelable(str);
    }

    public final void A01() {
        String str;
        if (this instanceof EUM) {
            C46435Dex dex = ((EUM) this).A00.A0E;
            if (dex == null) {
                str = "followListAdapter";
            } else {
                0fE.A00(dex, 1393977277);
                return;
            }
        } else if (this instanceof EUL) {
            E9K e9k = ((EUL) this).A00.A01;
            if (e9k == null) {
                str = "explorePeopleAdapter";
            } else {
                e9k.notifyDataSetChanged();
                return;
            }
        } else if (this instanceof EUK) {
            E9L e9l = ((EUK) this).A00.A00;
            if (e9l == null) {
                str = "accountDiscoveryAdapter";
            } else {
                e9l.A00();
                return;
            }
        } else {
            return;
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final void onCreate() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A04);
        A002.A01(this.A09, C50277FWi.class);
        A002.A01(this.A0A, FWD.class);
        A002.A01(this.A0B, FW9.class);
    }

    public final void onDestroy() {
        1Ng A002 = AnonymousClass1Nd.A00(this.A04);
        A002.A02(this.A09, C50277FWi.class);
        A002.A02(this.A0A, FWD.class);
        A002.A02(this.A0B, FW9.class);
    }
}
