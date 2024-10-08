package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.signalsplayground.fragment.CreatorInspirationSignalsPlaygroundTestUsersFragment;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* renamed from: X.Vw0  reason: case insensitive filesystem */
public final class C18648Vw0 {
    public final C18576VuS A00;
    public final X39 A01;
    public final HashMap A02;
    public final Map A03;
    public final Map A04;
    public final Map A05;
    public final Map A06;
    public final Map A07;
    public final Map A08;
    public final Map A09;
    public final Map A0A;
    public final Map A0B;
    public final Set A0C;
    public final Map A0D;
    public final 0sP A0E;
    public final 0sP A0F;

    public final X3A A00(String str) {
        0qQ.A0B(str, 0);
        X3A x3a = (X3A) this.A0D.get(this.A0F.invoke(str));
        if (x3a == null) {
            return new WN8();
        }
        return x3a;
    }

    public final String A01(X8K x8k) {
        0qQ.A0B(x8k, 0);
        CharSequence charSequence = (CharSequence) C20722Wxv.A00.invoke(x8k.BwS());
        if (charSequence.length() == 0) {
            charSequence = "Unknown";
        }
        return (String) charSequence;
    }

    public final String A02(X8K x8k, String str) {
        Map A0E2;
        0qQ.A0B(str, 1);
        if (00l.A0d(x8k.BwS(), "gnv", false)) {
            A0E2 = this.A06;
        } else if (00l.A0d(x8k.BwS(), "Distillery", true)) {
            A0E2 = this.A07;
        } else if (00l.A0d(x8k.BwS(), "alevent", false)) {
            A0E2 = this.A03;
        } else if (00l.A0d(x8k.BwS(), "virtual", false)) {
            A0E2 = this.A0B;
        } else if (00l.A0d(x8k.BwS(), "share_event", false)) {
            A0E2 = this.A08;
        } else {
            A0E2 = 0Yt.A0E();
        }
        String A11 = DbT.A11(str, A0E2);
        if (A11 == null) {
            return "";
        }
        return A11;
    }

    public C18648Vw0(String str) {
        C18576VuS vuS = new C18576VuS(str);
        this.A00 = vuS;
        this.A04 = vuS.A01;
        this.A01 = C18576VuS.A07;
        this.A0A = vuS.A02;
        this.A0E = C20722Wxv.A00;
        this.A0F = new MP6(vuS, 13);
        this.A0D = vuS.A04;
        HashSet hashSet = new HashSet(vuS.A05);
        this.A0C = hashSet;
        String A002 = AnonymousClass000.A00(1482);
        hashSet.add(A002);
        hashSet.add("navigation");
        String A003 = AnonymousClass000.A00(3372);
        hashSet.add(A003);
        this.A02 = DbY.A0m("link_click_virtual_event:link_click:primary:0", "link click primary event");
        this.A05 = 0Yt.A02(Pxg.A1b("alevent:instagram_open_application", AnonymousClass7TE.A1I(new 0eP(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A003)), new 0eP("alevent:media_metric_event", AnonymousClass7TE.A1I(new 0eP(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, A002))), new 0eP("alevent:navigation_event", AnonymousClass7TE.A1I(new 0eP(PublicKeyCredentialControllerUtility.JSON_KEY_NAME, "navigation")))));
        String A004 = AnonymousClass000.A00(4747);
        this.A09 = 0Yt.A02(AnonymousClass7TH.A0h("link_click_virtual_event:link_click:primary:0", 0sn.A00, new 0eP("alevent:media_metric_event", AnonymousClass7TE.A1I(A004)), new 0eP("alevent:navigation_event", AnonymousClass7TE.A1I(A004)), new 0eP("alevent:instagram_open_application", AnonymousClass7TE.A1I(A004))));
        this.A07 = 0Yt.A06(new 0eP[]{new 0eP("media_pk", "media_id"), new 0eP(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "_uid"), new 0eP("target_user_id", AnonymousClass000.A00(3143)), new 0eP("container_module", "container_module")});
        this.A06 = 0Yt.A06(new 0eP[]{new 0eP("media_pk", "m_pk"), new 0eP(CreatorInspirationSignalsPlaygroundTestUsersFragment.INTENT_EXTRA_USER_ID, "pk"), new 0eP("destination_uri", "after_module_uri"), new 0eP("target_user_id", AnonymousClass000.A00(1222)), new 0eP("container_module", "module")});
        this.A03 = 0se.A0M(new 0eP(A004, A004));
        this.A0B = 0Yt.A06(JTQ.A1b("container_module", "module", new 0eP("destination_uri", "dest_uri")));
        this.A08 = AnonymousClass7TF.A0w("media_pk", "m_pk");
    }

    public C18648Vw0() {
        this("");
    }
}
