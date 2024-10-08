package X;

import com.instagram.user.model.User;
import java.util.concurrent.atomic.AtomicBoolean;
import org.webrtc.EglBase14Impl;

/* renamed from: X.PqY  reason: case insensitive filesystem */
public final class C74192PqY extends 0Yg implements 0sP {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final String A03;
    public final String A04;

    public static C333717a0 A00(Object obj, C74192PqY pqY) {
        0qQ.A0B(obj, 0);
        C333717a0 r1 = ((C52971GgO) pqY.A02).A0C;
        AtomicBoolean atomicBoolean = 1Xj.A0i;
        return r1;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74192PqY(C52971GgO ggO, User user, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A02 = ggO;
        this.A01 = user;
        switch (i) {
            case 16:
            case 17:
            case EglBase14Impl.EGLExt_SDK_VERSION:
            case 20:
                this.A03 = str;
                this.A04 = str2;
                break;
            default:
                this.A04 = str;
                this.A03 = str2;
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:101:0x03af, code lost:
        return X.C60340gF.A00;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:107:0x03cc, code lost:
        return ((X.C250663lr) r15.A02).parseStringDefList(r8, r15.A03, r15.A04, (com.facebook.graphservice.interfaces.FromStringAble) r15.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0086, code lost:
        r3.A06(r0, r1);
        r1 = r15.A04;
        r0 = "target_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x0019, code lost:
        r3.A06(r0, r1);
        r1 = r15.A04;
        r0 = "view_name";
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x0253, code lost:
        r1.A0A(r2, r3, r4, r5, r6);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0020, code lost:
        r3.A06(r0, r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0023, code lost:
        X.C66582MXn.A1B(r3, r2);
        r8.A0N(r3, "event_payload");
        X.C51969G9p.A1G(r8, r15.A01);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0030, code lost:
        return r8;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* bridge */ /* synthetic */ java.lang.Object invoke(java.lang.Object r16) {
        /*
            r15 = this;
            r8 = r16
            int r0 = r15.A00
            switch(r0) {
                case 0: goto L_0x03b6;
                case 1: goto L_0x03b0;
                case 2: goto L_0x03b6;
                case 3: goto L_0x0074;
                case 4: goto L_0x0061;
                case 5: goto L_0x0044;
                case 6: goto L_0x0031;
                case 7: goto L_0x0031;
                case 8: goto L_0x0031;
                case 9: goto L_0x0007;
                case 10: goto L_0x0007;
                case 11: goto L_0x0007;
                case 12: goto L_0x0383;
                case 13: goto L_0x02b1;
                case 14: goto L_0x0297;
                case 15: goto L_0x027d;
                case 16: goto L_0x0258;
                case 17: goto L_0x023d;
                case 18: goto L_0x0226;
                case 19: goto L_0x020f;
                case 20: goto L_0x01f6;
                case 21: goto L_0x0197;
                case 22: goto L_0x0164;
                case 23: goto L_0x0127;
                case 24: goto L_0x00eb;
                case 25: goto L_0x00ab;
                case 26: goto L_0x008e;
                case 27: goto L_0x008e;
                default: goto L_0x0007;
            }
        L_0x0007:
            X.1Ln r8 = (X.1Ln) r8
            X.N19 r3 = new X.N19
            r3.<init>()
            java.lang.Object r2 = r15.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            java.lang.String r1 = r15.A03
            java.lang.String r0 = "shipping_option_id"
        L_0x0019:
            r3.A06(r0, r1)
            java.lang.String r1 = r15.A04
            java.lang.String r0 = "view_name"
        L_0x0020:
            r3.A06(r0, r1)
        L_0x0023:
            X.C66582MXn.A1B(r3, r2)
            java.lang.String r0 = "event_payload"
            r8.A0N(r3, r0)
            java.lang.Object r0 = r15.A01
            X.C51969G9p.A1G(r8, r0)
            return r8
        L_0x0031:
            X.1Ln r8 = (X.1Ln) r8
            X.N18 r3 = new X.N18
            r3.<init>()
            java.lang.Object r2 = r15.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            java.lang.String r1 = r15.A03
            java.lang.String r0 = "fulfillment_option_id"
            goto L_0x0019
        L_0x0044:
            X.1Ln r8 = (X.1Ln) r8
            X.N13 r3 = new X.N13
            r3.<init>()
            java.lang.String r1 = r15.A03
            java.lang.String r0 = "auto_advance_from_field"
            r3.A06(r0, r1)
            java.lang.String r1 = r15.A04
            java.lang.String r0 = "auto_advance_to_field"
            r3.A06(r0, r1)
            java.lang.Object r2 = r15.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            goto L_0x0023
        L_0x0061:
            X.1Ln r8 = (X.1Ln) r8
            X.N19 r3 = new X.N19
            r3.<init>()
            java.lang.Object r2 = r15.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            java.lang.String r1 = r15.A03
            java.lang.String r0 = "shipping_option_id"
            goto L_0x0086
        L_0x0074:
            X.1Ln r8 = (X.1Ln) r8
            X.N18 r3 = new X.N18
            r3.<init>()
            java.lang.Object r2 = r15.A02
            com.facebookpay.logging.LoggingContext r2 = (com.facebookpay.logging.LoggingContext) r2
            X.C51971G9r.A1B(r3, r2)
            java.lang.String r1 = r15.A03
            java.lang.String r0 = "fulfillment_option_id"
        L_0x0086:
            r3.A06(r0, r1)
            java.lang.String r1 = r15.A04
            java.lang.String r0 = "target_name"
            goto L_0x0020
        L_0x008e:
            X.OFk r8 = (X.C70663OFk) r8
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.String r0 = r15.A04
            r8.A01 = r0
            java.lang.Object r0 = r15.A02
            java.lang.Integer r0 = (java.lang.Integer) r0
            r8.A02 = r0
            java.lang.String r0 = r15.A03
            r8.A00 = r0
            java.lang.Object r0 = r15.A01
            X.0sa r0 = (X.C62320sa) r0
            r8.A03 = r0
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x00ab:
            X.0eP r8 = (X.0eP) r8
            r6 = 0
            X.0qQ.A0B(r8, r6)
            java.lang.Object r5 = r8.A00
            java.lang.Object r0 = r8.A01
            java.lang.Number r0 = (java.lang.Number) r0
            int r4 = X.AnonymousClass7TG.A0A(r0)
            if (r5 != 0) goto L_0x00da
            java.lang.Object r2 = r15.A02
            X.OTW r2 = (X.OTW) r2
            com.instagram.common.session.UserSession r0 = r2.A00
            X.8x3 r1 = X.C370768x2.A00(r0)
            java.lang.String r0 = r15.A03
            r1.A01(r0, r4)
            X.OMd r3 = r2.A03
            java.lang.String r2 = r15.A04
            long r0 = (long) r4
            java.util.List r1 = X.C66582MXn.A10(r0)
            r0 = 7042(0x1b82, float:9.868E-42)
            r3.A00(r2, r1, r0, r6)
        L_0x00da:
            java.lang.Object r1 = r15.A01
            X.0sP r1 = (X.0sP) r1
            java.lang.String r0 = java.lang.String.valueOf(r4)
            X.0eP r0 = X.AnonymousClass7TE.A1L(r5, r0)
            r1.invoke(r0)
            goto L_0x03ad
        L_0x00eb:
            X.0eP r8 = (X.0eP) r8
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.Object r6 = r8.A00
            java.lang.Object r5 = r8.A01
            java.lang.Number r5 = (java.lang.Number) r5
            if (r6 != 0) goto L_0x010e
            if (r5 == 0) goto L_0x010e
            java.lang.Object r0 = r15.A02
            X.OFO r0 = (X.OFO) r0
            com.instagram.common.session.UserSession r0 = r0.A00
            X.8x3 r2 = X.C370768x2.A00(r0)
            java.lang.String r1 = r15.A03
            int r0 = r5.intValue()
            r2.A01(r1, r0)
        L_0x010e:
            java.lang.Object r0 = r15.A02
            X.OFO r0 = (X.OFO) r0
            X.OMd r4 = r0.A03
            java.lang.String r3 = r15.A04
            int r2 = X.DbX.A01(r5)
            r1 = 0
            r0 = 7042(0x1b82, float:9.868E-42)
            r4.A00(r3, r1, r0, r2)
            java.lang.Object r0 = r15.A01
            X.C51965G9l.A1W(r0, r6)
            goto L_0x03ad
        L_0x0127:
            java.lang.Object r6 = r15.A02
            X.NK9 r6 = (X.NK9) r6
            java.lang.String r0 = r15.A03
            X.NK9.A00(r6, r0)
            X.0eM r0 = r6.A03
            X.0lg r5 = X.DbT.A0X(r0)
            java.lang.Class<com.instagram.modal.ModalActivity> r4 = com.instagram.modal.ModalActivity.class
            java.lang.String r3 = r15.A04
            java.lang.Object r2 = r15.A01
            android.os.Bundle r2 = (android.os.Bundle) r2
            X.HLC r1 = X.HLC.CLOSE_ACTIVITY
            java.lang.String r0 = "creator_ai_fragment_dismiss_strategy"
            r2.putSerializable(r0, r1)
            java.lang.String r1 = "sandbox"
            r0 = 42
            java.lang.String r0 = X.C273654mx.A00(r0)
            r2.putString(r0, r1)
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            X.6W8 r0 = X.DbS.A0b(r0, r2, r5, r4, r3)
            X.DbT.A1M(r6, r0)
            X.0sa r0 = r6.A00
            if (r0 == 0) goto L_0x03ad
            r0.invoke()
            goto L_0x03ad
        L_0x0164:
            X.6Gb r8 = (X.C305006Gb) r8
            r14 = 0
            X.0qQ.A0B(r8, r14)
            java.lang.Object r10 = r15.A01
            java.util.List r10 = (java.util.List) r10
            X.J29 r1 = X.J29.A00
            java.lang.String r12 = r15.A03
            java.lang.String r13 = r15.A04
            java.lang.Object r11 = r15.A02
            X.Pnd r4 = X.C74012Pnd.A00
            int r3 = r10.size()
            r0 = 7
            X.J6k r2 = new X.J6k
            r2.<init>((int) r0, (java.util.List) r10, (X.0sP) r1)
            r0 = 8
            X.J6k r1 = new X.J6k
            r1.<init>((int) r0, (java.util.List) r10, (X.0sP) r4)
            X.JJd r9 = new X.JJd
            r9.<init>(r10, r11, r12, r13, r14)
            X.5PJ r0 = X.AnonymousClass5PI.A02(r9)
            r8.CfA(r2, r1, r0, r3)
            goto L_0x03ad
        L_0x0197:
            X.8IO r8 = (X.AnonymousClass8IO) r8
            X.8IO r0 = X.AnonymousClass8IO.SUCCESS
            if (r8 != r0) goto L_0x01d8
            java.lang.Object r6 = r15.A02
            X.8Hw r6 = (X.C353498Hw) r6
            X.8IN r0 = r6.A1p
            X.05G r0 = r0.A02
            java.lang.Object r5 = r0.getValue()
            com.instagram.music.common.config.MusicAttributionConfig r5 = (com.instagram.music.common.config.MusicAttributionConfig) r5
            if (r5 == 0) goto L_0x03ad
            java.lang.String r4 = r15.A04
            java.lang.String r3 = r15.A03
            java.lang.Object r2 = r15.A01
            com.instagram.music.common.model.InstagramAudioApplySource r2 = (com.instagram.music.common.model.InstagramAudioApplySource) r2
            X.80y r0 = r6.A0I
            if (r0 == 0) goto L_0x03ad
            int r0 = r0.A01
            com.instagram.music.common.model.AudioOverlayTrack r1 = X.AnonymousClass9ST.A00(r5, r0)
            if (r1 == 0) goto L_0x01c9
            r1.A0C = r3
            r1.A07 = r2
            r0 = 1
            X.C353498Hw.A11(r6, r1, r0)
        L_0x01c9:
            com.instagram.common.session.UserSession r0 = r6.A1D
            X.27r r2 = X.27p.A01(r0)
            java.lang.String r1 = "SUCCESS"
            com.instagram.music.common.model.MusicAssetModel r0 = r5.A02
            r2.A1h(r0, r1, r4)
            goto L_0x03ad
        L_0x01d8:
            X.8IO r0 = X.AnonymousClass8IO.FAILED
            if (r8 == r0) goto L_0x01e0
            X.8IO r0 = X.AnonymousClass8IO.NOT_AVAILABLE
            if (r8 != r0) goto L_0x03ad
        L_0x01e0:
            java.lang.Object r0 = r15.A02
            X.8Hw r0 = (X.C353498Hw) r0
            com.instagram.common.session.UserSession r0 = r0.A1D
            X.27r r3 = X.27p.A01(r0)
            java.lang.String r2 = r8.name()
            java.lang.String r1 = r15.A04
            r0 = 0
            r3.A1h(r0, r2, r1)
            goto L_0x03ad
        L_0x01f6:
            X.7a7 r8 = (X.C333777a7) r8
            X.7a0 r4 = A00(r8, r15)
            java.lang.String r0 = r8.A0I
            java.lang.String r3 = X.1Xv.A06(r0)
            java.lang.Object r2 = r15.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r1 = r15.A03
            java.lang.String r0 = r15.A04
            r4.A09(r2, r3, r1, r0)
            goto L_0x03ad
        L_0x020f:
            X.7a7 r8 = (X.C333777a7) r8
            X.7a0 r1 = A00(r8, r15)
            java.lang.String r0 = r8.A0I
            java.lang.String r4 = X.1Xv.A06(r0)
            java.lang.Object r2 = r15.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r5 = r15.A04
            java.lang.String r6 = r15.A03
            java.lang.String r3 = "restrict_option"
            goto L_0x0253
        L_0x0226:
            X.7a7 r8 = (X.C333777a7) r8
            X.7a0 r1 = A00(r8, r15)
            java.lang.String r0 = r8.A0I
            java.lang.String r4 = X.1Xv.A06(r0)
            java.lang.Object r2 = r15.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r5 = r15.A03
            java.lang.String r6 = r15.A04
            java.lang.String r3 = "restrict_success_dialog"
            goto L_0x0253
        L_0x023d:
            X.7a7 r8 = (X.C333777a7) r8
            X.7a0 r1 = A00(r8, r15)
            java.lang.String r0 = r8.A0I
            java.lang.String r4 = X.1Xv.A06(r0)
            java.lang.Object r2 = r15.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r5 = r15.A03
            java.lang.String r6 = r15.A04
            java.lang.String r3 = "restrict_success_delete_comment"
        L_0x0253:
            r1.A0A(r2, r3, r4, r5, r6)
            goto L_0x03ad
        L_0x0258:
            X.7a7 r8 = (X.C333777a7) r8
            X.7a0 r1 = A00(r8, r15)
            java.lang.String r0 = r8.A0I
            java.lang.String r7 = X.1Xv.A06(r0)
            java.lang.Object r2 = r15.A01
            com.instagram.user.model.User r2 = (com.instagram.user.model.User) r2
            java.lang.String r5 = r15.A03
            java.lang.String r6 = r15.A04
            java.lang.String r4 = "restrict_success_dialog"
            X.AnonymousClass7TG.A1U(r7, r2, r5)
            X.73V r0 = X.AnonymousClass73V.A00
            X.0wc r1 = r1.A01
            java.lang.String r3 = "impression"
            r8 = 0
            r0.A0J(r1, r2, r3, r4, r5, r6, r7, r8)
            goto L_0x03ad
        L_0x027d:
            java.lang.Object r2 = r15.A02
            X.2YL r2 = (X.2YL) r2
            X.6oS r0 = X.C318116oQ.A00(r2)
            java.lang.String r4 = r15.A03
            java.lang.String r5 = r15.A04
            java.lang.Object r3 = r15.A01
            r6 = 0
            r7 = 2
            X.JVS r1 = new X.JVS
            r1.<init>(r2, r3, r4, r5, r6, r7)
            X.AnonymousClass7TE.A1Z(r1, r0)
            goto L_0x03ad
        L_0x0297:
            X.7aH r8 = (X.C333867aH) r8
            r0 = 0
            X.0qQ.A0B(r8, r0)
            java.lang.String r5 = r15.A04
            java.lang.String r4 = r15.A03
            java.lang.Object r3 = r15.A02
            java.lang.Object r2 = r15.A01
            r1 = 25
            X.J6j r0 = new X.J6j
            r0.<init>((int) r1, (java.lang.Object) r3, (java.lang.Object) r2)
            X.7aH r8 = X.C335067cK.A07(r8, r5, r4, r0)
            return r8
        L_0x02b1:
            X.SUj r8 = (X.SUj) r8
            r3 = 0
            X.0qQ.A0B(r8, r3)
            boolean r0 = X.SUj.A0U(r8)
            if (r0 != 0) goto L_0x037a
            java.lang.Object r0 = r8.A01
            X.QXI r0 = (X.QXI) r0
            r7 = 0
            if (r0 == 0) goto L_0x0381
            X.QXk r0 = r0.A0E()
            if (r0 == 0) goto L_0x0381
            X.QXE r0 = r0.A0E()
            if (r0 == 0) goto L_0x0381
            X.QXg r4 = r0.A0E()
            if (r4 == 0) goto L_0x0381
            X.HNF r2 = X.HNF.UNSET_OR_UNRECOGNIZED_ENUM_VALUE
            r1 = 1
            java.lang.String r0 = "error_step"
            java.lang.Enum r5 = r4.getOptionalEnumField(r1, r0, r2)
            X.HNF r5 = (X.HNF) r5
            if (r5 == 0) goto L_0x0341
            if (r5 == r2) goto L_0x0341
            java.lang.Throwable r0 = r8.A02
            if (r0 != 0) goto L_0x033a
            X.QXL r0 = r4.A0F()
            if (r0 == 0) goto L_0x02fb
            X.QVG r1 = r0.A0E()
            if (r1 == 0) goto L_0x02fb
            java.lang.String r0 = "error_code"
            int r3 = r1.getCoercedIntField(r3, r0)
        L_0x02fb:
            java.lang.String r2 = "Unknown Server Error For Credential Mutation"
            X.QXL r0 = r4.A0F()
            if (r0 == 0) goto L_0x031c
            X.QVG r1 = r0.A0E()
            if (r1 == 0) goto L_0x031c
            r0 = 284(0x11c, float:3.98E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r1 = r1.A0B(r0)
            if (r1 == 0) goto L_0x031c
            boolean r0 = X.00l.A0W(r1)
            if (r0 != 0) goto L_0x031c
            r2 = r1
        L_0x031c:
            X.QXL r0 = r4.A0F()
            if (r0 == 0) goto L_0x0334
            X.QVG r1 = r0.A0E()
            if (r1 == 0) goto L_0x0334
            r0 = 283(0x11b, float:3.97E-43)
            java.lang.String r0 = X.AnonymousClass000.A00(r0)
            java.lang.String r0 = r1.A0C(r0)
            if (r0 != 0) goto L_0x0336
        L_0x0334:
            java.lang.String r0 = ""
        L_0x0336:
            X.TQk r0 = X.C9677Rev.A00(r2, r0, r3)
        L_0x033a:
            X.SUj r8 = X.SUj.A0A(r7, r0)
            X.0qQ.A0A(r8)
        L_0x0341:
            X.SUU r4 = X.C9962RkH.A00
            java.lang.Object r6 = r15.A01
            com.facebookpay.logging.LoggingContext r6 = (com.facebookpay.logging.LoggingContext) r6
            java.lang.String r9 = r15.A04
            r12 = 1
            X.QIu r2 = new X.QIu
            r2.<init>()
            java.lang.String r1 = "credentials"
            r0 = 806(0x326, float:1.13E-42)
            java.lang.String r0 = X.Pxd.A00(r0)
            r2.A06(r0, r1)
            java.lang.String r0 = X.DbY.A0k(r9)
            X.NlW r1 = X.C69426NlW.valueOf(r0)
            java.lang.String r0 = "mutation_type"
            r2.A01(r1, r0)
            java.util.List r11 = X.AnonymousClass7TE.A1I(r2)
            java.lang.String r10 = r15.A03
            java.lang.Object r0 = r15.A02
            com.facebookpay.otc.models.OtcInput r0 = (com.facebookpay.otc.models.OtcInput) r0
            if (r0 == 0) goto L_0x0377
            X.SEB r7 = X.C11300SKk.A01(r0)
        L_0x0377:
            r4.A0F(r5, r6, r7, r8, r9, r10, r11, r12)
        L_0x037a:
            X.OlZ r0 = X.C71484OlZ.A00
            X.SUj r8 = X.SUj.A03(r0, r8)
            return r8
        L_0x0381:
            r5 = r7
            goto L_0x0341
        L_0x0383:
            boolean r1 = X.AnonymousClass7TE.A1a(r8)
            X.Sto r6 = X.C51965G9l.A0g()
            java.lang.Object r0 = r15.A02
            X.QDN r0 = (X.QDN) r0
            com.facebookpay.logging.LoggingContext r5 = r0.A1P
            java.lang.String r4 = r15.A04
            java.lang.Object r3 = r15.A01
            java.lang.Long r3 = (java.lang.Long) r3
            X.QDH r0 = r0.A1Q
            X.SEB r0 = r0.A03()
            java.lang.String r2 = r15.A03
            java.util.LinkedHashMap r1 = X.C66583MXo.A0m(r0, r1)
            if (r2 == 0) goto L_0x03aa
            java.lang.String r0 = "selected_shippingaddress_state"
            r1.put(r0, r2)
        L_0x03aa:
            r6.A0J(r5, r3, r4, r1)
        L_0x03ad:
            X.0gF r8 = X.C60340gF.A00
            return r8
        L_0x03b0:
            com.google.common.collect.ImmutableList r8 = (com.google.common.collect.ImmutableList) r8
            if (r8 != 0) goto L_0x03bc
            r8 = 0
            return r8
        L_0x03b6:
            com.google.common.collect.ImmutableList r8 = (com.google.common.collect.ImmutableList) r8
            r0 = 0
            X.0qQ.A0B(r8, r0)
        L_0x03bc:
            java.lang.Object r3 = r15.A02
            X.3lr r3 = (X.C250663lr) r3
            java.lang.String r2 = r15.A03
            java.lang.String r1 = r15.A04
            java.lang.Object r0 = r15.A01
            com.facebook.graphservice.interfaces.FromStringAble r0 = (com.facebook.graphservice.interfaces.FromStringAble) r0
            com.google.common.collect.ImmutableList r8 = r3.parseStringDefList(r8, r2, r1, r0)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C74192PqY.invoke(java.lang.Object):java.lang.Object");
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C74192PqY(Object obj, Object obj2, String str, String str2, int i) {
        super(1);
        this.A00 = i;
        this.A02 = obj;
        this.A03 = str;
        this.A04 = str2;
        this.A01 = obj2;
    }
}
