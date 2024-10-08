package X;

import com.facebookpay.logging.LoggingContext;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;
import com.instagram.debug.devoptions.metadata.view.ThreadMetadataOverrideFragment;

/* renamed from: X.Pmf  reason: case insensitive filesystem */
public final class C73961Pmf extends 0Yg implements 0sP {
    public final int A00;
    public final int A01;
    public final int A02;
    public final Object A03;
    public final Object A04;
    public final String A05;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73961Pmf(Object obj, Object obj2, String str, int i, int i2, int i3) {
        super(1);
        this.A00 = i3;
        this.A01 = i;
        this.A05 = str;
        this.A04 = obj;
        this.A02 = i2;
        this.A03 = obj2;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        Object obj2;
        switch (this.A00) {
            case 0:
                1Ln r5 = (1Ln) obj;
                0bb r3 = new 0bb();
                LoggingContext loggingContext = (LoggingContext) this.A04;
                C51971G9r.A1B(r3, loggingContext);
                r3.A06("target_name", this.A05);
                r3.A05("user_input_len", DbS.A0j(this.A02));
                r3.A05("selected_option", DbS.A0j(this.A01));
                C53203GkD A002 = SQ1.A00(loggingContext);
                if (A002 != null) {
                    r3.A02(A002, "logging_policy");
                }
                r5.A0N(r3, "event_payload");
                C51969G9p.A1G(r5, this.A03);
                return r5;
            case 1:
                String A1E = C41847B3o.A1E(obj);
                C284945Oz r2 = (C284945Oz) this.A03;
                if (A1E.length() > this.A01) {
                    obj2 = new C53510Gpg(this.A05);
                } else {
                    obj2 = IPY.A00;
                }
                r2.Epw(obj2);
                ((0sL) this.A04).invoke(Integer.valueOf(this.A02), A1E);
                break;
            default:
                1Ln r52 = (1Ln) obj;
                0qQ.A0B(r52, 0);
                r52.A0X(this.A01);
                r52.A0R("creation_session_id", this.A04.toString());
                r52.A0M((C69503Nml) this.A03, ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY);
                r52.A0O("is_e2ee", false);
                r52.A0Y(this.A02);
                r52.A0R(ThreadMetadataOverrideFragment.BUNDLE_THREAD_ID, this.A05);
                r52.A0M(XSV.A02, "thread_type");
                r52.A0Z(36);
                break;
        }
        return C60340gF.A00;
    }
}
