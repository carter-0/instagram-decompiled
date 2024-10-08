package X;

import com.instagram.clips.intf.ClipsViewerSource;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.viewer.repository.ClipsHeadMediaInsertionHelper$maybeRequestSourceMedia$1", f = "ClipsHeadMediaInsertionHelper.kt", i = {}, l = {83}, m = "invokeSuspend", n = {}, s = {})
public final class GKG extends AnonymousClass1Ek implements 0sL {
    public int A00;
    public final /* synthetic */ ClipsViewerSource A01;
    public final /* synthetic */ C52045GCr A02;
    public final /* synthetic */ String A03;
    public final /* synthetic */ String A04;
    public final /* synthetic */ String A05;
    public final /* synthetic */ String A06;
    public final /* synthetic */ String A07;
    public final /* synthetic */ boolean A08;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public GKG(ClipsViewerSource clipsViewerSource, C52045GCr gCr, String str, String str2, String str3, String str4, String str5, AnonymousClass4D7 r9, boolean z) {
        super(2, r9);
        this.A02 = gCr;
        this.A01 = clipsViewerSource;
        this.A03 = str;
        this.A05 = str2;
        this.A04 = str3;
        this.A08 = z;
        this.A07 = str4;
        this.A06 = str5;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.GKG, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r12) {
        C52045GCr gCr = this.A02;
        return new GKG(this.A01, gCr, this.A03, this.A05, this.A04, this.A07, this.A06, r12, this.A08);
    }

    /* JADX WARNING: type inference failed for: r15v0, types: [X.GKG, X.4D7] */
    public final Object invokeSuspend(Object obj) {
        String str;
        1Hj r4 = 1Hj.A02;
        if (this.A00 != 0) {
            0eS.A00(obj);
        } else {
            0eS.A00(obj);
            C52045GCr gCr = this.A02;
            ClipsViewerSource clipsViewerSource = this.A01;
            String str2 = this.A03;
            String str3 = this.A05;
            String str4 = this.A04;
            boolean z = this.A08;
            String str5 = this.A07;
            String str6 = this.A06;
            UserSession userSession = gCr.A03;
            032 r0 = null;
            if (C52047GCt.A00(clipsViewerSource, userSession, Boolean.valueOf(AnonymousClass7TF.A1V(DbV.A0U(userSession, str3))), str2, str5, (String) null, z)) {
                if (str4 != null) {
                    str3 = C70282O0m.A00(str4);
                }
                if (str3 != null) {
                    str = C51965G9l.A0u(str3);
                } else {
                    str = null;
                }
                gCr.A00 = str;
                1OC A012 = C52045GCr.A01(gCr, str6);
                if (A012 != null) {
                    r0 = A012.A05(1368380687, 2);
                }
            }
            this.A00 = 1;
            if (C52045GCr.A02(gCr, this, r0) == r4) {
                return r4;
            }
        }
        return C60340gF.A00;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((GKG) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }
}
