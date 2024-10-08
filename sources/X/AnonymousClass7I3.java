package X;

import android.net.Uri;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.proxygen.TraceFieldType;
import com.instagram.common.session.UserSession;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;
import com.instagram.react.modules.product.IgReactPurchaseExperienceBridgeModule;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: X.7I3  reason: invalid class name */
public final class AnonymousClass7I3 {
    public final 0bY A00 = new 1Q7("IgSecureUriParser").A00;
    public final 0wc A01;
    public final Set A02;
    public final AnonymousClass0eM A03;

    public AnonymousClass7I3(UserSession userSession) {
        0qQ.A0B(userSession, 1);
        this.A01 = AnonymousClass0kN.A01(new 0xG("direct_thread"), userSession);
        this.A03 = AnonymousClass0eN.A01(new AnonymousClass9L0(userSession, 1));
        this.A02 = new LinkedHashSet();
    }

    public final void A09(String str) {
        1Ln A0J = 1Ln.A0J(this.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(20);
            A0J.A0X(0);
            A0J.A0R("selected_item", str);
            A0J.Cgf();
        }
    }

    public final void A0B(String str, String str2, String str3) {
        0qQ.A0B(str, 0);
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "ai_agent_embodiment_pip_acted_on");
        if (A002.isSampled()) {
            A002.AAJ("thread_session_id", str);
            A002.AAJ("pip_position_corners", str2);
            A002.AAJ("pip_click_type", str3);
            A002.Cgf();
        }
    }

    public static final XSV A00(boolean z, boolean z2) {
        if (z) {
            if (z2) {
                return XSV.A03;
            }
            return XSV.A04;
        } else if (z2) {
            return XSV.A05;
        } else {
            return XSV.A06;
        }
    }

    public static final void A01(C69503Nml nml, XSV xsv, AnonymousClass7I3 r5, String str, int i) {
        1Ln A0J = 1Ln.A0J(r5.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(i);
            A0J.A0X(0);
            A0J.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("selected_item", "request_access");
            A0J.A0M(xsv, "thread_type");
            A0J.A0R("agent_id", str);
            A0J.Cgf();
        }
    }

    public static final void A02(AnonymousClass7I3 r3, String str, boolean z, boolean z2, boolean z3) {
        XSV xsv;
        String str2;
        1Ln A0J = 1Ln.A0J(r3.A01);
        if (A0J.A00.isSampled()) {
            if (z) {
                xsv = XSV.A05;
            } else {
                xsv = XSV.A06;
            }
            A0J.A0Z(8);
            A0J.A0X(0);
            if (z3) {
                str2 = "memu_mustache";
            } else {
                str2 = "create_an_image_mustache";
            }
            A0J.A0R("selected_item", str2);
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0J.A0M(xsv, "thread_type");
            A0J.A0O("is_e2ee", Boolean.valueOf(z2));
            A0J.Cgf();
        }
    }

    public final LinkedHashMap A03(Uri uri) {
        Boolean A0A;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        String queryParameter = uri.getQueryParameter("is_ai_agent");
        if (!(queryParameter == null || (A0A = 00l.A0A(queryParameter)) == null || !A0A.booleanValue())) {
            String queryParameter2 = uri.getQueryParameter(PublicKeyCredentialControllerUtility.JSON_KEY_ID);
            if (queryParameter2 != null) {
                linkedHashMap.put("agent_id", queryParameter2);
            }
            linkedHashMap.put(TraceFieldType.ContentType, "ai_agent_share");
            int intValue = ((AnonymousClass9BB) this.A03.getValue()).A00().intValue();
            if (intValue == 3) {
                str = "access_granted";
            } else if (intValue == 2) {
                str = "requested_waitlist";
            } else if (intValue != 1) {
                str = "ineligible";
            } else {
                str = "not_requested_waitlist";
            }
            linkedHashMap.put("agent_access_status", str);
        }
        return linkedHashMap;
    }

    public final void A04() {
        1Ln A0J = 1Ln.A0J(this.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(23);
            A0J.A0X(1);
            A0J.A0M(C69503Nml.A05, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.Cgf();
        }
    }

    public final void A05(C69503Nml nml) {
        1Ln A0J = 1Ln.A0J(this.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(10);
            A0J.A0X(0);
            A0J.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("selected_item", "get_started");
            A0J.Cgf();
        }
    }

    public final void A06(C69503Nml nml) {
        1Ln A0J = 1Ln.A0J(this.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(10);
            A0J.A0X(0);
            A0J.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("selected_item", "cancel");
            A0J.Cgf();
        }
    }

    public final void A07(C69503Nml nml) {
        1Ln A0J = 1Ln.A0J(this.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(10);
            A0J.A0X(1);
            A0J.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.Cgf();
        }
    }

    public final void A08(C69503Nml nml) {
        1Ln A0J = 1Ln.A0J(this.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Z(11);
            A0J.A0X(0);
            A0J.A0M(nml, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.A0R("selected_item", "get_started");
            A0J.Cgf();
        }
    }

    public final void A0A(String str, String str2, String str3) {
        1Ln A0J = 1Ln.A0J(this.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0Y(0);
            A0J.A0Z(19);
            A0J.A0X(0);
            A0J.A0R("selected_item", str3);
            A0J.A0M(XSV.A02, "thread_type");
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0J.A0R("agent_id", str2);
            A0J.A0M(C69503Nml.A0I, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
            A0J.Cgf();
        }
    }

    public final void A0C(String str, String str2, String str3) {
        int i;
        if (str3.equals(C66579MXk.A00(238))) {
            i = 30;
        } else if (str3.equals(C66579MXk.A00(237))) {
            i = 31;
        } else {
            return;
        }
        1Ln A0J = 1Ln.A0J(this.A01);
        if (A0J.A00.isSampled()) {
            A0J.A0X(1);
            A0J.A0Z(i);
            A0J.A0M(C69431Nlb.TEXT, AnonymousClass000.A00(768));
            A0J.A0M(XSV.A02, "thread_type");
            A0J.A0R("agent_id", str);
            A0J.A0R("bot_response_id", str2);
            A0J.Cgf();
        }
    }

    public final void A0D(String str, String str2, boolean z) {
        String str3;
        0wc r2 = this.A01;
        0Aj A002 = r2.A00(r2.A00, "ai_agent_embodiment_status_changed");
        if (A002.isSampled()) {
            if (z) {
                str3 = "enabled";
            } else {
                str3 = "disabled";
            }
            A002.AAJ(IgReactPurchaseExperienceBridgeModule.RN_SHOP_PAY_STATUS, str3);
            A002.AAJ("thread_session_id", str);
            A002.AAJ(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A002.Cgf();
        }
    }

    public final void A0E(String str, String str2, boolean z, boolean z2, boolean z3) {
        XSV xsv;
        1Ln A0J = 1Ln.A0J(this.A01);
        int i = 24;
        if (z) {
            i = 40;
        }
        if (z3) {
            xsv = XSV.A05;
        } else {
            xsv = XSV.A06;
        }
        if (A0J.A00.isSampled()) {
            A0J.A0Z(i);
            A0J.A0R("agent_id", str);
            A0J.A0X(z2 ? 1 : 0);
            A0J.A0R("selected_item", "meta_ai_invocation");
            A0J.A0M(xsv, "thread_type");
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str2);
            A0J.Cgf();
        }
    }

    public final void A0F(String str, boolean z, boolean z2) {
        XSV xsv;
        String str2;
        1Ln A0J = 1Ln.A0J(this.A01);
        if (z) {
            xsv = XSV.A05;
        } else {
            xsv = XSV.A06;
        }
        if (A0J.A00.isSampled()) {
            A0J.A0Z(8);
            A0J.A0X(1);
            if (z2) {
                str2 = "memu_mustache";
            } else {
                str2 = "create_an_image_mustache";
            }
            A0J.A0R("selected_item", str2);
            A0J.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, str);
            A0J.A0M(xsv, "thread_type");
            A0J.Cgf();
        }
    }
}
