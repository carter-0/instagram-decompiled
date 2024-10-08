package X;

import android.content.Context;
import android.graphics.RectF;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.facebook.common.dextricks.Constants;
import com.instagram.common.session.UserSession;
import com.instagram.model.direct.DirectShareTarget;
import com.instagram.pendingmedia.model.recipients.PendingRecipient;
import java.util.Iterator;
import java.util.List;

public final class P0I implements G9Z {
    public final /* synthetic */ C70795OLq A00;

    public final boolean CKT() {
        return false;
    }

    public final void Ch4() {
    }

    public final void Cu5(boolean z) {
    }

    public final void CuQ() {
    }

    public final void D4K() {
    }

    public final void D8y(DirectShareTarget directShareTarget) {
    }

    public final void D90(DirectShareTarget directShareTarget) {
    }

    public final void D9B() {
    }

    public final void D9C() {
    }

    public final void DAE() {
    }

    public final void DLb() {
    }

    public final void DU3() {
    }

    public final void DWu(C53374Gn4 gn4) {
    }

    public final void DWv() {
    }

    public final void Dbm(DirectShareTarget directShareTarget) {
    }

    public final void Dbq(DirectShareTarget directShareTarget, List list, int i, int i2, int i3, boolean z) {
    }

    public final void Df4(RectF rectF, int i) {
    }

    public final void Dj5(DirectShareTarget directShareTarget, int i, int i2, int i3) {
        long j;
        boolean z;
        Long A10;
        C70795OLq oLq = this.A00;
        ((2Rw) oLq.A08.getValue()).notifyDataSetChanged();
        if (182.A06(0Tu.A05, oLq.A04, 36311904083247919L)) {
            PendingRecipient pendingRecipient = (PendingRecipient) 00k.A0J(DbW.A0m(directShareTarget));
            C71865Os7 os7 = oLq.A05;
            String str = oLq.A02;
            long j2 = (long) i3;
            if (pendingRecipient == null || (A10 = AnonymousClass7TE.A10(pendingRecipient.getId())) == null) {
                j = -1;
                if (pendingRecipient == null) {
                    z = false;
                    boolean z2 = oLq.A03;
                    String str2 = oLq.A01;
                    0qQ.A0B(str, 0);
                    0Aj A0e = AnonymousClass7TE.A0e(os7.A01, "instagram_rtc_call_recipients_click");
                    A0e.AAJ("creation_session_id", str);
                    A0e.A9F("absolute_position", Long.valueOf(j2));
                    A0e.A9F("target_id", Long.valueOf(j));
                    A0e.A7p("is_fb_friend", Boolean.valueOf(z));
                    A0e.A7p("is_search", Boolean.valueOf(z2));
                    A0e.AAJ("section_type", "SUGGESTED");
                    A0e.AAJ("mnet_request_id", str2);
                    A0e.Cgf();
                }
            } else {
                j = A10.longValue();
            }
            z = pendingRecipient.A0N;
            boolean z22 = oLq.A03;
            String str22 = oLq.A01;
            0qQ.A0B(str, 0);
            0Aj A0e2 = AnonymousClass7TE.A0e(os7.A01, "instagram_rtc_call_recipients_click");
            A0e2.AAJ("creation_session_id", str);
            A0e2.A9F("absolute_position", Long.valueOf(j2));
            A0e2.A9F("target_id", Long.valueOf(j));
            A0e2.A7p("is_fb_friend", Boolean.valueOf(z));
            A0e2.A7p("is_search", Boolean.valueOf(z22));
            A0e2.AAJ("section_type", "SUGGESTED");
            A0e2.AAJ("mnet_request_id", str22);
            A0e2.Cgf();
        }
    }

    public final void Dk3() {
    }

    public final void Dk8() {
    }

    public final void Dnk(C47040Dpa dpa) {
    }

    public final void Dnl(AnonymousClass3N3 r1) {
    }

    public final boolean Es3(UserSession userSession, DirectShareTarget directShareTarget) {
        if (!directShareTarget.A0L() || directShareTarget.A0Q.size() != 1) {
            return false;
        }
        return !((PendingRecipient) directShareTarget.A0Q.get(0)).A0R;
    }

    public P0I(C70795OLq oLq) {
        this.A00 = oLq;
    }

    public final void Dbn(ExU exU, DirectShareTarget directShareTarget, float f) {
        long j;
        boolean z;
        Long A10;
        C70795OLq oLq = this.A00;
        if (182.A06(0Tu.A05, oLq.A04, 36311904083247919L)) {
            PendingRecipient pendingRecipient = (PendingRecipient) 00k.A0J(DbW.A0m(directShareTarget));
            if (!oLq.A03) {
                C71865Os7 os7 = oLq.A05;
                String str = oLq.A02;
                long j2 = (long) exU.A00;
                if (pendingRecipient == null || (A10 = AnonymousClass7TE.A10(pendingRecipient.getId())) == null) {
                    j = -1;
                    if (pendingRecipient == null) {
                        z = false;
                        boolean z2 = oLq.A03;
                        String str2 = oLq.A01;
                        0qQ.A0B(str, 0);
                        1Ln r3 = new 1Ln(AnonymousClass7TE.A0e(os7.A01, "instagram_rtc_call_recipients_impression"), 311);
                        r3.A0R("creation_session_id", str);
                        r3.A0Q("absolute_position", Long.valueOf(j2));
                        Long valueOf = Long.valueOf(j);
                        r3.A0Q("target_id", valueOf);
                        r3.A0O("is_fb_friend", Boolean.valueOf(z));
                        r3.A0O("is_search", Boolean.valueOf(z2));
                        r3.A0R("section_type", "SUGGESTED");
                        r3.A0R("mnet_request_id", str2);
                        os7.A00.put(valueOf, r3);
                    }
                } else {
                    j = A10.longValue();
                }
                z = pendingRecipient.A0N;
                boolean z22 = oLq.A03;
                String str22 = oLq.A01;
                0qQ.A0B(str, 0);
                1Ln r32 = new 1Ln(AnonymousClass7TE.A0e(os7.A01, "instagram_rtc_call_recipients_impression"), 311);
                r32.A0R("creation_session_id", str);
                r32.A0Q("absolute_position", Long.valueOf(j2));
                Long valueOf2 = Long.valueOf(j);
                r32.A0Q("target_id", valueOf2);
                r32.A0O("is_fb_friend", Boolean.valueOf(z));
                r32.A0O("is_search", Boolean.valueOf(z22));
                r32.A0R("section_type", "SUGGESTED");
                r32.A0R("mnet_request_id", str22);
                os7.A00.put(valueOf2, r32);
            }
        }
    }

    public final void Dhj() {
        C70524O9x o9x = this.A00.A06.A00.A00;
        if (o9x != null) {
            o9x.A00.A03.A03(C72826PLo.A00);
        } else {
            0qQ.A0F("candidatesListener");
            throw AnonymousClass00P.createAndThrow();
        }
    }

    public final void Dhv(CharSequence charSequence) {
        C70795OLq oLq = this.A00;
        C70524O9x o9x = oLq.A06.A00.A00;
        if (o9x != null) {
            o9x.A00.A03.A03(new C72815PLd(charSequence));
            boolean z = true;
            if (charSequence.length() == 0) {
                z = false;
            }
            oLq.A03 = z;
            return;
        }
        0qQ.A0F("candidatesListener");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void Dhz() {
        Context context = this.A00.A06.A00.A02;
        if (2eO.A01(context, true)) {
            AccessibilityEvent obtain = AccessibilityEvent.obtain();
            obtain.setEventType(Constants.LOAD_RESULT_DEX2OAT_CLASSPATH_SET);
            obtain.setClassName(C66581MXm.A0y(obtain));
            obtain.setPackageName(context.getPackageName());
            obtain.getText().add(context.getString(2131954478));
            Object systemService = context.getSystemService("accessibility");
            0qQ.A0C(systemService, AnonymousClass000.A00(327));
            ((AccessibilityManager) systemService).sendAccessibilityEvent(obtain);
        }
    }

    public final void Dk2(DirectShareTarget directShareTarget, String str, int i, int i2, int i3, boolean z, boolean z2) {
        Integer num;
        N9X n9x;
        C70524O9x o9x = this.A00.A06.A00.A00;
        if (o9x != null) {
            0xE r3 = new 0xE();
            Iterator it = directShareTarget.A0B().iterator();
            while (it.hasNext()) {
                r3.A04(AnonymousClass7TE.A18(it));
            }
            C69087NeR neR = o9x.A00;
            N95 n95 = neR.A00;
            if (n95 == null || (num = n95.A00) == null) {
                num = AnonymousClass05K.A00;
            }
            if (num == AnonymousClass05K.A00) {
                neR.A02.A00(new C72783PJx(r3));
                neR.A03.A03(new PLV(directShareTarget));
            }
            N9X n9x2 = (N9X) neR.A01;
            if (n9x2 != null) {
                boolean z3 = n9x2.A06;
                List list = n9x2.A02;
                String str2 = n9x2.A01;
                boolean z4 = n9x2.A08;
                boolean z5 = n9x2.A05;
                boolean z6 = n9x2.A03;
                boolean z7 = n9x2.A09;
                Integer num2 = n9x2.A00;
                boolean z8 = n9x2.A07;
                AnonymousClass7TG.A1Q(list, str2);
                0qQ.A0B(num2, 8);
                n9x = new N9X(num2, str2, list, z3, true, z4, z5, z6, z7, z8);
            } else {
                n9x = null;
            }
            neR.A0J(n9x);
            return;
        }
        0qQ.A0F("candidatesListener");
        throw AnonymousClass00P.createAndThrow();
    }

    public final void DuX(DirectShareTarget directShareTarget, int i) {
        ((2Rw) this.A00.A08.getValue()).notifyDataSetChanged();
    }
}
