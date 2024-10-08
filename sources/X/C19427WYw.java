package X;

import android.graphics.drawable.Drawable;
import java.util.List;

/* renamed from: X.WYw  reason: case insensitive filesystem */
public final class C19427WYw implements C66494MTx {
    public final /* synthetic */ C70826OMy A00;
    public final /* synthetic */ C15286UZq A01;
    public final /* synthetic */ String A02;
    public final /* synthetic */ boolean A03;

    public final void DWl(C346927vz r22) {
        String str;
        Integer num;
        C15286UZq uZq = this.A01;
        C70826OMy oMy = this.A00;
        String str2 = this.A02;
        boolean z = this.A03;
        C346927vz r10 = r22;
        if (r10 == C346927vz.GRANTED) {
            str = AnonymousClass000.A00(2615);
        } else {
            str = "app_permission_deny";
        }
        if (C61970qY.A0E(uZq.requireContext())) {
            num = AnonymousClass05K.A00;
        } else {
            num = AnonymousClass05K.A01;
        }
        AnonymousClass4O6 r13 = uZq.A0A;
        if (r13 != null) {
            AnonymousClass0eM r11 = uZq.A0m;
            Long A002 = AnonymousClass4O7.A00(AnonymousClass7TE.A0l(r11));
            List A1I = AnonymousClass7TE.A1I(AnonymousClass4O8.UNKNOWN);
            AnonymousClass9JF r14 = new AnonymousClass9JF(AnonymousClass4O9.LOCATION_FOREGROUND, AnonymousClass4OA.LOCATION_PRECISE, 4);
            r14.A00(num);
            r13.A00(r14, A002, str, "SEARCH_NEARBY", (String) null, A1I);
            int ordinal = r10.ordinal();
            if (ordinal == 0) {
                uZq.A06().A02().A05(oMy.A00().A02, str2);
                return;
            } else if (ordinal == 1) {
                return;
            } else {
                if (ordinal != 2) {
                    throw new RuntimeException();
                } else if (!z) {
                    1Wr r2 = 1Wr.A00;
                    if (r2 == null || !r2.shouldUseNewNativeReconsiderDialog(AnonymousClass7TE.A0l(r11))) {
                        String A0n = C51972G9s.A0n();
                        C16127UpE upE = new C16127UpE(A0n, uZq, 1);
                        AnonymousClass4O7 r3 = VK6.A00;
                        AnonymousClass4O6 r23 = uZq.A0A;
                        if (r23 != null) {
                            r3.A03(AnonymousClass7TE.A0l(r11), r23, "SEARCH_NEARBY", A0n);
                            W38.A04(uZq.requireActivity(), (Drawable) null, upE, (Integer) null, (Integer) null, (Integer) null, (Integer) null, 2131965506, false, false);
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
        }
        0qQ.A0F("devicePermissionKitLogger");
        throw AnonymousClass00P.createAndThrow();
    }

    public final boolean Eso() {
        return true;
    }

    public C19427WYw(C70826OMy oMy, C15286UZq uZq, String str, boolean z) {
        this.A01 = uZq;
        this.A00 = oMy;
        this.A02 = str;
        this.A03 = z;
    }
}
