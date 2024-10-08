package X;

import com.facebook.pando.PandoGraphQLRequest;
import com.facebook.pando.PandoRealtimeInfoJNI;
import java.util.ArrayList;

/* renamed from: X.955  reason: invalid class name */
public final class AnonymousClass955 implements AnonymousClass39G {
    public 2IS A00 = new 2IS();
    public boolean A01 = false;
    public boolean A02 = false;
    public boolean A03 = false;
    public boolean A04 = false;
    public 2IS A05 = new 2IS();

    /* renamed from: A00 */
    public final PandoGraphQLRequest build() {
        17k.A0E(this.A03);
        17k.A0E(this.A04);
        17k.A0E(this.A02);
        17k.A0E(this.A01);
        AnonymousClass2IY r0 = PandoGraphQLRequest.Companion;
        return new PandoGraphQLRequest(AnonymousClass1vS.A00(), "DcpFeaturesUpload", this.A00.getParamsCopy(), this.A05.getParamsCopy(), AnonymousClass956.class, true, (PandoRealtimeInfoJNI) null, 0, (String) null, "xfb_post_dcp_features_upload", new ArrayList());
    }
}
