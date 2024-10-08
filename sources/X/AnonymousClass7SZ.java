package X;

import android.content.Context;
import android.os.Bundle;
import com.instagram.common.session.UserSession;
import com.instagram.modal.ModalActivity;
import com.instagram.model.direct.DirectThreadKey;
import com.instagram.model.direct.threadkey.impl.MsysThreadId;
import java.util.Map;

/* renamed from: X.7SZ  reason: invalid class name */
public final class AnonymousClass7SZ {
    public final /* synthetic */ AnonymousClass9H7 A00;

    public final void A01(C391629tO r16, String str, String str2, boolean z) {
        AnonymousClass9H7 r1 = this.A00;
        UserSession userSession = r1.A10;
        AnonymousClass4DU r7 = r1.A1Q;
        0qQ.A0B(r7, 6);
        C391629tO r5 = r16;
        C3265677h.A05(r5, (C391549tG) null, r7, userSession, A00(this), AnonymousClass9H7.A07(r1), 2, r1.A0b instanceof MsysThreadId, z);
        int ordinal = r5.ordinal();
        if (ordinal == 37) {
            Bundle bundle = new Bundle();
            bundle.putString("education_notice_safety_intervention_id_arg", str);
            bundle.putString("education_notice_safety_intervention_payload_arg", str2);
            AnonymousClass6W8 r52 = new AnonymousClass6W8(r1.A0u.requireActivity(), bundle, userSession, ModalActivity.class, "mwb_education_notice");
            r52.A0J = ModalActivity.A07;
            Context context = r1.A02;
            if (context != null) {
                r52.A0C(context);
                return;
            }
        } else if (ordinal == 6) {
            SUL sul = new SUL(r1.A0u.requireActivity(), userSession, 2EG.A2b, "https://help.instagram.com/477434105621119?helpref=page_content", false);
            sul.A0E(userSession.A06);
            sul.A0S = r7.getModuleName();
            sul.A0A();
            return;
        } else if (ordinal == 16) {
            0hq supportFragmentManager = r1.A0u.requireActivity().getSupportFragmentManager();
            0qQ.A07(supportFragmentManager);
            supportFragmentManager.A0s(new C71496Oll(supportFragmentManager, this));
            Context context2 = r1.A02;
            if (context2 != null) {
                Context applicationContext = context2.getApplicationContext();
                C360678ey A02 = C359988do.A02((AnonymousClass1O9) null, userSession, "com.instagram.branded_content.onboarding.creator.onboarding_handler", (Map) null);
                A02.A00(new C68500NKt(applicationContext, r1));
                1ES.A03(A02);
                return;
            }
        } else {
            return;
        }
        0qQ.A0F("context");
        throw AnonymousClass00P.createAndThrow();
    }

    public AnonymousClass7SZ(AnonymousClass9H7 r1) {
        this.A00 = r1;
    }

    public static final String A00(AnonymousClass7SZ r1) {
        AnonymousClass3U9 A05 = AnonymousClass9H7.A05(r1.A00);
        if (A05 == null || A05.CUG() || A05.BRV().isEmpty()) {
            return null;
        }
        return (String) A05.BRV().get(0);
    }

    public final void A02(C391629tO r14, boolean z) {
        C67101MiL nbt;
        AnonymousClass9H7 r3 = this.A00;
        UserSession userSession = r3.A10;
        AnonymousClass4DU r6 = r3.A1Q;
        0qQ.A0B(r6, 6);
        C3265677h.A05(r14, (C391549tG) null, r6, userSession, A00(this), AnonymousClass9H7.A07(r3), 3, r3.A0b instanceof MsysThreadId, z);
        C254743sy r2 = r3.A0b;
        if (r2 != null) {
            boolean z2 = r2 instanceof DirectThreadKey;
            AnonymousClass4DH r0 = r3.A0u;
            if (z2) {
                nbt = C395319zZ.A00(r0.requireActivity(), userSession);
            } else {
                nbt = new C68966Nbt(r0.requireActivity(), userSession);
            }
            nbt.A03(r2, AnonymousClass05K.A08);
        }
    }
}
