package X;

import android.content.Context;
import android.graphics.Color;
import android.util.Size;
import com.instagram.android.R;
import com.instagram.api.schemas.StoryLinkInfoDict;

/* renamed from: X.GTg  reason: case insensitive filesystem */
public final class C52454GTg extends C251343mx {
    public final JP6 A00;
    public final C52671Gaj A01;
    public final Size A02;

    public C52454GTg(Size size, JP6 jp6, C52671Gaj gaj) {
        0qQ.A0B(jp6, 2);
        this.A01 = gaj;
        this.A00 = jp6;
        this.A02 = size;
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [java.lang.Object, X.6MT] */
    public final C251263mp A0X(AnonymousClass3Y5 r29) {
        int A0A;
        int A002;
        int A012;
        AnonymousClass3Y5 r8 = r29;
        0qQ.A0B(r8, 0);
        C52671Gaj gaj = this.A01;
        if (!gaj.A05) {
            return null;
        }
        String str = gaj.A04;
        StoryLinkInfoDict storyLinkInfoDict = new StoryLinkInfoDict((Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, (Integer) null, (String) null, str, (String) null, (String) null, (String) null, (String) null);
        ? obj = new Object();
        obj.A00 = storyLinkInfoDict;
        String str2 = gaj.A03;
        if (str2 != null) {
            A0A = Color.parseColor(str2);
        } else {
            A0A = C51972G9s.A0A(r8.A05.A0C, r8, R.attr.igds_color_text_on_white);
        }
        2V1 r82 = r8.A05;
        Context A0B = C51965G9l.A0B(r82);
        int A013 = AnonymousClass0nB.A01(A0B);
        C300635xX r14 = new C300635xX(A0B, gaj.A02, obj, false, Integer.valueOf(A0A), (Integer) null, "link_sticker_primary_color", (String) null, (String) null, A013, true, false, false);
        Size size = this.A02;
        if (size != null) {
            A002 = size.getHeight();
            A012 = size.getWidth();
        } else {
            A002 = AnonymousClass0nB.A00(A0B);
            A012 = AnonymousClass0nB.A01(A0B);
        }
        AnonymousClass3XV r0 = 2WX.A02;
        2WX A003 = AnonymousClass9JR.A00(C51971G9r.A0Y((2WX) null, AnonymousClass05K.A0Y, C244413b9.ABSOLUTE, 3), AnonymousClass05K.A0C, 1, ((long) ((A012 - r14.A08) / 2)) | 9221401712017801216L);
        Integer num = AnonymousClass05K.A0N;
        2WX A0Y = C51971G9r.A0Y(C51971G9r.A0Y(C51971G9r.A0Y(AnonymousClass9JR.A00(A003, num, 1, ((long) ((int) (((float) A002) * 0.65f))) | 9221401712017801216L), AnonymousClass05K.A00, C243573Zh.CENTER, 3), AnonymousClass05K.A0u, true, 4), AnonymousClass05K.A01, true, 4);
        if (str != null) {
            A0Y = C51971G9r.A0Y(A0Y, num, str, 0);
        }
        return C51974G9v.A0P(r14, r82, C51972G9s.A0V(A0Y, J6P.A00(this, 42)));
    }
}
