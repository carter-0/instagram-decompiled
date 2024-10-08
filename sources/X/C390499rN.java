package X;

import android.graphics.RectF;
import android.os.Bundle;
import android.view.ViewGroup;
import com.instagram.common.gallery.Medium;
import com.instagram.common.session.UserSession;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.io.File;

/* renamed from: X.9rN  reason: invalid class name and case insensitive filesystem */
public final class C390499rN extends C15291UZw {
    public static final String __redex_internal_original_name = "ReelIGTVShareFragment";
    public 28D A00;
    public 1Xj A01;
    public PendingRecipient A02;
    public File A03;

    public final AnonymousClass80D A02(ViewGroup viewGroup) {
        AnonymousClass80E r0;
        0qQ.A0B(viewGroup, 0);
        1Xj r8 = this.A01;
        if (r8 == null) {
            return null;
        }
        File file = this.A03;
        String str = "file";
        if (file != null) {
            Medium A032 = C282665Eg.A03(file, 3, 0);
            File file2 = this.A03;
            if (file2 != null) {
                A032.A0H = C39581A0x.A00(this.A00, file2, A032.CeS());
                getContext();
                int A09 = 0nA.A09(requireContext());
                int A08 = 0nA.A08(requireContext());
                float f = (float) A09;
                float f2 = (float) A08;
                RectF A0C = AnonymousClass7TF.A0C(f, f2);
                RectF rectF = new RectF(0.0f, 0.0f, f, f2);
                AnonymousClass80D A002 = AnonymousClass80D.A00();
                AnonymousClass80D.A0C(A002, this.A03, this);
                AnonymousClass80I r1 = AnonymousClass80H.A02;
                UserSession userSession = this.A00;
                0qQ.A06(userSession);
                AnonymousClass80D.A09(userSession, r1, A002, this);
                A002.A09 = viewGroup;
                28D r02 = this.A00;
                if (r02 == null) {
                    str = "entryPoint";
                } else {
                    A002.A0B = r02;
                    A002.A0O = this;
                    AnonymousClass80D.A02(A0C, rectF, A002);
                    A002.A3y = true;
                    A002.A3g = true;
                    A002.A0P = A032;
                    A002.A0w = null;
                    A002.A0Q = A032;
                    A002.A0o = new C3498682d(this.A00, r8, A09, A08);
                    A002.A3Q = true;
                    PendingRecipient pendingRecipient = this.A02;
                    if (pendingRecipient != null) {
                        A002.A1S = pendingRecipient;
                        r0 = AnonymousClass80E.GROUP_PROFILE;
                    } else {
                        r0 = AnonymousClass80E.ALL;
                    }
                    A002.A0y = r0;
                    return A002;
                }
            }
        }
        0qQ.A0F(str);
        throw AnonymousClass00P.createAndThrow();
    }

    public final String getModuleName() {
        return "reel_igtv_reshare_fragment";
    }

    public final void onCreate(Bundle bundle) {
        IllegalArgumentException illegalArgumentException;
        int i;
        int A022 = AnonymousClass0fD.A02(-208583829);
        super.onCreate(bundle);
        Bundle bundle2 = this.mArguments;
        if (bundle2 != null) {
            Object obj = bundle2.get(AnonymousClass000.A00(3320));
            0qQ.A0C(obj, "null cannot be cast to non-null type com.facebook.analytics.structuredlogger.enums.InstagramCameraEntryPointTypes");
            this.A00 = (28D) obj;
            String string = bundle2.getString(AnonymousClass000.A00(3322));
            if (string != null) {
                this.A01 = AnonymousClass7TH.A0B(this, string);
                this.A03 = AnonymousClass7TE.A0t(bundle2.getString(AnonymousClass000.A00(3321)));
                this.A02 = (PendingRecipient) bundle2.getParcelable(AnonymousClass000.A00(3323));
                AnonymousClass0fD.A09(-1283155306, A022);
                return;
            }
            illegalArgumentException = AnonymousClass7TE.A0w("No media ID specified");
            i = 1950573880;
        } else {
            illegalArgumentException = AnonymousClass7TE.A0w(AnonymousClass000.A00(459));
            i = -1312576019;
        }
        AnonymousClass0fD.A09(i, A022);
        throw illegalArgumentException;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0020, code lost:
        if (r0.exists() == false) goto L_0x0022;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onResume() {
        /*
            r3 = this;
            r0 = -99599491(0xfffffffffa103b7d, float:-1.8722433E35)
            int r2 = X.AnonymousClass0fD.A02(r0)
            super.onResume()
            X.1Xj r0 = r3.A01
            if (r0 == 0) goto L_0x0022
            java.io.File r0 = r3.A03
            if (r0 != 0) goto L_0x001c
            java.lang.String r0 = "file"
            X.0qQ.A0F(r0)
            X.00P r0 = X.AnonymousClass00P.createAndThrow()
            throw r0
        L_0x001c:
            boolean r0 = r0.exists()
            if (r0 != 0) goto L_0x002c
        L_0x0022:
            java.lang.String r1 = "igtv_share_to_story"
            java.lang.String r0 = "IGTV stories post capture gets null media or file"
            X.0wb.A03(r1, r0)
            X.VJ3.A00(r3)
        L_0x002c:
            r0 = 1549535619(0x5c5c0983, float:2.47739812E17)
            X.AnonymousClass0fD.A09(r0, r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C390499rN.onResume():void");
    }
}
