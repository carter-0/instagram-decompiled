package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.react.modules.intent.IntentModule;
import com.google.common.collect.ImmutableList;
import com.instagram.common.session.UserSession;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: X.5sG  reason: invalid class name and case insensitive filesystem */
public final class C297745sG implements C297755sH {
    public final C297735sF A00;

    public final /* bridge */ /* synthetic */ Object AUg(Object obj, AnonymousClass4D7 r13) {
        String str = (String) obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C241503Pl.A01;
        C241503Pl r5 = new C241503Pl(1Ey.A02(r13));
        C297735sF r1 = this.A00;
        C10283Rph rph = new C10283Rph(r5);
        0qQ.A0B(str, 0);
        2IS r6 = new 2IS();
        r6.A04("encoded_token", str);
        UserSession userSession = r1.A00;
        Map A03 = C278514x0.A03(C60960kU.A00, new C278504wz(userSession), C278484wx.A00());
        0qQ.A07(A03);
        ImmutableList.Builder builder = new ImmutableList.Builder();
        for (String str2 : A03.keySet()) {
            2IV r2 = new 2IV();
            r2.A09(str2, PublicKeyCredentialControllerUtility.JSON_KEY_NAME);
            r2.A09(String.valueOf(A03.get(str2)), IntentModule.EXTRA_MAP_KEY_FOR_VALUE);
            builder.add(r2);
        }
        ImmutableList build = builder.build();
        0qQ.A07(build);
        r6.A05("effects_supported_capabilities", build);
        C239113Fa r3 = new C239113Fa(r6, C41983B9j.class, "InstagramARAdsContextQuery", false);
        C363088j4.A00(userSession).ATL(new C12084Sme(rph), new C12091Sml(rph), r3);
        return r5.A00();
    }

    public C297745sG(C297735sF r1) {
        this.A00 = r1;
    }
}
