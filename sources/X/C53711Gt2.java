package X;

import android.content.Context;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import com.instagram.android.R;
import com.instagram.api.schemas.AudioFilterType;
import com.instagram.common.session.UserSession;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.Gt2  reason: case insensitive filesystem */
public final class C53711Gt2 extends C251343mx {
    public final AudioFilterType A00;
    public final C55553HjZ A01;
    public final UserSession A02;

    public final C251263mp A0X(AnonymousClass3Y5 r24) {
        C247373gE A0P;
        AnonymousClass3Y5 r8 = r24;
        0qQ.A0B(r8, 0);
        2Wa A002 = C243643Zq.A00(r8, new C58679Ivo(this, 29));
        AudioFilterType[] values = AudioFilterType.values();
        ArrayList A1C = AnonymousClass7TE.A1C();
        for (AudioFilterType audioFilterType : values) {
            if ((audioFilterType != AudioFilterType.VINYL && audioFilterType != AudioFilterType.SWIRL) || AnonymousClass8IK.A03(this.A02)) {
                A1C.add(audioFilterType);
            }
        }
        ArrayList A0U = 00k.A0U(A1C);
        AudioFilterType audioFilterType2 = this.A00;
        AudioFilterType audioFilterType3 = AudioFilterType.UNRECOGNIZED;
        List A1P = 0sr.A1P(new AudioFilterType[]{audioFilterType3, AudioFilterType.SPED_UP, AudioFilterType.SLOWED});
        A0U.removeAll(A1P);
        A0U.addAll(0, A1P);
        if (audioFilterType2 != null) {
            A0U.remove(audioFilterType2);
            A0U.add(0, audioFilterType2);
            A0U.remove(audioFilterType3);
            A0U.add(0, audioFilterType3);
        }
        2V1 r10 = r8.A05;
        C53614GrT grT = new C53614GrT(r10, new C54001Gxj());
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A003 = AnonymousClass9JR.A00(C51973G9u.A0Q((2WX) null, C51965G9l.A0c(AnonymousClass05K.A04, 0, C244013aV.A03(r8)), 0, C244013aV.A0A(r8)), AnonymousClass05K.A0G, 0, C244013aV.A0C(r8, R.dimen.abc_edit_text_inset_top_material));
        2Wb A0S = AnonymousClass7TG.A0S(r10);
        Iterator it = A0U.iterator();
        while (it.hasNext()) {
            AudioFilterType audioFilterType4 = (AudioFilterType) it.next();
            2WX A004 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A0D, 0, C244013aV.A0A(A0S));
            long A0C = C244013aV.A0C(A0S, R.dimen.abc_edit_text_inset_top_material);
            Integer num = AnonymousClass05K.A06;
            2WX A005 = AnonymousClass9JR.A00(A004, num, 0, A0C);
            Drawable A0D = C244013aV.A0D(A0S, R.drawable.audio_page_audio_filters_pill_selector);
            Integer num2 = AnonymousClass05K.A00;
            2WX A0Y = C51971G9r.A0Y(A005, num2, A0D, 4);
            Object obj = A002.A03;
            2WX A0V = C51972G9s.A0V(C51973G9u.A0Y(A0Y, num, AnonymousClass7TF.A1W(obj, audioFilterType4)), new C59104J6m(45, (Object) A002, (Object) audioFilterType4, (Object) this));
            2Wb A0w = G9t.A0w(A0S);
            int i = R.drawable.instagram_music_effects_pano_filled_24;
            if (audioFilterType4 == audioFilterType3) {
                i = R.drawable.instagram_circle_x_pano_filled_24;
            }
            2V1 r15 = A0w.A00;
            Context A0B = C51965G9l.A0B(r15);
            int i2 = R.attr.igds_color_primary_icon;
            if (obj == audioFilterType4) {
                i2 = R.attr.igds_color_icon_on_white;
            }
            Drawable A012 = AnonymousClass4Ed.A01(A0B, i, 2Yu.A0H(A0B, i2));
            if (A012 == null) {
                A0P = null;
            } else {
                A0P = C51974G9v.A0P(A012, r15, C51974G9v.A0K(C51972G9s.A0T(C51973G9u.A0V((2WX) null, A0w, num2, 0), 0, C244013aV.A06(A0w)), C51967G9n.A0T(0, C244013aV.A05(A0w)), num2));
            }
            A0w.A00(A0P);
            String A0E = C244013aV.A0E(A0w, C263304Kd.A00(audioFilterType4));
            long A04 = C244013aV.A04(A0w);
            int i3 = R.attr.igds_color_primary_text;
            if (obj == audioFilterType4) {
                i3 = R.attr.igds_color_text_on_white;
            }
            int A08 = C51968G9o.A08(A0B, A0w, i3);
            Typeface typeface = Typeface.DEFAULT;
            long A0D2 = C51969G9p.A0D();
            C244103ae A0b = C51971G9r.A0b(r15, (2V5) null, A0E, 0);
            C51973G9u.A17(A0w, A0b, A08, A04);
            A0b.A0R(1);
            G9w.A12(typeface, A0w, A0b, A0D2);
            A0b.A0B();
            C51974G9v.A1A(A0b, num2, false, true);
            C51971G9r.A1C(A0b.A0A(), A0w, A0S, A0V);
        }
        2Tp A0B2 = C243563Zg.A0B(A0S, r8, A003);
        C54001Gxj gxj = grT.A01;
        gxj.A01 = A0B2.A0E();
        BitSet bitSet = grT.A02;
        bitSet.set(0);
        gxj.A04 = false;
        gxj.A02 = false;
        gxj.A03 = false;
        gxj.A00 = 0;
        C244113af.A00(bitSet, grT.A03, 1);
        grT.A02();
        return gxj;
    }

    public C53711Gt2(AudioFilterType audioFilterType, UserSession userSession, C55553HjZ hjZ) {
        this.A01 = hjZ;
        this.A00 = audioFilterType;
        this.A02 = userSession;
    }
}
