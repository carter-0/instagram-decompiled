package X;

import com.instagram.settings2.core.model.EqualsValue;
import com.instagram.settings2.core.model.FbtLiteralValue;
import com.instagram.settings2.core.model.FbtTextTokenValue;
import com.instagram.settings2.core.model.FbtWithTokensValue;
import com.instagram.settings2.core.model.IfValue;
import com.instagram.settings2.core.model.ModalActionValue$Navigate;
import com.instagram.settings2.core.model.ModalButtonValue;
import com.instagram.settings2.core.model.ModalValue;
import com.instagram.settings2.core.model.ServerValue;
import java.util.HashMap;
import java.util.List;

public final class MLZ extends 0Yg implements C62320sa {
    public static final MLZ A00 = new MLZ();

    public MLZ() {
        super(0);
    }

    public final /* bridge */ /* synthetic */ Object invoke() {
        Class<String> cls = String.class;
        FbtLiteralValue fbtLiteralValue = new FbtLiteralValue(new ServerValue("supervised_modal_title", DbS.A0z(cls)));
        List A02 = C64185LSs.A02(new KY2(new C61083JwL((MR0) new C61237JzV(2131974765))), true);
        0eP A1L = AnonymousClass7TE.A1L("nido_supervised2", new ModalValue(fbtLiteralValue, new ModalButtonValue(C61083JwL.A02(2131974770), KYV.A00), (C64185LSs) null, C61083JwL.A02(2131963104), A02));
        FbtLiteralValue fbtLiteralValue2 = new FbtLiteralValue(new ServerValue("cooldown_supervision_modal_title", DbS.A0z(cls)));
        List A022 = C64185LSs.A02(new FbtLiteralValue(new ServerValue("cooldown_supervision_modal_body", DbS.A0z(cls))), true);
        0eP A1L2 = AnonymousClass7TE.A1L("nido_in_supervision_cooldown2", new ModalValue(fbtLiteralValue2, new ModalButtonValue(C61083JwL.A02(2131974770), KYU.A00), (C64185LSs) null, C61083JwL.A02(2131963104), A022));
        FbtLiteralValue fbtLiteralValue3 = new FbtLiteralValue(new ServerValue("blocked_supervisor_modal_title", DbS.A0z(cls)));
        FbtLiteralValue fbtLiteralValue4 = fbtLiteralValue3;
        0eP A1L3 = AnonymousClass7TE.A1L("nido_blocking_supervisor2", new ModalValue(fbtLiteralValue4, (C64185LSs) null, (C64185LSs) null, C61083JwL.A02(2131968772), C64185LSs.A02(new FbtLiteralValue(new ServerValue("blocked_supervisor_modal_body", DbS.A0z(cls))), true)));
        KY2 A023 = C61083JwL.A02(2131968367);
        List A024 = C64185LSs.A02(C61083JwL.A02(2131968366), true);
        0eP A1L4 = AnonymousClass7TE.A1L("nido_unsupervised2", new ModalValue(A023, new ModalButtonValue(C61083JwL.A02(2131952329), new ModalActionValue$Navigate(new KY2(new C47267Dtv(C61083JwL.A01("Supervision"), (C21241XQm) null, "com.bloks.www.yp.supervision_onboarding", DbY.A0m("entrypoint", "guardian_pairing_upsell"), true, true)))), (C64185LSs) null, C61083JwL.A02(2131974766), A024));
        KY2 A025 = C61083JwL.A02(2131968375);
        ServerValue serverValue = new ServerValue("supervision_guardian_username", DbS.A0z(cls));
        List A026 = C64185LSs.A02(new FbtWithTokensValue(2131968374, AnonymousClass7TE.A1I(new FbtTextTokenValue(new IfValue(new EqualsValue(serverValue, new KY2("")), C61083JwL.A02(2131968372), new FbtLiteralValue(serverValue)), "parent"))), true);
        String str = "com.bloks.www.yp.supervision_onboarding";
        0eP A1L5 = AnonymousClass7TE.A1L("nido_rsv_only2", new ModalValue(A025, new ModalButtonValue(C61083JwL.A02(2131956706), new ModalActionValue$Navigate(new KY2(new C47267Dtv(C61083JwL.A01("Supervision"), (C21241XQm) null, str, (HashMap) null, false, true)))), (C64185LSs) null, C61083JwL.A02(2131974766), A026));
        KY2 A027 = C61083JwL.A02(2131968365);
        List A028 = C64185LSs.A02(C61083JwL.A02(2131976739), true);
        return 0Yt.A06(new 0eP[]{A1L, A1L2, A1L3, A1L4, A1L5, AnonymousClass7TE.A1L("nido_pending_supervision_request2", new ModalValue(A027, new ModalButtonValue(C61083JwL.A02(2131956164), KYT.A00), new ModalButtonValue(C61083JwL.A02(2131969316), new ModalActionValue$Navigate(new KY2(new C47267Dtv(C61083JwL.A01("Supervision"), (C21241XQm) null, str, (HashMap) null, false, true)))), (C64185LSs) null, A028))});
    }
}
