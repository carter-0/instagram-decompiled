package X;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import com.instagram.android.R;
import com.instagram.api.schemas.MidCardOverlayType;
import org.webrtc.CameraCapturer;

/* renamed from: X.Guc  reason: case insensitive filesystem */
public final class C53809Guc extends C251343mx {
    public final int A00;
    public final int A01;
    public final 2WX A02;
    public final MidCardOverlayType A03;
    public final AnonymousClass0iw A04;
    public final JNC A05;

    public C53809Guc(2WX r2, MidCardOverlayType midCardOverlayType, AnonymousClass0iw r4, JNC jnc, int i, int i2) {
        0qQ.A0B(r4, 1);
        this.A04 = r4;
        this.A05 = jnc;
        this.A02 = r2;
        this.A00 = i;
        this.A01 = i2;
        this.A03 = midCardOverlayType;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r19) {
        String str;
        int i;
        Object[] objArr;
        String str2;
        AnonymousClass3Y5 r17 = r19;
        0qQ.A0B(r17, 0);
        JNC jnc = this.A05;
        if ((jnc instanceof C57666IeV) || !(jnc instanceof C53589Gr4)) {
            return null;
        }
        C243573Zh r16 = C243573Zh.FLEX_START;
        2WX r9 = this.A02;
        2Wb A0Q = C51972G9s.A0Q(r17);
        AnonymousClass0iw r12 = this.A04;
        C53589Gr4 gr4 = (C53589Gr4) jnc;
        JNE jne = gr4.A03;
        AnonymousClass3XV r0 = 2WX.A02;
        A0Q.A00(new C53787GuG(AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1I, 0, C244013aV.A05(A0Q)), r12, jne, this.A00, this.A01));
        2V1 r10 = A0Q.A00;
        Context context = r10.A0C;
        Resources A0A = AnonymousClass7TF.A0A(context);
        MidCardOverlayType midCardOverlayType = this.A03;
        Integer num = gr4.A04;
        int i2 = gr4.A01;
        int i3 = gr4.A02;
        int i4 = gr4.A00;
        int ordinal = midCardOverlayType.ordinal();
        if (ordinal != 11) {
            if (ordinal != 10) {
                if (ordinal == 12) {
                    str = DbY.A0e(A0A, C51972G9s.A0o(A0A, i3), R.plurals.number_of_shares, i3);
                } else if (ordinal != 8) {
                    str = null;
                } else {
                    str = DbY.A0e(A0A, C51972G9s.A0o(A0A, i4), R.plurals.number_of_comments, i4);
                }
            } else if (i2 >= 0) {
                i = R.plurals.number_of_likes;
                objArr = new Object[1];
                str2 = C51972G9s.A0o(A0A, i2);
                objArr[0] = str2;
                str = A0A.getQuantityString(i, i2, objArr);
                0qQ.A0A(str);
            } else {
                throw AnonymousClass7TE.A1B("Cannot format null like count");
            }
        } else if (num == null || (i2 = num.intValue()) < 0) {
            throw AnonymousClass7TE.A1B(AnonymousClass000.A00(420));
        } else if (i2 == 0) {
            str = A0A.getString(2131968411);
            0qQ.A0A(str);
        } else {
            i = R.plurals.number_of_plays;
            objArr = new Object[1];
            str2 = C253673rC.A04(A0A, num, CameraCapturer.OPEN_CAMERA_TIMEOUT, false, false);
            objArr[0] = str2;
            str = A0A.getQuantityString(i, i2, objArr);
            0qQ.A0A(str);
        }
        int A052 = C51968G9o.A05(context, A0Q);
        long A06 = C244013aV.A06(A0Q);
        int A022 = A0Q.Bnf().A02(R.color.black_30_transparent);
        long A0C = C244013aV.A0C(A0Q, R.dimen.audience_lists_text_in_badge_horizontal_margin_right);
        Typeface typeface = Typeface.DEFAULT;
        long A0D = C51969G9p.A0D();
        Integer num2 = AnonymousClass05K.A00;
        C244103ae A0b = C51971G9r.A0b(r10, (2V5) null, str, 0);
        C51973G9u.A17(A0Q, A0b, A052, A06);
        G9w.A1F(A0Q, A0b, 2Wd.A00(G9t.A15(typeface, A0Q, A0b, 0, A022), A0C), A0D);
        C51974G9v.A19(A0b, num2, false);
        A0b.A0M(1);
        C51974G9v.A0y(A0Q, A0b, false);
        return C243563Zg.A07(A0Q, r17, r9, r16, (C243583Zi) null);
    }
}
