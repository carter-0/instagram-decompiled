package X;

import com.instagram.common.session.UserSession;
import com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig;

public abstract class K5U extends AnonymousClass4DH implements AnonymousClass4DR {
    public static final String __redex_internal_original_name = "ClipsTimelineEditorBaseFragment";
    public C357638Yz A00;
    public C390839rv A01 = C390839rv.POST_CAPTURE;
    public ClipsTimelineEditorConfig A02 = new ClipsTimelineEditorConfig(false, false, false, 2);
    public C3511387s A03;
    public C2801950r A04 = C2801950r.CLIPS;
    public final AnonymousClass0eM A05 = C227642jf.A02(this);

    public final UserSession A0O() {
        return AnonymousClass7TE.A0l(this.A05);
    }

    public final C3511387s A0P() {
        C3511387s r0 = this.A03;
        if (r0 != null) {
            return r0;
        }
        0qQ.A0F("clipsTemplateViewModel");
        throw AnonymousClass00P.createAndThrow();
    }

    public final AnonymousClass0wW getSession() {
        return AnonymousClass7TE.A0l(this.A05);
    }

    public static boolean A00(K5U k5u) {
        C3511387s A002 = new 2YN(C351878Au.A00(k5u.requireActivity(), k5u.A0O()), k5u.requireActivity()).A00(C3511387s.class);
        0qQ.A0B(A002, 0);
        k5u.A03 = A002;
        return false;
    }

    /* JADX WARNING: Unknown top exception splitter block from list: {B:8:0x0039=Splitter:B:8:0x0039, B:22:0x006a=Splitter:B:22:0x006a} */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onCreate(android.os.Bundle r8) {
        /*
            r7 = this;
            r0 = 7936791(0x791b17, float:1.1121813E-38)
            int r5 = X.AnonymousClass0fD.A02(r0)
            X.K5U.super.onCreate(r8)
            r7.requireArguments()
            int r6 = android.os.Build.VERSION.SDK_INT
            java.lang.String r2 = "ARG_EDITOR_CONFIG"
            java.lang.String r4 = "ARG_EDITOR_TRANSITION_SOURCE"
            java.lang.String r3 = "ARG_CLIPS_CREATION_TYPE"
            r0 = 33
            android.os.Bundle r1 = r7.requireArguments()
            if (r6 < r0) goto L_0x004a
            java.lang.Class<X.50r> r0 = X.C2801950r.class
            java.io.Serializable r0 = r1.getSerializable(r3, r0)
            X.50r r0 = (X.C2801950r) r0
            if (r0 == 0) goto L_0x0029
            r7.A04 = r0
        L_0x0029:
            android.os.Bundle r1 = r7.requireArguments()
            java.lang.Class<X.9rv> r0 = X.C390839rv.class
            java.io.Serializable r0 = r1.getSerializable(r4, r0)
            X.9rv r0 = (X.C390839rv) r0
            if (r0 == 0) goto L_0x0039
            r7.A01 = r0
        L_0x0039:
            android.os.Bundle r1 = r7.requireArguments()     // Catch:{ BadParcelableException -> 0x007d }
            java.lang.Class<com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig> r0 = com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig.class
            java.io.Serializable r0 = r1.getSerializable(r2, r0)     // Catch:{ BadParcelableException -> 0x007d }
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r0 = (com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig) r0     // Catch:{ BadParcelableException -> 0x007d }
            if (r0 == 0) goto L_0x0091
            r7.A02 = r0     // Catch:{ BadParcelableException -> 0x007d }
            goto L_0x0091
        L_0x004a:
            java.io.Serializable r1 = r1.getSerializable(r3)
            boolean r0 = r1 instanceof X.C2801950r
            if (r0 == 0) goto L_0x0058
            X.50r r1 = (X.C2801950r) r1
            if (r1 == 0) goto L_0x0058
            r7.A04 = r1
        L_0x0058:
            android.os.Bundle r0 = r7.requireArguments()
            java.io.Serializable r1 = r0.getSerializable(r4)
            boolean r0 = r1 instanceof X.C390839rv
            if (r0 == 0) goto L_0x006a
            X.9rv r1 = (X.C390839rv) r1
            if (r1 == 0) goto L_0x006a
            r7.A01 = r1
        L_0x006a:
            android.os.Bundle r0 = r7.requireArguments()     // Catch:{ BadParcelableException -> 0x007d }
            java.io.Serializable r1 = r0.getSerializable(r2)     // Catch:{ BadParcelableException -> 0x007d }
            boolean r0 = r1 instanceof com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig     // Catch:{ BadParcelableException -> 0x007d }
            if (r0 == 0) goto L_0x0091
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r1 = (com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig) r1     // Catch:{ BadParcelableException -> 0x007d }
            if (r1 == 0) goto L_0x0091
            r7.A02 = r1     // Catch:{ BadParcelableException -> 0x007d }
            goto L_0x0091
        L_0x007d:
            r3 = move-exception
            X.0wj r2 = X.0wj.A01
            r1 = 613296938(0x248e2b2a, float:6.1655806E-17)
            java.lang.String r0 = "ARG_EDITOR_CONFIG BadParcelableException"
            X.AnonymousClass7TG.A1I(r2, r0, r3, r1)
            r2 = 0
            r1 = 2
            com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig r0 = new com.instagram.creation.capture.quickcapture.sundial.edit.model.ClipsTimelineEditorConfig
            r0.<init>(r2, r2, r2, r1)
            r7.A02 = r0
        L_0x0091:
            boolean r4 = A00(r7)
            androidx.fragment.app.FragmentActivity r3 = r7.requireActivity()
            androidx.fragment.app.FragmentActivity r2 = r7.requireActivity()
            X.0eM r0 = r7.A05
            com.instagram.common.session.UserSession r1 = X.AnonymousClass7TE.A0l(r0)
            X.80c r0 = new X.80c
            r0.<init>(r2, r1, r4, r4)
            X.2YN r1 = X.JTO.A0L(r0, r3)
            java.lang.Class<X.8Yz> r0 = X.C357638Yz.class
            X.2YL r0 = r1.A00(r0)
            X.8Yz r0 = (X.C357638Yz) r0
            X.0qQ.A0B(r0, r4)
            r7.A00 = r0
            r0 = 1889051176(0x7098a228, float:3.7790205E29)
            X.AnonymousClass0fD.A09(r0, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.K5U.onCreate(android.os.Bundle):void");
    }
}
