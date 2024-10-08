package X;

import android.content.Context;
import android.graphics.PointF;
import android.graphics.Shader;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.instagram.common.typedurl.ImageUrl;
import com.instagram.direct.model.messaginguser.MessagingUser;
import com.instagram.model.direct.messageid.MessageIdentifier;
import java.util.Collections;

public final class NQK extends C232232tF implements C333107Xr, AnonymousClass7VW, C332857Wq, C332927Wz, AnonymousClass7X4, AnonymousClass7X9, AnonymousClass7VM, AnonymousClass7XA, AnonymousClass7XI, AnonymousClass7XN, AnonymousClass7XR, AnonymousClass7XS, AnonymousClass7XU, AnonymousClass7XV, AnonymousClass7XX, C333007Xh, C333147Xv, AnonymousClass7Y4, AnonymousClass7Y7 {
    public C70435O6m A00;
    public AnonymousClass9HC A01;
    public C72568PAz A02;
    public AnonymousClass7NT A03 = new AnonymousClass7NT();
    public final AnonymousClass7I8 A04;

    public final 1Av CCu() {
        return null;
    }

    public final boolean CPk() {
        return false;
    }

    public final void CfT(ImageUrl imageUrl, MessagingUser messagingUser) {
    }

    public final void CpH(String str) {
    }

    public final void CpY(String str) {
    }

    public final boolean Cpc(String str) {
        return false;
    }

    public final void Cpk() {
    }

    public final void Cpn(String str) {
    }

    public final void Cq2(View view, MessagingUser messagingUser) {
    }

    public final void Cq5(String str) {
    }

    public final void Cq6(View view, String str, boolean z) {
    }

    public final void CqM(MessagingUser messagingUser, String str) {
    }

    public final void Cql(String str, boolean z, String str2) {
    }

    public final void Cqo(String str, String str2, String str3) {
    }

    public final void CwE() {
    }

    public final void DI5() {
    }

    public final void DRe(2FW r1, MessageIdentifier messageIdentifier, String str, String str2, String str3, long j, boolean z) {
    }

    public final void Dr3(String str) {
    }

    public final void EuG(MessageIdentifier messageIdentifier, C273414mX r2, String str, String str2, String str3, String str4, String str5) {
    }

    public final void EuX(MessageIdentifier messageIdentifier) {
    }

    public final void Eum(PointF pointF, AnonymousClass7FU r2, AnonymousClass7FR r3, long j, boolean z, boolean z2) {
    }

    public final void Eur(AnonymousClass7FU r1, C69347Njm njm, MessageIdentifier messageIdentifier) {
    }

    public final void Eus(AnonymousClass7LQ r1, C69347Njm njm) {
    }

    public final boolean isResumed() {
        return false;
    }

    public final AnonymousClass7NT BeR() {
        return this.A03;
    }

    public final /* bridge */ /* synthetic */ void bind(C232262tL r6, C249703kE r7) {
        int i;
        NYG nyg = (NYG) r6;
        C68075Mzg mzg = (C68075Mzg) r7;
        this.A02.ADp(mzg, nyg);
        AnonymousClass76M r4 = mzg.A03;
        C331277Qg A0F = C66581MXm.A0F(r4.A02);
        if (A0F != null) {
            Shader shader = A0F.A01.getPaint().getShader();
            if (shader instanceof AnonymousClass7OE) {
                ((AnonymousClass7OE) shader).Eov(this.A04.A00());
            }
        }
        ViewGroup viewGroup = mzg.A02;
        C71408Ok7.A00(viewGroup, 38, nyg, this);
        C70038NwG nwG = C70038NwG.$redex_init_class;
        int ordinal = nyg.A00.A00.ordinal();
        if (ordinal == 1) {
            i = 2131960028;
        } else if (ordinal == 2) {
            i = 2131960027;
        } else if (ordinal != 3) {
            if (ordinal == 4) {
                i = 2131960026;
            }
            03v.A0B(viewGroup, new U7M(this, 6));
        } else {
            i = 2131960025;
        }
        DbU.A12(viewGroup.getContext(), viewGroup, i);
        r4.A03.setImportantForAccessibility(2);
        03v.A0B(viewGroup, new U7M(this, 6));
    }

    public final /* bridge */ /* synthetic */ C249703kE createViewHolder(ViewGroup viewGroup, LayoutInflater layoutInflater) {
        C68075Mzg A002 = this.A02.ANK(layoutInflater, viewGroup);
        if (!AnonymousClass7TF.A1Z(this.A01.A0S)) {
            return A002;
        }
        Context context = viewGroup.getContext();
        0qQ.A0B(context, 1);
        C67693MsX msX = new C67693MsX(context);
        msX.addView(A002.A02);
        return new C68075Mzg(msX, A002.A00, A002.A01, A002.A03);
    }

    public final Class modelClass() {
        return NYG.class;
    }

    public final /* bridge */ /* synthetic */ void unbind(C249703kE r2) {
        this.A02.FIP((C68075Mzg) r2);
    }

    public NQK(Context context, C70435O6m o6m, AnonymousClass9HC r6) {
        this.A01 = r6;
        this.A02 = new C72568PAz(this, this.A01, new AnonymousClass768(this, r6, Collections.emptyList()));
        this.A00 = o6m;
        this.A04 = new AnonymousClass7I8(context);
    }
}
