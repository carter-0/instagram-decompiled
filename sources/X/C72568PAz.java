package X;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.instagram.android.R;

/* renamed from: X.PAz  reason: case insensitive filesystem */
public final class C72568PAz implements AnonymousClass7D2 {
    public final AnonymousClass7XR A00;
    public final AnonymousClass9HC A01;
    public final AnonymousClass768 A02;

    /* renamed from: A01 */
    public final void FIP(C68075Mzg mzg) {
        AnonymousClass7NT BeR = ((C332857Wq) this.A00).BeR();
        if (BeR != null) {
            ViewGroup viewGroup = mzg.A00;
            if (viewGroup.getTag() != null) {
                BeR.A01(viewGroup.getTag().toString());
            }
        }
        this.A02.FIP(mzg.A03);
    }

    /* renamed from: A02 */
    public final void ADp(C68075Mzg mzg, NYG nyg) {
        AnonymousClass5FV r15;
        AnonymousClass763 r14;
        C68075Mzg mzg2 = mzg;
        AnonymousClass76M r1 = mzg2.A03;
        AnonymousClass768 r0 = this.A02;
        AnonymousClass79c r4 = nyg.A00;
        r0.ADp(r1, r4);
        AnonymousClass7NT BeR = ((C332857Wq) this.A00).BeR();
        if (BeR == null) {
            r15 = AnonymousClass5FV.None;
        } else {
            r15 = r4.A00;
        }
        TextView textView = r1.A03;
        C331277Qg A0F = C66581MXm.A0F(textView.getBackground());
        String CBF = r4.CBF();
        if (BeR != null && !0mp.A0E(r4.A04.toString())) {
            if (AnonymousClass7TF.A1Z(this.A01.A0S)) {
                textView.setMinimumWidth((int) 0nA.A00(DbS.A07(mzg2), 96.0f));
            }
            BeR.A00.A00 = (float) C3265577g.A00(r4.A03);
            ViewGroup viewGroup = mzg2.A00;
            viewGroup.setTag(CBF);
            ViewGroup viewGroup2 = mzg2.A02;
            Context context = viewGroup2.getContext();
            ViewGroup viewGroup3 = mzg2.A01;
            boolean CU2 = r4.CU2();
            boolean z = r4.A0D;
            ShapeDrawable shapeDrawable = null;
            if (A0F != null) {
                r14 = A0F.A04;
                shapeDrawable = A0F.A01;
            } else {
                r14 = null;
            }
            BeR.A00(context, shapeDrawable, viewGroup2, viewGroup, viewGroup3, (ImageView) null, r14, r15, CBF, CU2, z);
        }
    }

    public C72568PAz(AnonymousClass7XR r1, AnonymousClass9HC r2, AnonymousClass768 r3) {
        this.A02 = r3;
        this.A00 = r1;
        this.A01 = r2;
    }

    /* renamed from: A00 */
    public final C68075Mzg ANK(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.direct_powerup_text_message, viewGroup, false);
        TextView textView = (TextView) JTP.A0H(DbU.A0D(viewGroup2, R.id.direct_text_message_text_view_stub), R.layout.direct_text_message_text_view);
        C66580MXl.A1F(textView, textView.getContext());
        ViewGroup A0C = DbU.A0C(viewGroup2, R.id.powerups_background_decoration);
        ViewGroup A0C2 = DbU.A0C(viewGroup2, R.id.powerups_foreground_decoration);
        AnonymousClass76M r1 = new AnonymousClass76M(textView);
        this.A02.A03.A00(r1);
        return new C68075Mzg(viewGroup2, A0C, A0C2, r1);
    }
}
