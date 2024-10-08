package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.messageid.MessageIdentifier;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;

/* renamed from: X.PgK  reason: case insensitive filesystem */
public final /* synthetic */ class C73585PgK extends 03J implements C62320sa {
    public final /* synthetic */ P9I A00;
    public final /* synthetic */ OMU A01;
    public final /* synthetic */ C333517Zg A02;
    public final /* synthetic */ DirectThreadKey A03;
    public final /* synthetic */ MessageIdentifier A04;
    public final /* synthetic */ MsysThreadId A05;
    public final /* synthetic */ AnonymousClass3OA A06;
    public final /* synthetic */ Boolean A07;
    public final /* synthetic */ String A08;
    public final /* synthetic */ String A09;
    public final /* synthetic */ String A0A;
    public final /* synthetic */ String A0B;
    public final /* synthetic */ boolean A0C;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73585PgK(P9I p9i, OMU omu, C333517Zg r3, DirectThreadKey directThreadKey, MessageIdentifier messageIdentifier, MsysThreadId msysThreadId, AnonymousClass3OA r7, Boolean bool, String str, String str2, String str3, String str4, boolean z) {
        super(0, C61920qH.class, "navigateToDirectClipsViewer", "navigateToClipsViewer$navigateToDirectClipsViewer(Ljava/lang/Boolean;Lcom/instagram/direct/fragment/thread/DirectClipsViewerNavigator;Lcom/instagram/model/sponsored/Ad;Ljava/lang/String;Ljava/lang/String;Lcom/instagram/model/direct/messageid/MessageIdentifier;Ljava/lang/String;Lcom/instagram/direct/fragment/thread/environment/gradientspinner/GradientSpinnerDelegate;ZLcom/instagram/direct/fragment/thread/infra/ClientInfra;Lcom/instagram/model/direct/DirectThreadKey;Lcom/instagram/model/direct/threadkey/impl/MsysThreadId;Ljava/lang/String;)V", 0);
        this.A07 = bool;
        this.A00 = p9i;
        this.A06 = r7;
        this.A09 = str;
        this.A0A = str2;
        this.A04 = messageIdentifier;
        this.A08 = str3;
        this.A01 = omu;
        this.A0C = z;
        this.A02 = r3;
        this.A03 = directThreadKey;
        this.A05 = msysThreadId;
        this.A0B = str4;
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        ClipsViewerSource clipsViewerSource;
        Boolean bool = this.A07;
        P9I p9i = this.A00;
        AnonymousClass3OA r3 = this.A06;
        String str = this.A09;
        String str2 = this.A0A;
        MessageIdentifier messageIdentifier = this.A04;
        String str3 = this.A08;
        OMU omu = this.A01;
        boolean z = this.A0C;
        C333517Zg r7 = this.A02;
        DirectThreadKey directThreadKey = this.A03;
        MsysThreadId msysThreadId = this.A05;
        String str4 = this.A0B;
        long j = P9I.A04;
        if (DbX.A1a(bool)) {
            clipsViewerSource = ClipsViewerSource.DIRECT_AD_FEED_OF_ADS;
        } else {
            clipsViewerSource = ClipsViewerSource.DIRECT;
        }
        UserSession userSession = p9i.A01;
        C270634h3 r4 = new C270634h3(clipsViewerSource, userSession);
        r4.A02(userSession, r3, false);
        r4.A1C = str;
        if (str2 != null) {
            r4.A1G = str2;
        }
        0qQ.A0A(r7);
        P9I.A00(r4, p9i, omu, r7, directThreadKey, messageIdentifier, msysThreadId, str, str3, str4, (String) null, z, false);
        return C60340gF.A00;
    }
}
