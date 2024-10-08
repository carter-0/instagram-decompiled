package X;

import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.Ujy  reason: case insensitive filesystem */
public final class C15874Ujy extends 0ng {
    public final /* synthetic */ C17292VPt A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ boolean A02;

    public final void run() {
        C17292VPt vPt = this.A00;
        String str = this.A01;
        boolean z = this.A02;
        2IS r5 = new 2IS();
        2IS r1 = new 2IS();
        r5.A04(PublicKeyCredentialControllerUtility.JSON_KEY_ID, str);
        PandoGraphQLRequest pandoGraphQLRequest = new PandoGraphQLRequest(C41845B3m.A06(AnonymousClass7TF.A1V(str)), "IGVideoLoggingSessionDebugging", r5.getParamsCopy(), r1.getParamsCopy(), C15142URf.class, false, (PandoRealtimeInfoJNI) null, 0, (String) null, "fetch__XFBVideoPlaySessionObjectFetch", new ArrayList());
        vPt.A00.ATL(C19035WHm.A00, new C19042WHu(str, z), pandoGraphQLRequest);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C15874Ujy(C17292VPt vPt, String str, boolean z) {
        super(2056094530, 3, false, false);
        this.A00 = vPt;
        this.A01 = str;
        this.A02 = z;
    }
}
