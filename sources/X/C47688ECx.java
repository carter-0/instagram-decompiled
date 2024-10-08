package X;

import com.instagram.actionbar.ActionButton;
import com.instagram.igds.components.form.IgFormField;
import java.util.Map;

/* renamed from: X.ECx  reason: case insensitive filesystem */
public final class C47688ECx extends 1P0 {
    public final String A00;
    public final /* synthetic */ C50679Fge A01;

    public C47688ECx(C50679Fge fge, String str) {
        this.A01 = fge;
        this.A00 = str;
    }

    public final void onFail(C268654dm r5) {
        int i;
        int A0D = AnonymousClass7TG.A0D(r5, 332766306);
        C47688ECx.super.onFail(r5);
        C50679Fge fge = this.A01;
        if (fge.A00) {
            i = -846626450;
        } else {
            C47365Dvz dvz = (C47365Dvz) r5.A00();
            if (dvz != null) {
                C50679Fge.A00(fge, dvz, "check_username_response_fail");
            } else {
                E33 e33 = fge.A01;
                AnonymousClass7TH.A0R(e33.A00);
                ActionButton actionButton = e33.A02;
                if (actionButton != null) {
                    actionButton.setEnabled(true);
                }
            }
            i = -213300634;
        }
        AnonymousClass0fD.A0A(i, A0D);
    }

    public final void onFinish() {
        int A03 = AnonymousClass0fD.A03(2011093030);
        C47688ECx.super.onFinish();
        AnonymousClass0fD.A0A(-467291225, A03);
    }

    public final void onStart() {
        int A03 = AnonymousClass0fD.A03(-1716127625);
        C47688ECx.super.onStart();
        AnonymousClass0fD.A0A(1754225763, A03);
    }

    public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        CharSequence charSequence;
        int i;
        int A03 = AnonymousClass0fD.A03(767993984);
        C47365Dvz dvz = (C47365Dvz) obj;
        int A0D = AnonymousClass7TG.A0D(dvz, -645637936);
        C50679Fge fge = this.A01;
        Map map = fge.A02;
        String str = this.A00;
        map.put(str, dvz);
        if (fge.A00) {
            i = 1672155598;
        } else {
            E33 e33 = fge.A01;
            IgFormField igFormField = e33.A03;
            if (igFormField != null) {
                charSequence = igFormField.getText();
            } else {
                charSequence = null;
            }
            if (0qQ.A0K(str, String.valueOf(charSequence))) {
                boolean z = dvz.A02;
                AnonymousClass7TH.A0R(e33.A00);
                ActionButton actionButton = e33.A02;
                if (!z) {
                    if (actionButton != null) {
                        actionButton.setEnabled(false);
                    }
                    C50679Fge.A00(fge, dvz, "not_equal_to_proposed_username");
                } else if (actionButton != null) {
                    actionButton.setEnabled(true);
                }
            }
            i = -110586504;
        }
        AnonymousClass0fD.A0A(i, A0D);
        AnonymousClass0fD.A0A(1228795797, A03);
    }
}
