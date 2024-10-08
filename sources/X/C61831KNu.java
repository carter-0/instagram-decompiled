package X;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.creation.sharesheet.rowitems.model.PublishScreenCategoryType;
import java.util.List;

/* renamed from: X.KNu  reason: case insensitive filesystem */
public final class C61831KNu extends C65179Loi {
    public final AnonymousClass80P A00 = AnonymousClass80P.TEMP_CAMERA_TOOL;
    public final AnonymousClass4DH A01;
    public final C61848KOn A02;
    public final UserSession A03;
    public final C66576MXh A04;

    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000f, code lost:
        if (r2.A04 == false) goto L_0x0011;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (r2.A05 == false) goto L_0x0026;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final int A00(X.C61831KNu r5) {
        /*
            X.KOn r5 = r5.A02
            X.Drk r2 = X.LSR.A04(r5)
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A00
            if (r1 != r0) goto L_0x0011
            boolean r1 = r2.A04
            r0 = 1
            if (r1 != 0) goto L_0x0012
        L_0x0011:
            r0 = 0
        L_0x0012:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r0)
            r3 = 0
            X.Drk r2 = X.LSR.A04(r5)
            java.lang.Integer r1 = r2.A02
            java.lang.Integer r0 = X.AnonymousClass05K.A0Y
            if (r1 != r0) goto L_0x0026
            boolean r1 = r2.A05
            r0 = 1
            if (r1 != 0) goto L_0x0027
        L_0x0026:
            r0 = 0
        L_0x0027:
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            java.lang.Boolean[] r0 = new java.lang.Boolean[]{r4, r0}
            java.util.List r1 = X.0sr.A1P(r0)
            boolean r0 = r1 instanceof java.util.Collection
            if (r0 == 0) goto L_0x003e
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x003e
        L_0x003d:
            return r3
        L_0x003e:
            java.util.Iterator r1 = r1.iterator()
        L_0x0042:
            boolean r0 = r1.hasNext()
            if (r0 == 0) goto L_0x003d
            java.lang.Object r0 = r1.next()
            boolean r0 = X.AnonymousClass7TE.A1a(r0)
            if (r0 == 0) goto L_0x0042
            int r3 = r3 + 1
            if (r3 >= 0) goto L_0x0042
            X.0sr.A1S()
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C61831KNu.A00(X.KNu):int");
    }

    public final void CsQ() {
        AnonymousClass4DH r0 = this.A01;
        07U r4 = 07U.A05;
        AnonymousClass07Z viewLifecycleOwner = r0.getViewLifecycleOwner();
        AnonymousClass7TE.A1Z(MHO.A03(viewLifecycleOwner, r4, this, (AnonymousClass4D7) null, 22), AnonymousClass07a.A00(viewLifecycleOwner));
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C61831KNu(AnonymousClass4DH r2, UserSession userSession, C66576MXh mXh, C61848KOn kOn) {
        super(r2, mXh, PublishScreenCategoryType.CROSSPOST);
        C51974G9v.A1L(r2, userSession, mXh);
        this.A01 = r2;
        this.A03 = userSession;
        this.A02 = kOn;
        this.A04 = mXh;
    }

    public static final List A01(C61831KNu kNu) {
        Context requireContext;
        String A0a;
        boolean z;
        01N A1H = 0jo.A1H();
        C61848KOn kOn = kNu.A02;
        AnonymousClass0Ud r5 = kOn.A08;
        C47169Drk drk = (C47169Drk) r5.getValue();
        Integer num = drk.A02;
        Integer num2 = AnonymousClass05K.A00;
        if (num != num2 || !drk.A04) {
            C47169Drk A042 = LSR.A04(kOn);
            Integer num3 = A042.A02;
            Integer num4 = AnonymousClass05K.A0Y;
            if (num3 == num4 && A042.A05) {
                AnonymousClass4DH r0 = kNu.A01;
                requireContext = r0.requireContext();
                A0a = JTQ.A0a(r0.requireContext(), 2131955200);
                z = false;
                if (((C47169Drk) r5.getValue()).A02 == num4 && kOn.A0B(false) == null) {
                    z = true;
                }
            }
            return 0jo.A1I(A1H);
        }
        requireContext = kNu.A01.requireContext();
        C60951Ju9 A0A = kOn.A0A();
        if (A0A != null) {
            A0a = A0A.A04;
        } else {
            A0a = null;
        }
        z = true;
        if (!(((C47169Drk) r5.getValue()).A02 == num2 && kOn.A0B(true) == null)) {
            z = false;
        }
        boolean z2 = !z;
        View A08 = DbU.A08(LayoutInflater.from(requireContext), R.layout.layout_also_share_app_item);
        ImageView A0J = DbX.A0J(A08, R.id.app_icon);
        TextView A0R = AnonymousClass7TG.A0R(A08, R.id.app_title);
        if (z2) {
            A0J.setAlpha(0.3f);
            A0R.setAlpha(0.3f);
        }
        A0J.setImageResource(R.drawable.instagram_facebook_circle_pano_filled_24);
        A0R.setText(A0a);
        A1H.add(A08);
        return 0jo.A1I(A1H);
    }
}
