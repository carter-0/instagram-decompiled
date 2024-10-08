package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.instagram.api.schemas.Entity;
import com.instagram.api.schemas.LinkAction;
import com.instagram.api.schemas.RangeIntf;
import com.instagram.bloks.hosting.IgBloksScreenConfig;
import com.instagram.common.session.UserSession;
import com.instagram.common.textwithentities.model.TextWithEntitiesIntf;
import java.util.BitSet;
import java.util.HashMap;

/* renamed from: X.DjJ  reason: case insensitive filesystem */
public final class C46690DjJ extends ClickableSpan {
    public final int A00;
    public final int A01;
    public final Object A02;
    public final Object A03;

    public C46690DjJ(int i, int i2, Object obj, Object obj2) {
        this.A00 = i2;
        this.A03 = obj2;
        this.A02 = obj;
        this.A01 = i;
    }

    /* JADX WARNING: type inference failed for: r1v4, types: [X.ELT, X.FBc] */
    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                Entity B1q = ((RangeIntf) this.A03).B1q();
                B1q.getClass();
                String url = B1q.getUrl();
                E6Y e6y = ((C49428EvU) this.A02).A00;
                Context requireContext = e6y.requireContext();
                UserSession userSession = e6y.A00;
                0qQ.A0B(userSession, 1);
                C49960FGs.A07(requireContext, userSession, url, (String) null);
                return;
            case 1:
                C17272VOz vOz = (C17272VOz) this.A02;
                LinkAction BMj = ((TextWithEntitiesIntf) this.A03).BMj();
                if (BMj != null && BMj.ordinal() == 1) {
                    UDJ udj = vOz.A00;
                    Context context = udj.A00;
                    HashMap A1E = AnonymousClass7TE.A1E();
                    HashMap A1E2 = AnonymousClass7TE.A1E();
                    HashMap A1E3 = AnonymousClass7TE.A1E();
                    new BitSet(0);
                    IgBloksScreenConfig A0N = DbS.A0N(udj.A02);
                    A0N.A0R = "com.bloks.www.ig.shopping.product_tagging_feedback.bottomsheet";
                    C46649DiU A05 = C46649DiU.A05("com.bloks.www.ig.shopping.product_tagging_feedback.bottomsheet", A1E, A1E2);
                    A05.A03 = null;
                    A05.A02 = null;
                    A05.A04 = null;
                    A05.A0H(A1E3);
                    A05.A0E(context, A0N);
                    return;
                }
                return;
            case 2:
                UserSession userSession2 = (UserSession) this.A03;
                Fragment fragment = (Fragment) this.A02;
                FGS.A02(C48144EZm.EDIT_USERNAME, userSession2, "reminder_manage_settings");
                AnonymousClass1ZD r2 = AnonymousClass1ZD.A02;
                if (r2 != null) {
                    0qQ.A0B(userSession2, 0);
                    ? fBc = new C49878FBc(fragment, (0lg) userSession2);
                    fBc.A00 = 0;
                    r2.A00 = fBc;
                    fBc.A04("USERNAME_SETTINGS");
                    return;
                }
                DbS.A15();
                throw AnonymousClass00P.createAndThrow();
            case 3:
                F5v.A01((Fragment) this.A02, (UserSession) this.A03, AnonymousClass05K.A0Y);
                return;
            default:
                super.onClick(view);
                return;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        boolean z;
        switch (this.A00) {
            case 0:
                textPaint.setUnderlineText(false);
                z = true;
                break;
            case 1:
                z = false;
                textPaint.setUnderlineText(false);
                break;
            case 2:
            case 3:
                super.updateDrawState(textPaint);
                textPaint.setUnderlineText(false);
                break;
            default:
                super.updateDrawState(textPaint);
                return;
        }
        textPaint.setFakeBoldText(z);
        textPaint.setColor(this.A01);
    }
}
