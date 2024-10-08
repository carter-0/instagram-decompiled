package X;

import android.content.Context;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import com.instagram.api.schemas.OriginalAudioPartMetadataIntf;
import com.instagram.api.schemas.OriginalAudioSubtype;
import com.instagram.common.session.UserSession;

/* renamed from: X.JdR  reason: case insensitive filesystem */
public final class C60018JdR extends ClickableSpan {
    public final int A00;
    public final Object A01;
    public final Object A02;
    public final Object A03;

    public C60018JdR(int i, Object obj, Object obj2, Object obj3) {
        this.A00 = i;
        this.A02 = obj;
        this.A03 = obj2;
        this.A01 = obj3;
    }

    public final void onClick(View view) {
        switch (this.A00) {
            case 0:
                SUL A0J = Dba.A0J((Context) this.A02, (UserSession) this.A03, 2EG.A0b, C273654mx.A00(14));
                A0J.A0S = "ViolationAlertFragment";
                A0J.A0A();
                return;
            case 1:
                C359448cq.A03((C59725JVj) this.A01, (C359448cq) this.A03, (Boolean) null, AnonymousClass000.A00(16));
                ((LOZ) this.A02).A01();
                return;
            case 2:
                C359448cq r6 = (C359448cq) this.A03;
                C359448cq.A03((C59725JVj) this.A01, r6, (Boolean) this.A02, 182.A04(0Tu.A05, r6.A05, 36878659377758405L));
                return;
            case 3:
                ((C67745Mty) this.A03).A03.A00.FIA(new C61248Jzg((C255773uh) this.A01, AnonymousClass05K.A00));
                return;
            default:
                ((C56157Htl) this.A03).A03((OriginalAudioPartMetadataIntf) this.A01, (OriginalAudioSubtype) this.A02, 1, false);
                return;
        }
    }

    public final void updateDrawState(TextPaint textPaint) {
        switch (this.A00) {
            case 0:
                DbW.A0u(textPaint);
                Context context = (Context) this.A01;
                AnonymousClass7TE.A1N(context, textPaint, 2Yu.A06(context));
                return;
            case 2:
            case 4:
                DbW.A0u(textPaint);
                return;
            case 3:
                0qQ.A0B(textPaint, 0);
                boolean z = false;
                textPaint.setUnderlineText(false);
                textPaint.setColor(-1);
                if (((1Ns) this.A02).CAm() == AnonymousClass05K.A1F) {
                    z = true;
                }
                textPaint.setFakeBoldText(z);
                return;
            default:
                super.updateDrawState(textPaint);
                return;
        }
    }
}
