package X;

import androidx.fragment.app.FragmentActivity;
import com.instagram.common.session.UserSession;
import kotlin.coroutines.jvm.internal.DebugMetadata;

@DebugMetadata(c = "instagram.features.clips.download.ClipsDownloadUtil$saveVideoWithWatermarkToDevice$1$performDownloadVideo$1$1$1", f = "ClipsDownloadUtil.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: X.Fxf  reason: case insensitive filesystem */
public final class C51641Fxf extends AnonymousClass1Ek implements 0sL {
    public final /* synthetic */ FragmentActivity A00;
    public final /* synthetic */ 0hq A01;
    public final /* synthetic */ UserSession A02;
    public final /* synthetic */ 1Xj A03;
    public final /* synthetic */ LEF A04;
    public final /* synthetic */ boolean A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C51641Fxf(FragmentActivity fragmentActivity, 0hq r3, UserSession userSession, 1Xj r5, LEF lef, AnonymousClass4D7 r7, boolean z) {
        super(2, r7);
        this.A05 = z;
        this.A02 = userSession;
        this.A00 = fragmentActivity;
        this.A03 = r5;
        this.A04 = lef;
        this.A01 = r3;
    }

    /* JADX WARNING: type inference failed for: r0v0, types: [X.Fxf, X.4D7] */
    public final AnonymousClass4D7 create(Object obj, AnonymousClass4D7 r10) {
        boolean z = this.A05;
        UserSession userSession = this.A02;
        return new C51641Fxf(this.A00, this.A01, userSession, this.A03, this.A04, r10, z);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return ((C51641Fxf) AnonymousClass7TE.A1M(obj2, obj, this)).invokeSuspend(C60340gF.A00);
    }

    public final Object invokeSuspend(Object obj) {
        0eS.A00(obj);
        if (this.A05) {
            LTW.A02(this.A00, this.A02, this.A03, this.A04);
        } else {
            SQH.A02(this.A01);
        }
        return C60340gF.A00;
    }
}
