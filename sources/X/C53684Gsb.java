package X;

import android.content.Context;
import android.graphics.Typeface;
import android.util.TypedValue;
import android.widget.ImageView;
import com.instagram.android.R;
import com.instagram.common.session.UserSession;
import com.instagram.contentnotes.data.metadata.ContentNoteMetadata;

/* renamed from: X.Gsb  reason: case insensitive filesystem */
public final class C53684Gsb extends C251343mx {
    public final UserSession A00;
    public final ContentNoteMetadata A01;
    public final Integer A02;

    public C53684Gsb(UserSession userSession, ContentNoteMetadata contentNoteMetadata, Integer num) {
        0qQ.A0B(num, 2);
        this.A00 = userSession;
        this.A02 = num;
        this.A01 = contentNoteMetadata;
    }

    public final C251263mp A0X(AnonymousClass3Y5 r24) {
        N4O n4o;
        String A0F;
        Number number;
        AnonymousClass3Y5 r22 = r24;
        0qQ.A0B(r22, 0);
        int A03 = C51967G9n.A03(this.A02, 0);
        if (A03 == 1) {
            n4o = new N4O((2Wd) null, (Integer) null, (Integer) null, (Object) "❤", 2131956619, 26);
        } else if (A03 != 2) {
            n4o = null;
        } else {
            n4o = new N4O(C51965G9l.A0e(C51970G9q.A0H()), Integer.valueOf(R.drawable.instagram_reply_pano_outline_24), Integer.valueOf(R.attr.igds_color_primary_text_on_media), (Object) null, 2131956620, 4);
        }
        if (n4o == null) {
            return null;
        }
        AnonymousClass4Ey A002 = 2Vi.A00(2Vi.A04, "fade_in_transition_key");
        A002.A02(C51970G9q.A03(A002, C246033ds.A00));
        C51966G9m.A1M(A002, 200);
        AnonymousClass3Y5 r0 = r22;
        AnonymousClass4F7.A00(r0, A002);
        2WX r6 = 2WX.A02;
        2V1 r8 = r0.A05;
        2WX A0Q = C51973G9u.A0Q(C51971G9r.A0V(r8, (2WX) null, C243533Zd.LOCAL, "fade_in_transition_key"), C51967G9n.A0S(0, C51970G9q.A0D()), 0, C51969G9p.A0B());
        C243573Zh r02 = C243573Zh.CENTER;
        Integer num = AnonymousClass05K.A00;
        2WX A0z = G9t.A0z(A0Q, num, r02);
        C58727Iwa iwa = new C58727Iwa(this, 4);
        Integer num2 = AnonymousClass05K.A0C;
        2WX A0Z = C51971G9r.A0Z(A0z, num2, iwa, (String) null);
        2Wb A0S = AnonymousClass7TG.A0S(r8);
        TypedValue typedValue = new TypedValue();
        2V1 r13 = A0S.A00;
        Context context = r13.A0C;
        context.getResources().getValue(R.dimen.clips_viewer_social_context_shadow_radius, typedValue, true);
        2WX r7 = r6;
        2Wd r03 = (2Wd) n4o.A05;
        if (r03 != null) {
            r7 = AnonymousClass9JR.A00((2WX) null, AnonymousClass05K.A1F, 0, r03.A00);
        }
        AnonymousClass9JR A0c = C51965G9l.A0c(AnonymousClass05K.A0N, 0, Double.doubleToRawLongBits(90.0d));
        if (r7 == r6) {
            r7 = null;
        }
        2WX A0Y = C51971G9r.A0Y(C51965G9l.A0X(r7, A0c), num, C51965G9l.A0Y(C51968G9o.A08(context, A0S, R.attr.igds_color_transparent)), 4);
        Object obj = n4o.A01;
        int i = n4o.A03;
        if (obj == null) {
            A0F = C244013aV.A0E(A0S, i);
        } else {
            A0F = C244013aV.A0F(A0S, obj, i);
        }
        int A05 = C51968G9o.A05(context, A0S);
        Integer num3 = AnonymousClass05K.A01;
        long A0G = C51972G9s.A0G(10.0f);
        Typeface A012 = 0oh.A01(context);
        int A08 = C51968G9o.A08(context, A0S, R.attr.igds_color_shadow_on_media);
        long A0G2 = C51969G9p.A0G((int) typedValue.getFloat());
        long A0D = C51969G9p.A0D();
        C244103ae A0b = C51971G9r.A0b(r13, (2V5) null, A0F, 0);
        C51973G9u.A17(A0S, A0b, A05, A0G);
        G9w.A1F(A0S, A0b, 2Wd.A00(G9t.A15(A012, A0S, A0b, 0, A08), A0G2), A0D);
        C51974G9v.A16(A0b, num2, num3);
        A0b.A0E();
        A0b.A0b(false);
        A0b.A0Y(false);
        A0b.A0Z(false);
        G9t.A1M(A0S, A0Y, A0b);
        Number number2 = (Number) n4o.A04;
        if (!(number2 == null || (number = (Number) n4o.A00) == null)) {
            A0S.A00(new C249263jP(ImageView.ScaleType.CENTER_INSIDE, C51973G9u.A0V(C51973G9u.A0V((2WX) null, A0S, num, 0), A0S, num3, 0), (Integer) null, number2.intValue(), C51968G9o.A08(context, A0S, number.intValue())));
        }
        return C243563Zg.A0G(A0S, r22, A0Z);
    }
}
