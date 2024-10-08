package X;

import android.widget.ListAdapter;
import androidx.credentials.playservices.controllers.CreatePublicKeyCredential.PublicKeyCredentialControllerUtility;
import com.instagram.debug.devoptions.avatars.ImmersiveAvatarViewerDebugFragment;

/* renamed from: X.75b  reason: invalid class name and case insensitive filesystem */
public final /* synthetic */ class C3260175b implements C3268478j {
    public final /* synthetic */ ListAdapter A00;
    public final /* synthetic */ C329247Id A01;

    public /* synthetic */ C3260175b(ListAdapter listAdapter, C329247Id r2) {
        this.A01 = r2;
        this.A00 = listAdapter;
    }

    public final void DB8() {
        XSV xsv;
        C329247Id r1 = this.A01;
        C68136N2a n2a = ((AnonymousClass7H0) ((AnonymousClass7H1) this.A00)).A03;
        if (n2a != null) {
            C329257Ie r12 = r1.A03;
            C3260875i r0 = n2a.A02;
            if (r0 != null || (n2a.A00 > 0 && (r0 = n2a.A01) != null)) {
                C329267If r4 = r12.A00;
                String A002 = C329257Ie.A00(r0);
                0qQ.A0B(A002, 0);
                0wc r2 = r4.A00;
                0Aj A003 = r2.A00(r2.A00, "ig_direct_command_system_triggered");
                if (A003.isSampled()) {
                    Object obj = r4.A02.get();
                    0qQ.A07(obj);
                    boolean booleanValue = ((Boolean) obj).booleanValue();
                    C254783t2 r5 = r4.A01;
                    String A02 = AnonymousClass4KK.A02(r5);
                    if (A02 == null) {
                        A02 = "";
                    }
                    Long A0n = 00y.A0n(10, A02);
                    boolean A07 = AnonymousClass6W3.A07(r5);
                    if (A07) {
                        if (booleanValue) {
                            xsv = XSV.A03;
                        } else {
                            xsv = XSV.A04;
                        }
                    } else if (booleanValue) {
                        xsv = XSV.A05;
                    } else {
                        xsv = XSV.A06;
                    }
                    0bb r13 = new 0bb();
                    r13.A06(PublicKeyCredentialControllerUtility.JSON_KEY_ID, A02);
                    r13.A06("key", A02);
                    r13.A01(xsv, PublicKeyCredentialControllerUtility.JSON_KEY_TYPE);
                    A003.AAK(r13, "thread");
                    A003.A9F("recipient_id", A0n);
                    A003.AAJ(ImmersiveAvatarViewerDebugFragment.QPL_IMMERSIVE_VIEWER_ENTRY_POINT_ANNOTATION_KEY, A002);
                    A003.A7p("is_e2ee", Boolean.valueOf(A07));
                    A003.A9F("occamadillo_thread_id", AnonymousClass4KK.A01(r5));
                    A003.AAJ("open_thread_id", AnonymousClass4KK.A02(r5));
                    A003.Cgf();
                }
            }
        }
    }
}
